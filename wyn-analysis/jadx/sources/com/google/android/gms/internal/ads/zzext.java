package com.google.android.gms.internal.ads;

import n7.InterfaceC3596a;

/* loaded from: classes3.dex */
public final class zzext implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzext(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar4;
    }

    public static zzext zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        return new zzext(zziniVar, zziniVar2, zziniVar3, zziniVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzexg(((zzewb) this.zza).zzb(), ((Long) zzbkm.zza.zze()).longValue(), (InterfaceC3596a) this.zzb.zzb(), zzfoi.zzc(), (zzdzt) this.zzc.zzb());
    }
}
