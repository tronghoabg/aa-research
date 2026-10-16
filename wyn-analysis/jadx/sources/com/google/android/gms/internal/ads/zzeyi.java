package com.google.android.gms.internal.ads;

import D6.C0395s;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzeyi implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzeyi(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzeyi zza(zzini zziniVar, zzini zziniVar2) {
        return new zzeyi(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final Object zzb() {
        return new zzfbe(((zzevf) this.zza).zzb(), ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzob)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
