package androidx.car.app.model;

import defpackage.a;
import defpackage.rb;
import java.util.concurrent.TimeUnit;

@rb
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

    public static TimerSpan create(long j) {
        long j2 = TWENTY_YEARS_IN_MS;
        if (j <= j2) {
            return new TimerSpan(j);
        }
        throw new IllegalArgumentException("The given start time [" + j + "] cannot be larger than " + j2);
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
        return a.g(this.mElapsedRealtimeMillis);
    }

    public String toString() {
        return "[start: " + this.mElapsedRealtimeMillis + "]";
    }

    private TimerSpan(long j) {
        this.mElapsedRealtimeMillis = j;
    }
}
