package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.Template;
import androidx.car.app.model.signin.SignInTemplate;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bh extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final SignInTemplate f21879a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(com.waze.car_lib.p.bh bhVar, CarContext carContext) {
        super(carContext, "QrCodeScreen");
        h.g.b.x.f(bhVar, "uiState");
        h.g.b.x.f(carContext, "carContext");
        this.f21879a = com.waze.l.m.l(bhVar);
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21879a;
    }
}
