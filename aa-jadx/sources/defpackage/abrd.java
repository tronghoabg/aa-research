package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class abrd {
    public static final defpackage.abrc a;
    static final boolean b;
    private static final sun.misc.Unsafe c;
    private static final java.lang.Class d;
    private static final boolean e;
    private static final boolean f;

    static {
        boolean z;
        defpackage.abrc abrcVar;
        sun.misc.Unsafe unsafeG = g();
        c = unsafeG;
        d = libcore.io.Memory.class;
        boolean zM = m(java.lang.Long.TYPE);
        e = zM;
        boolean zM2 = m(java.lang.Integer.TYPE);
        defpackage.abrc abraVar = null;
        if (unsafeG != null) {
            if (zM) {
                abraVar = new defpackage.abrb(unsafeG);
            } else if (zM2) {
                abraVar = new defpackage.abra(unsafeG);
            }
        }
        a = abraVar;
        if (abraVar != null) {
            try {
                java.lang.Class<?> cls = abraVar.a.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("getLong", java.lang.Object.class, java.lang.Long.TYPE);
                f();
            } catch (java.lang.Throwable th) {
                h(th);
            }
        }
        defpackage.abrc abrcVar2 = a;
        if (abrcVar2 == null) {
            z = false;
        } else {
            try {
                java.lang.Class<?> cls2 = abrcVar2.a.getClass();
                cls2.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls2.getMethod("arrayBaseOffset", java.lang.Class.class);
                cls2.getMethod("arrayIndexScale", java.lang.Class.class);
                cls2.getMethod("getInt", java.lang.Object.class, java.lang.Long.TYPE);
                cls2.getMethod("putInt", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                cls2.getMethod("getLong", java.lang.Object.class, java.lang.Long.TYPE);
                java.lang.Class<?> cls3 = java.lang.Long.TYPE;
                cls2.getMethod("putLong", java.lang.Object.class, cls3, cls3);
                cls2.getMethod("getObject", java.lang.Object.class, java.lang.Long.TYPE);
                cls2.getMethod("putObject", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Object.class);
                z = true;
            } catch (java.lang.Throwable th2) {
                h(th2);
                z = false;
            }
        }
        f = z;
        p(byte[].class);
        p(boolean[].class);
        o(boolean[].class);
        p(int[].class);
        o(int[].class);
        p(long[].class);
        o(long[].class);
        p(float[].class);
        o(float[].class);
        p(double[].class);
        o(double[].class);
        p(java.lang.Object[].class);
        o(java.lang.Object[].class);
        java.lang.reflect.Field fieldF = f();
        if (fieldF != null && (abrcVar = a) != null) {
            abrcVar.a.objectFieldOffset(fieldF);
        }
        b = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
    }

    private abrd() {
    }

    public static byte a(java.lang.Object obj, long j) {
        return (byte) ((a.g(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    static double b(java.lang.Object obj, long j) {
        return a.a(obj, j);
    }

    static float c(java.lang.Object obj, long j) {
        return a.b(obj, j);
    }

    static int d(java.lang.Object obj, long j) {
        return a.g(obj, j);
    }

    static java.lang.Object e(java.lang.Class cls) {
        try {
            return c.allocateInstance(cls);
        } catch (java.lang.InstantiationException e2) {
            throw new java.lang.IllegalStateException(e2);
        }
    }

    public static java.lang.reflect.Field f() {
        java.lang.reflect.Field declaredField;
        java.lang.reflect.Field declaredField2;
        try {
            declaredField = java.nio.Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (java.lang.Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = java.nio.Buffer.class.getDeclaredField("address");
        } catch (java.lang.Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != java.lang.Long.TYPE) {
            return null;
        }
        return declaredField2;
    }

    static sun.misc.Unsafe g() {
        sun.misc.Unsafe unsafe;
        try {
            unsafe = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new defpackage.abqz());
        } catch (java.lang.Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (java.lang.Exception unused2) {
            java.util.logging.Logger.getLogger(defpackage.abrd.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static void h(java.lang.Throwable th) {
        java.util.logging.Logger.getLogger(defpackage.abrd.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void i(java.lang.Object obj, long j, byte b2) {
        int i = ((~((int) j)) & 3) << 3;
        long j2 = j & (-4);
        int i2 = b2 << i;
        l(obj, j2, i2 | ((~(255 << i)) & d(obj, j2)));
    }

    public static void j(java.lang.Object obj, long j, byte b2) {
        defpackage.abrc abrcVar = a;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        abrcVar.j(obj, j2, (b2 << i) | ((~(255 << i)) & abrcVar.g(obj, j2)));
    }

    static void k(java.lang.Object obj, long j, double d2) {
        a.d(obj, j, d2);
    }

    static void l(java.lang.Object obj, long j, int i) {
        a.j(obj, j, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean m(java.lang.Class cls) {
        try {
            java.lang.Class cls2 = d;
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

    public static boolean n(java.lang.Object obj, long j) {
        return ((byte) ((d(obj, j & (-4)) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    private static void o(java.lang.Class cls) {
        if (f) {
            a.a.arrayIndexScale(cls);
        }
    }

    private static void p(java.lang.Class cls) {
        if (f) {
            a.a.arrayBaseOffset(cls);
        }
    }
}
