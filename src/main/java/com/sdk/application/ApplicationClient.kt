package com.sdk.application

class ApplicationClient(val config:ApplicationConfig) {
    
    val catalog by lazy { CatalogDataManagerClass(config)}
    
    val cart by lazy { CartDataManagerClass(config)}
    
    val fileStorage by lazy { FileStorageDataManagerClass(config)}
    
    val order by lazy { OrderDataManagerClass(config)}
    
    val feedback by lazy { FeedbackDataManagerClass(config)}
    
    val posCart by lazy { PosCartDataManagerClass(config)}
    
    val logistic by lazy { LogisticDataManagerClass(config)}
    
}