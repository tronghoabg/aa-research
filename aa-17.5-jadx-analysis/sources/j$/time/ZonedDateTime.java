package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class ZonedDateTime implements Temporal, j$.time.chrono.j, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    public final LocalDateTime a;
    public final ZoneOffset b;
    public final ZoneId c;

    public ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = zoneId;
    }

    public static ZonedDateTime A(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.a(localDateTime, "localDateTime");
        Objects.a(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        ZoneRules rules = zoneId.getRules();
        List listF = rules.f(localDateTime);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() == 0) {
            j$.time.zone.b bVarE = rules.e(localDateTime);
            localDateTime = localDateTime.J(Duration.ofSeconds(bVarE.d.getTotalSeconds() - bVarE.c.getTotalSeconds()).getSeconds());
            zoneOffset = bVarE.d;
        } else if (zoneOffset == null || !listF.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) listF.get(0);
            Objects.a(zoneOffset, "offset");
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    public static ZonedDateTime now(ZoneId zoneId) {
        Clock clockSystem = Clock.system(zoneId);
        Objects.a(clockSystem, "clock");
        return s(clockSystem.instant(), clockSystem.a());
    }

    public static ZonedDateTime p(long j, int i, ZoneId zoneId) {
        ZoneOffset offset = zoneId.getRules().getOffset(Instant.ofEpochSecond(j, i));
        return new ZonedDateTime(LocalDateTime.H(j, i, offset), zoneId, offset);
    }

    public static ZonedDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.a(dateTimeFormatter, "formatter");
        return (ZonedDateTime) dateTimeFormatter.b(charSequence, new j$.desugar.sun.nio.fs.n((byte) 3));
    }

    public static ZonedDateTime r(j$.time.temporal.k kVar) {
        if (kVar instanceof ZonedDateTime) {
            return (ZonedDateTime) kVar;
        }
        try {
            ZoneId zoneIdR = ZoneId.r(kVar);
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            return kVar.d(aVar) ? p(kVar.C(aVar), kVar.h(j$.time.temporal.a.NANO_OF_SECOND), zoneIdR) : A(LocalDateTime.B(LocalDate.A(kVar), LocalTime.A(kVar)), zoneIdR, null);
        } catch (DateTimeException e) {
            throw new DateTimeException(e.a("Unable to obtain ZonedDateTime from TemporalAccessor: ", String.valueOf(kVar), " of type ", kVar.getClass().getName()), e);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static ZonedDateTime s(Instant instant, ZoneId zoneId) {
        Objects.a(instant, "instant");
        Objects.a(zoneId, "zone");
        return p(instant.getEpochSecond(), instant.getNano(), zoneId);
    }

    private Object writeReplace() {
        return new q((byte) 6, this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (ZonedDateTime) temporalUnit.k(this, j);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        boolean z = chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER;
        LocalDateTime localDateTime = this.a;
        if (z) {
            return H(localDateTime.b(j, temporalUnit));
        }
        LocalDateTime localDateTimeI = localDateTime.b(j, temporalUnit);
        Objects.a(localDateTimeI, "localDateTime");
        ZoneOffset zoneOffset = this.b;
        Objects.a(zoneOffset, "offset");
        ZoneId zoneId = this.c;
        Objects.a(zoneId, "zone");
        return zoneId.getRules().f(localDateTimeI).contains(zoneOffset) ? new ZonedDateTime(localDateTimeI, zoneId, zoneOffset) : p(localDateTimeI.toEpochSecond(zoneOffset), localDateTimeI.b.d, zoneId);
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(this);
        }
        int i = w.a[((j$.time.temporal.a) nVar).ordinal()];
        return i != 1 ? i != 2 ? this.a.C(nVar) : this.b.getTotalSeconds() : j$.desugar.sun.nio.fs.g.q(this);
    }

    public final ZonedDateTime H(LocalDateTime localDateTime) {
        return A(localDateTime, this.c, this.b);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (ZonedDateTime) nVar.r(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        int i = w.a[aVar.ordinal()];
        ZoneId zoneId = this.c;
        LocalDateTime localDateTime = this.a;
        if (i == 1) {
            return p(j, localDateTime.b.d, zoneId);
        }
        if (i != 2) {
            return H(localDateTime.a(j, nVar));
        }
        ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(aVar.b.a(j, aVar));
        return (zoneOffsetOfTotalSeconds.equals(this.b) || !zoneId.getRules().f(localDateTime).contains(zoneOffsetOfTotalSeconds)) ? this : new ZonedDateTime(localDateTime, zoneId, zoneOffsetOfTotalSeconds);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return j$.desugar.sun.nio.fs.g.e(this, (j$.time.chrono.j) obj);
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            return true;
        }
        return nVar != null && nVar.h(this);
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        ZonedDateTime zonedDateTimeR = r(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.h(this, zonedDateTimeR);
        }
        LocalDateTime localDateTime = zonedDateTimeR.a;
        ZoneId zoneId = this.c;
        Objects.a(zoneId, "zone");
        if (!zonedDateTimeR.c.equals(zoneId)) {
            zonedDateTimeR = p(localDateTime.toEpochSecond(zonedDateTimeR.b), localDateTime.b.d, zoneId);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        return (chronoUnit.compareTo(ChronoUnit.DAYS) < 0 || chronoUnit == ChronoUnit.FOREVER) ? toOffsetDateTime().e(zonedDateTimeR.toOffsetDateTime(), temporalUnit) : this.a.e(zonedDateTimeR.a, temporalUnit);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            if (this.a.equals(zonedDateTime.a) && this.b.equals(zonedDateTime.b) && this.c.equals(zonedDateTime.c)) {
                return true;
            }
        }
        return false;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.a(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.j g(ZoneId zoneId) {
        if (this.c.equals(zoneId)) {
            return this;
        }
        ZoneOffset zoneOffset = this.b;
        LocalDateTime localDateTime = this.a;
        return p(localDateTime.toEpochSecond(zoneOffset), localDateTime.b.d, zoneId);
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.a getChronology() {
        return ((LocalDate) toLocalDate()).getChronology();
    }

    @Override // j$.time.chrono.j
    public final ZoneOffset getOffset() {
        return this.b;
    }

    @Override // j$.time.chrono.j
    public ZoneId getZone() {
        return this.c;
    }

    @Override // j$.time.temporal.k
    public final int h(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return j$.desugar.sun.nio.fs.g.g(this, nVar);
        }
        int i = w.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.h(nVar) : this.b.getTotalSeconds();
        }
        g.e("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        return 0;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c.hashCode(), 3) ^ (this.a.hashCode() ^ this.b.b);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: k */
    public final Temporal x(LocalDate localDate) {
        boolean zB = e.b(localDate);
        LocalDateTime localDateTime = this.a;
        return zB ? A(LocalDateTime.B(localDate, localDateTime.b), this.c, this.b) : (ZonedDateTime) localDate.p(this);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q l(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? (nVar == j$.time.temporal.a.INSTANT_SECONDS || nVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) nVar).b : this.a.l(nVar) : nVar.k(this);
    }

    @Override // j$.time.chrono.j
    public final /* synthetic */ long toEpochSecond() {
        return j$.desugar.sun.nio.fs.g.q(this);
    }

    public Instant toInstant() {
        return Instant.ofEpochSecond(toEpochSecond(), toLocalTime().d);
    }

    @Override // j$.time.chrono.j
    public final LocalTime toLocalTime() {
        return this.a.b;
    }

    public OffsetDateTime toOffsetDateTime() {
        return new OffsetDateTime(this.a, this.b);
    }

    public final String toString() {
        String string = this.a.toString();
        ZoneOffset zoneOffset = this.b;
        String str = string + zoneOffset.c;
        ZoneId zoneId = this.c;
        return zoneOffset != zoneId ? e.a(str, "[", zoneId.toString(), "]") : str;
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.j v(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        return this.c.equals(zoneId) ? this : A(this.a, zoneId, this.b);
    }

    @Override // j$.time.temporal.k
    public final Object w(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.o.f ? toLocalDate() : j$.desugar.sun.nio.fs.g.n(this, nVar);
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

    @Override // j$.time.chrono.j
    public LocalDate toLocalDate() {
        return this.a.a;
    }

    @Override // j$.time.chrono.j
    public LocalDateTime toLocalDateTime() {
        return this.a;
    }
}
