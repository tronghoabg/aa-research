package j$.time;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class Instant implements j$.time.temporal.Temporal, j$.time.temporal.k, java.lang.Comparable<j$.time.Instant>, java.io.Serializable {
    private static final long serialVersionUID = -665713676816604388L;
    public final long a;
    public final int b;
    public static final j$.time.Instant EPOCH = new j$.time.Instant(0, 0);
    public static final j$.time.Instant MIN = ofEpochSecond(-31557014167219200L, 0);
    public static final j$.time.Instant MAX = ofEpochSecond(31556889864403199L, 999999999);

    public Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static j$.time.Instant now() {
        return j$.time.Clock.systemUTC().instant();
    }

    public static j$.time.Instant ofEpochMilli(long j) {
        return r(j$.desugar.sun.nio.fs.g.y(j, 1000L), ((int) j$.desugar.sun.nio.fs.g.F(j, 1000L)) * 1000000);
    }

    public static j$.time.Instant ofEpochSecond(long j, long j2) {
        return r(j$.desugar.sun.nio.fs.g.G(j, j$.desugar.sun.nio.fs.g.y(j2, 1000000000L)), (int) j$.desugar.sun.nio.fs.g.F(j2, 1000000000L));
    }

    public static j$.time.Instant parse(java.lang.CharSequence charSequence) {
        return (j$.time.Instant) j$.time.format.DateTimeFormatter.g.a(charSequence, new j$.desugar.sun.nio.fs.n((byte) 1));
    }

    public static j$.time.Instant r(long j, int i) {
        if ((((long) i) | j) == 0) {
            return EPOCH;
        }
        if (j >= -31557014167219200L && j <= 31556889864403199L) {
            return new j$.time.Instant(j, i);
        }
        j$.time.g.g("Instant exceeds minimum or maximum instant");
        return null;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    public static j$.time.Instant s(j$.time.temporal.TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof j$.time.Instant) {
            return (j$.time.Instant) temporalAccessor;
        }
        j$.util.Objects.a(temporalAccessor, "temporal");
        try {
            return ofEpochSecond(temporalAccessor.C(j$.time.temporal.a.INSTANT_SECONDS), temporalAccessor.h(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (j$.time.DateTimeException e) {
            throw new j$.time.DateTimeException(j$.time.e.a("Unable to obtain Instant from TemporalAccessor: ", java.lang.String.valueOf(temporalAccessor), " of type ", temporalAccessor.getClass().getName()), e);
        }
    }

    private java.lang.Object writeReplace() {
        return new j$.time.q((byte) 2, this);
    }

    public final j$.time.Instant A(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(j$.desugar.sun.nio.fs.g.G(j$.desugar.sun.nio.fs.g.G(this.a, j), j2 / 1000000000), ((long) this.b) + (j2 % 1000000000));
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final j$.time.Instant b(long j, j$.time.temporal.TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof j$.time.temporal.ChronoUnit)) {
            return (j$.time.Instant) temporalUnit.k(this, j);
        }
        switch (j$.time.d.b[((j$.time.temporal.ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return A(0L, j);
            case 2:
                return A(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return plusMillis(j);
            case 4:
                return A(j, 0L);
            case 5:
                return A(j$.desugar.sun.nio.fs.g.H(j, 60L), 0L);
            case 6:
                return A(j$.desugar.sun.nio.fs.g.H(j, 3600L), 0L);
            case 7:
                return A(j$.desugar.sun.nio.fs.g.H(j, 43200L), 0L);
            case 8:
                return A(j$.desugar.sun.nio.fs.g.H(j, 86400L), 0L);
            default:
                j$.time.g.e("Unsupported unit: ".concat(java.lang.String.valueOf(temporalUnit)));
                return null;
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return mVar.l(this);
        }
        int i = j$.time.d.a[((j$.time.temporal.a) mVar).ordinal()];
        int i2 = this.b;
        if (i == 1) {
            return i2;
        }
        if (i == 2) {
            return i2 / 1000;
        }
        if (i == 3) {
            return i2 / 1000000;
        }
        if (i == 4) {
            return this.a;
        }
        j$.time.g.e("Unsupported field: ".concat(java.lang.String.valueOf(mVar)));
        return 0L;
    }

    public final long H(j$.time.Instant instant) {
        long jI = j$.desugar.sun.nio.fs.g.I(instant.a, this.a);
        long j = instant.b - this.b;
        if (jI <= 0 || j >= 0) {
            return (jI >= 0 || j <= 0) ? jI : jI + 1;
        }
        return jI - 1;
    }

    @Override // j$.time.temporal.Temporal
    public final j$.time.temporal.Temporal a(long j, j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return (j$.time.Instant) mVar.r(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) mVar;
        aVar.s(j);
        int i = j$.time.d.a[aVar.ordinal()];
        int i2 = this.b;
        long j2 = this.a;
        if (i == 1) {
            return j != ((long) i2) ? r(j2, (int) j) : this;
        }
        if (i == 2) {
            int i3 = ((int) j) * 1000;
            return i3 != i2 ? r(j2, i3) : this;
        }
        if (i == 3) {
            int i4 = ((int) j) * 1000000;
            return i4 != i2 ? r(j2, i4) : this;
        }
        if (i == 4) {
            return j != j2 ? r(j, i2) : this;
        }
        j$.time.g.e("Unsupported field: ".concat(java.lang.String.valueOf(mVar)));
        return null;
    }

    public j$.time.ZonedDateTime atZone(j$.time.ZoneId zoneId) {
        return j$.time.ZonedDateTime.s(this, zoneId);
    }

    @Override // java.lang.Comparable
    public int compareTo(j$.time.Instant instant) {
        int iCompare = java.lang.Long.compare(this.a, instant.a);
        return iCompare != 0 ? iCompare : this.b - instant.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.m mVar) {
        if (mVar instanceof j$.time.temporal.a) {
            return mVar == j$.time.temporal.a.INSTANT_SECONDS || mVar == j$.time.temporal.a.NANO_OF_SECOND || mVar == j$.time.temporal.a.MICRO_OF_SECOND || mVar == j$.time.temporal.a.MILLI_OF_SECOND;
        }
        return mVar != null && mVar.h(this);
    }

    @Override // j$.time.temporal.Temporal
    public final long e(j$.time.temporal.Temporal temporal, j$.time.temporal.TemporalUnit temporalUnit) {
        j$.time.Instant instantS = s(temporal);
        if (!(temporalUnit instanceof j$.time.temporal.ChronoUnit)) {
            return temporalUnit.h(this, instantS);
        }
        int i = j$.time.d.b[((j$.time.temporal.ChronoUnit) temporalUnit).ordinal()];
        int i2 = this.b;
        long j = this.a;
        switch (i) {
            case 1:
                return j$.desugar.sun.nio.fs.g.G(j$.desugar.sun.nio.fs.g.H(j$.desugar.sun.nio.fs.g.I(instantS.a, j), 1000000000L), instantS.b - i2);
            case 2:
                return j$.desugar.sun.nio.fs.g.G(j$.desugar.sun.nio.fs.g.H(j$.desugar.sun.nio.fs.g.I(instantS.a, j), 1000000000L), instantS.b - i2) / 1000;
            case 3:
                return j$.desugar.sun.nio.fs.g.I(instantS.toEpochMilli(), toEpochMilli());
            case 4:
                return H(instantS);
            case 5:
                return H(instantS) / 60;
            case 6:
                return H(instantS) / 3600;
            case 7:
                return H(instantS) / 43200;
            case 8:
                return H(instantS) / 86400;
            default:
                j$.time.g.e("Unsupported unit: ".concat(java.lang.String.valueOf(temporalUnit)));
                return 0L;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.time.Instant) {
            j$.time.Instant instant = (j$.time.Instant) obj;
            if (this.a == instant.a && this.b == instant.b) {
                return true;
            }
        }
        return false;
    }

    public long getEpochSecond() {
        return this.a;
    }

    public int getNano() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.n.d(this, mVar).a(mVar.l(this), mVar);
        }
        int i = j$.time.d.a[((j$.time.temporal.a) mVar).ordinal()];
        int i2 = this.b;
        if (i == 1) {
            return i2;
        }
        if (i == 2) {
            return i2 / 1000;
        }
        if (i == 3) {
            return i2 / 1000000;
        }
        if (i == 4) {
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            aVar.b.a(this.a, aVar);
        }
        j$.time.g.e("Unsupported field: ".concat(java.lang.String.valueOf(mVar)));
        return 0;
    }

    public int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public boolean isAfter(j$.time.Instant instant) {
        return compareTo(instant) > 0;
    }

    public boolean isBefore(j$.time.Instant instant) {
        return compareTo(instant) < 0;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.Temporal x(j$.time.LocalDate localDate) {
        localDate.getClass();
        return (j$.time.Instant) j$.desugar.sun.nio.fs.g.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p l(j$.time.temporal.m mVar) {
        return j$.time.temporal.n.d(this, mVar);
    }

    public j$.time.Instant minusMillis(long j) {
        return j == Long.MIN_VALUE ? plusMillis(Long.MAX_VALUE).plusMillis(1L) : plusMillis(-j);
    }

    public j$.time.Instant minusSeconds(long j) {
        return j == Long.MIN_VALUE ? A(Long.MAX_VALUE, 0L).A(1L, 0L) : A(-j, 0L);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.Temporal p(j$.time.temporal.Temporal temporal) {
        return temporal.a(this.a, j$.time.temporal.a.INSTANT_SECONDS).a(this.b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public j$.time.Instant plus(j$.time.temporal.TemporalAmount temporalAmount) {
        return (j$.time.Instant) temporalAmount.h(this);
    }

    public j$.time.Instant plusMillis(long j) {
        return A(j / 1000, (j % 1000) * 1000000);
    }

    public long toEpochMilli() {
        long j = this.a;
        int i = this.b;
        return (j >= 0 || i <= 0) ? j$.desugar.sun.nio.fs.g.G(j$.desugar.sun.nio.fs.g.H(j, 1000L), i / 1000000) : j$.desugar.sun.nio.fs.g.G(j$.desugar.sun.nio.fs.g.H(j + 1, 1000L), (i / 1000000) - 1000);
    }

    public final java.lang.String toString() {
        return j$.time.format.DateTimeFormatter.g.format(this);
    }

    public j$.time.Instant truncatedTo(j$.time.temporal.TemporalUnit temporalUnit) {
        if (temporalUnit == j$.time.temporal.ChronoUnit.NANOS) {
            return this;
        }
        j$.time.Duration duration = temporalUnit.getDuration();
        if (duration.getSeconds() > 86400) {
            j$.time.g.e("Unit is too large to be used for truncation");
            return null;
        }
        long nanos = duration.toNanos();
        if (86400000000000L % nanos == 0) {
            long j = ((this.a % 86400) * 1000000000) + ((long) this.b);
            return A(0L, (j$.desugar.sun.nio.fs.g.y(j, nanos) * nanos) - j);
        }
        j$.time.g.e("Unit must divide into a standard day without remainder");
        return null;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object w(j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == j$.time.temporal.n.c) {
            return j$.time.temporal.ChronoUnit.NANOS;
        }
        if (nVar == j$.time.temporal.n.b || nVar == j$.time.temporal.n.a || nVar == j$.time.temporal.n.e || nVar == j$.time.temporal.n.d || nVar == j$.time.temporal.n.f || nVar == j$.time.temporal.n.g) {
            return null;
        }
        return nVar.c(this);
    }

    @Override // j$.time.temporal.Temporal
    public final j$.time.temporal.Temporal y(long j, j$.time.temporal.ChronoUnit chronoUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, chronoUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.b(j2, chronoUnit);
    }
}
