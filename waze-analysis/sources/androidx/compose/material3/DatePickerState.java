package androidx.compose.material3;

import h.k.j;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface DatePickerState {
    /* renamed from: getDisplayMode-jFl-4v0, reason: not valid java name */
    int mo4711getDisplayModejFl4v0();

    long getDisplayedMonthMillis();

    Locale getLocale();

    SelectableDates getSelectableDates();

    Long getSelectedDateMillis();

    j getYearRange();

    /* renamed from: setDisplayMode-vCnGnXg, reason: not valid java name */
    void mo4712setDisplayModevCnGnXg(int i2);

    void setDisplayedMonthMillis(long j2);

    void setSelectedDateMillis(Long l2);
}
