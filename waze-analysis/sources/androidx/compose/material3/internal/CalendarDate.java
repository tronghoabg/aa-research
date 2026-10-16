package androidx.compose.material3.internal;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CalendarDate implements Comparable<CalendarDate> {
    public static final int $stable = 0;
    private final int dayOfMonth;
    private final int month;
    private final long utcTimeMillis;
    private final int year;

    public CalendarDate(int i2, int i3, int i4, long j2) {
        this.year = i2;
        this.month = i3;
        this.dayOfMonth = i4;
        this.utcTimeMillis = j2;
    }

    public static /* synthetic */ CalendarDate copy$default(CalendarDate calendarDate, int i2, int i3, int i4, long j2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = calendarDate.year;
        }
        if ((i5 & 2) != 0) {
            i3 = calendarDate.month;
        }
        if ((i5 & 4) != 0) {
            i4 = calendarDate.dayOfMonth;
        }
        if ((i5 & 8) != 0) {
            j2 = calendarDate.utcTimeMillis;
        }
        int i6 = i4;
        return calendarDate.copy(i2, i3, i6, j2);
    }

    @Override // java.lang.Comparable
    public int compareTo(CalendarDate calendarDate) {
        return x.b(this.utcTimeMillis, calendarDate.utcTimeMillis);
    }

    public final int component1() {
        return this.year;
    }

    public final int component2() {
        return this.month;
    }

    public final int component3() {
        return this.dayOfMonth;
    }

    public final long component4() {
        return this.utcTimeMillis;
    }

    public final CalendarDate copy(int i2, int i3, int i4, long j2) {
        return new CalendarDate(i2, i3, i4, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarDate)) {
            return false;
        }
        CalendarDate calendarDate = (CalendarDate) obj;
        return this.year == calendarDate.year && this.month == calendarDate.month && this.dayOfMonth == calendarDate.dayOfMonth && this.utcTimeMillis == calendarDate.utcTimeMillis;
    }

    public final String format(CalendarModel calendarModel, String str) {
        return calendarModel.formatWithSkeleton(this, str, calendarModel.getLocale());
    }

    public final int getDayOfMonth() {
        return this.dayOfMonth;
    }

    public final int getMonth() {
        return this.month;
    }

    public final long getUtcTimeMillis() {
        return this.utcTimeMillis;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        return (((((this.year * 31) + this.month) * 31) + this.dayOfMonth) * 31) + CalendarDate$$ExternalSyntheticBackport0.m(this.utcTimeMillis);
    }

    public String toString() {
        return "CalendarDate(year=" + this.year + ", month=" + this.month + ", dayOfMonth=" + this.dayOfMonth + ", utcTimeMillis=" + this.utcTimeMillis + ')';
    }
}
