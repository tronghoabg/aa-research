package androidx.compose.material3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CalendarLocale_jvmAndAndroidKt {
    private static final WeakHashMap<String, NumberFormat> cachedFormatters = new WeakHashMap<>();

    private static final NumberFormat getCachedDateTimeFormatter(int i2, int i3, boolean z, Locale locale) {
        String str = i2 + '.' + i3 + '.' + z + '.' + locale.toLanguageTag();
        WeakHashMap<String, NumberFormat> weakHashMap = cachedFormatters;
        NumberFormat integerInstance = weakHashMap.get(str);
        if (integerInstance == null) {
            integerInstance = NumberFormat.getIntegerInstance(locale);
            integerInstance.setGroupingUsed(z);
            integerInstance.setMinimumIntegerDigits(i2);
            integerInstance.setMaximumIntegerDigits(i3);
            weakHashMap.put(str, integerInstance);
        }
        return integerInstance;
    }

    public static final String toLocalString(int i2, int i3, int i4, boolean z, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return getCachedDateTimeFormatter(i3, i4, z, locale).format(Integer.valueOf(i2));
    }

    public static /* synthetic */ String toLocalString$default(int i2, int i3, int i4, boolean z, Locale locale, int i5, Object obj) {
        if (1 == (i5 & 1)) {
            i3 = 1;
        }
        if ((i5 & 2) != 0) {
            i4 = 40;
        }
        boolean z2 = z & ((i5 & 4) == 0);
        if ((i5 & 8) != 0) {
            locale = null;
        }
        return toLocalString(i2, i3, i4, z2, locale);
    }

    public static /* synthetic */ void CalendarLocale$annotations() {
    }
}
