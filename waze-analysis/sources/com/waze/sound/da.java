package com.waze.sound;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class da extends h.c.b.a.g implements h.g.a.r {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f39736a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f39737b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f39738c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f39739d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f39740e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    da(bt btVar, h.c.e eVar, int i2) {
        super(4, eVar);
        this.f39740e = i2;
        this.f39739d = btVar;
    }

    @Override // h.g.a.r
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        if (this.f39740e != 0) {
            da daVar = new da((bt) this.f39739d, (h.c.e) obj4, 1);
            daVar.f39736a = (String) obj;
            daVar.f39737b = (String) obj2;
            daVar.f39738c = (String) obj3;
            return daVar.invokeSuspend(h.ab.f48028a);
        }
        da daVar2 = new da((dd) this.f39739d, (h.c.e) obj4, 0);
        daVar2.f39736a = (com.waze.modules.c.eb) obj;
        daVar2.f39737b = (com.waze.av.b.n) obj2;
        daVar2.f39738c = (com.waze.navigate.em) obj3;
        return daVar2.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f39740e == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            com.waze.modules.c.eb ebVar = (com.waze.modules.c.eb) this.f39736a;
            com.waze.av.b.n nVar = (com.waze.av.b.n) this.f39737b;
            com.waze.navigate.em emVar = (com.waze.navigate.em) this.f39738c;
            ((dd) this.f39739d).f39750b.a("Before debounce. Received: Route: " + ebVar + ", destination: " + nVar + ". Navigation state: " + emVar);
            return new h.p(ebVar, nVar, emVar);
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        String str = (String) this.f39736a;
        String str2 = (String) this.f39737b;
        String str3 = (String) this.f39738c;
        List listI = bt.i(str2);
        bt btVar = (bt) this.f39739d;
        btVar.f39569d.e(listI);
        bp bpVar = bp.f39554a;
        bp bpVarE = com.waze.sharedui.api.i.e(str);
        if (bpVarE != null && listI.contains(bpVarE)) {
            btVar.f39567b.a("Available Modes: " + listI + " Selected mode: " + bpVarE);
            return bpVarE;
        }
        btVar.f39567b.e(bpVarE + " is either null or not available in " + listI);
        bp bpVarE2 = com.waze.sharedui.api.i.e(str3);
        if (bpVarE2 == null || !listI.contains(bpVarE2)) {
            btVar.f39567b.g("Available Modes: " + listI + " Default mode is not available. If none available, defaulting to ON.");
            bp bpVar2 = (bp) h.a.i.R(listI);
            return bpVar2 == null ? bp.f39554a : bpVar2;
        }
        btVar.f39567b.a("Available Modes: " + listI + " Selected mode (default): " + bpVarE2);
        return bpVarE2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    da(dd ddVar, h.c.e eVar, int i2) {
        super(4, eVar);
        this.f39740e = i2;
        this.f39739d = ddVar;
    }
}
