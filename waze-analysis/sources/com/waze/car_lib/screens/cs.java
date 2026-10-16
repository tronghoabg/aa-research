package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.Template;
import com.waze.car_lib.f.iv;
import com.waze.car_lib.f.iw;
import com.waze.car_lib.p.dh;
import com.waze.car_lib.r.eo;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cs extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final eo f21978a;

    /* renamed from: b, reason: collision with root package name */
    private final MessageTemplate f21979b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs(iv ivVar, CarContext carContext) {
        super(carContext, "SubmitLogsScreen");
        h.g.b.x.f(ivVar, "coordinatorController");
        h.g.b.x.f(carContext, "carContext");
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        eo eoVar = (eo) bVarL.a(new h.g.b.m(eo.class), null, null);
        this.f21978a = eoVar;
        this.f21979b = dh.v(carContext, eoVar.a(), new as((Object) this, (Object) ivVar, 18), new as((Object) this, (Object) ivVar, 19));
        eoVar.e();
        addBackPressedCallback(new bm((com.waze.car_lib.screens.core.n) this, 6));
    }

    public static /* synthetic */ h.ab b(cs csVar, iv ivVar) {
        csVar.f21978a.b();
        ivVar.a();
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab c(cs csVar, iv ivVar) {
        csVar.f21978a.d();
        ivVar.H(iw.f19731a);
        return h.ab.f48028a;
    }

    static final h.ab d(cs csVar) {
        csVar.f21978a.c();
        return h.ab.f48028a;
    }

    static final h.ab e(cs csVar, iv ivVar) {
        csVar.n().a(new com.waze.app_nav.hub.n(csVar, ivVar, 5, null));
        return h.ab.f48028a;
    }

    static final h.ab f(cs csVar, iv ivVar) {
        csVar.n().a(new com.waze.app_nav.hub.n(csVar, ivVar, 6, null));
        return h.ab.f48028a;
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21979b;
    }
}
