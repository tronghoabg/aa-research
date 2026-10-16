package androidx.compose.material3;

import androidx.compose.material3.DateRangePickerStateImpl;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import h.a.i;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import h.k.j;
import java.util.List;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class DateRangePickerStateImpl extends BaseDatePickerStateImpl implements DateRangePickerState {
    public static final Companion Companion = new Companion(null);
    private MutableState<DisplayMode> _displayMode;
    private MutableState<CalendarDate> _selectedEndDate;
    private MutableState<CalendarDate> _selectedStartDate;

    private DateRangePickerStateImpl(Long l2, Long l3, Long l4, j jVar, int i2, SelectableDates selectableDates, Locale locale) {
        super(l4, jVar, selectableDates, locale);
        this._selectedStartDate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this._selectedEndDate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        setSelection(l2, l3);
        this._displayMode = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(DisplayMode.m4765boximpl(i2), null, 2, null);
    }

    private final CalendarDate getDate(Long l2) {
        if (l2 == null) {
            return null;
        }
        CalendarDate canonicalDate = getCalendarModel().getCanonicalDate(l2.longValue());
        if (getYearRange().g(canonicalDate.getYear())) {
            return canonicalDate;
        }
        return null;
    }

    @Override // androidx.compose.material3.DateRangePickerState
    /* renamed from: getDisplayMode-jFl-4v0 */
    public int mo4736getDisplayModejFl4v0() {
        return this._displayMode.getValue().m4771unboximpl();
    }

    @Override // androidx.compose.material3.DateRangePickerState
    public Long getSelectedEndDateMillis() {
        CalendarDate value = this._selectedEndDate.getValue();
        if (value != null) {
            return Long.valueOf(value.getUtcTimeMillis());
        }
        return null;
    }

    @Override // androidx.compose.material3.DateRangePickerState
    public Long getSelectedStartDateMillis() {
        CalendarDate value = this._selectedStartDate.getValue();
        if (value != null) {
            return Long.valueOf(value.getUtcTimeMillis());
        }
        return null;
    }

    @Override // androidx.compose.material3.DateRangePickerState
    /* renamed from: setDisplayMode-vCnGnXg */
    public void mo4737setDisplayModevCnGnXg(int i2) {
        Long selectedStartDateMillis = getSelectedStartDateMillis();
        if (selectedStartDateMillis != null) {
            setDisplayedMonthMillis(getCalendarModel().getMonth(selectedStartDateMillis.longValue()).getStartUtcTimeMillis());
        }
        this._displayMode.setValue(DisplayMode.m4765boximpl(i2));
    }

    @Override // androidx.compose.material3.DateRangePickerState
    public void setSelection(Long l2, Long l3) {
        CalendarDate date = getDate(l2);
        CalendarDate date2 = getDate(l3);
        if (date == null || (date2 != null && date.getUtcTimeMillis() > date2.getUtcTimeMillis())) {
            this._selectedStartDate.setValue(null);
            this._selectedEndDate.setValue(null);
        } else {
            this._selectedStartDate.setValue(date);
            this._selectedEndDate.setValue(date2);
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        static final DateRangePickerStateImpl Saver$lambda$1(SelectableDates selectableDates, Locale locale, List list) {
            Long l2 = (Long) list.get(0);
            Long l3 = (Long) list.get(1);
            Long l4 = (Long) list.get(2);
            Object obj = list.get(3);
            x.d(obj, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj).intValue();
            Object obj2 = list.get(4);
            x.d(obj2, "null cannot be cast to non-null type kotlin.Int");
            j jVar = new j(iIntValue, ((Integer) obj2).intValue());
            Object obj3 = list.get(5);
            x.d(obj3, "null cannot be cast to non-null type kotlin.Int");
            return new DateRangePickerStateImpl(l2, l3, l4, jVar, ((Integer) obj3).intValue(), selectableDates, locale, null);
        }

        public final Saver<DateRangePickerStateImpl, Object> Saver(final SelectableDates selectableDates, final Locale locale) {
            return ListSaverKt.listSaver(new p() { // from class: androidx.compose.material3.DateRangePickerStateImpl$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    DateRangePickerStateImpl dateRangePickerStateImpl = (DateRangePickerStateImpl) obj2;
                    return i.i(dateRangePickerStateImpl.getSelectedStartDateMillis(), dateRangePickerStateImpl.getSelectedEndDateMillis(), Long.valueOf(dateRangePickerStateImpl.getDisplayedMonthMillis()), Integer.valueOf(dateRangePickerStateImpl.getYearRange().a()), Integer.valueOf(dateRangePickerStateImpl.getYearRange().b()), Integer.valueOf(dateRangePickerStateImpl.mo4736getDisplayModejFl4v0()));
                }
            }, new l() { // from class: androidx.compose.material3.DateRangePickerStateImpl$Companion$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return DateRangePickerStateImpl.Companion.Saver$lambda$1(selectableDates, locale, (List) obj);
                }
            });
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ DateRangePickerStateImpl(Long l2, Long l3, Long l4, j jVar, int i2, SelectableDates selectableDates, Locale locale, o oVar) {
        this(l2, l3, l4, jVar, i2, selectableDates, locale);
    }
}
