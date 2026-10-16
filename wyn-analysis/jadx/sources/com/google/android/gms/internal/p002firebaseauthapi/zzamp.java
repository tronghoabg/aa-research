package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzamp {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class<?> zzc;
    private static final boolean zzd;
    private static final boolean zze;
    private static final zzb zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    public static final class zza extends zzb {
        public zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final double zza(Object obj, long j8) {
            return Double.longBitsToDouble(zze(obj, j8));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final float zzb(Object obj, long j8) {
            return Float.intBitsToFloat(zzd(obj, j8));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final boolean zzc(Object obj, long j8) {
            return zzamp.zza ? zzamp.zzf(obj, j8) : zzamp.zzg(obj, j8);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final void zza(Object obj, long j8, boolean z2) {
            if (zzamp.zza) {
                zzamp.zza(obj, j8, z2);
            } else {
                zzamp.zzb(obj, j8, z2);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final void zza(Object obj, long j8, byte b5) {
            if (!zzamp.zza) {
                zzamp.zzd(obj, j8, b5);
            } else {
                zzamp.zzc(obj, j8, b5);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final void zza(Object obj, long j8, double d3) {
            zza(obj, j8, Double.doubleToLongBits(d3));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final void zza(Object obj, long j8, float f10) {
            zza(obj, j8, Float.floatToIntBits(f10));
        }
    }

    public static abstract class zzb {
        Unsafe zza;

        public zzb(Unsafe unsafe) {
            this.zza = unsafe;
        }

        public abstract double zza(Object obj, long j8);

        public abstract void zza(Object obj, long j8, byte b5);

        public abstract void zza(Object obj, long j8, double d3);

        public abstract void zza(Object obj, long j8, float f10);

        public final void zza(Object obj, long j8, int i5) {
            this.zza.putInt(obj, j8, i5);
        }

        public abstract void zza(Object obj, long j8, boolean z2);

        public abstract float zzb(Object obj, long j8);

        public final boolean zzb() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return zzamp.zze() != null;
            } catch (Throwable th) {
                zzamp.zza(th);
                return false;
            }
        }

        public abstract boolean zzc(Object obj, long j8);

        public final int zzd(Object obj, long j8) {
            return this.zza.getInt(obj, j8);
        }

        public final long zze(Object obj, long j8) {
            return this.zza.getLong(obj, j8);
        }

        public final void zza(Object obj, long j8, long j10) {
            this.zza.putLong(obj, j8, j10);
        }

        public final boolean zza() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                zzamp.zza(th);
                return false;
            }
        }
    }

    public static final class zzc extends zzb {
        public zzc(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final double zza(Object obj, long j8) {
            return Double.longBitsToDouble(zze(obj, j8));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final float zzb(Object obj, long j8) {
            return Float.intBitsToFloat(zzd(obj, j8));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final boolean zzc(Object obj, long j8) {
            return zzamp.zza ? zzamp.zzf(obj, j8) : zzamp.zzg(obj, j8);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final void zza(Object obj, long j8, boolean z2) {
            if (zzamp.zza) {
                zzamp.zza(obj, j8, z2);
            } else {
                zzamp.zzb(obj, j8, z2);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final void zza(Object obj, long j8, byte b5) {
            if (!zzamp.zza) {
                zzamp.zzd(obj, j8, b5);
            } else {
                zzamp.zzc(obj, j8, b5);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final void zza(Object obj, long j8, double d3) {
            zza(obj, j8, Double.doubleToLongBits(d3));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final void zza(Object obj, long j8, float f10) {
            zza(obj, j8, Float.floatToIntBits(f10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    static {
        /*
            sun.misc.Unsafe r0 = zzb()
            com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzb = r0
            java.lang.Class r1 = com.google.android.gms.internal.p002firebaseauthapi.zzaii.zza()
            com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzc = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = zzd(r1)
            com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzd = r1
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = zzd(r2)
            com.google.android.gms.internal.p002firebaseauthapi.zzamp.zze = r2
            if (r0 == 0) goto L2e
            if (r1 == 0) goto L26
            com.google.android.gms.internal.firebase-auth-api.zzamp$zzc r1 = new com.google.android.gms.internal.firebase-auth-api.zzamp$zzc
            r1.<init>(r0)
            goto L2f
        L26:
            if (r2 == 0) goto L2e
            com.google.android.gms.internal.firebase-auth-api.zzamp$zza r1 = new com.google.android.gms.internal.firebase-auth-api.zzamp$zza
            r1.<init>(r0)
            goto L2f
        L2e:
            r1 = 0
        L2f:
            com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzf = r1
            r0 = 0
            if (r1 != 0) goto L36
            r2 = r0
            goto L3a
        L36:
            boolean r2 = r1.zzb()
        L3a:
            com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzg = r2
            if (r1 != 0) goto L40
            r2 = r0
            goto L44
        L40:
            boolean r2 = r1.zza()
        L44:
            com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzh = r2
            java.lang.Class<byte[]> r2 = byte[].class
            int r2 = zzb(r2)
            long r2 = (long) r2
            com.google.android.gms.internal.p002firebaseauthapi.zzamp.zzi = r2
            java.lang.Class<boolean[]> r2 = boolean[].class
            zzb(r2)
            zzc(r2)
            java.lang.Class<int[]> r2 = int[].class
            zzb(r2)
            zzc(r2)
            java.lang.Class<long[]> r2 = long[].class
            zzb(r2)
            zzc(r2)
            java.lang.Class<float[]> r2 = float[].class
            zzb(r2)
            zzc(r2)
            java.lang.Class<double[]> r2 = double[].class
            zzb(r2)
            zzc(r2)
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            zzb(r2)
            zzc(r2)
            java.lang.reflect.Field r2 = zze()
            if (r2 == 0) goto L8d
            if (r1 != 0) goto L88
            goto L8d
        L88:
            sun.misc.Unsafe r1 = r1.zza
            r1.objectFieldOffset(r2)
        L8d:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 != r2) goto L96
            r0 = 1
        L96:
            com.google.android.gms.internal.p002firebaseauthapi.zzamp.zza = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamp.<clinit>():void");
    }

    private zzamp() {
    }

    private static int zzc(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    public static long zzd(Object obj, long j8) {
        return zzf.zze(obj, j8);
    }

    public static Object zze(Object obj, long j8) {
        return zzf.zza.getObject(obj, j8);
    }

    public static /* synthetic */ boolean zzf(Object obj, long j8) {
        return ((byte) (zzc(obj, (-4) & j8) >>> ((int) (((~j8) & 3) << 3)))) != 0;
    }

    public static /* synthetic */ boolean zzg(Object obj, long j8) {
        return ((byte) (zzc(obj, (-4) & j8) >>> ((int) ((j8 & 3) << 3)))) != 0;
    }

    public static boolean zzh(Object obj, long j8) {
        return zzf.zzc(obj, j8);
    }

    public static float zzb(Object obj, long j8) {
        return zzf.zzb(obj, j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(Object obj, long j8, byte b5) {
        long j10 = (-4) & j8;
        int i5 = (((int) j8) & 3) << 3;
        zza(obj, j10, ((255 & b5) << i5) | (zzc(obj, j10) & (~(255 << i5))));
    }

    public static double zza(Object obj, long j8) {
        return zzf.zza(obj, j8);
    }

    private static int zzb(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static int zzc(Object obj, long j8) {
        return zzf.zzd(obj, j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field zze() {
        Field fieldZza = zza((Class<?>) Buffer.class, "effectiveDirectAddress");
        if (fieldZza != null) {
            return fieldZza;
        }
        Field fieldZza2 = zza((Class<?>) Buffer.class, "address");
        if (fieldZza2 == null || fieldZza2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZza2;
    }

    public static <T> T zza(Class<T> cls) {
        try {
            return (T) zzb.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static void zzc(Object obj, long j8, boolean z2) {
        zzf.zza(obj, j8, z2);
    }

    private static boolean zzd(Class<?> cls) {
        try {
            Class<?> cls2 = zzc;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
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

    public static Unsafe zzb() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzamr());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(Object obj, long j8, byte b5) {
        long j10 = (-4) & j8;
        int iZzc = zzc(obj, j10);
        int i5 = ((~((int) j8)) & 3) << 3;
        zza(obj, j10, ((255 & b5) << i5) | (iZzc & (~(255 << i5))));
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ void zza(Throwable th) {
        Logger.getLogger(zzamp.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
    }

    public static /* synthetic */ void zzb(Object obj, long j8, boolean z2) {
        zzd(obj, j8, z2 ? (byte) 1 : (byte) 0);
    }

    public static boolean zzc() {
        return zzh;
    }

    public static /* synthetic */ void zza(Object obj, long j8, boolean z2) {
        zzc(obj, j8, z2 ? (byte) 1 : (byte) 0);
    }

    public static void zza(byte[] bArr, long j8, byte b5) {
        zzf.zza((Object) bArr, zzi + j8, b5);
    }

    public static void zza(Object obj, long j8, double d3) {
        zzf.zza(obj, j8, d3);
    }

    public static void zza(Object obj, long j8, float f10) {
        zzf.zza(obj, j8, f10);
    }

    public static void zza(Object obj, long j8, int i5) {
        zzf.zza(obj, j8, i5);
    }

    public static boolean zzd() {
        return zzg;
    }

    public static void zza(Object obj, long j8, long j10) {
        zzf.zza(obj, j8, j10);
    }

    public static void zza(Object obj, long j8, Object obj2) {
        zzf.zza.putObject(obj, j8, obj2);
    }
}
