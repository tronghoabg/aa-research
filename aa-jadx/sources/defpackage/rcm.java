package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rcm {
    static defpackage.rcm a;
    public boolean b = false;
    public long c;
    public final android.os.HandlerThread d;
    public final android.os.Handler e;
    public int f;
    public final java.util.List g;
    public final java.util.List h;
    private final java.lang.Runnable i;
    private final java.lang.Runnable j;

    private rcm() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("rcm", 10);
        this.d = handlerThread;
        this.i = new defpackage.qtk(this, 5, null);
        this.j = new defpackage.rch(this);
        this.f = 0;
        this.g = new java.util.ArrayList(16);
        this.h = new java.util.ArrayList(8);
        handlerThread.start();
        this.e = new defpackage.stq(handlerThread.getLooper());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    public static synchronized void c(android.os.Handler handler, java.lang.Runnable runnable, long j) {
        boolean zL;
        defpackage.rcm rcmVar;
        int i;
        int i2 = 1;
        if (j >= 500) {
            zL = l();
            rcmVar = a;
            if (rcmVar.b(handler, runnable) != null) {
                boolean z = defpackage.rrx.a;
                defpackage.rrx.d(3, "CAR.TIME", null, "Duplicate handler and runnable added, future cancels may be ambiguous", new java.lang.Object[0]);
            }
            i = ((int) (j + 250)) / 500;
            if (i == 0) {
                i2 = i;
            }
            defpackage.rcj rcjVar = new defpackage.rcj(handler, new defpackage.rcl(rcmVar, runnable, handler));
            rcjVar.a = i2 + rcmVar.f;
            rcmVar.g.add(rcjVar);
            rcmVar.e.removeCallbacks(rcmVar.i);
            if (zL) {
            }
            a.j();
            return;
        }
        defpackage.rrx.d(5, "CAR.TIME", null, "add timeout value too small: %d min is: %d", java.lang.Long.valueOf(j), 500);
        zL = l();
        rcmVar = a;
        if (rcmVar.b(handler, runnable) != null && defpackage.omv.c("CAR.TIME", 3)) {
            boolean z2 = defpackage.rrx.a;
            defpackage.rrx.d(3, "CAR.TIME", null, "Duplicate handler and runnable added, future cancels may be ambiguous", new java.lang.Object[0]);
        }
        i = ((int) (j + 250)) / 500;
        if (i == 0) {
            i2 = i;
        }
        defpackage.rcj rcjVar2 = new defpackage.rcj(handler, new defpackage.rcl(rcmVar, runnable, handler));
        rcjVar2.a = i2 + rcmVar.f;
        rcmVar.g.add(rcjVar2);
        rcmVar.e.removeCallbacks(rcmVar.i);
        if (zL && a.b) {
            return;
        }
        a.j();
        return;
        throw th;
    }

    public static synchronized void d(android.os.Handler handler, java.lang.Runnable runnable) {
        k(handler, runnable);
    }

    public static synchronized void e(android.os.Handler handler, java.lang.Runnable runnable) {
        do {
        } while (k(handler, runnable));
    }

    public static synchronized void f(java.util.concurrent.Semaphore semaphore) {
        defpackage.rck rckVar;
        defpackage.rcm rcmVar = a;
        if (rcmVar == null) {
            semaphore.release();
            return;
        }
        int i = 0;
        while (true) {
            java.util.List list = rcmVar.g;
            if (i >= list.size()) {
                rckVar = null;
                break;
            }
            defpackage.rci rciVar = (defpackage.rci) list.get(i);
            if (rciVar instanceof defpackage.rck) {
                rckVar = (defpackage.rck) rciVar;
                if (!rckVar.d && rckVar.b == semaphore) {
                    break;
                }
            }
            i++;
        }
        if (rckVar == null) {
            semaphore.release();
        } else {
            rckVar.d();
        }
    }

    public static boolean i(java.util.concurrent.Semaphore semaphore, long j) throws java.lang.InterruptedException {
        defpackage.rck rckVar;
        int i = 1;
        if (j < 500) {
            defpackage.rrx.d(5, "CAR.TIME", null, "tryAcquire timeout value too small: %d min is: %s", java.lang.Long.valueOf(j), 500);
        }
        if (semaphore.tryAcquire()) {
            return true;
        }
        synchronized (defpackage.rcm.class) {
            boolean zL = l();
            defpackage.rcm rcmVar = a;
            int i2 = ((int) (j + 250)) / 500;
            if (i2 != 0) {
                i = i2;
            }
            rckVar = new defpackage.rck(semaphore);
            rckVar.a = i + rcmVar.f;
            rcmVar.g.add(rckVar);
            rcmVar.e.removeCallbacks(rcmVar.i);
            if (zL || !a.b) {
                a.j();
            }
        }
        boolean zE = rckVar.e();
        synchronized (defpackage.rcm.class) {
            defpackage.rcm rcmVar2 = a;
            if (rcmVar2 != null) {
                rcmVar2.g(rckVar, false);
            }
        }
        return zE;
    }

    private final void j() {
        this.c = android.os.SystemClock.elapsedRealtime();
        this.e.postDelayed(this.j, 500L);
        this.b = true;
    }

    private static boolean k(android.os.Handler handler, java.lang.Runnable runnable) {
        defpackage.rcm rcmVar = a;
        if (rcmVar == null) {
            return false;
        }
        defpackage.rcj rcjVarB = rcmVar.b(handler, runnable);
        if (rcjVarB != null) {
            a.g(rcjVarB, true);
            return true;
        }
        defpackage.rcj rcjVarA = a.a(handler, runnable);
        if (rcjVarA == null) {
            return false;
        }
        defpackage.rcm rcmVar2 = a;
        rcmVar2.h.remove(rcjVarA);
        rcmVar2.h();
        rcjVarA.a();
        return true;
    }

    private static boolean l() {
        if (a != null) {
            return false;
        }
        a = new defpackage.rcm();
        return true;
    }

    public final defpackage.rcj a(android.os.Handler handler, java.lang.Runnable runnable) {
        for (defpackage.rci rciVar : this.h) {
            if (rciVar instanceof defpackage.rcj) {
                defpackage.rcj rcjVar = (defpackage.rcj) rciVar;
                if (rcjVar.b == handler && rcjVar.c.a == runnable) {
                    return rcjVar;
                }
            }
        }
        return null;
    }

    public final defpackage.rcj b(android.os.Handler handler, java.lang.Runnable runnable) {
        int i = 0;
        while (true) {
            java.util.List list = this.g;
            if (i >= list.size()) {
                return null;
            }
            defpackage.rci rciVar = (defpackage.rci) list.get(i);
            if (rciVar instanceof defpackage.rcj) {
                defpackage.rcj rcjVar = (defpackage.rcj) rciVar;
                if (rcjVar.b == handler && rcjVar.c.a == runnable) {
                    return rcjVar;
                }
            }
            i++;
        }
    }

    public final void g(defpackage.rci rciVar, boolean z) {
        this.g.remove(rciVar);
        h();
        if (z) {
            rciVar.a();
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
