package com.google.android.gms.internal.ads;

import n7.InterfaceC3596a;

/* loaded from: classes3.dex */
public final class zzczn implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzczn(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzczn zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzczn(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzcos) this.zzb).zzb().zzk((InterfaceC3596a) this.zza.zzb(), ((zzdcq) this.zzc).zza().zzg);
    }
}
