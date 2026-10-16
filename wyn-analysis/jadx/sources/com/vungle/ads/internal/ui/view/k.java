package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.vungle.ads.internal.model.f0;
import com.vungle.ads.internal.ui.z;
import com.vungle.ads.internal.util.a0;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import ef.EnumC2526j;
import ef.InterfaceC2525i;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public final class k extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final String f33785a;

    /* renamed from: b, reason: collision with root package name */
    public WebView f33786b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2525i f33787c;

    /* renamed from: d, reason: collision with root package name */
    public h f33788d;

    /* renamed from: e, reason: collision with root package name */
    public f f33789e;

    /* renamed from: f, reason: collision with root package name */
    public i f33790f;

    public /* synthetic */ k(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void getCloseDelegate$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getOnViewTouchListener$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getOrientationDelegate$vungle_ads_release$annotations() {
    }

    private final com.vungle.ads.internal.platform.f getPlatform() {
        return (com.vungle.ads.internal.platform.f) this.f33787c.getValue();
    }

    public final void c() {
        WebView webView = this.f33786b;
        if (webView != null) {
            webView.setLayerType(((com.vungle.ads.internal.platform.c) getPlatform()).m() ? 0 : 2, null);
            webView.setBackgroundColor(0);
            webView.setVisibility(8);
        }
    }

    public final void d() {
        WebView webView = this.f33786b;
        if (webView != null) {
            webView.setVisibility(0);
        }
        WebView webView2 = this.f33786b;
        if (webView2 != null) {
            webView2.onResume();
        }
    }

    @Nullable
    public final f getCloseDelegate$vungle_ads_release() {
        return this.f33789e;
    }

    @Nullable
    public final String getEventId() {
        return this.f33785a;
    }

    @Nullable
    public final h getOnViewTouchListener$vungle_ads_release() {
        return this.f33788d;
    }

    @Nullable
    public final i getOrientationDelegate$vungle_ads_release() {
        return this.f33790f;
    }

    @Nullable
    public final String getUrl() {
        WebView webView = this.f33786b;
        if (webView != null) {
            return webView.getUrl();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ViewGroup.LayoutParams layoutParams;
        super.onAttachedToWindow();
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = -1;
            layoutParams2.width = -1;
        }
        WebView webView = this.f33786b;
        if (webView == null || (layoutParams = webView.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = -1;
        layoutParams.width = -1;
    }

    public final void setCloseDelegate(@NotNull f closeDelegate) {
        AbstractC3340k.e(closeDelegate, "closeDelegate");
        this.f33789e = closeDelegate;
    }

    public final void setCloseDelegate$vungle_ads_release(@Nullable f fVar) {
        this.f33789e = fVar;
    }

    public final void setOnViewTouchListener(@Nullable h hVar) {
        this.f33788d = hVar;
    }

    public final void setOnViewTouchListener$vungle_ads_release(@Nullable h hVar) {
        this.f33788d = hVar;
    }

    public final void setOrientation(int i5) {
        i iVar = this.f33790f;
        if (iVar != null) {
            ((com.vungle.ads.internal.ui.j) iVar).f33728a.setRequestedOrientation(i5);
        }
    }

    public final void setOrientationDelegate(@Nullable i iVar) {
        this.f33790f = iVar;
    }

    public final void setOrientationDelegate$vungle_ads_release(@Nullable i iVar) {
        this.f33790f = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, String str) throws InstantiationException {
        super(context);
        AbstractC3340k.e(context, "context");
        this.f33785a = str;
        this.f33787c = Fe.c.y(EnumC2526j.f34667a, new j(context));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(layoutParams);
        WebView webViewA = a0.a(context, str);
        this.f33786b = webViewA;
        if (webViewA != null) {
            webViewA.setLayoutParams(layoutParams);
        }
        WebView webView = this.f33786b;
        if (webView != null) {
            webView.setTag("VungleWebView");
        }
        addView(this.f33786b, layoutParams);
        a();
        c();
    }

    public final void a() {
        WebView webView = this.f33786b;
        if (webView != null) {
            webView.setOnTouchListener(new Lb.g(this, 0));
        }
    }

    public final void b() {
        WebView webView = this.f33786b;
        if (webView != null) {
            webView.onPause();
        }
    }

    public static final boolean a(k this$0, View view, MotionEvent motionEvent) {
        AbstractC3340k.e(this$0, "this$0");
        h hVar = this$0.f33788d;
        if (hVar != null) {
            return hVar.onTouch(motionEvent);
        }
        return false;
    }

    public final void a(z vngWebViewClient, f0 f0Var) {
        AbstractC3340k.e(vngWebViewClient, "vngWebViewClient");
        WebView webView = this.f33786b;
        if (webView != null) {
            com.vungle.ads.internal.platform.g.a(webView, f0Var);
            webView.setWebViewClient(vngWebViewClient);
        }
    }

    public final void a(String url) {
        AbstractC3340k.e(url, "url");
        boolean z2 = u.f33874a;
        t.a("MRAIDAdWidget", "loadUrl: ".concat(url));
        WebView webView = this.f33786b;
        if (webView != null) {
            webView.loadUrl(url);
        }
    }

    public final void a(long j8) {
        try {
            ViewParent parent = getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this);
            }
        } catch (Throwable th) {
            Fe.e.z(th);
        }
        try {
            removeAllViews();
        } catch (Throwable th2) {
            Fe.e.z(th2);
        }
        if (j8 <= 0) {
            new g(this).run();
        } else {
            new com.vungle.ads.internal.util.o().a(new g(this), j8);
        }
    }
}
