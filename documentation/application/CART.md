



##### [Back to Application docs](./README.md)

## Cart Methods
Cart APIs
* [getCart](#getcart)
* [getCartLastModified](#getcartlastmodified)
* [addItems](#additems)
* [updateCart](#updatecart)
* [getItemCount](#getitemcount)
* [getCoupons](#getcoupons)
* [applyCoupon](#applycoupon)
* [removeCoupon](#removecoupon)
* [getBulkDiscountOffers](#getbulkdiscountoffers)
* [applyRewardPoints](#applyrewardpoints)
* [getAddresses](#getaddresses)
* [addAddress](#addaddress)
* [getAddressById](#getaddressbyid)
* [updateAddress](#updateaddress)
* [removeAddress](#removeaddress)
* [selectAddress](#selectaddress)
* [selectPaymentMode](#selectpaymentmode)
* [validateCouponForPayment](#validatecouponforpayment)
* [getShipments](#getshipments)
* [checkoutCart](#checkoutcart)
* [updateCartMeta](#updatecartmeta)
* [getCartShareLink](#getcartsharelink)
* [getCartSharedItems](#getcartshareditems)
* [updateCartWithSharedItems](#updatecartwithshareditems)
* [getPromotionOffers](#getpromotionoffers)
* [getLadderOffers](#getladderoffers)



## Methods with example and description


### getCart
Fetch all items added to the cart




```kotlin
applicationClient.cart.getCart(id: id, i: i, b: b, assignCardId: assignCardId, areaCode: areaCode, buyNow: buyNow).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| id | String? | no |  |   
| i | Boolean? | no |  |   
| b | Boolean? | no |  |   
| assignCardId | Int? | no |  |   
| areaCode | String? | no |  |   
| buyNow | Boolean? | no |  |  



Use this API to get details of all the items added to a cart.

*Returned Response:*




[CartDetailResponse](#CartDetailResponse)

Success. Returns a Cart object. Check the example shown below or refer `CartDetailResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "applied_promo_details": [
    {
      "application_id": "000000000000000000000001",
      "apply_all_offers": false,
      "apply_exclusive": null,
      "buy_article_dict": {
        "rule#1": {
          "633527e850dfb8e73e6de996_0": {
            "added_in_cart": false,
            "added_quantity": 0,
            "amount_paid": 0,
            "applicable_credits": {
              "conversion_rate": 1,
              "currency_code": "INR",
              "currency_symbol": "₹",
              "floor_source_value": 0,
              "floor_value": 0,
              "source_currency_code": "FC",
              "source_currency_symbol": "",
              "source_value": 0,
              "value": 0
            },
            "article_assign_status": true,
            "article_assignment": {
              "level": "multi-companies",
              "strategy": "optimal"
            },
            "article_error": {
              "type": null,
              "value": null,
              "message": null
            },
            "article_id": "633527e850dfb8e73e6de996",
            "article_index": "0",
            "article_meta": {
              "article_id": "633527e850dfb8e73e6de996",
              "bulk_margin": 0,
              "bulk_discount": {
                "conversion_rate": 1,
                "currency_code": "INR",
                "currency_symbol": "₹",
                "floor_source_value": 0,
                "floor_value": 0,
                "source_currency_code": "INR",
                "source_currency_symbol": "₹",
                "source_value": 0,
                "value": 0
              },
              "bulk_coupon_code": null,
              "country_of_origin": "India",
              "dimension": {
                "width": 70,
                "unit": "cm",
                "height": 70,
                "is_default": true,
                "length": 70
              },
              "fragile": false,
              "manufacturer": {
                "address": "10, PALI MALA RD, ADARSH NAGAR, BANDRA WEST,, MAHARASHTRA, MUMBAI",
                "name": "Sabki Shop",
                "is_default": true
              },
              "weight": {
                "shipping": 250,
                "unit": "gram",
                "is_default": true
              },
              "raw_meta": {
                "fynd_identifier": "4187_3412343256098",
                "is_set_article": false,
                "set_quantity": 1
              },
              "is_set": false,
              "set": {},
              "identifier": {
                "ean": "3412343256098"
              },
              "hsn_code": null,
              "hsn_code_id": "625fbd96faeed8b3df6ec3ce",
              "raw_price": {
                "effective": {
                  "conversion_rate": 1,
                  "currency_code": "INR",
                  "currency_symbol": "₹",
                  "floor_source_value": 3899,
                  "floor_value": 3899,
                  "source_currency_code": "INR",
                  "source_currency_symbol": "₹",
                  "source_value": 3899,
                  "value": 3899
                },
                "marked": {
                  "conversion_rate": 1,
                  "currency_code": "INR",
                  "currency_symbol": "₹",
                  "floor_source_value": 3899,
                  "floor_value": 3899,
                  "source_currency_code": "INR",
                  "source_currency_symbol": "₹",
                  "source_value": 3899,
                  "value": 3899
                },
                "transfer": {
                  "conversion_rate": 1,
                  "currency_code": "INR",
                  "currency_symbol": "₹",
                  "floor_source_value": 0,
                  "floor_value": 0,
                  "source_currency_code": "INR",
                  "source_currency_symbol": "₹",
                  "source_value": 0,
                  "value": 0
                }
              },
              "seller_identifier": "3412343256098",
              "_custom_json": {},
              "tags": [],
              "return_config": {
                "time": 0,
                "unit": "days",
                "returnable": false
              }
            },
            "attributes": {
              "essential": "No",
              "item_code": "BSFJ2-12608",
              "gender": [
                "Men"
              ],
              "denim_type": "Solid",
              "pattern": "Solid",
              "product_fit": "Slim",
              "currency": "INR",
              "media": [
                {
                  "type": "image",
                  "meta": {
                    "brand": "nike",
                    "item_code": "BSFJ2-12608",
                    "sequence": 0
                  },
                  "url": "https://hdn-1.addsale.com/addsale/products/pictures/item/free/original/nike/BSFJ2-12608/0/jMpkpyx17w-GWQjymow3-Black-Slim-Fit-Jeans.jpeg"
                }
              ],
              "name": "Nike Jeans 12608",
              "brand_name": "Nike"
            },
            "avl_qty": 97,
            "brand_id": 18,
            "bulk_coupon_applied": false,
            "bulk_coupon_code": null,
            "bulk_discount": {
              "conversion_rate": 1,
              "currency_code": "INR",
              "currency_symbol": "₹",
              "floor_source_value": 0,
              "floor_value": 0,
              "source_currency_code": "INR",
              "source_currency_symbol": "₹",
              "source_value": 0,
              "value": 0
            },
            "bulk_margin": 0,
            "cancellation_allowed": true,
            "cashback": {
              "amount": {
                "conversion_rate": 1,
                "currency_code": "INR",
                "currency_symbol": "₹",
                "floor_source_value": 0,
                "floor_value": 0,
                "source_currency_code": "FC",
                "source_currency_symbol": "",
                "source_value": 0,
                "value": 0
              }
            },
            "category_id": [
              150
            ],
            "cod_charges": {
              "amount": {
                "conversion_rate": 1,
                "currency_code": "INR",
                "currency_symbol": "₹",
                "floor_source_value": 0,
                "floor_value": 0,
                "source_currency_code": "INR",
                "source_currency_symbol": "₹",
                "source_value": 0,
                "value": 0
              }
            },
            "company_id": 2,
            "company_info": {
              "company_id": 2,
              "c_name": "Sabki Shop",
              "c_taxes": [
                {
                  "rate": 15,
                  "enable": true,
                  "effective_date": "2022-06-05T18:29:23.904000"
                }
              ],
              "company_cin": "U45200MH1992PTC066474"
            },
            "company_taxes": [
              {
                "rate": 15,
                "enable": true,
                "effective_date": "2022-06-05T18:29:23.904000"
              }
            ],
            "coupon": {
              "amount": {
                "conversion_rate": 1,
                "currency_code": "INR",
                "currency_symbol": "₹",
                "floor_source_value": 0,
                "floor_value": 0,
                "source_currency_code": "INR",
                "source_currency_symbol": "₹",
                "source_value": 0,
                "value": 0
              },
              "article_count": 0,
              "cancellation_allowed": true,
              "return_allowed": true
            },
            "currency_dict": {
              "code": "INR",
              "rate": 1
            },
            "custom_meta": {},
            "data": {},
            "delivery_charges": {
              "amount": {
                "conversion_rate": 1,
                "currency_code": "INR",
                "currency_symbol": "₹",
                "floor_source_value": 0,
                "floor_value": 0,
                "source_currency_code": "INR",
                "source_currency_symbol": "₹",
                "source_value": 0,
                "value": 0
              }
            },
            "delivery_error_msg": "",
            "delivery_promise": {
              "timestamp": {
                "min": 1646257339,
                "max": 1646689339
              },
              "formatted": {
                "min": "03 Mar, Thursday",
                "max": "08 Mar, Tuesday"
              }
            },
            "departments": [
              99
            ],
            "discount": 0,
            "discount_applied": {},
            "dt_currency": "INR",
            "dt_currency_symbol": "₹",
            "esp_modified": false,
            "extra_meta": {},
            "float_amount_paid": 0,
            "free_gift_items_meta": {},
            "group_id": "",
            "gst_amount": 167.1,
            "gst_tax_percentage": 5,
            "hsn_code": null,
            "hsn_code_id": "625fbd96faeed8b3df6ec3ce",
            "identifiers": {
              "identifier": "BDnwAINORr6SlTKxZN3w"
            },
            "image_nature": "standard",
            "include": true,
            "is_valid": true,
            "item_id": 75660796,
            "item_size": "34",
            "last_update_at": 1680852767,
            "meta": {},
            "net_price": {
              "conversion_rate": 1,
              "currency_code": "INR",
              "currency_symbol": "₹",
              "floor_source_value": 3509.1,
              "floor_value": 3509.1,
              "source_currency_code": "INR",
              "source_currency_symbol": "₹",
              "source_value": 3509.1,
              "value": 3509.1
            },
            "old_price": {
              "conversion_rate": 1,
              "currency_code": "INR",
              "currency_symbol": "₹",
              "floor_source_value": 3899,
              "floor_value": 3899,
              "source_currency_code": "INR",
              "source_currency_symbol": "₹",
              "source_value": 3899,
              "value": 3899
            },
            "original_price_effective": {
              "conversion_rate": 1,
              "currency_code": "INR",
              "currency_symbol": "₹",
              "floor_source_value": 3899,
              "floor_value": 3899,
              "source_currency_code": "INR",
              "source_currency_symbol": "₹",
              "source_value": 3899,
              "value": 3899
            },
            "original_unit_price": {
              "conversion_rate": 1,
              "currency_code": "INR",
              "currency_symbol": "₹",
              "floor_source_value": 3899,
              "floor_value": 3899,
              "source_currency_code": "INR",
              "source_currency_symbol": "₹",
              "source_value": 3899,
              "value": 3899
            },
            "parent_item_identifiers": {
              "identifier": null,
              "parent_item_size": null,
              "parent_item_id": null
            },
            "pickup_stores": [],
            "price": {
              "conversion_rate": 1,
              "currency_code": "INR",
              "currency_symbol": "₹",
              "floor_source_value": 3899,
              "floor_value": 3899,
              "source_currency_code": "INR",
              "source_currency_symbol": "₹",
              "source_value": 3899,
              "value": 3899
            },
            "price_effective": {
              "conversion_rate": 1,
              "currency_code": "INR",
              "currency_symbol": "₹",
              "floor_source_value": 3899,
              "floor_value": 3899,
              "source_currency_code": "INR",
              "source_currency_symbol": "₹",
              "source_value": 3899,
              "value": 3899
            },
            "price_marked": {
              "conversion_rate": 1,
              "currency_code": "INR",
              "currency_symbol": "₹",
              "floor_source_value": 3899,
              "floor_value": 3899,
              "source_currency_code": "INR",
              "source_currency_symbol": "₹",
              "source_value": 3899,
              "value": 3899
            },
            "product_tags": [],
            "promotions": {
              "amount": {
                "conversion_rate": 1,
                "currency_code": "INR",
                "currency_symbol": "₹",
                "floor_source_value": 0,
                "floor_value": 0,
                "source_currency_code": "INR",
                "source_currency_symbol": "₹",
                "source_value": 0,
                "value": 0
              },
              "applied": [
                {
                  "amount": {
                    "conversion_rate": 1,
                    "currency_code": "INR",
                    "currency_symbol": "₹",
                    "floor_source_value": 389.9,
                    "floor_value": 389.9,
                    "source_currency_code": "INR",
                    "source_currency_symbol": "₹",
                    "source_value": 389.9,
                    "value": 389.9
                  },
                  "applied_discounts": [
                    {
                      "type": "percentage",
                      "value": 10
                    }
                  ],
                  "applied_free_articles": [],
                  "apply_exclusive": null,
                  "article_quantity": 1,
                  "buy_rules": [
                    {
                      "all_items": null,
                      "cart_conditions": {},
                      "item_criteria": {
                        "item_brand": [
                          18
                        ]
                      },
                      "mrp_promo": false,
                      "slug": "rule#1"
                    }
                  ],
                  "cancellation_allowed": true,
                  "discount_rules": [
                    {
                      "all_items": null,
                      "buy_condition": "( rule#1 )",
                      "item_criteria": {
                        "buy_rules": [
                          "rule#1"
                        ]
                      },
                      "matched_buy_rules": [
                        "rule#1"
                      ],
                      "offer": {
                        "discount_percentage": 10
                      },
                      "raw_offer": {
                        "item_criteria": {
                          "buy_rules": [
                            "rule#1"
                          ]
                        },
                        "buy_condition": "( rule#1 )",
                        "discount_type": "percentage",
                        "offer": {
                          "discount_percentage": 10
                        }
                      },
                      "type": "percentage"
                    }
                  ],
                  "mrp_promo": false,
                  "offer_text": "10% of on NIKE Jeans",
                  "ownership": {
                    "payable_category": "seller",
                    "payable_by": ""
                  },
                  "payable_category": "seller",
                  "promo_code": null,
                  "promo_id": "642fe329ed159b7aa743a293",
                  "promo_type": "percentage",
                  "promotion_group": "product",
                  "return_allowed": true
                }
              ],
              "apply_exclusive": null,
              "available": [],
              "cancellation_allowed": true,
              "exclusive_promo_applied": false,
              "mrp_promo_applied": false,
              "return_allowed": true
            },
            "quantity": 1,
            "quantity_assign_status": false,
            "referral_credits": {
              "amount": {
                "conversion_rate": 1,
                "currency_code": "INR",
                "currency_symbol": "₹",
                "floor_source_value": 0,
                "floor_value": 0,
                "source_currency_code": "FC",
                "source_currency_symbol": "",
                "source_value": 0,
                "value": 0
              }
            },
            "reload_data_only": true,
            "return_allowed": false,
            "sc_currency": "INR",
            "sc_currency_symbol": "₹",
            "selling_price": {
              "conversion_rate": 1,
              "currency_code": "INR",
              "currency_symbol": "₹",
              "floor_source_value": 3899,
              "floor_value": 3899,
              "source_currency_code": "INR",
              "source_currency_symbol": "₹",
              "source_value": 3899,
              "value": 3899
            },
            "service_item_meta": {
              "product_group_tags": null,
              "products": null
            },
            "size_level_total_qty": 1,
            "sizes": [
              "34"
            ],
            "split_article_id": "633527e850dfb8e73e6de996_0",
            "split_index": 0,
            "store_id": 4187,
            "store_info": {
              "store_id": 4187,
              "s_city": "HYDERABAD",
              "store_name": "AND Inorbit Hyderabad",
              "store_type": "mall",
              "store_pincode": 500081,
              "latitude": 17.4343693,
              "longitude": 78.3866087
            },
            "strategy_validation_data": {},
            "tags": [
              "rule#1"
            ],
            "total_gst_amount": 167.1,
            "total_value_of_good": 3342,
            "transfer_price": {
              "conversion_rate": 1,
              "currency_code": "INR",
              "currency_symbol": "₹",
              "floor_source_value": 0,
              "floor_value": 0,
              "source_currency_code": "INR",
              "source_currency_symbol": "₹",
              "source_value": 0,
              "value": 0
            },
            "unit_price": {
              "conversion_rate": 1,
              "currency_code": "INR",
              "currency_symbol": "₹",
              "floor_source_value": 3509.1,
              "floor_value": 3509.1,
              "source_currency_code": "INR",
              "source_currency_symbol": "₹",
              "source_value": 3509.1,
              "value": 3509.1
            },
            "valid_inventory": true,
            "value_of_good": 3342,
            "verify_article": false
          }
        }
      },
      "buy_rules": [
        {
          "all_items": null,
          "cart_conditions": {},
          "item_criteria": {
            "item_brand": [
              18
            ]
          },
          "mrp_promo": false,
          "slug": "rule#1"
        }
      ],
      "buy_rules_map": {
        "rule#1": {
          "item_brand": [
            18
          ]
        }
      },
      "calculate_on": "esp",
      "cancellation_allowed": true,
      "code": null,
      "discount": 389.9,
      "discount_rules": [
        {
          "all_items": null,
          "buy_condition": "( rule#1 )",
          "item_criteria": {
            "buy_rules": [
              "rule#1"
            ]
          },
          "matched_buy_rules": [
            "rule#1"
          ],
          "offer": {
            "discount_percentage": 10
          },
          "raw_offer": {
            "item_criteria": {
              "buy_rules": [
                "rule#1"
              ]
            },
            "buy_condition": "( rule#1 )",
            "discount_type": "percentage",
            "offer": {
              "discount_percentage": 10
            }
          },
          "type": "percentage"
        }
      ],
      "id": "642fe329ed159b7aa743a293",
      "mrp_promo": false,
      "offer_text": "10% of on NIKE Jeans",
      "ownership": {
        "payable_category": "seller",
        "payable_by": ""
      },
      "payable_category": "seller",
      "priority": 1,
      "promo_group": "product",
      "remaining_allowed_qty": null,
      "restrictions": {
        "uses": {
          "maximum": {
            "user": 0,
            "total": 0
          },
          "remaining": {
            "user": 0,
            "total": 0
          }
        },
        "user_groups": [],
        "post_order": {
          "return_allowed": true,
          "cancellation_allowed": true
        },
        "user_id": [],
        "payments": [],
        "user_registered": {
          "start": null,
          "end": null
        },
        "platforms": [
          "web",
          "android",
          "ios"
        ],
        "anonymous_users": true
      },
      "return_allowed": true,
      "stackable": true,
      "type": "percentage",
      "usage_meta": null
    }
  ],
  "items": [
    {
      "bulk_offer": {},
      "delivery_promise": {
        "timestamp": {
          "min": 1646257339,
          "max": 1646689339
        },
        "formatted": {
          "min": "03 Mar, Thursday",
          "max": "08 Mar, Tuesday"
        }
      },
      "discount": "67% OFF",
      "moq": {},
      "article": {
        "type": "article",
        "uid": "604_902_SSTC60401_636BLUE_1",
        "size": "1",
        "seller": {
          "uid": 604,
          "name": "SHRI SHANTINATH TRADING COMPANY"
        },
        "store": {
          "uid": 4579,
          "name": "Gandhi Nagar"
        },
        "quantity": 108,
        "price": {
          "base": {
            "marked": 2999,
            "effective": 999,
            "currency_code": "INR"
          },
          "converted": {
            "marked": 2999,
            "effective": 999,
            "currency_code": "INR"
          }
        }
      },
      "coupon_message": "",
      "key": "707569_1",
      "availability": {
        "available_sizes": [
          {
            "is_available": true,
            "display": "OS",
            "value": "OS"
          }
        ],
        "sizes": [
          "1",
          "8",
          "7",
          "2",
          "9",
          "5",
          "3",
          "6"
        ],
        "other_store_quantity": 107,
        "out_of_stock": false,
        "deliverable": true,
        "is_valid": true
      },
      "product": {
        "type": "product",
        "uid": 707569,
        "name": "Blue and Gold Printed Ethnic Set",
        "slug": "aj-dezines-blue-and-gold-printed-ethnic-set-707569-bff01a",
        "brand": {
          "uid": 902,
          "name": ""
        },
        "categories": [
          {
            "uid": 525,
            "name": ""
          }
        ],
        "images": [
          {
            "aspect_ratio": "16:25",
            "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/902_636BLUE/1_1540301094877.jpg",
            "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/902_636BLUE/1_1540301094877.jpg"
          }
        ],
        "action": {
          "type": "product",
          "url": "https://api.addsale.com/v1/products/aj-dezines-blue-and-gold-printed-ethnic-set-707569-bff01a/",
          "query": {
            "product_slug": [
              "aj-dezines-blue-and-gold-printed-ethnic-set-707569-bff01a"
            ]
          }
        }
      },
      "price": {
        "base": {
          "add_on": 999,
          "marked": 2999,
          "effective": 999,
          "selling": 999,
          "currency_code": "INR"
        },
        "converted": {
          "add_on": 999,
          "marked": 2999,
          "effective": 999,
          "selling": 999,
          "currency_code": "INR"
        }
      },
      "message": "",
      "quantity": 1
    }
  ],
  "buy_now": false,
  "cart_id": 54,
  "uid": "54",
  "breakup_values": {
    "raw": {
      "cod_charge": 0,
      "convenience_fee": 0,
      "coupon": 0,
      "delivery_charge": 0,
      "discount": -2000,
      "fynd_cash": 0,
      "gst_charges": 47.57,
      "mrp_total": 2999,
      "subtotal": 999,
      "total": 999,
      "vog": 951.43,
      "you_saved": 0
    },
    "coupon": {
      "type": "cash",
      "code": "",
      "uid": null,
      "value": 0,
      "is_applied": false,
      "message": "Sorry! Invalid Coupon"
    },
    "display": [
      {
        "display": "MRP Total",
        "key": "mrp_total",
        "value": 2999,
        "currency_code": "INR"
      },
      {
        "display": "Discount",
        "key": "discount",
        "value": -2000,
        "currency_code": "INR"
      },
      {
        "display": "Subtotal",
        "key": "subtotal",
        "value": 999,
        "currency_code": "INR"
      },
      {
        "display": "Total",
        "key": "total",
        "value": 999,
        "currency_code": "INR"
      }
    ],
    "loyalty_points": {
      "total": 0,
      "applicable": 0,
      "is_applied": false,
      "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
    }
  },
  "delivery_charge_info": "",
  "coupon_text": "View all offers",
  "gstin": null,
  "checkout_mode": "self",
  "restrict_checkout": false,
  "is_valid": true,
  "last_modified": "Tue, 03 Sep 2019 05:35:59 GMT"
}
```
</details>









---


### getCartLastModified
Fetch last-modified timestamp




```kotlin
applicationClient.cart.getCartLastModified(id: id).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| id | String? | no |  |  



Use this API to fetch Last-Modified timestamp in header metadata.

*Returned Response:*








---


### addItems
Add items to cart




```kotlin
applicationClient.cart.addItems(i: i, b: b, areaCode: areaCode, buyNow: buyNow, body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| i | Boolean? | no |  |   
| b | Boolean? | no |  |   
| areaCode | String? | no |  |   
| buyNow | Boolean? | no |  |  
| body | [AddCartRequest](#AddCartRequest) | yes | Request body |


Use this API to add items to the cart.

*Returned Response:*




[AddCartDetailResponse](#AddCartDetailResponse)

Success. Returns a cart object as shown below. Refer `AddCartDetailResponse` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Product has been added to your cart</i></summary>

```json
{
  "value": {
    "message": "Product has been added to your cart",
    "success": true,
    "cart": {
      "applied_promo_details": [
        {
          "application_id": "000000000000000000000001",
          "apply_all_offers": false,
          "apply_exclusive": null,
          "buy_article_dict": {
            "rule#1": {
              "633527e850dfb8e73e6de996_0": {
                "added_in_cart": false,
                "added_quantity": 0,
                "amount_paid": 0,
                "applicable_credits": {
                  "conversion_rate": 1,
                  "currency_code": "INR",
                  "currency_symbol": "₹",
                  "floor_source_value": 0,
                  "floor_value": 0,
                  "source_currency_code": "FC",
                  "source_currency_symbol": "",
                  "source_value": 0,
                  "value": 0
                },
                "article_assign_status": true,
                "article_assignment": {
                  "level": "multi-companies",
                  "strategy": "optimal"
                },
                "article_error": {
                  "type": null,
                  "value": null,
                  "message": null
                },
                "article_id": "633527e850dfb8e73e6de996",
                "article_index": "0",
                "article_meta": {
                  "article_id": "633527e850dfb8e73e6de996",
                  "bulk_margin": 0,
                  "bulk_discount": {
                    "conversion_rate": 1,
                    "currency_code": "INR",
                    "currency_symbol": "₹",
                    "floor_source_value": 0,
                    "floor_value": 0,
                    "source_currency_code": "INR",
                    "source_currency_symbol": "₹",
                    "source_value": 0,
                    "value": 0
                  },
                  "bulk_coupon_code": null,
                  "country_of_origin": "India",
                  "dimension": {
                    "width": 70,
                    "unit": "cm",
                    "height": 70,
                    "is_default": true,
                    "length": 70
                  },
                  "fragile": false,
                  "manufacturer": {
                    "address": "10, PALI MALA RD, ADARSH NAGAR, BANDRA WEST,, MAHARASHTRA, MUMBAI",
                    "name": "Sabki Shop",
                    "is_default": true
                  },
                  "weight": {
                    "shipping": 250,
                    "unit": "gram",
                    "is_default": true
                  },
                  "raw_meta": {
                    "fynd_identifier": "4187_3412343256098",
                    "is_set_article": false,
                    "set_quantity": 1
                  },
                  "is_set": false,
                  "set": {},
                  "identifier": {
                    "ean": "3412343256098"
                  },
                  "hsn_code": null,
                  "hsn_code_id": "625fbd96faeed8b3df6ec3ce",
                  "raw_price": {
                    "effective": {
                      "conversion_rate": 1,
                      "currency_code": "INR",
                      "currency_symbol": "₹",
                      "floor_source_value": 3899,
                      "floor_value": 3899,
                      "source_currency_code": "INR",
                      "source_currency_symbol": "₹",
                      "source_value": 3899,
                      "value": 3899
                    },
                    "marked": {
                      "conversion_rate": 1,
                      "currency_code": "INR",
                      "currency_symbol": "₹",
                      "floor_source_value": 3899,
                      "floor_value": 3899,
                      "source_currency_code": "INR",
                      "source_currency_symbol": "₹",
                      "source_value": 3899,
                      "value": 3899
                    },
                    "transfer": {
                      "conversion_rate": 1,
                      "currency_code": "INR",
                      "currency_symbol": "₹",
                      "floor_source_value": 0,
                      "floor_value": 0,
                      "source_currency_code": "INR",
                      "source_currency_symbol": "₹",
                      "source_value": 0,
                      "value": 0
                    }
                  },
                  "seller_identifier": "3412343256098",
                  "_custom_json": {},
                  "tags": [],
                  "return_config": {
                    "time": 0,
                    "unit": "days",
                    "returnable": false
                  }
                },
                "attributes": {
                  "essential": "No",
                  "item_code": "BSFJ2-12608",
                  "gender": [
                    "Men"
                  ],
                  "denim_type": "Solid",
                  "pattern": "Solid",
                  "product_fit": "Slim",
                  "currency": "INR",
                  "media": [
                    {
                      "type": "image",
                      "meta": {
                        "brand": "nike",
                        "item_code": "BSFJ2-12608",
                        "sequence": 0
                      },
                      "url": "https://hdn-1.addsale.com/addsale/products/pictures/item/free/original/nike/BSFJ2-12608/0/jMpkpyx17w-GWQjymow3-Black-Slim-Fit-Jeans.jpeg"
                    }
                  ],
                  "name": "Nike Jeans 12608",
                  "brand_name": "Nike"
                },
                "avl_qty": 97,
                "brand_id": 18,
                "bulk_coupon_applied": false,
                "bulk_coupon_code": null,
                "bulk_discount": {
                  "conversion_rate": 1,
                  "currency_code": "INR",
                  "currency_symbol": "₹",
                  "floor_source_value": 0,
                  "floor_value": 0,
                  "source_currency_code": "INR",
                  "source_currency_symbol": "₹",
                  "source_value": 0,
                  "value": 0
                },
                "bulk_margin": 0,
                "cancellation_allowed": true,
                "cashback": {
                  "amount": {
                    "conversion_rate": 1,
                    "currency_code": "INR",
                    "currency_symbol": "₹",
                    "floor_source_value": 0,
                    "floor_value": 0,
                    "source_currency_code": "FC",
                    "source_currency_symbol": "",
                    "source_value": 0,
                    "value": 0
                  }
                },
                "category_id": [
                  150
                ],
                "cod_charges": {
                  "amount": {
                    "conversion_rate": 1,
                    "currency_code": "INR",
                    "currency_symbol": "₹",
                    "floor_source_value": 0,
                    "floor_value": 0,
                    "source_currency_code": "INR",
                    "source_currency_symbol": "₹",
                    "source_value": 0,
                    "value": 0
                  }
                },
                "company_id": 2,
                "company_info": {
                  "company_id": 2,
                  "c_name": "Sabki Shop",
                  "c_taxes": [
                    {
                      "rate": 15,
                      "enable": true,
                      "effective_date": "2022-06-05T18:29:23.904000"
                    }
                  ],
                  "company_cin": "U45200MH1992PTC066474"
                },
                "company_taxes": [
                  {
                    "rate": 15,
                    "enable": true,
                    "effective_date": "2022-06-05T18:29:23.904000"
                  }
                ],
                "coupon": {
                  "amount": {
                    "conversion_rate": 1,
                    "currency_code": "INR",
                    "currency_symbol": "₹",
                    "floor_source_value": 0,
                    "floor_value": 0,
                    "source_currency_code": "INR",
                    "source_currency_symbol": "₹",
                    "source_value": 0,
                    "value": 0
                  },
                  "article_count": 0,
                  "cancellation_allowed": true,
                  "return_allowed": true
                },
                "currency_dict": {
                  "code": "INR",
                  "rate": 1
                },
                "custom_meta": {},
                "data": {},
                "delivery_charges": {
                  "amount": {
                    "conversion_rate": 1,
                    "currency_code": "INR",
                    "currency_symbol": "₹",
                    "floor_source_value": 0,
                    "floor_value": 0,
                    "source_currency_code": "INR",
                    "source_currency_symbol": "₹",
                    "source_value": 0,
                    "value": 0
                  }
                },
                "delivery_error_msg": "",
                "delivery_promise": {
                  "timestamp": {
                    "min": 1646257339,
                    "max": 1646689339
                  },
                  "formatted": {
                    "min": "03 Mar, Thursday",
                    "max": "08 Mar, Tuesday"
                  }
                },
                "departments": [
                  99
                ],
                "discount": 0,
                "discount_applied": {},
                "dt_currency": "INR",
                "dt_currency_symbol": "₹",
                "esp_modified": false,
                "extra_meta": {},
                "float_amount_paid": 0,
                "free_gift_items_meta": {},
                "group_id": "",
                "gst_amount": 167.1,
                "gst_tax_percentage": 5,
                "hsn_code": null,
                "hsn_code_id": "625fbd96faeed8b3df6ec3ce",
                "identifiers": {
                  "identifier": "BDnwAINORr6SlTKxZN3w"
                },
                "image_nature": "standard",
                "include": true,
                "is_valid": true,
                "item_id": 75660796,
                "item_size": "34",
                "last_update_at": 1680852767,
                "meta": {},
                "net_price": {
                  "conversion_rate": 1,
                  "currency_code": "INR",
                  "currency_symbol": "₹",
                  "floor_source_value": 3509.1,
                  "floor_value": 3509.1,
                  "source_currency_code": "INR",
                  "source_currency_symbol": "₹",
                  "source_value": 3509.1,
                  "value": 3509.1
                },
                "old_price": {
                  "conversion_rate": 1,
                  "currency_code": "INR",
                  "currency_symbol": "₹",
                  "floor_source_value": 3899,
                  "floor_value": 3899,
                  "source_currency_code": "INR",
                  "source_currency_symbol": "₹",
                  "source_value": 3899,
                  "value": 3899
                },
                "original_price_effective": {
                  "conversion_rate": 1,
                  "currency_code": "INR",
                  "currency_symbol": "₹",
                  "floor_source_value": 3899,
                  "floor_value": 3899,
                  "source_currency_code": "INR",
                  "source_currency_symbol": "₹",
                  "source_value": 3899,
                  "value": 3899
                },
                "original_unit_price": {
                  "conversion_rate": 1,
                  "currency_code": "INR",
                  "currency_symbol": "₹",
                  "floor_source_value": 3899,
                  "floor_value": 3899,
                  "source_currency_code": "INR",
                  "source_currency_symbol": "₹",
                  "source_value": 3899,
                  "value": 3899
                },
                "parent_item_identifiers": {
                  "identifier": null,
                  "parent_item_size": null,
                  "parent_item_id": null
                },
                "pickup_stores": [],
                "price": {
                  "conversion_rate": 1,
                  "currency_code": "INR",
                  "currency_symbol": "₹",
                  "floor_source_value": 3899,
                  "floor_value": 3899,
                  "source_currency_code": "INR",
                  "source_currency_symbol": "₹",
                  "source_value": 3899,
                  "value": 3899
                },
                "price_effective": {
                  "conversion_rate": 1,
                  "currency_code": "INR",
                  "currency_symbol": "₹",
                  "floor_source_value": 3899,
                  "floor_value": 3899,
                  "source_currency_code": "INR",
                  "source_currency_symbol": "₹",
                  "source_value": 3899,
                  "value": 3899
                },
                "price_marked": {
                  "conversion_rate": 1,
                  "currency_code": "INR",
                  "currency_symbol": "₹",
                  "floor_source_value": 3899,
                  "floor_value": 3899,
                  "source_currency_code": "INR",
                  "source_currency_symbol": "₹",
                  "source_value": 3899,
                  "value": 3899
                },
                "product_tags": [],
                "promotions": {
                  "amount": {
                    "conversion_rate": 1,
                    "currency_code": "INR",
                    "currency_symbol": "₹",
                    "floor_source_value": 0,
                    "floor_value": 0,
                    "source_currency_code": "INR",
                    "source_currency_symbol": "₹",
                    "source_value": 0,
                    "value": 0
                  },
                  "applied": [
                    {
                      "amount": {
                        "conversion_rate": 1,
                        "currency_code": "INR",
                        "currency_symbol": "₹",
                        "floor_source_value": 389.9,
                        "floor_value": 389.9,
                        "source_currency_code": "INR",
                        "source_currency_symbol": "₹",
                        "source_value": 389.9,
                        "value": 389.9
                      },
                      "applied_discounts": [
                        {
                          "type": "percentage",
                          "value": 10
                        }
                      ],
                      "applied_free_articles": [],
                      "apply_exclusive": null,
                      "article_quantity": 1,
                      "buy_rules": [
                        {
                          "all_items": null,
                          "cart_conditions": {},
                          "item_criteria": {
                            "item_brand": [
                              18
                            ]
                          },
                          "mrp_promo": false,
                          "slug": "rule#1"
                        }
                      ],
                      "cancellation_allowed": true,
                      "discount_rules": [
                        {
                          "all_items": null,
                          "buy_condition": "( rule#1 )",
                          "item_criteria": {
                            "buy_rules": [
                              "rule#1"
                            ]
                          },
                          "matched_buy_rules": [
                            "rule#1"
                          ],
                          "offer": {
                            "discount_percentage": 10
                          },
                          "raw_offer": {
                            "item_criteria": {
                              "buy_rules": [
                                "rule#1"
                              ]
                            },
                            "buy_condition": "( rule#1 )",
                            "discount_type": "percentage",
                            "offer": {
                              "discount_percentage": 10
                            }
                          },
                          "type": "percentage"
                        }
                      ],
                      "mrp_promo": false,
                      "offer_text": "10% of on NIKE Jeans",
                      "ownership": {
                        "payable_category": "seller",
                        "payable_by": ""
                      },
                      "payable_category": "seller",
                      "promo_code": null,
                      "promo_id": "642fe329ed159b7aa743a293",
                      "promo_type": "percentage",
                      "promotion_group": "product",
                      "return_allowed": true
                    }
                  ],
                  "apply_exclusive": null,
                  "available": [],
                  "cancellation_allowed": true,
                  "exclusive_promo_applied": false,
                  "mrp_promo_applied": false,
                  "return_allowed": true
                },
                "quantity": 1,
                "quantity_assign_status": false,
                "referral_credits": {
                  "amount": {
                    "conversion_rate": 1,
                    "currency_code": "INR",
                    "currency_symbol": "₹",
                    "floor_source_value": 0,
                    "floor_value": 0,
                    "source_currency_code": "FC",
                    "source_currency_symbol": "",
                    "source_value": 0,
                    "value": 0
                  }
                },
                "reload_data_only": true,
                "return_allowed": false,
                "sc_currency": "INR",
                "sc_currency_symbol": "₹",
                "selling_price": {
                  "conversion_rate": 1,
                  "currency_code": "INR",
                  "currency_symbol": "₹",
                  "floor_source_value": 3899,
                  "floor_value": 3899,
                  "source_currency_code": "INR",
                  "source_currency_symbol": "₹",
                  "source_value": 3899,
                  "value": 3899
                },
                "service_item_meta": {
                  "product_group_tags": null,
                  "products": null
                },
                "size_level_total_qty": 1,
                "sizes": [
                  "34"
                ],
                "split_article_id": "633527e850dfb8e73e6de996_0",
                "split_index": 0,
                "store_id": 4187,
                "store_info": {
                  "store_id": 4187,
                  "s_city": "HYDERABAD",
                  "store_name": "AND Inorbit Hyderabad",
                  "store_type": "mall",
                  "store_pincode": 500081,
                  "latitude": 17.4343693,
                  "longitude": 78.3866087
                },
                "strategy_validation_data": {},
                "tags": [
                  "rule#1"
                ],
                "total_gst_amount": 167.1,
                "total_value_of_good": 3342,
                "transfer_price": {
                  "conversion_rate": 1,
                  "currency_code": "INR",
                  "currency_symbol": "₹",
                  "floor_source_value": 0,
                  "floor_value": 0,
                  "source_currency_code": "INR",
                  "source_currency_symbol": "₹",
                  "source_value": 0,
                  "value": 0
                },
                "unit_price": {
                  "conversion_rate": 1,
                  "currency_code": "INR",
                  "currency_symbol": "₹",
                  "floor_source_value": 3509.1,
                  "floor_value": 3509.1,
                  "source_currency_code": "INR",
                  "source_currency_symbol": "₹",
                  "source_value": 3509.1,
                  "value": 3509.1
                },
                "valid_inventory": true,
                "value_of_good": 3342,
                "verify_article": false
              }
            }
          },
          "buy_rules": [
            {
              "all_items": null,
              "cart_conditions": {},
              "item_criteria": {
                "item_brand": [
                  18
                ]
              },
              "mrp_promo": false,
              "slug": "rule#1"
            }
          ],
          "buy_rules_map": {
            "rule#1": {
              "item_brand": [
                18
              ]
            }
          },
          "calculate_on": "esp",
          "cancellation_allowed": true,
          "code": null,
          "discount": 389.9,
          "discount_rules": [
            {
              "all_items": null,
              "buy_condition": "( rule#1 )",
              "item_criteria": {
                "buy_rules": [
                  "rule#1"
                ]
              },
              "matched_buy_rules": [
                "rule#1"
              ],
              "offer": {
                "discount_percentage": 10
              },
              "raw_offer": {
                "item_criteria": {
                  "buy_rules": [
                    "rule#1"
                  ]
                },
                "buy_condition": "( rule#1 )",
                "discount_type": "percentage",
                "offer": {
                  "discount_percentage": 10
                }
              },
              "type": "percentage"
            }
          ],
          "id": "642fe329ed159b7aa743a293",
          "mrp_promo": false,
          "offer_text": "10% of on NIKE Jeans",
          "ownership": {
            "payable_category": "seller",
            "payable_by": ""
          },
          "payable_category": "seller",
          "priority": 1,
          "promo_group": "product",
          "remaining_allowed_qty": null,
          "restrictions": {
            "uses": {
              "maximum": {
                "user": 0,
                "total": 0
              },
              "remaining": {
                "user": 0,
                "total": 0
              }
            },
            "user_groups": [],
            "post_order": {
              "return_allowed": true,
              "cancellation_allowed": true
            },
            "user_id": [],
            "payments": [],
            "user_registered": {
              "start": null,
              "end": null
            },
            "platforms": [
              "web",
              "android",
              "ios"
            ],
            "anonymous_users": true
          },
          "return_allowed": true,
          "stackable": true,
          "type": "percentage",
          "usage_meta": null
        }
      ],
      "breakup_values": {
        "display": [
          {
            "display": "MRP Total",
            "key": "mrp_total",
            "value": 17486,
            "currency_code": "INR"
          },
          {
            "display": "Discount",
            "key": "discount",
            "value": -3540,
            "currency_code": "INR"
          },
          {
            "display": "Subtotal",
            "key": "subtotal",
            "value": 13946,
            "currency_code": "INR"
          },
          {
            "display": "Total",
            "key": "total",
            "value": 13946,
            "currency_code": "INR"
          }
        ],
        "raw": {
          "cod_charge": 0,
          "convenience_fee": 0,
          "coupon": 0,
          "delivery_charge": 0,
          "discount": -3540,
          "fynd_cash": 0,
          "gst_charges": 1529.96,
          "mrp_total": 17486,
          "subtotal": 13946,
          "total": 13946,
          "vog": 12416.04,
          "you_saved": 0
        },
        "loyalty_points": {
          "total": 0,
          "applicable": 0,
          "is_applied": false,
          "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
        },
        "coupon": {
          "type": "cash",
          "code": "",
          "uid": null,
          "value": 0,
          "is_applied": false,
          "message": "Sorry! Invalid Coupon"
        }
      },
      "items": [
        {
          "key": "751083_10",
          "parent_item_identifiers": {
            "identifier": "ZASFF",
            "parent_item_id": 7501190,
            "parent_item_size": "OS"
          },
          "moq": {},
          "delivery_promise": {
            "timestamp": {
              "min": 1646257339,
              "max": 1646689339
            },
            "formatted": {
              "min": "03 Mar, Thursday",
              "max": "08 Mar, Tuesday"
            }
          },
          "article": {
            "type": "article",
            "uid": "612_9_SE61201_19100302_10",
            "size": "10",
            "seller": {
              "uid": 612,
              "name": "SSR ENTERPRISE"
            },
            "store": {
              "uid": 4431,
              "name": "Motilal Nagar 1, Goregaon"
            },
            "quantity": 4,
            "price": {
              "base": {
                "marked": 3999,
                "effective": 2399,
                "currency_code": "INR"
              },
              "converted": {
                "marked": 3999,
                "effective": 2399,
                "currency_code": "INR"
              }
            }
          },
          "price": {
            "base": {
              "add_on": 4798,
              "marked": 7998,
              "effective": 4798,
              "selling": 4798,
              "currency_code": "INR"
            },
            "converted": {
              "add_on": 4798,
              "marked": 7998,
              "effective": 4798,
              "selling": 4798,
              "currency_code": "INR"
            }
          },
          "availability": {
            "sizes": [
              "10"
            ],
            "available_sizes": [
              {
                "is_available": true,
                "display": "OS",
                "value": "OS"
              }
            ],
            "other_store_quantity": 2,
            "out_of_stock": false,
            "deliverable": true,
            "is_valid": true
          },
          "product": {
            "type": "product",
            "uid": 751083,
            "name": "Carson 2",
            "slug": "puma-carson-2-751083-6ad98d",
            "brand": {
              "uid": 9,
              "name": "Puma"
            },
            "categories": [
              {
                "uid": 165,
                "name": "Outdoor Sports Shoes"
              }
            ],
            "images": [
              {
                "aspect_ratio": "16:25",
                "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/9_19100302/1_1542807042296.jpg",
                "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/9_19100302/1_1542807042296.jpg"
              }
            ],
            "action": {
              "type": "product",
              "url": "https://api.addsale.com/platform/content/v1/products/puma-carson-2-751083-6ad98d/",
              "query": {
                "product_slug": [
                  "puma-carson-2-751083-6ad98d"
                ]
              }
            }
          },
          "coupon_message": "",
          "quantity": 2,
          "message": "",
          "bulk_offer": {},
          "discount": "41% OFF"
        },
        {
          "key": "246228_S",
          "moq": {},
          "delivery_promise": {
            "timestamp": {
              "min": 1646257339,
              "max": 1646689339
            },
            "formatted": {
              "min": "03 Mar, Thursday",
              "max": "08 Mar, Tuesday"
            }
          },
          "article": {
            "type": "article",
            "uid": "46_235_TM62_M11029ONDSXNS_S",
            "size": "S",
            "seller": {
              "uid": 46,
              "name": "RELIANCE BRANDS LIMITED"
            },
            "store": {
              "uid": 4550,
              "name": "VR Mall"
            },
            "quantity": 1,
            "price": {
              "base": {
                "marked": 4490,
                "effective": 4490,
                "currency_code": "INR"
              },
              "converted": {
                "marked": 4490,
                "effective": 4490,
                "currency_code": "INR"
              }
            }
          },
          "price": {
            "base": {
              "add_on": 4490,
              "marked": 4490,
              "effective": 4490,
              "selling": 4490,
              "currency_code": "INR"
            },
            "converted": {
              "add_on": 4490,
              "marked": 4490,
              "effective": 4490,
              "selling": 4490,
              "currency_code": "INR"
            }
          },
          "availability": {
            "sizes": [
              "L",
              "M",
              "S",
              "XL",
              "XXL"
            ],
            "available_sizes": [
              {
                "is_available": true,
                "display": "OS",
                "value": "OS"
              }
            ],
            "other_store_quantity": 0,
            "out_of_stock": false,
            "deliverable": true,
            "is_valid": true
          },
          "product": {
            "type": "product",
            "uid": 246228,
            "name": "Blue Solid T-Shirt",
            "slug": "superdry-blue-solid-t-shirt-2",
            "brand": {
              "uid": 235,
              "name": "Superdry"
            },
            "categories": [
              {
                "uid": 192,
                "name": "T-Shirts"
              }
            ],
            "images": [
              {
                "aspect_ratio": "16:25",
                "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/235_M11029ONDSXNS/1.jpg",
                "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/235_M11029ONDSXNS/1.jpg"
              }
            ],
            "action": {
              "type": "product",
              "url": "https://api.addsale.com/platform/content/v1/products/superdry-blue-solid-t-shirt-2/",
              "query": {
                "product_slug": [
                  "superdry-blue-solid-t-shirt-2"
                ]
              }
            }
          },
          "coupon_message": "",
          "quantity": 1,
          "message": "",
          "bulk_offer": {},
          "discount": ""
        },
        {
          "key": "443175_S",
          "moq": {},
          "delivery_promise": {
            "timestamp": {
              "min": 1646257339,
              "max": 1646689339
            },
            "formatted": {
              "min": "03 Mar, Thursday",
              "max": "08 Mar, Tuesday"
            }
          },
          "article": {
            "type": "article",
            "uid": "162_207_1271_LJ03LBLUDN88_S",
            "size": "S",
            "seller": {
              "uid": 162,
              "name": "GO FASHION INDIA PRIVATE LIMITED"
            },
            "store": {
              "uid": 5784,
              "name": "Vega City mall"
            },
            "quantity": 3,
            "price": {
              "base": {
                "marked": 1599,
                "effective": 1599,
                "currency_code": "INR"
              },
              "converted": {
                "marked": 1599,
                "effective": 1599,
                "currency_code": "INR"
              }
            }
          },
          "price": {
            "base": {
              "add_on": 1599,
              "marked": 1599,
              "effective": 1599,
              "selling": 1599,
              "currency_code": "INR"
            },
            "converted": {
              "add_on": 1599,
              "marked": 1599,
              "effective": 1599,
              "selling": 1599,
              "currency_code": "INR"
            }
          },
          "availability": {
            "sizes": [
              "XL",
              "M",
              "L",
              "S"
            ],
            "available_sizes": [
              {
                "is_available": true,
                "display": "OS",
                "value": "OS"
              }
            ],
            "other_store_quantity": 8,
            "out_of_stock": false,
            "deliverable": true,
            "is_valid": true
          },
          "product": {
            "type": "product",
            "uid": 443175,
            "name": "Light Blue Denim Jeggings",
            "slug": "go-colors-light-blue-denim-jeggings-443175-3c688c",
            "brand": {
              "uid": 207,
              "name": "Go Colors"
            },
            "categories": [
              {
                "uid": 267,
                "name": "Jeggings"
              }
            ],
            "images": [
              {
                "aspect_ratio": "16:25",
                "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/207_LJ03LBLUDN88/1_1512382513548.jpg",
                "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/207_LJ03LBLUDN88/1_1512382513548.jpg"
              }
            ],
            "action": {
              "type": "product",
              "url": "https://api.addsale.com/platform/content/v1/products/go-colors-light-blue-denim-jeggings-443175-3c688c/",
              "query": {
                "product_slug": [
                  "go-colors-light-blue-denim-jeggings-443175-3c688c"
                ]
              }
            }
          },
          "coupon_message": "",
          "quantity": 1,
          "message": "",
          "bulk_offer": {},
          "discount": ""
        },
        {
          "key": "778937_OS",
          "moq": {},
          "delivery_promise": {
            "timestamp": {
              "min": 1646257339,
              "max": 1646689339
            },
            "formatted": {
              "min": "03 Mar, Thursday",
              "max": "08 Mar, Tuesday"
            }
          },
          "article": {
            "type": "article",
            "uid": "686_963_IC68601_PWUPC01977_OS",
            "size": "OS",
            "seller": {
              "uid": 686,
              "name": "INDUS CORPORATION"
            },
            "store": {
              "uid": 5059,
              "name": "Vidyaranyapura Main Road"
            },
            "quantity": 3,
            "price": {
              "base": {
                "marked": 3399,
                "effective": 3059,
                "currency_code": "INR"
              },
              "converted": {
                "marked": 3399,
                "effective": 3059,
                "currency_code": "INR"
              }
            }
          },
          "price": {
            "base": {
              "add_on": 3059,
              "marked": 3399,
              "effective": 3059,
              "selling": 3059,
              "currency_code": "INR"
            },
            "converted": {
              "add_on": 3059,
              "marked": 3399,
              "effective": 3059,
              "selling": 3059,
              "currency_code": "INR"
            }
          },
          "availability": {
            "sizes": [
              "OS"
            ],
            "available_sizes": [
              {
                "is_available": true,
                "display": "OS",
                "value": "OS"
              }
            ],
            "other_store_quantity": 2,
            "out_of_stock": false,
            "deliverable": true,
            "is_valid": true
          },
          "product": {
            "type": "product",
            "uid": 778937,
            "name": "Colourful Carnival Bouncer",
            "slug": "fisher-price-colourful-carnival-bouncer-778937-fafa1f",
            "brand": {
              "uid": 963,
              "name": "Fisher-Price"
            },
            "categories": [
              {
                "uid": 576,
                "name": "Cradles"
              }
            ],
            "images": [
              {
                "aspect_ratio": "16:25",
                "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/963_PWUPC01977/1_1545308400588.jpg",
                "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/963_PWUPC01977/1_1545308400588.jpg"
              }
            ],
            "action": {
              "type": "product",
              "url": "https://api.addsale.com/platform/content/v1/products/fisher-price-colourful-carnival-bouncer-778937-fafa1f/",
              "query": {
                "product_slug": [
                  "fisher-price-colourful-carnival-bouncer-778937-fafa1f"
                ]
              }
            }
          },
          "coupon_message": "",
          "quantity": 1,
          "message": "",
          "bulk_offer": {},
          "discount": "11% OFF"
        }
      ],
      "delivery_charge_info": "",
      "coupon_text": "View all offers",
      "buy_now": false,
      "cart_id": 7927,
      "uid": "7927",
      "gstin": null,
      "checkout_mode": "self",
      "last_modified": "Tue, 03 Sep 2019 06:00:43 GMT",
      "restrict_checkout": false,
      "is_valid": true
    },
    "result": {}
  }
}
```
</details>

<details>
<summary><i>&nbsp; Sorry, item is out of stock</i></summary>

```json
{
  "value": {
    "message": "Sorry, item is out of stock",
    "success": false,
    "cart": {
      "breakup_values": {
        "raw": {
          "cod_charge": 0,
          "convenience_fee": 0,
          "coupon": 0,
          "delivery_charge": 0,
          "discount": -202000,
          "fynd_cash": 0,
          "gst_charges": 4804.71,
          "mrp_total": 302899,
          "subtotal": 100899,
          "total": 100899,
          "vog": 96094.29,
          "you_saved": 0
        },
        "coupon": {
          "type": "cash",
          "code": "",
          "uid": null,
          "value": 0,
          "is_applied": false,
          "message": "Sorry! Invalid Coupon"
        },
        "display": [
          {
            "display": "MRP Total",
            "key": "mrp_total",
            "value": 302899,
            "currency_code": "INR"
          },
          {
            "display": "Discount",
            "key": "discount",
            "value": -202000,
            "currency_code": "INR"
          },
          {
            "display": "Subtotal",
            "key": "subtotal",
            "value": 100899,
            "currency_code": "INR"
          },
          {
            "display": "Total",
            "key": "total",
            "value": 100899,
            "currency_code": "INR"
          }
        ],
        "loyalty_points": {
          "total": 0,
          "applicable": 0,
          "is_applied": false,
          "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
        }
      },
      "items": [
        {
          "bulk_offer": {},
          "discount": "67% OFF",
          "parent_item_identifiers": {
            "identifier": "ZASFF",
            "parent_item_id": 7501190,
            "parent_item_size": "OS"
          },
          "article": {
            "type": "article",
            "uid": "604_902_SSTC60401_636BLUE_1",
            "size": "1",
            "seller": {
              "uid": 604,
              "name": "SHRI SHANTINATH TRADING COMPANY"
            },
            "store": {
              "uid": 4579,
              "name": "Gandhi Nagar"
            },
            "quantity": 108,
            "price": {
              "base": {
                "marked": 2999,
                "effective": 999,
                "currency_code": "INR"
              },
              "converted": {
                "marked": 2999,
                "effective": 999,
                "currency_code": "INR"
              }
            }
          },
          "coupon_message": "",
          "key": "707569_1",
          "availability": {
            "sizes": [
              "1",
              "8",
              "7",
              "2",
              "9",
              "5",
              "3",
              "6"
            ],
            "other_store_quantity": 7,
            "out_of_stock": false,
            "deliverable": true,
            "is_valid": true
          },
          "product": {
            "type": "product",
            "uid": 707569,
            "name": "Blue and Gold Printed Ethnic Set",
            "slug": "aj-dezines-blue-and-gold-printed-ethnic-set-707569-bff01a",
            "brand": {
              "uid": 902,
              "name": ""
            },
            "categories": [
              {
                "uid": 525,
                "name": ""
              }
            ],
            "images": [
              {
                "aspect_ratio": "16:25",
                "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/902_636BLUE/1_1540301094877.jpg",
                "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/902_636BLUE/1_1540301094877.jpg"
              }
            ],
            "action": {
              "type": "product",
              "url": "https://api.addsale.com/v1/products/aj-dezines-blue-and-gold-printed-ethnic-set-707569-bff01a/",
              "query": {
                "product_slug": [
                  "aj-dezines-blue-and-gold-printed-ethnic-set-707569-bff01a"
                ]
              }
            }
          },
          "price": {
            "base": {
              "add_on": 100899,
              "marked": 302899,
              "effective": 100899,
              "selling": 100899,
              "currency_code": "INR"
            },
            "converted": {
              "add_on": 100899,
              "marked": 302899,
              "effective": 100899,
              "selling": 100899,
              "currency_code": "INR"
            }
          },
          "message": "",
          "quantity": 101
        }
      ],
      "delivery_charge_info": "",
      "coupon_text": "View all offers",
      "buy_now": false,
      "cart_id": 54,
      "uid": "54",
      "gstin": null,
      "checkout_mode": "self",
      "restrict_checkout": false,
      "is_valid": false,
      "last_modified": "Tue, 03 Sep 2019 09:55:40 GMT"
    },
    "result": {}
  }
}
```
</details>

</details>









---


### updateCart
Update items in the cart




```kotlin
applicationClient.cart.updateCart(id: id, i: i, b: b, areaCode: areaCode, buyNow: buyNow, body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| id | String? | no |  |   
| i | Boolean? | no |  |   
| b | Boolean? | no |  |   
| areaCode | String? | no |  |   
| buyNow | Boolean? | no |  |  
| body | [UpdateCartRequest](#UpdateCartRequest) | yes | Request body |


<p>Use this API to update items added to the cart with the help of a request object containing attributes like item_quantity and item_size. These attributes will be fetched from the following APIs</p> <ul> <li><font color="monochrome">operation</font> Operation for current api call. <b>update_item</b> for update items. <b>remove_item</b> for removing items.</li> <li> <font color="monochrome">item_id</font>  "/platform/content/v1/products/"</li> <li> <font color="monochrome">item_size</font>   "/platform/content/v1/products/:slug/sizes/"</li> <li> <font color="monochrome">quantity</font>  item quantity (must be greater than or equal to 1)</li> <li> <font color="monochrome">article_id</font>   "/content​/v1​/products​/:identifier​/sizes​/price​/"</li> <li> <font color="monochrome">item_index</font>  item position in the cart (must be greater than or equal to 0)</li> </ul>

*Returned Response:*




[UpdateCartDetailResponse](#UpdateCartDetailResponse)

Success. Updates and returns a cart object as shown below. Refer `UpdateCartDetailResponse` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Nothing updated</i></summary>

```json
{
  "value": {
    "cart": {
      "breakup_values": {
        "raw": {
          "cod_charge": 0,
          "convenience_fee": 0,
          "coupon": 0,
          "delivery_charge": 0,
          "discount": -202000,
          "fynd_cash": 0,
          "gst_charges": 4804.71,
          "mrp_total": 302899,
          "subtotal": 100899,
          "total": 100899,
          "vog": 96094.29,
          "you_saved": 0
        },
        "coupon": {
          "type": "cash",
          "code": "",
          "uid": null,
          "value": 0,
          "is_applied": false,
          "message": "Sorry! Invalid Coupon"
        },
        "display": [
          {
            "display": "MRP Total",
            "key": "mrp_total",
            "value": 302899,
            "currency_code": "INR"
          },
          {
            "display": "Discount",
            "key": "discount",
            "value": -202000,
            "currency_code": "INR"
          },
          {
            "display": "Subtotal",
            "key": "subtotal",
            "value": 100899,
            "currency_code": "INR"
          },
          {
            "display": "Total",
            "key": "total",
            "value": 100899,
            "currency_code": "INR"
          }
        ],
        "loyalty_points": {
          "total": 0,
          "applicable": 0,
          "is_applied": false,
          "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
        }
      },
      "items": [
        {
          "bulk_offer": {},
          "discount": "67% OFF",
          "parent_item_identifiers": {
            "identifier": "ZASFF",
            "parent_item_id": 7501190,
            "parent_item_size": "OS"
          },
          "article": {
            "type": "article",
            "uid": "604_902_SSTC60401_636BLUE_1",
            "size": "1",
            "seller": {
              "uid": 604,
              "name": "SHRI SHANTINATH TRADING COMPANY"
            },
            "store": {
              "uid": 4579,
              "name": "Gandhi Nagar"
            },
            "quantity": 108,
            "price": {
              "base": {
                "marked": 2999,
                "effective": 999,
                "currency_code": "INR"
              },
              "converted": {
                "marked": 2999,
                "effective": 999,
                "currency_code": "INR"
              }
            }
          },
          "coupon_message": "",
          "key": "707569_1",
          "availability": {
            "sizes": [
              "1",
              "8",
              "7",
              "2",
              "9",
              "5",
              "3",
              "6"
            ],
            "other_store_quantity": 7,
            "out_of_stock": false,
            "deliverable": true,
            "is_valid": true
          },
          "product": {
            "type": "product",
            "uid": 707569,
            "name": "Blue and Gold Printed Ethnic Set",
            "slug": "aj-dezines-blue-and-gold-printed-ethnic-set-707569-bff01a",
            "brand": {
              "uid": 902,
              "name": ""
            },
            "categories": [
              {
                "uid": 525,
                "name": ""
              }
            ],
            "images": [
              {
                "aspect_ratio": "16:25",
                "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/902_636BLUE/1_1540301094877.jpg",
                "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/902_636BLUE/1_1540301094877.jpg"
              }
            ],
            "action": {
              "type": "product",
              "url": "https://api.addsale.com/v1/products/aj-dezines-blue-and-gold-printed-ethnic-set-707569-bff01a/",
              "query": {
                "product_slug": [
                  "aj-dezines-blue-and-gold-printed-ethnic-set-707569-bff01a"
                ]
              }
            }
          },
          "price": {
            "base": {
              "add_on": 100899,
              "marked": 302899,
              "effective": 100899,
              "selling": 100899,
              "currency_code": "INR"
            },
            "converted": {
              "add_on": 100899,
              "marked": 302899,
              "effective": 100899,
              "selling": 100899,
              "currency_code": "INR"
            }
          },
          "message": "",
          "quantity": 101
        }
      ],
      "delivery_charge_info": "",
      "coupon_text": "View all offers",
      "buy_now": false,
      "cart_id": 54,
      "uid": "54",
      "gstin": null,
      "checkout_mode": "self",
      "restrict_checkout": false,
      "is_valid": true,
      "last_modified": "Tue, 03 Sep 2019 10:19:20 GMT"
    },
    "result": {
      "707569_90": {
        "success": true,
        "message": "Nothing updated"
      }
    },
    "message": "Nothing updated",
    "success": true
  }
}
```
</details>

<details>
<summary><i>&nbsp; Item updated in the cart</i></summary>

```json
{
  "value": {
    "cart": {
      "applied_promo_details": [
        {
          "application_id": "000000000000000000000001",
          "apply_all_offers": false,
          "apply_exclusive": null,
          "buy_article_dict": {
            "rule#1": {
              "633527e850dfb8e73e6de996_0": {
                "added_in_cart": false,
                "added_quantity": 0,
                "amount_paid": 0,
                "applicable_credits": {
                  "conversion_rate": 1,
                  "currency_code": "INR",
                  "currency_symbol": "₹",
                  "floor_source_value": 0,
                  "floor_value": 0,
                  "source_currency_code": "FC",
                  "source_currency_symbol": "",
                  "source_value": 0,
                  "value": 0
                },
                "article_assign_status": true,
                "article_assignment": {
                  "level": "multi-companies",
                  "strategy": "optimal"
                },
                "article_error": {
                  "type": null,
                  "value": null,
                  "message": null
                },
                "article_id": "633527e850dfb8e73e6de996",
                "article_index": "0",
                "article_meta": {
                  "article_id": "633527e850dfb8e73e6de996",
                  "bulk_margin": 0,
                  "bulk_discount": {
                    "conversion_rate": 1,
                    "currency_code": "INR",
                    "currency_symbol": "₹",
                    "floor_source_value": 0,
                    "floor_value": 0,
                    "source_currency_code": "INR",
                    "source_currency_symbol": "₹",
                    "source_value": 0,
                    "value": 0
                  },
                  "bulk_coupon_code": null,
                  "country_of_origin": "India",
                  "dimension": {
                    "width": 70,
                    "unit": "cm",
                    "height": 70,
                    "is_default": true,
                    "length": 70
                  },
                  "fragile": false,
                  "manufacturer": {
                    "address": "10, PALI MALA RD, ADARSH NAGAR, BANDRA WEST,, MAHARASHTRA, MUMBAI",
                    "name": "Sabki Shop",
                    "is_default": true
                  },
                  "weight": {
                    "shipping": 250,
                    "unit": "gram",
                    "is_default": true
                  },
                  "raw_meta": {
                    "fynd_identifier": "4187_3412343256098",
                    "is_set_article": false,
                    "set_quantity": 1
                  },
                  "is_set": false,
                  "set": {},
                  "identifier": {
                    "ean": "3412343256098"
                  },
                  "hsn_code": null,
                  "hsn_code_id": "625fbd96faeed8b3df6ec3ce",
                  "raw_price": {
                    "effective": {
                      "conversion_rate": 1,
                      "currency_code": "INR",
                      "currency_symbol": "₹",
                      "floor_source_value": 3899,
                      "floor_value": 3899,
                      "source_currency_code": "INR",
                      "source_currency_symbol": "₹",
                      "source_value": 3899,
                      "value": 3899
                    },
                    "marked": {
                      "conversion_rate": 1,
                      "currency_code": "INR",
                      "currency_symbol": "₹",
                      "floor_source_value": 3899,
                      "floor_value": 3899,
                      "source_currency_code": "INR",
                      "source_currency_symbol": "₹",
                      "source_value": 3899,
                      "value": 3899
                    },
                    "transfer": {
                      "conversion_rate": 1,
                      "currency_code": "INR",
                      "currency_symbol": "₹",
                      "floor_source_value": 0,
                      "floor_value": 0,
                      "source_currency_code": "INR",
                      "source_currency_symbol": "₹",
                      "source_value": 0,
                      "value": 0
                    }
                  },
                  "seller_identifier": "3412343256098",
                  "_custom_json": {},
                  "tags": [],
                  "return_config": {
                    "time": 0,
                    "unit": "days",
                    "returnable": false
                  }
                },
                "attributes": {
                  "essential": "No",
                  "item_code": "BSFJ2-12608",
                  "gender": [
                    "Men"
                  ],
                  "denim_type": "Solid",
                  "pattern": "Solid",
                  "product_fit": "Slim",
                  "currency": "INR",
                  "media": [
                    {
                      "type": "image",
                      "meta": {
                        "brand": "nike",
                        "item_code": "BSFJ2-12608",
                        "sequence": 0
                      },
                      "url": "https://hdn-1.addsale.com/addsale/products/pictures/item/free/original/nike/BSFJ2-12608/0/jMpkpyx17w-GWQjymow3-Black-Slim-Fit-Jeans.jpeg"
                    }
                  ],
                  "name": "Nike Jeans 12608",
                  "brand_name": "Nike"
                },
                "avl_qty": 97,
                "brand_id": 18,
                "bulk_coupon_applied": false,
                "bulk_coupon_code": null,
                "bulk_discount": {
                  "conversion_rate": 1,
                  "currency_code": "INR",
                  "currency_symbol": "₹",
                  "floor_source_value": 0,
                  "floor_value": 0,
                  "source_currency_code": "INR",
                  "source_currency_symbol": "₹",
                  "source_value": 0,
                  "value": 0
                },
                "bulk_margin": 0,
                "cancellation_allowed": true,
                "cashback": {
                  "amount": {
                    "conversion_rate": 1,
                    "currency_code": "INR",
                    "currency_symbol": "₹",
                    "floor_source_value": 0,
                    "floor_value": 0,
                    "source_currency_code": "FC",
                    "source_currency_symbol": "",
                    "source_value": 0,
                    "value": 0
                  }
                },
                "category_id": [
                  150
                ],
                "cod_charges": {
                  "amount": {
                    "conversion_rate": 1,
                    "currency_code": "INR",
                    "currency_symbol": "₹",
                    "floor_source_value": 0,
                    "floor_value": 0,
                    "source_currency_code": "INR",
                    "source_currency_symbol": "₹",
                    "source_value": 0,
                    "value": 0
                  }
                },
                "company_id": 2,
                "company_info": {
                  "company_id": 2,
                  "c_name": "Sabki Shop",
                  "c_taxes": [
                    {
                      "rate": 15,
                      "enable": true,
                      "effective_date": "2022-06-05T18:29:23.904000"
                    }
                  ],
                  "company_cin": "U45200MH1992PTC066474"
                },
                "company_taxes": [
                  {
                    "rate": 15,
                    "enable": true,
                    "effective_date": "2022-06-05T18:29:23.904000"
                  }
                ],
                "coupon": {
                  "amount": {
                    "conversion_rate": 1,
                    "currency_code": "INR",
                    "currency_symbol": "₹",
                    "floor_source_value": 0,
                    "floor_value": 0,
                    "source_currency_code": "INR",
                    "source_currency_symbol": "₹",
                    "source_value": 0,
                    "value": 0
                  },
                  "article_count": 0,
                  "cancellation_allowed": true,
                  "return_allowed": true
                },
                "currency_dict": {
                  "code": "INR",
                  "rate": 1
                },
                "custom_meta": {},
                "data": {},
                "delivery_charges": {
                  "amount": {
                    "conversion_rate": 1,
                    "currency_code": "INR",
                    "currency_symbol": "₹",
                    "floor_source_value": 0,
                    "floor_value": 0,
                    "source_currency_code": "INR",
                    "source_currency_symbol": "₹",
                    "source_value": 0,
                    "value": 0
                  }
                },
                "delivery_error_msg": "",
                "delivery_promise": {
                  "timestamp": {
                    "min": 1646257339,
                    "max": 1646689339
                  },
                  "formatted": {
                    "min": "03 Mar, Thursday",
                    "max": "08 Mar, Tuesday"
                  }
                },
                "departments": [
                  99
                ],
                "discount": 0,
                "discount_applied": {},
                "dt_currency": "INR",
                "dt_currency_symbol": "₹",
                "esp_modified": false,
                "extra_meta": {},
                "float_amount_paid": 0,
                "free_gift_items_meta": {},
                "group_id": "",
                "gst_amount": 167.1,
                "gst_tax_percentage": 5,
                "hsn_code": null,
                "hsn_code_id": "625fbd96faeed8b3df6ec3ce",
                "identifiers": {
                  "identifier": "BDnwAINORr6SlTKxZN3w"
                },
                "image_nature": "standard",
                "include": true,
                "is_valid": true,
                "item_id": 75660796,
                "item_size": "34",
                "last_update_at": 1680852767,
                "meta": {},
                "net_price": {
                  "conversion_rate": 1,
                  "currency_code": "INR",
                  "currency_symbol": "₹",
                  "floor_source_value": 3509.1,
                  "floor_value": 3509.1,
                  "source_currency_code": "INR",
                  "source_currency_symbol": "₹",
                  "source_value": 3509.1,
                  "value": 3509.1
                },
                "old_price": {
                  "conversion_rate": 1,
                  "currency_code": "INR",
                  "currency_symbol": "₹",
                  "floor_source_value": 3899,
                  "floor_value": 3899,
                  "source_currency_code": "INR",
                  "source_currency_symbol": "₹",
                  "source_value": 3899,
                  "value": 3899
                },
                "original_price_effective": {
                  "conversion_rate": 1,
                  "currency_code": "INR",
                  "currency_symbol": "₹",
                  "floor_source_value": 3899,
                  "floor_value": 3899,
                  "source_currency_code": "INR",
                  "source_currency_symbol": "₹",
                  "source_value": 3899,
                  "value": 3899
                },
                "original_unit_price": {
                  "conversion_rate": 1,
                  "currency_code": "INR",
                  "currency_symbol": "₹",
                  "floor_source_value": 3899,
                  "floor_value": 3899,
                  "source_currency_code": "INR",
                  "source_currency_symbol": "₹",
                  "source_value": 3899,
                  "value": 3899
                },
                "parent_item_identifiers": {
                  "identifier": null,
                  "parent_item_size": null,
                  "parent_item_id": null
                },
                "pickup_stores": [],
                "price": {
                  "conversion_rate": 1,
                  "currency_code": "INR",
                  "currency_symbol": "₹",
                  "floor_source_value": 3899,
                  "floor_value": 3899,
                  "source_currency_code": "INR",
                  "source_currency_symbol": "₹",
                  "source_value": 3899,
                  "value": 3899
                },
                "price_effective": {
                  "conversion_rate": 1,
                  "currency_code": "INR",
                  "currency_symbol": "₹",
                  "floor_source_value": 3899,
                  "floor_value": 3899,
                  "source_currency_code": "INR",
                  "source_currency_symbol": "₹",
                  "source_value": 3899,
                  "value": 3899
                },
                "price_marked": {
                  "conversion_rate": 1,
                  "currency_code": "INR",
                  "currency_symbol": "₹",
                  "floor_source_value": 3899,
                  "floor_value": 3899,
                  "source_currency_code": "INR",
                  "source_currency_symbol": "₹",
                  "source_value": 3899,
                  "value": 3899
                },
                "product_tags": [],
                "promotions": {
                  "amount": {
                    "conversion_rate": 1,
                    "currency_code": "INR",
                    "currency_symbol": "₹",
                    "floor_source_value": 0,
                    "floor_value": 0,
                    "source_currency_code": "INR",
                    "source_currency_symbol": "₹",
                    "source_value": 0,
                    "value": 0
                  },
                  "applied": [
                    {
                      "amount": {
                        "conversion_rate": 1,
                        "currency_code": "INR",
                        "currency_symbol": "₹",
                        "floor_source_value": 389.9,
                        "floor_value": 389.9,
                        "source_currency_code": "INR",
                        "source_currency_symbol": "₹",
                        "source_value": 389.9,
                        "value": 389.9
                      },
                      "applied_discounts": [
                        {
                          "type": "percentage",
                          "value": 10
                        }
                      ],
                      "applied_free_articles": [],
                      "apply_exclusive": null,
                      "article_quantity": 1,
                      "buy_rules": [
                        {
                          "all_items": null,
                          "cart_conditions": {},
                          "item_criteria": {
                            "item_brand": [
                              18
                            ]
                          },
                          "mrp_promo": false,
                          "slug": "rule#1"
                        }
                      ],
                      "cancellation_allowed": true,
                      "discount_rules": [
                        {
                          "all_items": null,
                          "buy_condition": "( rule#1 )",
                          "item_criteria": {
                            "buy_rules": [
                              "rule#1"
                            ]
                          },
                          "matched_buy_rules": [
                            "rule#1"
                          ],
                          "offer": {
                            "discount_percentage": 10
                          },
                          "raw_offer": {
                            "item_criteria": {
                              "buy_rules": [
                                "rule#1"
                              ]
                            },
                            "buy_condition": "( rule#1 )",
                            "discount_type": "percentage",
                            "offer": {
                              "discount_percentage": 10
                            }
                          },
                          "type": "percentage"
                        }
                      ],
                      "mrp_promo": false,
                      "offer_text": "10% of on NIKE Jeans",
                      "ownership": {
                        "payable_category": "seller",
                        "payable_by": ""
                      },
                      "payable_category": "seller",
                      "promo_code": null,
                      "promo_id": "642fe329ed159b7aa743a293",
                      "promo_type": "percentage",
                      "promotion_group": "product",
                      "return_allowed": true
                    }
                  ],
                  "apply_exclusive": null,
                  "available": [],
                  "cancellation_allowed": true,
                  "exclusive_promo_applied": false,
                  "mrp_promo_applied": false,
                  "return_allowed": true
                },
                "quantity": 1,
                "quantity_assign_status": false,
                "referral_credits": {
                  "amount": {
                    "conversion_rate": 1,
                    "currency_code": "INR",
                    "currency_symbol": "₹",
                    "floor_source_value": 0,
                    "floor_value": 0,
                    "source_currency_code": "FC",
                    "source_currency_symbol": "",
                    "source_value": 0,
                    "value": 0
                  }
                },
                "reload_data_only": true,
                "return_allowed": false,
                "sc_currency": "INR",
                "sc_currency_symbol": "₹",
                "selling_price": {
                  "conversion_rate": 1,
                  "currency_code": "INR",
                  "currency_symbol": "₹",
                  "floor_source_value": 3899,
                  "floor_value": 3899,
                  "source_currency_code": "INR",
                  "source_currency_symbol": "₹",
                  "source_value": 3899,
                  "value": 3899
                },
                "service_item_meta": {
                  "product_group_tags": null,
                  "products": null
                },
                "size_level_total_qty": 1,
                "sizes": [
                  "34"
                ],
                "split_article_id": "633527e850dfb8e73e6de996_0",
                "split_index": 0,
                "store_id": 4187,
                "store_info": {
                  "store_id": 4187,
                  "s_city": "HYDERABAD",
                  "store_name": "AND Inorbit Hyderabad",
                  "store_type": "mall",
                  "store_pincode": 500081,
                  "latitude": 17.4343693,
                  "longitude": 78.3866087
                },
                "strategy_validation_data": {},
                "tags": [
                  "rule#1"
                ],
                "total_gst_amount": 167.1,
                "total_value_of_good": 3342,
                "transfer_price": {
                  "conversion_rate": 1,
                  "currency_code": "INR",
                  "currency_symbol": "₹",
                  "floor_source_value": 0,
                  "floor_value": 0,
                  "source_currency_code": "INR",
                  "source_currency_symbol": "₹",
                  "source_value": 0,
                  "value": 0
                },
                "unit_price": {
                  "conversion_rate": 1,
                  "currency_code": "INR",
                  "currency_symbol": "₹",
                  "floor_source_value": 3509.1,
                  "floor_value": 3509.1,
                  "source_currency_code": "INR",
                  "source_currency_symbol": "₹",
                  "source_value": 3509.1,
                  "value": 3509.1
                },
                "valid_inventory": true,
                "value_of_good": 3342,
                "verify_article": false
              }
            }
          },
          "buy_rules": [
            {
              "all_items": null,
              "cart_conditions": {},
              "item_criteria": {
                "item_brand": [
                  18
                ]
              },
              "mrp_promo": false,
              "slug": "rule#1"
            }
          ],
          "buy_rules_map": {
            "rule#1": {
              "item_brand": [
                18
              ]
            }
          },
          "calculate_on": "esp",
          "cancellation_allowed": true,
          "code": null,
          "discount": 389.9,
          "discount_rules": [
            {
              "all_items": null,
              "buy_condition": "( rule#1 )",
              "item_criteria": {
                "buy_rules": [
                  "rule#1"
                ]
              },
              "matched_buy_rules": [
                "rule#1"
              ],
              "offer": {
                "discount_percentage": 10
              },
              "raw_offer": {
                "item_criteria": {
                  "buy_rules": [
                    "rule#1"
                  ]
                },
                "buy_condition": "( rule#1 )",
                "discount_type": "percentage",
                "offer": {
                  "discount_percentage": 10
                }
              },
              "type": "percentage"
            }
          ],
          "id": "642fe329ed159b7aa743a293",
          "mrp_promo": false,
          "offer_text": "10% of on NIKE Jeans",
          "ownership": {
            "payable_category": "seller",
            "payable_by": ""
          },
          "payable_category": "seller",
          "priority": 1,
          "promo_group": "product",
          "remaining_allowed_qty": null,
          "restrictions": {
            "uses": {
              "maximum": {
                "user": 0,
                "total": 0
              },
              "remaining": {
                "user": 0,
                "total": 0
              }
            },
            "user_groups": [],
            "post_order": {
              "return_allowed": true,
              "cancellation_allowed": true
            },
            "user_id": [],
            "payments": [],
            "user_registered": {
              "start": null,
              "end": null
            },
            "platforms": [
              "web",
              "android",
              "ios"
            ],
            "anonymous_users": true
          },
          "return_allowed": true,
          "stackable": true,
          "type": "percentage",
          "usage_meta": null
        }
      ],
      "breakup_values": {
        "coupon": {
          "type": "cash",
          "code": "",
          "uid": null,
          "value": 0,
          "is_applied": false,
          "message": "Sorry! Invalid Coupon"
        },
        "loyalty_points": {
          "total": 0,
          "applicable": 0,
          "is_applied": false,
          "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
        },
        "raw": {
          "cod_charge": 0,
          "convenience_fee": 0,
          "coupon": 0,
          "delivery_charge": 0,
          "discount": 0,
          "fynd_cash": 0,
          "gst_charges": 838.83,
          "mrp_total": 5499,
          "subtotal": 5499,
          "total": 5499,
          "vog": 4660.17,
          "you_saved": 0
        },
        "display": [
          {
            "display": "MRP Total",
            "key": "mrp_total",
            "value": 5499,
            "currency_code": "INR"
          },
          {
            "display": "Subtotal",
            "key": "subtotal",
            "value": 5499,
            "currency_code": "INR"
          },
          {
            "display": "Total",
            "key": "total",
            "value": 5499,
            "currency_code": "INR"
          }
        ]
      },
      "items": [
        {
          "key": "437414_7",
          "message": "",
          "bulk_offer": {},
          "price": {
            "base": {
              "add_on": 5499,
              "marked": 5499,
              "effective": 5499,
              "selling": 5499,
              "currency_code": "INR"
            },
            "converted": {
              "add_on": 5499,
              "marked": 5499,
              "effective": 5499,
              "selling": 5499,
              "currency_code": "INR"
            }
          },
          "quantity": 1,
          "discount": "",
          "product": {
            "type": "product",
            "uid": 437414,
            "name": "Suede Classic",
            "slug": "puma-suede-classic-437414-6e6bbf",
            "brand": {
              "uid": 9,
              "name": "Puma"
            },
            "categories": [
              {
                "uid": 165,
                "name": "Outdoor Sports Shoes"
              }
            ],
            "images": [
              {
                "aspect_ratio": "16:25",
                "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/9_35656851/1_1511171811830.jpg",
                "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/9_35656851/1_1511171811830.jpg"
              }
            ],
            "action": {
              "type": "product",
              "url": "https://api.addsale.com/platform/content/v1/products/puma-suede-classic-437414-6e6bbf/",
              "query": {
                "product_slug": [
                  "puma-suede-classic-437414-6e6bbf"
                ]
              }
            }
          },
          "parent_item_identifiers": {
            "identifier": "ZASFF",
            "parent_item_id": 7501190,
            "parent_item_size": "OS"
          },
          "moq": {},
          "delivery_promise": {
            "timestamp": {
              "min": 1646257339,
              "max": 1646689339
            },
            "formatted": {
              "min": "03 Mar, Thursday",
              "max": "08 Mar, Tuesday"
            }
          },
          "article": {
            "type": "article",
            "uid": "507_9_96099_35656851_7",
            "size": "7",
            "seller": {
              "uid": 507,
              "name": "PUMA SPORTS INDIA PVT LTD"
            },
            "store": {
              "uid": 3632,
              "name": "Colaba Causway"
            },
            "quantity": 5,
            "price": {
              "base": {
                "marked": 5499,
                "effective": 5499,
                "currency_code": "INR"
              },
              "converted": {
                "marked": 5499,
                "effective": 5499,
                "currency_code": "INR"
              }
            }
          },
          "coupon_message": "",
          "availability": {
            "available_sizes": [
              {
                "is_available": true,
                "display": "OS",
                "value": "OS"
              }
            ],
            "sizes": [
              "10",
              "11",
              "6",
              "9",
              "7",
              "8"
            ],
            "other_store_quantity": 22,
            "out_of_stock": false,
            "deliverable": true,
            "is_valid": true
          }
        }
      ],
      "delivery_charge_info": "",
      "coupon_text": "View all offers",
      "buy_now": false,
      "cart_id": 12426,
      "uid": "12426",
      "gstin": null,
      "checkout_mode": "self",
      "last_modified": "Thu, 22 Aug 2019 04:51:42 GMT",
      "restrict_checkout": false,
      "is_valid": true
    },
    "result": {
      "437414_7": {
        "success": true,
        "message": "Item updated in the bag"
      }
    },
    "message": "Item updated in the bag",
    "success": true
  }
}
```
</details>

</details>









---


### getItemCount
Count items in the cart




```kotlin
applicationClient.cart.getItemCount(id: id, buyNow: buyNow).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| id | String? | no | The unique identifier of the cart. |   
| buyNow | Boolean? | no |  |  



Use this API to get the total number of items present in cart.

*Returned Response:*




[CartItemCountResponse](#CartItemCountResponse)

Success. Returns the total count of items in a user's cart.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "user_cart_items_count": 0
}
```
</details>









---


### getCoupons
Fetch Coupon




```kotlin
applicationClient.cart.getCoupons(id: id, buyNow: buyNow).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| id | String? | no |  |   
| buyNow | Boolean? | no |  |  



Use this API to get a list of available coupons along with their details.

*Returned Response:*




[GetCouponResponse](#GetCouponResponse)

Success. Returns a coupon object which has a list of all the eligible coupons. Refer `GetCouponResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "available_coupon_list": [
    {
      "coupon_value": 500,
      "minimum_cart_value": 0,
      "coupon_code": "RAJA500",
      "title": "RAJA500 | Fynd coupon",
      "sub_title": "NA",
      "message": "TEST500",
      "max_discount_value": 500,
      "uid": 17921,
      "is_applicable": true,
      "is_applied": false,
      "expires_on": "28 Aug, 19"
    },
    {
      "coupon_value": 2250,
      "minimum_cart_value": 0,
      "coupon_code": "PRISMC22250111",
      "title": "celio 2 time coupn to kalim hsp",
      "sub_title": "celio 2 time coupn to kalim hsp",
      "message": "celio 2 time coupn to kalim hsp",
      "max_discount_value": 2250,
      "uid": 17743,
      "is_applicable": true,
      "is_applied": false,
      "expires_on": "24 Jan, 20"
    }
  ],
  "page": {
    "current": 1,
    "total": 0,
    "has_previous": false,
    "has_next": false,
    "total_item_count": 0
  }
}
```
</details>









---


### applyCoupon
Apply Coupon




```kotlin
applicationClient.cart.applyCoupon(i: i, b: b, p: p, id: id, buyNow: buyNow, body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| i | Boolean? | no |  |   
| b | Boolean? | no |  |   
| p | Boolean? | no |  |   
| id | String? | no |  |   
| buyNow | Boolean? | no |  |  
| body | [ApplyCouponRequest](#ApplyCouponRequest) | yes | Request body |


Use this API to apply coupons on items in the cart.

*Returned Response:*




[CartDetailResponse](#CartDetailResponse)

Success. Returns coupons applied to the cart along with item details and price breakup. Refer `CartDetailResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "breakup_values": {
    "raw": {
      "cod_charge": 0,
      "convenience_fee": 0,
      "coupon": -2250,
      "delivery_charge": 0,
      "discount": -7240.2163,
      "fynd_cash": 0,
      "gst_charges": 2139.08,
      "mrp_total": 26983,
      "subtotal": 19742.7837,
      "total": 17492.7837,
      "vog": 15353.7,
      "you_saved": 0
    },
    "coupon": {
      "type": "cash",
      "code": "PRISMC22250111",
      "uid": 17743,
      "value": 2250,
      "is_applied": true,
      "message": "coupn applied"
    },
    "loyalty_points": {
      "total": 0,
      "applicable": 0,
      "is_applied": false,
      "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
    },
    "display": [
      {
        "display": "MRP Total",
        "key": "mrp_total",
        "value": 26983,
        "currency_code": "INR"
      },
      {
        "display": "Discount",
        "key": "discount",
        "value": -7240,
        "currency_code": "INR"
      },
      {
        "display": "Subtotal",
        "key": "subtotal",
        "value": 19743,
        "currency_code": "INR"
      },
      {
        "display": "Coupon",
        "key": "coupon",
        "value": -2250,
        "currency_code": "INR"
      },
      {
        "display": "Total",
        "key": "total",
        "value": 17493,
        "currency_code": "INR"
      }
    ]
  },
  "items": [
    {
      "availability": {
        "sizes": [
          "10"
        ],
        "other_store_quantity": 0,
        "out_of_stock": false,
        "deliverable": true,
        "is_valid": true
      },
      "product": {
        "type": "product",
        "uid": 751083,
        "name": "Carson 2",
        "slug": "puma-carson-2-751083-6ad98d",
        "brand": {
          "uid": 9,
          "name": "Puma"
        },
        "categories": [
          {
            "uid": 165,
            "name": "Outdoor Sports Shoes"
          }
        ],
        "images": [
          {
            "aspect_ratio": "16:25",
            "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/9_19100302/1_1542807042296.jpg",
            "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/9_19100302/1_1542807042296.jpg"
          }
        ],
        "action": {
          "type": "product",
          "url": "https://api.addsale.com/platform/content/v1/products/puma-carson-2-751083-6ad98d/",
          "query": {
            "product_slug": [
              "puma-carson-2-751083-6ad98d"
            ]
          }
        }
      },
      "quantity": 4,
      "discount": "41% OFF",
      "price": {
        "base": {
          "add_on": 9596,
          "marked": 15996,
          "effective": 9596,
          "selling": 9596,
          "currency_code": "INR"
        },
        "converted": {
          "add_on": 9596,
          "marked": 15996,
          "effective": 9596,
          "selling": 9596,
          "currency_code": "INR"
        }
      },
      "message": "",
      "bulk_offer": {},
      "key": "751083_10",
      "coupon_message": "",
      "article": {
        "type": "article",
        "uid": "612_9_SE61201_19100302_10",
        "size": "10",
        "seller": {
          "uid": 612,
          "name": "SSR ENTERPRISE"
        },
        "store": {
          "uid": 4431,
          "name": "Motilal Nagar 1, Goregaon"
        },
        "quantity": 4,
        "price": {
          "base": {
            "marked": 3999,
            "effective": 2399,
            "currency_code": "INR"
          },
          "converted": {
            "marked": 3999,
            "effective": 2399,
            "currency_code": "INR"
          }
        }
      }
    },
    {
      "availability": {
        "sizes": [
          "L",
          "M",
          "S",
          "XL",
          "XXL"
        ],
        "other_store_quantity": 0,
        "out_of_stock": false,
        "deliverable": true,
        "is_valid": true
      },
      "product": {
        "type": "product",
        "uid": 246228,
        "name": "Blue Solid T-Shirt",
        "slug": "superdry-blue-solid-t-shirt-2",
        "brand": {
          "uid": 235,
          "name": "Superdry"
        },
        "categories": [
          {
            "uid": 192,
            "name": "T-Shirts"
          }
        ],
        "images": [
          {
            "aspect_ratio": "16:25",
            "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/235_M11029ONDSXNS/1.jpg",
            "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/235_M11029ONDSXNS/1.jpg"
          }
        ],
        "action": {
          "type": "product",
          "url": "https://api.addsale.com/platform/content/v1/products/superdry-blue-solid-t-shirt-2/",
          "query": {
            "product_slug": [
              "superdry-blue-solid-t-shirt-2"
            ]
          }
        }
      },
      "quantity": 1,
      "discount": "",
      "price": {
        "base": {
          "add_on": 4490,
          "marked": 4490,
          "effective": 4490,
          "selling": 4490,
          "currency_code": "INR"
        },
        "converted": {
          "add_on": 4490,
          "marked": 4490,
          "effective": 4490,
          "selling": 4490,
          "currency_code": "INR"
        }
      },
      "message": "",
      "bulk_offer": {},
      "key": "246228_S",
      "coupon_message": "",
      "article": {
        "type": "article",
        "uid": "46_235_TM62_M11029ONDSXNS_S",
        "size": "S",
        "seller": {
          "uid": 46,
          "name": "RELIANCE BRANDS LIMITED"
        },
        "store": {
          "uid": 4550,
          "name": "VR Mall"
        },
        "quantity": 1,
        "price": {
          "base": {
            "marked": 4490,
            "effective": 4490,
            "currency_code": "INR"
          },
          "converted": {
            "marked": 4490,
            "effective": 4490,
            "currency_code": "INR"
          }
        }
      }
    },
    {
      "availability": {
        "sizes": [
          "XL",
          "M",
          "L",
          "S"
        ],
        "other_store_quantity": 8,
        "out_of_stock": false,
        "deliverable": true,
        "is_valid": true
      },
      "product": {
        "type": "product",
        "uid": 443175,
        "name": "Light Blue Denim Jeggings",
        "slug": "go-colors-light-blue-denim-jeggings-443175-3c688c",
        "brand": {
          "uid": 207,
          "name": "Go Colors"
        },
        "categories": [
          {
            "uid": 267,
            "name": "Jeggings"
          }
        ],
        "images": [
          {
            "aspect_ratio": "16:25",
            "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/207_LJ03LBLUDN88/1_1512382513548.jpg",
            "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/207_LJ03LBLUDN88/1_1512382513548.jpg"
          }
        ],
        "action": {
          "type": "product",
          "url": "https://api.addsale.com/platform/content/v1/products/go-colors-light-blue-denim-jeggings-443175-3c688c/",
          "query": {
            "product_slug": [
              "go-colors-light-blue-denim-jeggings-443175-3c688c"
            ]
          }
        }
      },
      "quantity": 1,
      "discount": "",
      "price": {
        "base": {
          "add_on": 1599,
          "marked": 1599,
          "effective": 1599,
          "selling": 1599,
          "currency_code": "INR"
        },
        "converted": {
          "add_on": 1599,
          "marked": 1599,
          "effective": 1599,
          "selling": 1599,
          "currency_code": "INR"
        }
      },
      "message": "",
      "bulk_offer": {},
      "key": "443175_S",
      "coupon_message": "",
      "article": {
        "type": "article",
        "uid": "162_207_1271_LJ03LBLUDN88_S",
        "size": "S",
        "seller": {
          "uid": 162,
          "name": "GO FASHION INDIA PRIVATE LIMITED"
        },
        "store": {
          "uid": 5784,
          "name": "Vega City mall"
        },
        "quantity": 3,
        "price": {
          "base": {
            "marked": 1599,
            "effective": 1599,
            "currency_code": "INR"
          },
          "converted": {
            "marked": 1599,
            "effective": 1599,
            "currency_code": "INR"
          }
        }
      }
    },
    {
      "availability": {
        "sizes": [
          "OS"
        ],
        "other_store_quantity": 12,
        "out_of_stock": false,
        "deliverable": true,
        "is_valid": true
      },
      "product": {
        "type": "product",
        "uid": 842716,
        "name": "Blue Backpack",
        "slug": "istorm-blue-backpack-842716-951b5a",
        "brand": {
          "uid": 1177,
          "name": "iStorm"
        },
        "categories": [
          {
            "uid": 198,
            "name": "Backpacks"
          }
        ],
        "images": [
          {
            "aspect_ratio": "16:25",
            "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/1177_IS483/1_1551353288247.jpg",
            "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/1177_IS483/1_1551353288247.jpg"
          }
        ],
        "action": {
          "type": "product",
          "url": "https://api.addsale.com/platform/content/v1/products/istorm-blue-backpack-842716-951b5a/",
          "query": {
            "product_slug": [
              "istorm-blue-backpack-842716-951b5a"
            ]
          }
        }
      },
      "quantity": 1,
      "discount": "34% OFF",
      "price": {
        "base": {
          "add_on": 998.7837,
          "marked": 1499,
          "effective": 998.7837,
          "selling": 998.7837,
          "currency_code": "INR"
        },
        "converted": {
          "add_on": 998.7837,
          "marked": 1499,
          "effective": 998.7837,
          "selling": 998.7837,
          "currency_code": "INR"
        }
      },
      "message": "",
      "bulk_offer": {},
      "key": "842716_OS",
      "coupon_message": "",
      "article": {
        "type": "article",
        "uid": "638_1177_CRSL63802_IS483_OS",
        "size": "OS",
        "seller": {
          "uid": 638,
          "name": "COUNFREEDISE RETAIL SERVICES LTD"
        },
        "store": {
          "uid": 4630,
          "name": "Bhiwandi"
        },
        "quantity": 4,
        "price": {
          "base": {
            "marked": 1499,
            "effective": 998.7837,
            "currency_code": "INR"
          },
          "converted": {
            "marked": 1499,
            "effective": 998.7837,
            "currency_code": "INR"
          }
        }
      }
    },
    {
      "availability": {
        "sizes": [
          "OS"
        ],
        "other_store_quantity": 2,
        "out_of_stock": false,
        "deliverable": true,
        "is_valid": true
      },
      "product": {
        "type": "product",
        "uid": 778937,
        "name": "Colourful Carnival Bouncer",
        "slug": "fisher-price-colourful-carnival-bouncer-778937-fafa1f",
        "brand": {
          "uid": 963,
          "name": "Fisher-Price"
        },
        "categories": [
          {
            "uid": 576,
            "name": "Cradles"
          }
        ],
        "images": [
          {
            "aspect_ratio": "16:25",
            "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/963_PWUPC01977/1_1545308400588.jpg",
            "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/963_PWUPC01977/1_1545308400588.jpg"
          }
        ],
        "action": {
          "type": "product",
          "url": "https://api.addsale.com/platform/content/v1/products/fisher-price-colourful-carnival-bouncer-778937-fafa1f/",
          "query": {
            "product_slug": [
              "fisher-price-colourful-carnival-bouncer-778937-fafa1f"
            ]
          }
        }
      },
      "quantity": 1,
      "discount": "11% OFF",
      "price": {
        "base": {
          "add_on": 3059,
          "marked": 3399,
          "effective": 3059,
          "selling": 3059,
          "currency_code": "INR"
        },
        "converted": {
          "add_on": 3059,
          "marked": 3399,
          "effective": 3059,
          "selling": 3059,
          "currency_code": "INR"
        }
      },
      "message": "",
      "bulk_offer": {},
      "key": "778937_OS",
      "coupon_message": "",
      "article": {
        "type": "article",
        "uid": "686_963_IC68601_PWUPC01977_OS",
        "size": "OS",
        "seller": {
          "uid": 686,
          "name": "INDUS CORPORATION"
        },
        "store": {
          "uid": 5059,
          "name": "Vidyaranyapura Main Road"
        },
        "quantity": 3,
        "price": {
          "base": {
            "marked": 3399,
            "effective": 3059,
            "currency_code": "INR"
          },
          "converted": {
            "marked": 3399,
            "effective": 3059,
            "currency_code": "INR"
          }
        }
      }
    }
  ],
  "delivery_charge_info": "",
  "coupon_text": "View all offers",
  "buy_now": false,
  "cart_id": 7927,
  "uid": "7927",
  "gstin": null,
  "checkout_mode": "self",
  "last_modified": "Wed, 04 Sep 2019 04:52:21 GMT",
  "restrict_checkout": false,
  "is_valid": true
}
```
</details>









---


### removeCoupon
Remove Coupon Applied




```kotlin
applicationClient.cart.removeCoupon(id: id, buyNow: buyNow).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| id | String? | no |  |   
| buyNow | Boolean? | no |  |  



Remove Coupon applied on the cart by passing uid in request body.

*Returned Response:*




[CartDetailResponse](#CartDetailResponse)

Success. Returns coupons removed from the cart along with item details and price breakup. Refer `CartDetailResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "breakup_values": {
    "raw": {
      "cod_charge": 0,
      "convenience_fee": 0,
      "coupon": 0,
      "delivery_charge": 0,
      "discount": 0,
      "fynd_cash": 0,
      "gst_charges": 342.75,
      "mrp_total": 3199,
      "subtotal": 3199,
      "total": 3199,
      "vog": 2856.25,
      "you_saved": 0
    },
    "coupon": {
      "type": "cash",
      "code": "prismc22250111",
      "uid": 17743,
      "value": 0,
      "is_applied": false,
      "message": "Coupon successfully removed"
    },
    "display": [
      {
        "display": "MRP Total",
        "key": "mrp_total",
        "value": 3199,
        "currency_code": "INR"
      },
      {
        "display": "Subtotal",
        "key": "subtotal",
        "value": 3199,
        "currency_code": "INR"
      },
      {
        "display": "Total",
        "key": "total",
        "value": 3199,
        "currency_code": "INR"
      }
    ],
    "loyalty_points": {
      "total": 0,
      "applicable": 0,
      "is_applied": false,
      "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
    }
  },
  "items": [
    {
      "message": "",
      "availability": {
        "sizes": [
          "M",
          "S",
          "L",
          "XXL",
          "XL"
        ],
        "other_store_quantity": 10,
        "out_of_stock": false,
        "deliverable": true,
        "is_valid": true
      },
      "bulk_offer": {},
      "key": "857596_S",
      "quantity": 1,
      "price": {
        "base": {
          "add_on": 3199,
          "marked": 3199,
          "effective": 3199,
          "selling": 3199,
          "currency_code": "INR"
        },
        "converted": {
          "add_on": 3199,
          "marked": 3199,
          "effective": 3199,
          "selling": 3199,
          "currency_code": "INR"
        }
      },
      "discount": "",
      "coupon_message": "",
      "product": {
        "type": "product",
        "uid": 857596,
        "name": "Pink Solid Hoodie",
        "slug": "883-police-pink-solid-hoodie-857596-111bdc",
        "brand": {
          "uid": 610,
          "name": "883 Police"
        },
        "categories": [
          {
            "uid": 144,
            "name": "Hoodies"
          }
        ],
        "images": [
          {
            "aspect_ratio": "16:25",
            "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/610_LETTER19APINK/1_1553062658148.jpg",
            "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/610_LETTER19APINK/1_1553062658148.jpg"
          }
        ],
        "action": {
          "type": "product",
          "url": "https://api.addsale.com/platform/content/v1/products/883-police-pink-solid-hoodie-857596-111bdc/",
          "query": {
            "product_slug": [
              "883-police-pink-solid-hoodie-857596-111bdc"
            ]
          }
        }
      },
      "article": {
        "type": "article",
        "uid": "381_610_IGPL01_LETTER19APINK_S",
        "size": "S",
        "seller": {
          "uid": 381,
          "name": "INTERSOURCE GARMENTS PVT LTD"
        },
        "store": {
          "uid": 3009,
          "name": "Kormangala"
        },
        "quantity": 11,
        "price": {
          "base": {
            "marked": 3199,
            "effective": 3199,
            "currency_code": "INR"
          },
          "converted": {
            "marked": 3199,
            "effective": 3199,
            "currency_code": "INR"
          }
        }
      }
    }
  ],
  "delivery_charge_info": "",
  "coupon_text": "View all offers",
  "buy_now": false,
  "cart_id": 7477,
  "uid": "7477",
  "gstin": null,
  "checkout_mode": "self",
  "last_modified": "Thu, 22 Aug 2019 10:55:05 GMT",
  "restrict_checkout": false,
  "is_valid": true
}
```
</details>









---


### getBulkDiscountOffers
Get discount offers based on quantity




```kotlin
applicationClient.cart.getBulkDiscountOffers(itemId: itemId, articleId: articleId, uid: uid, slug: slug).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| itemId | Int? | no | The Item ID of the product |   
| articleId | String? | no | Article Mongo ID |   
| uid | Int? | no | UID of the product |   
| slug | String? | no | A short, human-readable, URL-friendly identifier of a product. You can get slug value from the endpoint /service/application/catalog/v1.0/products/ |  



Use this API to get a list of applicable offers along with current, next and best offer for given product. Either one of uid, item_id, slug should be present.

*Returned Response:*




[BulkPriceResponse](#BulkPriceResponse)

Success. Returns a data object containing the seller details and available offers (if exists) on bulk products. Refer `BulkPriceResponse` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Offers found</i></summary>

```json
{
  "value": {
    "data": [
      {
        "seller": {
          "uid": 248,
          "name": "MANYAVAR CREATIONS PRIVATE LIMITED"
        },
        "offers": [
          {
            "quantity": 1,
            "auto_applied": true,
            "margin": 10,
            "type": "bundle",
            "price": {
              "marked": 3999,
              "effective": 3999,
              "bulk_effective": 3599.1,
              "currency_code": "INR"
            },
            "total": 3599.1
          },
          {
            "quantity": 3,
            "auto_applied": true,
            "margin": 20,
            "type": "bundle",
            "price": {
              "marked": 3999,
              "effective": 3999,
              "bulk_effective": 3199.2,
              "currency_code": "INR"
            },
            "total": 9597.6
          },
          {
            "quantity": 9,
            "auto_applied": true,
            "margin": 30,
            "type": "bundle",
            "price": {
              "marked": 3999,
              "effective": 3999,
              "bulk_effective": 3443.4444444444,
              "currency_code": "INR"
            },
            "total": 30991,
            "best": true
          }
        ]
      }
    ]
  }
}
```
</details>

<details>
<summary><i>&nbsp; Offers not found</i></summary>

```json
{
  "value": {
    "data": []
  }
}
```
</details>

</details>









---


### applyRewardPoints
Apply reward points at cart




```kotlin
applicationClient.cart.applyRewardPoints(id: id, i: i, b: b, buyNow: buyNow, body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| id | String? | no |  |   
| i | Boolean? | no |  |   
| b | Boolean? | no |  |   
| buyNow | Boolean? | no |  |  
| body | [RewardPointRequest](#RewardPointRequest) | yes | Request body |


Use this API to redeem a fixed no. of reward points by applying it to the cart.

*Returned Response:*




[CartDetailResponse](#CartDetailResponse)

Success. Returns a Cart object. Check the example shown below or refer `CartDetailResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "items": [
    {
      "bulk_offer": {},
      "discount": "67% OFF",
      "article": {
        "type": "article",
        "uid": "604_902_SSTC60401_636BLUE_1",
        "size": "1",
        "seller": {
          "uid": 604,
          "name": "SHRI SHANTINATH TRADING COMPANY"
        },
        "store": {
          "uid": 4579,
          "name": "Gandhi Nagar"
        },
        "quantity": 108,
        "price": {
          "base": {
            "marked": 2999,
            "effective": 999,
            "currency_code": "INR"
          },
          "converted": {
            "marked": 2999,
            "effective": 999,
            "currency_code": "INR"
          }
        }
      },
      "coupon_message": "",
      "key": "707569_1",
      "availability": {
        "sizes": [
          "1",
          "8",
          "7",
          "2",
          "9",
          "5",
          "3",
          "6"
        ],
        "other_store_quantity": 107,
        "out_of_stock": false,
        "deliverable": true,
        "is_valid": true
      },
      "product": {
        "type": "product",
        "uid": 707569,
        "name": "Blue and Gold Printed Ethnic Set",
        "slug": "aj-dezines-blue-and-gold-printed-ethnic-set-707569-bff01a",
        "brand": {
          "uid": 902,
          "name": ""
        },
        "categories": [
          {
            "uid": 525,
            "name": ""
          }
        ],
        "images": [
          {
            "aspect_ratio": "16:25",
            "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/902_636BLUE/1_1540301094877.jpg",
            "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/902_636BLUE/1_1540301094877.jpg"
          }
        ],
        "action": {
          "type": "product",
          "url": "https://api.addsale.com/v1/products/aj-dezines-blue-and-gold-printed-ethnic-set-707569-bff01a/",
          "query": {
            "product_slug": [
              "aj-dezines-blue-and-gold-printed-ethnic-set-707569-bff01a"
            ]
          }
        }
      },
      "price": {
        "base": {
          "add_on": 999,
          "marked": 2999,
          "effective": 999,
          "selling": 999,
          "currency_code": "INR"
        },
        "converted": {
          "add_on": 999,
          "marked": 2999,
          "effective": 999,
          "selling": 999,
          "currency_code": "INR"
        }
      },
      "message": "",
      "quantity": 1
    }
  ],
  "buy_now": false,
  "cart_id": 54,
  "uid": "54",
  "breakup_values": {
    "raw": {
      "cod_charge": 0,
      "convenience_fee": 0,
      "coupon": 0,
      "delivery_charge": 0,
      "discount": -2000,
      "fynd_cash": 0,
      "gst_charges": 47.57,
      "mrp_total": 2999,
      "subtotal": 999,
      "total": 999,
      "vog": 951.43,
      "you_saved": 0
    },
    "coupon": {
      "type": "cash",
      "code": "",
      "uid": null,
      "value": 0,
      "is_applied": false,
      "message": "Sorry! Invalid Coupon"
    },
    "display": [
      {
        "display": "MRP Total",
        "key": "mrp_total",
        "value": 2999,
        "currency_code": "INR"
      },
      {
        "display": "Discount",
        "key": "discount",
        "value": -2000,
        "currency_code": "INR"
      },
      {
        "display": "Subtotal",
        "key": "subtotal",
        "value": 999,
        "currency_code": "INR"
      },
      {
        "display": "Total",
        "key": "total",
        "value": 999,
        "currency_code": "INR"
      }
    ],
    "loyalty_points": {
      "total": 0,
      "applicable": 0,
      "is_applied": false,
      "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
    }
  },
  "delivery_charge_info": "",
  "coupon_text": "View all offers",
  "gstin": null,
  "checkout_mode": "self",
  "restrict_checkout": false,
  "is_valid": true,
  "last_modified": "Tue, 03 Sep 2019 05:35:59 GMT"
}
```
</details>









---


### getAddresses
Fetch address




```kotlin
applicationClient.cart.getAddresses(cartId: cartId, buyNow: buyNow, mobileNo: mobileNo, checkoutMode: checkoutMode, tags: tags, isDefault: isDefault).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| cartId | String? | no |  |   
| buyNow | Boolean? | no |  |   
| mobileNo | String? | no |  |   
| checkoutMode | String? | no |  |   
| tags | String? | no |  |   
| isDefault | Boolean? | no |  |  



Use this API to get all the addresses associated with an account. If successful, returns a Address resource in the response body specified in GetAddressesResponse.attibutes listed below are optional <ul> <li> <font color="monochrome">uid</font></li> <li> <font color="monochrome">address_id</font></li> <li> <font color="monochrome">mobile_no</font></li> <li> <font color="monochrome">checkout_mode</font></li> <li> <font color="monochrome">tags</font></li> <li> <font color="monochrome">default</font></li> </ul>

*Returned Response:*




[GetAddressesResponse](#GetAddressesResponse)

Success. Returns an Address object containing a list of address saved in the account. Refer `GetAddressesResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "address": [
    {
      "landmark": "",
      "area_code": {
        "slug": "pincode",
        "id": 400093
      },
      "id": "8b526f521bb14a2593a8b9e3ce8c76b3",
      "state": "Maharashtra",
      "meta": {},
      "user_id": "8b526f521bb14a2593a8b9e3ce8c76b3",
      "country_code": "IND",
      "country_phone_code": "91",
      "country_iso_code": "IND",
      "phone": 9915347757,
      "geo_location": {},
      "country": "India",
      "is_default_address": true,
      "is_active": true,
      "city": "Mumbai",
      "pincode": 400093,
      "checkout_mode": "self",
      "address_type": "home",
      "tags": [],
      "area": "Sector 127",
      "name": "abc",
      "email": "ankur@gofynd1.com",
      "address": "Megatron2",
      "store_name": "store123"
    }
  ]
}
```
</details>









---


### addAddress
Add address to an account




```kotlin
applicationClient.cart.addAddress(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [Address](#Address) | yes | Request body |


Use this API to add an address to an account.

*Returned Response:*




[SaveAddressResponse](#SaveAddressResponse)

Success. Returns the address ID, a flag whether the address is set as default, and a success message. Refer `SaveAddressResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "id": "mongo_object_id",
  "is_default_address": true,
  "success": true
}
```
</details>









---


### getAddressById
Fetch a single address by its ID




```kotlin
applicationClient.cart.getAddressById(id: id, cartId: cartId, buyNow: buyNow, mobileNo: mobileNo, checkoutMode: checkoutMode, tags: tags, isDefault: isDefault).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| id | String | yes |  |   
| cartId | String? | no |  |   
| buyNow | Boolean? | no |  |   
| mobileNo | String? | no |  |   
| checkoutMode | String? | no |  |   
| tags | String? | no |  |   
| isDefault | Boolean? | no |  |  



Use this API to get an addresses using its ID. If successful, returns a Address resource in the response body specified in `Address`. Attibutes listed below are optional <ul> <li> <font color="monochrome">mobile_no</font></li> <li> <font color="monochrome">checkout_mode</font></li> <li> <font color="monochrome">tags</font></li> <li> <font color="monochrome">default</font></li> </ul>

*Returned Response:*




[Address](#Address)

Success. Returns an Address object containing a list of address saved in the account. Refer `Address` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "landmark": "",
  "area_code": {
    "slug": "pincode",
    "id": 400093
  },
  "state": "Maharashtra",
  "meta": {},
  "user_id": "8b526f521bb14a2593a8b9e3ce8c76b3",
  "country_code": "IND",
  "country_phone_code": "91",
  "country_iso_code": "IND",
  "phone": 9915347757,
  "geo_location": {},
  "country": "India",
  "is_default_address": true,
  "is_active": true,
  "city": "Mumbai",
  "pincode": 400093,
  "checkout_mode": "self",
  "address_type": "home",
  "uid": 1145,
  "tags": [],
  "area": "Sector 127",
  "name": "abc",
  "address_id": 1145,
  "email": "ankur@gofynd1.com",
  "address": "Megatron2",
  "store_name": "store123"
}
```
</details>









---


### updateAddress
Update address added to an account




```kotlin
applicationClient.cart.updateAddress(id: id, body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| id | String | yes | ID allotted to the selected address |  
| body | [Address](#Address) | yes | Request body |


<p>Use this API to update an existing address in the account. Request object should contain attributes mentioned in  <font color="blue">Address </font> can be updated. These attributes are:</p> <ul> <li> <font color="monochrome">is_default_address</font></li> <li> <font color="monochrome">landmark</font></li> <li> <font color="monochrome">area</font></li> <li> <font color="monochrome">pincode</font></li> <li> <font color="monochrome">email</font></li> <li> <font color="monochrome">address_type</font></li> <li> <font color="monochrome">name</font></li> <li> <font color="monochrome">address_id</font></li> <li> <font color="monochrome">address</font></li> </ul>

*Returned Response:*




[UpdateAddressResponse](#UpdateAddressResponse)

Success. Returns the address ID and a message indicating a successful address updation.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "is_updated": true,
  "id": "<mongo_object_id>",
  "is_default_address": true,
  "success": true
}
```
</details>









---


### removeAddress
Remove address associated with an account




```kotlin
applicationClient.cart.removeAddress(id: id).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| id | String | yes | ID allotted to the selected address |  



Use this API to delete an address by its ID. This will returns an object that will indicate whether the address was deleted successfully or not.

*Returned Response:*




[DeleteAddressResponse](#DeleteAddressResponse)

Returns a Status object indicating the success or failure of address deletion.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "id": "<mongo_object_id>",
  "is_deleted": true
}
```
</details>









---


### selectAddress
Select an address from available addresses




```kotlin
applicationClient.cart.selectAddress(cartId: cartId, buyNow: buyNow, i: i, b: b, body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| cartId | String? | no |  |   
| buyNow | Boolean? | no |  |   
| i | Boolean? | no |  |   
| b | Boolean? | no |  |  
| body | [SelectCartAddressRequest](#SelectCartAddressRequest) | yes | Request body |


<p>Select Address from all addresses associated with the account in order to ship the cart items to that address, otherwise default address will be selected implicitly. See `SelectCartAddressRequest` in schema of request body for the list of attributes needed to select Address from account. On successful request, this API returns a Cart object. Below address attributes are required. <ul> <li> <font color="monochrome">address_id</font></li> <li> <font color="monochrome">billing_address_id</font></li> <li> <font color="monochrome">uid</font></li> </ul></p>

*Returned Response:*




[CartDetailResponse](#CartDetailResponse)

Success. Returns a Cart object as shown below. Refer `CartDetailResponse` for more details.  .




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "is_valid": true,
  "buy_now": false,
  "breakup_values": {
    "raw": {
      "cod_charge": 0,
      "convenience_fee": 0,
      "coupon": -2250,
      "delivery_charge": 0,
      "discount": 0,
      "fynd_cash": 0,
      "gst_charges": 315.86,
      "mrp_total": 5198,
      "subtotal": 5198,
      "total": 2948,
      "vog": 2632.15,
      "you_saved": 0
    },
    "display": [
      {
        "display": "MRP Total",
        "key": "mrp_total",
        "value": 5198,
        "currency_code": "INR"
      },
      {
        "display": "Subtotal",
        "key": "subtotal",
        "value": 5198,
        "currency_code": "INR"
      },
      {
        "display": "Coupon",
        "key": "coupon",
        "value": -2250,
        "currency_code": "INR"
      },
      {
        "display": "Total",
        "key": "total",
        "value": 2948,
        "currency_code": "INR"
      }
    ],
    "coupon": {
      "type": "cash",
      "code": "PRISMC22250111",
      "uid": 17743,
      "value": 2250,
      "is_applied": true,
      "message": "coupn applied"
    },
    "loyalty_points": {
      "total": 0,
      "applicable": 0,
      "is_applied": false,
      "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
    }
  },
  "items": [
    {
      "message": "",
      "quantity": 1,
      "availability": {
        "sizes": [
          "M",
          "S",
          "L",
          "XXL",
          "XL"
        ],
        "other_store_quantity": 10,
        "out_of_stock": false,
        "deliverable": true,
        "is_valid": true
      },
      "coupon_message": "PRISMC22250111 coupon applied",
      "price": {
        "base": {
          "add_on": 3199,
          "marked": 3199,
          "effective": 3199,
          "selling": 3199,
          "currency_code": "INR"
        },
        "converted": {
          "add_on": 3199,
          "marked": 3199,
          "effective": 3199,
          "selling": 3199,
          "currency_code": "INR"
        }
      },
      "bulk_offer": {},
      "article": {
        "type": "article",
        "uid": "381_610_IGPL01_LETTER19APINK_S",
        "size": "S",
        "seller": {
          "uid": 381,
          "name": "INTERSOURCE GARMENTS PVT LTD"
        },
        "store": {
          "uid": 3009,
          "name": "Kormangala"
        },
        "quantity": 11,
        "price": {
          "base": {
            "marked": 3199,
            "effective": 3199,
            "currency_code": "INR"
          },
          "converted": {
            "marked": 3199,
            "effective": 3199,
            "currency_code": "INR"
          }
        }
      },
      "product": {
        "type": "product",
        "uid": 857596,
        "name": "Pink Solid Hoodie",
        "slug": "883-police-pink-solid-hoodie-857596-111bdc",
        "brand": {
          "uid": 610,
          "name": "883 Police"
        },
        "categories": [
          {
            "uid": 144,
            "name": "Hoodies"
          }
        ],
        "images": [
          {
            "aspect_ratio": "16:25",
            "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/610_LETTER19APINK/1_1553062658148.jpg",
            "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/610_LETTER19APINK/1_1553062658148.jpg"
          }
        ],
        "action": {
          "type": "product",
          "url": "https://api.addsale.com/platform/content/v1/products/883-police-pink-solid-hoodie-857596-111bdc/",
          "query": {
            "product_slug": [
              "883-police-pink-solid-hoodie-857596-111bdc"
            ]
          }
        }
      },
      "key": "857596_S",
      "discount": ""
    },
    {
      "message": "",
      "quantity": 1,
      "availability": {
        "sizes": [
          "L",
          "XL",
          "XXL"
        ],
        "other_store_quantity": 1,
        "out_of_stock": false,
        "deliverable": true,
        "is_valid": true
      },
      "coupon_message": "PRISMC22250111 coupon applied",
      "price": {
        "base": {
          "add_on": 1999,
          "marked": 1999,
          "effective": 1999,
          "selling": 1999,
          "currency_code": "INR"
        },
        "converted": {
          "add_on": 1999,
          "marked": 1999,
          "effective": 1999,
          "selling": 1999,
          "currency_code": "INR"
        }
      },
      "bulk_offer": {},
      "article": {
        "type": "article",
        "uid": "381_610_IGPL01_SPIRAL19ANAVY_L",
        "size": "L",
        "seller": {
          "uid": 381,
          "name": "INTERSOURCE GARMENTS PVT LTD"
        },
        "store": {
          "uid": 3009,
          "name": "Kormangala"
        },
        "quantity": 2,
        "price": {
          "base": {
            "marked": 1999,
            "effective": 1999,
            "currency_code": "INR"
          },
          "converted": {
            "marked": 1999,
            "effective": 1999,
            "currency_code": "INR"
          }
        }
      },
      "product": {
        "type": "product",
        "uid": 820312,
        "name": "Navy Blue Melange Shorts",
        "slug": "883-police-navy-blue-melange-shorts-820312-4943a8",
        "brand": {
          "uid": 610,
          "name": "883 Police"
        },
        "categories": [
          {
            "uid": 193,
            "name": "Shorts"
          }
        ],
        "images": [
          {
            "aspect_ratio": "16:25",
            "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/610_SPIRAL19ANAVY/1_1549105947281.jpg",
            "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/610_SPIRAL19ANAVY/1_1549105947281.jpg"
          }
        ],
        "action": {
          "type": "product",
          "url": "https://api.addsale.com/platform/content/v1/products/883-police-navy-blue-melange-shorts-820312-4943a8/",
          "query": {
            "product_slug": [
              "883-police-navy-blue-melange-shorts-820312-4943a8"
            ]
          }
        }
      },
      "key": "820312_L",
      "discount": ""
    }
  ],
  "delivery_charge_info": "",
  "coupon_text": "View all offers",
  "uid": "7477",
  "gstin": null,
  "checkout_mode": "self",
  "last_modified": "Fri, 23 Aug 2019 08:03:12 GMT",
  "restrict_checkout": false
}
```
</details>









---


### selectPaymentMode
Update cart payment




```kotlin
applicationClient.cart.selectPaymentMode(id: id, buyNow: buyNow, body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| id | String? | no |  |   
| buyNow | Boolean? | no |  |  
| body | [UpdateCartPaymentRequest](#UpdateCartPaymentRequest) | yes | Request body |


Use this API to update cart payment.

*Returned Response:*




[CartDetailResponse](#CartDetailResponse)

Success. Returns a Cart object as shown below. Refer `CartDetailResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true,
  "error_message": "Note: Your order delivery will be delayed by 7-10 Days",
  "user_type": "Store User",
  "cod_charges": 0,
  "order_id": null,
  "cod_available": true,
  "cod_message": "No additional COD charges applicable",
  "delivery_charges": 0,
  "delivery_charge_order_value": 0,
  "store_code": "",
  "store_emps": [],
  "breakup_values": {
    "raw": {
      "cod_charge": 0,
      "convenience_fee": 0,
      "coupon": -2250,
      "delivery_charge": 0,
      "discount": 0,
      "fynd_cash": 0,
      "gst_charges": 315.86,
      "mrp_total": 5198,
      "subtotal": 5198,
      "total": 2948,
      "vog": 2632.15,
      "you_saved": 0
    },
    "display": [
      {
        "display": "MRP Total",
        "key": "mrp_total",
        "value": 5198,
        "currency_code": "INR"
      },
      {
        "display": "Subtotal",
        "key": "subtotal",
        "value": 5198,
        "currency_code": "INR"
      },
      {
        "display": "Coupon",
        "key": "coupon",
        "value": -2250,
        "currency_code": "INR"
      },
      {
        "display": "Total",
        "key": "total",
        "value": 2948,
        "currency_code": "INR"
      }
    ],
    "coupon": {
      "type": "cash",
      "code": "PRISMC22250111",
      "uid": 17743,
      "value": 2250,
      "is_applied": true,
      "message": "coupn applied"
    },
    "loyalty_points": {
      "total": 0,
      "applicable": 0,
      "is_applied": false,
      "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
    }
  },
  "items": [
    {
      "message": "",
      "quantity": 1,
      "availability": {
        "sizes": [
          "M",
          "S",
          "L",
          "XXL",
          "XL"
        ],
        "other_store_quantity": 10,
        "out_of_stock": false,
        "deliverable": true,
        "is_valid": true
      },
      "coupon_message": "PRISMC22250111 coupon applied",
      "price": {
        "base": {
          "add_on": 3199,
          "marked": 3199,
          "effective": 3199,
          "selling": 3199,
          "currency_code": "INR"
        },
        "converted": {
          "add_on": 3199,
          "marked": 3199,
          "effective": 3199,
          "selling": 3199,
          "currency_code": "INR"
        }
      },
      "bulk_offer": {},
      "article": {
        "type": "article",
        "uid": "381_610_IGPL01_LETTER19APINK_S",
        "size": "S",
        "seller": {
          "uid": 381,
          "name": "INTERSOURCE GARMENTS PVT LTD"
        },
        "store": {
          "uid": 3009,
          "name": "Kormangala"
        },
        "quantity": 11,
        "price": {
          "base": {
            "marked": 3199,
            "effective": 3199,
            "currency_code": "INR"
          },
          "converted": {
            "marked": 3199,
            "effective": 3199,
            "currency_code": "INR"
          }
        }
      },
      "product": {
        "type": "product",
        "uid": 857596,
        "name": "Pink Solid Hoodie",
        "slug": "883-police-pink-solid-hoodie-857596-111bdc",
        "brand": {
          "uid": 610,
          "name": "883 Police"
        },
        "categories": [
          {
            "uid": 144,
            "name": "Hoodies"
          }
        ],
        "images": [
          {
            "aspect_ratio": "16:25",
            "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/610_LETTER19APINK/1_1553062658148.jpg",
            "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/610_LETTER19APINK/1_1553062658148.jpg"
          }
        ],
        "action": {
          "type": "product",
          "url": "https://api.addsale.com/platform/content/v1/products/883-police-pink-solid-hoodie-857596-111bdc/",
          "query": {
            "product_slug": [
              "883-police-pink-solid-hoodie-857596-111bdc"
            ]
          }
        }
      },
      "key": "857596_S",
      "discount": ""
    },
    {
      "message": "",
      "quantity": 1,
      "availability": {
        "sizes": [
          "L",
          "XL",
          "XXL"
        ],
        "other_store_quantity": 1,
        "out_of_stock": false,
        "deliverable": true,
        "is_valid": true
      },
      "coupon_message": "PRISMC22250111 coupon applied",
      "price": {
        "base": {
          "add_on": 1999,
          "marked": 1999,
          "effective": 1999,
          "selling": 1999,
          "currency_code": "INR"
        },
        "converted": {
          "add_on": 1999,
          "marked": 1999,
          "effective": 1999,
          "selling": 1999,
          "currency_code": "INR"
        }
      },
      "bulk_offer": {},
      "article": {
        "type": "article",
        "uid": "381_610_IGPL01_SPIRAL19ANAVY_L",
        "size": "L",
        "seller": {
          "uid": 381,
          "name": "INTERSOURCE GARMENTS PVT LTD"
        },
        "store": {
          "uid": 3009,
          "name": "Kormangala"
        },
        "quantity": 2,
        "price": {
          "base": {
            "marked": 1999,
            "effective": 1999,
            "currency_code": "INR"
          },
          "converted": {
            "marked": 1999,
            "effective": 1999,
            "currency_code": "INR"
          }
        }
      },
      "product": {
        "type": "product",
        "uid": 820312,
        "name": "Navy Blue Melange Shorts",
        "slug": "883-police-navy-blue-melange-shorts-820312-4943a8",
        "brand": {
          "uid": 610,
          "name": "883 Police"
        },
        "categories": [
          {
            "uid": 193,
            "name": "Shorts"
          }
        ],
        "images": [
          {
            "aspect_ratio": "16:25",
            "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/610_SPIRAL19ANAVY/1_1549105947281.jpg",
            "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/610_SPIRAL19ANAVY/1_1549105947281.jpg"
          }
        ],
        "action": {
          "type": "product",
          "url": "https://api.addsale.com/platform/content/v1/products/883-police-navy-blue-melange-shorts-820312-4943a8/",
          "query": {
            "product_slug": [
              "883-police-navy-blue-melange-shorts-820312-4943a8"
            ]
          }
        }
      },
      "key": "820312_L",
      "discount": ""
    }
  ],
  "delivery_charge_info": "",
  "coupon_text": "View all offers",
  "buy_now": false,
  "cart_id": 7477,
  "uid": "7477",
  "gstin": null,
  "checkout_mode": "self",
  "last_modified": "Fri, 23 Aug 2019 08:03:04 GMT",
  "restrict_checkout": false,
  "is_valid": true
}
```
</details>









---


### validateCouponForPayment
Verify the coupon eligibility against the payment mode




```kotlin
applicationClient.cart.validateCouponForPayment(id: id, buyNow: buyNow, addressId: addressId, paymentMode: paymentMode, paymentIdentifier: paymentIdentifier, aggregatorName: aggregatorName, merchantCode: merchantCode).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| id | String? | no |  |   
| buyNow | Boolean? | no |  |   
| addressId | String? | no |  |   
| paymentMode | String? | no |  |   
| paymentIdentifier | String? | no |  |   
| aggregatorName | String? | no |  |   
| merchantCode | String? | no |  |  



Use this API to validate a coupon against the payment mode such as NetBanking, Wallet, UPI etc.

*Returned Response:*




[PaymentCouponValidate](#PaymentCouponValidate)

Success. Returns a success message and the coupon validity. Refer `PaymentCouponValidate` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true,
  "message": "",
  "coupon_validity": {
    "valid": true,
    "discount": 499.5,
    "code": "testpayment",
    "display_message_en": "",
    "title": "Coupon value will change."
  }
}
```
</details>









---


### getShipments
Get delivery date and options before checkout




```kotlin
applicationClient.cart.getShipments(p: p, id: id, buyNow: buyNow, addressId: addressId, areaCode: areaCode).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| p | Boolean? | no | This is a boolean value. Select `true` for getting a payment option in response. |   
| id | String? | no | The unique identifier of the cart |   
| buyNow | Boolean? | no |  |   
| addressId | String? | no | ID allotted to the selected address |   
| areaCode | String? | no | The PIN Code of the destination address, e.g. 400059 |  



Use this API to get shipment details, expected delivery date, items and price breakup of the shipment.

*Returned Response:*




[CartShipmentsResponse](#CartShipmentsResponse)

Success. Returns delivery promise along with shipment details and price breakup. Refer `CartShipmentsResponse` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Shipment Generated</i></summary>

```json
{
  "value": {
    "items": [],
    "buy_now": false,
    "cart_id": 7501,
    "uid": "7501",
    "success": true,
    "error_message": "Note: Your order delivery will be delayed by 7-10 Days",
    "payment_options": {
      "payment_option": [
        {
          "name": "COD",
          "display_name": "Cash on Delivery",
          "display_priority": 1,
          "payment_mode_id": 11,
          "logo": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/cod.png",
          "logo_url": {
            "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/cod.png",
            "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/cod.png"
          },
          "list": []
        },
        {
          "name": "CARD",
          "display_priority": 2,
          "payment_mode_id": 2,
          "display_name": "Card",
          "list": []
        },
        {
          "name": "NB",
          "display_priority": 3,
          "payment_mode_id": 3,
          "display_name": "Net Banking",
          "list": [
            {
              "aggregator_name": "Razorpay",
              "bank_name": "ICICI Bank",
              "bank_code": "ICIC",
              "url": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/NB_ICICI.png",
              "logo_url": {
                "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/NB_ICICI.png",
                "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/NB_ICICI.png"
              },
              "merchant_code": "NB_ICICI",
              "display_priority": 1
            }
          ]
        },
        {
          "name": "WL",
          "display_priority": 4,
          "payment_mode_id": 4,
          "display_name": "Wallet",
          "list": [
            {
              "wallet_name": "Paytm",
              "wallet_code": "paytm",
              "wallet_id": 4,
              "merchant_code": "PAYTM",
              "logo_url": {
                "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/paytm_logo_small.png",
                "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/paytm_logo_large.png"
              },
              "aggregator_name": "Juspay",
              "display_priority": 1
            }
          ]
        },
        {
          "name": "UPI",
          "display_priority": 9,
          "payment_mode_id": 6,
          "display_name": "UPI",
          "list": [
            {
              "aggregator_name": "UPI_Razorpay",
              "name": "UPI",
              "display_name": "BHIM UPI",
              "code": "UPI",
              "logo_url": {
                "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/upi_100x78.png",
                "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/upi_150x100.png"
              },
              "merchant_code": "UPI",
              "timeout": 240,
              "retry_count": 0,
              "fynd_vpa": "shopsense.rzp@hdfcbank",
              "intent_flow": true,
              "intent_app_error_list": [
                "com.csam.icici.bank.imobile",
                "in.org.npci.upiapp",
                "com.whatsapp"
              ]
            }
          ]
        },
        {
          "name": "PL",
          "display_priority": 11,
          "payment_mode_id": 1,
          "display_name": "Pay Later",
          "list": [
            {
              "aggregator_name": "Simpl",
              "name": "Simpl",
              "code": "simpl",
              "merchant_code": "SIMPL",
              "logo": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/simpl_logo.png",
              "logo_url": {
                "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/simpl_logo.png",
                "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/simpl_logo.png"
              }
            }
          ]
        }
      ],
      "payment_flows": {
        "Simpl": {
          "data": {
            "gateway": {
              "route": "simpl",
              "entity": "sdk",
              "is_customer_validation_required": true,
              "cust_validation_url": "https://api.addsale.com/gringotts/api/v1/validate-customer/",
              "sdk": {
                "config": {
                  "redirect": false,
                  "callback_url": null,
                  "action_url": "https://api.addsale.com/avis/api/v1/payments/charge-gringotts-transaction/"
                },
                "data": {
                  "user_phone": "8452996729",
                  "user_email": "paymentsdummy@gofynd.com"
                }
              },
              "return_url": null
            }
          },
          "api_link": "",
          "payment_flow": "sdk"
        },
        "Juspay": {
          "data": {},
          "api_link": "https://sandbox.juspay.in/txns",
          "payment_flow": "api"
        },
        "Razorpay": {
          "data": {},
          "api_link": "",
          "payment_flow": "sdk"
        },
        "UPI_Razorpay": {
          "data": {},
          "api_link": "https://api.addsale.com/gringotts/api/v1/external/payment-initialisation/",
          "payment_flow": "api"
        },
        "Fynd": {
          "data": {},
          "api_link": "",
          "payment_flow": "api"
        }
      },
      "default": {}
    },
    "user_type": "Store User",
    "cod_charges": 0,
    "order_id": null,
    "cod_available": true,
    "cod_message": "No additional COD charges applicable",
    "delivery_charges": 0,
    "delivery_charge_order_value": 0,
    "delivery_slots": [
      {
        "date": "Sat, 24 Aug",
        "delivery_slot": [
          {
            "delivery_slot_timing": "By 9:00 PM",
            "default": true,
            "delivery_slot_id": 1
          }
        ]
      }
    ],
    "store_code": "",
    "store_emps": [],
    "breakup_values": {
      "loyalty_points": {
        "total": 0,
        "applicable": 0,
        "is_applied": false,
        "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
      },
      "coupon": {
        "type": "cash",
        "code": "",
        "uid": null,
        "value": 0,
        "is_applied": false,
        "message": "Sorry! Invalid Coupon"
      },
      "raw": {
        "cod_charge": 0,
        "convenience_fee": 0,
        "coupon": 0,
        "delivery_charge": 0,
        "discount": 0,
        "fynd_cash": 0,
        "gst_charges": 214.18,
        "mrp_total": 1999,
        "subtotal": 1999,
        "total": 1999,
        "vog": 1784.82,
        "you_saved": 0
      },
      "display": [
        {
          "display": "MRP Total",
          "key": "mrp_total",
          "value": 1999,
          "currency_code": "INR"
        },
        {
          "display": "Subtotal",
          "key": "subtotal",
          "value": 1999,
          "currency_code": "INR"
        },
        {
          "display": "Total",
          "key": "total",
          "value": 1999,
          "currency_code": "INR"
        }
      ]
    },
    "shipments": [
      {
        "fulfillment_id": 3009,
        "shipment_type": "single_shipment",
        "fulfillment_type": "store",
        "dp_id": "29",
        "dp_options": {
          "4": {
            "f_priority": 4,
            "r_priority": 5,
            "is_cod": true,
            "is_prepaid": true,
            "is_reverse": true
          },
          "7": {
            "f_priority": 3,
            "r_priority": 4,
            "is_cod": true,
            "is_prepaid": true,
            "is_reverse": true
          },
          "29": {
            "f_priority": 1,
            "r_priority": 2,
            "is_cod": true,
            "is_prepaid": true,
            "is_reverse": true
          }
        },
        "promise": {
          "timestamp": {
            "min": 1566678108,
            "max": 1567023708
          },
          "formatted": {
            "min": "Aug 24",
            "max": "Aug 28"
          }
        },
        "box_type": "Small Courier bag",
        "shipments": 1,
        "items": [
          {
            "quantity": 1,
            "product": {
              "type": "product",
              "uid": 820312,
              "name": "Navy Blue Melange Shorts",
              "slug": "883-police-navy-blue-melange-shorts-820312-4943a8",
              "brand": {
                "uid": 610,
                "name": "883 Police"
              },
              "categories": [
                {
                  "uid": 193,
                  "name": "Shorts"
                }
              ],
              "images": [
                {
                  "aspect_ratio": "16:25",
                  "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/610_SPIRAL19ANAVY/1_1549105947281.jpg",
                  "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/610_SPIRAL19ANAVY/1_1549105947281.jpg"
                }
              ],
              "action": {
                "type": "product",
                "url": "https://api.addsale.com/platform/content/v1/products/883-police-navy-blue-melange-shorts-820312-4943a8/",
                "query": {
                  "product_slug": [
                    "883-police-navy-blue-melange-shorts-820312-4943a8"
                  ]
                }
              }
            },
            "discount": "",
            "bulk_offer": {},
            "key": "820312_L",
            "price": {
              "base": {
                "add_on": 1999,
                "marked": 1999,
                "effective": 1999,
                "selling": 1999,
                "currency_code": "INR"
              },
              "converted": {
                "add_on": 1999,
                "marked": 1999,
                "effective": 1999,
                "selling": 1999,
                "currency_code": "INR"
              }
            },
            "article": {
              "type": "article",
              "uid": "381_610_IGPL01_SPIRAL19ANAVY_L",
              "size": "L",
              "seller": {
                "uid": 381,
                "name": "INTERSOURCE GARMENTS PVT LTD"
              },
              "store": {
                "uid": 3009,
                "name": "Kormangala"
              },
              "quantity": 2,
              "price": {
                "base": {
                  "marked": 1999,
                  "effective": 1999,
                  "currency_code": "INR"
                },
                "converted": {
                  "marked": 1999,
                  "effective": 1999,
                  "currency_code": "INR"
                }
              }
            },
            "availability": {
              "sizes": [
                "L",
                "XL",
                "XXL"
              ],
              "other_store_quantity": 1,
              "out_of_stock": false,
              "deliverable": true,
              "is_valid": true
            },
            "coupon_message": "",
            "message": ""
          }
        ]
      }
    ],
    "delivery_charge_info": "",
    "coupon_text": "View all offers",
    "gstin": null,
    "checkout_mode": "self",
    "last_modified": "Thu, 22 Aug 2019 20:21:48 GMT",
    "restrict_checkout": false,
    "is_valid": true
  }
}
```
</details>

<details>
<summary><i>&nbsp; Shipment Generation Failed</i></summary>

```json
{
  "value": {
    "items": [],
    "buy_now": false,
    "cart_id": 7501,
    "uid": "7501",
    "success": true,
    "error_message": "Note: Your order delivery will be delayed by 7-10 Days",
    "payment_options": {
      "payment_option": [
        {
          "name": "COD",
          "display_name": "Cash on Delivery",
          "display_priority": 1,
          "payment_mode_id": 11,
          "logo": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/cod.png",
          "logo_url": {
            "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/cod.png",
            "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/cod.png"
          },
          "list": []
        },
        {
          "name": "CARD",
          "display_priority": 2,
          "payment_mode_id": 2,
          "display_name": "Card",
          "list": []
        },
        {
          "name": "NB",
          "display_priority": 3,
          "payment_mode_id": 3,
          "display_name": "Net Banking",
          "list": [
            {
              "aggregator_name": "Razorpay",
              "bank_name": "ICICI Bank",
              "bank_code": "ICIC",
              "url": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/NB_ICICI.png",
              "logo_url": {
                "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/NB_ICICI.png",
                "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/NB_ICICI.png"
              },
              "merchant_code": "NB_ICICI",
              "display_priority": 1
            }
          ]
        },
        {
          "name": "WL",
          "display_priority": 4,
          "payment_mode_id": 4,
          "display_name": "Wallet",
          "list": [
            {
              "wallet_name": "Paytm",
              "wallet_code": "paytm",
              "wallet_id": 4,
              "merchant_code": "PAYTM",
              "logo_url": {
                "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/paytm_logo_small.png",
                "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/paytm_logo_large.png"
              },
              "aggregator_name": "Juspay",
              "display_priority": 1
            }
          ]
        },
        {
          "name": "UPI",
          "display_priority": 9,
          "payment_mode_id": 6,
          "display_name": "UPI",
          "list": [
            {
              "aggregator_name": "UPI_Razorpay",
              "name": "UPI",
              "display_name": "BHIM UPI",
              "code": "UPI",
              "logo_url": {
                "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/upi_100x78.png",
                "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/upi_150x100.png"
              },
              "merchant_code": "UPI",
              "timeout": 240,
              "retry_count": 0,
              "fynd_vpa": "shopsense.rzp@hdfcbank",
              "intent_flow": true,
              "intent_app_error_list": [
                "com.csam.icici.bank.imobile",
                "in.org.npci.upiapp",
                "com.whatsapp"
              ]
            }
          ]
        },
        {
          "name": "PL",
          "display_priority": 11,
          "payment_mode_id": 1,
          "display_name": "Pay Later",
          "list": [
            {
              "aggregator_name": "Simpl",
              "name": "Simpl",
              "code": "simpl",
              "merchant_code": "SIMPL",
              "logo": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/simpl_logo.png",
              "logo_url": {
                "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/simpl_logo.png",
                "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/simpl_logo.png"
              }
            }
          ]
        }
      ],
      "payment_flows": {
        "Simpl": {
          "data": {
            "gateway": {
              "route": "simpl",
              "entity": "sdk",
              "is_customer_validation_required": true,
              "cust_validation_url": "https://api.addsale.com/gringotts/api/v1/validate-customer/",
              "sdk": {
                "config": {
                  "redirect": false,
                  "callback_url": null,
                  "action_url": "https://api.addsale.com/avis/api/v1/payments/charge-gringotts-transaction/"
                },
                "data": {
                  "user_phone": "8452996729",
                  "user_email": "paymentsdummy@gofynd.com"
                }
              },
              "return_url": null
            }
          },
          "api_link": "",
          "payment_flow": "sdk"
        },
        "Juspay": {
          "data": {},
          "api_link": "https://sandbox.juspay.in/txns",
          "payment_flow": "api"
        },
        "Razorpay": {
          "data": {},
          "api_link": "",
          "payment_flow": "sdk"
        },
        "UPI_Razorpay": {
          "data": {},
          "api_link": "https://api.addsale.com/gringotts/api/v1/external/payment-initialisation/",
          "payment_flow": "api"
        },
        "Fynd": {
          "data": {},
          "api_link": "",
          "payment_flow": "api"
        }
      },
      "default": {}
    },
    "user_type": "Store User",
    "cod_charges": 0,
    "order_id": null,
    "cod_available": true,
    "cod_message": "No additional COD charges applicable",
    "delivery_charges": 0,
    "delivery_charge_order_value": 0,
    "delivery_slots": [
      {
        "date": "Sat, 24 Aug",
        "delivery_slot": [
          {
            "delivery_slot_timing": "By 9:00 PM",
            "default": true,
            "delivery_slot_id": 1
          }
        ]
      }
    ],
    "store_code": "",
    "store_emps": [],
    "breakup_values": {
      "loyalty_points": {
        "total": 0,
        "applicable": 0,
        "is_applied": false,
        "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
      },
      "coupon": {
        "type": "cash",
        "code": "",
        "uid": null,
        "value": 0,
        "is_applied": false,
        "message": "Sorry! Invalid Coupon"
      },
      "raw": {
        "cod_charge": 0,
        "convenience_fee": 0,
        "coupon": 0,
        "delivery_charge": 0,
        "discount": 0,
        "fynd_cash": 0,
        "gst_charges": 214.18,
        "mrp_total": 1999,
        "subtotal": 1999,
        "total": 1999,
        "vog": 1784.82,
        "you_saved": 0
      },
      "display": [
        {
          "display": "MRP Total",
          "key": "mrp_total",
          "value": 1999,
          "currency_code": "INR"
        },
        {
          "display": "Subtotal",
          "key": "subtotal",
          "value": 1999,
          "currency_code": "INR"
        },
        {
          "display": "Total",
          "key": "total",
          "value": 1999,
          "currency_code": "INR"
        }
      ]
    },
    "shipments": [],
    "message": "Shipments could not be generated. Please Try again after some time.",
    "delivery_charge_info": "",
    "coupon_text": "View all offers",
    "gstin": null,
    "checkout_mode": "self",
    "last_modified": "Thu, 22 Aug 2019 20:21:48 GMT",
    "restrict_checkout": false,
    "is_valid": false
  }
}
```
</details>

</details>









---


### checkoutCart
Checkout all items in the cart




```kotlin
applicationClient.cart.checkoutCart(buyNow: buyNow, body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| buyNow | Boolean? | no | This indicates the type of cart to checkout |  
| body | [CartCheckoutDetailRequest](#CartCheckoutDetailRequest) | yes | Request body |


Use this API to checkout all items in the cart for payment and order generation. For COD, order will be directly generated, whereas for other checkout modes, user will be redirected to a payment gateway.

*Returned Response:*




[CartCheckoutResponse](#CartCheckoutResponse)

Success. Returns the status of cart checkout. Refer `CartCheckoutResponseSchema` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Address id not found</i></summary>

```json
{
  "value": {
    "success": false,
    "message": "No address found with address id {address_id}"
  }
}
```
</details>

<details>
<summary><i>&nbsp; Missing address_id</i></summary>

```json
{
  "value": {
    "address_id": [
      "Missing data for required field."
    ]
  }
}
```
</details>

<details>
<summary><i>&nbsp; Successful checkout cod payment</i></summary>

```json
{
  "value": {
    "success": true,
    "cart": {
      "success": true,
      "error_message": "Note: Your order delivery will be delayed by 7-10 Days",
      "payment_options": {
        "payment_option": [
          {
            "name": "COD",
            "display_name": "Cash on Delivery",
            "display_priority": 1,
            "payment_mode_id": 11,
            "logo": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/cod.png",
            "logo_url": {
              "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/cod.png",
              "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/cod.png"
            },
            "list": []
          },
          {
            "name": "CARD",
            "display_priority": 2,
            "payment_mode_id": 2,
            "display_name": "Card",
            "list": []
          },
          {
            "name": "NB",
            "display_priority": 3,
            "payment_mode_id": 3,
            "display_name": "Net Banking",
            "list": [
              {
                "aggregator_name": "Razorpay",
                "bank_name": "ICICI Bank",
                "bank_code": "ICIC",
                "url": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/NB_ICICI.png",
                "logo_url": {
                  "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/NB_ICICI.png",
                  "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/NB_ICICI.png"
                },
                "merchant_code": "NB_ICICI",
                "display_priority": 1
              }
            ]
          },
          {
            "name": "WL",
            "display_priority": 4,
            "payment_mode_id": 4,
            "display_name": "Wallet",
            "list": [
              {
                "wallet_name": "Paytm",
                "wallet_code": "paytm",
                "wallet_id": 4,
                "merchant_code": "PAYTM",
                "logo_url": {
                  "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/paytm_logo_small.png",
                  "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/paytm_logo_large.png"
                },
                "aggregator_name": "Juspay",
                "display_priority": 1
              }
            ]
          },
          {
            "name": "UPI",
            "display_priority": 9,
            "payment_mode_id": 6,
            "display_name": "UPI",
            "list": [
              {
                "aggregator_name": "UPI_Razorpay",
                "name": "UPI",
                "display_name": "BHIM UPI",
                "code": "UPI",
                "logo_url": {
                  "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/upi_100x78.png",
                  "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/upi_150x100.png"
                },
                "merchant_code": "UPI",
                "timeout": 240,
                "retry_count": 0,
                "fynd_vpa": "shopsense.rzp@hdfcbank",
                "intent_flow": true,
                "intent_app_error_list": [
                  "com.csam.icici.bank.imobile",
                  "in.org.npci.upiapp",
                  "com.whatsapp"
                ]
              }
            ]
          },
          {
            "name": "PL",
            "display_priority": 11,
            "payment_mode_id": 1,
            "display_name": "Pay Later",
            "list": [
              {
                "aggregator_name": "Simpl",
                "name": "Simpl",
                "code": "simpl",
                "merchant_code": "SIMPL",
                "logo": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/simpl_logo.png",
                "logo_url": {
                  "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/simpl_logo.png",
                  "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/simpl_logo.png"
                }
              }
            ]
          }
        ],
        "payment_flows": {
          "Simpl": {
            "data": {
              "gateway": {
                "route": "simpl",
                "entity": "sdk",
                "is_customer_validation_required": true,
                "cust_validation_url": "https://api.addsale.com/gringotts/api/v1/validate-customer/",
                "sdk": {
                  "config": {
                    "redirect": false,
                    "callback_url": null,
                    "action_url": "https://api.addsale.com/avis/api/v1/payments/charge-gringotts-transaction/"
                  },
                  "data": {
                    "user_phone": "8452996729",
                    "user_email": "paymentsdummy@gofynd.com"
                  }
                },
                "return_url": null
              }
            },
            "api_link": "",
            "payment_flow": "sdk"
          },
          "Juspay": {
            "data": {},
            "api_link": "https://sandbox.juspay.in/txns",
            "payment_flow": "api"
          },
          "Razorpay": {
            "data": {},
            "api_link": "",
            "payment_flow": "sdk"
          },
          "UPI_Razorpay": {
            "data": {},
            "api_link": "https://api.addsale.com/gringotts/api/v1/external/payment-initialisation/",
            "payment_flow": "api"
          },
          "Fynd": {
            "data": {},
            "api_link": "",
            "payment_flow": "api"
          }
        },
        "default": {}
      },
      "user_type": "Store User",
      "cod_charges": 0,
      "order_id": "FY5D5E215CF287584CE6",
      "cod_available": true,
      "cod_message": "No additional COD charges applicable",
      "delivery_charges": 0,
      "delivery_charge_order_value": 0,
      "delivery_slots": [
        {
          "date": "Sat, 24 Aug",
          "delivery_slot": [
            {
              "delivery_slot_timing": "By 9:00 PM",
              "default": true,
              "delivery_slot_id": 1
            }
          ]
        }
      ],
      "store_code": "",
      "store_emps": [],
      "breakup_values": {
        "coupon": {
          "type": "cash",
          "code": "",
          "uid": null,
          "value": 0,
          "is_applied": false,
          "message": "Sorry! Invalid Coupon"
        },
        "loyalty_points": {
          "total": 0,
          "applicable": 0,
          "is_applied": false,
          "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
        },
        "raw": {
          "cod_charge": 0,
          "convenience_fee": 0,
          "coupon": 0,
          "delivery_charge": 0,
          "discount": 0,
          "fynd_cash": 0,
          "gst_charges": 214.18,
          "mrp_total": 1999,
          "subtotal": 1999,
          "total": 1999,
          "vog": 1784.82,
          "you_saved": 0
        },
        "display": [
          {
            "display": "MRP Total",
            "key": "mrp_total",
            "value": 1999,
            "currency_code": "INR"
          },
          {
            "display": "Subtotal",
            "key": "subtotal",
            "value": 1999,
            "currency_code": "INR"
          },
          {
            "display": "Total",
            "key": "total",
            "value": 1999,
            "currency_code": "INR"
          }
        ]
      },
      "items": [
        {
          "key": "820312_L",
          "message": "",
          "bulk_offer": {},
          "price": {
            "base": {
              "add_on": 1999,
              "marked": 1999,
              "effective": 1999,
              "selling": 1999,
              "currency_code": "INR"
            },
            "converted": {
              "add_on": 1999,
              "marked": 1999,
              "effective": 1999,
              "selling": 1999,
              "currency_code": "INR"
            }
          },
          "quantity": 1,
          "discount": "",
          "product": {
            "type": "product",
            "uid": 820312,
            "name": "Navy Blue Melange Shorts",
            "slug": "883-police-navy-blue-melange-shorts-820312-4943a8",
            "brand": {
              "uid": 610,
              "name": "883 Police"
            },
            "categories": [
              {
                "uid": 193,
                "name": "Shorts"
              }
            ],
            "images": [
              {
                "aspect_ratio": "16:25",
                "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/610_SPIRAL19ANAVY/1_1549105947281.jpg",
                "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/610_SPIRAL19ANAVY/1_1549105947281.jpg"
              }
            ],
            "action": {
              "type": "product",
              "url": "https://api.addsale.com/platform/content/v1/products/883-police-navy-blue-melange-shorts-820312-4943a8/",
              "query": {
                "product_slug": [
                  "883-police-navy-blue-melange-shorts-820312-4943a8"
                ]
              }
            }
          },
          "article": {
            "type": "article",
            "uid": "381_610_IGPL01_SPIRAL19ANAVY_L",
            "size": "L",
            "seller": {
              "uid": 381,
              "name": "INTERSOURCE GARMENTS PVT LTD"
            },
            "store": {
              "uid": 3009,
              "name": "Kormangala"
            },
            "quantity": 2,
            "price": {
              "base": {
                "marked": 1999,
                "effective": 1999,
                "currency_code": "INR"
              },
              "converted": {
                "marked": 1999,
                "effective": 1999,
                "currency_code": "INR"
              }
            }
          },
          "coupon_message": "",
          "availability": {
            "sizes": [
              "L",
              "XL",
              "XXL"
            ],
            "other_store_quantity": 1,
            "out_of_stock": false,
            "deliverable": true,
            "is_valid": true
          }
        }
      ],
      "delivery_charge_info": "",
      "coupon_text": "View all offers",
      "cart_id": 7483,
      "uid": "7483",
      "gstin": null,
      "checkout_mode": "self",
      "last_modified": "Thu, 22 Aug 2019 04:58:44 GMT",
      "restrict_checkout": false,
      "is_valid": true
    },
    "callback_url": "https://api.addsale.com/gringotts/api/v1/external/payment-callback/",
    "app_intercept_url": "http://uniket-testing.addsale.link/cart/order-status",
    "message": "",
    "data": {
      "order_id": "FY5D5E215CF287584CE6"
    },
    "order_id": "FY5D5E215CF287584CE6"
  }
}
```
</details>

</details>









---


### updateCartMeta
Update the cart meta




```kotlin
applicationClient.cart.updateCartMeta(id: id, buyNow: buyNow, body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| id | String? | no |  |   
| buyNow | Boolean? | no |  |  
| body | [CartMetaRequest](#CartMetaRequest) | yes | Request body |


Use this API to update cart meta like checkout_mode and gstin.

*Returned Response:*




[CartMetaResponse](#CartMetaResponse)

Returns a message indicating the success of cart meta updation as shown below.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "message": "cart meta updated"
}
```
</details>









---


### getCartShareLink
Generate token for sharing the cart




```kotlin
applicationClient.cart.getCartShareLink(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [GetShareCartLinkRequest](#GetShareCartLinkRequest) | yes | Request body |


Use this API to generate a shared cart snapshot and return a shortlink token. The link can be shared with other users for getting the same items in their cart.

*Returned Response:*




[GetShareCartLinkResponse](#GetShareCartLinkResponse)

Returns a URL to share and a token as shown below.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Token Generated</i></summary>

```json
{
  "value": {
    "token": "ZweG1XyX",
    "share_url": "https://uniket-testing.addsale.link/shared-cart/ZweG1XyX"
  }
}
```
</details>

</details>









---


### getCartSharedItems
Get details of a shared cart




```kotlin
applicationClient.cart.getCartSharedItems(token: token).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| token | String | yes | Token of the shared short link |  



Use this API to get the shared cart details as per the token generated using the share-cart API.

*Returned Response:*




[SharedCartResponse](#SharedCartResponse)

Success. Returns a Cart object as per the valid token. Refer `SharedCartResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "cart": {
    "shared_cart_details": {
      "token": "BQ9jySQ9",
      "user": {
        "user_id": "23109086",
        "is_anonymous": false
      },
      "meta": {
        "selected_staff": "",
        "ordering_store": null
      },
      "selected_staff": "",
      "ordering_store": null,
      "source": {},
      "created_on": "2019-12-18T14:00:07.165000"
    },
    "items": [
      {
        "key": "791651_6",
        "discount": "",
        "bulk_offer": {},
        "coupon_message": "",
        "article": {
          "type": "article",
          "uid": "304_1054_9036_R1005753_6",
          "size": "6",
          "seller": {
            "uid": 304,
            "name": "LEAYAN GLOBAL PVT. LTD."
          },
          "store": {
            "uid": 5322,
            "name": "Vaisali Nagar"
          },
          "quantity": 1,
          "price": {
            "base": {
              "marked": 2095,
              "effective": 2095,
              "currency_code": "INR"
            },
            "converted": {
              "marked": 2095,
              "effective": 2095,
              "currency_code": "INR"
            }
          }
        },
        "product": {
          "type": "product",
          "uid": 791651,
          "name": "Black Running Shoes",
          "slug": "furo-black-running-shoes-791651-f8bcc3",
          "brand": {
            "uid": 1054,
            "name": "Furo"
          },
          "categories": [
            {
              "uid": 160,
              "name": "Running Shoes"
            }
          ],
          "images": [
            {
              "aspect_ratio": "16:25",
              "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/1054_R1005753/1_1546490507364.jpg",
              "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/1054_R1005753/1_1546490507364.jpg"
            }
          ],
          "action": {
            "type": "product",
            "url": "https://api.addsale.com/platform/content/v1/products/furo-black-running-shoes-791651-f8bcc3/",
            "query": {
              "product_slug": [
                "furo-black-running-shoes-791651-f8bcc3"
              ]
            }
          }
        },
        "message": "",
        "quantity": 1,
        "availability": {
          "sizes": [
            "7",
            "8",
            "9",
            "10",
            "6"
          ],
          "other_store_quantity": 12,
          "out_of_stock": false,
          "deliverable": true,
          "is_valid": true
        },
        "price": {
          "base": {
            "add_on": 2095,
            "marked": 2095,
            "effective": 2095,
            "selling": 2095,
            "currency_code": "INR"
          },
          "converted": {
            "add_on": 2095,
            "marked": 2095,
            "effective": 2095,
            "selling": 2095,
            "currency_code": "INR"
          }
        }
      },
      {
        "key": "791651_7",
        "discount": "",
        "bulk_offer": {},
        "coupon_message": "",
        "article": {
          "type": "article",
          "uid": "304_1054_9036_R1005753_7",
          "size": "7",
          "seller": {
            "uid": 304,
            "name": "LEAYAN GLOBAL PVT. LTD."
          },
          "store": {
            "uid": 5322,
            "name": "Vaisali Nagar"
          },
          "quantity": 2,
          "price": {
            "base": {
              "marked": 2095,
              "effective": 2095,
              "currency_code": "INR"
            },
            "converted": {
              "marked": 2095,
              "effective": 2095,
              "currency_code": "INR"
            }
          }
        },
        "product": {
          "type": "product",
          "uid": 791651,
          "name": "Black Running Shoes",
          "slug": "furo-black-running-shoes-791651-f8bcc3",
          "brand": {
            "uid": 1054,
            "name": "Furo"
          },
          "categories": [
            {
              "uid": 160,
              "name": "Running Shoes"
            }
          ],
          "images": [
            {
              "aspect_ratio": "16:25",
              "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/1054_R1005753/1_1546490507364.jpg",
              "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/1054_R1005753/1_1546490507364.jpg"
            }
          ],
          "action": {
            "type": "product",
            "url": "https://api.addsale.com/platform/content/v1/products/furo-black-running-shoes-791651-f8bcc3/",
            "query": {
              "product_slug": [
                "furo-black-running-shoes-791651-f8bcc3"
              ]
            }
          }
        },
        "message": "",
        "quantity": 2,
        "availability": {
          "sizes": [
            "7",
            "8",
            "9",
            "10",
            "6"
          ],
          "other_store_quantity": 7,
          "out_of_stock": false,
          "deliverable": true,
          "is_valid": true
        },
        "price": {
          "base": {
            "add_on": 4190,
            "marked": 4190,
            "effective": 4190,
            "selling": 4190,
            "currency_code": "INR"
          },
          "converted": {
            "add_on": 4190,
            "marked": 4190,
            "effective": 4190,
            "selling": 4190,
            "currency_code": "INR"
          }
        }
      }
    ],
    "cart_id": 13055,
    "uid": "13055",
    "breakup_values": {
      "raw": {
        "cod_charge": 0,
        "convenience_fee": 0,
        "coupon": 0,
        "delivery_charge": 0,
        "discount": 0,
        "fynd_cash": 0,
        "gst_charges": 958.73,
        "mrp_total": 6285,
        "subtotal": 6285,
        "total": 6285,
        "vog": 5326.27,
        "you_saved": 0
      },
      "loyalty_points": {
        "total": 0,
        "applicable": 0,
        "is_applied": false,
        "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
      },
      "coupon": {
        "type": "cash",
        "code": "",
        "uid": null,
        "value": 0,
        "is_applied": false,
        "message": "Sorry! Invalid coupon"
      },
      "display": [
        {
          "display": "MRP Total",
          "key": "mrp_total",
          "value": 6285,
          "currency_code": "INR"
        },
        {
          "display": "Subtotal",
          "key": "subtotal",
          "value": 6285,
          "currency_code": "INR"
        },
        {
          "display": "Total",
          "key": "total",
          "value": 6285,
          "currency_code": "INR"
        }
      ]
    },
    "delivery_charge_info": "",
    "coupon_text": "View all offers",
    "gstin": null,
    "comment": "",
    "checkout_mode": "self",
    "payment_selection_lock": {
      "enabled": false,
      "default_options": "COD",
      "payment_identifier": null
    },
    "restrict_checkout": false,
    "is_valid": true,
    "last_modified": "Mon, 16 Dec 2019 07:02:18 GMT"
  },
  "error": ""
}
```
</details>









---


### updateCartWithSharedItems
Merge or replace existing cart




```kotlin
applicationClient.cart.updateCartWithSharedItems(token: token, action: action).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| token | String | yes | Token of the shared short link |   
| action | String | yes | Operation to perform on the existing cart merge or replace. |  



Use this API to merge the shared cart with existing cart, or replace the existing cart with the shared cart. The `action` parameter is used to indicate the operation Merge or Replace.

*Returned Response:*




[SharedCartResponse](#SharedCartResponse)

Success. Returns a merged or replaced cart as per the valid token. Refer `SharedCartResponse` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Cart Merged/Replaced</i></summary>

```json
{
  "value": {
    "cart": {
      "shared_cart_details": {
        "token": "BQ9jySQ9",
        "user": {
          "user_id": "23109086",
          "is_anonymous": false
        },
        "meta": {
          "selected_staff": "",
          "ordering_store": null
        },
        "selected_staff": "",
        "ordering_store": null,
        "source": {},
        "created_on": "2019-12-18T14:00:07.165000"
      },
      "items": [
        {
          "key": "791651_6",
          "discount": "",
          "bulk_offer": {},
          "coupon_message": "",
          "article": {
            "type": "article",
            "uid": "304_1054_9036_R1005753_6",
            "size": "6",
            "seller": {
              "uid": 304,
              "name": "LEAYAN GLOBAL PVT. LTD."
            },
            "store": {
              "uid": 5322,
              "name": "Vaisali Nagar"
            },
            "quantity": 1,
            "price": {
              "base": {
                "marked": 2095,
                "effective": 2095,
                "currency_code": "INR"
              },
              "converted": {
                "marked": 2095,
                "effective": 2095,
                "currency_code": "INR"
              }
            }
          },
          "product": {
            "type": "product",
            "uid": 791651,
            "name": "Black Running Shoes",
            "slug": "furo-black-running-shoes-791651-f8bcc3",
            "brand": {
              "uid": 1054,
              "name": "Furo"
            },
            "categories": [
              {
                "uid": 160,
                "name": "Running Shoes"
              }
            ],
            "images": [
              {
                "aspect_ratio": "16:25",
                "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/1054_R1005753/1_1546490507364.jpg",
                "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/1054_R1005753/1_1546490507364.jpg"
              }
            ],
            "action": {
              "type": "product",
              "url": "https://api.addsale.com/platform/content/v1/products/furo-black-running-shoes-791651-f8bcc3/",
              "query": {
                "product_slug": [
                  "furo-black-running-shoes-791651-f8bcc3"
                ]
              }
            }
          },
          "message": "",
          "quantity": 1,
          "availability": {
            "sizes": [
              "7",
              "8",
              "9",
              "10",
              "6"
            ],
            "other_store_quantity": 12,
            "out_of_stock": false,
            "deliverable": true,
            "is_valid": true
          },
          "price": {
            "base": {
              "add_on": 2095,
              "marked": 2095,
              "effective": 2095,
              "selling": 2095,
              "currency_code": "INR"
            },
            "converted": {
              "add_on": 2095,
              "marked": 2095,
              "effective": 2095,
              "selling": 2095,
              "currency_code": "INR"
            }
          }
        },
        {
          "key": "791651_7",
          "discount": "",
          "bulk_offer": {},
          "coupon_message": "",
          "article": {
            "type": "article",
            "uid": "304_1054_9036_R1005753_7",
            "size": "7",
            "seller": {
              "uid": 304,
              "name": "LEAYAN GLOBAL PVT. LTD."
            },
            "store": {
              "uid": 5322,
              "name": "Vaisali Nagar"
            },
            "quantity": 2,
            "price": {
              "base": {
                "marked": 2095,
                "effective": 2095,
                "currency_code": "INR"
              },
              "converted": {
                "marked": 2095,
                "effective": 2095,
                "currency_code": "INR"
              }
            }
          },
          "product": {
            "type": "product",
            "uid": 791651,
            "name": "Black Running Shoes",
            "slug": "furo-black-running-shoes-791651-f8bcc3",
            "brand": {
              "uid": 1054,
              "name": "Furo"
            },
            "categories": [
              {
                "uid": 160,
                "name": "Running Shoes"
              }
            ],
            "images": [
              {
                "aspect_ratio": "16:25",
                "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/1054_R1005753/1_1546490507364.jpg",
                "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/1054_R1005753/1_1546490507364.jpg"
              }
            ],
            "action": {
              "type": "product",
              "url": "https://api.addsale.com/platform/content/v1/products/furo-black-running-shoes-791651-f8bcc3/",
              "query": {
                "product_slug": [
                  "furo-black-running-shoes-791651-f8bcc3"
                ]
              }
            }
          },
          "message": "",
          "quantity": 2,
          "availability": {
            "sizes": [
              "7",
              "8",
              "9",
              "10",
              "6"
            ],
            "other_store_quantity": 7,
            "out_of_stock": false,
            "deliverable": true,
            "is_valid": true
          },
          "price": {
            "base": {
              "add_on": 4190,
              "marked": 4190,
              "effective": 4190,
              "selling": 4190,
              "currency_code": "INR"
            },
            "converted": {
              "add_on": 4190,
              "marked": 4190,
              "effective": 4190,
              "selling": 4190,
              "currency_code": "INR"
            }
          }
        }
      ],
      "cart_id": 13055,
      "uid": "13055",
      "breakup_values": {
        "raw": {
          "cod_charge": 0,
          "convenience_fee": 0,
          "coupon": 0,
          "delivery_charge": 0,
          "discount": 0,
          "fynd_cash": 0,
          "gst_charges": 958.73,
          "mrp_total": 6285,
          "subtotal": 6285,
          "total": 6285,
          "vog": 5326.27,
          "you_saved": 0
        },
        "loyalty_points": {
          "total": 0,
          "applicable": 0,
          "is_applied": false,
          "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
        },
        "coupon": {
          "type": "cash",
          "code": "",
          "uid": null,
          "value": 0,
          "is_applied": false,
          "message": "Sorry! Invalid coupon"
        },
        "display": [
          {
            "display": "MRP Total",
            "key": "mrp_total",
            "value": 6285,
            "currency_code": "INR"
          },
          {
            "display": "Subtotal",
            "key": "subtotal",
            "value": 6285,
            "currency_code": "INR"
          },
          {
            "display": "Total",
            "key": "total",
            "value": 6285,
            "currency_code": "INR"
          }
        ]
      },
      "delivery_charge_info": "",
      "coupon_text": "View all offers",
      "gstin": null,
      "comment": "",
      "checkout_mode": "self",
      "payment_selection_lock": {
        "enabled": false,
        "default_options": "COD",
        "payment_identifier": null
      },
      "restrict_checkout": false,
      "is_valid": true,
      "last_modified": "Mon, 16 Dec 2019 07:02:18 GMT"
    }
  }
}
```
</details>

</details>









---


### getPromotionOffers
Fetch available promotions




```kotlin
applicationClient.cart.getPromotionOffers(slug: slug, pageSize: pageSize, promotionGroup: promotionGroup).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| slug | String? | no | A short, human-readable, URL-friendly identifier of a product. You can get slug value from the endpoint /service/application/catalog/v1.0/products/ |   
| pageSize | Int? | no | Number of offers to be fetched to show |   
| promotionGroup | String? | no | Type of promotion groups |  



Use this API to get top 5 offers available for current product

*Returned Response:*




[PromotionOffersResponse](#PromotionOffersResponse)

Success. Returns a array containing the available offers (if exists) on product via promotions. Refer `PromotionOffersResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "available_promotions": [
    {
      "offer_text": "Buy 2 apple/gionee product get 500 off",
      "description": "Test promotion",
      "id": "61d1db23f5b315cf265126c0",
      "valid_till": "2022-03-29T09:05:49.063Z",
      "promotion_group": "cart"
    },
    {
      "offer_text": "Buy 2 apple/gionee product get 500 off",
      "description": "Test promotion",
      "id": "6203cb1393506f8a75ecd566",
      "valid_till": "2022-03-29T09:05:49.063Z",
      "promotion_group": "product"
    },
    {
      "offer_text": "Buy 2 apple/gionee product get 500 off",
      "description": "Test promotion",
      "id": "6203cb1393506f8a75ecd567",
      "valid_till": "2022-03-29T09:05:49.063Z",
      "promotion_group": "product"
    },
    {
      "offer_text": "Buy 2 apple/gionee product get 500 off",
      "description": "Test promotion",
      "id": "6203cb1393506f8a75ecd569",
      "valid_till": "2022-03-29T09:05:49.063Z",
      "promotion_group": "product"
    }
  ]
}
```
</details>









---


### getLadderOffers
Fetch ladder price promotion




```kotlin
applicationClient.cart.getLadderOffers(slug: slug, storeId: storeId, promotionId: promotionId, pageSize: pageSize).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| slug | String | yes | A short, human-readable, URL-friendly identifier of a product. You can get slug value from the endpoint /service/application/catalog/v1.0/products/ |   
| storeId | String? | no | Store uid of assigned store on PDP page. If not passed default first created ladder will be returned |   
| promotionId | String? | no | Get ladder information of given promotion id explicitely |   
| pageSize | Int? | no | Number of offers to be fetched to show |  



Use this API to get applicable ladder price promotion for current product

*Returned Response:*




[LadderPriceOffers](#LadderPriceOffers)

Success. Returns a object containing the applicable ladder price offers (if exists) on product. Refer `PromotionOffersResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "available_offers": [
    {
      "id": "6203cb1393506f8a75ecd56b",
      "offer_text": "Ladder Price 2",
      "description": "Ladder Price 2",
      "offer_prices": [
        {
          "min_quantity": 0,
          "max_quantity": 0,
          "margin": 5,
          "type": "percentage",
          "price": {
            "marked": 5499,
            "effective": 5499,
            "offer_price": 5224.05
          }
        },
        {
          "min_quantity": 0,
          "max_quantity": 0,
          "margin": 10,
          "type": "percentage",
          "price": {
            "marked": 5499,
            "effective": 5499,
            "offer_price": 4949.1
          }
        },
        {
          "min_quantity": 0,
          "max_quantity": 0,
          "margin": 20,
          "type": "percentage",
          "price": {
            "marked": 5499,
            "effective": 5499,
            "offer_price": 4399.2
          }
        }
      ]
    },
    {
      "id": "6203cb1393506f8a75ecd56a",
      "offer_text": "Ladder Price 1",
      "description": "Ladder Price 1",
      "offer_prices": [
        {
          "min_quantity": 0,
          "max_quantity": 0,
          "margin": 10,
          "type": "amount",
          "price": {
            "marked": 5499,
            "effective": 5499,
            "offer_price": 4949.1
          }
        },
        {
          "min_quantity": 0,
          "max_quantity": 0,
          "margin": 15,
          "type": "amount",
          "price": {
            "marked": 5499,
            "effective": 5499,
            "offer_price": 4674.15
          }
        },
        {
          "min_quantity": 0,
          "max_quantity": 0,
          "margin": 20,
          "type": "amount",
          "price": {
            "marked": 5499,
            "effective": 5499,
            "offer_price": 4399.2
          }
        }
      ]
    }
  ],
  "currency": {
    "code": "INR",
    "symbol": "₹"
  }
}
```
</details>









---



### Schemas

 
 
 #### [PaymentSelectionLock](#PaymentSelectionLock)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | paymentIdentifier | String? |  yes  |  |
 | enabled | Boolean? |  yes  |  |
 | defaultOptions | String? |  yes  |  |

---


 
 
 #### [CartCurrency](#CartCurrency)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | String? |  yes  | Currency code defined by ISO 4217:2015 |
 | symbol | String? |  yes  |  |

---


 
 
 #### [ProductImage](#ProductImage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | aspectRatio | String? |  yes  |  |
 | url | String? |  yes  |  |
 | secureUrl | String? |  yes  |  |

---


 
 
 #### [CategoryInfo](#CategoryInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | uid | Int? |  yes  | Product Category Id |
 | name | String? |  yes  |  |

---


 
 
 #### [ActionQuery](#ActionQuery)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | productSlug | ArrayList<String>? |  yes  | Contains list of product slug |

---


 
 
 #### [ProductAction](#ProductAction)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | url | String? |  yes  |  |
 | type | String? |  yes  |  |
 | query | [ActionQuery](#ActionQuery)? |  yes  |  |

---


 
 
 #### [BaseInfo](#BaseInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | uid | Int? |  yes  |  |
 | name | String? |  yes  |  |

---


 
 
 #### [CartProduct](#CartProduct)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | images | ArrayList<[ProductImage](#ProductImage)>? |  yes  |  |
 | categories | ArrayList<[CategoryInfo](#CategoryInfo)>? |  yes  |  |
 | type | String? |  yes  |  |
 | action | [ProductAction](#ProductAction)? |  yes  |  |
 | uid | Int? |  yes  |  |
 | brand | [BaseInfo](#BaseInfo)? |  yes  |  |
 | slug | String? |  yes  | Unique product url name generated via product name and other meta data |
 | name | String? |  yes  |  |

---


 
 
 #### [ProductAvailabilitySize](#ProductAvailabilitySize)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isAvailable | Boolean? |  yes  |  |
 | value | String? |  yes  |  |
 | display | String? |  yes  |  |

---


 
 
 #### [ProductAvailability](#ProductAvailability)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isValid | Boolean? |  yes  |  |
 | deliverable | Boolean? |  yes  |  |
 | otherStoreQuantity | Int? |  yes  |  |
 | availableSizes | ArrayList<[ProductAvailabilitySize](#ProductAvailabilitySize)>? |  yes  |  |
 | outOfStock | Boolean? |  yes  |  |
 | sizes | ArrayList<String>? |  yes  |  |

---


 
 
 #### [Ownership](#Ownership)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | payableCategory | String? |  yes  | promo amount payable category |
 | payableBy | String? |  yes  | promo amount bearable party |

---


 
 
 #### [AppliedPromotion](#AppliedPromotion)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | promoId | String? |  yes  | Promotion id |
 | promotionType | String? |  yes  | Promotion type of current promotion |
 | offerText | String? |  yes  | Offer text of current promotion |
 | articleQuantity | Int? |  yes  | Quantity of article on which promotion is applicable |
 | mrpPromotion | Boolean? |  yes  | If applied promotion is applied on product MRP or ESP |
 | ownership | [Ownership](#Ownership)? |  yes  | Ownership of promotion |
 | amount | Double? |  yes  | Per unit discount amount applied with current promotion |

---


 
 
 #### [BasePrice](#BasePrice)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | currencyCode | String? |  yes  |  |
 | effective | Double? |  yes  |  |
 | marked | Double? |  yes  |  |
 | currencySymbol | String? |  yes  |  |

---


 
 
 #### [ArticlePriceInfo](#ArticlePriceInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | converted | [BasePrice](#BasePrice)? |  yes  |  |
 | base | [BasePrice](#BasePrice)? |  yes  |  |

---


 
 
 #### [ProductArticle](#ProductArticle)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | size | String? |  yes  |  |
 | type | String? |  yes  |  |
 | seller | [BaseInfo](#BaseInfo)? |  yes  |  |
 | extraMeta | HashMap<String,Any>? |  yes  |  |
 | customJson | HashMap<String,Any>? |  yes  |  |
 | store | [BaseInfo](#BaseInfo)? |  yes  |  |
 | uid | String? |  yes  |  |
 | parentItemIdentifiers | HashMap<String,Any>? |  yes  |  |
 | price | [ArticlePriceInfo](#ArticlePriceInfo)? |  yes  |  |
 | productGroupTags | ArrayList<String>? |  yes  |  |
 | quantity | Int? |  yes  |  |

---


 
 
 #### [CartProductIdentifer](#CartProductIdentifer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | identifier | String? |  yes  | Article idenfier generated by cart |

---


 
 
 #### [ProductPrice](#ProductPrice)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | effective | Double? |  yes  |  |
 | addOn | Double? |  yes  |  |
 | currencySymbol | String? |  yes  |  |
 | currencyCode | String? |  yes  |  |
 | selling | Double? |  yes  |  |
 | marked | Double? |  yes  |  |

---


 
 
 #### [ProductPriceInfo](#ProductPriceInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | converted | [ProductPrice](#ProductPrice)? |  yes  |  |
 | base | [ProductPrice](#ProductPrice)? |  yes  |  |

---


 
 
 #### [PromoMeta](#PromoMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |

---


 
 
 #### [PromiseTimestamp](#PromiseTimestamp)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | min | Double? |  yes  |  |
 | max | Double? |  yes  |  |

---


 
 
 #### [PromiseFormatted](#PromiseFormatted)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | min | String? |  yes  |  |
 | max | String? |  yes  |  |

---


 
 
 #### [ShipmentPromise](#ShipmentPromise)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | timestamp | [PromiseTimestamp](#PromiseTimestamp)? |  yes  |  |
 | formatted | [PromiseFormatted](#PromiseFormatted)? |  yes  |  |

---


 
 
 #### [CartProductInfo](#CartProductInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | product | [CartProduct](#CartProduct)? |  yes  |  |
 | availability | [ProductAvailability](#ProductAvailability)? |  yes  |  |
 | moq | HashMap<String,Any>? |  yes  |  |
 | discount | String? |  yes  |  |
 | message | String? |  yes  |  |
 | promotionsApplied | ArrayList<[AppliedPromotion](#AppliedPromotion)>? |  yes  |  |
 | article | [ProductArticle](#ProductArticle)? |  yes  |  |
 | identifiers | [CartProductIdentifer](#CartProductIdentifer) |  no  |  |
 | isSet | Boolean? |  yes  |  |
 | parentItemIdentifiers | HashMap<String,Any>? |  yes  |  |
 | price | [ProductPriceInfo](#ProductPriceInfo)? |  yes  |  |
 | promoMeta | [PromoMeta](#PromoMeta)? |  yes  |  |
 | key | String? |  yes  |  |
 | deliveryPromise | [ShipmentPromise](#ShipmentPromise)? |  yes  |  |
 | quantity | Int? |  yes  |  |
 | pricePerUnit | [ProductPriceInfo](#ProductPriceInfo)? |  yes  |  |
 | bulkOffer | HashMap<String,Any>? |  yes  |  |
 | couponMessage | String? |  yes  |  |

---


 
 
 #### [RawBreakup](#RawBreakup)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fyndCash | Double? |  yes  |  |
 | subtotal | Double? |  yes  |  |
 | codCharge | Double? |  yes  |  |
 | vog | Double? |  yes  |  |
 | gstCharges | Double? |  yes  |  |
 | discount | Double? |  yes  |  |
 | youSaved | Double? |  yes  |  |
 | total | Double? |  yes  |  |
 | deliveryCharge | Double? |  yes  |  |
 | coupon | Double? |  yes  |  |
 | mrpTotal | Double? |  yes  |  |
 | convenienceFee | Double? |  yes  |  |

---


 
 
 #### [CouponBreakup](#CouponBreakup)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  |  |
 | code | String? |  yes  |  |
 | isApplied | Boolean? |  yes  |  |
 | message | String? |  yes  |  |
 | value | Double? |  yes  |  |
 | uid | String? |  yes  |  |

---


 
 
 #### [LoyaltyPoints](#LoyaltyPoints)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | total | Double? |  yes  |  |
 | description | String? |  yes  |  |
 | applicable | Double? |  yes  |  |
 | isApplied | Boolean? |  yes  |  |

---


 
 
 #### [DisplayBreakup](#DisplayBreakup)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | String? |  yes  |  |
 | currencySymbol | String? |  yes  |  |
 | message | ArrayList<String>? |  yes  |  |
 | currencyCode | String? |  yes  |  |
 | value | Double? |  yes  |  |
 | key | String? |  yes  |  |

---


 
 
 #### [CartBreakup](#CartBreakup)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | raw | [RawBreakup](#RawBreakup)? |  yes  |  |
 | coupon | [CouponBreakup](#CouponBreakup)? |  yes  |  |
 | loyaltyPoints | [LoyaltyPoints](#LoyaltyPoints)? |  yes  |  |
 | display | ArrayList<[DisplayBreakup](#DisplayBreakup)>? |  yes  |  |

---


 
 
 #### [CartDetailResponse](#CartDetailResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isValid | Boolean? |  yes  |  |
 | paymentSelectionLock | [PaymentSelectionLock](#PaymentSelectionLock)? |  yes  |  |
 | buyNow | Boolean? |  yes  |  |
 | lastModified | String? |  yes  |  |
 | gstin | String? |  yes  |  |
 | currency | [CartCurrency](#CartCurrency)? |  yes  |  |
 | items | ArrayList<[CartProductInfo](#CartProductInfo)>? |  yes  |  |
 | message | String? |  yes  |  |
 | breakupValues | [CartBreakup](#CartBreakup)? |  yes  |  |
 | id | String? |  yes  |  |
 | restrictCheckout | Boolean? |  yes  |  |
 | comment | String? |  yes  |  |
 | appliedPromoDetails | ArrayList<[AppliedPromotion](#AppliedPromotion)>? |  yes  |  |
 | deliveryPromise | [ShipmentPromise](#ShipmentPromise)? |  yes  |  |
 | couponText | String? |  yes  |  |
 | deliveryChargeInfo | String? |  yes  |  |
 | checkoutMode | String? |  yes  |  |

---


 
 
 #### [AddProductCart](#AddProductCart)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sellerId | Int? |  yes  |  |
 | articleAssignment | HashMap<String,Any>? |  yes  |  |
 | extraMeta | HashMap<String,Any>? |  yes  |  |
 | customJson | HashMap<String,Any>? |  yes  |  |
 | display | String? |  yes  |  |
 | storeId | Int? |  yes  |  |
 | parentItemIdentifiers | ArrayList<HashMap<String,String>>? |  yes  |  |
 | pos | Boolean? |  yes  |  |
 | itemId | Int? |  yes  |  |
 | itemSize | String? |  yes  |  |
 | productGroupTags | ArrayList<String>? |  yes  |  |
 | articleId | String? |  yes  |  |
 | quantity | Int? |  yes  |  |

---


 
 
 #### [AddCartRequest](#AddCartRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[AddProductCart](#AddProductCart)>? |  yes  |  |

---


 
 
 #### [AddCartDetailResponse](#AddCartDetailResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | partial | Boolean? |  yes  | When adding multiple items check if all added. True if only few are added. |
 | cart | [CartDetailResponse](#CartDetailResponse)? |  yes  |  |
 | success | Boolean? |  yes  | True if all items are added successfully. False if partially added or not added. |
 | message | String? |  yes  |  |

---


 
 
 #### [UpdateProductCart](#UpdateProductCart)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | customJson | HashMap<String,Any>? |  yes  |  |
 | extraMeta | HashMap<String,Any>? |  yes  |  |
 | itemIndex | Int? |  yes  |  |
 | identifiers | [CartProductIdentifer](#CartProductIdentifer) |  no  |  |
 | parentItemIdentifiers | HashMap<String,Any>? |  yes  |  |
 | itemId | Int? |  yes  |  |
 | itemSize | String? |  yes  |  |
 | quantity | Int? |  yes  |  |
 | articleId | String? |  yes  |  |

---


 
 
 #### [UpdateCartRequest](#UpdateCartRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | operation | String |  no  |  |
 | items | ArrayList<[UpdateProductCart](#UpdateProductCart)>? |  yes  |  |

---


 
 
 #### [UpdateCartDetailResponse](#UpdateCartDetailResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cart | [CartDetailResponse](#CartDetailResponse)? |  yes  |  |
 | success | Boolean? |  yes  | True if all items are added successfully. False if partially added or not added. |
 | message | String? |  yes  |  |

---


 
 
 #### [CartItemCountResponse](#CartItemCountResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | userCartItemsCount | Int? |  yes  | Item count present in cart |

---


 
 
 #### [Coupon](#Coupon)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | subTitle | String? |  yes  |  |
 | maxDiscountValue | Double? |  yes  |  |
 | isApplied | Boolean? |  yes  |  |
 | expiresOn | String? |  yes  |  |
 | couponCode | String? |  yes  |  |
 | couponValue | Double? |  yes  |  |
 | message | String? |  yes  |  |
 | title | String? |  yes  |  |
 | minimumCartValue | Double? |  yes  |  |
 | isApplicable | Boolean? |  yes  |  |

---


 
 
 #### [PageCoupon](#PageCoupon)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | hasPrevious | Boolean? |  yes  |  |
 | current | Int? |  yes  |  |
 | total | Int? |  yes  |  |
 | hasNext | Boolean? |  yes  |  |
 | totalItemCount | Int? |  yes  |  |

---


 
 
 #### [GetCouponResponse](#GetCouponResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | availableCouponList | ArrayList<[Coupon](#Coupon)>? |  yes  |  |
 | page | [PageCoupon](#PageCoupon)? |  yes  |  |

---


 
 
 #### [ApplyCouponRequest](#ApplyCouponRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | couponCode | String |  no  | Coupon code to be applied |

---


 
 
 #### [OfferPrice](#OfferPrice)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | effective | Int? |  yes  | Current per unit price of product after existing deductions |
 | currencySymbol | String? |  yes  | Currency symbol for currency |
 | currencyCode | String? |  yes  | Currency code for all amounts |
 | bulkEffective | Double? |  yes  | Discounted per unit price for current offer object |
 | marked | Int? |  yes  | Original price of product |

---


 
 
 #### [OfferItem](#OfferItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  | Offer type |
 | total | Double? |  yes  | Total price of offer quantity with discount |
 | margin | Int? |  yes  | Percentage value of discount |
 | autoApplied | Boolean? |  yes  | Whether offer discount is auto applied in cart |
 | price | [OfferPrice](#OfferPrice)? |  yes  |  |
 | quantity | Int? |  yes  | Quantity on which offer is applicable |
 | best | Boolean? |  yes  | Is true for best offer from all offers present for all sellers |

---


 
 
 #### [OfferSeller](#OfferSeller)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | uid | Int? |  yes  | Seller id |
 | name | String? |  yes  |  |

---


 
 
 #### [BulkPriceOffer](#BulkPriceOffer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | offers | ArrayList<[OfferItem](#OfferItem)>? |  yes  |  |
 | seller | [OfferSeller](#OfferSeller)? |  yes  |  |

---


 
 
 #### [BulkPriceResponse](#BulkPriceResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[BulkPriceOffer](#BulkPriceOffer)>? |  yes  | Consist of offers from multiple seller |

---


 
 
 #### [RewardPointRequest](#RewardPointRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | points | Boolean |  no  |  |

---


 
 
 #### [GeoLocation](#GeoLocation)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | longitude | Double? |  yes  |  |
 | latitude | Double? |  yes  |  |

---


 
 
 #### [Address](#Address)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tags | ArrayList<String>? |  yes  |  |
 | googleMapPoint | HashMap<String,Any>? |  yes  |  |
 | country | String? |  yes  |  |
 | areaCode | String? |  yes  |  |
 | userId | String? |  yes  |  |
 | email | String? |  yes  |  |
 | isDefaultAddress | Boolean? |  yes  |  |
 | checkoutMode | String? |  yes  |  |
 | areaCodeSlug | String? |  yes  |  |
 | addressType | String? |  yes  |  |
 | meta | HashMap<String,Any>? |  yes  |  |
 | area | String? |  yes  |  |
 | name | String? |  yes  |  |
 | geoLocation | [GeoLocation](#GeoLocation)? |  yes  |  |
 | countryCode | String? |  yes  |  |
 | city | String? |  yes  |  |
 | countryIsoCode | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | id | String? |  yes  |  |
 | state | String? |  yes  |  |
 | address | String? |  yes  |  |
 | countryPhoneCode | String? |  yes  |  |
 | phone | String? |  yes  |  |
 | landmark | String? |  yes  |  |

---


 
 
 #### [GetAddressesResponse](#GetAddressesResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | piiMasking | Boolean? |  yes  |  |
 | address | ArrayList<[Address](#Address)>? |  yes  |  |

---


 
 
 #### [SaveAddressResponse](#SaveAddressResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | success | Boolean? |  yes  |  |
 | isDefaultAddress | Boolean? |  yes  |  |

---


 
 
 #### [UpdateAddressResponse](#UpdateAddressResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | id | String? |  yes  |  |
 | isDefaultAddress | Boolean? |  yes  |  |
 | isUpdated | Boolean? |  yes  |  |

---


 
 
 #### [DeleteAddressResponse](#DeleteAddressResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isDeleted | Boolean? |  yes  |  |
 | id | String? |  yes  |  |

---


 
 
 #### [SelectCartAddressRequest](#SelectCartAddressRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | billingAddressId | String? |  yes  |  |
 | cartId | String? |  yes  |  |

---


 
 
 #### [UpdateCartPaymentRequest](#UpdateCartPaymentRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | addressId | String? |  yes  |  |
 | paymentIdentifier | String? |  yes  |  |
 | id | String? |  yes  |  |
 | paymentMode | String? |  yes  |  |
 | aggregatorName | String? |  yes  |  |
 | merchantCode | String? |  yes  |  |

---


 
 
 #### [CouponValidity](#CouponValidity)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | String? |  yes  |  |
 | displayMessageEn | String? |  yes  |  |
 | title | String? |  yes  |  |
 | discount | Double? |  yes  |  |
 | valid | Boolean? |  yes  |  |

---


 
 
 #### [PaymentCouponValidate](#PaymentCouponValidate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | couponValidity | [CouponValidity](#CouponValidity)? |  yes  |  |
 | success | Boolean |  no  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [ShipmentResponse](#ShipmentResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fulfillmentType | String? |  yes  |  |
 | shipmentType | String? |  yes  |  |
 | boxType | String? |  yes  |  |
 | promise | [ShipmentPromise](#ShipmentPromise)? |  yes  |  |
 | items | ArrayList<[CartProductInfo](#CartProductInfo)>? |  yes  |  |
 | shipments | Int? |  yes  |  |
 | orderType | String? |  yes  |  |
 | dpId | String? |  yes  |  |
 | dpOptions | HashMap<String,Any>? |  yes  |  |
 | fulfillmentId | Int? |  yes  |  |

---


 
 
 #### [CartShipmentsResponse](#CartShipmentsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isValid | Boolean? |  yes  |  |
 | buyNow | Boolean? |  yes  |  |
 | currency | [CartCurrency](#CartCurrency)? |  yes  |  |
 | error | Boolean? |  yes  |  |
 | message | String? |  yes  |  |
 | shipments | ArrayList<[ShipmentResponse](#ShipmentResponse)>? |  yes  |  |
 | couponText | String? |  yes  |  |
 | gstin | String? |  yes  |  |
 | checkoutMode | String? |  yes  |  |
 | paymentSelectionLock | [PaymentSelectionLock](#PaymentSelectionLock)? |  yes  |  |
 | lastModified | String? |  yes  |  |
 | cartId | Int? |  yes  |  |
 | breakupValues | [CartBreakup](#CartBreakup)? |  yes  |  |
 | uid | String? |  yes  |  |
 | comment | String? |  yes  |  |
 | id | String? |  yes  |  |
 | restrictCheckout | Boolean? |  yes  |  |
 | deliveryPromise | [ShipmentPromise](#ShipmentPromise)? |  yes  |  |
 | deliveryChargeInfo | String? |  yes  |  |

---


 
 
 #### [StaffCheckout](#StaffCheckout)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | employeeCode | String? |  yes  |  |
 | firstName | String |  no  |  |
 | id | String |  no  |  |
 | user | String |  no  |  |
 | lastName | String |  no  |  |

---


 
 
 #### [CartCheckoutCustomMeta](#CartCheckoutCustomMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | String |  no  |  |
 | key | String |  no  |  |

---


 
 
 #### [CartCheckoutDetailRequest](#CartCheckoutDetailRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | paymentParams | HashMap<String,Any>? |  yes  |  |
 | staff | [StaffCheckout](#StaffCheckout)? |  yes  |  |
 | extraMeta | HashMap<String,Any>? |  yes  |  |
 | deliveryAddress | HashMap<String,Any>? |  yes  |  |
 | addressId | String? |  yes  |  |
 | merchantCode | String? |  yes  |  |
 | paymentIdentifier | String? |  yes  |  |
 | aggregator | String? |  yes  |  |
 | customMeta | ArrayList<[CartCheckoutCustomMeta](#CartCheckoutCustomMeta)>? |  yes  |  |
 | orderingStore | Int? |  yes  |  |
 | meta | HashMap<String,Any>? |  yes  |  |
 | paymentMode | String |  no  |  |
 | paymentAutoConfirm | Boolean? |  yes  |  |
 | billingAddress | HashMap<String,Any>? |  yes  |  |
 | callbackUrl | String? |  yes  |  |
 | billingAddressId | String? |  yes  |  |

---


 
 
 #### [CheckCart](#CheckCart)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | storeEmps | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | errorMessage | String? |  yes  |  |
 | currency | [CartCurrency](#CartCurrency)? |  yes  |  |
 | couponText | String? |  yes  |  |
 | checkoutMode | String? |  yes  |  |
 | lastModified | String? |  yes  |  |
 | cartId | Int? |  yes  |  |
 | orderId | String? |  yes  |  |
 | items | ArrayList<[CartProductInfo](#CartProductInfo)>? |  yes  |  |
 | breakupValues | [CartBreakup](#CartBreakup)? |  yes  |  |
 | uid | String? |  yes  |  |
 | deliveryPromise | [ShipmentPromise](#ShipmentPromise)? |  yes  |  |
 | deliveryChargeInfo | String? |  yes  |  |
 | codCharges | Int? |  yes  |  |
 | isValid | Boolean? |  yes  |  |
 | buyNow | Boolean? |  yes  |  |
 | deliveryCharges | Int? |  yes  |  |
 | success | Boolean? |  yes  |  |
 | message | String? |  yes  |  |
 | codAvailable | Boolean? |  yes  |  |
 | gstin | String? |  yes  |  |
 | paymentSelectionLock | [PaymentSelectionLock](#PaymentSelectionLock)? |  yes  |  |
 | deliveryChargeOrderValue | Int? |  yes  |  |
 | comment | String? |  yes  |  |
 | id | String? |  yes  |  |
 | restrictCheckout | Boolean? |  yes  |  |
 | userType | String? |  yes  |  |
 | storeCode | String? |  yes  |  |
 | codMessage | String? |  yes  |  |

---


 
 
 #### [CartCheckoutResponse](#CartCheckoutResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cart | [CheckCart](#CheckCart)? |  yes  |  |
 | orderId | String? |  yes  |  |
 | success | Boolean? |  yes  |  |
 | appInterceptUrl | String? |  yes  |  |
 | message | String? |  yes  |  |
 | data | HashMap<String,Any>? |  yes  |  |
 | callbackUrl | String? |  yes  |  |
 | paymentConfirmUrl | String? |  yes  |  |

---


 
 
 #### [CartMetaRequest](#CartMetaRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | comment | String? |  yes  |  |
 | gstin | String? |  yes  |  |
 | checkoutMode | String? |  yes  |  |
 | pickUpCustomerDetails | HashMap<String,Any>? |  yes  | Customer contact details for customer pickup at store |

---


 
 
 #### [CartMetaResponse](#CartMetaResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |

---


 
 
 #### [CartMetaMissingResponse](#CartMetaMissingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | errors | ArrayList<String>? |  yes  |  |

---


 
 
 #### [GetShareCartLinkRequest](#GetShareCartLinkRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  | Cart uid for generating sharing |
 | meta | HashMap<String,Any>? |  yes  | Staff, Ordering store or any other data. This data will be used to generate link as well as sent as shared details. |

---


 
 
 #### [GetShareCartLinkResponse](#GetShareCartLinkResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | token | String? |  yes  | Short url unique id |
 | shareUrl | String? |  yes  | Short shareable final url |

---


 
 
 #### [SharedCartDetails](#SharedCartDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | token | String? |  yes  | Short link id |
 | createdOn | String? |  yes  |  |
 | user | HashMap<String,Any>? |  yes  | User details of who generated share link |
 | meta | HashMap<String,Any>? |  yes  | Meta data sent while generating share cart link |
 | source | HashMap<String,Any>? |  yes  | Share link device and other source information |

---


 
 
 #### [SharedCart](#SharedCart)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | currency | [CartCurrency](#CartCurrency)? |  yes  |  |
 | sharedCartDetails | [SharedCartDetails](#SharedCartDetails)? |  yes  |  |
 | couponText | String? |  yes  |  |
 | checkoutMode | String? |  yes  |  |
 | lastModified | String? |  yes  |  |
 | cartId | Int? |  yes  |  |
 | items | ArrayList<[CartProductInfo](#CartProductInfo)>? |  yes  |  |
 | breakupValues | [CartBreakup](#CartBreakup)? |  yes  |  |
 | uid | String? |  yes  |  |
 | deliveryPromise | [ShipmentPromise](#ShipmentPromise)? |  yes  |  |
 | deliveryChargeInfo | String? |  yes  |  |
 | isValid | Boolean? |  yes  |  |
 | buyNow | Boolean? |  yes  |  |
 | message | String? |  yes  |  |
 | gstin | String? |  yes  |  |
 | paymentSelectionLock | [PaymentSelectionLock](#PaymentSelectionLock)? |  yes  |  |
 | comment | String? |  yes  |  |
 | id | String? |  yes  |  |
 | restrictCheckout | Boolean? |  yes  |  |

---


 
 
 #### [SharedCartResponse](#SharedCartResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cart | [SharedCart](#SharedCart)? |  yes  |  |
 | error | String? |  yes  |  |

---


 
 
 #### [PromotionOffer](#PromotionOffer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | promotionGroup | String? |  yes  | Group of promotion belongs to |
 | description | String? |  yes  | Offer details including T&C |
 | offerText | String? |  yes  | Offer title |
 | id | String? |  yes  | Promotion id |
 | validTill | String? |  yes  | Datetime ISOString for promotion end date |

---


 
 
 #### [PromotionOffersResponse](#PromotionOffersResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | availablePromotions | ArrayList<[PromotionOffer](#PromotionOffer)>? |  yes  |  |

---


 
 
 #### [OperationErrorResponse](#OperationErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [CurrencyInfo](#CurrencyInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | String? |  yes  |  |
 | symbol | String? |  yes  |  |

---


 
 
 #### [LadderPrice](#LadderPrice)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | effective | Int? |  yes  | Current per unit price of product after existing deductions |
 | currencySymbol | String? |  yes  | Currency symbol for currency |
 | currencyCode | String? |  yes  | Currency code for all amounts |
 | offerPrice | Double? |  yes  | Discounted per unit price for current offer object |
 | marked | Int? |  yes  | Original price of product |

---


 
 
 #### [LadderOfferItem](#LadderOfferItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  | Offer type |
 | minQuantity | Int? |  yes  | Minimum quantity from which offer is applicable |
 | margin | Int? |  yes  | Percentage value of discount |
 | price | [LadderPrice](#LadderPrice)? |  yes  |  |
 | maxQuantity | Int? |  yes  | Minimum quantity upto which offer is applicable. If not present that offer is applicable on all quantities |

---


 
 
 #### [LadderPriceOffer](#LadderPriceOffer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | promotionGroup | String? |  yes  | Group of promotion belongs to |
 | description | String? |  yes  | Offer details including T&C |
 | offerPrices | ArrayList<[LadderOfferItem](#LadderOfferItem)>? |  yes  |  |
 | offerText | String? |  yes  | Offer title |
 | id | String? |  yes  | Promotion id |
 | validTill | String? |  yes  | Datetime ISOString for promotion end date |

---


 
 
 #### [LadderPriceOffers](#LadderPriceOffers)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | currency | [CurrencyInfo](#CurrencyInfo)? |  yes  |  |
 | availableOffers | ArrayList<[LadderPriceOffer](#LadderPriceOffer)>? |  yes  |  |

---



