package com.google.d.m.a;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class cf {
    cf() {
    }

    static Executor A(final Executor executor, final k kVar) {
        com.google.d.b.an.B(executor);
        return executor == al.f7989a ? executor : new Executor() { // from class: com.google.d.m.a.bp
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                cf.B(executor, kVar, runnable);
            }
        };
    }

    static /* synthetic */ void B(Executor executor, k kVar, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e2) {
            kVar.d(e2);
        }
    }

    public static Object s(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    static void t() {
        Thread.currentThread().interrupt();
    }

    static void u(Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }

    static void v(Throwable th) {
        if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
            throw ((Error) th);
        }
    }

    public static bn w(ExecutorService executorService) {
        return executorService instanceof bn ? (bn) executorService : executorService instanceof ScheduledExecutorService ? new br((ScheduledExecutorService) executorService) : new t(executorService);
    }

    public static bo x(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof bo ? (bo) scheduledExecutorService : new br(scheduledExecutorService);
    }

    public static Executor y() {
        return al.f7989a;
    }

    public static Executor z(Executor executor) {
        return new bu(executor);
    }
}
