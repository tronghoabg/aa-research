package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class yrs {
    private static java.lang.String a = "ysa";
    private static java.lang.String b = "com.google.common.flogger.backend.google.GooglePlatform";
    private static java.lang.String c = "ysn";
    private static final java.lang.String[] d = {"ysa", "com.google.common.flogger.backend.google.GooglePlatform", "ysn"};

    public static int a() {
        return ((defpackage.ytl) defpackage.ytl.a.get()).b;
    }

    public static long b() {
        return defpackage.yrq.a.c();
    }

    public static defpackage.yqu d(java.lang.String str) {
        return defpackage.yrq.a.e(str);
    }

    public static defpackage.yqy f() {
        return i().a();
    }

    public static defpackage.yrr g() {
        return defpackage.yrq.a.h();
    }

    public static defpackage.ysr i() {
        return defpackage.yrq.a.j();
    }

    public static defpackage.ysy k() {
        return i().b();
    }

    public static java.lang.String l() {
        return defpackage.yrq.a.m();
    }

    public static boolean n(java.lang.String str, java.util.logging.Level level, boolean z) {
        i().d(str, level, z);
        return false;
    }

    protected long c() {
        return java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(java.lang.System.currentTimeMillis());
    }

    protected abstract defpackage.yqu e(java.lang.String str);

    protected abstract defpackage.yrr h();

    protected defpackage.ysr j() {
        return defpackage.yst.a;
    }

    protected abstract java.lang.String m();
}
