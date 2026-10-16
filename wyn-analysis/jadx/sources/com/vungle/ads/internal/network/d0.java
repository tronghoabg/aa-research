package com.vungle.ads.internal.network;

import android.os.Build;
import com.vungle.ads.BuildConfig;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static String f33403a = a();

    /* renamed from: b, reason: collision with root package name */
    public static String f33404b;

    /* renamed from: c, reason: collision with root package name */
    public static String f33405c;

    public static void a(String str) {
        f33404b = str;
    }

    public static String b() {
        return f33404b;
    }

    public static void c(String str) {
        AbstractC3340k.e(str, "<set-?>");
        f33403a = str;
    }

    public static String d() {
        return f33403a;
    }

    public static String a() {
        return ("Amazon".equals(Build.MANUFACTURER) ? "VungleAmazon/" : "VungleDroid/").concat(BuildConfig.VERSION_NAME);
    }

    public static void b(String str) {
        f33405c = str;
    }

    public static String c() {
        return f33405c;
    }
}
