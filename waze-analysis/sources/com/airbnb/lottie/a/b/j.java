package com.airbnb.lottie.a.b;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class j extends m {
    public j(List list) {
        super(list);
    }

    @Override // com.airbnb.lottie.a.b.f
    final /* bridge */ /* synthetic */ Object g(com.airbnb.lottie.h.a aVar, float f2) {
        return Float.valueOf(p(aVar, f2));
    }

    public final float o() {
        return p(e(), b());
    }

    final float p(com.airbnb.lottie.h.a aVar, float f2) {
        float f3;
        Object obj = aVar.f2433a;
        if (obj == null || aVar.f2434b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.airbnb.lottie.h.c cVar = this.f1877c;
        if (cVar != null) {
            f3 = f2;
            Float f4 = (Float) cVar.b(aVar.f2438f, aVar.f2439g.floatValue(), (Float) obj, (Float) aVar.f2434b, f3, c(), this.f1876b);
            if (f4 != null) {
                return f4.floatValue();
            }
        } else {
            f3 = f2;
        }
        float f5 = aVar.f();
        float fD = aVar.d();
        int i2 = com.airbnb.lottie.g.f.f2413a;
        return f5 + (f3 * (fD - f5));
    }
}
