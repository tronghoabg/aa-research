package j$.time.temporal;

import j$.time.DayOfWeek;
import j$.time.chrono.Chronology;
import j$.time.format.a0;
import j$.time.format.b0;
import java.util.HashMap;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class q implements m {

    /* renamed from: f, reason: collision with root package name */
    public static final p f50076f = p.f(1, 7);

    /* renamed from: g, reason: collision with root package name */
    public static final p f50077g = p.g(0, 4, 6);

    /* renamed from: h, reason: collision with root package name */
    public static final p f50078h = p.g(0, 52, 54);

    /* renamed from: i, reason: collision with root package name */
    public static final p f50079i = p.g(1, 52, 53);

    /* renamed from: a, reason: collision with root package name */
    public final String f50080a;

    /* renamed from: b, reason: collision with root package name */
    public final WeekFields f50081b;

    /* renamed from: c, reason: collision with root package name */
    public final TemporalUnit f50082c;

    /* renamed from: d, reason: collision with root package name */
    public final TemporalUnit f50083d;

    /* renamed from: e, reason: collision with root package name */
    public final p f50084e;

    public q(String str, WeekFields weekFields, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, p pVar) {
        this.f50080a = str;
        this.f50081b = weekFields;
        this.f50082c = temporalUnit;
        this.f50083d = temporalUnit2;
        this.f50084e = pVar;
    }

    public static int a(int i2, int i3) {
        return ((i3 - 1) + (i2 + 7)) / 7;
    }

    public final int b(TemporalAccessor temporalAccessor) {
        return n.e(temporalAccessor.f(a.DAY_OF_WEEK) - this.f50081b.getFirstDayOfWeek().getValue()) + 1;
    }

    public final int c(TemporalAccessor temporalAccessor) {
        int iB = b(temporalAccessor);
        int iF = temporalAccessor.f(a.YEAR);
        a aVar = a.DAY_OF_YEAR;
        int iF2 = temporalAccessor.f(aVar);
        int iJ = j(iF2, iB);
        int iA = a(iJ, iF2);
        return iA == 0 ? iF - 1 : iA >= a(iJ, ((int) temporalAccessor.k(aVar).f50075d) + this.f50081b.f50041b) ? iF + 1 : iF;
    }

    public final int d(TemporalAccessor temporalAccessor) {
        int iA;
        int iB = b(temporalAccessor);
        a aVar = a.DAY_OF_YEAR;
        int iF = temporalAccessor.f(aVar);
        int iJ = j(iF, iB);
        int iA2 = a(iJ, iF);
        return iA2 == 0 ? d(Chronology.CC.a(temporalAccessor).C(temporalAccessor).z(iF, ChronoUnit.DAYS)) : (iA2 <= 50 || iA2 < (iA = a(iJ, ((int) temporalAccessor.k(aVar).f50075d) + this.f50081b.f50041b))) ? iA2 : (iA2 - iA) + 1;
    }

    public final j$.time.chrono.b e(Chronology chronology, int i2, int i3, int i4) {
        j$.time.chrono.b bVarDate = chronology.date(i2, 1, 1);
        int iJ = j(1, b(bVarDate));
        int i5 = i4 - 1;
        return bVarDate.b(((Math.min(i3, a(iJ, bVarDate.lengthOfYear() + this.f50081b.f50041b) - 1) - 1) * 7) + i5 + (-iJ), (TemporalUnit) ChronoUnit.DAYS);
    }

    @Override // j$.time.temporal.m
    public final boolean f(TemporalAccessor temporalAccessor) {
        if (!temporalAccessor.c(a.DAY_OF_WEEK)) {
            return false;
        }
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.f50083d;
        if (temporalUnit == chronoUnit) {
            return true;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return temporalAccessor.c(a.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return temporalAccessor.c(a.DAY_OF_YEAR);
        }
        if (temporalUnit == WeekFields.f50039h) {
            return temporalAccessor.c(a.DAY_OF_YEAR);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return temporalAccessor.c(a.YEAR);
        }
        return false;
    }

    public final p g(TemporalAccessor temporalAccessor, a aVar) {
        int iJ = j(temporalAccessor.f(aVar), b(temporalAccessor));
        p pVarK = temporalAccessor.k(aVar);
        return p.f(a(iJ, (int) pVarK.f50072a), a(iJ, (int) pVarK.f50075d));
    }

    @Override // j$.time.temporal.m
    public final p h(TemporalAccessor temporalAccessor) {
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.f50083d;
        if (temporalUnit == chronoUnit) {
            return this.f50084e;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return g(temporalAccessor, a.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return g(temporalAccessor, a.DAY_OF_YEAR);
        }
        if (temporalUnit == WeekFields.f50039h) {
            return i(temporalAccessor);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return a.YEAR.f50048b;
        }
        throw new IllegalStateException(j$.desugar.sun.nio.fs.h.b("unreachable, rangeUnit: ", String.valueOf(temporalUnit), ", this: ", String.valueOf(this)));
    }

    public final p i(TemporalAccessor temporalAccessor) {
        a aVar = a.DAY_OF_YEAR;
        if (!temporalAccessor.c(aVar)) {
            return f50078h;
        }
        int iB = b(temporalAccessor);
        int iF = temporalAccessor.f(aVar);
        int iJ = j(iF, iB);
        int iA = a(iJ, iF);
        if (iA == 0) {
            return i(Chronology.CC.a(temporalAccessor).C(temporalAccessor).z(iF + 7, ChronoUnit.DAYS));
        }
        return iA >= a(iJ, this.f50081b.f50041b + ((int) temporalAccessor.k(aVar).f50075d)) ? i(Chronology.CC.a(temporalAccessor).C(temporalAccessor).b((r0 - iF) + 8, (TemporalUnit) ChronoUnit.DAYS)) : p.f(1L, r1 - 1);
    }

    @Override // j$.time.temporal.m
    public final boolean isDateBased() {
        return true;
    }

    public final int j(int i2, int i3) {
        int iE = n.e(i2 - i3);
        return iE + 1 > this.f50081b.f50041b ? 7 - iE : -iE;
    }

    @Override // j$.time.temporal.m
    public final long k(TemporalAccessor temporalAccessor) {
        int iC;
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.f50083d;
        if (temporalUnit == chronoUnit) {
            iC = b(temporalAccessor);
        } else if (temporalUnit == ChronoUnit.MONTHS) {
            int iB = b(temporalAccessor);
            int iF = temporalAccessor.f(a.DAY_OF_MONTH);
            iC = a(j(iF, iB), iF);
        } else if (temporalUnit == ChronoUnit.YEARS) {
            int iB2 = b(temporalAccessor);
            int iF2 = temporalAccessor.f(a.DAY_OF_YEAR);
            iC = a(j(iF2, iB2), iF2);
        } else if (temporalUnit == WeekFields.f50039h) {
            iC = d(temporalAccessor);
        } else {
            if (temporalUnit != ChronoUnit.FOREVER) {
                throw new IllegalStateException(j$.desugar.sun.nio.fs.h.b("unreachable, rangeUnit: ", String.valueOf(temporalUnit), ", this: ", String.valueOf(this)));
            }
            iC = c(temporalAccessor);
        }
        return iC;
    }

    @Override // j$.time.temporal.m
    public final TemporalAccessor m(HashMap map, a0 a0Var, b0 b0Var) {
        j$.time.chrono.b bVarB;
        j$.time.chrono.b bVarB2;
        j$.time.chrono.b bVarB3;
        long jLongValue = ((Long) map.get(this)).longValue();
        int iE = j$.com.android.tools.r8.a.E(jLongValue);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        p pVar = this.f50084e;
        WeekFields weekFields = this.f50081b;
        TemporalUnit temporalUnit = this.f50083d;
        if (temporalUnit == chronoUnit) {
            long jE = n.e((pVar.a(jLongValue, this) - 1) + (weekFields.getFirstDayOfWeek().getValue() - 1)) + 1;
            map.remove(this);
            map.put(a.DAY_OF_WEEK, Long.valueOf(jE));
            return null;
        }
        a aVar = a.DAY_OF_WEEK;
        if (!map.containsKey(aVar)) {
            return null;
        }
        int iA = aVar.f50048b.a(((Long) map.get(aVar)).longValue(), aVar);
        DayOfWeek firstDayOfWeek = weekFields.getFirstDayOfWeek();
        q qVar = weekFields.f50044e;
        q qVar2 = weekFields.f50045f;
        int iE2 = n.e(iA - firstDayOfWeek.getValue()) + 1;
        Chronology chronologyA = Chronology.CC.a(a0Var);
        a aVar2 = a.YEAR;
        if (!map.containsKey(aVar2)) {
            if ((temporalUnit != WeekFields.f50039h && temporalUnit != ChronoUnit.FOREVER) || !map.containsKey(qVar2) || !map.containsKey(qVar)) {
                return null;
            }
            int iA2 = qVar2.f50084e.a(((Long) map.get(qVar2)).longValue(), qVar2);
            if (b0Var == b0.LENIENT) {
                bVarB = e(chronologyA, iA2, 1, iE2).b(j$.com.android.tools.r8.a.R(((Long) map.get(qVar)).longValue(), 1L), (TemporalUnit) chronoUnit);
            } else {
                j$.time.chrono.b bVarE = e(chronologyA, iA2, qVar.f50084e.a(((Long) map.get(qVar)).longValue(), qVar), iE2);
                if (b0Var == b0.STRICT && c(bVarE) != iA2) {
                    j$.time.f.h("Strict mode rejected resolved date as it is in a different week-based-year");
                    return null;
                }
                bVarB = bVarE;
            }
            map.remove(this);
            map.remove(qVar2);
            map.remove(qVar);
            map.remove(aVar);
            return bVarB;
        }
        int iA3 = aVar2.f50048b.a(((Long) map.get(aVar2)).longValue(), aVar2);
        ChronoUnit chronoUnit2 = ChronoUnit.MONTHS;
        if (temporalUnit == chronoUnit2) {
            a aVar3 = a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                long jLongValue2 = ((Long) map.get(aVar3)).longValue();
                long j2 = iE;
                if (b0Var == b0.LENIENT) {
                    j$.time.chrono.b bVarB4 = chronologyA.date(iA3, 1, 1).b(j$.com.android.tools.r8.a.R(jLongValue2, 1L), (TemporalUnit) chronoUnit2);
                    int iB = b(bVarB4);
                    int iF = bVarB4.f(a.DAY_OF_MONTH);
                    bVarB3 = bVarB4.b(j$.com.android.tools.r8.a.P(j$.com.android.tools.r8.a.Q(j$.com.android.tools.r8.a.R(j2, a(j(iF, iB), iF)), 7L), iE2 - b(bVarB4)), (TemporalUnit) ChronoUnit.DAYS);
                } else {
                    j$.time.chrono.b bVarDate = chronologyA.date(iA3, aVar3.f50048b.a(jLongValue2, aVar3), 1);
                    long jA = pVar.a(j2, this);
                    int iB2 = b(bVarDate);
                    int iF2 = bVarDate.f(a.DAY_OF_MONTH);
                    j$.time.chrono.b bVarB5 = bVarDate.b((((int) (jA - a(j(iF2, iB2), iF2))) * 7) + (iE2 - b(bVarDate)), (TemporalUnit) ChronoUnit.DAYS);
                    if (b0Var == b0.STRICT && bVarB5.D(aVar3) != jLongValue2) {
                        j$.time.f.h("Strict mode rejected resolved date as it is in a different month");
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
        long j3 = iE;
        j$.time.chrono.b bVarDate2 = chronologyA.date(iA3, 1, 1);
        if (b0Var == b0.LENIENT) {
            int iB3 = b(bVarDate2);
            int iF3 = bVarDate2.f(a.DAY_OF_YEAR);
            bVarB2 = bVarDate2.b(j$.com.android.tools.r8.a.P(j$.com.android.tools.r8.a.Q(j$.com.android.tools.r8.a.R(j3, a(j(iF3, iB3), iF3)), 7L), iE2 - b(bVarDate2)), (TemporalUnit) ChronoUnit.DAYS);
        } else {
            long jA2 = pVar.a(j3, this);
            int iB4 = b(bVarDate2);
            int iF4 = bVarDate2.f(a.DAY_OF_YEAR);
            j$.time.chrono.b bVarB6 = bVarDate2.b((((int) (jA2 - a(j(iF4, iB4), iF4))) * 7) + (iE2 - b(bVarDate2)), (TemporalUnit) ChronoUnit.DAYS);
            if (b0Var == b0.STRICT && bVarB6.D(aVar2) != iA3) {
                j$.time.f.h("Strict mode rejected resolved date as it is in a different year");
                return null;
            }
            bVarB2 = bVarB6;
        }
        map.remove(this);
        map.remove(aVar2);
        map.remove(aVar);
        return bVarB2;
    }

    @Override // j$.time.temporal.m
    public final p range() {
        return this.f50084e;
    }

    public final String toString() {
        return j$.desugar.sun.nio.fs.h.b(this.f50080a, "[", this.f50081b.toString(), "]");
    }

    @Override // j$.time.temporal.m
    public final Temporal x(Temporal temporal, long j2) {
        if (this.f50084e.a(j2, this) == temporal.f(this)) {
            return temporal;
        }
        if (this.f50083d != ChronoUnit.FOREVER) {
            return temporal.b(r0 - r1, this.f50082c);
        }
        WeekFields weekFields = this.f50081b;
        return e(Chronology.CC.a(temporal), (int) j2, temporal.f(weekFields.f50044e), temporal.f(weekFields.f50042c));
    }
}
