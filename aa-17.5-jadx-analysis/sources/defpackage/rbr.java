package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class rbr {
    public static rbr a;
    public boolean b = false;
    public long c;
    public final HandlerThread d;
    public final Handler e;
    public int f;
    public final List g;
    public final List h;
    private final Runnable i;
    private final Runnable j;

    private rbr() {
        HandlerThread handlerThread = new HandlerThread("rbr", 10);
        this.d = handlerThread;
        this.i = new nwg(this, 12, null);
        this.j = new rbm(this);
        this.f = 0;
        this.g = new ArrayList(16);
        this.h = new ArrayList(8);
        handlerThread.start();
        this.e = new sss(handlerThread.getLooper());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void c(android.os.Handler r10, java.lang.Runnable r11, long r12) {
        /*
            java.lang.Class<rbr> r0 = defpackage.rbr.class
            monitor-enter(r0)
            r1 = 500(0x1f4, double:2.47E-321)
            int r1 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            r2 = 0
            r3 = 1
            r4 = 0
            r5 = 500(0x1f4, float:7.0E-43)
            if (r1 >= 0) goto L25
            java.lang.Long r1 = java.lang.Long.valueOf(r12)     // Catch: java.lang.Throwable -> L7b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L7b
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L7b
            r7[r4] = r1     // Catch: java.lang.Throwable -> L7b
            r7[r3] = r6     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = "add timeout value too small: %d min is: %d"
            java.lang.String r6 = "CAR.TIME"
            r8 = 5
            defpackage.rrd.d(r8, r6, r2, r1, r7)     // Catch: java.lang.Throwable -> L7b
        L25:
            boolean r1 = l()     // Catch: java.lang.Throwable -> L7b
            rbr r6 = defpackage.rbr.a     // Catch: java.lang.Throwable -> L7b
            rbo r7 = r6.b(r10, r11)     // Catch: java.lang.Throwable -> L7b
            if (r7 == 0) goto L45
            java.lang.String r7 = "CAR.TIME"
            r8 = 3
            boolean r7 = defpackage.omc.c(r7, r8)     // Catch: java.lang.Throwable -> L7b
            if (r7 == 0) goto L45
            boolean r7 = defpackage.rrd.a     // Catch: java.lang.Throwable -> L7b
            java.lang.String r7 = "Duplicate handler and runnable added, future cancels may be ambiguous"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L7b
            java.lang.String r9 = "CAR.TIME"
            defpackage.rrd.d(r8, r9, r2, r7, r4)     // Catch: java.lang.Throwable -> L7b
        L45:
            r7 = 250(0xfa, double:1.235E-321)
            long r12 = r12 + r7
            int r12 = (int) r12     // Catch: java.lang.Throwable -> L7b
            int r12 = r12 / r5
            if (r12 != 0) goto L4d
            goto L4e
        L4d:
            r3 = r12
        L4e:
            rbo r12 = new rbo     // Catch: java.lang.Throwable -> L7b
            rbq r13 = new rbq     // Catch: java.lang.Throwable -> L7b
            r13.<init>(r6, r11, r10)     // Catch: java.lang.Throwable -> L7b
            r12.<init>(r10, r13)     // Catch: java.lang.Throwable -> L7b
            int r10 = r6.f     // Catch: java.lang.Throwable -> L7b
            int r3 = r3 + r10
            r12.a = r3     // Catch: java.lang.Throwable -> L7b
            java.util.List r10 = r6.g     // Catch: java.lang.Throwable -> L7b
            r10.add(r12)     // Catch: java.lang.Throwable -> L7b
            android.os.Handler r10 = r6.e     // Catch: java.lang.Throwable -> L7b
            java.lang.Runnable r11 = r6.i     // Catch: java.lang.Throwable -> L7b
            r10.removeCallbacks(r11)     // Catch: java.lang.Throwable -> L7b
            if (r1 != 0) goto L74
            rbr r10 = defpackage.rbr.a     // Catch: java.lang.Throwable -> L7b
            boolean r10 = r10.b     // Catch: java.lang.Throwable -> L7b
            if (r10 != 0) goto L72
            goto L74
        L72:
            monitor-exit(r0)
            return
        L74:
            rbr r10 = defpackage.rbr.a     // Catch: java.lang.Throwable -> L7b
            r10.j()     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r0)
            return
        L7b:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rbr.c(android.os.Handler, java.lang.Runnable, long):void");
    }

    public static synchronized void d(Handler handler, Runnable runnable) {
        k(handler, runnable);
    }

    public static synchronized void e(Handler handler, Runnable runnable) {
        do {
        } while (k(handler, runnable));
    }

    public static synchronized void f(Semaphore semaphore) {
        rbp rbpVar;
        rbr rbrVar = a;
        if (rbrVar == null) {
            semaphore.release();
            return;
        }
        int i = 0;
        while (true) {
            List list = rbrVar.g;
            if (i >= list.size()) {
                rbpVar = null;
                break;
            }
            rbn rbnVar = (rbn) list.get(i);
            if (rbnVar instanceof rbp) {
                rbpVar = (rbp) rbnVar;
                if (!rbpVar.d && rbpVar.b == semaphore) {
                    break;
                }
            }
            i++;
        }
        if (rbpVar == null) {
            semaphore.release();
        } else {
            rbpVar.d();
        }
    }

    public static boolean i(Semaphore semaphore, long j) throws InterruptedException {
        rbp rbpVar;
        int i = 1;
        if (j < 500) {
            rrd.d(5, "CAR.TIME", null, "tryAcquire timeout value too small: %d min is: %s", Long.valueOf(j), 500);
        }
        if (semaphore.tryAcquire()) {
            return true;
        }
        synchronized (rbr.class) {
            boolean zL = l();
            rbr rbrVar = a;
            int i2 = ((int) (j + 250)) / 500;
            if (i2 != 0) {
                i = i2;
            }
            rbpVar = new rbp(semaphore);
            rbpVar.a = i + rbrVar.f;
            rbrVar.g.add(rbpVar);
            rbrVar.e.removeCallbacks(rbrVar.i);
            if (zL || !a.b) {
                a.j();
            }
        }
        boolean zE = rbpVar.e();
        synchronized (rbr.class) {
            rbr rbrVar2 = a;
            if (rbrVar2 != null) {
                rbrVar2.g(rbpVar, false);
            }
        }
        return zE;
    }

    private final void j() {
        this.c = SystemClock.elapsedRealtime();
        this.e.postDelayed(this.j, 500L);
        this.b = true;
    }

    private static boolean k(Handler handler, Runnable runnable) {
        rbr rbrVar = a;
        if (rbrVar == null) {
            return false;
        }
        rbo rboVarB = rbrVar.b(handler, runnable);
        if (rboVarB != null) {
            a.g(rboVarB, true);
            return true;
        }
        rbo rboVarA = a.a(handler, runnable);
        if (rboVarA == null) {
            return false;
        }
        rbr rbrVar2 = a;
        rbrVar2.h.remove(rboVarA);
        rbrVar2.h();
        rboVarA.a();
        return true;
    }

    private static boolean l() {
        if (a != null) {
            return false;
        }
        a = new rbr();
        return true;
    }

    public final rbo a(Handler handler, Runnable runnable) {
        for (rbn rbnVar : this.h) {
            if (rbnVar instanceof rbo) {
                rbo rboVar = (rbo) rbnVar;
                if (rboVar.b == handler && rboVar.c.a == runnable) {
                    return rboVar;
                }
            }
        }
        return null;
    }

    public final rbo b(Handler handler, Runnable runnable) {
        int i = 0;
        while (true) {
            List list = this.g;
            if (i >= list.size()) {
                return null;
            }
            rbn rbnVar = (rbn) list.get(i);
            if (rbnVar instanceof rbo) {
                rbo rboVar = (rbo) rbnVar;
                if (rboVar.b == handler && rboVar.c.a == runnable) {
                    return rboVar;
                }
            }
            i++;
        }
    }

    public final void g(rbn rbnVar, boolean z) {
        this.g.remove(rbnVar);
        h();
        if (z) {
            rbnVar.a();
        }
    }

    public final boolean h() {
        if (!this.g.isEmpty() || !this.h.isEmpty()) {
            return false;
        }
        this.e.postDelayed(this.i, 2000L);
        return true;
    }
}
