package j$.time.chrono;

import androidx.constraintlayout.core.motion.utils.TypedValues;
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

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class k implements ChronoZonedDateTime, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* renamed from: a, reason: collision with root package name */
    public final transient g f49859a;

    /* renamed from: b, reason: collision with root package name */
    public final transient ZoneOffset f49860b;

    /* renamed from: c, reason: collision with root package name */
    public final transient ZoneId f49861c;

    public k(ZoneId zoneId, ZoneOffset zoneOffset, g gVar) {
        this.f49859a = (g) Objects.requireNonNull(gVar, "dateTime");
        this.f49860b = (ZoneOffset) Objects.requireNonNull(zoneOffset, TypedValues.CycleType.S_WAVE_OFFSET);
        this.f49861c = (ZoneId) Objects.requireNonNull(zoneId, "zone");
    }

    public static k B(ZoneId zoneId, ZoneOffset zoneOffset, g gVar) {
        Objects.requireNonNull(gVar, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new k(zoneId, (ZoneOffset) zoneId, gVar);
        }
        ZoneRules rules = zoneId.getRules();
        LocalDateTime localDateTimeL = LocalDateTime.L(gVar);
        List listF = rules.f(localDateTimeL);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() == 0) {
            Object objE = rules.e(localDateTimeL);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            gVar = gVar.M(gVar.f49847a, 0L, 0L, Duration.ofSeconds(bVar.f50102d.getTotalSeconds() - bVar.f50101c.getTotalSeconds()).getSeconds(), 0L);
            zoneOffset = bVar.f50102d;
        } else {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listF.get(0);
            }
            gVar = gVar;
        }
        Objects.requireNonNull(zoneOffset, TypedValues.CycleType.S_WAVE_OFFSET);
        return new k(zoneId, zoneOffset, gVar);
    }

    public static k L(Chronology chronology, Instant instant, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.getRules().d(instant);
        Objects.requireNonNull(zoneOffsetD, TypedValues.CycleType.S_WAVE_OFFSET);
        return new k(zoneId, zoneOffsetD, (g) chronology.F(LocalDateTime.O(instant.getEpochSecond(), instant.getNano(), zoneOffsetD)));
    }

    public static k m(Chronology chronology, Temporal temporal) {
        k kVar = (k) temporal;
        if (chronology.equals(kVar.getChronology())) {
            return kVar;
        }
        throw new ClassCastException(j$.desugar.sun.nio.fs.h.b("Chronology mismatch, required: ", chronology.getId(), ", actual: ", kVar.getChronology().getId()));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new d0((byte) 3, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return mVar.k(this);
        }
        int i2 = i.f49856a[((j$.time.temporal.a) mVar).ordinal()];
        return i2 != 1 ? i2 != 2 ? ((g) toLocalDateTime()).D(mVar) : getOffset().getTotalSeconds() : toEpochSecond();
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final k b(long j2, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return m(getChronology(), temporalUnit.f(this, j2));
        }
        return m(getChronology(), this.f49859a.b(j2, temporalUnit).m(this));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j2, j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return m(getChronology(), mVar.x(this, j2));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) mVar;
        int i2 = j.f49858a[aVar.ordinal()];
        if (i2 == 1) {
            return b(j2 - j$.com.android.tools.r8.a.v(this), ChronoUnit.SECONDS);
        }
        ZoneId zoneId = this.f49861c;
        g gVar = this.f49859a;
        if (i2 != 2) {
            return B(zoneId, this.f49860b, gVar.a(j2, mVar));
        }
        ZoneOffset zoneOffsetS = ZoneOffset.S(aVar.f50048b.a(j2, aVar));
        gVar.getClass();
        return L(getChronology(), Instant.ofEpochSecond(gVar.toEpochSecond(zoneOffsetS), gVar.toLocalTime().f49813d), zoneId);
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
        if (this.f49861c.equals(zoneId)) {
            return this;
        }
        g gVar = this.f49859a;
        gVar.getClass();
        return L(getChronology(), Instant.ofEpochSecond(gVar.toEpochSecond(this.f49860b), gVar.toLocalTime().f49813d), zoneId);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoZonedDateTime) && j$.com.android.tools.r8.a.f(this, (ChronoZonedDateTime) obj) == 0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int f(j$.time.temporal.m mVar) {
        return j$.com.android.tools.r8.a.j(this, mVar);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final Chronology getChronology() {
        return this.f49859a.f49847a.getChronology();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset getOffset() {
        return this.f49860b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId getZone() {
        return this.f49861c;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: h */
    public final Temporal y(LocalDate localDate) {
        return m(getChronology(), localDate.m(this));
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f49861c.hashCode(), 3) ^ (this.f49859a.hashCode() ^ this.f49860b.f49827b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(j$.time.temporal.m mVar) {
        return mVar instanceof j$.time.temporal.a ? (mVar == j$.time.temporal.a.INSTANT_SECONDS || mVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) mVar).f50048b : this.f49859a.k(mVar) : mVar.h(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long toEpochSecond() {
        return j$.com.android.tools.r8.a.v(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final b toLocalDate() {
        return this.f49859a.f49847a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final e toLocalDateTime() {
        return this.f49859a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final LocalTime toLocalTime() {
        return ((g) toLocalDateTime()).toLocalTime();
    }

    public final String toString() {
        String string = this.f49859a.toString();
        ZoneOffset zoneOffset = this.f49860b;
        String str = string + zoneOffset.f49828c;
        ZoneId zoneId = this.f49861c;
        return zoneOffset != zoneId ? j$.desugar.sun.nio.fs.h.b(str, "[", zoneId.toString(), "]") : str;
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoZonedDateTime chronoZonedDateTimeL = getChronology().l(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            return this.f49859a.until(chronoZonedDateTimeL.d(this.f49860b).toLocalDateTime(), temporalUnit);
        }
        Objects.requireNonNull(temporalUnit, "unit");
        return temporalUnit.between(this, chronoZonedDateTimeL);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime w(ZoneId zoneId) {
        return B(zoneId, this.f49860b, this.f49859a);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object x(j$.desugar.sun.nio.fs.n nVar) {
        return j$.com.android.tools.r8.a.s(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal z(long j2, ChronoUnit chronoUnit) {
        return m(getChronology(), j$.time.temporal.n.b(this, j2, chronoUnit));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ int compareTo(ChronoZonedDateTime chronoZonedDateTime) {
        return j$.com.android.tools.r8.a.f(this, chronoZonedDateTime);
    }
}
