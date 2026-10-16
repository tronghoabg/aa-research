package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzemq implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzemq(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzemq zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzemq(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzemp((Context) this.zza.zzb(), (zzcvg) this.zzb.zzb(), zzfoi.zzc());
    }
}
