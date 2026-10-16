package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbrr implements zzhbn {
    final /* synthetic */ zzbrj zza;

    public zzbrr(zzbrv zzbrvVar, zzbrj zzbrjVar) {
        this.zza = zzbrjVar;
        Objects.requireNonNull(zzbrvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* bridge */ /* synthetic */ p8.p zza(Object obj) throws Exception {
        zzcgd zzcgdVar = new zzcgd();
        ((zzbrp) obj).zze(this.zza, new zzbrq(this, zzcgdVar));
        return zzcgdVar;
    }
}
