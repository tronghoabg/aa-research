package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes3.dex */
public final class zzzg {
    private final Random zza;
    private final int[] zzb;
    private final int[] zzc;

    public zzzg(int i5) {
        this(0, new Random());
    }

    public final int zza() {
        return this.zzb.length;
    }

    public final int zzb(int i5) {
        int i10 = this.zzc[i5] + 1;
        int[] iArr = this.zzb;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    public final int zzc(int i5) {
        int i10 = this.zzc[i5] - 1;
        if (i10 >= 0) {
            return this.zzb[i10];
        }
        return -1;
    }

    public final int zzd() {
        int[] iArr = this.zzb;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    public final int zze() {
        int[] iArr = this.zzb;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    public final zzzg zzf(int i5, int i10) {
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        int i11 = 0;
        while (i11 < i10) {
            Random random = this.zza;
            iArr[i11] = random.nextInt(this.zzb.length + 1);
            int i12 = i11 + 1;
            int iNextInt = random.nextInt(i12);
            iArr2[i11] = iArr2[iNextInt];
            iArr2[iNextInt] = i11;
            i11 = i12;
        }
        Arrays.sort(iArr);
        int[] iArr3 = this.zzb;
        int[] iArr4 = new int[iArr3.length + i10];
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < iArr3.length + i10; i15++) {
            if (i13 >= i10 || i14 != iArr[i13]) {
                int i16 = i14 + 1;
                int i17 = iArr3[i14];
                iArr4[i15] = i17;
                if (i17 >= 0) {
                    iArr4[i15] = i17 + i10;
                }
                i14 = i16;
            } else {
                iArr4[i15] = iArr2[i13];
                i13++;
            }
        }
        return new zzzg(iArr4, new Random(this.zza.nextLong()));
    }

    public final zzzg zzg() {
        return new zzzg(0, new Random(this.zza.nextLong()));
    }

    private zzzg(int i5, Random random) {
        this(new int[0], random);
    }

    private zzzg(int[] iArr, Random random) {
        this.zzb = iArr;
        this.zza = random;
        this.zzc = new int[iArr.length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            this.zzc[iArr[i5]] = i5;
        }
    }
}
