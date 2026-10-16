package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f18261a = Logger.getLogger(s0.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final Unsafe f18262b;

    /* renamed from: c, reason: collision with root package name */
    public static final Class f18263c;

    /* renamed from: d, reason: collision with root package name */
    public static final r0 f18264d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f18265e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f18266f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f18267g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f18268h;

    /* JADX WARN: Removed duplicated region for block: B:63:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x026a  */
    static {
        /*
            Method dump skipped, instructions count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.s0.<clinit>():void");
    }

    public static Object a(Class cls) {
        try {
            return f18262b.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static int b(Class cls) {
        if (f18266f) {
            return f18264d.a(cls);
        }
        return -1;
    }

    public static void c(Class cls) {
        if (f18266f) {
            f18264d.b(cls);
        }
    }

    public static Field d() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC1386c.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean e(Class cls) {
        if (!AbstractC1386c.a()) {
            return false;
        }
        try {
            Class cls2 = f18263c;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte f(long j8, byte[] bArr) {
        return f18264d.d(f18267g + j8, bArr);
    }

    public static byte g(long j8, Object obj) {
        return (byte) ((f18264d.g((-4) & j8, obj) >>> ((int) (((~j8) & 3) << 3))) & 255);
    }

    public static byte h(long j8, Object obj) {
        return (byte) ((f18264d.g((-4) & j8, obj) >>> ((int) ((j8 & 3) << 3))) & 255);
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new o0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j8, byte b5) {
        f18264d.l(bArr, f18267g + j8, b5);
    }

    public static void k(Object obj, long j8, byte b5) {
        long j10 = (-4) & j8;
        int iG = f18264d.g(j10, obj);
        int i5 = ((~((int) j8)) & 3) << 3;
        m(j10, obj, ((255 & b5) << i5) | (iG & (~(255 << i5))));
    }

    public static void l(Object obj, long j8, byte b5) {
        long j10 = (-4) & j8;
        int i5 = (((int) j8) & 3) << 3;
        m(j10, obj, ((255 & b5) << i5) | (f18264d.g(j10, obj) & (~(255 << i5))));
    }

    public static void m(long j8, Object obj, int i5) {
        f18264d.o(j8, obj, i5);
    }

    public static void n(Object obj, long j8, long j10) {
        f18264d.p(obj, j8, j10);
    }

    public static void o(Object obj, long j8, Object obj2) {
        f18264d.q(obj, j8, obj2);
    }
}
