package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class boy {
    public static final /* synthetic */ int a = 0;

    static {
        new defpackage.byu(new defpackage.bli(8));
    }

    public static final void a(defpackage.affg affgVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(442516910);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != bveVarC.E(affgVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (bveVarC.I((i2 & 3) != 2, i2 & 1)) {
            bveVarC.v(1766838549);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.Y(false);
            bveVarC.v(1767392772);
            affgVar.invoke(bveVarC, java.lang.Integer.valueOf(i2 & 14));
            bwcVar.Y(false);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.brb(affgVar, i, i4);
        }
    }
}
