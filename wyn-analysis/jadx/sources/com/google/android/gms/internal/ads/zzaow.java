package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzaow implements zzann {
    private final zzaop zza;
    private final long[] zzb;
    private final Map zzc;
    private final Map zzd;
    private final Map zze;

    public zzaow(zzaop zzaopVar, Map map, Map map2, Map map3) {
        this.zza = zzaopVar;
        this.zzd = map2;
        this.zze = map3;
        this.zzc = DesugarCollections.unmodifiableMap(map);
        this.zzb = zzaopVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzann
    public final int zza() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzann
    public final long zzb(int i5) {
        return this.zzb[i5];
    }

    @Override // com.google.android.gms.internal.ads.zzann
    public final List zzc(long j8) {
        return this.zza.zzh(j8, this.zzc, this.zzd, this.zze);
    }
}
