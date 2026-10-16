package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel_androidKt;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class DatePickerFormatterImpl implements DatePickerFormatter {
    private final Map<String, Object> formatterCache = new LinkedHashMap();
    private final String selectedDateDescriptionSkeleton;
    private final String selectedDateSkeleton;
    private final String yearSelectionSkeleton;

    public DatePickerFormatterImpl(String str, String str2, String str3) {
        this.yearSelectionSkeleton = str;
        this.selectedDateSkeleton = str2;
        this.selectedDateDescriptionSkeleton = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DatePickerFormatterImpl)) {
            return false;
        }
        DatePickerFormatterImpl datePickerFormatterImpl = (DatePickerFormatterImpl) obj;
        return x.n(this.yearSelectionSkeleton, datePickerFormatterImpl.yearSelectionSkeleton) && x.n(this.selectedDateSkeleton, datePickerFormatterImpl.selectedDateSkeleton) && x.n(this.selectedDateDescriptionSkeleton, datePickerFormatterImpl.selectedDateDescriptionSkeleton);
    }

    @Override // androidx.compose.material3.DatePickerFormatter
    public String formatDate(Long l2, Locale locale, boolean z) {
        if (l2 == null) {
            return null;
        }
        return CalendarModel_androidKt.formatWithSkeleton(l2.longValue(), z ? this.selectedDateDescriptionSkeleton : this.selectedDateSkeleton, locale, this.formatterCache);
    }

    @Override // androidx.compose.material3.DatePickerFormatter
    public String formatMonthYear(Long l2, Locale locale) {
        if (l2 == null) {
            return null;
        }
        return CalendarModel_androidKt.formatWithSkeleton(l2.longValue(), this.yearSelectionSkeleton, locale, this.formatterCache);
    }

    public final String getSelectedDateDescriptionSkeleton() {
        return this.selectedDateDescriptionSkeleton;
    }

    public final String getSelectedDateSkeleton() {
        return this.selectedDateSkeleton;
    }

    public final String getYearSelectionSkeleton() {
        return this.yearSelectionSkeleton;
    }

    public int hashCode() {
        return (((this.yearSelectionSkeleton.hashCode() * 31) + this.selectedDateSkeleton.hashCode()) * 31) + this.selectedDateDescriptionSkeleton.hashCode();
    }
}
