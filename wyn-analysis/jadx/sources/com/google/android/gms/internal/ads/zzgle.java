package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzgle implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzgle(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzgle zza(zzini zziniVar, zzini zziniVar2) {
        return new zzgle(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbdz zzbdzVarZzb = zzfyn.zzb((Context) this.zza.zzb(), (zzfxq) this.zzb.zzb());
        zzinh.zzb(zzbdzVarZzb);
        return zzbdzVarZzb;
    }
}
