package com.waze.z.a.b;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.media3.common.util.WavUtil;
import androidx.media3.muxer.MuxerUtil;
import com.waze.authentication.am;
import com.waze.fa;
import com.waze.gas.GasNativeManager;
import com.waze.z.a.be;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class y {
    public /* synthetic */ y(byte[] bArr) {
    }

    public static x a(ab abVar, LazyListState lazyListState, Composer composer, int i2) {
        h.g.b.x.f(abVar, "bottomSheetState");
        h.g.b.x.f(lazyListState, "lazyListState");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(650884284, i2, -1, "com.waze.design_components_compose.components.bottom_sheet.rememberWazeBottomSheetNestedLazyScrollConnection (WazeBottomSheetNestedScrollConnection.kt:76)");
        }
        boolean zChanged = ((((i2 & 14) ^ 6) > 4 && composer.changed(abVar)) || (i2 & 6) == 4) | composer.changed(lazyListState);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new x(abVar, lazyListState, 1);
            composer.updateRememberedValue(objRememberedValue);
        }
        x xVar = (x) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return xVar;
    }

    static h.ab c(final ab abVar, Integer num, MutableInteractionSource mutableInteractionSource, final boolean z, final af afVar, final h.g.a.p pVar, BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, int i2) {
        int i3;
        h.g.b.x.f(boxWithConstraintsScope, "$this$BoxWithConstraints");
        if ((i2 & 6) == 0) {
            i3 = i2 | (true != composer.changed(boxWithConstraintsScope) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2073299232, i3, -1, "com.waze.design_components_compose.components.bottom_sheet.WazeBottomSheet.<anonymous> (WazeBottomSheet.kt:66)");
            }
            abVar.t(Integer.valueOf(h.h.a.b(be.H(boxWithConstraintsScope.mo2468getMaxHeightD9Ej5fM(), composer, 0))), num);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new am(abVar, 17));
                composer.updateRememberedValue(objRememberedValue);
            }
            if (((Boolean) ((State) objRememberedValue).getValue()).booleanValue()) {
                composer.startReplaceGroup(-265634398);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-266892533);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                boolean zChanged = composer.changed(abVar);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new com.waze.c.e.a.a(abVar, 20);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                SurfaceKt.m4216SurfaceFjzlyU(BackgroundKt.m1972backgroundbw27NRU$default(AnchoredDraggableKt.anchoredDraggable$default(OffsetKt.offset(modifierFillMaxWidth$default, (h.g.a.l) objRememberedValue2), abVar.d(), Orientation.Vertical, abVar.u(), mutableInteractionSource, null, abVar.e(), 16, null), com.waze.bz.a.d(composer, 0).U(), null, 2, null), RoundedCornerShapeKt.m3088RoundedCornerShapea9UjIt4$default(20.0f, 20.0f, 0.0f, 0.0f, 12, null), com.waze.bz.a.d(composer, 0).h(), 0L, null, 6.0f, ComposableLambdaKt.rememberComposableLambda(499187049, true, new h.g.a.p() { // from class: com.waze.z.a.b.o
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(499187049, iIntValue, -1, "com.waze.design_components_compose.components.bottom_sheet.WazeBottomSheet.<anonymous>.<anonymous> (WazeBottomSheet.kt:98)");
                            }
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
                            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default);
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
                            boolean z2 = z;
                            Updater.m7351setimpl(composer2, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.m7351setimpl(composer2, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            Updater.m7351setimpl(composer2, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
                            Updater.m7349reconcileimpl(composer2, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                            Updater.m7351setimpl(composer2, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            if (z2) {
                                final ab abVar2 = abVar;
                                final af afVar2 = afVar;
                                composer2.startReplaceGroup(-423640176);
                                boolean zChangedInstance = composer2.changedInstance(afVar2) | composer2.changed(abVar2);
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChangedInstance || objRememberedValue3 == Composer.Companion.getEmpty()) {
                                    objRememberedValue3 = new h.g.a.a() { // from class: com.waze.z.a.b.p
                                        @Override // h.g.a.a
                                        public final Object invoke() {
                                            aj.z(afVar2, null, null, new s(abVar2, null), 3);
                                            return h.ab.f48028a;
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                y.e((h.g.a.a) objRememberedValue3, composer2, 0);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(-423437405);
                                composer2.endReplaceGroup();
                            }
                            pVar.invoke(composer2, 0);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer2.skipToGroupEnd();
                        }
                        return h.ab.f48028a;
                    }
                }, composer, 54), composer, 1769472, 24);
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(androidx.compose.ui.Modifier r16, com.waze.z.a.b.ab r17, boolean r18, androidx.compose.foundation.interaction.MutableInteractionSource r19, final h.g.a.p r20, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.z.a.b.y.d(androidx.compose.ui.Modifier, com.waze.z.a.b.ab, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }

    public static void e(h.g.a.a aVar, Composer composer, int i2) {
        int i3;
        h.g.b.x.f(aVar, "onClick");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1091758225);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(aVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1091758225, i3, -1, "com.waze.design_components_compose.components.bottom_sheet.WazeBottomSheetHandle (WazeBottomSheetHandle.kt:28)");
            }
            Modifier modifierJ = be.J(PaddingKt.m2759paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, 12.0f, 0.0f, 12.0f, 5, null), false, null, aVar, composerStartRestartGroup, ((i3 << 15) & 458752) | 54, 14);
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
            DividerKt.m4060DivideroMI9zvI(com.waze.ui.r.a.d.d.a(ClipKt.clip(BoxScopeInstance.INSTANCE.align(SizeKt.m2827width3ABfNKs(Modifier.Companion, 56.0f), Alignment.Companion.getCenter()), RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(2.0f)), com.waze.ui.r.a.d.c.ab, null), com.waze.bz.a.d(composerStartRestartGroup, 0).z(), 4.0f, 0.0f, composerStartRestartGroup, 384, 8);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fa(aVar, i2, 8));
        }
    }

    static h.ab f(k kVar, int i2, int i3, Composer composer) {
        i(kVar, i2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return h.ab.f48028a;
    }

    public static void g(String str, Modifier modifier, h.g.a.l lVar, Composer composer, int i2) {
        Composer composer2;
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        int i3 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1547204824);
        int i4 = i3 == 0 ? (true != composerStartRestartGroup.changed(str) ? 2 : 4) | i2 : i2;
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1547204824, i4, -1, "com.waze.design_components_compose.components.bottom_sheet.SheetHeader (SheetHeader.kt:41)");
            }
            l lVar2 = new l();
            lVar.invoke(lVar2);
            Modifier modifierM2811requiredHeight3ABfNKs = SizeKt.m2811requiredHeight3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), 48.0f);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 48);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2811requiredHeight3ABfNKs);
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
            TextKt.m4275Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, TextStyle.m10559copyp1EtxEg$default(com.waze.bz.a.h(composerStartRestartGroup).f(), com.waze.bz.a.d(composerStartRestartGroup, 0).o(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), composerStartRestartGroup, i4 & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            composer2 = composerStartRestartGroup;
            SpacerKt.Spacer(RowScope.CC.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null), composer2, 0);
            composer2.startReplaceGroup(2010973569);
            int i5 = 0;
            for (Object obj : lVar2.b()) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    h.a.i.p();
                }
                i((k) obj, i5, composer2, 0);
                i5 = i6;
            }
            composer2.endReplaceGroup();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.c.e.w(str, modifier, lVar, i2, 6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IntOffset h(ab abVar, Density density) {
        h.g.b.x.f(density, "$this$offset");
        Float fValueOf = Float.valueOf(abVar.b());
        if (true == Float.isNaN(fValueOf.floatValue())) {
            fValueOf = null;
        }
        return IntOffset.m11287boximpl((fValueOf != null ? h.h.a.b(fValueOf.floatValue()) : 0) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    private static void i(k kVar, int i2, Composer composer, int i3) {
        int i4;
        int i5 = i3 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-853207199);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changed(kVar) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(i2) ? 16 : 32;
        }
        int i6 = 0;
        if (composerStartRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-853207199, i4, -1, "com.waze.design_components_compose.components.bottom_sheet.HeaderActionButton (SheetHeader.kt:59)");
            }
            Modifier modifierJ = be.J(com.waze.ui.r.a.d.d.a(SizeKt.m2822size3ABfNKs(Modifier.Companion, 48.0f), com.waze.ui.r.a.d.c.eq, Integer.valueOf(i2)), false, null, kVar.b(), composerStartRestartGroup, 48, 14);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
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
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(kVar.a(), composerStartRestartGroup, 0), (String) null, BackgroundKt.m1971backgroundbw27NRU(SizeKt.m2822size3ABfNKs(Modifier.Companion, 32.0f), com.waze.bz.a.d(composerStartRestartGroup, 0).M(), RoundedCornerShapeKt.getCircleShape()), Alignment.Companion.getCenter(), ContentScale.Companion.getInside(), 0.0f, ColorFilter.Companion.m8269tintxETnrds$default(ColorFilter.Companion, com.waze.bz.a.d(composerStartRestartGroup, 0).q(), 0, 2, null), composerStartRestartGroup, Painter.$stable | 27696, 32);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new i(kVar, i2, i3, i6));
        }
    }

    private y() {
        throw null;
    }
}
