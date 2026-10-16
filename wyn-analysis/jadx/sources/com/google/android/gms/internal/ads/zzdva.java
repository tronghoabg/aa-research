package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
public final class zzdva {
    private final zzdcx zza;
    private final zzdeg zzb;
    private final zzdet zzc;
    private final zzdfk zzd;
    private final zzdid zze;
    private final zzfkn zzf;
    private final zzfkq zzg;
    private final zzctq zzh;

    public zzdva(zzdcx zzdcxVar, zzdeg zzdegVar, zzdet zzdetVar, zzdfk zzdfkVar, zzdid zzdidVar, zzfkn zzfknVar, zzfkq zzfkqVar, zzctq zzctqVar) {
        this.zza = zzdcxVar;
        this.zzb = zzdegVar;
        this.zzc = zzdetVar;
        this.zzd = zzdfkVar;
        this.zze = zzdidVar;
        this.zzf = zzfknVar;
        this.zzg = zzfkqVar;
        this.zzh = zzctqVar;
    }

    public final void zza(zzdvf zzdvfVar) {
        final zzdeg zzdegVar = this.zzb;
        zzdut zzdutVarZzk = zzdvfVar.zzk();
        Objects.requireNonNull(zzdegVar);
        zzdutVarZzk.zzm(this.zza, this.zzc, this.zzd, this.zze, new F6.c() { // from class: com.google.android.gms.internal.ads.zzduz
            @Override // F6.c
            public final /* synthetic */ void zzl() {
                zzdegVar.zzb();
            }
        });
        zzdvfVar.zzg(this.zzf, this.zzg, this.zzh);
    }
}
