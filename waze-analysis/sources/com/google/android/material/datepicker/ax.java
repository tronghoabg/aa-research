package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import androidx.compose.material3.DatePickerDefaults;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ax {

    /* renamed from: a, reason: collision with root package name */
    static final AtomicReference f6435a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f6436b = 0;

    static long a(long j2) {
        Calendar calendarK = k();
        calendarK.setTimeInMillis(j2);
        return i(calendarK).getTimeInMillis();
    }

    static DateFormat b(Locale locale) {
        return m("MMMd", locale);
    }

    static DateFormat c(Locale locale) {
        return m("MMMMEEEEd", locale);
    }

    static DateFormat d(Locale locale) {
        return m(DatePickerDefaults.YearAbbrMonthDaySkeleton, locale);
    }

    static DateFormat e(Locale locale) {
        return m(DatePickerDefaults.YearMonthSkeleton, locale);
    }

    static DateFormat f(Locale locale) {
        return m(DatePickerDefaults.YearMonthWeekdayDaySkeleton, locale);
    }

    static java.text.DateFormat g(java.text.DateFormat dateFormat) {
        java.text.DateFormat dateFormat2 = (java.text.DateFormat) dateFormat.clone();
        dateFormat2.setTimeZone(n());
        return dateFormat2;
    }

    static SimpleDateFormat h() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern().replaceAll("[^dMy/\\-.]", "").replaceAll("d{1,2}", "dd").replaceAll("M{1,2}", "MM").replaceAll("y{1,4}", "yyyy").replaceAll("\\.$", "").replaceAll("My", "M/y"), Locale.getDefault());
        simpleDateFormat.setTimeZone(n());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    static Calendar i(Calendar calendar) {
        Calendar calendarL = l(calendar);
        Calendar calendarK = k();
        calendarK.set(calendarL.get(1), calendarL.get(2), calendarL.get(5));
        return calendarK;
    }

    static Calendar j() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(n());
        return calendar;
    }

    static Calendar k() {
        return l(null);
    }

    static Calendar l(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(n());
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }

    private static DateFormat m(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    private static java.util.TimeZone n() {
        return DesugarTimeZone.getTimeZone("UTC");
    }
}
