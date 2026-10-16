package O;

import N.y0;
import java.util.ArrayList;
import q.s1;

/* loaded from: classes.dex */
public final class u extends A {

    /* renamed from: c, reason: collision with root package name */
    public static final u f8743c;

    static {
        int i5 = 1;
        f8743c = new u(0, i5, i5);
    }

    @Override // O.A
    public final void a(G4.f fVar, E9.c cVar, y0 y0Var, s1 s1Var) {
        ((ArrayList) s1Var.f43899d).add((tf.a) fVar.f(0));
    }

    @Override // O.A
    public final String c(int i5) {
        return i5 == 0 ? "effect" : super.c(i5);
    }
}
