package com.vungle.ads.internal.ui.view;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.vungle.ads.internal.presenter.e0;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final k f33783a;

    public g(k widget) {
        AbstractC3340k.e(widget, "widget");
        this.f33783a = widget;
    }

    public static final void a(g this$0) {
        AbstractC3340k.e(this$0, "this$0");
        this$0.run();
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView = this.f33783a.f33786b;
        if (webView == null) {
            return;
        }
        if (!AbstractC3340k.a(Looper.myLooper(), Looper.getMainLooper())) {
            new Handler(Looper.getMainLooper()).post(new C8.g(this, 9));
            return;
        }
        try {
            try {
                webView.onPause();
            } catch (Throwable th) {
                Fe.e.z(th);
            }
            try {
                webView.stopLoading();
            } catch (Throwable th2) {
                Fe.e.z(th2);
            }
            try {
                webView.setWebChromeClient(null);
            } catch (Throwable th3) {
                Fe.e.z(th3);
            }
            try {
                webView.setWebViewClient(new WebViewClient());
            } catch (Throwable th4) {
                Fe.e.z(th4);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    webView.setWebViewRenderProcessClient(null);
                } catch (Throwable th5) {
                    Fe.e.z(th5);
                }
            }
            try {
                webView.loadUrl(AndroidWebViewClient.BLANK_PAGE);
            } catch (Throwable th6) {
                Fe.e.z(th6);
            }
            try {
                webView.clearHistory();
            } catch (Throwable th7) {
                Fe.e.z(th7);
            }
            try {
                webView.removeAllViews();
            } catch (Throwable th8) {
                Fe.e.z(th8);
            }
            try {
                this.f33783a.removeAllViews();
            } catch (Throwable th9) {
                Fe.e.z(th9);
            }
            try {
                String eventId = this.f33783a.getEventId();
                if (eventId != null) {
                    e0.a(eventId);
                }
            } catch (Throwable th10) {
                Fe.e.z(th10);
            }
            try {
                webView.destroy();
            } catch (Throwable th11) {
                Fe.e.z(th11);
            }
            this.f33783a.f33786b = null;
        } catch (Throwable th12) {
            boolean z2 = u.f33874a;
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Destroy webview: ");
            sbA.append(th12.getMessage());
            t.b("MRAIDAdWidget", sbA.toString());
        }
    }
}
