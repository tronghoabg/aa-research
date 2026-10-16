package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import A7.Q1;
import Hf.e0;
import Hf.k0;
import Hf.x0;
import N.C0719d0;
import a2.C1323c;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import com.moloco.sdk.internal.MolocoLogger;
import com.unity3d.services.core.network.model.HttpRequest;
import j1.C3074b;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.AbstractC3340k;
import x3.C4464g;
import x3.C4465h;

/* loaded from: classes4.dex */
public final class P extends WebViewClientCompat {

    /* renamed from: a, reason: collision with root package name */
    public final C1323c f30384a;

    /* renamed from: b, reason: collision with root package name */
    public final C0719d0 f30385b;

    /* renamed from: c, reason: collision with root package name */
    public final x0 f30386c;

    /* renamed from: d, reason: collision with root package name */
    public final x0 f30387d;

    /* renamed from: e, reason: collision with root package name */
    public final x0 f30388e;

    /* renamed from: f, reason: collision with root package name */
    public final e0 f30389f;

    public P(Context context, C1323c c1323c) {
        AbstractC3340k.e(context, "context");
        this.f30384a = c1323c;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C3074b("/", new C4464g(context.getApplicationContext())));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3074b c3074b = (C3074b) it.next();
            arrayList2.add(new C4465h((String) c3074b.f38572a, (C4464g) c3074b.f38573b));
        }
        this.f30385b = new C0719d0(arrayList2);
        x0 x0VarC = k0.c(Boolean.FALSE);
        this.f30386c = x0VarC;
        this.f30387d = x0VarC;
        x0 x0VarC2 = k0.c(null);
        this.f30388e = x0VarC2;
        this.f30389f = new e0(x0VarC2);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        Boolean bool = Boolean.TRUE;
        x0 x0Var = this.f30386c;
        x0Var.getClass();
        x0Var.k(null, bool);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        Boolean bool = Boolean.FALSE;
        x0 x0Var = this.f30386c;
        x0Var.getClass();
        x0Var.k(null, bool);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i5, String str, String str2) {
        super.onReceivedError(webView, i5, str, str2);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f30101a;
        x0 x0Var = this.f30388e;
        x0Var.getClass();
        x0Var.k(null, dVar);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidWebViewClient", R8.v.f("onReceivedError ", str), null, false, 12, null);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f30102b;
        x0 x0Var = this.f30388e;
        x0Var.getClass();
        x0Var.k(null, dVar);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidWebViewClient", "onRenderProcessGone", null, false, 12, null);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest request) throws IOException {
        String string;
        AbstractC3340k.e(request, "request");
        Uri url = request.getUrl();
        if (url == null || (string = url.toString()) == null) {
            string = "";
        }
        Uri uri = Uri.parse(Bf.r.h0(string, "mraid.js", "com.moloco.sdk.xenoss.sdkdevkit.mraid.js", true));
        AbstractC3340k.d(uri, "parse(...)");
        Iterator it = this.f30385b.f7761a.iterator();
        while (it.hasNext()) {
            C4465h c4465h = (C4465h) it.next();
            c4465h.getClass();
            boolean zEquals = uri.getScheme().equals("http");
            String str = c4465h.f47675b;
            C4464g c4464g = (!zEquals && (uri.getScheme().equals("http") || uri.getScheme().equals(HttpRequest.DEFAULT_SCHEME)) && uri.getAuthority().equals(c4465h.f47674a) && uri.getPath().startsWith(str)) ? c4465h.f47676c : null;
            if (c4464g != null) {
                String strReplaceFirst = uri.getPath().replaceFirst(str, "");
                try {
                    Q1 q12 = c4464g.f47673a;
                    String strSubstring = (strReplaceFirst.length() <= 1 || strReplaceFirst.charAt(0) != '/') ? strReplaceFirst : strReplaceFirst.substring(1);
                    InputStream inputStreamOpen = q12.f677a.getAssets().open(strSubstring, 2);
                    if (strSubstring.endsWith(".svgz")) {
                        inputStreamOpen = new GZIPInputStream(inputStreamOpen);
                    }
                    return new WebResourceResponse(Q1.a(strReplaceFirst), null, inputStreamOpen);
                } catch (IOException e7) {
                    Log.e("WebViewAssetLoader", "Error opening asset path: " + strReplaceFirst, e7);
                    return new WebResourceResponse(null, null, null);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0108  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.P.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }
}
