package defpackage;

/* loaded from: classes.dex */
public final class jty {
    public static final void a(fyb fybVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        bux buxVarC = buxVar.c(-194451425);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(fybVar) : buxVarC.E(fybVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            jtr.a(new fxn((gfk) dyz.d(fybVar.a, new gfq(), buxVarC).a(), fybVar.b, fybVar.c, 1, false, 16), gut.e(cfyVar, fybVar), null, buxVarC, 8, 4);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new jtt(fybVar, cfyVar, i, 6);
        }
    }

    public static final void b() {
    }
}
