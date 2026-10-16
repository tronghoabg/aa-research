package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzeon implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;
    private final zzini zze;
    private final zzini zzf;
    private final zzini zzg;

    private zzeon(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7, zzini zziniVar8, zzini zziniVar9) {
        this.zza = zziniVar;
        this.zzb = zziniVar3;
        this.zzc = zziniVar4;
        this.zzd = zziniVar5;
        this.zze = zziniVar6;
        this.zzf = zziniVar7;
        this.zzg = zziniVar8;
    }

    public static zzeon zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7, zzini zziniVar8, zzini zziniVar9) {
        return new zzeon(zziniVar, zziniVar2, zziniVar3, zziniVar4, zziniVar5, zziniVar6, zziniVar7, zziniVar8, zziniVar9);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeom((zzdok) this.zza.zzb(), zzfoi.zzc(), ((zzdsw) this.zzb).zzb(), (zzfmf) this.zzc.zzb(), (zzdvl) this.zzd.zzb(), (zzdzo) this.zze.zzb(), ((zzcop) this.zzf).zza(), (Context) this.zzg.zzb(), zzcqq.zzc());
    }
}
