package com.airbnb.lottie.a.b;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class h extends com.airbnb.lottie.h.c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.airbnb.lottie.h.c f1883a;

    h(i iVar, com.airbnb.lottie.h.c cVar) {
        this.f1883a = cVar;
        Objects.requireNonNull(iVar);
    }

    @Override // com.airbnb.lottie.h.c
    public final /* bridge */ /* synthetic */ Object a(com.airbnb.lottie.h.b bVar) {
        Float f2 = (Float) this.f1883a.a(bVar);
        if (f2 == null) {
            return null;
        }
        return Float.valueOf(f2.floatValue() * 2.55f);
    }
}
