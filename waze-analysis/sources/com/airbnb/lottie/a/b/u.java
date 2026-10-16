package com.airbnb.lottie.a.b;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class u extends com.airbnb.lottie.h.c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.airbnb.lottie.h.b f1915a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.airbnb.lottie.h.c f1916b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.airbnb.lottie.d.b f1917c;

    u(v vVar, com.airbnb.lottie.h.b bVar, com.airbnb.lottie.h.c cVar, com.airbnb.lottie.d.b bVar2) {
        this.f1915a = bVar;
        this.f1916b = cVar;
        this.f1917c = bVar2;
        Objects.requireNonNull(vVar);
    }

    @Override // com.airbnb.lottie.h.c
    public final /* bridge */ /* synthetic */ Object a(com.airbnb.lottie.h.b bVar) {
        float fE = bVar.e();
        float fA = bVar.a();
        String str = ((com.airbnb.lottie.d.b) bVar.g()).f2117a;
        String str2 = ((com.airbnb.lottie.d.b) bVar.f()).f2117a;
        float fC = bVar.c();
        float fB = bVar.b();
        float fD = bVar.d();
        com.airbnb.lottie.h.b bVar2 = this.f1915a;
        bVar2.h(fE, fA, str, str2, fC, fB, fD);
        String str3 = (String) this.f1916b.a(bVar2);
        com.airbnb.lottie.d.b bVar3 = (com.airbnb.lottie.d.b) (bVar.b() == 1.0f ? bVar.f() : bVar.g());
        com.airbnb.lottie.d.b bVar4 = this.f1917c;
        bVar4.a(str3, bVar3.f2118b, bVar3.f2119c, bVar3.m, bVar3.f2120d, bVar3.f2121e, bVar3.f2122f, bVar3.f2123g, bVar3.f2124h, bVar3.f2125i, bVar3.f2126j, bVar3.f2127k, bVar3.f2128l);
        return bVar4;
    }
}
