package com.waze.car_lib.screens;

import androidx.autofill.HintConstants;
import androidx.car.app.CarContext;
import androidx.car.app.model.Template;
import androidx.car.app.model.signin.SignInTemplate;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.car_lib.f.jg;
import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ay extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final SignInTemplate f21811a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(String str, jg jgVar, CarContext carContext) {
        super(carContext, "PasswordLoginScreen");
        h.g.b.x.f(str, "userName");
        h.g.b.x.f(jgVar, "coordinatorController");
        h.g.b.x.f(carContext, "carContext");
        this.f21811a = dh.M();
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        com.waze.car_lib.r.ae aeVarA = ((com.waze.car_lib.r.cl) bVarL.a(new h.g.b.m(com.waze.car_lib.r.cl.class), null, null)).a(str, jgVar);
        ay ayVar = this;
        aeVarA.a(LifecycleOwnerKt.getLifecycleScope(ayVar)).observe(ayVar, new g(new com.waze.c.d.a(this, aeVarA, 17), 11, (boolean[][]) null));
    }

    static final h.ab b(ay ayVar, com.waze.car_lib.r.ae aeVar, String str) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_PASSWORD);
        ayVar.n().a(new com.waze.a.aa(aeVar, str, 17, null));
        return h.ab.f48028a;
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21811a;
    }
}
