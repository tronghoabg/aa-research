package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class awb {
    private static final defpackage.cty a = new defpackage.awc(defpackage.ati.a, defpackage.cfs.m);

    public static final defpackage.cty a(defpackage.atb atbVar, defpackage.cfy cfyVar, defpackage.bve bveVar, int i) {
        if (defpackage.afga.f(atbVar, defpackage.ati.a) && defpackage.afga.f(cfyVar, defpackage.cfs.m)) {
            bveVar.v(-1073830487);
            bveVar.o();
            return a;
        }
        bveVar.v(-1073779616);
        boolean z = ((((i & 14) ^ 6) > 4 && bveVar.C(atbVar)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && bveVar.C(cfyVar)) || (i & 48) == 32);
        java.lang.Object objG = bveVar.g();
        if (z || objG == defpackage.bvd.a) {
            objG = new defpackage.awc(atbVar, cfyVar);
            bveVar.x(objG);
        }
        defpackage.awc awcVar = (defpackage.awc) objG;
        bveVar.o();
        return awcVar;
    }

    public static final long b(boolean z, int i, int i2, int i3) {
        return !z ? defpackage.dln.d(i, i2, 0, i3) : defpackage.dln.l(i, i2, 0, i3);
    }
}
