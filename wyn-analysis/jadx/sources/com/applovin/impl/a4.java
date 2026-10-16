package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f20929a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20930b;

    public a4(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.f20929a = JsonUtils.getString(jSONObject, "id", "");
        this.f20930b = JsonUtils.getString(jSONObject, InAppPurchaseMetaData.KEY_PRICE, null);
    }

    public String a() {
        return this.f20929a;
    }

    public String b() {
        return this.f20930b;
    }
}
