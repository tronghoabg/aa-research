package com.google.android.gms.internal.auth;

import A7.AbstractC0279p0;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class zzga<T> implements zzgi<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhj.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfx zzg;
    private final int[] zzh;
    private final int zzi;
    private final int zzj;
    private final zzfl zzk;
    private final zzgz zzl;
    private final zzem zzm;
    private final zzgc zzn;
    private final zzfs zzo;

    private zzga(int[] iArr, Object[] objArr, int i5, int i10, zzfx zzfxVar, int i11, boolean z2, int[] iArr2, int i12, int i13, zzgc zzgcVar, zzfl zzflVar, zzgz zzgzVar, zzem zzemVar, zzfs zzfsVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i5;
        this.zzf = i10;
        this.zzh = iArr2;
        this.zzi = i12;
        this.zzj = i13;
        this.zzn = zzgcVar;
        this.zzk = zzflVar;
        this.zzl = zzgzVar;
        this.zzm = zzemVar;
        this.zzg = zzfxVar;
        this.zzo = zzfsVar;
    }

    private final void zzA(Object obj, int i5, int i10) {
        zzhj.zzn(obj, zzl(i10) & 1048575, i5);
    }

    private final void zzB(Object obj, int i5, Object obj2) {
        zzb.putObject(obj, zzo(i5) & 1048575, obj2);
        zzz(obj, i5);
    }

    private final void zzC(Object obj, int i5, int i10, Object obj2) {
        zzb.putObject(obj, zzo(i10) & 1048575, obj2);
        zzA(obj, i5, i10);
    }

    private final boolean zzD(Object obj, Object obj2, int i5) {
        return zzE(obj, i5) == zzE(obj2, i5);
    }

    private final boolean zzE(Object obj, int i5) {
        int iZzl = zzl(i5);
        long j8 = iZzl & 1048575;
        if (j8 != 1048575) {
            return (zzhj.zzc(obj, j8) & (1 << (iZzl >>> 20))) != 0;
        }
        int iZzo = zzo(i5);
        long j10 = iZzo & 1048575;
        switch (zzn(iZzo)) {
            case 0:
                return Double.doubleToRawLongBits(zzhj.zza(obj, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhj.zzb(obj, j10)) != 0;
            case 2:
                return zzhj.zzd(obj, j10) != 0;
            case 3:
                return zzhj.zzd(obj, j10) != 0;
            case 4:
                return zzhj.zzc(obj, j10) != 0;
            case 5:
                return zzhj.zzd(obj, j10) != 0;
            case 6:
                return zzhj.zzc(obj, j10) != 0;
            case 7:
                return zzhj.zzt(obj, j10);
            case 8:
                Object objZzf = zzhj.zzf(obj, j10);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzef) {
                    return !zzef.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhj.zzf(obj, j10) != null;
            case 10:
                return !zzef.zzb.equals(zzhj.zzf(obj, j10));
            case 11:
                return zzhj.zzc(obj, j10) != 0;
            case 12:
                return zzhj.zzc(obj, j10) != 0;
            case 13:
                return zzhj.zzc(obj, j10) != 0;
            case 14:
                return zzhj.zzd(obj, j10) != 0;
            case 15:
                return zzhj.zzc(obj, j10) != 0;
            case 16:
                return zzhj.zzd(obj, j10) != 0;
            case 17:
                return zzhj.zzf(obj, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzF(Object obj, int i5, int i10, int i11, int i12) {
        return i10 == 1048575 ? zzE(obj, i5) : (i11 & i12) != 0;
    }

    private static boolean zzG(Object obj, int i5, zzgi zzgiVar) {
        return zzgiVar.zzi(zzhj.zzf(obj, i5 & 1048575));
    }

    private static boolean zzH(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzev) {
            return ((zzev) obj).zzm();
        }
        return true;
    }

    private final boolean zzI(Object obj, int i5, int i10) {
        return zzhj.zzc(obj, (long) (zzl(i10) & 1048575)) == i5;
    }

    public static zzha zzc(Object obj) {
        zzev zzevVar = (zzev) obj;
        zzha zzhaVar = zzevVar.zzc;
        if (zzhaVar != zzha.zza()) {
            return zzhaVar;
        }
        zzha zzhaVarZzd = zzha.zzd();
        zzevVar.zzc = zzhaVarZzd;
        return zzhaVarZzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.auth.zzga zzj(java.lang.Class r32, com.google.android.gms.internal.auth.zzfu r33, com.google.android.gms.internal.auth.zzgc r34, com.google.android.gms.internal.auth.zzfl r35, com.google.android.gms.internal.auth.zzgz r36, com.google.android.gms.internal.auth.zzem r37, com.google.android.gms.internal.auth.zzfs r38) {
        /*
            Method dump skipped, instructions count: 1053
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzga.zzj(java.lang.Class, com.google.android.gms.internal.auth.zzfu, com.google.android.gms.internal.auth.zzgc, com.google.android.gms.internal.auth.zzfl, com.google.android.gms.internal.auth.zzgz, com.google.android.gms.internal.auth.zzem, com.google.android.gms.internal.auth.zzfs):com.google.android.gms.internal.auth.zzga");
    }

    private static int zzk(Object obj, long j8) {
        return ((Integer) zzhj.zzf(obj, j8)).intValue();
    }

    private final int zzl(int i5) {
        return this.zzc[i5 + 2];
    }

    private final int zzm(int i5, int i10) {
        int length = (this.zzc.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int i13 = this.zzc[i12];
            if (i5 == i13) {
                return i12;
            }
            if (i5 < i13) {
                length = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
        }
        return -1;
    }

    private static int zzn(int i5) {
        return (i5 >>> 20) & 255;
    }

    private final int zzo(int i5) {
        return this.zzc[i5 + 1];
    }

    private static long zzp(Object obj, long j8) {
        return ((Long) zzhj.zzf(obj, j8)).longValue();
    }

    private final zzey zzq(int i5) {
        int i10 = i5 / 3;
        return (zzey) this.zzd[i10 + i10 + 1];
    }

    private final zzgi zzr(int i5) {
        int i10 = i5 / 3;
        int i11 = i10 + i10;
        zzgi zzgiVar = (zzgi) this.zzd[i11];
        if (zzgiVar != null) {
            return zzgiVar;
        }
        zzgi zzgiVarZzb = zzgf.zza().zzb((Class) this.zzd[i11 + 1]);
        this.zzd[i11] = zzgiVarZzb;
        return zzgiVarZzb;
    }

    private final Object zzs(int i5) {
        int i10 = i5 / 3;
        return this.zzd[i10 + i10];
    }

    private final Object zzt(Object obj, int i5) {
        zzgi zzgiVarZzr = zzr(i5);
        int iZzo = zzo(i5) & 1048575;
        if (!zzE(obj, i5)) {
            return zzgiVarZzr.zzd();
        }
        Object object = zzb.getObject(obj, iZzo);
        if (zzH(object)) {
            return object;
        }
        Object objZzd = zzgiVarZzr.zzd();
        if (object != null) {
            zzgiVarZzr.zzf(objZzd, object);
        }
        return objZzd;
    }

    private final Object zzu(Object obj, int i5, int i10) {
        zzgi zzgiVarZzr = zzr(i10);
        if (!zzI(obj, i5, i10)) {
            return zzgiVarZzr.zzd();
        }
        Object object = zzb.getObject(obj, zzo(i10) & 1048575);
        if (zzH(object)) {
            return object;
        }
        Object objZzd = zzgiVarZzr.zzd();
        if (object != null) {
            zzgiVarZzr.zzf(objZzd, object);
        }
        return objZzd;
    }

    private static Field zzv(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
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
            throw new RuntimeException(sbR.toString());
        }
    }

    private static void zzw(Object obj) {
        if (!zzH(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzx(Object obj, Object obj2, int i5) {
        if (zzE(obj2, i5)) {
            int iZzo = zzo(i5) & 1048575;
            Unsafe unsafe = zzb;
            long j8 = iZzo;
            Object object = unsafe.getObject(obj2, j8);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i5] + " is present but null: " + obj2.toString());
            }
            zzgi zzgiVarZzr = zzr(i5);
            if (!zzE(obj, i5)) {
                if (zzH(object)) {
                    Object objZzd = zzgiVarZzr.zzd();
                    zzgiVarZzr.zzf(objZzd, object);
                    unsafe.putObject(obj, j8, objZzd);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                zzz(obj, i5);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!zzH(object2)) {
                Object objZzd2 = zzgiVarZzr.zzd();
                zzgiVarZzr.zzf(objZzd2, object2);
                unsafe.putObject(obj, j8, objZzd2);
                object2 = objZzd2;
            }
            zzgiVarZzr.zzf(object2, object);
        }
    }

    private final void zzy(Object obj, Object obj2, int i5) {
        int i10 = this.zzc[i5];
        if (zzI(obj2, i10, i5)) {
            int iZzo = zzo(i5) & 1048575;
            Unsafe unsafe = zzb;
            long j8 = iZzo;
            Object object = unsafe.getObject(obj2, j8);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i5] + " is present but null: " + obj2.toString());
            }
            zzgi zzgiVarZzr = zzr(i5);
            if (!zzI(obj, i10, i5)) {
                if (zzH(object)) {
                    Object objZzd = zzgiVarZzr.zzd();
                    zzgiVarZzr.zzf(objZzd, object);
                    unsafe.putObject(obj, j8, objZzd);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                zzA(obj, i10, i5);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!zzH(object2)) {
                Object objZzd2 = zzgiVarZzr.zzd();
                zzgiVarZzr.zzf(objZzd2, object2);
                unsafe.putObject(obj, j8, objZzd2);
                object2 = objZzd2;
            }
            zzgiVarZzr.zzf(object2, object);
        }
    }

    private final void zzz(Object obj, int i5) {
        int iZzl = zzl(i5);
        long j8 = 1048575 & iZzl;
        if (j8 == 1048575) {
            return;
        }
        zzhj.zzn(obj, j8, (1 << (iZzl >>> 20)) | zzhj.zzc(obj, j8));
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final int zza(Object obj) {
        int i5;
        long jDoubleToLongBits;
        int i10;
        int iFloatToIntBits;
        int iZzc;
        int length = this.zzc.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iZzo = zzo(i12);
            int i13 = this.zzc[i12];
            long j8 = 1048575 & iZzo;
            int iHashCode = 37;
            switch (zzn(iZzo)) {
                case 0:
                    i5 = i11 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzhj.zza(obj, j8));
                    byte[] bArr = zzfa.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i11 = i5 + iZzc;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzhj.zzb(obj, j8));
                    i11 = iFloatToIntBits + i10;
                    break;
                case 2:
                    i5 = i11 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j8);
                    byte[] bArr2 = zzfa.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i11 = i5 + iZzc;
                    break;
                case 3:
                    i5 = i11 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j8);
                    byte[] bArr3 = zzfa.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i11 = i5 + iZzc;
                    break;
                case 4:
                    i5 = i11 * 53;
                    iZzc = zzhj.zzc(obj, j8);
                    i11 = i5 + iZzc;
                    break;
                case 5:
                    i5 = i11 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j8);
                    byte[] bArr4 = zzfa.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i11 = i5 + iZzc;
                    break;
                case 6:
                    i5 = i11 * 53;
                    iZzc = zzhj.zzc(obj, j8);
                    i11 = i5 + iZzc;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iFloatToIntBits = zzfa.zza(zzhj.zzt(obj, j8));
                    i11 = iFloatToIntBits + i10;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iFloatToIntBits = ((String) zzhj.zzf(obj, j8)).hashCode();
                    i11 = iFloatToIntBits + i10;
                    break;
                case 9:
                    Object objZzf = zzhj.zzf(obj, j8);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iFloatToIntBits = zzhj.zzf(obj, j8).hashCode();
                    i11 = iFloatToIntBits + i10;
                    break;
                case 11:
                    i5 = i11 * 53;
                    iZzc = zzhj.zzc(obj, j8);
                    i11 = i5 + iZzc;
                    break;
                case 12:
                    i5 = i11 * 53;
                    iZzc = zzhj.zzc(obj, j8);
                    i11 = i5 + iZzc;
                    break;
                case 13:
                    i5 = i11 * 53;
                    iZzc = zzhj.zzc(obj, j8);
                    i11 = i5 + iZzc;
                    break;
                case 14:
                    i5 = i11 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j8);
                    byte[] bArr5 = zzfa.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i11 = i5 + iZzc;
                    break;
                case 15:
                    i5 = i11 * 53;
                    iZzc = zzhj.zzc(obj, j8);
                    i11 = i5 + iZzc;
                    break;
                case 16:
                    i5 = i11 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j8);
                    byte[] bArr6 = zzfa.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i11 = i5 + iZzc;
                    break;
                case 17:
                    Object objZzf2 = zzhj.zzf(obj, j8);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
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
                    i10 = i11 * 53;
                    iFloatToIntBits = zzhj.zzf(obj, j8).hashCode();
                    i11 = iFloatToIntBits + i10;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iFloatToIntBits = zzhj.zzf(obj, j8).hashCode();
                    i11 = iFloatToIntBits + i10;
                    break;
                case 51:
                    if (zzI(obj, i13, i12)) {
                        i5 = i11 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) zzhj.zzf(obj, j8)).doubleValue());
                        byte[] bArr7 = zzfa.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i11 = i5 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) zzhj.zzf(obj, j8)).floatValue());
                        i11 = iFloatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzI(obj, i13, i12)) {
                        i5 = i11 * 53;
                        jDoubleToLongBits = zzp(obj, j8);
                        byte[] bArr8 = zzfa.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i11 = i5 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzI(obj, i13, i12)) {
                        i5 = i11 * 53;
                        jDoubleToLongBits = zzp(obj, j8);
                        byte[] bArr9 = zzfa.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i11 = i5 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzI(obj, i13, i12)) {
                        i5 = i11 * 53;
                        iZzc = zzk(obj, j8);
                        i11 = i5 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzI(obj, i13, i12)) {
                        i5 = i11 * 53;
                        jDoubleToLongBits = zzp(obj, j8);
                        byte[] bArr10 = zzfa.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i11 = i5 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzI(obj, i13, i12)) {
                        i5 = i11 * 53;
                        iZzc = zzk(obj, j8);
                        i11 = i5 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = zzfa.zza(((Boolean) zzhj.zzf(obj, j8)).booleanValue());
                        i11 = iFloatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = ((String) zzhj.zzf(obj, j8)).hashCode();
                        i11 = iFloatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = zzhj.zzf(obj, j8).hashCode();
                        i11 = iFloatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = zzhj.zzf(obj, j8).hashCode();
                        i11 = iFloatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzI(obj, i13, i12)) {
                        i5 = i11 * 53;
                        iZzc = zzk(obj, j8);
                        i11 = i5 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzI(obj, i13, i12)) {
                        i5 = i11 * 53;
                        iZzc = zzk(obj, j8);
                        i11 = i5 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzI(obj, i13, i12)) {
                        i5 = i11 * 53;
                        iZzc = zzk(obj, j8);
                        i11 = i5 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzI(obj, i13, i12)) {
                        i5 = i11 * 53;
                        jDoubleToLongBits = zzp(obj, j8);
                        byte[] bArr11 = zzfa.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i11 = i5 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzI(obj, i13, i12)) {
                        i5 = i11 * 53;
                        iZzc = zzk(obj, j8);
                        i11 = i5 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzI(obj, i13, i12)) {
                        i5 = i11 * 53;
                        jDoubleToLongBits = zzp(obj, j8);
                        byte[] bArr12 = zzfa.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i11 = i5 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = zzhj.zzf(obj, j8).hashCode();
                        i11 = iFloatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this.zzl.zzb(obj).hashCode() + (i11 * 53);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int zzb(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, com.google.android.gms.internal.auth.zzdt r42) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzga.zzb(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.auth.zzdt):int");
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final Object zzd() {
        return ((zzev) this.zzg).zzc();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    @Override // com.google.android.gms.internal.auth.zzgi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zze(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = zzH(r8)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r8 instanceof com.google.android.gms.internal.auth.zzev
            r1 = 0
            if (r0 == 0) goto L1a
            r0 = r8
            com.google.android.gms.internal.auth.zzev r0 = (com.google.android.gms.internal.auth.zzev) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzl(r2)
            r0.zza = r1
            r0.zzj()
        L1a:
            int[] r0 = r7.zzc
            int r0 = r0.length
        L1d:
            if (r1 >= r0) goto L82
            int r2 = r7.zzo(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zzn(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L6c
            r5 = 60
            if (r2 == r5) goto L54
            r5 = 68
            if (r2 == r5) goto L54
            switch(r2) {
                case 17: goto L6c;
                case 18: goto L4e;
                case 19: goto L4e;
                case 20: goto L4e;
                case 21: goto L4e;
                case 22: goto L4e;
                case 23: goto L4e;
                case 24: goto L4e;
                case 25: goto L4e;
                case 26: goto L4e;
                case 27: goto L4e;
                case 28: goto L4e;
                case 29: goto L4e;
                case 30: goto L4e;
                case 31: goto L4e;
                case 32: goto L4e;
                case 33: goto L4e;
                case 34: goto L4e;
                case 35: goto L4e;
                case 36: goto L4e;
                case 37: goto L4e;
                case 38: goto L4e;
                case 39: goto L4e;
                case 40: goto L4e;
                case 41: goto L4e;
                case 42: goto L4e;
                case 43: goto L4e;
                case 44: goto L4e;
                case 45: goto L4e;
                case 46: goto L4e;
                case 47: goto L4e;
                case 48: goto L4e;
                case 49: goto L4e;
                case 50: goto L3c;
                default: goto L3b;
            }
        L3b:
            goto L7f
        L3c:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.auth.zzga.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L7f
            r6 = r5
            com.google.android.gms.internal.auth.zzfr r6 = (com.google.android.gms.internal.auth.zzfr) r6
            r6.zzc()
            r2.putObject(r8, r3, r5)
            goto L7f
        L4e:
            com.google.android.gms.internal.auth.zzfl r2 = r7.zzk
            r2.zza(r8, r3)
            goto L7f
        L54:
            int[] r2 = r7.zzc
            r2 = r2[r1]
            boolean r2 = r7.zzI(r8, r2, r1)
            if (r2 == 0) goto L7f
            com.google.android.gms.internal.auth.zzgi r2 = r7.zzr(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.auth.zzga.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zze(r3)
            goto L7f
        L6c:
            boolean r2 = r7.zzE(r8, r1)
            if (r2 == 0) goto L7f
            com.google.android.gms.internal.auth.zzgi r2 = r7.zzr(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.auth.zzga.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zze(r3)
        L7f:
            int r1 = r1 + 3
            goto L1d
        L82:
            com.google.android.gms.internal.auth.zzgz r0 = r7.zzl
            r0.zze(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzga.zze(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzf(Object obj, Object obj2) {
        zzw(obj);
        obj2.getClass();
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int iZzo = zzo(i5);
            int i10 = this.zzc[i5];
            long j8 = 1048575 & iZzo;
            switch (zzn(iZzo)) {
                case 0:
                    if (zzE(obj2, i5)) {
                        zzhj.zzl(obj, j8, zzhj.zza(obj2, j8));
                        zzz(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzE(obj2, i5)) {
                        zzhj.zzm(obj, j8, zzhj.zzb(obj2, j8));
                        zzz(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzE(obj2, i5)) {
                        zzhj.zzo(obj, j8, zzhj.zzd(obj2, j8));
                        zzz(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzE(obj2, i5)) {
                        zzhj.zzo(obj, j8, zzhj.zzd(obj2, j8));
                        zzz(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzE(obj2, i5)) {
                        zzhj.zzn(obj, j8, zzhj.zzc(obj2, j8));
                        zzz(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzE(obj2, i5)) {
                        zzhj.zzo(obj, j8, zzhj.zzd(obj2, j8));
                        zzz(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzE(obj2, i5)) {
                        zzhj.zzn(obj, j8, zzhj.zzc(obj2, j8));
                        zzz(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzE(obj2, i5)) {
                        zzhj.zzk(obj, j8, zzhj.zzt(obj2, j8));
                        zzz(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzE(obj2, i5)) {
                        zzhj.zzp(obj, j8, zzhj.zzf(obj2, j8));
                        zzz(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzx(obj, obj2, i5);
                    break;
                case 10:
                    if (zzE(obj2, i5)) {
                        zzhj.zzp(obj, j8, zzhj.zzf(obj2, j8));
                        zzz(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzE(obj2, i5)) {
                        zzhj.zzn(obj, j8, zzhj.zzc(obj2, j8));
                        zzz(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzE(obj2, i5)) {
                        zzhj.zzn(obj, j8, zzhj.zzc(obj2, j8));
                        zzz(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzE(obj2, i5)) {
                        zzhj.zzn(obj, j8, zzhj.zzc(obj2, j8));
                        zzz(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzE(obj2, i5)) {
                        zzhj.zzo(obj, j8, zzhj.zzd(obj2, j8));
                        zzz(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzE(obj2, i5)) {
                        zzhj.zzn(obj, j8, zzhj.zzc(obj2, j8));
                        zzz(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzE(obj2, i5)) {
                        zzhj.zzo(obj, j8, zzhj.zzd(obj2, j8));
                        zzz(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzx(obj, obj2, i5);
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
                    this.zzk.zzb(obj, obj2, j8);
                    break;
                case 50:
                    int i11 = zzgk.zza;
                    zzhj.zzp(obj, j8, zzfs.zza(zzhj.zzf(obj, j8), zzhj.zzf(obj2, j8)));
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
                    if (zzI(obj2, i10, i5)) {
                        zzhj.zzp(obj, j8, zzhj.zzf(obj2, j8));
                        zzA(obj, i10, i5);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzy(obj, obj2, i5);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzI(obj2, i10, i5)) {
                        zzhj.zzp(obj, j8, zzhj.zzf(obj2, j8));
                        zzA(obj, i10, i5);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzy(obj, obj2, i5);
                    break;
            }
        }
        zzgk.zzd(this.zzl, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzg(Object obj, byte[] bArr, int i5, int i10, zzdt zzdtVar) throws IOException {
        zzb(obj, bArr, i5, i10, 0, zzdtVar);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzh(Object obj, Object obj2) {
        boolean zZzf;
        int length = this.zzc.length;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int iZzo = zzo(i5);
            long j8 = iZzo & 1048575;
            switch (zzn(iZzo)) {
                case 0:
                    if (!zzD(obj, obj2, i5) || Double.doubleToLongBits(zzhj.zza(obj, j8)) != Double.doubleToLongBits(zzhj.zza(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzD(obj, obj2, i5) || Float.floatToIntBits(zzhj.zzb(obj, j8)) != Float.floatToIntBits(zzhj.zzb(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzD(obj, obj2, i5) || zzhj.zzd(obj, j8) != zzhj.zzd(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzD(obj, obj2, i5) || zzhj.zzd(obj, j8) != zzhj.zzd(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzD(obj, obj2, i5) || zzhj.zzc(obj, j8) != zzhj.zzc(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzD(obj, obj2, i5) || zzhj.zzd(obj, j8) != zzhj.zzd(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzD(obj, obj2, i5) || zzhj.zzc(obj, j8) != zzhj.zzc(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzD(obj, obj2, i5) || zzhj.zzt(obj, j8) != zzhj.zzt(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzD(obj, obj2, i5) || !zzgk.zzf(zzhj.zzf(obj, j8), zzhj.zzf(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzD(obj, obj2, i5) || !zzgk.zzf(zzhj.zzf(obj, j8), zzhj.zzf(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzD(obj, obj2, i5) || !zzgk.zzf(zzhj.zzf(obj, j8), zzhj.zzf(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzD(obj, obj2, i5) || zzhj.zzc(obj, j8) != zzhj.zzc(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzD(obj, obj2, i5) || zzhj.zzc(obj, j8) != zzhj.zzc(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzD(obj, obj2, i5) || zzhj.zzc(obj, j8) != zzhj.zzc(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzD(obj, obj2, i5) || zzhj.zzd(obj, j8) != zzhj.zzd(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzD(obj, obj2, i5) || zzhj.zzc(obj, j8) != zzhj.zzc(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzD(obj, obj2, i5) || zzhj.zzd(obj, j8) != zzhj.zzd(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzD(obj, obj2, i5) || !zzgk.zzf(zzhj.zzf(obj, j8), zzhj.zzf(obj2, j8))) {
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
                    zZzf = zzgk.zzf(zzhj.zzf(obj, j8), zzhj.zzf(obj2, j8));
                    break;
                case 50:
                    zZzf = zzgk.zzf(zzhj.zzf(obj, j8), zzhj.zzf(obj2, j8));
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
                    long jZzl = zzl(i5) & 1048575;
                    if (zzhj.zzc(obj, jZzl) != zzhj.zzc(obj2, jZzl) || !zzgk.zzf(zzhj.zzf(obj, j8), zzhj.zzf(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzf) {
                return false;
            }
        }
        return this.zzl.zzb(obj).equals(this.zzl.zzb(obj2));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    @Override // com.google.android.gms.internal.auth.zzgi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzi(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = 0
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r0
            r4 = r2
            r3 = r1
        L7:
            int r5 = r14.zzi
            r6 = 1
            if (r2 >= r5) goto Lcd
            int[] r5 = r14.zzh
            r9 = r5[r2]
            int[] r5 = r14.zzc
            r5 = r5[r9]
            int r13 = r14.zzo(r9)
            int[] r7 = r14.zzc
            int r8 = r9 + 2
            r7 = r7[r8]
            r8 = r7 & r1
            int r7 = r7 >>> 20
            int r12 = r6 << r7
            if (r8 == r3) goto L32
            if (r8 == r1) goto L2f
            long r3 = (long) r8
            sun.misc.Unsafe r6 = com.google.android.gms.internal.auth.zzga.zzb
            int r4 = r6.getInt(r15, r3)
        L2f:
            r11 = r4
            r10 = r8
            goto L34
        L32:
            r10 = r3
            r11 = r4
        L34:
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r3 = r3 & r13
            r7 = r14
            r8 = r15
            if (r3 == 0) goto L43
            boolean r15 = r7.zzF(r8, r9, r10, r11, r12)
            if (r15 == 0) goto L42
            goto L43
        L42:
            return r0
        L43:
            int r15 = zzn(r13)
            r3 = 9
            if (r15 == r3) goto Lb5
            r3 = 17
            if (r15 == r3) goto Lb5
            r3 = 27
            if (r15 == r3) goto L8d
            r3 = 60
            if (r15 == r3) goto L7c
            r3 = 68
            if (r15 == r3) goto L7c
            r3 = 49
            if (r15 == r3) goto L8d
            r3 = 50
            if (r15 == r3) goto L64
            goto Lc6
        L64:
            r15 = r13 & r1
            long r3 = (long) r15
            java.lang.Object r15 = com.google.android.gms.internal.auth.zzhj.zzf(r8, r3)
            com.google.android.gms.internal.auth.zzfr r15 = (com.google.android.gms.internal.auth.zzfr) r15
            boolean r15 = r15.isEmpty()
            if (r15 == 0) goto L74
            goto Lc6
        L74:
            java.lang.Object r15 = r14.zzs(r9)
            com.google.android.gms.internal.auth.zzfq r15 = (com.google.android.gms.internal.auth.zzfq) r15
            r15 = 0
            throw r15
        L7c:
            boolean r15 = r14.zzI(r8, r5, r9)
            if (r15 == 0) goto Lc6
            com.google.android.gms.internal.auth.zzgi r15 = r14.zzr(r9)
            boolean r15 = zzG(r8, r13, r15)
            if (r15 != 0) goto Lc6
            return r0
        L8d:
            r15 = r13 & r1
            long r3 = (long) r15
            java.lang.Object r15 = com.google.android.gms.internal.auth.zzhj.zzf(r8, r3)
            java.util.List r15 = (java.util.List) r15
            boolean r3 = r15.isEmpty()
            if (r3 != 0) goto Lc6
            com.google.android.gms.internal.auth.zzgi r3 = r14.zzr(r9)
            r4 = r0
        La1:
            int r5 = r15.size()
            if (r4 >= r5) goto Lc6
            java.lang.Object r5 = r15.get(r4)
            boolean r5 = r3.zzi(r5)
            if (r5 != 0) goto Lb2
            return r0
        Lb2:
            int r4 = r4 + 1
            goto La1
        Lb5:
            boolean r15 = r7.zzF(r8, r9, r10, r11, r12)
            if (r15 == 0) goto Lc6
            com.google.android.gms.internal.auth.zzgi r15 = r14.zzr(r9)
            boolean r15 = zzG(r8, r13, r15)
            if (r15 != 0) goto Lc6
            return r0
        Lc6:
            int r2 = r2 + 1
            r15 = r8
            r3 = r10
            r4 = r11
            goto L7
        Lcd:
            r7 = r14
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzga.zzi(java.lang.Object):boolean");
    }
}
