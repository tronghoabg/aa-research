package com.google.android.material.datepicker;

import android.content.Context;
import com.waze.R;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class aw {
    private aw() {
    }

    static String a(long j2) {
        return d(j2) ? ax.b(Locale.getDefault()).format(new Date(j2)) : c(j2);
    }

    static String b(Context context, long j2, boolean z, boolean z2, boolean z3) {
        String str = d(j2) ? ax.c(Locale.getDefault()).format(new Date(j2)) : ax.f(Locale.getDefault()).format(new Date(j2));
        if (z) {
            str = String.format(context.getString(R.string.mtrl_picker_today_description), str);
        }
        return z2 ? String.format(context.getString(R.string.mtrl_picker_start_date_description), str) : z3 ? String.format(context.getString(R.string.mtrl_picker_end_date_description), str) : str;
    }

    static String c(long j2) {
        return ax.d(Locale.getDefault()).format(new Date(j2));
    }

    private static boolean d(long j2) {
        Calendar calendarJ = ax.j();
        Calendar calendarK = ax.k();
        calendarK.setTimeInMillis(j2);
        return calendarJ.get(1) == calendarK.get(1);
    }
}
