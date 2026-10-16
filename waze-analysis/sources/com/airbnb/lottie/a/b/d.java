package com.airbnb.lottie.a.b;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private final List f1869a;

    /* renamed from: c, reason: collision with root package name */
    private com.airbnb.lottie.h.a f1871c = null;

    /* renamed from: d, reason: collision with root package name */
    private float f1872d = -1.0f;

    /* renamed from: b, reason: collision with root package name */
    private com.airbnb.lottie.h.a f1870b = g(0.0f);

    d(List list) {
        this.f1869a = list;
    }

    private final com.airbnb.lottie.h.a g(float f2) {
        List list = this.f1869a;
        com.airbnb.lottie.h.a aVar = (com.airbnb.lottie.h.a) list.get(list.size() - 1);
        if (f2 >= aVar.e()) {
            return aVar;
        }
        for (int size = list.size() - 2; size > 0; size--) {
            com.airbnb.lottie.h.a aVar2 = (com.airbnb.lottie.h.a) list.get(size);
            if (this.f1870b != aVar2 && aVar2.i(f2)) {
                return aVar2;
            }
        }
        return (com.airbnb.lottie.h.a) list.get(0);
    }

    @Override // com.airbnb.lottie.a.b.c
    public final float a() {
        return ((com.airbnb.lottie.h.a) this.f1869a.get(r1.size() - 1)).c();
    }

    @Override // com.airbnb.lottie.a.b.c
    public final float b() {
        return ((com.airbnb.lottie.h.a) this.f1869a.get(0)).e();
    }

    @Override // com.airbnb.lottie.a.b.c
    public final com.airbnb.lottie.h.a c() {
        return this.f1870b;
    }

    @Override // com.airbnb.lottie.a.b.c
    public final boolean d(float f2) {
        com.airbnb.lottie.h.a aVar = this.f1871c;
        com.airbnb.lottie.h.a aVar2 = this.f1870b;
        if (aVar == aVar2 && this.f1872d == f2) {
            return true;
        }
        this.f1871c = aVar2;
        this.f1872d = f2;
        return false;
    }

    @Override // com.airbnb.lottie.a.b.c
    public final boolean e() {
        return false;
    }

    @Override // com.airbnb.lottie.a.b.c
    public final boolean f(float f2) {
        if (this.f1870b.i(f2)) {
            return !this.f1870b.j();
        }
        this.f1870b = g(f2);
        return true;
    }
}
