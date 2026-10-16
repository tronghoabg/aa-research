package com.airbnb.lottie.a.b;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class l extends m {
    public l(List list) {
        super(list);
    }

    @Override // com.airbnb.lottie.a.b.f
    final /* bridge */ /* synthetic */ Object g(com.airbnb.lottie.h.a aVar, float f2) {
        return Integer.valueOf(p(aVar, f2));
    }

    public final int o() {
        return p(e(), b());
    }

    final int p(com.airbnb.lottie.h.a aVar, float f2) {
        float f3;
        Object obj = aVar.f2433a;
        if (obj == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int iH = aVar.f2434b == null ? aVar.h() : aVar.g();
        com.airbnb.lottie.h.c cVar = this.f1877c;
        if (cVar != null) {
            f3 = f2;
            Integer num = (Integer) cVar.b(aVar.f2438f, aVar.f2439g.floatValue(), (Integer) obj, Integer.valueOf(iH), f3, c(), this.f1876b);
            if (num != null) {
                return num.intValue();
            }
        } else {
            f3 = f2;
        }
        int iH2 = aVar.h();
        int i2 = com.airbnb.lottie.g.f.f2413a;
        return (int) (iH2 + (f3 * (iH - iH2)));
    }
}
