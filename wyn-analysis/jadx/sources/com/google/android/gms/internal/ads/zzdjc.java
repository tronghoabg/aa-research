package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzdjc implements zzimz {
    private final zzdiz zza;

    private zzdjc(zzdiz zzdizVar) {
        this.zza = zzdizVar;
    }

    public static zzdjc zza(zzdiz zzdizVar) {
        return new zzdjc(zzdizVar);
    }

    public static Set zzc(zzdiz zzdizVar) {
        Set set = Collections.EMPTY_SET;
        zzinh.zzb(set);
        return set;
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        return zzc(this.zza);
    }
}
