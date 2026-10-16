package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzcqc implements zzehx {
    private final zzcpe zza;
    private final zzcqb zzb;
    private zzege zzc;

    public /* synthetic */ zzcqc(zzcpe zzcpeVar, zzcqb zzcqbVar, byte[] bArr) {
        this.zza = zzcpeVar;
        this.zzb = zzcqbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehx
    public final zzehy zza() {
        zzinh.zzc(this.zzc, zzege.class);
        return new zzcqd(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzehx
    public final /* bridge */ /* synthetic */ zzehx zzb(zzege zzegeVar) {
        this.zzc = zzegeVar;
        return this;
    }
}
