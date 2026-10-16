package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes3.dex */
public final class zzeao implements zzimz {
    private final zzini zza;

    private zzeao(zzeai zzeaiVar, zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
    }

    public static zzeao zza(zzeai zzeaiVar, zzini zziniVar, zzini zziniVar2) {
        return new zzeao(zzeaiVar, zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setZzf = zzeai.zzf((zzeas) this.zza.zzb(), zzfoi.zzc());
        zzinh.zzb(setZzf);
        return setZzf;
    }
}
