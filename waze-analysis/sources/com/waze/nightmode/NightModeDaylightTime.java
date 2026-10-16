package com.waze.nightmode;

import androidx.compose.material3.internal.CalendarModelKt;
import j$.util.DesugarTimeZone;
import java.io.Serializable;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NightModeDaylightTime implements Serializable {
    public static final int $stable = 0;
    private static final long msInDay;
    private final long sunriseMs;
    private final long sunsetMs;
    private final long timestampMs;
    public static final e Companion = new e();
    private static final TimeZone utcTimeZone = DesugarTimeZone.getTimeZone("UTC");

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        msInDay = CalendarModelKt.MillisecondsIn24Hours;
    }

    public NightModeDaylightTime(long j2, long j3, long j4) {
        this.timestampMs = j2;
        this.sunriseMs = j3;
        this.sunsetMs = j4;
    }

    public static /* synthetic */ NightModeDaylightTime copy$default(NightModeDaylightTime nightModeDaylightTime, long j2, long j3, long j4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = nightModeDaylightTime.timestampMs;
        }
        long j5 = j2;
        if ((i2 & 2) != 0) {
            j3 = nightModeDaylightTime.sunriseMs;
        }
        long j6 = j3;
        if ((i2 & 4) != 0) {
            j4 = nightModeDaylightTime.sunsetMs;
        }
        return nightModeDaylightTime.copy(j5, j6, j4);
    }

    public static final NightModeDaylightTime create(long j2, double d2, double d3) {
        return e.c(j2, d2, d3);
    }

    public final long component1() {
        return this.timestampMs;
    }

    public final long component2() {
        return this.sunriseMs;
    }

    public final long component3() {
        return this.sunsetMs;
    }

    public final NightModeDaylightTime copy(long j2, long j3, long j4) {
        return new NightModeDaylightTime(j2, j3, j4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NightModeDaylightTime)) {
            return false;
        }
        NightModeDaylightTime nightModeDaylightTime = (NightModeDaylightTime) obj;
        return this.timestampMs == nightModeDaylightTime.timestampMs && this.sunriseMs == nightModeDaylightTime.sunriseMs && this.sunsetMs == nightModeDaylightTime.sunsetMs;
    }

    public final long getSunriseMs() {
        return this.sunriseMs;
    }

    public final long getSunsetMs() {
        return this.sunsetMs;
    }

    public final long getTimestampMs() {
        return this.timestampMs;
    }

    public int hashCode() {
        return (((a.a.b(this.timestampMs) * 31) + a.a.b(this.sunriseMs)) * 31) + a.a.b(this.sunsetMs);
    }

    public final boolean isDaytime(long j2) {
        long j3 = this.sunriseMs;
        long j4 = this.sunsetMs;
        long jA = e.a(j2);
        return j3 < j4 ? jA < j4 && j3 <= jA : jA >= j3 || j4 > jA;
    }

    public final long timeToNextEventMs(long j2) {
        long j3 = this.sunriseMs;
        long jA = e.a(j2);
        return Math.min(e.b(j3, jA), e.b(this.sunsetMs, jA));
    }

    public String toString() {
        return "NightModeDaylightTime(timestampMs=" + this.timestampMs + ", sunriseMs=" + this.sunriseMs + ", sunsetMs=" + this.sunsetMs + ")";
    }
}
