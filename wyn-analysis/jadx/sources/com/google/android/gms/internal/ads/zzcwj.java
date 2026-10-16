package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzcwj implements zzimz {
    private final zzcvz zza;
    private final zzini zzb;

    private zzcwj(zzcvz zzcvzVar, zzini zziniVar) {
        this.zza = zzcvzVar;
        this.zzb = zziniVar;
    }

    public static zzcwj zza(zzcvz zzcvzVar, zzini zziniVar) {
        return new zzcwj(zzcvzVar, zziniVar);
    }

    public static Set zzc(zzcvz zzcvzVar, zzcxp zzcxpVar) {
        Set setSingleton = Collections.singleton(new zzdky(zzcxpVar, zzcfy.zzh));
        zzinh.zzb(setSingleton);
        return setSingleton;
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (zzcxp) this.zzb.zzb());
    }
}
