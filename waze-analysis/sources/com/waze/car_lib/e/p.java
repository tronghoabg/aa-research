package com.waze.car_lib.e;

import androidx.car.app.CarContext;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.Template;
import androidx.car.app.navigation.model.NavigationTemplate;
import androidx.car.app.navigation.model.RoutingInfo;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.car_lib.i.b.ae;
import com.waze.car_lib.p.dh;
import com.waze.car_lib.r.cf;
import com.waze.shared_infra.r.y;
import h.g.b.x;
import java.util.Objects;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class p extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final a f19305a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f19306b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f19307c;

    /* renamed from: d, reason: collision with root package name */
    private final h.f f19308d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f19309e;

    /* renamed from: f, reason: collision with root package name */
    private final NavigationTemplate f19310f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(CarContext carContext, a aVar, i iVar) {
        super(carContext, "ClusterMapScreen");
        x.f(carContext, "carContext");
        x.f(aVar, "clusterConfig");
        x.f(iVar, "clusterMapController");
        this.f19305a = aVar;
        p pVar = this;
        h.h hVar = h.h.f48130a;
        this.f19306b = h.g.b(hVar, new e((org.a.d.a.a) pVar, 1));
        this.f19307c = h.g.b(hVar, new e((org.a.d.a.a) pVar, 2));
        this.f19308d = h.g.b(hVar, new e((org.a.d.a.a) pVar, 3));
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("Cluster");
        x.e(eVarD, "create(...)");
        this.f19309e = eVarD;
        g().c();
        aj.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new o(this, iVar, carContext, (h.c.e) null, 0), 3);
        this.f19310f = dh.B();
    }

    public static final /* synthetic */ ae c(p pVar) {
        return (ae) pVar.f19307c.getValue();
    }

    public static final /* synthetic */ y e(p pVar) {
        return (y) pVar.f19308d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u g() {
        return (u) this.f19306b.getValue();
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f19310f;
    }

    public final void f(s sVar) {
        x.f(sVar, "state");
        if (sVar.c() && this.f19305a.c()) {
            NavigationTemplate.Builder builder = new NavigationTemplate.Builder();
            builder.setBackgroundColor(CarColor.createCustom(-16777216, -16777216));
            ActionStrip.Builder builder2 = new ActionStrip.Builder();
            builder2.addAction(Action.BACK);
            builder.setActionStrip(builder2.build());
            if (sVar.a() != null) {
                builder.setDestinationTravelEstimate(com.waze.beacons.n.d(sVar.a(), null));
            }
            cf cfVarB = sVar.b();
            if (cfVarB != null) {
                CarContext carContext = getCarContext();
                x.e(carContext, "getCarContext(...)");
                RoutingInfo routingInfoE = com.waze.beacons.n.e(cfVarB, carContext);
                if (routingInfoE != null) {
                    builder.setNavigationInfo(routingInfoE);
                }
            }
            q(builder.build());
        } else {
            q(dh.B());
        }
        com.waze.shared_infra.i.e eVar = this.f19309e;
        Objects.toString(sVar);
        eVar.a("Updating cluster. Ui state changed to ".concat(String.valueOf(sVar)));
    }
}
