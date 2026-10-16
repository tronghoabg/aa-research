package androidx.compose.material3;

import androidx.compose.material3.DatePickerStateImpl;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.runtime.MutableState;
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
final class DatePickerStateImpl extends BaseDatePickerStateImpl implements DatePickerState {
    public static final Companion Companion = new Companion(null);
    private MutableState<DisplayMode> _displayMode;
    private MutableState<CalendarDate> _selectedDate;

    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private DatePickerStateImpl(java.lang.Long r3, java.lang.Long r4, h.k.j r5, int r6, androidx.compose.material3.SelectableDates r7, java.util.Locale r8) {
        /*
            r2 = this;
            r2.<init>(r4, r5, r7, r8)
            r4 = 0
            if (r3 == 0) goto L1c
            androidx.compose.material3.internal.CalendarModel r7 = r2.getCalendarModel()
            long r0 = r3.longValue()
            androidx.compose.material3.internal.CalendarDate r3 = r7.getCanonicalDate(r0)
            int r7 = r3.getYear()
            boolean r5 = r5.g(r7)
            if (r5 != 0) goto L1d
        L1c:
            r3 = r4
        L1d:
            r5 = 2
            androidx.compose.runtime.MutableState r3 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default(r3, r4, r5, r4)
            r2._selectedDate = r3
            androidx.compose.material3.DisplayMode r3 = androidx.compose.material3.DisplayMode.m4765boximpl(r6)
            androidx.compose.runtime.MutableState r3 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default(r3, r4, r5, r4)
            r2._displayMode = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerStateImpl.<init>(java.lang.Long, java.lang.Long, h.k.j, int, androidx.compose.material3.SelectableDates, java.util.Locale):void");
    }

    @Override // androidx.compose.material3.DatePickerState
    /* renamed from: getDisplayMode-jFl-4v0 */
    public int mo4711getDisplayModejFl4v0() {
        return this._displayMode.getValue().m4771unboximpl();
    }

    @Override // androidx.compose.material3.DatePickerState
    public Long getSelectedDateMillis() {
        CalendarDate value = this._selectedDate.getValue();
        if (value != null) {
            return Long.valueOf(value.getUtcTimeMillis());
        }
        return null;
    }

    @Override // androidx.compose.material3.DatePickerState
    /* renamed from: setDisplayMode-vCnGnXg */
    public void mo4712setDisplayModevCnGnXg(int i2) {
        Long selectedDateMillis = getSelectedDateMillis();
        if (selectedDateMillis != null) {
            setDisplayedMonthMillis(getCalendarModel().getMonth(selectedDateMillis.longValue()).getStartUtcTimeMillis());
        }
        this._displayMode.setValue(DisplayMode.m4765boximpl(i2));
    }

    @Override // androidx.compose.material3.DatePickerState
    public void setSelectedDateMillis(Long l2) {
        if (l2 == null) {
            this._selectedDate.setValue(null);
        } else {
            CalendarDate canonicalDate = getCalendarModel().getCanonicalDate(l2.longValue());
            this._selectedDate.setValue(true == getYearRange().g(canonicalDate.getYear()) ? canonicalDate : null);
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        static final DatePickerStateImpl Saver$lambda$1(SelectableDates selectableDates, Locale locale, List list) {
            Long l2 = (Long) list.get(0);
            Long l3 = (Long) list.get(1);
            Object obj = list.get(2);
            x.d(obj, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj).intValue();
            Object obj2 = list.get(3);
            x.d(obj2, "null cannot be cast to non-null type kotlin.Int");
            j jVar = new j(iIntValue, ((Integer) obj2).intValue());
            Object obj3 = list.get(4);
            x.d(obj3, "null cannot be cast to non-null type kotlin.Int");
            return new DatePickerStateImpl(l2, l3, jVar, ((Integer) obj3).intValue(), selectableDates, locale, null);
        }

        public final Saver<DatePickerStateImpl, Object> Saver(final SelectableDates selectableDates, final Locale locale) {
            return ListSaverKt.listSaver(new p() { // from class: androidx.compose.material3.DatePickerStateImpl$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    DatePickerStateImpl datePickerStateImpl = (DatePickerStateImpl) obj2;
                    return i.i(datePickerStateImpl.getSelectedDateMillis(), Long.valueOf(datePickerStateImpl.getDisplayedMonthMillis()), Integer.valueOf(datePickerStateImpl.getYearRange().a()), Integer.valueOf(datePickerStateImpl.getYearRange().b()), Integer.valueOf(datePickerStateImpl.mo4711getDisplayModejFl4v0()));
                }
            }, new l() { // from class: androidx.compose.material3.DatePickerStateImpl$Companion$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return DatePickerStateImpl.Companion.Saver$lambda$1(selectableDates, locale, (List) obj);
                }
            });
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ DatePickerStateImpl(Long l2, Long l3, j jVar, int i2, SelectableDates selectableDates, Locale locale, o oVar) {
        this(l2, l3, jVar, i2, selectableDates, locale);
    }
}
