package androidx.work.impl.model;

import androidx.arch.core.util.Function;
import androidx.car.app.CarContext;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.OverwritingInputMerger;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkRequest;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import h.k.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WorkSpec {
    public static final Companion Companion = new Companion(null);
    public static final long SCHEDULE_NOT_REQUESTED_YET = -1;
    private static final String TAG;
    public static final Function<List<WorkInfoPojo>, List<WorkInfo>> WORK_INFO_MAPPER;
    private Boolean backOffOnSystemInterruptions;
    public long backoffDelayDuration;
    public BackoffPolicy backoffPolicy;
    public Constraints constraints;
    public boolean expedited;
    public long flexDuration;
    private final int generation;
    public final String id;
    public long initialDelay;
    public Data input;
    public String inputMergerClassName;
    public long intervalDuration;
    public long lastEnqueueTime;
    public long minimumRetentionDuration;
    private long nextScheduleTimeOverride;
    private int nextScheduleTimeOverrideGeneration;
    public OutOfQuotaPolicy outOfQuotaPolicy;
    public Data output;
    private int periodCount;
    public int runAttemptCount;
    public long scheduleRequestedAt;
    public WorkInfo.State state;
    private final int stopReason;
    private String traceTag;
    public String workerClassName;

    /* compiled from: WazeSource */
    public final class IdAndState {
        public String id;
        public WorkInfo.State state;

        public IdAndState(String str, WorkInfo.State state) {
            x.f(str, TtmlNode.ATTR_ID);
            x.f(state, "state");
            this.id = str;
            this.state = state;
        }

        public static /* synthetic */ IdAndState copy$default(IdAndState idAndState, String str, WorkInfo.State state, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = idAndState.id;
            }
            if ((i2 & 2) != 0) {
                state = idAndState.state;
            }
            return idAndState.copy(str, state);
        }

        public final String component1() {
            return this.id;
        }

        public final WorkInfo.State component2() {
            return this.state;
        }

        public final IdAndState copy(String str, WorkInfo.State state) {
            x.f(str, TtmlNode.ATTR_ID);
            x.f(state, "state");
            return new IdAndState(str, state);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdAndState)) {
                return false;
            }
            IdAndState idAndState = (IdAndState) obj;
            return x.n(this.id, idAndState.id) && this.state == idAndState.state;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.state.hashCode();
        }

        public String toString() {
            return "IdAndState(id=" + this.id + ", state=" + this.state + ")";
        }
    }

    /* compiled from: WazeSource */
    public final class WorkInfoPojo {
        private long backoffDelayDuration;
        private BackoffPolicy backoffPolicy;
        private final Constraints constraints;
        private final long flexDuration;
        private final int generation;
        private final String id;
        private final long initialDelay;
        private final long intervalDuration;
        private long lastEnqueueTime;
        private final long nextScheduleTimeOverride;
        private final Data output;
        private int periodCount;
        private final List<Data> progress;
        private final int runAttemptCount;
        private final WorkInfo.State state;
        private final int stopReason;
        private final List<String> tags;
        private final String workerClassName;

        public WorkInfoPojo(String str, WorkInfo.State state, Data data, long j2, long j3, long j4, Constraints constraints, int i2, BackoffPolicy backoffPolicy, long j5, long j6, int i3, int i4, long j7, int i5, List<String> list, String str2, List<Data> list2) {
            x.f(str, TtmlNode.ATTR_ID);
            x.f(state, "state");
            x.f(data, "output");
            x.f(constraints, CarContext.CONSTRAINT_SERVICE);
            x.f(backoffPolicy, "backoffPolicy");
            x.f(list, "tags");
            x.f(str2, "workerClassName");
            x.f(list2, "progress");
            this.id = str;
            this.state = state;
            this.output = data;
            this.initialDelay = j2;
            this.intervalDuration = j3;
            this.flexDuration = j4;
            this.constraints = constraints;
            this.runAttemptCount = i2;
            this.backoffPolicy = backoffPolicy;
            this.backoffDelayDuration = j5;
            this.lastEnqueueTime = j6;
            this.periodCount = i3;
            this.generation = i4;
            this.nextScheduleTimeOverride = j7;
            this.stopReason = i5;
            this.tags = list;
            this.workerClassName = str2;
            this.progress = list2;
        }

        private final long calculateNextRunTimeMillis() {
            if (this.state == WorkInfo.State.ENQUEUED) {
                return WorkSpec.Companion.calculateNextRunTime(isBackedOff(), this.runAttemptCount, this.backoffPolicy, this.backoffDelayDuration, this.lastEnqueueTime, this.periodCount, isPeriodic(), this.initialDelay, this.flexDuration, this.intervalDuration, this.nextScheduleTimeOverride);
            }
            return Long.MAX_VALUE;
        }

        public static /* synthetic */ WorkInfoPojo copy$default(WorkInfoPojo workInfoPojo, String str, WorkInfo.State state, Data data, long j2, long j3, long j4, Constraints constraints, int i2, BackoffPolicy backoffPolicy, long j5, long j6, int i3, int i4, long j7, int i5, List list, String str2, List list2, int i6, Object obj) {
            List list3;
            String str3;
            String str4 = (i6 & 1) != 0 ? workInfoPojo.id : str;
            WorkInfo.State state2 = (i6 & 2) != 0 ? workInfoPojo.state : state;
            Data data2 = (i6 & 4) != 0 ? workInfoPojo.output : data;
            long j8 = (i6 & 8) != 0 ? workInfoPojo.initialDelay : j2;
            long j9 = (i6 & 16) != 0 ? workInfoPojo.intervalDuration : j3;
            long j10 = (i6 & 32) != 0 ? workInfoPojo.flexDuration : j4;
            Constraints constraints2 = (i6 & 64) != 0 ? workInfoPojo.constraints : constraints;
            int i7 = (i6 & 128) != 0 ? workInfoPojo.runAttemptCount : i2;
            BackoffPolicy backoffPolicy2 = (i6 & 256) != 0 ? workInfoPojo.backoffPolicy : backoffPolicy;
            long j11 = (i6 & 512) != 0 ? workInfoPojo.backoffDelayDuration : j5;
            String str5 = str4;
            WorkInfo.State state3 = state2;
            long j12 = (i6 & 1024) != 0 ? workInfoPojo.lastEnqueueTime : j6;
            int i8 = (i6 & 2048) != 0 ? workInfoPojo.periodCount : i3;
            int i9 = (i6 & 4096) != 0 ? workInfoPojo.generation : i4;
            long j13 = (i6 & 8192) != 0 ? workInfoPojo.nextScheduleTimeOverride : j7;
            int i10 = (i6 & 16384) != 0 ? workInfoPojo.stopReason : i5;
            List list4 = (32768 & i6) != 0 ? workInfoPojo.tags : list;
            String str6 = (i6 & 65536) != 0 ? workInfoPojo.workerClassName : str2;
            if ((i6 & 131072) != 0) {
                str3 = str6;
                list3 = workInfoPojo.progress;
            } else {
                list3 = list2;
                str3 = str6;
            }
            return workInfoPojo.copy(str5, state3, data2, j8, j9, j10, constraints2, i7, backoffPolicy2, j11, j12, i8, i9, j13, i10, list4, str3, list3);
        }

        private final WorkInfo.PeriodicityInfo getPeriodicityOrNull() {
            long j2 = this.intervalDuration;
            if (j2 != 0) {
                return new WorkInfo.PeriodicityInfo(j2, this.flexDuration);
            }
            return null;
        }

        public final String component1() {
            return this.id;
        }

        public final long component10() {
            return this.backoffDelayDuration;
        }

        public final long component11() {
            return this.lastEnqueueTime;
        }

        public final int component12() {
            return this.periodCount;
        }

        public final int component13() {
            return this.generation;
        }

        public final long component14() {
            return this.nextScheduleTimeOverride;
        }

        public final int component15() {
            return this.stopReason;
        }

        public final List<String> component16() {
            return this.tags;
        }

        public final String component17() {
            return this.workerClassName;
        }

        public final List<Data> component18() {
            return this.progress;
        }

        public final WorkInfo.State component2() {
            return this.state;
        }

        public final Data component3() {
            return this.output;
        }

        public final long component4() {
            return this.initialDelay;
        }

        public final long component5() {
            return this.intervalDuration;
        }

        public final long component6() {
            return this.flexDuration;
        }

        public final Constraints component7() {
            return this.constraints;
        }

        public final int component8() {
            return this.runAttemptCount;
        }

        public final BackoffPolicy component9() {
            return this.backoffPolicy;
        }

        public final WorkInfoPojo copy(String str, WorkInfo.State state, Data data, long j2, long j3, long j4, Constraints constraints, int i2, BackoffPolicy backoffPolicy, long j5, long j6, int i3, int i4, long j7, int i5, List<String> list, String str2, List<Data> list2) {
            x.f(str, TtmlNode.ATTR_ID);
            x.f(state, "state");
            x.f(data, "output");
            x.f(constraints, CarContext.CONSTRAINT_SERVICE);
            x.f(backoffPolicy, "backoffPolicy");
            x.f(list, "tags");
            x.f(str2, "workerClassName");
            x.f(list2, "progress");
            return new WorkInfoPojo(str, state, data, j2, j3, j4, constraints, i2, backoffPolicy, j5, j6, i3, i4, j7, i5, list, str2, list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WorkInfoPojo)) {
                return false;
            }
            WorkInfoPojo workInfoPojo = (WorkInfoPojo) obj;
            return x.n(this.id, workInfoPojo.id) && this.state == workInfoPojo.state && x.n(this.output, workInfoPojo.output) && this.initialDelay == workInfoPojo.initialDelay && this.intervalDuration == workInfoPojo.intervalDuration && this.flexDuration == workInfoPojo.flexDuration && x.n(this.constraints, workInfoPojo.constraints) && this.runAttemptCount == workInfoPojo.runAttemptCount && this.backoffPolicy == workInfoPojo.backoffPolicy && this.backoffDelayDuration == workInfoPojo.backoffDelayDuration && this.lastEnqueueTime == workInfoPojo.lastEnqueueTime && this.periodCount == workInfoPojo.periodCount && this.generation == workInfoPojo.generation && this.nextScheduleTimeOverride == workInfoPojo.nextScheduleTimeOverride && this.stopReason == workInfoPojo.stopReason && x.n(this.tags, workInfoPojo.tags) && x.n(this.workerClassName, workInfoPojo.workerClassName) && x.n(this.progress, workInfoPojo.progress);
        }

        public final long getBackoffDelayDuration() {
            return this.backoffDelayDuration;
        }

        public final BackoffPolicy getBackoffPolicy() {
            return this.backoffPolicy;
        }

        public final Constraints getConstraints() {
            return this.constraints;
        }

        public final long getFlexDuration() {
            return this.flexDuration;
        }

        public final int getGeneration() {
            return this.generation;
        }

        public final String getId() {
            return this.id;
        }

        public final long getInitialDelay() {
            return this.initialDelay;
        }

        public final long getIntervalDuration() {
            return this.intervalDuration;
        }

        public final long getLastEnqueueTime() {
            return this.lastEnqueueTime;
        }

        public final long getNextScheduleTimeOverride() {
            return this.nextScheduleTimeOverride;
        }

        public final Data getOutput() {
            return this.output;
        }

        public final int getPeriodCount() {
            return this.periodCount;
        }

        public final List<Data> getProgress() {
            return this.progress;
        }

        public final int getRunAttemptCount() {
            return this.runAttemptCount;
        }

        public final WorkInfo.State getState() {
            return this.state;
        }

        public final int getStopReason() {
            return this.stopReason;
        }

        public final List<String> getTags() {
            return this.tags;
        }

        public final String getWorkerClassName() {
            return this.workerClassName;
        }

        public int hashCode() {
            int iHashCode = (((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.output.hashCode();
            Constraints constraints = this.constraints;
            long j2 = this.flexDuration;
            int iM = (((((((iHashCode * 31) + WorkSpec$WorkInfoPojo$$ExternalSyntheticBackport0.m(this.initialDelay)) * 31) + WorkSpec$WorkInfoPojo$$ExternalSyntheticBackport0.m(this.intervalDuration)) * 31) + WorkSpec$WorkInfoPojo$$ExternalSyntheticBackport0.m(j2)) * 31) + constraints.hashCode();
            int iHashCode2 = (((iM * 31) + this.runAttemptCount) * 31) + this.backoffPolicy.hashCode();
            int iM2 = (((((iHashCode2 * 31) + WorkSpec$WorkInfoPojo$$ExternalSyntheticBackport0.m(this.backoffDelayDuration)) * 31) + WorkSpec$WorkInfoPojo$$ExternalSyntheticBackport0.m(this.lastEnqueueTime)) * 31) + this.periodCount;
            List<String> list = this.tags;
            return (((((((((((iM2 * 31) + this.generation) * 31) + WorkSpec$WorkInfoPojo$$ExternalSyntheticBackport0.m(this.nextScheduleTimeOverride)) * 31) + this.stopReason) * 31) + list.hashCode()) * 31) + this.workerClassName.hashCode()) * 31) + this.progress.hashCode();
        }

        public final boolean isBackedOff() {
            return this.state == WorkInfo.State.ENQUEUED && this.runAttemptCount > 0;
        }

        public final boolean isPeriodic() {
            return this.intervalDuration != 0;
        }

        public final void setBackoffDelayDuration(long j2) {
            this.backoffDelayDuration = j2;
        }

        public final void setBackoffPolicy(BackoffPolicy backoffPolicy) {
            x.f(backoffPolicy, "<set-?>");
            this.backoffPolicy = backoffPolicy;
        }

        public final void setLastEnqueueTime(long j2) {
            this.lastEnqueueTime = j2;
        }

        public final void setPeriodCount(int i2) {
            this.periodCount = i2;
        }

        public String toString() {
            return "WorkInfoPojo(id=" + this.id + ", state=" + this.state + ", output=" + this.output + ", initialDelay=" + this.initialDelay + ", intervalDuration=" + this.intervalDuration + ", flexDuration=" + this.flexDuration + ", constraints=" + this.constraints + ", runAttemptCount=" + this.runAttemptCount + ", backoffPolicy=" + this.backoffPolicy + ", backoffDelayDuration=" + this.backoffDelayDuration + ", lastEnqueueTime=" + this.lastEnqueueTime + ", periodCount=" + this.periodCount + ", generation=" + this.generation + ", nextScheduleTimeOverride=" + this.nextScheduleTimeOverride + ", stopReason=" + this.stopReason + ", tags=" + this.tags + ", workerClassName=" + this.workerClassName + ", progress=" + this.progress + ")";
        }

        public final WorkInfo toWorkInfo() {
            Data data = !this.progress.isEmpty() ? this.progress.get(0) : Data.EMPTY;
            UUID uuidFromString = UUID.fromString(this.id);
            x.e(uuidFromString, "fromString(...)");
            return new WorkInfo(uuidFromString, this.state, new HashSet(this.tags), this.output, data, this.runAttemptCount, this.generation, this.constraints, this.initialDelay, getPeriodicityOrNull(), calculateNextRunTimeMillis(), this.stopReason, this.workerClassName);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ WorkInfoPojo(String str, WorkInfo.State state, Data data, long j2, long j3, long j4, Constraints constraints, int i2, BackoffPolicy backoffPolicy, long j5, long j6, int i3, int i4, long j7, int i5, List list, String str2, List list2, int i6, o oVar) {
            BackoffPolicy backoffPolicy2 = (i6 & 256) != 0 ? BackoffPolicy.EXPONENTIAL : backoffPolicy;
            int i7 = i6 & 16;
            int i8 = i6 & 8;
            long j8 = (i6 & 32) != 0 ? 0L : j4;
            this(str, state, data, i8 != 0 ? 0L : j2, i7 != 0 ? 0L : j3, j8, constraints, i2, backoffPolicy2, (i6 & 512) != 0 ? 30000L : j5, (i6 & 1024) != 0 ? 0L : j6, (i6 & 2048) != 0 ? 0 : i3, i4, j7, i5, list, str2, list2);
        }
    }

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("WorkSpec");
        x.e(strTagWithPrefix, "tagWithPrefix(...)");
        TAG = strTagWithPrefix;
        WORK_INFO_MAPPER = new Function() { // from class: androidx.work.impl.model.WorkSpec$$ExternalSyntheticLambda2
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return WorkSpec.WORK_INFO_MAPPER$lambda$0((List) obj);
            }
        };
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WorkSpec(String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j2, long j3, long j4, Constraints constraints, int i2, BackoffPolicy backoffPolicy, long j5, long j6, long j7, long j8, boolean z, OutOfQuotaPolicy outOfQuotaPolicy, int i3, int i4, long j9, int i5, int i6, String str4, Boolean bool, int i7, o oVar) {
        String str5;
        WorkInfo.State state2 = (i7 & 2) != 0 ? WorkInfo.State.ENQUEUED : state;
        if ((i7 & 8) != 0) {
            String name = OverwritingInputMerger.class.getName();
            x.e(name, "getName(...)");
            str5 = name;
        } else {
            str5 = str3;
        }
        this(str, state2, str2, str5, (i7 & 16) != 0 ? Data.EMPTY : data, (i7 & 32) != 0 ? Data.EMPTY : data2, (i7 & 64) != 0 ? 0L : j2, (i7 & 128) != 0 ? 0L : j3, (i7 & 256) != 0 ? 0L : j4, (i7 & 512) != 0 ? Constraints.NONE : constraints, (i7 & 1024) != 0 ? 0 : i2, (i7 & 2048) != 0 ? BackoffPolicy.EXPONENTIAL : backoffPolicy, (i7 & 4096) != 0 ? WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS : j5, (i7 & 8192) != 0 ? -1L : j6, (i7 & 16384) == 0 ? j7 : 0L, (32768 & i7) != 0 ? -1L : j8, ((65536 & i7) == 0) & z, (131072 & i7) != 0 ? OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST : outOfQuotaPolicy, (262144 & i7) != 0 ? 0 : i3, (524288 & i7) != 0 ? 0 : i4, (1048576 & i7) != 0 ? Long.MAX_VALUE : j9, (2097152 & i7) != 0 ? 0 : i5, (4194304 & i7) != 0 ? -256 : i6, (8388608 & i7) != 0 ? null : str4, (i7 & 16777216) != 0 ? false : bool);
    }

    static final List WORK_INFO_MAPPER$lambda$0(List list) {
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(i.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((WorkInfoPojo) it.next()).toWorkInfo());
        }
        return arrayList;
    }

    public static /* synthetic */ WorkSpec copy$default(WorkSpec workSpec, String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j2, long j3, long j4, Constraints constraints, int i2, BackoffPolicy backoffPolicy, long j5, long j6, long j7, long j8, boolean z, OutOfQuotaPolicy outOfQuotaPolicy, int i3, int i4, long j9, int i5, int i6, String str4, Boolean bool, int i7, Object obj) {
        Boolean bool2;
        String str5;
        long j10;
        long j11;
        long j12;
        long j13;
        OutOfQuotaPolicy outOfQuotaPolicy2;
        int i8;
        int i9;
        long j14;
        int i10;
        WorkInfo.State state2;
        int i11;
        boolean z2;
        String str6;
        String str7;
        Data data3;
        Data data4;
        long j15;
        long j16;
        long j17;
        Constraints constraints2;
        int i12;
        BackoffPolicy backoffPolicy2;
        String str8 = (i7 & 1) != 0 ? workSpec.id : str;
        WorkInfo.State state3 = (i7 & 2) != 0 ? workSpec.state : state;
        String str9 = (i7 & 4) != 0 ? workSpec.workerClassName : str2;
        String str10 = (i7 & 8) != 0 ? workSpec.inputMergerClassName : str3;
        Data data5 = (i7 & 16) != 0 ? workSpec.input : data;
        Data data6 = (i7 & 32) != 0 ? workSpec.output : data2;
        long j18 = (i7 & 64) != 0 ? workSpec.initialDelay : j2;
        long j19 = (i7 & 128) != 0 ? workSpec.intervalDuration : j3;
        long j20 = (i7 & 256) != 0 ? workSpec.flexDuration : j4;
        Constraints constraints3 = (i7 & 512) != 0 ? workSpec.constraints : constraints;
        int i13 = (i7 & 1024) != 0 ? workSpec.runAttemptCount : i2;
        String str11 = str8;
        BackoffPolicy backoffPolicy3 = (i7 & 2048) != 0 ? workSpec.backoffPolicy : backoffPolicy;
        WorkInfo.State state4 = state3;
        long j21 = (i7 & 4096) != 0 ? workSpec.backoffDelayDuration : j5;
        long j22 = (i7 & 8192) != 0 ? workSpec.lastEnqueueTime : j6;
        long j23 = (i7 & 16384) != 0 ? workSpec.minimumRetentionDuration : j7;
        long j24 = (i7 & 32768) != 0 ? workSpec.scheduleRequestedAt : j8;
        boolean z3 = (i7 & 65536) != 0 ? workSpec.expedited : z;
        long j25 = j24;
        OutOfQuotaPolicy outOfQuotaPolicy3 = (i7 & 131072) != 0 ? workSpec.outOfQuotaPolicy : outOfQuotaPolicy;
        int i14 = (i7 & 262144) != 0 ? workSpec.periodCount : i3;
        OutOfQuotaPolicy outOfQuotaPolicy4 = outOfQuotaPolicy3;
        int i15 = (i7 & 524288) != 0 ? workSpec.generation : i4;
        int i16 = i14;
        long j26 = (i7 & 1048576) != 0 ? workSpec.nextScheduleTimeOverride : j9;
        int i17 = (i7 & 2097152) != 0 ? workSpec.nextScheduleTimeOverrideGeneration : i5;
        int i18 = (i7 & 4194304) != 0 ? workSpec.stopReason : i6;
        int i19 = i17;
        String str12 = (i7 & 8388608) != 0 ? workSpec.traceTag : str4;
        if ((i7 & 16777216) != 0) {
            str5 = str12;
            bool2 = workSpec.backOffOnSystemInterruptions;
            j11 = j22;
            j12 = j23;
            j13 = j25;
            outOfQuotaPolicy2 = outOfQuotaPolicy4;
            i8 = i16;
            i9 = i15;
            j14 = j26;
            i10 = i19;
            i11 = i18;
            z2 = z3;
            str7 = str10;
            data3 = data5;
            data4 = data6;
            j15 = j18;
            j16 = j19;
            j17 = j20;
            constraints2 = constraints3;
            i12 = i13;
            backoffPolicy2 = backoffPolicy3;
            j10 = j21;
            state2 = state4;
            str6 = str9;
        } else {
            bool2 = bool;
            str5 = str12;
            j10 = j21;
            j11 = j22;
            j12 = j23;
            j13 = j25;
            outOfQuotaPolicy2 = outOfQuotaPolicy4;
            i8 = i16;
            i9 = i15;
            j14 = j26;
            i10 = i19;
            state2 = state4;
            i11 = i18;
            z2 = z3;
            str6 = str9;
            str7 = str10;
            data3 = data5;
            data4 = data6;
            j15 = j18;
            j16 = j19;
            j17 = j20;
            constraints2 = constraints3;
            i12 = i13;
            backoffPolicy2 = backoffPolicy3;
        }
        return workSpec.copy(str11, state2, str6, str7, data3, data4, j15, j16, j17, constraints2, i12, backoffPolicy2, j10, j11, j12, j13, z2, outOfQuotaPolicy2, i8, i9, j14, i10, i11, str5, bool2);
    }

    public final long calculateNextRunTime() {
        return Companion.calculateNextRunTime(isBackedOff(), this.runAttemptCount, this.backoffPolicy, this.backoffDelayDuration, this.lastEnqueueTime, this.periodCount, isPeriodic(), this.initialDelay, this.flexDuration, this.intervalDuration, this.nextScheduleTimeOverride);
    }

    public final String component1() {
        return this.id;
    }

    public final Constraints component10() {
        return this.constraints;
    }

    public final int component11() {
        return this.runAttemptCount;
    }

    public final BackoffPolicy component12() {
        return this.backoffPolicy;
    }

    public final long component13() {
        return this.backoffDelayDuration;
    }

    public final long component14() {
        return this.lastEnqueueTime;
    }

    public final long component15() {
        return this.minimumRetentionDuration;
    }

    public final long component16() {
        return this.scheduleRequestedAt;
    }

    public final boolean component17() {
        return this.expedited;
    }

    public final OutOfQuotaPolicy component18() {
        return this.outOfQuotaPolicy;
    }

    public final int component19() {
        return this.periodCount;
    }

    public final WorkInfo.State component2() {
        return this.state;
    }

    public final int component20() {
        return this.generation;
    }

    public final long component21() {
        return this.nextScheduleTimeOverride;
    }

    public final int component22() {
        return this.nextScheduleTimeOverrideGeneration;
    }

    public final int component23() {
        return this.stopReason;
    }

    public final String component24() {
        return this.traceTag;
    }

    public final Boolean component25() {
        return this.backOffOnSystemInterruptions;
    }

    public final String component3() {
        return this.workerClassName;
    }

    public final String component4() {
        return this.inputMergerClassName;
    }

    public final Data component5() {
        return this.input;
    }

    public final Data component6() {
        return this.output;
    }

    public final long component7() {
        return this.initialDelay;
    }

    public final long component8() {
        return this.intervalDuration;
    }

    public final long component9() {
        return this.flexDuration;
    }

    public final WorkSpec copy(String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j2, long j3, long j4, Constraints constraints, int i2, BackoffPolicy backoffPolicy, long j5, long j6, long j7, long j8, boolean z, OutOfQuotaPolicy outOfQuotaPolicy, int i3, int i4, long j9, int i5, int i6, String str4, Boolean bool) {
        x.f(str, TtmlNode.ATTR_ID);
        x.f(state, "state");
        x.f(str2, "workerClassName");
        x.f(str3, "inputMergerClassName");
        x.f(data, "input");
        x.f(data2, "output");
        x.f(constraints, CarContext.CONSTRAINT_SERVICE);
        x.f(backoffPolicy, "backoffPolicy");
        x.f(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new WorkSpec(str, state, str2, str3, data, data2, j2, j3, j4, constraints, i2, backoffPolicy, j5, j6, j7, j8, z, outOfQuotaPolicy, i3, i4, j9, i5, i6, str4, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkSpec)) {
            return false;
        }
        WorkSpec workSpec = (WorkSpec) obj;
        return x.n(this.id, workSpec.id) && this.state == workSpec.state && x.n(this.workerClassName, workSpec.workerClassName) && x.n(this.inputMergerClassName, workSpec.inputMergerClassName) && x.n(this.input, workSpec.input) && x.n(this.output, workSpec.output) && this.initialDelay == workSpec.initialDelay && this.intervalDuration == workSpec.intervalDuration && this.flexDuration == workSpec.flexDuration && x.n(this.constraints, workSpec.constraints) && this.runAttemptCount == workSpec.runAttemptCount && this.backoffPolicy == workSpec.backoffPolicy && this.backoffDelayDuration == workSpec.backoffDelayDuration && this.lastEnqueueTime == workSpec.lastEnqueueTime && this.minimumRetentionDuration == workSpec.minimumRetentionDuration && this.scheduleRequestedAt == workSpec.scheduleRequestedAt && this.expedited == workSpec.expedited && this.outOfQuotaPolicy == workSpec.outOfQuotaPolicy && this.periodCount == workSpec.periodCount && this.generation == workSpec.generation && this.nextScheduleTimeOverride == workSpec.nextScheduleTimeOverride && this.nextScheduleTimeOverrideGeneration == workSpec.nextScheduleTimeOverrideGeneration && this.stopReason == workSpec.stopReason && x.n(this.traceTag, workSpec.traceTag) && x.n(this.backOffOnSystemInterruptions, workSpec.backOffOnSystemInterruptions);
    }

    public final Boolean getBackOffOnSystemInterruptions() {
        return this.backOffOnSystemInterruptions;
    }

    public final int getGeneration() {
        return this.generation;
    }

    public final long getNextScheduleTimeOverride() {
        return this.nextScheduleTimeOverride;
    }

    public final int getNextScheduleTimeOverrideGeneration() {
        return this.nextScheduleTimeOverrideGeneration;
    }

    public final int getPeriodCount() {
        return this.periodCount;
    }

    public final int getStopReason() {
        return this.stopReason;
    }

    public final String getTraceTag() {
        return this.traceTag;
    }

    public final boolean hasConstraints() {
        return !x.n(Constraints.NONE, this.constraints);
    }

    public int hashCode() {
        int iHashCode = (((((((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.workerClassName.hashCode()) * 31) + this.inputMergerClassName.hashCode()) * 31) + this.input.hashCode()) * 31) + this.output.hashCode();
        int iM = WorkSpec$$ExternalSyntheticBackport0.m(this.initialDelay);
        int iM2 = (((((((((((iHashCode * 31) + iM) * 31) + WorkSpec$$ExternalSyntheticBackport0.m(this.intervalDuration)) * 31) + WorkSpec$$ExternalSyntheticBackport0.m(this.flexDuration)) * 31) + this.constraints.hashCode()) * 31) + this.runAttemptCount) * 31) + this.backoffPolicy.hashCode();
        int iM3 = WorkSpec$$ExternalSyntheticBackport0.m(this.backoffDelayDuration);
        int iM4 = WorkSpec$$ExternalSyntheticBackport0.m(this.lastEnqueueTime);
        int iM5 = WorkSpec$$ExternalSyntheticBackport0.m(this.minimumRetentionDuration);
        int iM6 = (((((((((((((((((((iM2 * 31) + iM3) * 31) + iM4) * 31) + iM5) * 31) + WorkSpec$$ExternalSyntheticBackport0.m(this.scheduleRequestedAt)) * 31) + WorkSpec$$ExternalSyntheticBackport1.m(this.expedited)) * 31) + this.outOfQuotaPolicy.hashCode()) * 31) + this.periodCount) * 31) + this.generation) * 31) + WorkSpec$$ExternalSyntheticBackport0.m(this.nextScheduleTimeOverride)) * 31) + this.nextScheduleTimeOverrideGeneration;
        String str = this.traceTag;
        int iHashCode2 = ((((iM6 * 31) + this.stopReason) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.backOffOnSystemInterruptions;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final boolean isBackedOff() {
        return this.state == WorkInfo.State.ENQUEUED && this.runAttemptCount > 0;
    }

    public final boolean isPeriodic() {
        return this.intervalDuration != 0;
    }

    public final void setBackOffOnSystemInterruptions(Boolean bool) {
        this.backOffOnSystemInterruptions = bool;
    }

    public final void setBackoffDelayDuration(long j2) {
        if (j2 > WorkRequest.MAX_BACKOFF_MILLIS) {
            Logger.get().warning(TAG, "Backoff delay duration exceeds maximum value");
        }
        if (j2 < 10000) {
            Logger.get().warning(TAG, "Backoff delay duration less than minimum value");
        }
        this.backoffDelayDuration = n.n(j2, 10000L, WorkRequest.MAX_BACKOFF_MILLIS);
    }

    public final void setNextScheduleTimeOverride(long j2) {
        this.nextScheduleTimeOverride = j2;
    }

    public final void setNextScheduleTimeOverrideGeneration(int i2) {
        this.nextScheduleTimeOverrideGeneration = i2;
    }

    public final void setPeriodCount(int i2) {
        this.periodCount = i2;
    }

    public final void setPeriodic(long j2, long j3) {
        if (j2 < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            Logger.get().warning(TAG, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.intervalDuration = n.k(j2, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS);
        if (j3 < 300000) {
            Logger.get().warning(TAG, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j3 > this.intervalDuration) {
            Logger.get().warning(TAG, "Flex duration greater than interval duration; Changed to " + j2);
        }
        this.flexDuration = n.n(j3, 300000L, this.intervalDuration);
    }

    public final void setTraceTag(String str) {
        this.traceTag = str;
    }

    public String toString() {
        return "{WorkSpec: " + this.id + "}";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final long calculateNextRunTime(boolean z, int i2, BackoffPolicy backoffPolicy, long j2, long j3, int i3, boolean z2, long j4, long j5, long j6, long j7) {
            long j8;
            int i4;
            x.f(backoffPolicy, "backoffPolicy");
            if (j7 != Long.MAX_VALUE && z2) {
                return i3 == 0 ? j7 : n.k(j7, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS + j3);
            }
            if (z) {
                return n.l(backoffPolicy == BackoffPolicy.LINEAR ? j2 * i2 : (long) Math.scalb(j2, i2 - 1), WorkRequest.MAX_BACKOFF_MILLIS) + j3;
            }
            if (!z2) {
                if (j3 == -1) {
                    return Long.MAX_VALUE;
                }
                return j3 + j4;
            }
            if (i3 == 0) {
                j8 = j3 + j4;
                i4 = 0;
            } else {
                j8 = j3 + j6;
                i4 = i3;
            }
            return (j5 == j6 || i4 != 0) ? j8 : j8 + (j6 - j5);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public WorkSpec(String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j2, long j3, long j4, Constraints constraints, int i2, BackoffPolicy backoffPolicy, long j5, long j6, long j7, long j8, boolean z, OutOfQuotaPolicy outOfQuotaPolicy, int i3, int i4, long j9, int i5, int i6, String str4, Boolean bool) {
        x.f(str, TtmlNode.ATTR_ID);
        x.f(state, "state");
        x.f(str2, "workerClassName");
        x.f(str3, "inputMergerClassName");
        x.f(data, "input");
        x.f(data2, "output");
        x.f(constraints, CarContext.CONSTRAINT_SERVICE);
        x.f(backoffPolicy, "backoffPolicy");
        x.f(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.id = str;
        this.state = state;
        this.workerClassName = str2;
        this.inputMergerClassName = str3;
        this.input = data;
        this.output = data2;
        this.initialDelay = j2;
        this.intervalDuration = j3;
        this.flexDuration = j4;
        this.constraints = constraints;
        this.runAttemptCount = i2;
        this.backoffPolicy = backoffPolicy;
        this.backoffDelayDuration = j5;
        this.lastEnqueueTime = j6;
        this.minimumRetentionDuration = j7;
        this.scheduleRequestedAt = j8;
        this.expedited = z;
        this.outOfQuotaPolicy = outOfQuotaPolicy;
        this.periodCount = i3;
        this.generation = i4;
        this.nextScheduleTimeOverride = j9;
        this.nextScheduleTimeOverrideGeneration = i5;
        this.stopReason = i6;
        this.traceTag = str4;
        this.backOffOnSystemInterruptions = bool;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkSpec(String str, WorkSpec workSpec) {
        this(str, workSpec.state, workSpec.workerClassName, workSpec.inputMergerClassName, new Data(workSpec.input), new Data(workSpec.output), workSpec.initialDelay, workSpec.intervalDuration, workSpec.flexDuration, new Constraints(workSpec.constraints), workSpec.runAttemptCount, workSpec.backoffPolicy, workSpec.backoffDelayDuration, workSpec.lastEnqueueTime, workSpec.minimumRetentionDuration, workSpec.scheduleRequestedAt, workSpec.expedited, workSpec.outOfQuotaPolicy, workSpec.periodCount, 0, workSpec.nextScheduleTimeOverride, workSpec.nextScheduleTimeOverrideGeneration, workSpec.stopReason, workSpec.traceTag, workSpec.backOffOnSystemInterruptions, 524288, null);
        x.f(str, "newId");
        x.f(workSpec, "other");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkSpec(String str, String str2) {
        this(str, null, str2, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, null, 33554426, null);
        x.f(str, TtmlNode.ATTR_ID);
        x.f(str2, "workerClassName_");
    }

    public final void setPeriodic(long j2) {
        if (j2 < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            Logger.get().warning(TAG, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        setPeriodic(n.k(j2, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS), n.k(j2, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS));
    }
}
