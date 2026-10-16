package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes2.dex */
public enum ChronoUnit implements TemporalUnit {
    NANOS("Nanos", Duration.t(1)),
    MICROS("Micros", Duration.t(1000)),
    MILLIS("Millis", Duration.t(1000000)),
    SECONDS("Seconds", Duration.w(1)),
    MINUTES("Minutes", Duration.w(60)),
    HOURS("Hours", Duration.w(3600)),
    HALF_DAYS("HalfDays", Duration.w(43200)),
    DAYS("Days", Duration.w(86400)),
    WEEKS("Weeks", Duration.w(604800)),
    MONTHS("Months", Duration.w(2629746)),
    YEARS("Years", Duration.w(31556952)),
    DECADES("Decades", Duration.w(315569520)),
    CENTURIES("Centuries", Duration.w(3155695200L)),
    MILLENNIA("Millennia", Duration.w(31556952000L)),
    ERAS("Eras", Duration.w(31556952000000000L)),
    FOREVER("Forever", Duration.B(Long.MAX_VALUE, 999999999));


    /* renamed from: a, reason: collision with root package name */
    private final String f37665a;

    /* renamed from: b, reason: collision with root package name */
    private final Duration f37666b;

    ChronoUnit(String str, Duration duration) {
        this.f37665a = str;
        this.f37666b = duration;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Duration q() {
        return this.f37666b;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Temporal o(Temporal temporal, long j8) {
        return temporal.e(j8, this);
    }

    @Override // j$.time.temporal.TemporalUnit
    public long between(Temporal temporal, Temporal temporal2) {
        return temporal.f(temporal2, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f37665a;
    }
}
