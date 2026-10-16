package J3;

import android.util.Log;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f5582b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static volatile r f5583c;

    /* renamed from: a, reason: collision with root package name */
    public final int f5584a;

    public r(int i5) {
        this.f5584a = i5;
    }

    public static r d() {
        r rVar;
        synchronized (f5582b) {
            try {
                if (f5583c == null) {
                    f5583c = new r(3);
                }
                rVar = f5583c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public final void a(String str, String str2) {
        if (this.f5584a <= 3) {
            Log.d(str, str2);
        }
    }

    public final void b(String str, String str2) {
        if (this.f5584a <= 6) {
            Log.e(str, str2);
        }
    }

    public final void c(String str, String str2, Throwable th) {
        if (this.f5584a <= 6) {
            Log.e(str, str2, th);
        }
    }

    public final void e(String str, String str2) {
        if (this.f5584a <= 4) {
            Log.i(str, str2);
        }
    }

    public final void g(String str, String str2) {
        if (this.f5584a <= 5) {
            Log.w(str, str2);
        }
    }
}
