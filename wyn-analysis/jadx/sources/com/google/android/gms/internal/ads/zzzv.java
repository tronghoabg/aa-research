package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzzv extends zzzx {
    public zzzv(zzbg zzbgVar, int[] iArr, int i5, zzabr zzabrVar, long j8, long j10, long j11, int i10, int i11, float f10, float f11, List list, zzdp zzdpVar) {
        super(zzbgVar, iArr, 0);
        zzgwt.zzq(list);
    }

    public static /* synthetic */ zzgwt zzd(zzaba[] zzabaVarArr) {
        int i5;
        long[][] jArr;
        int i10 = 1;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (int i12 = 0; i12 < 2; i12++) {
            zzaba zzabaVar = zzabaVarArr[i12];
            if (zzabaVar == null || zzabaVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                int i13 = zzgwt.zzd;
                zzgwq zzgwqVar = new zzgwq();
                zzgwqVar.zzf(new zzzt(0L, 0L));
                arrayList.add(zzgwqVar);
            }
        }
        long[][] jArr2 = new long[2][];
        for (int i14 = 0; i14 < 2; i14++) {
            zzaba zzabaVar2 = zzabaVarArr[i14];
            if (zzabaVar2 == null) {
                jArr2[i14] = new long[0];
            } else {
                int[] iArr = zzabaVar2.zzb;
                jArr2[i14] = new long[iArr.length];
                for (int i15 = 0; i15 < iArr.length; i15++) {
                    long j8 = zzabaVar2.zza.zza(iArr[i15]).zzj;
                    long[] jArr3 = jArr2[i14];
                    if (j8 == -1) {
                        j8 = 0;
                    }
                    jArr3[i15] = j8;
                }
                Arrays.sort(jArr2[i14]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr4 = new long[2];
        for (int i16 = 0; i16 < 2; i16++) {
            long[] jArr5 = jArr2[i16];
            jArr4[i16] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        zzi(arrayList, jArr4);
        zzgxo zzgxoVarZza = zzgyi.zzc(zzgyn.zzb()).zzb(2).zza();
        int i17 = 0;
        while (i17 < 2) {
            int length = jArr2[i17].length;
            if (length <= i10) {
                i5 = i11;
                jArr = jArr2;
            } else {
                double[] dArr = new double[length];
                int i18 = i11;
                while (true) {
                    long[] jArr6 = jArr2[i17];
                    double dLog = 0.0d;
                    if (i18 >= jArr6.length) {
                        break;
                    }
                    int i19 = i11;
                    long[][] jArr7 = jArr2;
                    long j10 = jArr6[i18];
                    if (j10 != -1) {
                        dLog = Math.log(j10);
                    }
                    dArr[i18] = dLog;
                    i18 += i10;
                    i11 = i19;
                    jArr2 = jArr7;
                }
                i5 = i11;
                jArr = jArr2;
                int i20 = length - 1;
                double d3 = dArr[i20] - dArr[i5];
                int i21 = i5;
                while (i21 < i20) {
                    double d5 = dArr[i21];
                    i21 += i10;
                    zzgxoVarZza.zze(Double.valueOf(d3 == 0.0d ? 1.0d : (((d5 + dArr[i21]) * 0.5d) - dArr[i5]) / d3), Integer.valueOf(i17));
                    i10 = i10;
                }
            }
            i17++;
            i11 = i5;
            jArr2 = jArr;
            i10 = i10;
        }
        int i22 = i11;
        long[][] jArr8 = jArr2;
        zzgwt zzgwtVarZzq = zzgwt.zzq(zzgxoVarZza.zzt());
        while (i11 < zzgwtVarZzq.size()) {
            int iIntValue = ((Integer) zzgwtVarZzq.get(i11)).intValue();
            int i23 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i23;
            jArr4[iIntValue] = jArr8[iIntValue][i23];
            zzi(arrayList, jArr4);
            i11++;
        }
        for (int i24 = i22; i24 < 2; i24++) {
            if (arrayList.get(i24) != null) {
                long j11 = jArr4[i24];
                jArr4[i24] = j11 + j11;
            }
        }
        zzi(arrayList, jArr4);
        zzgwq zzgwqVar2 = new zzgwq();
        for (int i25 = i22; i25 < arrayList.size(); i25++) {
            zzgwq zzgwqVar3 = (zzgwq) arrayList.get(i25);
            zzgwqVar2.zzf(zzgwqVar3 == null ? zzgwt.zzi() : zzgwqVar3.zzi());
        }
        return zzgwqVar2.zzi();
    }

    private static void zzi(List list, long[] jArr) {
        long j8 = 0;
        for (int i5 = 0; i5 < 2; i5++) {
            j8 += jArr[i5];
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzgwq zzgwqVar = (zzgwq) list.get(i10);
            if (zzgwqVar != null) {
                zzgwqVar.zzf(new zzzt(j8, jArr[i10]));
            }
        }
    }
}
