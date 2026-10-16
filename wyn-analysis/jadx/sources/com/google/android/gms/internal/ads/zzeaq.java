package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes3.dex */
public final class zzeaq implements zzimz {
    private final zzini zza;

    private zzeaq(zzeai zzeaiVar, zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
    }

    public static zzeaq zza(zzeai zzeaiVar, zzini zziniVar, zzini zziniVar2) {
        return new zzeaq(zzeaiVar, zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setZzh = zzeai.zzh((zzeas) this.zza.zzb(), zzfoi.zzc());
        zzinh.zzb(setZzh);
        return setZzh;
    }
}
