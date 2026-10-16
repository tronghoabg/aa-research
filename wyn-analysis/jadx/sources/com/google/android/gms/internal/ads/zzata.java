package com.google.android.gms.internal.ads;

import android.os.Handler;
import j$.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class zzata implements Executor {
    final /* synthetic */ Handler zza;

    public zzata(zzatc zzatcVar, Handler handler) {
        this.zza = handler;
        Objects.requireNonNull(zzatcVar);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.post(runnable);
    }
}
