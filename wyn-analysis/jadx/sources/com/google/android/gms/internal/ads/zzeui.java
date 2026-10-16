package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzeui implements zzfcs {
    private final Context zza;

    public zzeui(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        return zzhcf.zza(new zzeuj(Y0.e.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 2;
    }
}
