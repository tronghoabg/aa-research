package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarModel_androidKt;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import h.k.j;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class BaseDatePickerStateImpl {
    public static final int $stable = 0;
    private final MutableState<CalendarMonth> _displayedMonth;
    private final CalendarModel calendarModel;
    private final Locale locale;
    private final MutableState selectableDates$delegate;
    private final j yearRange;

    public BaseDatePickerStateImpl(Long l2, j jVar, SelectableDates selectableDates, Locale locale) {
        CalendarMonth month;
        this.yearRange = jVar;
        this.locale = locale;
        CalendarModel calendarModelCreateCalendarModel = CalendarModel_androidKt.createCalendarModel(locale);
        this.calendarModel = calendarModelCreateCalendarModel;
        this.selectableDates$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(selectableDates, null, 2, null);
        if (l2 != null) {
            month = calendarModelCreateCalendarModel.getMonth(l2.longValue());
            if (!jVar.g(month.getYear())) {
                month = calendarModelCreateCalendarModel.getMonth(calendarModelCreateCalendarModel.getToday());
            }
        } else {
            month = calendarModelCreateCalendarModel.getMonth(calendarModelCreateCalendarModel.getToday());
        }
        this._displayedMonth = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(month, null, 2, null);
    }

    public final CalendarModel getCalendarModel() {
        return this.calendarModel;
    }

    public final long getDisplayedMonthMillis() {
        return this._displayedMonth.getValue().getStartUtcTimeMillis();
    }

    public final Locale getLocale() {
        return this.locale;
    }

    public final SelectableDates getSelectableDates() {
        return (SelectableDates) this.selectableDates$delegate.getValue();
    }

    public final j getYearRange() {
        return this.yearRange;
    }

    public final void setDisplayedMonthMillis(long j2) {
        CalendarMonth month = this.calendarModel.getMonth(j2);
        if (this.yearRange.g(month.getYear())) {
            this._displayedMonth.setValue(month);
        }
    }

    public final void setSelectableDates(SelectableDates selectableDates) {
        this.selectableDates$delegate.setValue(selectableDates);
    }
}
