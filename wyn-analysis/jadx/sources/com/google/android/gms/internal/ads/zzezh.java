package com.google.android.gms.internal.ads;

import D6.C0395s;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzezh implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzezh(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzezh zza(zzini zziniVar, zzini zziniVar2) {
        return new zzezh(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final Object zzb() {
        return new zzfbe((zzexg) this.zza.zzb(), ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zznK)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
