package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class zzhbr extends zzhbs {
    final /* synthetic */ zzhbt zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhbr(zzhbt zzhbtVar, Callable callable, Executor executor) {
        super(zzhbtVar, executor);
        Objects.requireNonNull(zzhbtVar);
        this.zza = zzhbtVar;
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    public final Object zza() throws Exception {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final void zzb(Object obj) {
        this.zza.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    public final String zzc() {
        return this.zzc.toString();
    }
}
