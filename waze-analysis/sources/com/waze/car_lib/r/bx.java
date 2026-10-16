package com.waze.car_lib.r;

import androidx.car.app.CarContext;
import com.waze.AlerterController$Alerter$Type;
import com.waze.R;
import com.waze.settings.gu;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bx extends h.c.b.a.g implements h.g.a.t {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21098a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f21099b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f21100c;

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f21101d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f21102e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h.g.b.aq f21103f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ by f21104g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ CarContext f21105h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ com.waze.car_lib.j.x f21106i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ com.waze.car_lib.f.ej f21107j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bx(h.g.b.aq aqVar, by byVar, CarContext carContext, com.waze.car_lib.j.x xVar, com.waze.car_lib.f.ej ejVar, h.c.e eVar) {
        super(6, eVar);
        this.f21103f = aqVar;
        this.f21104g = byVar;
        this.f21105h = carContext;
        this.f21106i = xVar;
        this.f21107j = ejVar;
    }

    @Override // h.g.a.t
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        bx bxVar = new bx(this.f21103f, this.f21104g, this.f21105h, this.f21106i, this.f21107j, (h.c.e) obj6);
        bxVar.f21098a = (cg) obj;
        bxVar.f21099b = (h.k) obj2;
        bxVar.f21100c = (com.waze.map.canvas.bj) obj3;
        bxVar.f21101d = (com.waze.car_lib.b.r) obj4;
        bxVar.f21102e = (h.p) obj5;
        return bxVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        cg cgVar = (cg) this.f21098a;
        h.k kVar = (h.k) this.f21099b;
        com.waze.map.canvas.bj bjVar = (com.waze.map.canvas.bj) this.f21100c;
        com.waze.car_lib.b.r rVar = (com.waze.car_lib.b.r) this.f21101d;
        h.p pVar = (h.p) this.f21102e;
        com.waze.sound.bp bpVar = (com.waze.sound.bp) kVar.a();
        boolean zBooleanValue = ((Boolean) pVar.a()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) pVar.b()).booleanValue();
        com.waze.navigate.ec ecVar = (com.waze.navigate.ec) pVar.c();
        fb fbVarC = cgVar.c();
        if (fbVarC != null) {
            h.g.b.aq aqVar = this.f21103f;
            com.waze.car_lib.j.x xVar = this.f21106i;
            com.waze.car_lib.f.ej ejVar = this.f21107j;
            if (!h.g.b.x.n(fbVarC.c(), aqVar.f48105a) && xVar.a()) {
                ejVar.t();
            }
        }
        h.g.b.aq aqVar2 = this.f21103f;
        fb fbVarC2 = cgVar.c();
        aqVar2.f48105a = fbVarC2 != null ? fbVarC2.c() : null;
        by byVar = this.f21104g;
        String strC = byVar.f21118k.c(R.string.AAOS_ETA_BAR_STOP_POINT, new Object[0]);
        if (true != cgVar.e()) {
            strC = null;
        }
        return new com.waze.car_lib.p.an(gu.c(bpVar).b(), !zBooleanValue2, cgVar.a(), cgVar.b(), !h.a.i.ax(h.a.i.i(com.waze.map.canvas.bj.f28601c, com.waze.map.canvas.bj.f28602d), bjVar), !cgVar.e(), (rVar != null ? rVar.b() : null) != AlerterController$Alerter$Type.REROUTE, zBooleanValue, by.e(byVar, cgVar.a(), cgVar.c(), strC != null ? com.waze.shared_infra.l.b.d(strC) : null, this.f21105h, ecVar), byVar.q.d());
    }
}
