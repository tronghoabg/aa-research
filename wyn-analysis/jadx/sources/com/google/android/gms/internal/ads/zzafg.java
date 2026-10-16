package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzafg implements zzahd {
    private final zzafj zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;

    public zzafg(zzafj zzafjVar, long j8, long j10, long j11, long j12, long j13, long j14) {
        this.zza = zzafjVar;
        this.zzb = j8;
        this.zzc = j11;
        this.zzd = j12;
        this.zze = j13;
        this.zzf = j14;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final zzahb zzc(long j8) {
        zzahe zzaheVar = new zzahe(j8, zzafi.zza(this.zza.zza(j8), 0L, this.zzc, this.zzd, this.zze, this.zzf));
        return new zzahb(zzaheVar, zzaheVar);
    }

    public final long zzd(long j8) {
        return this.zza.zza(j8);
    }

    public final /* synthetic */ long zze() {
        return this.zzc;
    }

    public final /* synthetic */ long zzf() {
        return this.zzd;
    }

    public final /* synthetic */ long zzg() {
        return this.zze;
    }

    public final /* synthetic */ long zzh() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final /* synthetic */ boolean zzj() {
        return AbstractC1744h.a(this);
    }
}
