package com.google.protobuf;

import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public abstract class d2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f27662a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f27663b;

    /* renamed from: c, reason: collision with root package name */
    public static final c2 f27664c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f27665d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f27666e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f27667f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f27668g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f27669h;

    /* JADX WARN: Removed duplicated region for block: B:4:0x001d  */
    static {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.d2.<clinit>():void");
    }

    public static void a(Throwable th) {
        Logger.getLogger(d2.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static long b(ByteBuffer byteBuffer) {
        return f27664c.j(f27668g, byteBuffer);
    }

    public static Object c(Class cls) {
        try {
            return f27662a.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static int d(Class cls) {
        if (f27666e) {
            return f27664c.a(cls);
        }
        return -1;
    }

    public static void e(Class cls) {
        if (f27666e) {
            f27664c.b(cls);
        }
    }

    public static void f(long j8, byte[] bArr, long j10, long j11) {
        f27664c.c(j8, bArr, j10, j11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean g(Class cls) {
        Class cls2 = AbstractC1785c.f27652a;
        try {
            Class cls3 = f27663b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", cls, cls4);
            cls3.getMethod("pokeLong", cls, Long.TYPE, cls4);
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", cls, cls5, cls4);
            cls3.getMethod("peekInt", cls, cls4);
            cls3.getMethod("pokeByte", cls, Byte.TYPE);
            cls3.getMethod("peekByte", cls);
            cls3.getMethod("pokeByteArray", cls, byte[].class, cls5, cls5);
            cls3.getMethod("peekByteArray", cls, byte[].class, cls5, cls5);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte h(long j8, Object obj) {
        return (byte) ((f27664c.i((-4) & j8, obj) >>> ((int) (((~j8) & 3) << 3))) & 255);
    }

    public static byte i(long j8, Object obj) {
        return (byte) ((f27664c.i((-4) & j8, obj) >>> ((int) ((j8 & 3) << 3))) & 255);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a2());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(byte b5, long j8) {
        f27664c.n(b5, j8);
    }

    public static void l(byte[] bArr, long j8, byte b5) {
        f27664c.o(bArr, f27667f + j8, b5);
    }

    public static void m(Object obj, long j8, byte b5) {
        long j10 = (-4) & j8;
        int i5 = f27664c.i(j10, obj);
        int i10 = ((~((int) j8)) & 3) << 3;
        o(j10, obj, ((255 & b5) << i10) | (i5 & (~(255 << i10))));
    }

    public static void n(Object obj, long j8, byte b5) {
        long j10 = (-4) & j8;
        int i5 = (((int) j8) & 3) << 3;
        o(j10, obj, ((255 & b5) << i5) | (f27664c.i(j10, obj) & (~(255 << i5))));
    }

    public static void o(long j8, Object obj, int i5) {
        f27664c.r(j8, obj, i5);
    }

    public static void p(Object obj, long j8, long j10) {
        f27664c.s(obj, j8, j10);
    }

    public static void q(Object obj, long j8, Object obj2) {
        f27664c.t(obj, j8, obj2);
    }
}
