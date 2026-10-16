package com.waze.trip_overview.views;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.IntSize;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.design_components.button.f;
import com.waze.design_components.button.g;
import com.waze.design_components.g.b;
import com.waze.gas.GasNativeManager;
import com.waze.shared_infra.q.r;
import com.waze.shared_infra.q.s;
import com.waze.strings.DisplayStrings;
import com.waze.ui.ac.i;
import com.waze.ui.r.a.a.t;
import com.waze.ui.r.a.c.c;
import com.waze.z.a.b.n;
import com.waze.z.a.be;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import java.util.Calendar;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l {
    /* JADX WARN: Removed duplicated region for block: B:248:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:258:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.util.List r37, final int r38, final h.g.a.l r39, androidx.compose.ui.Modifier r40, boolean r41, boolean r42, h.g.a.a r43, h.g.a.a r44, androidx.compose.runtime.Composer r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 1713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.trip_overview.views.l.a(java.util.List, int, h.g.a.l, androidx.compose.ui.Modifier, boolean, boolean, h.g.a.a, h.g.a.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final int b(com.waze.shared_infra.q.i iVar) {
        org.a.d.k.b bVarC;
        m mVar;
        x.f(iVar, "wazeDate");
        org.a.d.a.a aVar = s.f37952a;
        if (aVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) aVar).l();
            int i2 = ar.f48106a;
            mVar = new m(r.class);
        } else {
            bVarC = aVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new m(r.class);
        }
        return ((r) bVarC.a(mVar, null, null)).a(iVar.a() / 1000, Calendar.getInstance().getTimeInMillis() / 1000).c();
    }

    public static final boolean c(int i2) {
        long j2 = i2;
        return j2 >= ConfigValues.CONFIG_VALUE_U16_MINIMUM_VALID_AGE.b().longValue() && j2 <= ConfigValues.CONFIG_VALUE_U16_MAXIMUM_VALID_AGE.b().longValue();
    }

    public static final void d(final String str, com.waze.ui.ac.i iVar, String str2, final List list, h.g.a.a aVar, h.g.a.a aVar2, Composer composer, int i2) {
        int i3;
        com.waze.ui.ac.i iVar2;
        String str3;
        h.g.a.a aVar3;
        h.g.a.a aVar4;
        Composer composer2;
        x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        x.f(list, "badges");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(242346979);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(str) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            iVar2 = iVar;
            i3 |= true != composerStartRestartGroup.changed(iVar2) ? 16 : 32;
        } else {
            iVar2 = iVar;
        }
        if ((i2 & 384) == 0) {
            str3 = str2;
            i3 |= true != composerStartRestartGroup.changed(str3) ? 128 : 256;
        } else {
            str3 = str2;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(list) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            aVar3 = aVar;
            i3 |= true != composerStartRestartGroup.changedInstance(aVar3) ? 8192 : 16384;
        } else {
            aVar3 = aVar;
        }
        if ((196608 & i2) == 0) {
            aVar4 = aVar2;
            i3 |= true != composerStartRestartGroup.changedInstance(aVar4) ? 65536 : 131072;
        } else {
            aVar4 = aVar2;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(242346979, i3, -1, "com.waze.ui.crisis_response.CrisisResponseScreen (CrisisResponseScreen.kt:58)");
            }
            final com.waze.ui.ac.i iVar3 = iVar2;
            final String str4 = str3;
            final h.g.a.a aVar5 = aVar3;
            final h.g.a.a aVar6 = aVar4;
            composer2 = composerStartRestartGroup;
            CardKt.m4000CardFjzlyU(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 3.0f, 7, null), null, 0L, 0L, null, 3.0f, ComposableLambdaKt.rememberComposableLambda(-753182778, true, new p() { // from class: com.waze.ui.h.a
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    int i5;
                    Composer composer3 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-753182778, iIntValue, -1, "com.waze.ui.crisis_response.CrisisResponseScreen.<anonymous> (CrisisResponseScreen.kt:60)");
                        }
                        Modifier modifierM1972backgroundbw27NRU$default = BackgroundKt.m1972backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), com.waze.bz.a.d(composer3, 0).h(), null, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer3, 0);
                        int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM1972backgroundbw27NRU$default);
                        h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Updater.m7351setimpl(composer3, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m7351setimpl(composer3, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Updater.m7351setimpl(composer3, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
                        Updater.m7349reconcileimpl(composer3, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                        Updater.m7351setimpl(composer3, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 16.0f, 16.0f, 16.0f, 0.0f, 8, null), 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.Companion.getTop(), composer3, 6);
                        int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                        h.g.a.a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Updater.m7351setimpl(composer3, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m7351setimpl(composer3, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Updater.m7351setimpl(composer3, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
                        Updater.m7349reconcileimpl(composer3, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                        Updater.m7351setimpl(composer3, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                        Modifier modifierWeight$default = RowScope.CC.weight$default(RowScopeInstance.INSTANCE, Modifier.Companion, 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer3, 0);
                        int iB3 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierWeight$default);
                        h.g.a.a<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor3);
                        } else {
                            composer3.useNode();
                        }
                        List list2 = list;
                        String str5 = str;
                        i iVar4 = iVar3;
                        String str6 = str4;
                        Updater.m7351setimpl(composer3, measurePolicyColumnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m7351setimpl(composer3, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Updater.m7351setimpl(composer3, Integer.valueOf(iB3), ComposeUiNode.Companion.getSetCompositeKeyHash());
                        Updater.m7349reconcileimpl(composer3, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                        Updater.m7351setimpl(composer3, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        TextKt.m4275Text4IGK_g(str5, PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 2.0f, 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m11069getEllipsisgIe3tQ8(), false, 2, 0, (l<? super TextLayoutResult, ab>) null, com.waze.bz.a.h(composer3).f(), composer3, 48, DisplayStrings.DS_AAOS_PRIVACY_SETTINGS_DELETE_RECENT_DESTINATION_MESSAGE, 55292);
                        Composer composer4 = composer3;
                        b.g(list2, composer4, 0, 2);
                        composer4.endNode();
                        composer4.startReplaceGroup(1030847066);
                        ImageKt.Image(t.e(iVar4, Integer.valueOf(R.drawable.crisis_response_placeholder), composer4, 0, 4), (String) null, SizeKt.m2822size3ABfNKs(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 12.0f, 0.0f, 4.0f, 0.0f, 10, null), 48.0f), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, Painter.$stable | 48, 120);
                        composer4.endReplaceGroup();
                        composer4.endNode();
                        if (str6 == null) {
                            composer4.startReplaceGroup(-1654343236);
                            composer4.endReplaceGroup();
                            i5 = 0;
                        } else {
                            composer4.startReplaceGroup(-1654343235);
                            i5 = 0;
                            TextKt.m4275Text4IGK_g(str6, PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 16.0f, 4.0f, 16.0f, 0.0f, 8, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m11069getEllipsisgIe3tQ8(), false, 2, 0, (l<? super TextLayoutResult, ab>) null, com.waze.bz.a.h(composer4).b(), composer4, 0, DisplayStrings.DS_AAOS_PRIVACY_SETTINGS_DELETE_RECENT_DESTINATION_MESSAGE, 55292);
                            composer4 = composer4;
                            composer4.endReplaceGroup();
                        }
                        SpacerKt.Spacer(SizeKt.m2808height3ABfNKs(Modifier.Companion, 16.0f), composer4, 6);
                        Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(SizeKt.m2808height3ABfNKs(Modifier.Companion, 60.0f), 0.0f, 1, null), 16.0f, 0.0f, 16.0f, 16.0f, 2, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer4, i5);
                        int iB4 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer4, i5));
                        CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer4, modifierM2759paddingqDBjuR0$default);
                        h.g.a.a<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
                        if (!(composer4.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor4);
                        } else {
                            composer4.useNode();
                        }
                        h.g.a.a aVar7 = aVar6;
                        h.g.a.a aVar8 = aVar5;
                        Updater.m7351setimpl(composer4, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m7351setimpl(composer4, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Updater.m7351setimpl(composer4, Integer.valueOf(iB4), ComposeUiNode.Companion.getSetCompositeKeyHash());
                        Updater.m7349reconcileimpl(composer4, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                        Updater.m7351setimpl(composer4, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        String strB = c.b(R.string.CRISIS_RESPONSE_INFO, composer4, i5);
                        g gVar = g.f23359b;
                        f fVar = f.f23353a;
                        be.o(aVar8, SizeKt.m2827width3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.Companion, 0.0f, 1, null), 110.0f), strB, null, n.e(gVar, fVar, null, 4), null, false, false, composer4, 48, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_2W_4);
                        SpacerKt.Spacer(SizeKt.m2827width3ABfNKs(Modifier.Companion, 8.0f), composer4, 6);
                        be.o(aVar7, SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), c.b(R.string.CRISIS_RESPONSE_DRIVE_THERE, composer4, i5), null, n.e(g.f23358a, fVar, null, 4), null, false, false, composer4, 48, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_2W_4);
                        composer4.endNode();
                        composer4.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return ab.f48028a;
                }
            }, composerStartRestartGroup, 54), composer2, 1769478, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.menus.a.b(str, iVar, str2, list, aVar, aVar2, i2, 3));
        }
    }

    public static final void e(com.waze.ui.g.t tVar, h.g.a.l lVar, Composer composer, int i2) {
        int i3;
        x.f(tVar, "state");
        x.f(lVar, "onEvent");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(105112070);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(tVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        int i5 = 16;
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(105112070, i3, -1, "com.waze.ui.copilot.CopilotHeaderLayout (CopilotMarketplaceHeader.kt:43)");
            }
            String strB = tVar.b();
            int i6 = i3 & 112;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i6 == 32 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.sharedrive.c.r(lVar, 5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            be.h(strB, null, (h.g.a.a) objRememberedValue, null, ComposableLambdaKt.rememberComposableLambda(914183051, true, new com.waze.o.d.b.b.b(tVar, lVar, i5, null), composerStartRestartGroup, 54), null, composerStartRestartGroup, 24576, 42);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.copilot.presentation.c(tVar, lVar, i2, 20));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final long f(MutableState mutableState) {
        return ((IntSize) mutableState.getValue()).m11343unboximpl();
    }
}
