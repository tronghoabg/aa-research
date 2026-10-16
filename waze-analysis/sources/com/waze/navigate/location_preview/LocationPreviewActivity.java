package com.waze.navigate.location_preview;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentContainerView;
import android.support.v4.app.ch;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.EdgeToEdge;
import androidx.activity.SystemBarStyle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.R;
import com.waze.fa;
import com.waze.map.b.ed;
import com.waze.map.gl;
import com.waze.navigate.gn;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class LocationPreviewActivity extends com.waze.ifs.ui.a implements org.a.a.b.a {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f31472g = 0;

    /* renamed from: f, reason: collision with root package name */
    public bn f31473f;

    /* renamed from: l, reason: collision with root package name */
    private float f31476l;

    /* renamed from: h, reason: collision with root package name */
    private final h.f f31474h = h.g.b(h.h.f48130a, new i(this));

    /* renamed from: k, reason: collision with root package name */
    private final h.f f31475k = org.a.b.b.d.b(this);
    private final h.f m = h.g.a(new com.waze.main_screen.ac.k(20));

    private final kotlinx.coroutines.b.bm A() {
        return (kotlinx.coroutines.b.bm) this.m.getValue();
    }

    public static /* synthetic */ View n(android.support.v4.app.bv bvVar, MutableIntState mutableIntState, h.g.a.p pVar, Context context) {
        View view;
        h.g.b.x.f(context, "context");
        android.support.v4.app.ar arVarG = bvVar.g(y(mutableIntState));
        if (arVarG != null && (view = arVarG.getView()) != null) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            return view;
        }
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(y(mutableIntState));
        ch chVarU = bvVar.u();
        h.g.b.x.e(chVarU, "beginTransaction(...)");
        pVar.invoke(chVarU, Integer.valueOf(fragmentContainerView.getId()));
        chVarU.l();
        return fragmentContainerView;
    }

    private static final int y(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    private final ed z() {
        return (ed) this.f31474h.getValue();
    }

    @Override // org.a.a.b.a
    public final org.a.d.k.b l() {
        return (org.a.d.k.b) this.f31475k.getValue();
    }

    @Override // org.a.a.b.a
    public final /* synthetic */ void m() {
    }

    public final bn o() {
        bn bnVar = this.f31473f;
        if (bnVar != null) {
            return bnVar;
        }
        h.g.b.x.j("viewModel");
        return null;
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, android.support.v4.app.av, androidx.activity.ComponentActivity, android.app.Activity
    protected final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 5000 && i3 == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("trip_overview_result_key");
            if ((stringExtra != null ? com.waze.trip_overview.j.a(stringExtra) : null) == com.waze.trip_overview.j.f41481b) {
                setResult(-1, new Intent().putExtra("location_preview_result_key", g.f31725c));
                s(false);
            }
        }
    }

    @Override // com.waze.sharedui.a.e, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new bm(this, (h.c.e) null, 1), 3);
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        LocationPreviewActivity locationPreviewActivity = this;
        bn bnVar = (bn) h.g.b(h.h.f48132c, new h(locationPreviewActivity, new gn(this, 1))).getValue();
        h.g.b.x.f(bnVar, "<set-?>");
        this.f31473f = bnVar;
        super.onCreate(bundle);
        this.f31476l = aB() ? getResources().getDisplayMetrics().heightPixels * 0.25f : 0.0f;
        EdgeToEdge.enable(locationPreviewActivity, SystemBarStyle.Companion.auto$default(SystemBarStyle.Companion, 0, 0, null, 4, null), SystemBarStyle.Companion.auto$default(SystemBarStyle.Companion, 0, 0, null, 4, null));
        ComponentActivityKt.setContent$default(locationPreviewActivity, null, ComposableLambdaKt.composableLambdaInstance(990253873, true, new com.waze.beacons.a.c(this, 6)), 1, null);
    }

    public final void p(h.g.a.q qVar, Composer composer, int i2) {
        int i3;
        PaddingValues paddingValuesM2752PaddingValuesa9UjIt4$default;
        h.g.b.x.f(qVar, "content");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(937842678);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(qVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(this) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(937842678, i3, -1, "com.waze.navigate.location_preview.LocationPreviewActivity.EmptyMapLayout (LocationPreviewActivity.kt:174)");
            }
            Modifier modifierM1972backgroundbw27NRU$default = BackgroundKt.m1972backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), com.waze.bz.a.d(composerStartRestartGroup, 0).h(), null, 2, null);
            if (aB()) {
                composerStartRestartGroup.startReplaceGroup(509200225);
                composerStartRestartGroup.endReplaceGroup();
                paddingValuesM2752PaddingValuesa9UjIt4$default = PaddingKt.m2752PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, 170.0f, 7, null);
            } else {
                composerStartRestartGroup.startReplaceGroup(509281259);
                paddingValuesM2752PaddingValuesa9UjIt4$default = PaddingKt.m2752PaddingValuesa9UjIt4$default(((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenHeightDp, 0.0f, 0.0f, 0.0f, 14, null);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierPadding = PaddingKt.padding(modifierM1972backgroundbw27NRU$default, paddingValuesM2752PaddingValuesa9UjIt4$default);
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            int i5 = ((i3 << 9) & 7168) | DisplayStrings.DS_DIRT_ROADS;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composerStartRestartGroup, 54);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierPadding);
            h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            qVar.invoke(ColumnScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i5 >> 6) & 112) | 6));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.t.c.g(this, qVar, i2, 11));
        }
    }

    public final void q(Modifier modifier, android.support.v4.app.bv bvVar, h.g.a.p pVar, Composer composer, int i2) {
        int i3;
        Composer composer2;
        h.g.b.x.f(modifier, "modifier");
        h.g.b.x.f(bvVar, "fragmentManager");
        h.g.b.x.f(pVar, "commit");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1001952262);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(bvVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1001952262, i3, -1, "com.waze.navigate.location_preview.LocationPreviewActivity.FragmentContainer (LocationPreviewActivity.kt:236)");
            }
            Object[] objArr = new Object[0];
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.native_managers.n(i);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableIntState mutableIntState = (MutableIntState) RememberSaveableKt.rememberSaveable(objArr, (h.g.a.a) objRememberedValue, composerStartRestartGroup, 48);
            int i5 = (composerStartRestartGroup.changedInstance(bvVar) ? 1 : 0) | (composerStartRestartGroup.changed(mutableIntState) ? 1 : 0);
            i = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) != 256 ? 0 : 1;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if ((i | i5) != 0 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                com.waze.ads.c cVar = new com.waze.ads.c((Object) bvVar, (Object) mutableIntState, (Object) pVar, 14, (char[]) null);
                composerStartRestartGroup.updateRememberedValue(cVar);
                objRememberedValue2 = cVar;
            }
            h.g.a.l lVar = (h.g.a.l) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new gl(17);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composer2 = composerStartRestartGroup;
            AndroidView_androidKt.AndroidView(lVar, modifier, (h.g.a.l) objRememberedValue3, composer2, ((i3 << 3) & 112) | 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.closure.d.b(this, modifier, bvVar, pVar, i2, 11));
        }
    }

    public final void r(Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(853271217);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(this) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(853271217, i3, -1, "com.waze.navigate.location_preview.LocationPreviewActivity.MapMissingLayout (LocationPreviewActivity.kt:193)");
            }
            int i5 = b.f31606a;
            p(b.b(), composerStartRestartGroup, ((i3 << 3) & 112) | 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fa(this, i2, 14));
        }
    }

    public final void s(boolean z) {
        super.finish();
        if (z) {
            overridePendingTransition(R.anim.stack_up, R.anim.slide_down_silky);
        } else {
            overridePendingTransition(0, 0);
            getWindow().setWindowAnimations(0);
        }
    }

    public final void v(MotionEvent motionEvent) {
        h.g.b.x.f(motionEvent, NotificationCompat.CATEGORY_EVENT);
        A().c(motionEvent);
    }

    public final void w(float f2) {
        if (((com.waze.realtime_report_feedback.c) o().e().d()).i()) {
            return;
        }
        this.f31476l = f2;
        com.waze.realtime_report_feedback.c cVar = (com.waze.realtime_report_feedback.c) o().e().d();
        com.waze.shared_infra.h.c cVarA = cVar instanceof aw ? ((aw) cVar).a() : cVar instanceof av ? ((av) cVar).a() : null;
        if (cVarA != null) {
            ba.k(z(), this, cVarA, h.h.a.b(this.f31476l));
        }
    }

    public final void x(com.waze.realtime_report_feedback.c cVar, Composer composer, int i2) {
        int i3;
        h.g.b.x.f(cVar, "mapData");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1750750002);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(cVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(this) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1750750002, i3, -1, "com.waze.navigate.location_preview.LocationPreviewActivity.MapLayout (LocationPreviewActivity.kt:152)");
            }
            if (cVar instanceof aw) {
                composerStartRestartGroup.startReplaceGroup(1156432195);
                ba.j(z(), A(), ((aw) cVar).a(), h.h.a.b(this.f31476l), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (cVar instanceof av) {
                composerStartRestartGroup.startReplaceGroup(1156440682);
                ba.j(z(), A(), ((av) cVar).a(), h.h.a.b(this.f31476l), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (h.g.b.x.n(cVar, ax.f31581a)) {
                composerStartRestartGroup.startReplaceGroup(1156449088);
                r(composerStartRestartGroup, (i3 >> 3) & 14);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!h.g.b.x.n(cVar, au.f31576a)) {
                    composerStartRestartGroup.startReplaceGroup(1156430488);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new h.i();
                }
                composerStartRestartGroup.startReplaceGroup(1156450911);
                int i5 = b.f31606a;
                p(b.a(), composerStartRestartGroup, (i3 & 112) | 6);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.t.c.g(this, cVar, i2, 12));
        }
    }
}
