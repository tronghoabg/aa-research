package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public class an {

    /* renamed from: a, reason: collision with root package name */
    public static int f32530a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static String f32531b = null;

    /* renamed from: c, reason: collision with root package name */
    public static List<String> f32532c = null;

    /* renamed from: d, reason: collision with root package name */
    private static String f32533d = "api16-access-ttp.tiktokpangle.us";

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f32534e = {"api16-access-ttp.tiktokpangle.us", "api16-access-ttp-b.tiktokpangle.us", "api16-access-ttp.tiktokpangle-b.us", "api16-access-ttp-b.tiktokpangle-b.us"};

    /* renamed from: f, reason: collision with root package name */
    private static int f32535f = Integer.MIN_VALUE;

    /* renamed from: g, reason: collision with root package name */
    private static int f32536g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static String f32537h = "";

    public static String a() {
        return f32530a == 1 ? "VA" : "SG";
    }

    public static String b() {
        return f32537h;
    }

    public static void c() {
        f32536g = 0;
    }

    public static String a(Context context) {
        List<String> list;
        if (TextUtils.isEmpty(f32531b)) {
            try {
                if (f32535f == Integer.MIN_VALUE) {
                    f32535f = aw.a(context, "domain_index", 0);
                }
                String[] strArr = f32534e;
                return strArr[f32535f % strArr.length];
            } catch (Throwable unused) {
                return f32533d;
            }
        }
        if (f32536g <= 0 || (list = f32532c) == null || list.isEmpty()) {
            return f32531b;
        }
        List<String> list2 = f32532c;
        return list2.get((f32536g - 1) % list2.size());
    }

    public static void b(Context context) {
        if (TextUtils.isEmpty(f32531b)) {
            int i5 = f32535f;
            if (i5 >= Integer.MAX_VALUE) {
                f32535f = 0;
                return;
            }
            int i10 = i5 + 1;
            f32535f = i10;
            aw.b(context, "domain_index", i10);
            return;
        }
        List<String> list = f32532c;
        if (list == null || list.isEmpty() || f32536g >= f32532c.size()) {
            f32536g = 0;
        } else {
            f32536g++;
        }
    }

    public static void a(int i5) {
        f32530a = i5;
    }

    public static void b(String str) {
        f32537h = str;
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f32531b = str;
    }

    public static void a(Set<String> set) {
        if (set != null) {
            f32532c = new ArrayList(set);
        }
    }
}
