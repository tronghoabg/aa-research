package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzahy {
    private final zzahx zza;
    private final zzahm zzb;
    private final int zzc;
    private final int zzd;
    private final long zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private long zzl;
    private long[] zzm;
    private int[] zzn;

    public zzahy(int i5, zzahx zzahxVar, zzahm zzahmVar) {
        this.zza = zzahxVar;
        int iZzc = zzahxVar.zzc();
        boolean z2 = true;
        if (iZzc != 1) {
            if (iZzc == 2) {
                iZzc = 2;
            } else {
                z2 = false;
            }
        }
        zzgtr.zza(z2);
        this.zzc = zzj(i5, iZzc == 2 ? 1667497984 : 1651965952);
        this.zze = zzahxVar.zzd();
        this.zzb = zzahmVar;
        this.zzd = iZzc == 2 ? zzj(i5, 1650720768) : -1;
        this.zzl = -1L;
        this.zzm = new long[512];
        this.zzn = new int[512];
        this.zzf = zzahxVar.zzd;
    }

    private final long zzh(int i5) {
        return (this.zze * i5) / this.zzf;
    }

    private final zzahe zzi(int i5) {
        return new zzahe(this.zzn[i5] * zzh(1), this.zzm[i5]);
    }

    private static int zzj(int i5, int i10) {
        return (((i5 % 10) + 48) << 8) | ((i5 / 10) + 48) | i10;
    }

    public final void zza(long j8, boolean z2) {
        if (this.zzl == -1) {
            this.zzl = j8;
        }
        if (z2) {
            if (this.zzk == this.zzn.length) {
                long[] jArr = this.zzm;
                this.zzm = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.zzn;
                this.zzn = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.zzm;
            int i5 = this.zzk;
            jArr2[i5] = j8;
            this.zzn[i5] = this.zzj;
            this.zzk = i5 + 1;
        }
        this.zzj++;
    }

    public final void zzb() {
        int i5;
        this.zzm = Arrays.copyOf(this.zzm, this.zzk);
        this.zzn = Arrays.copyOf(this.zzn, this.zzk);
        if ((this.zzc & 1651965952) != 1651965952 || this.zza.zzf == 0 || (i5 = this.zzk) <= 0) {
            return;
        }
        this.zzf = i5;
    }

    public final boolean zzc(int i5) {
        return this.zzc == i5 || this.zzd == i5;
    }

    public final void zzd(int i5) {
        this.zzg = i5;
        this.zzh = i5;
    }

    public final boolean zze(zzagb zzagbVar) throws IOException {
        int i5 = this.zzh;
        zzahm zzahmVar = this.zzb;
        int iZza = i5 - zzahmVar.zza(zzagbVar, i5, false);
        this.zzh = iZza;
        boolean z2 = iZza == 0;
        if (z2) {
            if (this.zzg > 0) {
                zzahmVar.zze(zzh(this.zzi), Arrays.binarySearch(this.zzn, this.zzi) >= 0 ? 1 : 0, this.zzg, 0, null);
            }
            this.zzi++;
        }
        return z2;
    }

    public final void zzf(long j8) {
        if (this.zzk == 0) {
            this.zzi = 0;
        } else {
            this.zzi = this.zzn[zzfm.zzo(this.zzm, j8, true, true)];
        }
    }

    public final zzahb zzg(long j8) {
        if (this.zzk == 0) {
            zzahe zzaheVar = new zzahe(0L, this.zzl);
            return new zzahb(zzaheVar, zzaheVar);
        }
        int iZzh = (int) (j8 / zzh(1));
        int iZzn = zzfm.zzn(this.zzn, iZzh, true, true);
        if (this.zzn[iZzn] == iZzh) {
            zzahe zzaheVarZzi = zzi(iZzn);
            return new zzahb(zzaheVarZzi, zzaheVarZzi);
        }
        zzahe zzaheVarZzi2 = zzi(iZzn);
        int i5 = iZzn + 1;
        return i5 < this.zzm.length ? new zzahb(zzaheVarZzi2, zzi(i5)) : new zzahb(zzaheVarZzi2, zzaheVarZzi2);
    }
}
