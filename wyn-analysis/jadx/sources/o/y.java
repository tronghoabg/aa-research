package O;

import N.y0;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import q.s1;

/* loaded from: classes.dex */
public final class y extends A {

    /* renamed from: c, reason: collision with root package name */
    public static final y f8747c = new y(0, 2, 1);

    @Override // O.A
    public final void a(G4.f fVar, E9.c cVar, y0 y0Var, s1 s1Var) {
        ((tf.p) fVar.f(1)).invoke(cVar.f3603c, fVar.f(0));
    }

    @Override // O.A
    public final String c(int i5) {
        return i5 == 0 ? MimeTypesReaderMetKeys.MATCH_VALUE_ATTR : i5 == 1 ? "block" : super.c(i5);
    }
}
