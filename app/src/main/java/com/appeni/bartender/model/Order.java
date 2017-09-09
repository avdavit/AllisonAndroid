
package com.appeni.bartender.model;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Order {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("account_id")
    @Expose
    private String accountId;
    @SerializedName("order_id")
    @Expose
    private Object orderId;
    @SerializedName("website_id")
    @Expose
    private String websiteId;
    @SerializedName("customer_id")
    @Expose
    private String customerId;
    @SerializedName("promotion_id")
    @Expose
    private Object promotionId;
    @SerializedName("provider_id")
    @Expose
    private String providerId;
    @SerializedName("payment_id")
    @Expose
    private Object paymentId;
    @SerializedName("vehicle_id")
    @Expose
    private Object vehicleId;
    @SerializedName("api")
    @Expose
    private Object api;
    @SerializedName("data")
    @Expose
    private String data;
    @SerializedName("providers")
    @Expose
    private Object providers;
    @SerializedName("order_date")
    @Expose
    private Object orderDate;
    @SerializedName("service_location")
    @Expose
    private String serviceLocation;
    @SerializedName("start")
    @Expose
    private Object start;
    @SerializedName("end")
    @Expose
    private Object end;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    @SerializedName("time_updated")
    @Expose
    private Object timeUpdated;
    @SerializedName("time_order_approved")
    @Expose
    private Object timeOrderApproved;
    @SerializedName("duration")
    @Expose
    private Object duration;
    @SerializedName("company")
    @Expose
    private Object company;
    @SerializedName("email_address")
    @Expose
    private String emailAddress;
    @SerializedName("phone_number")
    @Expose
    private String phoneNumber;
    @SerializedName("billing_company")
    @Expose
    private Object billingCompany;
    @SerializedName("billing_first_name")
    @Expose
    private String billingFirstName;
    @SerializedName("billing_last_name")
    @Expose
    private String billingLastName;
    @SerializedName("billing_address_1")
    @Expose
    private Object billingAddress1;
    @SerializedName("billing_address_2")
    @Expose
    private Object billingAddress2;
    @SerializedName("billing_city")
    @Expose
    private Object billingCity;
    @SerializedName("billing_state")
    @Expose
    private Object billingState;
    @SerializedName("billing_zip_code")
    @Expose
    private Object billingZipCode;
    @SerializedName("shipping_company")
    @Expose
    private Object shippingCompany;
    @SerializedName("shipping_first_name")
    @Expose
    private Object shippingFirstName;
    @SerializedName("shipping_last_name")
    @Expose
    private Object shippingLastName;
    @SerializedName("shipping_address_1")
    @Expose
    private Object shippingAddress1;
    @SerializedName("shipping_address_2")
    @Expose
    private Object shippingAddress2;
    @SerializedName("shipping_city")
    @Expose
    private Object shippingCity;
    @SerializedName("shipping_state")
    @Expose
    private Object shippingState;
    @SerializedName("shipping_zip_code")
    @Expose
    private Object shippingZipCode;
    @SerializedName("credit_card")
    @Expose
    private Object creditCard;
    @SerializedName("exp_date")
    @Expose
    private Object expDate;
    @SerializedName("cvv")
    @Expose
    private Object cvv;
    @SerializedName("tax")
    @Expose
    private Object tax;
    @SerializedName("shipping")
    @Expose
    private Object shipping;
    @SerializedName("service_fee")
    @Expose
    private Object serviceFee;
    @SerializedName("amount_before")
    @Expose
    private Object amountBefore;
    @SerializedName("amount_after")
    @Expose
    private Object amountAfter;
    @SerializedName("amount_collected")
    @Expose
    private Object amountCollected;
    @SerializedName("instructions")
    @Expose
    private Object instructions;
    @SerializedName("donation")
    @Expose
    private Object donation;
    @SerializedName("donation_amount")
    @Expose
    private Object donationAmount;
    @SerializedName("x_skus")
    @Expose
    private Object xSkus;
    @SerializedName("x_response_code")
    @Expose
    private Object xResponseCode;
    @SerializedName("x_response_reason_code")
    @Expose
    private Object xResponseReasonCode;
    @SerializedName("x_response_reason_text")
    @Expose
    private Object xResponseReasonText;
    @SerializedName("approval_code")
    @Expose
    private Object approvalCode;
    @SerializedName("x_avs_code")
    @Expose
    private Object xAvsCode;
    @SerializedName("transaction_id")
    @Expose
    private String transactionId;
    @SerializedName("x_type")
    @Expose
    private Object xType;
    @SerializedName("week")
    @Expose
    private String week;
    @SerializedName("review")
    @Expose
    private Object review;
    @SerializedName("order_rating")
    @Expose
    private Object orderRating;
    @SerializedName("customer_rating")
    @Expose
    private Object customerRating;
    @SerializedName("order")
    @Expose
    private String order;
    @SerializedName("inactive")
    @Expose
    private String inactive;
    @SerializedName("datetime")
    @Expose
    private String datetime;
    @SerializedName("updated")
    @Expose
    private Object updated;
    @SerializedName("pickedup")
    @Expose
    private Object pickedup;
    @SerializedName("completed")
    @Expose
    private Object completed;
    @SerializedName("status")
    @Expose
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Object getOrderId() {
        return orderId;
    }

    public void setOrderId(Object orderId) {
        this.orderId = orderId;
    }

    public String getWebsiteId() {
        return websiteId;
    }

    public void setWebsiteId(String websiteId) {
        this.websiteId = websiteId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Object getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Object promotionId) {
        this.promotionId = promotionId;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public Object getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Object paymentId) {
        this.paymentId = paymentId;
    }

    public Object getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Object vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Object getApi() {
        return api;
    }

    public void setApi(Object api) {
        this.api = api;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Object getProviders() {
        return providers;
    }

    public void setProviders(Object providers) {
        this.providers = providers;
    }

    public Object getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Object orderDate) {
        this.orderDate = orderDate;
    }

    public String getServiceLocation() {
        return serviceLocation;
    }

    public void setServiceLocation(String serviceLocation) {
        this.serviceLocation = serviceLocation;
    }

    public Object getStart() {
        return start;
    }

    public void setStart(Object start) {
        this.start = start;
    }

    public Object getEnd() {
        return end;
    }

    public void setEnd(Object end) {
        this.end = end;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Object getTimeUpdated() {
        return timeUpdated;
    }

    public void setTimeUpdated(Object timeUpdated) {
        this.timeUpdated = timeUpdated;
    }

    public Object getTimeOrderApproved() {
        return timeOrderApproved;
    }

    public void setTimeOrderApproved(Object timeOrderApproved) {
        this.timeOrderApproved = timeOrderApproved;
    }

    public Object getDuration() {
        return duration;
    }

    public void setDuration(Object duration) {
        this.duration = duration;
    }

    public Object getCompany() {
        return company;
    }

    public void setCompany(Object company) {
        this.company = company;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Object getBillingCompany() {
        return billingCompany;
    }

    public void setBillingCompany(Object billingCompany) {
        this.billingCompany = billingCompany;
    }

    public String getBillingFirstName() {
        return billingFirstName;
    }

    public void setBillingFirstName(String billingFirstName) {
        this.billingFirstName = billingFirstName;
    }

    public String getBillingLastName() {
        return billingLastName;
    }

    public void setBillingLastName(String billingLastName) {
        this.billingLastName = billingLastName;
    }

    public Object getBillingAddress1() {
        return billingAddress1;
    }

    public void setBillingAddress1(Object billingAddress1) {
        this.billingAddress1 = billingAddress1;
    }

    public Object getBillingAddress2() {
        return billingAddress2;
    }

    public void setBillingAddress2(Object billingAddress2) {
        this.billingAddress2 = billingAddress2;
    }

    public Object getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(Object billingCity) {
        this.billingCity = billingCity;
    }

    public Object getBillingState() {
        return billingState;
    }

    public void setBillingState(Object billingState) {
        this.billingState = billingState;
    }

    public Object getBillingZipCode() {
        return billingZipCode;
    }

    public void setBillingZipCode(Object billingZipCode) {
        this.billingZipCode = billingZipCode;
    }

    public Object getShippingCompany() {
        return shippingCompany;
    }

    public void setShippingCompany(Object shippingCompany) {
        this.shippingCompany = shippingCompany;
    }

    public Object getShippingFirstName() {
        return shippingFirstName;
    }

    public void setShippingFirstName(Object shippingFirstName) {
        this.shippingFirstName = shippingFirstName;
    }

    public Object getShippingLastName() {
        return shippingLastName;
    }

    public void setShippingLastName(Object shippingLastName) {
        this.shippingLastName = shippingLastName;
    }

    public Object getShippingAddress1() {
        return shippingAddress1;
    }

    public void setShippingAddress1(Object shippingAddress1) {
        this.shippingAddress1 = shippingAddress1;
    }

    public Object getShippingAddress2() {
        return shippingAddress2;
    }

    public void setShippingAddress2(Object shippingAddress2) {
        this.shippingAddress2 = shippingAddress2;
    }

    public Object getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(Object shippingCity) {
        this.shippingCity = shippingCity;
    }

    public Object getShippingState() {
        return shippingState;
    }

    public void setShippingState(Object shippingState) {
        this.shippingState = shippingState;
    }

    public Object getShippingZipCode() {
        return shippingZipCode;
    }

    public void setShippingZipCode(Object shippingZipCode) {
        this.shippingZipCode = shippingZipCode;
    }

    public Object getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(Object creditCard) {
        this.creditCard = creditCard;
    }

    public Object getExpDate() {
        return expDate;
    }

    public void setExpDate(Object expDate) {
        this.expDate = expDate;
    }

    public Object getCvv() {
        return cvv;
    }

    public void setCvv(Object cvv) {
        this.cvv = cvv;
    }

    public Object getTax() {
        return tax;
    }

    public void setTax(Object tax) {
        this.tax = tax;
    }

    public Object getShipping() {
        return shipping;
    }

    public void setShipping(Object shipping) {
        this.shipping = shipping;
    }

    public Object getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(Object serviceFee) {
        this.serviceFee = serviceFee;
    }

    public Object getAmountBefore() {
        return amountBefore;
    }

    public void setAmountBefore(Object amountBefore) {
        this.amountBefore = amountBefore;
    }

    public Object getAmountAfter() {
        return amountAfter;
    }

    public void setAmountAfter(Object amountAfter) {
        this.amountAfter = amountAfter;
    }

    public Object getAmountCollected() {
        return amountCollected;
    }

    public void setAmountCollected(Object amountCollected) {
        this.amountCollected = amountCollected;
    }

    public Object getInstructions() {
        return instructions;
    }

    public void setInstructions(Object instructions) {
        this.instructions = instructions;
    }

    public Object getDonation() {
        return donation;
    }

    public void setDonation(Object donation) {
        this.donation = donation;
    }

    public Object getDonationAmount() {
        return donationAmount;
    }

    public void setDonationAmount(Object donationAmount) {
        this.donationAmount = donationAmount;
    }

    public Object getXSkus() {
        return xSkus;
    }

    public void setXSkus(Object xSkus) {
        this.xSkus = xSkus;
    }

    public Object getXResponseCode() {
        return xResponseCode;
    }

    public void setXResponseCode(Object xResponseCode) {
        this.xResponseCode = xResponseCode;
    }

    public Object getXResponseReasonCode() {
        return xResponseReasonCode;
    }

    public void setXResponseReasonCode(Object xResponseReasonCode) {
        this.xResponseReasonCode = xResponseReasonCode;
    }

    public Object getXResponseReasonText() {
        return xResponseReasonText;
    }

    public void setXResponseReasonText(Object xResponseReasonText) {
        this.xResponseReasonText = xResponseReasonText;
    }

    public Object getApprovalCode() {
        return approvalCode;
    }

    public void setApprovalCode(Object approvalCode) {
        this.approvalCode = approvalCode;
    }

    public Object getXAvsCode() {
        return xAvsCode;
    }

    public void setXAvsCode(Object xAvsCode) {
        this.xAvsCode = xAvsCode;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Object getXType() {
        return xType;
    }

    public void setXType(Object xType) {
        this.xType = xType;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public Object getReview() {
        return review;
    }

    public void setReview(Object review) {
        this.review = review;
    }

    public Object getOrderRating() {
        return orderRating;
    }

    public void setOrderRating(Object orderRating) {
        this.orderRating = orderRating;
    }

    public Object getCustomerRating() {
        return customerRating;
    }

    public void setCustomerRating(Object customerRating) {
        this.customerRating = customerRating;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getInactive() {
        return inactive;
    }

    public void setInactive(String inactive) {
        this.inactive = inactive;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public Object getUpdated() {
        return updated;
    }

    public void setUpdated(Object updated) {
        this.updated = updated;
    }

    public Object getPickedup() {
        return pickedup;
    }

    public void setPickedup(Object pickedup) {
        this.pickedup = pickedup;
    }

    public Object getCompleted() {
        return completed;
    }

    public void setCompleted(Object completed) {
        this.completed = completed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
