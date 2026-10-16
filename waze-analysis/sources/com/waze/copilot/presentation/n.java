package com.waze.copilot.presentation;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.ScaffoldState;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.core.app.NotificationCompat;
import com.waze.R;
import com.waze.app_nav.w;
import com.waze.asks.ad;
import com.waze.asks.ak;
import com.waze.car_lib.r.cq;
import com.waze.dv;
import com.waze.share.aa;
import com.waze.sharedui.web.WazeWebView;
import h.ab;
import h.g.b.x;
import java.util.Objects;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class n extends com.waze.app_nav.a.b implements org.a.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f23133a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23134b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f23135c;

    /* renamed from: d, reason: collision with root package name */
    private final h.f f23136d;

    /* renamed from: e, reason: collision with root package name */
    private final h.f f23137e;

    /* renamed from: f, reason: collision with root package name */
    private final h.f f23138f;

    /* renamed from: g, reason: collision with root package name */
    private final h.f f23139g;

    /* renamed from: h, reason: collision with root package name */
    private final k f23140h;

    /* renamed from: i, reason: collision with root package name */
    private WazeWebView f23141i;

    public n() {
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("CopilotMarketplaceFragment");
        x.e(eVarD, "create(...)");
        this.f23133a = eVarD;
        this.f23134b = "CopilotMarketplaceLoadingDialog";
        n nVar = this;
        this.f23135c = org.a.b.b.d.a(nVar);
        d dVar = new d(this, 0);
        this.f23136d = h.g.b(h.h.f48132c, new m(nVar, new l(nVar), dVar));
        n nVar2 = this;
        h.h hVar = h.h.f48130a;
        this.f23137e = h.g.b(hVar, new d((ComponentCallbacks) nVar2, 1));
        this.f23138f = h.g.b(hVar, new d((ComponentCallbacks) nVar2, 2));
        this.f23139g = h.g.a(new ad(this, 18));
        this.f23140h = new k(this);
    }

    private final void A(String str, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(774418889);
        int i5 = 1;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(str) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(this) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(774418889, i3, -1, "com.waze.copilot.presentation.CopilotMarketplaceFragment.WebViewPage (CopilotMarketplaceFragment.kt:160)");
            }
            if (str.length() > 0) {
                composerStartRestartGroup.startReplaceGroup(-1851106506);
                Modifier modifierWindowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxSize$default(BackgroundKt.m1972backgroundbw27NRU$default(Modifier.Companion, com.waze.bz.a.d(composerStartRestartGroup, 0).h(), null, 2, null), 0.0f, 1, null), WindowInsetsKt.m2850onlybOOhFvg(WindowInsets_androidKt.getNavigationBars(WindowInsets.Companion, composerStartRestartGroup, 6), WindowInsetsSides.Companion.m2868getBottomJoeWqyM()));
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(this) | ((i3 & 14) == 4);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new ak(this, str, 7);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                AndroidView_androidKt.AndroidView((h.g.a.l) objRememberedValue, modifierWindowInsetsPadding, null, composerStartRestartGroup, 0, 4);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1850451879);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new c(this, str, i2, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B() {
        x().m();
        u().d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        x().l();
        WazeWebView wazeWebView = this.f23141i;
        if (wazeWebView == null || wazeWebView.I()) {
            return;
        }
        u().c();
    }

    public static /* synthetic */ DisposableEffectResult c(s sVar, n nVar, DisposableEffectScope disposableEffectScope) {
        x.f(disposableEffectScope, "$this$DisposableEffect");
        s sVar2 = s.f23156a;
        int iOrdinal = sVar.ordinal();
        return new e(iOrdinal != 1 ? iOrdinal != 2 ? null : com.waze.sharedui.api.i.a(nVar.v(), nVar.f23134b, R.string.MARKETPLACE_SAVING) : com.waze.sharedui.api.i.a(nVar.v(), nVar.f23134b, R.string.PLEASE_WAIT___));
    }

    public static /* synthetic */ WazeWebView g(n nVar, String str, Context context) {
        x.f(context, "it");
        WazeWebView wazeWebView = new WazeWebView(nVar.requireContext());
        wazeWebView.D(nVar.f23140h);
        WebSettings webSettingsA = wazeWebView.a();
        if (webSettingsA != null) {
            webSettingsA.setJavaScriptEnabled(true);
        }
        com.waze.settings.q qVarJ = wazeWebView.J();
        if (qVarJ != null) {
            qVarJ.b(new f(nVar), "WazeMobile");
        }
        if (str.length() > 0) {
            wazeWebView.t(str);
        }
        nVar.f23141i = wazeWebView;
        return wazeWebView;
    }

    public static /* synthetic */ ab h(ScaffoldState scaffoldState, State state, n nVar, Composer composer, int i2) {
        String str;
        int i3 = 1;
        int i4 = 2;
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-20757134, i2, -1, "com.waze.copilot.presentation.CopilotMarketplaceFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (CopilotMarketplaceFragment.kt:99)");
            }
            q qVarB = w(state).b();
            byte[] bArr = null;
            if (qVarB == null) {
                composer.startReplaceGroup(99567462);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(99567463);
                int iA = qVarB.a();
                Integer numC = qVarB.c();
                long jB = qVarB.b();
                boolean zD = qVarB.d();
                String strB = com.waze.ui.r.a.c.c.b(iA, composer, 0);
                if (numC == null) {
                    composer.startReplaceGroup(-1523503077);
                    composer.endReplaceGroup();
                    str = null;
                } else {
                    composer.startReplaceGroup(-1523503076);
                    String strB2 = com.waze.ui.r.a.c.c.b(numC.intValue(), composer, 0);
                    composer.endReplaceGroup();
                    str = strB2;
                }
                SnackbarHostState snackbarHostState = scaffoldState.getSnackbarHostState();
                boolean zChanged = composer.changed(jB) | composer.changed(scaffoldState) | composer.changed(strB) | composer.changed(str) | composer.changedInstance(nVar) | composer.changed(zD);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = (h.g.a.p) new i(jB, nVar, zD, scaffoldState, strB, str, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                EffectsKt.LaunchedEffect(snackbarHostState, (h.g.a.p<? super af, ? super h.c.e<? super ab>, ? extends Object>) objRememberedValue, composer, 0);
                composer.endReplaceGroup();
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1262014967, true, new com.waze.v.a(nVar, state, i3, bArr), composer, 54);
            int i5 = b.f23105a;
            ScaffoldKt.m4175Scaffold27mzLpw(modifierFillMaxSize$default, scaffoldState, composableLambdaRememberComposableLambda, null, b.b(), null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(-457691984, true, new com.waze.o.d.b.b.b(nVar, state, i4), composer, 54), composer, 24966, 12582912, 131048);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public static /* synthetic */ ab i(n nVar, com.waze.ui.g.s sVar) {
        x.f(sVar, NotificationCompat.CATEGORY_EVENT);
        if (x.n(sVar, com.waze.ui.g.p.f42355a)) {
            nVar.C();
        } else if (x.n(sVar, com.waze.ui.g.q.f42356a)) {
            nVar.B();
        } else {
            if (!x.n(sVar, com.waze.ui.g.r.f42357a)) {
                throw new h.i();
            }
            nVar.x().s();
            String strA = ((r) nVar.x().h().d()).d().a();
            if (strA != null) {
                nVar.startActivity(aa.a(strA));
            } else {
                nVar.f23133a.g("handleShareClick() with shareMessage=null");
            }
        }
        return ab.f48028a;
    }

    public static /* synthetic */ ab j(n nVar, Composer composer, int i2) {
        int i3 = 2;
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1648699218, i2, -1, "com.waze.copilot.presentation.CopilotMarketplaceFragment.onCreateView.<anonymous>.<anonymous> (CopilotMarketplaceFragment.kt:94)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(nVar.x().h(), null, composer, 0, 1);
            ScaffoldState scaffoldStateRememberScaffoldState = ScaffoldKt.rememberScaffoldState(null, null, composer, 0, 3);
            com.waze.shared_infra.i.e eVar = nVar.f23133a;
            r rVarW = w(stateCollectAsState);
            Objects.toString(rVarW);
            eVar.a("ui state: ".concat(String.valueOf(rVarW)));
            cq.k(false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-20757134, true, new com.waze.c.e.x(scaffoldStateRememberScaffoldState, stateCollectAsState, nVar, i3), composer, 54), composer, 196608);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public static /* synthetic */ ab k(n nVar, State state, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1262014967, i2, -1, "com.waze.copilot.presentation.CopilotMarketplaceFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CopilotMarketplaceFragment.kt:126)");
            }
            com.waze.ui.g.t tVarD = w(state).d();
            boolean zChangedInstance = composer.changedInstance(nVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.c.e.a.a(nVar, 18);
                composer.updateRememberedValue(objRememberedValue);
            }
            com.waze.trip_overview.views.l.e(tVarD, (h.g.a.l) objRememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public static /* synthetic */ ab n(n nVar, State state, PaddingValues paddingValues, Composer composer, int i2) {
        x.f(paddingValues, "padding");
        if ((i2 & 6) == 0) {
            i2 |= true != composer.changed(paddingValues) ? 2 : 4;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-457691984, i2, -1, "com.waze.copilot.presentation.CopilotMarketplaceFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CopilotMarketplaceFragment.kt:135)");
            }
            Modifier modifierPadding = PaddingKt.padding(Modifier.Companion, paddingValues);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierPadding);
            h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            p pVarA = w(state).a();
            if (pVarA == null) {
                composer.startReplaceGroup(-1449848628);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1449848627);
                nVar.z(pVarA, composer, 0);
                boolean zChangedInstance = composer.changedInstance(nVar);
                j jVarRememberedValue = composer.rememberedValue();
                if (zChangedInstance || jVarRememberedValue == Composer.Companion.getEmpty()) {
                    jVarRememberedValue = new j(nVar, null);
                    composer.updateRememberedValue(jVarRememberedValue);
                }
                EffectsKt.LaunchedEffect(pVarA, (h.g.a.p<? super af, ? super h.c.e<? super ab>, ? extends Object>) jVarRememberedValue, composer, 0);
                composer.endReplaceGroup();
            }
            nVar.y(w(state), composer, 0);
            nVar.A(w(state).e(), composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final org.a.d.h.a o(n nVar) {
        return com.waze.ch.a.a.f.g((com.waze.copilot.a.k) nVar.f23139g.getValue());
    }

    static final ab q(n nVar, r rVar, int i2, Composer composer) {
        nVar.y(rVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab r(n nVar, p pVar, int i2, Composer composer) {
        nVar.z(pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab s(n nVar, String str, int i2, Composer composer) {
        nVar.A(str, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w u() {
        return (w) this.f23137e.getValue();
    }

    private final com.waze.app_nav.hub.b.c v() {
        return (com.waze.app_nav.hub.b.c) this.f23138f.getValue();
    }

    private static final r w(State state) {
        return (r) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CopilotMarketplaceViewModel x() {
        return (CopilotMarketplaceViewModel) this.f23136d.getValue();
    }

    private final void y(r rVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1778820988);
        int i5 = 2;
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composerStartRestartGroup.changed(rVar) : composerStartRestartGroup.changedInstance(rVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(this) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1778820988, i3, -1, "com.waze.copilot.presentation.CopilotMarketplaceFragment.LoadingDialog (CopilotMarketplaceFragment.kt:186)");
            }
            s sVarC = rVar.c();
            boolean zChanged = composerStartRestartGroup.changed(sVarC.ordinal()) | composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new ak(sVarC, this, 6, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.DisposableEffect(sVarC, (h.g.a.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new c(this, rVar, i2, i5));
        }
    }

    private final void z(p pVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1638295058);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(pVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        int i5 = 0;
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1638295058, i3, -1, "com.waze.copilot.presentation.CopilotMarketplaceFragment.MarketplaceDialog (CopilotMarketplaceFragment.kt:150)");
            }
            com.waze.ui.g.w.a(pVar.a(), pVar.b(), pVar.c(), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new c(this, pVar, i2, i5));
        }
    }

    @Override // org.a.a.b.a
    public final org.a.d.k.b l() {
        return (org.a.d.k.b) this.f23135c.getValue();
    }

    @Override // org.a.a.b.a
    public final /* synthetic */ void m() {
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        x.f(layoutInflater, "inflater");
        com.waze.ad.a.j.r(this, this, new g(this));
        Context contextRequireContext = requireContext();
        x.e(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1648699218, true, new dv(this, 8)));
        return composeView;
    }

    @Override // android.support.v4.app.ar
    public final void onDestroyView() {
        WazeWebView wazeWebView = this.f23141i;
        if (wazeWebView != null) {
            wazeWebView.D(null);
        }
        WazeWebView wazeWebView2 = this.f23141i;
        if (wazeWebView2 != null) {
            wazeWebView2.s();
        }
        super.onDestroyView();
    }
}
