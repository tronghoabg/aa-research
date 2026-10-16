package j$.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class OffsetDateTime implements Temporal, j$.time.temporal.k, Comparable<OffsetDateTime>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f49816c = 0;
    private static final long serialVersionUID = 2287754244819255394L;

    /* renamed from: a, reason: collision with root package name */
    public final LocalDateTime f49817a;

    /* renamed from: b, reason: collision with root package name */
    public final ZoneOffset f49818b;

    static {
        LocalDateTime localDateTime = LocalDateTime.f49803c;
        ZoneOffset zoneOffset = ZoneOffset.f49826g;
        localDateTime.getClass();
        new OffsetDateTime(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.f49804d;
        ZoneOffset zoneOffset2 = ZoneOffset.f49825f;
        localDateTime2.getClass();
        new OffsetDateTime(localDateTime2, zoneOffset2);
    }

    public OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        this.f49817a = (LocalDateTime) Objects.requireNonNull(localDateTime, "dateTime");
        this.f49818b = (ZoneOffset) Objects.requireNonNull(zoneOffset, TypedValues.CycleType.S_WAVE_OFFSET);
    }

    public static OffsetDateTime B(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset zoneOffsetD = zoneId.getRules().d(instant);
        return new OffsetDateTime(LocalDateTime.O(instant.getEpochSecond(), instant.getNano(), zoneOffsetD), zoneOffsetD);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 10, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return mVar.k(this);
        }
        int i2 = k.f50014a[((j$.time.temporal.a) mVar).ordinal()];
        ZoneOffset zoneOffset = this.f49818b;
        LocalDateTime localDateTime = this.f49817a;
        return i2 != 1 ? i2 != 2 ? localDateTime.D(mVar) : zoneOffset.getTotalSeconds() : localDateTime.toEpochSecond(zoneOffset);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime b(long j2, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? M(this.f49817a.b(j2, temporalUnit), this.f49818b) : (OffsetDateTime) temporalUnit.f(this, j2);
    }

    public final OffsetDateTime M(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f49817a == localDateTime && this.f49818b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j2, j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return (OffsetDateTime) mVar.x(this, j2);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) mVar;
        int i2 = k.f50014a[aVar.ordinal()];
        ZoneOffset zoneOffset = this.f49818b;
        LocalDateTime localDateTime = this.f49817a;
        return i2 != 1 ? i2 != 2 ? M(localDateTime.a(j2, mVar), zoneOffset) : M(localDateTime, ZoneOffset.S(aVar.f50048b.a(j2, aVar))) : B(Instant.ofEpochSecond(j2, localDateTime.f49806b.f49813d), zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.m mVar) {
        if (mVar instanceof j$.time.temporal.a) {
            return true;
        }
        return mVar != null && mVar.f(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int iCompareTo;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        ZoneOffset zoneOffset = offsetDateTime2.f49818b;
        LocalDateTime localDateTime = offsetDateTime2.f49817a;
        ZoneOffset zoneOffset2 = this.f49818b;
        if (zoneOffset2.equals(zoneOffset)) {
            iCompareTo = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime2 = this.f49817a;
            int iCompare = Long.compare(localDateTime2.toEpochSecond(zoneOffset2), localDateTime.toEpochSecond(offsetDateTime2.f49818b));
            iCompareTo = iCompare == 0 ? localDateTime2.f49806b.f49813d - localDateTime.f49806b.f49813d : iCompare;
        }
        return iCompareTo == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : iCompareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.f49817a.equals(offsetDateTime.f49817a) && this.f49818b.equals(offsetDateTime.f49818b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int f(j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.n.a(this, mVar);
        }
        int i2 = k.f50014a[((j$.time.temporal.a) mVar).ordinal()];
        if (i2 != 1) {
            return i2 != 2 ? this.f49817a.f(mVar) : this.f49818b.getTotalSeconds();
        }
        f.f("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        return 0;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: h */
    public final Temporal y(LocalDate localDate) {
        boolean zC = j$.desugar.sun.nio.fs.h.c(localDate);
        LocalDateTime localDateTime = this.f49817a;
        ZoneOffset zoneOffset = this.f49818b;
        if (zC) {
            return M(localDateTime.y(localDate), zoneOffset);
        }
        localDate.getClass();
        return (OffsetDateTime) j$.com.android.tools.r8.a.a(localDate, this);
    }

    public final int hashCode() {
        return this.f49818b.f49827b ^ this.f49817a.hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(j$.time.temporal.m mVar) {
        return mVar instanceof j$.time.temporal.a ? (mVar == j$.time.temporal.a.INSTANT_SECONDS || mVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) mVar).f50048b : this.f49817a.k(mVar) : mVar.h(this);
    }

    @Override // j$.time.temporal.k
    public final Temporal m(Temporal temporal) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        LocalDateTime localDateTime = this.f49817a;
        return temporal.a(localDateTime.f49805a.toEpochDay(), aVar).a(localDateTime.f49806b.W(), j$.time.temporal.a.NANO_OF_DAY).a(this.f49818b.getTotalSeconds(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    public LocalDateTime toLocalDateTime() {
        return this.f49817a;
    }

    public final String toString() {
        return this.f49817a.toString() + this.f49818b.f49828c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14, types: [j$.time.OffsetDateTime] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        if (temporal instanceof OffsetDateTime) {
            temporal = (OffsetDateTime) temporal;
        } else {
            try {
                ZoneOffset zoneOffsetP = ZoneOffset.P(temporal);
                LocalDate localDate = (LocalDate) temporal.x(j$.time.temporal.n.f50070f);
                LocalTime localTime = (LocalTime) temporal.x(j$.time.temporal.n.f50071g);
                temporal = (localDate == null || localTime == null) ? B(Instant.L(temporal), zoneOffsetP) : new OffsetDateTime(LocalDateTime.N(localDate, localTime), zoneOffsetP);
            } catch (c e2) {
                throw new c(j$.desugar.sun.nio.fs.h.b("Unable to obtain OffsetDateTime from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e2);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, temporal);
        }
        ZoneOffset zoneOffset = temporal.f49818b;
        ZoneOffset zoneOffset2 = this.f49818b;
        OffsetDateTime offsetDateTime = temporal;
        if (!zoneOffset2.equals(zoneOffset)) {
            offsetDateTime = new OffsetDateTime(temporal.f49817a.Q(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds()), zoneOffset2);
        }
        return this.f49817a.until(offsetDateTime.f49817a, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object x(j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == j$.time.temporal.n.f50068d || nVar == j$.time.temporal.n.f50069e) {
            return this.f49818b;
        }
        if (nVar == j$.time.temporal.n.f50065a) {
            return null;
        }
        j$.desugar.sun.nio.fs.n nVar2 = j$.time.temporal.n.f50070f;
        LocalDateTime localDateTime = this.f49817a;
        return nVar == nVar2 ? localDateTime.f49805a : nVar == j$.time.temporal.n.f50071g ? localDateTime.f49806b : nVar == j$.time.temporal.n.f50066b ? j$.time.chrono.r.f49878d : nVar == j$.time.temporal.n.f50067c ? ChronoUnit.NANOS : nVar.d(this);
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
