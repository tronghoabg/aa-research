package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzcnx implements zzimz {
    private final zzcns zza;

    private zzcnx(zzcns zzcnsVar) {
        this.zza = zzcnsVar;
    }

    public static zzcnx zzc(zzcns zzcnsVar) {
        return new zzcnx(zzcnsVar);
    }

    public static Context zzd(zzcns zzcnsVar) {
        Context contextZzb = zzcnsVar.zzb();
        zzinh.zzb(contextZzb);
        return contextZzb;
    }

    public final Context zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
