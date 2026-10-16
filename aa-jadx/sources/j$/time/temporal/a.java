package j$.time.temporal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NANO_OF_SECOND' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements j$.time.temporal.m {
    public static final j$.time.temporal.a ALIGNED_DAY_OF_WEEK_IN_MONTH;
    public static final j$.time.temporal.a ALIGNED_DAY_OF_WEEK_IN_YEAR;
    public static final j$.time.temporal.a ALIGNED_WEEK_OF_MONTH;
    public static final j$.time.temporal.a ALIGNED_WEEK_OF_YEAR;
    public static final j$.time.temporal.a AMPM_OF_DAY;
    public static final j$.time.temporal.a CLOCK_HOUR_OF_AMPM;
    public static final j$.time.temporal.a CLOCK_HOUR_OF_DAY;
    public static final j$.time.temporal.a DAY_OF_MONTH;
    public static final j$.time.temporal.a DAY_OF_WEEK;
    public static final j$.time.temporal.a DAY_OF_YEAR;
    public static final j$.time.temporal.a EPOCH_DAY;
    public static final j$.time.temporal.a ERA;
    public static final j$.time.temporal.a HOUR_OF_AMPM;
    public static final j$.time.temporal.a HOUR_OF_DAY;
    public static final j$.time.temporal.a INSTANT_SECONDS;
    public static final j$.time.temporal.a MICRO_OF_DAY;
    public static final j$.time.temporal.a MICRO_OF_SECOND;
    public static final j$.time.temporal.a MILLI_OF_DAY;
    public static final j$.time.temporal.a MILLI_OF_SECOND;
    public static final j$.time.temporal.a MINUTE_OF_DAY;
    public static final j$.time.temporal.a MINUTE_OF_HOUR;
    public static final j$.time.temporal.a MONTH_OF_YEAR;
    public static final j$.time.temporal.a NANO_OF_DAY;
    public static final j$.time.temporal.a NANO_OF_SECOND;
    public static final j$.time.temporal.a OFFSET_SECONDS;
    public static final j$.time.temporal.a PROLEPTIC_MONTH;
    public static final j$.time.temporal.a SECOND_OF_DAY;
    public static final j$.time.temporal.a SECOND_OF_MINUTE;
    public static final j$.time.temporal.a YEAR;
    public static final j$.time.temporal.a YEAR_OF_ERA;
    public static final /* synthetic */ j$.time.temporal.a[] c;
    public final java.lang.String a;
    public final j$.time.temporal.p b;

    static {
        j$.time.temporal.ChronoUnit chronoUnit = j$.time.temporal.ChronoUnit.NANOS;
        j$.time.temporal.ChronoUnit chronoUnit2 = j$.time.temporal.ChronoUnit.SECONDS;
        j$.time.temporal.a aVar = new j$.time.temporal.a("NANO_OF_SECOND", 0, "NanoOfSecond", chronoUnit, chronoUnit2, j$.time.temporal.p.f(0L, 999999999L));
        NANO_OF_SECOND = aVar;
        j$.time.temporal.ChronoUnit chronoUnit3 = j$.time.temporal.ChronoUnit.DAYS;
        j$.time.temporal.a aVar2 = new j$.time.temporal.a("NANO_OF_DAY", 1, "NanoOfDay", chronoUnit, chronoUnit3, j$.time.temporal.p.f(0L, 86399999999999L));
        NANO_OF_DAY = aVar2;
        j$.time.temporal.ChronoUnit chronoUnit4 = j$.time.temporal.ChronoUnit.MICROS;
        j$.time.temporal.a aVar3 = new j$.time.temporal.a("MICRO_OF_SECOND", 2, "MicroOfSecond", chronoUnit4, chronoUnit2, j$.time.temporal.p.f(0L, 999999L));
        MICRO_OF_SECOND = aVar3;
        j$.time.temporal.a aVar4 = new j$.time.temporal.a("MICRO_OF_DAY", 3, "MicroOfDay", chronoUnit4, chronoUnit3, j$.time.temporal.p.f(0L, 86399999999L));
        MICRO_OF_DAY = aVar4;
        j$.time.temporal.ChronoUnit chronoUnit5 = j$.time.temporal.ChronoUnit.MILLIS;
        j$.time.temporal.a aVar5 = new j$.time.temporal.a("MILLI_OF_SECOND", 4, "MilliOfSecond", chronoUnit5, chronoUnit2, j$.time.temporal.p.f(0L, 999L));
        MILLI_OF_SECOND = aVar5;
        j$.time.temporal.a aVar6 = new j$.time.temporal.a("MILLI_OF_DAY", 5, "MilliOfDay", chronoUnit5, chronoUnit3, j$.time.temporal.p.f(0L, 86399999L));
        MILLI_OF_DAY = aVar6;
        j$.time.temporal.ChronoUnit chronoUnit6 = j$.time.temporal.ChronoUnit.MINUTES;
        j$.time.temporal.a aVar7 = new j$.time.temporal.a("SECOND_OF_MINUTE", 6, "SecondOfMinute", chronoUnit2, chronoUnit6, j$.time.temporal.p.f(0L, 59L), 0);
        SECOND_OF_MINUTE = aVar7;
        j$.time.temporal.a aVar8 = new j$.time.temporal.a("SECOND_OF_DAY", 7, "SecondOfDay", chronoUnit2, chronoUnit3, j$.time.temporal.p.f(0L, 86399L));
        SECOND_OF_DAY = aVar8;
        j$.time.temporal.ChronoUnit chronoUnit7 = j$.time.temporal.ChronoUnit.HOURS;
        j$.time.temporal.a aVar9 = new j$.time.temporal.a("MINUTE_OF_HOUR", 8, "MinuteOfHour", chronoUnit6, chronoUnit7, j$.time.temporal.p.f(0L, 59L), 0);
        MINUTE_OF_HOUR = aVar9;
        j$.time.temporal.a aVar10 = new j$.time.temporal.a("MINUTE_OF_DAY", 9, "MinuteOfDay", chronoUnit6, chronoUnit3, j$.time.temporal.p.f(0L, 1439L));
        MINUTE_OF_DAY = aVar10;
        j$.time.temporal.ChronoUnit chronoUnit8 = j$.time.temporal.ChronoUnit.HALF_DAYS;
        j$.time.temporal.a aVar11 = new j$.time.temporal.a("HOUR_OF_AMPM", 10, "HourOfAmPm", chronoUnit7, chronoUnit8, j$.time.temporal.p.f(0L, 11L));
        HOUR_OF_AMPM = aVar11;
        j$.time.temporal.a aVar12 = new j$.time.temporal.a("CLOCK_HOUR_OF_AMPM", 11, "ClockHourOfAmPm", chronoUnit7, chronoUnit8, j$.time.temporal.p.f(1L, 12L));
        CLOCK_HOUR_OF_AMPM = aVar12;
        j$.time.temporal.a aVar13 = new j$.time.temporal.a("HOUR_OF_DAY", 12, "HourOfDay", chronoUnit7, chronoUnit3, j$.time.temporal.p.f(0L, 23L), 0);
        HOUR_OF_DAY = aVar13;
        j$.time.temporal.a aVar14 = new j$.time.temporal.a("CLOCK_HOUR_OF_DAY", 13, "ClockHourOfDay", chronoUnit7, chronoUnit3, j$.time.temporal.p.f(1L, 24L));
        CLOCK_HOUR_OF_DAY = aVar14;
        j$.time.temporal.a aVar15 = new j$.time.temporal.a("AMPM_OF_DAY", 14, "AmPmOfDay", chronoUnit8, chronoUnit3, j$.time.temporal.p.f(0L, 1L), 0);
        AMPM_OF_DAY = aVar15;
        j$.time.temporal.ChronoUnit chronoUnit9 = j$.time.temporal.ChronoUnit.WEEKS;
        j$.time.temporal.a aVar16 = new j$.time.temporal.a("DAY_OF_WEEK", 15, "DayOfWeek", chronoUnit3, chronoUnit9, j$.time.temporal.p.f(1L, 7L), 0);
        DAY_OF_WEEK = aVar16;
        j$.time.temporal.a aVar17 = new j$.time.temporal.a("ALIGNED_DAY_OF_WEEK_IN_MONTH", 16, "AlignedDayOfWeekInMonth", chronoUnit3, chronoUnit9, j$.time.temporal.p.f(1L, 7L));
        ALIGNED_DAY_OF_WEEK_IN_MONTH = aVar17;
        j$.time.temporal.a aVar18 = new j$.time.temporal.a("ALIGNED_DAY_OF_WEEK_IN_YEAR", 17, "AlignedDayOfWeekInYear", chronoUnit3, chronoUnit9, j$.time.temporal.p.f(1L, 7L));
        ALIGNED_DAY_OF_WEEK_IN_YEAR = aVar18;
        j$.time.temporal.ChronoUnit chronoUnit10 = j$.time.temporal.ChronoUnit.MONTHS;
        j$.time.temporal.a aVar19 = new j$.time.temporal.a("DAY_OF_MONTH", 18, "DayOfMonth", chronoUnit3, chronoUnit10, j$.time.temporal.p.g(1L, 28L, 31L), 0);
        DAY_OF_MONTH = aVar19;
        j$.time.temporal.ChronoUnit chronoUnit11 = j$.time.temporal.ChronoUnit.YEARS;
        j$.time.temporal.a aVar20 = new j$.time.temporal.a("DAY_OF_YEAR", 19, "DayOfYear", chronoUnit3, chronoUnit11, j$.time.temporal.p.g(1L, 365L, 366L));
        DAY_OF_YEAR = aVar20;
        j$.time.temporal.ChronoUnit chronoUnit12 = j$.time.temporal.ChronoUnit.FOREVER;
        j$.time.temporal.a aVar21 = new j$.time.temporal.a("EPOCH_DAY", 20, "EpochDay", chronoUnit3, chronoUnit12, j$.time.temporal.p.f(-365243219162L, 365241780471L));
        EPOCH_DAY = aVar21;
        j$.time.temporal.a aVar22 = new j$.time.temporal.a("ALIGNED_WEEK_OF_MONTH", 21, "AlignedWeekOfMonth", chronoUnit9, chronoUnit10, j$.time.temporal.p.g(1L, 4L, 5L));
        ALIGNED_WEEK_OF_MONTH = aVar22;
        j$.time.temporal.a aVar23 = new j$.time.temporal.a("ALIGNED_WEEK_OF_YEAR", 22, "AlignedWeekOfYear", chronoUnit9, chronoUnit11, j$.time.temporal.p.f(1L, 53L));
        ALIGNED_WEEK_OF_YEAR = aVar23;
        j$.time.temporal.a aVar24 = new j$.time.temporal.a("MONTH_OF_YEAR", 23, "MonthOfYear", chronoUnit10, chronoUnit11, j$.time.temporal.p.f(1L, 12L), 0);
        MONTH_OF_YEAR = aVar24;
        j$.time.temporal.a aVar25 = new j$.time.temporal.a("PROLEPTIC_MONTH", 24, "ProlepticMonth", chronoUnit10, chronoUnit12, j$.time.temporal.p.f(-11999999988L, 11999999999L));
        PROLEPTIC_MONTH = aVar25;
        j$.time.temporal.a aVar26 = new j$.time.temporal.a("YEAR_OF_ERA", 25, "YearOfEra", chronoUnit11, chronoUnit12, j$.time.temporal.p.g(1L, 999999999L, 1000000000L));
        YEAR_OF_ERA = aVar26;
        j$.time.temporal.a aVar27 = new j$.time.temporal.a("YEAR", 26, "Year", chronoUnit11, chronoUnit12, j$.time.temporal.p.f(-999999999L, 999999999L), 0);
        YEAR = aVar27;
        j$.time.temporal.a aVar28 = new j$.time.temporal.a("ERA", 27, "Era", j$.time.temporal.ChronoUnit.ERAS, chronoUnit12, j$.time.temporal.p.f(0L, 1L), 0);
        ERA = aVar28;
        j$.time.temporal.a aVar29 = new j$.time.temporal.a("INSTANT_SECONDS", 28, "InstantSeconds", chronoUnit2, chronoUnit12, j$.time.temporal.p.f(Long.MIN_VALUE, Long.MAX_VALUE));
        INSTANT_SECONDS = aVar29;
        j$.time.temporal.a aVar30 = new j$.time.temporal.a("OFFSET_SECONDS", 29, "OffsetSeconds", chronoUnit2, chronoUnit12, j$.time.temporal.p.f(-64800L, 64800L));
        OFFSET_SECONDS = aVar30;
        c = new j$.time.temporal.a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, aVar27, aVar28, aVar29, aVar30};
    }

    public a(java.lang.String str, int i, java.lang.String str2, j$.time.temporal.ChronoUnit chronoUnit, j$.time.temporal.ChronoUnit chronoUnit2, j$.time.temporal.p pVar) {
        super(str, i);
        this.a = str2;
        this.b = pVar;
    }

    public static j$.time.temporal.a valueOf(java.lang.String str) {
        return (j$.time.temporal.a) java.lang.Enum.valueOf(j$.time.temporal.a.class, str);
    }

    public static j$.time.temporal.a[] values() {
        return (j$.time.temporal.a[]) c.clone();
    }

    @Override // j$.time.temporal.m
    public final boolean h(j$.time.temporal.TemporalAccessor temporalAccessor) {
        return temporalAccessor.d(this);
    }

    @Override // j$.time.temporal.m
    public final boolean isDateBased() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.p k(j$.time.temporal.TemporalAccessor temporalAccessor) {
        return temporalAccessor.l(this);
    }

    @Override // j$.time.temporal.m
    public final long l(j$.time.temporal.TemporalAccessor temporalAccessor) {
        return temporalAccessor.C(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.TemporalAccessor p(java.util.HashMap map, j$.time.format.c0 c0Var, j$.time.format.d0 d0Var) {
        return null;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.Temporal r(j$.time.temporal.Temporal temporal, long j) {
        return temporal.a(j, this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.p range() {
        return this.b;
    }

    public final void s(long j) {
        this.b.b(j, this);
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.a;
    }

    public final boolean w() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    public a(java.lang.String str, int i, java.lang.String str2, j$.time.temporal.ChronoUnit chronoUnit, j$.time.temporal.ChronoUnit chronoUnit2, j$.time.temporal.p pVar, int i2) {
        super(str, i);
        this.a = str2;
        this.b = pVar;
    }
}
