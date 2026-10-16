package j$.time.chrono;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
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
public final class l implements j, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    public final transient g a;
    public final transient ZoneOffset b;
    public final transient ZoneId c;

    public l(ZoneId zoneId, ZoneOffset zoneOffset, g gVar) {
        Objects.a(gVar, "dateTime");
        this.a = gVar;
        this.b = zoneOffset;
        Objects.a(zoneId, "zone");
        this.c = zoneId;
    }

    public static l p(a aVar, Temporal temporal) {
        l lVar = (l) temporal;
        if (aVar.equals(lVar.getChronology())) {
            return lVar;
        }
        throw new ClassCastException(j$.time.e.a("Chronology mismatch, required: ", aVar.getId(), ", actual: ", lVar.getChronology().getId()));
    }

    public static l r(ZoneId zoneId, ZoneOffset zoneOffset, g gVar) {
        Objects.a(gVar, "localDateTime");
        Objects.a(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new l(zoneId, (ZoneOffset) zoneId, gVar);
        }
        ZoneRules rules = zoneId.getRules();
        LocalDateTime localDateTimeS = LocalDateTime.s(gVar);
        List listF = rules.f(localDateTimeS);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() == 0) {
            j$.time.zone.b bVarE = rules.e(localDateTimeS);
            gVar = gVar.A(gVar.a, 0L, 0L, Duration.ofSeconds(bVarE.d.getTotalSeconds() - bVarE.c.getTotalSeconds()).getSeconds(), 0L);
            zoneOffset = bVarE.d;
        } else {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listF.get(0);
            }
            gVar = gVar;
        }
        Objects.a(zoneOffset, "offset");
        return new l(zoneId, zoneOffset, gVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static l s(a aVar, Instant instant, ZoneId zoneId) {
        ZoneOffset offset = zoneId.getRules().getOffset(instant);
        Objects.a(offset, "offset");
        return new l(zoneId, offset, (g) aVar.y(LocalDateTime.H(instant.getEpochSecond(), instant.getNano(), offset)));
    }

    private Object writeReplace() {
        return new e0((byte) 3, this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final l b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return p(getChronology(), temporalUnit.k(this, j));
        }
        return p(getChronology(), this.a.b(j, temporalUnit).p(this));
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(this);
        }
        int i = i.a[((j$.time.temporal.a) nVar).ordinal()];
        return i != 1 ? i != 2 ? this.a.C(nVar) : this.b.getTotalSeconds() : j$.desugar.sun.nio.fs.g.q(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return p(getChronology(), nVar.r(this, j));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        int i = k.a[aVar.ordinal()];
        if (i == 1) {
            return b(j - j$.desugar.sun.nio.fs.g.q(this), ChronoUnit.SECONDS);
        }
        ZoneId zoneId = this.c;
        g gVar = this.a;
        if (i != 2) {
            return r(zoneId, this.b, gVar.a(j, nVar));
        }
        ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(aVar.b.a(j, aVar));
        gVar.getClass();
        return s(getChronology(), Instant.ofEpochSecond(gVar.B(zoneOffsetOfTotalSeconds), gVar.toLocalTime().d), zoneId);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return j$.desugar.sun.nio.fs.g.e(this, (j) obj);
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
        Objects.a(temporal, "endExclusive");
        j jVarO = getChronology().O(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            return this.a.e(jVarO.g(this.b).toLocalDateTime(), temporalUnit);
        }
        Objects.a(temporalUnit, "unit");
        return temporalUnit.h(this, jVarO);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && j$.desugar.sun.nio.fs.g.e(this, (j) obj) == 0;
    }

    @Override // j$.time.chrono.j
    public final j g(ZoneId zoneId) {
        if (this.c.equals(zoneId)) {
            return this;
        }
        g gVar = this.a;
        gVar.getClass();
        return s(getChronology(), Instant.ofEpochSecond(gVar.B(this.b), gVar.toLocalTime().d), zoneId);
    }

    @Override // j$.time.chrono.j
    public final a getChronology() {
        return this.a.a.getChronology();
    }

    @Override // j$.time.chrono.j
    public final ZoneOffset getOffset() {
        return this.b;
    }

    @Override // j$.time.chrono.j
    public final ZoneId getZone() {
        return this.c;
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ int h(j$.time.temporal.n nVar) {
        return j$.desugar.sun.nio.fs.g.g(this, nVar);
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c.hashCode(), 3) ^ (this.a.hashCode() ^ this.b.b);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: k */
    public final Temporal x(LocalDate localDate) {
        return p(getChronology(), localDate.p(this));
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q l(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? (nVar == j$.time.temporal.a.INSTANT_SECONDS || nVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) nVar).b : this.a.l(nVar) : nVar.k(this);
    }

    @Override // j$.time.chrono.j
    public final /* synthetic */ long toEpochSecond() {
        return j$.desugar.sun.nio.fs.g.q(this);
    }

    @Override // j$.time.chrono.j
    public final b toLocalDate() {
        return this.a.a;
    }

    @Override // j$.time.chrono.j
    public final e toLocalDateTime() {
        return this.a;
    }

    @Override // j$.time.chrono.j
    public final LocalTime toLocalTime() {
        return ((g) toLocalDateTime()).toLocalTime();
    }

    public final String toString() {
        String string = this.a.toString();
        ZoneOffset zoneOffset = this.b;
        String str = string + zoneOffset.c;
        ZoneId zoneId = this.c;
        return zoneOffset != zoneId ? j$.time.e.a(str, "[", zoneId.toString(), "]") : str;
    }

    @Override // j$.time.chrono.j
    public final j v(ZoneId zoneId) {
        return r(zoneId, this.b, this.a);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ Object w(j$.desugar.sun.nio.fs.n nVar) {
        return j$.desugar.sun.nio.fs.g.n(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal y(long j, ChronoUnit chronoUnit) {
        return p(getChronology(), j$.time.temporal.o.b(this, j, chronoUnit));
    }
}
