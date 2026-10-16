package com.android.billingclient.api;

/* loaded from: classes.dex */
public final class AcknowledgePurchaseParams {

    /* renamed from: a, reason: collision with root package name */
    public String f19971a;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f19972a;

        public AcknowledgePurchaseParams build() {
            String str = this.f19972a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            AcknowledgePurchaseParams acknowledgePurchaseParams = new AcknowledgePurchaseParams();
            acknowledgePurchaseParams.f19971a = str;
            return acknowledgePurchaseParams;
        }

        public Builder setPurchaseToken(String str) {
            this.f19972a = str;
            return this;
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getPurchaseToken() {
        return this.f19971a;
    }
}
