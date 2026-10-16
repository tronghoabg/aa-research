package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.GridTemplate;
import androidx.car.app.model.Template;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.car_lib.f.gg;
import com.waze.car_lib.p.dh;
import com.waze.car_lib.r.dl;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bu extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final GridTemplate f21901a;

    /* renamed from: b, reason: collision with root package name */
    private final dl f21902b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu(gg ggVar, CarContext carContext) {
        super(carContext, "ReportAlertScreen");
        h.g.b.x.f(ggVar, "coordinatorController");
        h.g.b.x.f(carContext, "carContext");
        this.f21901a = dh.w();
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        this.f21902b = (dl) bVarL.a(new h.g.b.m(dl.class), null, null);
        kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new bt(this, carContext, ggVar, (h.c.e) null, 0), 3);
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21901a;
    }
}
