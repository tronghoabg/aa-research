package com.google.android.gms.internal.ads;

import D6.C0395s;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzcoh implements zzimz {
    private final zzini zza;

    private zzcoh(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
    }

    public static zzcoh zza(zzini zziniVar, zzini zziniVar2) {
        return new zzcoh(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final Object zzb() {
        Set setSingleton = ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzct)).booleanValue() ? Collections.singleton(new zzdky((zzecg) this.zza.zzb(), zzfoi.zzc())) : Collections.EMPTY_SET;
        zzinh.zzb(setSingleton);
        return setSingleton;
    }
}
