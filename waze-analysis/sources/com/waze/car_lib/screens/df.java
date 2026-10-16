package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.Template;
import androidx.car.app.navigation.model.MapWithContentTemplate;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.car_lib.f.gh;
import com.waze.car_lib.f.jl;
import com.waze.car_lib.p.dh;
import com.waze.car_lib.r.fm;
import com.waze.car_lib.r.fp;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class df extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final jl f22003a;

    /* renamed from: b, reason: collision with root package name */
    private final CarContext f22004b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.asks.as f22005c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f22006d;

    /* renamed from: e, reason: collision with root package name */
    private final MapWithContentTemplate f22007e;

    /* renamed from: f, reason: collision with root package name */
    private final fp f22008f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df(jl jlVar, CarContext carContext, com.waze.asks.as asVar, com.waze.shared_infra.i.e eVar) {
        super(carContext, "WazeAsksInCarScreen");
        h.g.b.x.f(jlVar, "coordinatorController");
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(asVar, "question");
        h.g.b.x.f(eVar, "logger");
        this.f22003a = jlVar;
        this.f22004b = carContext;
        this.f22005c = asVar;
        this.f22006d = eVar;
        this.f22007e = dh.H();
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        fp fpVar = (fp) bVarL.a(new h.g.b.m(fp.class), null, null);
        this.f22008f = fpVar;
        fm fmVarB = fpVar.b(LifecycleOwnerKt.getLifecycleScope(this), asVar, jlVar);
        q(fmVarB.a() ? gh.c(fmVarB.b(), carContext, new bm((com.waze.car_lib.screens.core.n) this, 11), new am(this, 5)) : gh.d(fmVarB.b(), carContext, new bm((com.waze.car_lib.screens.core.n) this, 10), new am(this, 4)));
    }

    public static /* synthetic */ h.ab b(df dfVar) {
        dfVar.f22008f.f(dfVar.f22005c, dfVar.f22003a);
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab c(df dfVar) {
        dfVar.f22008f.f(dfVar.f22005c, dfVar.f22003a);
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab d(df dfVar, com.waze.car_lib.p.t tVar) {
        com.waze.asks.as asVar = dfVar.f22005c;
        com.waze.asks.d dVarJ = j(asVar, tVar.b());
        if (dVarJ != null) {
            dfVar.f22008f.e(asVar, dVarJ, dfVar.f22003a);
        } else {
            dfVar.f22006d.b("answer clicked but id was not identified, answer id: ".concat(String.valueOf(tVar.b())));
        }
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab e(df dfVar, com.waze.car_lib.p.t tVar) {
        com.waze.asks.as asVar = dfVar.f22005c;
        com.waze.asks.d dVarJ = j(asVar, tVar.b());
        if (dVarJ != null) {
            dfVar.f22008f.e(asVar, dVarJ, dfVar.f22003a);
        } else {
            dfVar.f22006d.b("answer clicked but id was not identified, answer id: ".concat(String.valueOf(tVar.b())));
        }
        return h.ab.f48028a;
    }

    static final h.ab f(df dfVar) {
        dfVar.n().a(new com.waze.app_nav.a.a((Object) dfVar, 9));
        return h.ab.f48028a;
    }

    static final h.ab g(df dfVar, com.waze.car_lib.p.t tVar) {
        h.g.b.x.f(tVar, "listItem");
        dfVar.n().a(new com.waze.app_nav.hub.n(dfVar, tVar, 12));
        return h.ab.f48028a;
    }

    static final h.ab h(df dfVar) {
        dfVar.n().a(new com.waze.app_nav.a.a((Object) dfVar, 8));
        return h.ab.f48028a;
    }

    static final h.ab i(df dfVar, com.waze.car_lib.p.t tVar) {
        h.g.b.x.f(tVar, "listItem");
        dfVar.n().a(new com.waze.app_nav.hub.n(dfVar, tVar, 13));
        return h.ab.f48028a;
    }

    private static final com.waze.asks.d j(com.waze.asks.as asVar, String str) {
        Object next;
        Iterator it = asVar.h().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (h.g.b.x.n(((com.waze.asks.d) next).c(), str)) {
                break;
            }
        }
        return (com.waze.asks.d) next;
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f22007e;
    }
}
