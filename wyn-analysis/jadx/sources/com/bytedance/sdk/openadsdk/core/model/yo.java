package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.AdSlot;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class yo {
    public String ivm;
    public AdSlot lw;
    public ArrayList<Integer> moa;

    /* renamed from: oa, reason: collision with root package name */
    public int f25719oa;
    public String uef;
    public int xs;
    public int yo = 1;

    public ArrayList<Integer> lw() {
        return this.moa;
    }

    public AdSlot moa() {
        return this.lw;
    }

    public int oa() {
        return this.f25719oa;
    }

    public String uef() {
        return this.uef;
    }

    public int yo() {
        return this.yo;
    }

    public void oa(int i5) {
        this.yo = i5;
    }

    public void uef(String str) {
        this.uef = str;
    }

    public void yo(int i5) {
        this.xs = i5;
    }

    public void oa(String str) {
        this.ivm = str;
    }

    public void uef(int i5) {
        this.f25719oa = i5;
    }

    public void uef(AdSlot adSlot) {
        this.lw = adSlot;
    }

    public void uef(ArrayList<Integer> arrayList) {
        this.moa = arrayList;
    }

    public static void uef(yo yoVar) {
        int iOa;
        if (yoVar == null || yoVar.moa() == null || (iOa = yoVar.oa()) >= 0 || iOa == -8) {
            return;
        }
        com.bytedance.sdk.openadsdk.ab.moa.uef("rd_client_custom_error", false, new com.bytedance.sdk.openadsdk.ab.oa() { // from class: com.bytedance.sdk.openadsdk.core.model.yo.1
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("from", yo.this.yo());
                jSONObject.put("err_code", yo.this.oa());
                jSONObject.put("err_msg", yo.this.ivm);
                jSONObject.put("ext_from", yo.this.xs);
                jSONObject.put("server_res_str", yo.this.uef());
                if (yo.this.lw() != null && yo.this.lw().size() > 0) {
                    jSONObject.put("mate_unavailable_code_list", new JSONArray((Collection) yo.this.lw()).toString());
                }
                return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("rd_client_custom_error").uef(yo.this.moa().getDurationSlotType()).oa(jSONObject.toString());
            }
        });
    }
}
