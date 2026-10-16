package com.bytedance.sdk.openadsdk.wrv.uef;

import com.bytedance.sdk.openadsdk.core.oyt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class cz extends com.bytedance.sdk.component.uef.moa<JSONObject, JSONObject> {

    /* renamed from: oa, reason: collision with root package name */
    private String f26174oa;
    private final oyt uef;

    public cz(oyt oytVar, String str) {
        this.uef = oytVar;
        this.f26174oa = str;
    }

    public static void uef(com.bytedance.sdk.component.uef.wk wkVar, oyt oytVar) {
        wkVar.uef("endcardDynamicCreatives", new cz(oytVar, "endcardDynamicCreatives"));
        wkVar.uef("multiOpenCovert", new cz(oytVar, "multiOpenCovert"));
        wkVar.uef("skipToNextAd", new cz(oytVar, "skipToNextAd"));
        wkVar.uef("speedVideoOrTimer", new cz(oytVar, "speedVideoOrTimer"));
        wkVar.uef("openPlayable", new cz(oytVar, "openPlayable"));
    }

    @Override // com.bytedance.sdk.component.uef.moa
    public JSONObject uef(String str, JSONObject jSONObject, com.bytedance.sdk.component.uef.lw lwVar) throws Exception {
        if ("endcardDynamicCreatives".equals(this.f26174oa)) {
            return this.uef.cz(jSONObject);
        }
        if ("multiOpenCovert".equals(this.f26174oa)) {
            this.uef.zjm(jSONObject);
            return null;
        }
        if ("skipToNextAd".equals(this.f26174oa)) {
            this.uef.uef(jSONObject, this.f26174oa);
            return null;
        }
        if ("speedVideoOrTimer".equals(this.f26174oa)) {
            return this.uef.bcc(jSONObject);
        }
        if ("openPlayable".equals(this.f26174oa)) {
            return this.uef.xs(jSONObject);
        }
        return null;
    }
}
