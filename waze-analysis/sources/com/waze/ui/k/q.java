package com.waze.ui.k;

import android.view.View;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.waze.R;
import com.waze.location.af;
import com.waze.sharedrive.c.r;
import com.waze.strings.DisplayStrings;
import com.waze.trip_overview.cl;
import com.waze.trip_overview.cm;
import com.waze.ui.l.bh;
import com.waze.ui.m.ao;
import com.waze.ui.m.dx;
import com.waze.ui.t;
import com.waze.z.a.ag;
import com.waze.z.a.az;
import com.waze.z.a.ba;
import com.waze.z.a.be;
import com.waze.z.a.d.ad;
import h.ab;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class q {
    public /* synthetic */ q(byte[] bArr) {
    }

    static ab a(i iVar, h.g.a.l lVar, PaddingValues paddingValues, Composer composer, int i2) {
        x.f(paddingValues, "padding");
        int i3 = (i2 & 6) == 0 ? i2 | (true != composer.changed(paddingValues) ? 2 : 4) : i2;
        if (composer.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1192838471, i3, -1, "com.waze.ui.hnc.HncSettingsScreen.<anonymous> (HncSettingsScreen.kt:136)");
            }
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(ScrollKt.verticalScroll$default(Modifier.Companion, ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null), 0.0f, 1, null), paddingValues);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
            Updater.m7351setimpl(composer, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.HNC_HOY_NO_CIRCULA_DESCRIPTION, composer, 0), PaddingKt.m2759paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 16.0f, 16.0f, 16.0f, 0.0f, 8, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, ab>) null, com.waze.bz.a.h(composer).a(), composer, 0, 0, 65532);
            Composer composer2 = composer;
            if (iVar.c()) {
                composer2.startReplaceGroup(685100856);
                String strB = com.waze.ui.r.a.c.c.b(R.string.HNC_LEARN_MORE, composer2, 0);
                long jG = com.waze.bz.a.d(composer2, 0).G();
                TextStyle textStyleA = com.waze.bz.a.h(composer2).a();
                Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 16.0f, 8.0f, 16.0f, 0.0f, 8, null);
                boolean zChanged = composer2.changed(lVar);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new r(lVar, 12);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                TextKt.m4275Text4IGK_g(strB, ClickableKt.m2007clickableoSLSa3U$default(modifierM2759paddingqDBjuR0$default, false, null, null, null, (h.g.a.a) objRememberedValue, 15, null), jG, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, ab>) null, textStyleA, composer, 0, 0, 65528);
                composer2 = composer;
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(685440337);
                composer2.endReplaceGroup();
            }
            SpacerKt.Spacer(SizeKt.m2808height3ABfNKs(Modifier.Companion, 40.0f), composer2, 6);
            TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.HNC_ADD_LICENSE_PLATE, composer2, 0), PaddingKt.m2757paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 16.0f, 0.0f, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, ab>) null, com.waze.bz.a.h(composer2).l(), composer, 48, 0, 65532);
            Composer composer3 = composer;
            String strA = iVar.a();
            boolean zChanged2 = composer3.changed(lVar);
            Object objRememberedValue2 = composer3.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new cl(lVar, 5);
                composer3.updateRememberedValue(objRememberedValue2);
            }
            l(strA, (h.g.a.l) objRememberedValue2, composer3, 0);
            if (iVar.b().isEmpty()) {
                composer3.startReplaceGroup(686291473);
                composer3.endReplaceGroup();
            } else {
                composer3.startReplaceGroup(685900346);
                TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.HNC_SELECT_YOUR_PERMIT, composer3, 0), PaddingKt.m2755padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 16.0f), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, ab>) null, com.waze.bz.a.h(composer3).l(), composer, 48, 0, 65532);
                composer3 = composer;
                for (h hVar : iVar.b()) {
                    boolean zChanged3 = composer3.changed(lVar);
                    Object objRememberedValue3 = composer3.rememberedValue();
                    if (zChanged3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = new cl(lVar, 3);
                        composer3.updateRememberedValue(objRememberedValue3);
                    }
                    m(hVar, (h.g.a.l) objRememberedValue3, composer3, 0);
                }
                composer3.endReplaceGroup();
            }
            composer3.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static ab b(h hVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(97033387, i2, -1, "com.waze.ui.hnc.PermitSelectionCell.<anonymous> (HncSettingsScreen.kt:276)");
            }
            n(hVar.d(), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public static void c(final i iVar, final h.g.a.l lVar, Composer composer, int i2) {
        int i3;
        Composer composer2;
        int i4;
        x.f(iVar, "uiState");
        x.f(lVar, "handleEvent");
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-367378491);
        if (i5 == 0) {
            i3 = (true != composerStartRestartGroup.changed(iVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-367378491, i3, -1, "com.waze.ui.hnc.HncSettingsScreen (HncSettingsScreen.kt:106)");
            }
            int i6 = i3 & 112;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i6 == 32 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new r(lVar, 11);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BackHandlerKt.BackHandler(false, (h.g.a.a) objRememberedValue, composerStartRestartGroup, 0, 1);
            composer2 = composerStartRestartGroup;
            i4 = 2;
            ScaffoldKt.m4175Scaffold27mzLpw(null, null, ComposableLambdaKt.rememberComposableLambda(-1694619808, true, new af(lVar, 13), composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-999972801, true, new com.waze.parking.f(iVar, lVar, 15, null), composerStartRestartGroup, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, com.waze.bz.a.d(composerStartRestartGroup, 0).h(), 0L, ComposableLambdaKt.rememberComposableLambda(1192838471, true, new h.g.a.q() { // from class: com.waze.ui.k.m
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return q.a(iVar, lVar, (PaddingValues) obj, (Composer) obj2, iIntValue);
                }
            }, composerStartRestartGroup, 54), composer2, DisplayStrings.DS_CATEGORY_SEARCH_AMENITIES_FILTER_CHARGING_STATION, 12582912, 98291);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            i4 = 2;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ad(iVar, lVar, i2, i4));
        }
    }

    static ab d(String str, h.g.a.l lVar, int i2, Composer composer) {
        l(str, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static ab e(h hVar, h.g.a.l lVar, int i2, Composer composer) {
        m(hVar, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static ab f(boolean z, int i2, Composer composer) {
        n(z, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static com.waze.ui.m.a g() {
        return new com.waze.ui.m.a(com.waze.design_components.b.d.r, new com.waze.ui.ac.m("Delete"), ao.f42792a);
    }

    public static void h(dx dxVar, h.g.a.l lVar, Composer composer, int i2) {
        int i3;
        dx dxVar2;
        x.f(dxVar, "actions");
        x.f(lVar, "handleEvent");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(939290609);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(dxVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(939290609, i3, -1, "com.waze.ui.location_preview.ActionsLayout (LocationPreviewActionsBar.kt:44)");
            }
            dxVar2 = dxVar;
            be.y(dxVar2, null, null, ComposableLambdaKt.rememberComposableLambda(270524014, true, new com.waze.main_screen.c.b.a(lVar, 20), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            dxVar2 = dxVar;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ad(dxVar2, lVar, i2, 5));
        }
    }

    public static void i(List list, h.g.a.l lVar, Composer composer, int i2) {
        int i3;
        x.f(list, "actions");
        x.f(lVar, "handleEvent");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1506501776);
        int i5 = 4;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(list) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1506501776, i3, -1, "com.waze.ui.location_preview.ActionsLayoutPresent (LocationPreviewActionsBar.kt:64)");
            }
            byte[] bArr = null;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m2808height3ABfNKs(Modifier.Companion, 80.0f), 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.rememberComposableLambda(-2085569172, true, new com.waze.o.d.b.b.b(list, lVar, 17, bArr), composerStartRestartGroup, 54), composerStartRestartGroup, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 7);
            bh.d(boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getBottomStart()), true, composerStartRestartGroup, 48);
            bh.d(boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getBottomEnd()), false, composerStartRestartGroup, 48);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ad(list, lVar, i2, i5));
        }
    }

    public static void j(Modifier modifier, com.waze.ui.m.a aVar, h.g.a.l lVar, Composer composer, int i2) {
        int i3;
        Composer composer2;
        x.f(aVar, "action");
        x.f(lVar, "handleEvent");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1662320944);
        boolean z = true;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? composerStartRestartGroup.changed(aVar) : composerStartRestartGroup.changedInstance(aVar)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1662320944, i3, -1, "com.waze.ui.location_preview.ActionLayout (LocationPreviewActionsBar.kt:99)");
            }
            RoundedCornerShape roundedCornerShapeM3086RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(16.0f);
            Modifier modifierM2829widthInVpY3zN4$default = SizeKt.m2829widthInVpY3zN4$default(SizeKt.m2808height3ABfNKs(ClipKt.clip(BackgroundKt.m1971backgroundbw27NRU(modifier, com.waze.bz.a.d(composerStartRestartGroup, 0).M(), roundedCornerShapeM3086RoundedCornerShape0680j_4), roundedCornerShapeM3086RoundedCornerShape0680j_4), 80.0f), 80.0f, 0.0f, 2, null);
            boolean z2 = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256;
            if ((i3 & 112) != 32 && ((i3 & 64) == 0 || !composerStartRestartGroup.changedInstance(aVar))) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new t(lVar, aVar, 5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM2755padding3ABfNKs = PaddingKt.m2755padding3ABfNKs(be.J(modifierM2829widthInVpY3zN4$default, false, null, (h.g.a.a) objRememberedValue, composerStartRestartGroup, 0, 15), 8.0f);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), composerStartRestartGroup, 48);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2755padding3ABfNKs);
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
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            bh.e(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 10.0f, 0.0f, 10.0f, 5, null), aVar.a(), aVar.b(), com.waze.bz.a.d(composerStartRestartGroup, 0).G(), PaddingKt.m2748PaddingValues0680j_4(0.0f), composerStartRestartGroup, 24582, 0);
            composer2 = composerStartRestartGroup;
            TextKt.m4275Text4IGK_g(com.waze.ui.a.l.o(aVar.d(), composerStartRestartGroup, 0), (Modifier) null, com.waze.bz.a.d(composerStartRestartGroup, 0).G(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (h.g.a.l<? super TextLayoutResult, ab>) null, com.waze.bz.a.h(composerStartRestartGroup).c(), composer2, 0, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 57338);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ag(modifier, aVar, lVar, i2, 6));
        }
    }

    public static void k(final Modifier modifier, final boolean z, final int i2, final String str, final boolean z2, final h.g.a.a aVar, final h.g.a.a aVar2, Composer composer, final int i3) {
        int i4;
        boolean z3;
        x.f(str, "destinationName");
        x.f(aVar2, "onCloseClicked");
        int i5 = i3 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-697150369);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            z3 = z;
            i4 |= true != composerStartRestartGroup.changed(z3) ? 16 : 32;
        } else {
            z3 = z;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changed(i2) ? 128 : 256;
        }
        if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changed(str) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i4 |= true != composerStartRestartGroup.changed(z2) ? 8192 : 16384;
        }
        if ((196608 & i3) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(aVar) ? 65536 : 131072;
        }
        if ((1572864 & i3) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 524288 : 1048576;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i4) != 599186, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-697150369, i4, -1, "com.waze.ui.shared_drive.LiveShareHeader (LiveShareHeader.kt:36)");
            }
            final boolean z4 = z3;
            SurfaceKt.m4216SurfaceFjzlyU(com.waze.ui.r.a.d.d.a(modifier, com.waze.ui.r.a.d.c.dG, null), null, com.waze.bz.a.d(composerStartRestartGroup, 0).h(), 0L, null, AnimateAsStateKt.m1867animateDpAsStateAjpBEmI(z2 ? 4.0f : 0.0f, null, null, null, composerStartRestartGroup, 0, 14).getValue().m11178unboximpl(), ComposableLambdaKt.rememberComposableLambda(446184091, true, new h.g.a.p() { // from class: com.waze.ui.z.g
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    String strB;
                    String strD;
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(446184091, iIntValue, -1, "com.waze.ui.shared_drive.LiveShareHeader.<anonymous> (LiveShareHeader.kt:43)");
                        }
                        Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(SizeKt.m2808height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 70.0f), 16.0f, 0.0f, 0.0f, 0.0f, 14, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
                        int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM2759paddingqDBjuR0$default);
                        h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        int i6 = i2;
                        boolean z5 = z4;
                        Updater.m7351setimpl(composer2, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m7351setimpl(composer2, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Updater.m7351setimpl(composer2, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
                        Updater.m7349reconcileimpl(composer2, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                        Updater.m7351setimpl(composer2, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        if (z5) {
                            composer2.startReplaceGroup(287369692);
                            strB = com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_LIVE_DRIVE_TITLE_ENDED, composer2, 0);
                            composer2.endReplaceGroup();
                        } else if (i6 <= 2) {
                            composer2.startReplaceGroup(287372470);
                            strB = com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_LIVE_DRIVE_TITLE, composer2, 0);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(287374658);
                            strB = com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_LIVE_DRIVE_GROUP_DRIVE_TITLE, composer2, 0);
                            composer2.endReplaceGroup();
                        }
                        h.g.a.a aVar3 = aVar2;
                        h.g.a.a aVar4 = aVar;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                        boolean zChanged = composer2.changed(aVar4) | composer2.changed(aVar3);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                            objRememberedValue = new com.waze.bw.a.b.l(aVar4, aVar3, 20);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        String str2 = str;
                        com.waze.z.a.b.y.g(strB, modifierFillMaxWidth$default, (h.g.a.l) objRememberedValue, composer2, 48);
                        if (i6 <= 1) {
                            composer2.startReplaceGroup(319165268);
                            strD = com.waze.ui.r.a.c.c.d(R.string.SHARE_DRIVE_LIVE_DRIVE_SUBTITLE_ONE_MEMBER_PS, new Object[]{str2}, composer2);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(319275566);
                            strD = com.waze.ui.r.a.c.c.d(R.string.SHARE_DRIVE_LIVE_DRIVE_SUBTITLE_PD_PS, new Object[]{Integer.valueOf(i6), str2}, composer2);
                            composer2.endReplaceGroup();
                        }
                        TextKt.m4275Text4IGK_g(strD, com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.dH, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, TextStyle.m10559copyp1EtxEg$default(com.waze.bz.a.h(composer2).m(), com.waze.bz.a.d(composer2, 0).q(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), composer2, 48, 0, 65532);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return h.ab.f48028a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 26);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.ui.z.h
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    Modifier modifier2 = modifier;
                    boolean z5 = z;
                    int i6 = i2;
                    String str2 = str;
                    boolean z6 = z2;
                    h.g.a.a aVar3 = aVar;
                    com.waze.ui.k.q.k(modifier2, z5, i6, str2, z6, aVar3, aVar2, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
                    return h.ab.f48028a;
                }
            });
        }
    }

    private static void l(String str, h.g.a.l lVar, Composer composer, int i2) {
        int i3;
        az azVar;
        Integer numValueOf;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-454623574);
        int i5 = 2;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(str) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        int i6 = 0;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-454623574, i3, -1, "com.waze.ui.hnc.LicensePlateField (HncSettingsScreen.kt:211)");
            }
            FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            if (((Boolean) mutableState.getValue()).booleanValue() || str.length() <= 0 || str.length() == 2) {
                composerStartRestartGroup.startReplaceGroup(1193422439);
                composerStartRestartGroup.endReplaceGroup();
                Character chL = h.n.o.L(h.n.o.M(str, 1));
                int iIntValue = R.drawable.t2_hoy_no_circula_lp_default_grey;
                if (chL != null) {
                    switch (chL.charValue()) {
                        case '0':
                        case '9':
                            numValueOf = Integer.valueOf(R.drawable.t2_hoy_no_circula_lp_9y0_blue);
                            break;
                        case '1':
                        case '2':
                            numValueOf = Integer.valueOf(R.drawable.t2_hoy_no_circula_lp_1y2_green);
                            break;
                        case '3':
                        case '4':
                            numValueOf = Integer.valueOf(R.drawable.t2_hoy_no_circula_lp_3y4_red);
                            break;
                        case '5':
                        case '6':
                            numValueOf = Integer.valueOf(R.drawable.t2_hoy_no_circula_lp_5y6_yellow);
                            break;
                        case '7':
                        case '8':
                            numValueOf = Integer.valueOf(R.drawable.t2_hoy_no_circula_lp_7y8_pink);
                            break;
                        default:
                            numValueOf = null;
                            break;
                    }
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    }
                }
                azVar = new az(new com.waze.ui.ac.c(iIntValue));
            } else {
                composerStartRestartGroup.startReplaceGroup(1193419728);
                ba baVar = new ba(StringResources_androidKt.stringResource(R.string.HNC_LAST_2_DIGITS_REQUIRED, composerStartRestartGroup, 0), i5);
                composerStartRestartGroup.endReplaceGroup();
                azVar = baVar;
            }
            View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(focusManager) | composerStartRestartGroup.changedInstance(view);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new cm((Object) view, mutableState, (Object) focusManager, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.DisposableEffect(view, (h.g.a.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            MutableState mutableState3 = (MutableState) objRememberedValue4;
            Boolean boolValueOf = Boolean.valueOf(((Boolean) mutableState3.getValue()).booleanValue());
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(focusManager);
            o oVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || oVarRememberedValue == Composer.Companion.getEmpty()) {
                oVarRememberedValue = new o(focusManager, mutableState3, null);
                composerStartRestartGroup.updateRememberedValue(oVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(boolValueOf, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super ab>, ? extends Object>) oVarRememberedValue, composerStartRestartGroup, 0);
            Modifier modifierM2756paddingVpY3zN4 = PaddingKt.m2756paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 16.0f, 24.0f);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composerStartRestartGroup, 48);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2756paddingVpY3zN4);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i7 = i3 & 112;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (i7 == 32 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = new cm(lVar, mutableState2, mutableState3, 4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            h.g.a.l lVar2 = (h.g.a.l) objRememberedValue5;
            Modifier modifierWeight$default = RowScope.CC.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = new cl(mutableState, 4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            be.q(str, lVar2, FocusChangedModifierKt.onFocusChanged(modifierWeight$default, (h.g.a.l) objRememberedValue6), StringResources_androidKt.stringResource(R.string.HNC_SETTINGS_LICENCE_PLATE_PLACEHOLDER, composerStartRestartGroup, 0), false, KeyboardType.Companion.m10811getNumberPjHm6EE(), ImeAction.Companion.m10731getDoneeUduSuo(), null, null, azVar, composerStartRestartGroup, (i3 & 14) | 1769472, DisplayStrings.DS_NIGHT);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new k(str, lVar, i2, i6));
        }
    }

    private static void m(final h hVar, h.g.a.l lVar, Composer composer, int i2) {
        int i3;
        Composer composer2;
        int i4;
        com.waze.location.q qVarG;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-955615890);
        int i6 = 4;
        if (i5 == 0) {
            i3 = (true != composerStartRestartGroup.changed(hVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-955615890, i3, -1, "com.waze.ui.hnc.PermitSelectionCell (HncSettingsScreen.kt:271)");
            }
            String strO = com.waze.ui.a.l.o(hVar.b(), composerStartRestartGroup, 0);
            com.waze.ui.ac.n nVarA = hVar.a();
            if (nVarA == null) {
                composerStartRestartGroup.startReplaceGroup(-1709398427);
                composerStartRestartGroup.endReplaceGroup();
                qVarG = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1709398426);
                qVarG = com.waze.z.a.a.h.g(com.waze.ui.a.l.o(nVarA, composerStartRestartGroup, 0));
                composerStartRestartGroup.endReplaceGroup();
            }
            com.waze.location.q qVar = qVarG;
            boolean z = (i3 & 112) == 32;
            boolean z2 = (i3 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z | z2) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new t(lVar, hVar, i6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            i4 = 1;
            composer2 = composerStartRestartGroup;
            com.waze.z.a.a.h.h(strO, false, true, null, 0L, (h.g.a.a) objRememberedValue, null, ComposableLambdaKt.rememberComposableLambda(97033387, true, new h.g.a.p() { // from class: com.waze.ui.k.j
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return q.b(hVar, (Composer) obj, iIntValue);
                }
            }, composerStartRestartGroup, 54), null, qVar, composer2, 12583344, 0, DisplayStrings.DS_LOCATION);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            i4 = 1;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new k(hVar, lVar, i2, i4));
        }
    }

    private static void n(final boolean z, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1234239333);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(z) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1234239333, i3, -1, "com.waze.ui.hnc.TrailingSelectedIcon (HncSettingsScreen.kt:283)");
            }
            Modifier modifierM2814requiredSize3ABfNKs = SizeKt.m2814requiredSize3ABfNKs(Modifier.Companion, 24.0f);
            ImageKt.Image(PainterResources_androidKt.painterResource(com.waze.design_components.b.d.f23302c.c(com.waze.design_components.b.e.f23313b), composerStartRestartGroup, 0), true != z ? null : "Selected", modifierM2814requiredSize3ABfNKs, (Alignment) null, ContentScale.Companion.getFit(), true != z ? 0.0f : 1.0f, ColorFilter.Companion.m8269tintxETnrds$default(ColorFilter.Companion, com.waze.bz.a.d(composerStartRestartGroup, 0).G(), 0, 2, null), composerStartRestartGroup, Painter.$stable | 24960, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.ui.k.l
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return q.f(z, i2, (Composer) obj);
                }
            });
        }
    }

    private q() {
        throw null;
    }
}
