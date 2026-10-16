package j$.time.temporal;

import j$.time.Duration;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public enum g implements TemporalUnit {
    WEEK_BASED_YEARS("WeekBasedYears", Duration.ofSeconds(31556952)),
    QUARTER_YEARS("QuarterYears", Duration.ofSeconds(7889238));


    /* renamed from: a, reason: collision with root package name */
    public final String f50052a;

    /* renamed from: b, reason: collision with root package name */
    public final Duration f50053b;

    g(String str, Duration duration) {
        this.f50052a = str;
        this.f50053b = duration;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final long between(Temporal temporal, Temporal temporal2) {
        if (temporal.getClass() != temporal2.getClass()) {
            return temporal.until(temporal2, this);
        }
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            f fVar = h.f50056c;
            return j$.com.android.tools.r8.a.R(temporal2.D(fVar), temporal.D(fVar));
        }
        if (iOrdinal == 1) {
            return temporal.until(temporal2, ChronoUnit.MONTHS) / 3;
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Temporal f(Temporal temporal, long j2) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return temporal.a(j$.com.android.tools.r8.a.P(temporal.f(r4), j2), h.f50056c);
        }
        if (iOrdinal == 1) {
            return temporal.b(j2 / 4, ChronoUnit.YEARS).b((j2 % 4) * 3, ChronoUnit.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Duration getDuration() {
        return this.f50053b;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f50052a;
    }
}
