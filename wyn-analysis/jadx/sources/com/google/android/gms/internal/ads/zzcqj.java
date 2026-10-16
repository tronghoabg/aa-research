package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzcqj implements N6.F {
    private final zzcpe zza;
    private zzdcj zzb;
    private N6.l zzc;

    public /* synthetic */ zzcqj(zzcpe zzcpeVar, byte[] bArr) {
        this.zza = zzcpeVar;
    }

    @Override // N6.F
    public final N6.G zza() {
        zzinh.zzc(this.zzb, zzdcj.class);
        zzinh.zzc(this.zzc, N6.l.class);
        return new zzcqk(this.zza, this.zzc, new zzczg(), new zzdbi(), new zzeai(), this.zzb, null, null);
    }

    @Override // N6.F
    public final /* bridge */ /* synthetic */ N6.F zzb(N6.l lVar) {
        this.zzc = lVar;
        return this;
    }

    @Override // N6.F
    public final /* bridge */ /* synthetic */ N6.F zzc(zzdcj zzdcjVar) {
        this.zzb = zzdcjVar;
        return this;
    }
}
