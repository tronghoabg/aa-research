package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zsr {
    public static boolean a = false;

    public static void a(int i, java.lang.String str, java.lang.Object... objArr) {
        android.util.Log.println(i, "Google Android Maps SDK", java.lang.String.format(str, objArr));
    }

    public static void b(java.lang.String str) {
        a(6, str, new java.lang.Object[0]);
    }

    public static void c(java.lang.String str, java.lang.Throwable th) {
        a(6, str + "\n" + android.util.Log.getStackTraceString(th), new java.lang.Object[0]);
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        a(5, str.concat(str2), new java.lang.Object[0]);
    }

    public static final boolean e(java.lang.String str, int i) {
        return a ? f(defpackage.zsq.a, str, i) : f(3, str, i);
    }

    static final boolean f(int i, java.lang.String str, int i2) {
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
                return android.util.Log.isLoggable(str, i2);
        }
        return i2 >= i3;
    }
}
