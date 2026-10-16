package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzeam implements zzimz {
    private final zzeai zza;
    private final zzini zzb;

    private zzeam(zzeai zzeaiVar, zzini zziniVar, zzini zziniVar2) {
        this.zza = zzeaiVar;
        this.zzb = zziniVar;
    }

    public static zzeam zza(zzeai zzeaiVar, zzini zziniVar, zzini zziniVar2) {
        return new zzeam(zzeaiVar, zziniVar, zziniVar2);
    }

    public static Set zzc(zzeai zzeaiVar, zzeas zzeasVar, Executor executor) {
        Set setZzd = zzeai.zzd(zzeasVar, executor);
        zzinh.zzb(setZzd);
        return setZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (zzeas) this.zzb.zzb(), zzfoi.zzc());
    }
}
