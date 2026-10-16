package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.Template;
import com.waze.R;
import com.waze.car_lib.p.dg;
import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cr extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final MessageTemplate f21977a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr(CarContext carContext, com.waze.shared_infra.o.a aVar) {
        super(carContext, "SplashScreen");
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(aVar, "stringProvider");
        this.f21977a = dh.v(carContext, new dg(aVar.c(R.string.AAOS_SPLASH_SCREEN_TITLE, new Object[0]), aVar.c(R.string.AAOS_SPLASH_SCREEN_MESSAGE, new Object[0]), Integer.valueOf(R.drawable.launch_icon_64px), false, null, null, 48), new cp(2), new cp(3));
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21977a;
    }
}
