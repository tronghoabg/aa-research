package com.android.billingclient.api;

/* loaded from: classes.dex */
public final class BillingResult {

    /* renamed from: a, reason: collision with root package name */
    public int f20005a;

    /* renamed from: b, reason: collision with root package name */
    public String f20006b;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public int f20007a;

        /* renamed from: b, reason: collision with root package name */
        public String f20008b;

        public BillingResult build() {
            BillingResult billingResult = new BillingResult();
            billingResult.f20005a = this.f20007a;
            billingResult.f20006b = this.f20008b;
            return billingResult;
        }

        public Builder setDebugMessage(String str) {
            this.f20008b = str;
            return this;
        }

        public Builder setResponseCode(int i5) {
            this.f20007a = i5;
            return this;
        }
    }

    public static Builder newBuilder() {
        Builder builder = new Builder();
        builder.f20008b = "";
        return builder;
    }

    public String getDebugMessage() {
        return this.f20006b;
    }

    public int getResponseCode() {
        return this.f20005a;
    }

    public String toString() {
        return N0.a.h("Response Code: ", com.google.android.gms.internal.play_billing.zzb.zzh(this.f20005a), ", Debug Message: ", this.f20006b);
    }
}
