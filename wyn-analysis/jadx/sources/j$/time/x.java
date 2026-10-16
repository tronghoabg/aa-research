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
public final class x implements Temporal, j$.time.temporal.m, Comparable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f37704c = 0;
    private static final long serialVersionUID = 4183400860270640070L;

    /* renamed from: a, reason: collision with root package name */
    private final int f37705a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37706b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        x xVar = (x) obj;
        int i5 = this.f37705a - xVar.f37705a;
        return i5 == 0 ? this.f37706b - xVar.f37706b : i5;
    }

    static {
        j$.time.format.p pVar = new j$.time.format.p();
        pVar.l(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.z.EXCEEDS_PAD);
        pVar.e('-');
        pVar.k(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        pVar.t();
    }

    public static x S(int i5, int i10) {
        j$.time.temporal.a.YEAR.S(i5);
        j$.time.temporal.a.MONTH_OF_YEAR.S(i10);
        return new x(i5, i10);
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        x xVarS;
        if (temporal instanceof x) {
            xVarS = (x) temporal;
        } else {
            Objects.requireNonNull(temporal, "temporal");
            try {
                if (!j$.time.chrono.t.f37543d.equals(AbstractC2901i.q(temporal))) {
                    temporal = g.T(temporal);
                }
                xVarS = S(temporal.q(j$.time.temporal.a.YEAR), temporal.q(j$.time.temporal.a.MONTH_OF_YEAR));
            } catch (c e7) {
                throw new c("Unable to obtain YearMonth from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e7);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            long jR = xVarS.R() - R();
            switch (w.f37703b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return jR;
                case 2:
                    return jR / 12;
                case 3:
                    return jR / 120;
                case 4:
                    return jR / 1200;
                case 5:
                    return jR / 12000;
                case 6:
                    j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                    return xVarS.w(aVar) - w(aVar);
                default:
                    throw new j$.time.temporal.s("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.between(this, xVarS);
    }

    private x(int i5, int i10) {
        this.f37705a = i5;
        this.f37706b = i10;
    }

    private x W(int i5, int i10) {
        return (this.f37705a == i5 && this.f37706b == i10) ? this : new x(i5, i10);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.YEAR || qVar == j$.time.temporal.a.MONTH_OF_YEAR || qVar == j$.time.temporal.a.PROLEPTIC_MONTH || qVar == j$.time.temporal.a.YEAR_OF_ERA || qVar == j$.time.temporal.a.ERA : qVar != null && qVar.t(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.t.j(1L, this.f37705a <= 0 ? 1000000000L : 999999999L);
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
        int i5 = w.f37702a[((j$.time.temporal.a) qVar).ordinal()];
        if (i5 == 1) {
            return this.f37706b;
        }
        if (i5 == 2) {
            return R();
        }
        int i10 = this.f37705a;
        if (i5 == 3) {
            if (i10 < 1) {
                i10 = 1 - i10;
            }
            return i10;
        }
        if (i5 == 4) {
            return i10;
        }
        if (i5 == 5) {
            return i10 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.s(d.a("Unsupported field: ", qVar));
    }

    private long R() {
        return ((this.f37705a * 12) + this.f37706b) - 1;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public final x d(long j8, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (x) qVar.w(this, j8);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.S(j8);
        int i5 = w.f37702a[aVar.ordinal()];
        int i10 = this.f37705a;
        if (i5 == 1) {
            int i11 = (int) j8;
            j$.time.temporal.a.MONTH_OF_YEAR.S(i11);
            return W(i10, i11);
        }
        if (i5 == 2) {
            return U(j8 - R());
        }
        int i12 = this.f37706b;
        if (i5 == 3) {
            if (i10 < 1) {
                j8 = 1 - j8;
            }
            int i13 = (int) j8;
            j$.time.temporal.a.YEAR.S(i13);
            return W(i13, i12);
        }
        if (i5 == 4) {
            int i14 = (int) j8;
            j$.time.temporal.a.YEAR.S(i14);
            return W(i14, i12);
        }
        if (i5 != 5) {
            throw new j$.time.temporal.s(d.a("Unsupported field: ", qVar));
        }
        if (w(j$.time.temporal.a.ERA) == j8) {
            return this;
        }
        int i15 = 1 - i10;
        j$.time.temporal.a.YEAR.S(i15);
        return W(i15, i12);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final x e(long j8, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (x) temporalUnit.o(this, j8);
        }
        switch (w.f37703b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return U(j8);
            case 2:
                return V(j8);
            case 3:
                return V(b.g(j8, 10));
            case 4:
                return V(b.g(j8, 100));
            case 5:
                return V(b.g(j8, 1000));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(b.b(w(aVar), j8), aVar);
            default:
                throw new j$.time.temporal.s("Unsupported unit: " + temporalUnit);
        }
    }

    public final x V(long j8) {
        return j8 == 0 ? this : W(j$.time.temporal.a.YEAR.R(this.f37705a + j8), this.f37706b);
    }

    public final x U(long j8) {
        if (j8 == 0) {
            return this;
        }
        long j10 = (this.f37705a * 12) + (this.f37706b - 1) + j8;
        long j11 = 12;
        return W(j$.time.temporal.a.YEAR.R(b.f(j10, j11)), ((int) b.e(j10, j11)) + 1);
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
            return ChronoUnit.MONTHS;
        }
        return j$.time.temporal.l.c(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal D(Temporal temporal) {
        if (!AbstractC2901i.q(temporal).equals(j$.time.chrono.t.f37543d)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return temporal.d(R(), j$.time.temporal.a.PROLEPTIC_MONTH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f37705a == xVar.f37705a && this.f37706b == xVar.f37706b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f37706b << 27) ^ this.f37705a;
    }

    public final String toString() {
        int i5 = this.f37705a;
        int iAbs = Math.abs(i5);
        StringBuilder sb2 = new StringBuilder(9);
        if (iAbs >= 1000) {
            sb2.append(i5);
        } else if (i5 < 0) {
            sb2.append(i5 - 10000);
            sb2.deleteCharAt(1);
        } else {
            sb2.append(i5 + 10000);
            sb2.deleteCharAt(0);
        }
        int i10 = this.f37706b;
        sb2.append(i10 < 10 ? "-0" : "-");
        sb2.append(i10);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new t((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void Y(DataOutput dataOutput) {
        dataOutput.writeInt(this.f37705a);
        dataOutput.writeByte(this.f37706b);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal s(g gVar) {
        return (x) AbstractC2901i.a(gVar, this);
    }
}
