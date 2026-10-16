package com.vungle.ads.internal.presenter;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import com.iab.omid.library.vungle.adsession.AdSession;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.VungleError;
import com.vungle.ads.WebViewError;
import com.vungle.ads.WebViewRenderProcessUnresponsive;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.c1;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.model.p1;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.p0;
import com.vungle.ads.internal.protos.Sdk;
import ef.C2527k;
import ef.EnumC2526j;
import ef.InterfaceC2525i;
import ff.AbstractC2640A;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class r implements com.vungle.ads.internal.ui.view.o, com.vungle.ads.internal.ui.view.p {

    /* renamed from: z, reason: collision with root package name */
    public static final Map f33539z = AbstractC2640A.R(new C2527k("checkpoint.0", Sdk.SDKMetric.SDKMetricType.AD_START_EVENT), new C2527k("clickUrl", Sdk.SDKMetric.SDKMetricType.AD_CLICK_EVENT));

    /* renamed from: a, reason: collision with root package name */
    public final com.vungle.ads.internal.ui.view.k f33540a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f33541b;

    /* renamed from: c, reason: collision with root package name */
    public final i3 f33542c;

    /* renamed from: d, reason: collision with root package name */
    public final com.vungle.ads.internal.ui.z f33543d;

    /* renamed from: e, reason: collision with root package name */
    public Executor f33544e;

    /* renamed from: f, reason: collision with root package name */
    public final com.vungle.ads.internal.omsdk.e f33545f;

    /* renamed from: g, reason: collision with root package name */
    public final com.vungle.ads.internal.platform.f f33546g;

    /* renamed from: h, reason: collision with root package name */
    public long f33547h;

    /* renamed from: i, reason: collision with root package name */
    public a f33548i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f33549j;
    public final AtomicBoolean k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f33550l;

    /* renamed from: m, reason: collision with root package name */
    public Long f33551m;

    /* renamed from: n, reason: collision with root package name */
    public String f33552n;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC2525i f33553o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC2525i f33554p;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC2525i f33555q;

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC2525i f33556r;

    /* renamed from: s, reason: collision with root package name */
    public z f33557s;

    /* renamed from: t, reason: collision with root package name */
    public y f33558t;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC2525i f33559u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC2525i f33560v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f33561w;

    /* renamed from: x, reason: collision with root package name */
    public final InterfaceC2525i f33562x;

    /* renamed from: y, reason: collision with root package name */
    public long f33563y;

    public r(com.vungle.ads.internal.ui.view.k adWidget, h0 advertisement, i3 placement, com.vungle.ads.internal.ui.z vungleWebClient, com.vungle.ads.internal.executor.j executor, com.vungle.ads.internal.omsdk.e omTracker, com.vungle.ads.internal.platform.f platform) {
        AbstractC3340k.e(adWidget, "adWidget");
        AbstractC3340k.e(advertisement, "advertisement");
        AbstractC3340k.e(placement, "placement");
        AbstractC3340k.e(vungleWebClient, "vungleWebClient");
        AbstractC3340k.e(executor, "executor");
        AbstractC3340k.e(omTracker, "omTracker");
        AbstractC3340k.e(platform, "platform");
        this.f33540a = adWidget;
        this.f33541b = advertisement;
        this.f33542c = placement;
        this.f33543d = vungleWebClient;
        this.f33544e = executor;
        this.f33545f = omTracker;
        this.f33546g = platform;
        this.k = new AtomicBoolean(false);
        this.f33550l = new AtomicBoolean(false);
        Context context = adWidget.getContext();
        AbstractC3340k.d(context, "adWidget.context");
        EnumC2526j enumC2526j = EnumC2526j.f34667a;
        this.f33553o = Fe.c.y(enumC2526j, new n(context));
        Context context2 = adWidget.getContext();
        AbstractC3340k.d(context2, "adWidget.context");
        this.f33554p = Fe.c.y(enumC2526j, new o(context2));
        Context context3 = adWidget.getContext();
        AbstractC3340k.d(context3, "adWidget.context");
        this.f33555q = Fe.c.y(enumC2526j, new p(context3));
        Context context4 = adWidget.getContext();
        AbstractC3340k.d(context4, "adWidget.context");
        this.f33556r = Fe.c.y(enumC2526j, new q(context4));
        this.f33559u = Fe.c.z(m.f33534a);
        this.f33560v = Fe.c.z(new g(this));
        this.f33562x = Fe.c.z(new d(this));
    }

    public static final void e(r this$0) {
        AbstractC3340k.e(this$0, "this$0");
        String strB = this$0.f33542c.b();
        List list = null;
        com.vungle.ads.internal.network.m mVarA = ((VungleApiClient) this$0.f33553o.getValue()).a(new p1(list, this$0.f33551m, this$0.f33541b.e(), strB, this$0.f33552n, (c1) null, 67));
        if (mVarA != null) {
            mVarA.a(new j(this$0));
            return;
        }
        boolean z2 = com.vungle.ads.internal.util.u.f33874a;
        com.vungle.ads.internal.util.t.b("MRAIDPresenter", "Invalid ri call.");
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Error RI API for placement: ");
        sbA.append(this$0.f33542c.b());
        new NetworkUnreachable(sbA.toString()).setLogEntry$vungle_ads_release(this$0.b()).logErrorNoReturnValue$vungle_ads_release();
    }

    public final com.vungle.ads.internal.network.r c() {
        return (com.vungle.ads.internal.network.r) this.f33556r.getValue();
    }

    public final void d() {
        if (this.f33561w) {
            this.f33540a.a("javascript:window.vungle.mraidBridgeExt.requestMRAIDClose()");
        }
    }

    public final void f() {
        this.f33543d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.presenter.r.g():void");
    }

    public final void h() {
        Long l10 = this.f33551m;
        if (l10 != null) {
            List listB = this.f33541b.b("ad.close", String.valueOf(System.currentTimeMillis() - l10.longValue()), String.valueOf(((com.vungle.ads.internal.platform.c) this.f33546g).k()));
            if (listB != null) {
                Iterator it = listB.iterator();
                while (it.hasNext()) {
                    com.vungle.ads.internal.network.p pVar = new com.vungle.ads.internal.network.p((String) it.next());
                    pVar.f33431i = "ad.close";
                    pVar.f33432j = b();
                    c().a(pVar.a(), false);
                }
            }
        }
    }

    public static final void c(r this$0) {
        AbstractC3340k.e(this$0, "this$0");
        this$0.h();
    }

    public final void a(a aVar) {
        this.f33548i = aVar;
    }

    public final com.vungle.ads.internal.util.s b() {
        return (com.vungle.ads.internal.util.s) this.f33560v.getValue();
    }

    public static final void d(r this$0) {
        AbstractC3340k.e(this$0, "this$0");
        this$0.f33561w = true;
    }

    public final void a(z zVar) {
        this.f33557s = zVar;
    }

    public final void a(com.vungle.ads.internal.ui.k kVar) {
        this.f33558t = kVar;
    }

    public final void a(int i5) {
        long j8;
        AdSession adSession;
        a aVar;
        boolean z2 = com.vungle.ads.internal.util.u.f33874a;
        com.vungle.ads.internal.util.t.a("MRAIDPresenter", "detach()");
        boolean z10 = (i5 & 1) != 0;
        boolean z11 = (i5 & 2) != 0;
        com.vungle.ads.internal.ui.z zVar = this.f33543d;
        zVar.f33825q = null;
        zVar.f33823o = null;
        if (!z10 && z11 && !this.k.getAndSet(true) && (aVar = this.f33548i) != null) {
            aVar.a("end", null, this.f33542c.f33227a);
        }
        com.vungle.ads.internal.omsdk.e eVar = this.f33545f;
        if (!eVar.f33470b || (adSession = eVar.f33471c) == null) {
            j8 = 0;
        } else {
            adSession.finish();
            j8 = com.vungle.ads.internal.omsdk.e.f33468d;
        }
        eVar.f33470b = false;
        eVar.f33471c = null;
        this.f33540a.a(j8);
    }

    public final void e() {
        a(new WebViewRenderProcessUnresponsive("fatal=true"), true, null);
    }

    public final void a(MotionEvent motionEvent) {
        if (motionEvent != null) {
            boolean z2 = com.vungle.ads.internal.util.u.f33874a;
            com.vungle.ads.internal.util.t.a("MRAIDPresenter", "user interaction");
            this.f33547h = System.currentTimeMillis();
            ((p0) this.f33562x.getValue()).a(motionEvent);
        }
    }

    public final void a() {
        if (com.vungle.ads.internal.util.y.a()) {
            this.f33544e.execute(new Hb.a(this, 1));
        } else {
            h();
        }
        com.vungle.ads.internal.util.y.a(new e(this));
    }

    public final void a(String str) throws Throwable {
        Handler handler = com.vungle.ads.internal.util.y.f33878a;
        com.vungle.ads.internal.util.y.a(new h(this));
        m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.INLINE_INSTALL_STATUS);
        m2Var.f33080c = 2L;
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        analyticsClient.a(m2Var, b(), str);
        analyticsClient.c(Sdk.SDKError.Reason.INLINE_INSTALL_ERROR, String.valueOf(str), b());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x023b, code lost:
    
        r13 = r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x023f, code lost:
    
        r0 = com.vungle.ads.internal.util.r.a("url", r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0247, code lost:
    
        if (com.vungle.ads.internal.util.n.a(r0) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0249, code lost:
    
        new com.vungle.ads.InvalidCTAUrl(ka.AbstractC3256n.f(')', "Invalid CTA Url (", r0)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0261, code lost:
    
        com.vungle.ads.internal.ConfigManager.INSTANCE.getClass();
        r2 = com.vungle.ads.internal.ConfigManager.f32903a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0268, code lost:
    
        if (r2 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x026a, code lost:
    
        r2 = r2.f33350q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x026c, code lost:
    
        if (r2 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x026e, code lost:
    
        r2 = r2.f33360a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0270, code lost:
    
        if (r2 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0272, code lost:
    
        r2 = r2.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0277, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0278, code lost:
    
        if (r2 == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x027f, code lost:
    
        if (r19.f33547h != 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0282, code lost:
    
        r2 = java.lang.System.currentTimeMillis() - r19.f33547h;
        r4 = com.vungle.ads.internal.ConfigManager.f32903a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x028b, code lost:
    
        if (r4 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x028d, code lost:
    
        r4 = r4.f33350q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x028f, code lost:
    
        if (r4 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0291, code lost:
    
        r4 = r4.f33361b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0293, code lost:
    
        if (r4 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0295, code lost:
    
        r7 = r4.longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x029a, code lost:
    
        r7 = Long.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02a1, code lost:
    
        if (r2 <= r7) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02a3, code lost:
    
        r18 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02a6, code lost:
    
        r18 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02a8, code lost:
    
        if (r18 == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02aa, code lost:
    
        r19.f33547h = 0;
        com.vungle.ads.internal.AnalyticsClient.a(com.vungle.ads.internal.AnalyticsClient.INSTANCE, new com.vungle.ads.internal.m2(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT), b(), 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02bf, code lost:
    
        r19.f33547h = 0;
        r2 = r19.f33540a.getContext();
        kotlin.jvm.internal.AbstractC3340k.d(r2, "adWidget.context");
        r0 = com.vungle.ads.internal.util.l.a(r13, r0, r2, b(), new com.vungle.ads.internal.presenter.f(r13, r19));
        r2 = r19.f33548i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02db, code lost:
    
        if (r2 == null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02dd, code lost:
    
        r2.a("open", "adClick", r19.f33542c.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e6, code lost:
    
        if (r0 == false) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02e8, code lost:
    
        r0 = r19.f33548i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02ea, code lost:
    
        if (r0 == null) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02ec, code lost:
    
        r0.a("open", "adLeftApplication", r19.f33542c.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0620, code lost:
    
        if (r20.equals(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_ACTION) == false) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0035, code lost:
    
        if (r20.equals("useCustomClose") == false) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x021b, code lost:
    
        if (r20.equals("open") == false) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0225, code lost:
    
        if (r20.equals("useCustomPrivacy") == false) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x022f, code lost:
    
        if (r20.equals("openNonMraid") == false) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0233, code lost:
    
        r0 = r19.f33541b.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0239, code lost:
    
        if (r0 == null) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:302:0x06af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.String r20, kotlinx.serialization.json.c r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.presenter.r.a(java.lang.String, kotlinx.serialization.json.c):boolean");
    }

    public final void a(boolean z2, String errorDesc) {
        AbstractC3340k.e(errorDesc, "errorDesc");
        if (z2) {
            WebViewError webViewError = new WebViewError(errorDesc);
            webViewError.setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
            a aVar = this.f33548i;
            if (aVar != null) {
                aVar.a(webViewError, this.f33542c.f33227a);
            }
            a();
        }
    }

    public final void a(VungleError vungleError, boolean z2, String str) {
        boolean z10 = com.vungle.ads.internal.util.u.f33874a;
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("handleWebViewException: ");
        sbA.append(vungleError.getLocalizedMessage());
        sbA.append(", fatal: ");
        sbA.append(z2);
        sbA.append(", errorMsg: ");
        sbA.append(str);
        com.vungle.ads.internal.util.t.b("MRAIDPresenter", sbA.toString());
        vungleError.setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
        if (z2) {
            a aVar = this.f33548i;
            if (aVar != null) {
                aVar.a(vungleError, this.f33542c.f33227a);
            }
            a();
        }
    }
}
