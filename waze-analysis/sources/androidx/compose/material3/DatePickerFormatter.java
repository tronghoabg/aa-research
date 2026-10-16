package androidx.compose.material3;

import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface DatePickerFormatter {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.DatePickerFormatter$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ String formatDate$default(DatePickerFormatter datePickerFormatter, Long l2, Locale locale, boolean z, int i2, Object obj) {
            if (obj == null) {
                return datePickerFormatter.formatDate(l2, locale, z & ((i2 & 4) == 0));
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatDate");
        }
    }

    String formatDate(Long l2, Locale locale, boolean z);

    String formatMonthYear(Long l2, Locale locale);
}
