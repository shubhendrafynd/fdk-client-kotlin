package com.sdk.application

import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.*

interface CatalogApiList {
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/")
    fun getProductDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductDetail>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/sizes/")
    fun getProductSizesBySlug(@Path("slug") slug: String, @Query("store_id") storeId: String?)
    : Deferred<Response<ProductSizes>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/sizes/{size}/pincode/{pincode}/price/")
    fun getProductPriceBySlug(@Path("slug") slug: String, @Path("size") size: String, @Path("pincode") pincode: String, @Query("store_id") storeId: String?)
    : Deferred<Response<ProductSizePriceResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/sizes/{size}/pincode/{pincode}/sellers/")
    fun getProductSellersBySlug(@Path("slug") slug: String, @Path("size") size: String, @Path("pincode") pincode: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<ProductSizeSellersResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/compare/")
    fun getProductComparisonBySlugs(@Query("slug") slug: String)
    : Deferred<Response<ProductsComparisonResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/similar/compare/")
    fun getSimilarComparisonProductBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductCompareResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/similar/compared-frequently/")
    fun getComparedFrequentlyProductBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductFrequentlyComparedSimilarResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/similar/{similar_type}/")
    fun getProductSimilarByIdentifier(@Path("slug") slug: String, @Path("similar_type") similarType: String)
    : Deferred<Response<SimilarProductByTypeResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/variants/")
    fun getProductVariantsBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductVariantsResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/stock-status/")
    fun getProductStockByIds(@Query("item_id") itemId: String?, @Query("alu") alu: String?, @Query("sku_code") skuCode: String?, @Query("ean") ean: String?, @Query("upc") upc: String?)
    : Deferred<Response<ProductStockStatusResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/stock-status/poll/")
    fun getProductStockForTimeByIds(@Query("timestamp") timestamp: String, @Query("page_size") pageSize: Int?, @Query("page_id") pageId: String?)
    : Deferred<Response<ProductStockPolling>>
    
    @GET ("/service/application/catalog/v1.0/products/")
    fun getProducts(@Query("q") q: String?, @Query("f") f: String?, @Query("filters") filters: Boolean?, @Query("sort_on") sortOn: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?, @Query("page_type") pageType: String?)
    : Deferred<Response<ProductListingResponse>>
    
    @GET ("/service/application/catalog/v1.0/brands/")
    fun getBrands(@Query("department") department: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<BrandListingResponse>>
    
    @GET ("/service/application/catalog/v1.0/brands/{slug}/")
    fun getBrandDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<BrandDetailResponse>>
    
    @GET ("/service/application/catalog/v1.0/categories/")
    fun getCategories(@Query("department") department: String?)
    : Deferred<Response<CategoryListingResponse>>
    
    @GET ("/service/application/catalog/v1.0/categories/{slug}/")
    fun getCategoryDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<CategoryMetaResponse>>
    
    @GET ("/service/application/catalog/v1.0/home/listing/")
    fun getHomeProducts(@Query("sort_on") sortOn: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<HomeListingResponse>>
    
    @GET ("/service/application/catalog/v1.0/departments/")
    fun getDepartments()
    : Deferred<Response<DepartmentResponse>>
    
    @GET ("/service/application/catalog/v1.0/auto-complete/")
    fun getSearchResults(@Query("q") q: String)
    : Deferred<Response<AutoCompleteResponse>>
    
    @GET ("/service/application/catalog/v1.0/collections/")
    fun getCollections(@Query("page_no") pageNo: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<GetCollectionListingResponse>>
    
    @GET ("/service/application/catalog/v1.0/collections/{slug}/items/")
    fun getCollectionItemsBySlug(@Path("slug") slug: String, @Query("f") f: String?, @Query("filters") filters: Boolean?, @Query("sort_on") sortOn: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<ProductListingResponse>>
    
    @GET ("/service/application/catalog/v1.0/collections/{slug}/")
    fun getCollectionDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<CollectionDetailResponse>>
    
    @GET ("/service/application/catalog/v1.0/follow/{collection_type}/")
    fun getFollowedListing(@Path("collection_type") collectionType: String)
    : Deferred<Response<GetFollowListingResponse>>
    
    @DELETE ("/service/application/catalog/v1.0/follow/{collection_type}/{collection_id}/")
    fun unfollowById(@Path("collection_type") collectionType: String, @Path("collection_id") collectionId: String)
    : Deferred<Response<FollowPostResponse>>
    
    @POST ("/service/application/catalog/v1.0/follow/{collection_type}/{collection_id}/")
    fun followById(@Path("collection_type") collectionType: String, @Path("collection_id") collectionId: String)
    : Deferred<Response<FollowPostResponse>>
    
    @GET ("/service/application/catalog/v1.0/follow/{collection_type}/{collection_id}/count/")
    fun getFollowerCountById(@Path("collection_type") collectionType: String, @Path("collection_id") collectionId: String)
    : Deferred<Response<FollowerCountResponse>>
    
    @GET ("/service/application/catalog/v1.0/follow/ids/")
    fun getFollowIds(@Query("collection_type") collectionType: String?)
    : Deferred<Response<FollowIdsResponse>>
    
    @GET ("/service/application/catalog/v1.0/locations/")
    fun getStores(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("range") range: Int?, @Query("latitude") latitude: Double?, @Query("longitude") longitude: Double?)
    : Deferred<Response<StoreListingResponse>>
    
}

interface CartApiList {
    
    @GET ("/service/application/cart/v1.0/detail")
    fun getCart(@Query("uid") uid: Int?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("assign_card_id") assignCardId: Int?)
    : Deferred<Response<CartResponse>>
    
    @HEAD ("/service/application/cart/v1.0/detail")
    fun getCartLastModified(@Query("uid") uid: Int?)
    : Deferred<Response<Any>>
    
    @POST ("/service/application/cart/v1.0/detail")
    fun addItems(@Query("i") i: Boolean?, @Query("b") b: Boolean?,@Body body: AddCartRequest)
    : Deferred<Response<AddCartResponse>>
    
    @PUT ("/service/application/cart/v1.0/detail")
    fun updateCart(@Query("uid") uid: Int?, @Query("i") i: Boolean?, @Query("b") b: Boolean?,@Body body: UpdateCartRequest)
    : Deferred<Response<UpdateCartResponse>>
    
    @GET ("/service/application/cart/v1.0/basic")
    fun getItemCount(@Query("uid") uid: Int?)
    : Deferred<Response<CartItemCountResponse>>
    
    @GET ("/service/application/cart/v1.0/coupon")
    fun getCoupons(@Query("uid") uid: Int?)
    : Deferred<Response<GetCouponResponse>>
    
    @POST ("/service/application/cart/v1.0/coupon")
    fun applyCoupon(@Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("p") p: Boolean?, @Query("uid") uid: Int?,@Body body: ApplyCouponRequest)
    : Deferred<Response<CartResponse>>
    
    @DELETE ("/service/application/cart/v1.0/coupon")
    fun removeCoupon(@Query("uid") uid: Int?)
    : Deferred<Response<CartResponse>>
    
    @GET ("/service/application/cart/v1.0/bulk-price")
    fun getBulkDiscountOffers(@Query("item_id") itemId: Int?, @Query("article_id") articleId: String?, @Query("uid") uid: Int?, @Query("slug") slug: String?)
    : Deferred<Response<BulkPriceResponse>>
    
    @GET ("/service/application/cart/v1.0/address")
    fun getAddresses(@Query("uid") uid: Int?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: Int?, @Query("is_default") isDefault: Boolean?)
    : Deferred<Response<GetAddressesResponse>>
    
    @POST ("/service/application/cart/v1.0/address")
    fun addAddress(@Body body: Address)
    : Deferred<Response<SaveAddressResponse>>
    
    @GET ("/service/application/cart/v1.0/address/{id}")
    fun getAddressById(@Path("id") id: String, @Query("uid") uid: Int?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: Int?, @Query("is_default") isDefault: Boolean?)
    : Deferred<Response<Address>>
    
    @PUT ("/service/application/cart/v1.0/address/{id}")
    fun updateAddress(@Path("id") id: String,@Body body: Address)
    : Deferred<Response<UpdateAddressResponse>>
    
    @DELETE ("/service/application/cart/v1.0/address/{id}")
    fun removeAddress(@Path("id") id: String)
    : Deferred<Response<DeleteAddressResponse>>
    
    @POST ("/service/application/cart/v1.0/select-address")
    fun selectAddress(@Query("uid") uid: Int?, @Query("i") i: Boolean?, @Query("b") b: Boolean?,@Body body: SelectCartAddressRequest)
    : Deferred<Response<CartResponse>>
    
    @PUT ("/service/application/cart/v1.0/payment")
    fun selectPaymentMode(@Query("uid") uid: String?,@Body body: UpdateCartPaymentRequest)
    : Deferred<Response<CartResponse>>
    
    @GET ("/service/application/cart/v1.0/payment/validate/")
    fun validateCouponForPayment(@Query("uid") uid: String?, @Query("address_id") addressId: String?, @Query("payment_mode") paymentMode: String?, @Query("payment_identifier") paymentIdentifier: String?, @Query("aggregator_name") aggregatorName: String?, @Query("merchant_code") merchantCode: String?)
    : Deferred<Response<PaymentUpdate>>
    
    @GET ("/service/application/cart/v1.0/shipment")
    fun getShipments(@Query("p") p: Boolean?, @Query("uid") uid: Int?, @Query("address_id") addressId: Int?, @Query("area_code") areaCode: String?)
    : Deferred<Response<CartShipmentsResponse>>
    
    @POST ("/service/application/cart/v1.0/checkout")
    fun checkoutCart(@Body body: CartCheckoutRequest)
    : Deferred<Response<CartCheckoutResponse>>
    
    @PUT ("/service/application/cart/v1.0/meta")
    fun updateCartMeta(@Query("uid") uid: Int?,@Body body: CartMetaRequest)
    : Deferred<Response<CartMetaResponse>>
    
    @POST ("/service/application/cart/v1.0/share-cart")
    fun getCartShareLink(@Body body: GetShareCartLinkRequest)
    : Deferred<Response<GetShareCartLinkResponse>>
    
    @GET ("/service/application/cart/v1.0/share-cart/{token}")
    fun getCartSharedItems(@Path("token") token: String)
    : Deferred<Response<SharedCartResponse>>
    
    @POST ("/service/application/cart/v1.0/share-cart/{token}/{action}")
    fun updateCartWithSharedItems(@Path("token") token: String, @Path("action") action: String)
    : Deferred<Response<SharedCartResponse>>
    
}

interface FileStorageApiList {
    
    @POST ("/service/application/assets/v1.0/namespaces/{namespace}/upload/start/")
    fun startUpload(@Path("namespace") namespace: String,@Body body: StartRequest)
    : Deferred<Response<StartResponse>>
    
    @POST ("/service/application/assets/v1.0/namespaces/{namespace}/upload/complete/")
    fun completeUpload(@Path("namespace") namespace: String,@Body body: StartResponse)
    : Deferred<Response<CompleteResponse>>
    
}

interface OrderApiList {
    
    @GET ("/service/application/order/v1.0/orders")
    fun getOrders(@Query("page_no") pageNo: String?, @Query("page_size") pageSize: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?)
    : Deferred<Response<OrderList>>
    
    @GET ("/service/application/order/v1.0/orders/{order_id}")
    fun getOrderById(@Path("order_id") orderId: String)
    : Deferred<Response<OrderById>>
    
    @GET ("/service/application/order/v1.0/orders/shipments/{shipment_id}")
    fun getShipmentById(@Path("shipment_id") shipmentId: String)
    : Deferred<Response<ShipmentById>>
    
    @GET ("/service/application/order/v1.0/orders/shipments/{shipment_id}/reasons")
    fun getShipmentReasons(@Path("shipment_id") shipmentId: String)
    : Deferred<Response<ShipmentReasons>>
    
    @PUT ("/service/application/order/v1.0/orders/shipments/{shipment_id}/status")
    fun updateShipmentStatus(@Path("shipment_id") shipmentId: String,@Body body: ShipmentStatusUpdateBody)
    : Deferred<Response<ShipmentStatusUpdate>>
    
    @GET ("/service/application/order/v1.0/orders/shipments/{shipment_id}/track")
    fun trackShipment(@Path("shipment_id") shipmentId: String)
    : Deferred<Response<ShipmentTrack>>
    
    @GET ("/service/application/order/v1.0/pos-order/{order_id}")
    fun getPosOrderById(@Path("order_id") orderId: String)
    : Deferred<Response<OrderById>>
    
}

interface FeedbackApiList {
    
    @POST ("/service/application/feedback/v1.0/abuse")
    fun createAbuseReport(@Body body: ReportAbuseRequest)
    : Deferred<Response<XInsertResponse>>
    
    @PUT ("/service/application/feedback/v1.0/abuse")
    fun updateAbuseReport(@Body body: UpdateAbuseStatusRequest)
    : Deferred<Response<XUpdateResponse>>
    
    @GET ("/service/application/feedback/v1.0/abuse/entity/{entity_type}/entity-id/{entity_id}")
    fun getAbuseReports(@Path("entity_id") entityId: String, @Path("entity_type") entityType: String, @Query("id") id: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<XCursorGetResponse>>
    
    @GET ("/service/application/feedback/v1.0/attributes")
    fun getAttributes(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<XNumberGetResponse>>
    
    @POST ("/service/application/feedback/v1.0/attributes")
    fun createAttribute(@Body body: SaveAttributeRequest)
    : Deferred<Response<XInsertResponse>>
    
    @GET ("/service/application/feedback/v1.0/attributes/{slug}")
    fun getAttribute(@Path("slug") slug: String)
    : Deferred<Response<Attribute>>
    
    @PUT ("/service/application/feedback/v1.0/attributes/{slug}")
    fun updateAttribute(@Path("slug") slug: String,@Body body: UpdateAttributeRequest)
    : Deferred<Response<XUpdateResponse>>
    
    @POST ("/service/application/feedback/v1.0/comment")
    fun createComment(@Body body: CommentRequest)
    : Deferred<Response<XInsertResponse>>
    
    @PUT ("/service/application/feedback/v1.0/comment")
    fun updateComment(@Body body: UpdateCommentRequest)
    : Deferred<Response<XUpdateResponse>>
    
    @GET ("/service/application/feedback/v1.0/comment/entity/{entity_type}")
    fun getComments(@Path("entity_type") entityType: String, @Query("id") id: String?, @Query("entity_id") entityId: String?, @Query("user_id") userId: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<XCursorGetResponse>>
    
    @GET ("/service/application/feedback/v1.0/config/entity/{entity_type}/entity-id/{entity_id}")
    fun checkEligibility(@Path("entity_type") entityType: String, @Path("entity_id") entityId: String)
    : Deferred<Response<CheckEligibilityResponse>>
    
    @DELETE ("/service/application/feedback/v1.0/media/")
    fun deleteMedia()
    : Deferred<Response<XUpdateResponse>>
    
    @POST ("/service/application/feedback/v1.0/media/")
    fun createMedia(@Body body: AddMediaListRequest)
    : Deferred<Response<XInsertResponse>>
    
    @PUT ("/service/application/feedback/v1.0/media/")
    fun updateMedia(@Body body: UpdateMediaListRequest)
    : Deferred<Response<XUpdateResponse>>
    
    @GET ("/service/application/feedback/v1.0/media/entity/{entity_type}/entity-id/{entity_id}")
    fun getMedias(@Path("entity_type") entityType: String, @Path("entity_id") entityId: String, @Query("id") id: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<XCursorGetResponse>>
    
    @GET ("/service/application/feedback/v1.0/rating/summary/entity/{entity_type}/entity-id/{entity_id}")
    fun getReviewSummaries(@Path("entity_type") entityType: String, @Path("entity_id") entityId: String, @Query("id") id: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<XCursorGetResponse>>
    
    @POST ("/service/application/feedback/v1.0/review/")
    fun createReview(@Body body: UpdateReviewRequest)
    : Deferred<Response<XUpdateResponse>>
    
    @PUT ("/service/application/feedback/v1.0/review/")
    fun updateReview(@Body body: UpdateReviewRequest)
    : Deferred<Response<XUpdateResponse>>
    
    @GET ("/service/application/feedback/v1.0/review/entity/{entity_type}/entity-id/{entity_id}")
    fun getReviews(@Path("entity_type") entityType: String, @Path("entity_id") entityId: String, @Query("id") id: String?, @Query("user_id") userId: String?, @Query("media") media: String?, @Query("rating") rating: ArrayList<Double>?, @Query("attribute_rating") attributeRating: ArrayList<String>?, @Query("facets") facets: Boolean?, @Query("sort") sort: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<XCursorGetResponse>>
    
    @GET ("/service/application/feedback/v1.0/template/")
    fun getTemplates(@Query("template_id") templateId: String?, @Query("entity_id") entityId: String?, @Query("entity_type") entityType: String?)
    : Deferred<Response<XCursorGetResponse>>
    
    @POST ("/service/application/feedback/v1.0/template/qna/")
    fun createQuestion(@Body body: CreateQNARequest)
    : Deferred<Response<XInsertResponse>>
    
    @PUT ("/service/application/feedback/v1.0/template/qna/")
    fun updateQuestion(@Body body: UpdateQNARequest)
    : Deferred<Response<XUpdateResponse>>
    
    @GET ("/service/application/feedback/v1.0/template/qna/entity/{entity_type}/entity-id/{entity_id}")
    fun getQuestionAndAnswers(@Path("entity_type") entityType: String, @Path("entity_id") entityId: String, @Query("id") id: String?, @Query("show_answer") showAnswer: Boolean?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<XCursorGetResponse>>
    
    @GET ("/service/application/feedback/v1.0/vote/")
    fun getVotes(@Query("id") id: String?, @Query("ref_type") refType: String?)
    : Deferred<Response<XNumberGetResponse>>
    
    @POST ("/service/application/feedback/v1.0/vote/")
    fun createVote(@Body body: VoteRequest)
    : Deferred<Response<XInsertResponse>>
    
    @PUT ("/service/application/feedback/v1.0/vote/")
    fun updateVote(@Body body: UpdateVoteRequest)
    : Deferred<Response<XUpdateResponse>>
    
}

interface PosCartApiList {
    
    @GET ("/service/application/pos/cart/v1.0/detail")
    fun getCart(@Query("uid") uid: Int?, @Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("assign_card_id") assignCardId: Int?)
    : Deferred<Response<CartResponse>>
    
    @HEAD ("/service/application/pos/cart/v1.0/detail")
    fun getCartLastModified(@Query("uid") uid: Int?)
    : Deferred<Response<Any>>
    
    @POST ("/service/application/pos/cart/v1.0/detail")
    fun addItems(@Query("i") i: Boolean?, @Query("b") b: Boolean?,@Body body: AddCartRequest)
    : Deferred<Response<AddCartResponse>>
    
    @PUT ("/service/application/pos/cart/v1.0/detail")
    fun updateCart(@Query("uid") uid: Int?, @Query("i") i: Boolean?, @Query("b") b: Boolean?,@Body body: UpdateCartRequest)
    : Deferred<Response<UpdateCartResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/basic")
    fun getItemCount(@Query("uid") uid: Int?)
    : Deferred<Response<CartItemCountResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/coupon")
    fun getCoupons(@Query("uid") uid: Int?)
    : Deferred<Response<GetCouponResponse>>
    
    @POST ("/service/application/pos/cart/v1.0/coupon")
    fun applyCoupon(@Query("i") i: Boolean?, @Query("b") b: Boolean?, @Query("p") p: Boolean?, @Query("uid") uid: Int?,@Body body: ApplyCouponRequest)
    : Deferred<Response<CartResponse>>
    
    @DELETE ("/service/application/pos/cart/v1.0/coupon")
    fun removeCoupon(@Query("uid") uid: Int?)
    : Deferred<Response<CartResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/bulk-price")
    fun getBulkDiscountOffers(@Query("item_id") itemId: Int?, @Query("article_id") articleId: String?, @Query("uid") uid: Int?, @Query("slug") slug: String?)
    : Deferred<Response<BulkPriceResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/address")
    fun getAddresses(@Query("uid") uid: Int?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: Int?, @Query("is_default") isDefault: Boolean?)
    : Deferred<Response<GetAddressesResponse>>
    
    @POST ("/service/application/pos/cart/v1.0/address")
    fun addAddress(@Body body: Address)
    : Deferred<Response<SaveAddressResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/address/{id}")
    fun getAddressById(@Path("id") id: String, @Query("uid") uid: Int?, @Query("mobile_no") mobileNo: String?, @Query("checkout_mode") checkoutMode: String?, @Query("tags") tags: Int?, @Query("is_default") isDefault: Boolean?)
    : Deferred<Response<Address>>
    
    @PUT ("/service/application/pos/cart/v1.0/address/{id}")
    fun updateAddress(@Path("id") id: String,@Body body: Address)
    : Deferred<Response<UpdateAddressResponse>>
    
    @DELETE ("/service/application/pos/cart/v1.0/address/{id}")
    fun removeAddress(@Path("id") id: String)
    : Deferred<Response<DeleteAddressResponse>>
    
    @POST ("/service/application/pos/cart/v1.0/select-address")
    fun selectAddress(@Query("uid") uid: Int?, @Query("i") i: Boolean?, @Query("b") b: Boolean?,@Body body: SelectCartAddressRequest)
    : Deferred<Response<CartResponse>>
    
    @PUT ("/service/application/pos/cart/v1.0/payment")
    fun selectPaymentMode(@Query("uid") uid: String?,@Body body: UpdateCartPaymentRequest)
    : Deferred<Response<CartResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/payment/validate/")
    fun validateCouponForPayment(@Query("uid") uid: String?, @Query("address_id") addressId: String?, @Query("payment_mode") paymentMode: String?, @Query("payment_identifier") paymentIdentifier: String?, @Query("aggregator_name") aggregatorName: String?, @Query("merchant_code") merchantCode: String?)
    : Deferred<Response<PaymentUpdate>>
    
    @GET ("/service/application/pos/cart/v1.0/shipment")
    fun getShipments(@Query("pick_at_store_uid") pickAtStoreUid: Int?, @Query("ordering_store_id") orderingStoreId: Int?, @Query("p") p: Boolean?, @Query("uid") uid: Int?, @Query("address_id") addressId: Int?, @Query("area_code") areaCode: String?, @Query("order_type") orderType: String?)
    : Deferred<Response<CartShipmentsResponse>>
    
    @PUT ("/service/application/pos/cart/v1.0/shipment")
    fun updateShipments(@Query("i") i: Boolean?, @Query("p") p: Boolean?, @Query("uid") uid: Int?, @Query("address_id") addressId: Int?, @Query("order_type") orderType: String?,@Body body: UpdateCartShipmentRequest)
    : Deferred<Response<CartShipmentsResponse>>
    
    @POST ("/service/application/pos/cart/v1.0/checkout")
    fun checkoutCart(@Query("uid") uid: Int?,@Body body: CartPosCheckoutRequest)
    : Deferred<Response<CartCheckoutResponse>>
    
    @PUT ("/service/application/pos/cart/v1.0/meta")
    fun updateCartMeta(@Query("uid") uid: Int?,@Body body: CartMetaRequest)
    : Deferred<Response<CartMetaResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/available-delivery-mode")
    fun getAvailableDeliveryModes(@Query("area_code") areaCode: String, @Query("uid") uid: Int?)
    : Deferred<Response<CartDeliveryModesResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/store-address")
    fun getStoreAddressByUid(@Query("store_uid") storeUid: Int)
    : Deferred<Response<StoreDetailsResponse>>
    
    @POST ("/service/application/pos/cart/v1.0/share-cart")
    fun getCartShareLink(@Body body: GetShareCartLinkRequest)
    : Deferred<Response<GetShareCartLinkResponse>>
    
    @GET ("/service/application/pos/cart/v1.0/share-cart/{token}")
    fun getCartSharedItems(@Path("token") token: String)
    : Deferred<Response<SharedCartResponse>>
    
    @POST ("/service/application/pos/cart/v1.0/share-cart/{token}/{action}")
    fun updateCartWithSharedItems(@Path("token") token: String, @Path("action") action: String)
    : Deferred<Response<SharedCartResponse>>
    
}

interface LogisticApiList {
    
    @POST ("/service/application/logistics/v1.0")
    fun getTatProduct(@Body body: GetTatProductReqBody)
    : Deferred<Response<GetTatProductResponse>>
    
    @GET ("/service/application/logistics/v1.0/pincode/{pincode}")
    fun getPincodeCity(@Path("pincode") pincode: String)
    : Deferred<Response<GetPincodeCityResponse>>
    
}

