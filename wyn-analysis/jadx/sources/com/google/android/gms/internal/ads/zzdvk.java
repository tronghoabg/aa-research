package com.google.android.gms.internal.ads;

import D6.C0395s;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class zzdvk {
    private final zzdcx zza;
    private final zzdeg zzb;
    private final zzdet zzc;
    private final zzdfk zzd;
    private final zzdid zze;
    private final zzdle zzf;
    private final zzdzt zzg;
    private final zzfsm zzh;
    private final zzeko zzi;
    private final zzctq zzj;

    public zzdvk(zzdcx zzdcxVar, zzdeg zzdegVar, zzdet zzdetVar, zzdfk zzdfkVar, zzdid zzdidVar, zzdle zzdleVar, zzdzt zzdztVar, zzfsm zzfsmVar, zzeko zzekoVar, zzctq zzctqVar) {
        this.zza = zzdcxVar;
        this.zzb = zzdegVar;
        this.zzc = zzdetVar;
        this.zzd = zzdfkVar;
        this.zze = zzdidVar;
        this.zzf = zzdleVar;
        this.zzg = zzdztVar;
        this.zzh = zzfsmVar;
        this.zzi = zzekoVar;
        this.zzj = zzctqVar;
    }

    public final void zza(zzdvl zzdvlVar, zzclb zzclbVar) throws Throwable {
        zzdvi zzdviVarZzb = zzdvlVar.zzb();
        final zzdeg zzdegVar = this.zzb;
        Objects.requireNonNull(zzdegVar);
        zzdviVarZzb.zzn(this.zza, this.zzc, this.zzd, this.zze, new F6.c() { // from class: com.google.android.gms.internal.ads.zzdvj
            @Override // F6.c
            public final /* synthetic */ void zzl() {
                zzdegVar.zzb();
            }
        }, this.zzf);
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzlN)).booleanValue() || zzclbVar == null || zzclbVar.zzP() == null) {
            return;
        }
        zzcmz zzcmzVarZzP = zzclbVar.zzP();
        zzctq zzctqVar = this.zzj;
        zzeko zzekoVar = this.zzi;
        zzcmzVarZzP.zzd(zzctqVar, zzekoVar, this.zzh);
        zzcmzVarZzP.zze(zzctqVar, zzekoVar, this.zzg);
    }
}
