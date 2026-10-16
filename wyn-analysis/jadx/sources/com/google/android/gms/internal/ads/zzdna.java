package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzdna implements zzimz {
    private final zzini zza;

    private zzdna(zzdml zzdmlVar, zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzdna zza(zzdml zzdmlVar, zzini zziniVar) {
        return new zzdna(zzdmlVar, zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzdky((zzdbs) this.zza.zzb(), zzcfy.zzh));
        zzinh.zzb(setSingleton);
        return setSingleton;
    }
}
