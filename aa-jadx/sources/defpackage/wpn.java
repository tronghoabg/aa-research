package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wpn {
    static final java.util.concurrent.atomic.AtomicReference a = new java.util.concurrent.atomic.AtomicReference();

    static long a(long j) {
        java.util.Calendar calendarE = e(null);
        calendarE.setTimeInMillis(j);
        return c(calendarE).getTimeInMillis();
    }

    public static android.icu.text.DateFormat b(java.lang.String str, java.util.Locale locale) {
        android.icu.text.DateFormat instanceForSkeleton = android.icu.text.DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(android.icu.util.TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(android.icu.text.DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    public static java.util.Calendar c(java.util.Calendar calendar) {
        java.util.Calendar calendarE = e(calendar);
        java.util.Calendar calendarE2 = e(null);
        calendarE2.set(calendarE.get(1), calendarE.get(2), calendarE.get(5));
        return calendarE2;
    }

    static java.util.Calendar d() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(j$.util.DesugarTimeZone.getTimeZone("UTC"));
        return calendar;
    }

    public static java.util.Calendar e(java.util.Calendar calendar) {
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(j$.util.DesugarTimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }
}
