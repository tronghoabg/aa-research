package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzgfb implements zzgew {
    private final ScheduledExecutorService zza = Executors.newSingleThreadScheduledExecutor();

    @Override // com.google.android.gms.internal.ads.zzgew
    public final void zza(Runnable runnable, long j8) {
        this.zza.schedule(runnable, j8, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    public final void zzb() {
    }
}
