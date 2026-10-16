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
public final class LocalDate implements Temporal, j$.time.temporal.l, j$.time.chrono.b, Serializable {
    public static final LocalDate d = O(-999999999, 1, 1);
    public static final LocalDate e = O(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;
    public final int a;
    public final short b;
    public final short c;

    static {
        O(1970, 1, 1);
    }

    public LocalDate(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    public static LocalDate A(j$.time.temporal.k kVar) {
        Objects.a(kVar, "temporal");
        LocalDate localDate = (LocalDate) kVar.w(j$.time.temporal.o.f);
        if (localDate != null) {
            return localDate;
        }
        g.g(e.a("Unable to obtain LocalDate from TemporalAccessor: ", String.valueOf(kVar), " of type ", kVar.getClass().getName()));
        return null;
    }

    public static LocalDate N(a aVar) {
        Instant instant = aVar.instant();
        ZoneId zoneId = aVar.b;
        Objects.a(instant, "instant");
        Objects.a(zoneId, "zone");
        return ofEpochDay(j$.desugar.sun.nio.fs.g.y(instant.getEpochSecond() + zoneId.getRules().getOffset(instant).getTotalSeconds(), 86400L));
    }

    public static LocalDate O(int i, int i2, int i3) {
        j$.time.temporal.a.YEAR.s(i);
        j$.time.temporal.a.MONTH_OF_YEAR.s(i2);
        j$.time.temporal.a.DAY_OF_MONTH.s(i3);
        return s(i, i2, i3);
    }

    public static LocalDate P(int i, int i2) {
        long j = i;
        j$.time.temporal.a.YEAR.s(j);
        j$.time.temporal.a.DAY_OF_YEAR.s(i2);
        boolean zIsLeapYear = j$.time.chrono.s.c.isLeapYear(j);
        if (i2 == 366 && !zIsLeapYear) {
            g.c("Invalid date 'DayOfYear 366' as '", i, "' is not a leap year");
            return null;
        }
        j jVarB = j.B(((i2 - 1) / 31) + 1);
        if (i2 > (jVarB.s(zIsLeapYear) + jVarB.r(zIsLeapYear)) - 1) {
            jVarB = j.a[(jVarB.ordinal() + 13) % 12];
        }
        return new LocalDate(i, jVarB.getValue(), (i2 - jVarB.r(zIsLeapYear)) + 1);
    }

    public static LocalDate V(int i, int i2, int i3) {
        if (i2 == 2) {
            i3 = Math.min(i3, j$.time.chrono.s.c.isLeapYear((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate ofEpochDay(long j) {
        long j2;
        j$.time.temporal.a.EPOCH_DAY.s(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        int i3 = ((i2 + 2) % 12) + 1;
        int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
        long j7 = j5 + j2 + (i2 / 10);
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return new LocalDate(aVar.b.a(j7, aVar), i3, i4);
    }

    public static LocalDate parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.e;
        Objects.a(dateTimeFormatter, "formatter");
        return (LocalDate) dateTimeFormatter.b(charSequence, new j$.desugar.sun.nio.fs.n((byte) 2));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static LocalDate s(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else if (j$.time.chrono.s.c.isLeapYear(i)) {
                i4 = 29;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    g.c("Invalid date 'February 29' as '", i, "' is not a leap year");
                    return null;
                }
                throw new DateTimeException("Invalid date '" + j.B(i2).name() + " " + i3 + "'");
            }
        }
        return new LocalDate(i, i2, i3);
    }

    private Object writeReplace() {
        return new q((byte) 3, this);
    }

    public final int B(j$.time.temporal.n nVar) {
        int i;
        int i2 = f.a[((j$.time.temporal.a) nVar).ordinal()];
        short s = this.c;
        int i3 = this.a;
        switch (i2) {
            case 1:
                return s;
            case 2:
                return I();
            case 3:
                i = (s - 1) / 7;
                break;
            case 4:
                return i3 >= 1 ? i3 : 1 - i3;
            case 5:
                return H().getValue();
            case 6:
                i = (s - 1) % 7;
                break;
            case 7:
                return ((I() - 1) % 7) + 1;
            case 8:
                g.e("Invalid field 'EpochDay' for get() method, use getLong() instead");
                return 0;
            case 9:
                return ((I() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                g.e("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
                return 0;
            case 12:
                return i3;
            case 13:
                return i3 >= 1 ? 1 : 0;
            default:
                g.e("Unsupported field: ".concat(String.valueOf(nVar)));
                return 0;
        }
        return i + 1;
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.EPOCH_DAY ? toEpochDay() : nVar == j$.time.temporal.a.PROLEPTIC_MONTH ? J() : B(nVar) : nVar.l(this);
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.e D(LocalTime localTime) {
        return LocalDateTime.B(this, localTime);
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.b F(TemporalAmount temporalAmount) {
        p pVar = (p) temporalAmount;
        return S((pVar.a * 12) + pVar.b).R(pVar.c);
    }

    @Override // java.lang.Comparable
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.b bVar) {
        return bVar instanceof LocalDate ? r((LocalDate) bVar) : j$.desugar.sun.nio.fs.g.c(this, bVar);
    }

    public final b H() {
        return b.r(((int) j$.desugar.sun.nio.fs.g.F(toEpochDay() + 3, 7L)) + 1);
    }

    public final int I() {
        return (j.B(this.b).r(isLeapYear()) + this.c) - 1;
    }

    public final long J() {
        return ((this.a * 12) + this.b) - 1;
    }

    public final boolean K(j$.time.chrono.b bVar) {
        return bVar instanceof LocalDate ? r((LocalDate) bVar) < 0 : toEpochDay() < bVar.toEpochDay();
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: L, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDate y(long j, TemporalUnit temporalUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, temporalUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.b(j2, temporalUnit);
    }

    public final long M(LocalDate localDate) {
        return (((localDate.J() * 32) + localDate.getDayOfMonth()) - ((J() * 32) + getDayOfMonth())) / 32;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final LocalDate b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDate) temporalUnit.k(this, j);
        }
        switch (f.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return R(j);
            case 2:
                return T(j);
            case 3:
                return S(j);
            case 4:
                return U(j);
            case 5:
                return U(j$.desugar.sun.nio.fs.g.H(j, 10L));
            case 6:
                return U(j$.desugar.sun.nio.fs.g.H(j, 100L));
            case 7:
                return U(j$.desugar.sun.nio.fs.g.H(j, 1000L));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a(j$.desugar.sun.nio.fs.g.G(C(aVar), j), aVar);
            default:
                g.e("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return null;
        }
    }

    public final LocalDate R(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.c + j;
        if (j2 > 0) {
            short s = this.b;
            int i = this.a;
            if (j2 <= 28) {
                return new LocalDate(i, s, (int) j2);
            }
            if (j2 <= 59) {
                long jLengthOfMonth = lengthOfMonth();
                if (j2 <= jLengthOfMonth) {
                    return new LocalDate(i, s, (int) j2);
                }
                if (s < 12) {
                    return new LocalDate(i, s + 1, (int) (j2 - jLengthOfMonth));
                }
                int i2 = i + 1;
                j$.time.temporal.a.YEAR.s(i2);
                return new LocalDate(i2, 1, (int) (j2 - jLengthOfMonth));
            }
        }
        return ofEpochDay(j$.desugar.sun.nio.fs.g.G(toEpochDay(), j));
    }

    public final LocalDate S(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return V(aVar.b.a(j$.desugar.sun.nio.fs.g.y(j2, 12L), aVar), ((int) j$.desugar.sun.nio.fs.g.F(j2, 12L)) + 1, this.c);
    }

    public final LocalDate T(long j) {
        return R(j$.desugar.sun.nio.fs.g.H(j, 7L));
    }

    public final LocalDate U(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return V(aVar.b.a(this.a + j, aVar), this.b, this.c);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final LocalDate a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (LocalDate) nVar.r(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        aVar.s(j);
        int i = f.a[aVar.ordinal()];
        short s = this.c;
        short s2 = this.b;
        int i2 = this.a;
        switch (i) {
            case 1:
                int i3 = (int) j;
                if (s != i3) {
                    return O(i2, s2, i3);
                }
                return this;
            case 2:
                int i4 = (int) j;
                if (I() != i4) {
                    return P(i2, i4);
                }
                return this;
            case 3:
                return T(j - C(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (i2 < 1) {
                    j = 1 - j;
                }
                return Y((int) j);
            case 5:
                return R(j - H().getValue());
            case 6:
                return R(j - C(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return R(j - C(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return ofEpochDay(j);
            case 9:
                return T(j - C(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i5 = (int) j;
                if (s2 != i5) {
                    j$.time.temporal.a.MONTH_OF_YEAR.s(i5);
                    return V(i2, i5, s);
                }
                return this;
            case 11:
                return S(j - J());
            case 12:
                return Y((int) j);
            case 13:
                if (C(j$.time.temporal.a.ERA) != j) {
                    return Y(1 - i2);
                }
                return this;
            default:
                g.e("Unsupported field: ".concat(String.valueOf(nVar)));
                return null;
        }
    }

    @Override // j$.time.chrono.b
    /* renamed from: X, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDate x(j$.time.temporal.l lVar) {
        return lVar instanceof LocalDate ? (LocalDate) lVar : (LocalDate) lVar.p(this);
    }

    public final LocalDate Y(int i) {
        if (this.a == i) {
            return this;
        }
        j$.time.temporal.a.YEAR.s(i);
        return V(i, this.b, this.c);
    }

    public ZonedDateTime atStartOfDay(ZoneId zoneId) {
        j$.time.zone.b bVarE;
        Objects.a(zoneId, "zone");
        LocalDateTime localDateTimeB = LocalDateTime.B(this, LocalTime.g);
        if (!(zoneId instanceof ZoneOffset) && (bVarE = zoneId.getRules().e(localDateTimeB)) != null && bVarE.h()) {
            localDateTimeB = bVarE.b.J(bVarE.d.getTotalSeconds() - bVarE.c.getTotalSeconds());
        }
        return ZonedDateTime.A(localDateTimeB, zoneId, null);
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        return j$.desugar.sun.nio.fs.g.j(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        LocalDate localDateA = A(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.h(this, localDateA);
        }
        switch (f.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return localDateA.toEpochDay() - toEpochDay();
            case 2:
                return (localDateA.toEpochDay() - toEpochDay()) / 7;
            case 3:
                return M(localDateA);
            case 4:
                return M(localDateA) / 12;
            case 5:
                return M(localDateA) / 120;
            case 6:
                return M(localDateA) / 1200;
            case 7:
                return M(localDateA) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return localDateA.C(aVar) - C(aVar);
            default:
                g.e("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return 0L;
        }
    }

    @Override // j$.time.chrono.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && r((LocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.a getChronology() {
        return j$.time.chrono.s.c;
    }

    public int getDayOfMonth() {
        return this.c;
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.m getEra() {
        return this.a >= 1 ? j$.time.chrono.t.CE : j$.time.chrono.t.BCE;
    }

    @Override // j$.time.temporal.k
    public final int h(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? B(nVar) : j$.time.temporal.o.a(this, nVar);
    }

    @Override // j$.time.chrono.b
    public int hashCode() {
        int i = this.a;
        return (i & (-2048)) ^ (((i << 11) + (this.b << 6)) + this.c);
    }

    @Override // j$.time.chrono.b
    public final boolean isLeapYear() {
        return j$.time.chrono.s.c.isLeapYear(this.a);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q l(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.k(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        if (!aVar.isDateBased()) {
            g.e("Unsupported field: ".concat(String.valueOf(nVar)));
            return null;
        }
        int i = f.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.q.f(1L, lengthOfMonth());
        }
        if (i == 2) {
            return j$.time.temporal.q.f(1L, lengthOfYear());
        }
        if (i != 3) {
            return i != 4 ? aVar.b : this.a <= 0 ? j$.time.temporal.q.f(1L, 1000000000L) : j$.time.temporal.q.f(1L, 999999999L);
        }
        return j$.time.temporal.q.f(1L, (j.B(this.b) != j.FEBRUARY || isLeapYear()) ? 5L : 4L);
    }

    public final int lengthOfMonth() {
        short s = this.b;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : isLeapYear() ? 29 : 28;
    }

    @Override // j$.time.chrono.b
    public final int lengthOfYear() {
        return isLeapYear() ? 366 : 365;
    }

    @Override // j$.time.temporal.l
    public final Temporal p(Temporal temporal) {
        return j$.desugar.sun.nio.fs.g.a(this, temporal);
    }

    public final int r(LocalDate localDate) {
        int i = this.a - localDate.a;
        return (i == 0 && (i = this.b - localDate.b) == 0) ? this.c - localDate.c : i;
    }

    @Override // j$.time.chrono.b
    public long toEpochDay() {
        long j = this.a;
        long j2 = this.b;
        long j3 = 365 * j;
        long j4 = (((367 * j2) - 362) / 12) + (j >= 0 ? ((j + 399) / 400) + (((3 + j) / 4) - ((99 + j) / 100)) + j3 : j3 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + (this.c - 1);
        if (j2 > 2) {
            j4 = !isLeapYear() ? j4 - 2 : j4 - 1;
        }
        return j4 - 719528;
    }

    @Override // j$.time.chrono.b
    public String toString() {
        int i = this.a;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        short s = this.b;
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        short s2 = this.c;
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }

    @Override // j$.time.temporal.k
    public final Object w(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.o.f ? this : j$.desugar.sun.nio.fs.g.l(this, nVar);
    }
}
