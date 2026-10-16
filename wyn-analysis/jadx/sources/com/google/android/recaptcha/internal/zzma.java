package com.google.android.recaptcha.internal;

import A7.AbstractC0279p0;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
final class zzma<T> implements zzmk<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzni.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlx zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zznb zzm;
    private final zzke zzn;

    private zzma(int[] iArr, Object[] objArr, int i5, int i10, zzlx zzlxVar, int i11, boolean z2, int[] iArr2, int i12, int i13, zzmd zzmdVar, zzlk zzlkVar, zznb zznbVar, zzke zzkeVar, zzls zzlsVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i5;
        this.zzf = i10;
        this.zzi = zzlxVar instanceof zzks;
        boolean z10 = false;
        if (zzkeVar != null && zzkeVar.zzj(zzlxVar)) {
            z10 = true;
        }
        this.zzh = z10;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzm = zznbVar;
        this.zzn = zzkeVar;
        this.zzg = zzlxVar;
    }

    private final Object zzA(Object obj, int i5) {
        zzmk zzmkVarZzx = zzx(i5);
        int iZzu = zzu(i5) & 1048575;
        if (!zzN(obj, i5)) {
            return zzmkVarZzx.zze();
        }
        Object object = zzb.getObject(obj, iZzu);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzmkVarZzx.zze();
        if (object != null) {
            zzmkVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i5, int i10) {
        zzmk zzmkVarZzx = zzx(i10);
        if (!zzR(obj, i5, i10)) {
            return zzmkVarZzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i10) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzmkVarZzx.zze();
        if (object != null) {
            zzmkVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzC(Class cls, String str) {
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

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i5) {
        if (zzN(obj2, i5)) {
            int iZzu = zzu(i5) & 1048575;
            Unsafe unsafe = zzb;
            long j8 = iZzu;
            Object object = unsafe.getObject(obj2, j8);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i5] + " is present but null: " + obj2.toString());
            }
            zzmk zzmkVarZzx = zzx(i5);
            if (!zzN(obj, i5)) {
                if (zzQ(object)) {
                    Object objZze = zzmkVarZzx.zze();
                    zzmkVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j8, objZze);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                zzH(obj, i5);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!zzQ(object2)) {
                Object objZze2 = zzmkVarZzx.zze();
                zzmkVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j8, objZze2);
                object2 = objZze2;
            }
            zzmkVarZzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i5) {
        int i10 = this.zzc[i5];
        if (zzR(obj2, i10, i5)) {
            int iZzu = zzu(i5) & 1048575;
            Unsafe unsafe = zzb;
            long j8 = iZzu;
            Object object = unsafe.getObject(obj2, j8);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i5] + " is present but null: " + obj2.toString());
            }
            zzmk zzmkVarZzx = zzx(i5);
            if (!zzR(obj, i10, i5)) {
                if (zzQ(object)) {
                    Object objZze = zzmkVarZzx.zze();
                    zzmkVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j8, objZze);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                zzI(obj, i10, i5);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!zzQ(object2)) {
                Object objZze2 = zzmkVarZzx.zze();
                zzmkVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j8, objZze2);
                object2 = objZze2;
            }
            zzmkVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i5, zzmj zzmjVar) throws IOException {
        long j8 = i5 & 1048575;
        if (zzM(i5)) {
            zzni.zzs(obj, j8, zzmjVar.zzs());
        } else if (this.zzi) {
            zzni.zzs(obj, j8, zzmjVar.zzr());
        } else {
            zzni.zzs(obj, j8, zzmjVar.zzp());
        }
    }

    private final void zzH(Object obj, int i5) {
        int iZzr = zzr(i5);
        long j8 = 1048575 & iZzr;
        if (j8 == 1048575) {
            return;
        }
        zzni.zzq(obj, j8, (1 << (iZzr >>> 20)) | zzni.zzc(obj, j8));
    }

    private final void zzI(Object obj, int i5, int i10) {
        zzni.zzq(obj, zzr(i10) & 1048575, i5);
    }

    private final void zzJ(Object obj, int i5, Object obj2) {
        zzb.putObject(obj, zzu(i5) & 1048575, obj2);
        zzH(obj, i5);
    }

    private final void zzK(Object obj, int i5, int i10, Object obj2) {
        zzb.putObject(obj, zzu(i10) & 1048575, obj2);
        zzI(obj, i5, i10);
    }

    private final boolean zzL(Object obj, Object obj2, int i5) {
        return zzN(obj, i5) == zzN(obj2, i5);
    }

    private static boolean zzM(int i5) {
        return (i5 & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i5) {
        int iZzr = zzr(i5);
        long j8 = iZzr & 1048575;
        if (j8 != 1048575) {
            return (zzni.zzc(obj, j8) & (1 << (iZzr >>> 20))) != 0;
        }
        int iZzu = zzu(i5);
        long j10 = iZzu & 1048575;
        switch (zzt(iZzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzni.zza(obj, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzni.zzb(obj, j10)) != 0;
            case 2:
                return zzni.zzd(obj, j10) != 0;
            case 3:
                return zzni.zzd(obj, j10) != 0;
            case 4:
                return zzni.zzc(obj, j10) != 0;
            case 5:
                return zzni.zzd(obj, j10) != 0;
            case 6:
                return zzni.zzc(obj, j10) != 0;
            case 7:
                return zzni.zzw(obj, j10);
            case 8:
                Object objZzf = zzni.zzf(obj, j10);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zziv) {
                    return !zziv.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzni.zzf(obj, j10) != null;
            case 10:
                return !zziv.zzb.equals(zzni.zzf(obj, j10));
            case 11:
                return zzni.zzc(obj, j10) != 0;
            case 12:
                return zzni.zzc(obj, j10) != 0;
            case 13:
                return zzni.zzc(obj, j10) != 0;
            case 14:
                return zzni.zzd(obj, j10) != 0;
            case 15:
                return zzni.zzc(obj, j10) != 0;
            case 16:
                return zzni.zzd(obj, j10) != 0;
            case 17:
                return zzni.zzf(obj, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i5, int i10, int i11, int i12) {
        return i10 == 1048575 ? zzN(obj, i5) : (i11 & i12) != 0;
    }

    private static boolean zzP(Object obj, int i5, zzmk zzmkVar) {
        return zzmkVar.zzl(zzni.zzf(obj, i5 & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzks) {
            return ((zzks) obj).zzI();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i5, int i10) {
        return zzni.zzc(obj, (long) (zzr(i10) & 1048575)) == i5;
    }

    private static boolean zzS(Object obj, long j8) {
        return ((Boolean) zzni.zzf(obj, j8)).booleanValue();
    }

    private static final void zzT(int i5, Object obj, zzno zznoVar) throws IOException {
        if (obj instanceof String) {
            zznoVar.zzG(i5, (String) obj);
        } else {
            zznoVar.zzd(i5, (zziv) obj);
        }
    }

    public static zznc zzd(Object obj) {
        zzks zzksVar = (zzks) obj;
        zznc zzncVar = zzksVar.zzc;
        if (zzncVar != zznc.zzc()) {
            return zzncVar;
        }
        zznc zzncVarZzf = zznc.zzf();
        zzksVar.zzc = zzncVarZzf;
        return zzncVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.recaptcha.internal.zzma zzm(java.lang.Class r32, com.google.android.recaptcha.internal.zzlu r33, com.google.android.recaptcha.internal.zzmd r34, com.google.android.recaptcha.internal.zzlk r35, com.google.android.recaptcha.internal.zznb r36, com.google.android.recaptcha.internal.zzke r37, com.google.android.recaptcha.internal.zzls r38) {
        /*
            Method dump skipped, instructions count: 1061
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzma.zzm(java.lang.Class, com.google.android.recaptcha.internal.zzlu, com.google.android.recaptcha.internal.zzmd, com.google.android.recaptcha.internal.zzlk, com.google.android.recaptcha.internal.zznb, com.google.android.recaptcha.internal.zzke, com.google.android.recaptcha.internal.zzls):com.google.android.recaptcha.internal.zzma");
    }

    private static double zzn(Object obj, long j8) {
        return ((Double) zzni.zzf(obj, j8)).doubleValue();
    }

    private static float zzo(Object obj, long j8) {
        return ((Float) zzni.zzf(obj, j8)).floatValue();
    }

    private static int zzp(Object obj, long j8) {
        return ((Integer) zzni.zzf(obj, j8)).intValue();
    }

    private final int zzq(int i5) {
        if (i5 < this.zze || i5 > this.zzf) {
            return -1;
        }
        return zzs(i5, 0);
    }

    private final int zzr(int i5) {
        return this.zzc[i5 + 2];
    }

    private final int zzs(int i5, int i10) {
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

    private static int zzt(int i5) {
        return (i5 >>> 20) & 255;
    }

    private final int zzu(int i5) {
        return this.zzc[i5 + 1];
    }

    private static long zzv(Object obj, long j8) {
        return ((Long) zzni.zzf(obj, j8)).longValue();
    }

    private final zzkw zzw(int i5) {
        int i10 = i5 / 3;
        return (zzkw) this.zzd[i10 + i10 + 1];
    }

    private final zzmk zzx(int i5) {
        Object[] objArr = this.zzd;
        int i10 = i5 / 3;
        int i11 = i10 + i10;
        zzmk zzmkVar = (zzmk) objArr[i11];
        if (zzmkVar != null) {
            return zzmkVar;
        }
        zzmk zzmkVarZzb = zzmg.zza().zzb((Class) objArr[i11 + 1]);
        this.zzd[i11] = zzmkVarZzb;
        return zzmkVarZzb;
    }

    private final Object zzy(Object obj, int i5, Object obj2, zznb zznbVar, Object obj3) {
        int i10 = this.zzc[i5];
        Object objZzf = zzni.zzf(obj, zzu(i5) & 1048575);
        if (objZzf == null || zzw(i5) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i5) {
        int i10 = i5 / 3;
        return this.zzd[i10 + i10];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0211  */
    @Override // com.google.android.recaptcha.internal.zzmk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 2078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzma.zza(java.lang.Object):int");
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final int zzb(Object obj) {
        int i5;
        long jDoubleToLongBits;
        int i10;
        int iFloatToIntBits;
        int iZzc;
        int i11;
        int i12 = 0;
        for (int i13 = 0; i13 < this.zzc.length; i13 += 3) {
            int iZzu = zzu(i13);
            int[] iArr = this.zzc;
            int i14 = 1048575 & iZzu;
            int iZzt = zzt(iZzu);
            int i15 = iArr[i13];
            long j8 = i14;
            int iHashCode = 37;
            switch (iZzt) {
                case 0:
                    i5 = i12 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzni.zza(obj, j8));
                    byte[] bArr = zzla.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i5 + iZzc;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzni.zzb(obj, j8));
                    i12 = iFloatToIntBits + i10;
                    break;
                case 2:
                    i5 = i12 * 53;
                    jDoubleToLongBits = zzni.zzd(obj, j8);
                    byte[] bArr2 = zzla.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i5 + iZzc;
                    break;
                case 3:
                    i5 = i12 * 53;
                    jDoubleToLongBits = zzni.zzd(obj, j8);
                    byte[] bArr3 = zzla.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i5 + iZzc;
                    break;
                case 4:
                    i5 = i12 * 53;
                    iZzc = zzni.zzc(obj, j8);
                    i12 = i5 + iZzc;
                    break;
                case 5:
                    i5 = i12 * 53;
                    jDoubleToLongBits = zzni.zzd(obj, j8);
                    byte[] bArr4 = zzla.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i5 + iZzc;
                    break;
                case 6:
                    i5 = i12 * 53;
                    iZzc = zzni.zzc(obj, j8);
                    i12 = i5 + iZzc;
                    break;
                case 7:
                    i10 = i12 * 53;
                    iFloatToIntBits = zzla.zza(zzni.zzw(obj, j8));
                    i12 = iFloatToIntBits + i10;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iFloatToIntBits = ((String) zzni.zzf(obj, j8)).hashCode();
                    i12 = iFloatToIntBits + i10;
                    break;
                case 9:
                    i11 = i12 * 53;
                    Object objZzf = zzni.zzf(obj, j8);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i12 = i11 + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iFloatToIntBits = zzni.zzf(obj, j8).hashCode();
                    i12 = iFloatToIntBits + i10;
                    break;
                case 11:
                    i5 = i12 * 53;
                    iZzc = zzni.zzc(obj, j8);
                    i12 = i5 + iZzc;
                    break;
                case 12:
                    i5 = i12 * 53;
                    iZzc = zzni.zzc(obj, j8);
                    i12 = i5 + iZzc;
                    break;
                case 13:
                    i5 = i12 * 53;
                    iZzc = zzni.zzc(obj, j8);
                    i12 = i5 + iZzc;
                    break;
                case 14:
                    i5 = i12 * 53;
                    jDoubleToLongBits = zzni.zzd(obj, j8);
                    byte[] bArr5 = zzla.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i5 + iZzc;
                    break;
                case 15:
                    i5 = i12 * 53;
                    iZzc = zzni.zzc(obj, j8);
                    i12 = i5 + iZzc;
                    break;
                case 16:
                    i5 = i12 * 53;
                    jDoubleToLongBits = zzni.zzd(obj, j8);
                    byte[] bArr6 = zzla.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i5 + iZzc;
                    break;
                case 17:
                    i11 = i12 * 53;
                    Object objZzf2 = zzni.zzf(obj, j8);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i12 = i11 + iHashCode;
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
                    i10 = i12 * 53;
                    iFloatToIntBits = zzni.zzf(obj, j8).hashCode();
                    i12 = iFloatToIntBits + i10;
                    break;
                case 50:
                    i10 = i12 * 53;
                    iFloatToIntBits = zzni.zzf(obj, j8).hashCode();
                    i12 = iFloatToIntBits + i10;
                    break;
                case 51:
                    if (zzR(obj, i15, i13)) {
                        i5 = i12 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzn(obj, j8));
                        byte[] bArr7 = zzla.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i5 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzo(obj, j8));
                        i12 = iFloatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i15, i13)) {
                        i5 = i12 * 53;
                        jDoubleToLongBits = zzv(obj, j8);
                        byte[] bArr8 = zzla.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i5 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i15, i13)) {
                        i5 = i12 * 53;
                        jDoubleToLongBits = zzv(obj, j8);
                        byte[] bArr9 = zzla.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i5 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i15, i13)) {
                        i5 = i12 * 53;
                        iZzc = zzp(obj, j8);
                        i12 = i5 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i15, i13)) {
                        i5 = i12 * 53;
                        jDoubleToLongBits = zzv(obj, j8);
                        byte[] bArr10 = zzla.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i5 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i15, i13)) {
                        i5 = i12 * 53;
                        iZzc = zzp(obj, j8);
                        i12 = i5 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzla.zza(zzS(obj, j8));
                        i12 = iFloatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = ((String) zzni.zzf(obj, j8)).hashCode();
                        i12 = iFloatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzni.zzf(obj, j8).hashCode();
                        i12 = iFloatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzni.zzf(obj, j8).hashCode();
                        i12 = iFloatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i15, i13)) {
                        i5 = i12 * 53;
                        iZzc = zzp(obj, j8);
                        i12 = i5 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i15, i13)) {
                        i5 = i12 * 53;
                        iZzc = zzp(obj, j8);
                        i12 = i5 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i15, i13)) {
                        i5 = i12 * 53;
                        iZzc = zzp(obj, j8);
                        i12 = i5 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i15, i13)) {
                        i5 = i12 * 53;
                        jDoubleToLongBits = zzv(obj, j8);
                        byte[] bArr11 = zzla.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i5 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i15, i13)) {
                        i5 = i12 * 53;
                        iZzc = zzp(obj, j8);
                        i12 = i5 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i15, i13)) {
                        i5 = i12 * 53;
                        jDoubleToLongBits = zzv(obj, j8);
                        byte[] bArr12 = zzla.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i5 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzni.zzf(obj, j8).hashCode();
                        i12 = iFloatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = this.zzm.zzd(obj).hashCode() + (i12 * 53);
        return this.zzh ? (iHashCode2 * 53) + this.zzn.zzb(obj).zza.hashCode() : iHashCode2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:523:0x0d63, code lost:
    
        if (r14 == r1) goto L525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0d65, code lost:
    
        r23.putInt(r8, r14, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0d6b, code lost:
    
        r9 = r0.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0d70, code lost:
    
        if (r9 >= r0.zzl) goto L628;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0d72, code lost:
    
        r0.zzy(r8, r0.zzj[r9], null, r0.zzm, r31);
        r9 = r9 + 1;
        r0 = r30;
        r8 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0d88, code lost:
    
        if (r10 != 0) goto L534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0d8a, code lost:
    
        if (r7 != r12) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0d91, code lost:
    
        throw com.google.android.recaptcha.internal.zzlc.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0d92, code lost:
    
        if (r7 > r12) goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0d94, code lost:
    
        if (r6 != r10) goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0d96, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0d9b, code lost:
    
        throw com.google.android.recaptcha.internal.zzlc.zzg();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:575:0x094b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0c0c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:614:0x095c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0c1e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, com.google.android.recaptcha.internal.zzik r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 3668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzma.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzik):int");
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final Object zze() {
        return ((zzks) this.zzg).zzt();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    @Override // com.google.android.recaptcha.internal.zzmk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = zzQ(r8)
            if (r0 != 0) goto L8
            goto L95
        L8:
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zzks
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.recaptcha.internal.zzks r0 = (com.google.android.recaptcha.internal.zzks) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzG(r2)
            r0.zza = r1
            r0.zzE()
        L1b:
            int[] r0 = r7.zzc
        L1d:
            int r2 = r0.length
            if (r1 >= r2) goto L87
            int r2 = r7.zzu(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zzt(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L71
            r5 = 60
            if (r2 == r5) goto L59
            r5 = 68
            if (r2 == r5) goto L59
            switch(r2) {
                case 17: goto L71;
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
            goto L84
        L3d:
            sun.misc.Unsafe r2 = com.google.android.recaptcha.internal.zzma.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L84
            r6 = r5
            com.google.android.recaptcha.internal.zzlr r6 = (com.google.android.recaptcha.internal.zzlr) r6
            r6.zzc()
            r2.putObject(r8, r3, r5)
            goto L84
        L4f:
            java.lang.Object r2 = com.google.android.recaptcha.internal.zzni.zzf(r8, r3)
            com.google.android.recaptcha.internal.zzkz r2 = (com.google.android.recaptcha.internal.zzkz) r2
            r2.zzb()
            goto L84
        L59:
            int[] r2 = r7.zzc
            r2 = r2[r1]
            boolean r2 = r7.zzR(r8, r2, r1)
            if (r2 == 0) goto L84
            com.google.android.recaptcha.internal.zzmk r2 = r7.zzx(r1)
            sun.misc.Unsafe r5 = com.google.android.recaptcha.internal.zzma.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
            goto L84
        L71:
            boolean r2 = r7.zzN(r8, r1)
            if (r2 == 0) goto L84
            com.google.android.recaptcha.internal.zzmk r2 = r7.zzx(r1)
            sun.misc.Unsafe r5 = com.google.android.recaptcha.internal.zzma.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
        L84:
            int r1 = r1 + 3
            goto L1d
        L87:
            com.google.android.recaptcha.internal.zznb r0 = r7.zzm
            r0.zzm(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L95
            com.google.android.recaptcha.internal.zzke r0 = r7.zzn
            r0.zzf(r8)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzma.zzf(java.lang.Object):void");
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int iZzu = zzu(i5);
            int i10 = 1048575 & iZzu;
            int[] iArr = this.zzc;
            int iZzt = zzt(iZzu);
            int i11 = iArr[i5];
            long j8 = i10;
            switch (iZzt) {
                case 0:
                    if (zzN(obj2, i5)) {
                        zzni.zzo(obj, j8, zzni.zza(obj2, j8));
                        zzH(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i5)) {
                        zzni.zzp(obj, j8, zzni.zzb(obj2, j8));
                        zzH(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i5)) {
                        zzni.zzr(obj, j8, zzni.zzd(obj2, j8));
                        zzH(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i5)) {
                        zzni.zzr(obj, j8, zzni.zzd(obj2, j8));
                        zzH(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i5)) {
                        zzni.zzq(obj, j8, zzni.zzc(obj2, j8));
                        zzH(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i5)) {
                        zzni.zzr(obj, j8, zzni.zzd(obj2, j8));
                        zzH(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i5)) {
                        zzni.zzq(obj, j8, zzni.zzc(obj2, j8));
                        zzH(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i5)) {
                        zzni.zzm(obj, j8, zzni.zzw(obj2, j8));
                        zzH(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i5)) {
                        zzni.zzs(obj, j8, zzni.zzf(obj2, j8));
                        zzH(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i5);
                    break;
                case 10:
                    if (zzN(obj2, i5)) {
                        zzni.zzs(obj, j8, zzni.zzf(obj2, j8));
                        zzH(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i5)) {
                        zzni.zzq(obj, j8, zzni.zzc(obj2, j8));
                        zzH(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i5)) {
                        zzni.zzq(obj, j8, zzni.zzc(obj2, j8));
                        zzH(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i5)) {
                        zzni.zzq(obj, j8, zzni.zzc(obj2, j8));
                        zzH(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i5)) {
                        zzni.zzr(obj, j8, zzni.zzd(obj2, j8));
                        zzH(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i5)) {
                        zzni.zzq(obj, j8, zzni.zzc(obj2, j8));
                        zzH(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i5)) {
                        zzni.zzr(obj, j8, zzni.zzd(obj2, j8));
                        zzH(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i5);
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
                    zzkz zzkzVarZzd = (zzkz) zzni.zzf(obj, j8);
                    zzkz zzkzVar = (zzkz) zzni.zzf(obj2, j8);
                    int size = zzkzVarZzd.size();
                    int size2 = zzkzVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzkzVarZzd.zzc()) {
                            zzkzVarZzd = zzkzVarZzd.zzd(size2 + size);
                        }
                        zzkzVarZzd.addAll(zzkzVar);
                    }
                    if (size > 0) {
                        zzkzVar = zzkzVarZzd;
                    }
                    zzni.zzs(obj, j8, zzkzVar);
                    break;
                case 50:
                    int i12 = zzmm.zza;
                    zzni.zzs(obj, j8, zzls.zzb(zzni.zzf(obj, j8), zzni.zzf(obj2, j8)));
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
                    if (zzR(obj2, i11, i5)) {
                        zzni.zzs(obj, j8, zzni.zzf(obj2, j8));
                        zzI(obj, i11, i5);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzF(obj, obj2, i5);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i11, i5)) {
                        zzni.zzs(obj, j8, zzni.zzf(obj2, j8));
                        zzI(obj, i11, i5);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzF(obj, obj2, i5);
                    break;
            }
        }
        zzmm.zzr(this.zzm, obj, obj2);
        if (this.zzh) {
            zzmm.zzq(this.zzn, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x07a3 A[Catch: all -> 0x07a9, TRY_LEAVE, TryCatch #4 {all -> 0x07a9, blocks: (B:193:0x079e, B:195:0x07a3), top: B:231:0x079e }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x07e6 A[LOOP:2: B:217:0x07e2->B:219:0x07e6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x07b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:344:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzmk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.Object r18, com.google.android.recaptcha.internal.zzmj r19, com.google.android.recaptcha.internal.zzkd r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2186
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzma.zzh(java.lang.Object, com.google.android.recaptcha.internal.zzmj, com.google.android.recaptcha.internal.zzkd):void");
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final void zzi(Object obj, byte[] bArr, int i5, int i10, zzik zzikVar) throws Throwable {
        zzc(obj, bArr, i5, i10, 0, zzikVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    @Override // com.google.android.recaptcha.internal.zzmk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzj(java.lang.Object r20, com.google.android.recaptcha.internal.zzno r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzma.zzj(java.lang.Object, com.google.android.recaptcha.internal.zzno):void");
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final boolean zzk(Object obj, Object obj2) {
        boolean zZzH;
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int iZzu = zzu(i5);
            long j8 = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i5) || Double.doubleToLongBits(zzni.zza(obj, j8)) != Double.doubleToLongBits(zzni.zza(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i5) || Float.floatToIntBits(zzni.zzb(obj, j8)) != Float.floatToIntBits(zzni.zzb(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i5) || zzni.zzd(obj, j8) != zzni.zzd(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i5) || zzni.zzd(obj, j8) != zzni.zzd(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i5) || zzni.zzc(obj, j8) != zzni.zzc(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i5) || zzni.zzd(obj, j8) != zzni.zzd(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i5) || zzni.zzc(obj, j8) != zzni.zzc(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i5) || zzni.zzw(obj, j8) != zzni.zzw(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i5) || !zzmm.zzH(zzni.zzf(obj, j8), zzni.zzf(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i5) || !zzmm.zzH(zzni.zzf(obj, j8), zzni.zzf(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i5) || !zzmm.zzH(zzni.zzf(obj, j8), zzni.zzf(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i5) || zzni.zzc(obj, j8) != zzni.zzc(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i5) || zzni.zzc(obj, j8) != zzni.zzc(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i5) || zzni.zzc(obj, j8) != zzni.zzc(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i5) || zzni.zzd(obj, j8) != zzni.zzd(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i5) || zzni.zzc(obj, j8) != zzni.zzc(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i5) || zzni.zzd(obj, j8) != zzni.zzd(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i5) || !zzmm.zzH(zzni.zzf(obj, j8), zzni.zzf(obj2, j8))) {
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
                    zZzH = zzmm.zzH(zzni.zzf(obj, j8), zzni.zzf(obj2, j8));
                    break;
                case 50:
                    zZzH = zzmm.zzH(zzni.zzf(obj, j8), zzni.zzf(obj2, j8));
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
                    long jZzr = zzr(i5) & 1048575;
                    if (zzni.zzc(obj, jZzr) != zzni.zzc(obj2, jZzr) || !zzmm.zzH(zzni.zzf(obj, j8), zzni.zzf(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzH) {
                return false;
            }
        }
        if (!this.zzm.zzd(obj).equals(this.zzm.zzd(obj2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzn.zzb(obj).equals(this.zzn.zzb(obj2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    @Override // com.google.android.recaptcha.internal.zzmk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzl(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzma.zzl(java.lang.Object):boolean");
    }
}
