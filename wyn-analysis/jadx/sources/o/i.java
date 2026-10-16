package O;

import N.C0718d;
import N.y0;
import q.s1;

/* loaded from: classes.dex */
public final class i extends A {

    /* renamed from: c, reason: collision with root package name */
    public static final i f8727c;

    static {
        int i5 = 0;
        f8727c = new i(i5, i5, 3);
    }

    @Override // O.A
    public final void a(G4.f fVar, E9.c cVar, y0 y0Var, s1 s1Var) {
        while (true) {
            int i5 = y0Var.f7985u;
            if ((i5 < 0 && y0Var.f7984t > 0) || i5 == 0) {
                break;
            }
            y0Var.B();
            int i10 = y0Var.f7985u;
            if (C0718d.m(y0Var.p(i10), y0Var.f7967b)) {
                cVar.u();
            }
            y0Var.i();
        }
        y0Var.i();
    }
}
