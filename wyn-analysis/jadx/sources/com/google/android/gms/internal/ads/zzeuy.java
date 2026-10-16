package com.google.android.gms.internal.ads;

import D6.C0395s;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzeuy implements zzfcs {
    private final p8.p zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    public zzeuy(p8.p pVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = pVar;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        p8.p pVar = this.zza;
        zzeux zzeuxVar = zzeux.zza;
        Executor executor = this.zzb;
        p8.p pVarZzj = zzhcf.zzj(pVar, zzeuxVar, executor);
        if (((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzoh)).intValue() > 0) {
            pVarZzj = zzhcf.zzi(pVarZzj, ((Integer) r3.f2492c.zzd(r1)).intValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzhcf.zzh(pVarZzj, Throwable.class, zzeuw.zza, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 6;
    }
}
