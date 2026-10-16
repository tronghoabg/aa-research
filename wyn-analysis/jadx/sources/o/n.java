package O;

import N.C0716c;
import N.C0718d;
import N.w0;
import N.y0;
import q.s1;

/* loaded from: classes.dex */
public final class n extends A {

    /* renamed from: c, reason: collision with root package name */
    public static final n f8736c = new n(0, 3, 1);

    @Override // O.A
    public final void a(G4.f fVar, E9.c cVar, y0 y0Var, s1 s1Var) {
        w0 w0Var = (w0) fVar.f(1);
        C0716c c0716c = (C0716c) fVar.f(0);
        c cVar2 = (c) fVar.f(2);
        y0 y0VarE = w0Var.e();
        try {
            if (!cVar2.f8721c.Z()) {
                C0718d.v("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
                throw null;
            }
            cVar2.f8720b.Y(cVar, y0VarE, s1Var);
            y0VarE.e(true);
            y0Var.d();
            c0716c.getClass();
            y0Var.t(w0Var, w0Var.a(c0716c));
            y0Var.j();
        } catch (Throwable th) {
            y0VarE.e(false);
            throw th;
        }
    }

    @Override // O.A
    public final String c(int i5) {
        return i5 == 0 ? "anchor" : i5 == 1 ? "from" : i5 == 2 ? "fixups" : super.c(i5);
    }
}
