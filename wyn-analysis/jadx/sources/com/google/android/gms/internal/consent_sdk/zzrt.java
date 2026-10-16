package com.google.android.gms.internal.consent_sdk;

import A7.AbstractC0279p0;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzrt<T> implements zzsa<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzsw.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final zzrq zze;
    private final boolean zzf;
    private final int[] zzg;
    private final int zzh;
    private final zzsp zzi;
    private final zzqb zzj;

    private zzrt(int[] iArr, Object[] objArr, int i5, int i10, zzrq zzrqVar, boolean z2, int[] iArr2, int i11, int i12, zzrv zzrvVar, zzrc zzrcVar, zzsp zzspVar, zzqb zzqbVar, zzrl zzrlVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        boolean z10 = false;
        if (zzqbVar != null && (zzrqVar instanceof zzqk)) {
            z10 = true;
        }
        this.zzf = z10;
        this.zzg = iArr2;
        this.zzh = i11;
        this.zzi = zzspVar;
        this.zzj = zzqbVar;
        this.zze = zzrqVar;
    }

    private static boolean zzA(Object obj, int i5, zzsa zzsaVar) {
        return zzsaVar.zzh(zzsw.zzf(obj, i5 & 1048575));
    }

    private static boolean zzB(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzqm) {
            return ((zzqm) obj).zzD();
        }
        return true;
    }

    private final boolean zzC(Object obj, int i5, int i10) {
        return zzsw.zzc(obj, (long) (zzm(i10) & 1048575)) == i5;
    }

    private static boolean zzD(Object obj, long j8) {
        return ((Boolean) zzsw.zzf(obj, j8)).booleanValue();
    }

    private static final void zzE(int i5, Object obj, zztb zztbVar) throws IOException {
        if (obj instanceof String) {
            zztbVar.zzF(i5, (String) obj);
        } else {
            zztbVar.zzd(i5, (zzpm) obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.consent_sdk.zzrt zzi(java.lang.Class r32, com.google.android.gms.internal.consent_sdk.zzrn r33, com.google.android.gms.internal.consent_sdk.zzrv r34, com.google.android.gms.internal.consent_sdk.zzrc r35, com.google.android.gms.internal.consent_sdk.zzsp r36, com.google.android.gms.internal.consent_sdk.zzqb r37, com.google.android.gms.internal.consent_sdk.zzrl r38) {
        /*
            Method dump skipped, instructions count: 1077
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzrt.zzi(java.lang.Class, com.google.android.gms.internal.consent_sdk.zzrn, com.google.android.gms.internal.consent_sdk.zzrv, com.google.android.gms.internal.consent_sdk.zzrc, com.google.android.gms.internal.consent_sdk.zzsp, com.google.android.gms.internal.consent_sdk.zzqb, com.google.android.gms.internal.consent_sdk.zzrl):com.google.android.gms.internal.consent_sdk.zzrt");
    }

    private static double zzj(Object obj, long j8) {
        return ((Double) zzsw.zzf(obj, j8)).doubleValue();
    }

    private static float zzk(Object obj, long j8) {
        return ((Float) zzsw.zzf(obj, j8)).floatValue();
    }

    private static int zzl(Object obj, long j8) {
        return ((Integer) zzsw.zzf(obj, j8)).intValue();
    }

    private final int zzm(int i5) {
        return this.zzc[i5 + 2];
    }

    private static int zzn(int i5) {
        return (i5 >>> 20) & 255;
    }

    private final int zzo(int i5) {
        return this.zzc[i5 + 1];
    }

    private static long zzp(Object obj, long j8) {
        return ((Long) zzsw.zzf(obj, j8)).longValue();
    }

    private final zzsa zzq(int i5) {
        Object[] objArr = this.zzd;
        int i10 = i5 / 3;
        int i11 = i10 + i10;
        zzsa zzsaVar = (zzsa) objArr[i11];
        if (zzsaVar != null) {
            return zzsaVar;
        }
        zzsa zzsaVarZzb = zzrx.zza().zzb((Class) objArr[i11 + 1]);
        objArr[i11] = zzsaVarZzb;
        return zzsaVarZzb;
    }

    private final Object zzr(int i5) {
        int i10 = i5 / 3;
        return this.zzd[i10 + i10];
    }

    private static Field zzs(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e7) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbR = AbstractC0279p0.r("Field ", str, " for ", name, " not found. Known fields are ");
            sbR.append(string);
            throw new RuntimeException(sbR.toString(), e7);
        }
    }

    private final void zzt(Object obj, Object obj2, int i5) {
        if (zzy(obj2, i5)) {
            int iZzo = zzo(i5) & 1048575;
            Unsafe unsafe = zzb;
            long j8 = iZzo;
            Object object = unsafe.getObject(obj2, j8);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i5] + " is present but null: " + obj2.toString());
            }
            zzsa zzsaVarZzq = zzq(i5);
            if (!zzy(obj, i5)) {
                if (zzB(object)) {
                    Object objZzc = zzsaVarZzq.zzc();
                    zzsaVarZzq.zze(objZzc, object);
                    unsafe.putObject(obj, j8, objZzc);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                zzv(obj, i5);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!zzB(object2)) {
                Object objZzc2 = zzsaVarZzq.zzc();
                zzsaVarZzq.zze(objZzc2, object2);
                unsafe.putObject(obj, j8, objZzc2);
                object2 = objZzc2;
            }
            zzsaVarZzq.zze(object2, object);
        }
    }

    private final void zzu(Object obj, Object obj2, int i5) {
        int[] iArr = this.zzc;
        int i10 = iArr[i5];
        if (zzC(obj2, i10, i5)) {
            int iZzo = zzo(i5) & 1048575;
            Unsafe unsafe = zzb;
            long j8 = iZzo;
            Object object = unsafe.getObject(obj2, j8);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i5] + " is present but null: " + obj2.toString());
            }
            zzsa zzsaVarZzq = zzq(i5);
            if (!zzC(obj, i10, i5)) {
                if (zzB(object)) {
                    Object objZzc = zzsaVarZzq.zzc();
                    zzsaVarZzq.zze(objZzc, object);
                    unsafe.putObject(obj, j8, objZzc);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                zzw(obj, i10, i5);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!zzB(object2)) {
                Object objZzc2 = zzsaVarZzq.zzc();
                zzsaVarZzq.zze(objZzc2, object2);
                unsafe.putObject(obj, j8, objZzc2);
                object2 = objZzc2;
            }
            zzsaVarZzq.zze(object2, object);
        }
    }

    private final void zzv(Object obj, int i5) {
        int iZzm = zzm(i5);
        long j8 = 1048575 & iZzm;
        if (j8 == 1048575) {
            return;
        }
        zzsw.zzq(obj, j8, (1 << (iZzm >>> 20)) | zzsw.zzc(obj, j8));
    }

    private final void zzw(Object obj, int i5, int i10) {
        zzsw.zzq(obj, zzm(i10) & 1048575, i5);
    }

    private final boolean zzx(Object obj, Object obj2, int i5) {
        return zzy(obj, i5) == zzy(obj2, i5);
    }

    private final boolean zzy(Object obj, int i5) {
        int iZzm = zzm(i5);
        long j8 = iZzm & 1048575;
        if (j8 != 1048575) {
            return (zzsw.zzc(obj, j8) & (1 << (iZzm >>> 20))) != 0;
        }
        int iZzo = zzo(i5);
        long j10 = iZzo & 1048575;
        switch (zzn(iZzo)) {
            case 0:
                return Double.doubleToRawLongBits(zzsw.zza(obj, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzsw.zzb(obj, j10)) != 0;
            case 2:
                return zzsw.zzd(obj, j10) != 0;
            case 3:
                return zzsw.zzd(obj, j10) != 0;
            case 4:
                return zzsw.zzc(obj, j10) != 0;
            case 5:
                return zzsw.zzd(obj, j10) != 0;
            case 6:
                return zzsw.zzc(obj, j10) != 0;
            case 7:
                return zzsw.zzw(obj, j10);
            case 8:
                Object objZzf = zzsw.zzf(obj, j10);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzpm) {
                    return !zzpm.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzsw.zzf(obj, j10) != null;
            case 10:
                return !zzpm.zzb.equals(zzsw.zzf(obj, j10));
            case 11:
                return zzsw.zzc(obj, j10) != 0;
            case 12:
                return zzsw.zzc(obj, j10) != 0;
            case 13:
                return zzsw.zzc(obj, j10) != 0;
            case 14:
                return zzsw.zzd(obj, j10) != 0;
            case 15:
                return zzsw.zzc(obj, j10) != 0;
            case 16:
                return zzsw.zzd(obj, j10) != 0;
            case 17:
                return zzsw.zzf(obj, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzz(Object obj, int i5, int i10, int i11, int i12) {
        return i10 == 1048575 ? zzy(obj, i5) : (i11 & i12) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e4  */
    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 2024
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzrt.zza(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final int zzb(Object obj) {
        int i5;
        long jDoubleToLongBits;
        int i10;
        int iFloatToIntBits;
        int iZzc;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i12 >= iArr.length) {
                int iHashCode = ((zzqm) obj).zzc.hashCode() + (i13 * 53);
                return this.zzf ? (iHashCode * 53) + ((zzqk) obj).zzb.zza.hashCode() : iHashCode;
            }
            int iZzo = zzo(i12);
            int i14 = 1048575 & iZzo;
            int iZzn = zzn(iZzo);
            int i15 = iArr[i12];
            long j8 = i14;
            int iHashCode2 = 37;
            switch (iZzn) {
                case 0:
                    i5 = i13 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzsw.zza(obj, j8));
                    byte[] bArr = zzqs.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i5 + iZzc;
                    break;
                case 1:
                    i10 = i13 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzsw.zzb(obj, j8));
                    i13 = iFloatToIntBits + i10;
                    break;
                case 2:
                    i5 = i13 * 53;
                    jDoubleToLongBits = zzsw.zzd(obj, j8);
                    byte[] bArr2 = zzqs.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i5 + iZzc;
                    break;
                case 3:
                    i5 = i13 * 53;
                    jDoubleToLongBits = zzsw.zzd(obj, j8);
                    byte[] bArr3 = zzqs.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i5 + iZzc;
                    break;
                case 4:
                    i5 = i13 * 53;
                    iZzc = zzsw.zzc(obj, j8);
                    i13 = i5 + iZzc;
                    break;
                case 5:
                    i5 = i13 * 53;
                    jDoubleToLongBits = zzsw.zzd(obj, j8);
                    byte[] bArr4 = zzqs.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i5 + iZzc;
                    break;
                case 6:
                    i5 = i13 * 53;
                    iZzc = zzsw.zzc(obj, j8);
                    i13 = i5 + iZzc;
                    break;
                case 7:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzqs.zza(zzsw.zzw(obj, j8));
                    i13 = iFloatToIntBits + i10;
                    break;
                case 8:
                    i10 = i13 * 53;
                    iFloatToIntBits = ((String) zzsw.zzf(obj, j8)).hashCode();
                    i13 = iFloatToIntBits + i10;
                    break;
                case 9:
                    i11 = i13 * 53;
                    Object objZzf = zzsw.zzf(obj, j8);
                    if (objZzf != null) {
                        iHashCode2 = objZzf.hashCode();
                    }
                    i13 = i11 + iHashCode2;
                    break;
                case 10:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzsw.zzf(obj, j8).hashCode();
                    i13 = iFloatToIntBits + i10;
                    break;
                case 11:
                    i5 = i13 * 53;
                    iZzc = zzsw.zzc(obj, j8);
                    i13 = i5 + iZzc;
                    break;
                case 12:
                    i5 = i13 * 53;
                    iZzc = zzsw.zzc(obj, j8);
                    i13 = i5 + iZzc;
                    break;
                case 13:
                    i5 = i13 * 53;
                    iZzc = zzsw.zzc(obj, j8);
                    i13 = i5 + iZzc;
                    break;
                case 14:
                    i5 = i13 * 53;
                    jDoubleToLongBits = zzsw.zzd(obj, j8);
                    byte[] bArr5 = zzqs.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i5 + iZzc;
                    break;
                case 15:
                    i5 = i13 * 53;
                    iZzc = zzsw.zzc(obj, j8);
                    i13 = i5 + iZzc;
                    break;
                case 16:
                    i5 = i13 * 53;
                    jDoubleToLongBits = zzsw.zzd(obj, j8);
                    byte[] bArr6 = zzqs.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i5 + iZzc;
                    break;
                case 17:
                    i11 = i13 * 53;
                    Object objZzf2 = zzsw.zzf(obj, j8);
                    if (objZzf2 != null) {
                        iHashCode2 = objZzf2.hashCode();
                    }
                    i13 = i11 + iHashCode2;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzsw.zzf(obj, j8).hashCode();
                    i13 = iFloatToIntBits + i10;
                    break;
                case 50:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzsw.zzf(obj, j8).hashCode();
                    i13 = iFloatToIntBits + i10;
                    break;
                case 51:
                    if (!zzC(obj, i15, i12)) {
                        break;
                    } else {
                        i5 = i13 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzj(obj, j8));
                        byte[] bArr7 = zzqs.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i5 + iZzc;
                        break;
                    }
                case 52:
                    if (!zzC(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzk(obj, j8));
                        i13 = iFloatToIntBits + i10;
                        break;
                    }
                case 53:
                    if (!zzC(obj, i15, i12)) {
                        break;
                    } else {
                        i5 = i13 * 53;
                        jDoubleToLongBits = zzp(obj, j8);
                        byte[] bArr8 = zzqs.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i5 + iZzc;
                        break;
                    }
                case 54:
                    if (!zzC(obj, i15, i12)) {
                        break;
                    } else {
                        i5 = i13 * 53;
                        jDoubleToLongBits = zzp(obj, j8);
                        byte[] bArr9 = zzqs.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i5 + iZzc;
                        break;
                    }
                case 55:
                    if (!zzC(obj, i15, i12)) {
                        break;
                    } else {
                        i5 = i13 * 53;
                        iZzc = zzl(obj, j8);
                        i13 = i5 + iZzc;
                        break;
                    }
                case 56:
                    if (!zzC(obj, i15, i12)) {
                        break;
                    } else {
                        i5 = i13 * 53;
                        jDoubleToLongBits = zzp(obj, j8);
                        byte[] bArr10 = zzqs.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i5 + iZzc;
                        break;
                    }
                case 57:
                    if (!zzC(obj, i15, i12)) {
                        break;
                    } else {
                        i5 = i13 * 53;
                        iZzc = zzl(obj, j8);
                        i13 = i5 + iZzc;
                        break;
                    }
                case 58:
                    if (!zzC(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzqs.zza(zzD(obj, j8));
                        i13 = iFloatToIntBits + i10;
                        break;
                    }
                case 59:
                    if (!zzC(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = ((String) zzsw.zzf(obj, j8)).hashCode();
                        i13 = iFloatToIntBits + i10;
                        break;
                    }
                case 60:
                    if (!zzC(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzsw.zzf(obj, j8).hashCode();
                        i13 = iFloatToIntBits + i10;
                        break;
                    }
                case 61:
                    if (!zzC(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzsw.zzf(obj, j8).hashCode();
                        i13 = iFloatToIntBits + i10;
                        break;
                    }
                case 62:
                    if (!zzC(obj, i15, i12)) {
                        break;
                    } else {
                        i5 = i13 * 53;
                        iZzc = zzl(obj, j8);
                        i13 = i5 + iZzc;
                        break;
                    }
                case 63:
                    if (!zzC(obj, i15, i12)) {
                        break;
                    } else {
                        i5 = i13 * 53;
                        iZzc = zzl(obj, j8);
                        i13 = i5 + iZzc;
                        break;
                    }
                case 64:
                    if (!zzC(obj, i15, i12)) {
                        break;
                    } else {
                        i5 = i13 * 53;
                        iZzc = zzl(obj, j8);
                        i13 = i5 + iZzc;
                        break;
                    }
                case 65:
                    if (!zzC(obj, i15, i12)) {
                        break;
                    } else {
                        i5 = i13 * 53;
                        jDoubleToLongBits = zzp(obj, j8);
                        byte[] bArr11 = zzqs.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i5 + iZzc;
                        break;
                    }
                case 66:
                    if (!zzC(obj, i15, i12)) {
                        break;
                    } else {
                        i5 = i13 * 53;
                        iZzc = zzl(obj, j8);
                        i13 = i5 + iZzc;
                        break;
                    }
                case 67:
                    if (!zzC(obj, i15, i12)) {
                        break;
                    } else {
                        i5 = i13 * 53;
                        jDoubleToLongBits = zzp(obj, j8);
                        byte[] bArr12 = zzqs.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i5 + iZzc;
                        break;
                    }
                case 68:
                    if (!zzC(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzsw.zzf(obj, j8).hashCode();
                        i13 = iFloatToIntBits + i10;
                        break;
                    }
            }
            i12 += 3;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final Object zzc() {
        return ((zzqm) this.zze).zzr();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = zzB(r8)
            if (r0 != 0) goto L8
            goto L93
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.consent_sdk.zzqm
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.gms.internal.consent_sdk.zzqm r0 = (com.google.android.gms.internal.consent_sdk.zzqm) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzA(r2)
            r0.zza = r1
            r0.zzy()
        L1b:
            int[] r0 = r7.zzc
        L1d:
            int r2 = r0.length
            if (r1 >= r2) goto L85
            int r2 = r7.zzo(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zzn(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L6f
            r5 = 60
            if (r2 == r5) goto L59
            r5 = 68
            if (r2 == r5) goto L59
            switch(r2) {
                case 17: goto L6f;
                case 18: goto L4f;
                case 19: goto L4f;
                case 20: goto L4f;
                case 21: goto L4f;
                case 22: goto L4f;
                case 23: goto L4f;
                case 24: goto L4f;
                case 25: goto L4f;
                case 26: goto L4f;
                case 27: goto L4f;
                case 28: goto L4f;
                case 29: goto L4f;
                case 30: goto L4f;
                case 31: goto L4f;
                case 32: goto L4f;
                case 33: goto L4f;
                case 34: goto L4f;
                case 35: goto L4f;
                case 36: goto L4f;
                case 37: goto L4f;
                case 38: goto L4f;
                case 39: goto L4f;
                case 40: goto L4f;
                case 41: goto L4f;
                case 42: goto L4f;
                case 43: goto L4f;
                case 44: goto L4f;
                case 45: goto L4f;
                case 46: goto L4f;
                case 47: goto L4f;
                case 48: goto L4f;
                case 49: goto L4f;
                case 50: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L82
        L3d:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.consent_sdk.zzrt.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L82
            r6 = r5
            com.google.android.gms.internal.consent_sdk.zzrk r6 = (com.google.android.gms.internal.consent_sdk.zzrk) r6
            r6.zzc()
            r2.putObject(r8, r3, r5)
            goto L82
        L4f:
            java.lang.Object r2 = com.google.android.gms.internal.consent_sdk.zzsw.zzf(r8, r3)
            com.google.android.gms.internal.consent_sdk.zzqr r2 = (com.google.android.gms.internal.consent_sdk.zzqr) r2
            r2.zzb()
            goto L82
        L59:
            r2 = r0[r1]
            boolean r2 = r7.zzC(r8, r2, r1)
            if (r2 == 0) goto L82
            com.google.android.gms.internal.consent_sdk.zzsa r2 = r7.zzq(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.consent_sdk.zzrt.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzd(r3)
            goto L82
        L6f:
            boolean r2 = r7.zzy(r8, r1)
            if (r2 == 0) goto L82
            com.google.android.gms.internal.consent_sdk.zzsa r2 = r7.zzq(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.consent_sdk.zzrt.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzd(r3)
        L82:
            int r1 = r1 + 3
            goto L1d
        L85:
            com.google.android.gms.internal.consent_sdk.zzsp r0 = r7.zzi
            r0.zza(r8)
            boolean r0 = r7.zzf
            if (r0 == 0) goto L93
            com.google.android.gms.internal.consent_sdk.zzqb r0 = r7.zzj
            r0.zza(r8)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzrt.zzd(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final void zze(Object obj, Object obj2) {
        if (!zzB(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i5 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i5 >= iArr.length) {
                zzsc.zzp(this.zzi, obj, obj2);
                if (this.zzf) {
                    zzsc.zzo(this.zzj, obj, obj2);
                    return;
                }
                return;
            }
            int iZzo = zzo(i5);
            int i10 = 1048575 & iZzo;
            int iZzn = zzn(iZzo);
            int i11 = iArr[i5];
            long j8 = i10;
            switch (iZzn) {
                case 0:
                    if (!zzy(obj2, i5)) {
                        break;
                    } else {
                        zzsw.zzo(obj, j8, zzsw.zza(obj2, j8));
                        zzv(obj, i5);
                        break;
                    }
                case 1:
                    if (!zzy(obj2, i5)) {
                        break;
                    } else {
                        zzsw.zzp(obj, j8, zzsw.zzb(obj2, j8));
                        zzv(obj, i5);
                        break;
                    }
                case 2:
                    if (!zzy(obj2, i5)) {
                        break;
                    } else {
                        zzsw.zzr(obj, j8, zzsw.zzd(obj2, j8));
                        zzv(obj, i5);
                        break;
                    }
                case 3:
                    if (!zzy(obj2, i5)) {
                        break;
                    } else {
                        zzsw.zzr(obj, j8, zzsw.zzd(obj2, j8));
                        zzv(obj, i5);
                        break;
                    }
                case 4:
                    if (!zzy(obj2, i5)) {
                        break;
                    } else {
                        zzsw.zzq(obj, j8, zzsw.zzc(obj2, j8));
                        zzv(obj, i5);
                        break;
                    }
                case 5:
                    if (!zzy(obj2, i5)) {
                        break;
                    } else {
                        zzsw.zzr(obj, j8, zzsw.zzd(obj2, j8));
                        zzv(obj, i5);
                        break;
                    }
                case 6:
                    if (!zzy(obj2, i5)) {
                        break;
                    } else {
                        zzsw.zzq(obj, j8, zzsw.zzc(obj2, j8));
                        zzv(obj, i5);
                        break;
                    }
                case 7:
                    if (!zzy(obj2, i5)) {
                        break;
                    } else {
                        zzsw.zzm(obj, j8, zzsw.zzw(obj2, j8));
                        zzv(obj, i5);
                        break;
                    }
                case 8:
                    if (!zzy(obj2, i5)) {
                        break;
                    } else {
                        zzsw.zzs(obj, j8, zzsw.zzf(obj2, j8));
                        zzv(obj, i5);
                        break;
                    }
                case 9:
                    zzt(obj, obj2, i5);
                    break;
                case 10:
                    if (!zzy(obj2, i5)) {
                        break;
                    } else {
                        zzsw.zzs(obj, j8, zzsw.zzf(obj2, j8));
                        zzv(obj, i5);
                        break;
                    }
                case 11:
                    if (!zzy(obj2, i5)) {
                        break;
                    } else {
                        zzsw.zzq(obj, j8, zzsw.zzc(obj2, j8));
                        zzv(obj, i5);
                        break;
                    }
                case 12:
                    if (!zzy(obj2, i5)) {
                        break;
                    } else {
                        zzsw.zzq(obj, j8, zzsw.zzc(obj2, j8));
                        zzv(obj, i5);
                        break;
                    }
                case 13:
                    if (!zzy(obj2, i5)) {
                        break;
                    } else {
                        zzsw.zzq(obj, j8, zzsw.zzc(obj2, j8));
                        zzv(obj, i5);
                        break;
                    }
                case 14:
                    if (!zzy(obj2, i5)) {
                        break;
                    } else {
                        zzsw.zzr(obj, j8, zzsw.zzd(obj2, j8));
                        zzv(obj, i5);
                        break;
                    }
                case 15:
                    if (!zzy(obj2, i5)) {
                        break;
                    } else {
                        zzsw.zzq(obj, j8, zzsw.zzc(obj2, j8));
                        zzv(obj, i5);
                        break;
                    }
                case 16:
                    if (!zzy(obj2, i5)) {
                        break;
                    } else {
                        zzsw.zzr(obj, j8, zzsw.zzd(obj2, j8));
                        zzv(obj, i5);
                        break;
                    }
                case 17:
                    zzt(obj, obj2, i5);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzqr zzqrVarZzd = (zzqr) zzsw.zzf(obj, j8);
                    zzqr zzqrVar = (zzqr) zzsw.zzf(obj2, j8);
                    int size = zzqrVarZzd.size();
                    int size2 = zzqrVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzqrVarZzd.zzc()) {
                            zzqrVarZzd = zzqrVarZzd.zzd(size2 + size);
                        }
                        zzqrVarZzd.addAll(zzqrVar);
                    }
                    if (size > 0) {
                        zzqrVar = zzqrVarZzd;
                    }
                    zzsw.zzs(obj, j8, zzqrVar);
                    break;
                case 50:
                    int i12 = zzsc.zza;
                    zzrk zzrkVarZzb = (zzrk) zzsw.zzf(obj, j8);
                    zzrk zzrkVar = (zzrk) zzsw.zzf(obj2, j8);
                    if (!zzrkVar.isEmpty()) {
                        if (!zzrkVarZzb.zze()) {
                            zzrkVarZzb = zzrkVarZzb.zzb();
                        }
                        zzrkVarZzb.zzd(zzrkVar);
                    }
                    zzsw.zzs(obj, j8, zzrkVarZzb);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!zzC(obj2, i11, i5)) {
                        break;
                    } else {
                        zzsw.zzs(obj, j8, zzsw.zzf(obj2, j8));
                        zzw(obj, i11, i5);
                        break;
                    }
                case 60:
                    zzu(obj, obj2, i5);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzC(obj2, i11, i5)) {
                        break;
                    } else {
                        zzsw.zzs(obj, j8, zzsw.zzf(obj2, j8));
                        zzw(obj, i11, i5);
                        break;
                    }
                case 68:
                    zzu(obj, obj2, i5);
                    break;
            }
            i5 += 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(java.lang.Object r19, com.google.android.gms.internal.consent_sdk.zztb r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzrt.zzf(java.lang.Object, com.google.android.gms.internal.consent_sdk.zztb):void");
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final boolean zzg(Object obj, Object obj2) {
        boolean zZzE;
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int iZzo = zzo(i5);
            long j8 = iZzo & 1048575;
            switch (zzn(iZzo)) {
                case 0:
                    if (!zzx(obj, obj2, i5) || Double.doubleToLongBits(zzsw.zza(obj, j8)) != Double.doubleToLongBits(zzsw.zza(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzx(obj, obj2, i5) || Float.floatToIntBits(zzsw.zzb(obj, j8)) != Float.floatToIntBits(zzsw.zzb(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzx(obj, obj2, i5) || zzsw.zzd(obj, j8) != zzsw.zzd(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzx(obj, obj2, i5) || zzsw.zzd(obj, j8) != zzsw.zzd(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzx(obj, obj2, i5) || zzsw.zzc(obj, j8) != zzsw.zzc(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzx(obj, obj2, i5) || zzsw.zzd(obj, j8) != zzsw.zzd(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzx(obj, obj2, i5) || zzsw.zzc(obj, j8) != zzsw.zzc(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzx(obj, obj2, i5) || zzsw.zzw(obj, j8) != zzsw.zzw(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzx(obj, obj2, i5) || !zzsc.zzE(zzsw.zzf(obj, j8), zzsw.zzf(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzx(obj, obj2, i5) || !zzsc.zzE(zzsw.zzf(obj, j8), zzsw.zzf(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzx(obj, obj2, i5) || !zzsc.zzE(zzsw.zzf(obj, j8), zzsw.zzf(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzx(obj, obj2, i5) || zzsw.zzc(obj, j8) != zzsw.zzc(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzx(obj, obj2, i5) || zzsw.zzc(obj, j8) != zzsw.zzc(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzx(obj, obj2, i5) || zzsw.zzc(obj, j8) != zzsw.zzc(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzx(obj, obj2, i5) || zzsw.zzd(obj, j8) != zzsw.zzd(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzx(obj, obj2, i5) || zzsw.zzc(obj, j8) != zzsw.zzc(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzx(obj, obj2, i5) || zzsw.zzd(obj, j8) != zzsw.zzd(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzx(obj, obj2, i5) || !zzsc.zzE(zzsw.zzf(obj, j8), zzsw.zzf(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzE = zzsc.zzE(zzsw.zzf(obj, j8), zzsw.zzf(obj2, j8));
                    break;
                case 50:
                    zZzE = zzsc.zzE(zzsw.zzf(obj, j8), zzsw.zzf(obj2, j8));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzm = zzm(i5) & 1048575;
                    if (zzsw.zzc(obj, jZzm) != zzsw.zzc(obj2, jZzm) || !zzsc.zzE(zzsw.zzf(obj, j8), zzsw.zzf(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzE) {
                return false;
            }
        }
        if (!((zzqm) obj).zzc.equals(((zzqm) obj2).zzc)) {
            return false;
        }
        if (this.zzf) {
            return ((zzqk) obj).zzb.equals(((zzqk) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00c1  */
    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzh(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzrt.zzh(java.lang.Object):boolean");
    }
}
