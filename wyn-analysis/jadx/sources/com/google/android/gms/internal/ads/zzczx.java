package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzczx implements zzimz {
    private final zzini zza;

    private zzczx(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
    }

    public static zzczx zza(zzini zziniVar, zzini zziniVar2) {
        return new zzczx(zziniVar, zziniVar2);
    }

    public static zzdky zzc(zzcuc zzcucVar, Executor executor) {
        return new zzdky(zzcucVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc((zzcuc) this.zza.zzb(), zzfoi.zzc());
    }
}
