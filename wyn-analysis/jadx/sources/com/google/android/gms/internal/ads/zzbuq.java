package com.google.android.gms.internal.ads;

import j$.util.Objects;
import org.json.JSONException;

/* loaded from: classes3.dex */
final class zzbuq implements zzcgh {
    final /* synthetic */ zzbtv zza;
    final /* synthetic */ Object zzb;
    final /* synthetic */ zzcgd zzc;
    final /* synthetic */ zzbut zzd;

    public zzbuq(zzbut zzbutVar, zzbtv zzbtvVar, Object obj, zzcgd zzcgdVar) {
        this.zza = zzbtvVar;
        this.zzb = obj;
        this.zzc = zzcgdVar;
        Objects.requireNonNull(zzbutVar);
        this.zzd = zzbutVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final /* bridge */ /* synthetic */ void zza(Object obj) throws JSONException {
        G6.L.k("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.zzb;
        zzcgd zzcgdVar = this.zzc;
        this.zzd.zzc(this.zza, (zzbuc) obj, obj2, zzcgdVar);
    }
}
