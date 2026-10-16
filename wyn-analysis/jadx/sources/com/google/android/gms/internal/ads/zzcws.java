package com.google.android.gms.internal.ads;

import D6.C0395s;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzcws implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzcws(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzcws zza(zzini zziniVar, zzini zziniVar2) {
        return new zzcws(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final Object zzb() {
        return new zzfbe(((zzewv) this.zza).zzb(), ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzok)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
