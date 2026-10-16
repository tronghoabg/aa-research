package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.Template;
import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class p extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.r.w f22025a;

    /* renamed from: b, reason: collision with root package name */
    private final MessageTemplate f22026b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(CarContext carContext, boolean z, String str) {
        super(carContext, "ForceUpgradeScreen");
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(str, "appDownloadUrl");
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        com.waze.car_lib.r.w wVarA = ((com.waze.car_lib.r.x) bVarL.a(new h.g.b.m(com.waze.car_lib.r.x.class), null, null)).a(z, str, carContext);
        this.f22025a = wVarA;
        int i3 = 0;
        this.f22026b = dh.v(carContext, wVarA.a(), new n((com.waze.car_lib.screens.core.n) this, i3), new o(i3));
    }

    public static /* synthetic */ h.ab b(p pVar) {
        pVar.f22025a.b();
        return h.ab.f48028a;
    }

    static final h.ab c(p pVar) {
        pVar.n().a(new com.waze.b.g(pVar, 16));
        return h.ab.f48028a;
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f22026b;
    }
}
