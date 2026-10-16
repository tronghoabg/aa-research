package defpackage;

import android.os.SystemClock;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.util.Optional;
import j$.util.concurrent.atomic.DesugarAtomicLong;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class jgb implements jen {
    private final yfq A;
    private iuh B;
    private iuh C;
    private iuh D;
    private final Queue E;
    private final long F;
    private Future G;
    private int H;
    private long I;
    private long J;
    private long K;
    private long L;
    private long M;
    public final jfg a;
    public final AtomicInteger b = new AtomicInteger();
    public final AtomicInteger c = new AtomicInteger();
    public final AtomicInteger d = new AtomicInteger();
    public final AtomicLong e = new AtomicLong();
    public final AtomicInteger f = new AtomicInteger();
    public final AtomicLong g = new AtomicLong();
    public final AtomicLong h = new AtomicLong();
    public final AtomicLong i;
    public final AtomicInteger j;
    public final AtomicInteger k;
    public final AtomicInteger l;
    public final int m;
    public final xjc n;
    public final boolean o;
    public iuh p;
    public iuh q;
    public iuh r;
    public iuh s;
    public iuh t;
    public int u;
    public boolean v;
    public long w;
    private final yfq x;
    private final yfq y;
    private final yfq z;

    static {
        yph.c("CAR.VIDEO");
    }

    public jgb(jfg jfgVar, xjc xjcVar, int i, boolean z) {
        AtomicLong atomicLong = new AtomicLong();
        this.i = atomicLong;
        this.j = new AtomicInteger();
        this.k = new AtomicInteger();
        this.l = new AtomicInteger();
        acyk acykVar = acyk.a;
        this.x = yfq.o(acykVar.gu().c().b);
        acta actaVar = acta.a;
        this.y = yfq.o(actaVar.gu().d().b);
        this.z = yfq.o(actaVar.gu().e().b);
        this.A = yfq.o(actaVar.gu().f().b);
        this.v = false;
        this.w = 0L;
        this.F = acykVar.gu().b();
        this.a = jfgVar;
        this.n = xjcVar;
        this.m = i;
        this.o = z;
        this.E = new ydx((int) acykVar.gu().a());
        if (!acykVar.gu().d()) {
            this.v = true;
        }
        atomicLong.set(0L);
        z();
    }

    @Override // defpackage.jen
    public final synchronized void a(PrintWriter printWriter) {
        Queue queue = this.E;
        if (queue.isEmpty()) {
            printWriter.println("No MediaStats received for current video session.");
            return;
        }
        printWriter.println("Last " + queue.size() + " MediaStats:");
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            jga jgaVar = (jga) it.next();
            String strValueOf = String.valueOf(jgaVar.b.atZone(ZoneId.systemDefault()).toLocalDateTime());
            xkq xkqVar = jgaVar.a;
            int i = this.m;
            xhe xheVar = xkqVar.n;
            if (xheVar == null) {
                xheVar = xhe.a;
            }
            xhe xheVar2 = xkqVar.o;
            if (xheVar2 == null) {
                xheVar2 = xhe.a;
            }
            xhe xheVar3 = xkqVar.m;
            if (xheVar3 == null) {
                xheVar3 = xhe.a;
            }
            Locale locale = Locale.US;
            Integer numValueOf = Integer.valueOf(i);
            abnf abnfVar = xkqVar.c;
            if (abnfVar == null) {
                abnfVar = abnf.a;
            }
            Iterator it2 = it;
            printWriter.println("  " + strValueOf + " " + String.format(locale, "Media stats for display %d in the last %d ms and %d frames:\n  Video frame jitter (us): {avg: %d, min: %d, max: %d, count: %d}\n  Video frame pacing delay (us): {avg: %d, min: %d, max: %d, count: %d}\n  Video frame too slow count: %d\n  Video frame too fast count: %d\n  Video overflow count: %d\n  Video overflow duration (us): {avg: %d, min: %d, max: %d, count: %d}", numValueOf, Long.valueOf(abqs.a(abnfVar)), Long.valueOf(xkqVar.d), Long.valueOf(xheVar.b), Long.valueOf(xheVar.c), Long.valueOf(xheVar.d), Long.valueOf(xheVar.e), Long.valueOf(xheVar2.b), Long.valueOf(xheVar2.c), Long.valueOf(xheVar2.d), Long.valueOf(xheVar2.e), Long.valueOf(xkqVar.q), Long.valueOf(xkqVar.p), Long.valueOf(xkqVar.l), Long.valueOf(xheVar3.b), Long.valueOf(xheVar3.c), Long.valueOf(xheVar3.d), Long.valueOf(xheVar3.e)).replace("\n", "\n  "));
            it = it2;
        }
    }

    @Override // defpackage.jen
    public final synchronized void c() {
        if (this.v) {
            return;
        }
        this.v = true;
        this.w -= SystemClock.elapsedRealtime();
    }

    @Override // defpackage.jdr
    public final void f(long j, long j2) {
        if (this.o) {
            return;
        }
        this.e.addAndGet(j);
        this.d.incrementAndGet();
    }

    @Override // defpackage.jdr
    public final void g(int i) {
        this.g.addAndGet(i);
    }

    @Override // defpackage.jdr
    public final synchronized void h(long j) {
        this.p.c(j, 1);
    }

    @Override // defpackage.jdr
    public final void i() {
        this.j.incrementAndGet();
    }

    @Override // defpackage.jdr
    public final void j() {
        this.k.getAndIncrement();
    }

    @Override // defpackage.jdr
    public final void k(int i) {
        this.c.incrementAndGet();
        this.f.addAndGet(i);
    }

    @Override // defpackage.jdr
    public final void l() {
        this.l.getAndIncrement();
    }

    @Override // defpackage.jdr
    public final void m(int i) {
        if (this.o) {
            return;
        }
        this.b.set(i);
    }

    @Override // defpackage.jdr
    public final synchronized void n(xkq xkqVar) {
        this.E.add(new jga(xkqVar, Instant.now()));
        if (acta.c()) {
            if ((xkqVar.b & 2048) != 0) {
                xhe xheVar = xkqVar.n;
                if (xheVar == null) {
                    xheVar = xhe.a;
                }
                iuh iuhVar = this.B;
                TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                iuhVar.c(xheVar.b / 1000, (int) xheVar.e);
            }
            if ((xkqVar.b & 4096) != 0) {
                xhe xheVar2 = xkqVar.o;
                if (xheVar2 == null) {
                    xheVar2 = xhe.a;
                }
                iuh iuhVar2 = this.C;
                TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
                iuhVar2.c(xheVar2.b / 1000, (int) xheVar2.e);
            }
            if ((xkqVar.b & 1024) != 0) {
                xhe xheVar3 = xkqVar.m;
                if (xheVar3 == null) {
                    xheVar3 = xhe.a;
                }
                iuh iuhVar3 = this.D;
                TimeUnit timeUnit3 = TimeUnit.MICROSECONDS;
                iuhVar3.c(xheVar3.b / 1000, (int) xheVar3.e);
            }
            this.K += xkqVar.l;
            this.I += xkqVar.p;
            this.J += xkqVar.q;
            long j = this.L;
            abnf abnfVar = xkqVar.c;
            if (abnfVar == null) {
                abnfVar = abnf.a;
            }
            this.L = j + abqs.a(abnfVar);
            this.M += xkqVar.d;
        }
    }

    @Override // defpackage.jen
    public final synchronized void o() {
        if (acyk.f() && this.v) {
            this.v = false;
            this.w += SystemClock.elapsedRealtime();
        }
    }

    @Override // defpackage.jdr
    public final synchronized void q(long j) {
        this.h.addAndGet(j);
        DesugarAtomicLong.accumulateAndGet(this.i, j, new jfy());
        this.q.c(j, 1);
    }

    @Override // defpackage.jdr
    public final void r() {
        Future future = this.G;
        if (future != null) {
            future.cancel(false);
            this.G = null;
        }
    }

    @Override // defpackage.jen
    public final synchronized void s(Duration duration) {
        this.t.c(duration.toMillis(), 1);
    }

    @Override // defpackage.jen
    public final synchronized void t(Duration duration) {
        this.r.c(duration.toMillis(), 1);
    }

    @Override // defpackage.jen
    public final synchronized void u(Duration duration) {
        if (this.o) {
            return;
        }
        this.s.c(duration.toMillis(), 1);
    }

    @Override // defpackage.jen
    public final void v(int i) {
        this.u = i;
    }

    @Override // defpackage.jen
    public final void w(int i) {
        this.H = i;
    }

    @Override // defpackage.jen
    public final void x(ScheduledExecutorService scheduledExecutorService) {
        synchronized (this) {
            this.w = this.v ? -SystemClock.elapsedRealtime() : 0L;
        }
        this.c.set(0);
        this.d.set(0);
        this.e.set(0L);
        this.f.set(0);
        this.g.set(0L);
        this.h.set(0L);
        this.i.set(0L);
        this.j.set(0);
        this.l.set(0);
        this.k.set(0);
        Runnable runnable = new Runnable() { // from class: jfx
            @Override // java.lang.Runnable
            public final void run() {
                int i;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                jgb jgbVar = this.a;
                synchronized (jgbVar) {
                    if (jgbVar.v) {
                        long j = jgbVar.w + jElapsedRealtime;
                        jgbVar.w = -jElapsedRealtime;
                        i = (int) j;
                    } else {
                        i = (int) jgbVar.w;
                        jgbVar.w = 0L;
                    }
                }
                abnp abnpVarN = yzi.a.n();
                abnpVarN.t();
                yzi yziVar = (yzi) abnpVarN.b;
                yziVar.b |= 1;
                yziVar.c = i;
                int andSet = (int) jgbVar.g.getAndSet(0L);
                abnpVarN.t();
                yzi yziVar2 = (yzi) abnpVarN.b;
                yziVar2.b |= 4;
                yziVar2.e = andSet;
                int andSet2 = jgbVar.c.getAndSet(0);
                abnpVarN.t();
                yzi yziVar3 = (yzi) abnpVarN.b;
                yziVar3.b |= 8;
                yziVar3.f = andSet2;
                int andSet3 = jgbVar.f.getAndSet(0);
                abnpVarN.t();
                yzi yziVar4 = (yzi) abnpVarN.b;
                yziVar4.b |= 32;
                yziVar4.h = andSet3;
                int i2 = jgbVar.u;
                abnpVarN.t();
                yzi yziVar5 = (yzi) abnpVarN.b;
                yziVar5.b |= 128;
                yziVar5.j = i2;
                int andSet4 = (int) jgbVar.h.getAndSet(0L);
                abnpVarN.t();
                yzi yziVar6 = (yzi) abnpVarN.b;
                yziVar6.b |= 256;
                yziVar6.k = andSet4;
                int andSet5 = (int) jgbVar.i.getAndSet(0L);
                abnpVarN.t();
                yzi yziVar7 = (yzi) abnpVarN.b;
                yziVar7.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
                yziVar7.l = andSet5;
                AtomicInteger atomicInteger = jgbVar.k;
                if (atomicInteger.get() > 0) {
                    int andSet6 = atomicInteger.getAndSet(0);
                    abnpVarN.t();
                    yzi yziVar8 = (yzi) abnpVarN.b;
                    yziVar8.b |= 2;
                    yziVar8.d = andSet6;
                    int andSet7 = jgbVar.l.getAndSet(0);
                    abnpVarN.t();
                    yzi yziVar9 = (yzi) abnpVarN.b;
                    yziVar9.b |= 524288;
                    yziVar9.v = andSet7;
                }
                if (!jgbVar.o) {
                    int andSet8 = jgbVar.b.getAndSet(0);
                    if (andSet8 > 0) {
                        abnpVarN.t();
                        yzi yziVar10 = (yzi) abnpVarN.b;
                        yziVar10.b |= 8192;
                        yziVar10.p = andSet8;
                    }
                    int andSet9 = jgbVar.d.getAndSet(0);
                    abnpVarN.t();
                    yzi yziVar11 = (yzi) abnpVarN.b;
                    yziVar11.b |= 16;
                    yziVar11.g = andSet9;
                    int andSet10 = (int) jgbVar.e.getAndSet(0L);
                    abnpVarN.t();
                    yzi yziVar12 = (yzi) abnpVarN.b;
                    yziVar12.b |= 64;
                    yziVar12.i = andSet10;
                }
                int andSet11 = jgbVar.j.getAndSet(0);
                if (andSet11 > 0) {
                    abnpVarN.t();
                    yzi yziVar13 = (yzi) abnpVarN.b;
                    yziVar13.b |= 4096;
                    yziVar13.o = andSet11;
                }
                int i3 = jgbVar.m;
                if (i3 != 0) {
                    abnpVarN.t();
                    yzi yziVar14 = (yzi) abnpVarN.b;
                    yziVar14.b |= 2048;
                    yziVar14.n = i3;
                    xjc xjcVar = jgbVar.n;
                    abnpVarN.t();
                    yzi yziVar15 = (yzi) abnpVarN.b;
                    yziVar15.b |= 1024;
                    yziVar15.m = xjcVar.d;
                }
                Optional optionalA = jgbVar.p.a();
                iln ilnVar = new iln(abnpVarN, 18);
                if (true == optionalA.isPresent()) {
                    Object obj = optionalA.get();
                    abnp abnpVar = (abnp) ilnVar.a;
                    abnpVar.t();
                    yzi yziVar16 = (yzi) abnpVar.b;
                    yziVar16.q = (yyq) obj;
                    yziVar16.b |= 16384;
                }
                Optional optionalA2 = jgbVar.q.a();
                iln ilnVar2 = new iln(abnpVarN, 19);
                if (true == optionalA2.isPresent()) {
                    Object obj2 = optionalA2.get();
                    abnp abnpVar2 = (abnp) ilnVar2.a;
                    abnpVar2.t();
                    yzi yziVar17 = (yzi) abnpVar2.b;
                    yziVar17.r = (yyq) obj2;
                    yziVar17.b |= 32768;
                }
                Optional optionalA3 = jgbVar.r.a();
                iln ilnVar3 = new iln(abnpVarN, 20);
                if (true == optionalA3.isPresent()) {
                    Object obj3 = optionalA3.get();
                    abnp abnpVar3 = (abnp) ilnVar3.a;
                    abnpVar3.t();
                    yzi yziVar18 = (yzi) abnpVar3.b;
                    yziVar18.s = (yyq) obj3;
                    yziVar18.b |= 65536;
                }
                Optional optionalA4 = jgbVar.s.a();
                jfz jfzVar = new jfz(abnpVarN, 1);
                if (true == optionalA4.isPresent()) {
                    Object obj4 = optionalA4.get();
                    abnp abnpVar4 = (abnp) jfzVar.a;
                    abnpVar4.t();
                    yzi yziVar19 = (yzi) abnpVar4.b;
                    yziVar19.t = (yyq) obj4;
                    yziVar19.b |= 131072;
                }
                Optional optionalA5 = jgbVar.t.a();
                jfz jfzVar2 = new jfz(abnpVarN, 0);
                if (true == optionalA5.isPresent()) {
                    Object obj5 = optionalA5.get();
                    abnp abnpVar5 = (abnp) jfzVar2.a;
                    abnpVar5.t();
                    yzi yziVar20 = (yzi) abnpVar5.b;
                    yziVar20.u = (yyq) obj5;
                    yziVar20.b |= 262144;
                }
                jgbVar.y();
                jgbVar.z();
                abnp abnpVarN2 = yzh.a.n();
                abnpVarN2.t();
                yzh yzhVar = (yzh) abnpVarN2.b;
                yzi yziVar21 = (yzi) abnpVarN.q();
                yziVar21.getClass();
                yzhVar.c = yziVar21;
                yzhVar.b |= 1;
                yzh yzhVar2 = (yzh) abnpVarN2.q();
                jfg jfgVar = jgbVar.a;
                abnp abnpVarN3 = yxb.a.n();
                abnpVarN3.t();
                yxb yxbVar = (yxb) abnpVarN3.b;
                yzhVar2.getClass();
                yxbVar.K = yzhVar2;
                yxbVar.c |= 2048;
                yxc yxcVar = yxc.PROJECTION_STATS;
                int i4 = yfq.d;
                ((jfh) jfgVar).m(abnpVarN3, yxcVar, yls.a);
            }
        };
        long j = this.F;
        this.G = scheduledExecutorService.scheduleAtFixedRate(runnable, j, j, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0104 A[Catch: all -> 0x018d, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0009, B:8:0x0011, B:37:0x00c5, B:39:0x0104, B:40:0x0120, B:42:0x0133, B:43:0x014f, B:45:0x0162, B:46:0x017e, B:27:0x00a8, B:28:0x00aa, B:29:0x00ad, B:30:0x00b0, B:31:0x00b3, B:32:0x00b6, B:33:0x00b9, B:34:0x00bc, B:35:0x00bf, B:36:0x00c2), top: B:54:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0133 A[Catch: all -> 0x018d, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0009, B:8:0x0011, B:37:0x00c5, B:39:0x0104, B:40:0x0120, B:42:0x0133, B:43:0x014f, B:45:0x0162, B:46:0x017e, B:27:0x00a8, B:28:0x00aa, B:29:0x00ad, B:30:0x00b0, B:31:0x00b3, B:32:0x00b6, B:33:0x00b9, B:34:0x00bc, B:35:0x00bf, B:36:0x00c2), top: B:54:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0162 A[Catch: all -> 0x018d, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0009, B:8:0x0011, B:37:0x00c5, B:39:0x0104, B:40:0x0120, B:42:0x0133, B:43:0x014f, B:45:0x0162, B:46:0x017e, B:27:0x00a8, B:28:0x00aa, B:29:0x00ad, B:30:0x00b0, B:31:0x00b3, B:32:0x00b6, B:33:0x00b9, B:34:0x00bc, B:35:0x00bf, B:36:0x00c2), top: B:54:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void y() {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jgb.y():void");
    }

    public final synchronized void z() {
        yfq yfqVar = this.x;
        this.p = new iuh(yfqVar);
        this.q = new iuh(yfqVar);
        this.r = new iuh(yfqVar);
        this.s = new iuh(yfqVar);
        this.t = new iuh(yfqVar);
        this.B = new iuh(this.y);
        this.C = new iuh(this.z);
        this.D = new iuh(this.A);
    }

    @Override // defpackage.jdr
    public final void e() {
    }

    @Override // defpackage.jdr
    public final void p() {
    }

    @Override // defpackage.jdr
    public final void b(int i) {
    }

    @Override // defpackage.jdr
    public final void d(int i) {
    }
}
