package com.airbnb.lottie.h;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private float f2454a;

    /* renamed from: b, reason: collision with root package name */
    private float f2455b;

    public d(float f2, float f3) {
        this.f2454a = f2;
        this.f2455b = f3;
    }

    public final float a() {
        return this.f2454a;
    }

    public final float b() {
        return this.f2455b;
    }

    public final void c(float f2, float f3) {
        this.f2454a = f2;
        this.f2455b = f3;
    }

    public final boolean d() {
        return this.f2454a == 1.0f && this.f2455b == 1.0f;
    }

    public final String toString() {
        return this.f2454a + "x" + this.f2455b;
    }

    public d() {
        this(1.0f, 1.0f);
    }
}
