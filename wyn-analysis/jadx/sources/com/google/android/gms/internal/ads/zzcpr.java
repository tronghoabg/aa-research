package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzcpr implements zzebd {
    private final zzcpe zza;
    private final zzcpu zzb;
    private Long zzc;
    private String zzd;

    public /* synthetic */ zzcpr(zzcpe zzcpeVar, zzcpu zzcpuVar, byte[] bArr) {
        this.zza = zzcpeVar;
        this.zzb = zzcpuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebd
    public final zzebe zza() {
        zzinh.zzc(this.zzc, Long.class);
        zzinh.zzc(this.zzd, String.class);
        return new zzcps(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzebd
    public final /* bridge */ /* synthetic */ zzebd zzb(String str) {
        str.getClass();
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzebd
    public final /* bridge */ /* synthetic */ zzebd zzc(long j8) {
        this.zzc = Long.valueOf(j8);
        return this;
    }
}
