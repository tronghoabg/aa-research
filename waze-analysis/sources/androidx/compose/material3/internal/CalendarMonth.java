package androidx.compose.material3.internal;

import h.k.j;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CalendarMonth {
    public static final int $stable = 0;
    private final int daysFromStartOfWeekToFirstOfMonth;
    private final long endUtcTimeMillis;
    private final int month;
    private final int numberOfDays;
    private final long startUtcTimeMillis;
    private final int year;

    public CalendarMonth(int i2, int i3, int i4, int i5, long j2) {
        this.year = i2;
        this.month = i3;
        this.numberOfDays = i4;
        this.daysFromStartOfWeekToFirstOfMonth = i5;
        this.startUtcTimeMillis = j2;
        this.endUtcTimeMillis = (j2 + (i4 * CalendarModelKt.MillisecondsIn24Hours)) - 1;
    }

    public static /* synthetic */ CalendarMonth copy$default(CalendarMonth calendarMonth, int i2, int i3, int i4, int i5, long j2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = calendarMonth.year;
        }
        if ((i6 & 2) != 0) {
            i3 = calendarMonth.month;
        }
        if ((i6 & 4) != 0) {
            i4 = calendarMonth.numberOfDays;
        }
        if ((i6 & 8) != 0) {
            i5 = calendarMonth.daysFromStartOfWeekToFirstOfMonth;
        }
        if ((i6 & 16) != 0) {
            j2 = calendarMonth.startUtcTimeMillis;
        }
        long j3 = j2;
        return calendarMonth.copy(i2, i3, i4, i5, j3);
    }

    public final int component1() {
        return this.year;
    }

    public final int component2() {
        return this.month;
    }

    public final int component3() {
        return this.numberOfDays;
    }

    public final int component4() {
        return this.daysFromStartOfWeekToFirstOfMonth;
    }

    public final long component5() {
        return this.startUtcTimeMillis;
    }

    public final CalendarMonth copy(int i2, int i3, int i4, int i5, long j2) {
        return new CalendarMonth(i2, i3, i4, i5, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarMonth)) {
            return false;
        }
        CalendarMonth calendarMonth = (CalendarMonth) obj;
        return this.year == calendarMonth.year && this.month == calendarMonth.month && this.numberOfDays == calendarMonth.numberOfDays && this.daysFromStartOfWeekToFirstOfMonth == calendarMonth.daysFromStartOfWeekToFirstOfMonth && this.startUtcTimeMillis == calendarMonth.startUtcTimeMillis;
    }

    public final String format(CalendarModel calendarModel, String str) {
        return calendarModel.formatWithSkeleton(this, str, calendarModel.getLocale());
    }

    public final int getDaysFromStartOfWeekToFirstOfMonth() {
        return this.daysFromStartOfWeekToFirstOfMonth;
    }

    public final long getEndUtcTimeMillis() {
        return this.endUtcTimeMillis;
    }

    public final int getMonth() {
        return this.month;
    }

    public final int getNumberOfDays() {
        return this.numberOfDays;
    }

    public final long getStartUtcTimeMillis() {
        return this.startUtcTimeMillis;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        return (((((((this.year * 31) + this.month) * 31) + this.numberOfDays) * 31) + this.daysFromStartOfWeekToFirstOfMonth) * 31) + CalendarMonth$$ExternalSyntheticBackport0.m(this.startUtcTimeMillis);
    }

    public final int indexIn(j jVar) {
        return (((this.year - jVar.a()) * 12) + this.month) - 1;
    }

    public String toString() {
        return "CalendarMonth(year=" + this.year + ", month=" + this.month + ", numberOfDays=" + this.numberOfDays + ", daysFromStartOfWeekToFirstOfMonth=" + this.daysFromStartOfWeekToFirstOfMonth + ", startUtcTimeMillis=" + this.startUtcTimeMillis + ')';
    }
}
