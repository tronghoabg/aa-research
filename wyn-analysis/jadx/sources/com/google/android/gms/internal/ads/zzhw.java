package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzhw implements zzhq {
    private final Context zza;
    private final zzhq zzb;

    public zzhw(Context context) {
        zzhy zzhyVar = new zzhy();
        this.zza = context.getApplicationContext();
        this.zzb = zzhyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    public final /* bridge */ /* synthetic */ zzhr zza() {
        return new zzhx(this.zza, this.zzb.zza());
    }
}
