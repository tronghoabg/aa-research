package com.android.billingclient.api;

/* loaded from: classes.dex */
public final class QueryPurchasesParams {

    /* renamed from: a, reason: collision with root package name */
    public final String f20071a;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f20072a;

        public QueryPurchasesParams build() {
            if (this.f20072a != null) {
                return new QueryPurchasesParams(this);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public Builder setProductType(String str) {
            this.f20072a = str;
            return this;
        }
    }

    public /* synthetic */ QueryPurchasesParams(Builder builder) {
        this.f20071a = builder.f20072a;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public final String zza() {
        return this.f20071a;
    }
}
