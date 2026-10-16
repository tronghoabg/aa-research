package com.apm.insight;

import android.app.Application;
import android.content.Context;
import com.apm.insight.runtime.ConfigManager;
import com.apm.insight.runtime.g;
import com.qonversion.android.sdk.internal.Constants;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Random;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static Context f20305a = null;

    /* renamed from: b, reason: collision with root package name */
    private static Application f20306b = null;

    /* renamed from: c, reason: collision with root package name */
    private static long f20307c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static String f20308d = "default";

    /* renamed from: e, reason: collision with root package name */
    private static boolean f20309e = false;

    /* renamed from: f, reason: collision with root package name */
    private static com.apm.insight.nativecrash.b f20310f;

    /* renamed from: i, reason: collision with root package name */
    private static volatile ConcurrentHashMap<Integer, String> f20313i;

    /* renamed from: n, reason: collision with root package name */
    private static volatile String f20317n;

    /* renamed from: g, reason: collision with root package name */
    private static ConfigManager f20311g = new ConfigManager();

    /* renamed from: h, reason: collision with root package name */
    private static a f20312h = new a();

    /* renamed from: j, reason: collision with root package name */
    private static g f20314j = null;
    private static volatile String k = null;

    /* renamed from: l, reason: collision with root package name */
    private static Object f20315l = new Object();

    /* renamed from: m, reason: collision with root package name */
    private static volatile int f20316m = 0;

    /* renamed from: o, reason: collision with root package name */
    private static int f20318o = 0;

    /* renamed from: p, reason: collision with root package name */
    private static boolean f20319p = true;

    /* renamed from: q, reason: collision with root package name */
    private static boolean f20320q = true;

    /* renamed from: r, reason: collision with root package name */
    private static boolean f20321r = false;

    /* renamed from: s, reason: collision with root package name */
    private static boolean f20322s = true;

    /* renamed from: t, reason: collision with root package name */
    private static boolean f20323t = true;

    /* renamed from: u, reason: collision with root package name */
    private static boolean f20324u = true;

    public static com.apm.insight.nativecrash.b a() {
        if (f20310f == null) {
            f20310f = g.a(f20305a);
        }
        return f20310f;
    }

    public static a b() {
        return f20312h;
    }

    public static g c() {
        if (f20314j == null) {
            synchronized (e.class) {
                f20314j = new g();
            }
        }
        return f20314j;
    }

    public static void d(boolean z2) {
        f20322s = z2;
    }

    public static String e() {
        return f() + '_' + Long.toHexString(new Random().nextLong()) + "G";
    }

    public static String f() {
        if (k == null) {
            synchronized (f20315l) {
                try {
                    if (k == null) {
                        k = Long.toHexString(new Random().nextLong()) + "U";
                    }
                } finally {
                }
            }
        }
        return k;
    }

    public static Context g() {
        return f20305a;
    }

    public static Application h() {
        return f20306b;
    }

    public static ConfigManager i() {
        return f20311g;
    }

    public static long j() {
        return f20307c;
    }

    public static String k() {
        return f20308d;
    }

    public static void l() {
        f20318o = 1;
    }

    public static int m() {
        return f20318o;
    }

    public static boolean n() {
        return f20309e;
    }

    public static void o() {
        f20309e = true;
    }

    public static ConcurrentHashMap<Integer, String> p() {
        return f20313i;
    }

    public static int q() {
        return f20316m;
    }

    public static String r() {
        return f20317n;
    }

    public static boolean s() {
        return f20319p;
    }

    public static boolean t() {
        return f20320q;
    }

    public static boolean u() {
        return f20321r;
    }

    public static boolean v() {
        return f20322s;
    }

    public static boolean w() {
        return f20324u;
    }

    public static boolean x() {
        return f20323t;
    }

    public static void b(int i5, String str) {
        f20316m = i5;
        f20317n = str;
    }

    public static boolean d() {
        if (!f20311g.isDebugMode()) {
            return false;
        }
        Object obj = a().a().get("channel");
        return (obj == null ? "unknown" : String.valueOf(obj)).contains("local_test");
    }

    public static void e(boolean z2) {
        f20324u = z2;
    }

    public static void a(com.apm.insight.nativecrash.b bVar) {
        f20310f = bVar;
    }

    public static void b(boolean z2) {
        f20320q = z2;
    }

    public static void a(Application application) {
        if (application != null) {
            f20306b = application;
        }
    }

    public static void a(Application application, Context context) {
        if (f20306b == null) {
            f20307c = System.currentTimeMillis();
            f20305a = context;
            f20306b = application;
            k = Long.toHexString(new Random().nextLong()) + "G";
        }
    }

    public static void c(boolean z2) {
        f20321r = z2;
    }

    public static void f(boolean z2) {
        f20323t = z2;
    }

    public static void a(Application application, Context context, ICommonParams iCommonParams) {
        a(application, context);
        f20310f = new com.apm.insight.nativecrash.b(f20305a, iCommonParams, a());
    }

    public static String a(long j8, CrashType crashType, boolean z2, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j8);
        sb2.append(Constants.USER_ID_SEPARATOR);
        sb2.append(crashType.getName());
        sb2.append('_');
        sb2.append(f());
        sb2.append('_');
        sb2.append(z2 ? "oom_" : "normal_");
        sb2.append(f20307c);
        sb2.append('_');
        sb2.append(z10 ? "ignore_" : "normal_");
        sb2.append(Long.toHexString(new Random().nextLong()));
        sb2.append("G");
        return sb2.toString();
    }

    public static void a(String str) {
        f20308d = str;
    }

    public static void a(int i5, String str) {
        if (f20313i == null) {
            synchronized (e.class) {
                try {
                    if (f20313i == null) {
                        f20313i = new ConcurrentHashMap<>();
                    }
                } finally {
                }
            }
        }
        f20313i.put(Integer.valueOf(i5), str);
    }

    public static void a(boolean z2) {
        f20319p = z2;
    }
}
