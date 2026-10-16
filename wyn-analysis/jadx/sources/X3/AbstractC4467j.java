package x3;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.WeakHashMap;
import y3.AbstractC4557o;
import y3.AbstractC4559q;
import y3.C4544b;
import y3.C4552j;
import y3.C4560r;

/* renamed from: x3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4467j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f47677a;

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f47678b;

    static {
        Uri.parse("*");
        Uri.parse("");
        f47677a = true;
        f47678b = new WeakHashMap();
    }

    public static void a(WebView webView, String str, Set set, InterfaceC4466i interfaceC4466i) {
        if (!AbstractC4557o.f48012g.b()) {
            throw AbstractC4557o.a();
        }
        C4560r c4560rC = c(webView);
        c4560rC.f48020a.addWebMessageListener(str, (String[]) set.toArray(new String[0]), new tg.a(new C4552j(interfaceC4466i, 0)));
    }

    public static PackageInfo b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }

    public static C4560r c(WebView webView) {
        if (!AbstractC4557o.f48016l.b() || !f47677a) {
            return new C4560r(AbstractC4559q.f48019a.createWebView(webView));
        }
        WeakHashMap weakHashMap = f47678b;
        C4560r c4560r = (C4560r) weakHashMap.get(webView);
        if (c4560r != null) {
            return c4560r;
        }
        C4560r c4560r2 = new C4560r(AbstractC4559q.f48019a.createWebView(webView));
        weakHashMap.put(webView, c4560r2);
        return c4560r2;
    }

    public static String d() {
        if (AbstractC4557o.f48014i.b()) {
            return AbstractC4559q.f48019a.getStatics().getVariationsHeader();
        }
        throw AbstractC4557o.a();
    }

    public static WebViewClient e(WebView webView) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C4544b c4544b = AbstractC4557o.f48010e;
        if (c4544b.a()) {
            return webView.getWebViewClient();
        }
        if (!c4544b.b()) {
            throw AbstractC4557o.a();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Looper webViewLooper = webView.getWebViewLooper();
            if (webViewLooper != Looper.myLooper()) {
                throw new RuntimeException("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + webViewLooper + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
            }
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(webView, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e7) {
                throw new RuntimeException(e7);
            }
        }
        return c(webView).f48020a.getWebViewClient();
    }

    public static void f(WebView webView, String str) {
        if (!AbstractC4557o.f48012g.b()) {
            throw AbstractC4557o.a();
        }
        c(webView).f48020a.removeWebMessageListener(str);
    }
}
