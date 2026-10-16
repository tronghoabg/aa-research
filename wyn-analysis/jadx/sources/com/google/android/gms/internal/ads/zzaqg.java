package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes3.dex */
final class zzaqg {
    private final zzahm zza;
    private final SparseArray zzb = new SparseArray();
    private final SparseArray zzc = new SparseArray();
    private final byte[] zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private boolean zzl;

    public zzaqg(zzahm zzahmVar, boolean z2, boolean z10) {
        this.zza = zzahmVar;
        byte[] bArr = new byte[128];
        this.zzd = bArr;
        new zzgy(bArr, 0, 0);
        this.zzh = false;
    }

    public final void zza(zzgq zzgqVar) {
        this.zzb.append(zzgqVar.zzd, zzgqVar);
    }

    public final void zzb(zzgp zzgpVar) {
        this.zzc.append(zzgpVar.zza, zzgpVar);
    }

    public final void zzc() {
        this.zzh = false;
    }

    public final void zzd(long j8, int i5, long j10, boolean z2) {
        this.zze = i5;
        this.zzg = j10;
        this.zzf = j8;
        this.zzl = z2;
    }

    public final boolean zze(long j8, int i5, boolean z2) {
        boolean z10 = false;
        if (this.zze == 9) {
            if (z2 && this.zzh) {
                long j10 = this.zzf;
                int i10 = i5 + ((int) (j8 - j10));
                long j11 = this.zzj;
                if (j11 != -9223372036854775807L) {
                    long j12 = this.zzi;
                    if (j10 != j12) {
                        this.zza.zze(j11, this.zzk ? 1 : 0, (int) (j10 - j12), i10, null);
                    }
                }
            }
            this.zzi = this.zzf;
            this.zzj = this.zzg;
            this.zzk = false;
            this.zzh = true;
        }
        boolean z11 = this.zzl;
        boolean z12 = this.zzk;
        int i11 = this.zze;
        if (i11 == 5 || (z11 && i11 == 1)) {
            z10 = true;
        }
        boolean z13 = z12 | z10;
        this.zzk = z13;
        this.zze = 24;
        return z13;
    }
}
