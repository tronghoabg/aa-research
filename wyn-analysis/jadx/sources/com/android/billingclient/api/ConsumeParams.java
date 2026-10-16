package com.android.billingclient.api;

/* loaded from: classes.dex */
public final class ConsumeParams {

    /* renamed from: a, reason: collision with root package name */
    public String f20009a;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f20010a;

        public ConsumeParams build() {
            String str = this.f20010a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            ConsumeParams consumeParams = new ConsumeParams();
            consumeParams.f20009a = str;
            return consumeParams;
        }

        public Builder setPurchaseToken(String str) {
            this.f20010a = str;
            return this;
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getPurchaseToken() {
        return this.f20009a;
    }
}
