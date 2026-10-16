package Qa;

import A7.V;
import C6.i;
import Ma.d;
import Ma.j;
import N.O0;
import Oa.f;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class c extends a {

    /* renamed from: f, reason: collision with root package name */
    public WebView f9934f;

    /* renamed from: g, reason: collision with root package name */
    public Long f9935g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f9936h;

    public c(String str, Map map) {
        super(str);
        this.f9935g = null;
        this.f9936h = map;
    }

    @Override // Qa.a
    public final void a(j jVar, d dVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(dVar.f7576d);
        Iterator it = mapUnmodifiableMap.keySet().iterator();
        if (it.hasNext()) {
            mapUnmodifiableMap.get((String) it.next()).getClass();
            throw new ClassCastException();
        }
        b(jVar, dVar, jSONObject);
    }

    @Override // Qa.a
    public final void d() {
        super.d();
        new Handler().postDelayed(new V(this), Math.max(4000 - (this.f9935g == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f9935g.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f9934f = null;
    }

    @Override // Qa.a
    public final void f() {
        WebView webView = new WebView(f.f8936b.f8937a);
        this.f9934f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f9934f.getSettings().setAllowContentAccess(false);
        this.f9934f.getSettings().setAllowFileAccess(false);
        this.f9934f.setWebViewClient(new i(this, 1));
        this.f9930b = new O0(this.f9934f);
        WebView webView2 = this.f9934f;
        if (webView2 != null && !TextUtils.isEmpty(null)) {
            try {
                webView2.evaluateJavascript(null, null);
            } catch (IllegalStateException unused) {
                webView2.loadUrl("javascript: null");
            }
        }
        Map map = this.f9936h;
        Iterator it = map.keySet().iterator();
        if (it.hasNext()) {
            map.get((String) it.next()).getClass();
            throw new ClassCastException();
        }
        this.f9935g = Long.valueOf(System.nanoTime());
    }
}
