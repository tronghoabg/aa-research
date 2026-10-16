package defpackage;

/* loaded from: classes2.dex */
public final class nhs extends nhr {
    private final njp f = njp.a.a();

    static {
        njj njjVar = njp.a;
    }

    @Override // defpackage.kmh
    public final void a(bux buxVar, int i) {
        int i2;
        bux buxVarC = buxVar.c(667313762);
        boolean z = true;
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(this) : buxVarC.E(this)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            njp njpVar = this.f;
            qrn qrnVarA = ((nhn) tec.b(this, nhn.class)).a();
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !buxVarC.E(this))) {
                z = false;
            }
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (z || objS == buw.a) {
                objS = new nar(this, 14);
                bvvVar.ad(objS);
            }
            njj njjVar = njp.a;
            nih.j(njpVar, qrnVarA, null, null, null, (afec) objS, buxVarC, 8);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kda(this, i, 15);
        }
    }
}
