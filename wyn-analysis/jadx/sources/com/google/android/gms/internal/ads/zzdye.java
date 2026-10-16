package com.google.android.gms.internal.ads;

import D6.C0395s;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzdye implements zzimz {
    private final zzini zza;

    private zzdye(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar2;
    }

    public static zzdye zza(zzini zziniVar, zzini zziniVar2) {
        return new zzdye(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final Object zzb() {
        zzhcp zzhcpVarZzc = zzfoi.zzc();
        Set setSingleton = ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgk)).booleanValue() ? Collections.singleton(new zzdky(((zzdyx) this.zza).zzb(), zzhcpVarZzc)) : Collections.EMPTY_SET;
        zzinh.zzb(setSingleton);
        return setSingleton;
    }
}
