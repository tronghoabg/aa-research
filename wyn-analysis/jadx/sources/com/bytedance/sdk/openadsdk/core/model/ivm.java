package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ivm {
    private int xs;
    private String uef = "";

    /* renamed from: oa, reason: collision with root package name */
    private String f25695oa = "";
    private String yo = "";
    private String moa = "";
    private double lw = -1.0d;
    private int ivm = -1;

    public JSONObject bcc() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", oa());
            jSONObject.put("app_size", ivm());
            jSONObject.put("comment_num", lw());
            jSONObject.put("download_url", uef());
            jSONObject.put("package_name", yo());
            jSONObject.put("score", moa());
            jSONObject.put("app_category", xs());
            return jSONObject;
        } catch (Exception e7) {
            com.bytedance.sdk.component.utils.dhk.yo(e7.toString(), new Object[0]);
            return jSONObject;
        }
    }

    public int ivm() {
        return this.xs;
    }

    public int lw() {
        return this.ivm;
    }

    public double moa() {
        return this.lw;
    }

    public String oa() {
        return this.f25695oa;
    }

    public String uef() {
        return this.uef;
    }

    public String xs() {
        return this.moa;
    }

    public String yo() {
        return this.yo;
    }

    public void moa(String str) {
        this.moa = str;
    }

    public void oa(String str) {
        this.f25695oa = str;
    }

    public void uef(String str) {
        this.uef = str;
    }

    public void yo(String str) {
        this.yo = str;
    }

    public void oa(int i5) {
        this.xs = i5;
    }

    public void uef(double d3) {
        if (d3 >= 1.0d && d3 <= 5.0d) {
            this.lw = d3;
        } else {
            this.lw = -1.0d;
        }
    }

    public void uef(int i5) {
        if (i5 <= 0) {
            this.ivm = -1;
        } else {
            this.ivm = i5;
        }
    }
}
