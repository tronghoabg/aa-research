package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class zzgff implements zzimz {
    private final zzini zza;

    private zzgff(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzgff zza(zzini zziniVar) {
        return new zzgff(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgfn((ExecutorService) this.zza.zzb());
    }
}
