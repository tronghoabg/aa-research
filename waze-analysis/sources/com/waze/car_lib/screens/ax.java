package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.LongMessageTemplate;
import androidx.car.app.model.Template;
import com.waze.R;
import com.waze.car_lib.p.dg;
import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ax extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f21809a;

    /* renamed from: b, reason: collision with root package name */
    private final LongMessageTemplate f21810b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(CarContext carContext) {
        super(carContext, "Nd4cInfoScreen");
        h.g.b.x.f(carContext, "carContext");
        this.f21809a = h.g.b(h.h.f48130a, new n((org.a.d.a.a) this, 20));
        this.f21810b = dh.u(carContext, new dg(b().c(R.string.AAOS_SEARCH_ND4C_TITLE, new Object[0]), b().c(R.string.AAOS_SEARCH_ND4C_CONTENT, new Object[0]), null, true, new com.waze.car_lib.p.dc(b().c(R.string.AAOS_SEARCH_ND4C_CLOSE_BUTTON, new Object[0]), true), null, 4), new n((com.waze.car_lib.screens.core.n) this, 19), new o(13));
    }

    static final h.ab c(ax axVar) {
        axVar.n().a(new com.waze.alerters.b.f(axVar, 9));
        return h.ab.f48028a;
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21810b;
    }

    public final com.waze.shared_infra.o.a b() {
        return (com.waze.shared_infra.o.a) this.f21809a.getValue();
    }
}
