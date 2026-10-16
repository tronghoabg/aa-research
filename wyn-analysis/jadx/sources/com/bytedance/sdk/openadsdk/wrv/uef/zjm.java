package com.bytedance.sdk.openadsdk.wrv.uef;

import com.bytedance.sdk.openadsdk.core.oyt;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class zjm extends com.bytedance.sdk.component.uef.sy<JSONObject, JSONObject> {
    public static final HashSet<String> uef = new HashSet<>(Arrays.asList("endcardDynamicCreatives", "multiOpenCovert", "speedVideoOrTimer", "openPlayable", "skipToNextAd"));

    /* renamed from: oa, reason: collision with root package name */
    private final oyt f26193oa;

    public zjm(oyt oytVar) {
        this.f26193oa = oytVar;
    }

    public static void uef(com.bytedance.sdk.component.uef.wk wkVar, oyt oytVar) {
        wkVar.uef(uef, new zjm(oytVar));
    }

    @Override // com.bytedance.sdk.component.uef.moa
    public JSONObject uef(String str, JSONObject jSONObject, com.bytedance.sdk.component.uef.lw lwVar) throws Exception {
        if ("endcardDynamicCreatives".equals(str)) {
            return this.f26193oa.cz(jSONObject);
        }
        if ("multiOpenCovert".equals(str)) {
            this.f26193oa.zjm(jSONObject);
            return null;
        }
        if ("skipToNextAd".equals(str)) {
            this.f26193oa.uef(jSONObject, str);
            return null;
        }
        if ("speedVideoOrTimer".equals(str)) {
            return this.f26193oa.bcc(jSONObject);
        }
        if ("openPlayable".equals(str)) {
            return this.f26193oa.xs(jSONObject);
        }
        return null;
    }
}
