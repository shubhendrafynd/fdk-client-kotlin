package com.sdk.platform.datamanager

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




class OrderDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {        
       
    private val orderApiList by lazy {
        generateorderApiList()
    }
    
    private fun generateorderApiList(): OrderApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        if(unauthorizedAction != null){
            val accessUnauthorizedInterceptor = AccessUnauthorizedInterceptor(unauthorizedAction)
            interceptorList.add(accessUnauthorizedInterceptor)
        }
        config.interceptors?.let {
            interceptorList.addAll(it)
        }
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformOrder",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(OrderApiList::class.java) as? OrderApiList
    }
    
    
    suspend fun shipmentStatusUpdate(body: UpdateShipmentStatusBody)
    : Deferred<Response<UpdateShipmentStatusResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.shipmentStatusUpdate(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun activityStatus(bagId: String)
    : Deferred<Response<GetActivityStatus>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.activityStatus(
        companyId = config.companyId, bagId = bagId )
        } else {
            null
        } 
    }
    
    
    suspend fun storeProcessShipmentUpdate(body: UpdateProcessShipmenstRequestBody)
    : Deferred<Response<UpdateProcessShipmenstRequestResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.storeProcessShipmentUpdate(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun checkRefund(shipmentId: String)
    : Deferred<Response<HashMap<String,Any>>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.checkRefund(
        companyId = config.companyId, shipmentId = shipmentId )
        } else {
            null
        } 
    }
    
    
    suspend fun shipmentBagsCanBreak(body: CanBreakRequestBody)
    : Deferred<Response<CanBreakResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.shipmentBagsCanBreak(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getOrdersByCompanyId(pageNo: String?=null, pageSize: String?=null, fromDate: String?=null, toDate: String?=null, isPrioritySort: Boolean?=null, lockStatus: Boolean?=null, userId: String?=null, q: String?=null, stage: String?=null, salesChannels: String?=null, orderId: String?=null, stores: String?=null, deploymentStores: String?=null, status: String?=null, dp: String?=null, filterType: String?=null)
    : Deferred<Response<OrderListing>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getOrdersByCompanyId(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, fromDate = fromDate, toDate = toDate, isPrioritySort = isPrioritySort, lockStatus = lockStatus, userId = userId, q = q, stage = stage, salesChannels = salesChannels, orderId = orderId, stores = stores, deploymentStores = deploymentStores, status = status, dp = dp, filterType = filterType )
        } else {
            null
        } 
    }
    
    
    suspend fun getOrderLanesCountByCompanyId(pageNo: String?=null, pageSize: String?=null, fromDate: String?=null, toDate: String?=null, q: String?=null, stage: String?=null, salesChannels: String?=null, orderId: String?=null, stores: String?=null, status: String?=null, filterType: String?=null)
    : Deferred<Response<OrderLanesCount>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getOrderLanesCountByCompanyId(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, fromDate = fromDate, toDate = toDate, q = q, stage = stage, salesChannels = salesChannels, orderId = orderId, stores = stores, status = status, filterType = filterType )
        } else {
            null
        } 
    }
    
    
    suspend fun getOrderDetails(orderId: String?=null, next: String?=null, previous: String?=null)
    : Deferred<Response<OrderDetails>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getOrderDetails(
        companyId = config.companyId, orderId = orderId, next = next, previous = previous )
        } else {
            null
        } 
    }
    
    
    
    suspend fun getPicklistOrdersByCompanyId(pageNo: String?=null, pageSize: String?=null, fromDate: String?=null, toDate: String?=null, q: String?=null, stage: String?=null, salesChannels: String?=null, orderId: String?=null, stores: String?=null, status: String?=null, filterType: String?=null)
    : Deferred<Response<OrderPicklistListing>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getPicklistOrdersByCompanyId(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, fromDate = fromDate, toDate = toDate, q = q, stage = stage, salesChannels = salesChannels, orderId = orderId, stores = stores, status = status, filterType = filterType )
        } else {
            null
        } 
    }
    
    
    
    
    
    
    
    
    
    suspend fun getShipmentAddress(shipmentId: String, addressCategory: String)
    : Deferred<Response<GetShipmentAddressResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getShipmentAddress(
        companyId = config.companyId, shipmentId = shipmentId, addressCategory = addressCategory )
        } else {
            null
        } 
    }
    
    
    suspend fun updateShipmentAddress(shipmentId: String, addressCategory: String,body: UpdateShipmentAddressRequest)
    : Deferred<Response<UpdateShipmentAddressResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.updateShipmentAddress(
        companyId = config.companyId, shipmentId = shipmentId, addressCategory = addressCategory, body = body)
        } else {
            null
        } 
    }
    
    
    
    suspend fun invalidateShipmentCache(body: InvalidateShipmentCachePayload)
    : Deferred<Response<InvalidateShipmentCacheResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.invalidateShipmentCache(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun reassignLocation(body: StoreReassign)
    : Deferred<Response<StoreReassignResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.reassignLocation(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun updateShipmentLock(body: UpdateShipmentLockPayload)
    : Deferred<Response<UpdateShipmentLockResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.updateShipmentLock(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getAnnouncements(date: String?=null)
    : Deferred<Response<AnnouncementsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getAnnouncements(
        companyId = config.companyId, date = date )
        } else {
            null
        } 
    }
    
    
    suspend fun updateAddress(shipmentId: String, name: String?=null, address: String?=null, addressType: String?=null, pincode: String?=null, phone: String?=null, email: String?=null, landmark: String?=null, addressCategory: String, city: String?=null, state: String?=null, country: String?=null)
    : Deferred<Response<BaseResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.updateAddress(
        shipmentId = shipmentId, name = name, address = address, addressType = addressType, pincode = pincode, phone = phone, email = email, landmark = landmark, addressCategory = addressCategory, city = city, state = state, country = country, companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun click2Call(caller: String, receiver: String, bagId: String, callingTo: String?=null, callerId: String?=null)
    : Deferred<Response<Click2CallResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.click2Call(
        caller = caller, receiver = receiver, bagId = bagId, callingTo = callingTo, callerId = callerId, companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun statusUpdateInternalV4(body: StatusUpdateInternalRequest)
    : Deferred<Response<StatusUpdateInternalResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.statusUpdateInternalV4(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun processManifest(body: CreateOrderPayload)
    : Deferred<Response<CreateOrderResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.processManifest(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getRoleBasedActions()
    : Deferred<Response<GetActionsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getRoleBasedActions(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getShipmentHistory(shipmentId: Int?=null, bagId: Int?=null)
    : Deferred<Response<ShipmentHistoryResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getShipmentHistory(
        companyId = config.companyId, shipmentId = shipmentId, bagId = bagId )
        } else {
            null
        } 
    }
    
    
    suspend fun sendSmsNinja(body: SendSmsPayload)
    : Deferred<Response<OrderStatusResult>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.sendSmsNinja(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun platformManualAssignDPToShipment(body: ManualAssignDPToShipment)
    : Deferred<Response<ManualAssignDPToShipmentResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.platformManualAssignDPToShipment(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun updatePackagingDimensions(body: CreateOrderPayload)
    : Deferred<Response<CreateOrderResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.updatePackagingDimensions(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun createOrder(body: CreateOrderAPI)
    : Deferred<Response<CreateOrderResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.createOrder(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun checkOrderStatus(body: OrderStatus)
    : Deferred<Response<OrderStatusResult>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.checkOrderStatus(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getShipmentList(lane: String?=null, searchType: String?=null, searchValue: String?=null, searchId: String?=null, fromDate: String?=null, toDate: String?=null, dpIds: String?=null, orderingCompanyId: String?=null, stores: String?=null, salesChannel: String?=null, requestByExt: String?=null, pageNo: Int?=null, pageSize: Int?=null, customerId: String?=null, isPrioritySort: Boolean?=null, excludeLockedShipments: Boolean?=null, paymentMethods: String?=null)
    : Deferred<Response<ShipmentInternalPlatformViewResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getShipmentList(
        companyId = config.companyId, lane = lane, searchType = searchType, searchValue = searchValue, searchId = searchId, fromDate = fromDate, toDate = toDate, dpIds = dpIds, orderingCompanyId = orderingCompanyId, stores = stores, salesChannel = salesChannel, requestByExt = requestByExt, pageNo = pageNo, pageSize = pageSize, customerId = customerId, isPrioritySort = isPrioritySort, excludeLockedShipments = excludeLockedShipments, paymentMethods = paymentMethods )
        } else {
            null
        } 
    }
    
    
    suspend fun getShipmentDetails(shipmentId: String, orderingCompanyId: String?=null, requestByExt: String?=null)
    : Deferred<Response<ShipmentInfoResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getShipmentDetails(
        companyId = config.companyId, shipmentId = shipmentId, orderingCompanyId = orderingCompanyId, requestByExt = requestByExt )
        } else {
            null
        } 
    }
    
    
    suspend fun getOrderShipmentDetails(orderId: String)
    : Deferred<Response<ShipmentDetailsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getOrderShipmentDetails(
        companyId = config.companyId, orderId = orderId )
        } else {
            null
        } 
    }
    
    
    suspend fun getLaneConfig(superLane: String?=null, groupEntity: String?=null, fromDate: String?=null, toDate: String?=null, dpIds: String?=null, stores: String?=null, salesChannel: String?=null, paymentMode: String?=null, bagStatus: String?=null)
    : Deferred<Response<LaneConfigResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getLaneConfig(
        companyId = config.companyId, superLane = superLane, groupEntity = groupEntity, fromDate = fromDate, toDate = toDate, dpIds = dpIds, stores = stores, salesChannel = salesChannel, paymentMode = paymentMode, bagStatus = bagStatus )
        } else {
            null
        } 
    }
    
    
    
    suspend fun getOrders(lane: String?=null, searchType: String?=null, searchValue: String?=null, fromDate: String?=null, toDate: String?=null, dpIds: String?=null, stores: String?=null, salesChannel: String?=null, pageNo: Int?=null, pageSize: Int?=null, isPrioritySort: Boolean?=null)
    : Deferred<Response<OrderListingResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getOrders(
        companyId = config.companyId, lane = lane, searchType = searchType, searchValue = searchValue, fromDate = fromDate, toDate = toDate, dpIds = dpIds, stores = stores, salesChannel = salesChannel, pageNo = pageNo, pageSize = pageSize, isPrioritySort = isPrioritySort )
        } else {
            null
        } 
    }
    
    
    suspend fun getMetricCount(fromDate: String?=null, toDate: String?=null)
    : Deferred<Response<MetricCountResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getMetricCount(
        companyId = config.companyId, fromDate = fromDate, toDate = toDate )
        } else {
            null
        } 
    }
    
    
    
    
    suspend fun getfilters(view: String, groupEntity: String?=null)
    : Deferred<Response<FiltersResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getfilters(
        companyId = config.companyId, view = view, groupEntity = groupEntity )
        } else {
            null
        } 
    }
    
    
    suspend fun createShipmentReport(fromDate: String?=null, toDate: String?=null)
    : Deferred<Response<Success>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.createShipmentReport(
        companyId = config.companyId, fromDate = fromDate, toDate = toDate )
        } else {
            null
        } 
    }
    
    
    suspend fun getReportsShipmentListing(pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<OmsReports>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getReportsShipmentListing(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun upsertJioCode(body: JioCodeUpsertPayload)
    : Deferred<Response<JioCodeUpsertResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.upsertJioCode(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getBulkInvoice(batchId: String, docType: String)
    : Deferred<Response<BulkInvoicingResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getBulkInvoice(
        companyId = config.companyId, batchId = batchId, docType = docType )
        } else {
            null
        } 
    }
    
    
    suspend fun getBulkInvoiceLabel(batchId: String)
    : Deferred<Response<BulkInvoiceLabelResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getBulkInvoiceLabel(
        companyId = config.companyId, batchId = batchId )
        } else {
            null
        } 
    }
    
    
    suspend fun getBulkShipmentExcelFile(lane: String?=null, searchType: String?=null, searchId: String?=null, fromDate: String?=null, toDate: String?=null, dpIds: String?=null, orderingCompanyId: String?=null, stores: String?=null, salesChannel: String?=null, requestByExt: String?=null, pageNo: Int?=null, pageSize: Int?=null, customerId: String?=null, isPrioritySort: Boolean?=null)
    : Deferred<Response<FileResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getBulkShipmentExcelFile(
        companyId = config.companyId, lane = lane, searchType = searchType, searchId = searchId, fromDate = fromDate, toDate = toDate, dpIds = dpIds, orderingCompanyId = orderingCompanyId, stores = stores, salesChannel = salesChannel, requestByExt = requestByExt, pageNo = pageNo, pageSize = pageSize, customerId = customerId, isPrioritySort = isPrioritySort )
        } else {
            null
        } 
    }
    
    
    suspend fun getBulkList(lane: String?=null, searchType: String?=null, searchId: String?=null, fromDate: String?=null, toDate: String?=null, dpIds: String?=null, orderingCompanyId: String?=null, stores: String?=null, salesChannel: String?=null, requestByExt: String?=null, pageNo: Int?=null, pageSize: Int?=null, customerId: String?=null, isPrioritySort: Boolean?=null)
    : Deferred<Response<BulkListingResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getBulkList(
        companyId = config.companyId, lane = lane, searchType = searchType, searchId = searchId, fromDate = fromDate, toDate = toDate, dpIds = dpIds, orderingCompanyId = orderingCompanyId, stores = stores, salesChannel = salesChannel, requestByExt = requestByExt, pageNo = pageNo, pageSize = pageSize, customerId = customerId, isPrioritySort = isPrioritySort )
        } else {
            null
        } 
    }
    
    
    suspend fun getManifestList(status: String?=null, storeId: Int?=null, pageNo: Int?=null, pageSize: Int?=null, searchValue: String?=null, fromDate: String?=null, toDate: String?=null)
    : Deferred<Response<GeneratedManifestResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getManifestList(
        companyId = config.companyId, status = status, storeId = storeId, pageNo = pageNo, pageSize = pageSize, searchValue = searchValue, fromDate = fromDate, toDate = toDate )
        } else {
            null
        } 
    }
    
    
    suspend fun getManifestDetailsWithShipments(manifestId: String, fromDate: String?=null, toDate: String?=null, storeId: Int, page: Int?=null, pageSize: Int?=null, lane: String?=null, dpIds: Int?=null, searchType: String?=null, searchValue: String?=null)
    : Deferred<Response<ManifestDetailResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getManifestDetailsWithShipments(
        companyId = config.companyId, manifestId = manifestId, fromDate = fromDate, toDate = toDate, storeId = storeId, page = page, pageSize = pageSize, lane = lane, dpIds = dpIds, searchType = searchType, searchValue = searchValue )
        } else {
            null
        } 
    }
    
    
    suspend fun getBulkActionFailedReport(batchId: String, reportType: String?=null)
    : Deferred<Response<FileResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getBulkActionFailedReport(
        companyId = config.companyId, batchId = batchId, reportType = reportType )
        } else {
            null
        } 
    }
    
    
    suspend fun getShipmentReasons(shipmentId: String, bagId: String, state: String)
    : Deferred<Response<PlatformShipmentReasonsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getShipmentReasons(
        companyId = config.companyId, shipmentId = shipmentId, bagId = bagId, state = state )
        } else {
            null
        } 
    }
    
    
    suspend fun bulkActionProcessXlsxFile(body: BulkActionPayload)
    : Deferred<Response<BulkActionResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.bulkActionProcessXlsxFile(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun bulkActionDetails(batchId: String)
    : Deferred<Response<BulkActionDetailsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.bulkActionDetails(
        companyId = config.companyId, batchId = batchId )
        } else {
            null
        } 
    }
    
    
    suspend fun getBagById(bagId: String?=null, channelBagId: String?=null, channelId: String?=null)
    : Deferred<Response<BagDetailsPlatformResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getBagById(
        companyId = config.companyId, bagId = bagId, channelBagId = channelBagId, channelId = channelId )
        } else {
            null
        } 
    }
    
    
    suspend fun getBags(bagIds: String?=null, shipmentIds: String?=null, orderIds: String?=null, channelBagIds: String?=null, channelShipmentIds: String?=null, channelOrderIds: String?=null, channelId: String?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<GetBagsPlatformResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getBags(
        companyId = config.companyId, bagIds = bagIds, shipmentIds = shipmentIds, orderIds = orderIds, channelBagIds = channelBagIds, channelShipmentIds = channelShipmentIds, channelOrderIds = channelOrderIds, channelId = channelId, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
    
    
    
    suspend fun getOrderDetails1(orderId: String?=null, next: String?=null, previous: String?=null)
    : Deferred<Response<OrderDetails>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.getOrderDetails1(companyId = config.companyId , applicationId = applicationId , orderId = orderId, next = next, previous = previous )
        } else {
            null
        }
    }
    
    
    
    suspend fun trackShipmentPlatform(shipmentId: String)
    : Deferred<Response<PlatformShipmentTrack>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.trackShipmentPlatform(companyId = config.companyId , applicationId = applicationId , shipmentId = shipmentId )
        } else {
            null
        }
    }
    
    
    suspend fun trackOrder(orderId: String)
    : Deferred<Response<PlatformOrderTrack>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.trackOrder(companyId = config.companyId , applicationId = applicationId , orderId = orderId )
        } else {
            null
        }
    }
    
    
    suspend fun failedOrders()
    : Deferred<Response<FailedOrders>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.failedOrders(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun reprocessOrder(orderId: String)
    : Deferred<Response<UpdateOrderReprocessResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.reprocessOrder(companyId = config.companyId , applicationId = applicationId , orderId = orderId )
        } else {
            null
        }
    }
    
    
    suspend fun updateShipment(shipmentId: String,body: ShipmentUpdateRequest)
    : Deferred<Response<ShipmentUpdateResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.updateShipment(companyId = config.companyId , applicationId = applicationId , shipmentId = shipmentId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getPlatformShipmentReasons(action: String)
    : Deferred<Response<ShipmentReasonsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.getPlatformShipmentReasons(companyId = config.companyId , applicationId = applicationId , action = action )
        } else {
            null
        }
    }
    
    
    suspend fun getShipmentTrackDetails(orderId: String, shipmentId: String)
    : Deferred<Response<ShipmentTrackResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.getShipmentTrackDetails(companyId = config.companyId , applicationId = applicationId , orderId = orderId, shipmentId = shipmentId )
        } else {
            null
        }
    }
    
    
    
    
    suspend fun getOrdersByApplicationId(pageNo: String?=null, pageSize: String?=null, fromDate: String?=null, toDate: String?=null, q: String?=null, stage: String?=null, salesChannels: String?=null, orderId: String?=null, stores: String?=null, status: String?=null, dp: String?=null, userId: String?=null, filterType: String?=null)
    : Deferred<Response<OrderListing>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.getOrdersByApplicationId(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, fromDate = fromDate, toDate = toDate, q = q, stage = stage, salesChannels = salesChannels, orderId = orderId, stores = stores, status = status, dp = dp, userId = userId, filterType = filterType )
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun getApplicationShipments(lane: String?=null, searchType: String?=null, searchId: String?=null, fromDate: String?=null, toDate: String?=null, dpIds: String?=null, orderingCompanyId: String?=null, stores: String?=null, salesChannel: String?=null, requestByExt: String?=null, pageNo: Int?=null, pageSize: Int?=null, customerId: String?=null, isPrioritySort: Boolean?=null)
    : Deferred<Response<ShipmentInternalPlatformViewResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.getApplicationShipments(companyId = config.companyId , applicationId = applicationId , lane = lane, searchType = searchType, searchId = searchId, fromDate = fromDate, toDate = toDate, dpIds = dpIds, orderingCompanyId = orderingCompanyId, stores = stores, salesChannel = salesChannel, requestByExt = requestByExt, pageNo = pageNo, pageSize = pageSize, customerId = customerId, isPrioritySort = isPrioritySort )
        } else {
            null
        }
    }
    
    
    
    
    suspend fun getAppOrderShipmentDetails(orderId: String)
    : Deferred<Response<ShipmentDetailsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.getAppOrderShipmentDetails(companyId = config.companyId , applicationId = applicationId , orderId = orderId )
        } else {
            null
        }
    }
    
    
    suspend fun trackPlatformShipment(shipmentId: String)
    : Deferred<Response<PlatformShipmentTrack1>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.trackPlatformShipment(companyId = config.companyId , applicationId = applicationId , shipmentId = shipmentId )
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}