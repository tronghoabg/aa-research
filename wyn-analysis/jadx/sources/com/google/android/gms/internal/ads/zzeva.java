package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzeva implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzeva(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar3;
    }

    public static zzeva zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzeva(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeuy((p8.p) this.zza.zzb(), zzfoi.zzc(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
