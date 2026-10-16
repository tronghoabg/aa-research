package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class zzgmm implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;
    private final zzini zze;
    private final zzini zzf;
    private final zzini zzg;
    private final zzini zzh;

    private zzgmm(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7, zzini zziniVar8) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
        this.zzd = zziniVar4;
        this.zze = zziniVar5;
        this.zzf = zziniVar6;
        this.zzg = zziniVar7;
        this.zzh = zziniVar8;
    }

    public static zzgmm zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7, zzini zziniVar8) {
        return new zzgmm(zziniVar, zziniVar2, zziniVar3, zziniVar4, zziniVar5, zziniVar6, zziniVar7, zziniVar8);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgml((zzggd) this.zza.zzb(), this.zzb, (zzgpe) this.zzc.zzb(), (zzgop) this.zzd.zzb(), (zzgpj) this.zze.zzb(), (zzgqo) this.zzf.zzb(), (zzgdq) this.zzg.zzb(), (ExecutorService) this.zzh.zzb());
    }
}
