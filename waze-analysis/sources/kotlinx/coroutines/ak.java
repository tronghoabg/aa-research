package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ak extends bf implements Runnable {
    private static volatile Thread _thread;

    /* renamed from: b, reason: collision with root package name */
    public static final ak f51351b;

    /* renamed from: c, reason: collision with root package name */
    private static final long f51352c;
    private static volatile int debugStatus;

    static {
        Long l2;
        ak akVar = new ak();
        f51351b = akVar;
        akVar.k(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f51352c = timeUnit.toNanos(l2.longValue());
    }

    private static final void A() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    private final synchronized Thread w() {
        Thread thread = _thread;
        if (thread != null) {
            return thread;
        }
        Thread thread2 = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
        _thread = thread2;
        thread2.setContextClassLoader(f51351b.getClass().getClassLoader());
        thread2.setDaemon(true);
        thread2.start();
        return thread2;
    }

    private final synchronized void x() {
        if (z()) {
            debugStatus = 3;
            s();
            notifyAll();
        }
    }

    private final synchronized boolean y() {
        if (z()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    private static final boolean z() {
        int i2 = debugStatus;
        return i2 == 2 || i2 == 3;
    }

    @Override // kotlinx.coroutines.ba
    protected final Thread a() {
        Thread thread = _thread;
        return thread == null ? w() : thread;
    }

    @Override // kotlinx.coroutines.bf, kotlinx.coroutines.ao
    public final ax b(long j2, Runnable runnable, h.c.j jVar) {
        return r(j2, runnable);
    }

    @Override // kotlinx.coroutines.bf
    public final void c(Runnable runnable) {
        if (debugStatus == 4) {
            A();
        }
        super.c(runnable);
    }

    @Override // kotlinx.coroutines.ba
    protected final void d(long j2, bd bdVar) {
        A();
    }

    @Override // kotlinx.coroutines.bf, kotlinx.coroutines.ba
    public final void e() {
        debugStatus = 4;
        super.e();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = dd.f51833a;
        dd.d(this);
        try {
            if (y()) {
                long j2 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jH = h();
                    if (jH == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j2 == Long.MAX_VALUE) {
                            j2 = f51352c + jNanoTime;
                        }
                        jH = j2 - jNanoTime;
                        if (jH <= 0) {
                            break;
                        } else if (jH >= Long.MAX_VALUE) {
                            jH = Long.MAX_VALUE;
                        }
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (jH > 0) {
                        if (z()) {
                            break;
                        } else {
                            LockSupport.parkNanos(this, jH);
                        }
                    }
                }
            }
            _thread = null;
            x();
            if (v()) {
                return;
            }
            a();
        } catch (Throwable th) {
            _thread = null;
            x();
            if (!v()) {
                a();
            }
            throw th;
        }
    }

    @Override // kotlinx.coroutines.ab
    public final String toString() {
        return "DefaultExecutor";
    }
}
