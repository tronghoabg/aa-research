package androidx.camera.camera2.pipe.internal;

import h.e.b;
import h.g.b.o;
import kotlinx.a.d;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class OutputMatcher {
    private static final long DEFAULT_ERROR_NS = 8333333;
    private static final long ERROR_DETECTION_FPS = 60;
    private static final long NS_PER_SECOND = 1000000000;
    private final d<Long> currentOffset;
    private final long errorDelta;
    public static final Companion Companion = new Companion(null);
    private static final OutputMatcher EXACT = new OutputMatcher(0, 0);

    public OutputMatcher(long j2, long j3) {
        this.errorDelta = j3;
        this.currentOffset = b.h(Long.valueOf(j2));
    }

    public final boolean fuzzyEqual(long j2, long j3) {
        long jLongValue = ((Number) this.currentOffset.b()).longValue();
        long j4 = (j2 - j3) + jLongValue;
        if (j4 == 0) {
            return true;
        }
        long j5 = this.errorDelta;
        if (j5 == 0 || j4 >= j5 || j4 <= (-j5)) {
            return false;
        }
        this.currentOffset.e(Long.valueOf(jLongValue), Long.valueOf(jLongValue - j4));
        return true;
    }

    public final boolean fuzzyGreaterThan(long j2, long j3) {
        return !fuzzyLessThanOrEqual(j2, j3);
    }

    public final boolean fuzzyGreaterThanOrEqual(long j2, long j3) {
        return !fuzzyLessThan(j2, j3);
    }

    public final boolean fuzzyLessThan(long j2, long j3) {
        return ((j3 - j2) - ((Number) this.currentOffset.b()).longValue()) + this.errorDelta < 0;
    }

    public final boolean fuzzyLessThanOrEqual(long j2, long j3) {
        return ((j3 - j2) - ((Number) this.currentOffset.b()).longValue()) - this.errorDelta <= 0;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public static /* synthetic */ OutputMatcher forTimestampsWithOffset$default(Companion companion, long j2, long j3, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j3 = OutputMatcher.DEFAULT_ERROR_NS;
            }
            return companion.forTimestampsWithOffset(j2, j3);
        }

        public final OutputMatcher forTimestampsWithOffset(long j2, long j3) {
            return new OutputMatcher(j2, j3);
        }

        public final OutputMatcher getEXACT() {
            return OutputMatcher.EXACT;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ OutputMatcher(long j2, long j3, int i2, o oVar) {
        this(1 == (i2 & 1) ? 0L : j2, j3);
    }
}
