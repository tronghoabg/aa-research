package com.waze.l;

import h.g.b.x;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class v implements com.waze.ui.r.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f25126a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.a f25127b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.l f25128c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.a f25129d;

    /* renamed from: e, reason: collision with root package name */
    private final h.g.a.l f25130e;

    /* renamed from: f, reason: collision with root package name */
    private final h.g.a.a f25131f;

    /* renamed from: g, reason: collision with root package name */
    private final h.g.a.p f25132g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f25133h;

    /* renamed from: i, reason: collision with root package name */
    private final bn f25134i;

    /* renamed from: j, reason: collision with root package name */
    private final ch f25135j;

    /* renamed from: k, reason: collision with root package name */
    private final bn f25136k;

    /* renamed from: l, reason: collision with root package name */
    private final ch f25137l;

    public v(h.g.a.a aVar, h.g.a.a aVar2, h.g.a.l lVar, h.g.a.a aVar3, h.g.a.l lVar2, h.g.a.a aVar4, h.g.a.p pVar, com.waze.shared_infra.i.e eVar) {
        x.f(aVar, "isOptedOut");
        x.f(aVar2, "shouldTurnOnBluetooth");
        x.f(lVar, "onSetOptedOut");
        x.f(aVar3, "onPermissionsRequested");
        x.f(lVar2, "onPermissionsResponded");
        x.f(aVar4, "onPopupShown");
        x.f(pVar, "onPopupClicked");
        x.f(eVar, "logger");
        this.f25126a = aVar;
        this.f25127b = aVar2;
        this.f25128c = lVar;
        this.f25129d = aVar3;
        this.f25130e = lVar2;
        this.f25131f = aVar4;
        this.f25132g = pVar;
        this.f25133h = eVar;
        bn bnVarB = ck.b(null);
        this.f25134i = bnVarB;
        this.f25135j = ai.U(bnVarB);
        bn bnVarB2 = ck.b(null);
        this.f25136k = bnVarB2;
        this.f25137l = ai.U(bnVarB2);
    }

    private final void r() {
        this.f25134i.e(null);
        this.f25136k.e(b.f25081a);
    }

    public final ch a() {
        return this.f25137l;
    }

    public final ch b() {
        return this.f25135j;
    }

    public final void c(boolean z) {
        this.f25130e.invoke(true);
        if (z || !((Boolean) this.f25127b.invoke()).booleanValue()) {
            r();
        } else {
            this.f25134i.e(p.f25114a);
        }
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }

    public final void d() {
        this.f25130e.invoke(false);
        this.f25134i.e(n.f25112a);
    }

    public final void e() {
        this.f25134i.e(null);
        this.f25136k.e(d.f25083a);
    }

    public final void f() {
        r();
    }

    public final void g() {
        this.f25136k.e(null);
    }

    public final void h() {
        this.f25134i.e(null);
        this.f25136k.e(c.f25082a);
    }

    public final void i() {
        r();
    }

    public final void j(com.waze.design_components.c.b bVar, boolean z) {
        r rVar;
        x.f(bVar, "dismissCause");
        com.waze.design_components.c.b bVar2 = com.waze.design_components.c.b.f23377a;
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 0) {
            rVar = r.f25115a;
        } else if (iOrdinal == 1) {
            rVar = r.f25116b;
        } else {
            if (iOrdinal != 2) {
                throw new h.i();
            }
            rVar = r.f25117c;
        }
        this.f25132g.invoke(rVar, Boolean.valueOf(z));
    }

    public final void k() {
        this.f25131f.invoke();
    }

    public final void l() {
        r();
    }

    public final void m() {
        this.f25133h.a("User opting out. Setting opt out to true");
        this.f25128c.invoke(true);
    }

    public final void n() {
        this.f25129d.invoke();
    }

    public final void o(boolean z, boolean z2) {
        if (((Boolean) this.f25126a.invoke()).booleanValue()) {
            this.f25133h.a("Not attempting to connect to bluetooth because user opted out.");
            r();
        } else if (z) {
            this.f25134i.e(o.f25113a);
        } else if (z2 || !((Boolean) this.f25127b.invoke()).booleanValue()) {
            r();
        } else {
            this.f25134i.e(p.f25114a);
        }
    }

    public final void p() {
        this.f25134i.e(null);
        this.f25136k.e(e.f25084a);
    }

    public final void q() {
        r();
    }
}
