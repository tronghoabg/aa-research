package com.bytedance.adsdk.ugeno.core;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class cq {
    private cq lw;
    private cq moa;

    /* renamed from: oa, reason: collision with root package name */
    private int f24679oa;
    private com.bytedance.adsdk.ugeno.oa.yo uef;
    private JSONObject yo;

    public cq moa() {
        return this.moa;
    }

    public int oa() {
        return this.f24679oa;
    }

    public String toString() {
        return "UGenEvent{mWidget=" + this.uef + ", mEventType=" + this.f24679oa + ", mEvent=" + this.yo + '}';
    }

    public com.bytedance.adsdk.ugeno.oa.yo uef() {
        return this.uef;
    }

    public JSONObject yo() {
        return this.yo;
    }

    public void oa(cq cqVar) {
        this.lw = cqVar;
    }

    public void uef(com.bytedance.adsdk.ugeno.oa.yo yoVar) {
        this.uef = yoVar;
    }

    public void uef(int i5) {
        this.f24679oa = i5;
    }

    public void uef(JSONObject jSONObject) {
        this.yo = jSONObject;
    }

    public void uef(cq cqVar) {
        this.moa = cqVar;
    }
}
