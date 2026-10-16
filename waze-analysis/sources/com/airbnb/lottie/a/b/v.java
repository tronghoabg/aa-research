package com.airbnb.lottie.a.b;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class v extends m {
    public v(List list) {
        super(list);
    }

    @Override // com.airbnb.lottie.a.b.f
    final /* bridge */ /* synthetic */ Object g(com.airbnb.lottie.h.a aVar, float f2) {
        Object obj;
        com.airbnb.lottie.h.c cVar = this.f1877c;
        if (cVar == null) {
            return (f2 != 1.0f || (obj = aVar.f2434b) == null) ? (com.airbnb.lottie.d.b) aVar.f2433a : (com.airbnb.lottie.d.b) obj;
        }
        float f3 = aVar.f2438f;
        Float f4 = aVar.f2439g;
        float fFloatValue = f4 == null ? Float.MAX_VALUE : f4.floatValue();
        com.airbnb.lottie.d.b bVar = (com.airbnb.lottie.d.b) aVar.f2433a;
        Object obj2 = aVar.f2434b;
        return (com.airbnb.lottie.d.b) cVar.b(f3, fFloatValue, bVar, obj2 == null ? bVar : (com.airbnb.lottie.d.b) obj2, f2, b(), this.f1876b);
    }

    public final void o(com.airbnb.lottie.h.c cVar) {
        this.f1877c = new u(this, new com.airbnb.lottie.h.b(), cVar, new com.airbnb.lottie.d.b());
    }
}
