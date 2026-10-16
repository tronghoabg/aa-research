package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public final class TimerSpan extends CarSpan {
    private static final long TWENTY_YEARS_IN_MS;
    private final long mElapsedRealtimeMillis;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TWENTY_YEARS_IN_MS = 630720000000L;
    }

    private TimerSpan() {
        this.mElapsedRealtimeMillis = 0L;
    }

    public static TimerSpan create(long j2) {
        long j3 = TWENTY_YEARS_IN_MS;
        if (j2 <= j3) {
            return new TimerSpan(j2);
        }
        throw new IllegalArgumentException("The given start time [" + j2 + "] cannot be larger than " + j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TimerSpan) && this.mElapsedRealtimeMillis == ((TimerSpan) obj).mElapsedRealtimeMillis;
    }

    public long getElapsedRealtimeMillis() {
        return this.mElapsedRealtimeMillis;
    }

    public int hashCode() {
        return TimerSpan$$ExternalSyntheticBackport0.m(this.mElapsedRealtimeMillis);
    }

    public String toString() {
        return "[start: " + this.mElapsedRealtimeMillis + "]";
    }

    private TimerSpan(long j2) {
        this.mElapsedRealtimeMillis = j2;
    }
}
