package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lhe {
    public final java.lang.Object a;

    public lhe(defpackage.gkc gkcVar) {
        this.a = new defpackage.sxc();
        ((defpackage.sxc) gkcVar.a).n(new swj(new defpackage.xei(this)));
    }

    public static defpackage.lhe b() {
        return (defpackage.lhe) defpackage.mkp.a.i(defpackage.lhe.class);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final defpackage.eqp a(defpackage.mqg mqgVar) {
        ?? r3 = this.a;
        if (!r3.containsKey(mqgVar)) {
            r3.put(mqgVar, defpackage.ebo.g(defpackage.tcu.t(defpackage.kja.a()), new defpackage.dbj(mqgVar, 17)));
        }
        return (defpackage.eqp) r3.get(mqgVar);
    }

    public final void c(java.lang.Exception exc) {
        ((defpackage.sxc) this.a).o(exc);
    }

    public final void d(java.lang.Object obj) {
        ((defpackage.sxc) this.a).p(obj);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final void e(java.lang.Exception exc) {
        if (exc == null) {
            throw new java.lang.NullPointerException("Exception must not be null");
        }
        java.lang.Object obj = this.a;
        defpackage.sxc sxcVar = (defpackage.sxc) obj;
        synchronized (sxcVar.a) {
            if (((defpackage.sxc) obj).b) {
                return;
            }
            ((defpackage.sxc) obj).b = true;
            ((defpackage.sxc) obj).d = exc;
            sxcVar.e.h((defpackage.swx) obj);
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final void f(java.lang.Object obj) {
        ((defpackage.sxc) this.a).q(obj);
    }

    public final int g(java.lang.String str) {
        return ((android.content.Context) this.a).checkCallingOrSelfPermission(str);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final android.content.pm.ApplicationInfo h(java.lang.String str, int i) throws android.content.pm.PackageManager.NameNotFoundException {
        return ((android.content.Context) this.a).getPackageManager().getApplicationInfo(str, i);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final android.content.pm.PackageInfo i(java.lang.String str, int i) throws android.content.pm.PackageManager.NameNotFoundException {
        return ((android.content.Context) this.a).getPackageManager().getPackageInfo(str, i);
    }

    public lhe(byte[] bArr) {
        this.a = new defpackage.bzc(new defpackage.odw[16]);
    }

    public lhe(char[] cArr) {
        this.a = new defpackage.sxc();
    }

    public lhe() {
        this.a = new java.util.EnumMap(defpackage.mqg.class);
    }

    public lhe(android.content.Context context) {
        this.a = context;
    }
}
