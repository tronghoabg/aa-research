package com.bytedance.adsdk.oa.xs;

/* loaded from: classes.dex */
public class yo {

    /* renamed from: oa, reason: collision with root package name */
    private float f24606oa;
    private float uef;

    public yo(float f10, float f11) {
        this.uef = f10;
        this.f24606oa = f11;
    }

    public float oa() {
        return this.f24606oa;
    }

    public String toString() {
        return uef() + "x" + oa();
    }

    public float uef() {
        return this.uef;
    }

    public boolean oa(float f10, float f11) {
        return this.uef == f10 && this.f24606oa == f11;
    }

    public void uef(float f10, float f11) {
        this.uef = f10;
        this.f24606oa = f11;
    }

    public yo() {
        this(1.0f, 1.0f);
    }
}
