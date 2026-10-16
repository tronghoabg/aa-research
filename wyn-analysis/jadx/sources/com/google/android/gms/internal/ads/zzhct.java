package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class zzhct extends zzhca implements zzhco {
    private final ScheduledFuture zza;

    public zzhct(p8.p pVar, ScheduledFuture scheduledFuture) {
        super(pVar);
        this.zza = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzhbz, java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        boolean zCancel = zza().cancel(z2);
        if (zCancel) {
            this.zza.cancel(z2);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.zza.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.zza.getDelay(timeUnit);
    }
}
