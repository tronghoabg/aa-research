package com.airbnb.lottie.d.b;

import com.airbnb.lottie.s;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f2130a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.d.a.m f2131b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.d.a.f f2132c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f2133d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f2134e;

    public b(String str, com.airbnb.lottie.d.a.m mVar, com.airbnb.lottie.d.a.f fVar, boolean z, boolean z2) {
        this.f2130a = str;
        this.f2131b = mVar;
        this.f2132c = fVar;
        this.f2133d = z;
        this.f2134e = z2;
    }

    @Override // com.airbnb.lottie.d.b.c
    public final com.airbnb.lottie.a.a.d a(s sVar, com.airbnb.lottie.h hVar, com.airbnb.lottie.d.c.b bVar) {
        return new com.airbnb.lottie.a.a.g(sVar, bVar, this);
    }

    public final com.airbnb.lottie.d.a.f b() {
        return this.f2132c;
    }

    public final com.airbnb.lottie.d.a.m c() {
        return this.f2131b;
    }

    public final String d() {
        return this.f2130a;
    }

    public final boolean e() {
        return this.f2134e;
    }

    public final boolean f() {
        return this.f2133d;
    }
}
