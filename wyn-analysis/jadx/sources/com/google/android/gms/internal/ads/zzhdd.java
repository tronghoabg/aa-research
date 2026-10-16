package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class zzhdd extends zzhcm {
    final /* synthetic */ zzhde zza;
    private final Callable zzb;

    public zzhdd(zzhde zzhdeVar, Callable callable) {
        Objects.requireNonNull(zzhdeVar);
        this.zza = zzhdeVar;
        callable.getClass();
        this.zzb = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    public final Object zza() throws Exception {
        return this.zzb.call();
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    public final String zzc() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    public final boolean zzd() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    public final void zzf(Object obj) {
        this.zza.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    public final void zzg(Throwable th) {
        this.zza.zzb(th);
    }
}
