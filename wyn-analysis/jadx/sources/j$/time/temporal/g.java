package j$.time.temporal;

import j$.time.DayOfWeek;
import j$.time.chrono.AbstractC2901i;
import j$.time.format.y;
import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
abstract class g implements q {
    public static final g DAY_OF_QUARTER;
    public static final g QUARTER_OF_YEAR;
    public static final g WEEK_BASED_YEAR;
    public static final g WEEK_OF_WEEK_BASED_YEAR;

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f37671a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ g[] f37672b;

    @Override // j$.time.temporal.q
    public final boolean D() {
        return true;
    }

    public /* synthetic */ TemporalAccessor q(HashMap map, TemporalAccessor temporalAccessor, y yVar) {
        return null;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f37672b.clone();
    }

    static {
        g gVar = new g() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.q
            public final t o() {
                return t.k(90L, 92L);
            }

            @Override // j$.time.temporal.q
            public final boolean t(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.g(a.DAY_OF_YEAR) || !temporalAccessor.g(a.MONTH_OF_YEAR) || !temporalAccessor.g(a.YEAR)) {
                    return false;
                }
                q qVar = i.f37676a;
                return AbstractC2901i.q(temporalAccessor).equals(j$.time.chrono.t.f37543d);
            }

            @Override // j$.time.temporal.q
            public final t B(TemporalAccessor temporalAccessor) {
                if (!t(temporalAccessor)) {
                    throw new s("Unsupported field: DayOfQuarter");
                }
                long jW = temporalAccessor.w(g.QUARTER_OF_YEAR);
                if (jW == 1) {
                    long jW2 = temporalAccessor.w(a.YEAR);
                    j$.time.chrono.t.f37543d.getClass();
                    return j$.time.chrono.t.S(jW2) ? t.j(1L, 91L) : t.j(1L, 90L);
                }
                if (jW == 2) {
                    return t.j(1L, 91L);
                }
                if (jW == 3 || jW == 4) {
                    return t.j(1L, 92L);
                }
                return o();
            }

            @Override // j$.time.temporal.q
            public final long s(TemporalAccessor temporalAccessor) {
                if (!t(temporalAccessor)) {
                    throw new s("Unsupported field: DayOfQuarter");
                }
                int iQ = temporalAccessor.q(a.DAY_OF_YEAR);
                int iQ2 = temporalAccessor.q(a.MONTH_OF_YEAR);
                long jW = temporalAccessor.w(a.YEAR);
                int[] iArr = g.f37671a;
                int i5 = (iQ2 - 1) / 3;
                j$.time.chrono.t.f37543d.getClass();
                return iQ - iArr[i5 + (j$.time.chrono.t.S(jW) ? 4 : 0)];
            }

            @Override // j$.time.temporal.q
            public final Temporal w(Temporal temporal, long j8) {
                long jS = s(temporal);
                o().b(j8, this);
                a aVar = a.DAY_OF_YEAR;
                return temporal.d((j8 - jS) + temporal.w(aVar), aVar);
            }

            @Override // j$.time.temporal.g, j$.time.temporal.q
            public final TemporalAccessor q(HashMap map, TemporalAccessor temporalAccessor, y yVar) {
                j$.time.g gVarM0;
                long jH;
                a aVar = a.YEAR;
                Long l10 = (Long) map.get(aVar);
                q qVar = g.QUARTER_OF_YEAR;
                Long l11 = (Long) map.get(qVar);
                if (l10 == null || l11 == null) {
                    return null;
                }
                int iR = aVar.R(l10.longValue());
                long jLongValue = ((Long) map.get(g.DAY_OF_QUARTER)).longValue();
                q qVar2 = i.f37676a;
                if (!AbstractC2901i.q(temporalAccessor).equals(j$.time.chrono.t.f37543d)) {
                    throw new j$.time.c("Resolve requires IsoChronology");
                }
                if (yVar == y.LENIENT) {
                    gVarM0 = j$.time.g.g0(iR, 1, 1).m0(j$.time.b.g(j$.time.b.h(l11.longValue(), 1L), 3));
                    jH = j$.time.b.h(jLongValue, 1L);
                } else {
                    j$.time.g gVarG0 = j$.time.g.g0(iR, ((qVar.o().a(l11.longValue(), qVar) - 1) * 3) + 1, 1);
                    if (jLongValue < 1 || jLongValue > 90) {
                        if (yVar == y.STRICT) {
                            B(gVarG0).b(jLongValue, this);
                        } else {
                            o().b(jLongValue, this);
                        }
                    }
                    gVarM0 = gVarG0;
                    jH = jLongValue - 1;
                }
                map.remove(this);
                map.remove(aVar);
                map.remove(qVar);
                return gVarM0.l0(jH);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = gVar;
        g gVar2 = new g() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.q
            public final t o() {
                return t.j(1L, 4L);
            }

            @Override // j$.time.temporal.q
            public final boolean t(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.g(a.MONTH_OF_YEAR)) {
                    return false;
                }
                q qVar = i.f37676a;
                return AbstractC2901i.q(temporalAccessor).equals(j$.time.chrono.t.f37543d);
            }

