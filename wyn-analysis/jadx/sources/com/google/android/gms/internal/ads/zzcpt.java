package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
final class zzcpt implements zzebk {
    private final zzcpe zza;
    private Context zzb;
    private zzbqx zzc;

    public /* synthetic */ zzcpt(zzcpe zzcpeVar, byte[] bArr) {
        this.zza = zzcpeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebk
    public final zzebl zza() {
        zzinh.zzc(this.zzb, Context.class);
        zzinh.zzc(this.zzc, zzbqx.class);
        return new zzcpu(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzebk
    public final /* bridge */ /* synthetic */ zzebk zzb(zzbqx zzbqxVar) {
        zzbqxVar.getClass();
        this.zzc = zzbqxVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzebk
    public final /* bridge */ /* synthetic */ zzebk zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
