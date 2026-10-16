package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzdvh implements zzimz {
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

    private zzdvh(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7, zzini zziniVar8, zzini zziniVar9, zzini zziniVar10, zzini zziniVar11) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
        this.zzd = zziniVar4;
        this.zze = zziniVar5;
        this.zzf = zziniVar7;
        this.zzg = zziniVar8;
        this.zzh = zziniVar9;
        this.zzi = zziniVar10;
        this.zzj = zziniVar11;
    }

    public static zzdvh zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7, zzini zziniVar8, zzini zziniVar9, zzini zziniVar10, zzini zziniVar11) {
        return new zzdvh(zziniVar, zziniVar2, zziniVar3, zziniVar4, zziniVar5, zziniVar6, zziniVar7, zziniVar8, zziniVar9, zziniVar10, zziniVar11);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdvd(((zzcnz) this.zza).zza(), (Executor) this.zzb.zzb(), (zzbaw) this.zzc.zzb(), ((zzcop) this.zzd).zza(), ((zzcqn) this.zze).zza(), zzcrg.zza(), (zzeko) this.zzf.zzb(), (zzfsm) this.zzg.zzb(), (zzdzt) this.zzh.zzb(), (zzekz) this.zzi.zzb(), (zzflk) this.zzj.zzb());
    }
}
