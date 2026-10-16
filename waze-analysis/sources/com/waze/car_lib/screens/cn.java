package com.waze.car_lib.screens;

import androidx.car.app.CarContext;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public abstract class cn extends com.waze.car_lib.screens.core.n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn(CarContext carContext, String str, com.waze.settings.tree.f fVar, com.waze.car_lib.c.n nVar) {
        super(carContext, str);
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(str, "screenName");
        h.g.b.x.f(nVar, "analyticsSender");
        if (fVar != null) {
            nVar.b(fVar);
            addBackPressedCallback(new com.waze.app_nav.hub.n(nVar, fVar, 3));
        }
    }
}
