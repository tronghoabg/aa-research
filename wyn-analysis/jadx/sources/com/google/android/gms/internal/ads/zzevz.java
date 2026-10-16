package com.google.android.gms.internal.ads;

import D6.C0395s;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzevz implements zzfcs {
    private final Executor zza;
    private final zzcfk zzb;

    public zzevz(Executor executor, zzcfk zzcfkVar) {
        this.zza = executor;
        this.zzb = zzcfkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzdV)).booleanValue()) {
            return zzhcf.zza(new zzewa(null));
        }
        zzcfk zzcfkVar = this.zzb;
        return zzhcf.zzk(zzcfkVar.zzr(), zzevy.zza, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 10;
    }
}
