package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzdse implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;
    private final zzini zze;
    private final zzini zzf;
    private final zzini zzg;
    private final zzini zzh;
    private final zzini zzi;
    private final zzini zzj;
    private final zzini zzk;

    private zzdse(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7, zzini zziniVar8, zzini zziniVar9, zzini zziniVar10, zzini zziniVar11) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
        this.zzd = zziniVar4;
        this.zze = zziniVar5;
        this.zzf = zziniVar6;
        this.zzg = zziniVar7;
        this.zzh = zziniVar8;
        this.zzi = zziniVar9;
        this.zzj = zziniVar10;
        this.zzk = zziniVar11;
    }

    public static zzdse zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7, zzini zziniVar8, zzini zziniVar9, zzini zziniVar10, zzini zziniVar11) {
        return new zzdse(zziniVar, zziniVar2, zziniVar3, zziniVar4, zziniVar5, zziniVar6, zziniVar7, zziniVar8, zziniVar9, zziniVar10, zziniVar11);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdsd(((zzdsh) this.zza).zzc(), ((zzdsi) this.zzb).zzc(), ((zzdsm) this.zzc).zza(), (zzddr) this.zzd.zzb(), (zzdfs) this.zze.zzb(), (zzdcx) this.zzf.zzb(), (zzdle) this.zzg.zzb(), (Context) this.zzh.zzb(), ((zzcyr) this.zzi).zza(), ((zzcop) this.zzj).zza(), ((zzdcq) this.zzk).zza());
    }
}
