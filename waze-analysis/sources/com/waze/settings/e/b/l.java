package com.waze.settings.e.b;

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
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.bs;
import com.waze.car_lib.r.cq;
import com.waze.settings.cs;
import com.waze.ui.k.q;
import com.waze.z.a.c.n;
import h.ab;
import h.g.b.x;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l extends com.waze.app_nav.a.b implements org.a.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f37146a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f37147b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f37148c = h.g.b(h.h.f48130a, new i(this));

    /* renamed from: d, reason: collision with root package name */
    private final h.f f37149d = h.g.a(new com.waze.bk.f(this, 10));

    public l() {
        l lVar = this;
        this.f37146a = org.a.b.b.d.a(lVar);
        this.f37147b = h.g.b(h.h.f48132c, new k(lVar, new j(lVar)));
    }

    public static final /* synthetic */ bs c(l lVar) {
        return (bs) lVar.f37148c.getValue();
    }

    public static final /* synthetic */ cs d(l lVar) {
        return (cs) lVar.f37149d.getValue();
    }

    public static /* synthetic */ ab f(l lVar, State state, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1495676704, i2, -1, "com.waze.settings.hnc.presentation.HncSettingsFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (HncSettingsFragment.kt:50)");
            }
            com.waze.ui.k.i iVar = (com.waze.ui.k.i) state.getValue();
            m mVarH = lVar.h();
            boolean zChangedInstance = composer.changedInstance(mVarH);
            h hVarRememberedValue = composer.rememberedValue();
            if (zChangedInstance || hVarRememberedValue == Composer.Companion.getEmpty()) {
                hVarRememberedValue = new h(mVarH);
                composer.updateRememberedValue(hVarRememberedValue);
            }
            q.c(iVar, (h.g.a.l) hVarRememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public static /* synthetic */ ab g(l lVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-759143900, i2, -1, "com.waze.settings.hnc.presentation.HncSettingsFragment.onCreateView.<anonymous>.<anonymous> (HncSettingsFragment.kt:48)");
            }
            cq.k(false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1495676704, true, new com.waze.parking.f(lVar, SnapshotStateKt.collectAsState(lVar.h().b(), null, composer, 0, 1), 5), composer, 54), composer, 196608);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m h() {
        return (m) this.f37147b.getValue();
    }

    @Override // org.a.a.b.a
    public final org.a.d.k.b l() {
        return (org.a.d.k.b) this.f37146a.getValue();
    }

    @Override // org.a.a.b.a
    public final /* synthetic */ void m() {
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        x.f(layoutInflater, "inflater");
        Context contextRequireContext = requireContext();
        x.e(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-759143900, true, new n(this, 5)));
        return composeView;
    }

    @Override // com.waze.app_nav.a.b, android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        x.f(view, "view");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        x.e(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        aj.z(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new g(this, null), 3);
    }
}
