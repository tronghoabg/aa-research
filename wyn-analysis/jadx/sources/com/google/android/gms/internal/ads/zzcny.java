package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

/* loaded from: classes3.dex */
public final class zzcny implements zzimz {
    private final zzini zza;

    private zzcny(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzcny zza(zzini zziniVar) {
        return new zzcny(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        ApplicationInfo applicationInfo = ((zzcnz) this.zza).zza().getApplicationInfo();
        zzinh.zzb(applicationInfo);
        return applicationInfo;
    }
}
