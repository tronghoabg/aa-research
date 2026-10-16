package com.google.v;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class gk {

    /* renamed from: a, reason: collision with root package name */
    static final boolean f13004a;

    /* renamed from: b, reason: collision with root package name */
    private static final Unsafe f13005b;

    /* renamed from: c, reason: collision with root package name */
    private static final Class f13006c;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f13007d;

    /* renamed from: e, reason: collision with root package name */
    private static final gj f13008e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f13009f;

    static {
        boolean z;
        gj gjVar;
        Unsafe unsafeG = g();
        f13005b = unsafeG;
        f13006c = Memory.class;
        boolean zS = s(Long.TYPE);
        f13007d = zS;
        boolean zS2 = s(Integer.TYPE);
        gj ghVar = null;
        if (unsafeG != null) {
            if (zS) {
                ghVar = new gi(unsafeG);
            } else if (zS2) {
                ghVar = new gh(unsafeG);
            }
        }
        f13008e = ghVar;
        if (ghVar != null) {
            try {
                Class<?> cls = ghVar.f13003a.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                u();
            } catch (Throwable th) {
                h(th);
            }
        }
        gj gjVar2 = f13008e;
        if (gjVar2 == null) {
            z = false;
        } else {
            try {
                Class<?> cls2 = gjVar2.f13003a.getClass();
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
        f13009f = z;
        x(byte[].class);
        x(boolean[].class);
        w(boolean[].class);
        x(int[].class);
        w(int[].class);
        x(long[].class);
        w(long[].class);
        x(float[].class);
        w(float[].class);
        x(double[].class);
        w(double[].class);
        x(Object[].class);
        w(Object[].class);
        Field fieldU = u();
        if (fieldU != null && (gjVar = f13008e) != null) {
            gjVar.f13003a.objectFieldOffset(fieldU);
        }
        f13004a = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private gk() {
    }

    static double a(Object obj, long j2) {
        return f13008e.a(obj, j2);
    }

    static float b(Object obj, long j2) {
        return f13008e.b(obj, j2);
    }

    static int c(Object obj, long j2) {
        return f13008e.g(obj, j2);
    }

    static long d(Object obj, long j2) {
        return f13008e.h(obj, j2);
    }

    static Object e(Class cls) {
        try {
            return f13005b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    static Object f(Object obj, long j2) {
        return f13008e.f13003a.getObject(obj, j2);
    }

    static Unsafe g() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new gg());
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
            Logger.getLogger(gk.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void h(Throwable th) {
        Logger.getLogger(gk.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static /* synthetic */ void i(Object obj, long j2, boolean z) {
        int i2 = ((~((int) j2)) & 3) << 3;
        long j3 = j2 & (-4);
        n(obj, j3, ((z ? 1 : 0) << i2) | ((~(255 << i2)) & c(obj, j3)));
    }

    static /* synthetic */ void j(Object obj, long j2, boolean z) {
        int i2 = (((int) j2) & 3) << 3;
        long j3 = j2 & (-4);
        n(obj, j3, ((z ? 1 : 0) << i2) | ((~(255 << i2)) & c(obj, j3)));
    }

    static void k(Object obj, long j2, boolean z) {
        f13008e.c(obj, j2, z);
    }

    static void l(Object obj, long j2, double d2) {
        f13008e.d(obj, j2, d2);
    }

    static void m(Object obj, long j2, float f2) {
        f13008e.e(obj, j2, f2);
    }

    static void n(Object obj, long j2, int i2) {
        f13008e.i(obj, j2, i2);
    }

    static void o(Object obj, long j2, long j3) {
        f13008e.j(obj, j2, j3);
    }

    static void p(Object obj, long j2, Object obj2) {
        f13008e.f13003a.putObject(obj, j2, obj2);
    }

    static /* bridge */ /* synthetic */ boolean q(Object obj, long j2) {
        return ((byte) ((c(obj, j2 & (-4)) >>> ((int) (((~j2) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean r(Object obj, long j2) {
        return ((byte) ((c(obj, j2 & (-4)) >>> ((int) ((3 & j2) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean s(Class cls) {
        try {
            Class cls2 = f13006c;
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

    static boolean t(Object obj, long j2) {
        return f13008e.f(obj, j2);
    }

    private static Field u() {
        Field fieldV = v(Buffer.class, "effectiveDirectAddress");
        if (fieldV != null) {
            return fieldV;
        }
        Field fieldV2 = v(Buffer.class, "address");
        if (fieldV2 == null || fieldV2.getType() != Long.TYPE) {
            return null;
        }
        return fieldV2;
    }

    private static Field v(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void w(Class cls) {
        if (f13009f) {
            f13008e.f13003a.arrayIndexScale(cls);
        }
    }

    private static void x(Class cls) {
        if (f13009f) {
            f13008e.f13003a.arrayBaseOffset(cls);
        }
    }
}
