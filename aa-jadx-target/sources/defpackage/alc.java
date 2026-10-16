package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class alc {
    public static final defpackage.bvm a = new defpackage.bvo(new defpackage.ajg(4));

    public static final defpackage.aiz a(defpackage.bve bveVar) {
        bveVar.v(282942128);
        defpackage.aja ajaVar = (defpackage.aja) bveVar.f(a);
        if (ajaVar == null) {
            ((defpackage.bwc) bveVar).Y(false);
            return null;
        }
        boolean zC = bveVar.C(ajaVar);
        defpackage.bwc bwcVar = (defpackage.bwc) bveVar;
        java.lang.Object objS = bwcVar.S();
        if (zC || objS == defpackage.bvd.a) {
            objS = ajaVar.a();
            bwcVar.ad(objS);
        }
        defpackage.aiz aizVar = (defpackage.aiz) objS;
        bwcVar.Y(false);
        return aizVar;
    }
}
