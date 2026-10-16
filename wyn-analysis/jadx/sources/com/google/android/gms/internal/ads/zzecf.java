package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzecf implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;
    private final zzini zze;
    private final zzini zzf;
    private final zzini zzg;
    private final zzini zzh;
    private final zzini zzi;

    private zzecf(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7, zzini zziniVar8, zzini zziniVar9, zzini zziniVar10) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
        this.zzd = zziniVar5;
        this.zze = zziniVar6;
        this.zzf = zziniVar7;
        this.zzg = zziniVar8;
        this.zzh = zziniVar9;
        this.zzi = zziniVar10;
    }

    public static zzecf zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7, zzini zziniVar8, zzini zziniVar9, zzini zziniVar10) {
        return new zzecf(zziniVar, zziniVar2, zziniVar3, zziniVar4, zziniVar5, zziniVar6, zziniVar7, zziniVar8, zziniVar9, zziniVar10);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzece((Executor) this.zza.zzb(), ((zzcnz) this.zzb).zza(), ((zzcoa) this.zzc).zza(), zzfoi.zzc(), (zzdxk) this.zzd.zzb(), (ScheduledExecutorService) this.zze.zzb(), (zzeae) this.zzf.zzb(), ((zzcop) this.zzg).zza(), ((zzdkg) this.zzh).zzb(), (zzfqt) this.zzi.zzb());
    }
}
