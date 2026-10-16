package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzcjt implements zzma {
    private final zzabs zza = new zzabs(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zza(zzqh zzqhVar) {
        zzo(false);
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzb(zzlz zzlzVar, zzzo zzzoVar, zzabb[] zzabbVarArr) {
        int i5;
        this.zzf = 0;
        for (zzabb zzabbVar : zzabbVarArr) {
            if (zzabbVar != null) {
                int i10 = this.zzf;
                int i11 = zzabbVar.zza().zzc;
                if (i11 == 0) {
                    i5 = 144310272;
                } else if (i11 == 1) {
                    i5 = 13107200;
                } else if (i11 != 2) {
                    i5 = 131072;
                    if (i11 != 3 && i11 != 5 && i11 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i5 = 131072000;
                }
                this.zzf = i10 + i5;
            }
        }
        this.zza.zzf(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzc(zzqh zzqhVar) {
        zzo(true);
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzd(zzqh zzqhVar) {
        zzo(true);
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final zzabm zze(zzqh zzqhVar) {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final long zzf(zzqh zzqhVar) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final boolean zzg(zzqh zzqhVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final boolean zzh(zzlz zzlzVar) {
        long j8 = zzlzVar.zze;
        boolean z2 = true;
        char c10 = j8 > this.zzc ? (char) 0 : j8 < this.zzb ? (char) 2 : (char) 1;
        int iZzg = this.zza.zzg();
        int i5 = this.zzf;
        if (c10 != 2 && (c10 != 1 || !this.zzg || iZzg >= i5)) {
            z2 = false;
        }
        this.zzg = z2;
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final boolean zzi(zzlz zzlzVar) {
        long j8 = zzlzVar.zzg ? this.zze : this.zzd;
        return j8 <= 0 || zzlzVar.zze >= j8;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final /* synthetic */ boolean zzj(zzqh zzqhVar, zzbf zzbfVar, zzxl zzxlVar, long j8) {
        return F.i(this, zzqhVar, zzbfVar, zzxlVar, j8);
    }

    public final synchronized void zzk(int i5) {
        this.zzb = i5 * 1000;
    }

    public final synchronized void zzl(int i5) {
        this.zzc = i5 * 1000;
    }

    public final synchronized void zzm(int i5) {
        this.zzd = i5 * 1000;
    }

    public final synchronized void zzn(int i5) {
        this.zze = i5 * 1000;
    }

    public final void zzo(boolean z2) {
        this.zzf = 0;
        this.zzg = false;
        if (z2) {
            this.zza.zze();
        }
    }
}
