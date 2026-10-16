package com.google.android.gms.internal.ads;

import D6.C0395s;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzeyy implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzeyy(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        this.zza = zziniVar2;
        this.zzb = zziniVar3;
        this.zzc = zziniVar4;
    }

    public static zzeyy zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        return new zzeyy(zziniVar, zziniVar2, zziniVar3, zziniVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final Object zzb() {
        zzfal zzfalVarZzc = zzfan.zzc();
        zzexg zzexgVar = (zzexg) this.zza.zzb();
        List list = (List) this.zzb.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzc.zzb();
        if (list.contains("24")) {
            return new zzfbe(zzexgVar, ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zznR)).intValue(), scheduledExecutorService);
        }
        return new zzfbe(zzfalVarZzc, ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zznR)).intValue(), scheduledExecutorService);
    }
}
