package j$.time;

import j$.time.chrono.AbstractC2901i;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.InterfaceC2894b;
import j$.time.chrono.InterfaceC2897e;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;
import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* loaded from: classes2.dex */
public final class ZonedDateTime implements Temporal, ChronoZonedDateTime<g>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* renamed from: a, reason: collision with root package name */
    private final LocalDateTime f37493a;

    /* renamed from: b, reason: collision with root package name */
    private final ZoneOffset f37494b;

    /* renamed from: c, reason: collision with root package name */
    private final ZoneId f37495c;

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long Q() {
        return AbstractC2901i.p(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ boolean isBefore(ChronoZonedDateTime chronoZonedDateTime) {
        return AbstractC2901i.h(this, chronoZonedDateTime);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ChronoZonedDateTime<?> chronoZonedDateTime) {
        return AbstractC2901i.d(this, chronoZonedDateTime);
    }

    public static ZonedDateTime now(ZoneId zoneId) {
        a aVar;
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId == ZoneOffset.UTC) {
            aVar = a.f37496b;
        } else {
            aVar = new a(zoneId);
        }
        Objects.requireNonNull(aVar, "clock");
        aVar.getClass();
        return S(Instant.V(System.currentTimeMillis()), aVar.a());
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.m a() {
        return ((g) c()).a();
    }

    public static ZonedDateTime of(LocalDateTime localDateTime, ZoneId zoneId) {
        return T(localDateTime, zoneId, null);
    }

    public static ZonedDateTime of(int i5, int i10, int i11, int i12, int i13, int i14, int i15, ZoneId zoneId) {
        return T(LocalDateTime.e0(i5, i10, i11, i12, i13, i14, i15), zoneId, null);
    }

    public static ZonedDateTime T(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        j$.time.zone.f fVarS = zoneId.S();
        List listG = fVarS.g(localDateTime);
        if (listG.size() == 1) {
            zoneOffset = (ZoneOffset) listG.get(0);
        } else if (listG.size() == 0) {
            j$.time.zone.b bVarF = fVarS.f(localDateTime);
            localDateTime = localDateTime.i0(bVarF.s().s());
            zoneOffset = bVarF.t();
        } else if (zoneOffset == null || !listG.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) Objects.requireNonNull((ZoneOffset) listG.get(0), MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    public static ZonedDateTime S(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return D(instant.T(), instant.U(), zoneId);
    }

    private static ZonedDateTime D(long j8, int i5, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.S().d(Instant.X(j8, i5));
        return new ZonedDateTime(LocalDateTime.g0(j8, i5, zoneOffsetD), zoneId, zoneOffsetD);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final Instant toInstant() {
        return Instant.X(Q(), b().X());
    }

    public static ZonedDateTime R(Temporal temporal) {
        if (temporal instanceof ZonedDateTime) {
            return (ZonedDateTime) temporal;
        }
        try {
            ZoneId zoneIdR = ZoneId.R(temporal);
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            if (!temporal.g(aVar)) {
                return of(LocalDateTime.f0(g.T(temporal), k.T(temporal)), zoneIdR);
            }
            return D(temporal.w(aVar), temporal.q(j$.time.temporal.a.NANO_OF_SECOND), zoneIdR);
        } catch (c e7) {
            throw new c("Unable to obtain ZonedDateTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e7);
        }
    }

    private ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.f37493a = localDateTime;
        this.f37494b = zoneOffset;
        this.f37495c = zoneId;
    }

    private ZonedDateTime W(LocalDateTime localDateTime) {
        return T(localDateTime, this.f37495c, this.f37494b);
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
            return this.f37493a.t(qVar);
        }
        return qVar.B(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int q(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i5 = z.f37710a[((j$.time.temporal.a) qVar).ordinal()];
            if (i5 == 1) {
                throw new j$.time.temporal.s("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i5 == 2) {
                return this.f37494b.Z();
            }
            return this.f37493a.q(qVar);
        }
        return AbstractC2901i.e(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.s(this);
        }
        int i5 = z.f37710a[((j$.time.temporal.a) qVar).ordinal()];
        return i5 != 1 ? i5 != 2 ? this.f37493a.w(qVar) : this.f37494b.Z() : AbstractC2901i.p(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset i() {
        return this.f37494b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId u() {
        return this.f37495c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime k(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.f37495c.equals(zoneId) ? this : T(this.f37493a, zoneId, this.f37494b);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime j(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (this.f37495c.equals(zoneId)) {
            return this;
        }
        LocalDateTime localDateTime = this.f37493a;
        localDateTime.getClass();
        return D(AbstractC2901i.o(localDateTime, this.f37494b), localDateTime.Y(), zoneId);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final InterfaceC2897e G() {
        return this.f37493a;
    }

    public final LocalDateTime X() {
        return this.f37493a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final InterfaceC2894b c() {
        return this.f37493a.k0();
    }

    public int getYear() {
        return this.f37493a.a0();
    }

    public int getMonthValue() {
        return this.f37493a.X();
    }

    public int getDayOfMonth() {
        return this.f37493a.T();
    }

    public DayOfWeek getDayOfWeek() {
        return this.f37493a.U();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final k b() {
        return this.f37493a.b();
    }

    public int getHour() {
        return this.f37493a.V();
    }

    public int getMinute() {
        return this.f37493a.W();
    }

    public int getSecond() {
        return this.f37493a.Z();
    }

    public int getNano() {
        return this.f37493a.Y();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal s(g gVar) {
        return W(LocalDateTime.f0(gVar, this.f37493a.b()));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j8, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            int i5 = z.f37710a[aVar.ordinal()];
            ZoneId zoneId = this.f37495c;
            if (i5 == 1) {
                return D(j8, getNano(), zoneId);
            }
            LocalDateTime localDateTime = this.f37493a;
            if (i5 == 2) {
                ZoneOffset zoneOffsetC0 = ZoneOffset.c0(aVar.R(j8));
                return (zoneOffsetC0.equals(this.f37494b) || !zoneId.S().g(localDateTime).contains(zoneOffsetC0)) ? this : new ZonedDateTime(localDateTime, zoneId, zoneOffsetC0);
            }
            return W(localDateTime.d(j8, qVar));
        }
        return (ZonedDateTime) qVar.w(this, j8);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime e(long j8, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (ZonedDateTime) temporalUnit.o(this, j8);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        boolean z2 = chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER;
        LocalDateTime localDateTime = this.f37493a;
        if (z2) {
            return W(localDateTime.e(j8, temporalUnit));
        }
        LocalDateTime localDateTimeE = localDateTime.e(j8, temporalUnit);
        Objects.requireNonNull(localDateTimeE, "localDateTime");
        ZoneOffset zoneOffset = this.f37494b;
        Objects.requireNonNull(zoneOffset, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        ZoneId zoneId = this.f37495c;
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId.S().g(localDateTimeE).contains(zoneOffset)) {
            return new ZonedDateTime(localDateTimeE, zoneId, zoneOffset);
        }
        localDateTimeE.getClass();
        return D(AbstractC2901i.o(localDateTimeE, zoneOffset), localDateTimeE.Y(), zoneId);
    }

    public ZonedDateTime plusDays(long j8) {
        return W(this.f37493a.plusDays(j8));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal o(long j8, ChronoUnit chronoUnit) {
        return j8 == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j8, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object B(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.f()) {
            return this.f37493a.k0();
        }
        return AbstractC2901i.m(this, rVar);
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        ZonedDateTime zonedDateTimeR = R(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            ZonedDateTime zonedDateTimeJ = zonedDateTimeR.j(this.f37495c);
            ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
            int iCompareTo = chronoUnit.compareTo(ChronoUnit.DAYS);
            LocalDateTime localDateTime = this.f37493a;
            LocalDateTime localDateTime2 = zonedDateTimeJ.f37493a;
            if (iCompareTo >= 0 && chronoUnit != ChronoUnit.FOREVER) {
                return localDateTime.f(localDateTime2, temporalUnit);
            }
            return OffsetDateTime.R(localDateTime, this.f37494b).f(OffsetDateTime.R(localDateTime2, zonedDateTimeJ.f37494b), temporalUnit);
        }
        return temporalUnit.between(this, zonedDateTimeR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            if (this.f37493a.equals(zonedDateTime.f37493a) && this.f37494b.equals(zonedDateTime.f37494b) && this.f37495c.equals(zonedDateTime.f37495c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f37493a.hashCode() ^ this.f37494b.hashCode()) ^ Integer.rotateLeft(this.f37495c.hashCode(), 3);
    }

    public final String toString() {
        String string = this.f37493a.toString();
        ZoneOffset zoneOffset = this.f37494b;
        String str = string + zoneOffset.toString();
        ZoneId zoneId = this.f37495c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    private Object writeReplace() {
        return new t((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void Z(DataOutput dataOutput) {
        this.f37493a.o0(dataOutput);
        this.f37494b.f0(dataOutput);
        this.f37495c.W((ObjectOutput) dataOutput);
    }

    static ZonedDateTime V(ObjectInput objectInput) throws IOException {
        LocalDateTime localDateTime = LocalDateTime.f37480c;
        g gVar = g.f37632d;
        LocalDateTime localDateTimeF0 = LocalDateTime.f0(g.g0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.i0(objectInput));
        ZoneOffset zoneOffsetE0 = ZoneOffset.e0(objectInput);
        ZoneId zoneId = (ZoneId) t.a(objectInput);
        Objects.requireNonNull(localDateTimeF0, "localDateTime");
        Objects.requireNonNull(zoneOffsetE0, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        Objects.requireNonNull(zoneId, "zone");
        if ((zoneId instanceof ZoneOffset) && !zoneOffsetE0.equals(zoneId)) {
            throw new IllegalArgumentException("ZoneId must match ZoneOffset");
        }
        return new ZonedDateTime(localDateTimeF0, zoneId, zoneOffsetE0);
    }
}
