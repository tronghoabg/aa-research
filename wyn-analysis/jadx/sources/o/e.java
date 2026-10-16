package O;

import N.C0716c;
import N.C0718d;
import N.r0;
import N.y0;
import java.util.ArrayList;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import q.s1;

/* loaded from: classes.dex */
public final class e extends A {

    /* renamed from: c, reason: collision with root package name */
    public static final e f8723c = new e(0, 2, 1);

    @Override // O.A
    public final void a(G4.f fVar, E9.c cVar, y0 y0Var, s1 s1Var) {
        C0716c c0716c = (C0716c) fVar.f(0);
        Object objF = fVar.f(1);
        if (objF instanceof r0) {
            ((ArrayList) s1Var.f43897b).add(((r0) objF).f7902a);
        }
        if (y0Var.f7978n != 0) {
            C0718d.v("Can only append a slot if not current inserting");
            throw null;
        }
        int i5 = y0Var.f7974i;
        int i10 = y0Var.f7975j;
        int iC = y0Var.c(c0716c);
        int iF = y0Var.f(y0Var.p(iC + 1), y0Var.f7967b);
        y0Var.f7974i = iF;
        y0Var.f7975j = iF;
        y0Var.s(1, iC);
        if (i5 >= iF) {
            i5++;
            i10++;
        }
        y0Var.f7968c[iF] = objF;
        y0Var.f7974i = i5;
        y0Var.f7975j = i10;
    }

    @Override // O.A
    public final String c(int i5) {
        return i5 == 0 ? "anchor" : i5 == 1 ? MimeTypesReaderMetKeys.MATCH_VALUE_ATTR : super.c(i5);
    }
}
