package com.android.billingclient.api;

/* loaded from: classes.dex */
public final class QueryPurchaseHistoryParams {

    /* renamed from: a, reason: collision with root package name */
    public final String f20069a;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f20070a;

        public QueryPurchaseHistoryParams build() {
            if (this.f20070a != null) {
                return new QueryPurchaseHistoryParams(this);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public Builder setProductType(String str) {
            this.f20070a = str;
            return this;
        }
    }

    public /* synthetic */ QueryPurchaseHistoryParams(Builder builder) {
        this.f20069a = builder.f20070a;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public final String zza() {
        return this.f20069a;
    }
}
