package com.vungle.ads.internal.presenter;

import android.content.Context;
import android.os.Handler;
import android.webkit.WebView;
import com.vungle.ads.internal.model.f0;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.i3;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ReentrantLock f33519a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f33520b = new LinkedHashMap();

    public static void a(Context context, h0 adv, i3 placement, String templatePath, f0 f0Var, com.vungle.ads.internal.load.e delegate, Long l10) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(adv, "adv");
        AbstractC3340k.e(placement, "placement");
        AbstractC3340k.e(templatePath, "templatePath");
        AbstractC3340k.e(delegate, "delegate");
        ReentrantLock reentrantLock = f33519a;
        reentrantLock.lock();
        try {
            boolean z2 = com.vungle.ads.internal.util.u.f33874a;
            StringBuilder sb2 = new StringBuilder("Preload webview start. Cache size: ");
            LinkedHashMap linkedHashMap = f33520b;
            sb2.append(linkedHashMap.size());
            com.vungle.ads.internal.util.t.a("WebViewManager", sb2.toString());
            String strH = adv.h();
            if (!linkedHashMap.containsKey(strH)) {
                Handler handler = com.vungle.ads.internal.util.y.f33878a;
                com.vungle.ads.internal.util.y.a(new d0(context, adv, placement, delegate, l10, templatePath, strH, f0Var));
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static WebView a(Context context, String str) {
        WebView webView;
        AbstractC3340k.e(context, "context");
        ReentrantLock reentrantLock = f33519a;
        reentrantLock.lock();
        try {
            LinkedHashMap linkedHashMap = f33520b;
            a0 a0Var = (a0) linkedHashMap.get(str);
            if (a0Var != null) {
                boolean z2 = com.vungle.ads.internal.util.u.f33874a;
                com.vungle.ads.internal.util.t.a("WebViewManager", "Reusing cached webview. Cache size: " + linkedHashMap.size());
                webView = a0Var.a();
            } else {
                boolean z10 = com.vungle.ads.internal.util.u.f33874a;
                com.vungle.ads.internal.util.t.a("WebViewManager", "Creating new webview. Cache size: " + linkedHashMap.size());
                webView = new WebView(context);
            }
            reentrantLock.unlock();
            return webView;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static com.vungle.ads.internal.ui.z a(h0 advertisement, i3 placement, com.vungle.ads.internal.executor.j offloadExecutor, com.vungle.ads.internal.platform.f platform) {
        AbstractC3340k.e(advertisement, "advertisement");
        AbstractC3340k.e(placement, "placement");
        AbstractC3340k.e(offloadExecutor, "offloadExecutor");
        AbstractC3340k.e(platform, "platform");
        ReentrantLock reentrantLock = f33519a;
        reentrantLock.lock();
        try {
            a0 a0Var = (a0) f33520b.get(advertisement.h());
            com.vungle.ads.internal.ui.z zVarB = a0Var != null ? a0Var.b() : null;
            if (zVarB == null) {
                zVarB = new com.vungle.ads.internal.ui.z(advertisement, placement, offloadExecutor, platform);
            }
            reentrantLock.unlock();
            return zVarB;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static void a(String key) {
        AbstractC3340k.e(key, "key");
        ReentrantLock reentrantLock = f33519a;
        reentrantLock.lock();
        try {
            f33520b.remove(key);
        } finally {
            reentrantLock.unlock();
        }
    }
}
