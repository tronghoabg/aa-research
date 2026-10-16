package N6;

import D6.C0395s;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzbqt;
import com.google.android.gms.internal.ads.zzhcp;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes3.dex */
public final class v extends zzbqt {

    /* renamed from: a, reason: collision with root package name */
    public final C0777b f8551a;

    /* renamed from: b, reason: collision with root package name */
    public final zzhcp f8552b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8553c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public ScheduledFuture f8554d;

    /* renamed from: e, reason: collision with root package name */
    public WebViewClient f8555e;

    /* renamed from: f, reason: collision with root package name */
    public WebView f8556f;

    public v(WebView webView, C0777b c0777b, zzhcp zzhcpVar) {
        this.f8556f = webView;
        this.f8551a = c0777b;
        this.f8552b = zzhcpVar;
    }

    public static boolean b() {
        if (((Boolean) zzblc.zza.zze()).booleanValue()) {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            if (allStackTraces != null && allStackTraces.containsKey(Thread.currentThread())) {
                boolean z2 = false;
                boolean z10 = false;
                for (StackTraceElement stackTraceElement : allStackTraces.get(Thread.currentThread())) {
                    if (stackTraceElement.getClassName().contains(v.class.getName())) {
                        if (!z2 || !z10) {
                            z2 = true;
                        }
                    } else if (z2) {
                        z10 = true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void a() {
        synchronized (this.f8553c) {
            try {
                WebView webView = this.f8556f;
                if (webView == null) {
                    return;
                }
                webView.evaluateJavascript(String.format(Locale.getDefault(), (String) C0395s.f2489e.f2492c.zzd(zzbix.zzlt), this.f8551a.b()), null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z2) {
        if (b()) {
            return;
        }
        super.doUpdateVisitedHistory(webView, str, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt
    public final WebViewClient getDelegate() {
        return this.f8555e;
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        if (b()) {
            return;
        }
        super.onFormResubmission(webView, message, message2);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (b()) {
            return;
        }
        super.onLoadResource(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        if (b()) {
            return;
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (b()) {
            return;
        }
        a();
        super.onPageFinished(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (b()) {
            return;
        }
        a();
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        if (b()) {
            return;
        }
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i5, String str, String str2) {
        if (b()) {
            return;
        }
        super.onReceivedError(webView, i5, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        if (b()) {
            return;
        }
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (b()) {
            return;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        if (b()) {
            return;
        }
        super.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (b()) {
            return;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (!b()) {
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        synchronized (this.f8553c) {
            try {
                WebView webView2 = this.f8556f;
                if (webView2 != null) {
                    webView2.setWebViewClient(new WebViewClient());
                    this.f8556f = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ScheduledFuture scheduledFuture = this.f8554d;
        if (scheduledFuture == null) {
            return true;
        }
        scheduledFuture.cancel(false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i5, SafeBrowsingResponse safeBrowsingResponse) {
        if (b()) {
            return;
        }
        super.onSafeBrowsingHit(webView, webResourceRequest, i5, safeBrowsingResponse);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f10, float f11) {
        if (b()) {
            return;
        }
        super.onScaleChanged(webView, f10, f11);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        if (b()) {
            return;
        }
        super.onTooManyRedirects(webView, message, message2);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (b()) {
            return;
        }
        super.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (b()) {
            return null;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (b()) {
            return false;
        }
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (b()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (b()) {
            return;
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (b()) {
            return null;
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (b()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
