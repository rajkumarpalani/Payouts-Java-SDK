// This class was generated on Mon, 16 Dec 2019 21:04:40 IST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// PayoutsItemGetRequest.java
// @version 0.1.0-dev+904328-dirty
// @type request
// @data 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
// DO NOT EDIT
package com.paypal.payouts;

import com.paypal.http.HttpRequest;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Shows details for a payout item, by ID. A <code>payout_item_id</code> helps you identify denied payments. If a payment is denied, you can use the <code>payout_item_id</code> to identify the payment even if it lacks a <code>transaction_id</code>.
 */
public class PayoutsItemGetRequest extends HttpRequest<PayoutItemResponse> {

    public PayoutsItemGetRequest(String payoutItemId) {
        super("/v1/payments/payouts-item/{payout_item_id}?", "GET", PayoutItemResponse.class);
        try {
            path(path().replace("{payout_item_id}", URLEncoder.encode(String.valueOf(payoutItemId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {
        }

        header("Content-Type", "application/json");
    }

}