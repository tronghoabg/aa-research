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
public final class jdp implements jdl {
    public static final /* synthetic */ int a = 0;
    private static final ypf b = ols.R("CAR.GAL.AUDIO");
    private final Queue c = new ConcurrentLinkedQueue();
    private final Semaphore d;
    private final jdr e;
    private final int f;
    private final boolean g;
    private final irk h;
    private final int i;

    public jdp(jdr jdrVar, irk irkVar, int i, int i2, int i3, boolean z) {
        this.e = jdrVar;
        this.h = irkVar;
        this.f = i;
        tdd tddVar = new tdd(i);
        this.d = tddVar;
        this.i = i2;
        boolean z2 = false;
        if (z && i3 <= i) {
            z2 = true;
        }
        this.g = z2;
        jdrVar.m(i);
        jdrVar.d(tddVar.availablePermits());
        b.f().ai(1924).S("Creating MediaSourceFlowController for %s stream type with throttling disabled: %s, maxHuAudioBufferFrames: %d, maxUnackedFramesAllowed: %d", wub.r(i2), Boolean.valueOf(z), Integer.valueOf(i3), Integer.valueOf(i));
    }

    @Override // defpackage.jdl
    public final int a() {
        return Math.max(this.f - this.d.availablePermits(), 0);
    }

    @Override // defpackage.jdl
    public final void b(PrintWriter printWriter) {
        printWriter.print("max unacked=");
        printWriter.print(this.f);
        printWriter.print(" unacked frames=");
        printWriter.println(a());
    }

    @Override // defpackage.jdl
    public final void c() {
        Semaphore semaphore = this.d;
        semaphore.drainPermits();
        semaphore.release(this.f);
        this.e.d(semaphore.availablePermits());
    }

    @Override // defpackage.jdl
    public final void d(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("receiveTimeNs must not be empty.");
        }
        Semaphore semaphore = this.d;
        semaphore.release(list.size());
        jdr jdrVar = this.e;
        jdrVar.d(semaphore.availablePermits());
        jdrVar.b(list.size());
        int size = list.size();
        Queue queue = this.c;
        if (size > queue.size()) {
            b.h().ai(1926).B("Received %d acks, but sent only %d frames.", list.size(), queue.size());
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            Long l2 = (Long) queue.poll();
            if (l2 == null) {
                return;
            } else {
                jdrVar.f((SystemClock.elapsedRealtimeNanos() - l2.longValue()) / 1000, dlz.J(l));
            }
        }
    }

    @Override // defpackage.jdl
    public final void e(int i) {
        this.d.release(i);
        for (int i2 = 0; i2 < i; i2++) {
            Queue queue = this.c;
            if (queue.isEmpty()) {
                return;
            }
            queue.poll();
        }
    }

    @Override // defpackage.jdl
    public final void f() {
        Semaphore semaphore = this.d;
        semaphore.drainPermits();
        semaphore.release(this.f);
        this.e.d(semaphore.availablePermits());
        Queue queue = this.c;
        if (!queue.isEmpty()) {
            b.h().ai(1927).w("Acks pending when reset: %d", queue.size());
        }
        queue.clear();
    }

    @Override // defpackage.jdl
    public final boolean g() throws InterruptedException {
        boolean z = this.g;
        int i = true != z ? 300 : 0;
        Semaphore semaphore = this.d;
        boolean zTryAcquire = semaphore.tryAcquire(i, TimeUnit.MILLISECONDS);
        if (!zTryAcquire) {
            yop yopVarAi = b.h().ai(1925);
            int i2 = this.i;
            int i3 = this.f;
            yopVarAi.K("MediaSourceFlowController out of permits. Stream: %s. Max unacked frames: %d", wub.r(i2), i3);
            irk irkVar = this.h;
            yzz yzzVarAR = roc.aR(irkVar.e);
            if (yzzVarAR != null) {
                rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzzVarAR, yzy.Cv);
                rrbVarH.m(acai.F);
                rqy rqyVarL = rrbVarH.l();
                if (!irkVar.d) {
                    irkVar.a.b(rqyVarL);
                    irkVar.d = true;
                }
            }
            if (!irkVar.c) {
                lbt.k.e(irkVar.b);
                irkVar.c = true;
            }
            semaphore.drainPermits();
            semaphore.release(i3 - 1);
            this.c.clear();
            for (int i4 = 0; i4 < i3; i4++) {
                this.e.e();
            }
        }
        this.e.d(semaphore.availablePermits());
        this.c.add(Long.valueOf(SystemClock.elapsedRealtimeNanos()));
        return zTryAcquire || z;
    }
}
