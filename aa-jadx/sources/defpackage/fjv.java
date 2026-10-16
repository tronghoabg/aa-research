package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fjv {
    public static final java.lang.Object a = new java.lang.Object();
    public static volatile defpackage.fjv b;
    public final int c;

    public fjv(int i) {
        this.c = i;
    }

    public static defpackage.fjv a() {
        defpackage.fjv fjvVar;
        synchronized (a) {
            if (b == null) {
                b = new defpackage.fjv(3);
            }
            fjvVar = b;
        }
        return fjvVar;
    }

    public static java.lang.String b(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(23);
        sb.append("WM-");
        if (str.length() >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public final void c(java.lang.String str, java.lang.String str2) {
        if (this.c <= 3) {
            android.util.Log.d(str, str2);
        }
    }

    public final void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (this.c <= 3) {
            android.util.Log.d(str, str2, th);
        }
    }
}
