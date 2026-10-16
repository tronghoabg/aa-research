package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzfpu implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzfpu(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar2;
        this.zzb = zziniVar3;
    }

    public static zzfpu zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzfpu(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfps(zzfoi.zzc(), (ScheduledExecutorService) this.zza.zzb(), ((zzfpv) this.zzb).zzb());
    }
}
