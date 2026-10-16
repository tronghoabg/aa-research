package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class abrx {
    public static final /* synthetic */ int a = 0;
    private static final java.lang.ThreadLocal b;
    private static final java.lang.reflect.Method c;
    private static final java.lang.reflect.Method d;
    private static final java.lang.reflect.Method e;

    static {
        java.util.logging.Logger.getLogger(defpackage.abrx.class.getName());
        defpackage.abor aborVarN = defpackage.abqv.a.n();
        aborVarN.t();
        ((defpackage.abqv) aborVarN.b).b = -62135596800L;
        aborVarN.t();
        ((defpackage.abqv) aborVarN.b).c = 0;
        defpackage.abor aborVarN2 = defpackage.abqv.a.n();
        aborVarN2.t();
        ((defpackage.abqv) aborVarN2.b).b = 253402300799L;
        aborVarN2.t();
        ((defpackage.abqv) aborVarN2.b).c = 999999999;
        defpackage.abor aborVarN3 = defpackage.abqv.a.n();
        aborVarN3.t();
        ((defpackage.abqv) aborVarN3.b).b = 0L;
        aborVarN3.t();
        ((defpackage.abqv) aborVarN3.b).c = 0;
        b = new defpackage.abrw();
        c = h("now");
        d = h("getEpochSecond");
        e = h("getNano");
    }

    private abrx() {
    }

    public static long a(defpackage.abqv abqvVar) {
        g(abqvVar);
        return defpackage.a.z(defpackage.acmh.A(abqvVar.b), abqvVar.c / 1000000);
    }

    public static defpackage.abqv b(long j) {
        return c(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public static defpackage.abqv c(long j, int i) {
        if (!i(j)) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bH(j, "Timestamp is not valid. Input seconds is too large. Seconds (", ") must be in range [-62,135,596,800, +253,402,300,799]. "));
        }
        if (i <= -1000000000 || i >= 1000000000) {
            j = defpackage.a.z(j, i / 1000000000);
            i %= 1000000000;
        }
        if (i < 0) {
            i += 1000000000;
            j = defpackage.acmh.w(j, 1L);
        }
        defpackage.abor aborVarN = defpackage.abqv.a.n();
        aborVarN.t();
        ((defpackage.abqv) aborVarN.b).b = j;
        aborVarN.t();
        ((defpackage.abqv) aborVarN.b).c = i;
        defpackage.abqv abqvVar = (defpackage.abqv) aborVarN.q();
        g(abqvVar);
        return abqvVar;
    }

    public static defpackage.abqv d() {
        java.lang.reflect.Method method = c;
        if (method == null) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            return c(jCurrentTimeMillis / 1000, (int) ((jCurrentTimeMillis % 1000) * 1000000));
        }
        try {
            java.lang.Object objInvoke = method.invoke(null, null);
            return c(((java.lang.Long) d.invoke(objInvoke, null)).longValue(), ((java.lang.Integer) e.invoke(objInvoke, null)).intValue());
        } catch (java.lang.Throwable th) {
            throw new java.lang.AssertionError(th);
        }
    }

    static java.lang.String e(int i) {
        if (i % 1000000 == 0) {
            return java.lang.String.format(java.util.Locale.ENGLISH, "%1$03d", java.lang.Integer.valueOf(i / 1000000));
        }
        return i % 1000 == 0 ? java.lang.String.format(java.util.Locale.ENGLISH, "%1$06d", java.lang.Integer.valueOf(i / 1000)) : java.lang.String.format(java.util.Locale.ENGLISH, "%1$09d", java.lang.Integer.valueOf(i));
    }

    public static java.lang.String f(defpackage.abqv abqvVar) {
        g(abqvVar);
        long j = abqvVar.b;
        int i = abqvVar.c;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(((java.text.SimpleDateFormat) b.get()).format(new java.util.Date(j * 1000)));
        if (i != 0) {
            sb.append(".");
            sb.append(e(i));
        }
        sb.append("Z");
        return sb.toString();
    }

    public static void g(defpackage.abqv abqvVar) {
        long j = abqvVar.b;
        boolean zI = i(j);
        int i = abqvVar.c;
        if (!zI || i < 0 || i >= 1000000000) {
            throw new java.lang.IllegalArgumentException("Timestamp is not valid. See proto definition for valid values. Seconds (" + j + ") must be in range [-62,135,596,800, +253,402,300,799]. Nanos (" + i + ") must be in range [0, +999,999,999].");
        }
    }

    private static java.lang.reflect.Method h(java.lang.String str) {
        try {
            return java.lang.Class.forName("java.time.Instant").getMethod(str, null);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private static boolean i(long j) {
        return j >= -62135596800L && j <= 253402300799L;
    }
}
