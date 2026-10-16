package com.bytedance.sdk.openadsdk.gsd.oa;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public class uef {

    /* renamed from: oa, reason: collision with root package name */
    private final int f25913oa;
    private final int uef;
    private final float yo;

    public uef(int i5, int i10, float f10) {
        this.uef = i5;
        this.f25913oa = i10;
        this.yo = f10;
    }

    public static JSONObject uef(uef uefVar) throws Throwable {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", uefVar.uef);
        jSONObject.put("height", uefVar.f25913oa);
        jSONObject.put("alpha", uefVar.yo);
        return jSONObject;
    }
}
