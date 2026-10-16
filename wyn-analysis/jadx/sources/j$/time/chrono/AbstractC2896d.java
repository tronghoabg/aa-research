package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.Serializable;
import org.apache.tika.utils.StringUtils;

/* renamed from: j$.time.chrono.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2896d implements InterfaceC2894b, Temporal, j$.time.temporal.m, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object B(j$.time.temporal.r rVar) {
        return AbstractC2901i.k(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ Temporal D(Temporal temporal) {
        return AbstractC2901i.a(this, temporal);
    }

    @Override // java.lang.Comparable
    /* renamed from: O */
    public final /* synthetic */ int compareTo(InterfaceC2894b interfaceC2894b) {
        return AbstractC2901i.b(this, interfaceC2894b);
    }

    abstract InterfaceC2894b T(long j8);

    abstract InterfaceC2894b U(long j8);

    abstract InterfaceC2894b V(long j8);

    @Override // j$.time.chrono.InterfaceC2894b, j$.time.temporal.TemporalAccessor
    public /* synthetic */ boolean g(j$.time.temporal.q qVar) {
        return AbstractC2901i.i(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int q(j$.time.temporal.q qVar) {
        return j$.time.temporal.l.a(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ j$.time.temporal.t t(j$.time.temporal.q qVar) {
        return j$.time.temporal.l.d(this, qVar);
    }

    static InterfaceC2894b R(m mVar, Temporal temporal) {
        InterfaceC2894b interfaceC2894b = (InterfaceC2894b) temporal;
        if (mVar.equals(interfaceC2894b.a())) {
            return interfaceC2894b;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + mVar.n() + ", actual: " + interfaceC2894b.a().n());
    }

    AbstractC2896d() {
    }

    @Override // j$.time.temporal.Temporal
    public InterfaceC2894b e(long j8, TemporalUnit temporalUnit) {
        boolean z2 = temporalUnit instanceof ChronoUnit;
        if (!z2) {
            if (!z2) {
                return R(a(), temporalUnit.o(this, j8));
            }
            throw new j$.time.temporal.s("Unsupported unit: " + temporalUnit);
        }
        switch (AbstractC2895c.f37513a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return T(j8);
            case 2:
                return T(j$.time.b.g(j8, 7));
            case 3:
                return U(j8);
            case 4:
                return V(j8);
            case 5:
                return V(j$.time.b.g(j8, 10));
            case 6:
                return V(j$.time.b.g(j8, 100));
            case 7:
                return V(j$.time.b.g(j8, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(j$.time.b.b(w(aVar), j8), (j$.time.temporal.q) aVar);
            default:
                throw new j$.time.temporal.s("Unsupported unit: " + temporalUnit);
        }
    }

    @Override // j$.time.chrono.InterfaceC2894b
    public n E() {
        return a().P(j$.time.temporal.l.a(this, j$.time.temporal.a.ERA));
    }

    @Override // j$.time.chrono.InterfaceC2894b, j$.time.temporal.Temporal
    public long f(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        InterfaceC2894b interfaceC2894bR = a().r(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.requireNonNull(temporalUnit, "unit");
            return temporalUnit.between(this, interfaceC2894bR);
        }
        switch (AbstractC2895c.f37513a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return interfaceC2894bR.x() - x();
            case 2:
                return (interfaceC2894bR.x() - x()) / 7;
            case 3:
                return S(interfaceC2894bR);
            case 4:
                return S(interfaceC2894bR) / 12;
            case 5:
                return S(interfaceC2894bR) / 120;
            case 6:
                return S(interfaceC2894bR) / 1200;
            case 7:
                return S(interfaceC2894bR) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return interfaceC2894bR.w(aVar) - w(aVar);
            default:
                throw new j$.time.temporal.s("Unsupported unit: " + temporalUnit);
        }
    }

    private long S(InterfaceC2894b interfaceC2894b) {
        if (a().K(j$.time.temporal.a.MONTH_OF_YEAR).d() != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        long jW = w(aVar) * 32;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_MONTH;
        return (((interfaceC2894b.w(aVar) * 32) + interfaceC2894b.q(aVar2)) - (jW + j$.time.temporal.l.a(this, aVar2))) / 32;
    }

    @Override // j$.time.chrono.InterfaceC2894b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC2894b) && AbstractC2901i.b(this, (InterfaceC2894b) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC2894b
    public int hashCode() {
        long jX = x();
        return ((int) (jX ^ (jX >>> 32))) ^ a().hashCode();
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: l */
    public InterfaceC2894b s(j$.time.temporal.m mVar) {
        return R(a(), mVar.D(this));
    }

    @Override // j$.time.chrono.InterfaceC2894b
    public String toString() {
        long jW = w(j$.time.temporal.a.YEAR_OF_ERA);
        long jW2 = w(j$.time.temporal.a.MONTH_OF_YEAR);
        long jW3 = w(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(a().toString());
        sb2.append(StringUtils.SPACE);
        sb2.append(E());
        sb2.append(StringUtils.SPACE);
        sb2.append(jW);
        sb2.append(jW2 < 10 ? "-0" : "-");
        sb2.append(jW2);
        sb2.append(jW3 < 10 ? "-0" : "-");
        sb2.append(jW3);
        return sb2.toString();
    }

    @Override // j$.time.temporal.Temporal
    public InterfaceC2894b d(long j8, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.s(j$.time.d.a("Unsupported field: ", qVar));
        }
        return R(a(), qVar.w(this, j8));
    }

    @Override // j$.time.chrono.InterfaceC2894b
    public InterfaceC2894b I(j$.time.temporal.p pVar) {
        return R(a(), pVar.o(this));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public InterfaceC2894b o(long j8, TemporalUnit temporalUnit) {
        return R(a(), j$.time.temporal.l.b(this, j8, temporalUnit));
    }

    @Override // j$.time.chrono.InterfaceC2894b
    public InterfaceC2897e z(j$.time.k kVar) {
        return C2899g.S(this, kVar);
    }

    @Override // j$.time.chrono.InterfaceC2894b
    public long x() {
        return w(j$.time.temporal.a.EPOCH_DAY);
    }
}
