package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.Serializable;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public abstract class d implements b, Temporal, j$.time.temporal.l, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    public static b r(a aVar, Temporal temporal) {
        b bVar = (b) temporal;
        if (aVar.equals(bVar.getChronology())) {
            return bVar;
        }
        throw new ClassCastException(j$.time.e.a("Chronology mismatch, expected: ", aVar.getId(), ", actual: ", bVar.getChronology().getId()));
    }

    public abstract b A(long j);

    public abstract b B(long j);

    @Override // j$.time.chrono.b
    public e D(LocalTime localTime) {
        return new g(this, localTime);
    }

    @Override // j$.time.chrono.b
    public b F(TemporalAmount temporalAmount) {
        return r(getChronology(), temporalAmount.h(this));
    }

    @Override // java.lang.Comparable
    /* renamed from: G */
    public final /* synthetic */ int compareTo(b bVar) {
        return j$.desugar.sun.nio.fs.g.c(this, bVar);
    }

    public abstract b H(long j);

    @Override // j$.time.temporal.Temporal
    public b a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return r(getChronology(), nVar.r(this, j));
        }
        j$.time.g.e("Unsupported field: ".concat(String.valueOf(nVar)));
        return null;
    }

    @Override // j$.time.temporal.Temporal
    public b b(long j, TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof ChronoUnit;
        if (!z) {
            if (!z) {
                return r(getChronology(), temporalUnit.k(this, j));
            }
            j$.time.g.e("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
            return null;
        }
        switch (c.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return A(j);
            case 2:
                return A(j$.desugar.sun.nio.fs.g.H(j, 7L));
            case 3:
                return B(j);
            case 4:
                return H(j);
            case 5:
                return H(j$.desugar.sun.nio.fs.g.H(j, 10L));
            case 6:
                return H(j$.desugar.sun.nio.fs.g.H(j, 100L));
            case 7:
                return H(j$.desugar.sun.nio.fs.g.H(j, 1000L));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a(j$.desugar.sun.nio.fs.g.G(C(aVar), j), (j$.time.temporal.n) aVar);
            default:
                j$.time.g.e("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return null;
        }
    }

    @Override // j$.time.chrono.b, j$.time.temporal.k
    public /* synthetic */ boolean d(j$.time.temporal.n nVar) {
        return j$.desugar.sun.nio.fs.g.j(this, nVar);
    }

    @Override // j$.time.chrono.b, j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.a(temporal, "endExclusive");
        b bVarL = getChronology().l(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.a(temporalUnit, "unit");
            return temporalUnit.h(this, bVarL);
        }
        switch (c.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return bVarL.toEpochDay() - toEpochDay();
            case 2:
                return (bVarL.toEpochDay() - toEpochDay()) / 7;
            case 3:
                return s(bVarL);
            case 4:
                return s(bVarL) / 12;
            case 5:
                return s(bVarL) / 120;
            case 6:
                return s(bVarL) / 1200;
            case 7:
                return s(bVarL) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return bVarL.C(aVar) - C(aVar);
            default:
                j$.time.g.e("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return 0L;
        }
    }

    @Override // j$.time.chrono.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && j$.desugar.sun.nio.fs.g.c(this, (b) obj) == 0;
    }

    @Override // j$.time.chrono.b
    public m getEra() {
        return getChronology().w(j$.time.temporal.o.a(this, j$.time.temporal.a.ERA));
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ int h(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.a(this, nVar);
    }

    @Override // j$.time.chrono.b
    public int hashCode() {
        long epochDay = toEpochDay();
        return getChronology().hashCode() ^ ((int) (epochDay ^ (epochDay >>> 32)));
    }

    @Override // j$.time.chrono.b
    public boolean isLeapYear() {
        return getChronology().isLeapYear(C(j$.time.temporal.a.YEAR));
    }

    @Override // j$.time.temporal.k
    public /* synthetic */ j$.time.temporal.q l(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.d(this, nVar);
    }

    @Override // j$.time.chrono.b
    public int lengthOfYear() {
        return isLeapYear() ? 366 : 365;
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Temporal p(Temporal temporal) {
        return j$.desugar.sun.nio.fs.g.a(this, temporal);
    }

    public final long s(b bVar) {
        if (getChronology().C(j$.time.temporal.a.MONTH_OF_YEAR).d != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        long jC = C(aVar) * 32;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_MONTH;
        return (((bVar.C(aVar) * 32) + bVar.h(aVar2)) - (jC + j$.time.temporal.o.a(this, aVar2))) / 32;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: t */
    public b y(long j, TemporalUnit temporalUnit) {
        return r(getChronology(), j$.time.temporal.o.b(this, j, temporalUnit));
    }

    @Override // j$.time.chrono.b
    public long toEpochDay() {
        return C(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        long jC = C(j$.time.temporal.a.YEAR_OF_ERA);
        long jC2 = C(j$.time.temporal.a.MONTH_OF_YEAR);
        long jC3 = C(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(getChronology().toString());
        sb.append(" ");
        sb.append(getEra());
        sb.append(" ");
        sb.append(jC);
        sb.append(jC2 < 10 ? "-0" : "-");
        sb.append(jC2);
        sb.append(jC3 < 10 ? "-0" : "-");
        sb.append(jC3);
        return sb.toString();
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ Object w(j$.desugar.sun.nio.fs.n nVar) {
        return j$.desugar.sun.nio.fs.g.l(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    public b x(j$.time.temporal.l lVar) {
        return r(getChronology(), lVar.p(this));
    }
}
