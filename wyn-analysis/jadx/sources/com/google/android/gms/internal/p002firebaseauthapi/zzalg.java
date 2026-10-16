package com.google.android.gms.internal.p002firebaseauthapi;

import A7.AbstractC0279p0;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzalg<T> implements zzalv<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzamp.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzalc zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzalk zzn;
    private final zzakm zzo;
    private final zzamo<?, ?> zzp;
    private final zzajm<?> zzq;
    private final zzakz zzr;

    private zzalg(int[] iArr, Object[] objArr, int i5, int i10, zzalc zzalcVar, boolean z2, int[] iArr2, int i11, int i12, zzalk zzalkVar, zzakm zzakmVar, zzamo<?, ?> zzamoVar, zzajm<?> zzajmVar, zzakz zzakzVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i5;
        this.zzf = i10;
        this.zzi = zzalcVar instanceof zzajy;
        this.zzh = zzajmVar != null && zzajmVar.zza(zzalcVar);
        this.zzj = false;
        this.zzk = iArr2;
        this.zzl = i11;
        this.zzm = i12;
        this.zzn = zzalkVar;
        this.zzo = zzakmVar;
        this.zzp = zzamoVar;
        this.zzq = zzajmVar;
        this.zzg = zzalcVar;
        this.zzr = zzakzVar;
    }

    private static <T> double zza(T t10, long j8) {
        return ((Double) zzamp.zze(t10, j8)).doubleValue();
    }

    private static <T> float zzb(T t10, long j8) {
        return ((Float) zzamp.zze(t10, j8)).floatValue();
    }

    private static <T> int zzc(T t10, long j8) {
        return ((Integer) zzamp.zze(t10, j8)).intValue();
    }

    private static <T> long zzd(T t10, long j8) {
        return ((Long) zzamp.zze(t10, j8)).longValue();
    }

    private final zzalv zze(int i5) {
        int i10 = (i5 / 3) << 1;
        zzalv zzalvVar = (zzalv) this.zzd[i10];
        if (zzalvVar != null) {
            return zzalvVar;
        }
        zzalv<T> zzalvVarZza = zzalr.zza().zza((Class) this.zzd[i10 + 1]);
        this.zzd[i10] = zzalvVarZza;
        return zzalvVarZza;
    }

    private final Object zzf(int i5) {
        return this.zzd[(i5 / 3) << 1];
    }

    private static boolean zzg(int i5) {
        return (i5 & 536870912) != 0;
    }

    private static int zza(byte[] bArr, int i5, int i10, zzamw zzamwVar, Class<?> cls, zzaik zzaikVar) throws IOException {
        switch (zzalj.zza[zzamwVar.ordinal()]) {
            case 1:
                int iZzd = zzail.zzd(bArr, i5, zzaikVar);
                zzaikVar.zzc = Boolean.valueOf(zzaikVar.zzb != 0);
                return iZzd;
            case 2:
                return zzail.zza(bArr, i5, zzaikVar);
            case 3:
                zzaikVar.zzc = Double.valueOf(zzail.zza(bArr, i5));
                return i5 + 8;
            case 4:
            case 5:
                zzaikVar.zzc = Integer.valueOf(zzail.zzc(bArr, i5));
                return i5 + 4;
            case 6:
            case 7:
                zzaikVar.zzc = Long.valueOf(zzail.zzd(bArr, i5));
                return i5 + 8;
            case 8:
                zzaikVar.zzc = Float.valueOf(zzail.zzb(bArr, i5));
                return i5 + 4;
            case 9:
            case 10:
            case 11:
                int iZzc = zzail.zzc(bArr, i5, zzaikVar);
                zzaikVar.zzc = Integer.valueOf(zzaikVar.zza);
                return iZzc;
            case 12:
            case 13:
                int iZzd2 = zzail.zzd(bArr, i5, zzaikVar);
                zzaikVar.zzc = Long.valueOf(zzaikVar.zzb);
                return iZzd2;
            case 14:
                return zzail.zza(zzalr.zza().zza((Class) cls), bArr, i5, i10, zzaikVar);
            case 15:
                int iZzc2 = zzail.zzc(bArr, i5, zzaikVar);
                zzaikVar.zzc = Integer.valueOf(zzajb.zze(zzaikVar.zza));
                return iZzc2;
            case 16:
                int iZzd3 = zzail.zzd(bArr, i5, zzaikVar);
                zzaikVar.zzc = Long.valueOf(zzajb.zza(zzaikVar.zzb));
                return iZzd3;
            case 17:
                return zzail.zzb(bArr, i5, zzaikVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private final int zzc(int i5) {
        return this.zzc[i5 + 1];
    }

    private final zzakd zzd(int i5) {
        return (zzakd) this.zzd[((i5 / 3) << 1) + 1];
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
        if (obj instanceof zzajy) {
            return ((zzajy) obj).zzu();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
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
                    iZza = zzakb.zza(Double.doubleToLongBits(zzamp.zza(t10, j8)));
                    i11 = iZza + i5;
                    break;
                case 1:
                    i5 = i11 * 53;
                    iZza = Float.floatToIntBits(zzamp.zzb(t10, j8));
                    i11 = iZza + i5;
                    break;
                case 2:
                    i5 = i11 * 53;
                    iZza = zzakb.zza(zzamp.zzd(t10, j8));
                    i11 = iZza + i5;
                    break;
                case 3:
                    i5 = i11 * 53;
                    iZza = zzakb.zza(zzamp.zzd(t10, j8));
                    i11 = iZza + i5;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iZzc = zzamp.zzc(t10, j8);
                    i11 = i10 + iZzc;
                    break;
                case 5:
                    i5 = i11 * 53;
                    iZza = zzakb.zza(zzamp.zzd(t10, j8));
                    i11 = iZza + i5;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iZzc = zzamp.zzc(t10, j8);
                    i11 = i10 + iZzc;
                    break;
                case 7:
                    i5 = i11 * 53;
                    iZza = zzakb.zza(zzamp.zzh(t10, j8));
                    i11 = iZza + i5;
                    break;
                case 8:
                    i5 = i11 * 53;
                    iZza = ((String) zzamp.zze(t10, j8)).hashCode();
                    i11 = iZza + i5;
                    break;
                case 9:
                    Object objZze = zzamp.zze(t10, j8);
                    if (objZze != null) {
                        iHashCode = objZze.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i5 = i11 * 53;
                    iZza = zzamp.zze(t10, j8).hashCode();
                    i11 = iZza + i5;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iZzc = zzamp.zzc(t10, j8);
                    i11 = i10 + iZzc;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iZzc = zzamp.zzc(t10, j8);
                    i11 = i10 + iZzc;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iZzc = zzamp.zzc(t10, j8);
                    i11 = i10 + iZzc;
                    break;
                case 14:
                    i5 = i11 * 53;
                    iZza = zzakb.zza(zzamp.zzd(t10, j8));
                    i11 = iZza + i5;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iZzc = zzamp.zzc(t10, j8);
                    i11 = i10 + iZzc;
                    break;
                case 16:
                    i5 = i11 * 53;
                    iZza = zzakb.zza(zzamp.zzd(t10, j8));
                    i11 = iZza + i5;
                    break;
                case 17:
                    Object objZze2 = zzamp.zze(t10, j8);
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
                    iZza = zzamp.zze(t10, j8).hashCode();
                    i11 = iZza + i5;
                    break;
                case 50:
                    i5 = i11 * 53;
                    iZza = zzamp.zze(t10, j8).hashCode();
                    i11 = iZza + i5;
                    break;
                case 51:
                    if (zzc((zzalg<T>) t10, i13, i12)) {
                        i5 = i11 * 53;
                        iZza = zzakb.zza(Double.doubleToLongBits(zza(t10, j8)));
                        i11 = iZza + i5;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzc((zzalg<T>) t10, i13, i12)) {
                        i5 = i11 * 53;
                        iZza = Float.floatToIntBits(zzb(t10, j8));
                        i11 = iZza + i5;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzc((zzalg<T>) t10, i13, i12)) {
                        i5 = i11 * 53;
                        iZza = zzakb.zza(zzd(t10, j8));
                        i11 = iZza + i5;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzc((zzalg<T>) t10, i13, i12)) {
                        i5 = i11 * 53;
                        iZza = zzakb.zza(zzd(t10, j8));
                        i11 = iZza + i5;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzc((zzalg<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzc(t10, j8);
                        i11 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzc((zzalg<T>) t10, i13, i12)) {
                        i5 = i11 * 53;
                        iZza = zzakb.zza(zzd(t10, j8));
                        i11 = iZza + i5;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzc((zzalg<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzc(t10, j8);
                        i11 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzc((zzalg<T>) t10, i13, i12)) {
                        i5 = i11 * 53;
                        iZza = zzakb.zza(zze(t10, j8));
                        i11 = iZza + i5;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzc((zzalg<T>) t10, i13, i12)) {
                        i5 = i11 * 53;
                        iZza = ((String) zzamp.zze(t10, j8)).hashCode();
                        i11 = iZza + i5;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzc((zzalg<T>) t10, i13, i12)) {
                        i5 = i11 * 53;
                        iZza = zzamp.zze(t10, j8).hashCode();
                        i11 = iZza + i5;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzc((zzalg<T>) t10, i13, i12)) {
                        i5 = i11 * 53;
                        iZza = zzamp.zze(t10, j8).hashCode();
                        i11 = iZza + i5;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzc((zzalg<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzc(t10, j8);
                        i11 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzc((zzalg<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzc(t10, j8);
                        i11 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzc((zzalg<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzc(t10, j8);
                        i11 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzc((zzalg<T>) t10, i13, i12)) {
                        i5 = i11 * 53;
                        iZza = zzakb.zza(zzd(t10, j8));
                        i11 = iZza + i5;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzc((zzalg<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzc(t10, j8);
                        i11 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzc((zzalg<T>) t10, i13, i12)) {
                        i5 = i11 * 53;
                        iZza = zzakb.zza(zzd(t10, j8));
                        i11 = iZza + i5;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzc((zzalg<T>) t10, i13, i12)) {
                        i5 = i11 * 53;
                        iZza = zzamp.zze(t10, j8).hashCode();
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

    public static zzamn zzc(Object obj) {
        zzajy zzajyVar = (zzajy) obj;
        zzamn zzamnVar = zzajyVar.zzb;
        if (zzamnVar != zzamn.zzc()) {
            return zzamnVar;
        }
        zzamn zzamnVarZzd = zzamn.zzd();
        zzajyVar.zzb = zzamnVarZzd;
        return zzamnVarZzd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
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
            boolean r0 = r8 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzajy
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.gms.internal.firebase-auth-api.zzajy r0 = (com.google.android.gms.internal.p002firebaseauthapi.zzajy) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzb(r2)
            r0.zza = r1
            r0.zzt()
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
            sun.misc.Unsafe r2 = com.google.android.gms.internal.p002firebaseauthapi.zzalg.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L81
            com.google.android.gms.internal.firebase-auth-api.zzakz r6 = r7.zzr
            java.lang.Object r5 = r6.zzc(r5)
            r2.putObject(r8, r3, r5)
            goto L81
        L50:
            com.google.android.gms.internal.firebase-auth-api.zzakm r2 = r7.zzo
            r2.zzb(r8, r3)
            goto L81
        L56:
            int[] r2 = r7.zzc
            r2 = r2[r1]
            boolean r2 = r7.zzc(r8, r2, r1)
            if (r2 == 0) goto L81
            com.google.android.gms.internal.firebase-auth-api.zzalv r2 = r7.zze(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.p002firebaseauthapi.zzalg.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzd(r3)
            goto L81
        L6e:
            boolean r2 = r7.zzc(r8, r1)
            if (r2 == 0) goto L81
            com.google.android.gms.internal.firebase-auth-api.zzalv r2 = r7.zze(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.p002firebaseauthapi.zzalg.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzd(r3)
        L81:
            int r1 = r1 + 3
            goto L1e
        L84:
            com.google.android.gms.internal.firebase-auth-api.zzamo<?, ?> r0 = r7.zzp
            r0.zzf(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L92
            com.google.android.gms.internal.firebase-auth-api.zzajm<?> r0 = r7.zzq
            r0.zzc(r8)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzalg.zzd(java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7  */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.google.android.gms.internal.firebase-auth-api.zzalv] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [com.google.android.gms.internal.firebase-auth-api.zzalv] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zze(T r15) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzalg.zze(java.lang.Object):boolean");
    }

    private final boolean zzc(T t10, T t11, int i5) {
        return zzc((zzalg<T>) t10, i5) == zzc((zzalg<T>) t11, i5);
    }

    private final boolean zzc(T t10, int i5) {
        int iZzb = zzb(i5);
        long j8 = iZzb & 1048575;
        if (j8 != 1048575) {
            return (zzamp.zzc(t10, j8) & (1 << (iZzb >>> 20))) != 0;
        }
        int iZzc = zzc(i5);
        long j10 = iZzc & 1048575;
        switch ((iZzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzamp.zza(t10, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzamp.zzb(t10, j10)) != 0;
            case 2:
                return zzamp.zzd(t10, j10) != 0;
            case 3:
                return zzamp.zzd(t10, j10) != 0;
            case 4:
                return zzamp.zzc(t10, j10) != 0;
            case 5:
                return zzamp.zzd(t10, j10) != 0;
            case 6:
                return zzamp.zzc(t10, j10) != 0;
            case 7:
                return zzamp.zzh(t10, j10);
            case 8:
                Object objZze = zzamp.zze(t10, j10);
                if (objZze instanceof String) {
                    return !((String) objZze).isEmpty();
                }
                if (objZze instanceof zzaip) {
                    return !zzaip.zza.equals(objZze);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzamp.zze(t10, j10) != null;
            case 10:
                return !zzaip.zza.equals(zzamp.zze(t10, j10));
            case 11:
                return zzamp.zzc(t10, j10) != 0;
            case 12:
                return zzamp.zzc(t10, j10) != 0;
            case 13:
                return zzamp.zzc(t10, j10) != 0;
            case 14:
                return zzamp.zzd(t10, j10) != 0;
            case 15:
                return zzamp.zzc(t10, j10) != 0;
            case 16:
                return zzamp.zzd(t10, j10) != 0;
            case 17:
                return zzamp.zze(t10, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final int zza(T t10) {
        int i5;
        int iZza;
        int iZza2;
        int iZzb;
        int iZza3;
        int iZzd;
        int iZzi;
        int iZzj;
        zzalg<T> zzalgVar = this;
        T t11 = t10;
        Unsafe unsafe = zzb;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i11 < zzalgVar.zzc.length) {
            int iZzc = zzalgVar.zzc(i11);
            int i15 = (267386880 & iZzc) >>> 20;
            int[] iArr = zzalgVar.zzc;
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
            if (i15 >= zzajs.zza.zza()) {
                zzajs.zzb.zza();
            }
            int i19 = i13;
            switch (i15) {
                case 0:
                    if (zzalgVar.zza((zzalg<T>) t11, i11, i14, i12, i5)) {
                        iZza = zzajg.zza(i16, 0.0d);
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 1:
                    if (zzalgVar.zza((zzalg<T>) t11, i11, i14, i12, i5)) {
                        iZza2 = zzajg.zza(i16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        i13 = iZza2 + i19;
                        zzalgVar = this;
                        t11 = t10;
                        break;
                    }
                    zzalgVar = this;
                    t11 = t10;
                    i13 = i19;
                    break;
                case 2:
                    if (zzalgVar.zza((zzalg<T>) t11, i11, i14, i12, i5)) {
                        iZzb = zzajg.zzb(i16, unsafe.getLong(t11, j8));
                        i13 = iZzb + i19;
                        zzalgVar = this;
                        break;
                    }
                    zzalgVar = this;
                    i13 = i19;
                    break;
                case 3:
                    if (zzalgVar.zza((zzalg<T>) t11, i11, i14, i12, i5)) {
                        iZzb = zzajg.zze(i16, unsafe.getLong(t11, j8));
                        i13 = iZzb + i19;
                        zzalgVar = this;
                        break;
                    }
                    zzalgVar = this;
                    i13 = i19;
                    break;
                case 4:
                    if (zzalgVar.zza((zzalg<T>) t11, i11, i14, i12, i5)) {
                        iZzb = zzajg.zzd(i16, unsafe.getInt(t11, j8));
                        i13 = iZzb + i19;
                        zzalgVar = this;
                        break;
                    }
                    zzalgVar = this;
                    i13 = i19;
                    break;
                case 5:
                    if (zzalgVar.zza((zzalg<T>) t11, i11, i14, i12, i5)) {
                        iZza2 = zzajg.zza(i16, 0L);
                        i13 = iZza2 + i19;
                        zzalgVar = this;
                        t11 = t10;
                        break;
                    }
                    zzalgVar = this;
                    t11 = t10;
                    i13 = i19;
                    break;
                case 6:
                    if (zzalgVar.zza((zzalg<T>) t11, i11, i14, i12, i5)) {
                        iZza2 = zzajg.zzc(i16, 0);
                        i13 = iZza2 + i19;
                        zzalgVar = this;
                        t11 = t10;
                        break;
                    }
                    zzalgVar = this;
                    t11 = t10;
                    i13 = i19;
                    break;
                case 7:
                    if (zzalgVar.zza((zzalg<T>) t11, i11, i14, i12, i5)) {
                        iZza2 = zzajg.zza(i16, true);
                        i13 = iZza2 + i19;
                        zzalgVar = this;
                        t11 = t10;
                        break;
                    }
                    zzalgVar = this;
                    t11 = t10;
                    i13 = i19;
                    break;
                case 8:
                    if (zzalgVar.zza((zzalg<T>) t11, i11, i14, i12, i5)) {
                        Object object = unsafe.getObject(t11, j8);
                        if (object instanceof zzaip) {
                            iZzb = zzajg.zza(i16, (zzaip) object);
                        } else {
                            iZzb = zzajg.zza(i16, (String) object);
                        }
                        i13 = iZzb + i19;
                        zzalgVar = this;
                        break;
                    }
                    zzalgVar = this;
                    i13 = i19;
                    break;
                case 9:
                    if (zzalgVar.zza((zzalg<T>) t11, i11, i14, i12, i5)) {
                        iZza3 = zzalx.zza(i16, unsafe.getObject(t11, j8), (zzalv<?>) zzalgVar.zze(i11));
                        i13 = i19 + iZza3;
                        break;
                    }
                    i13 = i19;
                    break;
                case 10:
                    if (zzalgVar.zza((zzalg<T>) t11, i11, i14, i12, i5)) {
                        iZzb = zzajg.zza(i16, (zzaip) unsafe.getObject(t11, j8));
                        i13 = iZzb + i19;
                        zzalgVar = this;
                        break;
                    }
                    zzalgVar = this;
                    i13 = i19;
                    break;
                case 11:
                    if (zzalgVar.zza((zzalg<T>) t11, i11, i14, i12, i5)) {
                        iZzb = zzajg.zzg(i16, unsafe.getInt(t11, j8));
                        i13 = iZzb + i19;
                        zzalgVar = this;
                        break;
                    }
                    zzalgVar = this;
                    i13 = i19;
                    break;
                case 12:
                    if (zzalgVar.zza((zzalg<T>) t11, i11, i14, i12, i5)) {
                        iZzb = zzajg.zzb(i16, unsafe.getInt(t11, j8));
                        i13 = iZzb + i19;
                        zzalgVar = this;
                        break;
                    }
                    zzalgVar = this;
                    i13 = i19;
                    break;
                case 13:
                    if (zzalgVar.zza((zzalg<T>) t11, i11, i14, i12, i5)) {
                        iZza2 = zzajg.zze(i16, 0);
                        i13 = iZza2 + i19;
                        zzalgVar = this;
                        t11 = t10;
                        break;
                    }
                    zzalgVar = this;
                    t11 = t10;
                    i13 = i19;
                    break;
                case 14:
                    if (zzalgVar.zza((zzalg<T>) t11, i11, i14, i12, i5)) {
                        iZza2 = zzajg.zzc(i16, 0L);
                        i13 = iZza2 + i19;
                        zzalgVar = this;
                        t11 = t10;
                        break;
                    }
                    zzalgVar = this;
                    t11 = t10;
                    i13 = i19;
                    break;
                case 15:
                    if (zzalgVar.zza((zzalg<T>) t11, i11, i14, i12, i5)) {
                        iZzb = zzajg.zzf(i16, unsafe.getInt(t11, j8));
                        i13 = iZzb + i19;
                        zzalgVar = this;
                        break;
                    }
                    zzalgVar = this;
                    i13 = i19;
                    break;
                case 16:
                    if (zzalgVar.zza((zzalg<T>) t11, i11, i14, i12, i5)) {
                        iZzb = zzajg.zzd(i16, unsafe.getLong(t11, j8));
                        i13 = iZzb + i19;
                        zzalgVar = this;
                        break;
                    }
                    zzalgVar = this;
                    i13 = i19;
                    break;
                case 17:
                    if (zzalgVar.zza((zzalg<T>) t11, i11, i14, i12, i5)) {
                        iZza = zzajg.zza(i16, (zzalc) unsafe.getObject(t11, j8), zzalgVar.zze(i11));
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 18:
                    iZza3 = zzalx.zzd(i16, (List) unsafe.getObject(t11, j8), false);
                    i13 = i19 + iZza3;
                    break;
                case 19:
                    iZza3 = zzalx.zzc(i16, (List) unsafe.getObject(t11, j8), false);
                    i13 = i19 + iZza3;
                    break;
                case 20:
                    iZza3 = zzalx.zzf(i16, (List) unsafe.getObject(t11, j8), false);
                    i13 = i19 + iZza3;
                    break;
                case 21:
                    iZza3 = zzalx.zzj(i16, (List) unsafe.getObject(t11, j8), false);
                    i13 = i19 + iZza3;
                    break;
                case 22:
                    iZza3 = zzalx.zze(i16, (List) unsafe.getObject(t11, j8), false);
                    i13 = i19 + iZza3;
                    break;
                case 23:
                    iZza3 = zzalx.zzd(i16, (List) unsafe.getObject(t11, j8), false);
                    i13 = i19 + iZza3;
                    break;
                case 24:
                    iZza3 = zzalx.zzc(i16, (List) unsafe.getObject(t11, j8), false);
                    i13 = i19 + iZza3;
                    break;
                case 25:
                    iZza3 = zzalx.zza(i16, (List<?>) unsafe.getObject(t11, j8), false);
                    i13 = i19 + iZza3;
                    break;
                case 26:
                    iZza3 = zzalx.zzb(i16, (List) unsafe.getObject(t11, j8));
                    i13 = i19 + iZza3;
                    break;
                case 27:
                    iZza3 = zzalx.zzb(i16, (List<?>) unsafe.getObject(t11, j8), (zzalv<?>) zzalgVar.zze(i11));
                    i13 = i19 + iZza3;
                    break;
                case 28:
                    iZza3 = zzalx.zza(i16, (List<zzaip>) unsafe.getObject(t11, j8));
                    i13 = i19 + iZza3;
                    break;
                case 29:
                    iZza3 = zzalx.zzi(i16, (List) unsafe.getObject(t11, j8), false);
                    i13 = i19 + iZza3;
                    break;
                case 30:
                    iZza3 = zzalx.zzb(i16, (List<Integer>) unsafe.getObject(t11, j8), false);
                    i13 = i19 + iZza3;
                    break;
                case 31:
                    iZza3 = zzalx.zzc(i16, (List) unsafe.getObject(t11, j8), false);
                    i13 = i19 + iZza3;
                    break;
                case 32:
                    iZza3 = zzalx.zzd(i16, (List) unsafe.getObject(t11, j8), false);
                    i13 = i19 + iZza3;
                    break;
                case 33:
                    iZza3 = zzalx.zzg(i16, (List) unsafe.getObject(t11, j8), false);
                    i13 = i19 + iZza3;
                    break;
                case 34:
                    iZza3 = zzalx.zzh(i16, (List) unsafe.getObject(t11, j8), false);
                    i13 = i19 + iZza3;
                    break;
                case 35:
                    iZzd = zzalx.zzd((List) unsafe.getObject(t11, j8));
                    if (iZzd > 0) {
                        iZzi = zzajg.zzi(i16);
                        iZzj = zzajg.zzj(iZzd);
                        i13 = iZzj + iZzi + iZzd + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 36:
                    iZzd = zzalx.zzc((List) unsafe.getObject(t11, j8));
                    if (iZzd > 0) {
                        iZzi = zzajg.zzi(i16);
                        iZzj = zzajg.zzj(iZzd);
                        i13 = iZzj + iZzi + iZzd + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 37:
                    iZzd = zzalx.zzf((List) unsafe.getObject(t11, j8));
                    if (iZzd > 0) {
                        iZzi = zzajg.zzi(i16);
                        iZzj = zzajg.zzj(iZzd);
                        i13 = iZzj + iZzi + iZzd + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 38:
                    iZzd = zzalx.zzj((List) unsafe.getObject(t11, j8));
                    if (iZzd > 0) {
                        iZzi = zzajg.zzi(i16);
                        iZzj = zzajg.zzj(iZzd);
                        i13 = iZzj + iZzi + iZzd + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 39:
                    iZzd = zzalx.zze((List) unsafe.getObject(t11, j8));
                    if (iZzd > 0) {
                        iZzi = zzajg.zzi(i16);
                        iZzj = zzajg.zzj(iZzd);
                        i13 = iZzj + iZzi + iZzd + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 40:
                    iZzd = zzalx.zzd((List) unsafe.getObject(t11, j8));
                    if (iZzd > 0) {
                        iZzi = zzajg.zzi(i16);
                        iZzj = zzajg.zzj(iZzd);
                        i13 = iZzj + iZzi + iZzd + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 41:
                    iZzd = zzalx.zzc((List) unsafe.getObject(t11, j8));
                    if (iZzd > 0) {
                        iZzi = zzajg.zzi(i16);
                        iZzj = zzajg.zzj(iZzd);
                        i13 = iZzj + iZzi + iZzd + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 42:
                    iZzd = zzalx.zza((List<?>) unsafe.getObject(t11, j8));
                    if (iZzd > 0) {
                        iZzi = zzajg.zzi(i16);
                        iZzj = zzajg.zzj(iZzd);
                        i13 = iZzj + iZzi + iZzd + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 43:
                    iZzd = zzalx.zzi((List) unsafe.getObject(t11, j8));
                    if (iZzd > 0) {
                        iZzi = zzajg.zzi(i16);
                        iZzj = zzajg.zzj(iZzd);
                        i13 = iZzj + iZzi + iZzd + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 44:
                    iZzd = zzalx.zzb((List) unsafe.getObject(t11, j8));
                    if (iZzd > 0) {
                        iZzi = zzajg.zzi(i16);
                        iZzj = zzajg.zzj(iZzd);
                        i13 = iZzj + iZzi + iZzd + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 45:
                    iZzd = zzalx.zzc((List) unsafe.getObject(t11, j8));
                    if (iZzd > 0) {
                        iZzi = zzajg.zzi(i16);
                        iZzj = zzajg.zzj(iZzd);
                        i13 = iZzj + iZzi + iZzd + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 46:
                    iZzd = zzalx.zzd((List) unsafe.getObject(t11, j8));
                    if (iZzd > 0) {
                        iZzi = zzajg.zzi(i16);
                        iZzj = zzajg.zzj(iZzd);
                        i13 = iZzj + iZzi + iZzd + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 47:
                    iZzd = zzalx.zzg((List) unsafe.getObject(t11, j8));
                    if (iZzd > 0) {
                        iZzi = zzajg.zzi(i16);
                        iZzj = zzajg.zzj(iZzd);
                        i13 = iZzj + iZzi + iZzd + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 48:
                    iZzd = zzalx.zzh((List) unsafe.getObject(t11, j8));
                    if (iZzd > 0) {
                        iZzi = zzajg.zzi(i16);
                        iZzj = zzajg.zzj(iZzd);
                        i13 = iZzj + iZzi + iZzd + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 49:
                    iZza3 = zzalx.zza(i16, (List<zzalc>) unsafe.getObject(t11, j8), (zzalv<?>) zzalgVar.zze(i11));
                    i13 = i19 + iZza3;
                    break;
                case 50:
                    iZza3 = zzalgVar.zzr.zza(i16, unsafe.getObject(t11, j8), zzalgVar.zzf(i11));
                    i13 = i19 + iZza3;
                    break;
                case 51:
                    if (zzalgVar.zzc((zzalg<T>) t11, i16, i11)) {
                        iZza = zzajg.zza(i16, 0.0d);
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 52:
                    if (zzalgVar.zzc((zzalg<T>) t11, i16, i11)) {
                        iZza = zzajg.zza(i16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 53:
                    if (zzalgVar.zzc((zzalg<T>) t11, i16, i11)) {
                        iZza = zzajg.zzb(i16, zzd(t11, j8));
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 54:
                    if (zzalgVar.zzc((zzalg<T>) t11, i16, i11)) {
                        iZza = zzajg.zze(i16, zzd(t11, j8));
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 55:
                    if (zzalgVar.zzc((zzalg<T>) t11, i16, i11)) {
                        iZza = zzajg.zzd(i16, zzc(t11, j8));
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 56:
                    if (zzalgVar.zzc((zzalg<T>) t11, i16, i11)) {
                        iZza = zzajg.zza(i16, 0L);
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 57:
                    if (zzalgVar.zzc((zzalg<T>) t11, i16, i11)) {
                        iZza = zzajg.zzc(i16, 0);
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 58:
                    if (zzalgVar.zzc((zzalg<T>) t11, i16, i11)) {
                        iZza = zzajg.zza(i16, true);
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 59:
                    if (zzalgVar.zzc((zzalg<T>) t11, i16, i11)) {
                        Object object2 = unsafe.getObject(t11, j8);
                        if (object2 instanceof zzaip) {
                            iZza = zzajg.zza(i16, (zzaip) object2);
                        } else {
                            iZza = zzajg.zza(i16, (String) object2);
                        }
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 60:
                    if (zzalgVar.zzc((zzalg<T>) t11, i16, i11)) {
                        iZza3 = zzalx.zza(i16, unsafe.getObject(t11, j8), (zzalv<?>) zzalgVar.zze(i11));
                        i13 = i19 + iZza3;
                        break;
                    }
                    i13 = i19;
                    break;
                case 61:
                    if (zzalgVar.zzc((zzalg<T>) t11, i16, i11)) {
                        iZza = zzajg.zza(i16, (zzaip) unsafe.getObject(t11, j8));
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 62:
                    if (zzalgVar.zzc((zzalg<T>) t11, i16, i11)) {
                        iZza = zzajg.zzg(i16, zzc(t11, j8));
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 63:
                    if (zzalgVar.zzc((zzalg<T>) t11, i16, i11)) {
                        iZza = zzajg.zzb(i16, zzc(t11, j8));
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 64:
                    if (zzalgVar.zzc((zzalg<T>) t11, i16, i11)) {
                        iZza = zzajg.zze(i16, 0);
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 65:
                    if (zzalgVar.zzc((zzalg<T>) t11, i16, i11)) {
                        iZza = zzajg.zzc(i16, 0L);
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 66:
                    if (zzalgVar.zzc((zzalg<T>) t11, i16, i11)) {
                        iZza = zzajg.zzf(i16, zzc(t11, j8));
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 67:
                    if (zzalgVar.zzc((zzalg<T>) t11, i16, i11)) {
                        iZza = zzajg.zzd(i16, zzd(t11, j8));
                        i13 = iZza + i19;
                        break;
                    }
                    i13 = i19;
                    break;
                case 68:
                    if (zzalgVar.zzc((zzalg<T>) t11, i16, i11)) {
                        iZza = zzajg.zza(i16, (zzalc) unsafe.getObject(t11, j8), zzalgVar.zze(i11));
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
        zzamo<?, ?> zzamoVar = zzalgVar.zzp;
        int iZza4 = i13 + zzamoVar.zza((zzamo<?, ?>) zzamoVar.zzd(t11));
        if (!zzalgVar.zzh) {
            return iZza4;
        }
        zzajr<T> zzajrVarZza = zzalgVar.zzq.zza(t11);
        int iZza5 = zzajrVarZza.zza.zza();
        int iZza6 = 0;
        for (int i20 = 0; i20 < iZza5; i20++) {
            Map.Entry entryZza = zzajrVarZza.zza.zza(i20);
            iZza6 += zzajr.zza((zzajt<?>) entryZza.getKey(), entryZza.getValue());
        }
        for (Map.Entry entry : zzajrVarZza.zza.zzb()) {
            iZza6 += zzajr.zza((zzajt<?>) entry.getKey(), entry.getValue());
        }
        return iZza4 + iZza6;
    }

    private static <T> boolean zze(T t10, long j8) {
        return ((Boolean) zzamp.zze(t10, j8)).booleanValue();
    }

    private final boolean zzc(T t10, int i5, int i10) {
        return zzamp.zzc(t10, (long) (zzb(i10) & 1048575)) == i5;
    }

    private final int zzb(int i5) {
        return this.zzc[i5 + 2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t10, T t11, int i5) {
        int i10 = this.zzc[i5];
        if (zzc((zzalg<T>) t11, i10, i5)) {
            long jZzc = zzc(i5) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t11, jZzc);
            if (object != null) {
                zzalv zzalvVarZze = zze(i5);
                if (!zzc((zzalg<T>) t10, i10, i5)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t10, jZzc, object);
                    } else {
                        Object objZza = zzalvVarZze.zza();
                        zzalvVarZze.zza(objZza, object);
                        unsafe.putObject(t10, jZzc, objZza);
                    }
                    zzb((zzalg<T>) t10, i10, i5);
                    return;
                }
                Object object2 = unsafe.getObject(t10, jZzc);
                if (!zzg(object2)) {
                    Object objZza2 = zzalvVarZze.zza();
                    zzalvVarZze.zza(objZza2, object2);
                    unsafe.putObject(t10, jZzc, objZza2);
                    object2 = objZza2;
                }
                zzalvVarZze.zza(object2, object);
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
        zzamp.zza((Object) t10, j8, (1 << (iZzb >>> 20)) | zzamp.zzc(t10, j8));
    }

    private final void zzb(T t10, int i5, int i10) {
        zzamp.zza((Object) t10, zzb(i10) & 1048575, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzb(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzalg.zzb(java.lang.Object, java.lang.Object):boolean");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int zza(T r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.p002firebaseauthapi.zzaik r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzalg.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.firebase-auth-api.zzaik):int");
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
    public static <T> com.google.android.gms.internal.p002firebaseauthapi.zzalg<T> zza(java.lang.Class<T> r31, com.google.android.gms.internal.p002firebaseauthapi.zzala r32, com.google.android.gms.internal.p002firebaseauthapi.zzalk r33, com.google.android.gms.internal.p002firebaseauthapi.zzakm r34, com.google.android.gms.internal.p002firebaseauthapi.zzamo<?, ?> r35, com.google.android.gms.internal.p002firebaseauthapi.zzajm<?> r36, com.google.android.gms.internal.p002firebaseauthapi.zzakz r37) {
        /*
            Method dump skipped, instructions count: 1015
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzalg.zza(java.lang.Class, com.google.android.gms.internal.firebase-auth-api.zzala, com.google.android.gms.internal.firebase-auth-api.zzalk, com.google.android.gms.internal.firebase-auth-api.zzakm, com.google.android.gms.internal.firebase-auth-api.zzamo, com.google.android.gms.internal.firebase-auth-api.zzajm, com.google.android.gms.internal.firebase-auth-api.zzakz):com.google.android.gms.internal.firebase-auth-api.zzalg");
    }

    private final <UT, UB> UB zza(Object obj, int i5, UB ub, zzamo<UT, UB> zzamoVar, Object obj2) {
        zzakd zzakdVarZzd;
        int i10 = this.zzc[i5];
        Object objZze = zzamp.zze(obj, zzc(i5) & 1048575);
        return (objZze == null || (zzakdVarZzd = zzd(i5)) == null) ? ub : (UB) zza(i5, i10, this.zzr.zze(objZze), zzakdVarZzd, (zzakd) ub, (zzamo<UT, zzakd>) zzamoVar, obj2);
    }

    private final <K, V, UT, UB> UB zza(int i5, int i10, Map<K, V> map, zzakd zzakdVar, UB ub, zzamo<UT, UB> zzamoVar, Object obj) {
        zzakx<?, ?> zzakxVarZza = this.zzr.zza(zzf(i5));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzakdVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzamoVar.zzc(obj);
                }
                zzaiu zzaiuVarZzc = zzaip.zzc(zzaku.zza(zzakxVarZza, next.getKey(), next.getValue()));
                try {
                    zzaku.zza(zzaiuVarZzc.zzb(), zzakxVarZza, next.getKey(), next.getValue());
                    zzamoVar.zza((zzamo<UT, UB>) ub, i10, zzaiuVarZzc.zza());
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
        zzalv zzalvVarZze = zze(i5);
        long jZzc = zzc(i5) & 1048575;
        if (!zzc((zzalg<T>) t10, i5)) {
            return zzalvVarZze.zza();
        }
        Object object = zzb.getObject(t10, jZzc);
        if (zzg(object)) {
            return object;
        }
        Object objZza = zzalvVarZze.zza();
        if (object != null) {
            zzalvVarZze.zza(objZza, object);
        }
        return objZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t10, int i5, int i10) {
        zzalv zzalvVarZze = zze(i10);
        if (!zzc((zzalg<T>) t10, i5, i10)) {
            return zzalvVarZze.zza();
        }
        Object object = zzb.getObject(t10, zzc(i10) & 1048575);
        if (zzg(object)) {
            return object;
        }
        Object objZza = zzalvVarZze.zza();
        if (object != null) {
            zzalvVarZze.zza(objZza, object);
        }
        return objZza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final void zza(T t10, T t11) {
        zzf(t10);
        t11.getClass();
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int iZzc = zzc(i5);
            long j8 = 1048575 & iZzc;
            int i10 = this.zzc[i5];
            switch ((iZzc & 267386880) >>> 20) {
                case 0:
                    if (zzc((zzalg<T>) t11, i5)) {
                        zzamp.zza(t10, j8, zzamp.zza(t11, j8));
                        zzb((zzalg<T>) t10, i5);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzc((zzalg<T>) t11, i5)) {
                        zzamp.zza((Object) t10, j8, zzamp.zzb(t11, j8));
                        zzb((zzalg<T>) t10, i5);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzc((zzalg<T>) t11, i5)) {
                        zzamp.zza((Object) t10, j8, zzamp.zzd(t11, j8));
                        zzb((zzalg<T>) t10, i5);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzc((zzalg<T>) t11, i5)) {
                        zzamp.zza((Object) t10, j8, zzamp.zzd(t11, j8));
                        zzb((zzalg<T>) t10, i5);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzc((zzalg<T>) t11, i5)) {
                        zzamp.zza((Object) t10, j8, zzamp.zzc(t11, j8));
                        zzb((zzalg<T>) t10, i5);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzc((zzalg<T>) t11, i5)) {
                        zzamp.zza((Object) t10, j8, zzamp.zzd(t11, j8));
                        zzb((zzalg<T>) t10, i5);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzc((zzalg<T>) t11, i5)) {
                        zzamp.zza((Object) t10, j8, zzamp.zzc(t11, j8));
                        zzb((zzalg<T>) t10, i5);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzc((zzalg<T>) t11, i5)) {
                        zzamp.zzc(t10, j8, zzamp.zzh(t11, j8));
                        zzb((zzalg<T>) t10, i5);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzc((zzalg<T>) t11, i5)) {
                        zzamp.zza(t10, j8, zzamp.zze(t11, j8));
                        zzb((zzalg<T>) t10, i5);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t10, t11, i5);
                    break;
                case 10:
                    if (zzc((zzalg<T>) t11, i5)) {
                        zzamp.zza(t10, j8, zzamp.zze(t11, j8));
                        zzb((zzalg<T>) t10, i5);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzc((zzalg<T>) t11, i5)) {
                        zzamp.zza((Object) t10, j8, zzamp.zzc(t11, j8));
                        zzb((zzalg<T>) t10, i5);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzc((zzalg<T>) t11, i5)) {
                        zzamp.zza((Object) t10, j8, zzamp.zzc(t11, j8));
                        zzb((zzalg<T>) t10, i5);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzc((zzalg<T>) t11, i5)) {
                        zzamp.zza((Object) t10, j8, zzamp.zzc(t11, j8));
                        zzb((zzalg<T>) t10, i5);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzc((zzalg<T>) t11, i5)) {
                        zzamp.zza((Object) t10, j8, zzamp.zzd(t11, j8));
                        zzb((zzalg<T>) t10, i5);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzc((zzalg<T>) t11, i5)) {
                        zzamp.zza((Object) t10, j8, zzamp.zzc(t11, j8));
                        zzb((zzalg<T>) t10, i5);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzc((zzalg<T>) t11, i5)) {
                        zzamp.zza((Object) t10, j8, zzamp.zzd(t11, j8));
                        zzb((zzalg<T>) t10, i5);
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
                    zzalx.zza(this.zzr, t10, t11, j8);
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
                    if (zzc((zzalg<T>) t11, i10, i5)) {
                        zzamp.zza(t10, j8, zzamp.zze(t11, j8));
                        zzb((zzalg<T>) t10, i10, i5);
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
                    if (zzc((zzalg<T>) t11, i10, i5)) {
                        zzamp.zza(t10, j8, zzamp.zze(t11, j8));
                        zzb((zzalg<T>) t10, i10, i5);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t10, t11, i5);
                    break;
            }
        }
        zzalx.zza(this.zzp, t10, t11);
        if (this.zzh) {
            zzalx.zza(this.zzq, t10, t11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:244:?, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0775 A[Catch: all -> 0x0062, TryCatch #2 {all -> 0x0062, blocks: (B:24:0x0058, B:186:0x0770, B:188:0x0775, B:189:0x077a, B:83:0x013a, B:84:0x014c, B:85:0x0164, B:86:0x017c, B:87:0x0194, B:88:0x01ac, B:90:0x01bc, B:93:0x01c3, B:94:0x01c9, B:95:0x01d7, B:96:0x01ef, B:97:0x0203, B:98:0x021b, B:99:0x0229, B:100:0x0241, B:101:0x0259, B:102:0x0271, B:103:0x0289, B:104:0x02a1, B:105:0x02b9, B:106:0x02d1, B:107:0x02e9, B:109:0x02ff, B:113:0x0320, B:110:0x0309, B:112:0x0311, B:114:0x0331, B:115:0x0349, B:116:0x035d, B:117:0x0371, B:118:0x0385, B:119:0x0399, B:128:0x03cc, B:129:0x03da, B:130:0x03ee, B:131:0x0402, B:132:0x0416, B:133:0x042a, B:134:0x043e, B:135:0x0452, B:136:0x0466, B:137:0x047a, B:138:0x048e, B:139:0x04a2, B:140:0x04b6, B:141:0x04ca, B:146:0x04f1, B:147:0x04ff, B:148:0x0513, B:149:0x052b, B:151:0x0537, B:152:0x0545, B:153:0x0553, B:154:0x0567, B:155:0x057b, B:156:0x058f, B:157:0x05a3, B:158:0x05b7, B:159:0x05cb, B:160:0x05df, B:161:0x05f3, B:162:0x060b, B:163:0x0620, B:164:0x0634, B:165:0x0648, B:166:0x065c, B:168:0x066b, B:171:0x0672, B:172:0x0678, B:173:0x0682, B:174:0x0696, B:175:0x06aa, B:176:0x06c2, B:177:0x06d0, B:178:0x06e4, B:179:0x06f8, B:180:0x070c, B:181:0x0720, B:182:0x0734, B:183:0x0748, B:184:0x075c), top: B:213:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x07ae A[LOOP:1: B:203:0x07aa->B:205:0x07ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0781 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r19, com.google.android.gms.internal.p002firebaseauthapi.zzals r20, com.google.android.gms.internal.p002firebaseauthapi.zzajk r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2132
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzalg.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzals, com.google.android.gms.internal.firebase-auth-api.zzajk):void");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final void zza(T t10, byte[] bArr, int i5, int i10, zzaik zzaikVar) throws IOException {
        zza((zzalg<T>) t10, bArr, i5, i10, 0, zzaikVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t10, T t11, int i5) {
        if (zzc((zzalg<T>) t11, i5)) {
            long jZzc = zzc(i5) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t11, jZzc);
            if (object != null) {
                zzalv zzalvVarZze = zze(i5);
                if (!zzc((zzalg<T>) t10, i5)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t10, jZzc, object);
                    } else {
                        Object objZza = zzalvVarZze.zza();
                        zzalvVarZze.zza(objZza, object);
                        unsafe.putObject(t10, jZzc, objZza);
                    }
                    zzb((zzalg<T>) t10, i5);
                    return;
                }
                Object object2 = unsafe.getObject(t10, jZzc);
                if (!zzg(object2)) {
                    Object objZza2 = zzalvVarZze.zza();
                    zzalvVarZze.zza(objZza2, object2);
                    unsafe.putObject(t10, jZzc, objZza2);
                    object2 = objZza2;
                }
                zzalvVarZze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i5] + " is present but null: " + String.valueOf(t11));
        }
    }

    private final void zza(Object obj, int i5, zzals zzalsVar) throws IOException {
        if (zzg(i5)) {
            zzamp.zza(obj, i5 & 1048575, zzalsVar.zzr());
        } else if (this.zzi) {
            zzamp.zza(obj, i5 & 1048575, zzalsVar.zzq());
        } else {
            zzamp.zza(obj, i5 & 1048575, zzalsVar.zzp());
        }
    }

    private final void zza(T t10, int i5, Object obj) {
        zzb.putObject(t10, zzc(i5) & 1048575, obj);
        zzb((zzalg<T>) t10, i5);
    }

    private final void zza(T t10, int i5, int i10, Object obj) {
        zzb.putObject(t10, zzc(i10) & 1048575, obj);
        zzb((zzalg<T>) t10, i5, i10);
    }

    private final <K, V> void zza(zzanf zzanfVar, int i5, Object obj, int i10) throws IOException {
        if (obj != null) {
            zzanfVar.zza(i5, this.zzr.zza(zzf(i10)), this.zzr.zzd(obj));
        }
    }

    private static void zza(int i5, Object obj, zzanf zzanfVar) throws IOException {
        if (obj instanceof String) {
            zzanfVar.zza(i5, (String) obj);
        } else {
            zzanfVar.zza(i5, (zzaip) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r21, com.google.android.gms.internal.p002firebaseauthapi.zzanf r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzalg.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzanf):void");
    }

    private static <UT, UB> void zza(zzamo<UT, UB> zzamoVar, T t10, zzanf zzanfVar) throws IOException {
        zzamoVar.zzb((zzamo<UT, UB>) zzamoVar.zzd(t10), zzanfVar);
    }

    private final boolean zza(T t10, int i5, int i10, int i11, int i12) {
        if (i10 == 1048575) {
            return zzc((zzalg<T>) t10, i5);
        }
        return (i11 & i12) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i5, zzalv zzalvVar) {
        return zzalvVar.zze(zzamp.zze(obj, i5 & 1048575));
    }
}
