package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzcwm implements zzimz {
    private final zzini zza;

    private zzcwm(zzcvz zzcvzVar, zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzcwm zza(zzcvz zzcvzVar, zzini zziniVar) {
        return new zzcwm(zzcvzVar, zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzdky((zzcxp) this.zza.zzb(), zzcfy.zzh));
        zzinh.zzb(setSingleton);
        return setSingleton;
    }
}
