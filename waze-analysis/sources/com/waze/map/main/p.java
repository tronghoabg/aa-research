package com.waze.map.main;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.webkit.UserAgentMetadata;
import com.waze.R;
import com.waze.ads.AdsNativeManager;
import com.waze.map.MapViewChooser;
import com.waze.map.b.ed;
import com.waze.map.dr;
import com.waze.navigate.AddressItem;
import com.waze.navigate.cs;
import com.waze.reports_v2.c.dk;
import com.waze.strings.DisplayStrings;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class p extends android.support.v4.app.ar implements org.a.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.b.ai f29452a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f29453b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f29454c;

    /* renamed from: d, reason: collision with root package name */
    private final h.f f29455d;

    /* renamed from: e, reason: collision with root package name */
    private final h.f f29456e;

    /* renamed from: f, reason: collision with root package name */
    private final h.f f29457f;

    /* renamed from: g, reason: collision with root package name */
    private final h.f f29458g;

    /* renamed from: h, reason: collision with root package name */
    private final h.f f29459h;

    /* renamed from: i, reason: collision with root package name */
    private final h.f f29460i;

    /* renamed from: j, reason: collision with root package name */
    private final h.f f29461j;

    /* renamed from: k, reason: collision with root package name */
    private final h.f f29462k;

    /* renamed from: l, reason: collision with root package name */
    private final h.f f29463l;
    private final h.f m;
    private final h.f n;
    private final h.f o;
    private final h.f p;
    private final h.f q;
    private final LifecycleEventObserver r;
    private a s;
    private final ActivityResultLauncher t;
    private final h.f u;
    private final h.f v;

    public p(com.waze.map.b.ai aiVar) {
        h.g.b.x.f(aiVar, "mapController");
        this.f29452a = aiVar;
        p pVar = this;
        this.f29453b = org.a.b.b.d.a(pVar);
        this.f29454c = h.g.b(h.h.f48132c, new o(pVar, new n(pVar)));
        p pVar2 = this;
        h.h hVar = h.h.f48130a;
        this.f29455d = h.g.b(hVar, new c(pVar2, 7));
        this.f29456e = h.g.b(hVar, new c(pVar2, 8));
        this.f29457f = h.g.b(hVar, new c(pVar2, 9));
        this.f29458g = h.g.b(hVar, new c(pVar2, 10));
        this.f29459h = h.g.b(hVar, new c(pVar2, 11));
        this.f29460i = h.g.b(hVar, new c(pVar2, 12));
        this.f29461j = h.g.b(hVar, new c(pVar2, 13));
        this.f29462k = h.g.b(hVar, new c(pVar2, 14));
        this.f29463l = h.g.b(hVar, new c(pVar2, 15));
        this.m = h.g.b(hVar, new c(pVar2, 2));
        this.n = h.g.b(hVar, new c(pVar2, 3));
        this.o = h.g.b(hVar, new c(pVar2, 4));
        this.p = h.g.b(hVar, new c(pVar2, 5));
        this.q = h.g.b(hVar, new c(pVar2, 6));
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.waze.map.main.f
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                p.t(this.f29424a, lifecycleOwner, event);
            }
        };
        this.r = lifecycleEventObserver;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.waze.map.main.g
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                p.s(this.f29425a, (ActivityResult) obj);
            }
        });
        h.g.b.x.e(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.t = activityResultLauncherRegisterForActivityResult;
        getLifecycle().addObserver(lifecycleEventObserver);
        this.u = h.g.a(new com.waze.car_lib.e.e(this, 11));
        this.v = h.g.a(new com.waze.car_lib.e.e(this, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bm A() {
        return (bm) this.f29454c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.waze.shared_infra.i.e B() {
        return (com.waze.shared_infra.i.e) this.m.getValue();
    }

    private final com.waze.shared_infra.o.a C() {
        return (com.waze.shared_infra.o.a) this.f29462k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.waze.view.popups.b.m D() {
        return (com.waze.view.popups.b.m) this.f29460i.getValue();
    }

    private final void E(com.waze.app_nav.hub.b.k kVar) {
        x().b(kVar);
        kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new m(this, kVar, (h.c.e) null, 3), 3);
    }

    public static final /* synthetic */ AdsNativeManager b(p pVar) {
        return (AdsNativeManager) pVar.q.getValue();
    }

    public static /* synthetic */ com.waze.app_nav.hub.b.i d(p pVar, Context context) {
        h.g.b.x.f(context, "context");
        com.waze.ab.v vVar = new com.waze.ab.v(context, pVar.C().c(R.string.PARKED_UPDATED, new Object[0]), R.drawable.bigblue_v_icon, true);
        vVar.show();
        return com.waze.app_nav.hub.b.m.a(vVar);
    }

    public static /* synthetic */ com.waze.app_nav.hub.b.i e(p pVar, Context context) {
        h.g.b.x.f(context, "context");
        com.waze.ab.v vVar = new com.waze.ab.v(context, pVar.C().c(R.string.PARKED_REMOVED, new Object[0]), R.drawable.bigblue_x_icon, true);
        vVar.show();
        return com.waze.app_nav.hub.b.m.a(vVar);
    }

    public static final /* synthetic */ a f(p pVar) {
        a aVar = pVar.s;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final /* synthetic */ z h(p pVar) {
        return (z) pVar.p.getValue();
    }

    public static final /* synthetic */ com.waze.modules.navigation.bp j(p pVar) {
        return (com.waze.modules.navigation.bp) pVar.n.getValue();
    }

    public static final /* synthetic */ dk k(p pVar) {
        return (dk) pVar.o.getValue();
    }

    public static /* synthetic */ h.ab p(com.waze.map.g.s sVar, p pVar, LifecycleCoroutineScope lifecycleCoroutineScope, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1644867049, i2, -1, "com.waze.map.main.MainMapFragment.onViewCreated.<anonymous>.<anonymous> (MainMapFragment.kt:147)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(sVar.m(), null, composer, 0, 1);
            State stateCollectAsState2 = SnapshotStateKt.collectAsState(pVar.z().b(lifecycleCoroutineScope), null, composer, 0, 1);
            com.waze.ui.p.i iVarF = com.waze.ui.p.t.f((ed) stateCollectAsState.getValue(), w(stateCollectAsState2), composer, 0);
            iVarF.f(w(stateCollectAsState2));
            com.waze.ui.p.t.b(iVarF, null, true, dr.f28764a, false, composer, DisplayStrings.DS_CATEGORY_SEARCH_AMENITIES_FILTER_CHARGING_STATION, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    public static final /* synthetic */ void q(final p pVar) {
        com.waze.ab.o oVar = new com.waze.ab.o();
        oVar.Q(pVar.C().c(R.string.PARKED_REMOVE_CONFIRM_TITLE, new Object[0]));
        oVar.P(pVar.C().c(R.string.PARKED_REMOVE_CONFIRM_TEXT, new Object[0]));
        oVar.f13808a = new com.waze.ab.q() { // from class: com.waze.map.main.e
            @Override // com.waze.ab.q
            public final void onClick(boolean z) {
                p.v(this.f29423a);
            }
        };
        oVar.M(pVar.C().c(R.string.PARKED_REMOVE_CONFIRM_IRRELEVANT, new Object[0]));
        oVar.N(pVar.C().c(R.string.PARKED_REMOVE_CONFIRM_WRONG_LOCATION, new Object[0]));
        oVar.R(true);
        com.waze.z.a.d.ai.q(oVar);
    }

    public static final /* synthetic */ void r(p pVar, int i2, AddressItem addressItem, int i3, AddressItem addressItem2) {
        cs csVar = new cs(addressItem);
        if (i2 == 8) {
            csVar.j();
            csVar.h(addressItem2);
            csVar.m(i3 < 0 ? null : Integer.valueOf(i3));
            csVar.e(true);
        }
        pVar.startActivity(csVar.a(pVar.getContext()));
        pVar.A().C(ax.f29357a);
    }

    static final void s(p pVar, ActivityResult activityResult) {
        h.g.b.x.f(activityResult, "result");
        if (activityResult.getResultCode() == 8) {
            pVar.E((com.waze.app_nav.hub.b.k) pVar.u.getValue());
        }
    }

    static final void t(p pVar, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        h.g.b.x.f(lifecycleOwner, "<unused var>");
        h.g.b.x.f(event, NotificationCompat.CATEGORY_EVENT);
        com.waze.shared_infra.i.e eVarB = pVar.B();
        int iIdentityHashCode = System.identityHashCode(pVar);
        String strName = event.name();
        String strName2 = event.getTargetState().name();
        Configuration configuration = pVar.getResources().getConfiguration();
        boolean z = false;
        if (configuration != null && configuration.orientation == 2) {
            z = true;
        }
        eVarB.a("FragmentInstance(" + iIdentityHashCode + " name:" + strName + ", target: " + strName2 + ", isLandscape: " + z);
        pVar.A().C(new aw(event));
    }

    static final void v(p pVar) {
        pVar.A().D(com.waze.parking.a.f32941c);
        pVar.E((com.waze.app_nav.hub.b.k) pVar.v.getValue());
    }

    private static final Rect w(State state) {
        return (Rect) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.waze.app_nav.hub.b.c x() {
        return (com.waze.app_nav.hub.b.c) this.f29463l.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b y() {
        return (b) this.f29455d.getValue();
    }

    private final af z() {
        return (af) this.f29459h.getValue();
    }

    @Override // org.a.a.b.a
    public final org.a.d.k.b l() {
        return (org.a.d.k.b) this.f29453b.getValue();
    }

    @Override // org.a.a.b.a
    public final /* synthetic */ void m() {
    }

    @Override // android.support.v4.app.ar, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        h.g.b.x.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        A().F(configuration.orientation == 2);
        bm bmVarA = A();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        h.g.b.x.e(displayMetrics, "getDisplayMetrics(...)");
        bmVarA.E(displayMetrics);
    }

    @Override // android.support.v4.app.ar
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context;
        h.g.b.x.f(layoutInflater, "inflater");
        if (viewGroup == null || (context = viewGroup.getContext()) == null) {
            context = layoutInflater.getContext();
        }
        return new FrameLayout(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        com.waze.map.bq bqVar;
        p pVar = this;
        h.g.b.x.f(view, "view");
        FrameLayout frameLayout = (FrameLayout) view;
        Lifecycle lifecycle = pVar.getViewLifecycleOwner().getLifecycle();
        LifecycleOwner viewLifecycleOwner = pVar.getViewLifecycleOwner();
        h.g.b.x.e(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner);
        boolean z = false;
        int i2 = 2;
        AttributeSet attributeSet = null;
        Object[] objArr = 0;
        if (pVar.y().b()) {
            pVar.B().a("building a main map using WazeMap and compose");
            org.a.d.i.b bVarF = com.waze.ch.a.a.f.f(UserAgentMetadata.FORM_FACTOR_MOBILE);
            org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d(pVar);
            int i3 = h.g.b.ar.f48106a;
            ed edVar = (ed) bVarD.a(new h.g.b.m(ed.class), bVarF, null);
            kotlinx.coroutines.aj.z(lifecycleScope, null, null, new m(edVar, pVar, (h.c.e) null, 0), 3);
            com.waze.map.g.g gVar = (com.waze.map.g.g) pVar.f29458g.getValue();
            u uVar = new u(pVar.z().c(), 1);
            h.g.b.x.f(lifecycle, "lifecycle");
            h.g.b.x.f(uVar, "userLocationPositionBottomOffsetPx");
            h.g.b.x.f(edVar, "mapController");
            com.waze.map.g.s sVarA = gVar.a(LifecycleKt.getCoroutineScope(lifecycle), uVar, edVar);
            Context context = frameLayout.getContext();
            h.g.b.x.e(context, "getContext(...)");
            ComposeView composeView = new ComposeView(context, null, 0, 6, null);
            frameLayout.addView(composeView, new FrameLayout.LayoutParams(-1, -1));
            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1804916307, true, new com.waze.c.e.x(sVarA, pVar, lifecycleScope, 6, (byte[]) null)));
            pVar.f29452a.j(sVarA);
        } else {
            pVar.B().a("building a main map using main canvas and MapViewChooser");
            Context context2 = frameLayout.getContext();
            h.g.b.x.e(context2, "getContext(...)");
            MapViewChooser mapViewChooser = new MapViewChooser(context2, attributeSet, i2, objArr == true ? 1 : 0);
            mapViewChooser.g();
            mapViewChooser.e(com.waze.map.canvas.q.f28654a.a());
            mapViewChooser.d(lifecycle);
            frameLayout.addView(mapViewChooser, new FrameLayout.LayoutParams(-1, -1));
            pVar.f29452a.j(com.waze.map.canvas.m.d((com.waze.map.canvas.u) pVar.f29456e.getValue(), pVar.getViewLifecycleOwner().getLifecycle(), mapViewChooser, (com.waze.map.canvas.v) pVar.f29457f.getValue(), pVar.z().c(), pVar.z()));
            LifecycleCoroutineScope lifecycleCoroutineScope = lifecycleScope;
            kotlinx.coroutines.aj.z(lifecycleCoroutineScope, null, null, new m(pVar, mapViewChooser, (h.c.e) null, 2), 3);
            kotlinx.coroutines.aj.z(lifecycleCoroutineScope, null, null, new bl(pVar, (h.c.e) null, 1), 3);
        }
        bm bmVarA = pVar.A();
        Configuration configuration = pVar.getResources().getConfiguration();
        if (configuration != null && configuration.orientation == 2) {
            z = true;
        }
        bmVarA.F(z);
        bm bmVarA2 = pVar.A();
        DisplayMetrics displayMetrics = pVar.getResources().getDisplayMetrics();
        h.g.b.x.e(displayMetrics, "getDisplayMetrics(...)");
        bmVarA2.E(displayMetrics);
        boolean zB = pVar.y().b();
        boolean z2 = !zB;
        com.waze.map.bq bqVar2 = new com.waze.map.bq(frameLayout.getContext());
        bqVar2.k(z2);
        bqVar2.l(pVar.getLifecycle(), pVar.D());
        frameLayout.addView(bqVar2, new FrameLayout.LayoutParams(-1, -1));
        bqVar2.m(new j(z2, new h.g.b.aq(), pVar, bqVar2));
        if (zB) {
            ch chVarI = ((com.waze.view.popups.a.aa) pVar.f29461j.getValue()).i();
            LifecycleOwner viewLifecycleOwner2 = pVar.getViewLifecycleOwner();
            h.g.b.x.e(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
            LifecycleCoroutineScope lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2);
            h.g.b.aq aqVar = new h.g.b.aq();
            int i4 = kotlinx.coroutines.av.f51370a;
            bqVar = bqVar2;
            pVar = this;
            kotlinx.coroutines.aj.z(lifecycleScope2, kotlinx.coroutines.e.ac.f51860a.c(), null, new i(chVarI, bqVar2, aqVar, this, (h.c.e) null, 1), 2);
        } else {
            bqVar = bqVar2;
        }
        LifecycleOwner viewLifecycleOwner3 = pVar.getViewLifecycleOwner();
        h.g.b.x.e(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3), null, null, new m(pVar, bqVar, (h.c.e) null, 1), 3);
    }

    public final void u(a aVar) {
        this.s = aVar;
    }
}
