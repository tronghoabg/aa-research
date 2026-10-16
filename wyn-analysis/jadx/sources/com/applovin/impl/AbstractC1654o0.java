package com.applovin.impl;

import A7.AbstractC0279p0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.applovin.sdk.AppLovinSdkUtils;
import com.vungle.ads.internal.protos.Sdk;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1654o0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f22351a = DesugarCollections.synchronizedMap(new HashMap(4));

    /* renamed from: b, reason: collision with root package name */
    private static final Map f22352b = DesugarCollections.synchronizedMap(new HashMap(4));

    /* renamed from: c, reason: collision with root package name */
    private static final Map f22353c = DesugarCollections.synchronizedMap(new HashMap(4));

    /* renamed from: d, reason: collision with root package name */
    private static final Map f22354d = new HashMap(2);

    /* renamed from: com.applovin.impl.o0$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f22355a;

        /* renamed from: b, reason: collision with root package name */
        private int f22356b;

        /* renamed from: c, reason: collision with root package name */
        private int f22357c;

        /* renamed from: d, reason: collision with root package name */
        private int f22358d;

        public a(int i5, int i10, int i11, int i12) {
            this.f22355a = i5;
            this.f22356b = i10;
            this.f22357c = i11;
            this.f22358d = i12;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public int b() {
            return this.f22355a;
        }

        public int c() {
            return this.f22357c;
        }

        public int d() {
            return this.f22356b;
        }

        public Map e() {
            HashMap map = new HashMap();
            map.put("left", Integer.valueOf(this.f22355a));
            map.put("top", Integer.valueOf(this.f22356b));
            map.put("right", Integer.valueOf(this.f22357c));
            map.put("bottom", Integer.valueOf(this.f22358d));
            return map;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a(this) && b() == aVar.b() && d() == aVar.d() && c() == aVar.c() && a() == aVar.a();
        }

        public int hashCode() {
            return a() + ((c() + ((d() + ((b() + 59) * 59)) * 59)) * 59);
        }

        public String toString() {
            return "CompatibilityUtils.Insets(left=" + b() + ", top=" + d() + ", right=" + c() + ", bottom=" + a() + ")";
        }

        public int a() {
            return this.f22358d;
        }

        public static a a(Insets insets) {
            return new a(insets.left, insets.top, insets.right, insets.bottom);
        }
    }

    /* renamed from: com.applovin.impl.o0$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private int f22359a;

        /* renamed from: b, reason: collision with root package name */
        private int f22360b;

        /* renamed from: c, reason: collision with root package name */
        private int f22361c;

        /* renamed from: d, reason: collision with root package name */
        private int f22362d;

        /* renamed from: com.applovin.impl.o0$b$a */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private int f22363a;

            /* renamed from: b, reason: collision with root package name */
            private int f22364b;

            /* renamed from: c, reason: collision with root package name */
            private int f22365c;

            /* renamed from: d, reason: collision with root package name */
            private int f22366d;

            public a a(int i5) {
                this.f22365c = i5;
                return this;
            }

            public a b(int i5) {
                this.f22366d = i5;
                return this;
            }

            public a c(int i5) {
                this.f22363a = i5;
                return this;
            }

            public a d(int i5) {
                this.f22364b = i5;
                return this;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("CompatibilityUtils.ScreenCornerRadii.ScreenCornerRadiiBuilder(topLeft=");
                sb2.append(this.f22363a);
                sb2.append(", topRight=");
                sb2.append(this.f22364b);
                sb2.append(", bottomLeft=");
                sb2.append(this.f22365c);
                sb2.append(", bottomRight=");
                return AbstractC0279p0.j(this.f22366d, ")", sb2);
            }

            public b a() {
                return new b(this.f22363a, this.f22364b, this.f22365c, this.f22366d);
            }
        }

        public b(int i5, int i10, int i11, int i12) {
            this.f22359a = i5;
            this.f22360b = i10;
            this.f22361c = i11;
            this.f22362d = i12;
        }

        public boolean a(Object obj) {
            return obj instanceof b;
        }

        public int b() {
            return this.f22362d;
        }

        public int c() {
            return this.f22359a;
        }

        public int d() {
            return this.f22360b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.a(this) && c() == bVar.c() && d() == bVar.d() && a() == bVar.a() && b() == bVar.b();
        }

        public int hashCode() {
            return b() + ((a() + ((d() + ((c() + 59) * 59)) * 59)) * 59);
        }

        public String toString() {
            return "CompatibilityUtils.ScreenCornerRadii(topLeft=" + c() + ", topRight=" + d() + ", bottomLeft=" + a() + ", bottomRight=" + b() + ")";
        }

        public int a() {
            return this.f22361c;
        }
    }

    public static void a() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        } catch (Throwable unused) {
        }
    }

    public static Point b(Context context) {
        int orientation = AppLovinSdkUtils.getOrientation(context);
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.f22986D0;
        boolean z2 = kVar == null || ((Boolean) kVar.a(y4.f23595F6)).booleanValue();
        if (!c(context) || z2) {
            Map map = f22354d;
            if (map.containsKey(Integer.valueOf(orientation))) {
                return (Point) map.get(Integer.valueOf(orientation));
            }
        }
        Point point = new Point();
        point.x = 480;
        point.y = Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
        WindowManager windowManagerF = o7.f(context);
        if (windowManagerF != null) {
            Display defaultDisplay = windowManagerF.getDefaultDisplay();
            if (b()) {
                Rect bounds = windowManagerF.getMaximumWindowMetrics().getBounds();
                point = new Point(bounds.width(), bounds.height());
            } else {
                defaultDisplay.getRealSize(point);
            }
        }
        f22354d.put(Integer.valueOf(orientation), point);
        return point;
    }

    public static boolean c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        return packageManager.hasSystemFeature("android.hardware.type.foldable") || packageManager.hasSystemFeature("android.hardware.sensor.hinge_angle");
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public static boolean e() {
        return true;
    }

    public static boolean f() {
        return true;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean k() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static boolean l() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static a c(WindowInsets windowInsets, com.applovin.impl.sdk.k kVar) {
        if (kVar == null || !((Boolean) kVar.a(y4.f23624J4)).booleanValue() || windowInsets == null || !b()) {
            return null;
        }
        return a.a(windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.statusBars()));
    }

    public static Point a(Context context) {
        Display defaultDisplay = o7.f(context).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static Map c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) f22352b.get(str);
    }

    public static a a(WindowInsets windowInsets, com.applovin.impl.sdk.k kVar) {
        if (kVar == null || !((Boolean) kVar.a(y4.f23624J4)).booleanValue() || windowInsets == null || !b()) {
            return null;
        }
        Insets insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.displayCutout());
        return new a(insetsIgnoringVisibility.left, insetsIgnoringVisibility.top, insetsIgnoringVisibility.right, insetsIgnoringVisibility.bottom);
    }

    public static void c(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        f22352b.put(str, aVar.e());
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static Map a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) f22351a.get(str);
    }

    public static void a(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        f22351a.put(str, aVar.e());
    }

    public static a b(WindowInsets windowInsets, com.applovin.impl.sdk.k kVar) {
        if (kVar == null || !((Boolean) kVar.a(y4.f23624J4)).booleanValue() || windowInsets == null || !b()) {
            return null;
        }
        return a.a(windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars()));
    }

    public static b a(Context context, com.applovin.impl.sdk.k kVar) {
        WindowManager windowManagerF;
        if (((Boolean) kVar.a(y4.f23777d4)).booleanValue() && l() && (windowManagerF = o7.f(context)) != null) {
            try {
                Display defaultDisplay = windowManagerF.getDefaultDisplay();
                return new b.a().c(a(0, defaultDisplay)).d(a(1, defaultDisplay)).a(a(3, defaultDisplay)).b(a(2, defaultDisplay)).a();
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Map b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) f22353c.get(str);
    }

    public static void b(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        f22353c.put(str, aVar.e());
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    private static int a(int i5, Display display) {
        RoundedCorner roundedCorner = display.getRoundedCorner(i5);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return -1;
    }

    public static boolean a(String str, Context context) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }
}
