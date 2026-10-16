package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.Template;
import com.waze.car_lib.f.il;
import com.waze.car_lib.p.dh;
import com.waze.car_lib.r.fk;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class de extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final MessageTemplate f22000a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f22001b;

    /* renamed from: c, reason: collision with root package name */
    private kotlinx.coroutines.af f22002c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de(il ilVar, CarContext carContext) {
        super(carContext, "WaitForLoginStateScreen");
        h.g.b.x.f(ilVar, "coordinatorController");
        h.g.b.x.f(carContext, "carContext");
        this.f22000a = dh.A();
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("WaitForLoginStateScreen");
        h.g.b.x.e(eVarD, "create(...)");
        this.f22001b = eVarD;
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        getLifecycle().addObserver(new dd(this, ((fk) bVarL.a(new h.g.b.m(fk.class), null, null)).a(ilVar), carContext));
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f22000a;
    }
}
