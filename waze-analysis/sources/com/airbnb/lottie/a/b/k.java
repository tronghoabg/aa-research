package com.airbnb.lottie.a.b;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k extends m {

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.d.b.d f1891d;

    public k(List list) {
        super(list);
        int iMax = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            com.airbnb.lottie.d.b.d dVar = (com.airbnb.lottie.d.b.d) ((com.airbnb.lottie.h.a) list.get(i2)).f2433a;
            if (dVar != null) {
                iMax = Math.max(iMax, dVar.a());
            }
        }
        this.f1891d = new com.airbnb.lottie.d.b.d(new float[iMax], new int[iMax]);
    }

    @Override // com.airbnb.lottie.a.b.f
    final /* bridge */ /* synthetic */ Object g(com.airbnb.lottie.h.a aVar, float f2) {
        com.airbnb.lottie.d.b.d dVar = (com.airbnb.lottie.d.b.d) aVar.f2433a;
        com.airbnb.lottie.d.b.d dVar2 = (com.airbnb.lottie.d.b.d) aVar.f2434b;
        com.airbnb.lottie.d.b.d dVar3 = this.f1891d;
        dVar3.c(dVar, dVar2, f2);
        return dVar3;
    }
}
