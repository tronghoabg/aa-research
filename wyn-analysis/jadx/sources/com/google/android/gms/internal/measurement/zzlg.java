package com.google.android.gms.internal.measurement;

import A7.AbstractC0279p0;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
final class zzlg<T> implements zzlu<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzml.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlc zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzlk zzn;
    private final zzkm zzo;
    private final zzmk<?, ?> zzp;
    private final zzji<?> zzq;
    private final zzkv zzr;

    private zzlg(int[] iArr, Object[] objArr, int i5, int i10, zzlc zzlcVar, boolean z2, int[] iArr2, int i11, int i12, zzlk zzlkVar, zzkm zzkmVar, zzmk<?, ?> zzmkVar, zzji<?> zzjiVar, zzkv zzkvVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i5;
        this.zzf = i10;
        this.zzi = zzlcVar instanceof zzjt;
        this.zzh = zzjiVar != null && zzjiVar.zza(zzlcVar);
        this.zzj = false;
        this.zzk = iArr2;
        this.zzl = i11;
        this.zzm = i12;
        this.zzn = zzlkVar;
        this.zzo = zzkmVar;
        this.zzp = zzmkVar;
        this.zzq = zzjiVar;
        this.zzg = zzlcVar;
        this.zzr = zzkvVar;
    }

    private static <T> double zza(T t10, long j8) {
        return ((Double) zzml.zze(t10, j8)).doubleValue();
    }

    private static <T> float zzb(T t10, long j8) {
        return ((Float) zzml.zze(t10, j8)).floatValue();
    }

    private static <T> int zzc(T t10, long j8) {
        return ((Integer) zzml.zze(t10, j8)).intValue();
    }

    private static <T> long zzd(T t10, long j8) {
        return ((Long) zzml.zze(t10, j8)).longValue();
    }

    private final zzlu zze(int i5) {
        int i10 = (i5 / 3) << 1;
        zzlu zzluVar = (zzlu) this.zzd[i10];
        if (zzluVar != null) {
            return zzluVar;
        }
        zzlu<T> zzluVarZza = zzlq.zza().zza((Class) this.zzd[i10 + 1]);
        this.zzd[i10] = zzluVarZza;
        return zzluVarZza;
    }

    private final Object zzf(int i5) {
        return this.zzd[(i5 / 3) << 1];
    }

    private static boolean zzg(int i5) {
        return (i5 & 536870912) != 0;
    }

    private static int zza(byte[] bArr, int i5, int i10, zzms zzmsVar, Class<?> cls, zzij zzijVar) throws IOException {
        switch (zzlf.zza[zzmsVar.ordinal()]) {
            case 1:
                int iZzd = zzig.zzd(bArr, i5, zzijVar);
                zzijVar.zzc = Boolean.valueOf(zzijVar.zzb != 0);
                return iZzd;
            case 2:
                return zzig.zza(bArr, i5, zzijVar);
            case 3:
                zzijVar.zzc = Double.valueOf(zzig.zza(bArr, i5));
                return i5 + 8;
            case 4:
            case 5:
                zzijVar.zzc = Integer.valueOf(zzig.zzc(bArr, i5));
                return i5 + 4;
            case 6:
            case 7:
                zzijVar.zzc = Long.valueOf(zzig.zzd(bArr, i5));
                return i5 + 8;
            case 8:
                zzijVar.zzc = Float.valueOf(zzig.zzb(bArr, i5));
                return i5 + 4;
            case 9:
            case 10:
            case 11:
                int iZzc = zzig.zzc(bArr, i5, zzijVar);
                zzijVar.zzc = Integer.valueOf(zzijVar.zza);
                return iZzc;
            case 12:
            case 13:
                int iZzd2 = zzig.zzd(bArr, i5, zzijVar);
                zzijVar.zzc = Long.valueOf(zzijVar.zzb);
                return iZzd2;
            case 14:
                return zzig.zza(zzlq.zza().zza((Class) cls), bArr, i5, i10, zzijVar);
            case 15:
                int iZzc2 = zzig.zzc(bArr, i5, zzijVar);
                zzijVar.zzc = Integer.valueOf(zziw.zza(zzijVar.zza));
                return iZzc2;
            case 16:
                int iZzd3 = zzig.zzd(bArr, i5, zzijVar);
                zzijVar.zzc = Long.valueOf(zziw.zza(zzijVar.zzb));
                return iZzd3;
            case 17:
                return zzig.zzb(bArr, i5, zzijVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private final int zzc(int i5) {
        return this.zzc[i5 + 1];
    }

    private final zzjx zzd(int i5) {
        return (zzjx) this.zzd[((i5 / 3) << 1) + 1];
    }

    private static void zzf(Object obj) {
        if (!zzg(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static boolean zzg(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzjt) {
            return ((zzjt) obj).zzco();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zzb(T t10) {
        int i5;
        int iZza;
        int i10;
        int iZzc;
        int length = this.zzc.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iZzc2 = zzc(i12);
            int i13 = this.zzc[i12];
            long j8 = 1048575 & iZzc2;
            int iHashCode = 37;
            switch ((iZzc2 & 267386880) >>> 20) {
                case 0:
                    i5 = i11 * 53;
                    iZza = zzjv.zza(Double.doubleToLongBits(zzml.zza(t10, j8)));
                    i11 = iZza + i5;
                    break;
                case 1:
                    i5 = i11 * 53;
                    iZza = Float.floatToIntBits(zzml.zzb(t10, j8));
                    i11 = iZza + i5;
                    break;
                case 2:
                    i5 = i11 * 53;
                    iZza = zzjv.zza(zzml.zzd(t10, j8));
                    i11 = iZza + i5;
                    break;
                case 3:
                    i5 = i11 * 53;
                    iZza = zzjv.zza(zzml.zzd(t10, j8));
                    i11 = iZza + i5;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iZzc = zzml.zzc(t10, j8);
                    i11 = i10 + iZzc;
                    break;
                case 5:
                    i5 = i11 * 53;
                    iZza = zzjv.zza(zzml.zzd(t10, j8));
                    i11 = iZza + i5;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iZzc = zzml.zzc(t10, j8);
                    i11 = i10 + iZzc;
                    break;
                case 7:
                    i5 = i11 * 53;
                    iZza = zzjv.zza(zzml.zzh(t10, j8));
                    i11 = iZza + i5;
                    break;
                case 8:
                    i5 = i11 * 53;
                    iZza = ((String) zzml.zze(t10, j8)).hashCode();
                    i11 = iZza + i5;
                    break;
                case 9:
                    Object objZze = zzml.zze(t10, j8);
                    if (objZze != null) {
                        iHashCode = objZze.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i5 = i11 * 53;
                    iZza = zzml.zze(t10, j8).hashCode();
                    i11 = iZza + i5;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iZzc = zzml.zzc(t10, j8);
                    i11 = i10 + iZzc;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iZzc = zzml.zzc(t10, j8);
                    i11 = i10 + iZzc;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iZzc = zzml.zzc(t10, j8);
                    i11 = i10 + iZzc;
                    break;
                case 14:
                    i5 = i11 * 53;
                    iZza = zzjv.zza(zzml.zzd(t10, j8));
                    i11 = iZza + i5;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iZzc = zzml.zzc(t10, j8);
                    i11 = i10 + iZzc;
                    break;
                case 16:
                    i5 = i11 * 53;
                    iZza = zzjv.zza(zzml.zzd(t10, j8));
                    i11 = iZza + i5;
                    break;
                case 17:
                    Object objZze2 = zzml.zze(t10, j8);
                    if (objZze2 != null) {
                        iHashCode = objZze2.hashCode();
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
                    i5 = i11 * 53;
                    iZza = zzml.zze(t10, j8).hashCode();
                    i11 = iZza + i5;
                    break;
                case 50:
                    i5 = i11 * 53;
                    iZza = zzml.zze(t10, j8).hashCode();
                    i11 = iZza + i5;
                    break;
                case 51:
                    if (zzc((zzlg<T>) t10, i13, i12)) {
                        i5 = i11 * 53;
                        iZza = zzjv.zza(Double.doubleToLongBits(zza(t10, j8)));
                        i11 = iZza + i5;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzc((zzlg<T>) t10, i13, i12)) {
                        i5 = i11 * 53;
                        iZza = Float.floatToIntBits(zzb(t10, j8));
                        i11 = iZza + i5;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzc((zzlg<T>) t10, i13, i12)) {
                        i5 = i11 * 53;
                        iZza = zzjv.zza(zzd(t10, j8));
                        i11 = iZza + i5;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzc((zzlg<T>) t10, i13, i12)) {
                        i5 = i11 * 53;
                        iZza = zzjv.zza(zzd(t10, j8));
                        i11 = iZza + i5;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzc((zzlg<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzc(t10, j8);
                        i11 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzc((zzlg<T>) t10, i13, i12)) {
                        i5 = i11 * 53;
                        iZza = zzjv.zza(zzd(t10, j8));
                        i11 = iZza + i5;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzc((zzlg<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzc(t10, j8);
                        i11 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzc((zzlg<T>) t10, i13, i12)) {
                        i5 = i11 * 53;
                        iZza = zzjv.zza(zze(t10, j8));
                        i11 = iZza + i5;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzc((zzlg<T>) t10, i13, i12)) {
                        i5 = i11 * 53;
                        iZza = ((String) zzml.zze(t10, j8)).hashCode();
                        i11 = iZza + i5;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzc((zzlg<T>) t10, i13, i12)) {
                        i5 = i11 * 53;
                        iZza = zzml.zze(t10, j8).hashCode();
                        i11 = iZza + i5;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzc((zzlg<T>) t10, i13, i12)) {
                        i5 = i11 * 53;
                        iZza = zzml.zze(t10, j8).hashCode();
                        i11 = iZza + i5;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzc((zzlg<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzc(t10, j8);
                        i11 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzc((zzlg<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzc(t10, j8);
                        i11 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzc((zzlg<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzc(t10, j8);
                        i11 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzc((zzlg<T>) t10, i13, i12)) {
                        i5 = i11 * 53;
                        iZza = zzjv.zza(zzd(t10, j8));
                        i11 = iZza + i5;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzc((zzlg<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzc(t10, j8);
                        i11 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzc((zzlg<T>) t10, i13, i12)) {
                        i5 = i11 * 53;
                        iZza = zzjv.zza(zzd(t10, j8));
                        i11 = iZza + i5;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzc((zzlg<T>) t10, i13, i12)) {
                        i5 = i11 * 53;
                        iZza = zzml.zze(t10, j8).hashCode();
                        i11 = iZza + i5;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = this.zzp.zzd(t10).hashCode() + (i11 * 53);
        return this.zzh ? (iHashCode2 * 53) + this.zzq.zza(t10).hashCode() : iHashCode2;
    }

    public static zzmj zzc(Object obj) {
        zzjt zzjtVar = (zzjt) obj;
        zzmj zzmjVar = zzjtVar.zzb;
        if (zzmjVar != zzmj.zzc()) {
            return zzmjVar;
        }
        zzmj zzmjVarZzd = zzmj.zzd();
        zzjtVar.zzb = zzmjVarZzd;
        return zzmjVarZzd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    @Override // com.google.android.gms.internal.measurement.zzlu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(T r8) {
        /*
            r7 = this;
            boolean r0 = zzg(r8)
            if (r0 != 0) goto L8
            goto L92
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.measurement.zzjt
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.gms.internal.measurement.zzjt r0 = (com.google.android.gms.internal.measurement.zzjt) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzc(r2)
            r0.zza = r1
            r0.zzcm()
        L1b:
            int[] r0 = r7.zzc
            int r0 = r0.length
        L1e:
            if (r1 >= r0) goto L84
            int r2 = r7.zzc(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            long r3 = (long) r3
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r2 = r2 & r5
            int r2 = r2 >>> 20
            r5 = 9
            if (r2 == r5) goto L6e
            r5 = 60
            if (r2 == r5) goto L56
            r5 = 68
            if (r2 == r5) goto L56
            switch(r2) {
                case 17: goto L6e;
                case 18: goto L50;
                case 19: goto L50;
                case 20: goto L50;
                case 21: goto L50;
                case 22: goto L50;
                case 23: goto L50;
                case 24: goto L50;
                case 25: goto L50;
                case 26: goto L50;
                case 27: goto L50;
                case 28: goto L50;
                case 29: goto L50;
                case 30: goto L50;
                case 31: goto L50;
                case 32: goto L50;
                case 33: goto L50;
                case 34: goto L50;
                case 35: goto L50;
                case 36: goto L50;
                case 37: goto L50;
                case 38: goto L50;
                case 39: goto L50;
                case 40: goto L50;
                case 41: goto L50;
                case 42: goto L50;
                case 43: goto L50;
                case 44: goto L50;
                case 45: goto L50;
                case 46: goto L50;
                case 47: goto L50;
                case 48: goto L50;
                case 49: goto L50;
                case 50: goto L3e;
                default: goto L3d;
            }
        L3d:
            goto L81
        L3e:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.measurement.zzlg.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L81
            com.google.android.gms.internal.measurement.zzkv r6 = r7.zzr
            java.lang.Object r5 = r6.zzc(r5)
            r2.putObject(r8, r3, r5)
            goto L81
        L50:
            com.google.android.gms.internal.measurement.zzkm r2 = r7.zzo
            r2.zzb(r8, r3)
            goto L81
        L56:
            int[] r2 = r7.zzc
            r2 = r2[r1]
            boolean r2 = r7.zzc(r8, r2, r1)
            if (r2 == 0) goto L81
            com.google.android.gms.internal.measurement.zzlu r2 = r7.zze(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.measurement.zzlg.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzd(r3)
            goto L81
        L6e:
            boolean r2 = r7.zzc(r8, r1)
            if (r2 == 0) goto L81
            com.google.android.gms.internal.measurement.zzlu r2 = r7.zze(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.measurement.zzlg.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzd(r3)
        L81:
            int r1 = r1 + 3
            goto L1e
        L84:
            com.google.android.gms.internal.measurement.zzmk<?, ?> r0 = r7.zzp
            r0.zzf(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L92
            com.google.android.gms.internal.measurement.zzji<?> r0 = r7.zzq
            r0.zzc(r8)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlg.zzd(java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7  */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.google.android.gms.internal.measurement.zzlu] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [com.google.android.gms.internal.measurement.zzlu] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    @Override // com.google.android.gms.internal.measurement.zzlu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zze(T r15) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlg.zze(java.lang.Object):boolean");
    }

    private final boolean zzc(T t10, T t11, int i5) {
        return zzc((zzlg<T>) t10, i5) == zzc((zzlg<T>) t11, i5);
    }

    private final boolean zzc(T t10, int i5) {
        int iZzb = zzb(i5);
        long j8 = iZzb & 1048575;
        if (j8 != 1048575) {
            return (zzml.zzc(t10, j8) & (1 << (iZzb >>> 20))) != 0;
        }
        int iZzc = zzc(i5);
        long j10 = iZzc & 1048575;
        switch ((iZzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzml.zza(t10, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzml.zzb(t10, j10)) != 0;
            case 2:
                return zzml.zzd(t10, j10) != 0;
            case 3:
                return zzml.zzd(t10, j10) != 0;
            case 4:
                return zzml.zzc(t10, j10) != 0;
            case 5:
                return zzml.zzd(t10, j10) != 0;
            case 6:
                return zzml.zzc(t10, j10) != 0;
            case 7:
                return zzml.zzh(t10, j10);
            case 8:
                Object objZze = zzml.zze(t10, j10);
                if (objZze instanceof String) {
                    return !((String) objZze).isEmpty();
                }
                if (objZze instanceof zzik) {
                    return !zzik.zza.equals(objZze);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzml.zze(t10, j10) != null;
            case 10:
                return !zzik.zza.equals(zzml.zze(t10, j10));
            case 11:
                return zzml.zzc(t10, j10) != 0;
            case 12:
                return zzml.zzc(t10, j10) != 0;
            case 13:
                return zzml.zzc(t10, j10) != 0;
            case 14:
                return zzml.zzd(t10, j10) != 0;
            case 15:
                return zzml.zzc(t10, j10) != 0;
            case 16:
                return zzml.zzd(t10, j10) != 0;
            case 17:
                return zzml.zze(t10, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zza(T t10) {
        int i5;
        int iZza;
        int iZza2;
        int iZzd;
        int iZza3;
        int iZzd2;
        int iZzi;
        int iZzj;
        zzlg<T> zzlgVar = this;
        T t11 = t10;
        Unsafe unsafe = zzb;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i11 < zzlgVar.zzc.length) {
            int iZzc = zzlgVar.zzc(i11);
            int i15 = (267386880 & iZzc) >>> 20;
            int[] iArr = zzlgVar.zzc;
            int i16 = iArr[i11];
            int i17 = iArr[i11 + 2];
            int i18 = i17 & i10;
            if (i15 <= 17) {
                if (i18 != i14) {
                    i12 = i18 == i10 ? 0 : unsafe.getInt(t11, i18);
                    i14 = i18;
                }
                i5 = 1 << (i17 >>> 20);
            } else {
                i5 = 0;
            }
            long j8 = iZzc & i10;
            if (i15 >= zzjn.zza.zza()) {
                zzjn.zzb.zza();
            }
            int i19 = i13;
            switch (i15) {
                case 0:
                    if (zzlgVar.zza((zzlg<T>) t11, i11, i14, i12, i5)) {
                        iZza = zzjc.zza(i16, 0.0d);
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 1:
                    if (zzlgVar.zza((zzlg<T>) t11, i11, i14, i12, i5)) {
                        iZza2 = zzjc.zza(i16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        i13 = iZza2 + i19;
                        zzlgVar = this;
                        t11 = t10;
                        break;
                    }
                    zzlgVar = this;
                    t11 = t10;
                    i13 = i19;
                    break;
                case 2:
                    if (zzlgVar.zza((zzlg<T>) t11, i11, i14, i12, i5)) {
                        iZzd = zzjc.zzd(i16, unsafe.getLong(t11, j8));
                        i13 = iZzd + i19;
                        zzlgVar = this;
                        break;
                    }
                    zzlgVar = this;
                    i13 = i19;
                    break;
                case 3:
                    if (zzlgVar.zza((zzlg<T>) t11, i11, i14, i12, i5)) {
                        iZzd = zzjc.zzg(i16, unsafe.getLong(t11, j8));
                        i13 = iZzd + i19;
                        zzlgVar = this;
                        break;
                    }
                    zzlgVar = this;
                    i13 = i19;
                    break;
                case 4:
                    if (zzlgVar.zza((zzlg<T>) t11, i11, i14, i12, i5)) {
                        iZzd = zzjc.zzg(i16, unsafe.getInt(t11, j8));
                        i13 = iZzd + i19;
                        zzlgVar = this;
                        break;
                    }
                    zzlgVar = this;
                    i13 = i19;
                    break;
                case 5:
                    if (zzlgVar.zza((zzlg<T>) t11, i11, i14, i12, i5)) {
                        iZza2 = zzjc.zzc(i16, 0L);
                        i13 = iZza2 + i19;
                        zzlgVar = this;
                        t11 = t10;
                        break;
                    }
                    zzlgVar = this;
                    t11 = t10;
                    i13 = i19;
                    break;
                case 6:
                    if (zzlgVar.zza((zzlg<T>) t11, i11, i14, i12, i5)) {
                        iZza2 = zzjc.zzf(i16, 0);
                        i13 = iZza2 + i19;
                        zzlgVar = this;
                        t11 = t10;
                        break;
                    }
                    zzlgVar = this;
                    t11 = t10;
                    i13 = i19;
                    break;
                case 7:
                    if (zzlgVar.zza((zzlg<T>) t11, i11, i14, i12, i5)) {
                        iZza2 = zzjc.zzb(i16, true);
                        i13 = iZza2 + i19;
                        zzlgVar = this;
                        t11 = t10;
                        break;
                    }
                    zzlgVar = this;
                    t11 = t10;
                    i13 = i19;
                    break;
                case 8:
                    if (zzlgVar.zza((zzlg<T>) t11, i11, i14, i12, i5)) {
                        Object object = unsafe.getObject(t11, j8);
                        if (object instanceof zzik) {
                            iZzd = zzjc.zzc(i16, (zzik) object);
                        } else {
                            iZzd = zzjc.zzb(i16, (String) object);
                        }
                        i13 = iZzd + i19;
                        zzlgVar = this;
                        break;
                    }
                    zzlgVar = this;
                    i13 = i19;
                    break;
                case 9:
                    if (zzlgVar.zza((zzlg<T>) t11, i11, i14, i12, i5)) {
                        iZza3 = zzlw.zza(i16, unsafe.getObject(t11, j8), (zzlu<?>) zzlgVar.zze(i11));
                        i13 = i19 + iZza3;
                        break;
                    }
                    i13 = i19;
                    break;
                case 10:
                    if (zzlgVar.zza((zzlg<T>) t11, i11, i14, i12, i5)) {
                        iZzd = zzjc.zzc(i16, (zzik) unsafe.getObject(t11, j8));
                        i13 = iZzd + i19;
                        zzlgVar = this;
                        break;
                    }
                    zzlgVar = this;
                    i13 = i19;
                    break;
                case 11:
                    if (zzlgVar.zza((zzlg<T>) t11, i11, i14, i12, i5)) {
                        iZzd = zzjc.zzj(i16, unsafe.getInt(t11, j8));
                        i13 = iZzd + i19;
                        zzlgVar = this;
                        break;
                    }
                    zzlgVar = this;
                    i13 = i19;
                    break;
                case 12:
                    if (zzlgVar.zza((zzlg<T>) t11, i11, i14, i12, i5)) {
                        iZzd = zzjc.zze(i16, unsafe.getInt(t11, j8));
                        i13 = iZzd + i19;
                        zzlgVar = this;
                        break;
                    }
                    zzlgVar = this;
                    i13 = i19;
                    break;
                case 13:
                    if (zzlgVar.zza((zzlg<T>) t11, i11, i14, i12, i5)) {
                        iZza2 = zzjc.zzh(i16, 0);
                        i13 = iZza2 + i19;
                        zzlgVar = this;
                        t11 = t10;
                        break;
                    }
                    zzlgVar = this;
                    t11 = t10;
                    i13 = i19;
                    break;
                case 14:
                    if (zzlgVar.zza((zzlg<T>) t11, i11, i14, i12, i5)) {
                        iZza2 = zzjc.zze(i16, 0L);
                        i13 = iZza2 + i19;
                        zzlgVar = this;
                        t11 = t10;
                        break;
                    }
                    zzlgVar = this;
                    t11 = t10;
                    i13 = i19;
                    break;
                case 15:
                    if (zzlgVar.zza((zzlg<T>) t11, i11, i14, i12, i5)) {
                        iZzd = zzjc.zzi(i16, unsafe.getInt(t11, j8));
                        i13 = iZzd + i19;
                        zzlgVar = this;
                        break;
                    }
                    zzlgVar = this;
                    i13 = i19;
                    break;
                case 16:
                    if (zzlgVar.zza((zzlg<T>) t11, i11, i14, i12, i5)) {
                        iZzd = zzjc.zzf(i16, unsafe.getLong(t11, j8));
                        i13 = iZzd + i19;
                        zzlgVar = this;
                        break;
                    }
                    zzlgVar = this;
                    i13 = i19;
                    break;
                case 17:
                    if (zzlgVar.zza((zzlg<T>) t11, i11, i14, i12, i5)) {
                        iZza = zzjc.zzb(i16, (zzlc) unsafe.getObject(t11, j8), zzlgVar.zze(i11));
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 18:
                    iZza3 = zzlw.zzd(i16, (List) unsafe.getObject(t11, j8), false);
                    i13 = i19 + iZza3;
                    break;
                case 19:
                    iZza3 = zzlw.zzc(i16, (List) unsafe.getObject(t11, j8), false);
                    i13 = i19 + iZza3;
                    break;
                case 20:
                    iZza3 = zzlw.zzf(i16, (List) unsafe.getObject(t11, j8), false);
                    i13 = i19 + iZza3;
                    break;
                case 21:
                    iZza3 = zzlw.zzj(i16, (List) unsafe.getObject(t11, j8), false);
                    i13 = i19 + iZza3;
                    break;
                case 22:
                    iZza3 = zzlw.zze(i16, (List) unsafe.getObject(t11, j8), false);
                    i13 = i19 + iZza3;
                    break;
                case 23:
                    iZza3 = zzlw.zzd(i16, (List) unsafe.getObject(t11, j8), false);
                    i13 = i19 + iZza3;
                    break;
                case 24:
                    iZza3 = zzlw.zzc(i16, (List) unsafe.getObject(t11, j8), false);
                    i13 = i19 + iZza3;
                    break;
                case 25:
                    iZza3 = zzlw.zza(i16, (List<?>) unsafe.getObject(t11, j8), false);
                    i13 = i19 + iZza3;
                    break;
                case 26:
                    iZza3 = zzlw.zzb(i16, (List) unsafe.getObject(t11, j8));
                    i13 = i19 + iZza3;
                    break;
                case 27:
                    iZza3 = zzlw.zzb(i16, (List<?>) unsafe.getObject(t11, j8), (zzlu<?>) zzlgVar.zze(i11));
                    i13 = i19 + iZza3;
                    break;
                case 28:
                    iZza3 = zzlw.zza(i16, (List<zzik>) unsafe.getObject(t11, j8));
                    i13 = i19 + iZza3;
                    break;
                case 29:
                    iZza3 = zzlw.zzi(i16, (List) unsafe.getObject(t11, j8), false);
                    i13 = i19 + iZza3;
                    break;
                case 30:
                    iZza3 = zzlw.zzb(i16, (List<Integer>) unsafe.getObject(t11, j8), false);
                    i13 = i19 + iZza3;
                    break;
                case 31:
                    iZza3 = zzlw.zzc(i16, (List) unsafe.getObject(t11, j8), false);
                    i13 = i19 + iZza3;
                    break;
                case 32:
                    iZza3 = zzlw.zzd(i16, (List) unsafe.getObject(t11, j8), false);
                    i13 = i19 + iZza3;
                    break;
                case 33:
                    iZza3 = zzlw.zzg(i16, (List) unsafe.getObject(t11, j8), false);
                    i13 = i19 + iZza3;
                    break;
                case 34:
                    iZza3 = zzlw.zzh(i16, (List) unsafe.getObject(t11, j8), false);
                    i13 = i19 + iZza3;
                    break;
                case 35:
                    iZzd2 = zzlw.zzd((List) unsafe.getObject(t11, j8));
                    if (iZzd2 > 0) {
                        iZzi = zzjc.zzi(i16);
                        iZzj = zzjc.zzj(iZzd2);
                        i13 = iZzj + iZzi + iZzd2 + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 36:
                    iZzd2 = zzlw.zzc((List) unsafe.getObject(t11, j8));
                    if (iZzd2 > 0) {
                        iZzi = zzjc.zzi(i16);
                        iZzj = zzjc.zzj(iZzd2);
                        i13 = iZzj + iZzi + iZzd2 + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 37:
                    iZzd2 = zzlw.zzf((List) unsafe.getObject(t11, j8));
                    if (iZzd2 > 0) {
                        iZzi = zzjc.zzi(i16);
                        iZzj = zzjc.zzj(iZzd2);
                        i13 = iZzj + iZzi + iZzd2 + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 38:
                    iZzd2 = zzlw.zzj((List) unsafe.getObject(t11, j8));
                    if (iZzd2 > 0) {
                        iZzi = zzjc.zzi(i16);
                        iZzj = zzjc.zzj(iZzd2);
                        i13 = iZzj + iZzi + iZzd2 + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 39:
                    iZzd2 = zzlw.zze((List) unsafe.getObject(t11, j8));
                    if (iZzd2 > 0) {
                        iZzi = zzjc.zzi(i16);
                        iZzj = zzjc.zzj(iZzd2);
                        i13 = iZzj + iZzi + iZzd2 + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 40:
                    iZzd2 = zzlw.zzd((List) unsafe.getObject(t11, j8));
                    if (iZzd2 > 0) {
                        iZzi = zzjc.zzi(i16);
                        iZzj = zzjc.zzj(iZzd2);
                        i13 = iZzj + iZzi + iZzd2 + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 41:
                    iZzd2 = zzlw.zzc((List) unsafe.getObject(t11, j8));
                    if (iZzd2 > 0) {
                        iZzi = zzjc.zzi(i16);
                        iZzj = zzjc.zzj(iZzd2);
                        i13 = iZzj + iZzi + iZzd2 + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 42:
                    iZzd2 = zzlw.zza((List<?>) unsafe.getObject(t11, j8));
                    if (iZzd2 > 0) {
                        iZzi = zzjc.zzi(i16);
                        iZzj = zzjc.zzj(iZzd2);
                        i13 = iZzj + iZzi + iZzd2 + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 43:
                    iZzd2 = zzlw.zzi((List) unsafe.getObject(t11, j8));
                    if (iZzd2 > 0) {
                        iZzi = zzjc.zzi(i16);
                        iZzj = zzjc.zzj(iZzd2);
                        i13 = iZzj + iZzi + iZzd2 + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 44:
                    iZzd2 = zzlw.zzb((List) unsafe.getObject(t11, j8));
                    if (iZzd2 > 0) {
                        iZzi = zzjc.zzi(i16);
                        iZzj = zzjc.zzj(iZzd2);
                        i13 = iZzj + iZzi + iZzd2 + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 45:
                    iZzd2 = zzlw.zzc((List) unsafe.getObject(t11, j8));
                    if (iZzd2 > 0) {
                        iZzi = zzjc.zzi(i16);
                        iZzj = zzjc.zzj(iZzd2);
                        i13 = iZzj + iZzi + iZzd2 + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 46:
                    iZzd2 = zzlw.zzd((List) unsafe.getObject(t11, j8));
                    if (iZzd2 > 0) {
                        iZzi = zzjc.zzi(i16);
                        iZzj = zzjc.zzj(iZzd2);
                        i13 = iZzj + iZzi + iZzd2 + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 47:
                    iZzd2 = zzlw.zzg((List) unsafe.getObject(t11, j8));
                    if (iZzd2 > 0) {
                        iZzi = zzjc.zzi(i16);
                        iZzj = zzjc.zzj(iZzd2);
                        i13 = iZzj + iZzi + iZzd2 + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 48:
                    iZzd2 = zzlw.zzh((List) unsafe.getObject(t11, j8));
                    if (iZzd2 > 0) {
                        iZzi = zzjc.zzi(i16);
                        iZzj = zzjc.zzj(iZzd2);
                        i13 = iZzj + iZzi + iZzd2 + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 49:
                    iZza3 = zzlw.zza(i16, (List<zzlc>) unsafe.getObject(t11, j8), (zzlu<?>) zzlgVar.zze(i11));
                    i13 = i19 + iZza3;
                    break;
                case 50:
                    iZza3 = zzlgVar.zzr.zza(i16, unsafe.getObject(t11, j8), zzlgVar.zzf(i11));
                    i13 = i19 + iZza3;
                    break;
                case 51:
                    if (zzlgVar.zzc((zzlg<T>) t11, i16, i11)) {
                        iZza = zzjc.zza(i16, 0.0d);
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 52:
                    if (zzlgVar.zzc((zzlg<T>) t11, i16, i11)) {
                        iZza = zzjc.zza(i16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 53:
                    if (zzlgVar.zzc((zzlg<T>) t11, i16, i11)) {
                        iZza = zzjc.zzd(i16, zzd(t11, j8));
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 54:
                    if (zzlgVar.zzc((zzlg<T>) t11, i16, i11)) {
                        iZza = zzjc.zzg(i16, zzd(t11, j8));
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 55:
                    if (zzlgVar.zzc((zzlg<T>) t11, i16, i11)) {
                        iZza = zzjc.zzg(i16, zzc(t11, j8));
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 56:
                    if (zzlgVar.zzc((zzlg<T>) t11, i16, i11)) {
                        iZza = zzjc.zzc(i16, 0L);
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 57:
                    if (zzlgVar.zzc((zzlg<T>) t11, i16, i11)) {
                        iZza = zzjc.zzf(i16, 0);
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 58:
                    if (zzlgVar.zzc((zzlg<T>) t11, i16, i11)) {
                        iZza = zzjc.zzb(i16, true);
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 59:
                    if (zzlgVar.zzc((zzlg<T>) t11, i16, i11)) {
                        Object object2 = unsafe.getObject(t11, j8);
                        if (object2 instanceof zzik) {
                            iZza = zzjc.zzc(i16, (zzik) object2);
                        } else {
                            iZza = zzjc.zzb(i16, (String) object2);
                        }
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 60:
                    if (zzlgVar.zzc((zzlg<T>) t11, i16, i11)) {
                        iZza3 = zzlw.zza(i16, unsafe.getObject(t11, j8), (zzlu<?>) zzlgVar.zze(i11));
                        i13 = i19 + iZza3;
                        break;
                    }
                    i13 = i19;
                    break;
                case 61:
                    if (zzlgVar.zzc((zzlg<T>) t11, i16, i11)) {
                        iZza = zzjc.zzc(i16, (zzik) unsafe.getObject(t11, j8));
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 62:
                    if (zzlgVar.zzc((zzlg<T>) t11, i16, i11)) {
                        iZza = zzjc.zzj(i16, zzc(t11, j8));
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 63:
                    if (zzlgVar.zzc((zzlg<T>) t11, i16, i11)) {
                        iZza = zzjc.zze(i16, zzc(t11, j8));
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 64:
                    if (zzlgVar.zzc((zzlg<T>) t11, i16, i11)) {
                        iZza = zzjc.zzh(i16, 0);
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 65:
                    if (zzlgVar.zzc((zzlg<T>) t11, i16, i11)) {
                        iZza = zzjc.zze(i16, 0L);
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 66:
                    if (zzlgVar.zzc((zzlg<T>) t11, i16, i11)) {
                        iZza = zzjc.zzi(i16, zzc(t11, j8));
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 67:
                    if (zzlgVar.zzc((zzlg<T>) t11, i16, i11)) {
                        iZza = zzjc.zzf(i16, zzd(t11, j8));
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 68:
                    if (zzlgVar.zzc((zzlg<T>) t11, i16, i11)) {
                        iZza = zzjc.zzb(i16, (zzlc) unsafe.getObject(t11, j8), zzlgVar.zze(i11));
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                default:
                    i13 = i19;
                    break;
            }
            i11 += 3;
            i10 = 1048575;
        }
        zzmk<?, ?> zzmkVar = zzlgVar.zzp;
        int iZza4 = i13 + zzmkVar.zza((zzmk<?, ?>) zzmkVar.zzd(t11));
        if (!zzlgVar.zzh) {
            return iZza4;
        }
        zzjm<T> zzjmVarZza = zzlgVar.zzq.zza(t11);
        int iZza5 = zzjmVarZza.zza.zza();
        int iZza6 = 0;
        for (int i20 = 0; i20 < iZza5; i20++) {
            Map.Entry entryZza = zzjmVarZza.zza.zza(i20);
            iZza6 += zzjm.zza((zzjo<?>) entryZza.getKey(), entryZza.getValue());
        }
        for (Map.Entry entry : zzjmVarZza.zza.zzb()) {
            iZza6 += zzjm.zza((zzjo<?>) entry.getKey(), entry.getValue());
        }
        return iZza4 + iZza6;
    }

    private static <T> boolean zze(T t10, long j8) {
        return ((Boolean) zzml.zze(t10, j8)).booleanValue();
    }

    private final boolean zzc(T t10, int i5, int i10) {
        return zzml.zzc(t10, (long) (zzb(i10) & 1048575)) == i5;
    }

    private final int zzb(int i5) {
        return this.zzc[i5 + 2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t10, T t11, int i5) {
        int i10 = this.zzc[i5];
        if (zzc((zzlg<T>) t11, i10, i5)) {
            long jZzc = zzc(i5) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t11, jZzc);
            if (object != null) {
                zzlu zzluVarZze = zze(i5);
                if (!zzc((zzlg<T>) t10, i10, i5)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t10, jZzc, object);
                    } else {
                        Object objZza = zzluVarZze.zza();
                        zzluVarZze.zza(objZza, object);
                        unsafe.putObject(t10, jZzc, objZza);
                    }
                    zzb((zzlg<T>) t10, i10, i5);
                    return;
                }
                Object object2 = unsafe.getObject(t10, jZzc);
                if (!zzg(object2)) {
                    Object objZza2 = zzluVarZze.zza();
                    zzluVarZze.zza(objZza2, object2);
                    unsafe.putObject(t10, jZzc, objZza2);
                    object2 = objZza2;
                }
                zzluVarZze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i5] + " is present but null: " + String.valueOf(t11));
        }
    }

    private final void zzb(T t10, int i5) {
        int iZzb = zzb(i5);
        long j8 = 1048575 & iZzb;
        if (j8 == 1048575) {
            return;
        }
        zzml.zza((Object) t10, j8, (1 << (iZzb >>> 20)) | zzml.zzc(t10, j8));
    }

    private final void zzb(T t10, int i5, int i10) {
        zzml.zza((Object) t10, zzb(i10) & 1048575, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    @Override // com.google.android.gms.internal.measurement.zzlu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzb(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlg.zzb(java.lang.Object, java.lang.Object):boolean");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int zza(T r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.measurement.zzij r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlg.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzij):int");
    }

    private final int zza(int i5) {
        if (i5 < this.zze || i5 > this.zzf) {
            return -1;
        }
        return zza(i5, 0);
    }

    private final int zza(int i5, int i10) {
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

    /* JADX WARN: Removed duplicated region for block: B:123:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x028a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> com.google.android.gms.internal.measurement.zzlg<T> zza(java.lang.Class<T> r31, com.google.android.gms.internal.measurement.zzla r32, com.google.android.gms.internal.measurement.zzlk r33, com.google.android.gms.internal.measurement.zzkm r34, com.google.android.gms.internal.measurement.zzmk<?, ?> r35, com.google.android.gms.internal.measurement.zzji<?> r36, com.google.android.gms.internal.measurement.zzkv r37) {
        /*
            Method dump skipped, instructions count: 1015
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlg.zza(java.lang.Class, com.google.android.gms.internal.measurement.zzla, com.google.android.gms.internal.measurement.zzlk, com.google.android.gms.internal.measurement.zzkm, com.google.android.gms.internal.measurement.zzmk, com.google.android.gms.internal.measurement.zzji, com.google.android.gms.internal.measurement.zzkv):com.google.android.gms.internal.measurement.zzlg");
    }

    private final <UT, UB> UB zza(Object obj, int i5, UB ub, zzmk<UT, UB> zzmkVar, Object obj2) {
        zzjx zzjxVarZzd;
        int i10 = this.zzc[i5];
        Object objZze = zzml.zze(obj, zzc(i5) & 1048575);
        return (objZze == null || (zzjxVarZzd = zzd(i5)) == null) ? ub : (UB) zza(i5, i10, this.zzr.zze(objZze), zzjxVarZzd, (zzjx) ub, (zzmk<UT, zzjx>) zzmkVar, obj2);
    }

    private final <K, V, UT, UB> UB zza(int i5, int i10, Map<K, V> map, zzjx zzjxVar, UB ub, zzmk<UT, UB> zzmkVar, Object obj) {
        zzkt<?, ?> zzktVarZza = this.zzr.zza(zzf(i5));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzjxVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzmkVar.zzc(obj);
                }
                zzit zzitVarZzc = zzik.zzc(zzku.zza(zzktVarZza, next.getKey(), next.getValue()));
                try {
                    zzku.zza(zzitVarZzc.zzb(), zzktVarZza, next.getKey(), next.getValue());
                    zzmkVar.zza((zzmk<UT, UB>) ub, i10, zzitVarZzc.zza());
                    it.remove();
                } catch (IOException e7) {
                    throw new RuntimeException(e7);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t10, int i5) {
        zzlu zzluVarZze = zze(i5);
        long jZzc = zzc(i5) & 1048575;
        if (!zzc((zzlg<T>) t10, i5)) {
            return zzluVarZze.zza();
        }
        Object object = zzb.getObject(t10, jZzc);
        if (zzg(object)) {
            return object;
        }
        Object objZza = zzluVarZze.zza();
        if (object != null) {
            zzluVarZze.zza(objZza, object);
        }
        return objZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t10, int i5, int i10) {
        zzlu zzluVarZze = zze(i10);
        if (!zzc((zzlg<T>) t10, i5, i10)) {
            return zzluVarZze.zza();
        }
        Object object = zzb.getObject(t10, zzc(i10) & 1048575);
        if (zzg(object)) {
            return object;
        }
        Object objZza = zzluVarZze.zza();
        if (object != null) {
            zzluVarZze.zza(objZza, object);
        }
        return objZza;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final T zza() {
        return (T) this.zzn.zza(this.zzg);
    }

    private static Field zza(Class<?> cls, String str) {
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

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zza(T t10, T t11) {
        zzf(t10);
        t11.getClass();
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int iZzc = zzc(i5);
            long j8 = 1048575 & iZzc;
            int i10 = this.zzc[i5];
            switch ((iZzc & 267386880) >>> 20) {
                case 0:
                    if (zzc((zzlg<T>) t11, i5)) {
                        zzml.zza(t10, j8, zzml.zza(t11, j8));
                        zzb((zzlg<T>) t10, i5);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzc((zzlg<T>) t11, i5)) {
                        zzml.zza((Object) t10, j8, zzml.zzb(t11, j8));
                        zzb((zzlg<T>) t10, i5);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzc((zzlg<T>) t11, i5)) {
                        zzml.zza((Object) t10, j8, zzml.zzd(t11, j8));
                        zzb((zzlg<T>) t10, i5);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzc((zzlg<T>) t11, i5)) {
                        zzml.zza((Object) t10, j8, zzml.zzd(t11, j8));
                        zzb((zzlg<T>) t10, i5);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzc((zzlg<T>) t11, i5)) {
                        zzml.zza((Object) t10, j8, zzml.zzc(t11, j8));
                        zzb((zzlg<T>) t10, i5);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzc((zzlg<T>) t11, i5)) {
                        zzml.zza((Object) t10, j8, zzml.zzd(t11, j8));
                        zzb((zzlg<T>) t10, i5);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzc((zzlg<T>) t11, i5)) {
                        zzml.zza((Object) t10, j8, zzml.zzc(t11, j8));
                        zzb((zzlg<T>) t10, i5);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzc((zzlg<T>) t11, i5)) {
                        zzml.zzc(t10, j8, zzml.zzh(t11, j8));
                        zzb((zzlg<T>) t10, i5);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzc((zzlg<T>) t11, i5)) {
                        zzml.zza(t10, j8, zzml.zze(t11, j8));
                        zzb((zzlg<T>) t10, i5);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t10, t11, i5);
                    break;
                case 10:
                    if (zzc((zzlg<T>) t11, i5)) {
                        zzml.zza(t10, j8, zzml.zze(t11, j8));
                        zzb((zzlg<T>) t10, i5);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzc((zzlg<T>) t11, i5)) {
                        zzml.zza((Object) t10, j8, zzml.zzc(t11, j8));
                        zzb((zzlg<T>) t10, i5);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzc((zzlg<T>) t11, i5)) {
                        zzml.zza((Object) t10, j8, zzml.zzc(t11, j8));
                        zzb((zzlg<T>) t10, i5);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzc((zzlg<T>) t11, i5)) {
                        zzml.zza((Object) t10, j8, zzml.zzc(t11, j8));
                        zzb((zzlg<T>) t10, i5);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzc((zzlg<T>) t11, i5)) {
                        zzml.zza((Object) t10, j8, zzml.zzd(t11, j8));
                        zzb((zzlg<T>) t10, i5);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzc((zzlg<T>) t11, i5)) {
                        zzml.zza((Object) t10, j8, zzml.zzc(t11, j8));
                        zzb((zzlg<T>) t10, i5);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzc((zzlg<T>) t11, i5)) {
                        zzml.zza((Object) t10, j8, zzml.zzd(t11, j8));
                        zzb((zzlg<T>) t10, i5);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t10, t11, i5);
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
                    this.zzo.zza(t10, t11, j8);
                    break;
                case 50:
                    zzlw.zza(this.zzr, t10, t11, j8);
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
                    if (zzc((zzlg<T>) t11, i10, i5)) {
                        zzml.zza(t10, j8, zzml.zze(t11, j8));
                        zzb((zzlg<T>) t10, i10, i5);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(t10, t11, i5);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzc((zzlg<T>) t11, i10, i5)) {
                        zzml.zza(t10, j8, zzml.zze(t11, j8));
                        zzb((zzlg<T>) t10, i10, i5);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t10, t11, i5);
                    break;
            }
        }
        zzlw.zza(this.zzp, t10, t11);
        if (this.zzh) {
            zzlw.zza(this.zzq, t10, t11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:244:?, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0775 A[Catch: all -> 0x0062, TryCatch #3 {all -> 0x0062, blocks: (B:24:0x0058, B:186:0x0770, B:188:0x0775, B:189:0x077a, B:83:0x013a, B:84:0x014c, B:85:0x0164, B:86:0x017c, B:87:0x0194, B:88:0x01ac, B:90:0x01bc, B:93:0x01c3, B:94:0x01c9, B:95:0x01d7, B:96:0x01ef, B:97:0x0203, B:98:0x021b, B:99:0x0229, B:100:0x0241, B:101:0x0259, B:102:0x0271, B:103:0x0289, B:104:0x02a1, B:105:0x02b9, B:106:0x02d1, B:107:0x02e9, B:109:0x02ff, B:113:0x0320, B:110:0x0309, B:112:0x0311, B:114:0x0331, B:115:0x0349, B:116:0x035d, B:117:0x0371, B:118:0x0385, B:119:0x0399, B:128:0x03cc, B:129:0x03da, B:130:0x03ee, B:131:0x0402, B:132:0x0416, B:133:0x042a, B:134:0x043e, B:135:0x0452, B:136:0x0466, B:137:0x047a, B:138:0x048e, B:139:0x04a2, B:140:0x04b6, B:141:0x04ca, B:146:0x04f1, B:147:0x04ff, B:148:0x0513, B:149:0x052b, B:151:0x0537, B:152:0x0545, B:153:0x0553, B:154:0x0567, B:155:0x057b, B:156:0x058f, B:157:0x05a3, B:158:0x05b7, B:159:0x05cb, B:160:0x05df, B:161:0x05f3, B:162:0x060b, B:163:0x0620, B:164:0x0634, B:165:0x0648, B:166:0x065c, B:168:0x066b, B:171:0x0672, B:172:0x0678, B:173:0x0682, B:174:0x0696, B:175:0x06aa, B:176:0x06c2, B:177:0x06d0, B:178:0x06e4, B:179:0x06f8, B:180:0x070c, B:181:0x0720, B:182:0x0734, B:183:0x0748, B:184:0x075c), top: B:215:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x07ae A[LOOP:1: B:203:0x07aa->B:205:0x07ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0781 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzlu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r19, com.google.android.gms.internal.measurement.zzlr r20, com.google.android.gms.internal.measurement.zzjg r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2132
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlg.zza(java.lang.Object, com.google.android.gms.internal.measurement.zzlr, com.google.android.gms.internal.measurement.zzjg):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zza(T t10, byte[] bArr, int i5, int i10, zzij zzijVar) throws IOException {
        zza((zzlg<T>) t10, bArr, i5, i10, 0, zzijVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t10, T t11, int i5) {
        if (zzc((zzlg<T>) t11, i5)) {
            long jZzc = zzc(i5) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t11, jZzc);
            if (object != null) {
                zzlu zzluVarZze = zze(i5);
                if (!zzc((zzlg<T>) t10, i5)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t10, jZzc, object);
                    } else {
                        Object objZza = zzluVarZze.zza();
                        zzluVarZze.zza(objZza, object);
                        unsafe.putObject(t10, jZzc, objZza);
                    }
                    zzb((zzlg<T>) t10, i5);
                    return;
                }
                Object object2 = unsafe.getObject(t10, jZzc);
                if (!zzg(object2)) {
                    Object objZza2 = zzluVarZze.zza();
                    zzluVarZze.zza(objZza2, object2);
                    unsafe.putObject(t10, jZzc, objZza2);
                    object2 = objZza2;
                }
                zzluVarZze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i5] + " is present but null: " + String.valueOf(t11));
        }
    }

    private final void zza(Object obj, int i5, zzlr zzlrVar) throws IOException {
        if (zzg(i5)) {
            zzml.zza(obj, i5 & 1048575, zzlrVar.zzr());
        } else if (this.zzi) {
            zzml.zza(obj, i5 & 1048575, zzlrVar.zzq());
        } else {
            zzml.zza(obj, i5 & 1048575, zzlrVar.zzp());
        }
    }

    private final void zza(T t10, int i5, Object obj) {
        zzb.putObject(t10, zzc(i5) & 1048575, obj);
        zzb((zzlg<T>) t10, i5);
    }

    private final void zza(T t10, int i5, int i10, Object obj) {
        zzb.putObject(t10, zzc(i10) & 1048575, obj);
        zzb((zzlg<T>) t10, i5, i10);
    }

    private final <K, V> void zza(zznb zznbVar, int i5, Object obj, int i10) throws IOException {
        if (obj != null) {
            zznbVar.zza(i5, this.zzr.zza(zzf(i10)), this.zzr.zzd(obj));
        }
    }

    private static void zza(int i5, Object obj, zznb zznbVar) throws IOException {
        if (obj instanceof String) {
            zznbVar.zza(i5, (String) obj);
        } else {
            zznbVar.zza(i5, (zzik) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    @Override // com.google.android.gms.internal.measurement.zzlu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r21, com.google.android.gms.internal.measurement.zznb r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlg.zza(java.lang.Object, com.google.android.gms.internal.measurement.zznb):void");
    }

    private static <UT, UB> void zza(zzmk<UT, UB> zzmkVar, T t10, zznb zznbVar) throws IOException {
        zzmkVar.zzb((zzmk<UT, UB>) zzmkVar.zzd(t10), zznbVar);
    }

    private final boolean zza(T t10, int i5, int i10, int i11, int i12) {
        if (i10 == 1048575) {
            return zzc((zzlg<T>) t10, i5);
        }
        return (i11 & i12) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i5, zzlu zzluVar) {
        return zzluVar.zze(zzml.zze(obj, i5 & 1048575));
    }
}
