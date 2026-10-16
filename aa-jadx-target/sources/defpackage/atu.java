package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class atu {
    private static final defpackage.cty a = new defpackage.atw(defpackage.ati.c, defpackage.cfs.j);

    public static final defpackage.cty a(defpackage.ath athVar, defpackage.cft cftVar, defpackage.bve bveVar, int i) {
        if (defpackage.afga.f(athVar, defpackage.ati.c) && defpackage.afga.f(cftVar, defpackage.cfs.j)) {
            bveVar.v(-1446604504);
            bveVar.o();
            return a;
        }
        bveVar.v(-1446550657);
        boolean z = ((((i & 14) ^ 6) > 4 && bveVar.C(athVar)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && bveVar.C(cftVar)) || (i & 48) == 32);
        java.lang.Object objG = bveVar.g();
        if (z || objG == defpackage.bvd.a) {
            objG = new defpackage.atw(athVar, cftVar);
            bveVar.x(objG);
        }
        defpackage.atw atwVar = (defpackage.atw) objG;
        bveVar.o();
        return atwVar;
    }
}
