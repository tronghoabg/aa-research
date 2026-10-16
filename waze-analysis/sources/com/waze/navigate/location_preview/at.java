package com.waze.navigate.location_preview;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.ui.m.dc;
import com.waze.ui.m.dl;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class at extends android.support.v4.app.ar implements org.a.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final bk f31573a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f31574b;

    /* renamed from: c, reason: collision with root package name */
    private bn f31575c;

    public at() {
        at atVar = this;
        this.f31573a = new bk(atVar, new an(this, 0));
        this.f31574b = org.a.b.b.d.a(atVar);
    }

    public static /* synthetic */ h.ab c(at atVar, h.g.a.l lVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2046323169, i2, -1, "com.waze.navigate.location_preview.LocationPreviewFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (LocationPreviewFragment.kt:52)");
            }
            bn bnVar = atVar.f31575c;
            if (bnVar == null) {
                h.g.b.x.j("viewModel");
                bnVar = null;
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(bnVar.f(), null, composer, 0, 1);
            dc.P(d(stateCollectAsState).i(), composer, 0);
            dl dlVarD = d(stateCollectAsState);
            android.support.v4.app.av activity = atVar.getActivity();
            dc.n(dlVarD, lVar, activity instanceof LocationPreviewActivity ? (LocationPreviewActivity) activity : null, composer, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    private static final dl d(State state) {
        return (dl) state.getValue();
    }

    @Override // org.a.a.b.a
    public final org.a.d.k.b l() {
        return (org.a.d.k.b) this.f31574b.getValue();
    }

    @Override // org.a.a.b.a
    public final /* synthetic */ void m() {
    }

    @Override // android.support.v4.app.ar
    public final void onAttach(Context context) {
        h.g.b.x.f(context, "context");
        super.onAttach(context);
        this.f31573a.b();
        l().i(((org.a.a.b.a) requireActivity()).l());
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.g.b.x.f(layoutInflater, "inflater");
        android.support.v4.app.av avVarRequireActivity = requireActivity();
        h.g.b.x.e(avVarRequireActivity, "requireActivity(...)");
        bn bnVar = (bn) h.g.b(h.h.f48132c, new ap(avVarRequireActivity)).getValue();
        this.f31575c = bnVar;
        bn bnVar2 = null;
        if (bnVar == null) {
            h.g.b.x.j("viewModel");
            bnVar = null;
        }
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(bnVar.c(), new aq(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        bn bnVar3 = this.f31575c;
        if (bnVar3 == null) {
            h.g.b.x.j("viewModel");
        } else {
            bnVar2 = bnVar3;
        }
        bnVar2.g(bundle == null);
        Context contextRequireContext = requireContext();
        h.g.b.x.e(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1267553437, true, new com.waze.v.a(this, new h.g.a.l() { // from class: com.waze.navigate.location_preview.ao
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                com.waze.ui.m.cb cbVar = (com.waze.ui.m.cb) obj;
                h.g.b.x.f(cbVar, NotificationCompat.CATEGORY_EVENT);
                at atVar = this.f31561a;
                kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(atVar), null, null, new ar(atVar, cbVar, (h.c.e) null, 0), 3);
                return h.ab.f48028a;
            }
        }, 13)));
        return composeView;
    }

    @Override // android.support.v4.app.ar
    public final void onDestroyView() {
        this.f31573a.c();
        super.onDestroyView();
    }
}
