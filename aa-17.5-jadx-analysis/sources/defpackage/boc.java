package defpackage;

/* loaded from: classes.dex */
public final class boc {
    public static final /* synthetic */ int a = 0;
    private static final cfy b = awd.i(cfy.e, 24.0f);

    /* JADX WARN: Removed duplicated region for block: B:100:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.cmw r19, final java.lang.String r20, defpackage.cfy r21, long r22, defpackage.bux r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.boc.a(cmw, java.lang.String, cfy, long, bux, int, int):void");
    }

    public static final void b(cng cngVar, cfy cfyVar, long j, bux buxVar, int i) {
        int i2;
        cfy cfyVar2;
        long j2;
        long j3;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-126890956);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cngVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(null) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 = i2 | 1408;
        }
        if (buxVarC.I((i4 & 1171) != 1170, i4 & 1)) {
            ((bvv) buxVarC).ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                cfyVar = cfy.e;
                j3 = ((cjv) buxVarC.f(bnm.a)).a;
            } else {
                buxVarC.s();
                j3 = j;
            }
            cfy cfyVar3 = cfyVar;
            buxVarC.l();
            a(czz.D(cngVar, buxVarC), null, cfyVar3, j3, buxVarC, (i4 & 112) | 8 | (i4 & 896), 0);
            cfyVar2 = cfyVar3;
            j2 = j3;
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
            j2 = j;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gaw(cngVar, cfyVar2, j2, i, 1);
        }
    }
}
