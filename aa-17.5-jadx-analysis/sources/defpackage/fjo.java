package defpackage;

import android.util.Log;

/* loaded from: classes2.dex */
public final class fjo {
    public static final Object a = new Object();
    public static volatile fjo b;
    public final int c;

    public fjo(int i) {
        this.c = i;
    }

    public static fjo a() {
        fjo fjoVar;
        synchronized (a) {
            if (b == null) {
                b = new fjo(3);
            }
            fjoVar = b;
        }
        return fjoVar;
    }

    public static String b(String str) {
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (str.length() >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public final void c(String str, String str2) {
        if (this.c <= 3) {
            Log.d(str, str2);
        }
    }

    public final void d(String str, String str2, Throwable th) {
        if (this.c <= 3) {
            Log.d(str, str2, th);
        }
    }
}
