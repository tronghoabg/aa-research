package com.pgl.ssdk;

import java.util.Calendar;

/* loaded from: classes4.dex */
public class ay {
    public static void a(long j8) {
        try {
            Thread.currentThread();
            Thread.sleep(j8);
        } catch (Throwable unused) {
        }
    }

    public static boolean a(long j8, long j10) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTimeInMillis(j8);
        calendar2.setTimeInMillis(j10);
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(6) == calendar2.get(6);
    }
}
