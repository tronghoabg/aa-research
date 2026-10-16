package defpackage;

/* loaded from: classes2.dex */
public final class nqv extends nqq {
    @Override // defpackage.nqq
    public final void d(afm afmVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        afmVar.getClass();
        cfyVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1050603585);
        if (i3 == 0) {
            i2 = i | (true != ((i & 8) == 0 ? buxVarC.C(afmVar) : buxVarC.E(afmVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            aft aftVar = new aft(1.0f, 200.0f, null);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new nox(20);
                bvvVar.ad(objS);
            }
            acp acpVarE = acl.e(aftVar, (afec) objS);
            aft aftVar2 = new aft(1.0f, 200.0f, null);
            Object objS2 = bvvVar.S();
            if (objS2 == obj) {
                objS2 = new nqz(1);
                bvvVar.ad(objS2);
            }
            ca.L(afmVar, null, acpVarE, acl.j(aftVar2, (afec) objS2), null, bxc.i(-2101569897, true, new njt(cfyVar, 5), buxVarC), buxVarC, (i2 & 14) | 200064, 18);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kmg(this, afmVar, cfyVar, i, 9, (char[]) null);
        }
    }
}
