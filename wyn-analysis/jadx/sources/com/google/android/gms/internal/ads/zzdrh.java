package com.google.android.gms.internal.ads;

import n7.InterfaceC3596a;

/* loaded from: classes3.dex */
public final class zzdrh implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzdrh(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzdrh zza(zzini zziniVar, zzini zziniVar2) {
        return new zzdrh(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdrg(((zzdpc) this.zza).zza(), (InterfaceC3596a) this.zzb.zzb());
    }
}
