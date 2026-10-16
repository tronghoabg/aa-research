package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes3.dex */
public final class zzear implements zzimz {
    private final zzini zza;

    private zzear(zzeai zzeaiVar, zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
    }

    public static zzear zza(zzeai zzeaiVar, zzini zziniVar, zzini zziniVar2) {
        return new zzear(zzeaiVar, zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setZzi = zzeai.zzi((zzeas) this.zza.zzb(), zzfoi.zzc());
        zzinh.zzb(setZzi);
        return setZzi;
    }
}
