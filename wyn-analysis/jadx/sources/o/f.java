package O;

import N.y0;
import q.s1;

/* loaded from: classes.dex */
public final class f extends A {

    /* renamed from: c, reason: collision with root package name */
    public static final f f8724c;

    static {
        int i5 = 1;
        f8724c = new f(0, i5, i5);
    }

    @Override // O.A
    public final void a(G4.f fVar, E9.c cVar, y0 y0Var, s1 s1Var) {
        for (Object obj : (Object[]) fVar.f(0)) {
            cVar.e(obj);
        }
    }

    @Override // O.A
    public final String c(int i5) {
        return i5 == 0 ? "nodes" : super.c(i5);
    }
}
