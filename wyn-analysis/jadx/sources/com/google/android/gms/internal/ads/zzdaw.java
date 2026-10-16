package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzdaw implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzdaw(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzdaw zza(zzini zziniVar, zzini zziniVar2) {
        return new zzdaw(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdky((zzdhq) this.zza.zzb(), (Executor) this.zzb.zzb());
    }
}
