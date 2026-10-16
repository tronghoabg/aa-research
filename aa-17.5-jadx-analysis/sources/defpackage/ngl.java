package defpackage;

/* loaded from: classes.dex */
public final class ngl extends nhr {
    private final njp f = njp.a.a();

    static {
        njj njjVar = njp.a;
    }

    @Override // defpackage.kmh
    public final void a(bux buxVar, int i) {
        int i2;
        bux buxVarC = buxVar.c(1582290914);
        boolean z = true;
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(this) : buxVarC.E(this)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            njp njpVar = this.f;
            Object objA = tec.a(this, nhn.class);
            objA.getClass();
            qrn qrnVarA = ((nhn) objA).a();
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !buxVarC.E(this))) {
                z = false;
            }
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (z || objS == buw.a) {
                objS = new ltd(this, 12);
                bvvVar.ad(objS);
            }
            njj njjVar = njp.a;
            nhm.j(njpVar, qrnVarA, null, null, null, null, (afec) objS, buxVarC, 8);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kda(this, i, 14);
        }
    }
}
