package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzept implements zzimz {
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
    private final zzini zzl;

    private zzept(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7, zzini zziniVar8, zzini zziniVar9, zzini zziniVar10, zzini zziniVar11, zzini zziniVar12, zzini zziniVar13) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
        this.zzd = zziniVar4;
        this.zze = zziniVar5;
        this.zzf = zziniVar6;
        this.zzg = zziniVar7;
        this.zzh = zziniVar9;
        this.zzi = zziniVar10;
        this.zzj = zziniVar11;
        this.zzk = zziniVar12;
        this.zzl = zziniVar13;
    }

    public static zzept zzc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7, zzini zziniVar8, zzini zziniVar9, zzini zziniVar10, zzini zziniVar11, zzini zziniVar12, zzini zziniVar13) {
        return new zzept(zziniVar, zziniVar2, zziniVar3, zziniVar4, zziniVar5, zziniVar6, zziniVar7, zziniVar8, zziniVar9, zziniVar10, zziniVar11, zziniVar12, zziniVar13);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeps zzb() {
        return new zzeps(((zzcnz) this.zza).zza(), (zzfps) this.zzb.zzb(), (zzepl) this.zzc.zzb(), (zzddb) this.zzd.zzb(), (zzfsi) this.zze.zzb(), (zzfsm) this.zzf.zzb(), (zzcyd) this.zzg.zzb(), zzfoi.zzc(), (ScheduledExecutorService) this.zzh.zzb(), (zzemf) this.zzi.zzb(), (zzfqq) this.zzj.zzb(), ((zzeox) this.zzk).zzb(), (zzdzo) this.zzl.zzb());
    }
}
