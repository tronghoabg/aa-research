package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.SearchTemplate;
import androidx.car.app.model.Template;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class v extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f22038a;

    /* renamed from: b, reason: collision with root package name */
    private final SearchTemplate f22039b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.car_lib.r.bl f22040c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(CarContext carContext, com.waze.car_lib.f.cl clVar, com.waze.shared_infra.o.a aVar) {
        super(carContext, "HovSettingsScreen");
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(clVar, "controller");
        h.g.b.x.f(aVar, "stringProvider");
        this.f22038a = aVar;
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        this.f22040c = ((com.waze.car_lib.r.ae) bVarL.a(new h.g.b.m(com.waze.car_lib.r.ae.class), null, null)).c(clVar);
        this.f22039b = dh.E();
        kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new u(this, carContext, null), 3);
        getLifecycle().addObserver(new t(this, 0));
    }

    public static /* synthetic */ h.ab b(v vVar, String str) {
        vVar.f22040c.e(str);
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab c(v vVar) {
        vVar.f22040c.d();
        return h.ab.f48028a;
    }

    static final h.ab d(v vVar, String str) {
        h.g.b.x.f(str, "searchTerm");
        vVar.n().a(new com.waze.a.aa(vVar, str, 16, null));
        return h.ab.f48028a;
    }

    static final h.ab e(v vVar) {
        vVar.n().a(new com.waze.b.g(vVar, 18));
        return h.ab.f48028a;
    }

    static final void f(v vVar, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        h.g.b.x.f(lifecycleOwner, "source");
        h.g.b.x.f(event, NotificationCompat.CATEGORY_EVENT);
        if (h.g.b.x.n(lifecycleOwner, vVar) && event == Lifecycle.Event.ON_DESTROY) {
            vVar.f22040c.c();
        }
    }

    public static final /* synthetic */ void g(v vVar, com.waze.car_lib.p.n nVar) {
        CarContext carContext = vVar.getCarContext();
        h.g.b.x.e(carContext, "getCarContext(...)");
        vVar.q(dh.P(carContext, vVar.f22038a, nVar, new am(vVar, 1), new n((com.waze.car_lib.screens.core.n) vVar, 2)));
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f22039b;
    }
}
