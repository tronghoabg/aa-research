package O;

import N.C0716c;
import N.w0;
import N.y0;
import q.s1;

/* loaded from: classes.dex */
public final class m extends A {

    /* renamed from: c, reason: collision with root package name */
    public static final m f8735c = new m(0, 2, 1);

    @Override // O.A
    public final void a(G4.f fVar, E9.c cVar, y0 y0Var, s1 s1Var) {
        w0 w0Var = (w0) fVar.f(1);
        C0716c c0716c = (C0716c) fVar.f(0);
        y0Var.d();
        c0716c.getClass();
        y0Var.t(w0Var, w0Var.a(c0716c));
        y0Var.j();
    }

    @Override // O.A
    public final String c(int i5) {
        return i5 == 0 ? "anchor" : i5 == 1 ? "from" : super.c(i5);
    }
}
