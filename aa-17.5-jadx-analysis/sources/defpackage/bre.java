package defpackage;

/* loaded from: classes2.dex */
public final class bre {
    public static final bre a = new bre();

    public static final long a(bux buxVar) {
        float f = bud.a;
        return bnh.f(bud.b, buxVar);
    }

    public static final long b(bux buxVar) {
        float f = bud.a;
        return bnh.f(bud.c, buxVar);
    }

    public final void c(final cfy cfyVar, float f, long j, bux buxVar, final int i) {
        int i2;
        bux buxVarC = buxVar.c(-1498258020);
        if ((i & 6) == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 = i2 | 176;
        }
        if (buxVarC.I((i3 & 147) != 146, 1 & i3)) {
            ((bvv) buxVarC).ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                float f2 = bud.a;
                f = 3.0f;
                j = bnh.f(26, buxVarC);
            } else {
                buxVarC.s();
            }
            buxVarC.l();
            atk.c(awd.d(awd.r(cfyVar), f).a(new aix(j, ckq.a)), buxVarC, 0);
        } else {
            buxVarC.s();
        }
        final float f3 = f;
        final long j2 = j;
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: brd
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar2 = (bux) obj;
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    int i5 = i4 | 1;
                    int i6 = 306783378 & i5;
                    int i7 = 613566756 & i5;
                    this.a.c(cfyVar, f3, j2, buxVar2, (i7 >> 1) | i6 | (i5 & (-920350135)) | ((i6 + i6) & i7));
                    return afak.a;
                }
            };
        }
    }
}
