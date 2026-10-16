package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzdol implements zzimz {
    private final zzini zza;

    private zzdol(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzdol zza(zzini zziniVar) {
        return new zzdol(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((zzdoi) this.zza).zza().zzd() != null ? Collections.singleton("banner") : Collections.EMPTY_SET;
        zzinh.zzb(setSingleton);
        return setSingleton;
    }
}
