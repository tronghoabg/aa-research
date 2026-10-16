package com.google.android.gms.internal.ads;

import D6.C0395s;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzeyq implements zzimz {
    private final zzini zza;

    private zzeyq(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar2;
    }

    public static zzeyq zza(zzini zziniVar, zzini zziniVar2) {
        return new zzeyq(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final Object zzb() {
        zzgxd zzgxdVarZzh;
        zzexi zzexiVarZzc = zzexk.zzc();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zza.zzb();
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzfg)).booleanValue()) {
            zzgxdVarZzh = zzgxd.zzi(new zzfbe(zzexiVarZzc, ((Integer) r3.f2492c.zzd(zzbix.zzfh)).intValue(), scheduledExecutorService));
        } else {
            zzgxdVarZzh = zzgxd.zzh();
        }
        zzinh.zzb(zzgxdVarZzh);
        return zzgxdVarZzh;
    }
}
