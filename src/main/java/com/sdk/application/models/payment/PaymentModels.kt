package com.sdk.application.models.payment

import com.sdk.application.*


import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: AggregatorConfigDetail
*/
@Parcelize
data class AggregatorConfigDetail(
    
    
    
    @SerializedName("api")
    var api: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("merchant_id")
    var merchantId: String?=null,
    
    @SerializedName("pin")
    var pin: String?=null,
    
    @SerializedName("verify_api")
    var verifyApi: String?=null,
    
    @SerializedName("merchant_key")
    var merchantKey: String?=null,
    
    @SerializedName("sdk")
    var sdk: Boolean?=null,
    
    @SerializedName("config_type")
    var configType: String?=null,
    
    @SerializedName("secret")
    var secret: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AggregatorsConfigDetailResponse
*/
@Parcelize
data class AggregatorsConfigDetailResponse(
    
    
    
    @SerializedName("razorpay")
    var razorpay: AggregatorConfigDetail?=null,
    
    @SerializedName("env")
    var env: String?=null,
    
    @SerializedName("simpl")
    var simpl: AggregatorConfigDetail?=null,
    
    @SerializedName("mswipe")
    var mswipe: AggregatorConfigDetail?=null,
    
    @SerializedName("rupifi")
    var rupifi: AggregatorConfigDetail?=null,
    
    @SerializedName("juspay")
    var juspay: AggregatorConfigDetail?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("ccavenue")
    var ccavenue: AggregatorConfigDetail?=null,
    
    @SerializedName("stripe")
    var stripe: AggregatorConfigDetail?=null,
    
    @SerializedName("payumoney")
    var payumoney: AggregatorConfigDetail?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorCodeAndDescription
*/
@Parcelize
data class ErrorCodeAndDescription(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: HttpErrorCodeAndResponse
*/
@Parcelize
data class HttpErrorCodeAndResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: ErrorCodeAndDescription?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AttachCardRequest
*/
@Parcelize
data class AttachCardRequest(
    
    
    
    @SerializedName("name_on_card")
    var nameOnCard: String?=null,
    
    @SerializedName("card_id")
    var cardId: String?=null,
    
    @SerializedName("refresh")
    var refresh: Boolean?=null,
    
    @SerializedName("nickname")
    var nickname: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AttachCardsResponse
*/
@Parcelize
data class AttachCardsResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CardPaymentGateway
*/
@Parcelize
data class CardPaymentGateway(
    
    
    
    @SerializedName("api")
    var api: String?=null,
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ActiveCardPaymentGatewayResponse
*/
@Parcelize
data class ActiveCardPaymentGatewayResponse(
    
    
    
    @SerializedName("cards")
    var cards: CardPaymentGateway?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Card
*/
@Parcelize
data class Card(
    
    
    
    @SerializedName("card_number")
    var cardNumber: String?=null,
    
    @SerializedName("card_id")
    var cardId: String?=null,
    
    @SerializedName("card_issuer")
    var cardIssuer: String?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("exp_month")
    var expMonth: Int?=null,
    
    @SerializedName("nickname")
    var nickname: String?=null,
    
    @SerializedName("card_brand_image")
    var cardBrandImage: String?=null,
    
    @SerializedName("compliant_with_tokenisation_guidelines")
    var compliantWithTokenisationGuidelines: Boolean?=null,
    
    @SerializedName("card_name")
    var cardName: String?=null,
    
    @SerializedName("card_fingerprint")
    var cardFingerprint: String?=null,
    
    @SerializedName("card_reference")
    var cardReference: String?=null,
    
    @SerializedName("card_token")
    var cardToken: String?=null,
    
    @SerializedName("card_type")
    var cardType: String?=null,
    
    @SerializedName("expired")
    var expired: Boolean?=null,
    
    @SerializedName("card_brand")
    var cardBrand: String?=null,
    
    @SerializedName("exp_year")
    var expYear: Int?=null,
    
    @SerializedName("card_isin")
    var cardIsin: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ListCardsResponse
*/
@Parcelize
data class ListCardsResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("data")
    var data: ArrayList<Card>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DeletehCardRequest
*/
@Parcelize
data class DeletehCardRequest(
    
    
    
    @SerializedName("card_id")
    var cardId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DeleteCardsResponse
*/
@Parcelize
data class DeleteCardsResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ValidateCustomerRequest
*/
@Parcelize
data class ValidateCustomerRequest(
    
    
    
    @SerializedName("merchant_params")
    var merchantParams: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    
    @SerializedName("transaction_amount_in_paise")
    var transactionAmountInPaise: Int?=null,
    
    @SerializedName("order_items")
    var orderItems: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("billing_address")
    var billingAddress: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("delivery_address")
    var deliveryAddress: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payload")
    var payload: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ValidateCustomerResponse
*/
@Parcelize
data class ValidateCustomerResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ChargeCustomerRequest
*/
@Parcelize
data class ChargeCustomerRequest(
    
    
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("transaction_token")
    var transactionToken: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ChargeCustomerResponse
*/
@Parcelize
data class ChargeCustomerResponse(
    
    
    
    @SerializedName("delivery_address_id")
    var deliveryAddressId: String?=null,
    
    @SerializedName("cart_id")
    var cartId: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentInitializationRequest
*/
@Parcelize
data class PaymentInitializationRequest(
    
    
    
    @SerializedName("timeout")
    var timeout: Int?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("device_id")
    var deviceId: String?=null,
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("razorpay_payment_id")
    var razorpayPaymentId: String?=null,
    
    @SerializedName("vpa")
    var vpa: String?=null,
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentInitializationResponse
*/
@Parcelize
data class PaymentInitializationResponse(
    
    
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("timeout")
    var timeout: Int?=null,
    
    @SerializedName("virtual_id")
    var virtualId: String?=null,
    
    @SerializedName("bqr_image")
    var bqrImage: String?=null,
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("vpa")
    var vpa: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("upi_poll_url")
    var upiPollUrl: String?=null,
    
    @SerializedName("razorpay_payment_id")
    var razorpayPaymentId: String?=null,
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("aggregator_order_id")
    var aggregatorOrderId: String?=null,
    
    @SerializedName("payment_id")
    var paymentId: String?=null,
    
    @SerializedName("polling_url")
    var pollingUrl: String?=null,
    
    @SerializedName("device_id")
    var deviceId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentStatusUpdateRequest
*/
@Parcelize
data class PaymentStatusUpdateRequest(
    
    
    
    @SerializedName("merchant_transaction_id")
    var merchantTransactionId: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("payment_id")
    var paymentId: String?=null,
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("device_id")
    var deviceId: String?=null,
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("vpa")
    var vpa: String?=null,
    
    @SerializedName("razorpay_payment_id")
    var razorpayPaymentId: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentStatusUpdateResponse
*/
@Parcelize
data class PaymentStatusUpdateResponse(
    
    
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("retry")
    var retry: Boolean?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("redirect_url")
    var redirectUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: IntentAppErrorList
*/
@Parcelize
data class IntentAppErrorList(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("package_name")
    var packageName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentModeLogo
*/
@Parcelize
data class PaymentModeLogo(
    
    
    
    @SerializedName("large")
    var large: String?=null,
    
    @SerializedName("small")
    var small: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: IntentApp
*/
@Parcelize
data class IntentApp(
    
    
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("package_name")
    var packageName: String?=null,
    
    @SerializedName("logos")
    var logos: PaymentModeLogo?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentModeList
*/
@Parcelize
data class PaymentModeList(
    
    
    
    @SerializedName("nickname")
    var nickname: String?=null,
    
    @SerializedName("intent_flow")
    var intentFlow: Boolean?=null,
    
    @SerializedName("exp_month")
    var expMonth: Int?=null,
    
    @SerializedName("compliant_with_tokenisation_guidelines")
    var compliantWithTokenisationGuidelines: Boolean?=null,
    
    @SerializedName("intent_app_error_dict_list")
    var intentAppErrorDictList: ArrayList<IntentAppErrorList>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("card_brand")
    var cardBrand: String?=null,
    
    @SerializedName("exp_year")
    var expYear: Int?=null,
    
    @SerializedName("timeout")
    var timeout: Int?=null,
    
    @SerializedName("card_issuer")
    var cardIssuer: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("card_token")
    var cardToken: String?=null,
    
    @SerializedName("retry_count")
    var retryCount: Int?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("cod_limit")
    var codLimit: Double?=null,
    
    @SerializedName("remaining_limit")
    var remainingLimit: Double?=null,
    
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("intent_app")
    var intentApp: ArrayList<IntentApp>?=null,
    
    @SerializedName("card_name")
    var cardName: String?=null,
    
    @SerializedName("card_fingerprint")
    var cardFingerprint: String?=null,
    
    @SerializedName("card_reference")
    var cardReference: String?=null,
    
    @SerializedName("card_type")
    var cardType: String?=null,
    
    @SerializedName("expired")
    var expired: Boolean?=null,
    
    @SerializedName("cod_limit_per_order")
    var codLimitPerOrder: Double?=null,
    
    @SerializedName("fynd_vpa")
    var fyndVpa: String?=null,
    
    @SerializedName("card_number")
    var cardNumber: String?=null,
    
    @SerializedName("card_id")
    var cardId: String?=null,
    
    @SerializedName("logo_url")
    var logoUrl: PaymentModeLogo?=null,
    
    @SerializedName("intent_app_error_list")
    var intentAppErrorList: ArrayList<String>?=null,
    
    @SerializedName("card_brand_image")
    var cardBrandImage: String?=null,
    
    @SerializedName("card_isin")
    var cardIsin: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RootPaymentMode
*/
@Parcelize
data class RootPaymentMode(
    
    
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    
    @SerializedName("save_card")
    var saveCard: Boolean?=null,
    
    @SerializedName("is_pay_by_card_pl")
    var isPayByCardPl: Boolean?=null,
    
    @SerializedName("anonymous_enable")
    var anonymousEnable: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("list")
    var list: ArrayList<PaymentModeList>?=null,
    
    @SerializedName("add_card_enabled")
    var addCardEnabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AggregatorRoute
*/
@Parcelize
data class AggregatorRoute(
    
    
    
    @SerializedName("api_link")
    var apiLink: String?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_flow")
    var paymentFlow: String?=null,
    
    @SerializedName("payment_flow_data")
    var paymentFlowData: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentFlow
*/
@Parcelize
data class PaymentFlow(
    
    
    
    @SerializedName("razorpay")
    var razorpay: AggregatorRoute?=null,
    
    @SerializedName("jiopay")
    var jiopay: AggregatorRoute?=null,
    
    @SerializedName("bqr_razorpay")
    var bqrRazorpay: AggregatorRoute?=null,
    
    @SerializedName("payubiz")
    var payubiz: AggregatorRoute?=null,
    
    @SerializedName("epaylater")
    var epaylater: AggregatorRoute?=null,
    
    @SerializedName("simpl")
    var simpl: AggregatorRoute?=null,
    
    @SerializedName("mswipe")
    var mswipe: AggregatorRoute?=null,
    
    @SerializedName("fynd")
    var fynd: AggregatorRoute?=null,
    
    @SerializedName("juspay")
    var juspay: AggregatorRoute?=null,
    
    @SerializedName("rupifi")
    var rupifi: AggregatorRoute?=null,
    
    @SerializedName("ccavenue")
    var ccavenue: AggregatorRoute?=null,
    
    @SerializedName("stripe")
    var stripe: AggregatorRoute?=null,
    
    @SerializedName("upi_razorpay")
    var upiRazorpay: AggregatorRoute?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentOptionAndFlow
*/
@Parcelize
data class PaymentOptionAndFlow(
    
    
    
    @SerializedName("payment_option")
    var paymentOption: ArrayList<RootPaymentMode>?=null,
    
    @SerializedName("payment_flows")
    var paymentFlows: PaymentFlow?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentModeRouteResponse
*/
@Parcelize
data class PaymentModeRouteResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("payment_options")
    var paymentOptions: PaymentOptionAndFlow?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RupifiBannerData
*/
@Parcelize
data class RupifiBannerData(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("kyc_url")
    var kycUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RupifiBannerResponse
*/
@Parcelize
data class RupifiBannerResponse(
    
    
    
    @SerializedName("data")
    var data: RupifiBannerData?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EpaylaterBannerData
*/
@Parcelize
data class EpaylaterBannerData(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("display")
    var display: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EpaylaterBannerResponse
*/
@Parcelize
data class EpaylaterBannerResponse(
    
    
    
    @SerializedName("data")
    var data: EpaylaterBannerData?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ResendOrCancelPaymentRequest
*/
@Parcelize
data class ResendOrCancelPaymentRequest(
    
    
    
    @SerializedName("device_id")
    var deviceId: String?=null,
    
    @SerializedName("request_type")
    var requestType: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LinkStatus
*/
@Parcelize
data class LinkStatus(
    
    
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ResendOrCancelPaymentResponse
*/
@Parcelize
data class ResendOrCancelPaymentResponse(
    
    
    
    @SerializedName("data")
    var data: LinkStatus?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: renderHTMLRequest
*/
@Parcelize
data class renderHTMLRequest(
    
    
    
    @SerializedName("returntype")
    var returntype: String?=null,
    
    @SerializedName("base64_html")
    var base64Html: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: renderHTMLResponse
*/
@Parcelize
data class renderHTMLResponse(
    
    
    
    @SerializedName("html")
    var html: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ValidateVPARequest
*/
@Parcelize
data class ValidateVPARequest(
    
    
    
    @SerializedName("upi_vpa")
    var upiVpa: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ValidateUPI
*/
@Parcelize
data class ValidateUPI(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("customer_name")
    var customerName: String?=null,
    
    @SerializedName("upi_vpa")
    var upiVpa: String?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ValidateVPAResponse
*/
@Parcelize
data class ValidateVPAResponse(
    
    
    
    @SerializedName("data")
    var data: ValidateUPI?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TransferItemsDetails
*/
@Parcelize
data class TransferItemsDetails(
    
    
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("logo_large")
    var logoLarge: String?=null,
    
    @SerializedName("logo_small")
    var logoSmall: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TransferModeDetails
*/
@Parcelize
data class TransferModeDetails(
    
    
    
    @SerializedName("items")
    var items: ArrayList<TransferItemsDetails>?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TransferModeResponse
*/
@Parcelize
data class TransferModeResponse(
    
    
    
    @SerializedName("data")
    var data: ArrayList<TransferModeDetails>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: UpdateRefundTransferModeRequest
*/
@Parcelize
data class UpdateRefundTransferModeRequest(
    
    
    
    @SerializedName("enable")
    var enable: Boolean?=null,
    
    @SerializedName("transfer_mode")
    var transferMode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateRefundTransferModeResponse
*/
@Parcelize
data class UpdateRefundTransferModeResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: OrderBeneficiaryDetails
*/
@Parcelize
data class OrderBeneficiaryDetails(
    
    
    
    @SerializedName("transfer_mode")
    var transferMode: String?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("beneficiary_id")
    var beneficiaryId: String?=null,
    
    @SerializedName("delights_user_name")
    var delightsUserName: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    
    @SerializedName("title")
    var title: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderBeneficiaryResponse
*/
@Parcelize
data class OrderBeneficiaryResponse(
    
    
    
    @SerializedName("show_beneficiary_details")
    var showBeneficiaryDetails: Boolean?=null,
    
    @SerializedName("beneficiaries")
    var beneficiaries: ArrayList<OrderBeneficiaryDetails>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: NotFoundResourceError
*/
@Parcelize
data class NotFoundResourceError(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: IfscCodeResponse
*/
@Parcelize
data class IfscCodeResponse(
    
    
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorCodeDescription
*/
@Parcelize
data class ErrorCodeDescription(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AddBeneficiaryViaOtpVerificationRequest
*/
@Parcelize
data class AddBeneficiaryViaOtpVerificationRequest(
    
    
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("hash_key")
    var hashKey: String?=null,
    
    @SerializedName("otp")
    var otp: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AddBeneficiaryViaOtpVerificationResponse
*/
@Parcelize
data class AddBeneficiaryViaOtpVerificationResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: WrongOtpError
*/
@Parcelize
data class WrongOtpError(
    
    
    
    @SerializedName("is_verified_flag")
    var isVerifiedFlag: Boolean?=null,
    
    @SerializedName("success")
    var success: String?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BeneficiaryModeDetails
*/
@Parcelize
data class BeneficiaryModeDetails(
    
    
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("wallet")
    var wallet: String?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null,
    
    @SerializedName("vpa")
    var vpa: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("account_holder")
    var accountHolder: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AddBeneficiaryDetailsRequest
*/
@Parcelize
data class AddBeneficiaryDetailsRequest(
    
    
    
    @SerializedName("transfer_mode")
    var transferMode: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("delights")
    var delights: Boolean?=null,
    
    @SerializedName("details")
    var details: BeneficiaryModeDetails?=null,
    
    @SerializedName("otp")
    var otp: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RefundAccountResponse
*/
@Parcelize
data class RefundAccountResponse(
    
    
    
    @SerializedName("is_verified_flag")
    var isVerifiedFlag: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BankDetailsForOTP
*/
@Parcelize
data class BankDetailsForOTP(
    
    
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null,
    
    @SerializedName("account_holder")
    var accountHolder: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AddBeneficiaryDetailsOTPRequest
*/
@Parcelize
data class AddBeneficiaryDetailsOTPRequest(
    
    
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("details")
    var details: BankDetailsForOTP?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: WalletOtpRequest
*/
@Parcelize
data class WalletOtpRequest(
    
    
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: WalletOtpResponse
*/
@Parcelize
data class WalletOtpResponse(
    
    
    
    @SerializedName("is_verified_flag")
    var isVerifiedFlag: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SetDefaultBeneficiaryRequest
*/
@Parcelize
data class SetDefaultBeneficiaryRequest(
    
    
    
    @SerializedName("beneficiary_id")
    var beneficiaryId: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SetDefaultBeneficiaryResponse
*/
@Parcelize
data class SetDefaultBeneficiaryResponse(
    
    
    
    @SerializedName("is_beneficiary_set")
    var isBeneficiarySet: Boolean?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetPaymentLinkResponse
*/
@Parcelize
data class GetPaymentLinkResponse(
    
    
    
    @SerializedName("payment_link_current_status")
    var paymentLinkCurrentStatus: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("external_order_id")
    var externalOrderId: String?=null,
    
    @SerializedName("merchant_name")
    var merchantName: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("payment_link_url")
    var paymentLinkUrl: String?=null,
    
    @SerializedName("polling_timeout")
    var pollingTimeout: Int?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorDescription
*/
@Parcelize
data class ErrorDescription(
    
    
    
    @SerializedName("payment_transaction_id")
    var paymentTransactionId: String?=null,
    
    @SerializedName("expired")
    var expired: Boolean?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("invalid_id")
    var invalidId: Boolean?=null,
    
    @SerializedName("merchant_name")
    var merchantName: String?=null,
    
    @SerializedName("msg")
    var msg: String?=null,
    
    @SerializedName("cancelled")
    var cancelled: Boolean?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorResponse
*/
@Parcelize
data class ErrorResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("error")
    var error: ErrorDescription?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreatePaymentLinkMeta
*/
@Parcelize
data class CreatePaymentLinkMeta(
    
    
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("cart_id")
    var cartId: String?=null,
    
    @SerializedName("amount")
    var amount: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("assign_card_id")
    var assignCardId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreatePaymentLinkRequest
*/
@Parcelize
data class CreatePaymentLinkRequest(
    
    
    
    @SerializedName("mobile_number")
    var mobileNumber: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("external_order_id")
    var externalOrderId: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("meta")
    var meta: CreatePaymentLinkMeta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreatePaymentLinkResponse
*/
@Parcelize
data class CreatePaymentLinkResponse(
    
    
    
    @SerializedName("payment_link_id")
    var paymentLinkId: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("payment_link_url")
    var paymentLinkUrl: String?=null,
    
    @SerializedName("polling_timeout")
    var pollingTimeout: Int?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CancelOrResendPaymentLinkRequest
*/
@Parcelize
data class CancelOrResendPaymentLinkRequest(
    
    
    
    @SerializedName("payment_link_id")
    var paymentLinkId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ResendPaymentLinkResponse
*/
@Parcelize
data class ResendPaymentLinkResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("polling_timeout")
    var pollingTimeout: Int?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CancelPaymentLinkResponse
*/
@Parcelize
data class CancelPaymentLinkResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PollingPaymentLinkResponse
*/
@Parcelize
data class PollingPaymentLinkResponse(
    
    
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("payment_link_id")
    var paymentLinkId: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("http_status")
    var httpStatus: Int?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("redirect_url")
    var redirectUrl: String?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentMethodsMeta
*/
@Parcelize
data class PaymentMethodsMeta(
    
    
    
    @SerializedName("payment_gateway")
    var paymentGateway: String?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateOrderUserPaymentMethods
*/
@Parcelize
data class CreateOrderUserPaymentMethods(
    
    
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("meta")
    var meta: PaymentMethodsMeta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateOrderUserRequest
*/
@Parcelize
data class CreateOrderUserRequest(
    
    
    
    @SerializedName("payment_link_id")
    var paymentLinkId: String?=null,
    
    @SerializedName("failure_callback_url")
    var failureCallbackUrl: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("success_callback_url")
    var successCallbackUrl: String?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: CreateOrderUserPaymentMethods?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateOrderUserData
*/
@Parcelize
data class CreateOrderUserData(
    
    
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    
    @SerializedName("method")
    var method: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateOrderUserResponse
*/
@Parcelize
data class CreateOrderUserResponse(
    
    
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("data")
    var data: CreateOrderUserData?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("payment_confirm_url")
    var paymentConfirmUrl: String?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BalanceDetails
*/
@Parcelize
data class BalanceDetails(
    
    
    
    @SerializedName("formatted_value")
    var formattedValue: String?=null,
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("currency")
    var currency: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreditSummary
*/
@Parcelize
data class CreditSummary(
    
    
    
    @SerializedName("merchant_customer_ref_id")
    var merchantCustomerRefId: String?=null,
    
    @SerializedName("balance")
    var balance: BalanceDetails?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("status_message")
    var statusMessage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomerCreditSummaryResponse
*/
@Parcelize
data class CustomerCreditSummaryResponse(
    
    
    
    @SerializedName("data")
    var data: CreditSummary?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RedirectURL
*/
@Parcelize
data class RedirectURL(
    
    
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("signup_url")
    var signupUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RedirectToAggregatorResponse
*/
@Parcelize
data class RedirectToAggregatorResponse(
    
    
    
    @SerializedName("data")
    var data: RedirectURL?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CreditDetail
*/
@Parcelize
data class CreditDetail(
    
    
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("is_registered")
    var isRegistered: Boolean?=null,
    
    @SerializedName("signup_url")
    var signupUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CheckCreditResponse
*/
@Parcelize
data class CheckCreditResponse(
    
    
    
    @SerializedName("data")
    var data: CreditDetail?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DeviceDetails
*/
@Parcelize
data class DeviceDetails(
    
    
    
    @SerializedName("identification_number")
    var identificationNumber: String?=null,
    
    @SerializedName("os")
    var os: String?=null,
    
    @SerializedName("device_make")
    var deviceMake: String?=null,
    
    @SerializedName("device_type")
    var deviceType: String?=null,
    
    @SerializedName("device_model")
    var deviceModel: String?=null,
    
    @SerializedName("os_version")
    var osVersion: String?=null,
    
    @SerializedName("identifier_type")
    var identifierType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: KYCAddress
*/
@Parcelize
data class KYCAddress(
    
    
    
    @SerializedName("land_mark")
    var landMark: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("ownership_type")
    var ownershipType: String?=null,
    
    @SerializedName("addressline1")
    var addressline1: String?=null,
    
    @SerializedName("addressline2")
    var addressline2: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserPersonalInfoInDetails
*/
@Parcelize
data class UserPersonalInfoInDetails(
    
    
    
    @SerializedName("driving_license")
    var drivingLicense: String?=null,
    
    @SerializedName("mobile_verified")
    var mobileVerified: Boolean?=null,
    
    @SerializedName("dob")
    var dob: String?=null,
    
    @SerializedName("email_verified")
    var emailVerified: Boolean?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("voter_id")
    var voterId: String?=null,
    
    @SerializedName("mothers_name")
    var mothersName: String?=null,
    
    @SerializedName("pan")
    var pan: String?=null,
    
    @SerializedName("passport")
    var passport: String?=null,
    
    @SerializedName("fathers_name")
    var fathersName: String?=null,
    
    @SerializedName("address_as_per_id")
    var addressAsPerId: KYCAddress?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("middle_name")
    var middleName: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MarketplaceInfo
*/
@Parcelize
data class MarketplaceInfo(
    
    
    
    @SerializedName("membership_id")
    var membershipId: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("date_of_joining")
    var dateOfJoining: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BusinessDetails
*/
@Parcelize
data class BusinessDetails(
    
    
    
    @SerializedName("business_ownership_type")
    var businessOwnershipType: String?=null,
    
    @SerializedName("shop_and_establishment")
    var shopAndEstablishment: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("vintage")
    var vintage: String?=null,
    
    @SerializedName("fda")
    var fda: String?=null,
    
    @SerializedName("address")
    var address: KYCAddress?=null,
    
    @SerializedName("pan")
    var pan: String?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("fssai")
    var fssai: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("business_type")
    var businessType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomerOnboardingRequest
*/
@Parcelize
data class CustomerOnboardingRequest(
    
    
    
    @SerializedName("mcc")
    var mcc: String?=null,
    
    @SerializedName("device")
    var device: DeviceDetails?=null,
    
    @SerializedName("personal_info")
    var personalInfo: UserPersonalInfoInDetails?=null,
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("marketplace_info")
    var marketplaceInfo: MarketplaceInfo?=null,
    
    @SerializedName("business_info")
    var businessInfo: BusinessDetails?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OnboardSummary
*/
@Parcelize
data class OnboardSummary(
    
    
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("redirect_url")
    var redirectUrl: String?=null,
    
    @SerializedName("session")
    var session: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomerOnboardingResponse
*/
@Parcelize
data class CustomerOnboardingResponse(
    
    
    
    @SerializedName("data")
    var data: OnboardSummary?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



