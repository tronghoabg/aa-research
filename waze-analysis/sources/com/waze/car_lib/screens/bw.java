package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.Template;
import androidx.car.app.navigation.model.MapWithContentTemplate;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.car_lib.f.gg;
import com.waze.car_lib.p.dh;
import com.waze.car_lib.r.dl;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bw extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final MapWithContentTemplate f21904a;

    /* renamed from: b, reason: collision with root package name */
    private final dl f21905b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw(gg ggVar, CarContext carContext) {
        super(carContext, "ReportAlertScreenV2");
        h.g.b.x.f(ggVar, "coordinatorController");
        h.g.b.x.f(carContext, "carContext");
        this.f21904a = dh.H();
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        this.f21905b = (dl) bVarL.a(new h.g.b.m(dl.class), null, null);
        getLifecycle().addObserver(new bv(this));
        kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new bt(this, carContext, ggVar, (h.c.e) null, 2), 3);
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21904a;
    }
}
