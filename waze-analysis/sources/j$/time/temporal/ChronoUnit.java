package j$.time.temporal;

import j$.time.Duration;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public enum ChronoUnit implements TemporalUnit {
    NANOS("Nanos", Duration.k(1)),
    MICROS("Micros", Duration.k(1000)),
    MILLIS("Millis", Duration.k(1000000)),
    SECONDS("Seconds", Duration.ofSeconds(1)),
    MINUTES("Minutes", Duration.ofSeconds(60)),
    HOURS("Hours", Duration.ofSeconds(3600)),
    HALF_DAYS("HalfDays", Duration.ofSeconds(43200)),
    DAYS("Days", Duration.ofSeconds(86400)),
    WEEKS("Weeks", Duration.ofSeconds(604800)),
    MONTHS("Months", Duration.ofSeconds(2629746)),
    YEARS("Years", Duration.ofSeconds(31556952)),
    DECADES("Decades", Duration.ofSeconds(315569520)),
    CENTURIES("Centuries", Duration.ofSeconds(3155695200L)),
    MILLENNIA("Millennia", Duration.ofSeconds(31556952000L)),
    ERAS("Eras", Duration.ofSeconds(31556952000000000L)),
    FOREVER("Forever", Duration.ofSeconds(Long.MAX_VALUE, 999999999));


    /* renamed from: a, reason: collision with root package name */
    public final String f50036a;

    /* renamed from: b, reason: collision with root package name */
    public final Duration f50037b;

    ChronoUnit(String str, Duration duration) {
        this.f50036a = str;
        this.f50037b = duration;
    }

    @Override // j$.time.temporal.TemporalUnit
    public long between(Temporal temporal, Temporal temporal2) {
        return temporal.until(temporal2, this);
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Temporal f(Temporal temporal, long j2) {
        return temporal.b(j2, this);
    }

    @Override // j$.time.temporal.TemporalUnit
    public Duration getDuration() {
        return this.f50037b;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f50036a;
    }
}
