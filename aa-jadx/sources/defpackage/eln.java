package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eln {
    public static final boolean a;
    public static final boolean b;
    static final long c;
    static final boolean d;
    private static final sun.misc.Unsafe e;
    private static final java.lang.Class f;
    private static final boolean g;
    private static final defpackage.elm h;

    static {
        sun.misc.Unsafe unsafeH = h();
        e = unsafeH;
        f = defpackage.eio.a;
        boolean zS = s(java.lang.Long.TYPE);
        g = zS;
        boolean zS2 = s(java.lang.Integer.TYPE);
        defpackage.elm ellVar = null;
        if (unsafeH != null) {
            if (!defpackage.eio.a()) {
                ellVar = new defpackage.ell(unsafeH);
            } else if (zS) {
                ellVar = new defpackage.elk(unsafeH);
            } else if (zS2) {
                ellVar = new defpackage.elj(unsafeH);
            }
        }
        h = ellVar;
        a = ellVar == null ? false : ellVar.h();
        b = ellVar == null ? false : ellVar.i();
        c = w(byte[].class);
        w(boolean[].class);
        y(boolean[].class);
        w(int[].class);
        y(int[].class);
        w(long[].class);
        y(long[].class);
        w(float[].class);
        y(float[].class);
        w(double[].class);
        y(double[].class);
        w(java.lang.Object[].class);
        y(java.lang.Object[].class);
        java.lang.reflect.Field fieldG = g();
        if (fieldG != null && ellVar != null) {
            ellVar.a.objectFieldOffset(fieldG);
        }
        d = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
    }

    private eln() {
    }

    static double a(java.lang.Object obj, long j) {
        return h.a(obj, j);
    }

    static float b(java.lang.Object obj, long j) {
        return h.b(obj, j);
    }

    static int c(java.lang.Object obj, long j) {
        return h.j(obj, j);
    }

    static long d(java.lang.Object obj, long j) {
        return h.k(obj, j);
    }

    static java.lang.Object e(java.lang.Class cls) {
        try {
            return e.allocateInstance(cls);
        } catch (java.lang.InstantiationException e2) {
            throw new java.lang.IllegalStateException(e2);
        }
    }

    public static java.lang.Object f(java.lang.Object obj, long j) {
        return h.a.getObject(obj, j);
    }

    public static java.lang.reflect.Field g() {
        java.lang.reflect.Field fieldX;
        if (defpackage.eio.a() && (fieldX = x(java.nio.Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldX;
        }
        java.lang.reflect.Field fieldX2 = x(java.nio.Buffer.class, "address");
        if (fieldX2 == null || fieldX2.getType() != java.lang.Long.TYPE) {
            return null;
        }
        return fieldX2;
    }

    static sun.misc.Unsafe h() {
        try {
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new defpackage.eli());
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static void i(java.lang.Throwable th) {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(defpackage.eln.class.getName());
        java.util.logging.Level level = java.util.logging.Level.WARNING;
        java.util.Objects.toString(th);
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void j(java.lang.Object obj, long j, boolean z) {
        h.c(obj, j, z);
    }

    static void k(byte[] bArr, long j, byte b2) {
        h.d(bArr, c + j, b2);
    }

    public static void l(java.lang.Object obj, long j, byte b2) {
        int i = ((~((int) j)) & 3) << 3;
        long j2 = j & (-4);
        int i2 = (b2 & 255) << i;
        p(obj, j2, i2 | ((~(255 << i)) & c(obj, j2)));
    }

    public static void m(java.lang.Object obj, long j, byte b2) {
        int i = (((int) j) & 3) << 3;
        long j2 = j & (-4);
        int i2 = (b2 & 255) << i;
        p(obj, j2, i2 | ((~(255 << i)) & c(obj, j2)));
    }

    static void n(java.lang.Object obj, long j, double d2) {
        h.e(obj, j, d2);
    }

    static void o(java.lang.Object obj, long j, float f2) {
        h.f(obj, j, f2);
    }

    static void p(java.lang.Object obj, long j, int i) {
        h.l(obj, j, i);
    }

    static void q(java.lang.Object obj, long j, long j2) {
        h.m(obj, j, j2);
    }

    public static void r(java.lang.Object obj, long j, java.lang.Object obj2) {
        h.a.putObject(obj, j, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean s(java.lang.Class cls) {
        if (!defpackage.eio.a()) {
            return false;
        }
        try {
            java.lang.Class cls2 = f;
            cls2.getMethod("peekLong", cls, java.lang.Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, java.lang.Long.TYPE, java.lang.Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, java.lang.Integer.TYPE, java.lang.Boolean.TYPE);
            cls2.getMethod("peekInt", cls, java.lang.Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, java.lang.Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            java.lang.Class cls3 = java.lang.Integer.TYPE;
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls3, cls3);
            java.lang.Class cls4 = java.lang.Integer.TYPE;
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    static boolean t(java.lang.Object obj, long j) {
        return h.g(obj, j);
    }

    public static boolean u(java.lang.Object obj, long j) {
        return ((byte) ((c(obj, j & (-4)) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static boolean v(java.lang.Object obj, long j) {
        return ((byte) ((c(obj, j & (-4)) >>> ((int) ((3 & j) << 3))) & 255)) != 0;
    }

    private static int w(java.lang.Class cls) {
        if (b) {
            return h.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static java.lang.reflect.Field x(java.lang.Class cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static void y(java.lang.Class cls) {
        if (b) {
            h.a.arrayIndexScale(cls);
        }
    }
}
