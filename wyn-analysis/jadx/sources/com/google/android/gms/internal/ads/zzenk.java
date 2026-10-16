package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzenk implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzenk(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzenk zzc(zzini zziniVar, zzini zziniVar2) {
        return new zzenk(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzenj zzb() {
        return new zzenj((Context) this.zza.zzb(), (zzcwx) this.zzb.zzb());
    }
}
