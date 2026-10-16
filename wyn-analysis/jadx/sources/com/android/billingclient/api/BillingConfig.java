package com.android.billingclient.api;

import org.json.JSONObject;

@zzi
/* loaded from: classes.dex */
public final class BillingConfig {

    /* renamed from: a, reason: collision with root package name */
    public final String f19980a;

    public BillingConfig(String str) {
        this.f19980a = new JSONObject(str).optString("countryCode");
    }

    public String getCountryCode() {
        return this.f19980a;
    }
}
