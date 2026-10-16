package com.airbnb.lottie.d.b;

import com.airbnb.lottie.s;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class j implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f2174a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.d.a.m f2175b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.d.a.m f2176c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.d.a.b f2177d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f2178e;

    public j(String str, com.airbnb.lottie.d.a.m mVar, com.airbnb.lottie.d.a.m mVar2, com.airbnb.lottie.d.a.b bVar, boolean z) {
        this.f2174a = str;
        this.f2175b = mVar;
        this.f2176c = mVar2;
        this.f2177d = bVar;
        this.f2178e = z;
    }

    @Override // com.airbnb.lottie.d.b.c
    public final com.airbnb.lottie.a.a.d a(s sVar, com.airbnb.lottie.h hVar, com.airbnb.lottie.d.c.b bVar) {
        return new com.airbnb.lottie.a.a.p(sVar, bVar, this);
    }

    public final com.airbnb.lottie.d.a.b b() {
        return this.f2177d;
    }

    public final com.airbnb.lottie.d.a.m c() {
        return this.f2175b;
    }

    public final com.airbnb.lottie.d.a.m d() {
        return this.f2176c;
    }

    public final String e() {
        return this.f2174a;
    }

    public final boolean f() {
        return this.f2178e;
    }

    public final String toString() {
        com.airbnb.lottie.d.a.m mVar = this.f2176c;
        return "RectangleShape{position=" + String.valueOf(this.f2175b) + ", size=" + String.valueOf(mVar) + "}";
    }
}
