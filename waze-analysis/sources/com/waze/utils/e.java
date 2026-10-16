package com.waze.utils;

import com.waze.R;
import j$.time.Duration;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    static final long f44867a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f44868b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f44869c = {-8859415, -28528, -3034903, -10098765, -6830380, -13468526, -5311};

    /* renamed from: d, reason: collision with root package name */
    private static final com.waze.shared_infra.o.a f44870d;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        f44867a = 60L;
        f44870d = com.waze.shared_infra.o.b.a();
    }

    public static int a(Object obj) {
        return f44869c[Math.abs(obj.hashCode()) % 7];
    }

    public static String b(Duration duration) {
        long hours = duration.toHours();
        long minutes = duration.minusHours(hours).toMinutes();
        return hours >= 1 ? minutes >= 1 ? f44870d.c(R.string.AD_PREVIEW_DETOUR_TIME_HOUR_AND_MIN_PD_PD, Long.valueOf(hours), Long.valueOf(minutes)) : f44870d.c(R.string.AD_PREVIEW_DETOUR_TIME_HOUR_PD, Long.valueOf(hours)) : f44870d.c(R.string.AD_PREVIEW_DETOUR_TIME_MIN_PD, Long.valueOf(Math.max(minutes, 1L)));
    }

    public static String c(long j2) {
        long j3 = f44867a;
        long j4 = j2 / j3;
        long j5 = j2 % j3;
        Locale localeD = ((com.waze.sharedui.m) com.waze.web.r.h(com.waze.sharedui.m.class)).d();
        return j4 > 0 ? String.format(localeD, "%d:%02d %s", Long.valueOf(j4), Long.valueOf(j5), f44870d.c(R.string.H, new Object[0])) : String.format(localeD, "%d %s", Long.valueOf(j5), f44870d.c(R.string.MIN, new Object[0]));
    }
}
