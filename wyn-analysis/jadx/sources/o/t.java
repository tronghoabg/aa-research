package O;

import N.C0718d;
import N.y0;
import q.s1;

/* loaded from: classes.dex */
public final class t extends A {

    /* renamed from: c, reason: collision with root package name */
    public static final t f8742c;

    static {
        int i5 = 0;
        f8742c = new t(i5, i5, 3);
    }

    @Override // O.A
    public final void a(G4.f fVar, E9.c cVar, y0 y0Var, s1 s1Var) {
        if (y0Var.f7978n != 0) {
            C0718d.v("Cannot reset when inserting");
            throw null;
        }
        y0Var.x();
        y0Var.f7983s = 0;
        y0Var.f7984t = y0Var.m() - y0Var.f7973h;
        y0Var.f7974i = 0;
        y0Var.f7975j = 0;
        y0Var.f7979o = 0;
    }
}
