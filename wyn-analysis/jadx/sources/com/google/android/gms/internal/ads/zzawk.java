package com.google.android.gms.internal.ads;

import cb.AbstractC1593a;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zzawk {
    public final ArrayList zza = new ArrayList();
    public int zzb = 0;

    public zzawk(int i5) {
    }

    public final int zza(long j8) throws zzawi {
        long j10;
        int[] iArr = {2001100545, 2130723407, 140753313, -149863858, -2003236720, 202391198, 23353437, 1141616124, 84353895};
        int i5 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int iB = AbstractC1593a.b(((~i5) & i10) | i11, (i5 & i12) | i13, i14, i15);
        int i17 = i16 % 84353895;
        long[] jArr = {269441500, 1994078854, 158128940, -158130045, -1992289935, 556430036, 8936987, 2147469841, 438792350};
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        long j17 = jArr[6];
        long j18 = jArr[7];
        long j19 = (((((~j11) & j12) | j13) + ((j11 & j14) | j15)) - j16) + j17;
        long j20 = j18 % 438792350;
        if (j8 >= 0) {
            j10 = (this.zzb + (iB ^ i17)) - j8;
        } else {
            j10 = (j19 ^ j20) + (-j8);
        }
        if (j10 < 0 || j10 >= this.zzb) {
            throw new zzawi();
        }
        return (int) j10;
    }

    public final void zzb(zzawt zzawtVar) throws zzawj {
        int[] iArr = {524133589, 740889625, 408955079, 621796408, 24562149, 1207357565, 297783268, 1066077375, 937558955};
        int i5 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int iB = AbstractC1593a.b((i10 & (~i5)) | i11, (i5 & i12) | i13, i14, i15);
        int i17 = this.zzb;
        if (i17 >= ((i16 % 937558955) ^ iB)) {
            throw new zzawj();
        }
        ArrayList arrayList = this.zza;
        if (i17 == arrayList.size()) {
            arrayList.add(zzawtVar);
        } else {
            arrayList.set(this.zzb, zzawtVar);
        }
        this.zzb++;
    }

    public final zzawt zzc() throws zzawi {
        int[] iArr = {91119157, 1459677288, 586253619, -183145911, -1567288443, 919325394, 146725508, 787086305, 459541652};
        int i5 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int iB = AbstractC1593a.b((i10 & (~i5)) | i11, (i5 & i12) | i13, i14, i15);
        int i17 = i16 % 459541652;
        int i18 = this.zzb;
        if (i18 <= 0) {
            throw new zzawi();
        }
        int i19 = i17 ^ iB;
        ArrayList arrayList = this.zza;
        zzawt zzawtVar = (zzawt) arrayList.get(i18 + i19);
        arrayList.set(this.zzb + i19, null);
        this.zzb += i19;
        return zzawtVar;
    }

    public final zzawt zzd(long j8) throws zzawi {
        return (zzawt) this.zza.get(zza(j8));
    }

    public final void zze(long j8, zzawt zzawtVar) throws zzawi {
        this.zza.set(zza(j8), zzawtVar);
    }
}
