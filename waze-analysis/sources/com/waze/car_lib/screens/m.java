package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.Template;
import com.waze.car_lib.f.hm;
import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class m extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final MessageTemplate f22021a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(CarContext carContext, hm hmVar, com.waze.av.b.aa aaVar) {
        super(carContext, "DeleteRecentDestinationsScreen");
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(hmVar, "coordinatorController");
        h.g.b.x.f(aaVar, "wazePlace");
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        this.f22021a = dh.v(carContext, ((com.waze.car_lib.r.v) bVarL.a(new h.g.b.m(com.waze.car_lib.r.v.class), null, null)).a(), new n((com.waze.car_lib.screens.core.n) this, 1), new ci(this, hmVar, aaVar, 1));
    }

    static final h.ab b(m mVar) {
        mVar.n().a(new com.waze.b.g(mVar, 15));
        return h.ab.f48028a;
    }

    static final h.ab c(m mVar, hm hmVar, com.waze.av.b.aa aaVar) {
        mVar.n().a(new com.waze.a.z((Object) hmVar, (Object) aaVar, (Object) mVar, 7, (short[]) null));
        return h.ab.f48028a;
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f22021a;
    }
}
