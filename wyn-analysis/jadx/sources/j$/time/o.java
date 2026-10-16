package j$.time;

import j$.time.chrono.AbstractC2901i;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class o implements TemporalAccessor, j$.time.temporal.m, Comparable, Serializable {
    private static final long serialVersionUID = -939150713474957432L;

    /* renamed from: a, reason: collision with root package name */
    private final int f37652a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37653b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        o oVar = (o) obj;
        int i5 = this.f37652a - oVar.f37652a;
        return i5 == 0 ? this.f37653b - oVar.f37653b : i5;
    }

    static {
        j$.time.format.p pVar = new j$.time.format.p();
        pVar.f("--");
        pVar.k(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        pVar.e('-');
        pVar.k(j$.time.temporal.a.DAY_OF_MONTH, 2);
        pVar.t();
    }

    private o(int i5, int i10) {
        this.f37652a = i5;
        this.f37653b = i10;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.MONTH_OF_YEAR || qVar == j$.time.temporal.a.DAY_OF_MONTH : qVar != null && qVar.t(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return qVar.o();
        }
        if (qVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return j$.time.temporal.l.d(this, qVar);
        }
        m mVarU = m.U(this.f37652a);
        mVarU.getClass();
        int i5 = l.f37648a[mVarU.ordinal()];
        return j$.time.temporal.t.k(i5 != 1 ? (i5 == 2 || i5 == 3 || i5 == 4 || i5 == 5) ? 30 : 31 : 28, m.U(r5).T());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int q(j$.time.temporal.q qVar) {
        return t(qVar).a(w(qVar), qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        int i5;
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.s(this);
        }
        int i10 = n.f37651a[((j$.time.temporal.a) qVar).ordinal()];
        if (i10 == 1) {
            i5 = this.f37653b;
        } else {
            if (i10 != 2) {
                throw new j$.time.temporal.s(d.a("Unsupported field: ", qVar));
            }
            i5 = this.f37652a;
        }
        return i5;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object B(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.e()) {
            return j$.time.chrono.t.f37543d;
        }
        return j$.time.temporal.l.c(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal D(Temporal temporal) {
        if (!AbstractC2901i.q(temporal).equals(j$.time.chrono.t.f37543d)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        Temporal temporalD = temporal.d(this.f37652a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return temporalD.d(Math.min(temporalD.t(aVar).d(), this.f37653b), aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f37652a == oVar.f37652a && this.f37653b == oVar.f37653b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f37652a << 6) + this.f37653b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(10);
        sb2.append("--");
        int i5 = this.f37652a;
        sb2.append(i5 < 10 ? "0" : "");
        sb2.append(i5);
        int i10 = this.f37653b;
        sb2.append(i10 < 10 ? "-0" : "-");
        sb2.append(i10);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new t((byte) 13, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void S(DataOutput dataOutput) {
        dataOutput.writeByte(this.f37652a);
        dataOutput.writeByte(this.f37653b);
    }

    static o R(ObjectInput objectInput) throws IOException {
        byte b5 = objectInput.readByte();
        byte b10 = objectInput.readByte();
        m mVarU = m.U(b5);
        Objects.requireNonNull(mVarU, "month");
        j$.time.temporal.a.DAY_OF_MONTH.S(b10);
        if (b10 > mVarU.T()) {
            throw new c("Illegal value for DayOfMonth field, value " + ((int) b10) + " is not valid for month " + mVarU.name());
        }
        return new o(mVarU.getValue(), b10);
    }
}
