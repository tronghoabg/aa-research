package O;

import N.C0718d;
import N.C0729i0;
import N.r0;
import N.y0;
import q.s1;

/* loaded from: classes.dex */
public final class w extends A {

    /* renamed from: c, reason: collision with root package name */
    public static final w f8745c = new w(1, 0, 2);

    @Override // O.A
    public final void a(G4.f fVar, E9.c cVar, y0 y0Var, s1 s1Var) {
        int iE = fVar.e(0);
        int iO = y0Var.o();
        int i5 = y0Var.f7985u;
        int iC = y0Var.C(y0Var.p(i5), y0Var.f7967b);
        int iF = y0Var.f(y0Var.p(i5 + 1), y0Var.f7967b);
        for (int iMax = Math.max(iC, iF - iE); iMax < iF; iMax++) {
            Object obj = y0Var.f7968c[y0Var.g(iMax)];
            if (obj instanceof r0) {
                s1Var.l(((r0) obj).f7902a, iO - iMax, -1, -1);
            } else if (obj instanceof C0729i0) {
                ((C0729i0) obj).d();
            }
        }
        C0718d.K(iE > 0);
        int i10 = y0Var.f7985u;
        int iC2 = y0Var.C(y0Var.p(i10), y0Var.f7967b);
        int iF2 = y0Var.f(y0Var.p(i10 + 1), y0Var.f7967b) - iE;
        C0718d.K(iF2 >= iC2);
        y0Var.A(iF2, iE, i10);
        int i11 = y0Var.f7974i;
        if (i11 >= iC2) {
            y0Var.f7974i = i11 - iE;
        }
    }

    @Override // O.A
    public final String b(int i5) {
        return i5 == 0 ? "count" : super.b(i5);
    }
}
