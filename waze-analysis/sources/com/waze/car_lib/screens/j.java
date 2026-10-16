package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.LongMessageTemplate;
import androidx.car.app.model.Template;
import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.r.k f22017a;

    /* renamed from: b, reason: collision with root package name */
    private final LongMessageTemplate f22018b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(CarContext carContext, com.waze.car_lib.r.k kVar) {
        super(carContext, "ConsentBumpScreen");
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(kVar, "viewModel");
        this.f22017a = kVar;
        this.f22018b = dh.u(carContext, kVar.a(), new c((Object) kVar, 3, (short[]) null), new c((Object) kVar, 4, (int[]) null));
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f22018b;
    }
}
