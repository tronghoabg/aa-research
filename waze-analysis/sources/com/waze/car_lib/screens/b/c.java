package com.waze.car_lib.screens.b;

import androidx.car.app.CarContext;
import androidx.car.app.model.Action;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.ListTemplate;
import androidx.car.app.model.Row;
import androidx.car.app.model.Template;
import com.waze.car_lib.p.dh;
import h.g.b.ar;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final ListTemplate f21830a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CarContext carContext, boolean z, boolean z2) {
        super(carContext, "TripOverviewInfoScreen");
        x.f(carContext, "carContext");
        this.f21830a = dh.x();
        org.a.d.k.b bVarL = l();
        int i2 = ar.f48106a;
        com.waze.car_lib.r.d.c cVar = (com.waze.car_lib.r.d.c) bVarL.a(new h.g.b.m(com.waze.car_lib.r.d.c.class), null, null);
        addBackPressedCallback(new com.waze.app_nav.a.a(cVar, 14));
        ListTemplate.Builder builder = new ListTemplate.Builder();
        Header.Builder builder2 = new Header.Builder();
        builder2.setStartHeaderAction(Action.BACK);
        builder.setHeader(builder2.build());
        ItemList.Builder builder3 = new ItemList.Builder();
        for (com.waze.car_lib.r.d.a aVar : cVar.a(z, z2).a()) {
            Row.Builder builder4 = new Row.Builder();
            builder4.setTitle(aVar.b());
            builder4.addText(aVar.a());
            builder3.addItem(builder4.build());
        }
        builder.setSingleList(builder3.build());
        ListTemplate listTemplateBuild = builder.build();
        x.e(listTemplateBuild, "build(...)");
        q(listTemplateBuild);
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21830a;
    }
}
