package androidx.work;

import androidx.work.WorkRequest;
import androidx.work.impl.utils.DurationApi26Impl;
import h.g.b.o;
import h.g.b.x;
import h.l.c;
import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class PeriodicWorkRequest extends WorkRequest {
    public static final Companion Companion = new Companion(null);
    public static final long MIN_PERIODIC_FLEX_MILLIS = 300000;
    public static final long MIN_PERIODIC_INTERVAL_MILLIS = 900000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeriodicWorkRequest(Builder builder) {
        super(builder.getId$work_runtime(), builder.getWorkSpec$work_runtime(), builder.getTags$work_runtime());
        x.f(builder, "builder");
    }

    /* compiled from: WazeSource */
    public final class Builder extends WorkRequest.Builder<Builder, PeriodicWorkRequest> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(c<? extends ListenableWorker> cVar, long j2, TimeUnit timeUnit, long j3, TimeUnit timeUnit2) {
            super(o.w(cVar));
            x.f(cVar, "workerClass");
            x.f(timeUnit, "repeatIntervalTimeUnit");
            x.f(timeUnit2, "flexIntervalTimeUnit");
            getWorkSpec$work_runtime().setPeriodic(timeUnit.toMillis(j2), timeUnit2.toMillis(j3));
        }

        @Override // androidx.work.WorkRequest.Builder
        public PeriodicWorkRequest buildInternal$work_runtime() {
            if (getBackoffCriteriaSet$work_runtime() && getWorkSpec$work_runtime().constraints.requiresDeviceIdle()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            if (getWorkSpec$work_runtime().expedited) {
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
            }
            return new PeriodicWorkRequest(this);
        }

        public final Builder clearNextScheduleTimeOverride() {
            getWorkSpec$work_runtime().setNextScheduleTimeOverride(Long.MAX_VALUE);
            getWorkSpec$work_runtime().setNextScheduleTimeOverrideGeneration(1);
            return this;
        }

        @Override // androidx.work.WorkRequest.Builder
        public /* bridge */ /* synthetic */ WorkRequest.Builder getThisObject$work_runtime() {
            return this;
        }

        public final Builder setNextScheduleTimeOverride(long j2) {
            if (j2 == Long.MAX_VALUE) {
                throw new IllegalArgumentException("Cannot set Long.MAX_VALUE as the schedule override time");
            }
            getWorkSpec$work_runtime().setNextScheduleTimeOverride(j2);
            getWorkSpec$work_runtime().setNextScheduleTimeOverrideGeneration(1);
            return this;
        }

        @Override // androidx.work.WorkRequest.Builder
        public Builder getThisObject$work_runtime() {
            return this;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Class<? extends ListenableWorker> cls, long j2, TimeUnit timeUnit, long j3, TimeUnit timeUnit2) {
            super(cls);
            x.f(cls, "workerClass");
            x.f(timeUnit, "repeatIntervalTimeUnit");
            x.f(timeUnit2, "flexIntervalTimeUnit");
            getWorkSpec$work_runtime().setPeriodic(timeUnit.toMillis(j2), timeUnit2.toMillis(j3));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Class<? extends ListenableWorker> cls, Duration duration) {
            super(cls);
            x.f(cls, "workerClass");
            x.f(duration, "repeatInterval");
            getWorkSpec$work_runtime().setPeriodic(DurationApi26Impl.toMillisCompat(duration));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Class<? extends ListenableWorker> cls, Duration duration, Duration duration2) {
            super(cls);
            x.f(cls, "workerClass");
            x.f(duration, "repeatInterval");
            x.f(duration2, "flexInterval");
            getWorkSpec$work_runtime().setPeriodic(DurationApi26Impl.toMillisCompat(duration), DurationApi26Impl.toMillisCompat(duration2));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(c<? extends ListenableWorker> cVar, long j2, TimeUnit timeUnit) {
            super(o.w(cVar));
            x.f(cVar, "workerClass");
            x.f(timeUnit, "repeatIntervalTimeUnit");
            getWorkSpec$work_runtime().setPeriodic(timeUnit.toMillis(j2));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Class<? extends ListenableWorker> cls, long j2, TimeUnit timeUnit) {
            super(cls);
            x.f(cls, "workerClass");
            x.f(timeUnit, "repeatIntervalTimeUnit");
            getWorkSpec$work_runtime().setPeriodic(timeUnit.toMillis(j2));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(c<? extends ListenableWorker> cVar, Duration duration) {
            super(o.w(cVar));
            x.f(cVar, "workerClass");
            x.f(duration, "repeatInterval");
            getWorkSpec$work_runtime().setPeriodic(DurationApi26Impl.toMillisCompat(duration));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(c<? extends ListenableWorker> cVar, Duration duration, Duration duration2) {
            super(o.w(cVar));
            x.f(cVar, "workerClass");
            x.f(duration, "repeatInterval");
            x.f(duration2, "flexInterval");
            getWorkSpec$work_runtime().setPeriodic(DurationApi26Impl.toMillisCompat(duration), DurationApi26Impl.toMillisCompat(duration2));
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
