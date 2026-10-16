package defpackage;

/* loaded from: classes2.dex */
public final class her {
    public static final void a(hez hezVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        cfy cfyVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-2096494112);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(hezVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        int i5 = 18;
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            cfyVar2 = cfyVar;
            hdo.b(cfyVar2, hezVar.b, hezVar.c, bxc.i(176201016, true, new gsl(hezVar, i4), buxVarC), buxVarC, ((i2 >> 3) & 14) | 3648);
        } else {
            cfyVar2 = cfyVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new hcx(hezVar, cfyVar2, i, i5);
        }
    }

    public static boolean b(int i) {
        return i == 3 || i == 4;
    }
}
