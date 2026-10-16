package j$.time;

import j$.time.chrono.AbstractC2901i;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class Instant implements Temporal, j$.time.temporal.m, Comparable<Instant>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final Instant f37477c = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;

    /* renamed from: a, reason: collision with root package name */
    private final long f37478a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37479b;

    public static Instant now() {
        a.f37496b.getClass();
        return V(System.currentTimeMillis());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int iCompare = Long.compare(this.f37478a, instant2.f37478a);
        return iCompare != 0 ? iCompare : this.f37479b - instant2.f37479b;
    }

    static {
        X(-31557014167219200L, 0L);
        X(31556889864403199L, 999999999L);
    }

    public static Instant W(long j8) {
        return R(j8, 0);
    }

    public static Instant X(long j8, long j10) {
        return R(b.b(j8, b.f(j10, 1000000000L)), (int) b.e(j10, 1000000000L));
    }

    public static Instant V(long j8) {
        long j10 = 1000;
        return R(b.f(j8, j10), ((int) b.e(j8, j10)) * 1000000);
    }

    public static Instant S(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return X(temporalAccessor.w(j$.time.temporal.a.INSTANT_SECONDS), temporalAccessor.q(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (c e7) {
            throw new c("Unable to obtain Instant from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e7);
        }
    }

    private static Instant R(long j8, int i5) {
        if ((i5 | j8) == 0) {
            return f37477c;
        }
        if (j8 < -31557014167219200L || j8 > 31556889864403199L) {
            throw new c("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j8, i5);
    }

    private Instant(long j8, int i5) {
        this.f37478a = j8;
        this.f37479b = i5;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.NANO_OF_SECOND || qVar == j$.time.temporal.a.MICRO_OF_SECOND || qVar == j$.time.temporal.a.MILLI_OF_SECOND : qVar != null && qVar.t(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        return j$.time.temporal.l.d(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int q(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.l.d(this, qVar).a(qVar.s(this), qVar);
        }
        int i5 = e.f37557a[((j$.time.temporal.a) qVar).ordinal()];
        int i10 = this.f37479b;
        if (i5 == 1) {
            return i10;
        }
        if (i5 == 2) {
            return i10 / 1000;
        }
        if (i5 == 3) {
            return i10 / 1000000;
        }
        if (i5 == 4) {
            j$.time.temporal.a.INSTANT_SECONDS.R(this.f37478a);
        }
        throw new j$.time.temporal.s(d.a("Unsupported field: ", qVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        int i5;
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.s(this);
        }
        int i10 = e.f37557a[((j$.time.temporal.a) qVar).ordinal()];
        int i11 = this.f37479b;
        if (i10 == 1) {
            return i11;
        }
        if (i10 == 2) {
            i5 = i11 / 1000;
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    return this.f37478a;
                }
                throw new j$.time.temporal.s(d.a("Unsupported field: ", qVar));
            }
            i5 = i11 / 1000000;
        }
        return i5;
    }

    public final long T() {
        return this.f37478a;
    }

    public final int U() {
        return this.f37479b;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j8, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (Instant) qVar.w(this, j8);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.S(j8);
        int i5 = e.f37557a[aVar.ordinal()];
        int i10 = this.f37479b;
        long j10 = this.f37478a;
        if (i5 != 1) {
            if (i5 == 2) {
                int i11 = ((int) j8) * 1000;
                if (i11 != i10) {
                    return R(j10, i11);
                }
            } else if (i5 == 3) {
                int i12 = ((int) j8) * 1000000;
                if (i12 != i10) {
                    return R(j10, i12);
                }
            } else {
                if (i5 != 4) {
                    throw new j$.time.temporal.s(d.a("Unsupported field: ", qVar));
                }
                if (j8 != j10) {
                    return R(j8, i10);
                }
            }
        } else if (j8 != i10) {
            return R(j10, (int) j8);
        }
        return this;
    }

    public Instant truncatedTo(TemporalUnit temporalUnit) {
        if (temporalUnit == ChronoUnit.NANOS) {
            return this;
        }
        Duration durationQ = temporalUnit.q();
        if (durationQ.s() > 86400) {
            throw new j$.time.temporal.s("Unit is too large to be used for truncation");
        }
        long jD = durationQ.D();
        if (86400000000000L % jD != 0) {
            throw new j$.time.temporal.s("Unit must divide into a standard day without remainder");
        }
        long j8 = ((this.f37478a % 86400) * 1000000000) + this.f37479b;
        return Y(0L, (b.f(j8, jD) * jD) - j8);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final Instant e(long j8, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (Instant) temporalUnit.o(this, j8);
        }
        switch (e.f37558b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return Y(0L, j8);
            case 2:
                return Y(j8 / 1000000, (j8 % 1000000) * 1000);
            case 3:
                return Y(j8 / 1000, (j8 % 1000) * 1000000);
            case 4:
                return Y(j8, 0L);
            case 5:
                return Y(b.g(j8, 60), 0L);
            case 6:
                return Y(b.g(j8, 3600), 0L);
            case 7:
                return Y(b.g(j8, 43200), 0L);
            case 8:
                return Y(b.g(j8, 86400), 0L);
            default:
                throw new j$.time.temporal.s("Unsupported unit: " + temporalUnit);
        }
    }

    private Instant Y(long j8, long j10) {
        if ((j8 | j10) == 0) {
            return this;
        }
        return X(b.b(b.b(this.f37478a, j8), j10 / 1000000000), this.f37479b + (j10 % 1000000000));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal o(long j8, ChronoUnit chronoUnit) {
        return j8 == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j8, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object B(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.i()) {
            return ChronoUnit.NANOS;
        }
        if (rVar == j$.time.temporal.l.e() || rVar == j$.time.temporal.l.k() || rVar == j$.time.temporal.l.j() || rVar == j$.time.temporal.l.h() || rVar == j$.time.temporal.l.f() || rVar == j$.time.temporal.l.g()) {
            return null;
        }
        return rVar.h(this);
    }

    @Override // j$.time.temporal.m
    public final Temporal D(Temporal temporal) {
        return temporal.d(this.f37478a, j$.time.temporal.a.INSTANT_SECONDS).d(this.f37479b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        Instant instantS = S(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            int i5 = e.f37558b[((ChronoUnit) temporalUnit).ordinal()];
            int i10 = this.f37479b;
            long j8 = this.f37478a;
            switch (i5) {
                case 1:
                    return b.b(b.g(b.h(instantS.f37478a, j8), 1000000000L), instantS.f37479b - i10);
                case 2:
                    return b.b(b.g(b.h(instantS.f37478a, j8), 1000000000L), instantS.f37479b - i10) / 1000;
                case 3:
                    return b.h(instantS.toEpochMilli(), toEpochMilli());
                case 4:
                    return a0(instantS);
                case 5:
                    return a0(instantS) / 60;
                case 6:
                    return a0(instantS) / 3600;
                case 7:
                    return a0(instantS) / 43200;
                case 8:
                    return a0(instantS) / 86400;
                default:
                    throw new j$.time.temporal.s("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.between(this, instantS);
    }

    private long a0(Instant instant) {
        long jH = b.h(instant.f37478a, this.f37478a);
        long j8 = instant.f37479b - this.f37479b;
        return (jH <= 0 || j8 >= 0) ? (jH >= 0 || j8 <= 0) ? jH : jH + 1 : jH - 1;
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.S(this, zoneOffset);
    }

    public long toEpochMilli() {
        long j8 = this.f37478a;
        return (j8 >= 0 || this.f37479b <= 0) ? b.b(b.g(j8, 1000), r5 / 1000000) : b.b(b.g(j8 + 1, 1000), (r5 / 1000000) - 1000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.f37478a == instant.f37478a && this.f37479b == instant.f37479b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f37478a;
        return (this.f37479b * 51) + ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return DateTimeFormatter.f37562f.format(this);
    }

    private Object writeReplace() {
        return new t((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void b0(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.f37478a);
        dataOutput.writeInt(this.f37479b);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal s(g gVar) {
        return (Instant) AbstractC2901i.a(gVar, this);
    }
}
