package com.airbnb.lottie.d.b;

import android.graphics.Path;
import com.airbnb.lottie.s;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class n implements c {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f2188a;

    /* renamed from: b, reason: collision with root package name */
    private final Path.FillType f2189b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2190c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.d.a.a f2191d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.d.a.d f2192e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f2193f;

    public n(String str, boolean z, Path.FillType fillType, com.airbnb.lottie.d.a.a aVar, com.airbnb.lottie.d.a.d dVar, boolean z2) {
        this.f2190c = str;
        this.f2188a = z;
        this.f2189b = fillType;
        this.f2191d = aVar;
        this.f2192e = dVar;
        this.f2193f = z2;
    }

    @Override // com.airbnb.lottie.d.b.c
    public final com.airbnb.lottie.a.a.d a(s sVar, com.airbnb.lottie.h hVar, com.airbnb.lottie.d.c.b bVar) {
        return new com.airbnb.lottie.a.a.h(sVar, bVar, this);
    }

    public final Path.FillType b() {
        return this.f2189b;
    }

    public final com.airbnb.lottie.d.a.a c() {
        return this.f2191d;
    }

    public final com.airbnb.lottie.d.a.d d() {
        return this.f2192e;
    }

    public final String e() {
        return this.f2190c;
    }

    public final boolean f() {
        return this.f2193f;
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f2188a + "}";
    }
}
