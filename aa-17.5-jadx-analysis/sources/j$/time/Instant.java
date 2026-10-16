package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class Instant implements Temporal, j$.time.temporal.l, Comparable<Instant>, Serializable {
    private static final long serialVersionUID = -665713676816604388L;
    public final long a;
    public final int b;
    public static final Instant EPOCH = new Instant(0, 0);
    public static final Instant MIN = ofEpochSecond(-31557014167219200L, 0);
    public static final Instant MAX = ofEpochSecond(31556889864403199L, 999999999);

    public Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static Instant now() {
        return Clock.systemUTC().instant();
    }

    public static Instant ofEpochMilli(long j) {
        return r(j$.desugar.sun.nio.fs.g.y(j, 1000L), ((int) j$.desugar.sun.nio.fs.g.F(j, 1000L)) * 1000000);
    }

    public static Instant ofEpochSecond(long j, long j2) {
        return r(j$.desugar.sun.nio.fs.g.G(j, j$.desugar.sun.nio.fs.g.y(j2, 1000000000L)), (int) j$.desugar.sun.nio.fs.g.F(j2, 1000000000L));
    }

    public static Instant parse(CharSequence charSequence) {
        return (Instant) DateTimeFormatter.f.b(charSequence, new j$.desugar.sun.nio.fs.n((byte) 1));
    }

    public static Instant r(long j, int i) {
        if ((i | j) == 0) {
            return EPOCH;
        }
        if (j >= -31557014167219200L && j <= 31556889864403199L) {
            return new Instant(j, i);
        }
        g.g("Instant exceeds minimum or maximum instant");
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static Instant s(j$.time.temporal.k kVar) {
        if (kVar instanceof Instant) {
            return (Instant) kVar;
        }
        Objects.a(kVar, "temporal");
        try {
            return ofEpochSecond(kVar.C(j$.time.temporal.a.INSTANT_SECONDS), kVar.h(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (DateTimeException e) {
            throw new DateTimeException(e.a("Unable to obtain Instant from TemporalAccessor: ", String.valueOf(kVar), " of type ", kVar.getClass().getName()), e);
        }
    }

    private Object writeReplace() {
        return new q((byte) 2, this);
    }

    public final Instant A(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(j$.desugar.sun.nio.fs.g.G(j$.desugar.sun.nio.fs.g.G(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final Instant b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (Instant) temporalUnit.k(this, j);
        }
        switch (d.b[((ChronoUnit) temporalUnit).ordinal()]) {
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
                g.e("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return null;
        }
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(this);
        }
        int i = d.a[((j$.time.temporal.a) nVar).ordinal()];
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
        g.e("Unsupported field: ".concat(String.valueOf(nVar)));
        return 0L;
    }

    public final long H(Instant instant) {
        long jI = j$.desugar.sun.nio.fs.g.I(instant.a, this.a);
        long j = instant.b - this.b;
        return (jI <= 0 || j >= 0) ? (jI >= 0 || j <= 0) ? jI : jI + 1 : jI - 1;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (Instant) nVar.r(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        aVar.s(j);
        int i = d.a[aVar.ordinal()];
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
        g.e("Unsupported field: ".concat(String.valueOf(nVar)));
        return null;
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.s(this, zoneId);
    }

    @Override // java.lang.Comparable
    public int compareTo(Instant instant) {
        int iCompare = Long.compare(this.a, instant.a);
        return iCompare != 0 ? iCompare : this.b - instant.b;
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.INSTANT_SECONDS || nVar == j$.time.temporal.a.NANO_OF_SECOND || nVar == j$.time.temporal.a.MICRO_OF_SECOND || nVar == j$.time.temporal.a.MILLI_OF_SECOND : nVar != null && nVar.h(this);
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        Instant instantS = s(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.h(this, instantS);
        }
        int i = d.b[((ChronoUnit) temporalUnit).ordinal()];
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
                g.e("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return 0L;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
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

    @Override // j$.time.temporal.k
    public final int h(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.o.d(this, nVar).a(nVar.l(this), nVar);
        }
        int i = d.a[((j$.time.temporal.a) nVar).ordinal()];
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
        g.e("Unsupported field: ".concat(String.valueOf(nVar)));
        return 0;
    }

    public int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public boolean isAfter(Instant instant) {
        return compareTo(instant) > 0;
    }

    public boolean isBefore(Instant instant) {
        return compareTo(instant) < 0;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: k */
    public final Temporal x(LocalDate localDate) {
        localDate.getClass();
        return (Instant) j$.desugar.sun.nio.fs.g.a(localDate, this);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q l(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.d(this, nVar);
    }

    public Instant minusMillis(long j) {
        return j == Long.MIN_VALUE ? plusMillis(Long.MAX_VALUE).plusMillis(1L) : plusMillis(-j);
    }

    public Instant minusSeconds(long j) {
        return j == Long.MIN_VALUE ? A(Long.MAX_VALUE, 0L).A(1L, 0L) : A(-j, 0L);
    }

    @Override // j$.time.temporal.l
    public final Temporal p(Temporal temporal) {
        return temporal.a(this.a, j$.time.temporal.a.INSTANT_SECONDS).a(this.b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public Instant plus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.h(this);
    }

    public Instant plusMillis(long j) {
        return A(j / 1000, (j % 1000) * 1000000);
    }

    public long toEpochMilli() {
        long j = this.a;
        return (j >= 0 || this.b <= 0) ? j$.desugar.sun.nio.fs.g.G(j$.desugar.sun.nio.fs.g.H(j, 1000L), r8 / 1000000) : j$.desugar.sun.nio.fs.g.G(j$.desugar.sun.nio.fs.g.H(j + 1, 1000L), (r8 / 1000000) - 1000);
    }

    public final String toString() {
        return DateTimeFormatter.f.a(this);
    }

    public Instant truncatedTo(TemporalUnit temporalUnit) {
        if (temporalUnit == ChronoUnit.NANOS) {
            return this;
        }
        Duration duration = temporalUnit.getDuration();
        if (duration.getSeconds() > 86400) {
            g.e("Unit is too large to be used for truncation");
            return null;
        }
        long nanos = duration.toNanos();
        if (86400000000000L % nanos == 0) {
            long j = ((this.a % 86400) * 1000000000) + this.b;
            return A(0L, (j$.desugar.sun.nio.fs.g.y(j, nanos) * nanos) - j);
        }
        g.e("Unit must divide into a standard day without remainder");
        return null;
    }

    @Override // j$.time.temporal.k
    public final Object w(j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == j$.time.temporal.o.c) {
            return ChronoUnit.NANOS;
        }
        if (nVar == j$.time.temporal.o.b || nVar == j$.time.temporal.o.a || nVar == j$.time.temporal.o.e || nVar == j$.time.temporal.o.d || nVar == j$.time.temporal.o.f || nVar == j$.time.temporal.o.g) {
            return null;
        }
        return nVar.c(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal y(long j, ChronoUnit chronoUnit) {
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
