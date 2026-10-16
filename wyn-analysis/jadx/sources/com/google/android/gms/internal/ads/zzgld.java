package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class zzgld implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzgld(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzgld zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzgld(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgla((Context) this.zza.zzb(), (ExecutorService) this.zzb.zzb(), (zzgfs) this.zzc.zzb());
    }
}
