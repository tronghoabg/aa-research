package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
final class zzcpi implements zzffo {
    private final zzcpe zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzcpi(zzcpe zzcpeVar, byte[] bArr) {
        this.zza = zzcpeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzffo
    public final zzffp zza() {
        zzinh.zzc(this.zzb, Context.class);
        zzinh.zzc(this.zzc, String.class);
        return new zzcpj(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzffo
    public final /* bridge */ /* synthetic */ zzffo zzb(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffo
    public final /* bridge */ /* synthetic */ zzffo zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
