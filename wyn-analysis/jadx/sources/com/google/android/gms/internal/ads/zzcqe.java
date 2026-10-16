package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
final class zzcqe implements zzfkg {
    private final zzcpe zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzcqe(zzcpe zzcpeVar, byte[] bArr) {
        this.zza = zzcpeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfkg
    public final zzfkh zza() {
        zzinh.zzc(this.zzb, Context.class);
        return new zzcqf(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzfkg
    public final /* synthetic */ zzfkg zzb(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfkg
    public final /* bridge */ /* synthetic */ zzfkg zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
