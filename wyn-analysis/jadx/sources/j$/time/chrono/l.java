package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;
import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* loaded from: classes2.dex */
final class l implements ChronoZonedDateTime, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* renamed from: a, reason: collision with root package name */
    private final transient C2899g f37524a;

    /* renamed from: b, reason: collision with root package name */
    private final transient ZoneOffset f37525b;

    /* renamed from: c, reason: collision with root package name */
    private final transient ZoneId f37526c;

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object B(j$.time.temporal.r rVar) {
        return AbstractC2901i.m(this, rVar);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long Q() {
        return AbstractC2901i.p(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ boolean isBefore(ChronoZonedDateTime chronoZonedDateTime) {
        return AbstractC2901i.h(this, chronoZonedDateTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int q(j$.time.temporal.q qVar) {
        return AbstractC2901i.e(this, qVar);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ChronoZonedDateTime<?> chronoZonedDateTime) {
        return AbstractC2901i.d(this, chronoZonedDateTime);
    }

    static ChronoZonedDateTime R(ZoneId zoneId, ZoneOffset zoneOffset, C2899g c2899g) {
        Objects.requireNonNull(c2899g, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new l(zoneId, (ZoneOffset) zoneId, c2899g);
        }
        j$.time.zone.f fVarS = zoneId.S();
        LocalDateTime localDateTimeS = LocalDateTime.S(c2899g);
        List listG = fVarS.g(localDateTimeS);
        if (listG.size() == 1) {
            zoneOffset = (ZoneOffset) listG.get(0);
        } else if (listG.size() == 0) {
            j$.time.zone.b bVarF = fVarS.f(localDateTimeS);
            c2899g = c2899g.U(bVarF.s().s());
            zoneOffset = bVarF.t();
        } else if (zoneOffset == null || !listG.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) listG.get(0);
        }
        Objects.requireNonNull(zoneOffset, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        return new l(zoneId, zoneOffset, c2899g);
    }

    static l S(m mVar, Instant instant, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.S().d(instant);
        Objects.requireNonNull(zoneOffsetD, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        return new l(zoneId, zoneOffsetD, (C2899g) mVar.C(LocalDateTime.g0(instant.T(), instant.U(), zoneOffsetD)));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) qVar).o();
            }
            return ((C2899g) G()).t(qVar);
        }
        return qVar.B(this);
    }

    static l D(m mVar, Temporal temporal) {
        l lVar = (l) temporal;
        if (mVar.equals(lVar.a())) {
            return lVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + mVar.n() + ", actual: " + lVar.a().n());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i5 = AbstractC2902j.f37522a[((j$.time.temporal.a) qVar).ordinal()];
            if (i5 == 1) {
                return Q();
            }
            if (i5 == 2) {
                return i().Z();
            }
            return ((C2899g) G()).w(qVar);
        }
        return qVar.s(this);
    }

    private l(ZoneId zoneId, ZoneOffset zoneOffset, C2899g c2899g) {
        this.f37524a = (C2899g) Objects.requireNonNull(c2899g, "dateTime");
        this.f37525b = (ZoneOffset) Objects.requireNonNull(zoneOffset, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        this.f37526c = (ZoneId) Objects.requireNonNull(zoneId, "zone");
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset i() {
        return this.f37525b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final InterfaceC2894b c() {
        return ((C2899g) G()).c();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.k b() {
        return ((C2899g) G()).b();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final InterfaceC2897e G() {
        return this.f37524a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId u() {
        return this.f37526c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final m a() {
        return c().a();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime k(ZoneId zoneId) {
        return R(zoneId, this.f37525b, this.f37524a);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime j(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (this.f37526c.equals(zoneId)) {
            return this;
        }
        return S(a(), this.f37524a.W(this.f37525b), zoneId);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return true;
        }
        return qVar != null && qVar.t(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j8, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return D(a(), qVar.w(this, j8));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        int i5 = AbstractC2903k.f37523a[aVar.ordinal()];
        if (i5 == 1) {
            return e(j8 - AbstractC2901i.p(this), ChronoUnit.SECONDS);
        }
        ZoneId zoneId = this.f37526c;
        C2899g c2899g = this.f37524a;
        if (i5 != 2) {
            return R(zoneId, this.f37525b, c2899g.d(j8, qVar));
        }
        return S(a(), c2899g.W(ZoneOffset.c0(aVar.R(j8))), zoneId);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final ChronoZonedDateTime e(long j8, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return D(a(), this.f37524a.e(j8, temporalUnit).D(this));
        }
        return D(a(), temporalUnit.o(this, j8));
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoZonedDateTime chronoZonedDateTimeA = a().A(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            return this.f37524a.f(chronoZonedDateTimeA.j(this.f37525b).G(), temporalUnit);
        }
        Objects.requireNonNull(temporalUnit, "unit");
        return temporalUnit.between(this, chronoZonedDateTimeA);
    }

    private Object writeReplace() {
        return new F((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.f37524a);
        objectOutput.writeObject(this.f37525b);
        objectOutput.writeObject(this.f37526c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoZonedDateTime) && AbstractC2901i.d(this, (ChronoZonedDateTime) obj) == 0;
    }

    public final int hashCode() {
        return (this.f37524a.hashCode() ^ this.f37525b.hashCode()) ^ Integer.rotateLeft(this.f37526c.hashCode(), 3);
    }

    public final String toString() {
        String string = this.f37524a.toString();
        ZoneOffset zoneOffset = this.f37525b;
        String str = string + zoneOffset.toString();
        ZoneId zoneId = this.f37526c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal s(j$.time.g gVar) {
        return D(a(), gVar.D(this));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal o(long j8, ChronoUnit chronoUnit) {
        return D(a(), j$.time.temporal.l.b(this, j8, chronoUnit));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final Instant toInstant() {
        return Instant.X(Q(), b().X());
    }
}
