package com.sdk.platform.models.catalog

import com.sdk.platform.*


import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: DeleteResponse
*/
@Parcelize
data class DeleteResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ErrorResponse
*/
@Parcelize
data class ErrorResponse(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("error")
    var error: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SearchKeywordResult
*/
@Parcelize
data class SearchKeywordResult(
    
    
    
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("sort_on")
    var sortOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CreateSearchKeyword
*/
@Parcelize
data class CreateSearchKeyword(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("result")
    var result: SearchKeywordResult?=null,
    
    @SerializedName("words")
    var words: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetSearchWordsData
*/
@Parcelize
data class GetSearchWordsData(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("result")
    var result: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("words")
    var words: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Page
*/
@Parcelize
data class Page(
    
    
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("next_id")
    var nextId: String?=null,
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("size")
    var size: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetSearchWordsDetailResponse
*/
@Parcelize
data class GetSearchWordsDetailResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: GetSearchWordsData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetSearchWordsResponse
*/
@Parcelize
data class GetSearchWordsResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<GetSearchWordsData>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AutocompletePageAction
*/
@Parcelize
data class AutocompletePageAction(
    
    
    
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("params")
    var params: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AutocompleteAction
*/
@Parcelize
data class AutocompleteAction(
    
    
    
    @SerializedName("page")
    var page: AutocompletePageAction?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Media
*/
@Parcelize
data class Media(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AutocompleteResult
*/
@Parcelize
data class AutocompleteResult(
    
    
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("action")
    var action: AutocompleteAction?=null,
    
    @SerializedName("logo")
    var logo: Media?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateAutocompleteKeyword
*/
@Parcelize
data class CreateAutocompleteKeyword(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("results")
    var results: ArrayList<AutocompleteResult>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("words")
    var words: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetAutocompleteWordsData
*/
@Parcelize
data class GetAutocompleteWordsData(
    
    
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("results")
    var results: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("words")
    var words: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetAutocompleteWordsResponse
*/
@Parcelize
data class GetAutocompleteWordsResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<GetAutocompleteWordsData>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CreateAutocompleteWordsResponse
*/
@Parcelize
data class CreateAutocompleteWordsResponse(
    
    
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("results")
    var results: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("words")
    var words: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductBundleItem
*/
@Parcelize
data class ProductBundleItem(
    
    
    
    @SerializedName("allow_remove")
    var allowRemove: Boolean?=null,
    
    @SerializedName("min_quantity")
    var minQuantity: Int?=null,
    
    @SerializedName("auto_add_to_cart")
    var autoAddToCart: Boolean?=null,
    
    @SerializedName("auto_select")
    var autoSelect: Boolean?=null,
    
    @SerializedName("max_quantity")
    var maxQuantity: Int?=null,
    
    @SerializedName("product_uid")
    var productUid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductBundleRequest
*/
@Parcelize
data class ProductBundleRequest(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("choice")
    var choice: String?=null,
    
    @SerializedName("page_visibility")
    var pageVisibility: ArrayList<String>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("same_store_assignment")
    var sameStoreAssignment: Boolean?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("products")
    var products: ArrayList<ProductBundleItem>?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetProductBundleCreateResponse
*/
@Parcelize
data class GetProductBundleCreateResponse(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("choice")
    var choice: String?=null,
    
    @SerializedName("page_visibility")
    var pageVisibility: ArrayList<String>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("same_store_assignment")
    var sameStoreAssignment: Boolean?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("products")
    var products: ArrayList<ProductBundleItem>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetProductBundleListingResponse
*/
@Parcelize
data class GetProductBundleListingResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<GetProductBundleCreateResponse>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductBundleUpdateRequest
*/
@Parcelize
data class ProductBundleUpdateRequest(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("choice")
    var choice: String?=null,
    
    @SerializedName("page_visibility")
    var pageVisibility: ArrayList<String>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("same_store_assignment")
    var sameStoreAssignment: Boolean?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("products")
    var products: ArrayList<ProductBundleItem>?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LimitedProductData
*/
@Parcelize
data class LimitedProductData(
    
    
    
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("sizes")
    var sizes: ArrayList<String>?=null,
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    
    @SerializedName("images")
    var images: ArrayList<String>?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("price")
    var price: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Size
*/
@Parcelize
data class Size(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("is_available")
    var isAvailable: Boolean?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Price
*/
@Parcelize
data class Price(
    
    
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("min_effective")
    var minEffective: Double?=null,
    
    @SerializedName("max_effective")
    var maxEffective: Double?=null,
    
    @SerializedName("max_marked")
    var maxMarked: Double?=null,
    
    @SerializedName("min_marked")
    var minMarked: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetProducts
*/
@Parcelize
data class GetProducts(
    
    
    
    @SerializedName("allow_remove")
    var allowRemove: Boolean?=null,
    
    @SerializedName("auto_add_to_cart")
    var autoAddToCart: Boolean?=null,
    
    @SerializedName("min_quantity")
    var minQuantity: Int?=null,
    
    @SerializedName("product_details")
    var productDetails: LimitedProductData?=null,
    
    @SerializedName("auto_select")
    var autoSelect: Boolean?=null,
    
    @SerializedName("sizes")
    var sizes: ArrayList<Size>?=null,
    
    @SerializedName("max_quantity")
    var maxQuantity: Int?=null,
    
    @SerializedName("price")
    var price: Price?=null,
    
    @SerializedName("product_uid")
    var productUid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetProductBundleResponse
*/
@Parcelize
data class GetProductBundleResponse(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("choice")
    var choice: String?=null,
    
    @SerializedName("page_visibility")
    var pageVisibility: ArrayList<String>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("same_store_assignment")
    var sameStoreAssignment: Boolean?=null,
    
    @SerializedName("products")
    var products: ArrayList<GetProducts>?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Meta
*/
@Parcelize
data class Meta(
    
    
    
    @SerializedName("headers")
    var headers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("values")
    var values: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Guide
*/
@Parcelize
data class Guide(
    
    
    
    @SerializedName("meta")
    var meta: Meta?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ValidateSizeGuide
*/
@Parcelize
data class ValidateSizeGuide(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("brand_id")
    var brandId: Int?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("image")
    var image: String?=null,
    
    @SerializedName("guide")
    var guide: Guide?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("tag")
    var tag: String?=null,
    
    @SerializedName("title")
    var title: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SuccessResponse
*/
@Parcelize
data class SuccessResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ListSizeGuide
*/
@Parcelize
data class ListSizeGuide(
    
    
    
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SizeGuideResponse
*/
@Parcelize
data class SizeGuideResponse(
    
    
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("brand_id")
    var brandId: Int?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("guide")
    var guide: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("tag")
    var tag: String?=null,
    
    @SerializedName("title")
    var title: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationItemSEO
*/
@Parcelize
data class ApplicationItemSEO(
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("title")
    var title: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: MetaFields
*/
@Parcelize
data class MetaFields(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("key")
    var key: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationItemMOQ
*/
@Parcelize
data class ApplicationItemMOQ(
    
    
    
    @SerializedName("minimum")
    var minimum: Int?=null,
    
    @SerializedName("maximum")
    var maximum: Int?=null,
    
    @SerializedName("increment_unit")
    var incrementUnit: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationItemMeta
*/
@Parcelize
data class ApplicationItemMeta(
    
    
    
    @SerializedName("seo")
    var seo: ApplicationItemSEO?=null,
    
    @SerializedName("is_gift")
    var isGift: Boolean?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("alt_text")
    var altText: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_custom_meta")
    var customMeta: ArrayList<MetaFields>?=null,
    
    @SerializedName("is_cod")
    var isCod: Boolean?=null,
    
    @SerializedName("moq")
    var moq: ApplicationItemMOQ?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SuccessResponse1
*/
@Parcelize
data class SuccessResponse1(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SEOData
*/
@Parcelize
data class SEOData(
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("title")
    var title: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: MOQData
*/
@Parcelize
data class MOQData(
    
    
    
    @SerializedName("minimum")
    var minimum: Int?=null,
    
    @SerializedName("maximum")
    var maximum: Int?=null,
    
    @SerializedName("increment_unit")
    var incrementUnit: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OwnerAppItemResponse
*/
@Parcelize
data class OwnerAppItemResponse(
    
    
    
    @SerializedName("seo")
    var seo: SEOData?=null,
    
    @SerializedName("is_gift")
    var isGift: Boolean?=null,
    
    @SerializedName("alt_text")
    var altText: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_cod")
    var isCod: Boolean?=null,
    
    @SerializedName("moq")
    var moq: MOQData?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetConfigMetadataResponse
*/
@Parcelize
data class GetConfigMetadataResponse(
    
    
    
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("condition")
    var condition: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("values")
    var values: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AttributeDetailsGroup
*/
@Parcelize
data class AttributeDetailsGroup(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("display_type")
    var displayType: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AppConfigurationDetail
*/
@Parcelize
data class AppConfigurationDetail(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("template_slugs")
    var templateSlugs: ArrayList<String>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("attributes")
    var attributes: ArrayList<AttributeDetailsGroup>?=null,
    
    @SerializedName("priority")
    var priority: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ConfigErrorResponse
*/
@Parcelize
data class ConfigErrorResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PageResponseType
*/
@Parcelize
data class PageResponseType(
    
    
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("total_count")
    var totalCount: Int?=null,
    
    @SerializedName("next")
    var next: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetConfigResponse
*/
@Parcelize
data class GetConfigResponse(
    
    
    
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("page")
    var page: PageResponseType?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ConfigSuccessResponse
*/
@Parcelize
data class ConfigSuccessResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: AppConfigurationsSort
*/
@Parcelize
data class AppConfigurationsSort(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("default_key")
    var defaultKey: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AllowSingleRequest
*/
@Parcelize
data class AllowSingleRequest(
    
    
    
    @SerializedName("allow_single")
    var allowSingle: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DefaultKeyRequest
*/
@Parcelize
data class DefaultKeyRequest(
    
    
    
    @SerializedName("default_key")
    var defaultKey: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GetCatalogConfigurationDetailsProduct
*/
@Parcelize
data class GetCatalogConfigurationDetailsProduct(
    
    
    
    @SerializedName("similar")
    var similar: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("detail")
    var detail: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("compare")
    var compare: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("variant")
    var variant: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MetaDataListingFilterMetaResponse
*/
@Parcelize
data class MetaDataListingFilterMetaResponse(
    
    
    
    @SerializedName("filter_types")
    var filterTypes: ArrayList<String>?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("units")
    var units: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("display")
    var display: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MetaDataListingFilterResponse
*/
@Parcelize
data class MetaDataListingFilterResponse(
    
    
    
    @SerializedName("data")
    var data: ArrayList<MetaDataListingFilterMetaResponse>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: MetaDataListingSortMetaResponse
*/
@Parcelize
data class MetaDataListingSortMetaResponse(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("display")
    var display: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: MetaDataListingSortResponse
*/
@Parcelize
data class MetaDataListingSortResponse(
    
    
    
    @SerializedName("data")
    var data: ArrayList<MetaDataListingSortMetaResponse>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: MetaDataListingResponse
*/
@Parcelize
data class MetaDataListingResponse(
    
    
    
    @SerializedName("filter")
    var filter: MetaDataListingFilterResponse?=null,
    
    @SerializedName("sort")
    var sort: MetaDataListingSortResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetCatalogConfigurationMetaData
*/
@Parcelize
data class GetCatalogConfigurationMetaData(
    
    
    
    @SerializedName("product")
    var product: GetCatalogConfigurationDetailsProduct?=null,
    
    @SerializedName("listing")
    var listing: MetaDataListingResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductSize
*/
@Parcelize
data class ProductSize(
    
    
    
    @SerializedName("max")
    var max: Int?=null,
    
    @SerializedName("min")
    var min: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ConfigurationProductConfig
*/
@Parcelize
data class ConfigurationProductConfig(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("size")
    var size: ProductSize?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("title")
    var title: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ConfigurationProductSimilar
*/
@Parcelize
data class ConfigurationProductSimilar(
    
    
    
    @SerializedName("config")
    var config: ArrayList<ConfigurationProductConfig>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ConfigurationProductVariantConfig
*/
@Parcelize
data class ConfigurationProductVariantConfig(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("size")
    var size: ProductSize?=null,
    
    @SerializedName("display_type")
    var displayType: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ConfigurationProductVariant
*/
@Parcelize
data class ConfigurationProductVariant(
    
    
    
    @SerializedName("config")
    var config: ArrayList<ConfigurationProductVariantConfig>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ConfigurationProduct
*/
@Parcelize
data class ConfigurationProduct(
    
    
    
    @SerializedName("similar")
    var similar: ConfigurationProductSimilar?=null,
    
    @SerializedName("variant")
    var variant: ConfigurationProductVariant?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ConfigurationBucketPoints
*/
@Parcelize
data class ConfigurationBucketPoints(
    
    
    
    @SerializedName("end")
    var end: Double?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("start")
    var start: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ConfigurationListingFilterValue
*/
@Parcelize
data class ConfigurationListingFilterValue(
    
    
    
    @SerializedName("map_values")
    var mapValues: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("bucket_points")
    var bucketPoints: ArrayList<ConfigurationBucketPoints>?=null,
    
    @SerializedName("condition")
    var condition: String?=null,
    
    @SerializedName("map")
    var map: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("sort")
    var sort: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ConfigurationListingFilterConfig
*/
@Parcelize
data class ConfigurationListingFilterConfig(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("value_config")
    var valueConfig: ConfigurationListingFilterValue?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ConfigurationListingFilter
*/
@Parcelize
data class ConfigurationListingFilter(
    
    
    
    @SerializedName("attribute_config")
    var attributeConfig: ArrayList<ConfigurationListingFilterConfig>?=null,
    
    @SerializedName("allow_single")
    var allowSingle: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ConfigurationListingSortConfig
*/
@Parcelize
data class ConfigurationListingSortConfig(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ConfigurationListingSort
*/
@Parcelize
data class ConfigurationListingSort(
    
    
    
    @SerializedName("config")
    var config: ArrayList<ConfigurationListingSortConfig>?=null,
    
    @SerializedName("default_key")
    var defaultKey: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ConfigurationListing
*/
@Parcelize
data class ConfigurationListing(
    
    
    
    @SerializedName("filter")
    var filter: ConfigurationListingFilter?=null,
    
    @SerializedName("sort")
    var sort: ConfigurationListingSort?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AppConfiguration
*/
@Parcelize
data class AppConfiguration(
    
    
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("product")
    var product: ConfigurationProduct?=null,
    
    @SerializedName("config_id")
    var configId: String?=null,
    
    @SerializedName("listing")
    var listing: ConfigurationListing?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("config_type")
    var configType: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AppCatalogConfiguration
*/
@Parcelize
data class AppCatalogConfiguration(
    
    
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("product")
    var product: ConfigurationProduct?=null,
    
    @SerializedName("config_id")
    var configId: String?=null,
    
    @SerializedName("listing")
    var listing: ConfigurationListing?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("config_type")
    var configType: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetAppCatalogConfiguration
*/
@Parcelize
data class GetAppCatalogConfiguration(
    
    
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("data")
    var data: AppCatalogConfiguration?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetCatalogConfigurationDetailsSchemaListing
*/
@Parcelize
data class GetCatalogConfigurationDetailsSchemaListing(
    
    
    
    @SerializedName("filter")
    var filter: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("sort")
    var sort: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EntityConfiguration
*/
@Parcelize
data class EntityConfiguration(
    
    
    
    @SerializedName("product")
    var product: GetCatalogConfigurationDetailsProduct?=null,
    
    @SerializedName("config_id")
    var configId: String?=null,
    
    @SerializedName("listing")
    var listing: GetCatalogConfigurationDetailsSchemaListing?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("config_type")
    var configType: String?=null,
    
    @SerializedName("id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetAppCatalogEntityConfiguration
*/
@Parcelize
data class GetAppCatalogEntityConfiguration(
    
    
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("data")
    var data: EntityConfiguration?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductSortOn
*/
@Parcelize
data class ProductSortOn(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductFiltersKey
*/
@Parcelize
data class ProductFiltersKey(
    
    
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("operators")
    var operators: ArrayList<String>?=null,
    
    @SerializedName("kind")
    var kind: String?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductFiltersValue
*/
@Parcelize
data class ProductFiltersValue(
    
    
    
    @SerializedName("selected_max")
    var selectedMax: Int?=null,
    
    @SerializedName("display_format")
    var displayFormat: String?=null,
    
    @SerializedName("min")
    var min: Int?=null,
    
    @SerializedName("max")
    var max: Int?=null,
    
    @SerializedName("value")
    var value: @RawValue Any?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("count")
    var count: Int?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("selected_min")
    var selectedMin: Int?=null,
    
    @SerializedName("query_format")
    var queryFormat: String?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductFilters
*/
@Parcelize
data class ProductFilters(
    
    
    
    @SerializedName("key")
    var key: ProductFiltersKey?=null,
    
    @SerializedName("values")
    var values: ArrayList<ProductFiltersValue>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetCollectionQueryOptionResponse
*/
@Parcelize
data class GetCollectionQueryOptionResponse(
    
    
    
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSortOn>?=null,
    
    @SerializedName("filters")
    var filters: ArrayList<ProductFilters>?=null,
    
    @SerializedName("operators")
    var operators: HashMap<String,String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CollectionQuery
*/
@Parcelize
data class CollectionQuery(
    
    
    
    @SerializedName("value")
    var value: @RawValue ArrayList<Any>?=null,
    
    @SerializedName("op")
    var op: String?=null,
    
    @SerializedName("attribute")
    var attribute: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CollectionImage
*/
@Parcelize
data class CollectionImage(
    
    
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: NextSchedule
*/
@Parcelize
data class NextSchedule(
    
    
    
    @SerializedName("end")
    var end: String?=null,
    
    @SerializedName("start")
    var start: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CollectionSchedule
*/
@Parcelize
data class CollectionSchedule(
    
    
    
    @SerializedName("end")
    var end: String?=null,
    
    @SerializedName("duration")
    var duration: Int?=null,
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("cron")
    var cron: String?=null,
    
    @SerializedName("next_schedule")
    var nextSchedule: ArrayList<NextSchedule>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CollectionBanner
*/
@Parcelize
data class CollectionBanner(
    
    
    
    @SerializedName("portrait")
    var portrait: CollectionImage?=null,
    
    @SerializedName("landscape")
    var landscape: CollectionImage?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UserInfo
*/
@Parcelize
data class UserInfo(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SeoDetail
*/
@Parcelize
data class SeoDetail(
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("title")
    var title: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CollectionBadge
*/
@Parcelize
data class CollectionBadge(
    
    
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("color")
    var color: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CreateCollection
*/
@Parcelize
data class CreateCollection(
    
    
    
    @SerializedName("query")
    var query: ArrayList<CollectionQuery>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("sort_on")
    var sortOn: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    
    @SerializedName("logo")
    var logo: CollectionImage?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("is_visible")
    var isVisible: Boolean?=null,
    
    @SerializedName("_schedule")
    var schedule: CollectionSchedule?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("banners")
    var banners: CollectionBanner?=null,
    
    @SerializedName("created_by")
    var createdBy: UserInfo?=null,
    
    @SerializedName("seo")
    var seo: SeoDetail?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserInfo?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("badge")
    var badge: CollectionBadge?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BannerImage
*/
@Parcelize
data class BannerImage(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ImageUrls
*/
@Parcelize
data class ImageUrls(
    
    
    
    @SerializedName("portrait")
    var portrait: BannerImage?=null,
    
    @SerializedName("landscape")
    var landscape: BannerImage?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CollectionCreateResponse
*/
@Parcelize
data class CollectionCreateResponse(
    
    
    
    @SerializedName("query")
    var query: ArrayList<CollectionQuery>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("sort_on")
    var sortOn: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    
    @SerializedName("logo")
    var logo: BannerImage?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ActionPage
*/
@Parcelize
data class ActionPage(
    
    
    
    @SerializedName("params")
    var params: HashMap<String,ArrayList<String>>?=null,
    
    @SerializedName("query")
    var query: HashMap<String,ArrayList<String>>?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("type")
    var type: PageType?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Action
*/
@Parcelize
data class Action(
    
    
    
    @SerializedName("page")
    var page: ActionPage?=null,
    
    @SerializedName("popup")
    var popup: ActionPage?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Media1
*/
@Parcelize
data class Media1(
    
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetCollectionDetailNest
*/
@Parcelize
data class GetCollectionDetailNest(
    
    
    
    @SerializedName("query")
    var query: ArrayList<CollectionQuery>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("action")
    var action: Action?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    
    @SerializedName("logo")
    var logo: Media1?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CollectionListingFilterType
*/
@Parcelize
data class CollectionListingFilterType(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CollectionListingFilterTag
*/
@Parcelize
data class CollectionListingFilterTag(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CollectionListingFilter
*/
@Parcelize
data class CollectionListingFilter(
    
    
    
    @SerializedName("type")
    var type: ArrayList<CollectionListingFilterType>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<CollectionListingFilterTag>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetCollectionListingResponse
*/
@Parcelize
data class GetCollectionListingResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<GetCollectionDetailNest>?=null,
    
    @SerializedName("filters")
    var filters: CollectionListingFilter?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CollectionDetailResponse
*/
@Parcelize
data class CollectionDetailResponse(
    
    
    
    @SerializedName("query")
    var query: ArrayList<CollectionQuery>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    
    @SerializedName("logo")
    var logo: Media1?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateCollection
*/
@Parcelize
data class UpdateCollection(
    
    
    
    @SerializedName("query")
    var query: ArrayList<CollectionQuery>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("sort_on")
    var sortOn: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    
    @SerializedName("logo")
    var logo: CollectionImage?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("is_visible")
    var isVisible: Boolean?=null,
    
    @SerializedName("_schedule")
    var schedule: CollectionSchedule?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("banners")
    var banners: CollectionBanner?=null,
    
    @SerializedName("seo")
    var seo: SeoDetail?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserInfo?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("badge")
    var badge: CollectionBadge?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CollectionItem
*/
@Parcelize
data class CollectionItem(
    
    
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("action")
    var action: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CollectionItemUpdate
*/
@Parcelize
data class CollectionItemUpdate(
    
    
    
    @SerializedName("query")
    var query: ArrayList<CollectionQuery>?=null,
    
    @SerializedName("items")
    var items: ArrayList<CollectionItem>?=null,
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdatedResponse
*/
@Parcelize
data class UpdatedResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("items_not_updated")
    var itemsNotUpdated: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductBrand
*/
@Parcelize
data class ProductBrand(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("logo")
    var logo: Media1?=null,
    
    @SerializedName("action")
    var action: Action?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductDetailAttribute
*/
@Parcelize
data class ProductDetailAttribute(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductDetailGroupedAttribute
*/
@Parcelize
data class ProductDetailGroupedAttribute(
    
    
    
    @SerializedName("details")
    var details: ArrayList<ProductDetailAttribute>?=null,
    
    @SerializedName("title")
    var title: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Price1
*/
@Parcelize
data class Price1(
    
    
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("max")
    var max: Double?=null,
    
    @SerializedName("min")
    var min: Double?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductListingPrice
*/
@Parcelize
data class ProductListingPrice(
    
    
    
    @SerializedName("effective")
    var effective: Price1?=null,
    
    @SerializedName("marked")
    var marked: Price1?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductListingDetail
*/
@Parcelize
data class ProductListingDetail(
    
    
    
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    
    @SerializedName("brand")
    var brand: ProductBrand?=null,
    
    @SerializedName("similars")
    var similars: ArrayList<String>?=null,
    
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("image_nature")
    var imageNature: String?=null,
    
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("sellable")
    var sellable: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("rating_count")
    var ratingCount: Int?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("medias")
    var medias: ArrayList<Media1>?=null,
    
    @SerializedName("promo_meta")
    var promoMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("rating")
    var rating: Double?=null,
    
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null,
    
    @SerializedName("grouped_attributes")
    var groupedAttributes: ArrayList<ProductDetailGroupedAttribute>?=null,
    
    @SerializedName("price")
    var price: ProductListingPrice?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetCollectionItemsResponse
*/
@Parcelize
data class GetCollectionItemsResponse(
    
    
    
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSortOn>?=null,
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<ProductListingDetail>?=null,
    
    @SerializedName("filters")
    var filters: ArrayList<ProductFilters>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CatalogInsightItem
*/
@Parcelize
data class CatalogInsightItem(
    
    
    
    @SerializedName("count")
    var count: Int?=null,
    
    @SerializedName("sellable_count")
    var sellableCount: Int?=null,
    
    @SerializedName("out_of_stock_count")
    var outOfStockCount: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CatalogInsightBrand
*/
@Parcelize
data class CatalogInsightBrand(
    
    
    
    @SerializedName("total_sizes")
    var totalSizes: Int?=null,
    
    @SerializedName("available_sizes")
    var availableSizes: Int?=null,
    
    @SerializedName("total_articles")
    var totalArticles: Int?=null,
    
    @SerializedName("available_articles")
    var availableArticles: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("article_freshness")
    var articleFreshness: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CatalogInsightResponse
*/
@Parcelize
data class CatalogInsightResponse(
    
    
    
    @SerializedName("item")
    var item: CatalogInsightItem?=null,
    
    @SerializedName("brand_distribution")
    var brandDistribution: CatalogInsightBrand?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CrossSellingData
*/
@Parcelize
data class CrossSellingData(
    
    
    
    @SerializedName("articles")
    var articles: Int?=null,
    
    @SerializedName("products")
    var products: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CrossSellingResponse
*/
@Parcelize
data class CrossSellingResponse(
    
    
    
    @SerializedName("data")
    var data: CrossSellingData?=null,
    
    @SerializedName("brand_distribution")
    var brandDistribution: CatalogInsightBrand?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OptInPostRequest
*/
@Parcelize
data class OptInPostRequest(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("opt_level")
    var optLevel: String?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("platform")
    var platform: String?=null,
    
    @SerializedName("brand_ids")
    var brandIds: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyOptIn
*/
@Parcelize
data class CompanyOptIn(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("opt_level")
    var optLevel: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("created_on")
    var createdOn: Int?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("brand_ids")
    var brandIds: ArrayList<Int>?=null,
    
    @SerializedName("platform")
    var platform: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetOptInPlatform
*/
@Parcelize
data class GetOptInPlatform(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<CompanyOptIn>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OptinCompanyDetail
*/
@Parcelize
data class OptinCompanyDetail(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("company_type")
    var companyType: String?=null,
    
    @SerializedName("business_type")
    var businessType: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyBrandDetail
*/
@Parcelize
data class CompanyBrandDetail(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("total_article")
    var totalArticle: Int?=null,
    
    @SerializedName("brand_name")
    var brandName: String?=null,
    
    @SerializedName("brand_id")
    var brandId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OptinCompanyBrandDetailsView
*/
@Parcelize
data class OptinCompanyBrandDetailsView(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<CompanyBrandDetail>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OptinCompanyMetrics
*/
@Parcelize
data class OptinCompanyMetrics(
    
    
    
    @SerializedName("brand")
    var brand: Int?=null,
    
    @SerializedName("store")
    var store: Int?=null,
    
    @SerializedName("company")
    var company: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreDetail
*/
@Parcelize
data class StoreDetail(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("address")
    var address: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("manager")
    var manager: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("store_type")
    var storeType: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("additional_contacts")
    var additionalContacts: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("documents")
    var documents: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("timing")
    var timing: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OptinStoreDetails
*/
@Parcelize
data class OptinStoreDetails(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<StoreDetail>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AttributeMasterMandatoryDetails
*/
@Parcelize
data class AttributeMasterMandatoryDetails(
    
    
    
    @SerializedName("l3_keys")
    var l3Keys: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: AttributeMasterMeta
*/
@Parcelize
data class AttributeMasterMeta(
    
    
    
    @SerializedName("enriched")
    var enriched: Boolean?=null,
    
    @SerializedName("mandatory_details")
    var mandatoryDetails: AttributeMasterMandatoryDetails?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AttributeSchemaRange
*/
@Parcelize
data class AttributeSchemaRange(
    
    
    
    @SerializedName("max")
    var max: Int?=null,
    
    @SerializedName("min")
    var min: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AttributeMaster
*/
@Parcelize
data class AttributeMaster(
    
    
    
    @SerializedName("range")
    var range: AttributeSchemaRange?=null,
    
    @SerializedName("mandatory")
    var mandatory: Boolean?=null,
    
    @SerializedName("allowed_values")
    var allowedValues: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("multi")
    var multi: Boolean?=null,
    
    @SerializedName("format")
    var format: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AttributeMasterDetails
*/
@Parcelize
data class AttributeMasterDetails(
    
    
    
    @SerializedName("display_type")
    var displayType: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: AttributeMasterFilter
*/
@Parcelize
data class AttributeMasterFilter(
    
    
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("depends_on")
    var dependsOn: ArrayList<String>?=null,
    
    @SerializedName("indexing")
    var indexing: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GenderDetail
*/
@Parcelize
data class GenderDetail(
    
    
    
    @SerializedName("enabled_for_end_consumer")
    var enabledForEndConsumer: Boolean?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<String>?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("meta")
    var meta: AttributeMasterMeta?=null,
    
    @SerializedName("schema")
    var schema: AttributeMaster?=null,
    
    @SerializedName("details")
    var details: AttributeMasterDetails?=null,
    
    @SerializedName("is_nested")
    var isNested: Boolean?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("filters")
    var filters: AttributeMasterFilter?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CategoriesResponse
*/
@Parcelize
data class CategoriesResponse(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("slug_key")
    var slugKey: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("template_slug")
    var templateSlug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProdcutTemplateCategoriesResponse
*/
@Parcelize
data class ProdcutTemplateCategoriesResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<CategoriesResponse>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PTErrorResponse
*/
@Parcelize
data class PTErrorResponse(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("errors")
    var errors: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DepartmentCreateUpdate
*/
@Parcelize
data class DepartmentCreateUpdate(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("priority_order")
    var priorityOrder: Int?=null,
    
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    
    @SerializedName("_cls")
    var cls: String?=null,
    
    @SerializedName("platforms")
    var platforms: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DepartmentCreateResponse
*/
@Parcelize
data class DepartmentCreateResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DepartmentCreateErrorResponse
*/
@Parcelize
data class DepartmentCreateErrorResponse(
    
    
    
    @SerializedName("error")
    var error: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: UserSerializer
*/
@Parcelize
data class UserSerializer(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("username")
    var username: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetDepartment
*/
@Parcelize
data class GetDepartment(
    
    
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("page_no")
    var pageNo: Int?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("page_size")
    var pageSize: Int?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("search")
    var search: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("priority_order")
    var priorityOrder: Int?=null,
    
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DepartmentsResponse
*/
@Parcelize
data class DepartmentsResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<GetDepartment>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DepartmentErrorResponse
*/
@Parcelize
data class DepartmentErrorResponse(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("errors")
    var errors: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserDetail
*/
@Parcelize
data class UserDetail(
    
    
    
    @SerializedName("super_user")
    var superUser: Boolean?=null,
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("contact")
    var contact: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DepartmentModel
*/
@Parcelize
data class DepartmentModel(
    
    
    
    @SerializedName("created_by")
    var createdBy: UserDetail?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserDetail?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserDetail?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("priority_order")
    var priorityOrder: Int?=null,
    
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    
    @SerializedName("_id")
    var id: @RawValue Any?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("_cls")
    var cls: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductTemplate
*/
@Parcelize
data class ProductTemplate(
    
    
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("categories")
    var categories: ArrayList<String>?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("is_physical")
    var isPhysical: Boolean?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<String>?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_expirable")
    var isExpirable: Boolean?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("attributes")
    var attributes: ArrayList<String>?=null,
    
    @SerializedName("is_archived")
    var isArchived: Boolean?=null,
    
    @SerializedName("tag")
    var tag: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TemplatesResponse
*/
@Parcelize
data class TemplatesResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ProductTemplate?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Properties
*/
@Parcelize
data class Properties(
    
    
    
    @SerializedName("highlights")
    var highlights: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("brand_uid")
    var brandUid: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("sizes")
    var sizes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("slug")
    var slug: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("variants")
    var variants: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("trader_type")
    var traderType: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("no_of_boxes")
    var noOfBoxes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_active")
    var isActive: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("command")
    var command: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_dependent")
    var isDependent: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("tags")
    var tags: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_type")
    var itemType: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("trader")
    var trader: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("category_slug")
    var categorySlug: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("description")
    var description: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("currency")
    var currency: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("multi_size")
    var multiSize: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("short_description")
    var shortDescription: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("product_publish")
    var productPublish: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("size_guide")
    var sizeGuide: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_code")
    var itemCode: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("return_config")
    var returnConfig: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("media")
    var media: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("custom_order")
    var customOrder: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("product_group_tag")
    var productGroupTag: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GlobalValidation
*/
@Parcelize
data class GlobalValidation(
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("required")
    var required: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("properties")
    var properties: Properties?=null,
    
    @SerializedName("definitions")
    var definitions: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("title")
    var title: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TemplateValidationData
*/
@Parcelize
data class TemplateValidationData(
    
    
    
    @SerializedName("template_validation")
    var templateValidation: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("global_validation")
    var globalValidation: GlobalValidation?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TemplateDetails
*/
@Parcelize
data class TemplateDetails(
    
    
    
    @SerializedName("categories")
    var categories: ArrayList<String>?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("is_physical")
    var isPhysical: Boolean?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<String>?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("is_expirable")
    var isExpirable: Boolean?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("attributes")
    var attributes: ArrayList<String>?=null,
    
    @SerializedName("is_archived")
    var isArchived: Boolean?=null,
    
    @SerializedName("tag")
    var tag: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TemplatesValidationResponse
*/
@Parcelize
data class TemplatesValidationResponse(
    
    
    
    @SerializedName("data")
    var data: TemplateValidationData?=null,
    
    @SerializedName("template_details")
    var templateDetails: TemplateDetails?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryValidationResponse
*/
@Parcelize
data class InventoryValidationResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: HSNData
*/
@Parcelize
data class HSNData(
    
    
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: ArrayList<String>?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: HSNCodesResponse
*/
@Parcelize
data class HSNCodesResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("data")
    var data: HSNData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UserInfo1
*/
@Parcelize
data class UserInfo1(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductTemplateExportResponse
*/
@Parcelize
data class ProductTemplateExportResponse(
    
    
    
    @SerializedName("created_by")
    var createdBy: UserInfo1?=null,
    
    @SerializedName("completed_on")
    var completedOn: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("task_id")
    var taskId: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("filters")
    var filters: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("seller_id")
    var sellerId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductDownloadsResponse
*/
@Parcelize
data class ProductDownloadsResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<ProductTemplateExportResponse>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ProductTemplateExportFilterRequest
*/
@Parcelize
data class ProductTemplateExportFilterRequest(
    
    
    
    @SerializedName("catalogue_types")
    var catalogueTypes: ArrayList<String>?=null,
    
    @SerializedName("from_date")
    var fromDate: String?=null,
    
    @SerializedName("to_date")
    var toDate: String?=null,
    
    @SerializedName("templates")
    var templates: ArrayList<String>?=null,
    
    @SerializedName("brands")
    var brands: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductTemplateDownloadsExport
*/
@Parcelize
data class ProductTemplateDownloadsExport(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("filters")
    var filters: ProductTemplateExportFilterRequest?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductConfigurationDownloads
*/
@Parcelize
data class ProductConfigurationDownloads(
    
    
    
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("multivalue")
    var multivalue: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CategoryMappingValues
*/
@Parcelize
data class CategoryMappingValues(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("catalog_id")
    var catalogId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CategoryMapping
*/
@Parcelize
data class CategoryMapping(
    
    
    
    @SerializedName("ajio")
    var ajio: CategoryMappingValues?=null,
    
    @SerializedName("google")
    var google: CategoryMappingValues?=null,
    
    @SerializedName("facebook")
    var facebook: CategoryMappingValues?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Hierarchy
*/
@Parcelize
data class Hierarchy(
    
    
    
    @SerializedName("l2")
    var l2: Int?=null,
    
    @SerializedName("department")
    var department: Int?=null,
    
    @SerializedName("l1")
    var l1: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Media2
*/
@Parcelize
data class Media2(
    
    
    
    @SerializedName("portrait")
    var portrait: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("landscape")
    var landscape: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CategoryRequestBody
*/
@Parcelize
data class CategoryRequestBody(
    
    
    
    @SerializedName("level")
    var level: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<Int>?=null,
    
    @SerializedName("marketplaces")
    var marketplaces: CategoryMapping?=null,
    
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    
    @SerializedName("hierarchy")
    var hierarchy: ArrayList<Hierarchy>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("media")
    var media: Media2?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CategoryCreateResponse
*/
@Parcelize
data class CategoryCreateResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Category
*/
@Parcelize
data class Category(
    
    
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("level")
    var level: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<Int>?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("marketplaces")
    var marketplaces: CategoryMapping?=null,
    
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    
    @SerializedName("hierarchy")
    var hierarchy: ArrayList<Hierarchy>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("media")
    var media: Media2?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CategoryResponse
*/
@Parcelize
data class CategoryResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<Category>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CategoryUpdateResponse
*/
@Parcelize
data class CategoryUpdateResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SingleCategoryResponse
*/
@Parcelize
data class SingleCategoryResponse(
    
    
    
    @SerializedName("data")
    var data: Category?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: TeaserTag
*/
@Parcelize
data class TeaserTag(
    
    
    
    @SerializedName("tag")
    var tag: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Trader
*/
@Parcelize
data class Trader(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("address")
    var address: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TaxIdentifier
*/
@Parcelize
data class TaxIdentifier(
    
    
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("hsn_code_id")
    var hsnCodeId: String?=null,
    
    @SerializedName("reporting_hsn")
    var reportingHsn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductPublish
*/
@Parcelize
data class ProductPublish(
    
    
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ReturnConfig
*/
@Parcelize
data class ReturnConfig(
    
    
    
    @SerializedName("returnable")
    var returnable: Boolean?=null,
    
    @SerializedName("time")
    var time: Int?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomOrder
*/
@Parcelize
data class CustomOrder(
    
    
    
    @SerializedName("manufacturing_time_unit")
    var manufacturingTimeUnit: String?=null,
    
    @SerializedName("manufacturing_time")
    var manufacturingTime: Int?=null,
    
    @SerializedName("is_custom_order")
    var isCustomOrder: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: NetQuantity
*/
@Parcelize
data class NetQuantity(
    
    
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductCreateUpdateSchemaV2
*/
@Parcelize
data class ProductCreateUpdateSchemaV2(
    
    
    
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<Int>?=null,
    
    @SerializedName("variant_media")
    var variantMedia: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("brand_uid")
    var brandUid: Int?=null,
    
    @SerializedName("sizes")
    var sizes: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("variants")
    var variants: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("requester")
    var requester: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("no_of_boxes")
    var noOfBoxes: Int?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("is_dependent")
    var isDependent: Boolean?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: TeaserTag?=null,
    
    @SerializedName("change_request_id")
    var changeRequestId: @RawValue Any?=null,
    
    @SerializedName("trader")
    var trader: ArrayList<Trader>?=null,
    
    @SerializedName("category_slug")
    var categorySlug: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("multi_size")
    var multiSize: Boolean?=null,
    
    @SerializedName("tax_identifier")
    var taxIdentifier: TaxIdentifier?=null,
    
    @SerializedName("bulk_job_id")
    var bulkJobId: String?=null,
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    
    @SerializedName("template_tag")
    var templateTag: String?=null,
    
    @SerializedName("is_image_less_product")
    var isImageLessProduct: Boolean?=null,
    
    @SerializedName("product_publish")
    var productPublish: ProductPublish?=null,
    
    @SerializedName("size_guide")
    var sizeGuide: String?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("return_config")
    var returnConfig: ReturnConfig?=null,
    
    @SerializedName("media")
    var media: ArrayList<Media1>?=null,
    
    @SerializedName("custom_order")
    var customOrder: CustomOrder?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    
    @SerializedName("variant_group")
    var variantGroup: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("product_group_tag")
    var productGroupTag: ArrayList<String>?=null,
    
    @SerializedName("net_quantity")
    var netQuantity: NetQuantity?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Logo
*/
@Parcelize
data class Logo(
    
    
    
    @SerializedName("aspect_ratio_f")
    var aspectRatioF: Int?=null,
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("secure_url")
    var secureUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Brand
*/
@Parcelize
data class Brand(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("logo")
    var logo: Logo?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: VerifiedBy
*/
@Parcelize
data class VerifiedBy(
    
    
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Image
*/
@Parcelize
data class Image(
    
    
    
    @SerializedName("aspect_ratio_f")
    var aspectRatioF: Double?=null,
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("secure_url")
    var secureUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductPublish1
*/
@Parcelize
data class ProductPublish1(
    
    
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ReturnConfigResponse
*/
@Parcelize
data class ReturnConfigResponse(
    
    
    
    @SerializedName("returnable")
    var returnable: Boolean?=null,
    
    @SerializedName("time")
    var time: Int?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: NetQuantityResponse
*/
@Parcelize
data class NetQuantityResponse(
    
    
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductSchemaV2
*/
@Parcelize
data class ProductSchemaV2(
    
    
    
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<Int>?=null,
    
    @SerializedName("brand")
    var brand: Brand?=null,
    
    @SerializedName("brand_uid")
    var brandUid: Int?=null,
    
    @SerializedName("sizes")
    var sizes: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("variant_media")
    var variantMedia: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("variants")
    var variants: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("all_identifiers")
    var allIdentifiers: ArrayList<String>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("no_of_boxes")
    var noOfBoxes: Int?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: VerifiedBy?=null,
    
    @SerializedName("is_dependent")
    var isDependent: Boolean?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("trader")
    var trader: ArrayList<Trader>?=null,
    
    @SerializedName("primary_color")
    var primaryColor: String?=null,
    
    @SerializedName("image_nature")
    var imageNature: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("images")
    var images: ArrayList<Image>?=null,
    
    @SerializedName("moq")
    var moq: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("all_company_ids")
    var allCompanyIds: ArrayList<Int>?=null,
    
    @SerializedName("is_physical")
    var isPhysical: Boolean?=null,
    
    @SerializedName("all_sizes")
    var allSizes: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("category_slug")
    var categorySlug: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("category_uid")
    var categoryUid: Int?=null,
    
    @SerializedName("multi_size")
    var multiSize: Boolean?=null,
    
    @SerializedName("tax_identifier")
    var taxIdentifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_expirable")
    var isExpirable: Boolean?=null,
    
    @SerializedName("pending")
    var pending: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    
    @SerializedName("template_tag")
    var templateTag: String?=null,
    
    @SerializedName("l3_mapping")
    var l3Mapping: ArrayList<String>?=null,
    
    @SerializedName("product_publish")
    var productPublish: ProductPublish1?=null,
    
    @SerializedName("category")
    var category: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("size_guide")
    var sizeGuide: String?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("return_config")
    var returnConfig: ReturnConfigResponse?=null,
    
    @SerializedName("is_image_less_product")
    var isImageLessProduct: Boolean?=null,
    
    @SerializedName("media")
    var media: ArrayList<Media1>?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("custom_order")
    var customOrder: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    
    @SerializedName("variant_group")
    var variantGroup: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("product_group_tag")
    var productGroupTag: ArrayList<String>?=null,
    
    @SerializedName("net_quantity")
    var netQuantity: NetQuantityResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductListingResponseV2
*/
@Parcelize
data class ProductListingResponseV2(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<ProductSchemaV2>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductVariants
*/
@Parcelize
data class ProductVariants(
    
    
    
    @SerializedName("category_uid")
    var categoryUid: Int?=null,
    
    @SerializedName("brand_uid")
    var brandUid: Int?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("media")
    var media: ArrayList<Media1>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductVariantsResponse
*/
@Parcelize
data class ProductVariantsResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("variants")
    var variants: ArrayList<ProductVariants>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AttributeMasterSerializer
*/
@Parcelize
data class AttributeMasterSerializer(
    
    
    
    @SerializedName("enabled_for_end_consumer")
    var enabledForEndConsumer: Boolean?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<String>?=null,
    
    @SerializedName("raw_key")
    var rawKey: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("variant")
    var variant: Boolean?=null,
    
    @SerializedName("schema")
    var schema: AttributeMaster?=null,
    
    @SerializedName("suggestion")
    var suggestion: String?=null,
    
    @SerializedName("synonyms")
    var synonyms: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("details")
    var details: AttributeMasterDetails?=null,
    
    @SerializedName("is_nested")
    var isNested: Boolean?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("filters")
    var filters: AttributeMasterFilter?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductAttributesResponse
*/
@Parcelize
data class ProductAttributesResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<AttributeMasterSerializer>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: SingleProductResponse
*/
@Parcelize
data class SingleProductResponse(
    
    
    
    @SerializedName("data")
    var data: ProductSchemaV2?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ValidateIdentifier
*/
@Parcelize
data class ValidateIdentifier(
    
    
    
    @SerializedName("gtin_type")
    var gtinType: String?=null,
    
    @SerializedName("gtin_value")
    var gtinValue: String?=null,
    
    @SerializedName("primary")
    var primary: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AllSizes
*/
@Parcelize
data class AllSizes(
    
    
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("item_height")
    var itemHeight: Double?=null,
    
    @SerializedName("item_weight")
    var itemWeight: Double?=null,
    
    @SerializedName("item_weight_unit_of_measure")
    var itemWeightUnitOfMeasure: String?=null,
    
    @SerializedName("item_width")
    var itemWidth: Double?=null,
    
    @SerializedName("item_length")
    var itemLength: Double?=null,
    
    @SerializedName("item_dimensions_unit_of_measure")
    var itemDimensionsUnitOfMeasure: String?=null,
    
    @SerializedName("identifiers")
    var identifiers: ArrayList<ValidateIdentifier>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetAllSizes
*/
@Parcelize
data class GetAllSizes(
    
    
    
    @SerializedName("all_sizes")
    var allSizes: ArrayList<AllSizes>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ValidateProduct
*/
@Parcelize
data class ValidateProduct(
    
    
    
    @SerializedName("valid")
    var valid: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ProductPublished
*/
@Parcelize
data class ProductPublished(
    
    
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("product_online_date")
    var productOnlineDate: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Product
*/
@Parcelize
data class Product(
    
    
    
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<Int>?=null,
    
    @SerializedName("brand")
    var brand: Brand?=null,
    
    @SerializedName("brand_uid")
    var brandUid: Int?=null,
    
    @SerializedName("sizes")
    var sizes: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("variant_media")
    var variantMedia: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("variants")
    var variants: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("all_identifiers")
    var allIdentifiers: ArrayList<String>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("no_of_boxes")
    var noOfBoxes: Int?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: VerifiedBy?=null,
    
    @SerializedName("is_dependent")
    var isDependent: Boolean?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("trader")
    var trader: ArrayList<Trader>?=null,
    
    @SerializedName("primary_color")
    var primaryColor: String?=null,
    
    @SerializedName("image_nature")
    var imageNature: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("images")
    var images: ArrayList<Image>?=null,
    
    @SerializedName("moq")
    var moq: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("all_company_ids")
    var allCompanyIds: ArrayList<Int>?=null,
    
    @SerializedName("is_physical")
    var isPhysical: Boolean?=null,
    
    @SerializedName("all_sizes")
    var allSizes: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("category_slug")
    var categorySlug: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("category_uid")
    var categoryUid: Int?=null,
    
    @SerializedName("multi_size")
    var multiSize: Boolean?=null,
    
    @SerializedName("tax_identifier")
    var taxIdentifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_expirable")
    var isExpirable: Boolean?=null,
    
    @SerializedName("pending")
    var pending: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    
    @SerializedName("template_tag")
    var templateTag: String?=null,
    
    @SerializedName("l3_mapping")
    var l3Mapping: ArrayList<String>?=null,
    
    @SerializedName("product_publish")
    var productPublish: ProductPublished?=null,
    
    @SerializedName("category")
    var category: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("size_guide")
    var sizeGuide: String?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("return_config")
    var returnConfig: ReturnConfigResponse?=null,
    
    @SerializedName("is_image_less_product")
    var isImageLessProduct: Boolean?=null,
    
    @SerializedName("media")
    var media: ArrayList<Media1>?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("custom_order")
    var customOrder: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    
    @SerializedName("variant_group")
    var variantGroup: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("product_group_tag")
    var productGroupTag: ArrayList<String>?=null,
    
    @SerializedName("net_quantity")
    var netQuantity: NetQuantityResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductListingResponse
*/
@Parcelize
data class ProductListingResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<Product>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BulkJob
*/
@Parcelize
data class BulkJob(
    
    
    
    @SerializedName("created_by")
    var createdBy: UserInfo1?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("failed_records")
    var failedRecords: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserInfo1?=null,
    
    @SerializedName("succeed")
    var succeed: Int?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("tracking_url")
    var trackingUrl: String?=null,
    
    @SerializedName("cancelled")
    var cancelled: Int?=null,
    
    @SerializedName("cancelled_records")
    var cancelledRecords: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("template_tag")
    var templateTag: String?=null,
    
    @SerializedName("failed")
    var failed: Int?=null,
    
    @SerializedName("custom_template_tag")
    var customTemplateTag: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkResponse
*/
@Parcelize
data class BulkResponse(
    
    
    
    @SerializedName("created_by")
    var createdBy: UserInfo1?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserInfo1?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserDetail1
*/
@Parcelize
data class UserDetail1(
    
    
    
    @SerializedName("full_name")
    var fullName: String?=null,
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductBulkRequest
*/
@Parcelize
data class ProductBulkRequest(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("failed_records")
    var failedRecords: ArrayList<String>?=null,
    
    @SerializedName("created_by")
    var createdBy: UserDetail1?=null,
    
    @SerializedName("succeed")
    var succeed: Int?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserDetail1?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("cancelled")
    var cancelled: Int?=null,
    
    @SerializedName("cancelled_records")
    var cancelledRecords: ArrayList<String>?=null,
    
    @SerializedName("template")
    var template: ProductTemplate?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("template_tag")
    var templateTag: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("failed")
    var failed: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductBulkRequestList
*/
@Parcelize
data class ProductBulkRequestList(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ProductBulkRequest?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BulkProductRequest
*/
@Parcelize
data class BulkProductRequest(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("template_tag")
    var templateTag: String?=null,
    
    @SerializedName("batch_id")
    var batchId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductTagsViewResponse
*/
@Parcelize
data class ProductTagsViewResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ProductBulkAssets
*/
@Parcelize
data class ProductBulkAssets(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("user")
    var user: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserCommon
*/
@Parcelize
data class UserCommon(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Items
*/
@Parcelize
data class Items(
    
    
    
    @SerializedName("created_by")
    var createdBy: UserCommon?=null,
    
    @SerializedName("failed_records")
    var failedRecords: ArrayList<String>?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserCommon?=null,
    
    @SerializedName("succeed")
    var succeed: Int?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("tracking_url")
    var trackingUrl: String?=null,
    
    @SerializedName("cancelled")
    var cancelled: Int?=null,
    
    @SerializedName("cancelled_records")
    var cancelledRecords: ArrayList<String>?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("failed")
    var failed: Int?=null,
    
    @SerializedName("retry")
    var retry: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkAssetResponse
*/
@Parcelize
data class BulkAssetResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<Items>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductSizeDeleteDataResponse
*/
@Parcelize
data class ProductSizeDeleteDataResponse(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("size")
    var size: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductSizeDeleteResponse
*/
@Parcelize
data class ProductSizeDeleteResponse(
    
    
    
    @SerializedName("data")
    var data: ProductSizeDeleteDataResponse?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GTIN
*/
@Parcelize
data class GTIN(
    
    
    
    @SerializedName("gtin_type")
    var gtinType: String?=null,
    
    @SerializedName("gtin_value")
    var gtinValue: String?=null,
    
    @SerializedName("primary")
    var primary: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SetSize
*/
@Parcelize
data class SetSize(
    
    
    
    @SerializedName("pieces")
    var pieces: Int?=null,
    
    @SerializedName("size")
    var size: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SizeDistribution
*/
@Parcelize
data class SizeDistribution(
    
    
    
    @SerializedName("sizes")
    var sizes: ArrayList<SetSize>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: InventorySet
*/
@Parcelize
data class InventorySet(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("size_distribution")
    var sizeDistribution: SizeDistribution?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InvSize
*/
@Parcelize
data class InvSize(
    
    
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("item_height")
    var itemHeight: Double?=null,
    
    @SerializedName("item_weight")
    var itemWeight: Double?=null,
    
    @SerializedName("expiration_date")
    var expirationDate: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("item_weight_unit_of_measure")
    var itemWeightUnitOfMeasure: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("identifiers")
    var identifiers: ArrayList<GTIN>?=null,
    
    @SerializedName("item_dimensions_unit_of_measure")
    var itemDimensionsUnitOfMeasure: String?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("item_width")
    var itemWidth: Double?=null,
    
    @SerializedName("item_length")
    var itemLength: Double?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("price_transfer")
    var priceTransfer: Double?=null,
    
    @SerializedName("set")
    var set: InventorySet?=null,
    
    @SerializedName("price")
    var price: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ItemQuery
*/
@Parcelize
data class ItemQuery(
    
    
    
    @SerializedName("brand_uid")
    var brandUid: Int?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryRequest
*/
@Parcelize
data class InventoryRequest(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("sizes")
    var sizes: ArrayList<InvSize>?=null,
    
    @SerializedName("item")
    var item: ItemQuery?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryResponse
*/
@Parcelize
data class InventoryResponse(
    
    
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("identifiers")
    var identifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("sellable_quantity")
    var sellableQuantity: Int?=null,
    
    @SerializedName("inventory_updated_on")
    var inventoryUpdatedOn: String?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("store")
    var store: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("price_transfer")
    var priceTransfer: Double?=null,
    
    @SerializedName("price")
    var price: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryResponsePaginated
*/
@Parcelize
data class InventoryResponsePaginated(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<InventoryResponse>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: QuantityBase
*/
@Parcelize
data class QuantityBase(
    
    
    
    @SerializedName("count")
    var count: Int?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Quantities
*/
@Parcelize
data class Quantities(
    
    
    
    @SerializedName("damaged")
    var damaged: QuantityBase?=null,
    
    @SerializedName("order_committed")
    var orderCommitted: QuantityBase?=null,
    
    @SerializedName("not_available")
    var notAvailable: QuantityBase?=null,
    
    @SerializedName("sellable")
    var sellable: QuantityBase?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BrandMeta
*/
@Parcelize
data class BrandMeta(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DimensionResponse
*/
@Parcelize
data class DimensionResponse(
    
    
    
    @SerializedName("height")
    var height: Double?=null,
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("width")
    var width: Double?=null,
    
    @SerializedName("length")
    var length: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Trader1
*/
@Parcelize
data class Trader1(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("address")
    var address: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: WeightResponse
*/
@Parcelize
data class WeightResponse(
    
    
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("shipping")
    var shipping: Double?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreMeta
*/
@Parcelize
data class StoreMeta(
    
    
    
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ReturnConfig1
*/
@Parcelize
data class ReturnConfig1(
    
    
    
    @SerializedName("returnable")
    var returnable: Boolean?=null,
    
    @SerializedName("time")
    var time: Int?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ManufacturerResponse
*/
@Parcelize
data class ManufacturerResponse(
    
    
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("address")
    var address: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PriceMeta
*/
@Parcelize
data class PriceMeta(
    
    
    
    @SerializedName("effective")
    var effective: Double?=null,
    
    @SerializedName("tp_notes")
    var tpNotes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("marked")
    var marked: Double?=null,
    
    @SerializedName("transfer")
    var transfer: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyMeta
*/
@Parcelize
data class CompanyMeta(
    
    
    
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: InventorySellerResponse
*/
@Parcelize
data class InventorySellerResponse(
    
    
    
    @SerializedName("quantities")
    var quantities: Quantities?=null,
    
    @SerializedName("trace_id")
    var traceId: String?=null,
    
    @SerializedName("total_quantity")
    var totalQuantity: Int?=null,
    
    @SerializedName("brand")
    var brand: BrandMeta?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("fynd_item_code")
    var fyndItemCode: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("fynd_article_code")
    var fyndArticleCode: String?=null,
    
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("added_on_store")
    var addedOnStore: String?=null,
    
    @SerializedName("dimension")
    var dimension: DimensionResponse?=null,
    
    @SerializedName("fynd_meta")
    var fyndMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("trader")
    var trader: ArrayList<Trader1>?=null,
    
    @SerializedName("weight")
    var weight: WeightResponse?=null,
    
    @SerializedName("store")
    var store: StoreMeta?=null,
    
    @SerializedName("set")
    var set: InventorySet?=null,
    
    @SerializedName("track_inventory")
    var trackInventory: Boolean?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("tax_identifier")
    var taxIdentifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("return_config")
    var returnConfig: ReturnConfig1?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("raw_meta")
    var rawMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    
    @SerializedName("manufacturer")
    var manufacturer: ManufacturerResponse?=null,
    
    @SerializedName("expiration_date")
    var expirationDate: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("fragile")
    var fragile: Boolean?=null,
    
    @SerializedName("price")
    var price: PriceMeta?=null,
    
    @SerializedName("company")
    var company: CompanyMeta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventorySellerIdentifierResponsePaginated
*/
@Parcelize
data class InventorySellerIdentifierResponsePaginated(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<InventorySellerResponse>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Quantity
*/
@Parcelize
data class Quantity(
    
    
    
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: QuantitiesArticle
*/
@Parcelize
data class QuantitiesArticle(
    
    
    
    @SerializedName("damaged")
    var damaged: Quantity?=null,
    
    @SerializedName("order_committed")
    var orderCommitted: Quantity?=null,
    
    @SerializedName("not_available")
    var notAvailable: Quantity?=null,
    
    @SerializedName("sellable")
    var sellable: Quantity?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BrandMeta1
*/
@Parcelize
data class BrandMeta1(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DimensionResponse1
*/
@Parcelize
data class DimensionResponse1(
    
    
    
    @SerializedName("width")
    var width: Double?=null,
    
    @SerializedName("height")
    var height: Double?=null,
    
    @SerializedName("length")
    var length: Double?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: WeightResponse1
*/
@Parcelize
data class WeightResponse1(
    
    
    
    @SerializedName("shipping")
    var shipping: Double?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Trader2
*/
@Parcelize
data class Trader2(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("address")
    var address: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleStoreResponse
*/
@Parcelize
data class ArticleStoreResponse(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("store_type")
    var storeType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ReturnConfig2
*/
@Parcelize
data class ReturnConfig2(
    
    
    
    @SerializedName("returnable")
    var returnable: Boolean?=null,
    
    @SerializedName("time")
    var time: Int?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ManufacturerResponse1
*/
@Parcelize
data class ManufacturerResponse1(
    
    
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("address")
    var address: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DateMeta
*/
@Parcelize
data class DateMeta(
    
    
    
    @SerializedName("inventory_updated_on")
    var inventoryUpdatedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("added_on_store")
    var addedOnStore: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PriceArticle
*/
@Parcelize
data class PriceArticle(
    
    
    
    @SerializedName("effective")
    var effective: Double?=null,
    
    @SerializedName("tp_notes")
    var tpNotes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("marked")
    var marked: Double?=null,
    
    @SerializedName("transfer")
    var transfer: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyMeta1
*/
@Parcelize
data class CompanyMeta1(
    
    
    
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GetInventories
*/
@Parcelize
data class GetInventories(
    
    
    
    @SerializedName("quantities")
    var quantities: QuantitiesArticle?=null,
    
    @SerializedName("trace_id")
    var traceId: String?=null,
    
    @SerializedName("total_quantity")
    var totalQuantity: Int?=null,
    
    @SerializedName("brand")
    var brand: BrandMeta1?=null,
    
    @SerializedName("inventory_updated_on")
    var inventoryUpdatedOn: String?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("dimension")
    var dimension: DimensionResponse1?=null,
    
    @SerializedName("weight")
    var weight: WeightResponse1?=null,
    
    @SerializedName("trader")
    var trader: ArrayList<Trader2>?=null,
    
    @SerializedName("store")
    var store: ArticleStoreResponse?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("track_inventory")
    var trackInventory: Boolean?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("tax_identifier")
    var taxIdentifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("return_config")
    var returnConfig: ReturnConfig2?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("manufacturer")
    var manufacturer: ManufacturerResponse1?=null,
    
    @SerializedName("expiration_date")
    var expirationDate: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("platforms")
    var platforms: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    
    @SerializedName("date_meta")
    var dateMeta: DateMeta?=null,
    
    @SerializedName("price")
    var price: PriceArticle?=null,
    
    @SerializedName("company")
    var company: CompanyMeta1?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetInventoriesResponse
*/
@Parcelize
data class GetInventoriesResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<GetInventories>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BulkInventoryGetItems
*/
@Parcelize
data class BulkInventoryGetItems(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("failed_records")
    var failedRecords: ArrayList<String>?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("succeed")
    var succeed: Int?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("cancelled")
    var cancelled: Int?=null,
    
    @SerializedName("cancelled_records")
    var cancelledRecords: ArrayList<String>?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("failed")
    var failed: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkInventoryGet
*/
@Parcelize
data class BulkInventoryGet(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<BulkInventoryGetItems>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryJobPayload
*/
@Parcelize
data class InventoryJobPayload(
    
    
    
    @SerializedName("trace_id")
    var traceId: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("total_quantity")
    var totalQuantity: Int?=null,
    
    @SerializedName("expiration_date")
    var expirationDate: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("item_weight_unit_of_measure")
    var itemWeightUnitOfMeasure: String?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("item_dimensions_unit_of_measure")
    var itemDimensionsUnitOfMeasure: String?=null,
    
    @SerializedName("price")
    var price: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryBulkRequest
*/
@Parcelize
data class InventoryBulkRequest(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("user")
    var user: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("sizes")
    var sizes: ArrayList<InventoryJobPayload>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryExportRequest
*/
@Parcelize
data class InventoryExportRequest(
    
    
    
    @SerializedName("brand")
    var brand: ArrayList<Int>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("store")
    var store: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryExportResponse
*/
@Parcelize
data class InventoryExportResponse(
    
    
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("task_id")
    var taskId: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("filters")
    var filters: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("seller_id")
    var sellerId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryExportQuantityFilter
*/
@Parcelize
data class InventoryExportQuantityFilter(
    
    
    
    @SerializedName("operators")
    var operators: String?=null,
    
    @SerializedName("max")
    var max: Int?=null,
    
    @SerializedName("min")
    var min: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryExportAdvanceOption
*/
@Parcelize
data class InventoryExportAdvanceOption(
    
    
    
    @SerializedName("quantity")
    var quantity: InventoryExportQuantityFilter?=null,
    
    @SerializedName("from_date")
    var fromDate: String?=null,
    
    @SerializedName("to_date")
    var toDate: String?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("brand_ids")
    var brandIds: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryExportJob
*/
@Parcelize
data class InventoryExportJob(
    
    
    
    @SerializedName("completed_on")
    var completedOn: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("task_id")
    var taskId: String?=null,
    
    @SerializedName("filters")
    var filters: InventoryExportAdvanceOption?=null,
    
    @SerializedName("seller_id")
    var sellerId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryExportFilter
*/
@Parcelize
data class InventoryExportFilter(
    
    
    
    @SerializedName("quantity")
    var quantity: InventoryExportQuantityFilter?=null,
    
    @SerializedName("from_date")
    var fromDate: String?=null,
    
    @SerializedName("to_date")
    var toDate: String?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("brand_ids")
    var brandIds: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryCreateRequest
*/
@Parcelize
data class InventoryCreateRequest(
    
    
    
    @SerializedName("data")
    var data: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("filters")
    var filters: InventoryExportFilter?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryJobFilters
*/
@Parcelize
data class InventoryJobFilters(
    
    
    
    @SerializedName("stores")
    var stores: ArrayList<String>?=null,
    
    @SerializedName("quantity")
    var quantity: InventoryExportQuantityFilter?=null,
    
    @SerializedName("from_date")
    var fromDate: String?=null,
    
    @SerializedName("to_date")
    var toDate: String?=null,
    
    @SerializedName("brands")
    var brands: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryJobDetailResponse
*/
@Parcelize
data class InventoryJobDetailResponse(
    
    
    
    @SerializedName("completed_on")
    var completedOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: UserDetail?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("cancelled_on")
    var cancelledOn: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("task_id")
    var taskId: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("filters")
    var filters: InventoryJobFilters?=null,
    
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    
    @SerializedName("cancelled_by")
    var cancelledBy: UserDetail?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryExportJobListResponse
*/
@Parcelize
data class InventoryExportJobListResponse(
    
    
    
    @SerializedName("items")
    var items: InventoryJobDetailResponse?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: FilerList
*/
@Parcelize
data class FilerList(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("display")
    var display: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryConfig
*/
@Parcelize
data class InventoryConfig(
    
    
    
    @SerializedName("data")
    var data: ArrayList<FilerList>?=null,
    
    @SerializedName("multivalues")
    var multivalues: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryPayload
*/
@Parcelize
data class InventoryPayload(
    
    
    
    @SerializedName("trace_id")
    var traceId: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("total_quantity")
    var totalQuantity: Int?=null,
    
    @SerializedName("expiration_date")
    var expirationDate: String?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryRequestSchemaV2
*/
@Parcelize
data class InventoryRequestSchemaV2(
    
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("payload")
    var payload: ArrayList<InventoryPayload>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryFailedReason
*/
@Parcelize
data class InventoryFailedReason(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("errors")
    var errors: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryResponseItem
*/
@Parcelize
data class InventoryResponseItem(
    
    
    
    @SerializedName("data")
    var data: InventoryPayload?=null,
    
    @SerializedName("reason")
    var reason: InventoryFailedReason?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryUpdateResponse
*/
@Parcelize
data class InventoryUpdateResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<InventoryResponseItem>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: HsnUpsert
*/
@Parcelize
data class HsnUpsert(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("hs2_code")
    var hs2Code: String?=null,
    
    @SerializedName("tax_on_esp")
    var taxOnEsp: Boolean?=null,
    
    @SerializedName("tax_on_mrp")
    var taxOnMrp: Boolean?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("tax1")
    var tax1: Double?=null,
    
    @SerializedName("tax2")
    var tax2: Double?=null,
    
    @SerializedName("threshold2")
    var threshold2: Double?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("threshold1")
    var threshold1: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: HsnCodesObject
*/
@Parcelize
data class HsnCodesObject(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("hs2_code")
    var hs2Code: String?=null,
    
    @SerializedName("tax_on_esp")
    var taxOnEsp: Boolean?=null,
    
    @SerializedName("tax_on_mrp")
    var taxOnMrp: Boolean?=null,
    
    @SerializedName("tax1")
    var tax1: Double?=null,
    
    @SerializedName("tax2")
    var tax2: Double?=null,
    
    @SerializedName("threshold2")
    var threshold2: Double?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("threshold1")
    var threshold1: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: HsnCode
*/
@Parcelize
data class HsnCode(
    
    
    
    @SerializedName("data")
    var data: HsnCodesObject?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: BulkHsnUpsert
*/
@Parcelize
data class BulkHsnUpsert(
    
    
    
    @SerializedName("data")
    var data: ArrayList<HsnUpsert>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: BulkHsnResponse
*/
@Parcelize
data class BulkHsnResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PageResponse
*/
@Parcelize
data class PageResponse(
    
    
    
    @SerializedName("current")
    var current: String?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TaxSlab
*/
@Parcelize
data class TaxSlab(
    
    
    
    @SerializedName("threshold")
    var threshold: Double?=null,
    
    @SerializedName("rate")
    var rate: Double?=null,
    
    @SerializedName("effective_date")
    var effectiveDate: String?=null,
    
    @SerializedName("cess")
    var cess: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: HSNDataInsertV2
*/
@Parcelize
data class HSNDataInsertV2(
    
    
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("taxes")
    var taxes: ArrayList<TaxSlab>?=null,
    
    @SerializedName("hsn_code_id")
    var hsnCodeId: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("reporting_hsn")
    var reportingHsn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: HsnCodesListingResponseSchemaV2
*/
@Parcelize
data class HsnCodesListingResponseSchemaV2(
    
    
    
    @SerializedName("page")
    var page: PageResponse?=null,
    
    @SerializedName("items")
    var items: ArrayList<HSNDataInsertV2>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BrandItem
*/
@Parcelize
data class BrandItem(
    
    
    
    @SerializedName("departments")
    var departments: ArrayList<String>?=null,
    
    @SerializedName("logo")
    var logo: Media?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("action")
    var action: Action?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BrandListingResponse
*/
@Parcelize
data class BrandListingResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<BrandItem>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Department
*/
@Parcelize
data class Department(
    
    
    
    @SerializedName("logo")
    var logo: Media?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("priority_order")
    var priorityOrder: Int?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DepartmentResponse
*/
@Parcelize
data class DepartmentResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<Department>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ThirdLevelChild
*/
@Parcelize
data class ThirdLevelChild(
    
    
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("childs")
    var childs: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("action")
    var action: Action?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SecondLevelChild
*/
@Parcelize
data class SecondLevelChild(
    
    
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("childs")
    var childs: ArrayList<ThirdLevelChild>?=null,
    
    @SerializedName("action")
    var action: Action?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Child
*/
@Parcelize
data class Child(
    
    
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("childs")
    var childs: ArrayList<SecondLevelChild>?=null,
    
    @SerializedName("action")
    var action: Action?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CategoryItems
*/
@Parcelize
data class CategoryItems(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("childs")
    var childs: ArrayList<Child>?=null,
    
    @SerializedName("action")
    var action: Action?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DepartmentCategoryTree
*/
@Parcelize
data class DepartmentCategoryTree(
    
    
    
    @SerializedName("items")
    var items: ArrayList<CategoryItems>?=null,
    
    @SerializedName("department")
    var department: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DepartmentIdentifier
*/
@Parcelize
data class DepartmentIdentifier(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CategoryListingResponse
*/
@Parcelize
data class CategoryListingResponse(
    
    
    
    @SerializedName("data")
    var data: ArrayList<DepartmentCategoryTree>?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<DepartmentIdentifier>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationProductListingResponse
*/
@Parcelize
data class ApplicationProductListingResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<ProductListingDetail>?=null,
    
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSortOn>?=null,
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("operators")
    var operators: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("filters")
    var filters: ArrayList<ProductFilters>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductDetail
*/
@Parcelize
data class ProductDetail(
    
    
    
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    
    @SerializedName("brand")
    var brand: ProductBrand?=null,
    
    @SerializedName("similars")
    var similars: ArrayList<String>?=null,
    
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("image_nature")
    var imageNature: String?=null,
    
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("rating_count")
    var ratingCount: Int?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("medias")
    var medias: ArrayList<Media1>?=null,
    
    @SerializedName("promo_meta")
    var promoMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("rating")
    var rating: Double?=null,
    
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null,
    
    @SerializedName("grouped_attributes")
    var groupedAttributes: ArrayList<ProductDetailGroupedAttribute>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryPage
*/
@Parcelize
data class InventoryPage(
    
    
    
    @SerializedName("next_id")
    var nextId: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryStockResponse
*/
@Parcelize
data class InventoryStockResponse(
    
    
    
    @SerializedName("page")
    var page: InventoryPage?=null,
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleQuery
*/
@Parcelize
data class ArticleQuery(
    
    
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("ignored_stores")
    var ignoredStores: ArrayList<Int>?=null,
    
    @SerializedName("size")
    var size: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleAssignment
*/
@Parcelize
data class ArticleAssignment(
    
    
    
    @SerializedName("level")
    var level: String?=null,
    
    @SerializedName("strategy")
    var strategy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AssignStoreArticle
*/
@Parcelize
data class AssignStoreArticle(
    
    
    
    @SerializedName("query")
    var query: ArticleQuery?=null,
    
    @SerializedName("group_id")
    var groupId: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: ArticleAssignment?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AssignStore
*/
@Parcelize
data class AssignStore(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("channel_identifier")
    var channelIdentifier: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<AssignStoreArticle>?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("channel_type")
    var channelType: String?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreAssignError
*/
@Parcelize
data class StoreAssignError(
    
    
    
    @SerializedName("value")
    var value: @RawValue Any?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleAssignment1
*/
@Parcelize
data class ArticleAssignment1(
    
    
    
    @SerializedName("level")
    var level: String?=null,
    
    @SerializedName("strategy")
    var strategy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StoreAssign
*/
@Parcelize
data class StoreAssign(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("index")
    var index: Int?=null,
    
    @SerializedName("store_pincode")
    var storePincode: Int?=null,
    
    @SerializedName("group_id")
    var groupId: String?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("strategy_wise_listing")
    var strategyWiseListing: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: ArticleAssignment1?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Int?=null,
    
    @SerializedName("s_city")
    var sCity: String?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreAssignResponse
*/
@Parcelize
data class StoreAssignResponse(
    
    
    
    @SerializedName("error")
    var error: StoreAssignError?=null,
    
    @SerializedName("items")
    var items: ArrayList<StoreAssign>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SellerPhoneNumber
*/
@Parcelize
data class SellerPhoneNumber(
    
    
    
    @SerializedName("country_code")
    var countryCode: Int?=null,
    
    @SerializedName("number")
    var number: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: LocationManagerSerializer
*/
@Parcelize
data class LocationManagerSerializer(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("mobile_no")
    var mobileNo: SellerPhoneNumber?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserSerializer1
*/
@Parcelize
data class UserSerializer1(
    
    
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("contact")
    var contact: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Document
*/
@Parcelize
data class Document(
    
    
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("legal_name")
    var legalName: String?=null,
    
    @SerializedName("verified")
    var verified: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LocationTimingSerializer
*/
@Parcelize
data class LocationTimingSerializer(
    
    
    
    @SerializedName("hour")
    var hour: Int?=null,
    
    @SerializedName("minute")
    var minute: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: LocationDayWiseSerializer
*/
@Parcelize
data class LocationDayWiseSerializer(
    
    
    
    @SerializedName("open")
    var open: Boolean?=null,
    
    @SerializedName("opening")
    var opening: LocationTimingSerializer?=null,
    
    @SerializedName("closing")
    var closing: LocationTimingSerializer?=null,
    
    @SerializedName("weekday")
    var weekday: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductReturnConfigSerializer
*/
@Parcelize
data class ProductReturnConfigSerializer(
    
    
    
    @SerializedName("store_uid")
    var storeUid: Int?=null,
    
    @SerializedName("on_same_store")
    var onSameStore: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetAddressSerializer
*/
@Parcelize
data class GetAddressSerializer(
    
    
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("country")
    var country: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LocationIntegrationType
*/
@Parcelize
data class LocationIntegrationType(
    
    
    
    @SerializedName("inventory")
    var inventory: String?=null,
    
    @SerializedName("order")
    var order: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InvoiceCredSerializer
*/
@Parcelize
data class InvoiceCredSerializer(
    
    
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("password")
    var password: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InvoiceDetailsSerializer
*/
@Parcelize
data class InvoiceDetailsSerializer(
    
    
    
    @SerializedName("e_waybill")
    var eWaybill: InvoiceCredSerializer?=null,
    
    @SerializedName("e_invoice")
    var eInvoice: InvoiceCredSerializer?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UserSerializer2
*/
@Parcelize
data class UserSerializer2(
    
    
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("contact")
    var contact: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetCompanySerializer
*/
@Parcelize
data class GetCompanySerializer(
    
    
    
    @SerializedName("created_by")
    var createdBy: UserSerializer2?=null,
    
    @SerializedName("business_type")
    var businessType: String?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer2?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer2?=null,
    
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("company_type")
    var companyType: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("addresses")
    var addresses: ArrayList<GetAddressSerializer>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetLocationSerializer
*/
@Parcelize
data class GetLocationSerializer(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("manager")
    var manager: LocationManagerSerializer?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer1?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    
    @SerializedName("timing")
    var timing: ArrayList<LocationDayWiseSerializer>?=null,
    
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<SellerPhoneNumber>?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("product_return_config")
    var productReturnConfig: ProductReturnConfigSerializer?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer1?=null,
    
    @SerializedName("address")
    var address: GetAddressSerializer?=null,
    
    @SerializedName("integration_type")
    var integrationType: LocationIntegrationType?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer1?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("gst_credentials")
    var gstCredentials: InvoiceDetailsSerializer?=null,
    
    @SerializedName("store_type")
    var storeType: String?=null,
    
    @SerializedName("company")
    var company: GetCompanySerializer?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LocationListSerializer
*/
@Parcelize
data class LocationListSerializer(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<GetLocationSerializer>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationBrandJson
*/
@Parcelize
data class ApplicationBrandJson(
    
    
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ApplicationCategoryJson
*/
@Parcelize
data class ApplicationCategoryJson(
    
    
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ApplicationDepartment
*/
@Parcelize
data class ApplicationDepartment(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationDepartmentListingResponse
*/
@Parcelize
data class ApplicationDepartmentListingResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<ApplicationDepartment>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationDepartmentJson
*/
@Parcelize
data class ApplicationDepartmentJson(
    
    
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ApplicationStoreJson
*/
@Parcelize
data class ApplicationStoreJson(
    
    
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}



