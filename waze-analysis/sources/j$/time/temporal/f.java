package j$.time.temporal;

import com.waze.strings.DisplayStrings;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.chrono.Chronology;
import j$.time.chrono.r;
import j$.time.format.a0;
import j$.time.format.b0;
import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class f implements m {
    public static final f DAY_OF_QUARTER;
    public static final f QUARTER_OF_YEAR;
    public static final f WEEK_BASED_YEAR;
    public static final f WEEK_OF_WEEK_BASED_YEAR;

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f50049a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f[] f50050b;

    static {
        f fVar = new f() { // from class: j$.time.temporal.b
            @Override // j$.time.temporal.m
            public final boolean f(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.c(a.DAY_OF_YEAR) || !temporalAccessor.c(a.MONTH_OF_YEAR) || !temporalAccessor.c(a.YEAR)) {
                    return false;
                }
                f fVar2 = h.f50054a;
                return Chronology.CC.a(temporalAccessor).equals(r.f49878d);
            }

            @Override // j$.time.temporal.m
            public final p h(TemporalAccessor temporalAccessor) {
                if (!f(temporalAccessor)) {
                    j$.time.f.f("Unsupported field: DayOfQuarter");
                    return null;
                }
                long jD = temporalAccessor.D(f.QUARTER_OF_YEAR);
                if (jD == 1) {
                    return r.f49878d.isLeapYear(temporalAccessor.D(a.YEAR)) ? p.f(1L, 91L) : p.f(1L, 90L);
                }
                return jD == 2 ? p.f(1L, 91L) : (jD == 3 || jD == 4) ? p.f(1L, 92L) : range();
            }

            @Override // j$.time.temporal.m
            public final long k(TemporalAccessor temporalAccessor) {
                if (!f(temporalAccessor)) {
                    j$.time.f.f("Unsupported field: DayOfQuarter");
                    return 0L;
                }
                return temporalAccessor.f(a.DAY_OF_YEAR) - f.f50049a[((temporalAccessor.f(a.MONTH_OF_YEAR) - 1) / 3) + (r.f49878d.isLeapYear(temporalAccessor.D(a.YEAR)) ? 4 : 0)];
            }

            @Override // j$.time.temporal.f, j$.time.temporal.m
            public final TemporalAccessor m(HashMap map, a0 a0Var, b0 b0Var) {
                LocalDate localDateOf;
                long jR;
                a aVar = a.YEAR;
                Long l2 = (Long) map.get(aVar);
                m mVar = f.QUARTER_OF_YEAR;
                Long l3 = (Long) map.get(mVar);
                if (l2 != null && l3 != null) {
                    int iA = aVar.f50048b.a(l2.longValue(), aVar);
                    long jLongValue = ((Long) map.get(f.DAY_OF_QUARTER)).longValue();
                    f fVar2 = h.f50054a;
                    if (Chronology.CC.a(a0Var).equals(r.f49878d)) {
                        if (b0Var == b0.LENIENT) {
                            localDateOf = LocalDate.of(iA, 1, 1).plusMonths(j$.com.android.tools.r8.a.Q(j$.com.android.tools.r8.a.R(l3.longValue(), 1L), 3L));
                            jR = j$.com.android.tools.r8.a.R(jLongValue, 1L);
                        } else {
                            localDateOf = LocalDate.of(iA, ((mVar.range().a(l3.longValue(), mVar) - 1) * 3) + 1, 1);
                            if (jLongValue < 1 || jLongValue > 90) {
                                if (b0Var == b0.STRICT) {
                                    h(localDateOf).b(jLongValue, this);
                                } else {
                                    range().b(jLongValue, this);
                                }
                            }
                            jR = jLongValue - 1;
                        }
                        map.remove(this);
                        map.remove(aVar);
                        map.remove(mVar);
                        return localDateOf.W(jR);
                    }
                    j$.time.f.h("Resolve requires IsoChronology");
                }
                return null;
            }

            @Override // j$.time.temporal.m
            public final p range() {
                return p.g(1L, 90L, 92L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }

            @Override // j$.time.temporal.m
            public final Temporal x(Temporal temporal, long j2) {
                long jK = k(temporal);
                range().b(j2, this);
                a aVar = a.DAY_OF_YEAR;
                return temporal.a((j2 - jK) + temporal.D(aVar), aVar);
            }
        };
        DAY_OF_QUARTER = fVar;
        f fVar2 = new f() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.m
            public final boolean f(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.c(a.MONTH_OF_YEAR)) {
                    return false;
                }
                f fVar3 = h.f50054a;
                return Chronology.CC.a(temporalAccessor).equals(r.f49878d);
            }

            @Override // j$.time.temporal.m
            public final p h(TemporalAccessor temporalAccessor) {
                if (f(temporalAccessor)) {
                    return range();
                }
                j$.time.f.f("Unsupported field: QuarterOfYear");
                return null;
            }

            @Override // j$.time.temporal.m
            public final long k(TemporalAccessor temporalAccessor) {
                if (f(temporalAccessor)) {
                    return (temporalAccessor.D(a.MONTH_OF_YEAR) + 2) / 3;
                }
                j$.time.f.f("Unsupported field: QuarterOfYear");
                return 0L;
            }

            @Override // j$.time.temporal.m
            public final p range() {
                return p.f(1L, 4L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }

            @Override // j$.time.temporal.m
            public final Temporal x(Temporal temporal, long j2) {
                long jK = k(temporal);
                range().b(j2, this);
                a aVar = a.MONTH_OF_YEAR;
                return temporal.a(((j2 - jK) * 3) + temporal.D(aVar), aVar);
            }
        };
        QUARTER_OF_YEAR = fVar2;
        f fVar3 = new f() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.m
            public final boolean f(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.c(a.EPOCH_DAY)) {
                    return false;
                }
                f fVar4 = h.f50054a;
                return Chronology.CC.a(temporalAccessor).equals(r.f49878d);
            }

            @Override // j$.time.temporal.m
            public final p h(TemporalAccessor temporalAccessor) {
                if (f(temporalAccessor)) {
                    return p.f(1L, f.D(f.B(LocalDate.M(temporalAccessor))));
                }
                j$.time.f.f("Unsupported field: WeekOfWeekBasedYear");
                return null;
            }

            @Override // j$.time.temporal.m
            public final long k(TemporalAccessor temporalAccessor) {
                if (f(temporalAccessor)) {
                    return f.z(LocalDate.M(temporalAccessor));
                }
                j$.time.f.f("Unsupported field: WeekOfWeekBasedYear");
                return 0L;
            }

            @Override // j$.time.temporal.f, j$.time.temporal.m
            public final TemporalAccessor m(HashMap map, a0 a0Var, b0 b0Var) {
                LocalDate localDateA;
                long j2;
                m mVar = f.WEEK_BASED_YEAR;
                Long l2 = (Long) map.get(mVar);
                a aVar = a.DAY_OF_WEEK;
                Long l3 = (Long) map.get(aVar);
                if (l2 != null && l3 != null) {
                    int iA = mVar.range().a(l2.longValue(), mVar);
                    long jLongValue = ((Long) map.get(f.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                    f fVar4 = h.f50054a;
                    if (Chronology.CC.a(a0Var).equals(r.f49878d)) {
                        LocalDate localDateOf = LocalDate.of(iA, 1, 4);
                        if (b0Var == b0.LENIENT) {
                            long jLongValue2 = l3.longValue();
                            if (jLongValue2 > 7) {
                                long j3 = jLongValue2 - 1;
                                localDateOf = localDateOf.X(j3 / 7);
                                j2 = j3 % 7;
                            } else {
                                if (jLongValue2 < 1) {
                                    localDateOf = localDateOf.X(j$.com.android.tools.r8.a.R(jLongValue2, 7L) / 7);
                                    j2 = (jLongValue2 + 6) % 7;
                                }
                                localDateA = localDateOf.X(j$.com.android.tools.r8.a.R(jLongValue, 1L)).a(jLongValue2, aVar);
                            }
                            jLongValue2 = j2 + 1;
                            localDateA = localDateOf.X(j$.com.android.tools.r8.a.R(jLongValue, 1L)).a(jLongValue2, aVar);
                        } else {
                            int iA2 = aVar.f50048b.a(l3.longValue(), aVar);
                            if (jLongValue < 1 || jLongValue > 52) {
                                if (b0Var == b0.STRICT) {
                                    p.f(1L, f.D(f.B(localDateOf))).b(jLongValue, this);
                                } else {
                                    range().b(jLongValue, this);
                                }
                            }
                            localDateA = localDateOf.X(jLongValue - 1).a(iA2, aVar);
                        }
                        map.remove(this);
                        map.remove(mVar);
                        map.remove(aVar);
                        return localDateA;
                    }
                    j$.time.f.h("Resolve requires IsoChronology");
                }
                return null;
            }

            @Override // j$.time.temporal.m
            public final p range() {
                return p.g(1L, 52L, 53L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }

            @Override // j$.time.temporal.m
            public final Temporal x(Temporal temporal, long j2) {
                range().b(j2, this);
                return temporal.b(j$.com.android.tools.r8.a.R(j2, k(temporal)), ChronoUnit.WEEKS);
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = fVar3;
        f fVar4 = new f() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.m
            public final boolean f(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.c(a.EPOCH_DAY)) {
                    return false;
                }
                f fVar5 = h.f50054a;
                return Chronology.CC.a(temporalAccessor).equals(r.f49878d);
            }

            @Override // j$.time.temporal.m
            public final p h(TemporalAccessor temporalAccessor) {
                if (f(temporalAccessor)) {
                    return a.YEAR.f50048b;
                }
                j$.time.f.f("Unsupported field: WeekBasedYear");
                return null;
            }

            @Override // j$.time.temporal.m
            public final long k(TemporalAccessor temporalAccessor) {
                if (f(temporalAccessor)) {
                    return f.B(LocalDate.M(temporalAccessor));
                }
                j$.time.f.f("Unsupported field: WeekBasedYear");
                return 0L;
            }

            @Override // j$.time.temporal.m
            public final p range() {
                return a.YEAR.f50048b;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }

            @Override // j$.time.temporal.m
            public final Temporal x(Temporal temporal, long j2) {
                if (!f(temporal)) {
                    j$.time.f.f("Unsupported field: WeekBasedYear");
                    return null;
                }
                int iA = a.YEAR.f50048b.a(j2, f.WEEK_BASED_YEAR);
                LocalDate localDateM = LocalDate.M(temporal);
                int iF = localDateM.f(a.DAY_OF_WEEK);
                int iZ = f.z(localDateM);
                if (iZ == 53 && f.D(iA) == 52) {
                    iZ = 52;
                }
                return temporal.y(LocalDate.of(iA, 1, 4).W(((iZ - 1) * 7) + (iF - r3.f(r6))));
            }
        };
        WEEK_BASED_YEAR = fVar4;
        f50050b = new f[]{fVar, fVar2, fVar3, fVar4};
        f50049a = new int[]{0, 90, 181, DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_CARD_EXTRA_INFO_PS_PS, 0, 91, DisplayStrings.DS_TRIP_OVERVIEW_FERRY_LABEL, DisplayStrings.DS_TRIP_OVERVIEW_CURRENT_LOCATION};
    }

    public static int B(LocalDate localDate) {
        int year = localDate.getYear();
        int iO = localDate.O();
        if (iO <= 3) {
            return iO - localDate.getDayOfWeek().ordinal() < -2 ? year - 1 : year;
        }
        if (iO >= 363) {
            return ((iO - DisplayStrings.DS_YOU_ARE_SHOWN_AS_OFFLINE) - (localDate.isLeapYear() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0 ? year + 1 : year;
        }
        return year;
    }

    public static int D(int i2) {
        LocalDate localDateOf = LocalDate.of(i2, 1, 1);
        if (localDateOf.getDayOfWeek() != DayOfWeek.THURSDAY) {
            return (localDateOf.getDayOfWeek() == DayOfWeek.WEDNESDAY && localDateOf.isLeapYear()) ? 53 : 52;
        }
        return 53;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f50050b.clone();
    }

    public static int z(LocalDate localDate) {
        int iOrdinal = localDate.getDayOfWeek().ordinal();
        int iO = localDate.O() - 1;
        int i2 = (3 - iOrdinal) + iO;
        int i3 = i2 - ((i2 / 7) * 7);
        int i4 = i3 - 3;
        if (i4 < -3) {
            i4 = i3 + 4;
        }
        if (iO < i4) {
            if (localDate.O() != 180) {
                localDate = LocalDate.U(localDate.f49800a, 180);
            }
            return (int) p.f(1L, D(B(localDate.Y(-1L)))).f50075d;
        }
        int i5 = ((iO - i4) / 7) + 1;
        if (i5 != 53 || i4 == -3 || (i4 == -2 && localDate.isLeapYear())) {
            return i5;
        }
        return 1;
    }

    @Override // j$.time.temporal.m
    public final boolean isDateBased() {
        return true;
    }

    public TemporalAccessor m(HashMap map, a0 a0Var, b0 b0Var) {
        return null;
    }
}
