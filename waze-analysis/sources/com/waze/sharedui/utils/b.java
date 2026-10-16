package com.waze.sharedui.utils;

import android.content.Context;
import h.g.b.x;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f39083a = new b();

    public static final String a(long j2) {
        DateFormat timeFormat = android.text.format.DateFormat.getTimeFormat((Context) h.g.b(h.h.f48130a, new a(f39083a)).getValue());
        x.e(timeFormat, "getTimeFormat(...)");
        String str = timeFormat.format(new Date(j2));
        x.e(str, "format(...)");
        return str;
    }

    public static final Calendar b() {
        Calendar calendar = Calendar.getInstance();
        x.e(calendar, "getInstance(...)");
        return calendar;
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
