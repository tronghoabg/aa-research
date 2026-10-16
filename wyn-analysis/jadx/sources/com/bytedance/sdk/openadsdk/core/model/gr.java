package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public class gr {
    private String moa = "Next Ad";

    /* renamed from: oa, reason: collision with root package name */
    private int f25677oa;
    private int uef;
    private int yo;

    public int moa() {
        return this.uef;
    }

    public int oa() {
        return this.f25677oa;
    }

    public int uef() {
        return this.yo;
    }

    public String yo() {
        return this.moa;
    }

    public void oa(int i5) {
        this.f25677oa = i5;
    }

    public void uef(int i5) {
        this.yo = i5;
    }

    public void yo(int i5) {
        this.uef = i5;
    }

    public void uef(String str) {
        this.moa = str;
    }

    public static gr uef(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        gr grVar = new gr();
        try {
            int iMax = Math.max(jSONObject.optInt("endcard_show_time", 0), 0);
            int iOptInt = jSONObject.optInt("is_allow_pause", 0);
            int iOptInt2 = jSONObject.optInt("landing_type", 0);
            String strOptString = jSONObject.optString("endcard_next_ad_text", "Next Ad");
            grVar.yo(iMax);
            grVar.oa(iOptInt);
            grVar.uef(strOptString);
            grVar.uef(iOptInt2);
        } catch (Throwable unused) {
        }
        return grVar;
    }
}
