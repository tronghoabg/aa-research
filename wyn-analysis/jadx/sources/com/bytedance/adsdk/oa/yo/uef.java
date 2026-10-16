package com.bytedance.adsdk.oa.yo;

import android.graphics.PointF;

/* loaded from: classes.dex */
public class uef {

    /* renamed from: oa, reason: collision with root package name */
    private final PointF f24637oa;
    private final PointF uef;
    private final PointF yo;

    public uef() {
        this.uef = new PointF();
        this.f24637oa = new PointF();
        this.yo = new PointF();
    }

    public void oa(float f10, float f11) {
        this.f24637oa.set(f10, f11);
    }

    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.yo.x), Float.valueOf(this.yo.y), Float.valueOf(this.uef.x), Float.valueOf(this.uef.y), Float.valueOf(this.f24637oa.x), Float.valueOf(this.f24637oa.y));
    }

    public void uef(float f10, float f11) {
        this.uef.set(f10, f11);
    }

    public void yo(float f10, float f11) {
        this.yo.set(f10, f11);
    }

    public PointF oa() {
        return this.f24637oa;
    }

    public PointF uef() {
        return this.uef;
    }

    public PointF yo() {
        return this.yo;
    }

    public uef(PointF pointF, PointF pointF2, PointF pointF3) {
        this.uef = pointF;
        this.f24637oa = pointF2;
        this.yo = pointF3;
    }
}
