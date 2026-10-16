package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes3.dex */
public final class zzeaj implements zzimz {
    private final zzini zza;

    private zzeaj(zzeai zzeaiVar, zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
    }

    public static zzeaj zza(zzeai zzeaiVar, zzini zziniVar, zzini zziniVar2) {
        return new zzeaj(zzeaiVar, zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setZza = zzeai.zza((zzeas) this.zza.zzb(), zzfoi.zzc());
        zzinh.zzb(setZza);
        return setZza;
    }
}
