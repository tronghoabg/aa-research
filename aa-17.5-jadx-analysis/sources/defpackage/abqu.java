package defpackage;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class abqu {
    public static final /* synthetic */ int a = 0;
    private static final ThreadLocal b;
    private static final Method c;
    private static final Method d;
    private static final Method e;

    static {
        Logger.getLogger(abqu.class.getName());
        abnp abnpVarN = abpt.a.n();
        abnpVarN.t();
        ((abpt) abnpVarN.b).b = -62135596800L;
        abnpVarN.t();
        ((abpt) abnpVarN.b).c = 0;
        abnp abnpVarN2 = abpt.a.n();
        abnpVarN2.t();
        ((abpt) abnpVarN2.b).b = 253402300799L;
        abnpVarN2.t();
        ((abpt) abnpVarN2.b).c = 999999999;
        abnp abnpVarN3 = abpt.a.n();
        abnpVarN3.t();
        ((abpt) abnpVarN3.b).b = 0L;
        abnpVarN3.t();
        ((abpt) abnpVarN3.b).c = 0;
        b = new abqt();
        c = h("now");
        d = h("getEpochSecond");
        e = h("getNano");
    }

    private abqu() {
    }

    public static long a(abpt abptVar) {
        g(abptVar);
        return a.A(wox.aj(abptVar.b), abptVar.c / 1000000);
    }

    public static abpt b(long j) {
        return c(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public static abpt c(long j, int i) {
        if (!i(j)) {
            throw new IllegalArgumentException(a.bI(j, "Timestamp is not valid. Input seconds is too large. Seconds (", ") must be in range [-62,135,596,800, +253,402,300,799]. "));
        }
        if (i <= -1000000000 || i >= 1000000000) {
            j = a.A(j, i / 1000000000);
            i %= 1000000000;
        }
        if (i < 0) {
            i += 1000000000;
            j = wox.af(j, 1L);
        }
        abnp abnpVarN = abpt.a.n();
        abnpVarN.t();
        ((abpt) abnpVarN.b).b = j;
        abnpVarN.t();
        ((abpt) abnpVarN.b).c = i;
        abpt abptVar = (abpt) abnpVarN.q();
        g(abptVar);
        return abptVar;
    }

    public static abpt d() {
        Method method = c;
        if (method == null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            return c(jCurrentTimeMillis / 1000, (int) ((jCurrentTimeMillis % 1000) * 1000000));
        }
        try {
            Object objInvoke = method.invoke(null, null);
            return c(((Long) d.invoke(objInvoke, null)).longValue(), ((Integer) e.invoke(objInvoke, null)).intValue());
        } catch (Throwable th) {
            throw new AssertionError(th);
        }
    }

    static String e(int i) {
        return i % 1000000 == 0 ? String.format(Locale.ENGLISH, "%1$03d", Integer.valueOf(i / 1000000)) : i % 1000 == 0 ? String.format(Locale.ENGLISH, "%1$06d", Integer.valueOf(i / 1000)) : String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(i));
    }

    public static String f(abpt abptVar) {
        g(abptVar);
        long j = abptVar.b;
        int i = abptVar.c;
        StringBuilder sb = new StringBuilder();
        sb.append(((SimpleDateFormat) b.get()).format(new Date(j * 1000)));
        if (i != 0) {
            sb.append(".");
            sb.append(e(i));
        }
        sb.append("Z");
        return sb.toString();
    }

    public static void g(abpt abptVar) {
        long j = abptVar.b;
        boolean zI = i(j);
        int i = abptVar.c;
        if (!zI || i < 0 || i >= 1000000000) {
            throw new IllegalArgumentException("Timestamp is not valid. See proto definition for valid values. Seconds (" + j + ") must be in range [-62,135,596,800, +253,402,300,799]. Nanos (" + i + ") must be in range [0, +999,999,999].");
        }
    }

    private static Method h(String str) {
        try {
            return Class.forName("java.time.Instant").getMethod(str, null);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean i(long j) {
        return j >= -62135596800L && j <= 253402300799L;
    }
}
