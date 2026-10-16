package com.google.android.gms.internal.ads;

import D6.x1;
import android.content.Context;

/* loaded from: classes3.dex */
final class zzcpy implements zzfis {
    private final zzcpe zza;
    private Context zzb;
    private String zzc;
    private x1 zzd;

    public /* synthetic */ zzcpy(zzcpe zzcpeVar, byte[] bArr) {
        this.zza = zzcpeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfis
    public final zzfit zza() {
        zzinh.zzc(this.zzb, Context.class);
        zzinh.zzc(this.zzc, String.class);
        zzinh.zzc(this.zzd, x1.class);
        return new zzcpz(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfis
    public final /* bridge */ /* synthetic */ zzfis zzb(x1 x1Var) {
        x1Var.getClass();
        this.zzd = x1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfis
    public final /* bridge */ /* synthetic */ zzfis zzc(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfis
    public final /* bridge */ /* synthetic */ zzfis zzd(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
