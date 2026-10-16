package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzcqh implements zzdvy {
    private final zzcpe zza;
    private zzfii zzb;
    private zzfhm zzc;
    private zzdiz zzd;
    private zzdcj zze;

    public /* synthetic */ zzcqh(zzcpe zzcpeVar, byte[] bArr) {
        this.zza = zzcpeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvy, com.google.android.gms.internal.ads.zzdcg
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdvz zzh() {
        zzinh.zzc(this.zzd, zzdiz.class);
        zzinh.zzc(this.zze, zzdcj.class);
        return new zzcqi(this.zza, new zzczg(), new zzfmm(), new zzdbi(), new zzeai(), this.zzd, this.zze, zzepw.zza(), null, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzdvy
    public final /* synthetic */ zzdvy zzb(zzfhm zzfhmVar) {
        this.zzc = zzfhmVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdvy
    public final /* synthetic */ zzdvy zzc(zzfii zzfiiVar) {
        this.zzb = zzfiiVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdvy
    public final /* bridge */ /* synthetic */ zzdvy zzd(zzdcj zzdcjVar) {
        this.zze = zzdcjVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdvy
    public final /* bridge */ /* synthetic */ zzdvy zze(zzdiz zzdizVar) {
        this.zzd = zzdizVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdvy, com.google.android.gms.internal.ads.zzdcg
    public final /* synthetic */ zzdcg zzi(zzfhm zzfhmVar) {
        this.zzc = zzfhmVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdvy, com.google.android.gms.internal.ads.zzdcg
    public final /* synthetic */ zzdcg zzj(zzfii zzfiiVar) {
        this.zzb = zzfiiVar;
        return this;
    }
}
