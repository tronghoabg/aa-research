package Ef;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import jf.InterfaceC3108h;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public final class I extends AbstractC0479b0 implements Runnable {

    @Nullable
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: i, reason: collision with root package name */
    public static final I f3678i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f3679j;

    static {
        Long l10;
        I i5 = new I();
        f3678i = i5;
        i5.J(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f3679j = timeUnit.toNanos(l10.longValue());
    }

    @Override // Ef.AbstractC0481c0
    public final Thread D() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(f3678i.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // Ef.AbstractC0481c0
    public final void V(long j8, Z z2) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // Ef.AbstractC0479b0
    public final void W(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.W(runnable);
    }

    @Override // Ef.AbstractC0479b0, Ef.M
    public final U b(long j8, M0 m02, InterfaceC3108h interfaceC3108h) {
        long j10 = j8 > 0 ? j8 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j8 : 0L;
        if (j10 >= 4611686018427387903L) {
            return E0.f3662a;
        }
        long jNanoTime = System.nanoTime();
        Y y10 = new Y(j10 + jNanoTime, m02);
        a0(jNanoTime, y10);
        return y10;
    }

    public final synchronized void b0() {
        int i5 = debugStatus;
        if (i5 == 2 || i5 == 3) {
            debugStatus = 3;
            AbstractC0479b0.f3713f.set(this, null);
            AbstractC0479b0.f3714g.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean Z10;
        J0.f3681a.set(this);
        try {
            synchronized (this) {
                int i5 = debugStatus;
                if (i5 == 2 || i5 == 3) {
                    if (Z10) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j8 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jP = P();
                    if (jP == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j8 == Long.MAX_VALUE) {
                            j8 = f3679j + jNanoTime;
                        }
                        long j10 = j8 - jNanoTime;
                        if (j10 <= 0) {
                            _thread = null;
                            b0();
                            if (Z()) {
                                return;
                            }
                            D();
                            return;
                        }
                        if (jP > j10) {
                            jP = j10;
                        }
                    } else {
                        j8 = Long.MAX_VALUE;
                    }
                    if (jP > 0) {
                        int i10 = debugStatus;
                        if (i10 == 2 || i10 == 3) {
                            _thread = null;
                            b0();
                            if (Z()) {
                                return;
                            }
                            D();
                            return;
                        }
                        LockSupport.parkNanos(this, jP);
                    }
                }
            }
        } finally {
            _thread = null;
            b0();
            if (!Z()) {
                D();
            }
        }
    }

    @Override // Ef.AbstractC0479b0, Ef.AbstractC0481c0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // Ef.A
    public final String toString() {
        return "DefaultExecutor";
    }
}
