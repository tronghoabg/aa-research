package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lvi {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.MsgAppNotifSuppr");
    private java.lang.String b;

    public static defpackage.lvi a() {
        return (defpackage.lvi) defpackage.mkp.a.i(defpackage.lvi.class);
    }

    public final void b() {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 4283)).u("removeBlockingPackage");
        this.b = null;
    }

    public final void c(java.lang.String str) {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 4284)).y("setBlockingPackage %s", str);
        java.lang.String str2 = this.b;
        defpackage.ysr.bn(str2 == null, "Blocking package is already set to %s", str2);
        this.b = str;
        defpackage.mcj.b().a(str).b(defpackage.ogv.k() ? defpackage.nve.h : null);
    }

    public final boolean d(java.lang.String str) {
        return str.equals(this.b);
    }
}
