package defpackage;

import android.os.SystemClock;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class ruk implements ruh {
    private final ypf a;
    private final Queue b = new ConcurrentLinkedQueue();
    private final Semaphore c;
    private final rul d;
    private final int e;
    private final boolean f;
    private final int g;
    private final acjs h;

    public ruk(rul rulVar, acjs acjsVar, int i, int i2) {
        this.d = rulVar;
        this.h = acjsVar;
        this.e = i;
        Semaphore semaphore = new Semaphore(i);
        this.c = semaphore;
        yph yphVarR = ols.R("CAR.GAL.AUDIO");
        this.a = yphVarR;
        this.g = i2;
        rhx rhxVar = rhx.c;
        this.f = acmx.h();
        rulVar.g(i);
        rulVar.c(semaphore.availablePermits());
        yphVarR.f().ai(8331).N("Creating MediaSourceFlowController for %s stream type with throttling disabled: %s", wub.r(i2), acmx.h());
    }

    @Override // defpackage.ruh
    public final int a() {
        return Math.max(this.e - this.c.availablePermits(), 0);
    }

    @Override // defpackage.ruh
    public final void b(PrintWriter printWriter) {
        printWriter.print("max unacked=");
        printWriter.print(this.e);
        printWriter.print(" unacked frames=");
        printWriter.println(a());
    }

    @Override // defpackage.ruh
    public final void c() {
        Semaphore semaphore = this.c;
        semaphore.drainPermits();
        semaphore.release(100000);
        this.d.c(semaphore.availablePermits());
    }

    @Override // defpackage.ruh
    public final void d(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("receiveTimeNs must not be empty.");
        }
        Semaphore semaphore = this.c;
        semaphore.release(list.size());
        rul rulVar = this.d;
        rulVar.c(semaphore.availablePermits());
        rulVar.b(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            Long l2 = (Long) this.b.poll();
            if (l2 == null) {
                return;
            }
            rulVar.e((SystemClock.elapsedRealtimeNanos() - l2.longValue()) / 1000, l == null ? 0L : l.longValue());
        }
    }

    @Override // defpackage.ruh
    public final void e() {
        Semaphore semaphore = this.c;
        semaphore.drainPermits();
        semaphore.release(this.e);
        this.d.c(semaphore.availablePermits());
        this.b.clear();
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, rwz] */
    @Override // defpackage.ruh
    public final boolean f() throws InterruptedException {
        int i = true != this.f ? 300 : 0;
        Semaphore semaphore = this.c;
        boolean zTryAcquire = semaphore.tryAcquire(i, TimeUnit.MILLISECONDS);
        if (!zTryAcquire) {
            yop yopVarAi = this.a.h().ai(8332);
            int i2 = this.g;
            int i3 = this.e;
            yopVarAi.K("MediaSourceFlowController out of permits. Stream: %s. Max unacked frames: %d", wub.r(i2), i3);
            acjs acjsVar = this.h;
            yzz yzzVarAR = roc.aR(acjsVar.a);
            if (yzzVarAR != null) {
                rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzzVarAR, yzy.Cv);
                rrbVarH.m(acai.F);
                acjsVar.b.b(rrbVarH.l());
            }
            semaphore.drainPermits();
            semaphore.release(i3 - 1);
            this.b.clear();
            for (int i4 = 0; i4 < i3; i4++) {
                this.d.d();
            }
        }
        this.d.c(semaphore.availablePermits());
        this.b.add(Long.valueOf(SystemClock.elapsedRealtimeNanos()));
        return zTryAcquire;
    }
}
