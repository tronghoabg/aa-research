package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class zzgpz implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzgpz(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzgpz zza(zzini zziniVar, zzini zziniVar2) {
        return new zzgpz(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgpy((Context) this.zza.zzb(), (ExecutorService) this.zzb.zzb());
    }
}
