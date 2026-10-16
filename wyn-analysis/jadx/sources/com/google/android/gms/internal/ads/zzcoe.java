package com.google.android.gms.internal.ads;

import D6.C0395s;

/* loaded from: classes3.dex */
public final class zzcoe implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzcoe(zzcns zzcnsVar, zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzcoe zza(zzcns zzcnsVar, zzini zziniVar, zzini zziniVar2) {
        return new zzcoe(zzcnsVar, zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final Object zzb() {
        return ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzdN)).booleanValue() ? new zzbaw((zzbar) this.zzb.zzb()) : new zzbaw((zzbar) this.zza.zzb());
    }
}
