package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzeco implements zzimz {
    private final zzini zza;

    private zzeco(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
    }

    public static zzeco zza(zzini zziniVar, zzini zziniVar2) {
        return new zzeco(zziniVar, zziniVar2);
    }

    public static zzdky zzc(zzecn zzecnVar, Executor executor) {
        return new zzdky(zzecnVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc((zzecn) this.zza.zzb(), zzfoi.zzc());
    }
}
