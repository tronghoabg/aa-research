package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbur implements zzcgf {
    final /* synthetic */ zzcgd zza;
    final /* synthetic */ zzbtv zzb;

    public zzbur(zzbut zzbutVar, zzcgd zzcgdVar, zzbtv zzbtvVar) {
        this.zza = zzcgdVar;
        this.zzb = zzbtvVar;
        Objects.requireNonNull(zzbutVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgf
    public final void zza() {
        G6.L.k("callJs > getEngine: Promise rejected");
        this.zza.zzd(new zzbue("Unable to obtain a JavascriptEngine."));
        this.zzb.zza();
    }
}
