package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public class SkuDetailsParams {

    /* renamed from: a, reason: collision with root package name */
    public String f20075a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f20076b;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f20077a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f20078b;

        public SkuDetailsParams build() {
            String str = this.f20077a;
            if (str == null) {
                throw new IllegalArgumentException("SKU type must be set");
            }
            if (this.f20078b == null) {
                throw new IllegalArgumentException("SKU list must be set");
            }
            SkuDetailsParams skuDetailsParams = new SkuDetailsParams();
            skuDetailsParams.f20075a = str;
            skuDetailsParams.f20076b = this.f20078b;
            return skuDetailsParams;
        }

        public Builder setSkusList(List<String> list) {
            this.f20078b = new ArrayList(list);
            return this;
        }

        public Builder setType(String str) {
            this.f20077a = str;
            return this;
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getSkuType() {
        return this.f20075a;
    }

    public List<String> getSkusList() {
        return this.f20076b;
    }
}
