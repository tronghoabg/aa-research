package com.waze.reports;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class z extends android.support.v4.app.ar implements org.a.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f33979a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f33980b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f33981c = h.g.b(h.h.f48130a, new w(this));

    public z() {
        z zVar = this;
        this.f33979a = org.a.b.b.d.a(zVar);
        this.f33980b = h.g.b(h.h.f48132c, new y(zVar, new x(zVar)));
    }

    private static final ac a(State state) {
        return (ac) state.getValue();
    }

    private final ak b() {
        return (ak) this.f33980b.getValue();
    }

    private final com.waze.shared_infra.o.a c() {
        return (com.waze.shared_infra.o.a) this.f33981c.getValue();
    }

    public static /* synthetic */ h.ab i(kotlinx.coroutines.b.ch chVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(406408380, i2, -1, "com.waze.reports.EditMapLocationFragmentExt.setupWazeMap.<anonymous>.<anonymous> (EditMapLocationFragmentExt.kt:48)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(chVar, null, composer, 0, 1);
            ee.c(com.waze.ui.p.t.f(a(stateCollectAsState).a(), null, composer, 2), a(stateCollectAsState).c(), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    public static final /* synthetic */ String n(z zVar, com.waze.reports_v2.presentation.p pVar) {
        if (h.g.b.x.n(pVar, com.waze.places.d.f33105a)) {
            return zVar.c().c(R.string.CARPOOL_LOCATION_PICKER_LOCATING, new Object[0]);
        }
        if (pVar instanceof com.waze.places.e) {
            com.waze.places.e eVar = (com.waze.places.e) pVar;
            String strA = eVar.a();
            return (strA == null || strA.length() == 0) ? zVar.c().c(R.string.STREETSROAD_WITHOUT_A_NAME, new Object[0]) : eVar.a();
        }
        if (pVar instanceof com.waze.places.c) {
            return ((com.waze.places.c) pVar).a();
        }
        if (h.g.b.x.n(pVar, com.waze.places.b.f33103a)) {
            return zVar.c().c(R.string.CARPOOL_LOCATION_PICKER_UNKNOWN_ADDRESS, new Object[0]);
        }
        throw new h.i();
    }

    public final kotlinx.coroutines.b.ch j() {
        return b().h();
    }

    protected final void k(FrameLayout frameLayout, com.waze.shared_infra.h.c cVar, boolean z, h.g.a.l lVar, h.g.a.l lVar2) {
        h.g.b.x.f(frameLayout, "mapContainer");
        h.g.b.x.f(cVar, "initialCoordinate");
        h.g.b.x.f(lVar, "onLocationPickerCanConfirmLocationChanged");
        h.g.b.x.f(lVar2, "onFormattedPlaceNameChanged");
        b().i(cVar, z);
        kotlinx.coroutines.b.ch chVarH = b().h();
        Context contextRequireContext = requireContext();
        h.g.b.x.e(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        frameLayout.removeAllViews();
        frameLayout.addView(composeView, new FrameLayout.LayoutParams(-1, -1));
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(904214528, true, new com.waze.beacons.a.c(chVarH, 18)));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        h.g.b.x.e(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ah(chVarH, lVar, (h.c.e) null, 1), 3);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        h.g.b.x.e(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new v(chVarH, this, lVar2, null), 3);
    }

    @Override // org.a.a.b.a
    public final org.a.d.k.b l() {
        return (org.a.d.k.b) this.f33979a.getValue();
    }

    @Override // org.a.a.b.a
    public final /* synthetic */ void m() {
    }
}
