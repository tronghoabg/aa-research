package t9;

import ka.B1;
import ka.C1;
import ka.C3232f;
import ka.C3235g;

/* renamed from: t9.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4151b extends c {
    @Override // t9.c
    public final C1 d(C1 c12) {
        C3232f c3232fG = s9.p.f(c12) ? (C3232f) c12.m().toBuilder() : C3235g.g();
        for (C1 c13 : this.f45944a) {
            if (!s9.p.d(c3232fG, c13)) {
                c3232fG.b(c13);
            }
        }
        B1 b1W = C1.w();
        b1W.b(c3232fG);
        return (C1) b1W.build();
    }
}
