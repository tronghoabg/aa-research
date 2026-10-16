package defpackage;

import android.util.Log;

/* loaded from: classes3.dex */
public final class zrn {
    public static boolean a = false;

    public static void a(int i, String str, Object... objArr) {
        Log.println(i, "Google Android Maps SDK", String.format(str, objArr));
    }

    public static void b(String str) {
        a(6, str, new Object[0]);
    }

    public static void c(String str, Throwable th) {
        a(6, str + "\n" + Log.getStackTraceString(th), new Object[0]);
    }

    public static void d(String str, String str2) {
        a(5, str.concat(str2), new Object[0]);
    }

    public static final boolean e(String str, int i) {
        return a ? f(zrm.a, str, i) : f(3, str, i);
    }

    static final boolean f(int i, String str, int i2) {
        int i3;
        switch (i) {
            case 0:
                return false;
            case 1:
            case 2:
                return true;
            case 3:
                i3 = 3;
                break;
            case 4:
                i3 = 4;
                break;
            case 5:
                i3 = 5;
                break;
            case 6:
                i3 = 6;
                break;
            default:
                return Log.isLoggable(str, i2);
        }
        return i2 >= i3;
    }
}
