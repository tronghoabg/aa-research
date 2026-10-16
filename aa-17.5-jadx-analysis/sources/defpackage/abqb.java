package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class abqb {
    public static final abqa a;
    static final boolean b;
    private static final Unsafe c;
    private static final Class d;
    private static final boolean e;
    private static final boolean f;

    static {
        boolean z;
        abqa abqaVar;
        Unsafe unsafeG = g();
        c = unsafeG;
        d = Memory.class;
        boolean zM = m(Long.TYPE);
        e = zM;
        boolean zM2 = m(Integer.TYPE);
        abqa abpyVar = null;
        if (unsafeG != null) {
            if (zM) {
                abpyVar = new abpz(unsafeG);
            } else if (zM2) {
                abpyVar = new abpy(unsafeG);
            }
        }
        a = abpyVar;
        if (abpyVar != null) {
            try {
                Class<?> cls = abpyVar.a.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                f();
            } catch (Throwable th) {
                h(th);
            }
        }
        abqa abqaVar2 = a;
        if (abqaVar2 == null) {
            z = false;
        } else {
            try {
                Class<?> cls2 = abqaVar2.a.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("arrayBaseOffset", Class.class);
                cls2.getMethod("arrayIndexScale", Class.class);
                cls2.getMethod("getInt", Object.class, Long.TYPE);
                cls2.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
                cls2.getMethod("getLong", Object.class, Long.TYPE);
                Class<?> cls3 = Long.TYPE;
                cls2.getMethod("putLong", Object.class, cls3, cls3);
                cls2.getMethod("getObject", Object.class, Long.TYPE);
                cls2.getMethod("putObject", Object.class, Long.TYPE, Object.class);
                z = true;
            } catch (Throwable th2) {
                h(th2);
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
        p(Object[].class);
        o(Object[].class);
        Field fieldF = f();
        if (fieldF != null && (abqaVar = a) != null) {
            abqaVar.a.objectFieldOffset(fieldF);
        }
        b = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private abqb() {
    }

    public static byte a(Object obj, long j) {
        return (byte) ((a.g(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    static double b(Object obj, long j) {
        return a.a(obj, j);
    }

    static float c(Object obj, long j) {
        return a.b(obj, j);
    }

    static int d(Object obj, long j) {
        return a.g(obj, j);
    }

    static Object e(Class cls) {
        try {
            return c.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Field f() {
        Field declaredField;
        Field declaredField2;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }

    static Unsafe g() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new abpx());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(abqb.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static void h(Throwable th) {
        Logger.getLogger(abqb.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void i(Object obj, long j, byte b2) {
        int i = ((~((int) j)) & 3) << 3;
        long j2 = j & (-4);
        int i2 = b2 << i;
        l(obj, j2, i2 | ((~(255 << i)) & d(obj, j2)));
    }

    public static void j(Object obj, long j, byte b2) {
        abqa abqaVar = a;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        abqaVar.j(obj, j2, (b2 << i) | ((~(255 << i)) & abqaVar.g(obj, j2)));
    }

    static void k(Object obj, long j, double d2) {
        a.d(obj, j, d2);
    }

    static void l(Object obj, long j, int i) {
        a.j(obj, j, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean m(Class cls) {
        try {
            Class cls2 = d;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            Class cls3 = Integer.TYPE;
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls3, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean n(Object obj, long j) {
        return ((byte) ((d(obj, j & (-4)) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    private static void o(Class cls) {
        if (f) {
            a.a.arrayIndexScale(cls);
        }
    }

    private static void p(Class cls) {
        if (f) {
            a.a.arrayBaseOffset(cls);
        }
    }
}
