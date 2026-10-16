package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.Template;
import com.waze.car_lib.f.fw;
import com.waze.car_lib.f.gb;
import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bo extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final fw f21886a;

    /* renamed from: b, reason: collision with root package name */
    private final bp f21887b;

    /* renamed from: c, reason: collision with root package name */
    private final MessageTemplate f21888c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo(CarContext carContext, fw fwVar, bp bpVar) {
        super(carContext, "RecordAudioPermissionDeniedScreen");
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(fwVar, "controller");
        h.g.b.x.f(bpVar, "viewModel");
        this.f21886a = fwVar;
        this.f21887b = bpVar;
        this.f21888c = dh.v(carContext, bpVar.a(), new bm((com.waze.car_lib.screens.core.n) this, 0), new o(16));
        getLifecycle().addObserver(new bn(this, carContext, 0));
    }

    public static /* synthetic */ h.ab c(bo boVar) {
        boVar.f21886a.H(gb.f19604a);
        return h.ab.f48028a;
    }

    static final h.ab d(bo boVar) {
        boVar.n().a(new com.waze.alerters.b.f(boVar, 11));
        return h.ab.f48028a;
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21888c;
    }

    public final fw b() {
        return this.f21886a;
    }
}
