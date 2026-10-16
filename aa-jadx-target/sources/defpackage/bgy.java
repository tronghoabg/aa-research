package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bgy {
    public static final defpackage.bgy a = new defpackage.bgy();

    public final void a(android.graphics.drawable.Drawable drawable, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(257732500);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(drawable) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (bveVarC.I((i2 & 3) != 2, i2 & 1)) {
            defpackage.cgc cgcVar = defpackage.cgf.e;
            long j = defpackage.alx.a;
            defpackage.cgf cgfVarI = defpackage.awj.i(cgcVar, 24.0f);
            boolean zE = bveVarC.E(drawable);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (zE || objS == defpackage.bvd.a) {
                objS = new defpackage.bge(drawable, 6);
                bwcVar.ad(objS);
            }
            defpackage.atp.c(defpackage.dai.aj(cgfVarI, (defpackage.affc) objS), bveVarC, 0);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.agg(this, drawable, i, 15, null);
        }
    }
}
