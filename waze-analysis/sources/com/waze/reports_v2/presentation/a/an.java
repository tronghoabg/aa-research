package com.waze.reports_v2.presentation.a;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.fragment.compose.AndroidFragmentKt;
import androidx.fragment.compose.FragmentStateKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.waze.NativeManager;
import com.waze.config.ConfigValues;
import com.waze.iu;
import com.waze.mywaze.MyWazeNativeManager;
import com.waze.navigate.dc;
import com.waze.navigate.gn;
import com.waze.reports.ClosureMap;
import com.waze.reports.di;
import com.waze.reports.dr;
import com.waze.reports_v2.c.dj;
import com.waze.reports_v2.c.dk;
import com.waze.reports_v2.c.dl;
import com.waze.reports_v2.c.dm;
import com.waze.reports_v2.presentation.bg;
import com.waze.reports_v2.presentation.bp;
import com.waze.reports_v2.presentation.bw;
import com.waze.strings.DisplayStrings;
import com.waze.ui.w.b.bd;
import com.waze.z.a.be;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class an {
    public static final void a(Modifier modifier, az azVar, Composer composer, int i2) {
        int i3;
        h.g.b.x.f(azVar, "reportMenuState");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-432257133);
        int i5 = 4;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(azVar) ? 16 : 32;
        }
        int i6 = i3;
        if (composerStartRestartGroup.shouldExecute((i6 & 19) != 18, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-432257133, i6, -1, "com.waze.reports_v2.presentation.report_menu.ReportMenu (ReportMenu.kt:54)");
            }
            composerStartRestartGroup.startReplaceGroup(1212726473);
            int iMo2121roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo2121roundToPx0680j_4(((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenWidthDp);
            composerStartRestartGroup.endReplaceGroup();
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new dc(11);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierJ = be.J(modifier, false, null, (h.g.a.a) objRememberedValue, composerStartRestartGroup, (i6 & 14) | 196656, 14);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierJ);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            Modifier modifierAlign = BoxScopeInstance.INSTANCE.align(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Alignment.Companion.getCenterStart());
            av avVarD = azVar.d();
            com.waze.z.a.y yVar = com.waze.z.a.y.f46211a;
            FiniteAnimationSpec finiteAnimationSpecC = com.waze.z.a.aa.c(yVar);
            boolean zChanged = composerStartRestartGroup.changed(iMo2121roundToPx0680j_4);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.c.e.u(iMo2121roundToPx0680j_4, 9);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EnterTransition enterTransitionSlideInVertically = EnterExitTransitionKt.slideInVertically(finiteAnimationSpecC, (h.g.a.l) objRememberedValue2);
            FiniteAnimationSpec finiteAnimationSpecD = com.waze.z.a.aa.d(yVar);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new com.waze.network.q(i5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ExitTransition exitTransitionSlideOutVertically = EnterExitTransitionKt.slideOutVertically(finiteAnimationSpecD, (h.g.a.l) objRememberedValue3);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new Ref();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Ref ref = (Ref) objRememberedValue4;
            ref.setValue(avVarD == null ? ref.getValue() : avVarD);
            AnimatedVisibilityKt.AnimatedVisibility(avVarD != null, modifierAlign, enterTransitionSlideInVertically, exitTransitionSlideOutVertically, (String) null, ComposableLambdaKt.rememberComposableLambda(-559889238, true, new ai(ref, azVar), composerStartRestartGroup, 54), composerStartRestartGroup, 196608, 16);
            int i7 = i6 & 112;
            h.ab abVar = h.ab.f48028a;
            ah ahVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i7 == 32 || ahVarRememberedValue == Composer.Companion.getEmpty()) {
                ahVarRememberedValue = new ah(azVar, null);
                composerStartRestartGroup.updateRememberedValue(ahVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(abVar, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) ahVarRememberedValue, composerStartRestartGroup, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.t.c.g(modifier, azVar, i2, 17));
        }
    }

    static final h.ab b(Modifier modifier, dj djVar, h.g.a.l lVar, h.g.a.l lVar2, int i2, Composer composer) {
        t(modifier, djVar, lVar, lVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    public static final az d(ba baVar, s sVar, Composer composer) {
        h.g.b.x.f(baVar, "reportMenuStateHolder");
        h.g.b.x.f(sVar, "reportLaterStateHolder");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2119865015, 0, -1, "com.waze.reports_v2.presentation.report_menu.rememberReportMenuState (ReportMenu.kt:400)");
        }
        org.a.d.k.b bVarA = org.a.c.a.a(composer);
        org.a.b.b.d.f(composer);
        boolean zChanged = composer.changed((Object) null) | composer.changed(bVarA);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            int i2 = h.g.b.ar.f48106a;
            objRememberedValue = bVarA.a(new h.g.b.m(com.waze.reports_v2.presentation.dc.class), null, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        com.waze.reports_v2.presentation.dc dcVar = (com.waze.reports_v2.presentation.dc) objRememberedValue;
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        org.a.d.k.b bVarA2 = org.a.c.a.a(composer);
        org.a.b.b.d.f(composer);
        boolean zChanged2 = composer.changed((Object) null) | composer.changed(bVarA2);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            int i3 = h.g.b.ar.f48106a;
            objRememberedValue2 = bVarA2.a(new h.g.b.m(dk.class), null, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        dk dkVar = (dk) objRememberedValue2;
        boolean zChanged3 = composer.changed(baVar) | composer.changed(dcVar);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
            Object azVar = new az(baVar, sVar, dcVar, new com.waze.reports_v2.presentation.k(new gn(context, 20)), dkVar);
            composer.updateRememberedValue(azVar);
            objRememberedValue3 = azVar;
        }
        az azVar2 = (az) objRememberedValue3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return azVar2;
    }

    public static final ab f(bp bpVar, h.g.a.l lVar, Composer composer) {
        h.g.b.x.f(bpVar, "reportMenuButtonStateHolder");
        h.g.b.x.f(lVar, "onMenuClicked");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(832735497, 0, -1, "com.waze.reports_v2.presentation.report_menu.rememberReportButtonState (ReportMenuButtonState.kt:48)");
        }
        boolean zChanged = composer.changed(bpVar) | composer.changed(lVar);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new ab(bpVar, lVar);
            composer.updateRememberedValue(objRememberedValue);
        }
        ab abVar = (ab) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return abVar;
    }

    public static final void g(Modifier modifier, ab abVar, h.g.a.a aVar, Composer composer, int i2) {
        Modifier modifier2;
        h.g.b.x.f(abVar, "reportMenuButtonState");
        h.g.b.x.f(aVar, "isCovered");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1555043431);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(abVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1555043431, i3, -1, "com.waze.reports_v2.presentation.report_menu.ReportMenuButton (ReportMenuButton.kt:49)");
            }
            bg bgVar = (bg) SnapshotStateKt.collectAsState(abVar.e(), null, composerStartRestartGroup, 0, 1).getValue();
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Ref();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Ref ref = (Ref) objRememberedValue;
            Integer numValueOf = Integer.valueOf(((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).uiMode);
            Boolean boolValueOf = Boolean.valueOf(com.waze.bz.a.d(composerStartRestartGroup, 0).V());
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(ref);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (h.g.a.p) new u(ref, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(numValueOf, boolValueOf, (h.g.a.p) objRememberedValue2, composerStartRestartGroup, 0);
            boolean z = (i3 & 112) == 32;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(context) | z;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = (h.g.a.p) new ae(abVar, context, (h.c.e) null, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(context, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
            Modifier modifierThen = OffsetKt.m2715offsetVpY3zN4$default(com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.cU, null), 0.0f, 34.0f, 1, null).then(companion);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(ref);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new com.waze.car_lib.o.ab(ref, 9);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            h.g.a.l lVar = (h.g.a.l) objRememberedValue4;
            boolean zChanged = composerStartRestartGroup.changed(bgVar) | z | ((i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = new ac(abVar, aVar, bgVar, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            AndroidView_androidKt.AndroidView(lVar, modifierThen, (h.g.a.l) objRememberedValue5, composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.c.e.w(modifier2, abVar, aVar, i2, 14, null));
        }
    }

    public static final void h(k kVar, Modifier modifier, Composer composer, int i2) {
        int i3;
        h.g.b.x.f(kVar, "reportFeedbackPointsState");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1970732366);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(kVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1970732366, i3, -1, "com.waze.reports_v2.presentation.report_menu.ReportFeedbackPoints (ReportFeedbackPoints.kt:37)");
            }
            Modifier modifierM2714offsetVpY3zN4 = OffsetKt.m2714offsetVpY3zN4(com.waze.ui.r.a.d.d.a(modifier, com.waze.ui.r.a.d.c.cS, null), 24.0f, 60.0f);
            int i5 = i3 & 14;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i5 == 4 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.car_lib.o.ab(kVar, 8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            AndroidView_androidKt.AndroidView((h.g.a.l) objRememberedValue, modifierM2714offsetVpY3zN4, null, composerStartRestartGroup, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.t.c.g(kVar, modifier, i2, 16, null));
        }
    }

    public static final k i(m mVar, Composer composer) {
        h.g.b.x.f(mVar, "reportFeedbackPointsStateHolder");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1143028820, 0, -1, "com.waze.reports_v2.presentation.report_menu.rememberReportFeedbackPointsState (ReportFeedbackPoints.kt:79)");
        }
        boolean zChanged = composer.changed(mVar);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new k(mVar);
            composer.updateRememberedValue(objRememberedValue);
        }
        k kVar = (k) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return kVar;
    }

    public static /* synthetic */ h.ab k(MutableState mutableState, ActivityResult activityResult) {
        h.g.b.x.f(activityResult, "it");
        di diVarU = u(mutableState);
        if (diVarU != null) {
            diVarU.E(activityResult.getResultCode(), activityResult.getData());
        }
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab l(h.g.a.a aVar, MutableState mutableState, ActivityResult activityResult) {
        h.g.b.x.f(activityResult, "it");
        di diVarU = u(mutableState);
        com.waze.reports.k kVar = diVarU instanceof com.waze.reports.k ? (com.waze.reports.k) diVarU : null;
        int resultCode = activityResult.getResultCode();
        int i2 = ClosureMap.f33535g;
        if (resultCode == 1) {
            if (kVar != null) {
                kVar.H();
            }
            return h.ab.f48028a;
        }
        if (resultCode == 0) {
            if (kVar != null) {
                kVar.o();
            }
            return h.ab.f48028a;
        }
        if (kVar != null) {
            kVar.L();
        }
        aVar.invoke();
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab m(MutableState mutableState, ActivityResult activityResult) {
        h.g.b.x.f(activityResult, "it");
        di diVarU = u(mutableState);
        if (diVarU != null) {
            diVarU.D(activityResult.getResultCode(), activityResult.getData());
        }
        return h.ab.f48028a;
    }

    public static final void n(g gVar, h.g.a.a aVar, h.g.a.l lVar, Composer composer, int i2) {
        int i3;
        h.g.b.x.f(gVar, "viewModel");
        h.g.b.x.f(aVar, "onClose");
        h.g.b.x.f(lVar, "onLaterReport");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1184286315);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(gVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1184286315, i3, -1, "com.waze.reports_v2.presentation.report_menu.LegacyReportMenuScreen (LegacyReportMenuScreen.kt:51)");
            }
            w(gVar.a().a(), aVar, lVar, SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), composerStartRestartGroup, (i3 & DisplayStrings.DS_TAP_TO_VERIFY) | (i3 & 112) | DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.c.e.w(gVar, aVar, lVar, i2, 13, null));
        }
    }

    static final h.ab o(Modifier modifier, au auVar, h.g.a.a aVar, h.g.a.l lVar, int i2, Composer composer) {
        v(modifier, auVar, aVar, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab p(au auVar, h.g.a.a aVar, h.g.a.l lVar, Modifier modifier, int i2, Composer composer) {
        w(auVar, aVar, lVar, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    public static final void q(at atVar, h.g.a.a aVar, Modifier modifier, Composer composer, int i2) {
        int i3;
        Composer composer2;
        h.g.b.x.f(atVar, "laterButton");
        h.g.b.x.f(aVar, "onClick");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1442637437);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(atVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1442637437, i3, -1, "com.waze.reports_v2.presentation.report_menu.LaterReportButton (LaterReportButton.kt:21)");
            }
            composer2 = composerStartRestartGroup;
            ImageKt.Image(PainterResources_androidKt.painterResource(atVar.b(), composerStartRestartGroup, 0), (String) null, PaddingKt.m2755padding3ABfNKs(be.J(BackgroundKt.m1971backgroundbw27NRU(SizeKt.m2822size3ABfNKs(PaddingKt.m2759paddingqDBjuR0$default(com.waze.ui.r.a.d.d.a(modifier, com.waze.ui.r.a.d.c.cR, null), 0.0f, 112.0f, 0.0f, 0.0f, 13, null), 72.0f), ColorKt.Color(atVar.a()), RoundedCornerShapeKt.getCircleShape()), false, null, aVar, composerStartRestartGroup, ((i3 << 12) & 458752) | 48, 14), 8.0f), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, Painter.$stable | 48, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.c.e.w((Object) atVar, (Object) aVar, modifier, i2, 12));
        }
    }

    public static final /* synthetic */ dl r(com.waze.ui.w.b.b bVar) {
        com.waze.ui.w.b.b bVar2 = com.waze.ui.w.b.b.f43626a;
        bd bdVar = bd.f43641a;
        dj djVar = dj.f34409a;
        com.waze.reports_v2.b.s sVar = com.waze.reports_v2.b.s.f34126a;
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 0) {
            return dl.f34422b;
        }
        if (iOrdinal == 1) {
            return dl.f34424d;
        }
        if (iOrdinal == 2) {
            return dl.f34425e;
        }
        if (iOrdinal == 3) {
            return dl.f34423c;
        }
        if (iOrdinal == 4) {
            return dl.f34421a;
        }
        throw new h.i();
    }

    public static final /* synthetic */ dm s(bd bdVar) {
        com.waze.ui.w.b.b bVar = com.waze.ui.w.b.b.f43626a;
        dj djVar = dj.f34409a;
        com.waze.reports_v2.b.s sVar = com.waze.reports_v2.b.s.f34126a;
        int iOrdinal = bdVar.ordinal();
        if (iOrdinal == 0) {
            return dm.f34428b;
        }
        if (iOrdinal == 1) {
            return dm.f34427a;
        }
        if (iOrdinal == 2) {
            return dm.f34429c;
        }
        throw new h.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(Modifier modifier, dj djVar, h.g.a.l lVar, h.g.a.l lVar2, Composer composer, int i2) {
        Modifier modifier2;
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1634464026);
        if (i4 == 0) {
            modifier2 = modifier;
            i3 = (true != composerStartRestartGroup.changed(modifier2) ? 2 : 4) | i2;
        } else {
            modifier2 = modifier;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(djVar.ordinal()) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar2) ? 1024 : 2048;
        }
        int i5 = 0;
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1634464026, i3, -1, "com.waze.reports_v2.presentation.report_menu.ReportMenuSheet (ReportMenu.kt:95)");
            }
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            int iMo2121roundToPx0680j_4 = density.mo2121roundToPx0680j_4(WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getNavigationBars(WindowInsets.Companion, composerStartRestartGroup, 6), density).mo2704calculateBottomPaddingD9Ej5fM());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(iMo2121roundToPx0680j_4), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Integer numValueOf = Integer.valueOf(iMo2121roundToPx0680j_4);
            Boolean boolValueOf = Boolean.valueOf(((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 2);
            boolean zChanged = composerStartRestartGroup.changed(iMo2121roundToPx0680j_4);
            aj ajVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || ajVarRememberedValue == Composer.Companion.getEmpty()) {
                ajVarRememberedValue = new aj(iMo2121roundToPx0680j_4, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(ajVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(numValueOf, boolValueOf, (h.g.a.p) ajVarRememberedValue, composerStartRestartGroup, 0);
            com.waze.reports_v2.j jVar = com.waze.reports_v2.j.f34601a;
            com.waze.reports_v2.i iVar = new com.waze.reports_v2.i();
            iVar.b(djVar);
            Bundle bundleB = iVar.a().b();
            boolean z = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256;
            boolean z2 = (i3 & 7168) == 2048;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if ((z | z2) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new ac(mutableState, lVar, lVar2, i5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.startReplaceableGroup(1765406104);
            Modifier modifier3 = modifier2;
            AndroidFragmentKt.AndroidFragment(bw.class, modifier3, FragmentStateKt.rememberFragmentState(composerStartRestartGroup, 0), bundleB, (h.g.a.l) objRememberedValue2, composerStartRestartGroup, ((i3 & 14) << 3) & 112, 0);
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier, djVar, lVar, lVar2, i2, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final di u(MutableState mutableState) {
        return (di) mutableState.getValue();
    }

    private static final void v(Modifier modifier, final au auVar, final h.g.a.a aVar, h.g.a.l lVar, Composer composer, int i2) {
        Modifier modifier2;
        int i3;
        h.g.a.l lVar2;
        Composer composer2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1525937175);
        if (i4 == 0) {
            modifier2 = modifier;
            i3 = (true != composerStartRestartGroup.changed(modifier2) ? 2 : 4) | i2;
        } else {
            modifier2 = modifier;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(auVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            lVar2 = lVar;
            i3 |= true != composerStartRestartGroup.changedInstance(lVar2) ? 1024 : 2048;
        } else {
            lVar2 = lVar;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1525937175, i3, -1, "com.waze.reports_v2.presentation.report_menu.LegacyMenuSheet (LegacyReportMenuScreen.kt:99)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(h.c.k.f48060a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            byte[] bArr = null;
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableState mutableState = (MutableState) objRememberedValue2;
            ActivityResultContracts.StartActivityForResult startActivityForResult = new ActivityResultContracts.StartActivityForResult();
            int i5 = i3 & DisplayStrings.DS_TAP_TO_VERIFY;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (i5 == 256 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new com.waze.authentication.as(aVar, mutableState, 9, bArr);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult, (h.g.a.l) objRememberedValue3, composerStartRestartGroup, 0);
            ActivityResultContracts.StartActivityForResult startActivityForResult2 = new ActivityResultContracts.StartActivityForResult();
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new com.waze.car_lib.o.ab(mutableState, 6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult2 = ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult2, (h.g.a.l) objRememberedValue4, composerStartRestartGroup, 48);
            ActivityResultContracts.StartActivityForResult startActivityForResult3 = new ActivityResultContracts.StartActivityForResult();
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = new com.waze.car_lib.o.ab(mutableState, 7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult3 = ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult3, (h.g.a.l) objRememberedValue5, composerStartRestartGroup, 48);
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Modifier modifierSafeContentPadding = WindowInsetsPadding_androidKt.safeContentPadding(BackgroundKt.m1972backgroundbw27NRU$default(modifier2, com.waze.bz.a.d(composerStartRestartGroup, 0).h(), null, 2, null));
            Bundle bundle = new Bundle();
            bundle.putBoolean("isRandomUser", MyWazeNativeManager.getInstance().isGuestUser());
            boolean zChangedInstance = ((i3 & 7168) == 2048) | (i5 == 256) | composerStartRestartGroup.changedInstance(auVar) | composerStartRestartGroup.changedInstance(afVar) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult2) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult3);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == Composer.Companion.getEmpty()) {
                final h.g.a.l lVar3 = lVar2;
                h.g.a.l lVar4 = new h.g.a.l() { // from class: com.waze.reports_v2.presentation.a.a
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        di diVarL;
                        dr drVar = (dr) obj;
                        h.g.b.x.f(drVar, "reportMenu");
                        com.waze.ad.a.j.s(drVar, new gn(drVar, 19));
                        drVar.t();
                        h.g.a.l lVar5 = lVar3;
                        au auVar2 = auVar;
                        h.g.a.a aVar2 = aVar;
                        MutableState mutableState2 = mutableState;
                        drVar.w(new c(aVar2, lVar5, auVar2, mutableState2));
                        drVar.u(auVar2.b() != null);
                        com.waze.reports_v2.b.ad adVarA = auVar2.a();
                        com.waze.reports_v2.b.ad adVar = com.waze.reports_v2.b.ad.f34017a;
                        switch (adVarA.ordinal()) {
                            case 0:
                                drVar.z();
                                break;
                            case 1:
                                drVar.A();
                                break;
                            case 2:
                                throw new h.j();
                            case 3:
                                ManagedActivityResultLauncher managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
                                Context context2 = context;
                                kotlinx.coroutines.af afVar2 = afVar;
                                drVar.x();
                                kotlinx.coroutines.aj.z(afVar2, null, null, new d(context2, auVar2, managedActivityResultLauncher, null), 3);
                                break;
                            case 4:
                                if (MyWazeNativeManager.getInstance().isGuestUser()) {
                                    NativeManager nativeManager = NativeManager.getInstance();
                                    h.g.b.x.e(nativeManager, "getInstance(...)");
                                    iu.randomUserMsg$default(nativeManager, null, 1, null);
                                }
                                drVar.y();
                                break;
                            case 5:
                                throw new h.j();
                            case 6:
                                throw new h.j();
                            default:
                                throw new h.i();
                        }
                        mutableState2.setValue(drVar.l());
                        at atVarB = auVar2.b();
                        if (atVarB != null && (diVarL = drVar.l()) != null) {
                            diVarL.M(atVarB);
                        }
                        di diVarL2 = drVar.l();
                        if (diVarL2 != null) {
                            diVarL2.w = new e(managedActivityResultLauncherRememberLauncherForActivityResult2, managedActivityResultLauncherRememberLauncherForActivityResult3);
                        }
                        return h.ab.f48028a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(lVar4);
                objRememberedValue6 = lVar4;
            }
            composerStartRestartGroup.startReplaceableGroup(1765406104);
            composer2 = composerStartRestartGroup;
            AndroidFragmentKt.AndroidFragment(dr.class, modifierSafeContentPadding, FragmentStateKt.rememberFragmentState(composerStartRestartGroup, 0), bundle, (h.g.a.l) objRememberedValue6, composer2, 0, 0);
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier, auVar, aVar, lVar, i2, 1));
        }
    }

    private static final void w(au auVar, h.g.a.a aVar, h.g.a.l lVar, Modifier modifier, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1355936322);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(auVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1355936322, i3, -1, "com.waze.reports_v2.presentation.report_menu.LegacyReportMenuScreen (LegacyReportMenuScreen.kt:70)");
            }
            if (auVar.a() == com.waze.reports_v2.b.ad.f34020d && ConfigValues.CONFIG_VALUE_REPORTING_CLOSURE_SCREEN_ENABLED.b().booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(-531200884);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                int i5 = (i3 >> 9) & 14;
                CreationExtras creationExtrasF = org.chromium.support_lib_boundary.a.b.f(current);
                org.a.d.k.b bVarA = org.a.c.a.a(composerStartRestartGroup);
                int i6 = h.g.b.ar.f48106a;
                int i7 = i3 << 6;
                com.waze.n.aq.e(modifier, (com.waze.closure.c.i) org.a.b.c.a.a(new h.g.b.m(com.waze.closure.c.i.class), current.getViewModelStore(), creationExtrasF, bVarA, null), auVar.b(), aVar, lVar, composerStartRestartGroup, (i7 & 7168) | i5 | (i7 & 57344));
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                int i8 = (i3 >> 9) & 14;
                composerStartRestartGroup.startReplaceGroup(-530952264);
                int i9 = i3 << 3;
                v(modifier, auVar, aVar, lVar, composerStartRestartGroup, (i9 & DisplayStrings.DS_TAP_TO_VERIFY) | i8 | (i9 & 112) | (i9 & 7168));
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
            scopeUpdateScopeEndRestartGroup.updateScope(new b(auVar, aVar, lVar, modifier, i2, 0));
        }
    }
}
