package com.google.android.gms.internal.ads;

import android.app.Activity;

/* loaded from: classes3.dex */
final class zzeke extends zzela {
    private Activity zza;
    private F6.l zzb;
    private String zzc;
    private String zzd;

    @Override // com.google.android.gms.internal.ads.zzela
    public final zzela zza(Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Null activity");
        }
        this.zza = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzela
    public final zzela zzb(F6.l lVar) {
        this.zzb = lVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzela
    public final zzela zzc(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzela
    public final zzela zzd(String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzela
    public final zzelb zze() {
        Activity activity = this.zza;
        if (activity != null) {
            return new zzekf(activity, this.zzb, this.zzc, this.zzd, null);
        }
        throw new IllegalStateException("Missing required properties: activity");
    }
}
