package O;

import N.q0;
import N.y0;
import java.util.ArrayList;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import q.s1;

/* loaded from: classes.dex */
public final class q extends A {

    /* renamed from: c, reason: collision with root package name */
    public static final q f8739c;

    static {
        int i5 = 1;
        f8739c = new q(0, i5, i5);
    }

    @Override // O.A
    public final void a(G4.f fVar, E9.c cVar, y0 y0Var, s1 s1Var) {
        ((ArrayList) s1Var.f43897b).add((q0) fVar.f(0));
    }

    @Override // O.A
    public final String c(int i5) {
        return i5 == 0 ? MimeTypesReaderMetKeys.MATCH_VALUE_ATTR : super.c(i5);
    }
}
