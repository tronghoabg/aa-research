package j$.time.temporal;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public enum ChronoUnit implements j$.time.temporal.TemporalUnit {
    NANOS("Nanos", j$.time.Duration.ofNanos(1)),
    MICROS("Micros", j$.time.Duration.ofNanos(1000)),
    MILLIS("Millis", j$.time.Duration.ofNanos(1000000)),
    SECONDS("Seconds", j$.time.Duration.ofSeconds(1)),
    MINUTES("Minutes", j$.time.Duration.ofSeconds(60)),
    HOURS("Hours", j$.time.Duration.ofSeconds(3600)),
    HALF_DAYS("HalfDays", j$.time.Duration.ofSeconds(43200)),
    DAYS("Days", j$.time.Duration.ofSeconds(86400)),
    WEEKS("Weeks", j$.time.Duration.ofSeconds(604800)),
    MONTHS("Months", j$.time.Duration.ofSeconds(2629746)),
    YEARS("Years", j$.time.Duration.ofSeconds(31556952)),
    DECADES("Decades", j$.time.Duration.ofSeconds(315569520)),
    CENTURIES("Centuries", j$.time.Duration.ofSeconds(3155695200L)),
    MILLENNIA("Millennia", j$.time.Duration.ofSeconds(31556952000L)),
    ERAS("Eras", j$.time.Duration.ofSeconds(31556952000000000L)),
    FOREVER("Forever", j$.time.Duration.ofSeconds(Long.MAX_VALUE, 999999999));

    public final java.lang.String a;
    public final j$.time.Duration b;

    ChronoUnit(java.lang.String str, j$.time.Duration duration) {
        this.a = str;
        this.b = duration;
    }

    @Override // j$.time.temporal.TemporalUnit
    public j$.time.Duration getDuration() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final long h(j$.time.temporal.Temporal temporal, j$.time.temporal.Temporal temporal2) {
        return temporal.e(temporal2, this);
    }

    @Override // j$.time.temporal.TemporalUnit
    public final boolean isDurationEstimated() {
        return compareTo(DAYS) >= 0;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final j$.time.temporal.Temporal k(j$.time.temporal.Temporal temporal, long j) {
        return temporal.b(j, this);
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.a;
    }
}
