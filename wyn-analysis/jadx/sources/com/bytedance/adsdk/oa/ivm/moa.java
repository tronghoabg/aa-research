package com.bytedance.adsdk.oa.ivm;

/* loaded from: classes.dex */
public class moa {

    /* renamed from: oa, reason: collision with root package name */
    private int f24559oa;
    private float uef;

    public void uef(float f10) {
        float f11 = this.uef + f10;
        this.uef = f11;
        int i5 = this.f24559oa + 1;
        this.f24559oa = i5;
        if (i5 == Integer.MAX_VALUE) {
            this.uef = f11 / 2.0f;
            this.f24559oa = i5 / 2;
        }
    }
}
