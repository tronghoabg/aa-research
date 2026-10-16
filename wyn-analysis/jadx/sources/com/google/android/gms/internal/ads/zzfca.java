package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzfca implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;
    private final zzini zze;
    private final zzini zzf;
    private final zzini zzg;
    private final zzini zzh;

    private zzfca(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7, zzini zziniVar8, zzini zziniVar9) {
        this.zza = zziniVar2;
        this.zzb = zziniVar3;
        this.zzc = zziniVar4;
        this.zzd = zziniVar5;
        this.zze = zziniVar6;
        this.zzf = zziniVar7;
        this.zzg = zziniVar8;
        this.zzh = zziniVar9;
    }

    public static zzfca zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7, zzini zziniVar8, zzini zziniVar9) {
        return new zzfca(zziniVar, zziniVar2, zziniVar3, zziniVar4, zziniVar5, zziniVar6, zziniVar7, zziniVar8, zziniVar9);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfby(zzfoi.zzc(), (ScheduledExecutorService) this.zza.zzb(), (String) this.zzb.zzb(), (zzese) this.zzc.zzb(), (Context) this.zzd.zzb(), ((zzdcq) this.zze).zza(), (zzerz) this.zzf.zzb(), (zzdxk) this.zzg.zzb(), (zzecg) this.zzh.zzb());
    }
}
