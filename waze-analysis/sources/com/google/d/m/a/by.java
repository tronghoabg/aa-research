package com.google.d.m.a;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class by implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    ca f8050a;

    by(ca caVar) {
        this.f8050a = caVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bm bmVar;
        ca caVar = this.f8050a;
        if (caVar == null || (bmVar = caVar.f8055a) == null) {
            return;
        }
        this.f8050a = null;
        if (bmVar.isDone()) {
            caVar.e(bmVar);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = caVar.f8056b;
            caVar.f8056b = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    caVar.d(new bz(str));
                    throw th;
                }
            }
            caVar.d(new bz(str + ": " + bmVar.toString()));
        } finally {
            bmVar.cancel(true);
        }
    }
}
