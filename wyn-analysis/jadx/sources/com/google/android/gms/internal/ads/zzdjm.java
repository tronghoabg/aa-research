package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes3.dex */
public final class zzdjm implements zzimz {
    private final zzdiz zza;

    private zzdjm(zzdiz zzdizVar) {
        this.zza = zzdizVar;
    }

    public static zzdjm zza(zzdiz zzdizVar) {
        return new zzdjm(zzdizVar);
    }

    public static Set zzc(zzdiz zzdizVar) {
        return zzdizVar.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        return this.zza.zzm();
    }
}
