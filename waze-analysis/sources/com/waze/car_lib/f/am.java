package com.waze.car_lib.f;

import androidx.car.app.Screen;
import androidx.core.app.NotificationCompat;
import com.waze.car_lib.screens.core.ScreenPresentable;
import com.waze.gw.Gateway;
import com.waze.shared_infra.coordinators.AapCoordinatorNonFatalException$MainScreenPopToRoot;
import java.util.Objects;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class am extends com.waze.car_lib.bm {

    /* renamed from: d, reason: collision with root package name */
    private final ax f19369d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f19370e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f19371f;

    /* renamed from: g, reason: collision with root package name */
    private ed f19372g;

    /* renamed from: h, reason: collision with root package name */
    private com.waze.sharedui.profile.b f19373h;

    /* renamed from: i, reason: collision with root package name */
    private com.waze.sharedui.profile.b f19374i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(ax axVar, com.waze.shared_infra.i.b bVar) {
        super(new com.waze.shared_infra.coordinators.p(false));
        h.g.b.x.f(axVar, "controller");
        h.g.b.x.f(bVar, "exceptionReporter");
        this.f19369d = axVar;
        this.f19370e = bVar;
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("AppCoordinator");
        h.g.b.x.e(eVarD, "create(...)");
        this.f19371f = eVarD;
        H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L() {
        B();
        av avVar = (av) this.f19369d.r().d();
        av avVar2 = av.f19392a;
        int iOrdinal = avVar.ordinal();
        if (iOrdinal == 0) {
            com.waze.sharedui.profile.b bVar = this.f19373h;
            if (bVar != null) {
                bVar.o();
                return;
            }
            return;
        }
        if (iOrdinal != 1) {
            throw new h.i();
        }
        com.waze.sharedui.profile.b bVar2 = this.f19374i;
        if (bVar2 != null) {
            bVar2.o();
            return;
        }
        com.waze.sharedui.profile.b bVar3 = this.f19373h;
        if (bVar3 != null) {
            bVar3.o();
        }
    }

    private final void M(av avVar) {
        av avVar2 = av.f19392a;
        int iOrdinal = avVar.ordinal();
        if (iOrdinal == 0) {
            com.waze.sharedui.profile.b bVar = this.f19374i;
            if (bVar == null || !bVar.q() || G()) {
                return;
            }
            this.f19374i = null;
            L();
            return;
        }
        if (iOrdinal != 1) {
            throw new h.i();
        }
        com.waze.sharedui.profile.b bVar2 = this.f19373h;
        if (bVar2 == null || !bVar2.q()) {
            this.f19371f.g("Can't switch to navigationMap as mapPresenter is not resumed");
            return;
        }
        if (G()) {
            this.f19370e.a(new AapCoordinatorNonFatalException$MainScreenPopToRoot(z()), null);
            L();
        }
        this.f19374i = J(new com.waze.car_lib.screens.ak(this.f19369d, a()), true);
    }

    public static final /* synthetic */ Object q(am amVar, com.waze.settings.tree.a.d dVar, h.c.e eVar) {
        if (!(dVar instanceof com.waze.shared_infra.coordinators.d)) {
            return h.ab.f48028a;
        }
        com.waze.c.c.e eVar2 = (com.waze.c.c.e) ((com.waze.shared_infra.coordinators.d) dVar).f();
        if (eVar2 instanceof com.waze.car_lib.a.n) {
            com.waze.shared_infra.i.e eVar3 = amVar.f19371f;
            com.waze.av.b.n nVarP = ((com.waze.car_lib.a.n) eVar2).p();
            Objects.toString(nVarP);
            eVar3.a("AdPreview ended with Navigate to ".concat(nVarP.toString()));
            org.a.d.k.b bVarC = amVar.c();
            int i2 = h.g.b.ar.f48106a;
            com.waze.car_lib.o oVar = (com.waze.car_lib.o) bVarC.a(new h.g.b.m(com.waze.car_lib.o.class), null, null);
            com.waze.car_lib.bm bmVar = (com.waze.car_lib.bm) oVar.b().a(new h.g.b.m(a.class), null, null);
            bmVar.d(oVar.a());
            bmVar.e(oVar.b());
            bmVar.E(new com.waze.car_lib.br());
            Object objX = amVar.x(bmVar, new com.waze.iv(eVar2, 15), eVar);
            if (objX == h.c.a.a.f48038a) {
                return objX;
            }
        } else if (eVar2 instanceof com.waze.car_lib.a.o) {
            amVar.f19371f.a("AdPreview ended with ReportAlert");
            am amVar2 = amVar;
            org.a.d.k.b bVarC2 = amVar.c();
            int i3 = h.g.b.ar.f48106a;
            com.waze.car_lib.o oVar2 = (com.waze.car_lib.o) bVarC2.a(new h.g.b.m(com.waze.car_lib.o.class), null, null);
            com.waze.car_lib.bm bmVar2 = (com.waze.car_lib.bm) oVar2.b().a(new h.g.b.m(gf.class), null, null);
            bmVar2.d(oVar2.a());
            bmVar2.e(oVar2.b());
            bmVar2.E(new com.waze.car_lib.br());
            Object objX2 = amVar2.x(bmVar2, new com.waze.perf.p(11), eVar);
            if (objX2 == h.c.a.a.f48038a) {
                return objX2;
            }
        } else {
            if (!h.g.b.x.n(eVar2, com.waze.car_lib.a.l.f18839a) && !h.g.b.x.n(eVar2, com.waze.car_lib.a.m.f18840a)) {
                throw new h.i();
            }
            amVar.f19371f.a("AdPreview ended with Back/Exit");
        }
        return h.ab.f48028a;
    }

    public static final /* synthetic */ Object r(am amVar, com.waze.settings.tree.a.d dVar, com.waze.modules.navigation.ah ahVar, h.c.e eVar) {
        if (!(dVar instanceof com.waze.shared_infra.coordinators.d)) {
            return h.ab.f48028a;
        }
        com.waze.design_components.d.b bVar = (com.waze.design_components.d.b) ((com.waze.shared_infra.coordinators.d) dVar).f();
        if (!(bVar instanceof ai)) {
            if (h.g.b.x.n(bVar, ag.f19356a) || h.g.b.x.n(bVar, ah.f19357a)) {
                return h.ab.f48028a;
            }
            throw new h.i();
        }
        org.a.d.k.b bVarC = amVar.c();
        int i2 = h.g.b.ar.f48106a;
        com.waze.car_lib.o oVar = (com.waze.car_lib.o) bVarC.a(new h.g.b.m(com.waze.car_lib.o.class), null, null);
        com.waze.car_lib.bm bmVar = (com.waze.car_lib.bm) oVar.b().a(new h.g.b.m(a.class), null, null);
        bmVar.d(oVar.a());
        bmVar.e(oVar.b());
        bmVar.E(new com.waze.car_lib.br());
        Object objX = amVar.x(bmVar, new com.waze.c.d.a(bVar, ahVar, 12), eVar);
        return objX != h.c.a.a.f48038a ? h.ab.f48028a : objX;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* synthetic */ com.waze.shared_infra.coordinators.s b() {
        return this.f19369d;
    }

    public final Screen f() {
        ScreenPresentable akVar = Gateway.getAaSuggestWidgetMode() == 0 ? new com.waze.car_lib.screens.ak(this.f19369d, a()) : new com.waze.car_lib.screens.ap(this.f19369d, a());
        this.f19373h = J(akVar, false);
        return akVar;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        com.waze.design_components.g.b bVar = (com.waze.design_components.g.b) obj;
        h.g.b.x.f(bVar, NotificationCompat.CATEGORY_EVENT);
        Objects.toString(bVar);
        String strConcat = "handling ".concat(String.valueOf(bVar));
        com.waze.shared_infra.i.e eVar = this.f19371f;
        eVar.a(strConcat);
        if (h.g.b.x.n(bVar, bt.f19436a)) {
            L();
            kotlinx.coroutines.aj.z(A(), new al(CoroutineExceptionHandler.f51269c, this), null, new aj(this, (h.c.e) null, 0), 2);
            return;
        }
        if (h.g.b.x.n(bVar, bk.f19426a)) {
            L();
            kotlinx.coroutines.aj.z(A(), new al(CoroutineExceptionHandler.f51269c, this), null, new aj(this, (h.c.e) null, 2, (byte[]) null), 2);
            return;
        }
        if (bVar instanceof bc) {
            M(((bc) bVar).a());
            return;
        }
        if (h.g.b.x.n(bVar, be.f19418a)) {
            if (this.f19372g != null) {
                eVar.a("AppCoordinatorEvent.Navigation - already navigating, not changing screen");
                return;
            }
            eVar.a("AppCoordinatorEvent.Navigation start navigationCoordinator event");
            L();
            kotlinx.coroutines.aj.z(A(), null, null, new aj(this, (h.c.e) null, 4, (short[]) null), 3);
            return;
        }
        if (h.g.b.x.n(bVar, bo.f19431a)) {
            kotlinx.coroutines.aj.z(A(), null, null, new aj(this, (h.c.e) null, 5, (int[]) null), 3);
            return;
        }
        if (bVar instanceof bn) {
            if (this.f19372g != null) {
                return;
            }
            kotlinx.coroutines.aj.z(A(), null, null, new d(this, bVar, (h.c.e) null, 3, (byte[]) null), 3);
            return;
        }
        if (h.g.b.x.n(bVar, bs.f19435a)) {
            kotlinx.coroutines.aj.z(A(), null, null, new aj(this, (h.c.e) null, 6, (boolean[]) null), 3);
            return;
        }
        if (h.g.b.x.n(bVar, bj.f19425a)) {
            kotlinx.coroutines.aj.z(A(), null, null, new aj(this, (h.c.e) null, 7, (float[]) null), 3);
            return;
        }
        if (h.g.b.x.n(bVar, ay.f19410a)) {
            kotlinx.coroutines.aj.z(A(), null, null, new aj(this, (h.c.e) null, 8, (byte[][]) null), 3);
            return;
        }
        if (bVar instanceof bb) {
            J(new com.waze.car_lib.screens.r(((bb) bVar).a(), a()), true);
            return;
        }
        if (bVar instanceof bd) {
            kotlinx.coroutines.aj.z(A(), null, null, new d(this, ((bd) bVar).a(), (h.c.e) null, 9), 3);
            return;
        }
        if (bVar instanceof bf) {
            L();
            kotlinx.coroutines.aj.z(A(), null, null, new d(this, bVar, (h.c.e) null, 4, (char[]) null), 3);
            return;
        }
        if (bVar instanceof ba) {
            L();
            kotlinx.coroutines.aj.z(A(), null, null, new d(this, bVar, (h.c.e) null, 5, (short[]) null), 3);
            return;
        }
        if (bVar instanceof bu) {
            kotlinx.coroutines.aj.z(A(), null, null, new d(this, bVar, (h.c.e) null, 6, (int[]) null), 3);
            return;
        }
        if (bVar instanceof bh) {
            kotlinx.coroutines.aj.z(A(), null, null, new ak(this, bVar, (h.c.e) null, 1, (byte[]) null), 3);
            return;
        }
        if (bVar instanceof bp) {
            if (this.f19372g != null) {
                eVar.g("Will not intercept ShowAd bcs there is active navigation coordinator");
                return;
            } else {
                kotlinx.coroutines.aj.z(A(), null, null, new ak(this, bVar, (h.c.e) null, 0), 3);
                return;
            }
        }
        if (bVar instanceof bq) {
            com.waze.car_lib.screens.w wVar = new com.waze.car_lib.screens.w(a(), ((bq) bVar).a());
            wVar.disableBackPresses();
            J(wVar, true);
        } else {
            if (bVar instanceof bg) {
                kotlinx.coroutines.aj.z(A(), null, null, new d(this, (bg) bVar, (h.c.e) null, 7), 3);
                return;
            }
            if (bVar instanceof br) {
                kotlinx.coroutines.aj.z(A(), null, null, new d(this, bVar, (h.c.e) null, 2), 3);
                return;
            }
            if (h.g.b.x.n(bVar, az.f19411a)) {
                kotlinx.coroutines.aj.z(A(), null, null, new aj(this, (h.c.e) null, 3, (char[]) null), 3);
            } else {
                if (!(bVar instanceof bi)) {
                    throw new h.i();
                }
                if (this.f19372g != null) {
                    return;
                }
                kotlinx.coroutines.aj.z(A(), null, null, new ak(this, bVar, (h.c.e) null, 2, (char[]) null), 3);
            }
        }
    }

    public final ax i() {
        return this.f19369d;
    }

    public final com.waze.shared_infra.i.e l() {
        return this.f19371f;
    }

    @Override // com.waze.shared_infra.coordinators.o
    protected final void p() {
        M((av) this.f19369d.r().d());
    }
}
