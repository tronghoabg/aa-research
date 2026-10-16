package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public final class aiub extends aiux implements Runnable {
    private static volatile Thread _thread;
    public static final aiub a;
    private static volatile int debugStatus;
    private static final long e;

    static {
        Long l;
        aiub aiubVar = new aiub();
        a = aiubVar;
        aiubVar.o(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        e = timeUnit.toNanos(l.longValue());
    }

    private static final boolean A() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    private static final void B() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    private final synchronized Thread x() {
        Thread thread = _thread;
        if (thread != null) {
            return thread;
        }
        Thread thread2 = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
        _thread = thread2;
        thread2.setContextClassLoader(a.getClass().getClassLoader());
        thread2.setDaemon(true);
        thread2.start();
        return thread2;
    }

    private final synchronized void y() {
        if (A()) {
            debugStatus = 3;
            ((aiux) this).c.c(null);
            this.d.c(null);
            notifyAll();
        }
    }

    private final synchronized boolean z() {
        if (A()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    @Override // defpackage.aius
    protected final Thread e() {
        Thread thread = _thread;
        return thread == null ? x() : thread;
    }

    @Override // defpackage.aiux, defpackage.aiuf
    public final aiuo h(long j, Runnable runnable, afco afcoVar) {
        return t(j, runnable);
    }

    @Override // defpackage.aiux
    public final void i(Runnable runnable) {
        if (debugStatus == 4) {
            B();
        }
        super.i(runnable);
    }

    @Override // defpackage.aius
    protected final void j(long j, aiuv aiuvVar) {
        B();
    }

    @Override // defpackage.aiux, defpackage.aius
    public final void k() {
        debugStatus = 4;
        super.k();
    }

    @Override // java.lang.Runnable
    public final void run() {
        ThreadLocal threadLocal = aiwj.a;
        aiwj.a.set(this);
        try {
            if (z()) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jL = l();
                    if (jL == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = e + jNanoTime;
                        }
                        jL = j - jNanoTime;
                        if (jL <= 0) {
                            break;
                        } else if (jL >= Long.MAX_VALUE) {
                            jL = Long.MAX_VALUE;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jL > 0) {
                        if (A()) {
                            break;
                        } else {
                            LockSupport.parkNanos(this, jL);
                        }
                    }
                }
            }
            _thread = null;
            y();
            if (w()) {
                return;
            }
            e();
        } catch (Throwable th) {
            _thread = null;
            y();
            if (!w()) {
                e();
            }
            throw th;
        }
    }

    @Override // defpackage.aitu
    public final String toString() {
        return "DefaultExecutor";
    }
}
