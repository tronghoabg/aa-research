package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzegb implements zzimz {
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

    private zzegb(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7, zzini zziniVar8, zzini zziniVar9, zzini zziniVar10, zzini zziniVar11, zzini zziniVar12, zzini zziniVar13) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
        this.zzd = zziniVar4;
        this.zze = zziniVar6;
        this.zzf = zziniVar7;
        this.zzg = zziniVar8;
        this.zzh = zziniVar11;
        this.zzi = zziniVar12;
        this.zzj = zziniVar13;
    }

    public static zzegb zzc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7, zzini zziniVar8, zzini zziniVar9, zzini zziniVar10, zzini zziniVar11, zzini zziniVar12, zzini zziniVar13) {
        return new zzegb(zziniVar, zziniVar2, zziniVar3, zziniVar4, zziniVar5, zziniVar6, zziniVar7, zziniVar8, zziniVar9, zziniVar10, zziniVar11, zziniVar12, zziniVar13);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzega zzb() {
        return new zzega((zzcnq) this.zza.zzb(), ((zzcnz) this.zzb).zza(), ((zzcop) this.zzc).zza(), ((zzdcq) this.zzd).zza(), zzfoi.zzc(), (String) this.zze.zzb(), (zzfqq) this.zzf.zzb(), (zzdzo) this.zzg.zzb(), zzcoz.zza(), zzcow.zza(), (ScheduledExecutorService) this.zzh.zzb(), (zzfsm) this.zzi.zzb(), ((zzdge) this.zzj).zzb());
    }
}
