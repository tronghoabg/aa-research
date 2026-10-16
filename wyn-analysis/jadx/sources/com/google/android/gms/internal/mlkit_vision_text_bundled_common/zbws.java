package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
final class zbws {
    static final long zba;
    static final boolean zbb;
    private static final Unsafe zbc;
    private static final Class zbd;
    private static final boolean zbe;
    private static final zbwr zbf;
    private static final boolean zbg;
    private static final boolean zbh;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    static {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.<clinit>():void");
    }

    private zbws() {
    }

    private static int zbA(Class cls) {
        if (zbh) {
            return zbf.zba.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zbB() {
        int i5 = zbsm.zba;
        Field fieldZbC = zbC(Buffer.class, "effectiveDirectAddress");
        if (fieldZbC != null) {
            return fieldZbC;
        }
        Field fieldZbC2 = zbC(Buffer.class, "address");
        if (fieldZbC2 == null || fieldZbC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZbC2;
    }

    private static Field zbC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zbD(Object obj, long j8, byte b5) {
        zbwr zbwrVar = zbf;
        long j10 = (-4) & j8;
        int i5 = zbwrVar.zba.getInt(obj, j10);
        int i10 = ((~((int) j8)) & 3) << 3;
        zbwrVar.zba.putInt(obj, j10, ((255 & b5) << i10) | (i5 & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zbE(Object obj, long j8, byte b5) {
        zbwr zbwrVar = zbf;
        long j10 = (-4) & j8;
        int i5 = (((int) j8) & 3) << 3;
        zbwrVar.zba.putInt(obj, j10, ((255 & b5) << i5) | (zbwrVar.zba.getInt(obj, j10) & (~(255 << i5))));
    }

    public static double zba(Object obj, long j8) {
        return zbf.zba(obj, j8);
    }

    public static float zbb(Object obj, long j8) {
        return zbf.zbb(obj, j8);
    }

    public static int zbc(Object obj, long j8) {
        return zbf.zba.getInt(obj, j8);
    }

    public static long zbd(Object obj, long j8) {
        return zbf.zba.getLong(obj, j8);
    }

    public static Object zbe(Class cls) {
        try {
            return zbc.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static Object zbf(Object obj, long j8) {
        return zbf.zba.getObject(obj, j8);
    }

    public static Unsafe zbg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zbwo());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void zbh(Throwable th) {
        Logger.getLogger(zbws.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void zbm(Object obj, long j8, boolean z2) {
        zbf.zbc(obj, j8, z2);
    }

    public static void zbn(byte[] bArr, long j8, byte b5) {
        zbf.zbd(bArr, zba + j8, b5);
    }

    public static void zbo(Object obj, long j8, double d3) {
        zbf.zbe(obj, j8, d3);
    }

    public static void zbp(Object obj, long j8, float f10) {
        zbf.zbf(obj, j8, f10);
    }

    public static void zbq(Object obj, long j8, int i5) {
        zbf.zba.putInt(obj, j8, i5);
    }

    public static void zbr(Object obj, long j8, long j10) {
        zbf.zba.putLong(obj, j8, j10);
    }

    public static void zbs(Object obj, long j8, Object obj2) {
        zbf.zba.putObject(obj, j8, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean zbt(Object obj, long j8) {
        return ((byte) ((zbf.zba.getInt(obj, (-4) & j8) >>> ((int) (((~j8) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean zbu(Object obj, long j8) {
        return ((byte) ((zbf.zba.getInt(obj, (-4) & j8) >>> ((int) ((j8 & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean zbv(Class cls) {
        int i5 = zbsm.zba;
        try {
            Class cls2 = zbd;
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

    public static boolean zbw(Object obj, long j8) {
        return zbf.zbg(obj, j8);
    }

    public static boolean zbx() {
        return zbh;
    }

    public static boolean zby() {
        return zbg;
    }

    private static int zbz(Class cls) {
        if (zbh) {
            return zbf.zba.arrayBaseOffset(cls);
        }
        return -1;
    }
}
