package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.Template;
import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class r extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final MessageTemplate f22030a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.waze.car_lib.p.dd ddVar, CarContext carContext) {
        super(carContext, "FullScreenPopupScreen");
        h.g.b.x.f(ddVar, "state");
        h.g.b.x.f(carContext, "carContext");
        this.f22030a = dh.v(carContext, ddVar.e(), new q((com.waze.car_lib.screens.core.n) this, (Object) ddVar, 0), new q((com.waze.car_lib.screens.core.n) this, (Object) ddVar, 2));
        addBackPressedCallback(new com.waze.b.g(ddVar, 17));
    }

    static final h.ab b(r rVar, com.waze.car_lib.p.dd ddVar) {
        rVar.n().a(new com.waze.a.aa(ddVar, rVar, 14));
        return h.ab.f48028a;
    }

    static final h.ab c(r rVar, com.waze.car_lib.p.dd ddVar) {
        rVar.n().a(new com.waze.a.aa(ddVar, rVar, 15));
        return h.ab.f48028a;
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f22030a;
    }

    public final void d(h.g.a.a aVar) {
        h.g.b.x.f(aVar, "onDismiss");
        aVar.invoke();
        finish();
    }
}
