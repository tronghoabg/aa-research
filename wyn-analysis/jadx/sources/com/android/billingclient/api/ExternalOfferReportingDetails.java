package com.android.billingclient.api;

import org.json.JSONObject;

@zzh
/* loaded from: classes.dex */
public final class ExternalOfferReportingDetails {

    /* renamed from: a, reason: collision with root package name */
    public final String f20011a;

    public ExternalOfferReportingDetails(String str) {
        this.f20011a = new JSONObject(str).optString("externalTransactionToken");
    }

    public String getExternalTransactionToken() {
        return this.f20011a;
    }
}
