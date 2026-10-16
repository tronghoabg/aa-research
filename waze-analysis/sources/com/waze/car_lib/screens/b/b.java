package com.waze.car_lib.screens.b;

import androidx.car.app.CarContext;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.Header;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.Template;
import androidx.car.app.navigation.model.MapWithContentTemplate;
import androidx.core.content.ContextCompat;
import com.waze.R;
import com.waze.car_lib.f.jb;
import com.waze.car_lib.p.dh;
import h.g.b.ar;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final MapWithContentTemplate f21825a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f21826b;

    /* renamed from: c, reason: collision with root package name */
    private final int f21827c;

    /* renamed from: d, reason: collision with root package name */
    private final String f21828d;

    /* renamed from: e, reason: collision with root package name */
    private final String f21829e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CarContext carContext, jb jbVar, h.g.a.a aVar) {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        String strC;
        String strC2;
        super(carContext, "TripOverviewErrorScreen");
        x.f(carContext, "carContext");
        x.f(jbVar, "errorType");
        x.f(aVar, "onConfirmAction");
        this.f21825a = dh.z();
        b bVar = this;
        if (bVar instanceof org.a.d.a.b) {
            bVarC = bVar.l();
            int i2 = ar.f48106a;
            mVar = new h.g.b.m(com.waze.shared_infra.o.a.class);
        } else {
            bVarC = bVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new h.g.b.m(com.waze.shared_infra.o.a.class);
        }
        com.waze.shared_infra.o.a aVar2 = (com.waze.shared_infra.o.a) bVarC.a(mVar, null, null);
        this.f21826b = aVar2;
        int color = ContextCompat.getColor(carContext, R.color.primary);
        this.f21827c = color;
        jb jbVar2 = jb.f19737a;
        int iOrdinal = jbVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            strC = aVar2.c(R.string.AAOS_TRIP_OVERVIEW_GENERIC_ERROR_TITLE, new Object[0]);
        } else {
            if (iOrdinal != 2) {
                throw new h.i();
            }
            strC = aVar2.c(R.string.AAOS_TRIP_OVERVIEW_SERVER_ERROR_TITLE, new Object[0]);
        }
        this.f21828d = strC;
        int iOrdinal2 = jbVar.ordinal();
        if (iOrdinal2 == 0 || iOrdinal2 == 1) {
            strC2 = aVar2.c(R.string.AAOS_TRIP_OVERVIEW_GENERIC_ERROR_MESSAGE, new Object[0]);
        } else {
            if (iOrdinal2 != 2) {
                throw new h.i();
            }
            strC2 = aVar2.c(R.string.AAOS_TRIP_OVERVIEW_SERVER_ERROR_MESSAGE, new Object[0]);
        }
        this.f21829e = strC2;
        MapWithContentTemplate.Builder builder = new MapWithContentTemplate.Builder();
        MessageTemplate.Builder builder2 = new MessageTemplate.Builder(strC2);
        Header.Builder builder3 = new Header.Builder();
        builder3.setTitle(strC);
        builder2.setHeader(builder3.build());
        Action.Builder builder4 = new Action.Builder();
        builder4.setFlags(1);
        builder4.setBackgroundColor(CarColor.createCustom(color, color));
        builder4.setTitle(com.waze.sharedui.utils.o.a(aVar2, new com.waze.ui.ac.j(R.string.AAOS_TRIP_OVERVIEW_ERROR_SCREEN_BUTTON)));
        builder4.setOnClickListener(new a(aVar, 0));
        builder2.addAction(builder4.build());
        builder.setContentTemplate(builder2.build());
        MapWithContentTemplate mapWithContentTemplateBuild = builder.build();
        x.e(mapWithContentTemplateBuild, "build(...)");
        q(mapWithContentTemplateBuild);
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21825a;
    }
}
