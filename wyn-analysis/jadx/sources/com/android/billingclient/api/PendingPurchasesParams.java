package com.android.billingclient.api;

@zzk
/* loaded from: classes.dex */
public final class PendingPurchasesParams {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20016a;

    @zzk
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public boolean f20017a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f20018b;

        public PendingPurchasesParams build() {
            if (this.f20017a) {
                return new PendingPurchasesParams(this.f20018b);
            }
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }

        public Builder enableOneTimeProducts() {
            this.f20017a = true;
            return this;
        }

        public Builder enablePrepaidPlans() {
            this.f20018b = true;
            return this;
        }
    }

    public PendingPurchasesParams(boolean z2) {
        this.f20016a = z2;
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
