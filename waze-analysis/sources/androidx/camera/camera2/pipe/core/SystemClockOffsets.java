package androidx.camera.camera2.pipe.core;

import android.os.SystemClock;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SystemClockOffsets {
    public static final Companion Companion = new Companion(null);
    private static final int MEASUREMENT_ITERATIONS = 3;
    private static final long NS_PER_MS = 1000000;
    private static final long NS_PER_MS_X_2 = 2000000;
    private final long realtimeNsToMonotonicNs;
    private final long realtimeNsToUtcMs;

    private SystemClockOffsets(long j2, long j3) {
        this.realtimeNsToUtcMs = j2;
        this.realtimeNsToMonotonicNs = j3;
    }

    public static final SystemClockOffsets estimate() {
        return Companion.estimate();
    }

    private static final long estimateRealtimeNsToMonotonicNs() {
        return Companion.estimateRealtimeNsToMonotonicNs();
    }

    private static final long estimateRealtimeNsToUtcMs() {
        return Companion.estimateRealtimeNsToUtcMs();
    }

    public static final SystemClockOffsets fixed(long j2, long j3) {
        return Companion.fixed(j2, j3);
    }

    public static final long monotonicMsToRealtimeMs(SystemClockOffsets systemClockOffsets, long j2) {
        return Companion.monotonicMsToRealtimeMs(systemClockOffsets, j2);
    }

    public static final long monotonicMsToRealtimeNs(SystemClockOffsets systemClockOffsets, long j2) {
        return Companion.monotonicMsToRealtimeNs(systemClockOffsets, j2);
    }

    public static final long monotonicMsToUtcMs(SystemClockOffsets systemClockOffsets, long j2) {
        return Companion.monotonicMsToUtcMs(systemClockOffsets, j2);
    }

    public static final long monotonicNsToRealtimeMs(SystemClockOffsets systemClockOffsets, long j2) {
        return Companion.monotonicNsToRealtimeMs(systemClockOffsets, j2);
    }

    public static final long monotonicNsToRealtimeNs(SystemClockOffsets systemClockOffsets, long j2) {
        return Companion.monotonicNsToRealtimeNs(systemClockOffsets, j2);
    }

    public static final long monotonicNsToUtcMs(SystemClockOffsets systemClockOffsets, long j2) {
        return Companion.monotonicNsToUtcMs(systemClockOffsets, j2);
    }

    public static final long realtimeMsToMonotonicMs(SystemClockOffsets systemClockOffsets, long j2) {
        return Companion.realtimeMsToMonotonicMs(systemClockOffsets, j2);
    }

    public static final long realtimeMsToMonotonicNs(SystemClockOffsets systemClockOffsets, long j2) {
        return Companion.realtimeMsToMonotonicNs(systemClockOffsets, j2);
    }

    public static final long realtimeMsToUtcMs(SystemClockOffsets systemClockOffsets, long j2) {
        return Companion.realtimeMsToUtcMs(systemClockOffsets, j2);
    }

    public static final long realtimeNsToMonotonicMs(SystemClockOffsets systemClockOffsets, long j2) {
        return Companion.realtimeNsToMonotonicMs(systemClockOffsets, j2);
    }

    public static final long realtimeNsToMonotonicNs(SystemClockOffsets systemClockOffsets, long j2) {
        return Companion.realtimeNsToMonotonicNs(systemClockOffsets, j2);
    }

    public static final long realtimeNsToUtcMs(SystemClockOffsets systemClockOffsets, long j2) {
        return Companion.realtimeNsToUtcMs(systemClockOffsets, j2);
    }

    public final long getRealtimeNsToMonotonicNs() {
        return this.realtimeNsToMonotonicNs;
    }

    public final long getRealtimeNsToUtcMs() {
        return this.realtimeNsToUtcMs;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long estimateRealtimeNsToMonotonicNs() {
            long j2 = 0;
            long j3 = Long.MAX_VALUE;
            for (int i2 = 0; i2 < 3; i2++) {
                long jNanoTime = System.nanoTime();
                long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long jNanoTime2 = System.nanoTime();
                long j4 = jNanoTime2 - jNanoTime;
                if (j4 < j3) {
                    j2 = jElapsedRealtimeNanos - ((jNanoTime + jNanoTime2) / 2);
                    j3 = j4;
                }
            }
            return j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long estimateRealtimeNsToUtcMs() {
            long j2 = 0;
            long j3 = Long.MAX_VALUE;
            for (int i2 = 0; i2 < 3; i2++) {
                long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                long j4 = jElapsedRealtimeNanos2 - jElapsedRealtimeNanos;
                if (j4 < j3) {
                    j2 = ((jElapsedRealtimeNanos + jElapsedRealtimeNanos2) / 2000000) - jCurrentTimeMillis;
                    j3 = j4;
                }
            }
            return j2;
        }

        public final SystemClockOffsets estimate() {
            return new SystemClockOffsets(estimateRealtimeNsToUtcMs(), estimateRealtimeNsToMonotonicNs(), null);
        }

        public final SystemClockOffsets fixed(long j2, long j3) {
            return new SystemClockOffsets(j2, j3, null);
        }

        public final long monotonicMsToRealtimeMs(SystemClockOffsets systemClockOffsets, long j2) {
            x.f(systemClockOffsets, "<this>");
            return monotonicMsToRealtimeNs(systemClockOffsets, j2) / 1000000;
        }

        public final long monotonicMsToRealtimeNs(SystemClockOffsets systemClockOffsets, long j2) {
            x.f(systemClockOffsets, "<this>");
            return systemClockOffsets.getRealtimeNsToMonotonicNs() + (j2 * 1000000);
        }

        public final long monotonicMsToUtcMs(SystemClockOffsets systemClockOffsets, long j2) {
            x.f(systemClockOffsets, "<this>");
            return realtimeNsToUtcMs(systemClockOffsets, monotonicMsToRealtimeNs(systemClockOffsets, j2));
        }

        public final long monotonicNsToRealtimeMs(SystemClockOffsets systemClockOffsets, long j2) {
            x.f(systemClockOffsets, "<this>");
            return monotonicNsToRealtimeNs(systemClockOffsets, j2) / 1000000;
        }

        public final long monotonicNsToRealtimeNs(SystemClockOffsets systemClockOffsets, long j2) {
            x.f(systemClockOffsets, "<this>");
            return systemClockOffsets.getRealtimeNsToMonotonicNs() + j2;
        }

        public final long monotonicNsToUtcMs(SystemClockOffsets systemClockOffsets, long j2) {
            x.f(systemClockOffsets, "<this>");
            return realtimeNsToUtcMs(systemClockOffsets, monotonicNsToRealtimeNs(systemClockOffsets, j2));
        }

        public final long realtimeMsToMonotonicMs(SystemClockOffsets systemClockOffsets, long j2) {
            x.f(systemClockOffsets, "<this>");
            return realtimeMsToMonotonicNs(systemClockOffsets, j2) / 1000000;
        }

        public final long realtimeMsToMonotonicNs(SystemClockOffsets systemClockOffsets, long j2) {
            x.f(systemClockOffsets, "<this>");
            return (j2 * 1000000) - systemClockOffsets.getRealtimeNsToMonotonicNs();
        }

        public final long realtimeMsToUtcMs(SystemClockOffsets systemClockOffsets, long j2) {
            x.f(systemClockOffsets, "<this>");
            return j2 - systemClockOffsets.getRealtimeNsToUtcMs();
        }

        public final long realtimeNsToMonotonicMs(SystemClockOffsets systemClockOffsets, long j2) {
            x.f(systemClockOffsets, "<this>");
            return realtimeNsToMonotonicNs(systemClockOffsets, j2) / 1000000;
        }

        public final long realtimeNsToMonotonicNs(SystemClockOffsets systemClockOffsets, long j2) {
            x.f(systemClockOffsets, "<this>");
            return j2 - systemClockOffsets.getRealtimeNsToMonotonicNs();
        }

        public final long realtimeNsToUtcMs(SystemClockOffsets systemClockOffsets, long j2) {
            x.f(systemClockOffsets, "<this>");
            return (j2 / 1000000) - systemClockOffsets.getRealtimeNsToUtcMs();
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ SystemClockOffsets(long j2, long j3, o oVar) {
        this(j2, j3);
    }
}
