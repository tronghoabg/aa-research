package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: classes.dex */
public abstract class yqn {
    private static String a = "yqv";
    private static String b = "com.google.common.flogger.backend.google.GooglePlatform";
    private static String c = "yri";
    private static final String[] d = {"yqv", "com.google.common.flogger.backend.google.GooglePlatform", "yri"};

    public static int a() {
        return ((ysg) ysg.a.get()).b;
    }

    public static long b() {
        return yql.a.c();
    }

    public static ypp d(String str) {
        return yql.a.e(str);
    }

    public static ypt f() {
        return i().a();
    }

    public static yqm g() {
        return yql.a.h();
    }

    public static yrm i() {
        return yql.a.j();
    }

    public static yrt k() {
        return i().b();
    }

    public static String l() {
        return yql.a.m();
    }

    public static boolean n(String str, Level level, boolean z) {
        i().d(str, level, z);
        return false;
    }

    protected long c() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    protected abstract ypp e(String str);

    protected abstract yqm h();

    protected yrm j() {
        return yro.a;
    }

    protected abstract String m();
}
