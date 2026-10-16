package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzeqc implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzeqc(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzeqc zzc(zzini zziniVar, zzini zziniVar2) {
        return new zzeqc(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeqb zzb() {
        return new zzeqb((Context) this.zza.zzb(), (zzdvz) this.zzb.zzb());
    }
}
