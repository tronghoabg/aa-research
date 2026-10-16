package com.waze.r;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.MutableLiveData;
import com.waze.R;
import com.waze.app_nav.hub.service.k;
import com.waze.asks.ad;
import com.waze.b.s;
import com.waze.b.u;
import com.waze.car_lib.r;
import com.waze.design_components.c.j;
import com.waze.design_components.cta_bar.CallToActionBar;
import com.waze.sharedui.web.WazeWebView;
import com.waze.uid.d.q;
import h.ab;
import h.g.b.x;
import l.a.ye;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h extends com.waze.app_nav.hub.service.d implements org.a.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f33506a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f33507b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f33508c;

    /* renamed from: d, reason: collision with root package name */
    private final h.f f33509d;

    /* renamed from: e, reason: collision with root package name */
    private WazeWebView f33510e;

    public h() {
        super(R.layout.waze_uid_consent_screen);
        this.f33506a = org.a.b.b.d.a(this);
        this.f33507b = h.g.b(h.h.f48130a, new c((ComponentCallbacks) this, 4));
        this.f33508c = h.g.a(new ad(this, 17));
        this.f33509d = h.g.a(new c(this, 1));
    }

    static final b e(h hVar) {
        Object objD = k.f15395a.a().a(hVar.a()).d();
        if (true != (objD instanceof b)) {
            objD = null;
        }
        b bVar = (b) objD;
        if (bVar != null) {
            return bVar;
        }
        throw new RuntimeException("invalid arguments class");
    }

    static final ab f(h hVar, Boolean bool) {
        if (x.n(bool, true)) {
            hVar.o().show();
        } else {
            hVar.o().e();
        }
        return ab.f48028a;
    }

    static final ab g(h hVar) {
        hVar.q(ye.ACCEPT);
        hVar.n().i().invoke();
        return ab.f48028a;
    }

    static final ab h(h hVar) {
        hVar.q(ye.DECLINE);
        hVar.r();
        return ab.f48028a;
    }

    static final ab i(h hVar) {
        hVar.n().j().invoke();
        return ab.f48028a;
    }

    static final void j(h hVar) {
        hVar.n().k().invoke();
    }

    private final u k() {
        return (u) this.f33507b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b n() {
        return (b) this.f33509d.getValue();
    }

    private final com.waze.sharedui.d.b o() {
        return (com.waze.sharedui.d.b) this.f33508c.getValue();
    }

    private final String p(int i2) {
        return "#".concat(String.valueOf(Integer.toHexString(ContextCompat.getColor(requireContext(), i2) & ViewCompat.MEASURED_SIZE_MASK)));
    }

    private final void q(ye yeVar) {
        if (n().l()) {
            q.f44463a.a().c().r(yeVar);
        }
    }

    private final void r() {
        j jVar = new j(n().f(), new com.waze.design_components.cta_bar.c(new com.waze.design_components.cta_bar.b(n().d(), false, ((s) k().a().d()).d() ? com.waze.design_components.button.g.f23359b : com.waze.design_components.button.g.f23358a, 0.0f, null, null, null, 122), new com.waze.design_components.cta_bar.b(n().e(), false, com.waze.design_components.button.g.f23359b, 0.0f, null, null, new c(this, 0), 58), com.waze.design_components.cta_bar.g.f23435a), new r(6), n().c(), true, null, 96);
        Context contextRequireContext = requireContext();
        x.e(contextRequireContext, "requireContext(...)");
        com.waze.design_components.d.c(contextRequireContext, jVar);
    }

    @Override // com.waze.app_nav.hub.service.d
    public final void c() {
        WazeWebView wazeWebView = this.f33510e;
        if (wazeWebView == null) {
            x.j("consentView");
            wazeWebView = null;
        }
        if (wazeWebView.I()) {
            return;
        }
        r();
    }

    @Override // org.a.a.b.a
    public final org.a.d.k.b l() {
        return (org.a.d.k.b) this.f33506a.getValue();
    }

    @Override // org.a.a.b.a
    public final /* synthetic */ void m() {
    }

    @Override // android.support.v4.app.ar
    public final void onDestroyView() {
        super.onDestroyView();
        WazeWebView wazeWebView = this.f33510e;
        if (wazeWebView == null) {
            x.j("consentView");
            wazeWebView = null;
        }
        wazeWebView.s();
        o().e();
    }

    @Override // com.waze.app_nav.hub.service.d, android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        x.f(view, "view");
        super.onViewCreated(view, bundle);
        if (n().l()) {
            q.f44463a.a().c().s(((s) k().a().d()).d() ? com.waze.uid.stats.k.f44759b : com.waze.uid.stats.k.f44758a);
        }
        MutableLiveData mutableLiveData = new MutableLiveData();
        int i2 = 0;
        mutableLiveData.observe(getViewLifecycleOwner(), new g(new d(this, i2)));
        View viewFindViewById = view.findViewById(R.id.uidConsentContent);
        x.e(viewFindViewById, "findViewById(...)");
        WazeWebView wazeWebView = (WazeWebView) viewFindViewById;
        this.f33510e = wazeWebView;
        WazeWebView wazeWebView2 = null;
        if (wazeWebView == null) {
            x.j("consentView");
            wazeWebView = null;
        }
        wazeWebView.B(new e(this, i2));
        WazeWebView wazeWebView3 = this.f33510e;
        if (wazeWebView3 == null) {
            x.j("consentView");
            wazeWebView3 = null;
        }
        int i3 = 2;
        wazeWebView3.E(new e(this, i3));
        WazeWebView wazeWebView4 = this.f33510e;
        if (wazeWebView4 == null) {
            x.j("consentView");
            wazeWebView4 = null;
        }
        wazeWebView4.D(new f(mutableLiveData, this));
        String strP = p(R.color.content_default);
        String strP2 = p(R.color.background_default);
        String strP3 = p(R.color.content_p1);
        String str = "<html>" + ("\n  <head><meta name='viewport' content='width=device-width, initial-scale=1.0,\n  maximum-scale=1.0, minimum-scale=1.0, user-scalable=no'>\n  <style type='text/css'>body{font-family: sans-serif;color: " + strP + "; background-color: " + strP2 + ";\n   padding-left: 16px;padding-right: 16px;font-size: 15px;line-height: 1.2;}\n  a{color: " + p(R.color.brand_waze) + ";}h1{font-size: 26px;font-weight: bold;color: " + strP3 + ";\n  text-align: center;padding: 50px 26px 26px;}h2{font-size: 18px; color: " + strP3 + ";}\n  h3{font-size: 17px;margin-bottom: 5px; color: " + strP3 + "; }\n  ul{padding-left: 15px; padding-right: 15px;}p{margin-top: 0;}</style>\n  </head>\n  ") + "<body>" + n().h() + "</body></html>";
        WazeWebView wazeWebView5 = this.f33510e;
        if (wazeWebView5 == null) {
            x.j("consentView");
        } else {
            wazeWebView2 = wazeWebView5;
        }
        wazeWebView2.H(str);
        ((CallToActionBar) view.findViewById(R.id.uidConsentCta)).l(new com.waze.design_components.cta_bar.c(new com.waze.design_components.cta_bar.b(n().g(), false, n().a(), 0.0f, null, null, new c(this, i3), 58), new com.waze.design_components.cta_bar.b(n().b(), false, com.waze.design_components.button.g.f23359b, 0.0f, null, null, new c(this, 3), 58), com.waze.design_components.cta_bar.g.f23435a));
    }
}
