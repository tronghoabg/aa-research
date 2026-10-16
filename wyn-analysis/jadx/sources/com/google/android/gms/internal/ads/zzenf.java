package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzenf implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzenf(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzenf zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzenf(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzene((Context) this.zza.zzb(), (zzcwx) this.zzb.zzb(), (Executor) this.zzc.zzb());
    }
}
