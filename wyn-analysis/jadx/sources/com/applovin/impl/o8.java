package com.applovin.impl;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class o8 {

    /* renamed from: a, reason: collision with root package name */
    private static String f22452a;

    /* renamed from: d, reason: collision with root package name */
    private static int f22455d;

    /* renamed from: e, reason: collision with root package name */
    private static String f22456e;

    /* renamed from: f, reason: collision with root package name */
    private static String f22457f;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f22453b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f22454c = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicBoolean f22458g = new AtomicBoolean();

    static {
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.f22986D0;
        if (kVar != null && ((Boolean) kVar.a(y4.f23819i4)).booleanValue() && e()) {
            f22452a = (String) b5.a(a5.f20942M, "", com.applovin.impl.sdk.k.o());
        } else {
            f22452a = "";
            b5.b(a5.f20942M, (Object) null, com.applovin.impl.sdk.k.o());
        }
    }

    public static void a(com.applovin.impl.sdk.k kVar) {
        if (f22454c.getAndSet(true)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new X(1, kVar));
    }

    public static String b() {
        return f22457f;
    }

    public static String c() {
        return f22456e;
    }

    public static int d() {
        return f22455d;
    }

    public static void b(com.applovin.impl.sdk.k kVar) {
        if (f22458g.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfoC = c(kVar);
        if (packageInfoC != null) {
            f22455d = packageInfoC.versionCode;
            f22456e = packageInfoC.versionName;
            f22457f = packageInfoC.packageName;
        } else {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("WebViewDataCollector", "Failed to get WebView package info");
            }
        }
    }

    private static PackageInfo c(com.applovin.impl.sdk.k kVar) {
        PackageManager packageManager = com.applovin.impl.sdk.k.o().getPackageManager();
        if (AbstractC1654o0.h()) {
            return WebView.getCurrentWebViewPackage();
        }
        Iterator it = kVar.c(y4.f23911t4).iterator();
        while (it.hasNext()) {
            try {
                return packageManager.getPackageInfo((String) it.next(), 0);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(com.applovin.impl.sdk.k kVar) {
        try {
            synchronized (f22453b) {
                try {
                    String defaultUserAgent = WebSettings.getDefaultUserAgent(com.applovin.impl.sdk.k.o());
                    if (!TextUtils.isEmpty(defaultUserAgent)) {
                        f22452a = defaultUserAgent;
                        b5.b(a5.f20942M, f22452a, com.applovin.impl.sdk.k.o());
                    } else {
                        kVar.O();
                        if (com.applovin.impl.sdk.o.a()) {
                            kVar.O().b("WebViewDataCollector", "Collected invalid user agent");
                        }
                        kVar.D().a(d2.f21308b1, "collectedInvalidUserAgent");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("WebViewDataCollector", "Failed to collect user agent", th2);
            }
            kVar.D().a("WebViewDataCollector", "collectUserAgent", th2);
        }
    }

    private static boolean e() {
        boolean zIsValidString;
        synchronized (f22453b) {
            zIsValidString = StringUtils.isValidString((String) b5.a(a5.f20942M, "", com.applovin.impl.sdk.k.o()));
        }
        return zIsValidString;
    }

    public static String a() {
        String str;
        synchronized (f22453b) {
            str = f22452a;
        }
        return str;
    }
}
