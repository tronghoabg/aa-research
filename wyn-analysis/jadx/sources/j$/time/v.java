package j$.time;

import j$.time.chrono.AbstractC2901i;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class v implements Temporal, j$.time.temporal.m, Comparable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f37700b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* renamed from: a, reason: collision with root package name */
    private final int f37701a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f37701a - ((v) obj).f37701a;
    }

    static {
        j$.time.format.p pVar = new j$.time.format.p();
        pVar.l(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.z.EXCEEDS_PAD);
        pVar.t();
    }

    public static v R(int i5) {
        j$.time.temporal.a.YEAR.S(i5);
        return new v(i5);
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        v vVarR;
        if (temporal instanceof v) {
            vVarR = (v) temporal;
        } else {
            Objects.requireNonNull(temporal, "temporal");
            try {
                if (!j$.time.chrono.t.f37543d.equals(AbstractC2901i.q(temporal))) {
                    temporal = g.T(temporal);
                }
                vVarR = R(temporal.q(j$.time.temporal.a.YEAR));
            } catch (c e7) {
                throw new c("Unable to obtain Year from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e7);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            long j8 = vVarR.f37701a - this.f37701a;
            int i5 = u.f37699b[((ChronoUnit) temporalUnit).ordinal()];
            if (i5 == 1) {
                return j8;
            }
            if (i5 == 2) {
                return j8 / 10;
            }
            if (i5 == 3) {
                return j8 / 100;
            }
            if (i5 == 4) {
                return j8 / 1000;
            }
            if (i5 == 5) {
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return vVarR.w(aVar) - w(aVar);
            }
            throw new j$.time.temporal.s("Unsupported unit: " + temporalUnit);
        }
        return temporalUnit.between(this, vVarR);
    }

    private v(int i5) {
        this.f37701a = i5;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.YEAR || qVar == j$.time.temporal.a.YEAR_OF_ERA || qVar == j$.time.temporal.a.ERA : qVar != null && qVar.t(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.t.j(1L, this.f37701a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.l.d(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int q(j$.time.temporal.q qVar) {
        return t(qVar).a(w(qVar), qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.s(this);
        }
        int i5 = u.f37698a[((j$.time.temporal.a) qVar).ordinal()];
        int i10 = this.f37701a;
        if (i5 == 1) {
            if (i10 < 1) {
                i10 = 1 - i10;
            }
            return i10;
        }
        if (i5 == 2) {
            return i10;
        }
        if (i5 == 3) {
            return i10 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.s(d.a("Unsupported field: ", qVar));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final v d(long j8, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (v) qVar.w(this, j8);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.S(j8);
        int i5 = u.f37698a[aVar.ordinal()];
        int i10 = this.f37701a;
        if (i5 == 1) {
            if (i10 < 1) {
                j8 = 1 - j8;
            }
            return R((int) j8);
        }
        if (i5 == 2) {
            return R((int) j8);
        }
        if (i5 == 3) {
            return w(j$.time.temporal.a.ERA) == j8 ? this : R(1 - i10);
        }
        throw new j$.time.temporal.s(d.a("Unsupported field: ", qVar));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final v e(long j8, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (v) temporalUnit.o(this, j8);
        }
        int i5 = u.f37699b[((ChronoUnit) temporalUnit).ordinal()];
        if (i5 == 1) {
            return T(j8);
        }
        if (i5 == 2) {
            return T(b.g(j8, 10));
        }
        if (i5 == 3) {
            return T(b.g(j8, 100));
        }
        if (i5 == 4) {
            return T(b.g(j8, 1000));
        }
        if (i5 == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return d(b.b(w(aVar), j8), aVar);
        }
        throw new j$.time.temporal.s("Unsupported unit: " + temporalUnit);
    }

    public final v T(long j8) {
        return j8 == 0 ? this : R(j$.time.temporal.a.YEAR.R(this.f37701a + j8));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal o(long j8, ChronoUnit chronoUnit) {
        return j8 == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j8, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object B(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.e()) {
            return j$.time.chrono.t.f37543d;
        }
        if (rVar == j$.time.temporal.l.i()) {
            return ChronoUnit.YEARS;
        }
        return j$.time.temporal.l.c(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal D(Temporal temporal) {
        if (!AbstractC2901i.q(temporal).equals(j$.time.chrono.t.f37543d)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return temporal.d(this.f37701a, j$.time.temporal.a.YEAR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            if (this.f37701a == ((v) obj).f37701a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f37701a;
    }

    public final String toString() {
        return Integer.toString(this.f37701a);
    }

    private Object writeReplace() {
        return new t((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void V(DataOutput dataOutput) {
        dataOutput.writeInt(this.f37701a);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal s(g gVar) {
        return (v) AbstractC2901i.a(gVar, this);
    }
}
