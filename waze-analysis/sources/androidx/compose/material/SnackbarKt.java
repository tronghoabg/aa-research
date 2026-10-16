package androidx.compose.material;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SnackbarKt {
    private static final float HeightToFirstLine = 30.0f;
    private static final float HorizontalSpacing = 16.0f;
    private static final float HorizontalSpacingButtonSide = 8.0f;
    private static final float LongButtonVerticalOffset = 12.0f;
    private static final float SeparateButtonExtraY = 2.0f;
    private static final float SnackbarMinHeightOneLine = 48.0f;
    private static final float SnackbarMinHeightTwoLines = 68.0f;
    private static final float SnackbarVerticalPadding = 6.0f;
    private static final float TextEndExtraSpacing = 8.0f;

    private static final void NewLineButtonSnackbar(final p<? super Composer, ? super Integer, ab> pVar, final p<? super Composer, ? super Integer, ab> pVar2, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1534293206);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(pVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar2) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1534293206, i3, -1, "androidx.compose.material.NewLineButtonSnackbar (Snackbar.kt:289)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            float f2 = HorizontalSpacing;
            float f3 = HorizontalSpacingButtonSide;
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(modifierFillMaxWidth$default, f2, 0.0f, f3, SeparateButtonExtraY, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2759paddingqDBjuR0$default);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
            p<ComposeUiNode, Integer, ab> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerStartRestartGroup.getInserting() || !x.n(composerStartRestartGroup.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Integer numValueOf = Integer.valueOf(currentCompositeKeyHash);
                composerStartRestartGroup.updateRememberedValue(numValueOf);
                composerStartRestartGroup.apply(numValueOf, setCompositeKeyHash);
            }
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierM2759paddingqDBjuR0$default2 = PaddingKt.m2759paddingqDBjuR0$default(AlignmentLineKt.m2414paddingFromBaselineVpY3zN4(Modifier.Companion, HeightToFirstLine, LongButtonVerticalOffset), 0.0f, 0.0f, f3, 0.0f, 11, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2759paddingqDBjuR0$default2);
            a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, ab> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerStartRestartGroup.getInserting() || !x.n(composerStartRestartGroup.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                Integer numValueOf2 = Integer.valueOf(currentCompositeKeyHash2);
                composerStartRestartGroup.updateRememberedValue(numValueOf2);
                composerStartRestartGroup.apply(numValueOf2, setCompositeKeyHash2);
            }
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(composerStartRestartGroup, Integer.valueOf(i3 & 14));
            composerStartRestartGroup.endNode();
            Modifier modifierAlign = columnScopeInstance.align(Modifier.Companion, Alignment.Companion.getEnd());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign);
            a<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, ab> setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerStartRestartGroup.getInserting() || !x.n(composerStartRestartGroup.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                Integer numValueOf3 = Integer.valueOf(currentCompositeKeyHash3);
                composerStartRestartGroup.updateRememberedValue(numValueOf3);
                composerStartRestartGroup.apply(numValueOf3, setCompositeKeyHash3);
            }
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            pVar2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 3) & 14));
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
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.SnackbarKt$$ExternalSyntheticLambda8
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SnackbarKt.NewLineButtonSnackbar$lambda$1(pVar, pVar2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab NewLineButtonSnackbar$lambda$1(p pVar, p pVar2, int i2, Composer composer, int i3) {
        NewLineButtonSnackbar(pVar, pVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    private static final void OneRowSnackbar(final p<? super Composer, ? super Integer, ab> pVar, final p<? super Composer, ? super Integer, ab> pVar2, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1302703572);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(pVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar2) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1302703572, i3, -1, "androidx.compose.material.OneRowSnackbar (Snackbar.kt:310)");
            }
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, HorizontalSpacing, 0.0f, HorizontalSpacingButtonSide, 0.0f, 10, null);
            SnackbarKt$OneRowSnackbar$2$1 snackbarKt$OneRowSnackbar$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (snackbarKt$OneRowSnackbar$2$1RememberedValue == Composer.Companion.getEmpty()) {
                snackbarKt$OneRowSnackbar$2$1RememberedValue = new SnackbarKt$OneRowSnackbar$2$1("action", "text");
                composerStartRestartGroup.updateRememberedValue(snackbarKt$OneRowSnackbar$2$1RememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) snackbarKt$OneRowSnackbar$2$1RememberedValue;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2759paddingqDBjuR0$default);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, ab> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerStartRestartGroup.getInserting() || !x.n(composerStartRestartGroup.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Integer numValueOf = Integer.valueOf(currentCompositeKeyHash);
                composerStartRestartGroup.updateRememberedValue(numValueOf);
                composerStartRestartGroup.apply(numValueOf, setCompositeKeyHash);
            }
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            Modifier modifierM2757paddingVpY3zN4$default = PaddingKt.m2757paddingVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, "text"), 0.0f, SnackbarVerticalPadding, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2757paddingVpY3zN4$default);
            a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, ab> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerStartRestartGroup.getInserting() || !x.n(composerStartRestartGroup.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                Integer numValueOf2 = Integer.valueOf(currentCompositeKeyHash2);
                composerStartRestartGroup.updateRememberedValue(numValueOf2);
                composerStartRestartGroup.apply(numValueOf2, setCompositeKeyHash2);
            }
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(composerStartRestartGroup, Integer.valueOf(i3 & 14));
            composerStartRestartGroup.endNode();
            Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.Companion, "action");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId);
            a<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, ab> setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerStartRestartGroup.getInserting() || !x.n(composerStartRestartGroup.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                Integer numValueOf3 = Integer.valueOf(currentCompositeKeyHash3);
                composerStartRestartGroup.updateRememberedValue(numValueOf3);
                composerStartRestartGroup.apply(numValueOf3, setCompositeKeyHash3);
            }
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            pVar2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 3) & 14));
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
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.SnackbarKt$$ExternalSyntheticLambda7
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SnackbarKt.OneRowSnackbar$lambda$2(pVar, pVar2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab OneRowSnackbar$lambda$2(p pVar, p pVar2, int i2, Composer composer, int i3) {
        OneRowSnackbar(pVar, pVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fd  */
    /* renamed from: Snackbar-7zSek6w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4198Snackbar7zSek6w(androidx.compose.ui.Modifier r24, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r25, boolean r26, androidx.compose.ui.graphics.Shape r27, long r28, long r30, float r32, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarKt.m4198Snackbar7zSek6w(androidx.compose.ui.Modifier, h.g.a.p, boolean, androidx.compose.ui.graphics.Shape, long, long, float, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010e  */
    /* renamed from: Snackbar-sPrSdHI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4199SnackbarsPrSdHI(final androidx.compose.material.SnackbarData r27, androidx.compose.ui.Modifier r28, boolean r29, androidx.compose.ui.graphics.Shape r30, long r31, long r33, long r35, float r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarKt.m4199SnackbarsPrSdHI(androidx.compose.material.SnackbarData, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab Snackbar_7zSek6w$lambda$0(final p pVar, final p pVar2, final boolean z, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1429068516, i2, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:101)");
            }
            CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer, 6))), ComposableLambdaKt.rememberComposableLambda(1236486620, true, new p() { // from class: androidx.compose.material.SnackbarKt$$ExternalSyntheticLambda11
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SnackbarKt.Snackbar_7zSek6w$lambda$0$0(pVar, pVar2, z, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Snackbar_7zSek6w$lambda$0$0(final p pVar, final p pVar2, final boolean z, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1236486620, i2, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:102)");
            }
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer, 6).getBody2(), ComposableLambdaKt.rememberComposableLambda(1789628237, true, new p() { // from class: androidx.compose.material.SnackbarKt$$ExternalSyntheticLambda4
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SnackbarKt.Snackbar_7zSek6w$lambda$0$0$0(pVar, pVar2, z, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Snackbar_7zSek6w$lambda$0$0$0(p pVar, p pVar2, boolean z, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1789628237, i2, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:104)");
            }
            if (pVar == null) {
                composer.startReplaceGroup(1845819398);
                TextOnlySnackbar(pVar2, composer, 0);
                composer.endReplaceGroup();
            } else if (z) {
                composer.startReplaceGroup(1845821491);
                NewLineButtonSnackbar(pVar2, pVar, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1845823628);
                OneRowSnackbar(pVar2, pVar, composer, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab Snackbar_7zSek6w$lambda$1(Modifier modifier, p pVar, boolean z, Shape shape, long j2, long j3, float f2, p pVar2, int i2, int i3, Composer composer, int i4) {
        m4198Snackbar7zSek6w(modifier, pVar, z, shape, j2, j3, f2, pVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab Snackbar_sPrSdHI$lambda$0(long j2, final SnackbarData snackbarData, final String str, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1843479216, i2, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:170)");
            }
            ButtonColors buttonColorsM3998textButtonColorsRGew2ao = ButtonDefaults.INSTANCE.m3998textButtonColorsRGew2ao(0L, j2, 0L, composer, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 5);
            boolean zChangedInstance = composer.changedInstance(snackbarData);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new a() { // from class: androidx.compose.material.SnackbarKt$$ExternalSyntheticLambda9
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return SnackbarKt.Snackbar_sPrSdHI$lambda$0$0$0(snackbarData);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ButtonKt.TextButton((a) objRememberedValue, null, false, null, null, null, null, buttonColorsM3998textButtonColorsRGew2ao, null, ComposableLambdaKt.rememberComposableLambda(-929149933, true, new q() { // from class: androidx.compose.material.SnackbarKt$$ExternalSyntheticLambda10
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SnackbarKt.Snackbar_sPrSdHI$lambda$0$1(str, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, 805306368, DisplayStrings.DS_SETTINGS);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Snackbar_sPrSdHI$lambda$0$0$0(SnackbarData snackbarData) {
        snackbarData.performAction();
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Snackbar_sPrSdHI$lambda$0$1(String str, RowScope rowScope, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-929149933, i2, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:173)");
            }
            TextKt.m4275Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (l<? super TextLayoutResult, ab>) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab Snackbar_sPrSdHI$lambda$1(SnackbarData snackbarData, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-261845785, i2, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:181)");
            }
            TextKt.m4275Text4IGK_g(snackbarData.getMessage(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (l<? super TextLayoutResult, ab>) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab Snackbar_sPrSdHI$lambda$2(SnackbarData snackbarData, Modifier modifier, boolean z, Shape shape, long j2, long j3, long j4, float f2, int i2, int i3, Composer composer, int i4) {
        m4199SnackbarsPrSdHI(snackbarData, modifier, z, shape, j2, j3, j4, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    private static final void TextOnlySnackbar(final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(343813818);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(pVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(343813818, i3, -1, "androidx.compose.material.TextOnlySnackbar (Snackbar.kt:235)");
            }
            SnackbarKt$TextOnlySnackbar$2$1 snackbarKt$TextOnlySnackbar$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (snackbarKt$TextOnlySnackbar$2$1RememberedValue == Composer.Companion.getEmpty()) {
                snackbarKt$TextOnlySnackbar$2$1RememberedValue = SnackbarKt$TextOnlySnackbar$2$1.INSTANCE;
                composerStartRestartGroup.updateRememberedValue(snackbarKt$TextOnlySnackbar$2$1RememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) snackbarKt$TextOnlySnackbar$2$1RememberedValue;
            Modifier.Companion companion = Modifier.Companion;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, ab> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerStartRestartGroup.getInserting() || !x.n(composerStartRestartGroup.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Integer numValueOf = Integer.valueOf(currentCompositeKeyHash);
                composerStartRestartGroup.updateRememberedValue(numValueOf);
                composerStartRestartGroup.apply(numValueOf, setCompositeKeyHash);
            }
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            Modifier modifierM2756paddingVpY3zN4 = PaddingKt.m2756paddingVpY3zN4(Modifier.Companion, HorizontalSpacing, SnackbarVerticalPadding);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2756paddingVpY3zN4);
            a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, ab> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerStartRestartGroup.getInserting() || !x.n(composerStartRestartGroup.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                Integer numValueOf2 = Integer.valueOf(currentCompositeKeyHash2);
                composerStartRestartGroup.updateRememberedValue(numValueOf2);
                composerStartRestartGroup.apply(numValueOf2, setCompositeKeyHash2);
            }
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(composerStartRestartGroup, Integer.valueOf(i3 & 14));
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
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.SnackbarKt$$ExternalSyntheticLambda3
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SnackbarKt.TextOnlySnackbar$lambda$2(pVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab TextOnlySnackbar$lambda$2(p pVar, int i2, Composer composer, int i3) {
        TextOnlySnackbar(pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }
}
