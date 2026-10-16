package com.waze.car_lib.r;

import com.waze.R;
import com.waze.car_lib.f.jl;
import com.waze.car_lib.f.jm;
import com.waze.car_lib.f.jp;
import com.waze.car_lib.f.jq;
import com.waze.car_lib.f.jr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fp {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.main_screen.af.a.i f21655a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f21656b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.car_lib.b.b.a f21657c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.asks.x f21658d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f21659e;

    /* renamed from: f, reason: collision with root package name */
    private kotlinx.coroutines.br f21660f;

    public fp(com.waze.main_screen.af.a.i iVar, com.waze.shared_infra.o.a aVar, com.waze.car_lib.b.b.a aVar2, com.waze.asks.x xVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(iVar, "controller");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(aVar2, "transformReportSubTypeToUiDataUseCase");
        h.g.b.x.f(xVar, "wazeAsksConfig");
        h.g.b.x.f(eVar, "logger");
        this.f21655a = iVar;
        this.f21656b = aVar;
        this.f21657c = aVar2;
        this.f21658d = xVar;
        this.f21659e = eVar;
    }

    public static final /* synthetic */ void d(fp fpVar, com.waze.asks.as asVar, jl jlVar) {
        fpVar.f21655a.g(asVar);
        jlVar.H(new jm(new jr(jq.f19764b)));
        kotlinx.coroutines.br brVar = fpVar.f21660f;
        if (brVar != null) {
            brVar.s(null);
        }
    }

    static final h.ab g(fp fpVar) {
        fpVar.f21660f = null;
        return h.ab.f48028a;
    }

    public final fm b(kotlinx.coroutines.af afVar, com.waze.asks.as asVar, jl jlVar) {
        h.k kVar;
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(asVar, "question");
        h.g.b.x.f(jlVar, "coordinatorController");
        boolean zD = this.f21658d.d();
        int i2 = 0;
        com.waze.shared_infra.o.a aVar = this.f21656b;
        String strC = aVar.c(R.string.WAZE_ASKS_ENRICH_ALERT_TITLE_WHAT_DO_YOU_SEE, new Object[0]);
        List listH = asVar.h();
        ArrayList arrayList = new ArrayList();
        Iterator it = listH.iterator();
        while (true) {
            com.waze.car_lib.p.t tVar = null;
            if (!it.hasNext()) {
                com.waze.car_lib.p.cy cyVar = new com.waze.car_lib.p.cy(strC, true, false, h.a.i.ao(arrayList));
                this.f21655a.j(asVar);
                kotlinx.coroutines.br brVarZ = kotlinx.coroutines.aj.z(afVar, new fn(CoroutineExceptionHandler.f51269c, this), null, new fo(this, asVar, jlVar, null), 2);
                this.f21660f = brVarZ;
                if (brVarZ != null) {
                    brVarZ.bY(new fl(this, i2));
                }
                return new fm(cyVar, zD);
            }
            com.waze.asks.d dVar = (com.waze.asks.d) it.next();
            if (dVar instanceof com.waze.asks.b) {
                com.waze.car_lib.b.a.b bVarA = this.f21657c.a(((com.waze.asks.b) dVar).b());
                kVar = new h.k(bVarA != null ? bVarA.d() : null, bVarA != null ? Integer.valueOf(bVarA.a()) : null);
            } else if (dVar instanceof com.waze.asks.c) {
                kVar = new h.k(aVar.c(R.string.WAZE_ASKS_NOT_THERE, new Object[0]), Integer.valueOf(R.drawable.icon_report_not_there));
            } else {
                if (!(dVar instanceof com.waze.asks.a)) {
                    throw new h.i();
                }
                com.waze.car_lib.b.a.b bVarA2 = this.f21657c.a(((com.waze.asks.a) dVar).b());
                kVar = new h.k(bVarA2 != null ? bVarA2.d() : null, bVarA2 != null ? Integer.valueOf(bVarA2.a()) : null);
            }
            String str = (String) kVar.a();
            Integer num = (Integer) kVar.b();
            if (str != null && num != null) {
                tVar = new com.waze.car_lib.p.t(str, num.intValue(), dVar.c(), 8);
            }
            if (tVar != null) {
                arrayList.add(tVar);
            }
        }
    }

    public final void e(com.waze.asks.as asVar, com.waze.asks.d dVar, jl jlVar) {
        h.g.b.x.f(asVar, "question");
        h.g.b.x.f(dVar, "answer");
        h.g.b.x.f(jlVar, "coordinatorController");
        this.f21659e.a("received " + dVar + " for " + asVar);
        this.f21655a.i(asVar, dVar);
        jlVar.H(new jm(jp.f19762a));
        kotlinx.coroutines.br brVar = this.f21660f;
        if (brVar != null) {
            brVar.s(null);
        }
    }

    public final void f(com.waze.asks.as asVar, jl jlVar) {
        h.g.b.x.f(asVar, "question");
        h.g.b.x.f(jlVar, "coordinatorController");
        this.f21655a.h(asVar);
        jlVar.H(new jm(new jr(jq.f19763a)));
    }
}
