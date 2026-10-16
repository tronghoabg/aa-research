package com.bytedance.sdk.openadsdk.moa.uef;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class cz implements com.bytedance.sdk.openadsdk.ab.oa {

    /* renamed from: oa, reason: collision with root package name */
    private final boolean f25993oa;
    private final com.bytedance.sdk.component.ivm.uef.ivm.moa uef;

    public cz(boolean z2, com.bytedance.sdk.component.ivm.uef.ivm.moa moaVar) {
        this.uef = moaVar;
        this.f25993oa = z2;
    }

    @Override // com.bytedance.sdk.openadsdk.ab.oa
    public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
        if (this.uef == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", this.f25993oa);
        jSONObject.put("url", this.uef.oa());
        int iMoa = this.uef.moa();
        if (iMoa <= 0) {
            iMoa = 0;
        }
        jSONObject.put("retry_times", iMoa);
        jSONObject.put("ad_id", this.uef.ivm());
        jSONObject.put("track_type", this.uef.lw());
        jSONObject.put("upload_scene", this.f25993oa ? this.uef.zjm() ? 3 : this.uef.moa() <= 0 ? 1 : 2 : 4);
        String strXs = this.uef.xs();
        if (!TextUtils.isEmpty(strXs)) {
            JSONArray jSONArray = new JSONArray();
            for (String str : strXs.split(",")) {
                jSONArray.put(str);
            }
            jSONObject.put("error_code", jSONArray);
        }
        String strCz = this.uef.cz();
        if (!TextUtils.isEmpty(strCz)) {
            JSONArray jSONArray2 = new JSONArray();
            for (String str2 : strCz.split(",")) {
                jSONArray2.put(str2);
            }
            jSONObject.put("error_msg", jSONArray2);
        }
        return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("track_link_result").oa(jSONObject.toString());
    }
}
