package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzdnh implements zzimz {
    private final zzdml zza;
    private final zzini zzb;

    private zzdnh(zzdml zzdmlVar, zzini zziniVar) {
        this.zza = zzdmlVar;
        this.zzb = zziniVar;
    }

    public static zzdnh zza(zzdml zzdmlVar, zzini zziniVar) {
        return new zzdnh(zzdmlVar, zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.zza.zzg((Executor) this.zzb.zzb());
    }
}
