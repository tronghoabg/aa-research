package kd;

import Va.X7;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.moloco.sdk.internal.publisher.C1915d;
import r7.AbstractC3935e;
import uc.InterfaceC4269f;

/* loaded from: classes5.dex */
public final class a0 extends WebView implements io.flutter.plugin.platform.e {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f39640d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final C3322s f39641a;

    /* renamed from: b, reason: collision with root package name */
    public WebViewClient f39642b;

    /* renamed from: c, reason: collision with root package name */
    public C3303N f39643c;

    public a0(C3322s c3322s) {
        super((Context) c3322s.f39693a.f1939b);
        this.f39641a = c3322s;
        this.f39642b = new WebViewClient();
        this.f39643c = new C3303N();
        setWebViewClient(this.f39642b);
        setWebChromeClient(this.f39643c);
    }

    @Override // android.webkit.WebView
    public WebChromeClient getWebChromeClient() {
        return this.f39643c;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        kc.r rVar;
        super.onAttachedToWindow();
        this.f39641a.f39693a.getClass();
        if (Build.VERSION.SDK_INT >= 26) {
            ViewParent parent = this;
            while (true) {
                if (parent.getParent() == null) {
                    rVar = null;
                    break;
                }
                parent = parent.getParent();
                if (parent instanceof kc.r) {
                    rVar = (kc.r) parent;
                    break;
                }
            }
            if (rVar != null) {
                rVar.setImportantForAutofill(1);
            }
        }
    }

    @Override // io.flutter.plugin.platform.e
    public final /* synthetic */ void onFlutterViewAttached(View view) {
    }

    @Override // io.flutter.plugin.platform.e
    public final /* synthetic */ void onFlutterViewDetached() {
    }

    @Override // io.flutter.plugin.platform.e
    public final /* synthetic */ void onInputConnectionLocked() {
    }

    @Override // io.flutter.plugin.platform.e
    public final /* synthetic */ void onInputConnectionUnlocked() {
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(final int i5, final int i10, final int i11, final int i12) {
        super.onScrollChanged(i5, i10, i11, i12);
        this.f39641a.f39693a.x(new Runnable() { // from class: kd.Z
            @Override // java.lang.Runnable
            public final void run() {
                long j8 = i5;
                long j10 = i10;
                long j11 = i11;
                long j12 = i12;
                C1915d c1915d = new C1915d(26);
                a0 a0Var = this.f39632a;
                C3322s c3322s = a0Var.f39641a;
                c3322s.getClass();
                C8.i iVar = c3322s.f39693a;
                iVar.getClass();
                new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged").m(AbstractC3935e.D(a0Var, Long.valueOf(j8), Long.valueOf(j10), Long.valueOf(j11), Long.valueOf(j12)), new C3293D(c1915d, 18));
            }
        });
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        super.setWebChromeClient(webChromeClient);
        if (!(webChromeClient instanceof C3303N)) {
            throw new AssertionError("Client must be a SecureWebChromeClient.");
        }
        C3303N c3303n = (C3303N) webChromeClient;
        this.f39643c = c3303n;
        c3303n.f39593a = this.f39642b;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        this.f39642b = webViewClient;
        this.f39643c.f39593a = webViewClient;
    }

    @Override // io.flutter.plugin.platform.e
    public final void dispose() {
    }

    @Override // io.flutter.plugin.platform.e
    public View getView() {
        return this;
    }
}
