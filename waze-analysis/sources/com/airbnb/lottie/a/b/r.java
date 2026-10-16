package com.airbnb.lottie.a.b;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class r extends m {

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.h.d f1903d;

    public r(List list) {
        super(list);
        this.f1903d = new com.airbnb.lottie.h.d();
    }

    @Override // com.airbnb.lottie.a.b.f
    public final /* bridge */ /* synthetic */ Object g(com.airbnb.lottie.h.a aVar, float f2) {
        Object obj;
        float f3;
        Object obj2 = aVar.f2433a;
        if (obj2 == null || (obj = aVar.f2434b) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.airbnb.lottie.h.d dVar = (com.airbnb.lottie.h.d) obj2;
        com.airbnb.lottie.h.d dVar2 = (com.airbnb.lottie.h.d) obj;
        com.airbnb.lottie.h.c cVar = this.f1877c;
        if (cVar != null) {
            f3 = f2;
            com.airbnb.lottie.h.d dVar3 = (com.airbnb.lottie.h.d) cVar.b(aVar.f2438f, aVar.f2439g.floatValue(), dVar, dVar2, f3, c(), this.f1876b);
            if (dVar3 != null) {
                return dVar3;
            }
        } else {
            f3 = f2;
        }
        com.airbnb.lottie.h.d dVar4 = this.f1903d;
        float fA = dVar.a();
        float fA2 = dVar2.a();
        int i2 = com.airbnb.lottie.g.f.f2413a;
        float f4 = fA + ((fA2 - fA) * f3);
        float fB = dVar.b();
        dVar4.c(f4, fB + ((dVar2.b() - fB) * f3));
        return dVar4;
    }
}
