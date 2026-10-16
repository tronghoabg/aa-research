package kd;

import Va.X7;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.moloco.sdk.internal.publisher.C1915d;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;
import uc.InterfaceC4269f;

/* loaded from: classes5.dex */
public final class P extends C3303N {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f39597h = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C3313i f39598b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f39599c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f39600d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f39601e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f39602f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f39603g = false;

    public P(C3313i c3313i) {
        this.f39598b = c3313i;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage messageArg) {
        C1915d c1915d = new C1915d(23);
        C3313i c3313i = this.f39598b;
        c3313i.getClass();
        AbstractC3340k.e(messageArg, "messageArg");
        C8.i iVar = c3313i.f39663a;
        iVar.getClass();
        new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage").m(AbstractC3935e.D(this, messageArg), new C3293D(c1915d, 6));
        return this.f39600d;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        C1915d c1915d = new C1915d(23);
        C3313i c3313i = this.f39598b;
        c3313i.getClass();
        C8.i iVar = c3313i.f39663a;
        iVar.getClass();
        new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt").m(AbstractC3935e.C(this), new C3293D(c1915d, 8));
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String originArg, GeolocationPermissions.Callback callbackArg) {
        C1915d c1915d = new C1915d(23);
        C3313i c3313i = this.f39598b;
        c3313i.getClass();
        AbstractC3340k.e(originArg, "originArg");
        AbstractC3340k.e(callbackArg, "callbackArg");
        C8.i iVar = c3313i.f39663a;
        iVar.getClass();
        new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt").m(AbstractC3935e.D(this, originArg, callbackArg), new C3293D(c1915d, 7));
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        C1915d c1915d = new C1915d(23);
        C3313i c3313i = this.f39598b;
        c3313i.getClass();
        C8.i iVar = c3313i.f39663a;
        iVar.getClass();
        new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView").m(AbstractC3935e.C(this), new C3293D(c1915d, 2));
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webViewArg, String urlArg, String messageArg, JsResult jsResult) {
        if (!this.f39601e) {
            return false;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.f fVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.f(new C3304O(this, jsResult, 1), 1);
        C3313i c3313i = this.f39598b;
        c3313i.getClass();
        AbstractC3340k.e(webViewArg, "webViewArg");
        AbstractC3340k.e(urlArg, "urlArg");
        AbstractC3340k.e(messageArg, "messageArg");
        C8.i iVar = c3313i.f39663a;
        iVar.getClass();
        new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert").m(AbstractC3935e.D(this, webViewArg, urlArg, messageArg), new C3295F(fVar, 1));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webViewArg, String urlArg, String messageArg, JsResult jsResult) {
        if (!this.f39602f) {
            return false;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.f fVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.f(new C3304O(this, jsResult, 0), 1);
        C3313i c3313i = this.f39598b;
        c3313i.getClass();
        AbstractC3340k.e(webViewArg, "webViewArg");
        AbstractC3340k.e(urlArg, "urlArg");
        AbstractC3340k.e(messageArg, "messageArg");
        C8.i iVar = c3313i.f39663a;
        iVar.getClass();
        new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm").m(AbstractC3935e.D(this, webViewArg, urlArg, messageArg), new C3295F(fVar, 3));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webViewArg, String urlArg, String messageArg, String defaultValueArg, JsPromptResult jsPromptResult) {
        if (!this.f39603g) {
            return false;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.f fVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.f(new Ff.d(8, this, jsPromptResult), 1);
        C3313i c3313i = this.f39598b;
        c3313i.getClass();
        AbstractC3340k.e(webViewArg, "webViewArg");
        AbstractC3340k.e(urlArg, "urlArg");
        AbstractC3340k.e(messageArg, "messageArg");
        AbstractC3340k.e(defaultValueArg, "defaultValueArg");
        C8.i iVar = c3313i.f39663a;
        iVar.getClass();
        new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt").m(AbstractC3935e.D(this, webViewArg, urlArg, messageArg, defaultValueArg), new C3295F(fVar, 0));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest requestArg) {
        C1915d c1915d = new C1915d(23);
        C3313i c3313i = this.f39598b;
        c3313i.getClass();
        AbstractC3340k.e(requestArg, "requestArg");
        C8.i iVar = c3313i.f39663a;
        iVar.getClass();
        new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest").m(AbstractC3935e.D(this, requestArg), new C3293D(c1915d, 4));
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webViewArg, int i5) {
        long j8 = i5;
        C1915d c1915d = new C1915d(23);
        C3313i c3313i = this.f39598b;
        c3313i.getClass();
        AbstractC3340k.e(webViewArg, "webViewArg");
        C8.i iVar = c3313i.f39663a;
        iVar.getClass();
        new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged").m(AbstractC3935e.D(this, webViewArg, Long.valueOf(j8)), new C3293D(c1915d, 3));
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View viewArg, WebChromeClient.CustomViewCallback callbackArg) {
        C1915d c1915d = new C1915d(23);
        C3313i c3313i = this.f39598b;
        c3313i.getClass();
        AbstractC3340k.e(viewArg, "viewArg");
        AbstractC3340k.e(callbackArg, "callbackArg");
        C8.i iVar = c3313i.f39663a;
        iVar.getClass();
        new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView").m(AbstractC3935e.D(this, viewArg, callbackArg), new C3293D(c1915d, 5));
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webViewArg, ValueCallback valueCallback, WebChromeClient.FileChooserParams paramsArg) {
        boolean z2 = this.f39599c;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.f fVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.f(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.L(this, z2, valueCallback, 1), 1);
        C3313i c3313i = this.f39598b;
        c3313i.getClass();
        AbstractC3340k.e(webViewArg, "webViewArg");
        AbstractC3340k.e(paramsArg, "paramsArg");
        C8.i iVar = c3313i.f39663a;
        iVar.getClass();
        new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser").m(AbstractC3935e.D(this, webViewArg, paramsArg), new C3295F(fVar, 2));
        return z2;
    }
}
