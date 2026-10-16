package j$.time.temporal;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public enum g implements j$.time.temporal.TemporalUnit {
    WEEK_BASED_YEARS("WeekBasedYears", j$.time.Duration.ofSeconds(31556952)),
    QUARTER_YEARS("QuarterYears", j$.time.Duration.ofSeconds(7889238));

    public final java.lang.String a;
    public final j$.time.Duration b;

    g(java.lang.String str, j$.time.Duration duration) {
        this.a = str;
        this.b = duration;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final j$.time.Duration getDuration() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final long h(j$.time.temporal.Temporal temporal, j$.time.temporal.Temporal temporal2) {
        if (temporal.getClass() != temporal2.getClass()) {
            return temporal.e(temporal2, this);
        }
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            j$.time.temporal.f fVar = j$.time.temporal.h.c;
            return j$.desugar.sun.nio.fs.g.I(temporal2.C(fVar), temporal.C(fVar));
        }
        if (iOrdinal == 1) {
            return temporal.e(temporal2, j$.time.temporal.ChronoUnit.MONTHS) / 3;
        }
        throw new java.lang.IllegalStateException("Unreachable");
    }

    @Override // j$.time.temporal.TemporalUnit
    public final boolean isDurationEstimated() {
        return true;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final j$.time.temporal.Temporal k(j$.time.temporal.Temporal temporal, long j) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            j$.time.temporal.f fVar = j$.time.temporal.h.c;
            return temporal.a(j$.desugar.sun.nio.fs.g.G(temporal.h(fVar), j), fVar);
        }
        if (iOrdinal == 1) {
            return temporal.b(j / 4, j$.time.temporal.ChronoUnit.YEARS).b((j % 4) * 3, j$.time.temporal.ChronoUnit.MONTHS);
        }
        throw new java.lang.IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.a;
    }
}
