package com.airbnb.lottie.a.b;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class g extends m {
    public g(List list) {
        super(list);
    }

    @Override // com.airbnb.lottie.a.b.f
    final /* bridge */ /* synthetic */ Object g(com.airbnb.lottie.h.a aVar, float f2) {
        return Integer.valueOf(p(aVar, f2));
    }

    public final int o() {
        return p(e(), b());
    }

    public final int p(com.airbnb.lottie.h.a aVar, float f2) {
        float f3;
        Float f4;
        Object obj = aVar.f2433a;
        if (obj == null || aVar.f2434b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.airbnb.lottie.h.c cVar = this.f1877c;
        if (cVar == null || (f4 = aVar.f2439g) == null) {
            f3 = f2;
        } else {
            f3 = f2;
            Integer num = (Integer) cVar.b(aVar.f2438f, f4.floatValue(), (Integer) obj, (Integer) aVar.f2434b, f3, c(), this.f1876b);
            if (num != null) {
                return num.intValue();
            }
        }
        int i2 = com.airbnb.lottie.g.f.f2413a;
        return com.airbnb.lottie.f.d.h(Math.max(0.0f, Math.min(1.0f, f3)), ((Integer) obj).intValue(), ((Integer) aVar.f2434b).intValue());
    }
}
