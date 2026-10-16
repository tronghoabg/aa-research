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

/* loaded from: classes.dex */
public final class iqi implements jci {
    public static final yph a = yph.c("CAR.AUDIO.STATS");
    public long A;
    public final boolean B;
    public final int C;
    private final jfg D;
    private long E;
    private long F;
    private int G;
    private Future H;
    private final long I;
    private final ScheduledExecutorService J;
    private final irv K;
    public final xkj b;
    public final AtomicInteger c = new AtomicInteger();
    public final AtomicInteger d = new AtomicInteger();
    public final AtomicInteger e = new AtomicInteger();
    public final AtomicInteger f = new AtomicInteger();
    public final AtomicLong g = new AtomicLong();
    public final AtomicLong h = new AtomicLong();
    public final AtomicLong i = new AtomicLong();
    public final AtomicInteger j = new AtomicInteger();
    public final AtomicInteger k = new AtomicInteger();
    public final AtomicInteger l = new AtomicInteger(-99999);
    public final AtomicInteger m = new AtomicInteger(-99999);
    public final AtomicInteger n = new AtomicInteger(-99999);
    public final AtomicInteger o = new AtomicInteger(-99999);
    public final AtomicInteger p = new AtomicInteger(-99999);
    public final Object q;
    public long r;
    public long s;
    public final ArrayList t;
    public final ArrayList u;
    public boolean v;
    public Future w;
    public final List x;
    public Future y;
    public final List z;

    public iqi(xkj xkjVar, int i, jfg jfgVar, ScheduledExecutorService scheduledExecutorService, long j, irv irvVar, boolean z) {
        Object obj = new Object();
        this.q = obj;
        ArrayList arrayList = new ArrayList();
        this.t = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.u = arrayList2;
        this.x = new ArrayList(10);
        this.z = new ArrayList(10);
        this.b = xkjVar;
        this.C = i;
        this.D = jfgVar;
        this.J = scheduledExecutorService;
        this.I = j;
        this.K = irvVar;
        synchronized (obj) {
            this.r = 0L;
        }
        synchronized (this) {
            arrayList.clear();
            arrayList2.clear();
        }
        this.B = z;
    }

    private final synchronized void w() {
        if (this.y == null) {
            ScheduledExecutorService scheduledExecutorService = this.J;
            if (!scheduledExecutorService.isShutdown()) {
                this.y = scheduledExecutorService.scheduleAtFixedRate(new ilp(this, 14), 1000L, 1000L, TimeUnit.MILLISECONDS);
            }
        }
    }

    private final synchronized void x() {
        if (this.H == null) {
            ScheduledExecutorService scheduledExecutorService = this.J;
            if (!scheduledExecutorService.isShutdown()) {
                this.H = scheduledExecutorService.scheduleAtFixedRate(new ilp(this, 13), 1000L, 1000L, TimeUnit.MILLISECONDS);
            }
        }
    }

