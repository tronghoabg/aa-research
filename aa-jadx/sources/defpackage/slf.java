package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class slf {
    public static final defpackage.slf a = new defpackage.slf(true, null, null);
    final boolean b;
    final java.lang.String c;
    final java.lang.Throwable d;

    public slf(boolean z, java.lang.String str, java.lang.Throwable th) {
        this.b = z;
        this.c = str;
        this.d = th;
    }

    public java.lang.String a() {
        return this.c;
    }

    final void b() {
        if (this.b || !android.util.Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        java.lang.Throwable th = this.d;
        if (th != null) {
            android.util.Log.d("GoogleCertificatesRslt", a(), th);
        } else {
            android.util.Log.d("GoogleCertificatesRslt", a());
        }
    }
}
