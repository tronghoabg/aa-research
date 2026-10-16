package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzglc implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzglc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzglc zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzglc(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzglb((Context) this.zza.zzb(), (zzgdq) this.zzb.zzb(), (zzgpj) this.zzc.zzb());
    }
}
