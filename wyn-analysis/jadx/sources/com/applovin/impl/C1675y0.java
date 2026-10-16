package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1675y0 extends C1669v0 {

    /* renamed from: c, reason: collision with root package name */
    private Map f23540c;

    public C1675y0(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        super(jSONObject, kVar);
    }

    public Map f() {
        return this.f23540c;
    }

    public String g() {
        return JsonUtils.getString(this.f23375b, MediationMetaData.KEY_NAME, null);
    }

    @Override // com.applovin.impl.C1669v0
    public String toString() {
        return "ConsentFlowState{id=" + c() + ", type=" + d() + ", name=" + g() + "}";
    }
}
