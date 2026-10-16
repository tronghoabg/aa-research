package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
final class zzcqa implements zzehq {
    private final zzcpe zza;
    private Context zzb;

    public /* synthetic */ zzcqa(zzcpe zzcpeVar, byte[] bArr) {
        this.zza = zzcpeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehq
    public final zzehr zza() {
        zzinh.zzc(this.zzb, Context.class);
        return new zzcqb(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzehq
    public final /* bridge */ /* synthetic */ zzehq zzb(Context context) {
        this.zzb = context;
        return this;
    }
}
