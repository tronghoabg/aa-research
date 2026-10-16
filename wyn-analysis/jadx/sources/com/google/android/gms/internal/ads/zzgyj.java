package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
final class zzgyj extends zzgus {
    final transient zzguj zza;

    public zzgyj(Map map, zzguj zzgujVar) {
        super(map);
        this.zza = zzgujVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgus, com.google.android.gms.internal.ads.zzgvj
    public final /* bridge */ /* synthetic */ Collection zzc() {
        return (List) this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgvj, com.google.android.gms.internal.ads.zzgvm
    public final Set zzh() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgvj, com.google.android.gms.internal.ads.zzgvm
    public final Map zzl() {
        return zzm();
    }
}
