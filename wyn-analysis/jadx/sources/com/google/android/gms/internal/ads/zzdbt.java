package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzdbt implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;
    private final zzini zze;

    private zzdbt(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
        this.zzd = zziniVar5;
        this.zze = zziniVar6;
    }

    public static zzdbt zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6) {
        return new zzdbt(zziniVar, zziniVar2, zziniVar3, zziniVar4, zziniVar5, zziniVar6);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdbs((zzddr) this.zza.zzb(), ((zzcyr) this.zzb).zza(), (ScheduledExecutorService) this.zzc.zzb(), zzfoi.zzc(), ((zzcys) this.zzd).zza(), (zzdfs) this.zze.zzb());
    }
}
