package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzcen implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzcen(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzcen zza(zzini zziniVar, zzini zziniVar2) {
        return new zzcen(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcem((Context) this.zza.zzb(), ((zzcea) this.zzb).zzb());
    }
}
