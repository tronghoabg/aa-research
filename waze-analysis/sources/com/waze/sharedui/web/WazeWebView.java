package com.waze.sharedui.web;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.webkit.WebViewAssetLoader;
import com.waze.config.ConfigValues;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class WazeWebView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final ac f39291a;

    /* renamed from: b, reason: collision with root package name */
    private final ae f39292b;

    /* renamed from: c, reason: collision with root package name */
    private c f39293c;

    /* renamed from: d, reason: collision with root package name */
    private WebViewAssetLoader f39294d;

    /* renamed from: e, reason: collision with root package name */
    private String f39295e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f39296f;

    /* renamed from: g, reason: collision with root package name */
    private ad f39297g;

    /* renamed from: h, reason: collision with root package name */
    private ak f39298h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f39299i;

    /* renamed from: j, reason: collision with root package name */
    private af f39300j;

    /* renamed from: k, reason: collision with root package name */
    private af f39301k;

    /* renamed from: l, reason: collision with root package name */
    private final ai f39302l;
    private final l m;

    public WazeWebView(Context context) {
        super(context);
        this.f39291a = new ac(this);
        this.f39292b = new ae(this);
        this.f39295e = "WazeWebView";
        final int i2 = 1;
        this.f39296f = true;
        this.f39300j = new af() { // from class: com.waze.sharedui.web.z
            @Override // com.waze.sharedui.web.af
            public final boolean a(String str) {
                return false;
            }
        };
        final int i3 = 0;
        this.f39301k = new af() { // from class: com.waze.sharedui.web.z
            @Override // com.waze.sharedui.web.af
            public final boolean a(String str) {
                return false;
            }
        };
        com.waze.shared_infra.o.b.a();
        this.f39302l = e();
        this.m = K();
        L(context, null);
    }

    private final l K() {
        ai aiVar = this.f39302l;
        if (aiVar == null) {
            return null;
        }
        return new l(aiVar, new com.waze.r.d(this, 14));
    }

    private final void L(Context context, AttributeSet attributeSet) {
        int i2;
        int i3 = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_width, R.attr.layout_height});
            int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(0, -1);
            int layoutDimension2 = typedArrayObtainStyledAttributes.getLayoutDimension(1, -1);
            typedArrayObtainStyledAttributes.recycle();
            i2 = layoutDimension2;
            i3 = layoutDimension;
        } else {
            i2 = -1;
        }
        c cVar = null;
        if (ConfigValues.CONFIG_VALUE_WEB_VIEW_ENABLE_ASSET_LOADER.b().booleanValue()) {
            com.waze.shared_infra.i.h.a("Using web view asset loader");
            WebViewAssetLoader.Builder builder = new WebViewAssetLoader.Builder();
            builder.addPathHandler("/assets/", new WebViewAssetLoader.AssetsPathHandler(context));
            builder.addPathHandler("/res/", new WebViewAssetLoader.ResourcesPathHandler(context));
            this.f39294d = builder.build();
        } else {
            this.f39294d = null;
        }
        try {
            cVar = new c(context);
        } catch (Exception e2) {
            com.waze.shared_infra.i.h.e("Could not create web view", e2);
        }
        this.f39293c = cVar;
        if (cVar == null) {
            return;
        }
        cVar.c(this.f39295e);
        addView(this.f39293c, new FrameLayout.LayoutParams(O(i3), O(i2)));
        G(com.waze.R.color.background_default);
        this.f39293c.setWebViewClient(new aj(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        ak akVar = this.f39298h;
        if (akVar != null) {
            akVar.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean N(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedui.web.WazeWebView.N(java.lang.String):boolean");
    }

    private static final int O(int i2) {
        return i2 == -2 ? -2 : -1;
    }

    public static /* synthetic */ h.ab i(WazeWebView wazeWebView, s sVar) {
        ak akVar = wazeWebView.f39298h;
        if (akVar != null) {
            akVar.e(sVar);
        }
        return h.ab.f48028a;
    }

    static /* bridge */ /* synthetic */ void k(WazeWebView wazeWebView) {
        ak akVar = wazeWebView.f39298h;
        if (akVar != null) {
            akVar.a();
        }
    }

    static /* bridge */ /* synthetic */ void l(WazeWebView wazeWebView) {
        ak akVar = wazeWebView.f39298h;
        if (akVar != null) {
            akVar.b();
        }
    }

    static /* bridge */ /* synthetic */ void n(WazeWebView wazeWebView, boolean z) {
        ak akVar = wazeWebView.f39298h;
        if (akVar != null) {
            akVar.d(z);
        }
    }

    static /* bridge */ /* synthetic */ void o(WazeWebView wazeWebView) {
        ak akVar = wazeWebView.f39298h;
        if (akVar != null) {
            akVar.f();
        }
    }

    static /* bridge */ /* synthetic */ void p(WazeWebView wazeWebView) {
        ak akVar = wazeWebView.f39298h;
        if (akVar != null) {
            akVar.g();
        }
    }

    static /* bridge */ /* synthetic */ void q(WazeWebView wazeWebView, String str) {
        ak akVar = wazeWebView.f39298h;
        if (akVar != null) {
            akVar.h(str);
        } else {
            com.waze.shared_infra.i.h.k(wazeWebView.f39295e, "onShareRequest: webViewActionListener == null");
        }
    }

    static /* bridge */ /* synthetic */ void r(WazeWebView wazeWebView, String str) {
        ak akVar = wazeWebView.f39298h;
        if (akVar != null) {
            akVar.i(str);
        } else {
            com.waze.shared_infra.i.h.k(wazeWebView.f39295e, "onUpdateHeaderRequest: webViewActionListener == null");
        }
    }

    public final void A(Bundle bundle) {
        c cVar = this.f39293c;
        if (cVar == null) {
            return;
        }
        cVar.saveState(bundle);
    }

    public final void B(af afVar) {
        this.f39300j = afVar;
    }

    public final void C(String str) {
        this.f39295e = str;
        c cVar = this.f39293c;
        if (cVar != null) {
            cVar.c(str);
        }
    }

    public final void D(ad adVar) {
        this.f39297g = adVar;
    }

    public final void E(af afVar) {
        this.f39301k = afVar;
    }

    public final void F(ak akVar) {
        this.f39298h = akVar;
    }

    public final void G(int i2) {
        c cVar = this.f39293c;
        if (cVar == null) {
            return;
        }
        cVar.setBackgroundColor(ContextCompat.getColor(getContext(), i2));
    }

    public final void H(String str) {
        c cVar = this.f39293c;
        if (cVar == null) {
            return;
        }
        at.g(cVar.getSettings());
        this.f39293c.loadDataWithBaseURL(null, str, "text/html", "UTF-8", null);
    }

    public final boolean I() {
        c cVar = this.f39293c;
        if (cVar == null || !this.f39296f || !cVar.canGoBack()) {
            return false;
        }
        this.f39293c.goBack();
        return true;
    }

    public final com.waze.settings.q J() {
        if (this.f39293c == null) {
            return null;
        }
        return new com.waze.settings.q(this);
    }

    public final WebSettings a() {
        c cVar = this.f39293c;
        if (cVar == null) {
            return null;
        }
        return cVar.getSettings();
    }

    protected final ai e() {
        if (getContext() instanceof com.waze.sharedui.a.e) {
            return new ai((com.waze.sharedui.a.e) getContext());
        }
        return null;
    }

    public final String g() {
        c cVar = this.f39293c;
        if (cVar == null) {
            return null;
        }
        return cVar.getTitle();
    }

    public final String h() {
        c cVar = this.f39293c;
        if (cVar == null) {
            return null;
        }
        return cVar.getUrl();
    }

    public final void s() {
        if (this.f39293c != null) {
            removeAllViews();
            this.f39293c.destroy();
            this.f39293c = null;
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i2) {
        c cVar = this.f39293c;
        if (cVar == null) {
            return;
        }
        cVar.setBackgroundColor(i2);
    }

    @Override // android.view.View
    public final void setOnTouchListener(final View.OnTouchListener onTouchListener) {
        c cVar = this.f39293c;
        if (cVar == null) {
            super.setOnTouchListener(onTouchListener);
        } else {
            cVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.waze.sharedui.web.aa
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return onTouchListener.onTouch(this.f39307a, motionEvent);
                }
            });
        }
    }

    public final void t(String str) {
        if (this.f39293c != null && N(str)) {
            this.f39293c.loadUrl(str);
        }
    }

    public final void u(String str, Map map) {
        if (this.f39293c != null && N(str)) {
            this.f39293c.loadUrl(str, map);
        }
    }

    public final void v(Uri uri) {
        c cVar = this.f39293c;
        if (cVar == null) {
            return;
        }
        WebChromeClient webChromeClient = cVar.getWebChromeClient();
        if (webChromeClient instanceof l) {
            ((l) webChromeClient).a(uri);
        }
    }

    protected final void w(boolean z) {
        c cVar = this.f39293c;
        if (cVar == null) {
            return;
        }
        if (this.f39299i) {
            cVar.clearHistory();
            return;
        }
        if (!z) {
            this.f39299i = true;
            cVar.loadUrl("about:blank");
        }
        ad adVar = this.f39297g;
        if (adVar != null) {
            adVar.b(z);
        }
    }

    protected final void x(String str) {
        c cVar = this.f39293c;
        if (cVar == null || this.f39299i) {
            return;
        }
        cVar.b(str);
        ad adVar = this.f39297g;
        if (adVar != null) {
            adVar.c();
        }
    }

    public final void y() {
        M();
    }

    public final void z(Bundle bundle) {
        c cVar = this.f39293c;
        if (cVar == null) {
            return;
        }
        cVar.restoreState(bundle);
    }

    public WazeWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39291a = new ac(this);
        this.f39292b = new ae(this);
        this.f39295e = "WazeWebView";
        final int i2 = 1;
        this.f39296f = true;
        this.f39300j = new af() { // from class: com.waze.sharedui.web.z
            @Override // com.waze.sharedui.web.af
            public final boolean a(String str) {
                return false;
            }
        };
        final int i3 = 0;
        this.f39301k = new af() { // from class: com.waze.sharedui.web.z
            @Override // com.waze.sharedui.web.af
            public final boolean a(String str) {
                return false;
            }
        };
        com.waze.shared_infra.o.b.a();
        this.f39302l = e();
        this.m = K();
        L(context, attributeSet);
    }

    public WazeWebView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f39291a = new ac(this);
        this.f39292b = new ae(this);
        this.f39295e = "WazeWebView";
        final int i3 = 1;
        this.f39296f = true;
        this.f39300j = new af() { // from class: com.waze.sharedui.web.z
            @Override // com.waze.sharedui.web.af
            public final boolean a(String str) {
                return false;
            }
        };
        final int i4 = 0;
        this.f39301k = new af() { // from class: com.waze.sharedui.web.z
            @Override // com.waze.sharedui.web.af
            public final boolean a(String str) {
                return false;
            }
        };
        com.waze.shared_infra.o.b.a();
        this.f39302l = e();
        this.m = K();
        L(context, attributeSet);
    }

    public WazeWebView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f39291a = new ac(this);
        this.f39292b = new ae(this);
        this.f39295e = "WazeWebView";
        final int i4 = 1;
        this.f39296f = true;
        this.f39300j = new af() { // from class: com.waze.sharedui.web.z
            @Override // com.waze.sharedui.web.af
            public final boolean a(String str) {
                return false;
            }
        };
        final int i5 = 0;
        this.f39301k = new af() { // from class: com.waze.sharedui.web.z
            @Override // com.waze.sharedui.web.af
            public final boolean a(String str) {
                return false;
            }
        };
        com.waze.shared_infra.o.b.a();
        this.f39302l = e();
        this.m = K();
        L(context, attributeSet);
    }
}
