package O;

import N.C0716c;
import N.y0;
import q.s1;

/* loaded from: classes.dex */
public final class j extends A {

    /* renamed from: c, reason: collision with root package name */
    public static final j f8728c;

    static {
        int i5 = 1;
        f8728c = new j(0, i5, i5);
    }

    @Override // O.A
    public final void a(G4.f fVar, E9.c cVar, y0 y0Var, s1 s1Var) {
        C0716c c0716c = (C0716c) fVar.f(0);
        c0716c.getClass();
        y0Var.k(y0Var.c(c0716c));
    }

    @Override // O.A
    public final String c(int i5) {
        return i5 == 0 ? "anchor" : super.c(i5);
    }
}
