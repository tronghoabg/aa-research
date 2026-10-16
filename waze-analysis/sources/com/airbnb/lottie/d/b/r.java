package com.airbnb.lottie.d.b;

import com.airbnb.lottie.a.a.u;
import com.airbnb.lottie.s;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class r implements c {

    /* renamed from: a, reason: collision with root package name */
    private final com.airbnb.lottie.d.a.b f2211a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.d.a.b f2212b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.d.a.b f2213c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f2214d;

    /* renamed from: e, reason: collision with root package name */
    private final int f2215e;

    public r(int i2, com.airbnb.lottie.d.a.b bVar, com.airbnb.lottie.d.a.b bVar2, com.airbnb.lottie.d.a.b bVar3, boolean z) {
        this.f2215e = i2;
        this.f2211a = bVar;
        this.f2212b = bVar2;
        this.f2213c = bVar3;
        this.f2214d = z;
    }

    @Override // com.airbnb.lottie.d.b.c
    public final com.airbnb.lottie.a.a.d a(s sVar, com.airbnb.lottie.h hVar, com.airbnb.lottie.d.c.b bVar) {
        return new u(bVar, this);
    }

    public final com.airbnb.lottie.d.a.b b() {
        return this.f2212b;
    }

    public final com.airbnb.lottie.d.a.b c() {
        return this.f2213c;
    }

    public final com.airbnb.lottie.d.a.b d() {
        return this.f2211a;
    }

    public final boolean e() {
        return this.f2214d;
    }

    public final int f() {
        return this.f2215e;
    }

    public final String toString() {
        com.airbnb.lottie.d.a.b bVar = this.f2213c;
        com.airbnb.lottie.d.a.b bVar2 = this.f2212b;
        return "Trim Path: {start: " + String.valueOf(this.f2211a) + ", end: " + String.valueOf(bVar2) + ", offset: " + String.valueOf(bVar) + "}";
    }
}
