package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes3.dex */
final class zzfov {
    final Runnable zza;
    final long zzb;
    ScheduledFuture zzc;
    final /* synthetic */ zzfow zzd;

    public zzfov(zzfow zzfowVar, Runnable runnable, long j8) {
        Objects.requireNonNull(zzfowVar);
        this.zzd = zzfowVar;
        this.zza = runnable;
        this.zzb = j8;
    }
}
