package defpackage;

import android.os.SystemClock;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class hrn implements Future, hqy, hqx {
    private boolean a = false;
    private Object b;
    private hrc c;

    private final synchronized Object c(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.c != null) {
            throw new ExecutionException(this.c);
        }
        if (!this.a) {
            if (l == null) {
                while (!isDone()) {
                    wait(0L);
                }
            } else if (l.longValue() > 0) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                long jLongValue = l.longValue() + jUptimeMillis;
                while (!isDone() && jUptimeMillis < jLongValue) {
                    wait(jLongValue - jUptimeMillis);
                    jUptimeMillis = SystemClock.uptimeMillis();
                }
            }
            if (this.c != null) {
                throw new ExecutionException(this.c);
            }
            if (!this.a) {
                throw new TimeoutException();
            }
        }
        return this.b;
    }

    @Override // defpackage.hqx
    public final synchronized void a(hrc hrcVar) {
        this.c = hrcVar;
        notifyAll();
    }

    @Override // defpackage.hqy
    public final synchronized void b(Object obj) {
        this.a = true;
        this.b = obj;
        notifyAll();
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return c(Long.valueOf(TimeUnit.MILLISECONDS.convert(j, timeUnit)));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        if (!this.a) {
            if (this.c == null) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        try {
            return c(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }
}
