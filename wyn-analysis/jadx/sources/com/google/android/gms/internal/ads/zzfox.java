package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzfox implements zzimz {
    private final zzini zza;

    private zzfox(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
    }

    public static zzfox zza(zzini zziniVar, zzini zziniVar2) {
        return new zzfox(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfow((ScheduledExecutorService) this.zza.zzb(), zzfoi.zzc());
    }
}
