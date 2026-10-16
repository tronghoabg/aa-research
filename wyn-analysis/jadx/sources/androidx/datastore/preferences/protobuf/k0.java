package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class k0 {
    public static boolean a(Object obj, G4.f fVar) throws A {
        int iG = fVar.g();
        int i5 = iG >>> 3;
        int i10 = iG & 7;
        if (i10 == 0) {
            ((j0) obj).c(i5 << 3, Long.valueOf(fVar.A()));
            return true;
        }
        if (i10 == 1) {
            ((j0) obj).c((i5 << 3) | 1, Long.valueOf(fVar.s()));
            return true;
        }
        if (i10 == 2) {
            ((j0) obj).c((i5 << 3) | 2, fVar.j());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw A.b();
            }
            ((j0) obj).c((i5 << 3) | 5, Integer.valueOf(fVar.q()));
            return true;
        }
        j0 j0VarB = j0.b();
        int i11 = i5 << 3;
        int i12 = i11 | 4;
        while (fVar.d() != Integer.MAX_VALUE && a(j0VarB, fVar)) {
        }
        if (i12 != fVar.g()) {
            throw new A("Protocol message end-group tag did not match expected tag.");
        }
        j0VarB.f18239e = false;
        ((j0) obj).c(i11 | 3, j0VarB);
        return true;
    }

    public static j0 b() {
        return j0.b();
    }
}
