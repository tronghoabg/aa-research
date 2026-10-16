package androidx.compose.material3.internal;

import a.a$$ExternalSyntheticApiModelOutline0;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import h.g.b.x;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CalendarModel_androidKt {
    public static final CalendarModel createCalendarModel(Locale locale) {
        return new CalendarModelImpl(locale);
    }

    public static final String formatWithSkeleton(long j2, String str, Locale locale, Map<String, Object> map) {
        String str2 = "S:" + str + locale.toLanguageTag();
        Object obj = map.get(str2);
        Object obj2 = obj;
        if (obj == null) {
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            instanceForSkeleton.setTimeZone(TimeZone.GMT_ZONE);
            map.put(str2, instanceForSkeleton);
            obj2 = instanceForSkeleton;
        }
        x.d(obj2, "null cannot be cast to non-null type android.icu.text.DateFormat");
        return a$$ExternalSyntheticApiModelOutline0.m5m(obj2).format(new Date(j2));
    }
}
