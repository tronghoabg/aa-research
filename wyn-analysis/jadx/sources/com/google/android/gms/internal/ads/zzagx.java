package com.google.android.gms.internal.ads;

import Va.M6;

/* loaded from: classes3.dex */
public final class zzagx {
    public int zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public zzagx() {
    }

    public final boolean zza(int i5) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (!zzagy.zzl(i5) || (i10 = (i5 >>> 19) & 3) == 1 || (i11 = (i5 >>> 17) & 3) == 0 || (i12 = (i5 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i5 >>> 10) & 3) == 3) {
            return false;
        }
        int i14 = i12 - 1;
        this.zza = i10;
        this.zzb = zzagy.zza[3 - i11];
        int i15 = zzagy.zzb[i13];
        this.zzd = i15;
        if (i10 == 2) {
            i15 /= 2;
            this.zzd = i15;
        } else if (i10 == 0) {
            i15 /= 4;
            this.zzd = i15;
        }
        int i16 = (i5 >>> 9) & 1;
        this.zzg = zzagy.zzm(i10, i11);
        if (i11 == 3) {
            int i17 = i10 == 3 ? zzagy.zzc[i14] : zzagy.zzd[i14];
            this.zzf = i17;
            this.zzc = (((i17 * 12) / i15) + i16) * 4;
        } else {
            if (i10 == 3) {
                int i18 = i11 == 2 ? zzagy.zze[i14] : zzagy.zzf[i14];
                this.zzf = i18;
                this.zzc = M6.C(i18, 144, i15, i16);
            } else {
                int i19 = zzagy.zzg[i14];
                this.zzf = i19;
                this.zzc = M6.C(i11 == 1 ? 72 : 144, i19, i15, i16);
            }
        }
        this.zze = ((i5 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }

    public zzagx(zzagx zzagxVar) {
        this.zza = zzagxVar.zza;
        this.zzb = zzagxVar.zzb;
        this.zzc = zzagxVar.zzc;
        this.zzd = zzagxVar.zzd;
        this.zze = zzagxVar.zze;
        this.zzf = zzagxVar.zzf;
        this.zzg = zzagxVar.zzg;
    }
}
