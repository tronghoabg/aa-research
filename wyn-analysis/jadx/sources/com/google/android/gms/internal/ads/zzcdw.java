package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzcdw implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzcdw(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzcdw zza(zzini zziniVar, zzini zziniVar2) {
        return new zzcdw(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcdv((Context) this.zza.zzb(), (G6.N) this.zzb.zzb());
    }
}
