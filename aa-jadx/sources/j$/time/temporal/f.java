package j$.time.temporal;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f implements j$.time.temporal.m {
    public static final j$.time.temporal.f DAY_OF_QUARTER;
    public static final j$.time.temporal.f QUARTER_OF_YEAR;
    public static final j$.time.temporal.f WEEK_BASED_YEAR;
    public static final j$.time.temporal.f WEEK_OF_WEEK_BASED_YEAR;
    public static final int[] a;
    public static final /* synthetic */ j$.time.temporal.f[] b;

    static {
        j$.time.temporal.f fVar = new j$.time.temporal.f() { // from class: j$.time.temporal.b
            @Override // j$.time.temporal.m
            public final boolean h(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.d(j$.time.temporal.a.DAY_OF_YEAR) || !temporalAccessor.d(j$.time.temporal.a.MONTH_OF_YEAR) || !temporalAccessor.d(j$.time.temporal.a.YEAR)) {
                    return false;
                }
                j$.time.temporal.f fVar2 = j$.time.temporal.h.a;
                return j$.desugar.sun.nio.fs.g.u(temporalAccessor).equals(j$.time.chrono.s.c);
            }

            @Override // j$.time.temporal.m
            public final j$.time.temporal.p k(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (!h(temporalAccessor)) {
                    j$.time.g.e("Unsupported field: DayOfQuarter");
                    return null;
                }
                long jC = temporalAccessor.C(j$.time.temporal.f.QUARTER_OF_YEAR);
                if (jC == 1) {
                    return j$.time.chrono.s.c.isLeapYear(temporalAccessor.C(j$.time.temporal.a.YEAR)) ? j$.time.temporal.p.f(1L, 91L) : j$.time.temporal.p.f(1L, 90L);
                }
                if (jC == 2) {
                    return j$.time.temporal.p.f(1L, 91L);
                }
                return (jC == 3 || jC == 4) ? j$.time.temporal.p.f(1L, 92L) : range();
            }

            @Override // j$.time.temporal.m
            public final long l(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (!h(temporalAccessor)) {
                    j$.time.g.e("Unsupported field: DayOfQuarter");
                    return 0L;
                }
                return temporalAccessor.h(j$.time.temporal.a.DAY_OF_YEAR) - j$.time.temporal.f.a[((temporalAccessor.h(j$.time.temporal.a.MONTH_OF_YEAR) - 1) / 3) + (j$.time.chrono.s.c.isLeapYear(temporalAccessor.C(j$.time.temporal.a.YEAR)) ? 4 : 0)];
            }

            @Override // j$.time.temporal.f, j$.time.temporal.m
            public final j$.time.temporal.TemporalAccessor p(java.util.HashMap map, j$.time.format.c0 c0Var, j$.time.format.d0 d0Var) {
                j$.time.LocalDate localDateO;
                long jI;
                j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
                java.lang.Long l = (java.lang.Long) map.get(aVar);
                j$.time.temporal.m mVar = j$.time.temporal.f.QUARTER_OF_YEAR;
                java.lang.Long l2 = (java.lang.Long) map.get(mVar);
                if (l != null && l2 != null) {
                    int iA = aVar.b.a(l.longValue(), aVar);
                    long jLongValue = ((java.lang.Long) map.get(j$.time.temporal.f.DAY_OF_QUARTER)).longValue();
                    j$.time.temporal.f fVar2 = j$.time.temporal.h.a;
                    if (j$.desugar.sun.nio.fs.g.u(c0Var).equals(j$.time.chrono.s.c)) {
                        if (d0Var == j$.time.format.d0.LENIENT) {
                            localDateO = j$.time.LocalDate.O(iA, 1, 1).S(j$.desugar.sun.nio.fs.g.H(j$.desugar.sun.nio.fs.g.I(l2.longValue(), 1L), 3L));
                            jI = j$.desugar.sun.nio.fs.g.I(jLongValue, 1L);
                        } else {
                            localDateO = j$.time.LocalDate.O(iA, ((mVar.range().a(l2.longValue(), mVar) - 1) * 3) + 1, 1);
                            if (jLongValue < 1 || jLongValue > 90) {
                                if (d0Var == j$.time.format.d0.STRICT) {
                                    k(localDateO).b(jLongValue, this);
                                } else {
                                    range().b(jLongValue, this);
                                }
                            }
                            jI = jLongValue - 1;
                        }
                        map.remove(this);
                        map.remove(aVar);
                        map.remove(mVar);
                        return localDateO.R(jI);
                    }
                    j$.time.g.g("Resolve requires IsoChronology");
                }
                return null;
            }

            @Override // j$.time.temporal.m
            public final j$.time.temporal.Temporal r(j$.time.temporal.Temporal temporal, long j) {
                long jL = l(temporal);
                range().b(j, this);
                j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_YEAR;
                return temporal.a((j - jL) + temporal.C(aVar), aVar);
            }

            @Override // j$.time.temporal.m
            public final j$.time.temporal.p range() {
                return j$.time.temporal.p.g(1L, 90L, 92L);
            }

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = fVar;
        j$.time.temporal.f fVar2 = new j$.time.temporal.f() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.m
            public final boolean h(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.d(j$.time.temporal.a.MONTH_OF_YEAR)) {
                    return false;
                }
                j$.time.temporal.f fVar3 = j$.time.temporal.h.a;
                return j$.desugar.sun.nio.fs.g.u(temporalAccessor).equals(j$.time.chrono.s.c);
            }

            @Override // j$.time.temporal.m
            public final j$.time.temporal.p k(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (h(temporalAccessor)) {
                    return range();
                }
                j$.time.g.e("Unsupported field: QuarterOfYear");
                return null;
            }

            @Override // j$.time.temporal.m
            public final long l(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (h(temporalAccessor)) {
                    return (temporalAccessor.C(j$.time.temporal.a.MONTH_OF_YEAR) + 2) / 3;
                }
                j$.time.g.e("Unsupported field: QuarterOfYear");
                return 0L;
            }

            @Override // j$.time.temporal.m
            public final j$.time.temporal.Temporal r(j$.time.temporal.Temporal temporal, long j) {
                long jL = l(temporal);
                range().b(j, this);
                j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
                return temporal.a(((j - jL) * 3) + temporal.C(aVar), aVar);
            }

            @Override // j$.time.temporal.m
            public final j$.time.temporal.p range() {
                return j$.time.temporal.p.f(1L, 4L);
            }

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = fVar2;
        j$.time.temporal.f fVar3 = new j$.time.temporal.f() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.m
            public final boolean h(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.d(j$.time.temporal.a.EPOCH_DAY)) {
                    return false;
                }
                j$.time.temporal.f fVar4 = j$.time.temporal.h.a;
                return j$.desugar.sun.nio.fs.g.u(temporalAccessor).equals(j$.time.chrono.s.c);
            }

            @Override // j$.time.temporal.m
            public final j$.time.temporal.p k(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (h(temporalAccessor)) {
                    return j$.time.temporal.p.f(1L, j$.time.temporal.f.y(j$.time.temporal.f.w(j$.time.LocalDate.A(temporalAccessor))));
                }
                j$.time.g.e("Unsupported field: WeekOfWeekBasedYear");
                return null;
            }

            @Override // j$.time.temporal.m
            public final long l(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (h(temporalAccessor)) {
                    return j$.time.temporal.f.s(j$.time.LocalDate.A(temporalAccessor));
                }
                j$.time.g.e("Unsupported field: WeekOfWeekBasedYear");
                return 0L;
            }

            @Override // j$.time.temporal.f, j$.time.temporal.m
            public final j$.time.temporal.TemporalAccessor p(java.util.HashMap map, j$.time.format.c0 c0Var, j$.time.format.d0 d0Var) {
                j$.time.LocalDate localDateA;
                long j;
                j$.time.temporal.m mVar = j$.time.temporal.f.WEEK_BASED_YEAR;
                java.lang.Long l = (java.lang.Long) map.get(mVar);
                j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_WEEK;
                java.lang.Long l2 = (java.lang.Long) map.get(aVar);
                if (l != null && l2 != null) {
                    int iA = mVar.range().a(l.longValue(), mVar);
                    long jLongValue = ((java.lang.Long) map.get(j$.time.temporal.f.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                    j$.time.temporal.f fVar4 = j$.time.temporal.h.a;
                    if (j$.desugar.sun.nio.fs.g.u(c0Var).equals(j$.time.chrono.s.c)) {
                        j$.time.LocalDate localDateO = j$.time.LocalDate.O(iA, 1, 4);
                        if (d0Var == j$.time.format.d0.LENIENT) {
                            long jLongValue2 = l2.longValue();
                            if (jLongValue2 > 7) {
                                long j2 = jLongValue2 - 1;
                                localDateO = localDateO.T(j2 / 7);
                                j = j2 % 7;
                            } else {
                                if (jLongValue2 < 1) {
                                    localDateO = localDateO.T(j$.desugar.sun.nio.fs.g.I(jLongValue2, 7L) / 7);
                                    j = (jLongValue2 + 6) % 7;
                                }
                                localDateA = localDateO.T(j$.desugar.sun.nio.fs.g.I(jLongValue, 1L)).a(jLongValue2, aVar);
                            }
                            jLongValue2 = j + 1;
                            localDateA = localDateO.T(j$.desugar.sun.nio.fs.g.I(jLongValue, 1L)).a(jLongValue2, aVar);
                        } else {
                            int iA2 = aVar.b.a(l2.longValue(), aVar);
                            if (jLongValue < 1 || jLongValue > 52) {
                                if (d0Var == j$.time.format.d0.STRICT) {
                                    j$.time.temporal.p.f(1L, j$.time.temporal.f.y(j$.time.temporal.f.w(localDateO))).b(jLongValue, this);
                                } else {
                                    range().b(jLongValue, this);
                                }
                            }
                            localDateA = localDateO.T(jLongValue - 1).a(iA2, aVar);
                        }
                        map.remove(this);
                        map.remove(mVar);
                        map.remove(aVar);
                        return localDateA;
                    }
                    j$.time.g.g("Resolve requires IsoChronology");
                }
                return null;
            }

            @Override // j$.time.temporal.m
            public final j$.time.temporal.Temporal r(j$.time.temporal.Temporal temporal, long j) {
                range().b(j, this);
                return temporal.b(j$.desugar.sun.nio.fs.g.I(j, l(temporal)), j$.time.temporal.ChronoUnit.WEEKS);
            }

            @Override // j$.time.temporal.m
            public final j$.time.temporal.p range() {
                return j$.time.temporal.p.g(1L, 52L, 53L);
            }

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = fVar3;
        j$.time.temporal.f fVar4 = new j$.time.temporal.f() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.m
            public final boolean h(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.d(j$.time.temporal.a.EPOCH_DAY)) {
                    return false;
                }
                j$.time.temporal.f fVar5 = j$.time.temporal.h.a;
                return j$.desugar.sun.nio.fs.g.u(temporalAccessor).equals(j$.time.chrono.s.c);
            }

            @Override // j$.time.temporal.m
            public final j$.time.temporal.p k(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (h(temporalAccessor)) {
                    return j$.time.temporal.a.YEAR.b;
                }
                j$.time.g.e("Unsupported field: WeekBasedYear");
                return null;
            }

            @Override // j$.time.temporal.m
            public final long l(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (h(temporalAccessor)) {
                    return j$.time.temporal.f.w(j$.time.LocalDate.A(temporalAccessor));
                }
                j$.time.g.e("Unsupported field: WeekBasedYear");
                return 0L;
            }

            @Override // j$.time.temporal.m
            public final j$.time.temporal.Temporal r(j$.time.temporal.Temporal temporal, long j) {
                if (!h(temporal)) {
                    j$.time.g.e("Unsupported field: WeekBasedYear");
                    return null;
                }
                int iA = j$.time.temporal.a.YEAR.b.a(j, j$.time.temporal.f.WEEK_BASED_YEAR);
                j$.time.LocalDate localDateA = j$.time.LocalDate.A(temporal);
                j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_WEEK;
                int iH = localDateA.h(aVar);
                int iS = j$.time.temporal.f.s(localDateA);
                if (iS == 53 && j$.time.temporal.f.y(iA) == 52) {
                    iS = 52;
                }
                j$.time.LocalDate localDateO = j$.time.LocalDate.O(iA, 1, 4);
                return temporal.x(localDateO.R(((iS - 1) * 7) + (iH - localDateO.h(aVar))));
            }

            @Override // j$.time.temporal.m
            public final j$.time.temporal.p range() {
                return j$.time.temporal.a.YEAR.b;
            }

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = fVar4;
        b = new j$.time.temporal.f[]{fVar, fVar2, fVar3, fVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static int s(j$.time.LocalDate localDate) {
        int iOrdinal = localDate.H().ordinal();
        int I = localDate.I() - 1;
        int i = (3 - iOrdinal) + I;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (I < i3) {
            if (localDate.I() != 180) {
                localDate = j$.time.LocalDate.P(localDate.a, 180);
            }
            return (int) j$.time.temporal.p.f(1L, y(w(localDate.U(-1L)))).d;
        }
        int i4 = ((I - i3) / 7) + 1;
        if (i4 != 53 || i3 == -3 || (i3 == -2 && localDate.isLeapYear())) {
            return i4;
        }
        return 1;
    }

    public static j$.time.temporal.f valueOf(java.lang.String str) {
        return (j$.time.temporal.f) java.lang.Enum.valueOf(j$.time.temporal.f.class, str);
    }

    public static j$.time.temporal.f[] values() {
        return (j$.time.temporal.f[]) b.clone();
    }

    public static int w(j$.time.LocalDate localDate) {
        int i = localDate.a;
        int I = localDate.I();
        if (I <= 3) {
            return I - localDate.H().ordinal() < -2 ? i - 1 : i;
        }
        if (I >= 363) {
            return ((I - 363) - (localDate.isLeapYear() ? 1 : 0)) - localDate.H().ordinal() >= 0 ? i + 1 : i;
        }
        return i;
    }

    public static int y(int i) {
        j$.time.LocalDate localDateO = j$.time.LocalDate.O(i, 1, 1);
        if (localDateO.H() != j$.time.b.THURSDAY) {
            return (localDateO.H() == j$.time.b.WEDNESDAY && localDateO.isLeapYear()) ? 53 : 52;
        }
        return 53;
    }

    @Override // j$.time.temporal.m
    public final boolean isDateBased() {
        return true;
    }

    public j$.time.temporal.TemporalAccessor p(java.util.HashMap map, j$.time.format.c0 c0Var, j$.time.format.d0 d0Var) {
        return null;
    }
}
