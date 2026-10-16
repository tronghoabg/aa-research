package com.airbnb.lottie.d.b;

import com.airbnb.lottie.s;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class p implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f2197a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2198b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.d.a.h f2199c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f2200d;

    public p(String str, int i2, com.airbnb.lottie.d.a.h hVar, boolean z) {
        this.f2197a = str;
        this.f2198b = i2;
        this.f2199c = hVar;
        this.f2200d = z;
    }

    @Override // com.airbnb.lottie.d.b.c
    public final com.airbnb.lottie.a.a.d a(s sVar, com.airbnb.lottie.h hVar, com.airbnb.lottie.d.c.b bVar) {
        return new com.airbnb.lottie.a.a.s(sVar, bVar, this);
    }

    public final com.airbnb.lottie.d.a.h b() {
        return this.f2199c;
    }

    public final String c() {
        return this.f2197a;
    }

    public final boolean d() {
        return this.f2200d;
    }

    public final String toString() {
        return "ShapePath{name=" + this.f2197a + ", index=" + this.f2198b + "}";
    }
}
