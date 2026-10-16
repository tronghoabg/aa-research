package com.android.billingclient.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class InAppMessageResult {

    /* renamed from: a, reason: collision with root package name */
    public final int f20014a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20015b;

    @Retention(RetentionPolicy.SOURCE)
    public @interface InAppMessageResponseCode {
        public static final int NO_ACTION_NEEDED = 0;
        public static final int SUBSCRIPTION_STATUS_UPDATED = 1;
    }

    public InAppMessageResult(int i5, String str) {
        this.f20014a = i5;
        this.f20015b = str;
    }

    public String getPurchaseToken() {
        return this.f20015b;
    }

    public int getResponseCode() {
        return this.f20014a;
    }
}
