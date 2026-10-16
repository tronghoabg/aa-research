package j$.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.common.C;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class m implements Temporal, j$.time.temporal.k, Comparable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f50016c = 0;
    private static final long serialVersionUID = 7264499704384272492L;

    /* renamed from: a, reason: collision with root package name */
    public final LocalTime f50017a;

    /* renamed from: b, reason: collision with root package name */
    public final ZoneOffset f50018b;

    static {
        LocalTime localTime = LocalTime.f49807e;
        ZoneOffset zoneOffset = ZoneOffset.f49826g;
        localTime.getClass();
        new m(localTime, zoneOffset);
        LocalTime localTime2 = LocalTime.f49808f;
        ZoneOffset zoneOffset2 = ZoneOffset.f49825f;
        localTime2.getClass();
        new m(localTime2, zoneOffset2);
    }

    public m(LocalTime localTime, ZoneOffset zoneOffset) {
        this.f50017a = (LocalTime) Objects.requireNonNull(localTime, "time");
        this.f50018b = (ZoneOffset) Objects.requireNonNull(zoneOffset, TypedValues.CycleType.S_WAVE_OFFSET);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 9, this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final m b(long j2, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? M(this.f50017a.b(j2, temporalUnit), this.f50018b) : (m) temporalUnit.f(this, j2);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.m mVar) {
        return mVar instanceof j$.time.temporal.a ? mVar == j$.time.temporal.a.OFFSET_SECONDS ? this.f50018b.getTotalSeconds() : this.f50017a.D(mVar) : mVar.k(this);
    }

    public final long L() {
        return this.f50017a.W() - (this.f50018b.getTotalSeconds() * C.NANOS_PER_SECOND);
    }

    public final m M(LocalTime localTime, ZoneOffset zoneOffset) {
        return (this.f50017a == localTime && this.f50018b.equals(zoneOffset)) ? this : new m(localTime, zoneOffset);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j2, j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return (m) mVar.x(this, j2);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
        LocalTime localTime = this.f50017a;
        if (mVar != aVar) {
            return M(localTime.a(j2, mVar), this.f50018b);
        }
        j$.time.temporal.a aVar2 = (j$.time.temporal.a) mVar;
        return M(localTime, ZoneOffset.S(aVar2.f50048b.a(j2, aVar2)));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.m mVar) {
        return mVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) mVar).B() || mVar == j$.time.temporal.a.OFFSET_SECONDS : mVar != null && mVar.f(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        m mVar = (m) obj;
        ZoneOffset zoneOffset = mVar.f50018b;
        LocalTime localTime = mVar.f50017a;
        boolean zEquals = this.f50018b.equals(zoneOffset);
        LocalTime localTime2 = this.f50017a;
        if (zEquals) {
            return localTime2.compareTo(localTime);
        }
        int iCompare = Long.compare(L(), mVar.L());
        return iCompare == 0 ? localTime2.compareTo(localTime) : iCompare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f50017a.equals(mVar.f50017a) && this.f50018b.equals(mVar.f50018b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int f(j$.time.temporal.m mVar) {
        return j$.time.temporal.n.a(this, mVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: h */
    public final Temporal y(LocalDate localDate) {
        localDate.getClass();
        return (m) j$.com.android.tools.r8.a.a(localDate, this);
    }

    public final int hashCode() {
        return this.f50018b.f49827b ^ this.f50017a.hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return mVar.h(this);
        }
        if (mVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return ((j$.time.temporal.a) mVar).f50048b;
        }
        LocalTime localTime = this.f50017a;
        localTime.getClass();
        return j$.time.temporal.n.d(localTime, mVar);
    }

    @Override // j$.time.temporal.k
    public final Temporal m(Temporal temporal) {
        return temporal.a(this.f50017a.W(), j$.time.temporal.a.NANO_OF_DAY).a(this.f50018b.getTotalSeconds(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final String toString() {
        return this.f50017a.toString() + this.f50018b.f49828c;
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        m mVar;
        if (temporal instanceof m) {
            mVar = (m) temporal;
        } else {
            try {
                mVar = new m(LocalTime.M(temporal), ZoneOffset.P(temporal));
            } catch (c e2) {
                throw new c(j$.desugar.sun.nio.fs.h.b("Unable to obtain OffsetTime from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e2);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, mVar);
        }
        long jL = mVar.L() - L();
        switch (l.f50015a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jL;
            case 2:
                return jL / 1000;
            case 3:
                return jL / 1000000;
            case 4:
                return jL / C.NANOS_PER_SECOND;
            case 5:
                return jL / 60000000000L;
            case 6:
                return jL / 3600000000000L;
            case 7:
                return jL / 43200000000000L;
            default:
                f.f("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return 0L;
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object x(j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == j$.time.temporal.n.f50068d || nVar == j$.time.temporal.n.f50069e) {
            return this.f50018b;
        }
        if (((nVar == j$.time.temporal.n.f50065a) || (nVar == j$.time.temporal.n.f50066b)) || nVar == j$.time.temporal.n.f50070f) {
            return null;
        }
        return nVar == j$.time.temporal.n.f50071g ? this.f50017a : nVar == j$.time.temporal.n.f50067c ? ChronoUnit.NANOS : nVar.d(this);
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
