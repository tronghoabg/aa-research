package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzeho {
    private final zzcnq zza;
    private final Context zzb;
    private final Executor zzc;

    public zzeho(zzcnq zzcnqVar, Context context, Executor executor) {
        this.zza = zzcnqVar;
        this.zzb = context;
        this.zzc = executor;
    }

    public final void zza() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzb();
            }
        });
    }

    public final /* synthetic */ void zzb() {
        zzehq zzehqVarZzh = this.zza.zzh();
        zzehqVarZzh.zzb(this.zzb);
        zzehqVarZzh.zza().zza().zza();
    }
}
