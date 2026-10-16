package com.google.android.gms.internal.ads;

import D6.C0395s;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzeym implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;

    private zzeym(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
        this.zzd = zziniVar4;
    }

    public static zzeym zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        return new zzeym(zziniVar, zziniVar2, zziniVar3, zziniVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final Object zzb() {
        zzewm zzewmVarZzb = ((zzewo) this.zza).zzb();
        zzexg zzexgVar = (zzexg) this.zzb.zzb();
        List list = (List) this.zzc.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzd.zzb();
        if (list.contains("54")) {
            return new zzfbe(zzexgVar, ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zznZ)).intValue(), scheduledExecutorService);
        }
        return new zzfbe(zzewmVarZzb, ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zznZ)).intValue(), scheduledExecutorService);
    }
}
