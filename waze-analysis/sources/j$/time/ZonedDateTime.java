package j$.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalUnit;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class ZonedDateTime implements Temporal, ChronoZonedDateTime<LocalDate>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* renamed from: a, reason: collision with root package name */
    public final LocalDateTime f49829a;

    /* renamed from: b, reason: collision with root package name */
    public final ZoneOffset f49830b;

    /* renamed from: c, reason: collision with root package name */
    public final ZoneId f49831c;

    public ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.f49829a = localDateTime;
        this.f49830b = zoneOffset;
        this.f49831c = zoneId;
    }

    public static ZonedDateTime B(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof ZonedDateTime) {
            return (ZonedDateTime) temporalAccessor;
        }
        try {
            ZoneId zoneIdB = ZoneId.B(temporalAccessor);
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            return temporalAccessor.c(aVar) ? m(temporalAccessor.D(aVar), temporalAccessor.f(j$.time.temporal.a.NANO_OF_SECOND), zoneIdB) : M(LocalDateTime.N(LocalDate.M(temporalAccessor), LocalTime.M(temporalAccessor)), zoneIdB, null);
        } catch (c e2) {
            throw new c(j$.desugar.sun.nio.fs.h.b("Unable to obtain ZonedDateTime from TemporalAccessor: ", String.valueOf(temporalAccessor), " of type ", temporalAccessor.getClass().getName()), e2);
        }
    }

    public static ZonedDateTime L(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return m(instant.getEpochSecond(), instant.getNano(), zoneId);
    }

    public static ZonedDateTime M(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        ZoneRules rules = zoneId.getRules();
        List listF = rules.f(localDateTime);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() == 0) {
            Object objE = rules.e(localDateTime);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            localDateTime = localDateTime.Q(Duration.ofSeconds(bVar.f50102d.getTotalSeconds() - bVar.f50101c.getTotalSeconds()).getSeconds());
            zoneOffset = bVar.f50102d;
        } else if (zoneOffset == null || !listF.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) Objects.requireNonNull((ZoneOffset) listF.get(0), TypedValues.CycleType.S_WAVE_OFFSET);
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    public static ZonedDateTime m(long j2, int i2, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.getRules().d(Instant.ofEpochSecond(j2, i2));
        return new ZonedDateTime(LocalDateTime.O(j2, i2, zoneOffsetD), zoneId, zoneOffsetD);
    }

    public static ZonedDateTime now() {
        a aVarA = b.a();
        Objects.requireNonNull(aVarA, "clock");
        return L(Instant.ofEpochMilli(System.currentTimeMillis()), aVarA.f49833b);
    }

    public static ZonedDateTime of(int i2, int i3, int i4, int i5, int i6, int i7, int i8, ZoneId zoneId) {
        LocalDateTime localDateTime = LocalDateTime.f49803c;
        return M(new LocalDateTime(LocalDate.of(i2, i3, i4), LocalTime.O(i5, i6, i7, i8)), zoneId, null);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 6, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return mVar.k(this);
        }
        int i2 = t.f50034a[((j$.time.temporal.a) mVar).ordinal()];
        return i2 != 1 ? i2 != 2 ? this.f49829a.D(mVar) : this.f49830b.getTotalSeconds() : toEpochSecond();
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime b(long j2, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (ZonedDateTime) temporalUnit.f(this, j2);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        boolean z = chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER;
        LocalDateTime localDateTime = this.f49829a;
        if (z) {
            return O(localDateTime.b(j2, temporalUnit));
        }
        LocalDateTime localDateTimeB = localDateTime.b(j2, temporalUnit);
        Objects.requireNonNull(localDateTimeB, "localDateTime");
        ZoneOffset zoneOffset = this.f49830b;
        Objects.requireNonNull(zoneOffset, TypedValues.CycleType.S_WAVE_OFFSET);
        ZoneId zoneId = this.f49831c;
        Objects.requireNonNull(zoneId, "zone");
        return zoneId.getRules().f(localDateTimeB).contains(zoneOffset) ? new ZonedDateTime(localDateTimeB, zoneId, zoneOffset) : m(localDateTimeB.toEpochSecond(zoneOffset), localDateTimeB.f49806b.f49813d, zoneId);
    }

    public final ZonedDateTime O(LocalDateTime localDateTime) {
        return M(localDateTime, this.f49831c, this.f49830b);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j2, j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return (ZonedDateTime) mVar.x(this, j2);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) mVar;
        int i2 = t.f50034a[aVar.ordinal()];
        ZoneId zoneId = this.f49831c;
        LocalDateTime localDateTime = this.f49829a;
        if (i2 == 1) {
            return m(j2, localDateTime.f49806b.f49813d, zoneId);
        }
        if (i2 != 2) {
            return O(localDateTime.a(j2, mVar));
        }
        ZoneOffset zoneOffsetS = ZoneOffset.S(aVar.f50048b.a(j2, aVar));
        return (zoneOffsetS.equals(this.f49830b) || !zoneId.getRules().f(localDateTime).contains(zoneOffsetS)) ? this : new ZonedDateTime(localDateTime, zoneId, zoneOffsetS);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.m mVar) {
        if (mVar instanceof j$.time.temporal.a) {
            return true;
        }
        return mVar != null && mVar.f(this);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(ChronoZonedDateTime<?> chronoZonedDateTime) {
        return compareTo((ChronoZonedDateTime) chronoZonedDateTime);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime d(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (this.f49831c.equals(zoneId)) {
            return this;
        }
        ZoneOffset zoneOffset = this.f49830b;
        LocalDateTime localDateTime = this.f49829a;
        return m(localDateTime.toEpochSecond(zoneOffset), localDateTime.f49806b.f49813d, zoneId);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            if (this.f49829a.equals(zonedDateTime.f49829a) && this.f49830b.equals(zonedDateTime.f49830b) && this.f49831c.equals(zonedDateTime.f49831c)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int f(j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return j$.com.android.tools.r8.a.j(this, mVar);
        }
        int i2 = t.f50034a[((j$.time.temporal.a) mVar).ordinal()];
        if (i2 != 1) {
            return i2 != 2 ? this.f49829a.f(mVar) : this.f49830b.getTotalSeconds();
        }
        f.f("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        return 0;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final Chronology getChronology() {
        return ((LocalDate) toLocalDate()).getChronology();
    }

    public int getMonthValue() {
        return this.f49829a.f49805a.getMonthValue();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset getOffset() {
        return this.f49830b;
    }

    public int getYear() {
        return this.f49829a.f49805a.getYear();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public ZoneId getZone() {
        return this.f49831c;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: h */
    public final Temporal y(LocalDate localDate) {
        return j$.desugar.sun.nio.fs.h.c(localDate) ? O(LocalDateTime.N(localDate, this.f49829a.f49806b)) : (ZonedDateTime) localDate.m(this);
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f49831c.hashCode(), 3) ^ (this.f49829a.hashCode() ^ this.f49830b.f49827b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(j$.time.temporal.m mVar) {
        return mVar instanceof j$.time.temporal.a ? (mVar == j$.time.temporal.a.INSTANT_SECONDS || mVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) mVar).f50048b : this.f49829a.k(mVar) : mVar.h(this);
    }

    public ZonedDateTime minusMonths(long j2) {
        LocalDateTime localDateTimeT;
        LocalDateTime localDateTime = this.f49829a;
        if (j2 == Long.MIN_VALUE) {
            this = O(localDateTime.T(localDateTime.f49805a.plusMonths(Long.MAX_VALUE), localDateTime.f49806b));
            LocalDateTime localDateTime2 = this.f49829a;
            localDateTimeT = localDateTime2.T(localDateTime2.f49805a.plusMonths(1L), localDateTime2.f49806b);
        } else {
            localDateTimeT = localDateTime.T(localDateTime.f49805a.plusMonths(-j2), localDateTime.f49806b);
        }
        return this.O(localDateTimeT);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public /* synthetic */ long toEpochSecond() {
        return j$.com.android.tools.r8.a.v(this);
    }

    public Instant toInstant() {
        return Instant.ofEpochSecond(toEpochSecond(), toLocalTime().f49813d);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final LocalTime toLocalTime() {
        return this.f49829a.f49806b;
    }

    public final String toString() {
        String string = this.f49829a.toString();
        ZoneOffset zoneOffset = this.f49830b;
        String str = string + zoneOffset.f49828c;
        ZoneId zoneId = this.f49831c;
        return zoneOffset != zoneId ? j$.desugar.sun.nio.fs.h.b(str, "[", zoneId.toString(), "]") : str;
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        ZonedDateTime zonedDateTimeB = B(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, zonedDateTimeB);
        }
        LocalDateTime localDateTime = zonedDateTimeB.f49829a;
        ZoneId zoneId = this.f49831c;
        Objects.requireNonNull(zoneId, "zone");
        if (!zonedDateTimeB.f49831c.equals(zoneId)) {
            zonedDateTimeB = m(localDateTime.toEpochSecond(zonedDateTimeB.f49830b), localDateTime.f49806b.f49813d, zoneId);
        }
        LocalDateTime localDateTime2 = zonedDateTimeB.f49829a;
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        int iCompareTo = chronoUnit.compareTo(ChronoUnit.DAYS);
        LocalDateTime localDateTime3 = this.f49829a;
        return (iCompareTo < 0 || chronoUnit == ChronoUnit.FOREVER) ? new OffsetDateTime(localDateTime3, this.f49830b).until(new OffsetDateTime(localDateTime2, zonedDateTimeB.f49830b), temporalUnit) : localDateTime3.until(localDateTime2, temporalUnit);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime w(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.f49831c.equals(zoneId) ? this : M(this.f49829a, zoneId, this.f49830b);
    }

    public ZonedDateTime withDayOfMonth(int i2) {
        LocalDateTime localDateTime = this.f49829a;
        LocalDate localDateOf = localDateTime.f49805a;
        if (localDateOf.f49802c != i2) {
            localDateOf = LocalDate.of(localDateOf.f49800a, localDateOf.f49801b, i2);
        }
        return O(localDateTime.T(localDateOf, localDateTime.f49806b));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object x(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.n.f50070f ? toLocalDate() : j$.com.android.tools.r8.a.s(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal z(long j2, ChronoUnit chronoUnit) {
        long j3;
        if (j2 == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, chronoUnit);
            j3 = 1;
        } else {
            j3 = -j2;
        }
        return this.b(j3, chronoUnit);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public LocalDate toLocalDate() {
        return this.f49829a.f49805a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public LocalDateTime toLocalDateTime() {
        return this.f49829a;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // j$.time.chrono.ChronoZonedDateTime
    public /* synthetic */ int compareTo(ChronoZonedDateTime chronoZonedDateTime) {
        return j$.com.android.tools.r8.a.f(this, chronoZonedDateTime);
    }
}
