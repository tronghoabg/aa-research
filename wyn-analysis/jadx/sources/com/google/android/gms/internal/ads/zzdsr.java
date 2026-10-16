package com.google.android.gms.internal.ads;

import G6.C0560y;
import n7.InterfaceC3596a;

/* loaded from: classes3.dex */
public final class zzdsr implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzdsr(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzdsr zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzdsr(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdsq((C0560y) this.zza.zzb(), (InterfaceC3596a) this.zzb.zzb(), zzfoi.zzc());
    }
}
