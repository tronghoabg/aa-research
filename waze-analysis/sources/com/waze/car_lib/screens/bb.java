package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.Template;
import androidx.car.app.navigation.model.MapController;
import androidx.car.app.navigation.model.MapWithContentTemplate;
import com.waze.car_lib.f.dw;
import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bb extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final dw f21868a;

    /* renamed from: b, reason: collision with root package name */
    private final MapWithContentTemplate f21869b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(com.waze.car_lib.p.aj ajVar, CarContext carContext, dw dwVar) {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        super(carContext, "PopupMessageInMapWithContentScreen");
        h.g.b.x.f(ajVar, "uiState");
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(dwVar, "controller");
        this.f21868a = dwVar;
        MapWithContentTemplate.Builder builder = new MapWithContentTemplate.Builder();
        builder.setContentTemplate(dh.A());
        MapController.Builder builder2 = new MapController.Builder();
        ActionStrip.Builder builder3 = new ActionStrip.Builder();
        builder3.addAction(Action.PAN);
        builder2.setMapActionStrip(builder3.build());
        builder.setMapController(builder2.build());
        MapWithContentTemplate mapWithContentTemplateBuild = builder.build();
        h.g.b.x.e(mapWithContentTemplateBuild, "build(...)");
        this.f21869b = mapWithContentTemplateBuild;
        bb bbVar = this;
        if (bbVar instanceof org.a.d.a.b) {
            bVarC = bbVar.l();
            int i2 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(com.waze.map.b.n.class);
        } else {
            bVarC = bbVar.getKoin().a().c();
            int i3 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(com.waze.map.b.n.class);
        }
        com.waze.map.b.n nVar = (com.waze.map.b.n) bVarC.a(mVar, null, null);
        com.waze.car_lib.r.aw awVar = (com.waze.car_lib.r.aw) l().a(new h.g.b.m(com.waze.car_lib.r.aw.class), null, null);
        awVar.a().observe(this, new g(new az(this, carContext, ajVar, awVar, nVar, 0), 12, (float[][]) null));
    }

    static final h.ab b(bb bbVar, com.waze.car_lib.p.aj ajVar) {
        bbVar.n().a(new as(ajVar, bbVar, 7));
        return h.ab.f48028a;
    }

    static final h.ab c(com.waze.car_lib.p.aj ajVar, bb bbVar) {
        ajVar.b().invoke();
        bbVar.h(ajVar.c());
        return h.ab.f48028a;
    }

    static final h.ab d(bb bbVar, com.waze.car_lib.p.aj ajVar) {
        bbVar.n().a(new as(ajVar, bbVar, 8));
        return h.ab.f48028a;
    }

    static final h.ab e(com.waze.car_lib.p.aj ajVar, bb bbVar) {
        ajVar.d().invoke();
        bbVar.h(ajVar.c());
        return h.ab.f48028a;
    }

    static final h.ab f(bb bbVar, com.waze.car_lib.p.aj ajVar) {
        bbVar.h(ajVar.c());
        return h.ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(h.g.a.a aVar) {
        aVar.invoke();
        this.f21868a.b();
        finish();
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21869b;
    }
}
