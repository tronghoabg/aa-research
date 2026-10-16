package com.waze.nav_connect.b;

import android.content.Context;
import com.waze.bs;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class af implements com.waze.ui.r.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.nav_connect.a.f f30775a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.app_nav.hub.b.c f30776b;

    /* renamed from: c, reason: collision with root package name */
    private final bs f30777c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.uid.d.s f30778d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.nav_connect.c.b f30779e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f30780f;

    /* renamed from: g, reason: collision with root package name */
    private final kotlinx.coroutines.af f30781g;

    /* renamed from: h, reason: collision with root package name */
    private final bn f30782h;

    /* renamed from: i, reason: collision with root package name */
    private com.waze.app_nav.hub.b.k f30783i;

    /* renamed from: j, reason: collision with root package name */
    private final AtomicReference f30784j;

    public af(com.waze.nav_connect.a.f fVar, com.waze.nav_connect.a aVar, com.waze.app_nav.hub.b.c cVar, bs bsVar, com.waze.uid.d.s sVar, com.waze.nav_connect.c.b bVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(fVar, "navConnectRepository");
        h.g.b.x.f(aVar, "config");
        h.g.b.x.f(cVar, "popupManager");
        h.g.b.x.f(bsVar, "externalWebBrowserLauncher");
        h.g.b.x.f(sVar, "webViewFactory");
        h.g.b.x.f(bVar, "statsSender");
        h.g.b.x.f(eVar, "logger");
        this.f30775a = fVar;
        this.f30776b = cVar;
        this.f30777c = bsVar;
        this.f30778d = sVar;
        this.f30779e = bVar;
        this.f30780f = eVar;
        kotlinx.coroutines.af afVarP = com.waze.ui.a.l.p(this, "NavConnectConsentStateHolder");
        this.f30781g = afVarP;
        bn bnVarB = ck.b(null);
        this.f30782h = bnVarB;
        ai.U(bnVarB);
        this.f30784j = new AtomicReference(null);
        aj.z(afVarP, null, null, new ac(this, (h.c.e) null, 0), 3);
        aj.z(afVarP, null, null, new ac(this, null, 2, null), 3);
    }

    public static /* synthetic */ h.ab c(y yVar, af afVar, Context context) {
        com.waze.nav_connect.a.d dVarA = yVar.a();
        if (dVarA != null) {
            afVar.f30779e.b(yVar, com.waze.nav_connect.c.a.f30859b);
            afVar.f30777c.a(context, dVarA.b());
        }
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab d(af afVar, y yVar) {
        afVar.f30775a.c(false, yVar.c());
        afVar.n(a.f30754b);
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab e(af afVar, y yVar, Context context) {
        afVar.f30779e.b(yVar, com.waze.nav_connect.c.a.f30860c);
        context.startActivity(afVar.f30778d.a(context, new com.waze.uid.d.r(null, true), yVar.d()));
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab f(af afVar, y yVar, Context context) {
        afVar.f30779e.b(yVar, com.waze.nav_connect.c.a.f30858a);
        afVar.f30777c.a(context, yVar.e());
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab g(af afVar, y yVar) {
        afVar.f30775a.c(true, yVar.c());
        afVar.n(a.f30753a);
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab h(af afVar, y yVar) {
        AtomicReference atomicReference = afVar.f30784j;
        a.a.g(atomicReference, a.f30755c);
        afVar.f30779e.a(yVar, (a) atomicReference.get());
        Object obj = atomicReference.get();
        Objects.toString(obj);
        afVar.f30780f.a("Dialog dismissed with reason=".concat(String.valueOf(obj)));
        afVar.f30783i = null;
        return h.ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(y yVar) {
        com.waze.app_nav.hub.b.k kVar = this.f30783i;
        if (kVar != null) {
            this.f30780f.g("Skipping launch dialog since one is already open. state=" + yVar + ", currentPopupModel=" + kVar);
            return;
        }
        com.waze.ads.c cVar = new com.waze.ads.c((Object) new ae(this, yVar), (Object) yVar, (Object) this, 13, (byte[]) null);
        this.f30784j.set(null);
        com.waze.app_nav.hub.b.k kVar2 = new com.waze.app_nav.hub.b.k("NavConnectConsentDialog", null, new ag(cVar), 6);
        this.f30776b.b(kVar2);
        this.f30783i = kVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(a aVar) {
        com.waze.app_nav.hub.b.k kVar = this.f30783i;
        if (kVar != null) {
            a.a.g(this.f30784j, aVar);
            this.f30776b.c(kVar);
        }
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        n(a.f30756d);
        aj.h(this.f30781g, null);
    }

    public final void l() {
        y yVar = (y) this.f30782h.d();
        if (yVar != null) {
            if (!yVar.g()) {
                m(yVar);
                return;
            }
            com.waze.shared_infra.i.e eVar = this.f30780f;
            Objects.toString(yVar);
            eVar.g("Skipping launchMidSessionConsentDialog because state is currently ".concat(yVar.toString()));
        }
    }
}
