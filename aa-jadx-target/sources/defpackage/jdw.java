package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jdw implements defpackage.jds {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqk b = defpackage.omv.n("CAR.GAL.AUDIO");
    private final java.util.Queue c = new j$.util.concurrent.ConcurrentLinkedQueue();
    private final java.util.concurrent.Semaphore d;
    private final defpackage.jdy e;
    private final int f;
    private final boolean g;
    private final defpackage.irs h;
    private final int i;

    public jdw(defpackage.jdy jdyVar, defpackage.irs irsVar, int i, int i2, int i3, boolean z) {
        this.e = jdyVar;
        this.h = irsVar;
        this.f = i;
        defpackage.tdz tdzVar = new defpackage.tdz(i);
        this.d = tdzVar;
        this.i = i2;
        boolean z2 = false;
        if (z && i3 <= i) {
            z2 = true;
        }
        this.g = z2;
        jdyVar.m(i);
        jdyVar.d(tdzVar.availablePermits());
        b.f().ai(1924).S("Creating MediaSourceFlowController for %s stream type with throttling disabled: %s, maxHuAudioBufferFrames: %d, maxUnackedFramesAllowed: %d", defpackage.sqs.be(i2), java.lang.Boolean.valueOf(z), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i));
    }

    @Override // defpackage.jds
    public final int a() {
        return java.lang.Math.max(this.f - this.d.availablePermits(), 0);
    }

    @Override // defpackage.jds
    public final void b(java.io.PrintWriter printWriter) {
        printWriter.print("max unacked=");
        printWriter.print(this.f);
        printWriter.print(" unacked frames=");
        printWriter.println(a());
    }

    @Override // defpackage.jds
    public final void c() {
        java.util.concurrent.Semaphore semaphore = this.d;
        semaphore.drainPermits();
        semaphore.release(this.f);
        this.e.d(semaphore.availablePermits());
    }

    @Override // defpackage.jds
    public final void d(java.util.List list) {
        if (list.isEmpty()) {
            throw new java.lang.IllegalArgumentException("receiveTimeNs must not be empty.");
        }
        java.util.concurrent.Semaphore semaphore = this.d;
        semaphore.release(list.size());
        defpackage.jdy jdyVar = this.e;
        jdyVar.d(semaphore.availablePermits());
        jdyVar.b(list.size());
        int size = list.size();
        java.util.Queue queue = this.c;
        if (size > queue.size()) {
            b.h().ai(1926).B("Received %d acks, but sent only %d frames.", list.size(), queue.size());
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.Long l = (java.lang.Long) it.next();
            java.lang.Long l2 = (java.lang.Long) queue.poll();
            if (l2 == null) {
                return;
            } else {
                jdyVar.f((android.os.SystemClock.elapsedRealtimeNanos() - l2.longValue()) / 1000, defpackage.ebm.r(l));
            }
        }
    }

    @Override // defpackage.jds
    public final void e(int i) {
        this.d.release(i);
        for (int i2 = 0; i2 < i; i2++) {
            java.util.Queue queue = this.c;
            if (queue.isEmpty()) {
                return;
            }
            queue.poll();
        }
    }

    @Override // defpackage.jds
    public final void f() {
        java.util.concurrent.Semaphore semaphore = this.d;
        semaphore.drainPermits();
        semaphore.release(this.f);
        this.e.d(semaphore.availablePermits());
        java.util.Queue queue = this.c;
        if (!queue.isEmpty()) {
            b.h().ai(1927).w("Acks pending when reset: %d", queue.size());
        }
        queue.clear();
    }

    @Override // defpackage.jds
    public final boolean g() throws java.lang.InterruptedException {
        boolean z = this.g;
        int i = true != z ? 300 : 0;
        java.util.concurrent.Semaphore semaphore = this.d;
        boolean zTryAcquire = semaphore.tryAcquire(i, java.util.concurrent.TimeUnit.MILLISECONDS);
        if (!zTryAcquire) {
            defpackage.ypu ypuVarAi = b.h().ai(1925);
            int i2 = this.i;
            int i3 = this.f;
            ypuVarAi.K("MediaSourceFlowController out of permits. Stream: %s. Max unacked frames: %d", defpackage.sqs.be(i2), i3);
            defpackage.irs irsVar = this.h;
            defpackage.zbe zbeVarBb = defpackage.tna.bb(irsVar.e);
            if (zbeVarBb != null) {
                defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, zbeVarBb, defpackage.zbd.Cz);
                rrvVarH.m(defpackage.acbk.F);
                defpackage.rrs rrsVarL = rrvVarH.l();
                if (!irsVar.d) {
                    irsVar.a.b(rrsVarL);
                    irsVar.d = true;
                }
            }
            if (!irsVar.c) {
                defpackage.lby.k.e(irsVar.b);
                irsVar.c = true;
            }
            semaphore.drainPermits();
            semaphore.release(i3 - 1);
            this.c.clear();
            for (int i4 = 0; i4 < i3; i4++) {
                this.e.e();
            }
        }
        this.e.d(semaphore.availablePermits());
        this.c.add(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtimeNanos()));
        return zTryAcquire || z;
    }
}
