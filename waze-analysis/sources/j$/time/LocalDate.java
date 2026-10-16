package j$.time;

import androidx.media3.common.C;
import com.waze.strings.DisplayStrings;
import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeParseException;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class LocalDate implements Temporal, j$.time.temporal.k, j$.time.chrono.b, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final LocalDate f49798d = of(-999999999, 1, 1);

    /* renamed from: e, reason: collision with root package name */
    public static final LocalDate f49799e = of(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;

    /* renamed from: a, reason: collision with root package name */
    public final int f49800a;

    /* renamed from: b, reason: collision with root package name */
    public final short f49801b;

    /* renamed from: c, reason: collision with root package name */
    public final short f49802c;

    static {
        of(DisplayStrings.DS_VOICE_PROMPT_LEGACY_PROMPT_SET_NAME, 1, 1);
    }

    public LocalDate(int i2, int i3, int i4) {
        this.f49800a = i2;
        this.f49801b = (short) i3;
        this.f49802c = (short) i4;
    }

    public static LocalDate L(int i2, int i3, int i4) {
        int i5 = 28;
        if (i4 > 28) {
            if (i3 != 2) {
                i5 = (i3 == 4 || i3 == 6 || i3 == 9 || i3 == 11) ? 30 : 31;
            } else if (j$.time.chrono.r.f49878d.isLeapYear(i2)) {
                i5 = 29;
            }
            if (i4 > i5) {
                if (i4 == 29) {
                    f.d("Invalid date 'February 29' as '", i2, "' is not a leap year");
                    return null;
                }
                throw new c("Invalid date '" + Month.N(i3).name() + " " + i4 + "'");
            }
        }
        return new LocalDate(i2, i3, i4);
    }

    public static LocalDate M(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalDate localDate = (LocalDate) temporalAccessor.x(j$.time.temporal.n.f50070f);
        if (localDate != null) {
            return localDate;
        }
        f.h(j$.desugar.sun.nio.fs.h.b("Unable to obtain LocalDate from TemporalAccessor: ", String.valueOf(temporalAccessor), " of type ", temporalAccessor.getClass().getName()));
        return null;
    }

    public static LocalDate T(a aVar) {
        Objects.requireNonNull(aVar, "clock");
        Instant instantOfEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        ZoneId zoneId = aVar.f49833b;
        Objects.requireNonNull(instantOfEpochMilli, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return ofEpochDay(j$.com.android.tools.r8.a.F(instantOfEpochMilli.getEpochSecond() + zoneId.getRules().d(instantOfEpochMilli).getTotalSeconds(), 86400L));
    }

    public static LocalDate U(int i2, int i3) {
        long j2 = i2;
        j$.time.temporal.a.YEAR.z(j2);
        j$.time.temporal.a.DAY_OF_YEAR.z(i3);
        boolean zIsLeapYear = j$.time.chrono.r.f49878d.isLeapYear(j2);
        if (i3 == 366 && !zIsLeapYear) {
            f.d("Invalid date 'DayOfYear 366' as '", i2, "' is not a leap year");
            return null;
        }
        Month monthN = Month.N(((i3 - 1) / 31) + 1);
        if (i3 > (monthN.L(zIsLeapYear) + monthN.B(zIsLeapYear)) - 1) {
            monthN = Month.f49814a[(monthN.ordinal() + 13) % 12];
        }
        return new LocalDate(i2, monthN.getValue(), (i3 - monthN.B(zIsLeapYear)) + 1);
    }

    public static LocalDate Z(int i2, int i3, int i4) {
        if (i3 == 2) {
            i4 = Math.min(i4, j$.time.chrono.r.f49878d.isLeapYear((long) i2) ? 29 : 28);
        } else if (i3 == 4 || i3 == 6 || i3 == 9 || i3 == 11) {
            i4 = Math.min(i4, 30);
        }
        return new LocalDate(i2, i3, i4);
    }

    public static LocalDate now() {
        return T(b.a());
    }

    public static LocalDate of(int i2, int i3, int i4) {
        j$.time.temporal.a.YEAR.z(i2);
        j$.time.temporal.a.MONTH_OF_YEAR.z(i3);
        j$.time.temporal.a.DAY_OF_MONTH.z(i4);
        return L(i2, i3, i4);
    }

    public static LocalDate ofEpochDay(long j2) {
        long j3;
        j$.time.temporal.a.EPOCH_DAY.z(j2);
        long j4 = 719468 + j2;
        if (j4 < 0) {
            long j5 = ((j2 + 719469) / 146097) - 1;
            j3 = j5 * 400;
            j4 += (-j5) * 146097;
        } else {
            j3 = 0;
        }
        long j6 = ((j4 * 400) + 591) / 146097;
        long j7 = j4 - ((j6 / 400) + (((j6 / 4) + (j6 * 365)) - (j6 / 100)));
        if (j7 < 0) {
            j6--;
            j7 = j4 - ((j6 / 400) + (((j6 / 4) + (365 * j6)) - (j6 / 100)));
        }
        int i2 = (int) j7;
        int i3 = ((i2 * 5) + 2) / 153;
        int i4 = ((i3 + 2) % 12) + 1;
        int i5 = (i2 - (((i3 * 306) + 5) / 10)) + 1;
        long j8 = j6 + j3 + (i3 / 10);
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return new LocalDate(aVar.f50048b.a(j8, aVar), i4, i5);
    }

    public static LocalDate parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        String string;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        j$.desugar.sun.nio.fs.n nVar = new j$.desugar.sun.nio.fs.n(1);
        dateTimeFormatter.getClass();
        Objects.requireNonNull(charSequence, "text");
        Objects.requireNonNull(nVar, "query");
        try {
            return (LocalDate) dateTimeFormatter.a(charSequence).x(nVar);
        } catch (DateTimeParseException e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            DateTimeParseException dateTimeParseException = new DateTimeParseException(j$.desugar.sun.nio.fs.h.b("Text '", string, "' could not be parsed: ", e3.getMessage()), e3);
            charSequence.toString();
            throw dateTimeParseException;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 3, this);
    }

    public final int B(LocalDate localDate) {
        int i2 = this.f49800a - localDate.f49800a;
        return (i2 == 0 && (i2 = this.f49801b - localDate.f49801b) == 0) ? this.f49802c - localDate.f49802c : i2;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.m mVar) {
        return mVar instanceof j$.time.temporal.a ? mVar == j$.time.temporal.a.EPOCH_DAY ? toEpochDay() : mVar == j$.time.temporal.a.PROLEPTIC_MONTH ? P() : N(mVar) : mVar.k(this);
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.b H(TemporalAmount temporalAmount) {
        n nVar = (n) temporalAmount;
        return plusMonths((nVar.f50020a * 12) + nVar.f50021b).W(nVar.f50022c);
    }

    @Override // java.lang.Comparable
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.b bVar) {
        return bVar instanceof LocalDate ? B((LocalDate) bVar) : j$.com.android.tools.r8.a.d(this, bVar);
    }

    public final int N(j$.time.temporal.m mVar) {
        int i2;
        int i3 = e.f49896a[((j$.time.temporal.a) mVar).ordinal()];
        short s = this.f49802c;
        int i4 = this.f49800a;
        switch (i3) {
            case 1:
                return s;
            case 2:
                return O();
            case 3:
                i2 = (s - 1) / 7;
                break;
            case 4:
                return i4 >= 1 ? i4 : 1 - i4;
            case 5:
                return getDayOfWeek().getValue();
            case 6:
                i2 = (s - 1) % 7;
                break;
            case 7:
                return ((O() - 1) % 7) + 1;
            case 8:
                f.f("Invalid field 'EpochDay' for get() method, use getLong() instead");
                return 0;
            case 9:
                return ((O() - 1) / 7) + 1;
            case 10:
                return this.f49801b;
            case 11:
                f.f("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
                return 0;
            case 12:
                return i4;
            case 13:
                return i4 >= 1 ? 1 : 0;
            default:
                f.f("Unsupported field: ".concat(String.valueOf(mVar)));
                return 0;
        }
        return i2 + 1;
    }

    public final int O() {
        return (getMonth().B(isLeapYear()) + this.f49802c) - 1;
    }

    public final long P() {
        return ((this.f49800a * 12) + this.f49801b) - 1;
    }

    public final boolean Q(j$.time.chrono.b bVar) {
        return bVar instanceof LocalDate ? B((LocalDate) bVar) < 0 : toEpochDay() < bVar.toEpochDay();
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: R, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDate z(long j2, TemporalUnit temporalUnit) {
        long j3;
        if (j2 == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, temporalUnit);
            j3 = 1;
        } else {
            j3 = -j2;
        }
        return this.b(j3, temporalUnit);
    }

    public final long S(LocalDate localDate) {
        return (((localDate.P() * 32) + localDate.getDayOfMonth()) - ((P() * 32) + getDayOfMonth())) / 32;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final LocalDate b(long j2, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDate) temporalUnit.f(this, j2);
        }
        switch (e.f49897b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return W(j2);
            case 2:
                return X(j2);
            case 3:
                return plusMonths(j2);
            case 4:
                return Y(j2);
            case 5:
                return Y(j$.com.android.tools.r8.a.Q(j2, 10L));
            case 6:
                return Y(j$.com.android.tools.r8.a.Q(j2, 100L));
            case 7:
                return Y(j$.com.android.tools.r8.a.Q(j2, 1000L));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a(j$.com.android.tools.r8.a.P(D(aVar), j2), aVar);
            default:
                f.f("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return null;
        }
    }

    public final LocalDate W(long j2) {
        if (j2 == 0) {
            return this;
        }
        long j3 = this.f49802c + j2;
        if (j3 > 0) {
            short s = this.f49801b;
            int i2 = this.f49800a;
            if (j3 <= 28) {
                return new LocalDate(i2, s, (int) j3);
            }
            if (j3 <= 59) {
                long jLengthOfMonth = lengthOfMonth();
                if (j3 <= jLengthOfMonth) {
                    return new LocalDate(i2, s, (int) j3);
                }
                if (s < 12) {
                    return new LocalDate(i2, s + 1, (int) (j3 - jLengthOfMonth));
                }
                int i3 = i2 + 1;
                j$.time.temporal.a.YEAR.z(i3);
                return new LocalDate(i3, 1, (int) (j3 - jLengthOfMonth));
            }
        }
        return ofEpochDay(j$.com.android.tools.r8.a.P(toEpochDay(), j2));
    }

    public final LocalDate X(long j2) {
        return W(j$.com.android.tools.r8.a.Q(j2, 7L));
    }

    public final LocalDate Y(long j2) {
        if (j2 == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return Z(aVar.f50048b.a(this.f49800a + j2, aVar), this.f49801b, this.f49802c);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final LocalDate a(long j2, j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return (LocalDate) mVar.x(this, j2);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) mVar;
        aVar.z(j2);
        int i2 = e.f49896a[aVar.ordinal()];
        short s = this.f49802c;
        short s2 = this.f49801b;
        int i3 = this.f49800a;
        switch (i2) {
            case 1:
                int i4 = (int) j2;
                if (s != i4) {
                    return of(i3, s2, i4);
                }
                return this;
            case 2:
                int i5 = (int) j2;
                if (O() != i5) {
                    return U(i3, i5);
                }
                return this;
            case 3:
                return X(j2 - D(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (i3 < 1) {
                    j2 = 1 - j2;
                }
                return c0((int) j2);
            case 5:
                return W(j2 - getDayOfWeek().getValue());
            case 6:
                return W(j2 - D(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return W(j2 - D(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return ofEpochDay(j2);
            case 9:
                return X(j2 - D(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i6 = (int) j2;
                if (s2 != i6) {
                    j$.time.temporal.a.MONTH_OF_YEAR.z(i6);
                    return Z(i3, i6, s);
                }
                return this;
            case 11:
                return plusMonths(j2 - P());
            case 12:
                return c0((int) j2);
            case 13:
                if (D(j$.time.temporal.a.ERA) != j2) {
                    return c0(1 - i3);
                }
                return this;
            default:
                f.f("Unsupported field: ".concat(String.valueOf(mVar)));
                return null;
        }
    }

    public ZonedDateTime atStartOfDay(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        LocalDateTime localDateTimeE = E(LocalTime.MIDNIGHT);
        if (!(zoneId instanceof ZoneOffset)) {
            Object objE = zoneId.getRules().e(localDateTimeE);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            if (bVar != null && bVar.f()) {
                localDateTimeE = bVar.f50100b.Q(bVar.f50102d.getTotalSeconds() - bVar.f50101c.getTotalSeconds());
            }
        }
        return ZonedDateTime.M(localDateTimeE, zoneId, null);
    }

    @Override // j$.time.chrono.b
    /* renamed from: atTime, reason: merged with bridge method [inline-methods] */
    public LocalDateTime E(LocalTime localTime) {
        return LocalDateTime.N(this, localTime);
    }

    @Override // j$.time.chrono.b
    /* renamed from: b0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDate y(j$.time.temporal.k kVar) {
        return kVar instanceof LocalDate ? (LocalDate) kVar : (LocalDate) kVar.m(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.m mVar) {
        return j$.com.android.tools.r8.a.o(this, mVar);
    }

    public final LocalDate c0(int i2) {
        if (this.f49800a == i2) {
            return this;
        }
        j$.time.temporal.a.YEAR.z(i2);
        return Z(i2, this.f49801b, this.f49802c);
    }

    @Override // j$.time.chrono.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && B((LocalDate) obj) == 0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int f(j$.time.temporal.m mVar) {
        return mVar instanceof j$.time.temporal.a ? N(mVar) : j$.time.temporal.n.a(this, mVar);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.chrono.b
    public final Chronology getChronology() {
        return j$.time.chrono.r.f49878d;
    }

    public int getDayOfMonth() {
        return this.f49802c;
    }

    public DayOfWeek getDayOfWeek() {
        return DayOfWeek.B(((int) j$.com.android.tools.r8.a.O(toEpochDay() + 3, 7L)) + 1);
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.l getEra() {
        return getYear() >= 1 ? j$.time.chrono.s.CE : j$.time.chrono.s.BCE;
    }

    public Month getMonth() {
        return Month.N(this.f49801b);
    }

    public int getMonthValue() {
        return this.f49801b;
    }

    public int getYear() {
        return this.f49800a;
    }

    @Override // j$.time.chrono.b
    public final int hashCode() {
        int i2 = this.f49800a;
        return (i2 & (-2048)) ^ (((i2 << 11) + (this.f49801b << 6)) + this.f49802c);
    }

    @Override // j$.time.chrono.b
    public final boolean isLeapYear() {
        return j$.time.chrono.r.f49878d.isLeapYear(this.f49800a);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return mVar.h(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) mVar;
        if (!aVar.isDateBased()) {
            f.f("Unsupported field: ".concat(String.valueOf(mVar)));
            return null;
        }
        int i2 = e.f49896a[aVar.ordinal()];
        if (i2 == 1) {
            return j$.time.temporal.p.f(1L, lengthOfMonth());
        }
        if (i2 == 2) {
            return j$.time.temporal.p.f(1L, lengthOfYear());
        }
        if (i2 != 3) {
            return i2 != 4 ? aVar.f50048b : getYear() <= 0 ? j$.time.temporal.p.f(1L, C.NANOS_PER_SECOND) : j$.time.temporal.p.f(1L, 999999999L);
        }
        return j$.time.temporal.p.f(1L, (getMonth() != Month.FEBRUARY || isLeapYear()) ? 5L : 4L);
    }

    public int lengthOfMonth() {
        short s = this.f49801b;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : isLeapYear() ? 29 : 28;
    }

    @Override // j$.time.chrono.b
    public final int lengthOfYear() {
        return isLeapYear() ? DisplayStrings.DS_MAIN_MENU_HEADER_BUTTON : DisplayStrings.DS_MAIN_MENU_GENERIC_GREETING;
    }

    @Override // j$.time.temporal.k
    public final Temporal m(Temporal temporal) {
        return j$.com.android.tools.r8.a.a(this, temporal);
    }

    public LocalDate minusMonths(long j2) {
        long j3;
        if (j2 == Long.MIN_VALUE) {
            this = plusMonths(Long.MAX_VALUE);
            j3 = 1;
        } else {
            j3 = -j2;
        }
        return this.plusMonths(j3);
    }

    public LocalDate plusMonths(long j2) {
        if (j2 == 0) {
            return this;
        }
        long j3 = (this.f49800a * 12) + (this.f49801b - 1) + j2;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return Z(aVar.f50048b.a(j$.com.android.tools.r8.a.F(j3, 12L), aVar), ((int) j$.com.android.tools.r8.a.O(j3, 12L)) + 1, this.f49802c);
    }

    @Override // j$.time.chrono.b
    public long toEpochDay() {
        long j2 = this.f49800a;
        long j3 = this.f49801b;
        long j4 = 365 * j2;
        long j5 = (((367 * j3) - 362) / 12) + (j2 >= 0 ? ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4 : j4 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))))) + (this.f49802c - 1);
        if (j3 > 2) {
            j5 = !isLeapYear() ? j5 - 2 : j5 - 1;
        }
        return j5 - 719528;
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        int i2 = this.f49800a;
        int iAbs = Math.abs(i2);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i2 > 9999) {
                sb.append('+');
            }
            sb.append(i2);
        } else if (i2 < 0) {
            sb.append(i2 - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i2 + 10000);
            sb.deleteCharAt(0);
        }
        short s = this.f49801b;
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        short s2 = this.f49802c;
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        LocalDate localDateM = M(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, localDateM);
        }
        switch (e.f49897b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return localDateM.toEpochDay() - toEpochDay();
            case 2:
                return (localDateM.toEpochDay() - toEpochDay()) / 7;
            case 3:
                return S(localDateM);
            case 4:
                return S(localDateM) / 12;
            case 5:
                return S(localDateM) / 120;
            case 6:
                return S(localDateM) / 1200;
            case 7:
                return S(localDateM) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return localDateM.D(aVar) - D(aVar);
            default:
                f.f("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return 0L;
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object x(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.n.f50070f ? this : j$.com.android.tools.r8.a.q(this, nVar);
    }

    public LocalDateTime atStartOfDay() {
        return LocalDateTime.N(this, LocalTime.MIDNIGHT);
    }
}
