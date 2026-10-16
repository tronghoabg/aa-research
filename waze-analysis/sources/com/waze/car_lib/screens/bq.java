package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.Template;
import com.waze.car_lib.f.fw;
import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bq extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final fw f21889a;

    /* renamed from: b, reason: collision with root package name */
    private final br f21890b;

    /* renamed from: c, reason: collision with root package name */
    private final MessageTemplate f21891c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq(CarContext carContext, fw fwVar, br brVar) {
        super(carContext, "RecordAudioPermissionScreen");
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(fwVar, "controller");
        h.g.b.x.f(brVar, "viewModel");
        this.f21889a = fwVar;
        this.f21890b = brVar;
        this.f21891c = dh.v(carContext, brVar.a(), new as((Object) this, (Object) carContext, 10), new o(17));
    }

    public static /* synthetic */ h.ab b(bq bqVar, CarContext carContext) {
        bqVar.f21889a.e(carContext);
        return h.ab.f48028a;
    }

    static final h.ab c(bq bqVar, CarContext carContext) {
        bqVar.n().a(new com.waze.a.aa(bqVar, carContext, 19));
        return h.ab.f48028a;
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21891c;
    }
}
