package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public class orq {
    private String uef = "horizontal";

    /* renamed from: oa, reason: collision with root package name */
    private int f25703oa = 1;
    private int yo = 1;
    private int moa = 0;
    private int lw = 0;
    private int ivm = 0;
    private int xs = 0;
    private int bcc = 5000;
    private int cz = 500;
    private int zjm = 0;

    public int bcc() {
        return this.bcc;
    }

    public int cz() {
        return this.cz;
    }

    public int ivm() {
        return this.ivm;
    }

    public int lw() {
        return this.lw;
    }

    public int moa() {
        return this.moa;
    }

    public int oa() {
        return this.f25703oa;
    }

    public String uef() {
        return this.uef;
    }

    public int xs() {
        return this.xs;
    }

    public int yo() {
        return this.yo;
    }

    public int zjm() {
        return this.zjm;
    }

    public static orq uef(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new orq();
        }
        orq orqVar = new orq();
        orqVar.uef = jSONObject.optString("direction", "horizontal");
        orqVar.f25703oa = jSONObject.optInt("auto_loop", 1);
        orqVar.yo = jSONObject.optInt("allow_manual_loop", 1);
        orqVar.moa = jSONObject.optInt("unlimited_loop", 0);
        orqVar.lw = jSONObject.optInt("left_margin", 0);
        orqVar.ivm = jSONObject.optInt("right_margin", 0);
        orqVar.xs = jSONObject.optInt("ad_margin", 0);
        orqVar.bcc = jSONObject.optInt("loop_interval_time", 5000);
        orqVar.cz = jSONObject.optInt("flip_speed", 500);
        orqVar.zjm = jSONObject.optInt("stop_auto_loop", 0);
        return orqVar;
    }
}
