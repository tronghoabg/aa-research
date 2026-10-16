package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class zzgqh implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzgqh(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzgqh zza(zzini zziniVar, zzini zziniVar2) {
        return new zzgqh(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgqg((Context) this.zza.zzb(), (ExecutorService) this.zzb.zzb());
    }
}
