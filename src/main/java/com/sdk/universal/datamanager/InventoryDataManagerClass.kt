package com.sdk.universal.datamanager

import com.sdk.common.*
import com.sdk.universal.*
import com.sdk.universal.models.inventory.*
import com.sdk.universal.apis.inventory.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class InventoryDataManagerClass(val config: PublicConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {
    
    private val inventoryApiList by lazy {
        generateinventoryApiList()
    }

    private var _relativeUrls : HashMap<String,String> = HashMap<String,String>()

    init{
            
                    _relativeUrls["getJobCodesMetrics"] = "/service/common/inventory/v1.0/company/email/jobCode".substring(1)
            
                    _relativeUrls["saveJobCodesMetrics"] = "/service/common/inventory/v1.0/company/email/jobCode".substring(1)
            
                    _relativeUrls["getConfigByApiKey"] = "/service/common/inventory/v1.0/company/slingshot".substring(1)
            
                    _relativeUrls["getApiKey"] = "/service/common/inventory/v1.0/company/slingshot/apikey".substring(1)
            
                    _relativeUrls["getJobByCode"] = "/service/common/inventory/v1.0/company/jobs/code/{code}".substring(1)
            
                    _relativeUrls["getJobConfigByIntegrationType"] = "/service/common/inventory/v1.0/company/job/config".substring(1)
            
    }

    public fun update(updatedUrlMap : HashMap<String,String>){
            for((key,value) in updatedUrlMap){
                _relativeUrls[key] = value
            }
    }
    

    private fun generateinventoryApiList(): InventoryApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = PublicHeaderInterceptor(config)
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
            namespace = "PublicInventory",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(InventoryApiList::class.java) as? InventoryApiList
    }
    
    fun getJobCodesMetrics(dailyJob: Boolean?=null, jobCode: String?=null): Deferred<Response<ResponseEnvelopeObject>>? {
        var fullUrl : String? = _relativeUrls["getJobCodesMetrics"] 
        
        return inventoryApiList?.getJobCodesMetrics(fullUrl    ,  dailyJob = dailyJob,    jobCode = jobCode)}

    
    
    fun saveJobCodesMetrics(body: EmailJobMetrics): Deferred<Response<ResponseEnvelopeEmailJobMetrics>>? {
        var fullUrl : String? = _relativeUrls["saveJobCodesMetrics"] 
        
        return inventoryApiList?.saveJobCodesMetrics(fullUrl  ,body = body)}

    
    
    fun getConfigByApiKey(apikey: String): Deferred<Response<ResponseEnvelopeSlingshotConfigurationDetail>>? {
        var fullUrl : String? = _relativeUrls["getConfigByApiKey"] 
        
        return inventoryApiList?.getConfigByApiKey(fullUrl    ,  apikey = apikey)}

    
    
    fun getApiKey(userName: String, password: String): Deferred<Response<ResponseEnvelopeApikeyModel>>? {
        var fullUrl : String? = _relativeUrls["getApiKey"] 
        
        return inventoryApiList?.getApiKey(fullUrl    ,  userName = userName,    password = password)}

    
    
    fun getJobByCode(code: String): Deferred<Response<ResponseEnvelopeJobConfigDTO>>? {
        var fullUrl : String? = _relativeUrls["getJobByCode"] 
        
        fullUrl = fullUrl?.replace("{" + "code" +"}",code.toString())
        
        return inventoryApiList?.getJobByCode(fullUrl   )}

    
    
    fun getJobConfigByIntegrationType(integrationType: String, disable: Boolean?=null): Deferred<Response<ResponseEnvelopeListJobConfigDTO>>? {
        var fullUrl : String? = _relativeUrls["getJobConfigByIntegrationType"] 
        
        return inventoryApiList?.getJobConfigByIntegrationType(fullUrl    ,  integrationType = integrationType,    disable = disable)}

    
    
}
