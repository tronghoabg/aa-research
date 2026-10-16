package com.unity3d.ads.adplayer;

import Bf.k;
import Ef.C0514u;
import Ef.H;
import Ef.InterfaceC0513t;
import Ef.K;
import Ef.z0;
import Fe.e;
import Hf.InterfaceC0592c0;
import Hf.e0;
import Hf.k0;
import Hf.v0;
import Hf.x0;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import com.unity3d.ads.adplayer.model.ErrorReason;
import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ViewExtensionsKt;
import ef.C2527k;
import ef.C2529m;
import ff.AbstractC2641B;
import ff.o;
import ff.v;
import ff.w;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001.B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R#\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00160\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001fR\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00160)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u001f¨\u0006/"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidWebViewClient;", "Landroidx/webkit/WebViewClientCompat;", "Lcom/unity3d/ads/core/domain/GetCachedAsset;", "getCachedAsset", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "<init>", "(Lcom/unity3d/ads/core/domain/GetCachedAsset;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "Landroid/webkit/WebView;", "view", "", "url", "Lef/C;", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceResponse;", "shouldInterceptRequest", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "Landroid/webkit/RenderProcessGoneDetail;", "detail", "", "onRenderProcessGone", "(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z", "Lcom/unity3d/ads/core/domain/GetCachedAsset;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "LHf/c0;", "", "Lcom/unity3d/ads/adplayer/model/WebViewClientError;", "loadErrors", "LHf/c0;", "LEf/t;", "_onLoadFinished", "LEf/t;", "LEf/K;", "onLoadFinished", "LEf/K;", "getOnLoadFinished", "()LEf/K;", "_isRenderProcessGone", "LHf/v0;", "isRenderProcessGone", "LHf/v0;", "()LHf/v0;", "webviewType", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidWebViewClient extends WebViewClientCompat {

    @NotNull
    public static final String BLANK_PAGE = "about:blank";

    @NotNull
    private final InterfaceC0592c0 _isRenderProcessGone;

    @NotNull
    private final InterfaceC0513t _onLoadFinished;

    @NotNull
    private final GetCachedAsset getCachedAsset;

    @NotNull
    private final v0 isRenderProcessGone;

    @NotNull
    private final InterfaceC0592c0 loadErrors;

    @NotNull
    private final K onLoadFinished;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final InterfaceC0592c0 webviewType;

    public AndroidWebViewClient(@NotNull GetCachedAsset getCachedAsset, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        AbstractC3340k.e(getCachedAsset, "getCachedAsset");
        AbstractC3340k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.getCachedAsset = getCachedAsset;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.loadErrors = k0.c(v.f35432a);
        C0514u c0514uB = H.b();
        this._onLoadFinished = c0514uB;
        this.onLoadFinished = c0514uB;
        x0 x0VarC = k0.c(Boolean.FALSE);
        this._isRenderProcessGone = x0VarC;
        this.isRenderProcessGone = new e0(x0VarC);
        this.webviewType = k0.c("");
    }

    @NotNull
    public final K getOnLoadFinished() {
        return this.onLoadFinished;
    }

    @NotNull
    /* renamed from: isRenderProcessGone, reason: from getter */
    public final v0 getIsRenderProcessGone() {
        return this.isRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(@NotNull WebView view, @NotNull String url) {
        String str;
        AbstractC3340k.e(view, "view");
        AbstractC3340k.e(url, "url");
        if (url.equals(BLANK_PAGE)) {
            InterfaceC0592c0 interfaceC0592c0 = this.loadErrors;
            while (true) {
                x0 x0Var = (x0) interfaceC0592c0;
                Object value = x0Var.getValue();
                str = url;
                if (x0Var.i(value, o.F0((List) value, new WebViewClientError(str, ErrorReason.REASON_WEB_BLANK, null, 4, null)))) {
                    break;
                } else {
                    url = str;
                }
            }
        } else {
            str = url;
        }
        super.onPageFinished(view, str);
        ((C0514u) this._onLoadFinished).K(((x0) this.loadErrors).getValue());
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(@NotNull WebView view, @NotNull RenderProcessGoneDetail detail) {
        x0 x0Var;
        Object value;
        AbstractC3340k.e(view, "view");
        AbstractC3340k.e(detail, "detail");
        ViewExtensionsKt.removeViewFromParent(view);
        view.destroy();
        if (((z0) this._onLoadFinished).I()) {
            InterfaceC0592c0 interfaceC0592c0 = this._isRenderProcessGone;
            Boolean bool = Boolean.TRUE;
            x0 x0Var2 = (x0) interfaceC0592c0;
            x0Var2.getClass();
            x0Var2.k(null, bool);
            return true;
        }
        InterfaceC0592c0 interfaceC0592c02 = this.loadErrors;
        do {
            x0Var = (x0) interfaceC0592c02;
            value = x0Var.getValue();
        } while (!x0Var.i(value, o.F0((List) value, new WebViewClientError(String.valueOf(view.getUrl()), ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, null, 4, null))));
        ((C0514u) this._onLoadFinished).K(((x0) this.loadErrors).getValue());
        return true;
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(@NotNull WebView view, @NotNull WebResourceRequest request) {
        Object objZ;
        AbstractC3340k.e(view, "view");
        AbstractC3340k.e(request, "request");
        Uri url = request.getUrl();
        if (url == null) {
            return super.shouldInterceptRequest(view, request);
        }
        try {
            try {
                objZ = url.getQueryParameter("webviewType");
            } catch (Throwable th) {
                objZ = e.z(th);
            }
            if (objZ instanceof C2529m) {
                objZ = null;
            }
            String str = (String) objZ;
            if (str != null && !k.y0(str)) {
                x0 x0Var = (x0) this.webviewType;
                x0Var.getClass();
                x0Var.k(null, str);
            }
            if (AbstractC3340k.a(url.getLastPathSegment(), "favicon.ico")) {
                return new WebResourceResponse("image/png", null, null);
            }
            GetCachedAsset getCachedAsset = this.getCachedAsset;
            Uri url2 = request.getUrl();
            AbstractC3340k.d(url2, "request.url");
            return getCachedAsset.invoke(url2, (String) ((x0) this.webviewType).getValue());
        } catch (Throwable th2) {
            String message = th2.getMessage();
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "webview_could_not_handle_intercepted_url", (Double) null, message != null ? AbstractC2641B.E(new C2527k("reason", message)) : w.f35433a, (Map) null, (AdObject) null, (Integer) null, 58, (Object) null);
            return super.shouldInterceptRequest(view, request);
        }
    }
}