            @Override // j$.time.temporal.q
            public final long s(TemporalAccessor temporalAccessor) {
                if (!t(temporalAccessor)) {
                    throw new s("Unsupported field: QuarterOfYear");
                }
                return (temporalAccessor.w(a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.q
            public final t B(TemporalAccessor temporalAccessor) {
                if (!t(temporalAccessor)) {
                    throw new s("Unsupported field: QuarterOfYear");
                }
                return o();
            }

            @Override // j$.time.temporal.q
            public final Temporal w(Temporal temporal, long j8) {
                long jS = s(temporal);
                o().b(j8, this);
                a aVar = a.MONTH_OF_YEAR;
                return temporal.d(((j8 - jS) * 3) + temporal.w(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = gVar2;
        g gVar3 = new g() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.q
            public final t o() {
                return t.k(52L, 53L);
            }

            @Override // j$.time.temporal.q
            public final boolean t(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.g(a.EPOCH_DAY)) {
                    return false;
                }
                q qVar = i.f37676a;
                return AbstractC2901i.q(temporalAccessor).equals(j$.time.chrono.t.f37543d);
            }

            @Override // j$.time.temporal.q
            public final t B(TemporalAccessor temporalAccessor) {
                if (!t(temporalAccessor)) {
                    throw new s("Unsupported field: WeekOfWeekBasedYear");
                }
                return g.V(j$.time.g.T(temporalAccessor));
            }

            @Override // j$.time.temporal.q
            public final long s(TemporalAccessor temporalAccessor) {
                if (!t(temporalAccessor)) {
                    throw new s("Unsupported field: WeekOfWeekBasedYear");
                }
                return g.S(j$.time.g.T(temporalAccessor));
            }

            @Override // j$.time.temporal.q
            public final Temporal w(Temporal temporal, long j8) {
                o().b(j8, this);
                return temporal.e(j$.time.b.h(j8, s(temporal)), ChronoUnit.WEEKS);
            }

            @Override // j$.time.temporal.g, j$.time.temporal.q
            public final TemporalAccessor q(HashMap map, TemporalAccessor temporalAccessor, y yVar) {
                j$.time.g gVarD;
                long j8;
                long j10;
                q qVar = g.WEEK_BASED_YEAR;
                Long l10 = (Long) map.get(qVar);
                a aVar = a.DAY_OF_WEEK;
                Long l11 = (Long) map.get(aVar);
                if (l10 == null || l11 == null) {
                    return null;
                }
                int iA = qVar.o().a(l10.longValue(), qVar);
                long jLongValue = ((Long) map.get(g.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                q qVar2 = i.f37676a;
                if (AbstractC2901i.q(temporalAccessor).equals(j$.time.chrono.t.f37543d)) {
                    j$.time.g gVarG0 = j$.time.g.g0(iA, 1, 4);
                    if (yVar == y.LENIENT) {
                        long jLongValue2 = l11.longValue();
                        if (jLongValue2 > 7) {
                            long j11 = jLongValue2 - 1;
                            j8 = 1;
                            gVarG0 = gVarG0.n0(j11 / 7);
                            j10 = j11 % 7;
                        } else {
                            j8 = 1;
                            if (jLongValue2 < 1) {
                                gVarG0 = gVarG0.n0(j$.time.b.h(jLongValue2, 7L) / 7);
                                j10 = (jLongValue2 + 6) % 7;
                            }
                            gVarD = gVarG0.n0(j$.time.b.h(jLongValue, j8)).d(jLongValue2, aVar);
                        }
                        jLongValue2 = j10 + j8;
                        gVarD = gVarG0.n0(j$.time.b.h(jLongValue, j8)).d(jLongValue2, aVar);
                    } else {
                        int iR = aVar.R(l11.longValue());
                        if (jLongValue < 1 || jLongValue > 52) {
                            if (yVar == y.STRICT) {
                                g.V(gVarG0).b(jLongValue, this);
                            } else {
                                o().b(jLongValue, this);
                            }
                        }
                        gVarD = gVarG0.n0(jLongValue - 1).d(iR, aVar);
                    }
                    map.remove(this);
                    map.remove(qVar);
                    map.remove(aVar);
                    return gVarD;
                }
                throw new j$.time.c("Resolve requires IsoChronology");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = gVar3;
        g gVar4 = new g() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.q
            public final t o() {
                return a.YEAR.o();
            }

            @Override // j$.time.temporal.q
            public final boolean t(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.g(a.EPOCH_DAY)) {
                    return false;
                }
                q qVar = i.f37676a;
                return AbstractC2901i.q(temporalAccessor).equals(j$.time.chrono.t.f37543d);
            }

            @Override // j$.time.temporal.q
            public final long s(TemporalAccessor temporalAccessor) {
                if (!t(temporalAccessor)) {
                    throw new s("Unsupported field: WeekBasedYear");
                }
                return g.W(j$.time.g.T(temporalAccessor));
            }

            @Override // j$.time.temporal.q
            public final t B(TemporalAccessor temporalAccessor) {
                if (!t(temporalAccessor)) {
                    throw new s("Unsupported field: WeekBasedYear");
                }
                return o();
            }

            @Override // j$.time.temporal.q
            public final Temporal w(Temporal temporal, long j8) {
                if (!t(temporal)) {
                    throw new s("Unsupported field: WeekBasedYear");
                }
                int iA = a.YEAR.o().a(j8, g.WEEK_BASED_YEAR);
                j$.time.g gVarT = j$.time.g.T(temporal);
                int iQ = gVarT.q(a.DAY_OF_WEEK);
                int iS = g.S(gVarT);
                if (iS == 53 && g.X(iA) == 52) {
                    iS = 52;
                }
                return temporal.s(j$.time.g.g0(iA, 1, 4).l0(((iS - 1) * 7) + (iQ - r6.q(r0))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = gVar4;
        f37672b = new g[]{gVar, gVar2, gVar3, gVar4};
        f37671a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    static t V(j$.time.g gVar) {
        return t.j(1L, X(W(gVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int X(int i5) {
        j$.time.g gVarG0 = j$.time.g.g0(i5, 1, 1);
        if (gVarG0.W() != DayOfWeek.THURSDAY) {
            return (gVarG0.W() == DayOfWeek.WEDNESDAY && gVarG0.c0()) ? 53 : 52;
        }
        return 53;
    }

    static int S(j$.time.g gVar) {
        int iOrdinal = gVar.W().ordinal();
        int iX = gVar.X() - 1;
        int i5 = (3 - iOrdinal) + iX;
        int i10 = i5 - ((i5 / 7) * 7);
        int i11 = i10 - 3;
        if (i11 < -3) {
            i11 = i10 + 4;
        }
        if (iX < i11) {
            return (int) t.j(1L, X(W(gVar.s0(180).o0(-1L)))).d();
        }
        int i12 = ((iX - i11) / 7) + 1;
        if (i12 != 53 || i11 == -3 || (i11 == -2 && gVar.c0())) {
            return i12;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int W(j$.time.g gVar) {
        int iA0 = gVar.a0();
        int iX = gVar.X();
        if (iX <= 3) {
            return iX - gVar.W().ordinal() < -2 ? iA0 - 1 : iA0;
        }
        if (iX >= 363) {
            return ((iX - 363) - (gVar.c0() ? 1 : 0)) - gVar.W().ordinal() >= 0 ? iA0 + 1 : iA0;
        }
        return iA0;
    }
}
