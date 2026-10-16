package com.waze.car_lib.a;

import androidx.car.app.CarContext;
import androidx.car.app.model.Action;
import androidx.car.app.model.Header;
import androidx.car.app.model.Pane;
import androidx.car.app.model.PaneTemplate;
import androidx.car.app.model.Row;
import androidx.car.app.model.Template;
import androidx.car.app.navigation.model.MapController;
import androidx.car.app.navigation.model.MapWithContentTemplate;
import com.waze.R;
import com.waze.car_lib.p.dh;
import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final MapWithContentTemplate f18828a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CarContext carContext) {
        super(carContext, "AdInfo");
        h.g.b.x.f(carContext, "carContext");
        this.f18828a = dh.H();
        org.a.d.k.b bVarL = l();
        int i2 = ar.f48106a;
        com.waze.shared_infra.o.a aVar = (com.waze.shared_infra.o.a) bVarL.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
        a aVar2 = new a(this, 0);
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(aVar2, "onOkClicked");
        Row.Builder builder = new Row.Builder();
        builder.setTitle(aVar.c(R.string.GOOGLE_ADS_AD_PIN_IN_CAR_MANAGE_PREFERENCES, new Object[0]));
        builder.addText(aVar.c(R.string.GOOGLE_ADS_AD_PIN_IN_CAR_MANAGE_PREFERENCES_DESCRIPTION, new Object[0]));
        Row rowBuild = builder.build();
        Pane.Builder builder2 = new Pane.Builder();
        builder2.addRow(rowBuild);
        Action.Builder builder3 = new Action.Builder();
        builder3.setTitle(aVar.c(R.string.GOOGLE_ADS_AD_PIN_IN_CAR_INFO_OK, new Object[0]));
        builder3.setOnClickListener(new com.waze.car_lib.screens.b.a(aVar2, 1));
        builder2.addAction(builder3.build());
        PaneTemplate.Builder builder4 = new PaneTemplate.Builder(builder2.build());
        Header.Builder builder5 = new Header.Builder();
        builder5.setTitle(aVar.c(R.string.GOOGLE_ADS_AD_PIN_IN_CAR_INFO_TITLE, new Object[0]));
        builder5.setStartHeaderAction(Action.BACK);
        builder4.setHeader(builder5.build());
        PaneTemplate paneTemplateBuild = builder4.build();
        MapWithContentTemplate.Builder builder6 = new MapWithContentTemplate.Builder();
        builder6.setContentTemplate(paneTemplateBuild);
        builder6.setMapController(new MapController.Builder().build());
        MapWithContentTemplate mapWithContentTemplateBuild = builder6.build();
        h.g.b.x.e(mapWithContentTemplateBuild, "build(...)");
        q(mapWithContentTemplateBuild);
    }

    static final h.ab b(b bVar) {
        bVar.n().a(new com.waze.ads.b(bVar, 17));
        return h.ab.f48028a;
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f18828a;
    }
}
