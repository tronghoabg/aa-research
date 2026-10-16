package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes3.dex */
public final class zzeak implements zzimz {
    private final zzini zza;

    private zzeak(zzeai zzeaiVar, zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
    }

    public static zzeak zza(zzeai zzeaiVar, zzini zziniVar, zzini zziniVar2) {
        return new zzeak(zzeaiVar, zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setZzb = zzeai.zzb((zzeas) this.zza.zzb(), zzfoi.zzc());
        zzinh.zzb(setZzb);
        return setZzb;
    }
}
