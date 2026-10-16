package com.waze.car_lib.a;

import androidx.car.app.CarContext;
import androidx.car.app.model.Template;
import androidx.car.app.navigation.model.MapWithContentTemplate;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.car_lib.p.dh;
import h.g.b.ar;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class t extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final MapWithContentTemplate f18854a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(String str, CarContext carContext, e eVar) {
        super(carContext, "AdPreview");
        h.g.b.x.f(str, "adId");
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(eVar, "controller");
        this.f18854a = dh.H();
        org.a.d.k.b bVarL = l();
        int i2 = ar.f48106a;
        ae aeVar = (ae) bVarL.a(new h.g.b.m(ae.class), null, null);
        com.waze.shared_infra.o.a aVar = (com.waze.shared_infra.o.a) l().a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
        aeVar.o(eVar);
        aeVar.p(str);
        addBackPressedCallback(new com.waze.ads.b(aeVar, 18));
        getLifecycle().addObserver(new p(aeVar));
        aj.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new s(aeVar, carContext, aVar, this, null), 3);
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f18854a;
    }
}
