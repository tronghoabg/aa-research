package com.waze.ui.g;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.ScaffoldState;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
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
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.waze.R;
import com.waze.location.af;
import com.waze.strings.DisplayStrings;
import com.waze.trip_overview.cm;
import com.waze.z.a.ag;
import com.waze.z.a.be;
import h.ab;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class w {
    public /* synthetic */ w(byte[] bArr) {
    }

    public static void a(x xVar, h.g.a.a aVar, h.g.a.a aVar2, Composer composer, int i2) {
        int i3;
        h.g.b.x.f(xVar, "dialogType");
        h.g.b.x.f(aVar, "onActionClicked");
        h.g.b.x.f(aVar2, "onDialogDismissed");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(844657504);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(xVar.ordinal()) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(844657504, i3, -1, "com.waze.ui.copilot.CopilotMarketplaceDialog (CopilotMarketplaceDialog.kt:44)");
            }
            x xVar2 = x.f42374a;
            int iOrdinal = xVar.ordinal();
            if (iOrdinal == 0) {
                composerStartRestartGroup.startReplaceGroup(-32952531);
                k(aVar, aVar2, composerStartRestartGroup, (i3 >> 3) & 126);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (iOrdinal != 1) {
                    composerStartRestartGroup.startReplaceGroup(-32953412);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new h.i();
                }
                composerStartRestartGroup.startReplaceGroup(-32950378);
                l(aVar, aVar2, composerStartRestartGroup, (i3 >> 3) & 126);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new ag(xVar, aVar, aVar2, i2, 5));
        }
    }

    static ab b(int i2, int i3, int i4, h.g.a.a aVar, h.g.a.a aVar2, com.waze.ui.ac.i iVar, int i5, int i6, Composer composer) {
        j(i2, i3, i4, aVar, aVar2, iVar, composer, RecomposeScopeImplKt.updateChangedFlags(i5 | 1), i6);
        return ab.f48028a;
    }

    static ab c(h.g.a.a aVar, h.g.a.a aVar2, int i2, Composer composer) {
        k(aVar, aVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static ab d(h.g.a.a aVar, h.g.a.a aVar2, int i2, Composer composer) {
        l(aVar, aVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static void e(List list, String str, h.g.a.l lVar, Composer composer, int i2) {
        int i3;
        Composer composer2;
        h.g.b.x.f(list, "cars");
        h.g.b.x.f(str, "imageSignature");
        h.g.b.x.f(lVar, "eventCallback");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(779997243);
        int i5 = 2;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(list) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(str) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(779997243, i3, -1, "com.waze.ui.copilot.CarsList (CarsSettingsScreen.kt:183)");
            }
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.Companion, 0.0f, 1, null);
            PaddingValues paddingValuesAsPaddingValues = WindowInsetsKt.asPaddingValues(WindowInsetsKt.m2850onlybOOhFvg(WindowInsets_androidKt.getNavigationBars(WindowInsets.Companion, composerStartRestartGroup, 6), WindowInsetsSides.Companion.m2868getBottomJoeWqyM()), composerStartRestartGroup, 0);
            boolean zChangedInstance = ((i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256) | composerStartRestartGroup.changedInstance(list);
            boolean z = (i3 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z | zChangedInstance) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new cm(list, lVar, str, i5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composer2 = composerStartRestartGroup;
            LazyDslKt.LazyColumn(modifierFillMaxHeight$default, null, paddingValuesAsPaddingValues, false, null, null, null, false, null, (h.g.a.l) objRememberedValue, composer2, 6, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ag(list, (Object) str, lVar, i2, 4));
        }
    }

    public static void f(m mVar, h.g.a.l lVar, h.g.a.p pVar, Composer composer, int i2) {
        int i3;
        Composer composer2;
        h.g.b.x.f(mVar, "uiState");
        h.g.b.x.f(lVar, "callback");
        h.g.b.x.f(pVar, "loadingComposable");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(2088953866);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(mVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2088953866, i3, -1, "com.waze.ui.copilot.CarsSettingsScreen (CarsSettingsScreen.kt:101)");
            }
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, composerStartRestartGroup, (i3 >> 3) & 14);
            ScaffoldState scaffoldStateRememberScaffoldState = ScaffoldKt.rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
            aa aaVarA = mVar.a();
            if (aaVarA == null) {
                composerStartRestartGroup.startReplaceGroup(-2051223458);
            } else {
                composerStartRestartGroup.startReplaceGroup(-2051223457);
                m(aaVarA, scaffoldStateRememberScaffoldState, a.a.q(stateRememberUpdatedState), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            long jH = com.waze.bz.a.d(composerStartRestartGroup, 0).h();
            int i5 = 12;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1112955995, true, new af(stateRememberUpdatedState, i5), composerStartRestartGroup, 54);
            int i6 = o.f42352a;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m4175Scaffold27mzLpw(modifierFillMaxSize$default, scaffoldStateRememberScaffoldState, composableLambdaRememberComposableLambda, null, o.b(), null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, jH, 0L, ComposableLambdaKt.rememberComposableLambda(1002136972, true, new com.waze.z.a.g.u(pVar, mVar, stateRememberUpdatedState, i5), composerStartRestartGroup, 54), composer2, 24966, 12582912, 98280);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ag(mVar, lVar, pVar, i2, 3));
        }
    }

    static ab g(String str, String str2, ScaffoldState scaffoldState, h.g.a.l lVar, int i2, Composer composer) {
        n(str, str2, scaffoldState, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static ab h(aa aaVar, ScaffoldState scaffoldState, h.g.a.l lVar, int i2, Composer composer) {
        m(aaVar, scaffoldState, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static void i(int i2, com.waze.ui.r.a.d.c cVar, h.g.a.a aVar, Composer composer, int i3) {
        int i4;
        int i5;
        h.g.b.x.f(aVar, "onClick");
        int i6 = i3 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(2105498523);
        if (i6 == 0) {
            i4 = (true != composerStartRestartGroup.changed(i2) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(cVar == null ? -1 : cVar.ordinal()) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(aVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2105498523, i4, -1, "com.waze.ui.route_settings.RouteSettingsButton (RouteSettingsButton.kt:46)");
            }
            Modifier modifierM2757paddingVpY3zN4$default = PaddingKt.m2757paddingVpY3zN4$default(be.J(BackgroundKt.m1971backgroundbw27NRU(com.waze.design_components.d.b.h(SizeKt.m2808height3ABfNKs(com.waze.ui.r.a.d.d.b(Modifier.Companion, cVar), 48.0f), RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(24.0f)), com.waze.bz.a.d(composerStartRestartGroup, 0).h(), RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(24.0f)), false, null, aVar, composerStartRestartGroup, (i4 << 9) & 458752, 15), 16.0f, 0.0f, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2757paddingVpY3zN4$default);
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
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            h.g.a.a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.ROUTE_SETTINGS_BUTTON_TEXT, composerStartRestartGroup, 0), com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.f43319f, null), com.waze.bz.a.d(composerStartRestartGroup, 0).G(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, ab>) null, com.waze.bz.a.h(composerStartRestartGroup).i(), composerStartRestartGroup, 48, 0, 65528);
            composerStartRestartGroup = composerStartRestartGroup;
            if (i2 > 0) {
                composerStartRestartGroup.startReplaceGroup(-1394370385);
                SpacerKt.Spacer(SizeKt.m2827width3ABfNKs(Modifier.Companion, 4.0f), composerStartRestartGroup, 6);
                i5 = 6;
                TextKt.m4275Text4IGK_g(String.valueOf(i2), SizeKt.wrapContentHeight$default(PaddingKt.m2757paddingVpY3zN4$default(BackgroundKt.m1971backgroundbw27NRU(com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.f43320g, null), com.waze.bz.a.d(composerStartRestartGroup, 0).M(), RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(9.5f)), 5.0f, 0.0f, 2, null), null, false, 3, null), com.waze.bz.a.d(composerStartRestartGroup, 0).G(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, ab>) null, com.waze.bz.a.h(composerStartRestartGroup).j(), composerStartRestartGroup, 0, 0, 65528);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                i5 = 6;
                composerStartRestartGroup.startReplaceGroup(-1393834147);
                composerStartRestartGroup.endReplaceGroup();
            }
            SpacerKt.Spacer(SizeKt.m2827width3ABfNKs(Modifier.Companion, 8.0f), composerStartRestartGroup, i5);
            IconKt.m4110Iconww6aTOc(com.waze.ui.r.a.a.t.e(new com.waze.ui.ac.f(com.waze.design_components.b.d.aq.b()), null, composerStartRestartGroup, 0, i5), (String) null, SizeKt.m2827width3ABfNKs(Modifier.Companion, 20.0f), com.waze.bz.a.d(composerStartRestartGroup, 0).G(), composerStartRestartGroup, Painter.$stable | DisplayStrings.DS_DIRT_ROADS, 0);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.ui.d.l(i2, cVar, aVar, i3, 4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(final int r22, final int r23, final int r24, final h.g.a.a r25, final h.g.a.a r26, com.waze.ui.ac.i r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.g.w.j(int, int, int, h.g.a.a, h.g.a.a, com.waze.ui.ac.i, androidx.compose.runtime.Composer, int, int):void");
    }

    private static void k(h.g.a.a aVar, h.g.a.a aVar2, Composer composer, int i2) {
        int i3;
        h.g.a.a aVar3;
        h.g.a.a aVar4;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(351739520);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(aVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(351739520, i3, -1, "com.waze.ui.copilot.fteDialog (CopilotMarketplaceDialog.kt:51)");
            }
            aVar3 = aVar;
            aVar4 = aVar2;
            j(R.string.MARKETPLACE_FTE_DIALOG_TITLE, R.string.MARKETPLACE_FTE_DIALOG_DESCRIPTION, R.string.MARKETPLACE_FTE_DIALOG_BUTTON, aVar3, aVar4, new com.waze.ui.ac.f(R.drawable.copilot_marketplace_fte_dialog_icon), composerStartRestartGroup, (i3 << 9) & 64512, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            aVar3 = aVar;
            aVar4 = aVar2;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new v(aVar3, aVar4, i2, 1));
        }
    }

    private static void l(h.g.a.a aVar, h.g.a.a aVar2, Composer composer, int i2) {
        int i3;
        h.g.a.a aVar3;
        h.g.a.a aVar4;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-764303611);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(aVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-764303611, i3, -1, "com.waze.ui.copilot.generalErrorDialog (CopilotMarketplaceDialog.kt:62)");
            }
            aVar3 = aVar;
            aVar4 = aVar2;
            j(R.string.MARKETPLACE_LOADING_PAGE_ERROR_TITLE, R.string.MARKETPLACE_LOADING_PAGE_ERROR_CONTENT_TEXT, R.string.MARKETPLACE_LOADING_PAGE_ERROR_CTA_TEXT, aVar3, aVar4, null, composerStartRestartGroup, (i3 << 9) & 64512, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            aVar3 = aVar;
            aVar4 = aVar2;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new v(aVar3, aVar4, i2, 0));
        }
    }

    private static void m(final aa aaVar, final ScaffoldState scaffoldState, final h.g.a.l lVar, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(597321950);
        int i5 = 2;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(aaVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(scaffoldState) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(597321950, i3, -1, "com.waze.ui.copilot.ShowUserMessage (CarsSettingsScreen.kt:137)");
            }
            int i6 = 3;
            if (h.g.b.x.n(aaVar, y.f42377a)) {
                composerStartRestartGroup.startReplaceGroup(768876833);
                String strB = com.waze.ui.r.a.c.c.b(R.string.COPILOT_CARS_SETTINGS_LOADING_CARS_ERROR_MESSAGE, composerStartRestartGroup, 0);
                String strB2 = com.waze.ui.r.a.c.c.b(R.string.PLEASE_TRY_AGAIN_LATER, composerStartRestartGroup, 0);
                com.waze.z.a.c.b bVar = new com.waze.z.a.c.b(new com.waze.z.a.c.d(com.waze.ui.r.a.c.c.b(R.string.OKAY, composerStartRestartGroup, 0), com.waze.z.a.b.n.e(null, null, null, 7), false, null, 12));
                int i7 = i3 & DisplayStrings.DS_TAP_TO_VERIFY;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (i7 == 256 || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new com.waze.navigate.location_preview.x(lVar, i6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                com.waze.z.a.c.g gVar = (com.waze.z.a.c.g) objRememberedValue;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (i7 == 256 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new com.waze.sharedrive.c.r(lVar, i5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                com.waze.z.a.c.q.d(strB, strB2, bVar, gVar, (h.g.a.a) objRememberedValue2, null, composerStartRestartGroup, 0, 32);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!h.g.b.x.n(aaVar, z.f42378a)) {
                    composerStartRestartGroup.startReplaceGroup(-1499218890);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new h.i();
                }
                composerStartRestartGroup.startReplaceGroup(769405197);
                n(com.waze.ui.r.a.c.c.b(R.string.COPILOT_CARS_SETTINGS_SELECTING_CAR_ERROR_MESSAGE, composerStartRestartGroup, 0), com.waze.ui.r.a.c.c.b(R.string.OKAY, composerStartRestartGroup, 0), scaffoldState, lVar, composerStartRestartGroup, (i3 << 3) & 8064);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.ui.g.g
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return w.h(aaVar, scaffoldState, lVar, i2, (Composer) obj);
                }
            });
        }
    }

    private static void n(final String str, final String str2, final ScaffoldState scaffoldState, final h.g.a.l lVar, Composer composer, final int i2) {
        String str3;
        int i3;
        ScaffoldState scaffoldState2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-874765892);
        if (i4 == 0) {
            str3 = str;
            i3 = (true != composerStartRestartGroup.changed(str3) ? 2 : 4) | i2;
        } else {
            str3 = str;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(str2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            scaffoldState2 = scaffoldState;
            i3 |= true != composerStartRestartGroup.changed(scaffoldState2) ? 128 : 256;
        } else {
            scaffoldState2 = scaffoldState;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-874765892, i3, -1, "com.waze.ui.copilot.ShowSnackBar (CarsSettingsScreen.kt:169)");
            }
            SnackbarHostState snackbarHostState = scaffoldState2.getSnackbarHostState();
            boolean z = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256;
            boolean z2 = (i3 & 14) == 4;
            boolean z3 = (i3 & 112) == 32;
            boolean z4 = (i3 & 7168) == 2048;
            l lVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z2 | z | z3 | z4) || lVarRememberedValue == Composer.Companion.getEmpty()) {
                lVarRememberedValue = new l(scaffoldState, str3, str2, lVar, null);
                composerStartRestartGroup.updateRememberedValue(lVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(snackbarHostState, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super ab>, ? extends Object>) lVarRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.ui.g.h
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return w.g(str, str2, scaffoldState, lVar, i2, (Composer) obj);
                }
            });
        }
    }

    private w() {
        throw null;
    }
}
