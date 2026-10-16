package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.Template;
import com.waze.car_lib.f.il;
import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ai extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final MessageTemplate f21765a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(il ilVar, CarContext carContext) {
        super(carContext, "LoginSucceededScreen");
        h.g.b.x.f(ilVar, "coordinatorController");
        h.g.b.x.f(carContext, "carContext");
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        this.f21765a = dh.v(carContext, ((com.waze.car_lib.r.av) bVarL.a(new h.g.b.m(com.waze.car_lib.r.av.class), null, null)).e().b(), new q((Object) this, (Object) ilVar, 8), new o(9));
    }

    static final h.ab b(ai aiVar, il ilVar) {
        aiVar.n().a(new c((Object) ilVar, 9, (short[][]) null));
        return h.ab.f48028a;
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21765a;
    }
}
