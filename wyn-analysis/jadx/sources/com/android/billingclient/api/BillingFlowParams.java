package com.android.billingclient.api;

import android.text.TextUtils;
import com.android.billingclient.api.ProductDetails;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class BillingFlowParams {
    public static final String EXTRA_PARAM_KEY_ACCOUNT_ID = "accountId";

    /* renamed from: a, reason: collision with root package name */
    public boolean f19981a;

    /* renamed from: b, reason: collision with root package name */
    public String f19982b;

    /* renamed from: c, reason: collision with root package name */
    public String f19983c;

    /* renamed from: d, reason: collision with root package name */
    public SubscriptionUpdateParams f19984d;

    /* renamed from: e, reason: collision with root package name */
    public com.google.android.gms.internal.play_billing.zzai f19985e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f19986f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19987g;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f19988a;

        /* renamed from: b, reason: collision with root package name */
        public String f19989b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList f19990c;

        /* renamed from: d, reason: collision with root package name */
        public ArrayList f19991d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f19992e;

        /* renamed from: f, reason: collision with root package name */
        public SubscriptionUpdateParams.Builder f19993f;

        public BillingFlowParams build() {
            ArrayList arrayList = this.f19991d;
            boolean z2 = true;
            boolean z10 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            ArrayList arrayList2 = this.f19990c;
            boolean z11 = (arrayList2 == null || arrayList2.isEmpty()) ? false : true;
            if (!z10 && !z11) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z10 && z11) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            if (!z10) {
                ProductDetailsParams productDetailsParams = (ProductDetailsParams) this.f19990c.get(0);
                for (int i5 = 0; i5 < this.f19990c.size(); i5++) {
                    ProductDetailsParams productDetailsParams2 = (ProductDetailsParams) this.f19990c.get(i5);
                    if (productDetailsParams2 == null) {
                        throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                    }
                    if (i5 != 0 && !productDetailsParams2.zza().getProductType().equals(productDetailsParams.zza().getProductType()) && !productDetailsParams2.zza().getProductType().equals("play_pass_subs")) {
                        throw new IllegalArgumentException("All products should have same ProductType.");
                    }
                }
                String strZza = productDetailsParams.zza().zza();
                Iterator it = this.f19990c.iterator();
                while (it.hasNext()) {
                    ProductDetailsParams productDetailsParams3 = (ProductDetailsParams) it.next();
                    if (!productDetailsParams.zza().getProductType().equals("play_pass_subs") && !productDetailsParams3.zza().getProductType().equals("play_pass_subs") && !strZza.equals(productDetailsParams3.zza().zza())) {
                        throw new IllegalArgumentException("All products must have the same package name.");
                    }
                }
            } else {
                if (this.f19991d.contains(null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
                if (this.f19991d.size() > 1) {
                    SkuDetails skuDetails = (SkuDetails) this.f19991d.get(0);
                    String type = skuDetails.getType();
                    ArrayList arrayList3 = this.f19991d;
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        SkuDetails skuDetails2 = (SkuDetails) arrayList3.get(i10);
                        if (!type.equals("play_pass_subs") && !skuDetails2.getType().equals("play_pass_subs") && !type.equals(skuDetails2.getType())) {
                            throw new IllegalArgumentException("SKUs should have the same type.");
                        }
                    }
                    String strZzd = skuDetails.zzd();
                    ArrayList arrayList4 = this.f19991d;
                    int size2 = arrayList4.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        SkuDetails skuDetails3 = (SkuDetails) arrayList4.get(i11);
                        if (!type.equals("play_pass_subs") && !skuDetails3.getType().equals("play_pass_subs") && !strZzd.equals(skuDetails3.zzd())) {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
            }
            BillingFlowParams billingFlowParams = new BillingFlowParams();
            if ((!z10 || ((SkuDetails) this.f19991d.get(0)).zzd().isEmpty()) && (!z11 || ((ProductDetailsParams) this.f19990c.get(0)).zza().zza().isEmpty())) {
                z2 = false;
            }
            billingFlowParams.f19981a = z2;
            billingFlowParams.f19982b = this.f19988a;
            billingFlowParams.f19983c = this.f19989b;
            billingFlowParams.f19984d = this.f19993f.build();
            ArrayList arrayList5 = this.f19991d;
            billingFlowParams.f19986f = arrayList5 != null ? new ArrayList(arrayList5) : new ArrayList();
            billingFlowParams.f19987g = this.f19992e;
            ArrayList arrayList6 = this.f19990c;
            billingFlowParams.f19985e = arrayList6 != null ? com.google.android.gms.internal.play_billing.zzai.zzj(arrayList6) : com.google.android.gms.internal.play_billing.zzai.zzk();
            return billingFlowParams;
        }

        public Builder setIsOfferPersonalized(boolean z2) {
            this.f19992e = z2;
            return this;
        }

        public Builder setObfuscatedAccountId(String str) {
            this.f19988a = str;
            return this;
        }

        public Builder setObfuscatedProfileId(String str) {
            this.f19989b = str;
            return this;
        }

        public Builder setProductDetailsParamsList(List<ProductDetailsParams> list) {
            this.f19990c = new ArrayList(list);
            return this;
        }

        @Deprecated
        public Builder setSkuDetails(SkuDetails skuDetails) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(skuDetails);
            this.f19991d = arrayList;
            return this;
        }

        public Builder setSubscriptionUpdateParams(SubscriptionUpdateParams subscriptionUpdateParams) {
            SubscriptionUpdateParams.Builder builderNewBuilder = SubscriptionUpdateParams.newBuilder();
            builderNewBuilder.zzb(subscriptionUpdateParams.f19998a);
            builderNewBuilder.setSubscriptionReplacementMode(subscriptionUpdateParams.f20000c);
            builderNewBuilder.setOriginalExternalTransactionId(subscriptionUpdateParams.f19999b);
            this.f19993f = builderNewBuilder;
            return this;
        }
    }

    public static final class ProductDetailsParams {

        /* renamed from: a, reason: collision with root package name */
        public final ProductDetails f19994a;

        /* renamed from: b, reason: collision with root package name */
        public final String f19995b;

        public static class Builder {

            /* renamed from: a, reason: collision with root package name */
            public ProductDetails f19996a;

            /* renamed from: b, reason: collision with root package name */
            public String f19997b;

            public ProductDetailsParams build() {
                com.google.android.gms.internal.play_billing.zzaa.zzc(this.f19996a, "ProductDetails is required for constructing ProductDetailsParams.");
                if (this.f19996a.getSubscriptionOfferDetails() != null) {
                    com.google.android.gms.internal.play_billing.zzaa.zzc(this.f19997b, "offerToken is required for constructing ProductDetailsParams for subscriptions.");
                }
                return new ProductDetailsParams(this);
            }

            public Builder setOfferToken(String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                this.f19997b = str;
                return this;
            }

            public Builder setProductDetails(ProductDetails productDetails) {
                this.f19996a = productDetails;
                if (productDetails.getOneTimePurchaseOfferDetails() != null) {
                    productDetails.getOneTimePurchaseOfferDetails().getClass();
                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                    if (oneTimePurchaseOfferDetails.zza() != null) {
                        this.f19997b = oneTimePurchaseOfferDetails.zza();
                    }
                }
                return this;
            }
        }

        public /* synthetic */ ProductDetailsParams(Builder builder) {
            this.f19994a = builder.f19996a;
            this.f19995b = builder.f19997b;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public final ProductDetails zza() {
            return this.f19994a;
        }

        public final String zzb() {
            return this.f19995b;
        }
    }

    public static class SubscriptionUpdateParams {

        /* renamed from: a, reason: collision with root package name */
        public String f19998a;

        /* renamed from: b, reason: collision with root package name */
        public String f19999b;

        /* renamed from: c, reason: collision with root package name */
        public int f20000c;

        public static class Builder {

            /* renamed from: a, reason: collision with root package name */
            public String f20001a;

            /* renamed from: b, reason: collision with root package name */
            public String f20002b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f20003c;

            /* renamed from: d, reason: collision with root package name */
            public int f20004d;

            public SubscriptionUpdateParams build() {
                boolean z2 = true;
                if (TextUtils.isEmpty(this.f20001a) && TextUtils.isEmpty(null)) {
                    z2 = false;
                }
                boolean zIsEmpty = TextUtils.isEmpty(this.f20002b);
                if (z2 && !zIsEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f20003c && !z2 && zIsEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                SubscriptionUpdateParams subscriptionUpdateParams = new SubscriptionUpdateParams();
                subscriptionUpdateParams.f19998a = this.f20001a;
                subscriptionUpdateParams.f20000c = this.f20004d;
                subscriptionUpdateParams.f19999b = this.f20002b;
                return subscriptionUpdateParams;
            }

            public Builder setOldPurchaseToken(String str) {
                this.f20001a = str;
                return this;
            }

            @zzf
            public Builder setOriginalExternalTransactionId(String str) {
                this.f20002b = str;
                return this;
            }

            public Builder setSubscriptionReplacementMode(int i5) {
                this.f20004d = i5;
                return this;
            }

            @Deprecated
            public final Builder zzb(String str) {
                this.f20001a = str;
                return this;
            }
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface ReplacementMode {
            public static final int CHARGE_FULL_PRICE = 5;
            public static final int CHARGE_PRORATED_PRICE = 2;
            public static final int DEFERRED = 6;
            public static final int UNKNOWN_REPLACEMENT_MODE = 0;
            public static final int WITHOUT_PRORATION = 3;
            public static final int WITH_TIME_PRORATION = 1;
        }

        public static Builder newBuilder() {
            Builder builder = new Builder();
            builder.f20004d = 0;
            return builder;
        }
    }

    public static Builder newBuilder() {
        Builder builder = new Builder();
        SubscriptionUpdateParams.Builder builderNewBuilder = SubscriptionUpdateParams.newBuilder();
        builderNewBuilder.f20003c = true;
        builder.f19993f = builderNewBuilder;
        return builder;
    }

    public final int zza() {
        return this.f19984d.f20000c;
    }

    public final String zzb() {
        return this.f19982b;
    }

    public final String zzc() {
        return this.f19983c;
    }

    public final String zzd() {
        return this.f19984d.f19998a;
    }

    public final String zze() {
        return this.f19984d.f19999b;
    }

    public final ArrayList zzf() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f19986f);
        return arrayList;
    }

    public final List zzg() {
        return this.f19985e;
    }

    public final boolean zzo() {
        return this.f19987g;
    }
}
