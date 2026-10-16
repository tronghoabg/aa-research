package androidx.work;

import androidx.work.PeriodicWorkRequest;
import h.g.b.x;
import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class PeriodicWorkRequestKt {
    public static final /* synthetic */ <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(long j2, TimeUnit timeUnit, long j3, TimeUnit timeUnit2) {
        x.f(timeUnit, "repeatIntervalTimeUnit");
        x.f(timeUnit2, "flexTimeIntervalUnit");
        x.i();
        return new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) ListenableWorker.class, j2, timeUnit, j3, timeUnit2);
    }

    public static final /* synthetic */ <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(long j2, TimeUnit timeUnit) {
        x.f(timeUnit, "repeatIntervalTimeUnit");
        x.i();
        return new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) ListenableWorker.class, j2, timeUnit);
    }

    public static final /* synthetic */ <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(Duration duration) {
        x.f(duration, "repeatInterval");
        x.i();
        return new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) ListenableWorker.class, duration);
    }

    public static final /* synthetic */ <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(Duration duration, Duration duration2) {
        x.f(duration, "repeatInterval");
        x.f(duration2, "flexTimeInterval");
        x.i();
        return new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) ListenableWorker.class, duration, duration2);
    }
}
