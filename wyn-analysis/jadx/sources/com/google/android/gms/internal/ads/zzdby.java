package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzdby implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzdby(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzdby zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzdby(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdbx((Context) this.zza.zzb(), ((zzcyr) this.zzb).zza(), new zzbzn());
    }
}
