package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class qpt implements rse {
    public static final ypf a = ols.R("CAR.AUDIO.STATS");
    public Future A;
    public final List B;
    public long C;
    public final int D;
    private Future E;
    private final long F;
    private final ScheduledExecutorService G;
    private final rfa H;
    public final xkj b;
    public final rwz c;
    public final AtomicInteger d = new AtomicInteger();
    public final AtomicInteger e = new AtomicInteger();
    public final AtomicInteger f = new AtomicInteger();
    public final AtomicInteger g = new AtomicInteger();
    public final AtomicLong h = new AtomicLong();
    public final AtomicLong i = new AtomicLong();
    public final AtomicLong j = new AtomicLong();
    public final AtomicLong k = new AtomicLong();
    public final AtomicInteger l = new AtomicInteger();
    public final AtomicInteger m = new AtomicInteger();
    public final AtomicInteger n = new AtomicInteger(-99999);
    public final AtomicInteger o = new AtomicInteger(-99999);
    public final AtomicInteger p = new AtomicInteger(-99999);
    public final AtomicInteger q = new AtomicInteger(-99999);
    public final AtomicInteger r = new AtomicInteger(-99999);
    public final AtomicLong s = new AtomicLong();
    public final Object t;
    public long u;
    public final ArrayList v;
    public final ArrayList w;
    public boolean x;
    public Future y;
    public final List z;

    public qpt(xkj xkjVar, int i, rwz rwzVar, ScheduledExecutorService scheduledExecutorService, long j, rfa rfaVar) {
        Object obj = new Object();
        this.t = obj;
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.w = arrayList2;
        this.z = new ArrayList(10);
        this.B = new ArrayList(10);
        this.b = xkjVar;
        this.D = i;
        this.c = rwzVar;
        this.G = scheduledExecutorService;
        this.F = j;
        this.H = rfaVar;
        synchronized (obj) {
            this.u = 0L;
        }
        synchronized (this) {
            arrayList.clear();
            arrayList2.clear();
        }
    }

    private final synchronized void m() {
        if (this.A == null) {
            ScheduledExecutorService scheduledExecutorService = this.G;
            if (!scheduledExecutorService.isShutdown()) {
                this.A = scheduledExecutorService.scheduleAtFixedRate(new qjv(this, 8), 1000L, 1000L, TimeUnit.MILLISECONDS);
            }
        }
    }

    private final synchronized void n() {
        if (this.E == null) {
            ScheduledExecutorService scheduledExecutorService = this.G;
            if (!scheduledExecutorService.isShutdown()) {
                this.E = scheduledExecutorService.scheduleAtFixedRate(new qjv(this, 9), 1000L, 1000L, TimeUnit.MILLISECONDS);
            }
        }
    }

    private final synchronized void o() {
        this.x = true;
        if (this.y == null) {
            ScheduledExecutorService scheduledExecutorService = this.G;
            if (!scheduledExecutorService.isShutdown()) {
                long j = this.F;
                this.y = scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: qpq
                    /* JADX WARN: Removed duplicated region for block: B:31:0x01bd A[Catch: all -> 0x02a0, TryCatch #0 {, blocks: (B:12:0x0133, B:14:0x0141, B:18:0x014d, B:22:0x015e, B:24:0x017f, B:26:0x0187, B:29:0x01a9, B:31:0x01bd, B:32:0x01d1, B:34:0x01d9, B:35:0x01f0), top: B:65:0x0133, outer: #1 }] */
                    /* JADX WARN: Removed duplicated region for block: B:34:0x01d9 A[Catch: all -> 0x02a0, TryCatch #0 {, blocks: (B:12:0x0133, B:14:0x0141, B:18:0x014d, B:22:0x015e, B:24:0x017f, B:26:0x0187, B:29:0x01a9, B:31:0x01bd, B:32:0x01d1, B:34:0x01d9, B:35:0x01f0), top: B:65:0x0133, outer: #1 }] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 678
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.qpq.run():void");
                    }
                }, j, j, TimeUnit.MILLISECONDS);
                this.C = SystemClock.elapsedRealtime();
            }
        }
    }

    private static void p(AtomicInteger atomicInteger, qps qpsVar) {
        int i;
        do {
            i = atomicInteger.get();
        } while (!atomicInteger.compareAndSet(i, qpsVar.a(i)));
    }

    @Override // defpackage.rse
    public final synchronized void a() {
        Future future = this.E;
        if (future != null) {
            future.cancel(false);
            this.E = null;
            List list = this.z;
            if (!list.isEmpty()) {
                l(yfq.o(list));
                list.clear();
            }
        }
        this.H.c();
    }

    @Override // defpackage.rul
    public final void b(int i) {
        p(this.r, new qpp(i, 1));
        p(this.q, new qpp(i, 0));
        o();
    }

    @Override // defpackage.rul
    public final void c(int i) {
        p(this.o, new qpp(i, 2));
        p(this.p, new qpp(i, 3));
        o();
    }

    @Override // defpackage.rul
    public final void d() {
        this.l.incrementAndGet();
        o();
    }

    @Override // defpackage.rul
    public final void e(long j, long j2) {
        this.i.addAndGet(j);
        this.g.incrementAndGet();
        this.h.incrementAndGet();
        this.j.addAndGet(j);
        synchronized (this) {
            ArrayList arrayList = this.w;
            if (arrayList.size() < 2000) {
                arrayList.add(Long.valueOf(j2));
            } else {
                a.h().l(2, TimeUnit.SECONDS).ai(7574).u("receiveTimes list is too big, discarding");
            }
        }
        o();
        m();
    }

    @Override // defpackage.rul
    public final void f(int i) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        synchronized (this) {
            ArrayList arrayList = this.v;
            if (arrayList.size() < 2000) {
                arrayList.add(Long.valueOf(jElapsedRealtimeNanos));
            } else {
                a.h().l(2, TimeUnit.SECONDS).ai(7575).u("mediaSendTimes list is too big, discarding");
            }
        }
        this.d.incrementAndGet();
        this.e.addAndGet(i);
        this.f.addAndGet(i);
        o();
        n();
        rfa rfaVar = this.H;
        rfaVar.e();
        rfaVar.a();
    }

    @Override // defpackage.rul
    public final void g(int i) {
        this.n.getAndSet(i);
    }

    @Override // defpackage.rul
    public final void h() {
        this.m.incrementAndGet();
        o();
    }

    @Override // defpackage.rul
    public final void i(long j) {
        this.s.addAndGet(j);
        synchronized (this.t) {
            this.u = Math.max(j, this.u);
        }
        o();
    }

    @Override // defpackage.rul
    public final synchronized void j() {
        this.G.shutdownNow();
        this.H.d();
    }

    public final void k(List list) {
        if (list.isEmpty()) {
            return;
        }
        yop yopVarAi = a.f().ai(7572);
        int i = this.D;
        yopVarAi.R("Acks from %s received in the last %d seconds with avg latency: [%s]", i == 3 ? "Media" : "Guidance", Integer.valueOf(list.size()), TextUtils.join(",", list));
    }

    public final void l(List list) {
        if (list.isEmpty()) {
            return;
        }
        yop yopVarAi = a.f().ai(7573);
        int i = this.D;
        yopVarAi.R("%s bitrate in the last %d seconds: [%s] kbps", i == 3 ? "Media" : "Guidance", Integer.valueOf(list.size()), TextUtils.join(",", list));
    }
}
