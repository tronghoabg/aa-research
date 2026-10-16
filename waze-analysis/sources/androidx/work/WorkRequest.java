package androidx.work;

import androidx.car.app.CarContext;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.DurationApi26Impl;
import e.c.d.a;
import h.a.i;
import h.g.b.x;
import h.n.o;
import j$.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class WorkRequest {
    public static final Companion Companion = new Companion(null);
    public static final long DEFAULT_BACKOFF_DELAY_MILLIS = 30000;
    public static final long MAX_BACKOFF_MILLIS = 18000000;
    private static final int MAX_TRACE_SPAN_LENGTH = 127;
    public static final long MIN_BACKOFF_MILLIS = 10000;
    private final UUID id;
    private final Set<String> tags;
    private final WorkSpec workSpec;

    public WorkRequest(UUID uuid, WorkSpec workSpec, Set<String> set) {
        x.f(uuid, TtmlNode.ATTR_ID);
        x.f(workSpec, "workSpec");
        x.f(set, "tags");
        this.id = uuid;
        this.workSpec = workSpec;
        this.tags = set;
    }

    public UUID getId() {
        return this.id;
    }

    public final String getStringId() {
        String string = getId().toString();
        x.e(string, "toString(...)");
        return string;
    }

    public final Set<String> getTags() {
        return this.tags;
    }

    public final WorkSpec getWorkSpec() {
        return this.workSpec;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String deriveTraceTagFromClassName(String str) {
            List listAf = o.af(str, new String[]{"."}, 0, 6);
            String str2 = listAf.size() == 1 ? (String) listAf.get(0) : (String) i.T(listAf);
            return str2.length() <= 127 ? str2 : o.N(str2, 127);
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    public abstract class Builder<B extends Builder<B, ?>, W extends WorkRequest> {
        private boolean backoffCriteriaSet;
        private UUID id;
        private final Set<String> tags;
        private WorkSpec workSpec;
        private final Class<? extends ListenableWorker> workerClass;

        public Builder(Class<? extends ListenableWorker> cls) {
            x.f(cls, "workerClass");
            this.workerClass = cls;
            UUID uuidRandomUUID = UUID.randomUUID();
            x.e(uuidRandomUUID, "randomUUID(...)");
            this.id = uuidRandomUUID;
            String string = this.id.toString();
            x.e(string, "toString(...)");
            String name = cls.getName();
            x.e(name, "getName(...)");
            this.workSpec = new WorkSpec(string, name);
            String name2 = cls.getName();
            x.e(name2, "getName(...)");
            this.tags = a.q(name2);
        }

        public final B addTag(String str) {
            x.f(str, "tag");
            this.tags.add(str);
            return (B) getThisObject$work_runtime();
        }

        public final W build() {
            W w = (W) buildInternal$work_runtime();
            Constraints constraints = this.workSpec.constraints;
            boolean z = true;
            if (!constraints.hasContentUriTriggers() && !constraints.requiresBatteryNotLow() && !constraints.requiresCharging() && !constraints.requiresDeviceIdle()) {
                z = false;
            }
            WorkSpec workSpec = this.workSpec;
            if (workSpec.expedited) {
                if (z) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (workSpec.initialDelay > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            String traceTag = workSpec.getTraceTag();
            if (traceTag == null) {
                WorkSpec workSpec2 = this.workSpec;
                workSpec2.setTraceTag(WorkRequest.Companion.deriveTraceTagFromClassName(workSpec2.workerClassName));
            } else if (traceTag.length() > 127) {
                this.workSpec.setTraceTag(o.N(traceTag, 127));
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            x.e(uuidRandomUUID, "randomUUID(...)");
            setId(uuidRandomUUID);
            return w;
        }

        public abstract W buildInternal$work_runtime();

        public final boolean getBackoffCriteriaSet$work_runtime() {
            return this.backoffCriteriaSet;
        }

        public final UUID getId$work_runtime() {
            return this.id;
        }

        public final Set<String> getTags$work_runtime() {
            return this.tags;
        }

        public abstract B getThisObject$work_runtime();

        public final WorkSpec getWorkSpec$work_runtime() {
            return this.workSpec;
        }

        public final Class<? extends ListenableWorker> getWorkerClass$work_runtime() {
            return this.workerClass;
        }

        public final B keepResultsForAtLeast(long j2, TimeUnit timeUnit) {
            x.f(timeUnit, "timeUnit");
            this.workSpec.minimumRetentionDuration = timeUnit.toMillis(j2);
            return (B) getThisObject$work_runtime();
        }

        public final B setBackoffCriteria(BackoffPolicy backoffPolicy, long j2, TimeUnit timeUnit) {
            x.f(backoffPolicy, "backoffPolicy");
            x.f(timeUnit, "timeUnit");
            this.backoffCriteriaSet = true;
            WorkSpec workSpec = this.workSpec;
            workSpec.backoffPolicy = backoffPolicy;
            workSpec.setBackoffDelayDuration(timeUnit.toMillis(j2));
            return (B) getThisObject$work_runtime();
        }

        public final void setBackoffCriteriaSet$work_runtime(boolean z) {
            this.backoffCriteriaSet = z;
        }

        public final B setBackoffForSystemInterruptions() {
            this.workSpec.setBackOffOnSystemInterruptions(true);
            return (B) getThisObject$work_runtime();
        }

        public final B setConstraints(Constraints constraints) {
            x.f(constraints, CarContext.CONSTRAINT_SERVICE);
            this.workSpec.constraints = constraints;
            return (B) getThisObject$work_runtime();
        }

        public B setExpedited(OutOfQuotaPolicy outOfQuotaPolicy) {
            x.f(outOfQuotaPolicy, "policy");
            WorkSpec workSpec = this.workSpec;
            workSpec.expedited = true;
            workSpec.outOfQuotaPolicy = outOfQuotaPolicy;
            return (B) getThisObject$work_runtime();
        }

        public final B setId(UUID uuid) {
            x.f(uuid, TtmlNode.ATTR_ID);
            this.id = uuid;
            String string = uuid.toString();
            x.e(string, "toString(...)");
            this.workSpec = new WorkSpec(string, this.workSpec);
            return (B) getThisObject$work_runtime();
        }

        public final void setId$work_runtime(UUID uuid) {
            x.f(uuid, "<set-?>");
            this.id = uuid;
        }

        public B setInitialDelay(long j2, TimeUnit timeUnit) {
            x.f(timeUnit, "timeUnit");
            this.workSpec.initialDelay = timeUnit.toMillis(j2);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.workSpec.initialDelay) {
                return (B) getThisObject$work_runtime();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        public final B setInitialRunAttemptCount(int i2) {
            this.workSpec.runAttemptCount = i2;
            return (B) getThisObject$work_runtime();
        }

        public final B setInitialState(WorkInfo.State state) {
            x.f(state, "state");
            this.workSpec.state = state;
            return (B) getThisObject$work_runtime();
        }

        public final B setInputData(Data data) {
            x.f(data, "inputData");
            this.workSpec.input = data;
            return (B) getThisObject$work_runtime();
        }

        public final B setLastEnqueueTime(long j2, TimeUnit timeUnit) {
            x.f(timeUnit, "timeUnit");
            this.workSpec.lastEnqueueTime = timeUnit.toMillis(j2);
            return (B) getThisObject$work_runtime();
        }

        public final B setScheduleRequestedAt(long j2, TimeUnit timeUnit) {
            x.f(timeUnit, "timeUnit");
            this.workSpec.scheduleRequestedAt = timeUnit.toMillis(j2);
            return (B) getThisObject$work_runtime();
        }

        public final B setTraceTag(String str) {
            x.f(str, "traceTag");
            this.workSpec.setTraceTag(str);
            return (B) getThisObject$work_runtime();
        }

        public final void setWorkSpec$work_runtime(WorkSpec workSpec) {
            x.f(workSpec, "<set-?>");
            this.workSpec = workSpec;
        }

        public final B keepResultsForAtLeast(Duration duration) {
            x.f(duration, TypedValues.TransitionType.S_DURATION);
            this.workSpec.minimumRetentionDuration = DurationApi26Impl.toMillisCompat(duration);
            return (B) getThisObject$work_runtime();
        }

        public final B setBackoffCriteria(BackoffPolicy backoffPolicy, Duration duration) {
            x.f(backoffPolicy, "backoffPolicy");
            x.f(duration, TypedValues.TransitionType.S_DURATION);
            this.backoffCriteriaSet = true;
            WorkSpec workSpec = this.workSpec;
            workSpec.backoffPolicy = backoffPolicy;
            workSpec.setBackoffDelayDuration(DurationApi26Impl.toMillisCompat(duration));
            return (B) getThisObject$work_runtime();
        }

        public B setInitialDelay(Duration duration) {
            x.f(duration, TypedValues.TransitionType.S_DURATION);
            this.workSpec.initialDelay = DurationApi26Impl.toMillisCompat(duration);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.workSpec.initialDelay) {
                return (B) getThisObject$work_runtime();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }
}
