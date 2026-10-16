package O;

import N.y0;
import q.s1;

/* loaded from: classes.dex */
public final class p extends A {

    /* renamed from: c, reason: collision with root package name */
    public static final p f8738c = new p(3, 0, 2);

    @Override // O.A
    public final void a(G4.f fVar, E9.c cVar, y0 y0Var, s1 s1Var) {
        cVar.n(fVar.e(0), fVar.e(1), fVar.e(2));
    }

    @Override // O.A
    public final String b(int i5) {
        return i5 == 0 ? "from" : i5 == 1 ? "to" : i5 == 2 ? "count" : super.b(i5);
    }
}
