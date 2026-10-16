package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nhe extends defpackage.nik {
    private final defpackage.nkj f = defpackage.nkj.a.a();

    static {
        defpackage.nke nkeVar = defpackage.nkj.a;
    }

    @Override // defpackage.kmn
    public final void a(defpackage.bve bveVar, int i) {
        int i2;
        defpackage.bve bveVarC = bveVar.c(1582290914);
        boolean z = true;
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(this) : bveVarC.E(this)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (bveVarC.I((i2 & 3) != 2, i2 & 1)) {
            defpackage.nkj nkjVar = this.f;
            java.lang.Object objA = defpackage.tez.a(this, defpackage.nig.class);
            objA.getClass();
            defpackage.qsh qshVarA = ((defpackage.nig) objA).a();
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !bveVarC.E(this))) {
                z = false;
            }
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (z || objS == defpackage.bvd.a) {
                objS = new defpackage.lto(this, 11);
                bwcVar.ad(objS);
            }
            defpackage.nke nkeVar = defpackage.nkj.a;
            defpackage.nif.k(nkjVar, qshVarA, null, null, null, null, (defpackage.affc) objS, bveVarC, 8);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new jty(this, i, 15);
        }
    }
}
