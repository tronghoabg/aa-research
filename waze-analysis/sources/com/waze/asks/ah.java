package com.waze.asks;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.dv;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ah extends com.waze.app_nav.a.b implements org.a.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f15494a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f15495b;

    /* renamed from: c, reason: collision with root package name */
    private final MutableIntState f15496c = SnapshotIntStateKt.mutableIntStateOf(0);

    /* renamed from: d, reason: collision with root package name */
    private com.waze.main_screen.af.b.f f15497d;

    public ah() {
        ah ahVar = this;
        this.f15494a = org.a.b.b.d.a(ahVar);
        this.f15495b = h.g.b(h.h.f48132c, new ag(ahVar, new af(ahVar)));
    }

    public static /* synthetic */ h.ab d(ah ahVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-337307724, i2, -1, "com.waze.asks.WazeAsksFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (WazeAsksFragment.kt:66)");
            }
            com.waze.ui.d.t tVar = (com.waze.ui.d.t) SnapshotStateKt.collectAsState(ahVar.i().f(), null, composer, 0, 1).getValue();
            if (tVar == null) {
                composer.startReplaceGroup(1489156733);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1489156734);
                bj bjVarI = ahVar.i();
                boolean zChangedInstance = composer.changedInstance(bjVarI);
                ae aeVarRememberedValue = composer.rememberedValue();
                if (zChangedInstance || aeVarRememberedValue == Composer.Companion.getEmpty()) {
                    aeVarRememberedValue = new ae(bjVarI);
                    composer.updateRememberedValue(aeVarRememberedValue);
                }
                com.waze.ui.d.s.f(tVar, (h.g.a.l) aeVarRememberedValue, PaddingKt.m2752PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, com.waze.z.a.be.G(ahVar.f15496c.getIntValue(), composer, 0), 7, null), composer, 0, 0);
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

    static final h.ab e(ah ahVar) {
        ahVar.i().i(com.waze.ui.d.j.f42147a);
        return h.ab.f48028a;
    }

    public static final /* synthetic */ void f(ah ahVar, bd bdVar) {
        com.waze.main_screen.af.b.f fVar;
        if (bdVar instanceof bc) {
            int iA = ahVar.getResources().getConfiguration().orientation == 2 ? 0 : ((bc) bdVar).a();
            if (iA >= ahVar.getResources().getDisplayMetrics().heightPixels || (fVar = ahVar.f15497d) == null) {
                return;
            }
            fVar.e(iA);
            return;
        }
        if (h.g.b.x.n(bdVar, ay.f15552a)) {
            com.waze.main_screen.af.b.f fVar2 = ahVar.f15497d;
            if (fVar2 != null) {
                fVar2.a();
                return;
            }
            com.waze.app_nav.a.ao aoVar = (com.waze.app_nav.a.ao) ahVar.bE();
            if (aoVar != null) {
                aoVar.H(new com.waze.app_nav.a.au(com.waze.app_nav.a.ap.f15115a));
                return;
            }
            return;
        }
        if (bdVar instanceof az) {
            com.waze.main_screen.af.b.f fVar3 = ahVar.f15497d;
            if (fVar3 != null) {
                fVar3.c(((az) bdVar).a());
                return;
            }
            com.waze.app_nav.a.ao aoVar2 = (com.waze.app_nav.a.ao) ahVar.bE();
            if (aoVar2 != null) {
                as asVarA = ((az) bdVar).a();
                h.g.b.x.f(asVarA, "question");
                aoVar2.H(new com.waze.app_nav.a.au(new com.waze.app_nav.a.ar(asVarA)));
                return;
            }
            return;
        }
        if (bdVar instanceof ba) {
            com.waze.main_screen.af.b.f fVar4 = ahVar.f15497d;
            if (fVar4 != null) {
                fVar4.d(((ba) bdVar).a());
                return;
            }
            com.waze.app_nav.a.ao aoVar3 = (com.waze.app_nav.a.ao) ahVar.bE();
            if (aoVar3 != null) {
                as asVarA2 = ((ba) bdVar).a();
                h.g.b.x.f(asVarA2, "question");
                aoVar3.H(new com.waze.app_nav.a.au(new com.waze.app_nav.a.as(asVarA2)));
                return;
            }
            return;
        }
        if (!(bdVar instanceof bb)) {
            throw new h.i();
        }
        com.waze.main_screen.af.b.f fVar5 = ahVar.f15497d;
        if (fVar5 != null) {
            bb bbVar = (bb) bdVar;
            fVar5.b(bbVar.b(), bbVar.a());
            return;
        }
        com.waze.app_nav.a.ao aoVar4 = (com.waze.app_nav.a.ao) ahVar.bE();
        if (aoVar4 != null) {
            bb bbVar2 = (bb) bdVar;
            aoVar4.a(bbVar2.b(), bbVar2.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bj i() {
        return (bj) this.f15495b.getValue();
    }

    public final void g(int i2) {
        this.f15496c.setIntValue(i2);
    }

    public final void h(com.waze.main_screen.af.b.f fVar) {
        this.f15497d = fVar;
    }

    @Override // org.a.a.b.a
    public final org.a.d.k.b l() {
        return (org.a.d.k.b) this.f15494a.getValue();
    }

    @Override // org.a.a.b.a
    public final /* synthetic */ void m() {
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Exception {
        h.g.b.x.f(layoutInflater, "inflater");
        Bundle arguments = getArguments();
        if (arguments != null) {
            as asVar = Build.VERSION.SDK_INT >= 33 ? (as) arguments.getParcelable("ENRICH_ALERT_QUESTION_KEY", as.class) : (as) arguments.getParcelable("ENRICH_ALERT_QUESTION_KEY");
            if (asVar != null) {
                com.waze.ad.a.j.r(this, this, new ad(this, 0));
                i().j(asVar);
                Context contextRequireContext = requireContext();
                h.g.b.x.e(contextRequireContext, "requireContext(...)");
                ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
                composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1291032816, true, new dv(this, 4)));
                return composeView;
            }
        }
        throw new Exception("No subtypes to present");
    }

    @Override // com.waze.app_nav.a.b, android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        h.g.b.x.f(view, "view");
        super.onViewCreated(view, bundle);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        h.g.b.x.e(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new bg(this, (h.c.e) null, 1), 3);
    }
}
