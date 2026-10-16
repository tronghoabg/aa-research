package com.waze.car_lib.e;

import androidx.car.app.CarContext;
import androidx.car.app.model.Template;
import androidx.car.app.navigation.model.NavigationTemplate;
import com.waze.car_lib.p.dh;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final NavigationTemplate f19269a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CarContext carContext) {
        super(carContext, "ClusterEmptyScreen");
        x.f(carContext, "carContext");
        this.f19269a = dh.B();
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f19269a;
    }
}
