package com.airbnb.lottie.a.b;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    private final com.airbnb.lottie.h.a f1873a;

    /* renamed from: b, reason: collision with root package name */
    private float f1874b = -1.0f;

    e(List list) {
        this.f1873a = (com.airbnb.lottie.h.a) list.get(0);
    }

    @Override // com.airbnb.lottie.a.b.c
    public final float a() {
        return this.f1873a.c();
    }

    @Override // com.airbnb.lottie.a.b.c
    public final float b() {
        return this.f1873a.e();
    }

    @Override // com.airbnb.lottie.a.b.c
    public final com.airbnb.lottie.h.a c() {
        return this.f1873a;
    }

    @Override // com.airbnb.lottie.a.b.c
    public final boolean d(float f2) {
        if (this.f1874b == f2) {
            return true;
        }
        this.f1874b = f2;
        return false;
    }

    @Override // com.airbnb.lottie.a.b.c
    public final boolean e() {
        return false;
    }

    @Override // com.airbnb.lottie.a.b.c
    public final boolean f(float f2) {
        return !this.f1873a.j();
    }
}
