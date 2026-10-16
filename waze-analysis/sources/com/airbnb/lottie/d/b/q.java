package com.airbnb.lottie.d.b;

import com.airbnb.lottie.a.a.t;
import com.airbnb.lottie.s;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class q implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f2201a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.d.a.b f2202b;

    /* renamed from: c, reason: collision with root package name */
    private final List f2203c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.d.a.a f2204d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.d.a.d f2205e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.d.a.b f2206f;

    /* renamed from: g, reason: collision with root package name */
    private final float f2207g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f2208h;

    /* renamed from: i, reason: collision with root package name */
    private final int f2209i;

    /* renamed from: j, reason: collision with root package name */
    private final int f2210j;

    public q(String str, com.airbnb.lottie.d.a.b bVar, List list, com.airbnb.lottie.d.a.a aVar, com.airbnb.lottie.d.a.d dVar, com.airbnb.lottie.d.a.b bVar2, int i2, int i3, float f2, boolean z) {
        this.f2201a = str;
        this.f2202b = bVar;
        this.f2203c = list;
        this.f2204d = aVar;
        this.f2205e = dVar;
        this.f2206f = bVar2;
        this.f2209i = i2;
        this.f2210j = i3;
        this.f2207g = f2;
        this.f2208h = z;
    }

    @Override // com.airbnb.lottie.d.b.c
    public final com.airbnb.lottie.a.a.d a(s sVar, com.airbnb.lottie.h hVar, com.airbnb.lottie.d.c.b bVar) {
        return new t(sVar, bVar, this);
    }

    public final float b() {
        return this.f2207g;
    }

    public final com.airbnb.lottie.d.a.a c() {
        return this.f2204d;
    }

    public final com.airbnb.lottie.d.a.b d() {
        return this.f2202b;
    }

    public final com.airbnb.lottie.d.a.b e() {
        return this.f2206f;
    }

    public final com.airbnb.lottie.d.a.d f() {
        return this.f2205e;
    }

    public final String g() {
        return this.f2201a;
    }

    public final List h() {
        return this.f2203c;
    }

    public final boolean i() {
        return this.f2208h;
    }

    public final int j() {
        return this.f2209i;
    }

    public final int k() {
        return this.f2210j;
    }
}
