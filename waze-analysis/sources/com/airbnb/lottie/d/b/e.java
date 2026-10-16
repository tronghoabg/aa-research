package com.airbnb.lottie.d.b;

import android.graphics.Path;
import com.airbnb.lottie.s;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    private final Path.FillType f2137a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.d.a.c f2138b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.d.a.d f2139c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.d.a.f f2140d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.d.a.f f2141e;

    /* renamed from: f, reason: collision with root package name */
    private final String f2142f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f2143g;

    /* renamed from: h, reason: collision with root package name */
    private final int f2144h;

    public e(String str, int i2, Path.FillType fillType, com.airbnb.lottie.d.a.c cVar, com.airbnb.lottie.d.a.d dVar, com.airbnb.lottie.d.a.f fVar, com.airbnb.lottie.d.a.f fVar2, boolean z) {
        this.f2144h = i2;
        this.f2137a = fillType;
        this.f2138b = cVar;
        this.f2139c = dVar;
        this.f2140d = fVar;
        this.f2141e = fVar2;
        this.f2142f = str;
        this.f2143g = z;
    }

    @Override // com.airbnb.lottie.d.b.c
    public final com.airbnb.lottie.a.a.d a(s sVar, com.airbnb.lottie.h hVar, com.airbnb.lottie.d.c.b bVar) {
        return new com.airbnb.lottie.a.a.i(sVar, hVar, bVar, this);
    }

    public final Path.FillType b() {
        return this.f2137a;
    }

    public final com.airbnb.lottie.d.a.c c() {
        return this.f2138b;
    }

    public final com.airbnb.lottie.d.a.d d() {
        return this.f2139c;
    }

    public final com.airbnb.lottie.d.a.f e() {
        return this.f2141e;
    }

    public final com.airbnb.lottie.d.a.f f() {
        return this.f2140d;
    }

    public final String g() {
        return this.f2142f;
    }

    public final boolean h() {
        return this.f2143g;
    }

    public final int i() {
        return this.f2144h;
    }
}
