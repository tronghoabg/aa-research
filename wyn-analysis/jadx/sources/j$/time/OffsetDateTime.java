package j$.time;

import j$.time.chrono.AbstractC2901i;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* loaded from: classes2.dex */
public final class OffsetDateTime implements Temporal, j$.time.temporal.m, Comparable<OffsetDateTime>, Serializable {
    private static final long serialVersionUID = 2287754244819255394L;

    /* renamed from: a, reason: collision with root package name */
    private final LocalDateTime f37484a;

    /* renamed from: b, reason: collision with root package name */
    private final ZoneOffset f37485b;

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int iX;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        ZoneOffset zoneOffset = offsetDateTime2.f37485b;
        ZoneOffset zoneOffset2 = this.f37485b;
        if (zoneOffset2.equals(zoneOffset)) {
            iX = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.f37484a;
            localDateTime.getClass();
            long jO = AbstractC2901i.o(localDateTime, zoneOffset2);
            LocalDateTime localDateTime2 = offsetDateTime2.f37484a;
            localDateTime2.getClass();
            int iCompare = Long.compare(jO, AbstractC2901i.o(localDateTime2, offsetDateTime2.f37485b));
            iX = iCompare == 0 ? localDateTime.b().X() - localDateTime2.b().X() : iCompare;
        }
        return iX == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : iX;
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.f37480c;
        ZoneOffset zoneOffset = ZoneOffset.f37490g;
        localDateTime.getClass();
        R(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.f37481d;
        ZoneOffset zoneOffset2 = ZoneOffset.f37489f;
        localDateTime2.getClass();
        R(localDateTime2, zoneOffset2);
    }

    public static OffsetDateTime R(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime S(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset zoneOffsetD = zoneId.S().d(instant);
        return new OffsetDateTime(LocalDateTime.g0(instant.T(), instant.U(), zoneOffsetD), zoneOffsetD);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15, types: [j$.time.OffsetDateTime] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        if (temporal instanceof OffsetDateTime) {
            temporal = (OffsetDateTime) temporal;
        } else {
            try {
                ZoneOffset zoneOffsetY = ZoneOffset.Y(temporal);
                g gVar = (g) temporal.B(j$.time.temporal.l.f());
                k kVar = (k) temporal.B(j$.time.temporal.l.g());
                if (gVar != null && kVar != null) {
                    temporal = new OffsetDateTime(LocalDateTime.f0(gVar, kVar), zoneOffsetY);
                } else {
                    temporal = S(Instant.S(temporal), zoneOffsetY);
                }
            } catch (c e7) {
                throw new c("Unable to obtain OffsetDateTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e7);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            ZoneOffset zoneOffset = temporal.f37485b;
            ZoneOffset zoneOffset2 = this.f37485b;
            OffsetDateTime offsetDateTime = temporal;
            if (!zoneOffset2.equals(zoneOffset)) {
                offsetDateTime = new OffsetDateTime(temporal.f37484a.i0(zoneOffset2.Z() - zoneOffset.Z()), zoneOffset2);
            }
            return this.f37484a.f(offsetDateTime.f37484a, temporalUnit);
        }
        return temporalUnit.between(this, temporal);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        this.f37484a = (LocalDateTime) Objects.requireNonNull(localDateTime, "dateTime");
        this.f37485b = (ZoneOffset) Objects.requireNonNull(zoneOffset, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
    }

    private OffsetDateTime V(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f37484a == localDateTime && this.f37485b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return true;
        }
        return qVar != null && qVar.t(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) qVar).o();
            }
            return this.f37484a.t(qVar);
        }
        return qVar.B(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int q(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i5 = p.f37654a[((j$.time.temporal.a) qVar).ordinal()];
            if (i5 == 1) {
                throw new j$.time.temporal.s("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i5 == 2) {
                return this.f37485b.Z();
            }
            return this.f37484a.q(qVar);
        }
        return j$.time.temporal.l.a(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.s(this);
        }
        int i5 = p.f37654a[((j$.time.temporal.a) qVar).ordinal()];
        ZoneOffset zoneOffset = this.f37485b;
        LocalDateTime localDateTime = this.f37484a;
        if (i5 != 1) {
            return i5 != 2 ? localDateTime.w(qVar) : zoneOffset.Z();
        }
        localDateTime.getClass();
        return AbstractC2901i.o(localDateTime, zoneOffset);
    }

    public LocalDateTime toLocalDateTime() {
        return this.f37484a;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal s(g gVar) {
        return V(this.f37484a.m0(gVar), this.f37485b);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j8, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            int i5 = p.f37654a[aVar.ordinal()];
            ZoneOffset zoneOffset = this.f37485b;
            LocalDateTime localDateTime = this.f37484a;
            if (i5 == 1) {
                return S(Instant.X(j8, localDateTime.Y()), zoneOffset);
            }
            if (i5 == 2) {
                return V(localDateTime, ZoneOffset.c0(aVar.R(j8)));
            }
            return V(localDateTime.d(j8, qVar), zoneOffset);
        }
        return (OffsetDateTime) qVar.w(this, j8);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime e(long j8, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return V(this.f37484a.e(j8, temporalUnit), this.f37485b);
        }
        return (OffsetDateTime) temporalUnit.o(this, j8);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal o(long j8, ChronoUnit chronoUnit) {
        return j8 == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j8, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object B(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.h() || rVar == j$.time.temporal.l.j()) {
            return this.f37485b;
        }
        if (rVar == j$.time.temporal.l.k()) {
            return null;
        }
        j$.time.temporal.r rVarF = j$.time.temporal.l.f();
        LocalDateTime localDateTime = this.f37484a;
        if (rVar == rVarF) {
            return localDateTime.k0();
        }
        if (rVar == j$.time.temporal.l.g()) {
            return localDateTime.b();
        }
        if (rVar == j$.time.temporal.l.e()) {
            return j$.time.chrono.t.f37543d;
        }
        if (rVar == j$.time.temporal.l.i()) {
            return ChronoUnit.NANOS;
        }
        return rVar.h(this);
    }

    @Override // j$.time.temporal.m
    public final Temporal D(Temporal temporal) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        LocalDateTime localDateTime = this.f37484a;
        return temporal.d(localDateTime.k0().x(), aVar).d(localDateTime.b().j0(), j$.time.temporal.a.NANO_OF_DAY).d(this.f37485b.Z(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.f37484a.equals(offsetDateTime.f37484a) && this.f37485b.equals(offsetDateTime.f37485b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f37484a.hashCode() ^ this.f37485b.hashCode();
    }

    public final String toString() {
        return this.f37484a.toString() + this.f37485b.toString();
    }

    private Object writeReplace() {
        return new t((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        this.f37484a.o0(objectOutput);
        this.f37485b.f0(objectOutput);
    }

    static OffsetDateTime U(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.f37480c;
        g gVar = g.f37632d;
        return new OffsetDateTime(LocalDateTime.f0(g.g0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.i0(objectInput)), ZoneOffset.e0(objectInput));
    }
}
