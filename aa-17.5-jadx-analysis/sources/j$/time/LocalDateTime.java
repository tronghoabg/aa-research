package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class LocalDateTime implements Temporal, j$.time.temporal.l, j$.time.chrono.e, Serializable {
    public static final LocalDateTime c = B(LocalDate.d, LocalTime.e);
    public static final LocalDateTime d = B(LocalDate.e, LocalTime.f);
    private static final long serialVersionUID = 6207766400415563566L;
    public final LocalDate a;
    public final LocalTime b;

    public LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.a = localDate;
        this.b = localTime;
    }

    public static LocalDateTime B(LocalDate localDate, LocalTime localTime) {
        Objects.a(localDate, "date");
        Objects.a(localTime, "time");
        return new LocalDateTime(localDate, localTime);
    }

    public static LocalDateTime H(long j, int i, ZoneOffset zoneOffset) {
        Objects.a(zoneOffset, "offset");
        long j2 = i;
        j$.time.temporal.a.NANO_OF_SECOND.s(j2);
        return new LocalDateTime(LocalDate.ofEpochDay(j$.desugar.sun.nio.fs.g.y(j + zoneOffset.getTotalSeconds(), 86400L)), LocalTime.I((((int) j$.desugar.sun.nio.fs.g.F(r5, 86400L)) * 1000000000) + j2));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static LocalDateTime s(j$.time.temporal.k kVar) {
        if (kVar instanceof LocalDateTime) {
            return (LocalDateTime) kVar;
        }
        if (kVar instanceof ZonedDateTime) {
            return ((ZonedDateTime) kVar).toLocalDateTime();
        }
        if (kVar instanceof OffsetDateTime) {
            return ((OffsetDateTime) kVar).a;
        }
        try {
            return new LocalDateTime(LocalDate.A(kVar), LocalTime.A(kVar));
        } catch (DateTimeException e) {
            throw new DateTimeException(e.a("Unable to obtain LocalDateTime from TemporalAccessor: ", String.valueOf(kVar), " of type ", kVar.getClass().getName()), e);
        }
    }

    private Object writeReplace() {
        return new q((byte) 5, this);
    }

    public final boolean A(j$.time.chrono.e eVar) {
        if (eVar instanceof LocalDateTime) {
            return r((LocalDateTime) eVar) < 0;
        }
        long epochDay = this.a.toEpochDay();
        long epochDay2 = eVar.toLocalDate().toEpochDay();
        if (epochDay >= epochDay2) {
            return epochDay == epochDay2 && this.b.P() < eVar.toLocalTime().P();
        }
        return true;
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).w() ? this.b.C(nVar) : this.a.C(nVar) : nVar.l(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.e eVar) {
        return eVar instanceof LocalDateTime ? r((LocalDateTime) eVar) : j$.desugar.sun.nio.fs.g.d(this, eVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDateTime) temporalUnit.k(this, j);
        }
        int i = h.a[((ChronoUnit) temporalUnit).ordinal()];
        LocalTime localTime = this.b;
        LocalDate localDate = this.a;
        switch (i) {
            case 1:
                return K(this.a, 0L, 0L, 0L, j);
            case 2:
                LocalDateTime localDateTimeM = M(localDate.R(j / 86400000000L), localTime);
                return localDateTimeM.K(localDateTimeM.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                LocalDateTime localDateTimeM2 = M(localDate.R(j / 86400000), localTime);
                return localDateTimeM2.K(localDateTimeM2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return J(j);
            case 5:
                return K(this.a, 0L, j, 0L, 0L);
            case 6:
                return K(this.a, j, 0L, 0L, 0L);
            case 7:
                LocalDateTime localDateTimeM3 = M(localDate.R(j / 256), localTime);
                return localDateTimeM3.K(localDateTimeM3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return M(localDate.b(j, temporalUnit), localTime);
        }
    }

    public final LocalDateTime J(long j) {
        return K(this.a, 0L, 0L, j, 0L);
    }

    public final LocalDateTime K(LocalDate localDate, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        LocalTime localTimeI = this.b;
        if (j5 == 0) {
            return M(localDate, localTimeI);
        }
        long j6 = j2 / 1440;
        long j7 = j / 24;
        long j8 = (j2 % 1440) * 60000000000L;
        long j9 = ((j % 24) * 3600000000000L) + j8 + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long jP = localTimeI.P();
        long j10 = j9 + jP;
        long jY = j$.desugar.sun.nio.fs.g.y(j10, 86400000000000L) + j7 + j6 + (j3 / 86400) + (j4 / 86400000000000L);
        long jF = j$.desugar.sun.nio.fs.g.F(j10, 86400000000000L);
        if (jF != jP) {
            localTimeI = LocalTime.I(jF);
        }
        return M(localDate.R(jY), localTimeI);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (LocalDateTime) nVar.r(this, j);
        }
        boolean zW = ((j$.time.temporal.a) nVar).w();
        LocalTime localTime = this.b;
        LocalDate localDate = this.a;
        return zW ? M(localDate, localTime.a(j, nVar)) : M(localDate.a(j, nVar), localTime);
    }

    public final LocalDateTime M(LocalDate localDate, LocalTime localTime) {
        return (this.a == localDate && this.b == localTime) ? this : new LocalDateTime(localDate, localTime);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime x(j$.time.temporal.l lVar) {
        return lVar instanceof LocalDate ? M((LocalDate) lVar, this.b) : lVar instanceof LocalTime ? M(this.a, (LocalTime) lVar) : lVar instanceof LocalDateTime ? (LocalDateTime) lVar : (LocalDateTime) lVar.p(this);
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar != null && nVar.h(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        return aVar.isDateBased() || aVar.w();
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        LocalDate localDateR;
        long jH;
        long j;
        LocalDateTime localDateTimeS = s(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.h(this, localDateTimeS);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        int iCompareTo = chronoUnit.compareTo(ChronoUnit.DAYS);
        LocalTime localTime = this.b;
        LocalDate localDate = this.a;
        if (iCompareTo >= 0) {
            LocalDate localDate2 = localDateTimeS.a;
            LocalTime localTime2 = localDateTimeS.b;
            boolean z = false;
            if (localDate == null ? localDate2.toEpochDay() > localDate.toEpochDay() : localDate2.r(localDate) > 0) {
                z = true;
            }
            if (!z || localTime2.compareTo(localTime) >= 0) {
                boolean zK = localDate2.K(localDate);
                localDateR = localDate2;
                if (zK) {
                    localDateR = localDate2;
                    if (localTime2.compareTo(localTime) > 0) {
                        localDateR = localDate2.R(1L);
                    }
                }
            } else {
                localDateR = localDate2.R(-1L);
            }
            return localDate.e(localDateR, temporalUnit);
        }
        LocalDate localDate3 = localDateTimeS.a;
        LocalTime localTime3 = localDateTimeS.b;
        localDate.getClass();
        long epochDay = localDate3.toEpochDay() - localDate.toEpochDay();
        if (epochDay == 0) {
            return localTime.e(localTime3, temporalUnit);
        }
        long jP = localTime3.P() - localTime.P();
        if (epochDay > 0) {
            jH = epochDay - 1;
            j = jP + 86400000000000L;
        } else {
            jH = epochDay + 1;
            j = jP - 86400000000000L;
        }
        switch (h.a[chronoUnit.ordinal()]) {
            case 1:
                jH = j$.desugar.sun.nio.fs.g.H(jH, 86400000000000L);
                break;
            case 2:
                jH = j$.desugar.sun.nio.fs.g.H(jH, 86400000000L);
                j /= 1000;
                break;
            case 3:
                jH = j$.desugar.sun.nio.fs.g.H(jH, 86400000L);
                j /= 1000000;
                break;
            case 4:
                jH = j$.desugar.sun.nio.fs.g.H(jH, 86400L);
                j /= 1000000000;
                break;
            case 5:
                jH = j$.desugar.sun.nio.fs.g.H(jH, 1440L);
                j /= 60000000000L;
                break;
            case 6:
                jH = j$.desugar.sun.nio.fs.g.H(jH, 24L);
                j /= 3600000000000L;
                break;
            case 7:
                jH = j$.desugar.sun.nio.fs.g.H(jH, 2L);
                j /= 43200000000000L;
                break;
        }
        return j$.desugar.sun.nio.fs.g.G(jH, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.a.equals(localDateTime.a) && this.b.equals(localDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.e
    public final j$.time.chrono.a getChronology() {
        return ((LocalDate) toLocalDate()).getChronology();
    }

    @Override // j$.time.temporal.k
    public final int h(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).w() ? this.b.h(nVar) : this.a.h(nVar) : j$.time.temporal.o.a(this, nVar);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q l(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.k(this);
        }
        if (!((j$.time.temporal.a) nVar).w()) {
            return this.a.l(nVar);
        }
        LocalTime localTime = this.b;
        localTime.getClass();
        return j$.time.temporal.o.d(localTime, nVar);
    }

    @Override // j$.time.temporal.l
    public final Temporal p(Temporal temporal) {
        return temporal.a(toLocalDate().toEpochDay(), j$.time.temporal.a.EPOCH_DAY).a(toLocalTime().P(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public final int r(LocalDateTime localDateTime) {
        int iR = this.a.r(localDateTime.a);
        return iR == 0 ? this.b.compareTo(localDateTime.b) : iR;
    }

    public /* synthetic */ long toEpochSecond(ZoneOffset zoneOffset) {
        return j$.desugar.sun.nio.fs.g.p(this, zoneOffset);
    }

    @Override // j$.time.chrono.e
    public final j$.time.chrono.b toLocalDate() {
        return this.a;
    }

    @Override // j$.time.chrono.e
    public final LocalTime toLocalTime() {
        return this.b;
    }

    public String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    @Override // j$.time.temporal.k
    public final Object w(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.o.f ? this.a : j$.desugar.sun.nio.fs.g.m(this, nVar);
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

    @Override // j$.time.chrono.e
    public final j$.time.chrono.j z(ZoneId zoneId) {
        return ZonedDateTime.A(this, zoneId, null);
    }
}
