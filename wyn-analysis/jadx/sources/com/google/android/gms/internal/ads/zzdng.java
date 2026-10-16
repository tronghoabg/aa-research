package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzdng implements zzimz {
    private final zzini zza;

    private zzdng(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzdng zza(zzini zziniVar) {
        return new zzdng(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzdky((zzdnz) this.zza.zzb(), zzcfy.zzh));
        zzinh.zzb(setSingleton);
        return setSingleton;
    }
}
