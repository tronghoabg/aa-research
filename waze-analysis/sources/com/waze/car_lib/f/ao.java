package com.waze.car_lib.f;

import com.waze.car_lib.login.LoginController$LoginState;
import com.waze.strings.DisplayStrings;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ao implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.shared_infra.coordinators.s f19377a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f19378b;

    ao(com.waze.shared_infra.coordinators.s sVar, int i2) {
        this.f19378b = i2;
        this.f19377a = sVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        switch (this.f19378b) {
            case 0:
                com.waze.navigate.ei eiVar = com.waze.navigate.ei.f31310a;
                int iOrdinal = ((com.waze.navigate.ei) obj).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        throw new h.i();
                    }
                    com.waze.shared_infra.coordinators.s sVar = this.f19377a;
                    ax axVar = (ax) sVar;
                    com.waze.shared_infra.h.b bVar = (com.waze.shared_infra.h.b) axVar.f19402e.c().d();
                    h.g.b.x.f(bVar, "<this>");
                    if (bVar instanceof com.waze.shared_infra.r.u) {
                        ((com.waze.shared_infra.r.u) bVar).j();
                    } else if (!((LoginController$LoginState) axVar.f19403f.d().d()).getForceVersionUpgrade()) {
                        axVar.f19408k.a("navigation state is Navigating, start navigation");
                        sVar.H(be.f19418a);
                    }
                }
                return h.ab.f48028a;
            case 1:
                this.f19377a.H(new fi((com.waze.location.a) obj));
                return h.ab.f48028a;
            case 2:
                com.waze.cf cfVar = (com.waze.cf) obj;
                if (!(cfVar instanceof com.waze.bi)) {
                    throw new h.i();
                }
                ((ax) this.f19377a).B(new com.waze.modules.navigation.br(new com.waze.modules.navigation.ao(com.waze.modules.navigation.ah.t, new com.waze.modules.navigation.ai(((com.waze.bi) cfVar).a()), null, false, null, null, false, null, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_5)));
                return h.ab.f48028a;
            case 3:
                com.waze.car_lib.g.g gVar = (com.waze.car_lib.g.g) obj;
                com.waze.shared_infra.coordinators.s sVar2 = this.f19377a;
                com.waze.shared_infra.i.e eVar2 = ((ax) sVar2).f19408k;
                Objects.toString(gVar);
                eVar2.a("LCV state changed: ".concat(String.valueOf(gVar)));
                if (h.g.b.x.n(gVar, com.waze.car_lib.g.e.f19793a)) {
                    sVar2.H(new bq(com.waze.car_lib.r.af.f20939a));
                } else {
                    if (!h.g.b.x.n(gVar, com.waze.car_lib.g.f.f19794a)) {
                        throw new h.i();
                    }
                    sVar2.H(new bq(com.waze.car_lib.r.ag.f20940a));
                }
                return h.ab.f48028a;
            case 4:
                this.f19377a.H(new br((com.waze.asks.as) obj));
                return h.ab.f48028a;
            case 5:
                if (((com.waze.modules.c.eb) obj) != null) {
                    com.waze.shared_infra.coordinators.s sVar3 = this.f19377a;
                    ax axVar2 = (ax) sVar3;
                    if (axVar2.f19398a.e().d() == com.waze.navigate.ei.f31311b) {
                        axVar2.f19408k.a("activeNavigationRoute updated while Navigating, start navigation");
                        sVar3.H(be.f19418a);
                    }
                }
                return h.ab.f48028a;
            case 6:
                this.f19377a.H(new bb((com.waze.car_lib.p.dd) obj));
                return h.ab.f48028a;
            case 7:
                com.waze.car_lib.p.aj ajVar = (com.waze.car_lib.p.aj) obj;
                com.waze.shared_infra.coordinators.s sVar4 = this.f19377a;
                com.waze.shared_infra.i.e eVar3 = ((ax) sVar4).f19408k;
                Objects.toString(ajVar);
                eVar3.a("AppCoordinatorController mapMessagePopups collected: ".concat(String.valueOf(ajVar)));
                if (ajVar != null) {
                    sVar4.H(new bd(ajVar));
                }
                return h.ab.f48028a;
            case 8:
                com.waze.map.isolated.g gVar2 = (com.waze.map.isolated.g) obj;
                com.waze.shared_infra.coordinators.s sVar5 = this.f19377a;
                com.waze.shared_infra.i.e eVar4 = ((ax) sVar5).f19408k;
                Objects.toString(gVar2);
                eVar4.a("got MapEvent: ".concat(String.valueOf(gVar2)));
                if (!(gVar2 instanceof com.waze.map.isolated.f)) {
                    throw new h.i();
                }
                sVar5.H(new bh(((com.waze.map.isolated.f) gVar2).a()));
                return h.ab.f48028a;
            case 9:
                this.f19377a.H(new bp(((com.waze.map.b.r) obj).f()));
                return h.ab.f48028a;
            case 10:
                LoginController$LoginState loginController$LoginState = (LoginController$LoginState) obj;
                com.waze.car_lib.login.i state = loginController$LoginState.getState();
                if (h.g.b.x.n(state, com.waze.car_lib.login.d.f20301a)) {
                    this.f19377a.H(bk.f19426a);
                } else if (state instanceof com.waze.car_lib.login.h) {
                    this.f19377a.H(new ba(((com.waze.car_lib.login.h) loginController$LoginState.getState()).b(), ((com.waze.car_lib.login.h) loginController$LoginState.getState()).a()));
                } else if (h.g.b.x.n(state, com.waze.car_lib.login.c.f20300a)) {
                    this.f19377a.H(az.f19411a);
                }
                return h.ab.f48028a;
            case 11:
                com.waze.search.bm bmVar = (com.waze.search.bm) obj;
                boolean zC = bmVar.c();
                com.waze.shared_infra.coordinators.s sVar6 = this.f19377a;
                if (zC) {
                    kotlinx.coroutines.aj.z(sVar6.G(), null, null, new d((ax) sVar6, bmVar, (h.c.e) null, 10), 3);
                } else {
                    sVar6.H(new bl(bmVar.b(), bmVar.d(), bmVar.a()));
                }
                return h.ab.f48028a;
            case 12:
                this.f19377a.H(new ev(((com.waze.map.b.r) obj).f()));
                return h.ab.f48028a;
            case 13:
                this.f19377a.H(eq.f19562a);
                return h.ab.f48028a;
            case 14:
                com.waze.search.bm bmVar2 = (com.waze.search.bm) obj;
                ((ej) this.f19377a).x(bmVar2.b(), bmVar2.d());
                return h.ab.f48028a;
            case 15:
                com.waze.cu cuVar = (com.waze.cu) obj;
                this.f19377a.H(new er(cuVar.a(), cuVar.b()));
                return h.ab.f48028a;
            case 16:
                if (((com.waze.navigate.a) obj).a()) {
                    ej.o((ej) this.f19377a);
                }
                return h.ab.f48028a;
            case 17:
                this.f19377a.H(new fb((com.waze.asks.as) obj));
                return h.ab.f48028a;
            case 18:
                com.waze.car_lib.p.aj ajVar2 = (com.waze.car_lib.p.aj) obj;
                com.waze.shared_infra.coordinators.s sVar7 = this.f19377a;
                ((ej) sVar7).p.a("NavigationCoordinatorController mapMessagePopups collected [" + sVar7 + "]: " + ajVar2);
                if (ajVar2 != null) {
                    sVar7.H(new fa(ajVar2));
                }
                return h.ab.f48028a;
            case 19:
                com.waze.shared_infra.coordinators.s sVar8 = this.f19377a;
                ((ej) sVar8).m.b();
                sVar8.H(new ek(true));
                return h.ab.f48028a;
            default:
                this.f19377a.H(new eo((com.waze.navigate.a.d) obj));
                return h.ab.f48028a;
        }
    }
}
