package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.PendingPurchasesParams;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public abstract class BillingClient {

    @Retention(RetentionPolicy.SOURCE)
    public @interface BillingResponseCode {
        public static final int BILLING_UNAVAILABLE = 3;
        public static final int DEVELOPER_ERROR = 5;
        public static final int ERROR = 6;
        public static final int FEATURE_NOT_SUPPORTED = -2;
        public static final int ITEM_ALREADY_OWNED = 7;
        public static final int ITEM_NOT_OWNED = 8;
        public static final int ITEM_UNAVAILABLE = 4;
        public static final int NETWORK_ERROR = 12;
        public static final int OK = 0;
        public static final int SERVICE_DISCONNECTED = -1;

        @Deprecated
        public static final int SERVICE_TIMEOUT = -3;
        public static final int SERVICE_UNAVAILABLE = 2;
        public static final int USER_CANCELED = 1;
    }

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public volatile PendingPurchasesParams f19974a;

        /* renamed from: b, reason: collision with root package name */
        public final Context f19975b;

        /* renamed from: c, reason: collision with root package name */
        public volatile PurchasesUpdatedListener f19976c;

        /* renamed from: d, reason: collision with root package name */
        public volatile UserChoiceBillingListener f19977d;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f19978e;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f19979f;

        public /* synthetic */ Builder(Context context) {
            this.f19975b = context;
        }

        public BillingClient build() {
            if (this.f19975b == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.f19976c != null) {
                if (this.f19974a == null) {
                    throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
                }
                this.f19974a.getClass();
                return this.f19976c != null ? this.f19977d == null ? new a(this.f19974a, this.f19975b, this.f19976c) : new a(this.f19974a, this.f19975b, this.f19976c, this.f19977d) : new a(this.f19974a, this.f19975b);
            }
            if (this.f19977d != null) {
                throw new IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling User Choice Billing.");
            }
            if (this.f19978e || this.f19979f) {
                return new a(this.f19975b);
            }
            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }

        @zzg
        public Builder enableAlternativeBillingOnly() {
            this.f19978e = true;
            return this;
        }

        @zzh
        public Builder enableExternalOffer() {
            this.f19979f = true;
            return this;
        }

        @zzk
        public Builder enablePendingPurchases(PendingPurchasesParams pendingPurchasesParams) {
            this.f19974a = pendingPurchasesParams;
            return this;
        }

        @zzl
        public Builder enableUserChoiceBilling(UserChoiceBillingListener userChoiceBillingListener) {
            this.f19977d = userChoiceBillingListener;
            return this;
        }

        public Builder setListener(PurchasesUpdatedListener purchasesUpdatedListener) {
            this.f19976c = purchasesUpdatedListener;
            return this;
        }

        @Deprecated
        public Builder enablePendingPurchases() {
            PendingPurchasesParams.Builder builderNewBuilder = PendingPurchasesParams.newBuilder();
            builderNewBuilder.enableOneTimeProducts();
            enablePendingPurchases(builderNewBuilder.build());
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ConnectionState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FeatureType {

        @zzg
        public static final String ALTERNATIVE_BILLING_ONLY = "jjj";

        @zzi
        public static final String BILLING_CONFIG = "ggg";

        @zzh
        public static final String EXTERNAL_OFFER = "kkk";
        public static final String IN_APP_MESSAGING = "bbb";
        public static final String PRICE_CHANGE_CONFIRMATION = "priceChangeConfirmation";
        public static final String PRODUCT_DETAILS = "fff";
        public static final String SUBSCRIPTIONS = "subscriptions";
        public static final String SUBSCRIPTIONS_UPDATE = "subscriptionsUpdate";
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ProductType {
        public static final String INAPP = "inapp";
        public static final String SUBS = "subs";
    }

    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    public @interface SkuType {
        public static final String INAPP = "inapp";
        public static final String SUBS = "subs";
    }

    public static Builder newBuilder(Context context) {
        return new Builder(context);
    }

    public abstract void acknowledgePurchase(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener);

    public abstract void consumeAsync(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener);

    @zzg
    public abstract void createAlternativeBillingOnlyReportingDetailsAsync(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener);

    @zzh
    public abstract void createExternalOfferReportingDetailsAsync(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener);

    public abstract void endConnection();

    @zzi
    public abstract void getBillingConfigAsync(GetBillingConfigParams getBillingConfigParams, BillingConfigResponseListener billingConfigResponseListener);

    public abstract int getConnectionState();

    @zzg
    public abstract void isAlternativeBillingOnlyAvailableAsync(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener);

    @zzh
    public abstract void isExternalOfferAvailableAsync(ExternalOfferAvailabilityListener externalOfferAvailabilityListener);

    public abstract BillingResult isFeatureSupported(String str);

    public abstract boolean isReady();

    public abstract BillingResult launchBillingFlow(Activity activity, BillingFlowParams billingFlowParams);

    public abstract void queryProductDetailsAsync(QueryProductDetailsParams queryProductDetailsParams, ProductDetailsResponseListener productDetailsResponseListener);

    @Deprecated
    public abstract void queryPurchaseHistoryAsync(QueryPurchaseHistoryParams queryPurchaseHistoryParams, PurchaseHistoryResponseListener purchaseHistoryResponseListener);

    @Deprecated
    public abstract void queryPurchaseHistoryAsync(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener);

    public abstract void queryPurchasesAsync(QueryPurchasesParams queryPurchasesParams, PurchasesResponseListener purchasesResponseListener);

    @Deprecated
    public abstract void queryPurchasesAsync(String str, PurchasesResponseListener purchasesResponseListener);

    @Deprecated
    public abstract void querySkuDetailsAsync(SkuDetailsParams skuDetailsParams, SkuDetailsResponseListener skuDetailsResponseListener);

    @zzg
    public abstract BillingResult showAlternativeBillingOnlyInformationDialog(Activity activity, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener);

    @zzh
    public abstract BillingResult showExternalOfferInformationDialog(Activity activity, ExternalOfferInformationDialogListener externalOfferInformationDialogListener);

    public abstract BillingResult showInAppMessages(Activity activity, InAppMessageParams inAppMessageParams, InAppMessageResponseListener inAppMessageResponseListener);

    public abstract void startConnection(BillingClientStateListener billingClientStateListener);
}
