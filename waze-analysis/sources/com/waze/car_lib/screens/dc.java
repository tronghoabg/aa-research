package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.Template;
import androidx.car.app.model.signin.SignInTemplate;
import com.waze.car_lib.f.jg;
import com.waze.car_lib.p.dh;
import com.waze.car_lib.r.fi;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dc extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final SignInTemplate f21996a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc(jg jgVar, CarContext carContext) {
        super(carContext, "UsernameLoginScreen");
        h.g.b.x.f(jgVar, "coordinatorController");
        h.g.b.x.f(carContext, "carContext");
        this.f21996a = dh.M();
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        com.waze.car_lib.r.a aVarA = ((fi) bVarL.a(new h.g.b.m(fi.class), null, null)).a(jgVar);
        aVarA.a().observe(this, new g(new com.waze.c.d.a(this, aVarA, 20), 16, (int[][][]) null));
    }

    static final h.ab b(dc dcVar, com.waze.car_lib.r.a aVar, String str) {
        h.g.b.x.f(str, "userName");
        dcVar.n().a(new com.waze.app_nav.hub.n(aVar, str, 9));
        return h.ab.f48028a;
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21996a;
    }
}
