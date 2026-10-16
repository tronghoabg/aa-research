package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.Template;
import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ah extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final MessageTemplate f21764a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(CarContext carContext) {
        super(carContext, "LoginFromDeviceScreen");
        h.g.b.x.f(carContext, "carContext");
        this.f21764a = dh.A();
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        ((com.waze.car_lib.r.au) bVarL.a(new h.g.b.m(com.waze.car_lib.r.au.class), null, null)).a().observe(this, new g(new com.waze.c.d.a(this, carContext, 16, null), 5, (boolean[]) null));
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21764a;
    }
}
