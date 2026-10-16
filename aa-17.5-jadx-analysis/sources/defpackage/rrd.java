package defpackage;

import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class rrd {
    public static boolean a;
    private static final ConcurrentHashMap b = new ConcurrentHashMap();

    public static void a(String str, Throwable th, String str2) {
        d(3, str, th, str2, new Object[0]);
    }

    public static void b(String str, Throwable th, String str2) {
        d(6, str, th, str2, new Object[0]);
    }

    public static void c(String str, Throwable th, String str2) {
        d(4, str, th, str2, new Object[0]);
    }

    public static void d(int i, String str, Throwable th, String str2, Object... objArr) {
        if (a) {
            ConcurrentHashMap concurrentHashMap = b;
            yph yphVar = (yph) concurrentHashMap.get(str);
            if (yphVar == null) {
                yphVar = new yph(yqn.d(str));
                yph yphVar2 = (yph) concurrentHashMap.putIfAbsent(str, yphVar);
                if (yphVar2 != null) {
                    yphVar = yphVar2;
                }
            }
            ((ype) ((ype) yphVar.a(i >= 6 ? Level.SEVERE : i >= 5 ? Level.WARNING : i >= 4 ? Level.INFO : i >= 3 ? Level.CONFIG : Level.FINEST).p(th)).ai(8203)).Y(str2, objArr);
            return;
        }
        if (objArr.length != 0) {
            str2 = String.format(Locale.US, str2, objArr);
        }
        if (i == 2) {
            Log.v(str, str2, th);
            return;
        }
        if (i == 3) {
            Log.d(str, str2, th);
            return;
        }
        if (i == 4) {
            Log.i(str, str2, th);
        } else if (i != 5) {
            Log.e(str, str2, th);
        } else {
            Log.w(str, str2, th);
        }
    }

    public static boolean e(String str, int i) {
        if (a) {
            return true;
        }
        return Log.isLoggable(str, i);
    }

    public static void f(String str, String str2) {
        d(2, str, null, str2, new Object[0]);
    }
}
