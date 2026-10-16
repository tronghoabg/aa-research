package com.waze.sharedui.web;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewParent;
import android.webkit.WebView;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.waze.config.ConfigValues;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c extends WebView {

    /* renamed from: a, reason: collision with root package name */
    public String f39344a;

    /* renamed from: b, reason: collision with root package name */
    private int f39345b;

    /* renamed from: c, reason: collision with root package name */
    private int f39346c;

    /* renamed from: d, reason: collision with root package name */
    private long f39347d;

    /* renamed from: e, reason: collision with root package name */
    private final b f39348e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        h.g.b.x.f(context, "context");
        org.a.d.k.b bVarC = com.waze.web.r.k().a().c();
        int i2 = h.g.b.ar.f48106a;
        this.f39348e = (b) bVarC.a(new h.g.b.m(b.class), null, null);
    }

    static final h.ab a(String str, WazeWebView wazeWebView, Map map, c cVar, boolean z) {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        if ((z || as.a().i(str)) && wazeWebView != null) {
            Map mapA = g.a(wazeWebView.getWidth(), wazeWebView.getHeight());
            h.g.b.x.e(mapA, "getInternalClientInfoHeaders(...)");
            map.putAll(mapA);
            g.b(cVar.getContext(), str, map);
        }
        boolean zB = com.waze.shared_infra.i.h.B(cVar.getContext());
        org.a.d.a.a aVar = com.waze.shared_infra.k.b.f37902a;
        if (aVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) aVar).l();
            int i2 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(com.waze.shared_infra.k.b.class);
        } else {
            bVarC = aVar.getKoin().a().c();
            int i3 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(com.waze.shared_infra.k.b.class);
        }
        String strA = ((com.waze.shared_infra.k.b) bVarC.a(mVar, null, null)).a();
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("WebViewUtils.kt");
        h.g.b.x.e(eVarD, "create(...)");
        h.g.b.x.f(str, "url");
        h.g.b.x.f(strA, "systemLang");
        h.g.b.x.f(eVarD, "logger");
        String str2 = str;
        if (!TextUtils.isEmpty(str2) && !h.g.b.x.n(str, "about:blank") && !h.n.o.F(str2, "centercode.com", false)) {
            Map mapK = h.a.r.k(new h.k("dark", true != zB ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE), new h.k("theme", true != zB ? "light" : "dark"), new h.k("lang", strA));
            Uri uri = Uri.parse(str);
            h.g.b.x.e(uri, "parse(...)");
            str = com.waze.ad.a.j.m(uri, mapK).toString();
            h.g.b.x.e(str, "toString(...)");
            eVarD.a("Url with query params: ".concat(String.valueOf(str)));
        }
        super.loadUrl(str, map);
        return h.ab.f48028a;
    }

    public final void b(String str) {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        h.g.b.x.f(str, "url");
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = this.f39347d;
        if (j2 == 0 || jCurrentTimeMillis - j2 < ConfigValues.CONFIG_VALUE_VALUES_REDIRECT_THRESHOLD_MSEC.b().longValue()) {
            this.f39346c = copyBackForwardList().getCurrentIndex();
            this.f39347d = jCurrentTimeMillis;
        }
        String strB = as.a().b(str);
        String str2 = this.f39344a;
        if (str2 == null) {
            h.g.b.x.j("tag");
            str2 = null;
        }
        int i2 = this.f39345b + 1;
        this.f39345b = i2;
        int i3 = ax.f39342a;
        if (TextUtils.isEmpty(at.e(str))) {
            return;
        }
        if (true == TextUtils.isEmpty(strB)) {
            strB = "INVALID";
        }
        String str3 = strB;
        if (true == TextUtils.isEmpty(str2)) {
            str2 = "UNKNOWN";
        }
        String str4 = str2;
        org.a.d.a.a aVar = av.f39340a;
        if (aVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) aVar).l();
            int i4 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(av.class);
        } else {
            bVarC = aVar.getKoin().a().c();
            int i5 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(av.class);
        }
        ((av) bVarC.a(mVar, null, null)).a(str, str4, i2, str3);
    }

    public final void c(String str) {
        h.g.b.x.f(str, "<set-?>");
        this.f39344a = str;
    }

    @Override // android.webkit.WebView
    public final boolean canGoBack() {
        return this.f39346c < copyBackForwardList().getCurrentIndex() && super.canGoBack();
    }

    @Override // android.webkit.WebView
    public final void loadUrl(final String str, Map map) {
        h.g.b.x.f(str, "urlString");
        h.g.b.x.f(map, "additionalHttpHeaders");
        final Map mapT = h.a.r.t(map);
        ViewParent parent = getParent();
        final WazeWebView wazeWebView = parent instanceof WazeWebView ? (WazeWebView) parent : null;
        this.f39348e.a(str, new h.g.a.l() { // from class: com.waze.sharedui.web.a
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return c.a(str, wazeWebView, mapT, this, ((Boolean) obj).booleanValue());
            }
        });
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str) {
        h.g.b.x.f(str, "urlString");
        loadUrl(str, h.a.r.j());
    }
}
