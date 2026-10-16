package com.google.android.gms.internal.ads;

import n7.InterfaceC3596a;

/* loaded from: classes3.dex */
public final class zzeyc implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzeyc(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzeyc zza(zzini zziniVar, zzini zziniVar2) {
        return new zzeyc(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfkm((InterfaceC3596a) this.zza.zzb(), (zzdzt) this.zzb.zzb());
    }
}
