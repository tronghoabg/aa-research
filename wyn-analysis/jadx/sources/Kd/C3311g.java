package kd;

import Va.X7;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Build;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.moloco.sdk.internal.publisher.C1915d;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k2.C3146c;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;
import uc.InterfaceC4269f;
import x3.AbstractC4463f;

/* renamed from: kd.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3311g extends C3306b {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f39660e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final C8.i f39661d;

    public C3311g(C8.i registrar) {
        AbstractC3340k.e(registrar, "registrar");
        this.f39661d = registrar;
    }

    @Override // kd.C3306b, uc.C4286w
    public final Object f(byte b5, ByteBuffer byteBuffer) {
        if (b5 != -128) {
            return super.f(b5, byteBuffer);
        }
        Object objE = e(byteBuffer);
        AbstractC3340k.c(objE, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) objE).longValue();
        Object objE2 = ((C3308d) this.f39661d.f1941d).e(jLongValue);
        if (objE2 == null) {
            Log.e("PigeonProxyApiBaseCodec", "Failed to find instance with identifier: " + jLongValue);
        }
        return objE2;
    }

    @Override // kd.C3306b, uc.C4286w
    public final void k(ByteArrayOutputStream stream, Object obj) {
        int i5 = 23;
        int i10 = 10;
        int i11 = 11;
        int i12 = 24;
        int i13 = 6;
        AbstractC3340k.e(stream, "stream");
        if ((obj instanceof Boolean) || (obj instanceof byte[]) || (obj instanceof Double) || (obj instanceof double[]) || (obj instanceof float[]) || (obj instanceof Integer) || (obj instanceof int[]) || (obj instanceof List) || (obj instanceof Long) || (obj instanceof long[]) || (obj instanceof Map) || (obj instanceof String) || (obj instanceof EnumC3320p) || (obj instanceof EnumC3314j) || (obj instanceof EnumC3325v) || (obj instanceof EnumC3301L) || (obj instanceof EnumC3324u) || obj == null) {
            super.k(stream, obj);
            return;
        }
        boolean z2 = obj instanceof WebResourceRequest;
        C8.i iVar = this.f39661d;
        if (z2) {
            iVar.getClass();
            WebResourceRequest webResourceRequest = (WebResourceRequest) obj;
            C1915d c1915d = new C1915d(21);
            C3308d c3308d = (C3308d) iVar.f1941d;
            if (!c3308d.d(webResourceRequest)) {
                new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance").m(AbstractC3935e.D(Long.valueOf(c3308d.b(webResourceRequest)), webResourceRequest.getUrl().toString(), Boolean.valueOf(webResourceRequest.isForMainFrame()), Build.VERSION.SDK_INT >= 24 ? Boolean.valueOf(webResourceRequest.isRedirect()) : null, Boolean.valueOf(webResourceRequest.hasGesture()), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders() == null ? Collections.EMPTY_MAP : webResourceRequest.getRequestHeaders()), new C3293D(c1915d, 11));
            }
        } else if (obj instanceof WebResourceResponse) {
            iVar.getClass();
            WebResourceResponse webResourceResponse = (WebResourceResponse) obj;
            C1915d c1915d2 = new C1915d(21);
            C3308d c3308d2 = (C3308d) iVar.f1941d;
            if (!c3308d2.d(webResourceResponse)) {
                new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance").m(AbstractC3935e.D(Long.valueOf(c3308d2.b(webResourceResponse)), Long.valueOf(webResourceResponse.getStatusCode())), new C3293D(c1915d2, 12));
            }
        } else if (obj instanceof WebResourceError) {
            iVar.getClass();
            WebResourceError webResourceError = (WebResourceError) obj;
            C1915d c1915d3 = new C1915d(21);
            C3308d c3308d3 = (C3308d) iVar.f1941d;
            if (!c3308d3.d(webResourceError)) {
                new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebResourceError.pigeon_newInstance").m(AbstractC3935e.D(Long.valueOf(c3308d3.b(webResourceError)), Long.valueOf(webResourceError.getErrorCode()), webResourceError.getDescription().toString()), new C3293D(c1915d3, 9));
            }
        } else if (obj instanceof AbstractC4463f) {
            iVar.getClass();
            AbstractC4463f abstractC4463f = (AbstractC4463f) obj;
            C1915d c1915d4 = new C1915d(21);
            C3308d c3308d4 = (C3308d) iVar.f1941d;
            if (!c3308d4.d(abstractC4463f)) {
                new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebResourceErrorCompat.pigeon_newInstance").m(AbstractC3935e.D(Long.valueOf(c3308d4.b(abstractC4463f)), Long.valueOf(abstractC4463f.b()), abstractC4463f.a().toString()), new C3293D(c1915d4, 10));
            }
        } else if (obj instanceof Y) {
            iVar.getClass();
            Y y10 = (Y) obj;
            C1915d c1915d5 = new C1915d(21);
            C3308d c3308d5 = (C3308d) iVar.f1941d;
            if (!c3308d5.d(y10)) {
                new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebViewPoint.pigeon_newInstance").m(AbstractC3935e.D(Long.valueOf(c3308d5.b(y10)), Long.valueOf(y10.f39630a), Long.valueOf(y10.f39631b)), new C3293D(c1915d5, 23));
            }
        } else if (obj instanceof ConsoleMessage) {
            iVar.getClass();
            ConsoleMessage consoleMessage = (ConsoleMessage) obj;
            C1915d c1915d6 = new C1915d(21);
            C3308d c3308d6 = (C3308d) iVar.f1941d;
            if (!c3308d6.d(consoleMessage)) {
                long jB = c3308d6.b(consoleMessage);
                long jLineNumber = consoleMessage.lineNumber();
                String strMessage = consoleMessage.message();
                int i14 = AbstractC3315k.f39673a[consoleMessage.messageLevel().ordinal()];
                new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance").m(AbstractC3935e.D(Long.valueOf(jB), Long.valueOf(jLineNumber), strMessage, i14 != 1 ? i14 != 2 ? i14 != 3 ? i14 != 4 ? i14 != 5 ? EnumC3314j.f39670h : EnumC3314j.f39665c : EnumC3314j.f39666d : EnumC3314j.f39669g : EnumC3314j.f39667e : EnumC3314j.f39668f, consoleMessage.sourceId()), new C3146c(c1915d6, 9));
            }
        } else if (obj instanceof CookieManager) {
            iVar.getClass();
            CookieManager cookieManager = (CookieManager) obj;
            C1915d c1915d7 = new C1915d(21);
            C3308d c3308d7 = (C3308d) iVar.f1941d;
            if (!c3308d7.d(cookieManager)) {
                new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance").m(AbstractC3935e.C(Long.valueOf(c3308d7.b(cookieManager))), new C3146c(c1915d7, i10));
            }
        } else if (obj instanceof WebView) {
            iVar.getClass();
            WebView webView = (WebView) obj;
            C1915d c1915d8 = new C1915d(21);
            C3308d c3308d8 = (C3308d) iVar.f1941d;
            if (!c3308d8.d(webView)) {
                new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance").m(AbstractC3935e.C(Long.valueOf(c3308d8.b(webView))), new C3293D(c1915d8, 17));
            }
        } else if (obj instanceof WebSettings) {
            iVar.getClass();
            WebSettings webSettings = (WebSettings) obj;
            C1915d c1915d9 = new C1915d(21);
            C3308d c3308d9 = (C3308d) iVar.f1941d;
            if (!c3308d9.d(webSettings)) {
                new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance").m(AbstractC3935e.C(Long.valueOf(c3308d9.b(webSettings))), new C3293D(c1915d9, 13));
            }
        } else if (obj instanceof C3323t) {
            iVar.getClass();
            if (!((C3308d) iVar.f1941d).d((C3323t) obj)) {
                AbstractC3256n.o("new-instance-error", "Attempting to create a new Dart instance of JavaScriptChannel, but the class has a nonnull callback method.", "");
            }
        } else if (obj instanceof WebViewClient) {
            iVar.getClass();
            WebViewClient webViewClient = (WebViewClient) obj;
            C1915d c1915d10 = new C1915d(21);
            C3308d c3308d10 = (C3308d) iVar.f1941d;
            if (!c3308d10.d(webViewClient)) {
                new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance").m(AbstractC3935e.C(Long.valueOf(c3308d10.b(webViewClient))), new C3293D(c1915d10, 19));
            }
        } else if (obj instanceof DownloadListener) {
            iVar.getClass();
            if (!((C3308d) iVar.f1941d).d((DownloadListener) obj)) {
                AbstractC3256n.o("new-instance-error", "Attempting to create a new Dart instance of DownloadListener, but the class has a nonnull callback method.", "");
            }
        } else if (obj instanceof P) {
            iVar.getClass();
            if (!((C3308d) iVar.f1941d).d((P) obj)) {
                AbstractC3256n.o("new-instance-error", "Attempting to create a new Dart instance of WebChromeClient, but the class has a nonnull callback method.", "");
            }
        } else if (obj instanceof C3321q) {
            iVar.getClass();
            C3321q c3321q = (C3321q) obj;
            C1915d c1915d11 = new C1915d(21);
            C3308d c3308d11 = (C3308d) iVar.f1941d;
            if (!c3308d11.d(c3321q)) {
                new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.pigeon_newInstance").m(AbstractC3935e.C(Long.valueOf(c3308d11.b(c3321q))), new C3146c(c1915d11, 15));
            }
        } else if (obj instanceof WebStorage) {
            iVar.getClass();
            WebStorage webStorage = (WebStorage) obj;
            C1915d c1915d12 = new C1915d(21);
            C3308d c3308d12 = (C3308d) iVar.f1941d;
            if (!c3308d12.d(webStorage)) {
                new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebStorage.pigeon_newInstance").m(AbstractC3935e.C(Long.valueOf(c3308d12.b(webStorage))), new C3293D(c1915d12, 15));
            }
        } else if (obj instanceof WebChromeClient.FileChooserParams) {
            iVar.getClass();
            WebChromeClient.FileChooserParams fileChooserParams = (WebChromeClient.FileChooserParams) obj;
            C1915d c1915d13 = new C1915d(21);
            C3308d c3308d13 = (C3308d) iVar.f1941d;
            if (!c3308d13.d(fileChooserParams)) {
                long jB2 = c3308d13.b(fileChooserParams);
                boolean zIsCaptureEnabled = fileChooserParams.isCaptureEnabled();
                List listAsList = Arrays.asList(fileChooserParams.getAcceptTypes());
                int mode = fileChooserParams.getMode();
                new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance").m(AbstractC3935e.D(Long.valueOf(jB2), Boolean.valueOf(zIsCaptureEnabled), listAsList, mode != 0 ? mode != 1 ? mode != 3 ? EnumC3320p.f39687f : EnumC3320p.f39686e : EnumC3320p.f39685d : EnumC3320p.f39684c, fileChooserParams.getFilenameHint()), new C3146c(c1915d13, 14));
            }
        } else if (obj instanceof PermissionRequest) {
            iVar.getClass();
            PermissionRequest permissionRequest = (PermissionRequest) obj;
            C1915d c1915d14 = new C1915d(21);
            C3308d c3308d14 = (C3308d) iVar.f1941d;
            if (!c3308d14.d(permissionRequest)) {
                new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.pigeon_newInstance").m(AbstractC3935e.D(Long.valueOf(c3308d14.b(permissionRequest)), Arrays.asList(permissionRequest.getResources())), new C3146c(c1915d14, 20));
            }
        } else if (obj instanceof WebChromeClient.CustomViewCallback) {
            iVar.getClass();
            WebChromeClient.CustomViewCallback customViewCallback = (WebChromeClient.CustomViewCallback) obj;
            C1915d c1915d15 = new C1915d(21);
            C3308d c3308d15 = (C3308d) iVar.f1941d;
            if (!c3308d15.d(customViewCallback)) {
                new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.pigeon_newInstance").m(AbstractC3935e.C(Long.valueOf(c3308d15.b(customViewCallback))), new C3146c(c1915d15, i11));
            }
        } else if (obj instanceof View) {
            iVar.getClass();
            View view = (View) obj;
            C1915d c1915d16 = new C1915d(21);
            C3308d c3308d16 = (C3308d) iVar.f1941d;
            if (!c3308d16.d(view)) {
                new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.View.pigeon_newInstance").m(AbstractC3935e.C(Long.valueOf(c3308d16.b(view))), new C3293D(c1915d16, 1));
            }
        } else if (obj instanceof GeolocationPermissions.Callback) {
            iVar.getClass();
            GeolocationPermissions.Callback callback = (GeolocationPermissions.Callback) obj;
            C1915d c1915d17 = new C1915d(21);
            C3308d c3308d17 = (C3308d) iVar.f1941d;
            if (!c3308d17.d(callback)) {
                new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance").m(AbstractC3935e.C(Long.valueOf(c3308d17.b(callback))), new C3146c(c1915d17, 16));
            }
        } else if (obj instanceof HttpAuthHandler) {
            iVar.getClass();
            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj;
            C1915d c1915d18 = new C1915d(21);
            C3308d c3308d18 = (C3308d) iVar.f1941d;
            if (!c3308d18.d(httpAuthHandler)) {
                new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.pigeon_newInstance").m(AbstractC3935e.C(Long.valueOf(c3308d18.b(httpAuthHandler))), new C3146c(c1915d18, 18));
            }
        } else if (obj instanceof Message) {
            iVar.getClass();
            Message message = (Message) obj;
            C1915d c1915d19 = new C1915d(21);
            C3308d c3308d19 = (C3308d) iVar.f1941d;
            if (!c3308d19.d(message)) {
                new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.pigeon_newInstance").m(AbstractC3935e.C(Long.valueOf(c3308d19.b(message))), new C3146c(c1915d19, 4));
            }
        } else if (obj instanceof ClientCertRequest) {
            iVar.getClass();
            ClientCertRequest clientCertRequest = (ClientCertRequest) obj;
            C1915d c1915d20 = new C1915d(21);
            C3308d c3308d20 = (C3308d) iVar.f1941d;
            if (!c3308d20.d(clientCertRequest)) {
                new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.pigeon_newInstance").m(AbstractC3935e.C(Long.valueOf(c3308d20.b(clientCertRequest))), new C3146c(c1915d20, 8));
            }
        } else if (obj instanceof PrivateKey) {
            iVar.getClass();
            PrivateKey privateKey = (PrivateKey) obj;
            C1915d c1915d21 = new C1915d(21);
            C3308d c3308d21 = (C3308d) iVar.f1941d;
            if (!c3308d21.d(privateKey)) {
                new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.PrivateKey.pigeon_newInstance").m(AbstractC3935e.C(Long.valueOf(c3308d21.b(privateKey))), new C3146c(c1915d21, i5));
            }
        } else if (obj instanceof X509Certificate) {
            iVar.getClass();
            X509Certificate x509Certificate = (X509Certificate) obj;
            C1915d c1915d22 = new C1915d(21);
            C3308d c3308d22 = (C3308d) iVar.f1941d;
            if (!c3308d22.d(x509Certificate)) {
                new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.X509Certificate.pigeon_newInstance").m(AbstractC3935e.C(Long.valueOf(c3308d22.b(x509Certificate))), new C3293D(c1915d22, 24));
            }
        } else if (obj instanceof SslErrorHandler) {
            iVar.getClass();
            SslErrorHandler sslErrorHandler = (SslErrorHandler) obj;
            C1915d c1915d23 = new C1915d(21);
            C3308d c3308d23 = (C3308d) iVar.f1941d;
            if (!c3308d23.d(sslErrorHandler)) {
                new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.pigeon_newInstance").m(AbstractC3935e.C(Long.valueOf(c3308d23.b(sslErrorHandler))), new C3146c(c1915d23, 28));
            }
        } else if (obj instanceof SslError) {
            iVar.getClass();
            SslError sslError = (SslError) obj;
            C1915d c1915d24 = new C1915d(21);
            C3308d c3308d24 = (C3308d) iVar.f1941d;
            if (!c3308d24.d(sslError)) {
                new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.SslError.pigeon_newInstance").m(AbstractC3935e.D(Long.valueOf(c3308d24.b(sslError)), sslError.getCertificate(), sslError.getUrl()), new C3146c(c1915d24, 26));
            }
        } else if (obj instanceof SslCertificate.DName) {
            iVar.getClass();
            SslCertificate.DName dName = (SslCertificate.DName) obj;
            C1915d c1915d25 = new C1915d(21);
            C3308d c3308d25 = (C3308d) iVar.f1941d;
            if (!c3308d25.d(dName)) {
                new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.pigeon_newInstance").m(AbstractC3935e.C(Long.valueOf(c3308d25.b(dName))), new C3146c(c1915d25, 25));
            }
        } else if (obj instanceof SslCertificate) {
            iVar.getClass();
            SslCertificate sslCertificate = (SslCertificate) obj;
            C1915d c1915d26 = new C1915d(21);
            C3308d c3308d26 = (C3308d) iVar.f1941d;
            if (!c3308d26.d(sslCertificate)) {
                new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance").m(AbstractC3935e.C(Long.valueOf(c3308d26.b(sslCertificate))), new C3146c(c1915d26, i12));
            }
        } else if (obj instanceof Certificate) {
            iVar.getClass();
            Certificate certificate = (Certificate) obj;
            C1915d c1915d27 = new C1915d(21);
            C3308d c3308d27 = (C3308d) iVar.f1941d;
            if (!c3308d27.d(certificate)) {
                new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance").m(AbstractC3935e.C(Long.valueOf(c3308d27.b(certificate))), new C3146c(c1915d27, i13));
            }
        }
        if (!((C3308d) iVar.f1941d).d(obj)) {
            throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass().getName() + "'");
        }
        stream.write(128);
        C3308d c3308d28 = (C3308d) iVar.f1941d;
        c3308d28.f();
        Long l10 = (Long) c3308d28.f39647b.get(obj);
        if (l10 != null) {
            c3308d28.f39649d.put(l10, obj);
        }
        k(stream, l10);
    }
}
