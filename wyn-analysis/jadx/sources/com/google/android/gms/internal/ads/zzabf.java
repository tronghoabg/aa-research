package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class zzabf extends zzabi {
    public abstract Pair zzh(zzabe zzabeVar, int[][][] iArr, int[] iArr2, zzxl zzxlVar, zzbf zzbfVar) throws zzjm;

    @Override // com.google.android.gms.internal.ads.zzabi
    public final void zzq(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzabi
    public final zzabj zzr(zzne[] zzneVarArr, zzzo zzzoVar, zzxl zzxlVar, zzbf zzbfVar) throws zzjm {
        int[] iArr;
        int[] iArr2 = new int[3];
        zzbg[][] zzbgVarArr = new zzbg[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i5 = 0; i5 < 3; i5++) {
            int i10 = zzzoVar.zzb;
            zzbgVarArr[i5] = new zzbg[i10];
            iArr3[i5] = new int[i10][];
        }
        int i11 = 2;
        int[] iArr4 = new int[2];
        for (int i12 = 0; i12 < 2; i12++) {
            iArr4[i12] = zzneVarArr[i12].zzu();
        }
        int i13 = 0;
        while (i13 < zzzoVar.zzb) {
            zzbg zzbgVarZza = zzzoVar.zza(i13);
            int i14 = zzbgVarZza.zzc;
            int i15 = i11;
            int i16 = 0;
            int i17 = 0;
            boolean z2 = true;
            while (i16 < i11) {
                zzne zzneVar = zzneVarArr[i16];
                int iMax = 0;
                for (int i18 = 0; i18 < zzbgVarZza.zza; i18++) {
                    iMax = Math.max(iMax, zzneVar.zzae(zzbgVarZza.zza(i18)) & 7);
                }
                boolean z10 = iArr2[i16] == 0;
                if (iMax > i17) {
                    z2 = z10;
                    i15 = i16;
                    i17 = iMax;
                } else if (iMax == i17 && i14 == 5 && !z2 && z10) {
                    i15 = i16;
                    i17 = iMax;
                    z2 = true;
                }
                i16++;
                i11 = 2;
            }
            if (i15 == i11) {
                iArr = new int[zzbgVarZza.zza];
            } else {
                zzne zzneVar2 = zzneVarArr[i15];
                int i19 = zzbgVarZza.zza;
                int[] iArr5 = new int[i19];
                for (int i20 = 0; i20 < i19; i20++) {
                    iArr5[i20] = zzneVar2.zzae(zzbgVarZza.zza(i20));
                }
                iArr = iArr5;
            }
            int i21 = iArr2[i15];
            zzbgVarArr[i15][i21] = zzbgVarZza;
            iArr3[i15][i21] = iArr;
            iArr2[i15] = i21 + 1;
            i13++;
            i11 = 2;
        }
        zzzo[] zzzoVarArr = new zzzo[i11];
        String[] strArr = new String[i11];
        int[] iArr6 = new int[i11];
        int i22 = 0;
        while (i22 < i11) {
            int i23 = iArr2[i22];
            zzzoVarArr[i22] = new zzzo((zzbg[]) zzfm.zzb(zzbgVarArr[i22], i23));
            iArr3[i22] = (int[][]) zzfm.zzb(iArr3[i22], i23);
            strArr[i22] = zzneVarArr[i22].zzV();
            iArr6[i22] = zzneVarArr[i22].zza();
            i22++;
            i11 = 2;
        }
        int i24 = i11;
        zzabe zzabeVar = new zzabe(strArr, iArr6, zzzoVarArr, iArr4, iArr3, new zzzo((zzbg[]) zzfm.zzb(zzbgVarArr[i24], iArr2[i24])));
        Pair pairZzh = zzh(zzabeVar, iArr3, iArr4, zzxlVar, zzbfVar);
        zzabg[] zzabgVarArr = (zzabg[]) pairZzh.second;
        int length = zzabgVarArr.length;
        List[] listArr = new List[length];
        for (int i25 = 0; i25 < zzabgVarArr.length; i25++) {
            zzabg zzabgVar = zzabgVarArr[i25];
            listArr[i25] = zzabgVar != null ? zzgwt.zzj(zzabgVar) : zzgwt.zzi();
        }
        zzgwq zzgwqVar = new zzgwq();
        for (int i26 = 0; i26 < 2; i26++) {
            zzzo zzzoVarZzb = zzabeVar.zzb(i26);
            int i27 = 0;
            while (i27 < zzzoVarZzb.zzb) {
                zzbg zzbgVarZza2 = zzzoVarZzb.zza(i27);
                boolean z11 = zzabeVar.zzd(i26, i27, false) != 0;
                int i28 = zzbgVarZza2.zza;
                int[] iArr7 = new int[i28];
                boolean[] zArr = new boolean[i28];
                for (int i29 = 0; i29 < i28; i29++) {
                    iArr7[i29] = zzabeVar.zzc(i26, i27, i29) & 7;
                    int i30 = 0;
                    boolean z12 = false;
                    while (i30 < length) {
                        List list = listArr[i30];
                        int i31 = length;
                        List[] listArr2 = listArr;
                        int i32 = 0;
                        while (true) {
                            if (i32 < list.size()) {
                                zzabg zzabgVar2 = (zzabg) list.get(i32);
                                int i33 = i32;
                                if (zzabgVar2.zza().equals(zzbgVarZza2) && zzabgVar2.zzg(i29) != -1) {
                                    z12 = true;
                                    break;
                                }
                                i32 = i33 + 1;
                            }
                        }
                        i30++;
                        length = i31;
                        listArr = listArr2;
                    }
                    zArr[i29] = z12;
                }
                zzgwqVar.zzf(new zzbm(zzbgVarZza2, z11, iArr7, zArr));
                i27++;
                length = length;
            }
        }
        zzzo zzzoVarZze = zzabeVar.zze();
        for (int i34 = 0; i34 < zzzoVarZze.zzb; i34++) {
            zzbg zzbgVarZza3 = zzzoVarZze.zza(i34);
            int i35 = zzbgVarZza3.zza;
            int[] iArr8 = new int[i35];
            Arrays.fill(iArr8, 0);
            zzgwqVar.zzf(new zzbm(zzbgVarZza3, false, iArr8, new boolean[i35]));
        }
        return new zzabj((zznf[]) pairZzh.first, (zzabb[]) pairZzh.second, new zzbn(zzgwqVar.zzi()), zzabeVar);
    }
}
