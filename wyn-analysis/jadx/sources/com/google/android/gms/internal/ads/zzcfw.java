package com.google.android.gms.internal.ads;

import G6.U;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import n7.AbstractC3598c;

/* loaded from: classes3.dex */
final class zzcfw implements Executor {
    private final Handler zza = new G6.M(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            this.zza.post(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            U u10 = C6.n.f1857D.f1863c;
            Context contextZzq = C6.n.f1857D.f1868h.zzq();
            if (contextZzq != null) {
                try {
                    if (((Boolean) zzblg.zzb.zze()).booleanValue()) {
                        AbstractC3598c.a(contextZzq, th);
                    }
                } catch (IllegalStateException unused) {
                }
            }
            throw th;
        }
    }
}
