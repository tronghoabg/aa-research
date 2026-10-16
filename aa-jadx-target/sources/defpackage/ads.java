package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ads {
    public static final float a = android.view.ViewConfiguration.getScrollFriction();

    public static final defpackage.kwv a(defpackage.bve bveVar) {
        defpackage.dlo dloVar = (defpackage.dlo) bveVar.f(defpackage.dbl.d);
        boolean z = bveVar.z(dloVar.a());
        java.lang.Object objG = bveVar.g();
        if (z || objG == defpackage.bvd.a) {
            objG = new defpackage.kwv(new defpackage.adr(dloVar), (char[]) null);
            bveVar.x(objG);
        }
        return (defpackage.kwv) objG;
    }
}
