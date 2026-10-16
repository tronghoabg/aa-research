package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class zzihk {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzihj zzf;
    private static final boolean zzg;
    private static final long zzh;

    static {
        boolean z2;
        zzihj zzihjVar;
        Unsafe unsafeZzr = zzr();
        zzc = unsafeZzr;
        int i5 = zzicy.zza;
        zzd = Memory.class;
        Class<?> cls = Long.TYPE;
        boolean zZzs = zzs(cls);
        zze = zZzs;
        Class<?> cls2 = Integer.TYPE;
        boolean zZzs2 = zzs(cls2);
        zzihj zzihhVar = null;
        if (unsafeZzr != null) {
            if (zZzs) {
                zzihhVar = new zzihi(unsafeZzr);
            } else if (zZzs2) {
                zzihhVar = new zzihh(unsafeZzr);
            }
        }
        zzf = zzihhVar;
        if (zzihhVar != null) {
            try {
                Class<?> cls3 = zzihhVar.zza.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                zzC();
            } catch (Throwable th) {
                zzz(th);
            }
        }
        zzihj zzihjVar2 = zzf;
        if (zzihjVar2 == null) {
            z2 = false;
        } else {
            try {
                Class<?> cls4 = zzihjVar2.zza.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z2 = true;
            } catch (Throwable th2) {
                zzz(th2);
            }
        }
        zzg = z2;
        zza = zzA(byte[].class);
        zzA(boolean[].class);
        zzB(boolean[].class);
        zzA(int[].class);
        zzB(int[].class);
        zzA(long[].class);
        zzB(long[].class);
        zzA(float[].class);
        zzB(float[].class);
        zzA(double[].class);
        zzB(double[].class);
        zzA(Object[].class);
        zzB(Object[].class);
        Field fieldZzC = zzC();
        long jObjectFieldOffset = -1;
        if (fieldZzC != null && (zzihjVar = zzf) != null) {
            jObjectFieldOffset = zzihjVar.zza.objectFieldOffset(fieldZzC);
        }
        zzh = jObjectFieldOffset;
        zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzihk() {
    }

    private static int zzA(Class cls) {
        if (zzg) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzB(Class cls) {
        if (zzg) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzC() {
        int i5 = zzicy.zza;
        Field fieldZzD = zzD(Buffer.class, "effectiveDirectAddress");
        if (fieldZzD != null) {
            return fieldZzD;
        }
        Field fieldZzD2 = zzD(Buffer.class, "address");
        if (fieldZzD2 == null || fieldZzD2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZzD2;
    }

    private static Field zzD(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(Object obj, long j8, byte b5) {
        Unsafe unsafe = zzf.zza;
        long j10 = (-4) & j8;
        int i5 = unsafe.getInt(obj, j10);
        int i10 = ((~((int) j8)) & 3) << 3;
        unsafe.putInt(obj, j10, ((255 & b5) << i10) | (i5 & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzF(Object obj, long j8, byte b5) {
        Unsafe unsafe = zzf.zza;
        long j10 = (-4) & j8;
        int i5 = (((int) j8) & 3) << 3;
        unsafe.putInt(obj, j10, ((255 & b5) << i5) | (unsafe.getInt(obj, j10) & (~(255 << i5))));
    }

    public static boolean zza() {
        return zzg;
    }

    public static Object zzb(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static int zzc(Object obj, long j8) {
        return zzf.zza.getInt(obj, j8);
    }

    public static void zzd(Object obj, long j8, int i5) {
        zzf.zza.putInt(obj, j8, i5);
    }

    public static long zze(Object obj, long j8) {
        return zzf.zza.getLong(obj, j8);
    }

    public static void zzf(Object obj, long j8, long j10) {
        zzf.zza.putLong(obj, j8, j10);
    }

    public static boolean zzg(Object obj, long j8) {
        return zzf.zzb(obj, j8);
    }

    public static void zzh(Object obj, long j8, boolean z2) {
        zzf.zzc(obj, j8, z2);
    }

    public static float zzi(Object obj, long j8) {
        return zzf.zzd(obj, j8);
    }

    public static void zzj(Object obj, long j8, float f10) {
        zzf.zze(obj, j8, f10);
    }

    public static double zzk(Object obj, long j8) {
        return zzf.zzf(obj, j8);
    }

    public static void zzl(Object obj, long j8, double d3) {
        zzf.zzg(obj, j8, d3);
    }

    public static Object zzm(Object obj, long j8) {
        return zzf.zza.getObject(obj, j8);
    }

    public static void zzn(Object obj, long j8, Object obj2) {
        zzf.zza.putObject(obj, j8, obj2);
    }

    public static void zzo(byte[] bArr, long j8, byte b5) {
        zzf.zza(bArr, zza + j8, b5);
    }

    public static byte zzp(long j8) {
        return zzf.zzh(j8);
    }

    public static long zzq(ByteBuffer byteBuffer) {
        zzihj zzihjVar = zzf;
        return zzihjVar.zza.getLong(byteBuffer, zzh);
    }

    public static Unsafe zzr() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new zzihg());
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
            Logger.getLogger(zzihk.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean zzs(Class cls) {
        int i5 = zzicy.zza;
        try {
            Class cls2 = zzd;
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

    public static /* synthetic */ boolean zzv(Object obj, long j8) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j8) >>> ((int) (((~j8) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean zzw(Object obj, long j8) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j8) >>> ((int) ((j8 & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ void zzz(Throwable th) {
        Logger.getLogger(zzihk.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }
}
