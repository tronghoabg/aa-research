package defpackage;

import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class jox extends jpw implements IBinder.DeathRecipient {
    public static final yph a = yph.c("GH.DelegateMngCarSvc");
    private final Runnable d;
    private final Handler e;
    private final jnw f;
    public final AtomicBoolean c = new AtomicBoolean(true);
    private jnr g = null;
    public final AtomicLong b = new AtomicLong(20);

    public jox(jnw jnwVar, Handler handler, Runnable runnable) {
        this.f = jnwVar;
        this.e = handler;
        this.d = runnable;
        ((ype) ((ype) a.f()).ai((char) 2553)).u("Retries remaining initialized to 20");
    }

    private final jnr o(int i) {
        jnr jnrVarA;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 != 0) {
            jnw jnwVar = this.f;
            int i4 = 1;
            if (i2 != 1) {
                jnrVarA = new jnv(jnwVar.c, (yxn) jnw.b.gu(), new jny(new joa(i4), new joa(i3), 0L), 0L, jnwVar.e.incrementAndGet());
            } else {
                Handler handler = this.e;
                int andIncrement = jnwVar.d.getAndIncrement();
                wub.aE(andIncrement);
                jnrVarA = jnwVar.a(handler, Math.min(30000L, (andIncrement >= 63 ? Long.MAX_VALUE : 1 << andIncrement) * 20));
            }
        } else {
            jnw jnwVar2 = this.f;
            Handler handler2 = this.e;
            jnwVar2.d.set(0);
            jnrVarA = jnwVar2.a(handler2, 0L);
        }
        ((ype) a.l().ai((char) 2563)).y("Factory returned new DelegateICarSupplier: %s", new zjd(zjc.a, jnrVarA));
        return jnrVarA;
    }

    @Override // defpackage.jpw
    protected final qup a() throws InterruptedException, jnq {
        jnr jnrVar;
        synchronized (this) {
            if (this.g == null) {
                ((ype) ((ype) a.f()).ai(2562)).u("Starting delayed delegate acquisition in getDelegateCarService().");
                jnr jnrVarO = o(1);
                this.g = jnrVarO;
                jnrVarO.a(new jow(this, 0), new jow(this, 2));
            }
            jnrVar = this.g;
        }
        if (jnrVar == null) {
            return null;
        }
        try {
            woy.aa(((jnv) jnrVar).h.get(), "Must call acquire() before blockingGet()!");
            woy.aa(!((jnv) jnrVar).k.get(), "ICar has already been released and is unusable.");
            CountDownLatch countDownLatch = ((jnv) jnrVar).i;
            if (countDownLatch.getCount() > 0) {
                yph yphVar = jnv.a;
                ((ype) yphVar.l().ai((char) 2430)).u("About to block waiting for delegate future completion.");
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    ((ype) ((ype) yphVar.h()).ai((char) 2432)).u("Blocking waiting for delegate on main thread!!!");
                }
                if (!countDownLatch.await(60000L, TimeUnit.MILLISECONDS)) {
                    ((jnv) jnrVar).d.a.cancel(true);
                    throw new jnq();
                }
                ((ype) yphVar.l().ai((char) 2431)).u("Finished waiting. Latch has been opened.");
            }
            zgp zgpVar = ((jnv) jnrVar).d.a;
            woy.aa(zgpVar.isDone(), "Delegate future must be done before lock is opened!");
            return (qup) zgpVar.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new ivp(e);
        } catch (CancellationException e2) {
            if (!n()) {
                throw new jnq("Getting delegate car service cancelled.", e2);
            }
            ((ype) ((ype) ((ype) a.f()).p(e2)).ai((char) 2561)).u("Cancellation while tearing down. Returning null.");
            return null;
        } catch (ExecutionException e3) {
            if (!(e3.getCause() instanceof jnz)) {
                throw new jnq("Failed to get the delegate car service.", e3.getCause());
            }
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException unused) {
            }
            throw new IllegalStateException("Failed to get the delegate car service.", e3.getCause());
        } catch (TimeoutException e4) {
            throw new IllegalStateException("Timed out getting car service delegate.", e4);
        }
    }

    public final synchronized void b(Runnable runnable, Runnable runnable2) {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 2564)).u("init()");
        if (!f()) {
            ((ype) ((ype) yphVar.f()).ai((char) 2566)).u("Not configured for delegates.");
            return;
        }
        ((ype) ((ype) yphVar.f()).ai((char) 2565)).u("Skipping delegate acquisition on init().");
        try {
            runnable.run();
        } finally {
            runnable2.run();
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        ((ype) a.l().ai((char) 2560)).u("binderDied()");
        i(1);
    }

    public final void c(qup qupVar) {
        ((ype) a.l().ai((char) 2572)).u("onDelegateReleased()");
        try {
            qupVar.asBinder().unlinkToDeath(this, 0);
        } catch (NoSuchElementException e) {
            ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 2573)).u("DeathRecipient was not linked to death, ignoring.");
        }
    }

    @Override // defpackage.jpw
    public final synchronized void d() {
        ((ype) ((ype) a.f()).ai((char) 2574)).u("tearDown()");
        super.d();
        jnr jnrVar = this.g;
        if (jnrVar != null) {
            jnrVar.b(new iju(this, 15));
        }
        this.c.set(false);
    }

    public final boolean f() {
        return this.f.b() != 1;
    }

    @Override // defpackage.jpw
    @ResultIgnorabilityUnspecified
    protected final synchronized boolean i(int i) {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 2554)).u("attemptDelegateDeathRecovery()");
        int i2 = 0;
        if (n()) {
            ((ype) ((ype) yphVar.f()).ai((char) 2559)).u("Tearing down, so will not refresh delegate.");
            return false;
        }
        int i3 = 15;
        if (f()) {
            AtomicBoolean atomicBoolean = this.c;
            if (atomicBoolean.getAndSet(true)) {
                ((ype) yphVar.l().ai((char) 2557)).u("Delegate refresh already in progress.");
                return true;
            }
            long andDecrement = this.b.getAndDecrement();
            if (andDecrement > 0) {
                ((ype) ((ype) yphVar.f()).ai((char) 2556)).y("Retries remaining: %s. Refreshing delegate.", new zjd(zjc.a, Long.valueOf(andDecrement)));
                jnr jnrVar = this.g;
                jnrVar.getClass();
                jnrVar.b(new iju(this, i3));
                jnr jnrVarO = o(i);
                this.g = jnrVarO;
                jnrVarO.a(new jow(this, i2), new jow(this, 2));
                return true;
            }
            ((ype) ((ype) yphVar.f()).ai((char) 2555)).u("No recovery retries remaining.");
            atomicBoolean.set(false);
        } else {
            ((ype) yphVar.l().ai((char) 2558)).u("Not viable so recovery not possible.");
        }
        jnr jnrVar2 = this.g;
        if (jnrVar2 != null) {
            jnrVar2.b(new iju(this, i3));
            jnr jnrVarO2 = o(3);
            this.g = jnrVarO2;
            jnrVarO2.a(new iwu(5), new iwu(6));
        }
        this.d.run();
        return false;
    }
}
