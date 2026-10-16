package O;

import N.C0716c;
import N.C0718d;
import N.y0;
import java.util.ArrayList;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import q.s1;

/* loaded from: classes.dex */
public final class o extends A {

    /* renamed from: c, reason: collision with root package name */
    public static final o f8737c = new o(1, 0, 2);

    @Override // O.A
    public final void a(G4.f fVar, E9.c cVar, y0 y0Var, s1 s1Var) throws Throwable {
        C0716c c0716c;
        int iC;
        int iE = fVar.e(0);
        Throwable th = null;
        if (!(y0Var.f7978n == 0)) {
            C0718d.v("Cannot move a group while inserting");
            throw null;
        }
        if (!(iE >= 0)) {
            C0718d.v("Parameter offset is out of bounds");
            throw null;
        }
        if (iE == 0) {
            return;
        }
        int i5 = y0Var.f7983s;
        int i10 = y0Var.f7985u;
        int i11 = y0Var.f7984t;
        int i12 = i5;
        while (iE > 0) {
            i12 += y0Var.f7967b[(y0Var.p(i12) * 5) + 3];
            if (i12 > i11) {
                C0718d.v("Parameter offset is out of bounds");
                throw null;
            }
            iE--;
        }
        int i13 = y0Var.f7967b[(y0Var.p(i12) * 5) + 3];
        int iF = y0Var.f(y0Var.p(y0Var.f7983s), y0Var.f7967b);
        int iF2 = y0Var.f(y0Var.p(i12), y0Var.f7967b);
        int i14 = i12 + i13;
        int iF3 = y0Var.f(y0Var.p(i14), y0Var.f7967b);
        int i15 = iF3 - iF2;
        y0Var.s(i15, Math.max(y0Var.f7983s - 1, 0));
        y0Var.r(i13);
        int[] iArr = y0Var.f7967b;
        int iP = y0Var.p(i14) * 5;
        ff.m.g0(y0Var.p(i5) * 5, iP, (i13 * 5) + iP, iArr, iArr);
        if (i15 > 0) {
            Object[] objArr = y0Var.f7968c;
            ff.m.h0(objArr, iF, objArr, y0Var.g(iF2 + i15), y0Var.g(iF3 + i15));
        }
        int i16 = iF2 + i15;
        int i17 = i16 - iF;
        int i18 = y0Var.k;
        int i19 = y0Var.f7976l;
        int length = y0Var.f7968c.length;
        int i20 = y0Var.f7977m;
        int i21 = i5 + i13;
        int i22 = i5;
        while (i22 < i21) {
            Throwable th2 = th;
            int iP2 = y0Var.p(i22);
            int i23 = i21;
            int i24 = i22;
            iArr[(iP2 * 5) + 4] = y0.h(y0.h(y0Var.f(iP2, iArr) - i17, i20 < iP2 ? 0 : i18, i19, length), y0Var.k, y0Var.f7976l, y0Var.f7968c.length);
            i22 = i24 + 1;
            th = th2;
            i21 = i23;
            i17 = i17;
        }
        Throwable th3 = th;
        int i25 = i14 + i13;
        int iN = y0Var.n();
        int iN2 = C0718d.n(y0Var.f7969d, i14, iN);
        ArrayList arrayList = new ArrayList();
        if (iN2 >= 0) {
            while (iN2 < y0Var.f7969d.size() && (iC = y0Var.c((c0716c = (C0716c) y0Var.f7969d.get(iN2)))) >= i14 && iC < i25) {
                arrayList.add(c0716c);
                y0Var.f7969d.remove(iN2);
            }
        }
        int i26 = i5 - i14;
        int size = arrayList.size();
        for (int i27 = 0; i27 < size; i27++) {
            C0716c c0716c2 = (C0716c) arrayList.get(i27);
            int iC2 = y0Var.c(c0716c2) + i26;
            if (iC2 >= y0Var.f7972g) {
                c0716c2.f7752a = -(iN - iC2);
            } else {
                c0716c2.f7752a = iC2;
            }
            y0Var.f7969d.add(C0718d.n(y0Var.f7969d, iC2, iN), c0716c2);
        }
        if (y0Var.z(i14, i13)) {
            C0718d.v("Unexpectedly removed anchors");
            throw th3;
        }
        y0Var.l(i10, y0Var.f7984t, i5);
        if (i15 > 0) {
            y0Var.A(i16, i15, i14 - 1);
        }
    }

    @Override // O.A
    public final String b(int i5) {
        return i5 == 0 ? MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR : super.b(i5);
    }
}
