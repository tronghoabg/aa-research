package j$.time;

import androidx.compose.material3.internal.CalendarModelKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.common.C;
import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class LocalDateTime implements Temporal, j$.time.temporal.k, j$.time.chrono.e, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final LocalDateTime f49803c = N(LocalDate.f49798d, LocalTime.f49807e);

    /* renamed from: d, reason: collision with root package name */
    public static final LocalDateTime f49804d = N(LocalDate.f49799e, LocalTime.f49808f);
    private static final long serialVersionUID = 6207766400415563566L;

    /* renamed from: a, reason: collision with root package name */
    public final LocalDate f49805a;

    /* renamed from: b, reason: collision with root package name */
    public final LocalTime f49806b;

    public LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.f49805a = localDate;
        this.f49806b = localTime;
    }

    public static LocalDateTime L(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (temporalAccessor instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporalAccessor).toLocalDateTime();
        }
        if (temporalAccessor instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.M(temporalAccessor), LocalTime.M(temporalAccessor));
        } catch (c e2) {
            throw new c(j$.desugar.sun.nio.fs.h.b("Unable to obtain LocalDateTime from TemporalAccessor: ", String.valueOf(temporalAccessor), " of type ", temporalAccessor.getClass().getName()), e2);
        }
    }

    public static LocalDateTime N(LocalDate localDate, LocalTime localTime) {
        Objects.requireNonNull(localDate, "date");
        Objects.requireNonNull(localTime, "time");
        return new LocalDateTime(localDate, localTime);
    }

    public static LocalDateTime O(long j2, int i2, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, TypedValues.CycleType.S_WAVE_OFFSET);
        long j3 = i2;
        j$.time.temporal.a.NANO_OF_SECOND.z(j3);
        return new LocalDateTime(LocalDate.ofEpochDay(j$.com.android.tools.r8.a.F(j2 + zoneOffset.getTotalSeconds(), 86400L)), LocalTime.P((((int) j$.com.android.tools.r8.a.O(r5, 86400L)) * C.NANOS_PER_SECOND) + j3));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 5, this);
    }

    public final int B(LocalDateTime localDateTime) {
        int iB = this.f49805a.B(localDateTime.f49805a);
        return iB == 0 ? this.f49806b.compareTo(localDateTime.f49806b) : iB;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.m mVar) {
        return mVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) mVar).B() ? this.f49806b.D(mVar) : this.f49805a.D(mVar) : mVar.k(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.e eVar) {
        return eVar instanceof LocalDateTime ? B((LocalDateTime) eVar) : j$.com.android.tools.r8.a.e(this, eVar);
    }

    public final boolean M(j$.time.chrono.e eVar) {
        if (eVar instanceof LocalDateTime) {
            return B((LocalDateTime) eVar) < 0;
        }
        long epochDay = this.f49805a.toEpochDay();
        long epochDay2 = eVar.toLocalDate().toEpochDay();
        if (epochDay >= epochDay2) {
            return epochDay == epochDay2 && this.f49806b.W() < eVar.toLocalTime().W();
        }
        return true;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime b(long j2, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDateTime) temporalUnit.f(this, j2);
        }
        int i2 = g.f50007a[((ChronoUnit) temporalUnit).ordinal()];
        LocalTime localTime = this.f49806b;
        LocalDate localDate = this.f49805a;
        switch (i2) {
            case 1:
                return R(this.f49805a, 0L, 0L, 0L, j2);
            case 2:
                LocalDateTime localDateTimeT = T(localDate.W(j2 / 86400000000L), localTime);
                return localDateTimeT.R(localDateTimeT.f49805a, 0L, 0L, 0L, (j2 % 86400000000L) * 1000);
            case 3:
                LocalDateTime localDateTimeT2 = T(localDate.W(j2 / CalendarModelKt.MillisecondsIn24Hours), localTime);
                return localDateTimeT2.R(localDateTimeT2.f49805a, 0L, 0L, 0L, (j2 % CalendarModelKt.MillisecondsIn24Hours) * 1000000);
            case 4:
                return Q(j2);
            case 5:
                return R(this.f49805a, 0L, j2, 0L, 0L);
            case 6:
                return R(this.f49805a, j2, 0L, 0L, 0L);
            case 7:
                LocalDateTime localDateTimeT3 = T(localDate.W(j2 / 256), localTime);
                return localDateTimeT3.R(localDateTimeT3.f49805a, (j2 % 256) * 12, 0L, 0L, 0L);
            default:
                return T(localDate.b(j2, temporalUnit), localTime);
        }
    }

    public final LocalDateTime Q(long j2) {
        return R(this.f49805a, 0L, 0L, j2, 0L);
    }

    public final LocalDateTime R(LocalDate localDate, long j2, long j3, long j4, long j5) {
        long j6 = j2 | j3 | j4 | j5;
        LocalTime localTimeP = this.f49806b;
        if (j6 == 0) {
            return T(localDate, localTimeP);
        }
        long j7 = j3 / 1440;
        long j8 = j2 / 24;
        long j9 = (j3 % 1440) * 60000000000L;
        long j10 = ((j2 % 24) * 3600000000000L) + j9 + ((j4 % 86400) * C.NANOS_PER_SECOND) + (j5 % 86400000000000L);
        long jW = localTimeP.W();
        long j11 = j10 + jW;
        long jF = j$.com.android.tools.r8.a.F(j11, 86400000000000L) + j8 + j7 + (j4 / 86400) + (j5 / 86400000000000L);
        long jO = j$.com.android.tools.r8.a.O(j11, 86400000000000L);
        if (jO != jW) {
            localTimeP = LocalTime.P(jO);
        }
        return T(localDate.W(jF), localTimeP);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime a(long j2, j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return (LocalDateTime) mVar.x(this, j2);
        }
        boolean zB = ((j$.time.temporal.a) mVar).B();
        LocalTime localTime = this.f49806b;
        LocalDate localDate = this.f49805a;
        return zB ? T(localDate, localTime.a(j2, mVar)) : T(localDate.a(j2, mVar), localTime);
    }

    public final LocalDateTime T(LocalDate localDate, LocalTime localTime) {
        return (this.f49805a == localDate && this.f49806b == localTime) ? this : new LocalDateTime(localDate, localTime);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime y(j$.time.temporal.k kVar) {
        return kVar instanceof LocalDate ? T((LocalDate) kVar, this.f49806b) : kVar instanceof LocalTime ? T(this.f49805a, (LocalTime) kVar) : kVar instanceof LocalDateTime ? (LocalDateTime) kVar : (LocalDateTime) kVar.m(this);
    }

    @Override // j$.time.chrono.e
    /* renamed from: atZone, reason: merged with bridge method [inline-methods] */
    public ZonedDateTime A(ZoneId zoneId) {
        return ZonedDateTime.M(this, zoneId, null);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return mVar != null && mVar.f(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) mVar;
        return aVar.isDateBased() || aVar.B();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.f49805a.equals(localDateTime.f49805a) && this.f49806b.equals(localDateTime.f49806b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int f(j$.time.temporal.m mVar) {
        return mVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) mVar).B() ? this.f49806b.f(mVar) : this.f49805a.f(mVar) : j$.time.temporal.n.a(this, mVar);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.chrono.e
    public final Chronology getChronology() {
        return ((LocalDate) toLocalDate()).getChronology();
    }

    public final int hashCode() {
        return this.f49806b.hashCode() ^ this.f49805a.hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return mVar.h(this);
        }
        if (!((j$.time.temporal.a) mVar).B()) {
            return this.f49805a.k(mVar);
        }
        LocalTime localTime = this.f49806b;
        localTime.getClass();
        return j$.time.temporal.n.d(localTime, mVar);
    }

    @Override // j$.time.temporal.k
    public final Temporal m(Temporal temporal) {
        return temporal.a(toLocalDate().toEpochDay(), j$.time.temporal.a.EPOCH_DAY).a(toLocalTime().W(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // j$.time.chrono.e
    public /* synthetic */ long toEpochSecond(ZoneOffset zoneOffset) {
        return j$.com.android.tools.r8.a.u(this, zoneOffset);
    }

    public Instant toInstant(ZoneOffset zoneOffset) {
        return Instant.ofEpochSecond(toEpochSecond(zoneOffset), toLocalTime().f49813d);
    }

    @Override // j$.time.chrono.e
    public final j$.time.chrono.b toLocalDate() {
        return this.f49805a;
    }

    @Override // j$.time.chrono.e
    public final LocalTime toLocalTime() {
        return this.f49806b;
    }

    public final String toString() {
        return j$.desugar.sun.nio.fs.h.a(this.f49805a.toString(), ExifInterface.GPS_DIRECTION_TRUE, this.f49806b.toString());
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        LocalDate localDateW;
        long jQ;
        long j2;
        LocalDateTime localDateTimeL = L(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, localDateTimeL);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        int iCompareTo = chronoUnit.compareTo(ChronoUnit.DAYS);
        LocalTime localTime = this.f49806b;
        LocalDate localDate = this.f49805a;
        if (iCompareTo >= 0) {
            LocalDate localDate2 = localDateTimeL.f49805a;
            LocalTime localTime2 = localDateTimeL.f49806b;
            boolean z = false;
            if (localDate == null ? localDate2.toEpochDay() > localDate.toEpochDay() : localDate2.B(localDate) > 0) {
                z = true;
            }
            if (!z || localTime2.compareTo(localTime) >= 0) {
                boolean zQ = localDate2.Q(localDate);
                localDateW = localDate2;
                if (zQ) {
                    localDateW = localDate2;
                    if (localTime2.compareTo(localTime) > 0) {
                        localDateW = localDate2.W(1L);
                    }
                }
            } else {
                localDateW = localDate2.W(-1L);
            }
            return localDate.until(localDateW, temporalUnit);
        }
        LocalDate localDate3 = localDateTimeL.f49805a;
        LocalTime localTime3 = localDateTimeL.f49806b;
        localDate.getClass();
        long epochDay = localDate3.toEpochDay() - localDate.toEpochDay();
        if (epochDay == 0) {
            return localTime.until(localTime3, temporalUnit);
        }
        long jW = localTime3.W() - localTime.W();
        if (epochDay > 0) {
            jQ = epochDay - 1;
            j2 = jW + 86400000000000L;
        } else {
            jQ = epochDay + 1;
            j2 = jW - 86400000000000L;
        }
        switch (g.f50007a[chronoUnit.ordinal()]) {
            case 1:
                jQ = j$.com.android.tools.r8.a.Q(jQ, 86400000000000L);
                break;
            case 2:
                jQ = j$.com.android.tools.r8.a.Q(jQ, 86400000000L);
                j2 /= 1000;
                break;
            case 3:
                jQ = j$.com.android.tools.r8.a.Q(jQ, CalendarModelKt.MillisecondsIn24Hours);
                j2 /= 1000000;
                break;
            case 4:
                jQ = j$.com.android.tools.r8.a.Q(jQ, 86400L);
                j2 /= C.NANOS_PER_SECOND;
                break;
            case 5:
                jQ = j$.com.android.tools.r8.a.Q(jQ, 1440L);
                j2 /= 60000000000L;
                break;
            case 6:
                jQ = j$.com.android.tools.r8.a.Q(jQ, 24L);
                j2 /= 3600000000000L;
                break;
            case 7:
                jQ = j$.com.android.tools.r8.a.Q(jQ, 2L);
                j2 /= 43200000000000L;
                break;
        }
        return j$.com.android.tools.r8.a.P(jQ, j2);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object x(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.n.f50070f ? this.f49805a : j$.com.android.tools.r8.a.r(this, nVar);
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
}
