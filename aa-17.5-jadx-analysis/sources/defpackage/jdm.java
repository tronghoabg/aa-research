package defpackage;

import android.os.SystemClock;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class jdm implements jdq {
    private static final ypf a = ols.R("CAR.GAL.VIDEO");
    private final jdr d;
    private final Semaphore b = new Semaphore(0);
    private final Queue c = new ConcurrentLinkedQueue();
    private volatile int e = 1;

    public jdm(jdr jdrVar) {
        this.d = jdrVar;
    }

    @Override // defpackage.jdl
    public final int a() {
        return Math.max(this.e - this.b.availablePermits(), 0);
    }

    @Override // defpackage.jdl
    public final void b(PrintWriter printWriter) {
        printWriter.print("max unacked=");
        printWriter.print(this.e);
        printWriter.print(" unacked frames=");
        printWriter.println(a());
    }

    @Override // defpackage.jdl
    public final void c() {
        Semaphore semaphore = this.b;
        semaphore.drainPermits();
        semaphore.release(100000);
        semaphore.availablePermits();
    }

    @Override // defpackage.jdl
    public final void d(List list) {
        Semaphore semaphore = this.b;
        semaphore.release(list.size());
        semaphore.availablePermits();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            Long l2 = (Long) this.c.poll();
            if (l2 == null) {
                return;
            } else {
                this.d.f((SystemClock.elapsedRealtimeNanos() - l2.longValue()) / 1000, dlz.J(l));
            }
        }
    }

    @Override // defpackage.jdl
    public final void e(int i) {
        this.b.release(i);
    }

    @Override // defpackage.jdl
    public final void f() {
        Semaphore semaphore = this.b;
        semaphore.drainPermits();
        semaphore.release(this.e);
        semaphore.availablePermits();
        this.c.clear();
    }

    @Override // defpackage.jdl
    public final boolean g() throws InterruptedException {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Semaphore semaphore = this.b;
        boolean zTryAcquire = semaphore.tryAcquire(300L, timeUnit);
        if (!zTryAcquire) {
            a.h().ai(1922).u("Waiting for ack timeout, video frame dropped");
            this.d.e();
            Queue queue = this.c;
            if (!queue.isEmpty()) {
                queue.poll();
            }
        }
        semaphore.availablePermits();
        this.c.add(Long.valueOf(SystemClock.elapsedRealtimeNanos()));
        return zTryAcquire;
    }

    @Override // defpackage.jdq
    public final void h(int i) {
        a.f().ai(1923).w("Initialize video source flow controller with max unacked allowed: %d", i);
        this.e = i;
        this.d.m(i);
        f();
    }
}
