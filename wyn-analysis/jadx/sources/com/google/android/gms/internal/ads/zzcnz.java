package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzcnz implements zzimz {
    private final zzcns zza;

    private zzcnz(zzcns zzcnsVar) {
        this.zza = zzcnsVar;
    }

    public static zzcnz zzc(zzcns zzcnsVar) {
        return new zzcnz(zzcnsVar);
    }

    public static Context zzd(zzcns zzcnsVar) {
        Context contextZza = zzcnsVar.zza();
        zzinh.zzb(contextZza);
        return contextZza;
    }

    public final Context zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
