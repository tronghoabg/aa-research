package com.google.android.gms.internal.ads;

import n7.InterfaceC3596a;

/* loaded from: classes3.dex */
public final class zzcdy implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzcdy(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzcdy zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzcdy(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcdx((InterfaceC3596a) this.zza.zzb(), (G6.N) this.zzb.zzb(), (zzceg) this.zzc.zzb());
    }
}
