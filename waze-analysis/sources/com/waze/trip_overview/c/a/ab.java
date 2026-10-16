package com.waze.trip_overview.c.a;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ar;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.cardview.widget.CardView;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.R;
import com.waze.design_components.button.WazeButton;
import com.waze.design_components.cta_bar.CallToActionBar;
import com.waze.dw;
import com.waze.map.b.ch;
import com.waze.map.b.cj;
import com.waze.map.b.ed;
import com.waze.modules.c.cv;
import com.waze.settings.SettingsMainActivity;
import com.waze.trip_overview.ay;
import com.waze.trip_overview.az;
import com.waze.trip_overview.ba;
import com.waze.trip_overview.bq;
import com.waze.trip_overview.bs;
import com.waze.trip_overview.du;
import com.waze.trip_overview.dv;
import com.waze.trip_overview.ee;
import com.waze.trip_overview.el;
import com.waze.trip_overview.em;
import com.waze.trip_overview.ep;
import com.waze.trip_overview.er;
import com.waze.trip_overview.es;
import com.waze.trip_overview.eu;
import com.waze.trip_overview.ev;
import com.waze.trip_overview.ez;
import com.waze.trip_overview.fb;
import com.waze.trip_overview.fg;
import com.waze.trip_overview.views.RouteHeader;
import com.waze.ui.z.as;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ab extends ar implements org.a.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final ActivityResultLauncher f41152a;

    /* renamed from: b, reason: collision with root package name */
    private final ActivityResultLauncher f41153b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f41154c;

    /* renamed from: d, reason: collision with root package name */
    private final h.f f41155d;

    /* renamed from: e, reason: collision with root package name */
    private final h.f f41156e;

    /* renamed from: f, reason: collision with root package name */
    private final h.f f41157f;

    /* renamed from: g, reason: collision with root package name */
    private final h.f f41158g;

    /* renamed from: h, reason: collision with root package name */
    private final h.f f41159h;

    /* renamed from: i, reason: collision with root package name */
    private final h.f f41160i;

    /* renamed from: j, reason: collision with root package name */
    private final h.f f41161j;

    /* renamed from: k, reason: collision with root package name */
    private final h.f f41162k;

    /* renamed from: l, reason: collision with root package name */
    private com.waze.shared_infra.s.d f41163l;
    private final h.f m;

    public ab() {
        super(R.layout.trip_overview_fragment_routes);
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.waze.trip_overview.c.a.f
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ab.s(this.f41213a, (ActivityResult) obj);
            }
        });
        h.g.b.x.e(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.f41152a = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new dw(this, 6));
        h.g.b.x.e(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.f41153b = activityResultLauncherRegisterForActivityResult2;
        ab abVar = this;
        this.f41154c = org.a.b.b.d.a(abVar);
        ab abVar2 = this;
        h.h hVar = h.h.f48130a;
        this.f41155d = h.g.b(hVar, new g((ComponentCallbacks) abVar2, 1));
        this.f41156e = h.g.b(hVar, new g((ComponentCallbacks) abVar2, 2));
        this.f41157f = h.g.b(hVar, new g((ComponentCallbacks) abVar2, 3));
        this.f41158g = h.g.b(hVar, new g((ComponentCallbacks) abVar2, 4));
        this.f41159h = h.g.b(h.h.f48132c, new aa(abVar, new z(abVar)));
        this.f41160i = h.g.b(hVar, new g((ComponentCallbacks) abVar2, 5));
        this.f41161j = h.g.b(hVar, new g((ComponentCallbacks) abVar2, 6));
        this.f41162k = h.g.b(hVar, new g((ComponentCallbacks) abVar2, 7));
        this.m = h.g.a(new g(this, 0));
    }

    private final View A() {
        View viewFindViewById = requireView().findViewById(R.id.tripOverview_fragmentRoutes_catchClickOverlay);
        h.g.b.x.e(viewFindViewById, "findViewById(...)");
        return viewFindViewById;
    }

    private final CardView B() {
        View viewFindViewById = requireView().findViewById(R.id.tripOverview_fragmentRoutes_mainButtonCard);
        h.g.b.x.e(viewFindViewById, "findViewById(...)");
        return (CardView) viewFindViewById;
    }

    private final ComposeView C() {
        View viewFindViewById = requireView().findViewById(R.id.tripOverview_fragmentRoutes_routeSettingsModalBottomSheet);
        h.g.b.x.e(viewFindViewById, "findViewById(...)");
        return (ComposeView) viewFindViewById;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComposeView D() {
        View viewFindViewById = requireView().findViewById(R.id.tripOverview_fragmentRoutes_routes_message_card);
        h.g.b.x.e(viewFindViewById, "findViewById(...)");
        return (ComposeView) viewFindViewById;
    }

    private final WazeButton E() {
        View viewFindViewById = requireView().findViewById(R.id.tripOverview_fragmentRoutes_mainActionButton);
        h.g.b.x.e(viewFindViewById, "findViewById(...)");
        return (WazeButton) viewFindViewById;
    }

    private final CallToActionBar F() {
        View viewFindViewById = requireView().findViewById(R.id.tripOverview_fragmentRoutes_callToActionBar);
        h.g.b.x.e(viewFindViewById, "findViewById(...)");
        return (CallToActionBar) viewFindViewById;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ed G() {
        return (ed) this.m.getValue();
    }

    private final com.waze.av.b.o H() {
        return (com.waze.av.b.o) this.f41157f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.waze.shared_infra.i.e I() {
        return (com.waze.shared_infra.i.e) this.f41155d.getValue();
    }

    private final com.waze.shared_infra.o.a J() {
        return (com.waze.shared_infra.o.a) this.f41160i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.waze.trip_overview.c.e K() {
        return (com.waze.trip_overview.c.e) this.f41156e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.waze.trip_overview.views.trip_details_container.q L() {
        View viewFindViewById = requireView().findViewById(R.id.tripOverview_fragmentRoutes_detailsContainer);
        h.g.b.x.e(viewFindViewById, "findViewById(...)");
        return (com.waze.trip_overview.views.trip_details_container.q) viewFindViewById;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.waze.speech.k M(State state) {
        return (com.waze.speech.k) state.getValue();
    }

    static final ed c(ab abVar) {
        return ((cj) abVar.f41158g.getValue()).a(abVar.I(), ch.f28144a);
    }

    public static final /* synthetic */ com.waze.maplabelsposition.b d(ab abVar) {
        return (com.waze.maplabelsposition.b) abVar.f41161j.getValue();
    }

    public static final /* synthetic */ com.waze.trip_overview.z f(ab abVar) {
        return (com.waze.trip_overview.z) abVar.f41162k.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object j(com.waze.trip_overview.c.a.ab r7, android.view.View r8, com.waze.trip_overview.views.RouteHeader r9, android.view.View r10, int r11, h.c.e r12) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.trip_overview.c.a.ab.j(com.waze.trip_overview.c.a.ab, android.view.View, com.waze.trip_overview.views.RouteHeader, android.view.View, int, h.c.e):java.lang.Object");
    }

    public static /* synthetic */ h.ab k(ab abVar, com.waze.ui.x.n nVar) {
        com.waze.bo.b.c cVar;
        h.g.b.x.f(nVar, "it");
        if (nVar instanceof com.waze.ui.x.h) {
            abVar.h().l(new du(((com.waze.ui.x.h) nVar).a()));
        } else if (nVar instanceof com.waze.ui.x.i) {
            abVar.h().l(new dv(((com.waze.ui.x.i) nVar).a()));
        } else if (nVar instanceof com.waze.ui.x.k) {
            ao aoVarH = abVar.h();
            com.waze.ui.x.j jVarA = ((com.waze.ui.x.k) nVar).a();
            com.waze.ui.x.j jVar = com.waze.ui.x.j.f43817a;
            com.waze.modules.c.d dVar = com.waze.modules.c.d.f30033a;
            cv cvVar = cv.f30013a;
            int iOrdinal = jVarA.ordinal();
            if (iOrdinal == 0) {
                cVar = com.waze.bo.b.c.f17182a;
            } else if (iOrdinal == 1) {
                cVar = com.waze.bo.b.c.f17183b;
            } else {
                if (iOrdinal != 2) {
                    throw new h.i();
                }
                cVar = com.waze.bo.b.c.f17184c;
            }
            aoVarH.l(new ev(cVar));
        } else if (h.g.b.x.n(nVar, com.waze.ui.x.m.f43824a)) {
            abVar.h().l(fg.f41462a);
            ActivityResultLauncher activityResultLauncher = abVar.f41153b;
            int i2 = SettingsMainActivity.f36691g;
            Context contextRequireContext = abVar.requireContext();
            h.g.b.x.e(contextRequireContext, "requireContext(...)");
            activityResultLauncher.launch(com.waze.br.c.d.e(contextRequireContext, "settings_main.driving_preferences.navigation", "TRIP_OVERVIEW"));
        } else if (h.g.b.x.n(nVar, com.waze.ui.x.l.f43822a)) {
            abVar.h().l(es.f41443a);
        } else {
            if (!h.g.b.x.n(nVar, com.waze.ui.x.l.f43823b)) {
                throw new h.i();
            }
            abVar.C().setVisibility(8);
            abVar.h().l(eu.f41445a);
        }
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab n(ab abVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1855341281, i2, -1, "com.waze.trip_overview.screen.fragments.TripOverviewRoutesFragment.onViewCreated.<anonymous>.<anonymous> (TripOverviewRoutesFragment.kt:190)");
            }
            com.waze.ui.p.t.b(com.waze.ui.p.t.f(abVar.G(), null, composer, 2), null, false, null, false, composer, 0, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab o(final ab abVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-753560921, i2, -1, "com.waze.trip_overview.screen.fragments.TripOverviewRoutesFragment.onViewCreated.<anonymous>.<anonymous> (TripOverviewRoutesFragment.kt:334)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(abVar.h().h(), null, composer, 0, 1);
            com.waze.speech.k kVarM = M(stateCollectAsState);
            boolean zChanged = composer.changed(stateCollectAsState) | composer.changedInstance(abVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (h.g.a.p) new v(abVar, stateCollectAsState, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(kVarM, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) objRememberedValue, composer, 0);
            com.waze.speech.k kVarM2 = M(stateCollectAsState);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.trip_overview.cj(10);
                composer.updateRememberedValue(objRememberedValue2);
            }
            AnimatedContentKt.AnimatedContent(kVarM2, null, (h.g.a.l) objRememberedValue2, null, "TripOverview Message card", null, ComposableLambdaKt.rememberComposableLambda(67792789, true, new h.g.a.r() { // from class: com.waze.trip_overview.c.a.e
                @Override // h.g.a.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    com.waze.ui.ab.n nVar;
                    com.waze.ui.ab.b bVar;
                    com.waze.ui.ab.d dVar;
                    com.waze.speech.k kVar = (com.waze.speech.k) obj2;
                    Composer composer2 = (Composer) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    h.g.b.x.f((AnimatedContentScope) obj, "$this$AnimatedContent");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(67792789, iIntValue, -1, "com.waze.trip_overview.screen.fragments.TripOverviewRoutesFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous> (TripOverviewRoutesFragment.kt:346)");
                    }
                    ab abVar2 = this.f41212a;
                    if (kVar instanceof ay) {
                        composer2.startReplaceGroup(724364876);
                        ay ayVar = (ay) kVar;
                        com.waze.ae.e eVarB = ayVar.b();
                        if (h.g.b.x.n(eVarB, com.waze.modules.c.a.f29828a)) {
                            bVar = null;
                        } else if (eVarB instanceof com.waze.modules.c.b) {
                            bVar = new com.waze.ui.ab.a(((com.waze.modules.c.b) ayVar.b()).i());
                        } else {
                            if (!(eVarB instanceof com.waze.modules.c.c)) {
                                throw new h.i();
                            }
                            bVar = new com.waze.ui.ab.b(((com.waze.modules.c.c) ayVar.b()).i());
                        }
                        com.waze.modules.c.d dVarA = ayVar.a();
                        com.waze.ui.x.j jVar = com.waze.ui.x.j.f43817a;
                        com.waze.modules.c.d dVar2 = com.waze.modules.c.d.f30033a;
                        cv cvVar = cv.f30013a;
                        int iOrdinal = dVarA.ordinal();
                        if (iOrdinal == 0) {
                            dVar = com.waze.ui.ab.d.f41730a;
                        } else if (iOrdinal == 1) {
                            dVar = com.waze.ui.ab.d.f41731b;
                        } else if (iOrdinal == 2) {
                            dVar = com.waze.ui.ab.d.f41732c;
                        } else if (iOrdinal == 3) {
                            dVar = com.waze.ui.ab.d.f41733d;
                        } else if (iOrdinal == 4) {
                            dVar = com.waze.ui.ab.d.f41734e;
                        } else {
                            if (iOrdinal != 5) {
                                throw new h.i();
                            }
                            dVar = com.waze.ui.ab.d.f41735f;
                        }
                        com.waze.ui.ab.e eVar = new com.waze.ui.ab.e(bVar, dVar);
                        boolean zChangedInstance = composer2.changedInstance(abVar2);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue3 == Composer.Companion.getEmpty()) {
                            objRememberedValue3 = new com.waze.settings.d.a(abVar2, 13);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        com.waze.ui.n.e.f(eVar, (h.g.a.a) objRememberedValue3, composer2, 0);
                        composer2.endReplaceGroup();
                    } else if (kVar instanceof ba) {
                        composer2.startReplaceGroup(724373675);
                        com.waze.ui.ab.l lVar = new com.waze.ui.ab.l(((ba) kVar).a() ? com.waze.ui.ab.k.f41743a : com.waze.ui.ab.k.f41744b);
                        boolean zChangedInstance2 = composer2.changedInstance(abVar2);
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                            objRememberedValue4 = new com.waze.settings.d.a(abVar2, 14);
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        h.g.a.a aVar = (h.g.a.a) objRememberedValue4;
                        boolean zChangedInstance3 = composer2.changedInstance(abVar2);
                        Object objRememberedValue5 = composer2.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                            objRememberedValue5 = new com.waze.settings.d.a(abVar2, 15);
                            composer2.updateRememberedValue(objRememberedValue5);
                        }
                        com.waze.ui.p.t.i(lVar, aVar, (h.g.a.a) objRememberedValue5, composer2, 0);
                        composer2.endReplaceGroup();
                    } else if (kVar instanceof az) {
                        composer2.startReplaceGroup(724385094);
                        az azVar = (az) kVar;
                        cv cvVarA = azVar.a();
                        com.waze.ui.x.j jVar2 = com.waze.ui.x.j.f43817a;
                        com.waze.modules.c.d dVar3 = com.waze.modules.c.d.f30033a;
                        cv cvVar2 = cv.f30013a;
                        int iOrdinal2 = cvVarA.ordinal();
                        if (iOrdinal2 == 0) {
                            nVar = com.waze.ui.ab.n.f41751b;
                        } else if (iOrdinal2 == 1) {
                            nVar = com.waze.ui.ab.n.f41750a;
                        } else {
                            if (iOrdinal2 != 2) {
                                throw new h.i();
                            }
                            nVar = com.waze.ui.ab.n.f41751b;
                        }
                        com.waze.ui.ab.o oVar = new com.waze.ui.ab.o(nVar, azVar.b());
                        boolean zChangedInstance4 = composer2.changedInstance(abVar2);
                        Object objRememberedValue6 = composer2.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                            objRememberedValue6 = new com.waze.settings.d.a(abVar2, 16);
                            composer2.updateRememberedValue(objRememberedValue6);
                        }
                        com.waze.ui.r.a.a.t.f(oVar, (h.g.a.a) objRememberedValue6, composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        if (kVar != null) {
                            composer2.startReplaceGroup(724362128);
                            composer2.endReplaceGroup();
                            throw new h.i();
                        }
                        composer2.startReplaceGroup(981293419);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    return h.ab.f48028a;
                }
            }, composer, 54), composer, 1597824, 42);
            com.waze.ui.ab.m mVar = (com.waze.ui.ab.m) SnapshotStateKt.collectAsState(abVar.h().i(), null, composer, 0, 1).getValue();
            if (mVar == null) {
                composer.startReplaceGroup(462215254);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(462215255);
                boolean zChangedInstance = composer.changedInstance(abVar);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new com.waze.settings.d.a(abVar, 18);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                com.waze.ui.r.a.a.t.g(mVar, (h.g.a.a) objRememberedValue3, composer, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab p(ab abVar) {
        abVar.h().l(er.f41442a);
        abVar.C().setVisibility(0);
        return h.ab.f48028a;
    }

    public static final /* synthetic */ void q(ab abVar, ae aeVar, bs bsVar) {
        if (aeVar.c() != abVar.L().k().g()) {
            abVar.L().g();
        }
        int i2 = abVar.getResources().getConfiguration().orientation;
        View view = abVar.getView();
        RouteHeader routeHeader = view != null ? (RouteHeader) view.findViewById(R.id.tripOverview_fragmentRoutes_routeHeader) : null;
        abVar.L().h(new com.waze.trip_overview.views.trip_details_container.l(aeVar.a(), aeVar.c(), aeVar.b()));
        if (i2 == 2) {
            if (routeHeader != null) {
                int i3 = 8;
                routeHeader.b(bsVar, new com.waze.tide.a.c(abVar, i3), new com.waze.settings.d.a(abVar, 7), new com.waze.settings.d.a(abVar, i3));
            }
            abVar.L().o(bq.f41111a);
            return;
        }
        abVar.L().o(bsVar);
        if (routeHeader != null) {
            routeHeader.b(bq.f41111a, new com.waze.trip_overview.cj(9), new com.waze.bx.a(12), new com.waze.bx.a(13));
        }
    }

    public static final /* synthetic */ void r(final ab abVar, final ac acVar) {
        com.waze.uid.r rVarC = acVar.c();
        final int i2 = 1;
        final int i3 = 0;
        if (rVarC instanceof com.waze.trip_overview.u) {
            CardView cardViewB = abVar.B();
            ViewGroup.LayoutParams layoutParams = cardViewB.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.height = as.e(R.dimen.tripOverviewBottomBarHeight);
            cardViewB.setLayoutParams(layoutParams2);
            abVar.B().setVisibility(0);
            abVar.F().setVisibility(8);
            abVar.E().setVisibility(0);
            abVar.E().setEnabled(true);
            abVar.E().setOnClickListener(new b(abVar, acVar, 1));
            WazeButton wazeButtonE = abVar.E();
            com.waze.shared_infra.o.a aVarJ = abVar.J();
            wazeButtonE.h(aVarJ.c(R.string.TRIP_OVERVIEW_START_DRIVE, new Object[0]));
            if (acVar.b() == null) {
                abVar.E().b();
                abVar.A().setVisibility(8);
                return;
            } else {
                abVar.E().i(acVar.b().b(), acVar.b().a(), new com.waze.design_components.button.timer.d(abVar) { // from class: com.waze.trip_overview.c.a.c

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ ab f41208a;

                    {
                        this.f41208a = abVar;
                    }

                    @Override // com.waze.design_components.button.timer.d
                    public final void a() {
                        int i4 = i2;
                        ac acVar2 = acVar;
                        ab abVar2 = this.f41208a;
                        if (i4 != 0) {
                            ab.u(abVar2, acVar2);
                        } else {
                            ab.t(abVar2, acVar2);
                        }
                    }
                });
                abVar.A().setVisibility(0);
                abVar.A().setOnTouchListener(new com.waze.sharedui.views.ab(abVar, 2));
                return;
            }
        }
        if (!(rVarC instanceof com.waze.trip_overview.r)) {
            if (!h.g.b.x.n(rVarC, com.waze.trip_overview.s.f41493a)) {
                throw new h.i();
            }
            abVar.B().setVisibility(8);
            return;
        }
        CardView cardViewB2 = abVar.B();
        ViewGroup.LayoutParams layoutParams3 = cardViewB2.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        layoutParams4.height = -2;
        cardViewB2.setLayoutParams(layoutParams4);
        abVar.B().setVisibility(0);
        abVar.F().setVisibility(0);
        abVar.E().setVisibility(8);
        final com.waze.trip_overview.r rVar = (com.waze.trip_overview.r) acVar.c();
        abVar.F().e(true);
        abVar.F().i(true);
        abVar.F().g(new View.OnClickListener() { // from class: com.waze.trip_overview.c.a.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ab.v(this.f41147a, rVar, acVar);
            }
        });
        abVar.F().h(new b(abVar, rVar, 0));
        abVar.F().f(abVar.J().c(rVar.b(), new Object[0]));
        abVar.F().j(abVar.J().c(rVar.a(), new Object[0]));
        if (acVar.b() == null) {
            abVar.F().d();
            abVar.A().setVisibility(8);
        } else {
            abVar.F().k(acVar.b().b(), acVar.b().a(), new com.waze.design_components.button.timer.d(abVar) { // from class: com.waze.trip_overview.c.a.c

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ ab f41208a;

                {
                    this.f41208a = abVar;
                }

                @Override // com.waze.design_components.button.timer.d
                public final void a() {
                    int i4 = i3;
                    ac acVar2 = acVar;
                    ab abVar2 = this.f41208a;
                    if (i4 != 0) {
                        ab.u(abVar2, acVar2);
                    } else {
                        ab.t(abVar2, acVar2);
                    }
                }
            });
            abVar.A().setVisibility(0);
            abVar.A().setOnTouchListener(new com.waze.sharedui.views.ab(abVar, 3));
        }
    }

    static final void s(ab abVar, ActivityResult activityResult) {
        h.g.b.x.f(activityResult, "it");
        if (activityResult.getResultCode() == -1) {
            abVar.h().l(em.f41436a);
        } else if (activityResult.getResultCode() == 0) {
            abVar.F().e(true);
            abVar.F().i(true);
            abVar.E().d(true);
            abVar.h().l(el.f41435a);
        }
    }

    static final void t(ab abVar, ac acVar) {
        abVar.F().e(false);
        abVar.F().i(false);
        abVar.h().l(new fb(acVar.c()));
    }

    static final void u(ab abVar, ac acVar) {
        abVar.E().setEnabled(false);
        abVar.h().l(new fb(acVar.c()));
    }

    static final void v(ab abVar, com.waze.trip_overview.r rVar, ac acVar) {
        Intent intentK;
        abVar.F().e(false);
        abVar.F().i(false);
        abVar.h().l(new ez(rVar));
        com.waze.av.b.n nVarA = acVar.a();
        if (nVarA != null) {
            com.waze.trip_overview.r rVar2 = (com.waze.trip_overview.r) acVar.c();
            if (h.g.b.x.n(rVar2, com.waze.trip_overview.o.f41488a) || h.g.b.x.n(rVar2, com.waze.trip_overview.m.f41486a) || h.g.b.x.n(rVar2, com.waze.trip_overview.n.f41487a)) {
                com.waze.av.b.o oVarH = abVar.H();
                Context contextRequireContext = abVar.requireContext();
                h.g.b.x.e(contextRequireContext, "requireContext(...)");
                intentK = oVarH.k(contextRequireContext, nVarA, false);
            } else {
                if (!h.g.b.x.n(rVar2, com.waze.trip_overview.p.f41489a) && !h.g.b.x.n(rVar2, com.waze.trip_overview.q.f41490a)) {
                    throw new h.i();
                }
                com.waze.av.b.o oVarH2 = abVar.H();
                Context contextRequireContext2 = abVar.requireContext();
                h.g.b.x.e(contextRequireContext2, "requireContext(...)");
                intentK = oVarH2.k(contextRequireContext2, nVarA, true);
            }
            abVar.f41152a.launch(intentK);
        }
    }

    static final void w(ab abVar, com.waze.trip_overview.r rVar) {
        abVar.F().e(false);
        abVar.F().i(false);
        abVar.h().l(new ee(rVar));
    }

    static final void x(ab abVar, ac acVar) {
        abVar.E().setEnabled(false);
        abVar.h().l(new ee(acVar.c()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b3  */
    /* JADX WARN: Type inference failed for: r2v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.waze.map.b.am] */
    /* JADX WARN: Type inference failed for: r2v12, types: [com.waze.map.b.am] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.waze.shared_infra.s.d] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.waze.map.b.am] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.waze.map.b.am] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void y(com.waze.trip_overview.c.a.ab r19, com.waze.uid.c.al r20) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.trip_overview.c.a.ab.y(com.waze.trip_overview.c.a.ab, com.waze.uid.c.al):void");
    }

    public final ao h() {
        return (ao) this.f41159h.getValue();
    }

    @Override // org.a.a.b.a
    public final org.a.d.k.b l() {
        return (org.a.d.k.b) this.f41154c.getValue();
    }

    @Override // org.a.a.b.a
    public final /* synthetic */ void m() {
    }

    @Override // android.support.v4.app.ar
    /* renamed from: onCreate */
    public final void m37lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m37lambda$performCreate$3$androidsupportv4appFragment(bundle);
        Resources resources = requireContext().getResources();
        h.g.b.x.e(resources, "getResources(...)");
        if (com.waze.ad.a.j.p(resources)) {
            setExitTransition(K().c(e.c.d.a.r(Integer.valueOf(R.id.tripOverviewDetails), Integer.valueOf(R.id.tripOverview_fragmentRoutes_mainButtonCard))));
        }
    }

    @Override // android.support.v4.app.ar
    public final void onDestroyView() {
        F().d();
        E().b();
        L().v(null);
        super.onDestroyView();
    }

    @Override // android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        kotlinx.coroutines.b.k kVarN;
        h.g.b.x.f(view, "view");
        I().a("TripOverviewRoutesFragment - view created!");
        int i2 = 1;
        ((ComposeView) view.findViewById(R.id.tripOverview_fragmentRoutes_composeContent)).setContent(ComposableLambdaKt.composableLambdaInstance(351613531, true, new com.waze.z.a.c.n(this, 14)));
        com.waze.ad.a.j.s(this, new com.waze.settings.d.a(this, 12));
        ao aoVarH = h();
        Resources resources = requireContext().getResources();
        h.g.b.x.e(resources, "getResources(...)");
        aoVarH.l(new ep(com.waze.ad.a.j.p(resources)));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        h.g.b.x.e(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner);
        kotlinx.coroutines.aj.z(lifecycleScope, null, null, new i(this, view, (h.c.e) null, 4, (short[]) null), 3);
        RouteHeader routeHeader = (RouteHeader) view.findViewById(R.id.tripOverview_fragmentRoutes_routeHeader);
        routeHeader.setContentDescription("TRIP_OVERVIEW_HEADER_FROM_TO_LABEL");
        int i3 = 19;
        routeHeader.d(new com.waze.profile.m(this, i3));
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(h().c(), new q(routeHeader, (h.c.e) null, 6)), lifecycleScope);
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(h().d(), new q(this, (h.c.e) null, 7, (float[]) null)), lifecycleScope);
        L().v(new d(this, null));
        L().w(new d(this));
        L().t(new d(this));
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(kotlinx.coroutines.b.ai.q(h().g(), h().k(), new w(null, 0)), new q(this, (h.c.e) null, 8, (byte[][]) null)), lifecycleScope);
        View viewFindViewById = view.findViewById(R.id.tripOverview_fragmentRoutes_landscape_viewport);
        Resources resources2 = requireContext().getResources();
        h.g.b.x.e(resources2, "getResources(...)");
        if (com.waze.ad.a.j.p(resources2)) {
            kotlinx.coroutines.aj.z(lifecycleScope, null, null, new y(this, null, 0), 3);
        }
        if (viewFindViewById == null) {
            h.g.b.x.c(routeHeader);
            kVarN = kotlinx.coroutines.b.ai.F(L().b(), h().h(), new p(this, view, routeHeader, null));
        } else {
            kVarN = kotlinx.coroutines.b.ai.n(new t(viewFindViewById, (h.c.e) null, 1));
        }
        kotlinx.coroutines.aj.z(lifecycleScope, null, null, new n(h().e(), kVarN, this, null), 3);
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(h().b(), new q(this, (h.c.e) null, 1, (byte[]) null)), lifecycleScope);
        kotlinx.coroutines.aj.z(lifecycleScope, null, null, new y(this, null, 1, null), 3);
        kotlinx.coroutines.aj.z(lifecycleScope, null, null, new t(this, (h.c.e) null, 0), 3);
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(h().a(), new u(this, null)), lifecycleScope);
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(G().o(), new q(this, (h.c.e) null, 3, (short[]) null)), lifecycleScope);
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(G().v(), new q(this, (h.c.e) null, 4, (int[]) null)), lifecycleScope);
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(G().s(), new q(this, (h.c.e) null, 5, (boolean[]) null)), lifecycleScope);
        View viewFindViewById2 = requireView().findViewById(R.id.tripOverview_fragmentRoutes_routeSettingsButton);
        h.g.b.x.e(viewFindViewById2, "findViewById(...)");
        ((ComposeView) viewFindViewById2).setContent(ComposableLambdaKt.composableLambdaInstance(-1451507068, true, new com.waze.z.a.c.n(this, 15)));
        D().setContent(ComposableLambdaKt.composableLambdaInstance(-1583830813, true, new com.waze.z.a.c.n(this, 16)));
        C().setContent(ComposableLambdaKt.composableLambdaInstance(-582609808, true, new com.waze.z.a.c.n(this, i3)));
        View viewFindViewById3 = view.findViewById(R.id.tripOverview_rootWithoutMap);
        h.g.b.x.e(viewFindViewById3, "findViewById(...)");
        h.g.b.x.c(routeHeader);
        ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById3, new com.waze.feedback.a(viewFindViewById3, routeHeader, this, i2));
    }
}
