package com.google.android.gms.internal.ads;

import n7.InterfaceC3596a;

/* loaded from: classes3.dex */
public final class zzeyb implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzeyb(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        this.zza = zziniVar2;
        this.zzb = zziniVar4;
    }

    public static zzeyb zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        return new zzeyb(zziniVar, zziniVar2, zziniVar3, zziniVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzexg(zzfan.zzc(), ((Long) zzbkm.zzf.zze()).longValue(), (InterfaceC3596a) this.zza.zzb(), zzfoi.zzc(), (zzdzt) this.zzb.zzb());
    }
}
