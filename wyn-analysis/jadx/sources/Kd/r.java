package kd;

import Va.X7;
import android.net.http.SslError;
import android.os.Message;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;
import uc.InterfaceC4269f;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final C8.i f39692a;

    public r(C8.i pigeonRegistrar, int i5) {
        switch (i5) {
            case 1:
                AbstractC3340k.e(pigeonRegistrar, "pigeonRegistrar");
                this.f39692a = pigeonRegistrar;
                break;
            case 2:
                AbstractC3340k.e(pigeonRegistrar, "pigeonRegistrar");
                this.f39692a = pigeonRegistrar;
                break;
            default:
                AbstractC3340k.e(pigeonRegistrar, "pigeonRegistrar");
                this.f39692a = pigeonRegistrar;
                break;
        }
    }

    public void a(WebViewClient webViewClient, WebView webViewArg, String urlArg, boolean z2, tf.l lVar) {
        AbstractC3340k.e(webViewArg, "webViewArg");
        AbstractC3340k.e(urlArg, "urlArg");
        C8.i iVar = this.f39692a;
        iVar.getClass();
        new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory").m(AbstractC3935e.D(webViewClient, webViewArg, urlArg, Boolean.valueOf(z2)), new com.unity3d.ads.core.data.datasource.a(lVar, 3));
    }

    public void b(WebViewClient webViewClient, WebView viewArg, Message dontResendArg, Message resendArg, tf.l lVar) {
        AbstractC3340k.e(viewArg, "viewArg");
        AbstractC3340k.e(dontResendArg, "dontResendArg");
        AbstractC3340k.e(resendArg, "resendArg");
        C8.i iVar = this.f39692a;
        iVar.getClass();
        new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission").m(AbstractC3935e.D(webViewClient, viewArg, dontResendArg, resendArg), new com.unity3d.ads.core.data.datasource.a(lVar, 14));
    }

    public void c(WebViewClient webViewClient, WebView viewArg, String urlArg, tf.l lVar) {
        AbstractC3340k.e(viewArg, "viewArg");
        AbstractC3340k.e(urlArg, "urlArg");
        C8.i iVar = this.f39692a;
        iVar.getClass();
        new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource").m(AbstractC3935e.D(webViewClient, viewArg, urlArg), new com.unity3d.ads.core.data.datasource.a(lVar, 5));
    }

    public void d(WebViewClient webViewClient, WebView viewArg, String urlArg, tf.l lVar) {
        AbstractC3340k.e(viewArg, "viewArg");
        AbstractC3340k.e(urlArg, "urlArg");
        C8.i iVar = this.f39692a;
        iVar.getClass();
        new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible").m(AbstractC3935e.D(webViewClient, viewArg, urlArg), new com.unity3d.ads.core.data.datasource.a(lVar, 10));
    }

    public void e(WebViewClient webViewClient, WebView webViewArg, String urlArg, tf.l lVar) {
        AbstractC3340k.e(webViewArg, "webViewArg");
        AbstractC3340k.e(urlArg, "urlArg");
        C8.i iVar = this.f39692a;
        iVar.getClass();
        new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished").m(AbstractC3935e.D(webViewClient, webViewArg, urlArg), new com.unity3d.ads.core.data.datasource.a(lVar, 11));
    }

    public void f(WebViewClient webViewClient, WebView webViewArg, String urlArg, tf.l lVar) {
        AbstractC3340k.e(webViewArg, "webViewArg");
        AbstractC3340k.e(urlArg, "urlArg");
        C8.i iVar = this.f39692a;
        iVar.getClass();
        new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted").m(AbstractC3935e.D(webViewClient, webViewArg, urlArg), new com.unity3d.ads.core.data.datasource.a(lVar, 7));
    }

    public void g(WebViewClient webViewClient, WebView viewArg, ClientCertRequest requestArg, tf.l lVar) {
        AbstractC3340k.e(viewArg, "viewArg");
        AbstractC3340k.e(requestArg, "requestArg");
        C8.i iVar = this.f39692a;
        iVar.getClass();
        new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest").m(AbstractC3935e.D(webViewClient, viewArg, requestArg), new com.unity3d.ads.core.data.datasource.a(lVar, 8));
    }

    public void h(WebViewClient webViewClient, WebView webViewArg, long j8, String descriptionArg, String failingUrlArg, tf.l lVar) {
        AbstractC3340k.e(webViewArg, "webViewArg");
        AbstractC3340k.e(descriptionArg, "descriptionArg");
        AbstractC3340k.e(failingUrlArg, "failingUrlArg");
        C8.i iVar = this.f39692a;
        iVar.getClass();
        new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedError").m(AbstractC3935e.D(webViewClient, webViewArg, Long.valueOf(j8), descriptionArg, failingUrlArg), new com.unity3d.ads.core.data.datasource.a(lVar, 12));
    }

    public void i(WebViewClient webViewClient, WebView webViewArg, HttpAuthHandler handlerArg, String hostArg, String realmArg, tf.l lVar) {
        AbstractC3340k.e(webViewArg, "webViewArg");
        AbstractC3340k.e(handlerArg, "handlerArg");
        AbstractC3340k.e(hostArg, "hostArg");
        AbstractC3340k.e(realmArg, "realmArg");
        C8.i iVar = this.f39692a;
        iVar.getClass();
        new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest").m(AbstractC3935e.D(webViewClient, webViewArg, handlerArg, hostArg, realmArg), new com.unity3d.ads.core.data.datasource.a(lVar, 13));
    }

    public void j(WebViewClient webViewClient, WebView webViewArg, WebResourceRequest requestArg, WebResourceResponse responseArg, tf.l lVar) {
        AbstractC3340k.e(webViewArg, "webViewArg");
        AbstractC3340k.e(requestArg, "requestArg");
        AbstractC3340k.e(responseArg, "responseArg");
        C8.i iVar = this.f39692a;
        iVar.getClass();
        new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError").m(AbstractC3935e.D(webViewClient, webViewArg, requestArg, responseArg), new com.unity3d.ads.core.data.datasource.a(lVar, 4));
    }

    public void k(WebViewClient webViewClient, WebView viewArg, String realmArg, String str, String argsArg, tf.l lVar) {
        AbstractC3340k.e(viewArg, "viewArg");
        AbstractC3340k.e(realmArg, "realmArg");
        AbstractC3340k.e(argsArg, "argsArg");
        C8.i iVar = this.f39692a;
        iVar.getClass();
        new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest").m(AbstractC3935e.D(webViewClient, viewArg, realmArg, str, argsArg), new com.unity3d.ads.core.data.datasource.a(lVar, 6));
    }

    public void l(WebViewClient webViewClient, WebView viewArg, SslErrorHandler handlerArg, SslError errorArg, tf.l lVar) {
        AbstractC3340k.e(viewArg, "viewArg");
        AbstractC3340k.e(handlerArg, "handlerArg");
        AbstractC3340k.e(errorArg, "errorArg");
        C8.i iVar = this.f39692a;
        iVar.getClass();
        new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError").m(AbstractC3935e.D(webViewClient, viewArg, handlerArg, errorArg), new com.unity3d.ads.core.data.datasource.a(lVar, 15));
    }

    public void m(WebViewClient webViewClient, WebView viewArg, double d3, double d5, tf.l lVar) {
        AbstractC3340k.e(viewArg, "viewArg");
        C8.i iVar = this.f39692a;
        iVar.getClass();
        new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged").m(AbstractC3935e.D(webViewClient, viewArg, Double.valueOf(d3), Double.valueOf(d5)), new com.unity3d.ads.core.data.datasource.a(lVar, 1));
    }

    public void n(WebViewClient webViewClient, WebView webViewArg, WebResourceRequest requestArg, tf.l lVar) {
        AbstractC3340k.e(webViewArg, "webViewArg");
        AbstractC3340k.e(requestArg, "requestArg");
        C8.i iVar = this.f39692a;
        iVar.getClass();
        new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading").m(AbstractC3935e.D(webViewClient, webViewArg, requestArg), new com.unity3d.ads.core.data.datasource.a(lVar, 9));
    }

    public void o(WebViewClient webViewClient, WebView webViewArg, String urlArg, tf.l lVar) {
        AbstractC3340k.e(webViewArg, "webViewArg");
        AbstractC3340k.e(urlArg, "urlArg");
        C8.i iVar = this.f39692a;
        iVar.getClass();
        new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.urlLoading").m(AbstractC3935e.D(webViewClient, webViewArg, urlArg), new com.unity3d.ads.core.data.datasource.a(lVar, 2));
    }
}
