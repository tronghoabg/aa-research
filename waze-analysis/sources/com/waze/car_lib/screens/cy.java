package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.SearchTemplate;
import androidx.car.app.model.Template;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.car_lib.f.gw;
import com.waze.car_lib.p.dh;
import com.waze.car_lib.r.ey;
import com.waze.car_lib.r.ez;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cy extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final gw f21988a;

    /* renamed from: b, reason: collision with root package name */
    private final ey f21989b;

    /* renamed from: c, reason: collision with root package name */
    private final SearchTemplate f21990c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy(CarContext carContext, gw gwVar, com.waze.car_lib.r.co coVar) {
        super(carContext, "TextSearchScreen");
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(gwVar, "coordinatorController");
        this.f21988a = gwVar;
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        ey eyVarA = ((ez) bVarL.a(new h.g.b.m(ez.class), null, null)).a(gwVar);
        this.f21989b = eyVarA;
        this.f21990c = dh.E();
        i(eyVarA.c());
        cy cyVar = this;
        kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(cyVar), null, null, new z(this, (h.c.e) null, 2), 3);
        addBackPressedCallback(new bm((com.waze.car_lib.screens.core.n) this, 8));
        getLifecycle().addObserver(new cv(this));
        if (coVar != null) {
            if (coVar instanceof cx) {
                cx cxVar = (cx) coVar;
                eyVarA.j(cxVar.b(), cxVar.a());
            } else {
                if (!h.g.b.x.n(coVar, cw.f21985a)) {
                    throw new h.i();
                }
                kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(cyVar), null, null, new z(this, (h.c.e) null, 4, (char[]) null), 3);
            }
        }
    }

    public static /* synthetic */ h.ab c(cy cyVar, String str) {
        cyVar.f21988a.h(str);
        cyVar.f21989b.j(str, null);
        return h.ab.f48028a;
    }

    static final h.ab d(cy cyVar) {
        cyVar.f21989b.b().c();
        return h.ab.f48028a;
    }

    static final h.ab e(cy cyVar, String str) {
        h.g.b.x.f(str, "searchTerm");
        cyVar.n().a(new com.waze.app_nav.hub.n(cyVar, str, 8));
        return h.ab.f48028a;
    }

    static final h.ab f(cy cyVar) {
        cyVar.n().a(new cc((Object) cyVar.f21988a, 5, (char[]) null));
        return h.ab.f48028a;
    }

    static final void h(cy cyVar) {
        cyVar.f21989b.b().f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(com.waze.car_lib.p.cw cwVar) {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        CarContext carContext = getCarContext();
        h.g.b.x.e(carContext, "getCarContext(...)");
        cy cyVar = this;
        if (cyVar instanceof org.a.d.a.b) {
            bVarC = cyVar.l();
            int i2 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(com.waze.shared_infra.o.a.class);
        } else {
            bVarC = cyVar.getKoin().a().c();
            int i3 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(com.waze.shared_infra.o.a.class);
        }
        q(dh.t(carContext, (com.waze.shared_infra.o.a) bVarC.a(mVar, null, null), cwVar, new ab((Object) this.f21989b, 9, (short[][]) null), new am(this, 3), new bm((com.waze.car_lib.screens.core.n) this, 7), new cu(this, 0)));
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21990c;
    }
}
