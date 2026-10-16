package androidx.work.impl.background.greedy;

import androidx.work.RunnableScheduler;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.WorkLauncher;
import h.g.b.o;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class TimeLimiter {
    private final WorkLauncher launcher;
    private final Object lock;
    private final RunnableScheduler runnableScheduler;
    private final long timeoutMs;
    private final Map<StartStopToken, Runnable> tracked;

    public TimeLimiter(RunnableScheduler runnableScheduler, WorkLauncher workLauncher, long j2) {
        x.f(runnableScheduler, "runnableScheduler");
        x.f(workLauncher, "launcher");
        this.runnableScheduler = runnableScheduler;
        this.launcher = workLauncher;
        this.timeoutMs = j2;
        this.lock = new Object();
        this.tracked = new LinkedHashMap();
    }

    public final void cancel(StartStopToken startStopToken) {
        Runnable runnableRemove;
        x.f(startStopToken, "token");
        synchronized (this.lock) {
            runnableRemove = this.tracked.remove(startStopToken);
        }
        if (runnableRemove != null) {
            this.runnableScheduler.cancel(runnableRemove);
        }
    }

    public final void track(final StartStopToken startStopToken) {
        x.f(startStopToken, "token");
        Runnable runnable = new Runnable() { // from class: androidx.work.impl.background.greedy.TimeLimiter$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.launcher.stopWork(startStopToken, 3);
            }
        };
        synchronized (this.lock) {
            this.tracked.put(startStopToken, runnable);
        }
        this.runnableScheduler.scheduleWithDelay(this.timeoutMs, runnable);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimeLimiter(RunnableScheduler runnableScheduler, WorkLauncher workLauncher) {
        this(runnableScheduler, workLauncher, 0L, 4, null);
        x.f(runnableScheduler, "runnableScheduler");
        x.f(workLauncher, "launcher");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TimeLimiter(RunnableScheduler runnableScheduler, WorkLauncher workLauncher, long j2, int i2, o oVar) {
        if ((i2 & 4) != 0) {
            TimeUnit timeUnit = TimeUnit.MINUTES;
            j2 = 5400000;
        }
        this(runnableScheduler, workLauncher, j2);
    }
}
