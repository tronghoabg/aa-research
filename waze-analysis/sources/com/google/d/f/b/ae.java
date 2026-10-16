package com.google.d.f.b;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class ae {

    /* renamed from: a, reason: collision with root package name */
    private static String f7733a = "com.google.d.f.b.a.f";

    /* renamed from: b, reason: collision with root package name */
    private static String f7734b = "com.google.common.flogger.backend.google.GooglePlatform";

    /* renamed from: c, reason: collision with root package name */
    private static String f7735c = "com.google.common.flogger.backend.system.DefaultPlatform";

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f7736d = {"com.google.d.f.b.a.f", "com.google.common.flogger.backend.google.GooglePlatform", "com.google.common.flogger.backend.system.DefaultPlatform"};

    public static int a() {
        return com.google.d.f.f.c.a();
    }

    public static long b() {
        return ac.f7732a.c();
    }

    public static g d(String str) {
        return ac.f7732a.e(str);
    }

    public static k f() {
        return i().a();
    }

    public static ad g() {
        return ac.f7732a.h();
    }

    public static com.google.d.f.c.a i() {
        return ac.f7732a.j();
    }

    public static com.google.d.f.c.j k() {
        return i().c();
    }

    public static String l() {
        return ac.f7732a.m();
    }

    public static boolean n(String str, Level level, boolean z) {
        i().d(str, level, z);
        return false;
    }

    protected long c() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    protected abstract g e(String str);

    protected abstract ad h();

    protected com.google.d.f.c.a j() {
        return com.google.d.f.c.a.e();
    }

    protected abstract String m();
}
