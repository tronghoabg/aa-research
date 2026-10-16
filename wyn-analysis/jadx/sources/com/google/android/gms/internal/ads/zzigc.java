package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import ka.AbstractC3256n;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class zzigc<T> implements zzigr<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzihk.zzr();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzifz zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzihd zzm;
    private final zziea zzn;

    private zzigc(int[] iArr, Object[] objArr, int i5, int i10, zzifz zzifzVar, boolean z2, int[] iArr2, int i11, int i12, zzigf zzigfVar, zzifl zziflVar, zzihd zzihdVar, zziea zzieaVar, zzifu zzifuVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i5;
        this.zzf = i10;
        this.zzi = zzifzVar instanceof zziep;
        boolean z10 = false;
        if (zzieaVar != null && (zzifzVar instanceof zziel)) {
            z10 = true;
        }
        this.zzh = z10;
        this.zzj = iArr2;
        this.zzk = i11;
        this.zzl = i12;
        this.zzm = zzihdVar;
        this.zzn = zzieaVar;
        this.zzg = zzifzVar;
    }

    private final int zzA(int i5) {
        return this.zzc[i5 + 1];
    }

    private final int zzB(int i5) {
        return this.zzc[i5 + 2];
    }

    private static int zzC(int i5) {
        return (i5 >>> 20) & 255;
    }

    private static boolean zzD(int i5) {
        return (i5 & 536870912) != 0;
    }

    private static boolean zzE(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zziep) {
            return ((zziep) obj).zzaX();
        }
        return true;
    }

    private static void zzF(Object obj) {
        if (!zzE(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static int zzG(Object obj, long j8) {
        return ((Integer) zzihk.zzm(obj, j8)).intValue();
    }

    private static long zzH(Object obj, long j8) {
        return ((Long) zzihk.zzm(obj, j8)).longValue();
    }

    private final boolean zzI(Object obj, Object obj2, int i5) {
        return zzK(obj, i5) == zzK(obj2, i5);
    }

    private final boolean zzJ(Object obj, int i5, int i10, int i11, int i12) {
        return i10 == 1048575 ? zzK(obj, i5) : (i11 & i12) != 0;
    }

    private final boolean zzK(Object obj, int i5) {
        int iZzB = zzB(i5);
        long j8 = iZzB & 1048575;
        if (j8 != 1048575) {
            return (zzihk.zzc(obj, j8) & (1 << (iZzB >>> 20))) != 0;
        }
        int iZzA = zzA(i5);
        long j10 = iZzA & 1048575;
        switch (zzC(iZzA)) {
            case 0:
                return Double.doubleToRawLongBits(zzihk.zzk(obj, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzihk.zzi(obj, j10)) != 0;
            case 2:
                return zzihk.zze(obj, j10) != 0;
            case 3:
                return zzihk.zze(obj, j10) != 0;
            case 4:
                return zzihk.zzc(obj, j10) != 0;
            case 5:
                return zzihk.zze(obj, j10) != 0;
            case 6:
                return zzihk.zzc(obj, j10) != 0;
            case 7:
                return zzihk.zzg(obj, j10);
            case 8:
                Object objZzm = zzihk.zzm(obj, j10);
                return objZzm instanceof String ? !((String) objZzm).isEmpty() : objZzm instanceof zzidl ? !zzidl.zza.equals(objZzm) : zzR();
            case 9:
                return zzihk.zzm(obj, j10) != null;
            case 10:
                return !zzidl.zza.equals(zzihk.zzm(obj, j10));
            case 11:
                return zzihk.zzc(obj, j10) != 0;
            case 12:
                return zzihk.zzc(obj, j10) != 0;
            case 13:
                return zzihk.zzc(obj, j10) != 0;
            case 14:
                return zzihk.zze(obj, j10) != 0;
            case 15:
                return zzihk.zzc(obj, j10) != 0;
            case 16:
                return zzihk.zze(obj, j10) != 0;
            case 17:
                return zzihk.zzm(obj, j10) != null;
            default:
                return zzR();
        }
    }

    private final void zzL(Object obj, int i5) {
        int iZzB = zzB(i5);
        long j8 = 1048575 & iZzB;
        if (j8 == 1048575) {
            return;
        }
        zzihk.zzd(obj, j8, (1 << (iZzB >>> 20)) | zzihk.zzc(obj, j8));
    }

    private final boolean zzM(Object obj, int i5, int i10) {
        return zzihk.zzc(obj, (long) (zzB(i10) & 1048575)) == i5;
    }

    private final boolean zzN(Object obj, Object obj2, int i5) {
        long jZzB = zzB(i5) & 1048575;
        return zzihk.zzc(obj, jZzB) == zzihk.zzc(obj2, jZzB);
    }

    private final void zzO(Object obj, int i5, int i10) {
        zzihk.zzd(obj, zzB(i10) & 1048575, i5);
    }

    private final int zzP(int i5) {
        if (i5 < this.zze || i5 > this.zzf) {
            return -1;
        }
        return zzQ(i5, 0);
    }

    private final int zzQ(int i5, int i10) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int i13 = iArr[i12];
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

    private boolean zzR() {
        throw new IllegalArgumentException();
    }

    private static final int zzS(byte[] bArr, int i5, int i10, zzihq zzihqVar, Class cls, zzicz zziczVar) throws IOException {
        zzihq zzihqVar2 = zzihq.zza;
        switch (zzihqVar.ordinal()) {
            case 0:
                int i11 = i5 + 8;
                zziczVar.zzc = Double.valueOf(Double.longBitsToDouble(zzida.zze(bArr, i5)));
                return i11;
            case 1:
                int i12 = i5 + 4;
                zziczVar.zzc = Float.valueOf(Float.intBitsToFloat(zzida.zzd(bArr, i5)));
                return i12;
            case 2:
            case 3:
                int iZzc = zzida.zzc(bArr, i5, zziczVar);
                zziczVar.zzc = Long.valueOf(zziczVar.zzb);
                return iZzc;
            case 4:
            case 12:
            case 13:
                int iZza = zzida.zza(bArr, i5, zziczVar);
                zziczVar.zzc = Integer.valueOf(zziczVar.zza);
                return iZza;
            case 5:
            case 15:
                int i13 = i5 + 8;
                zziczVar.zzc = Long.valueOf(zzida.zze(bArr, i5));
                return i13;
            case 6:
            case 14:
                int i14 = i5 + 4;
                zziczVar.zzc = Integer.valueOf(zzida.zzd(bArr, i5));
                return i14;
            case 7:
                int iZzc2 = zzida.zzc(bArr, i5, zziczVar);
                zziczVar.zzc = Boolean.valueOf(zziczVar.zzb != 0);
                return iZzc2;
            case 8:
                return zzida.zzf(bArr, i5, zziczVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return zzida.zzh(zzigj.zza().zzb(cls), bArr, i5, i10, zziczVar);
            case 11:
                return zzida.zzg(bArr, i5, zziczVar);
            case 16:
                int iZza2 = zzida.zza(bArr, i5, zziczVar);
                zziczVar.zzc = Integer.valueOf(zzidp.zzM(zziczVar.zza));
                return iZza2;
            case 17:
                int iZzc3 = zzida.zzc(bArr, i5, zziczVar);
                zziczVar.zzc = Long.valueOf(zzidp.zzN(zziczVar.zzb));
                return iZzc3;
        }
    }

    private static final void zzT(int i5, Object obj, zzihs zzihsVar) throws IOException {
        if (obj instanceof String) {
            zzihsVar.zzm(i5, (String) obj);
        } else {
            zzihsVar.zzn(i5, (zzidl) obj);
        }
    }

    public static zzihe zzh(Object obj) {
        zziep zziepVar = (zziep) obj;
        zzihe zziheVar = zziepVar.zzt;
        if (zziheVar != zzihe.zza()) {
            return zziheVar;
        }
        zzihe zziheVarZzb = zzihe.zzb();
        zziepVar.zzt = zziheVarZzb;
        return zziheVarZzb;
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzigc zzm(java.lang.Class r31, com.google.android.gms.internal.ads.zzifw r32, com.google.android.gms.internal.ads.zzigf r33, com.google.android.gms.internal.ads.zzifl r34, com.google.android.gms.internal.ads.zzihd r35, com.google.android.gms.internal.ads.zziea r36, com.google.android.gms.internal.ads.zzifu r37) {
        /*
            Method dump skipped, instructions count: 1048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzigc.zzm(java.lang.Class, com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzigf, com.google.android.gms.internal.ads.zzifl, com.google.android.gms.internal.ads.zzihd, com.google.android.gms.internal.ads.zziea, com.google.android.gms.internal.ads.zzifu):com.google.android.gms.internal.ads.zzigc");
    }

    private static Field zzn(Class cls, String str) {
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
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            AbstractC3256n.p(sb2, "Field ", str, " for ", name);
            throw new RuntimeException(wg.b.c(sb2, " not found. Known fields are ", string), e7);
        }
    }

    private final void zzo(Object obj, Object obj2, int i5) {
        if (zzK(obj2, i5)) {
            int iZzA = zzA(i5) & 1048575;
            Unsafe unsafe = zzb;
            long j8 = iZzA;
            Object object = unsafe.getObject(obj2, j8);
            if (object == null) {
                int i10 = this.zzc[i5];
                String string = obj2.toString();
                StringBuilder sb2 = new StringBuilder(AbstractC0279p0.f(i10, 38) + string.length());
                sb2.append("Source subfield ");
                sb2.append(i10);
                sb2.append(" is present but null: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            zzigr zzigrVarZzq = zzq(i5);
            if (!zzK(obj, i5)) {
                if (zzE(object)) {
                    Object objZza = zzigrVarZzq.zza();
                    zzigrVarZzq.zzd(objZza, object);
                    unsafe.putObject(obj, j8, objZza);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                zzL(obj, i5);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!zzE(object2)) {
                Object objZza2 = zzigrVarZzq.zza();
                zzigrVarZzq.zzd(objZza2, object2);
                unsafe.putObject(obj, j8, objZza2);
                object2 = objZza2;
            }
            zzigrVarZzq.zzd(object2, object);
        }
    }

    private final void zzp(Object obj, Object obj2, int i5) {
        int[] iArr = this.zzc;
        int i10 = iArr[i5];
        if (zzM(obj2, i10, i5)) {
            int iZzA = zzA(i5) & 1048575;
            Unsafe unsafe = zzb;
            long j8 = iZzA;
            Object object = unsafe.getObject(obj2, j8);
            if (object == null) {
                int i11 = iArr[i5];
                String string = obj2.toString();
                StringBuilder sb2 = new StringBuilder(AbstractC0279p0.f(i11, 38) + string.length());
                sb2.append("Source subfield ");
                sb2.append(i11);
                sb2.append(" is present but null: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            zzigr zzigrVarZzq = zzq(i5);
            if (!zzM(obj, i10, i5)) {
                if (zzE(object)) {
                    Object objZza = zzigrVarZzq.zza();
                    zzigrVarZzq.zzd(objZza, object);
                    unsafe.putObject(obj, j8, objZza);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                zzO(obj, i10, i5);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!zzE(object2)) {
                Object objZza2 = zzigrVarZzq.zza();
                zzigrVarZzq.zzd(objZza2, object2);
                unsafe.putObject(obj, j8, objZza2);
                object2 = objZza2;
            }
            zzigrVarZzq.zzd(object2, object);
        }
    }

    private final zzigr zzq(int i5) {
        Object[] objArr = this.zzd;
        int i10 = i5 / 3;
        int i11 = i10 + i10;
        zzigr zzigrVar = (zzigr) objArr[i11];
        if (zzigrVar != null) {
            return zzigrVar;
        }
        zzigr zzigrVarZzb = zzigj.zza().zzb((Class) objArr[i11 + 1]);
        objArr[i11] = zzigrVarZzb;
        return zzigrVarZzb;
    }

    private final Object zzr(int i5) {
        int i10 = i5 / 3;
        return this.zzd[i10 + i10];
    }

    private final zziev zzs(int i5) {
        int i10 = i5 / 3;
        return (zziev) this.zzd[i10 + i10 + 1];
    }

    private final Object zzt(Object obj, int i5) {
        zzigr zzigrVarZzq = zzq(i5);
        int iZzA = zzA(i5) & 1048575;
        if (!zzK(obj, i5)) {
            return zzigrVarZzq.zza();
        }
        Object object = zzb.getObject(obj, iZzA);
        if (zzE(object)) {
            return object;
        }
        Object objZza = zzigrVarZzq.zza();
        if (object != null) {
            zzigrVarZzq.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzu(Object obj, int i5, Object obj2) {
        zzb.putObject(obj, zzA(i5) & 1048575, obj2);
        zzL(obj, i5);
    }

    private final Object zzv(Object obj, int i5, int i10) {
        zzigr zzigrVarZzq = zzq(i10);
        if (!zzM(obj, i5, i10)) {
            return zzigrVarZzq.zza();
        }
        Object object = zzb.getObject(obj, zzA(i10) & 1048575);
        if (zzE(object)) {
            return object;
        }
        Object objZza = zzigrVarZzq.zza();
        if (object != null) {
            zzigrVarZzq.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzw(Object obj, int i5, int i10, Object obj2) {
        zzb.putObject(obj, zzA(i10) & 1048575, obj2);
        zzO(obj, i5, i10);
    }

    private final Object zzx(Object obj, int i5, Object obj2, zzihd zzihdVar, Object obj3) {
        zziev zzievVarZzs;
        int i10 = this.zzc[i5];
        Object objZzm = zzihk.zzm(obj, zzA(i5) & 1048575);
        if (objZzm == null || (zzievVarZzs = zzs(i5)) == null) {
            return obj2;
        }
        zzifr zzifrVarZze = ((zzifs) zzr(i5)).zze();
        Iterator it = ((zzift) objZzm).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzievVarZzs.zza(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = zzihdVar.zzh(obj3);
                }
                int iZzc = zzifs.zzc(zzifrVarZze, entry.getKey(), entry.getValue());
                zzidl zzidlVar = zzidl.zza;
                byte[] bArr = new byte[iZzc];
                int i11 = zzidu.zzb;
                zzidr zzidrVar = new zzidr(bArr, 0, iZzc);
                try {
                    zzifs.zzb(zzidrVar, zzifrVarZze, entry.getKey(), entry.getValue());
                    zzihdVar.zzd(obj2, i10, zzidh.zza(zzidrVar, bArr));
                    it.remove();
                } catch (IOException e7) {
                    throw new RuntimeException(e7);
                }
            }
        }
        return obj2;
    }

    private static boolean zzy(Object obj, int i5, zzigr zzigrVar) {
        return zzigrVar.zzl(zzihk.zzm(obj, i5 & 1048575));
    }

    private final void zzz(Object obj, int i5, zzigm zzigmVar) throws IOException {
        long j8 = i5 & 1048575;
        if (zzD(i5)) {
            zzihk.zzn(obj, j8, zzigmVar.zzn());
        } else if (this.zzi) {
            zzihk.zzn(obj, j8, zzigmVar.zzm());
        } else {
            zzihk.zzn(obj, j8, zzigmVar.zzq());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigr
    public final Object zza() {
        return ((zziep) this.zzg).zzbg();
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x01bf, code lost:
    
        continue;
     */
    @Override // com.google.android.gms.internal.ads.zzigr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzb(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzigc.zzb(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzigr
    public final int zzc(Object obj) {
        int i5;
        long jDoubleToLongBits;
        int i10;
        int iFloatToIntBits;
        int iZzc;
        int i11;
        int iHashCode = 0;
        for (int i12 = 0; i12 < this.zzc.length; i12 += 3) {
            int iZzA = zzA(i12);
            int iZzC = zzC(iZzA);
            if (iZzC <= 50 || iZzC >= 69) {
                long j8 = iZzA & 1048575;
                int iHashCode2 = 37;
                switch (iZzC) {
                    case 0:
                        i5 = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzihk.zzk(obj, j8));
                        byte[] bArr = zzifc.zza;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i5 + iZzc;
                        break;
                    case 1:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzihk.zzi(obj, j8));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 2:
                        i5 = iHashCode * 53;
                        jDoubleToLongBits = zzihk.zze(obj, j8);
                        byte[] bArr2 = zzifc.zza;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i5 + iZzc;
                        break;
                    case 3:
                        i5 = iHashCode * 53;
                        jDoubleToLongBits = zzihk.zze(obj, j8);
                        byte[] bArr3 = zzifc.zza;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i5 + iZzc;
                        break;
                    case 4:
                        i5 = iHashCode * 53;
                        iZzc = zzihk.zzc(obj, j8);
                        iHashCode = i5 + iZzc;
                        break;
                    case 5:
                        i5 = iHashCode * 53;
                        jDoubleToLongBits = zzihk.zze(obj, j8);
                        byte[] bArr4 = zzifc.zza;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i5 + iZzc;
                        break;
                    case 6:
                        i5 = iHashCode * 53;
                        iZzc = zzihk.zzc(obj, j8);
                        iHashCode = i5 + iZzc;
                        break;
                    case 7:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzifc.zzb(zzihk.zzg(obj, j8));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 8:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = ((String) zzihk.zzm(obj, j8)).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 9:
                        i11 = iHashCode * 53;
                        Object objZzm = zzihk.zzm(obj, j8);
                        if (objZzm != null) {
                            iHashCode2 = objZzm.hashCode();
                        }
                        iHashCode = i11 + iHashCode2;
                        break;
                    case 10:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzihk.zzm(obj, j8).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 11:
                        i5 = iHashCode * 53;
                        iZzc = zzihk.zzc(obj, j8);
                        iHashCode = i5 + iZzc;
                        break;
                    case 12:
                        i5 = iHashCode * 53;
                        iZzc = zzihk.zzc(obj, j8);
                        iHashCode = i5 + iZzc;
                        break;
                    case 13:
                        i5 = iHashCode * 53;
                        iZzc = zzihk.zzc(obj, j8);
                        iHashCode = i5 + iZzc;
                        break;
                    case 14:
                        i5 = iHashCode * 53;
                        jDoubleToLongBits = zzihk.zze(obj, j8);
                        byte[] bArr5 = zzifc.zza;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i5 + iZzc;
                        break;
                    case 15:
                        i5 = iHashCode * 53;
                        iZzc = zzihk.zzc(obj, j8);
                        iHashCode = i5 + iZzc;
                        break;
                    case 16:
                        i5 = iHashCode * 53;
                        jDoubleToLongBits = zzihk.zze(obj, j8);
                        byte[] bArr6 = zzifc.zza;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i5 + iZzc;
                        break;
                    case 17:
                        i11 = iHashCode * 53;
                        Object objZzm2 = zzihk.zzm(obj, j8);
                        if (objZzm2 != null) {
                            iHashCode2 = objZzm2.hashCode();
                        }
                        iHashCode = i11 + iHashCode2;
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
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzihk.zzm(obj, j8).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 50:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzihk.zzm(obj, j8).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i13 = this.zzl;
        while (true) {
            int[] iArr = this.zzj;
            if (i13 >= iArr.length) {
                int iHashCode3 = ((zziep) obj).zzt.hashCode() + (iHashCode * 53);
                return this.zzh ? (iHashCode3 * 53) + ((zziel) obj).zza.zza.hashCode() : iHashCode3;
            }
            if (!zzM(obj, 0, iArr[i13])) {
                iHashCode = zzihk.zzm(obj, zzA(r3) & 1048575).hashCode() + (iHashCode * 53);
            }
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigr
    public final void zzd(Object obj, Object obj2) {
        zzF(obj);
        obj2.getClass();
        int i5 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i5 >= iArr.length) {
                zzigs.zzH(this.zzm, obj, obj2);
                if (this.zzh) {
                    zzigs.zzG(this.zzn, obj, obj2);
                    return;
                }
                return;
            }
            int iZzA = zzA(i5);
            int i10 = 1048575 & iZzA;
            int iZzC = zzC(iZzA);
            int i11 = iArr[i5];
            long j8 = i10;
            switch (iZzC) {
                case 0:
                    if (!zzK(obj2, i5)) {
                        break;
                    } else {
                        zzihk.zzl(obj, j8, zzihk.zzk(obj2, j8));
                        zzL(obj, i5);
                        break;
                    }
                case 1:
                    if (!zzK(obj2, i5)) {
                        break;
                    } else {
                        zzihk.zzj(obj, j8, zzihk.zzi(obj2, j8));
                        zzL(obj, i5);
                        break;
                    }
                case 2:
                    if (!zzK(obj2, i5)) {
                        break;
                    } else {
                        zzihk.zzf(obj, j8, zzihk.zze(obj2, j8));
                        zzL(obj, i5);
                        break;
                    }
                case 3:
                    if (!zzK(obj2, i5)) {
                        break;
                    } else {
                        zzihk.zzf(obj, j8, zzihk.zze(obj2, j8));
                        zzL(obj, i5);
                        break;
                    }
                case 4:
                    if (!zzK(obj2, i5)) {
                        break;
                    } else {
                        zzihk.zzd(obj, j8, zzihk.zzc(obj2, j8));
                        zzL(obj, i5);
                        break;
                    }
                case 5:
                    if (!zzK(obj2, i5)) {
                        break;
                    } else {
                        zzihk.zzf(obj, j8, zzihk.zze(obj2, j8));
                        zzL(obj, i5);
                        break;
                    }
                case 6:
                    if (!zzK(obj2, i5)) {
                        break;
                    } else {
                        zzihk.zzd(obj, j8, zzihk.zzc(obj2, j8));
                        zzL(obj, i5);
                        break;
                    }
                case 7:
                    if (!zzK(obj2, i5)) {
                        break;
                    } else {
                        zzihk.zzh(obj, j8, zzihk.zzg(obj2, j8));
                        zzL(obj, i5);
                        break;
                    }
                case 8:
                    if (!zzK(obj2, i5)) {
                        break;
                    } else {
                        zzihk.zzn(obj, j8, zzihk.zzm(obj2, j8));
                        zzL(obj, i5);
                        break;
                    }
                case 9:
                    zzo(obj, obj2, i5);
                    break;
                case 10:
                    if (!zzK(obj2, i5)) {
                        break;
                    } else {
                        zzihk.zzn(obj, j8, zzihk.zzm(obj2, j8));
                        zzL(obj, i5);
                        break;
                    }
                case 11:
                    if (!zzK(obj2, i5)) {
                        break;
                    } else {
                        zzihk.zzd(obj, j8, zzihk.zzc(obj2, j8));
                        zzL(obj, i5);
                        break;
                    }
                case 12:
                    if (!zzK(obj2, i5)) {
                        break;
                    } else {
                        zzihk.zzd(obj, j8, zzihk.zzc(obj2, j8));
                        zzL(obj, i5);
                        break;
                    }
                case 13:
                    if (!zzK(obj2, i5)) {
                        break;
                    } else {
                        zzihk.zzd(obj, j8, zzihk.zzc(obj2, j8));
                        zzL(obj, i5);
                        break;
                    }
                case 14:
                    if (!zzK(obj2, i5)) {
                        break;
                    } else {
                        zzihk.zzf(obj, j8, zzihk.zze(obj2, j8));
                        zzL(obj, i5);
                        break;
                    }
                case 15:
                    if (!zzK(obj2, i5)) {
                        break;
                    } else {
                        zzihk.zzd(obj, j8, zzihk.zzc(obj2, j8));
                        zzL(obj, i5);
                        break;
                    }
                case 16:
                    if (!zzK(obj2, i5)) {
                        break;
                    } else {
                        zzihk.zzf(obj, j8, zzihk.zze(obj2, j8));
                        zzL(obj, i5);
                        break;
                    }
                case 17:
                    zzo(obj, obj2, i5);
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
                    zzifb zzifbVarZzh = (zzifb) zzihk.zzm(obj, j8);
                    zzifb zzifbVar = (zzifb) zzihk.zzm(obj2, j8);
                    int size = zzifbVarZzh.size();
                    int size2 = zzifbVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzifbVarZzh.zza()) {
                            zzifbVarZzh = zzifbVarZzh.zzh(size2 + size);
                        }
                        zzifbVarZzh.addAll(zzifbVar);
                    }
                    if (size > 0) {
                        zzifbVar = zzifbVarZzh;
                    }
                    zzihk.zzn(obj, j8, zzifbVar);
                    break;
                case 50:
                    int i12 = zzigs.zza;
                    zzihk.zzn(obj, j8, zzifu.zzb(zzihk.zzm(obj, j8), zzihk.zzm(obj2, j8)));
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
                    if (!zzM(obj2, i11, i5)) {
                        break;
                    } else {
                        zzihk.zzn(obj, j8, zzihk.zzm(obj2, j8));
                        zzO(obj, i11, i5);
                        break;
                    }
                case 60:
                    zzp(obj, obj2, i5);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzM(obj2, i11, i5)) {
                        break;
                    } else {
                        zzihk.zzn(obj, j8, zzihk.zzm(obj2, j8));
                        zzO(obj, i11, i5);
                        break;
                    }
                case 68:
                    zzp(obj, obj2, i5);
                    break;
            }
            i5 += 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f4  */
    @Override // com.google.android.gms.internal.ads.zzigr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zze(java.lang.Object r18) throws com.google.android.gms.internal.ads.zziho {
        /*
            Method dump skipped, instructions count: 2044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzigc.zze(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.ads.zzigr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(java.lang.Object r21, com.google.android.gms.internal.ads.zzihs r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzigc.zzf(java.lang.Object, com.google.android.gms.internal.ads.zzihs):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x05ad A[LOOP:1: B:196:0x05a9->B:198:0x05ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0569 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x057a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:312:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:313:? A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzigr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzg(java.lang.Object r12, com.google.android.gms.internal.ads.zzigm r13, com.google.android.gms.internal.ads.zzidz r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzigc.zzg(java.lang.Object, com.google.android.gms.internal.ads.zzigm, com.google.android.gms.internal.ads.zzidz):void");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int zzi(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.ads.zzicz r39) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 4076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzigc.zzi(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzicz):int");
    }

    @Override // com.google.android.gms.internal.ads.zzigr
    public final void zzj(Object obj, byte[] bArr, int i5, int i10, zzicz zziczVar) throws IOException {
        zzi(obj, bArr, i5, i10, 0, zziczVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    @Override // com.google.android.gms.internal.ads.zzigr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzk(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = zzE(r8)
            if (r0 != 0) goto L8
            goto L91
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zziep
            if (r0 == 0) goto L18
            r0 = r8
            com.google.android.gms.internal.ads.zziep r0 = (com.google.android.gms.internal.ads.zziep) r0
            r0.zzbq()
            r0.zzbb()
            r0.zzaY()
        L18:
            int[] r0 = r7.zzc
            r1 = 0
        L1b:
            int r2 = r0.length
            if (r1 >= r2) goto L83
            int r2 = r7.zzA(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zzC(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L6d
            r5 = 60
            if (r2 == r5) goto L57
            r5 = 68
            if (r2 == r5) goto L57
            switch(r2) {
                case 17: goto L6d;
                case 18: goto L4d;
                case 19: goto L4d;
                case 20: goto L4d;
                case 21: goto L4d;
                case 22: goto L4d;
                case 23: goto L4d;
                case 24: goto L4d;
                case 25: goto L4d;
                case 26: goto L4d;
                case 27: goto L4d;
                case 28: goto L4d;
                case 29: goto L4d;
                case 30: goto L4d;
                case 31: goto L4d;
                case 32: goto L4d;
                case 33: goto L4d;
                case 34: goto L4d;
                case 35: goto L4d;
                case 36: goto L4d;
                case 37: goto L4d;
                case 38: goto L4d;
                case 39: goto L4d;
                case 40: goto L4d;
                case 41: goto L4d;
                case 42: goto L4d;
                case 43: goto L4d;
                case 44: goto L4d;
                case 45: goto L4d;
                case 46: goto L4d;
                case 47: goto L4d;
                case 48: goto L4d;
                case 49: goto L4d;
                case 50: goto L3b;
                default: goto L3a;
            }
        L3a:
            goto L80
        L3b:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.ads.zzigc.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L80
            r6 = r5
            com.google.android.gms.internal.ads.zzift r6 = (com.google.android.gms.internal.ads.zzift) r6
            r6.zzd()
            r2.putObject(r8, r3, r5)
            goto L80
        L4d:
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzihk.zzm(r8, r3)
            com.google.android.gms.internal.ads.zzifb r2 = (com.google.android.gms.internal.ads.zzifb) r2
            r2.zzb()
            goto L80
        L57:
            r2 = r0[r1]
            boolean r2 = r7.zzM(r8, r2, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.ads.zzigr r2 = r7.zzq(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.ads.zzigc.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzk(r3)
            goto L80
        L6d:
            boolean r2 = r7.zzK(r8, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.ads.zzigr r2 = r7.zzq(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.ads.zzigc.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzk(r3)
        L80:
            int r1 = r1 + 3
            goto L1b
        L83:
            com.google.android.gms.internal.ads.zzihd r0 = r7.zzm
            r0.zzj(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L91
            com.google.android.gms.internal.ads.zziea r0 = r7.zzn
            r0.zza(r8)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzigc.zzk(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00be  */
    @Override // com.google.android.gms.internal.ads.zzigr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzl(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzigc.zzl(java.lang.Object):boolean");
    }
}
