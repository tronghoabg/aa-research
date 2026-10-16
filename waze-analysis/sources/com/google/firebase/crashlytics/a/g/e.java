package com.google.firebase.crashlytics.a.g;

import android.os.SystemClock;
import com.google.android.datatransport.g;
import com.google.android.datatransport.runtime.q;
import com.google.android.gms.o.w;
import com.google.firebase.crashlytics.a.c.ah;
import com.google.firebase.crashlytics.a.c.ay;
import com.google.firebase.crashlytics.a.i;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private final long f9727a = SystemClock.elapsedRealtime();

    /* renamed from: b, reason: collision with root package name */
    private final int f9728b;

    /* renamed from: c, reason: collision with root package name */
    private final BlockingQueue f9729c;

    /* renamed from: d, reason: collision with root package name */
    private final ThreadPoolExecutor f9730d;

    /* renamed from: e, reason: collision with root package name */
    private final g f9731e;

    e(double d2, g gVar) {
        this.f9731e = gVar;
        int i2 = (int) d2;
        this.f9728b = i2;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i2);
        this.f9729c = arrayBlockingQueue;
        this.f9730d = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
    }

    public static /* synthetic */ void a(e eVar, CountDownLatch countDownLatch) {
        try {
            q.a(eVar.f9731e, com.google.android.datatransport.c.f3907c);
        } catch (Exception unused) {
        }
        countDownLatch.countDown();
    }

    final w b(final ah ahVar) {
        final w wVar;
        synchronized (this.f9729c) {
            wVar = new w();
            i.a().b("Sending report through Google DataTransport: ".concat(ahVar.d()));
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f9727a;
            com.google.android.datatransport.b bVarC = com.google.android.datatransport.b.c(ahVar.b());
            final boolean z = jElapsedRealtime < 2000;
            this.f9731e.a(bVarC, new com.google.android.datatransport.i() { // from class: com.google.firebase.crashlytics.a.g.d
                @Override // com.google.android.datatransport.i
                public final void a(Exception exc) throws Throwable {
                    w wVar2 = wVar;
                    if (exc != null) {
                        wVar2.d(exc);
                        return;
                    }
                    if (z) {
                        final e eVar = this.f9723a;
                        boolean z2 = true;
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        new Thread(new Runnable() { // from class: com.google.firebase.crashlytics.a.g.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                e.a(eVar, countDownLatch);
                            }
                        }).start();
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        int i2 = ay.f9162a;
                        boolean z3 = false;
                        try {
                            long jNanoTime = 2000000000;
                            long jNanoTime2 = System.nanoTime() + 2000000000;
                            while (true) {
                                try {
                                    try {
                                        countDownLatch.await(jNanoTime, TimeUnit.NANOSECONDS);
                                        break;
                                    } catch (Throwable th) {
                                        th = th;
                                        if (z2) {
                                            Thread.currentThread().interrupt();
                                        }
                                        throw th;
                                    }
                                } catch (InterruptedException unused) {
                                    jNanoTime = jNanoTime2 - System.nanoTime();
                                    z3 = true;
                                }
                            }
                            if (z3) {
                                Thread.currentThread().interrupt();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            z2 = z3;
                        }
                    }
                    wVar2.e(ahVar);
                }
            });
        }
        return wVar;
    }
}
