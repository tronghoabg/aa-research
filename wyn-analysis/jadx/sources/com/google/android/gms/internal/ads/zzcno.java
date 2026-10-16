package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzcno implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzcno(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzcno zza(zzini zziniVar, zzini zziniVar2) {
        return new zzcno(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcnn((zzcna) this.zza.zzb(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
