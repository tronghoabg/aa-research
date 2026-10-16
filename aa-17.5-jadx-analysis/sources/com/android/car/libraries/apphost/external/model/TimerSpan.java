package com.android.car.libraries.apphost.external.model;

import androidx.car.app.model.CarSpan;
import defpackage.a;
import defpackage.rb;
import java.util.concurrent.TimeUnit;

@rb
/* loaded from: classes2.dex */
public final class TimerSpan extends CarSpan {
    private static final long TWENTY_YEARS_IN_MS;
    private final long startTimeInMs;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TWENTY_YEARS_IN_MS = 630720000000L;
    }

    private TimerSpan() {
        this.startTimeInMs = 0L;
    }

    public static TimerSpan create(long j) {
        if (j <= TWENTY_YEARS_IN_MS) {
            return new TimerSpan(j);
        }
        throw new IllegalArgumentException("Start time is too far in the future. Please use elapsedRealtime");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TimerSpan) && this.startTimeInMs == ((TimerSpan) obj).startTimeInMs;
    }

    public long getStartTimeInMs() {
        return this.startTimeInMs;
    }

    public int hashCode() {
        return a.g(this.startTimeInMs);
    }

    public String toString() {
        return "[start time: " + this.startTimeInMs + "]";
    }

    private TimerSpan(long j) {
        this.startTimeInMs = j;
    }
}
