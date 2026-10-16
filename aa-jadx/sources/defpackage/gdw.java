package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gdw {
    public final java.lang.Throwable a;
    public final java.lang.String b;
    public final java.lang.Runnable c;
    public final boolean d;
    public final int e;

    public gdw(defpackage.gdv gdvVar) {
        this.e = gdvVar.e;
        this.a = gdvVar.a;
        this.b = gdvVar.b;
        this.c = gdvVar.c;
        this.d = gdvVar.d;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2;
        int i = this.e;
        if (i == 1) {
            str = "ANR_TIMEOUT";
        } else if (i == 2) {
            str = "ANR_WAITING";
        } else if (i == 3) {
            str = "INCOMPATIBLE_CLIENT_VERSION";
        } else if (i != 4) {
            str = i != 5 ? "null" : "FEATURE_NOT_SUPPORTED";
        } else {
            str = "MISSING_PERMISSION";
        }
        java.lang.Throwable th = this.a;
        if (th != null) {
            str2 = th.getClass().getCanonicalName() + ": " + th.getMessage();
        } else {
            str2 = null;
        }
        return "[type: " + str + ", cause: " + str2 + ", debug msg: " + this.b + "]";
    }
}
