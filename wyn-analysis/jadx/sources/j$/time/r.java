package j$.time;

import j$.time.chrono.AbstractC2901i;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* loaded from: classes2.dex */
public final class r implements Temporal, j$.time.temporal.m, Comparable, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;

    /* renamed from: a, reason: collision with root package name */
    private final k f37656a;

    /* renamed from: b, reason: collision with root package name */
    private final ZoneOffset f37657b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        r rVar = (r) obj;
        boolean zEquals = this.f37657b.equals(rVar.f37657b);
        k kVar = this.f37656a;
        k kVar2 = rVar.f37656a;
        if (zEquals) {
            return kVar.compareTo(kVar2);
        }
        int iCompare = Long.compare(U(), rVar.U());
        return iCompare == 0 ? kVar.compareTo(kVar2) : iCompare;
    }

    static {
        k kVar = k.f37640e;
        ZoneOffset zoneOffset = ZoneOffset.f37490g;
        kVar.getClass();
        R(kVar, zoneOffset);
        k kVar2 = k.f37641f;
        ZoneOffset zoneOffset2 = ZoneOffset.f37489f;
        kVar2.getClass();
        R(kVar2, zoneOffset2);
    }

    public static r R(k kVar, ZoneOffset zoneOffset) {
        return new r(kVar, zoneOffset);
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        r rVar;
        if (temporal instanceof r) {
            rVar = (r) temporal;
        } else {
            try {
                rVar = new r(k.T(temporal), ZoneOffset.Y(temporal));
            } catch (c e7) {
                throw new c("Unable to obtain OffsetTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e7);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            long jU = rVar.U() - U();
            switch (q.f37655a[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return jU;
                case 2:
                    return jU / 1000;
                case 3:
                    return jU / 1000000;
                case 4:
                    return jU / 1000000000;
                case 5:
                    return jU / 60000000000L;
                case 6:
                    return jU / 3600000000000L;
                case 7:
                    return jU / 43200000000000L;
                default:
                    throw new j$.time.temporal.s("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.between(this, rVar);
    }

    private r(k kVar, ZoneOffset zoneOffset) {
        this.f37656a = (k) Objects.requireNonNull(kVar, "time");
        this.f37657b = (ZoneOffset) Objects.requireNonNull(zoneOffset, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
    }

    private r V(k kVar, ZoneOffset zoneOffset) {
        return (this.f37656a == kVar && this.f37657b.equals(zoneOffset)) ? this : new r(kVar, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) qVar).T() || qVar == j$.time.temporal.a.OFFSET_SECONDS : qVar != null && qVar.t(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) qVar).o();
            }
            k kVar = this.f37656a;
            kVar.getClass();
            return j$.time.temporal.l.d(kVar, qVar);
        }
        return qVar.B(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int q(j$.time.temporal.q qVar) {
        return j$.time.temporal.l.a(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f37657b.Z();
            }
            return this.f37656a.w(qVar);
        }
        return qVar.s(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j8, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
            k kVar = this.f37656a;
            if (qVar == aVar) {
                return V(kVar, ZoneOffset.c0(((j$.time.temporal.a) qVar).R(j8)));
            }
            return V(kVar.d(j8, qVar), this.f37657b);
        }
        return (r) qVar.w(this, j8);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final r e(long j8, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return V(this.f37656a.e(j8, temporalUnit), this.f37657b);
        }
        return (r) temporalUnit.o(this, j8);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal o(long j8, ChronoUnit chronoUnit) {
        return j8 == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j8, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object B(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.h() || rVar == j$.time.temporal.l.j()) {
            return this.f37657b;
        }
        if (((rVar == j$.time.temporal.l.k()) || (rVar == j$.time.temporal.l.e())) || rVar == j$.time.temporal.l.f()) {
            return null;
        }
        if (rVar == j$.time.temporal.l.g()) {
            return this.f37656a;
        }
        if (rVar == j$.time.temporal.l.i()) {
            return ChronoUnit.NANOS;
        }
        return rVar.h(this);
    }

    @Override // j$.time.temporal.m
    public final Temporal D(Temporal temporal) {
        return temporal.d(this.f37656a.j0(), j$.time.temporal.a.NANO_OF_DAY).d(this.f37657b.Z(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    private long U() {
        return this.f37656a.j0() - (this.f37657b.Z() * 1000000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f37656a.equals(rVar.f37656a) && this.f37657b.equals(rVar.f37657b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f37656a.hashCode() ^ this.f37657b.hashCode();
    }

    public final String toString() {
        return this.f37656a.toString() + this.f37657b.toString();
    }

    private Object writeReplace() {
        return new t((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        this.f37656a.n0(objectOutput);
        this.f37657b.f0(objectOutput);
    }

    static r T(ObjectInput objectInput) {
        return new r(k.i0(objectInput), ZoneOffset.e0(objectInput));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal s(g gVar) {
        return (r) AbstractC2901i.a(gVar, this);
    }
}
