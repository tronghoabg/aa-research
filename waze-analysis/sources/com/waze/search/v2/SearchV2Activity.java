package com.waze.search.v2;

import android.content.ComponentCallbacks;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.activity.SystemBarStyle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.fragment.compose.AndroidFragmentKt;
import androidx.fragment.compose.FragmentStateKt;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class SearchV2Activity extends com.waze.ifs.ui.a implements org.a.a.b.a {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f36131f = 0;

    /* renamed from: g, reason: collision with root package name */
    private final h.f f36132g;

    /* renamed from: k, reason: collision with root package name */
    private final h.f f36134k;

    /* renamed from: h, reason: collision with root package name */
    private final h.f f36133h = h.g.a(new com.waze.bi.a(this, 1));

    /* renamed from: l, reason: collision with root package name */
    private final h.f f36135l = h.g.b(h.h.f48130a, new bv((ComponentCallbacks) this, 1));

    public SearchV2Activity() {
        SearchV2Activity searchV2Activity = this;
        this.f36132g = org.a.b.b.d.b(searchV2Activity);
        this.f36134k = h.g.b(h.h.f48132c, new ac(searchV2Activity, new com.waze.bi.a(this, 2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object o(com.waze.search.v2.SearchV2Activity r12, com.waze.search.v2.dj r13, h.c.e r14) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.v2.SearchV2Activity.o(com.waze.search.v2.SearchV2Activity, com.waze.search.v2.dj, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ h.ab p(com.waze.search.v2.SearchV2Activity r34, androidx.compose.foundation.layout.BoxWithConstraintsScope r35, androidx.compose.runtime.Composer r36, int r37) {
        /*
            Method dump skipped, instructions count: 1017
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.v2.SearchV2Activity.p(com.waze.search.v2.SearchV2Activity, androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, int):h.ab");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fi s() {
        return (fi) this.f36134k.getValue();
    }

    private static final com.waze.br.c.n v(State state) {
        return (com.waze.br.c.n) state.getValue();
    }

    @Override // org.a.a.b.a
    public final org.a.d.k.b l() {
        return (org.a.d.k.b) this.f36132g.getValue();
    }

    @Override // org.a.a.b.a
    public final /* synthetic */ void m() {
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, android.support.v4.app.av, androidx.activity.ComponentActivity, android.app.Activity
    protected final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 5000 && i3 == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("trip_overview_result_key");
            if ((stringExtra != null ? com.waze.trip_overview.j.a(stringExtra) : null) == com.waze.trip_overview.j.f41481b) {
                setResult(-1, new Intent().putExtra("location_preview_result_key", com.waze.navigate.location_preview.g.f31725c));
                q(false);
            }
        }
    }

    @Override // com.waze.sharedui.a.e, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        s().aa(ag.f36146a);
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        org.chromium.support_lib_boundary.a.b.e(this, l());
        super.onCreate(bundle);
        SearchV2Activity searchV2Activity = this;
        EdgeToEdge.enable(searchV2Activity, SystemBarStyle.Companion.auto$default(SystemBarStyle.Companion, 0, 0, null, 4, null), SystemBarStyle.Companion.auto$default(SystemBarStyle.Companion, 0, 0, null, 4, null));
        getWindow().setWindowAnimations(0);
        ComponentActivityKt.setContent$default(searchV2Activity, null, ComposableLambdaKt.composableLambdaInstance(2030372652, true, new com.waze.v.b(this, 11)), 1, null);
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(kotlinx.coroutines.b.ai.y(new cc(s().F(), 1)), new z(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
    }

    public final void q(boolean z) {
        super.finish();
        if (z) {
            overridePendingTransition(R.anim.stack_up, R.anim.slide_down_silky);
        } else {
            overridePendingTransition(0, 0);
            getWindow().setWindowAnimations(0);
        }
    }

    public final void r(Modifier modifier, h.g.a.l lVar, Composer composer, int i2) {
        int i3;
        h.g.b.x.f(lVar, "onMapViewportChanged");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1936960013);
        int i5 = 1;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1936960013, i3, -1, "com.waze.search.v2.SearchV2Activity.SearchV2FragmentContainer (SearchV2Activity.kt:420)");
            }
            composerStartRestartGroup.startReplaceGroup(-1697728577);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            h hVar = new h(density.mo2121roundToPx0680j_4(WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getSafeDrawing(WindowInsets.Companion, composerStartRestartGroup, 6), density).mo2707calculateTopPaddingD9Ej5fM()), density.mo2121roundToPx0680j_4(WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getSafeDrawing(WindowInsets.Companion, composerStartRestartGroup, 6), density).mo2704calculateBottomPaddingD9Ej5fM()));
            composerStartRestartGroup.endReplaceGroup();
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(hVar, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Boolean boolValueOf = Boolean.valueOf(((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 2);
            boolean zChanged = composerStartRestartGroup.changed(hVar);
            eb ebVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || ebVarRememberedValue == Composer.Companion.getEmpty()) {
                ebVarRememberedValue = new eb(hVar, mutableState, (h.c.e) null, 1);
                composerStartRestartGroup.updateRememberedValue(ebVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(hVar, boolValueOf, (h.g.a.p) ebVarRememberedValue, composerStartRestartGroup, 0);
            Modifier modifierConsumeWindowInsets = WindowInsetsPaddingKt.consumeWindowInsets(modifier, WindowInsetsKt.m2850onlybOOhFvg(WindowInsets_androidKt.getSafeDrawing(WindowInsets.Companion, composerStartRestartGroup, 6), WindowInsetsSides.Companion.m2875getVerticalJoeWqyM()));
            int i6 = i3 & 112;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (i6 == 32 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new dy(lVar, mutableState, i5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.startReplaceableGroup(1765406104);
            AndroidFragmentKt.AndroidFragment(ck.class, modifierConsumeWindowInsets, FragmentStateKt.rememberFragmentState(composerStartRestartGroup, 0), Bundle.EMPTY, (h.g.a.l) objRememberedValue2, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.c.e.w(this, modifier, lVar, i2, 17));
        }
    }
}
