package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.Template;
import androidx.car.app.navigation.model.MapTemplate;
import com.waze.car_lib.p.dh;
import com.waze.car_lib.r.dr;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cf extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final MapTemplate f21927a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf(CarContext carContext, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.l lVar) {
        super(carContext, "RouteSelectionNavigationSettingsScreen");
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(aVar, "onNavigationSettingsClosed");
        h.g.b.x.f(aVar2, "onNavigationSettingsBackClicked");
        this.f21927a = dh.y();
        addBackPressedCallback(aVar2);
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        getLifecycle().addObserver(new ce(this, carContext, (dr) bVarL.a(new h.g.b.m(dr.class), null, null), lVar, aVar));
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21927a;
    }
}
