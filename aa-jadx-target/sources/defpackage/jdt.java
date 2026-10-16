package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jdt implements defpackage.jdx {
    private static final defpackage.yqk a = defpackage.omv.n("CAR.GAL.VIDEO");
    private final defpackage.jdy d;
    private final java.util.concurrent.Semaphore b = new java.util.concurrent.Semaphore(0);
    private final java.util.Queue c = new j$.util.concurrent.ConcurrentLinkedQueue();
    private volatile int e = 1;

    public jdt(defpackage.jdy jdyVar) {
        this.d = jdyVar;
    }

    @Override // defpackage.jds
    public final int a() {
        return java.lang.Math.max(this.e - this.b.availablePermits(), 0);
    }

    @Override // defpackage.jds
    public final void b(java.io.PrintWriter printWriter) {
        printWriter.print("max unacked=");
        printWriter.print(this.e);
        printWriter.print(" unacked frames=");
        printWriter.println(a());
    }

    @Override // defpackage.jds
    public final void c() {
        java.util.concurrent.Semaphore semaphore = this.b;
        semaphore.drainPermits();
        semaphore.release(100000);
        semaphore.availablePermits();
    }

    @Override // defpackage.jds
    public final void d(java.util.List list) {
        java.util.concurrent.Semaphore semaphore = this.b;
        semaphore.release(list.size());
        semaphore.availablePermits();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.Long l = (java.lang.Long) it.next();
            java.lang.Long l2 = (java.lang.Long) this.c.poll();
            if (l2 == null) {
                return;
            } else {
                this.d.f((android.os.SystemClock.elapsedRealtimeNanos() - l2.longValue()) / 1000, defpackage.ebm.r(l));
            }
        }
    }

    @Override // defpackage.jds
    public final void e(int i) {
        this.b.release(i);
    }

    @Override // defpackage.jds
    public final void f() {
        java.util.concurrent.Semaphore semaphore = this.b;
        semaphore.drainPermits();
        semaphore.release(this.e);
        semaphore.availablePermits();
        this.c.clear();
    }

    @Override // defpackage.jds
    public final boolean g() throws java.lang.InterruptedException {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        java.util.concurrent.Semaphore semaphore = this.b;
        boolean zTryAcquire = semaphore.tryAcquire(300L, timeUnit);
        if (!zTryAcquire) {
            a.h().ai(1922).u("Waiting for ack timeout, video frame dropped");
            this.d.e();
            java.util.Queue queue = this.c;
            if (!queue.isEmpty()) {
                queue.poll();
            }
        }
        semaphore.availablePermits();
        this.c.add(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtimeNanos()));
        return zTryAcquire;
    }

    @Override // defpackage.jdx
    public final void h(int i) {
        a.f().ai(1923).w("Initialize video source flow controller with max unacked allowed: %d", i);
        this.e = i;
        this.d.m(i);
        f();
    }
}
