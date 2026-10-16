package com.android.billingclient.api;

import org.json.JSONObject;

@zzg
/* loaded from: classes.dex */
public final class AlternativeBillingOnlyReportingDetails {

    /* renamed from: a, reason: collision with root package name */
    public final String f19973a;

    public AlternativeBillingOnlyReportingDetails(String str) {
        this.f19973a = new JSONObject(str).optString("externalTransactionToken");
    }

    public String getExternalTransactionToken() {
        return this.f19973a;
    }
}
