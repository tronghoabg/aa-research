package j$.time.temporal;

import j$.time.format.c0;
import j$.time.format.d0;
import java.util.HashMap;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class r implements n {
    public static final q f = q.f(1, 7);
    public static final q g = q.g(0, 4, 6);
    public static final q h = q.g(0, 52, 54);
    public static final q i = q.g(1, 52, 53);
    public final String a;
    public final s b;
    public final TemporalUnit c;
    public final TemporalUnit d;
    public final q e;

    public r(String str, s sVar, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, q qVar) {
        this.a = str;
        this.b = sVar;
        this.c = temporalUnit;
        this.d = temporalUnit2;
        this.e = qVar;
    }

    public static int a(int i2, int i3) {
        return ((i3 - 1) + (i2 + 7)) / 7;
    }

    public final int b(k kVar) {
        return o.e(kVar.h(a.DAY_OF_WEEK) - this.b.a.getValue()) + 1;
    }

    public final int c(k kVar) {
        int iB = b(kVar);
        int iH = kVar.h(a.YEAR);
        a aVar = a.DAY_OF_YEAR;
        int iH2 = kVar.h(aVar);
        int i2 = i(iH2, iB);
        int iA = a(i2, iH2);
        return iA == 0 ? iH - 1 : iA >= a(i2, ((int) kVar.l(aVar).d) + this.b.b) ? iH + 1 : iH;
    }

    public final int d(k kVar) {
        int iA;
        int iB = b(kVar);
        a aVar = a.DAY_OF_YEAR;
        int iH = kVar.h(aVar);
        int i2 = i(iH, iB);
        int iA2 = a(i2, iH);
        return iA2 == 0 ? d(j$.desugar.sun.nio.fs.g.u(kVar).l(kVar).y(iH, ChronoUnit.DAYS)) : (iA2 <= 50 || iA2 < (iA = a(i2, ((int) kVar.l(aVar).d) + this.b.b))) ? iA2 : (iA2 - iA) + 1;
    }

    public final j$.time.chrono.b e(j$.time.chrono.a aVar, int i2, int i3, int i4) {
        j$.time.chrono.b bVarK = aVar.k(i2, 1, 1);
        int i5 = i(1, b(bVarK));
        int i6 = i4 - 1;
        return bVarK.b(((Math.min(i3, a(i5, bVarK.lengthOfYear() + this.b.b) - 1) - 1) * 7) + i6 + (-i5), (TemporalUnit) ChronoUnit.DAYS);
    }

    public final q f(k kVar, a aVar) {
        int i2 = i(kVar.h(aVar), b(kVar));
        q qVarL = kVar.l(aVar);
        return q.f(a(i2, (int) qVarL.a), a(i2, (int) qVarL.d));
    }

    public final q g(k kVar) {
        a aVar = a.DAY_OF_YEAR;
        if (!kVar.d(aVar)) {
            return h;
        }
        int iB = b(kVar);
        int iH = kVar.h(aVar);
        int i2 = i(iH, iB);
        int iA = a(i2, iH);
        if (iA == 0) {
            return g(j$.desugar.sun.nio.fs.g.u(kVar).l(kVar).y(iH + 7, ChronoUnit.DAYS));
        }
        return iA >= a(i2, this.b.b + ((int) kVar.l(aVar).d)) ? g(j$.desugar.sun.nio.fs.g.u(kVar).l(kVar).b((r0 - iH) + 8, (TemporalUnit) ChronoUnit.DAYS)) : q.f(1L, r1 - 1);
    }

    @Override // j$.time.temporal.n
    public final boolean h(k kVar) {
        if (!kVar.d(a.DAY_OF_WEEK)) {
            return false;
        }
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            return true;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return kVar.d(a.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return kVar.d(a.DAY_OF_YEAR);
        }
        if (temporalUnit == s.h) {
            return kVar.d(a.DAY_OF_YEAR);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return kVar.d(a.YEAR);
        }
        return false;
    }

    public final int i(int i2, int i3) {
        int iE = o.e(i2 - i3);
        return iE + 1 > this.b.b ? 7 - iE : -iE;
    }

    @Override // j$.time.temporal.n
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.n
    public final q k(k kVar) {
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            return this.e;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return f(kVar, a.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return f(kVar, a.DAY_OF_YEAR);
        }
        if (temporalUnit == s.h) {
            return g(kVar);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return a.YEAR.b;
        }
        throw new IllegalStateException(j$.time.e.a("unreachable, rangeUnit: ", String.valueOf(temporalUnit), ", this: ", String.valueOf(this)));
    }

    @Override // j$.time.temporal.n
    public final long l(k kVar) {
        int iC;
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            iC = b(kVar);
        } else if (temporalUnit == ChronoUnit.MONTHS) {
            int iB = b(kVar);
            int iH = kVar.h(a.DAY_OF_MONTH);
            iC = a(i(iH, iB), iH);
        } else if (temporalUnit == ChronoUnit.YEARS) {
            int iB2 = b(kVar);
            int iH2 = kVar.h(a.DAY_OF_YEAR);
            iC = a(i(iH2, iB2), iH2);
        } else if (temporalUnit == s.h) {
            iC = d(kVar);
        } else {
            if (temporalUnit != ChronoUnit.FOREVER) {
                throw new IllegalStateException(j$.time.e.a("unreachable, rangeUnit: ", String.valueOf(temporalUnit), ", this: ", String.valueOf(this)));
            }
            iC = c(kVar);
        }
        return iC;
    }

    @Override // j$.time.temporal.n
    public final k p(HashMap map, c0 c0Var, d0 d0Var) {
        j$.time.chrono.b bVarB;
        j$.time.chrono.b bVarB2;
        j$.time.chrono.b bVarB3;
        s sVar = this.b;
        j$.time.b bVar = sVar.a;
        long jLongValue = ((Long) map.get(this)).longValue();
        int iX = j$.desugar.sun.nio.fs.g.x(jLongValue);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        q qVar = this.e;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            long jE = o.e((qVar.a(jLongValue, this) - 1) + (bVar.getValue() - 1)) + 1;
            map.remove(this);
            map.put(a.DAY_OF_WEEK, Long.valueOf(jE));
            return null;
        }
        a aVar = a.DAY_OF_WEEK;
        if (!map.containsKey(aVar)) {
            return null;
        }
        int iA = aVar.b.a(((Long) map.get(aVar)).longValue(), aVar);
        r rVar = sVar.e;
        r rVar2 = sVar.f;
        int iE = o.e(iA - bVar.getValue()) + 1;
        j$.time.chrono.a aVarU = j$.desugar.sun.nio.fs.g.u(c0Var);
        a aVar2 = a.YEAR;
        if (!map.containsKey(aVar2)) {
            if ((temporalUnit != s.h && temporalUnit != ChronoUnit.FOREVER) || !map.containsKey(rVar2) || !map.containsKey(rVar)) {
                return null;
            }
            int iA2 = rVar2.e.a(((Long) map.get(rVar2)).longValue(), rVar2);
            if (d0Var == d0.LENIENT) {
                bVarB = e(aVarU, iA2, 1, iE).b(j$.desugar.sun.nio.fs.g.I(((Long) map.get(rVar)).longValue(), 1L), (TemporalUnit) chronoUnit);
            } else {
                j$.time.chrono.b bVarE = e(aVarU, iA2, rVar.e.a(((Long) map.get(rVar)).longValue(), rVar), iE);
                if (d0Var == d0.STRICT && c(bVarE) != iA2) {
                    j$.time.g.g("Strict mode rejected resolved date as it is in a different week-based-year");
                    return null;
                }
                bVarB = bVarE;
            }
            map.remove(this);
            map.remove(rVar2);
            map.remove(rVar);
            map.remove(aVar);
            return bVarB;
        }
        int iA3 = aVar2.b.a(((Long) map.get(aVar2)).longValue(), aVar2);
        ChronoUnit chronoUnit2 = ChronoUnit.MONTHS;
        if (temporalUnit == chronoUnit2) {
            a aVar3 = a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                long jLongValue2 = ((Long) map.get(aVar3)).longValue();
                long j = iX;
                if (d0Var == d0.LENIENT) {
                    j$.time.chrono.b bVarB4 = aVarU.k(iA3, 1, 1).b(j$.desugar.sun.nio.fs.g.I(jLongValue2, 1L), (TemporalUnit) chronoUnit2);
                    int iB = b(bVarB4);
                    int iH = bVarB4.h(a.DAY_OF_MONTH);
                    bVarB3 = bVarB4.b(j$.desugar.sun.nio.fs.g.G(j$.desugar.sun.nio.fs.g.H(j$.desugar.sun.nio.fs.g.I(j, a(i(iH, iB), iH)), 7L), iE - b(bVarB4)), (TemporalUnit) ChronoUnit.DAYS);
                } else {
                    j$.time.chrono.b bVarK = aVarU.k(iA3, aVar3.b.a(jLongValue2, aVar3), 1);
                    long jA = qVar.a(j, this);
                    int iB2 = b(bVarK);
                    int iH2 = bVarK.h(a.DAY_OF_MONTH);
                    j$.time.chrono.b bVarB5 = bVarK.b((((int) (jA - a(i(iH2, iB2), iH2))) * 7) + (iE - b(bVarK)), (TemporalUnit) ChronoUnit.DAYS);
                    if (d0Var == d0.STRICT && bVarB5.C(aVar3) != jLongValue2) {
                        j$.time.g.g("Strict mode rejected resolved date as it is in a different month");
                        return null;
                    }
                    bVarB3 = bVarB5;
                }
                map.remove(this);
                map.remove(aVar2);
                map.remove(aVar3);
                map.remove(aVar);
                return bVarB3;
            }
        }
        if (temporalUnit != ChronoUnit.YEARS) {
            return null;
        }
        long j2 = iX;
        j$.time.chrono.b bVarK2 = aVarU.k(iA3, 1, 1);
        if (d0Var == d0.LENIENT) {
            int iB3 = b(bVarK2);
            int iH3 = bVarK2.h(a.DAY_OF_YEAR);
            bVarB2 = bVarK2.b(j$.desugar.sun.nio.fs.g.G(j$.desugar.sun.nio.fs.g.H(j$.desugar.sun.nio.fs.g.I(j2, a(i(iH3, iB3), iH3)), 7L), iE - b(bVarK2)), (TemporalUnit) ChronoUnit.DAYS);
        } else {
            long jA2 = qVar.a(j2, this);
            int iB4 = b(bVarK2);
            int iH4 = bVarK2.h(a.DAY_OF_YEAR);
            j$.time.chrono.b bVarB6 = bVarK2.b((((int) (jA2 - a(i(iH4, iB4), iH4))) * 7) + (iE - b(bVarK2)), (TemporalUnit) ChronoUnit.DAYS);
            if (d0Var == d0.STRICT && bVarB6.C(aVar2) != iA3) {
                j$.time.g.g("Strict mode rejected resolved date as it is in a different year");
                return null;
            }
            bVarB2 = bVarB6;
        }
        map.remove(this);
        map.remove(aVar2);
        map.remove(aVar);
        return bVarB2;
    }

    @Override // j$.time.temporal.n
    public final Temporal r(Temporal temporal, long j) {
        if (this.e.a(j, this) == temporal.h(this)) {
            return temporal;
        }
        if (this.d != ChronoUnit.FOREVER) {
            return temporal.b(r0 - r1, this.c);
        }
        s sVar = this.b;
        return e(j$.desugar.sun.nio.fs.g.u(temporal), (int) j, temporal.h(sVar.e), temporal.h(sVar.c));
    }

    @Override // j$.time.temporal.n
    public final q range() {
        return this.e;
    }

    public final String toString() {
        return j$.time.e.a(this.a, "[", this.b.toString(), "]");
    }
}