    private final synchronized void y() {
        this.v = true;
        if (this.w == null) {
            ScheduledExecutorService scheduledExecutorService = this.J;
            if (!scheduledExecutorService.isShutdown()) {
                Runnable runnable = new Runnable() { // from class: iqe
                    /* JADX WARN: Removed duplicated region for block: B:34:0x01ae A[Catch: all -> 0x0273, TryCatch #1 {, blocks: (B:14:0x0123, B:16:0x0131, B:21:0x013e, B:25:0x014f, B:27:0x0170, B:29:0x0178, B:32:0x019a, B:34:0x01ae, B:35:0x01c6, B:37:0x01ce, B:38:0x01e9), top: B:70:0x0123, outer: #2 }] */
                    /* JADX WARN: Removed duplicated region for block: B:37:0x01ce A[Catch: all -> 0x0273, TryCatch #1 {, blocks: (B:14:0x0123, B:16:0x0131, B:21:0x013e, B:25:0x014f, B:27:0x0170, B:29:0x0178, B:32:0x019a, B:34:0x01ae, B:35:0x01c6, B:37:0x01ce, B:38:0x01e9), top: B:70:0x0123, outer: #2 }] */
                    /* JADX WARN: Removed duplicated region for block: B:40:0x01ec  */
                    /* JADX WARN: Removed duplicated region for block: B:41:0x01ee  */
                    /* JADX WARN: Removed duplicated region for block: B:44:0x01f4 A[Catch: all -> 0x0276, TryCatch #2 {, blocks: (B:4:0x000f, B:10:0x001f, B:45:0x0203, B:47:0x020b, B:48:0x021a, B:50:0x0222, B:51:0x0233, B:52:0x0237, B:13:0x0122, B:44:0x01f4, B:42:0x01f0, B:64:0x0275, B:7:0x0015, B:9:0x0019, B:14:0x0123, B:16:0x0131, B:21:0x013e, B:25:0x014f, B:27:0x0170, B:29:0x0178, B:32:0x019a, B:34:0x01ae, B:35:0x01c6, B:37:0x01ce, B:38:0x01e9), top: B:72:0x000f, inners: #1 }] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 633
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqe.run():void");
                    }
                };
                long j = this.I;
                this.w = scheduledExecutorService.scheduleAtFixedRate(runnable, j, j, TimeUnit.MILLISECONDS);
                this.A = SystemClock.elapsedRealtime();
            }
        }
    }

    private static void z(AtomicInteger atomicInteger, iqh iqhVar) {
        int i;
        do {
            i = atomicInteger.get();
        } while (!atomicInteger.compareAndSet(i, iqhVar.a(i)));
    }

    @Override // defpackage.jci
    public final synchronized void a() {
        this.K.c();
    }

    @Override // defpackage.jdr
    public final void b(final int i) {
        final int i2 = 1;
        z(this.p, new iqh() { // from class: iqf
            @Override // defpackage.iqh
            public final int a(int i3) {
                int i4 = i2;
                int i5 = i;
                if (i4 != 0) {
                    yph yphVar = iqi.a;
                    return roc.S(i5, i3);
                }
                yph yphVar2 = iqi.a;
                return roc.T(i5, i3);
            }
        });
        final int i3 = 0;
        z(this.o, new iqh() { // from class: iqf
            @Override // defpackage.iqh
            public final int a(int i32) {
                int i4 = i3;
                int i5 = i;
                if (i4 != 0) {
                    yph yphVar = iqi.a;
                    return roc.S(i5, i32);
                }
                yph yphVar2 = iqi.a;
                return roc.T(i5, i32);
            }
        });
        y();
    }

    @Override // defpackage.jci
    public final void c(ywp ywpVar) {
        abnp abnpVarN = yxb.a.n();
        abnpVarN.t();
        yxb yxbVar = (yxb) abnpVarN.b;
        ywpVar.getClass();
        yxbVar.L = ywpVar;
        yxbVar.c |= 4096;
        yxc yxcVar = yxc.AUDIO_STATS;
        int i = yfq.d;
        ((jfh) this.D).m(abnpVarN, yxcVar, yls.a);
    }

    @Override // defpackage.jdr
    public final void d(final int i) {
        final int i2 = 1;
        z(this.m, new iqh() { // from class: iqd
            @Override // defpackage.iqh
            public final int a(int i3) {
                if (i2 != 0) {
                    yph yphVar = iqi.a;
                    int i4 = i;
                    if (i3 == -99999 || i4 < i3) {
                        return i4;
                    }
                } else {
                    yph yphVar2 = iqi.a;
                    int i5 = i;
                    if (i3 == -99999 || i5 > i3) {
                        return i5;
                    }
                }
                return i3;
            }
        });
        final int i3 = 0;
        z(this.n, new iqh() { // from class: iqd
            @Override // defpackage.iqh
            public final int a(int i32) {
                if (i3 != 0) {
                    yph yphVar = iqi.a;
                    int i4 = i;
                    if (i32 == -99999 || i4 < i32) {
                        return i4;
                    }
                } else {
                    yph yphVar2 = iqi.a;
                    int i5 = i;
                    if (i32 == -99999 || i5 > i32) {
                        return i5;
                    }
                }
                return i32;
            }
        });
        y();
    }

    @Override // defpackage.jdr
    public final void e() {
        this.j.incrementAndGet();
        y();
    }

    @Override // defpackage.jdr
    public final void f(long j, long j2) {
        this.h.addAndGet(j);
        this.f.incrementAndGet();
        this.g.incrementAndGet();
        this.i.addAndGet(j);
        if (!this.B) {
            synchronized (this) {
                ArrayList arrayList = this.u;
                if (arrayList.size() < 2000) {
                    arrayList.add(Long.valueOf(j2));
                } else {
                    ((ype) ((ype) ((ype) a.h()).l(2, TimeUnit.SECONDS)).ai(1102)).u("receiveTimes list is too big, discarding");
                }
            }
        }
        y();
        w();
    }

    @Override // defpackage.jdr
    public final void k(int i) {
        boolean z = this.B;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (!z) {
            synchronized (this) {
                ArrayList arrayList = this.t;
                if (arrayList.size() < 2000) {
                    arrayList.add(Long.valueOf(jElapsedRealtimeNanos));
                } else {
                    ((ype) ((ype) ((ype) a.h()).l(2, TimeUnit.SECONDS)).ai(1103)).u("mediaSendTimes list is too big, discarding");
                }
            }
        }
        this.c.incrementAndGet();
        this.d.addAndGet(i);
        this.e.addAndGet(i);
        y();
        x();
        irv irvVar = this.K;
        if (irvVar.e()) {
            irvVar.a();
        }
    }

    @Override // defpackage.jdr
    public final void m(int i) {
        this.l.getAndSet(i);
    }

    @Override // defpackage.jci
    public final void o(yyt yytVar) {
        this.D.c(yytVar);
    }

    @Override // defpackage.jdr
    public final void p() {
        this.k.incrementAndGet();
        y();
    }

    @Override // defpackage.jdr
    public final void q(long j) {
        synchronized (this.q) {
            this.G++;
            this.E += j;
            this.F = Math.max(j, this.F);
            if (this.G >= 234) {
                t();
            }
            this.r = Math.max(j, this.r);
            this.s += j;
        }
        y();
    }

    @Override // defpackage.jdr
    public final synchronized void r() {
        this.J.shutdownNow();
        this.K.d();
    }

    public final void s(List list) {
        if (list.isEmpty()) {
            return;
        }
        ype ypeVar = (ype) ((ype) a.f()).ai(1099);
        int i = this.C;
        ypeVar.R("Acks from %s received in the last %d seconds with avg latency: [%s]", epq.g(i), Integer.valueOf(list.size()), TextUtils.join(",", list));
    }

    public final void t() {
        synchronized (this.q) {
            ((ype) ((ype) a.f()).ai(1100)).S("Time spent in sender lib for stream %s in the last %d frames: avg: %.2f ms, max: %s ms", epq.g(this.C), Integer.valueOf(this.G), Double.valueOf(this.E / this.G), Long.valueOf(this.F));
            this.G = 0;
            this.E = 0L;
            this.F = 0L;
        }
    }

    public final void u(List list) {
        if (list.isEmpty()) {
            return;
        }
        ype ypeVar = (ype) ((ype) a.f()).ai(1101);
        int i = this.C;
        ypeVar.R("%s bitrate in the last %d seconds: [%s] kbps", epq.g(i), Integer.valueOf(list.size()), TextUtils.join(",", list));
    }

    public final synchronized void v() {
        Future future = this.H;
        if (future != null) {
            future.cancel(false);
            this.H = null;
            List list = this.x;
            if (!list.isEmpty()) {
                u(yfq.o(list));
                list.clear();
            }
        }
    }

    @Override // defpackage.jdr
    public final void i() {
    }

    @Override // defpackage.jdr
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.jdr
    public final /* synthetic */ void l() {
    }

    @Override // defpackage.jdr
    public final void g(int i) {
    }

    @Override // defpackage.jdr
    public final void h(long j) {
    }

    @Override // defpackage.jdr
    public final /* synthetic */ void n(xkq xkqVar) {
    }
}
