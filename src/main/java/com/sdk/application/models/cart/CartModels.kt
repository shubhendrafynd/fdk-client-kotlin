package com.sdk.application.models.cart

import com.sdk.application.*


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: CartCurrency
*/
@Parcelize
data class CartCurrency(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("symbol")
    var symbol: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentSelectionLock
*/
@Parcelize
data class PaymentSelectionLock(
    
    
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("default_options")
    var defaultOptions: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductAvailability
*/
@Parcelize
data class ProductAvailability(
    
    
    
    @SerializedName("sizes")
    var sizes: ArrayList<String>?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("deliverable")
    var deliverable: Boolean?=null,
    
    @SerializedName("other_store_quantity")
    var otherStoreQuantity: Int?=null,
    
    @SerializedName("out_of_stock")
    var outOfStock: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductImage
*/
@Parcelize
data class ProductImage(
    
    
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("secure_url")
    var secureUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BaseInfo
*/
@Parcelize
data class BaseInfo(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CategoryInfo
*/
@Parcelize
data class CategoryInfo(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ActionQuery
*/
@Parcelize
data class ActionQuery(
    
    
    
    @SerializedName("product_slug")
    var productSlug: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ProductAction
*/
@Parcelize
data class ProductAction(
    
    
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("query")
    var query: ActionQuery?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartProduct
*/
@Parcelize
data class CartProduct(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("images")
    var images: ArrayList<ProductImage>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("brand")
    var brand: BaseInfo?=null,
    
    @SerializedName("categories")
    var categories: ArrayList<CategoryInfo>?=null,
    
    @SerializedName("action")
    var action: ProductAction?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductPrice
*/
@Parcelize
data class ProductPrice(
    
    
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("effective")
    var effective: Double?=null,
    
    @SerializedName("marked")
    var marked: Double?=null,
    
    @SerializedName("selling")
    var selling: Double?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("add_on")
    var addOn: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductPriceInfo
*/
@Parcelize
data class ProductPriceInfo(
    
    
    
    @SerializedName("converted")
    var converted: ProductPrice?=null,
    
    @SerializedName("base")
    var base: ProductPrice?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BasePrice
*/
@Parcelize
data class BasePrice(
    
    
    
    @SerializedName("marked")
    var marked: Double?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("effective")
    var effective: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ArticlePriceInfo
*/
@Parcelize
data class ArticlePriceInfo(
    
    
    
    @SerializedName("converted")
    var converted: BasePrice?=null,
    
    @SerializedName("base")
    var base: BasePrice?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductArticle
*/
@Parcelize
data class ProductArticle(
    
    
    
    @SerializedName("store")
    var store: BaseInfo?=null,
    
    @SerializedName("product_group_tags")
    var productGroupTags: ArrayList<String>?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("price")
    var price: ArticlePriceInfo?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("seller")
    var seller: BaseInfo?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartProductIdentifer
*/
@Parcelize
data class CartProductIdentifer(
    
    
    
    @SerializedName("identifier")
    var identifier: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PromoMeta
*/
@Parcelize
data class PromoMeta(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: Ownership
*/
@Parcelize
data class Ownership(
    
    
    
    @SerializedName("payable_by")
    var payableBy: String?=null,
    
    @SerializedName("payable_category")
    var payableCategory: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AppliedPromotion
*/
@Parcelize
data class AppliedPromotion(
    
    
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("mrp_promotion")
    var mrpPromotion: Boolean?=null,
    
    @SerializedName("promo_id")
    var promoId: String?=null,
    
    @SerializedName("offer_text")
    var offerText: String?=null,
    
    @SerializedName("promotion_type")
    var promotionType: String?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership?=null,
    
    @SerializedName("article_quantity")
    var articleQuantity: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartProductInfo
*/
@Parcelize
data class CartProductInfo(
    
    
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("coupon_message")
    var couponMessage: String?=null,
    
    @SerializedName("availability")
    var availability: ProductAvailability?=null,
    
    @SerializedName("product")
    var product: CartProduct?=null,
    
    @SerializedName("price_per_unit")
    var pricePerUnit: ProductPriceInfo?=null,
    
    @SerializedName("article")
    var article: ProductArticle?=null,
    
    @SerializedName("price")
    var price: ProductPriceInfo?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("bulk_offer")
    var bulkOffer: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("identifiers")
    var identifiers: CartProductIdentifer?=null,
    
    @SerializedName("promo_meta")
    var promoMeta: PromoMeta?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("promotions_applied")
    var promotionsApplied: ArrayList<AppliedPromotion>?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("key")
    var key: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromiseFormatted
*/
@Parcelize
data class PromiseFormatted(
    
    
    
    @SerializedName("max")
    var max: String?=null,
    
    @SerializedName("min")
    var min: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PromiseTimestamp
*/
@Parcelize
data class PromiseTimestamp(
    
    
    
    @SerializedName("max")
    var max: Double?=null,
    
    @SerializedName("min")
    var min: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentPromise
*/
@Parcelize
data class ShipmentPromise(
    
    
    
    @SerializedName("formatted")
    var formatted: PromiseFormatted?=null,
    
    @SerializedName("timestamp")
    var timestamp: PromiseTimestamp?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RawBreakup
*/
@Parcelize
data class RawBreakup(
    
    
    
    @SerializedName("convenience_fee")
    var convenienceFee: Double?=null,
    
    @SerializedName("coupon")
    var coupon: Double?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("cod_charge")
    var codCharge: Double?=null,
    
    @SerializedName("mrp_total")
    var mrpTotal: Double?=null,
    
    @SerializedName("gst_charges")
    var gstCharges: Double?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    
    @SerializedName("you_saved")
    var youSaved: Double?=null,
    
    @SerializedName("vog")
    var vog: Double?=null,
    
    @SerializedName("subtotal")
    var subtotal: Double?=null,
    
    @SerializedName("total")
    var total: Double?=null,
    
    @SerializedName("fynd_cash")
    var fyndCash: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LoyaltyPoints
*/
@Parcelize
data class LoyaltyPoints(
    
    
    
    @SerializedName("total")
    var total: Double?=null,
    
    @SerializedName("applicable")
    var applicable: Double?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DisplayBreakup
*/
@Parcelize
data class DisplayBreakup(
    
    
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("message")
    var message: ArrayList<String>?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("key")
    var key: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponBreakup
*/
@Parcelize
data class CouponBreakup(
    
    
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartBreakup
*/
@Parcelize
data class CartBreakup(
    
    
    
    @SerializedName("raw")
    var raw: RawBreakup?=null,
    
    @SerializedName("loyalty_points")
    var loyaltyPoints: LoyaltyPoints?=null,
    
    @SerializedName("display")
    var display: ArrayList<DisplayBreakup>?=null,
    
    @SerializedName("coupon")
    var coupon: CouponBreakup?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartDetailResponse
*/
@Parcelize
data class CartDetailResponse(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: PaymentSelectionLock?=null,
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AddProductCart
*/
@Parcelize
data class AddProductCart(
    
    
    
    @SerializedName("product_group_tags")
    var productGroupTags: ArrayList<String>?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_size")
    var itemSize: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("pos")
    var pos: Boolean?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AddCartRequest
*/
@Parcelize
data class AddCartRequest(
    
    
    
    @SerializedName("items")
    var items: ArrayList<AddProductCart>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: AddCartDetailResponse
*/
@Parcelize
data class AddCartDetailResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("partial")
    var partial: Boolean?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("cart")
    var cart: CartDetailResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateProductCart
*/
@Parcelize
data class UpdateProductCart(
    
    
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_size")
    var itemSize: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("identifiers")
    var identifiers: CartProductIdentifer?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("item_index")
    var itemIndex: Int?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateCartRequest
*/
@Parcelize
data class UpdateCartRequest(
    
    
    
    @SerializedName("items")
    var items: ArrayList<UpdateProductCart>?=null,
    
    @SerializedName("operation")
    var operation: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateCartDetailResponse
*/
@Parcelize
data class UpdateCartDetailResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("cart")
    var cart: CartDetailResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartItemCountResponse
*/
@Parcelize
data class CartItemCountResponse(
    
    
    
    @SerializedName("user_cart_items_count")
    var userCartItemsCount: Int?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PageCoupon
*/
@Parcelize
data class PageCoupon(
    
    
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("total_item_count")
    var totalItemCount: Int?=null,
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("total")
    var total: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Coupon
*/
@Parcelize
data class Coupon(
    
    
    
    @SerializedName("max_discount_value")
    var maxDiscountValue: Double?=null,
    
    @SerializedName("minimum_cart_value")
    var minimumCartValue: Double?=null,
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("coupon_code")
    var couponCode: String?=null,
    
    @SerializedName("sub_title")
    var subTitle: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("expires_on")
    var expiresOn: String?=null,
    
    @SerializedName("is_applicable")
    var isApplicable: Boolean?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetCouponResponse
*/
@Parcelize
data class GetCouponResponse(
    
    
    
    @SerializedName("page")
    var page: PageCoupon?=null,
    
    @SerializedName("available_coupon_list")
    var availableCouponList: ArrayList<Coupon>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ApplyCouponRequest
*/
@Parcelize
data class ApplyCouponRequest(
    
    
    
    @SerializedName("coupon_code")
    var couponCode: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: OfferPrice
*/
@Parcelize
data class OfferPrice(
    
    
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("effective")
    var effective: Int?=null,
    
    @SerializedName("marked")
    var marked: Int?=null,
    
    @SerializedName("bulk_effective")
    var bulkEffective: Double?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OfferItem
*/
@Parcelize
data class OfferItem(
    
    
    
    @SerializedName("best")
    var best: Boolean?=null,
    
    @SerializedName("price")
    var price: OfferPrice?=null,
    
    @SerializedName("margin")
    var margin: Int?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("total")
    var total: Double?=null,
    
    @SerializedName("auto_applied")
    var autoApplied: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OfferSeller
*/
@Parcelize
data class OfferSeller(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BulkPriceOffer
*/
@Parcelize
data class BulkPriceOffer(
    
    
    
    @SerializedName("offers")
    var offers: ArrayList<OfferItem>?=null,
    
    @SerializedName("seller")
    var seller: OfferSeller?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BulkPriceResponse
*/
@Parcelize
data class BulkPriceResponse(
    
    
    
    @SerializedName("data")
    var data: ArrayList<BulkPriceOffer>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: RewardPointRequest
*/
@Parcelize
data class RewardPointRequest(
    
    
    
    @SerializedName("points")
    var points: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GeoLocation
*/
@Parcelize
data class GeoLocation(
    
    
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Address
*/
@Parcelize
data class Address(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("geo_location")
    var geoLocation: GeoLocation?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("area_code")
    var areaCode: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("google_map_point")
    var googleMapPoint: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("area_code_slug")
    var areaCodeSlug: String?=null,
    
    @SerializedName("country_iso_code")
    var countryIsoCode: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("country_phone_code")
    var countryPhoneCode: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetAddressesResponse
*/
@Parcelize
data class GetAddressesResponse(
    
    
    
    @SerializedName("address")
    var address: ArrayList<Address>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: SaveAddressResponse
*/
@Parcelize
data class SaveAddressResponse(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateAddressResponse
*/
@Parcelize
data class UpdateAddressResponse(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("is_updated")
    var isUpdated: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DeleteAddressResponse
*/
@Parcelize
data class DeleteAddressResponse(
    
    
    
    @SerializedName("is_deleted")
    var isDeleted: Boolean?=null,
    
    @SerializedName("id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SelectCartAddressRequest
*/
@Parcelize
data class SelectCartAddressRequest(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("billing_address_id")
    var billingAddressId: String?=null,
    
    @SerializedName("cart_id")
    var cartId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateCartPaymentRequest
*/
@Parcelize
data class UpdateCartPaymentRequest(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("address_id")
    var addressId: String?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponValidity
*/
@Parcelize
data class CouponValidity(
    
    
    
    @SerializedName("valid")
    var valid: Boolean?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("display_message_en")
    var displayMessageEn: String?=null,
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentCouponValidate
*/
@Parcelize
data class PaymentCouponValidate(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("coupon_validity")
    var couponValidity: CouponValidity?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentResponse
*/
@Parcelize
data class ShipmentResponse(
    
    
    
    @SerializedName("fulfillment_type")
    var fulfillmentType: String?=null,
    
    @SerializedName("dp_options")
    var dpOptions: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("shipment_type")
    var shipmentType: String?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("promise")
    var promise: ShipmentPromise?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("box_type")
    var boxType: String?=null,
    
    @SerializedName("dp_id")
    var dpId: String?=null,
    
    @SerializedName("shipments")
    var shipments: Int?=null,
    
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartShipmentsResponse
*/
@Parcelize
data class CartShipmentsResponse(
    
    
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: PaymentSelectionLock?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("shipments")
    var shipments: ArrayList<ShipmentResponse>?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("error")
    var error: Boolean?=null,
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("cart_id")
    var cartId: Int?=null,
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StaffCheckout
*/
@Parcelize
data class StaffCheckout(
    
    
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("employee_code")
    var employeeCode: String?=null,
    
    @SerializedName("user")
    var user: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartCheckoutCustomMeta
*/
@Parcelize
data class CartCheckoutCustomMeta(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("key")
    var key: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CartCheckoutDetailRequest
*/
@Parcelize
data class CartCheckoutDetailRequest(
    
    
    
    @SerializedName("delivery_address")
    var deliveryAddress: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("staff")
    var staff: StaffCheckout?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("ordering_store")
    var orderingStore: Int?=null,
    
    @SerializedName("payment_params")
    var paymentParams: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("address_id")
    var addressId: String?=null,
    
    @SerializedName("billing_address_id")
    var billingAddressId: String?=null,
    
    @SerializedName("custom_meta")
    var customMeta: ArrayList<CartCheckoutCustomMeta>?=null,
    
    @SerializedName("billing_address")
    var billingAddress: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("payment_auto_confirm")
    var paymentAutoConfirm: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CheckCart
*/
@Parcelize
data class CheckCart(
    
    
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("error_message")
    var errorMessage: String?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: PaymentSelectionLock?=null,
    
    @SerializedName("cod_available")
    var codAvailable: Boolean?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Int?=null,
    
    @SerializedName("store_emps")
    var storeEmps: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("cod_message")
    var codMessage: String?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: Int?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("user_type")
    var userType: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("delivery_charge_order_value")
    var deliveryChargeOrderValue: Int?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("cart_id")
    var cartId: Int?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartCheckoutResponse
*/
@Parcelize
data class CartCheckoutResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("app_intercept_url")
    var appInterceptUrl: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("payment_confirm_url")
    var paymentConfirmUrl: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cart")
    var cart: CheckCart?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartMetaRequest
*/
@Parcelize
data class CartMetaRequest(
    
    
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("pick_up_customer_details")
    var pickUpCustomerDetails: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartMetaResponse
*/
@Parcelize
data class CartMetaResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CartMetaMissingResponse
*/
@Parcelize
data class CartMetaMissingResponse(
    
    
    
    @SerializedName("errors")
    var errors: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GetShareCartLinkRequest
*/
@Parcelize
data class GetShareCartLinkRequest(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetShareCartLinkResponse
*/
@Parcelize
data class GetShareCartLinkResponse(
    
    
    
    @SerializedName("token")
    var token: String?=null,
    
    @SerializedName("share_url")
    var shareUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SharedCartDetails
*/
@Parcelize
data class SharedCartDetails(
    
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("token")
    var token: String?=null,
    
    @SerializedName("user")
    var user: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("source")
    var source: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SharedCart
*/
@Parcelize
data class SharedCart(
    
    
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: PaymentSelectionLock?=null,
    
    @SerializedName("shared_cart_details")
    var sharedCartDetails: SharedCartDetails?=null,
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("cart_id")
    var cartId: Int?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SharedCartResponse
*/
@Parcelize
data class SharedCartResponse(
    
    
    
    @SerializedName("error")
    var error: String?=null,
    
    @SerializedName("cart")
    var cart: SharedCart?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionOffer
*/
@Parcelize
data class PromotionOffer(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("offer_text")
    var offerText: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("promotion_group")
    var promotionGroup: String?=null,
    
    @SerializedName("valid_till")
    var validTill: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionOffersResponse
*/
@Parcelize
data class PromotionOffersResponse(
    
    
    
    @SerializedName("available_promotions")
    var availablePromotions: ArrayList<PromotionOffer>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: OperationErrorResponse
*/
@Parcelize
data class OperationErrorResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CurrencyInfo
*/
@Parcelize
data class CurrencyInfo(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("symbol")
    var symbol: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: LadderPrice
*/
@Parcelize
data class LadderPrice(
    
    
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("effective")
    var effective: Int?=null,
    
    @SerializedName("marked")
    var marked: Int?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("offer_price")
    var offerPrice: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LadderOfferItem
*/
@Parcelize
data class LadderOfferItem(
    
    
    
    @SerializedName("max_quantity")
    var maxQuantity: Int?=null,
    
    @SerializedName("price")
    var price: LadderPrice?=null,
    
    @SerializedName("margin")
    var margin: Int?=null,
    
    @SerializedName("min_quantity")
    var minQuantity: Int?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LadderPriceOffer
*/
@Parcelize
data class LadderPriceOffer(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("offer_prices")
    var offerPrices: ArrayList<LadderOfferItem>?=null,
    
    @SerializedName("offer_text")
    var offerText: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("promotion_group")
    var promotionGroup: String?=null,
    
    @SerializedName("valid_till")
    var validTill: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LadderPriceOffers
*/
@Parcelize
data class LadderPriceOffers(
    
    
    
    @SerializedName("currency")
    var currency: CurrencyInfo?=null,
    
    @SerializedName("available_offers")
    var availableOffers: ArrayList<LadderPriceOffer>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



