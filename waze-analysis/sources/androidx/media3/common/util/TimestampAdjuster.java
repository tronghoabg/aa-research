package androidx.media3.common.util;

import androidx.media3.common.C;
import com.google.d.b.an;
import java.util.concurrent.TimeoutException;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class TimestampAdjuster {
    private static final long MAX_PTS_PLUS_ONE = 8589934592L;
    public static final long MODE_NO_OFFSET = Long.MAX_VALUE;
    public static final long MODE_SHARED = 9223372036854775806L;
    private long firstSampleTimestampUs;
    private long lastUnadjustedTimestampUs;
    private final ThreadLocal<Long> nextSampleTimestampUs = new ThreadLocal<>();
    private long timestampOffsetUs;

    public TimestampAdjuster(long j2) {
        reset(j2);
    }

    public static long ptsToUs(long j2) {
        return Util.scaleLargeTimestamp(j2, 1000000L, 90000L);
    }

    public static long usToNonWrappedPts(long j2) {
        return Util.scaleLargeTimestamp(j2, 90000L, 1000000L);
    }

    public static long usToWrappedPts(long j2) {
        return usToNonWrappedPts(j2) % MAX_PTS_PLUS_ONE;
    }

    public synchronized long adjustSampleTimestamp(long j2) {
        if (j2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        if (!isInitialized()) {
            long jLongValue = this.firstSampleTimestampUs;
            if (jLongValue == MODE_SHARED) {
                Long l2 = this.nextSampleTimestampUs.get();
                an.B(l2);
                jLongValue = l2.longValue();
            }
            this.timestampOffsetUs = jLongValue - j2;
            notifyAll();
        }
        this.lastUnadjustedTimestampUs = j2;
        return j2 + this.timestampOffsetUs;
    }

    public synchronized long adjustTsTimestamp(long j2) {
        if (j2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long j3 = this.lastUnadjustedTimestampUs;
        if (j3 != C.TIME_UNSET) {
            long jUsToNonWrappedPts = usToNonWrappedPts(j3);
            long j4 = (4294967296L + jUsToNonWrappedPts) / MAX_PTS_PLUS_ONE;
            long j5 = (((-1) + j4) * MAX_PTS_PLUS_ONE) + j2;
            j2 += j4 * MAX_PTS_PLUS_ONE;
            if (Math.abs(j5 - jUsToNonWrappedPts) < Math.abs(j2 - jUsToNonWrappedPts)) {
                j2 = j5;
            }
        }
        return adjustSampleTimestamp(ptsToUs(j2));
    }

    public synchronized long adjustTsTimestampGreaterThanPreviousTimestamp(long j2) {
        if (j2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long j3 = this.lastUnadjustedTimestampUs;
        if (j3 != C.TIME_UNSET) {
            long jUsToNonWrappedPts = usToNonWrappedPts(j3);
            long j4 = jUsToNonWrappedPts / MAX_PTS_PLUS_ONE;
            Long.signum(j4);
            long j5 = (j4 * MAX_PTS_PLUS_ONE) + j2;
            j2 += (j4 + 1) * MAX_PTS_PLUS_ONE;
            if (j5 >= jUsToNonWrappedPts) {
                j2 = j5;
            }
        }
        return adjustSampleTimestamp(ptsToUs(j2));
    }

    public synchronized long getFirstSampleTimestampUs() {
        long j2 = this.firstSampleTimestampUs;
        return (j2 == Long.MAX_VALUE || j2 == MODE_SHARED) ? C.TIME_UNSET : j2;
    }

    public synchronized long getLastAdjustedTimestampUs() {
        long j2;
        j2 = this.lastUnadjustedTimestampUs;
        return j2 != C.TIME_UNSET ? j2 + this.timestampOffsetUs : getFirstSampleTimestampUs();
    }

    public synchronized long getTimestampOffsetUs() {
        return this.timestampOffsetUs;
    }

    public synchronized boolean isInitialized() {
        return this.timestampOffsetUs != C.TIME_UNSET;
    }

    public synchronized void reset(long j2) {
        this.firstSampleTimestampUs = j2;
        this.timestampOffsetUs = j2 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.lastUnadjustedTimestampUs = C.TIME_UNSET;
    }

    public synchronized void sharedInitializeOrWait(boolean z, long j2, long j3) {
        an.u(this.firstSampleTimestampUs == MODE_SHARED);
        if (!isInitialized()) {
            if (z) {
                this.nextSampleTimestampUs.set(Long.valueOf(j2));
                return;
            }
            long jElapsedRealtime = 0;
            long j4 = j3;
            while (!isInitialized()) {
                if (j3 == 0) {
                    wait();
                } else {
                    an.u(j4 > 0);
                    long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                    wait(j4);
                    jElapsedRealtime += android.os.SystemClock.elapsedRealtime() - jElapsedRealtime2;
                    if (jElapsedRealtime >= j3 && !isInitialized()) {
                        throw new TimeoutException("TimestampAdjuster failed to initialize in " + j3 + " milliseconds");
                    }
                    j4 = j3 - jElapsedRealtime;
                }
            }
        }
    }
}
