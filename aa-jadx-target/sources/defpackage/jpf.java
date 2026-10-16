package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jpf extends defpackage.jpy implements android.os.IBinder.DeathRecipient {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.DelegateMngCarSvc");
    private final java.lang.Runnable d;
    private final android.os.Handler e;
    private final defpackage.joe f;
    public final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean(true);
    private defpackage.jnz g = null;
    public final java.util.concurrent.atomic.AtomicLong b = new java.util.concurrent.atomic.AtomicLong(20);

    public jpf(defpackage.joe joeVar, android.os.Handler handler, java.lang.Runnable runnable) {
        this.f = joeVar;
        this.e = handler;
        this.d = runnable;
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 2555)).u("Retries remaining initialized to 20");
    }

    private final defpackage.jnz o(int i) {
        defpackage.jnz jnzVarA;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 != 0) {
            defpackage.joe joeVar = this.f;
            if (i2 != 1) {
                jnzVarA = new defpackage.jod(joeVar.c, (defpackage.yys) defpackage.joe.b.fF(), new defpackage.jog(new defpackage.joi(i3), new defpackage.joi(2), 0L), 0L, joeVar.e.incrementAndGet());
            } else {
                android.os.Handler handler = this.e;
                int andIncrement = joeVar.d.getAndIncrement();
                defpackage.ysr.cW(andIncrement);
                jnzVarA = joeVar.a(handler, java.lang.Math.min(30000L, (andIncrement >= 63 ? Long.MAX_VALUE : 1 << andIncrement) * 20));
            }
        } else {
            defpackage.joe joeVar2 = this.f;
            android.os.Handler handler2 = this.e;
            joeVar2.d.set(0);
            jnzVarA = joeVar2.a(handler2, 0L);
        }
        ((defpackage.yqj) a.l().ai((char) 2565)).y("Factory returned new DelegateICarSupplier: %s", new defpackage.zkf(defpackage.zke.a, jnzVarA));
        return jnzVarA;
    }

    @Override // defpackage.jpy
    protected final defpackage.qvl a() throws defpackage.jny {
        defpackage.jnz jnzVar;
        synchronized (this) {
            int i = 1;
            if (this.g == null) {
                ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(2564)).u("Starting delayed delegate acquisition in getDelegateCarService().");
                defpackage.jnz jnzVarO = o(1);
                this.g = jnzVarO;
                jnzVarO.a(new defpackage.jpe(this, i), new defpackage.jpe(this, 0));
            }
            jnzVar = this.g;
        }
        if (jnzVar == null) {
            return null;
        }
        try {
            defpackage.ysr.bk(((defpackage.jod) jnzVar).h.get(), "Must call acquire() before blockingGet()!");
            defpackage.ysr.bk(!((defpackage.jod) jnzVar).k.get(), "ICar has already been released and is unusable.");
            java.util.concurrent.CountDownLatch countDownLatch = ((defpackage.jod) jnzVar).i;
            if (countDownLatch.getCount() > 0) {
                defpackage.yqm yqmVar = defpackage.jod.a;
                ((defpackage.yqj) yqmVar.l().ai((char) 2431)).u("About to block waiting for delegate future completion.");
                if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 2433)).u("Blocking waiting for delegate on main thread!!!");
                }
                if (!countDownLatch.await(60000L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                    ((defpackage.jod) jnzVar).d.a.cancel(true);
                    throw new defpackage.jny();
                }
                ((defpackage.yqj) yqmVar.l().ai((char) 2432)).u("Finished waiting. Latch has been opened.");
            }
            defpackage.zhs zhsVar = ((defpackage.jod) jnzVar).d.a;
            defpackage.ysr.bk(zhsVar.isDone(), "Delegate future must be done before lock is opened!");
            return (defpackage.qvl) zhsVar.get();
        } catch (java.lang.InterruptedException e) {
            java.lang.Thread.currentThread().interrupt();
            throw new defpackage.ivx(e);
        } catch (java.util.concurrent.CancellationException e2) {
            if (!n()) {
                throw new defpackage.jny("Getting delegate car service cancelled.", e2);
            }
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.f()).p(e2)).ai((char) 2563)).u("Cancellation while tearing down. Returning null.");
            return null;
        } catch (java.util.concurrent.ExecutionException e3) {
            if (!(e3.getCause() instanceof joh)) {
                throw new defpackage.jny("Failed to get the delegate car service.", e3.getCause());
            }
            try {
                java.lang.Thread.sleep(3000L);
            } catch (java.lang.InterruptedException unused) {
            }
            throw new java.lang.IllegalStateException("Failed to get the delegate car service.", e3.getCause());
        } catch (java.util.concurrent.TimeoutException e4) {
            throw new java.lang.IllegalStateException("Timed out getting car service delegate.", e4);
        }
    }

    public final synchronized void b(java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 2566)).u("init()");
        if (!f()) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 2568)).u("Not configured for delegates.");
            runnable2.run();
            return;
        }
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 2567)).u("Skipping delegate acquisition on init().");
        try {
            runnable.run();
            runnable2.run();
        } catch (java.lang.Throwable th) {
            runnable2.run();
            throw th;
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        ((defpackage.yqj) a.l().ai((char) 2562)).u("binderDied()");
        i(1);
    }

    public final void c(defpackage.qvl qvlVar) {
        ((defpackage.yqj) a.l().ai((char) 2574)).u("onDelegateReleased()");
        try {
            qvlVar.asBinder().unlinkToDeath(this, 0);
        } catch (java.util.NoSuchElementException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai((char) 2575)).u("DeathRecipient was not linked to death, ignoring.");
        }
    }

    @Override // defpackage.jpy
    public final synchronized void d() {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 2576)).u("tearDown()");
        super.d();
        defpackage.jnz jnzVar = this.g;
        if (jnzVar != null) {
            jnzVar.b(new defpackage.ikd(this, 16));
        }
        this.c.set(false);
    }

    public final boolean f() {
        return this.f.b() != 1;
    }

    @Override // defpackage.jpy
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    protected final synchronized boolean i(int i) {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 2556)).u("attemptDelegateDeathRecovery()");
        int i2 = 0;
        if (n()) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 2561)).u("Tearing down, so will not refresh delegate.");
            return false;
        }
        int i3 = 16;
        if (f()) {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.c;
            int i4 = 1;
            if (atomicBoolean.getAndSet(true)) {
                ((defpackage.yqj) yqmVar.l().ai((char) 2559)).u("Delegate refresh already in progress.");
                return true;
            }
            long andDecrement = this.b.getAndDecrement();
            if (andDecrement > 0) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 2558)).y("Retries remaining: %s. Refreshing delegate.", new defpackage.zkf(defpackage.zke.a, java.lang.Long.valueOf(andDecrement)));
                defpackage.jnz jnzVar = this.g;
                jnzVar.getClass();
                jnzVar.b(new defpackage.ikd(this, i3));
                defpackage.jnz jnzVarO = o(i);
                this.g = jnzVarO;
                jnzVarO.a(new defpackage.jpe(this, i4), new defpackage.jpe(this, i2));
                return true;
            }
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 2557)).u("No recovery retries remaining.");
            atomicBoolean.set(false);
        } else {
            ((defpackage.yqj) yqmVar.l().ai((char) 2560)).u("Not viable so recovery not possible.");
        }
        defpackage.jnz jnzVar2 = this.g;
        if (jnzVar2 != null) {
            jnzVar2.b(new defpackage.ikd(this, i3));
            defpackage.jnz jnzVarO2 = o(3);
            this.g = jnzVarO2;
            jnzVarO2.a(new defpackage.ixc(5), new defpackage.ixc(6));
        }
        this.d.run();
        return false;
    }
}
