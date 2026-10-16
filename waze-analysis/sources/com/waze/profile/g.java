package com.waze.profile;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.av;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import com.waze.car_lib.r.cq;
import com.waze.navigate.gn;
import com.waze.settings.cs;
import com.waze.sharedui.views.ap;
import com.waze.sharedui.web.aq;
import com.waze.sharedui.web.w;
import com.waze.sharedui.web.y;
import h.ab;
import h.g.b.x;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g extends com.waze.app_nav.a.b implements org.a.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f33386a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f33387b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f33388c;

    /* renamed from: d, reason: collision with root package name */
    private final h.f f33389d;

    /* renamed from: e, reason: collision with root package name */
    private final h.f f33390e;

    public g() {
        g gVar = this;
        this.f33386a = org.a.b.b.d.a(gVar);
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ChangePasswordFragment");
        x.e(eVarD, "create(...)");
        this.f33388c = eVarD;
        this.f33389d = h.g.b(h.h.f48132c, new f(gVar, new e(gVar)));
        this.f33390e = h.g.a(new gn(this, 13));
    }

    public static /* synthetic */ ab f(g gVar, Composer composer, int i2) {
        int i3 = 2;
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1856072999, i2, -1, "com.waze.profile.ChangePasswordFragment.onCreateView.<anonymous>.<anonymous> (ChangePasswordFragment.kt:61)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(gVar.k().a(), null, composer, 0, 1);
            Integer numB = n(stateCollectAsState).b();
            boolean zChanged = composer.changed(stateCollectAsState) | composer.changedInstance(gVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (h.g.a.p) new c(stateCollectAsState, gVar, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(numB, (h.g.a.p<? super af, ? super h.c.e<? super ab>, ? extends Object>) objRememberedValue, composer, 0);
            cq.k(false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1859177579, true, new com.waze.parking.f(gVar, stateCollectAsState, i3), composer, 54), composer, 196608);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public static /* synthetic */ ab g(g gVar, State state, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1859177579, i2, -1, "com.waze.profile.ChangePasswordFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (ChangePasswordFragment.kt:64)");
            }
            Modifier modifierImePadding = WindowInsetsPadding_androidKt.imePadding(BackgroundKt.m1972backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), com.waze.bz.a.d(composer, 0).h(), null, 2, null));
            if (((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 1) {
                modifierImePadding = WindowInsetsPadding_androidKt.navigationBarsPadding(modifierImePadding);
            }
            Modifier modifier = modifierImePadding;
            aq aqVarA = n(state).a();
            boolean zChangedInstance = composer.changedInstance(gVar);
            d dVarRememberedValue = composer.rememberedValue();
            if (zChangedInstance || dVarRememberedValue == Composer.Companion.getEmpty()) {
                dVarRememberedValue = new d(gVar);
                composer.updateRememberedValue(dVarRememberedValue);
            }
            ap.f(modifier, aqVarA, (h.g.a.l) dVarRememberedValue, new com.waze.sharedui.web.m(new a(gVar), "passwordInterface"), composer, 0, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public static final /* synthetic */ void h(g gVar, y yVar) {
        if (x.n(yVar, com.waze.sharedui.web.t.f39369a)) {
            gVar.p();
            return;
        }
        if (x.n(yVar, com.waze.sharedui.web.u.f39370a)) {
            gVar.q();
            return;
        }
        if (!(yVar instanceof com.waze.sharedui.web.v)) {
            if (!x.n(yVar, w.f39372a) && !x.n(yVar, com.waze.sharedui.web.x.f39373a)) {
                throw new h.i();
            }
        } else if (((com.waze.sharedui.web.v) yVar).a()) {
            gVar.k().b(q.f33410a);
        } else {
            gVar.q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h k() {
        return (h) this.f33389d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v n(State state) {
        return (v) state.getValue();
    }

    private final cs o() {
        return (cs) this.f33390e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        k().b(p.f33409a);
    }

    private final void q() {
        k().b(r.f33411a);
    }

    public final void j(int i2) {
        cs csVarO;
        if (i2 != -1) {
            if (i2 == 0 && (csVarO = o()) != null) {
                csVarO.b(0);
                return;
            }
            return;
        }
        cs csVarO2 = o();
        if (csVarO2 != null) {
            csVarO2.b(3);
        }
    }

    @Override // org.a.a.b.a
    public final org.a.d.k.b l() {
        return (org.a.d.k.b) this.f33386a.getValue();
    }

    @Override // org.a.a.b.a
    public final /* synthetic */ void m() {
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        x.f(layoutInflater, "inflater");
        com.waze.ad.a.j.r(this, this, new b(this));
        Context contextRequireContext = requireContext();
        x.e(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1856072999, true, new com.waze.beacons.a.c(this, 15)));
        return composeView;
    }

    @Override // android.support.v4.app.ar
    public final void onDestroyView() {
        av activity;
        super.onDestroyView();
        if (isRemoving() || ((activity = getActivity()) != null && activity.isFinishing())) {
            k().b(t.f33413a);
        }
    }

    @Override // android.support.v4.app.ar
    public final void onPause() {
        Window window;
        super.onPause();
        Integer num = this.f33387b;
        if (num != null) {
            int iIntValue = num.intValue();
            av activity = getActivity();
            if (activity == null || (window = activity.getWindow()) == null) {
                return;
            }
            window.setSoftInputMode(iIntValue);
        }
    }

    @Override // android.support.v4.app.ar
    public final void onResume() {
        Window window;
        super.onResume();
        av activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        this.f33387b = attributes != null ? Integer.valueOf(attributes.softInputMode) : this.f33387b;
        window.setSoftInputMode(16);
    }
}
