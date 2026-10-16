package t9;

import ka.B1;
import ka.C1;
import ka.C3232f;
import ka.C3235g;

/* renamed from: t9.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4150a extends c {
    @Override // t9.c
    public final C1 d(C1 c12) {
        C3232f c3232fG = s9.p.f(c12) ? (C3232f) c12.m().toBuilder() : C3235g.g();
        for (C1 c13 : this.f45944a) {
            int i5 = 0;
            while (i5 < c3232fG.getValuesCount()) {
                if (s9.p.e(c3232fG.c(i5), c13)) {
                    c3232fG.d(i5);
                } else {
                    i5++;
                }
            }
        }
        B1 b1W = C1.w();
        b1W.b(c3232fG);
        return (C1) b1W.build();
    }
}
