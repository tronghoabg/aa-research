package androidx.work;

import androidx.car.app.CarContext;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.d.a;
import h.d.b;
import h.g.b.o;
import h.g.b.x;
import java.util.Set;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WorkInfo {
    public static final Companion Companion = new Companion(null);
    public static final int STOP_REASON_APP_STANDBY = 12;
    public static final int STOP_REASON_BACKGROUND_RESTRICTION = 11;
    public static final int STOP_REASON_CANCELLED_BY_APP = 1;
    public static final int STOP_REASON_CONSTRAINT_BATTERY_NOT_LOW = 5;
    public static final int STOP_REASON_CONSTRAINT_CHARGING = 6;
    public static final int STOP_REASON_CONSTRAINT_CONNECTIVITY = 7;
    public static final int STOP_REASON_CONSTRAINT_DEVICE_IDLE = 8;
    public static final int STOP_REASON_CONSTRAINT_STORAGE_NOT_LOW = 9;
    public static final int STOP_REASON_DEVICE_STATE = 4;
    public static final int STOP_REASON_ESTIMATED_APP_LAUNCH_TIME_CHANGED = 15;
    public static final int STOP_REASON_FOREGROUND_SERVICE_TIMEOUT = -128;
    public static final int STOP_REASON_NOT_STOPPED = -256;
    public static final int STOP_REASON_PREEMPT = 2;
    public static final int STOP_REASON_QUOTA = 10;
    public static final int STOP_REASON_SYSTEM_PROCESSING = 14;
    public static final int STOP_REASON_TIMEOUT = 3;
    public static final int STOP_REASON_UNKNOWN = -512;
    public static final int STOP_REASON_USER = 13;
    private final Constraints constraints;
    private final int generation;
    private final UUID id;
    private final long initialDelayMillis;
    private final long nextScheduleTimeMillis;
    private final Data outputData;
    private final PeriodicityInfo periodicityInfo;
    private final Data progress;
    private final int runAttemptCount;
    private final State state;
    private final int stopReason;
    private final Set<String> tags;
    private final String workerClassName;

    /* compiled from: WazeSource */
    public final class PeriodicityInfo {
        private final long flexIntervalMillis;
        private final long repeatIntervalMillis;

        public PeriodicityInfo(long j2, long j3) {
            this.repeatIntervalMillis = j2;
            this.flexIntervalMillis = j3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && x.n(getClass(), obj.getClass())) {
                PeriodicityInfo periodicityInfo = (PeriodicityInfo) obj;
                if (periodicityInfo.repeatIntervalMillis == this.repeatIntervalMillis && periodicityInfo.flexIntervalMillis == this.flexIntervalMillis) {
                    return true;
                }
            }
            return false;
        }

        public final long getFlexIntervalMillis() {
            return this.flexIntervalMillis;
        }

        public final long getRepeatIntervalMillis() {
            return this.repeatIntervalMillis;
        }

        public int hashCode() {
            return (WorkInfo$PeriodicityInfo$$ExternalSyntheticBackport0.m(this.repeatIntervalMillis) * 31) + WorkInfo$PeriodicityInfo$$ExternalSyntheticBackport0.m(this.flexIntervalMillis);
        }

        public String toString() {
            return "PeriodicityInfo{repeatIntervalMillis=" + this.repeatIntervalMillis + ", flexIntervalMillis=" + this.flexIntervalMillis + "}";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WazeSource */
    public final class State {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ENQUEUED = new State("ENQUEUED", 0);
        public static final State RUNNING = new State("RUNNING", 1);
        public static final State SUCCEEDED = new State("SUCCEEDED", 2);
        public static final State FAILED = new State("FAILED", 3);
        public static final State BLOCKED = new State("BLOCKED", 4);
        public static final State CANCELLED = new State("CANCELLED", 5);

        private static final /* synthetic */ State[] $values() {
            return new State[]{ENQUEUED, RUNNING, SUCCEEDED, FAILED, BLOCKED, CANCELLED};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = b.a(stateArr$values);
        }

        private State(String str, int i2) {
        }

        public static a<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }

        public final boolean isFinished() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ WorkInfo(java.util.UUID r19, androidx.work.WorkInfo.State r20, java.util.Set r21, androidx.work.Data r22, androidx.work.Data r23, int r24, int r25, androidx.work.Constraints r26, long r27, androidx.work.WorkInfo.PeriodicityInfo r29, long r30, int r32, java.lang.String r33, int r34, h.g.b.o r35) {
        /*
            r18 = this;
            r0 = r34
            r1 = r0 & 8
            if (r1 == 0) goto La
            androidx.work.Data r1 = androidx.work.Data.EMPTY
            r6 = r1
            goto Lc
        La:
            r6 = r22
        Lc:
            r1 = r0 & 16
            if (r1 == 0) goto L14
            androidx.work.Data r1 = androidx.work.Data.EMPTY
            r7 = r1
            goto L16
        L14:
            r7 = r23
        L16:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L1d
            r8 = r2
            goto L1f
        L1d:
            r8 = r24
        L1f:
            r1 = r0 & 64
            if (r1 == 0) goto L25
            r9 = r2
            goto L27
        L25:
            r9 = r25
        L27:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L2f
            androidx.work.Constraints r1 = androidx.work.Constraints.NONE
            r10 = r1
            goto L31
        L2f:
            r10 = r26
        L31:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L39
            r1 = 0
            r11 = r1
            goto L3b
        L39:
            r11 = r27
        L3b:
            r1 = r0 & 512(0x200, float:7.17E-43)
            r2 = 0
            if (r1 == 0) goto L42
            r13 = r2
            goto L44
        L42:
            r13 = r29
        L44:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L4f
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r14 = r3
            goto L51
        L4f:
            r14 = r30
        L51:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L5a
            r1 = -256(0xffffffffffffff00, float:NaN)
            r16 = r1
            goto L5c
        L5a:
            r16 = r32
        L5c:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L6b
            r17 = r2
            r3 = r19
            r4 = r20
            r5 = r21
            r2 = r18
            goto L75
        L6b:
            r17 = r33
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
        L75:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.WorkInfo.<init>(java.util.UUID, androidx.work.WorkInfo$State, java.util.Set, androidx.work.Data, androidx.work.Data, int, int, androidx.work.Constraints, long, androidx.work.WorkInfo$PeriodicityInfo, long, int, java.lang.String, int, h.g.b.o):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !x.n(getClass(), obj.getClass())) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) obj;
        if (this.runAttemptCount == workInfo.runAttemptCount && this.generation == workInfo.generation && x.n(this.id, workInfo.id) && this.state == workInfo.state && x.n(this.outputData, workInfo.outputData) && x.n(this.constraints, workInfo.constraints) && this.initialDelayMillis == workInfo.initialDelayMillis && x.n(this.periodicityInfo, workInfo.periodicityInfo) && this.nextScheduleTimeMillis == workInfo.nextScheduleTimeMillis && this.stopReason == workInfo.stopReason && x.n(this.workerClassName, workInfo.workerClassName) && x.n(this.tags, workInfo.tags)) {
            return x.n(this.progress, workInfo.progress);
        }
        return false;
    }

    public final Constraints getConstraints() {
        return this.constraints;
    }

    public final int getGeneration() {
        return this.generation;
    }

    public final UUID getId() {
        return this.id;
    }

    public final long getInitialDelayMillis() {
        return this.initialDelayMillis;
    }

    public final long getNextScheduleTimeMillis() {
        return this.nextScheduleTimeMillis;
    }

    public final Data getOutputData() {
        return this.outputData;
    }

    public final PeriodicityInfo getPeriodicityInfo() {
        return this.periodicityInfo;
    }

    public final Data getProgress() {
        return this.progress;
    }

    public final int getRunAttemptCount() {
        return this.runAttemptCount;
    }

    public final State getState() {
        return this.state;
    }

    public final int getStopReason() {
        return this.stopReason;
    }

    public final Set<String> getTags() {
        return this.tags;
    }

    public final String getWorkerClassName() {
        return this.workerClassName;
    }

    public int hashCode() {
        int iHashCode = (((((((((((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.outputData.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.progress.hashCode()) * 31) + this.runAttemptCount) * 31) + this.generation) * 31) + this.constraints.hashCode();
        PeriodicityInfo periodicityInfo = this.periodicityInfo;
        int iM = ((((((((iHashCode * 31) + WorkInfo$$ExternalSyntheticBackport0.m(this.initialDelayMillis)) * 31) + (periodicityInfo != null ? periodicityInfo.hashCode() : 0)) * 31) + WorkInfo$$ExternalSyntheticBackport0.m(this.nextScheduleTimeMillis)) * 31) + this.stopReason) * 31;
        String str = this.workerClassName;
        return iM + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "WorkInfo{id='" + this.id + "', state=" + this.state + ", outputData=" + this.outputData + ", tags=" + this.tags + ", progress=" + this.progress + ", runAttemptCount=" + this.runAttemptCount + ", generation=" + this.generation + ", constraints=" + this.constraints + ", initialDelayMillis=" + this.initialDelayMillis + ", periodicityInfo=" + this.periodicityInfo + ", nextScheduleTimeMillis=" + this.nextScheduleTimeMillis + "}, stopReason=" + this.stopReason + ", workerClassName=" + this.workerClassName;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID uuid, State state, Set<String> set, Data data) {
        this(uuid, state, set, data, null, 0, 0, null, 0L, null, 0L, 0, null, 8176, null);
        x.f(uuid, TtmlNode.ATTR_ID);
        x.f(state, "state");
        x.f(set, "tags");
        x.f(data, "outputData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID uuid, State state, Set<String> set, Data data, Data data2) {
        this(uuid, state, set, data, data2, 0, 0, null, 0L, null, 0L, 0, null, 8160, null);
        x.f(uuid, TtmlNode.ATTR_ID);
        x.f(state, "state");
        x.f(set, "tags");
        x.f(data, "outputData");
        x.f(data2, "progress");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID uuid, State state, Set<String> set, Data data, Data data2, int i2) {
        this(uuid, state, set, data, data2, i2, 0, null, 0L, null, 0L, 0, null, 8128, null);
        x.f(uuid, TtmlNode.ATTR_ID);
        x.f(state, "state");
        x.f(set, "tags");
        x.f(data, "outputData");
        x.f(data2, "progress");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID uuid, State state, Set<String> set, Data data, Data data2, int i2, int i3) {
        this(uuid, state, set, data, data2, i2, i3, null, 0L, null, 0L, 0, null, 8064, null);
        x.f(uuid, TtmlNode.ATTR_ID);
        x.f(state, "state");
        x.f(set, "tags");
        x.f(data, "outputData");
        x.f(data2, "progress");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID uuid, State state, Set<String> set, Data data, Data data2, int i2, int i3, Constraints constraints) {
        this(uuid, state, set, data, data2, i2, i3, constraints, 0L, null, 0L, 0, null, 7936, null);
        x.f(uuid, TtmlNode.ATTR_ID);
        x.f(state, "state");
        x.f(set, "tags");
        x.f(data, "outputData");
        x.f(data2, "progress");
        x.f(constraints, CarContext.CONSTRAINT_SERVICE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID uuid, State state, Set<String> set, Data data, Data data2, int i2, int i3, Constraints constraints, long j2) {
        this(uuid, state, set, data, data2, i2, i3, constraints, j2, null, 0L, 0, null, 7680, null);
        x.f(uuid, TtmlNode.ATTR_ID);
        x.f(state, "state");
        x.f(set, "tags");
        x.f(data, "outputData");
        x.f(data2, "progress");
        x.f(constraints, CarContext.CONSTRAINT_SERVICE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID uuid, State state, Set<String> set, Data data, Data data2, int i2, int i3, Constraints constraints, long j2, PeriodicityInfo periodicityInfo) {
        this(uuid, state, set, data, data2, i2, i3, constraints, j2, periodicityInfo, 0L, 0, null, 7168, null);
        x.f(uuid, TtmlNode.ATTR_ID);
        x.f(state, "state");
        x.f(set, "tags");
        x.f(data, "outputData");
        x.f(data2, "progress");
        x.f(constraints, CarContext.CONSTRAINT_SERVICE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID uuid, State state, Set<String> set, Data data, Data data2, int i2, int i3, Constraints constraints, long j2, PeriodicityInfo periodicityInfo, long j3) {
        this(uuid, state, set, data, data2, i2, i3, constraints, j2, periodicityInfo, j3, 0, null, 6144, null);
        x.f(uuid, TtmlNode.ATTR_ID);
        x.f(state, "state");
        x.f(set, "tags");
        x.f(data, "outputData");
        x.f(data2, "progress");
        x.f(constraints, CarContext.CONSTRAINT_SERVICE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID uuid, State state, Set<String> set, Data data, Data data2, int i2, int i3, Constraints constraints, long j2, PeriodicityInfo periodicityInfo, long j3, int i4) {
        this(uuid, state, set, data, data2, i2, i3, constraints, j2, periodicityInfo, j3, i4, null, 4096, null);
        x.f(uuid, TtmlNode.ATTR_ID);
        x.f(state, "state");
        x.f(set, "tags");
        x.f(data, "outputData");
        x.f(data2, "progress");
        x.f(constraints, CarContext.CONSTRAINT_SERVICE);
    }

    public WorkInfo(UUID uuid, State state, Set<String> set, Data data, Data data2, int i2, int i3, Constraints constraints, long j2, PeriodicityInfo periodicityInfo, long j3, int i4, String str) {
        x.f(uuid, TtmlNode.ATTR_ID);
        x.f(state, "state");
        x.f(set, "tags");
        x.f(data, "outputData");
        x.f(data2, "progress");
        x.f(constraints, CarContext.CONSTRAINT_SERVICE);
        this.id = uuid;
        this.state = state;
        this.tags = set;
        this.outputData = data;
        this.progress = data2;
        this.runAttemptCount = i2;
        this.generation = i3;
        this.constraints = constraints;
        this.initialDelayMillis = j2;
        this.periodicityInfo = periodicityInfo;
        this.nextScheduleTimeMillis = j3;
        this.stopReason = i4;
        this.workerClassName = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID uuid, State state, Set<String> set) {
        this(uuid, state, set, null, null, 0, 0, null, 0L, null, 0L, 0, null, 8184, null);
        x.f(uuid, TtmlNode.ATTR_ID);
        x.f(state, "state");
        x.f(set, "tags");
    }
}
