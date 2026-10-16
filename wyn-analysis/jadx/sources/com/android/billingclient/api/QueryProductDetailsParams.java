package com.android.billingclient.api;

import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class QueryProductDetailsParams {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.play_billing.zzai f20063a;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public com.google.android.gms.internal.play_billing.zzai f20064a;

        public QueryProductDetailsParams build() {
            return new QueryProductDetailsParams(this);
        }

        public Builder setProductList(List<Product> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            for (Product product : list) {
                if (!"play_pass_subs".equals(product.zzb())) {
                    hashSet.add(product.zzb());
                }
            }
            if (hashSet.size() > 1) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            this.f20064a = com.google.android.gms.internal.play_billing.zzai.zzj(list);
            return this;
        }
    }

    public static class Product {

        /* renamed from: a, reason: collision with root package name */
        public final String f20065a;

        /* renamed from: b, reason: collision with root package name */
        public final String f20066b;

        public static class Builder {

            /* renamed from: a, reason: collision with root package name */
            public String f20067a;

            /* renamed from: b, reason: collision with root package name */
            public String f20068b;

            public Product build() {
                if ("first_party".equals(this.f20068b)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
                if (this.f20067a == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                if (this.f20068b != null) {
                    return new Product(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }

            public Builder setProductId(String str) {
                this.f20067a = str;
                return this;
            }

            public Builder setProductType(String str) {
                this.f20068b = str;
                return this;
            }
        }

        public /* synthetic */ Product(Builder builder) {
            this.f20065a = builder.f20067a;
            this.f20066b = builder.f20068b;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public final String zza() {
            return this.f20065a;
        }

        public final String zzb() {
            return this.f20066b;
        }
    }

    public /* synthetic */ QueryProductDetailsParams(Builder builder) {
        this.f20063a = builder.f20064a;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public final com.google.android.gms.internal.play_billing.zzai zza() {
        return this.f20063a;
    }

    public final String zzb() {
        return ((Product) this.f20063a.get(0)).zzb();
    }
}
