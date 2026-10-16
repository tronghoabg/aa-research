package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.ListTemplate;
import androidx.car.app.model.Template;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.car_lib.f.hm;
import com.waze.car_lib.p.dh;
import com.waze.car_lib.r.el;
import com.waze.car_lib.r.em;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cm extends cn {

    /* renamed from: a, reason: collision with root package name */
    private final ListTemplate f21943a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm(CarContext carContext, hm hmVar, com.waze.settings.tree.d.n nVar, com.waze.car_lib.c.n nVar2) {
        super(carContext, "SettingPageScreen", null, nVar2);
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(hmVar, "controller");
        h.g.b.x.f(nVar2, "analyticsSender");
        this.f21943a = dh.x();
        int iCheckSelfPermission = carContext.checkSelfPermission("android.permission.RECORD_AUDIO");
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        el elVarA = ((em) bVarL.a(new h.g.b.m(em.class), null, null)).a(nVar, hmVar, iCheckSelfPermission == 0);
        nVar2.b(elVarA.a());
        addBackPressedCallback(new com.waze.alerters.b.f(elVarA, 18));
        kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new bt(this, elVarA, carContext, (h.c.e) null, 3), 3);
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21943a;
    }
}
