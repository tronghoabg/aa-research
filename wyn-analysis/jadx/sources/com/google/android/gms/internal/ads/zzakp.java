package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzakp extends zzafq implements zzaky {
    private final long zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;

    public zzakp(long j8, long j10, int i5, int i10, boolean z2) {
        this(j8, j10, i5, i10, false, true);
    }

    @Override // com.google.android.gms.internal.ads.zzaky
    public final long zzf(long j8) {
        return zze(j8);
    }

    @Override // com.google.android.gms.internal.ads.zzaky
    public final long zzg() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaky
    public final int zzh() {
        return this.zzb;
    }

    public final zzakp zzi(long j8) {
        return new zzakp(j8, this.zza, this.zzb, this.zzc, false, false);
    }

    private zzakp(long j8, long j10, int i5, int i10, boolean z2, boolean z10) {
        super(j8, j10, i5, i10, false, z10);
        this.zza = j10;
        this.zzb = i5;
        this.zzc = i10;
        this.zzd = j8 == -1 ? -1L : j8;
    }

    public zzakp(long j8, long j10, zzagx zzagxVar, boolean z2) {
        this(j8, j10, zzagxVar.zzf, zzagxVar.zzc, false, true);
    }
}
