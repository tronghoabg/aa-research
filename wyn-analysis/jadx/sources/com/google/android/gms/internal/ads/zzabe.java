package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzabe {
    private final int[] zza;
    private final zzzo[] zzb;
    private final int[] zzc;
    private final int[][][] zzd;
    private final zzzo zze;

    public zzabe(String[] strArr, int[] iArr, zzzo[] zzzoVarArr, int[] iArr2, int[][][] iArr3, zzzo zzzoVar) {
        this.zza = iArr;
        this.zzb = zzzoVarArr;
        this.zzd = iArr3;
        this.zzc = iArr2;
        this.zze = zzzoVar;
    }

    public final int zza(int i5) {
        return this.zza[i5];
    }

    public final zzzo zzb(int i5) {
        return this.zzb[i5];
    }

    public final int zzc(int i5, int i10, int i11) {
        return this.zzd[i5][i10][i11];
    }

    public final int zzd(int i5, int i10, boolean z2) {
        zzzo[] zzzoVarArr = this.zzb;
        int i11 = zzzoVarArr[i5].zza(i10).zza;
        int[] iArr = new int[i11];
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            if ((this.zzd[i5][i10][i14] & 7) == 4) {
                iArr[i13] = i14;
                i13++;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
        String str = null;
        int i15 = 0;
        int iMin = 16;
        boolean z10 = false;
        while (i12 < iArrCopyOf.length) {
            String str2 = zzzoVarArr[i5].zza(i10).zza(iArrCopyOf[i12]).zzp;
            int i16 = i15 + 1;
            if (i15 == 0) {
                str = str2;
            } else {
                z10 |= !Objects.equals(str, str2);
            }
            iMin = Math.min(iMin, this.zzd[i5][i10][i12] & 24);
            i12++;
            i15 = i16;
        }
        return z10 ? Math.min(iMin, this.zzc[i5]) : iMin;
    }

    public final zzzo zze() {
        return this.zze;
    }
}
