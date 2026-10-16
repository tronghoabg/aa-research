package com.airbnb.lottie.d;

import android.graphics.PointF;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final PointF f2096a;

    /* renamed from: b, reason: collision with root package name */
    private final PointF f2097b;

    /* renamed from: c, reason: collision with root package name */
    private final PointF f2098c;

    public a() {
        this.f2096a = new PointF();
        this.f2097b = new PointF();
        this.f2098c = new PointF();
    }

    public final PointF a() {
        return this.f2096a;
    }

    public final PointF b() {
        return this.f2097b;
    }

    public final PointF c() {
        return this.f2098c;
    }

    public final void d(float f2, float f3) {
        this.f2096a.set(f2, f3);
    }

    public final void e(float f2, float f3) {
        this.f2097b.set(f2, f3);
    }

    public final void f(float f2, float f3) {
        this.f2098c.set(f2, f3);
    }

    public final String toString() {
        PointF pointF = this.f2098c;
        Float fValueOf = Float.valueOf(pointF.x);
        Float fValueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.f2096a;
        Float fValueOf3 = Float.valueOf(pointF2.x);
        Float fValueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.f2097b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", fValueOf, fValueOf2, fValueOf3, fValueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f2096a = pointF;
        this.f2097b = pointF2;
        this.f2098c = pointF3;
    }
}
