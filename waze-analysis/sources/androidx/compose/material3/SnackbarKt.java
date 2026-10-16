package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.Icons;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.SnackbarTokens;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.p;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SnackbarKt {
    private static final float ActionButtonBottomPadding = 4.0f;
    private static final float ContainerMaxWidth = 600.0f;
    private static final float HeightToFirstLine = 30.0f;
    private static final float HorizontalSpacing = 16.0f;
    private static final float HorizontalSpacingButtonSide = 8.0f;
    private static final float LegacySnackbarVerticalPadding = 6.0f;
    private static final float LongButtonVerticalOffset = 12.0f;
    private static final float SeparateButtonExtraY = 2.0f;
    private static final float SnackbarVerticalPadding = 14.0f;
    private static final float TextEndExtraSpacing = 8.0f;

    /* renamed from: LegacyNewLineButtonSnackbar-kKq0p4A, reason: not valid java name */
    private static final void m5626LegacyNewLineButtonSnackbarkKq0p4A(final p<? super Composer, ? super Integer, ab> pVar, final p<? super Composer, ? super Integer, ab> pVar2, final p<? super Composer, ? super Integer, ab> pVar3, final TextStyle textStyle, long j2, long j3, Composer composer, final int i2) {
        int i3;
        long j4;
        long j5;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1804834553);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(pVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar3) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(textStyle) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            j4 = j2;
            i3 |= true != composerStartRestartGroup.changed(j4) ? 8192 : 16384;
        } else {
            j4 = j2;
        }
        if ((196608 & i2) == 0) {
            j5 = j3;
            i3 |= true != composerStartRestartGroup.changed(j5) ? 65536 : 131072;
        } else {
            j5 = j3;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1804834553, i3, -1, "androidx.compose.material3.LegacyNewLineButtonSnackbar (Snackbar.kt:340)");
            }
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(SizeKt.m2829widthInVpY3zN4$default(Modifier.Companion, 0.0f, ContainerMaxWidth, 1, null), 0.0f, 1, null), HorizontalSpacing, 0.0f, 0.0f, SeparateButtonExtraY, 6, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int iM = SnackbarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2759paddingqDBjuR0$default);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            int i5 = i3;
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
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierM2414paddingFromBaselineVpY3zN4 = AlignmentLineKt.m2414paddingFromBaselineVpY3zN4(Modifier.Companion, HeightToFirstLine, LongButtonVerticalOffset);
            float f2 = HorizontalSpacingButtonSide;
            Modifier modifierM2759paddingqDBjuR0$default2 = PaddingKt.m2759paddingqDBjuR0$default(modifierM2414paddingFromBaselineVpY3zN4, 0.0f, 0.0f, f2, 0.0f, 11, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM2 = SnackbarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
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
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(composerStartRestartGroup, Integer.valueOf(i5 & 14));
            composerStartRestartGroup.endNode();
            Modifier modifierM2759paddingqDBjuR0$default3 = PaddingKt.m2759paddingqDBjuR0$default(columnScopeInstance.align(Modifier.Companion, Alignment.Companion.getEnd()), 0.0f, 0.0f, pVar3 == null ? f2 : 0.0f, 0.0f, 11, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM3 = SnackbarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2759paddingqDBjuR0$default3);
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
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM3), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composerStartRestartGroup, 0);
            int iM4 = SnackbarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            a<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM4), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(j4)), TextKt.getLocalTextStyle().provides(textStyle)}, pVar2, composerStartRestartGroup, (i5 & 112) | ProvidedValue.$stable);
            if (pVar3 != null) {
                composerStartRestartGroup.startReplaceGroup(1407800124);
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(j5)), pVar3, composerStartRestartGroup, ((i5 >> 3) & 112) | ProvidedValue.$stable);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1408005778);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
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
            final long j6 = j4;
            final long j7 = j5;
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.SnackbarKt$$ExternalSyntheticLambda7
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SnackbarKt.LegacyNewLineButtonSnackbar_kKq0p4A$lambda$1(pVar, pVar2, pVar3, textStyle, j6, j7, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab LegacyNewLineButtonSnackbar_kKq0p4A$lambda$1(p pVar, p pVar2, p pVar3, TextStyle textStyle, long j2, long j3, int i2, Composer composer, int i3) {
        m5626LegacyNewLineButtonSnackbarkKq0p4A(pVar, pVar2, pVar3, textStyle, j2, j3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* renamed from: LegacyOneRowSnackbar-kKq0p4A, reason: not valid java name */
    private static final void m5627LegacyOneRowSnackbarkKq0p4A(final p<? super Composer, ? super Integer, ab> pVar, final p<? super Composer, ? super Integer, ab> pVar2, final p<? super Composer, ? super Integer, ab> pVar3, final TextStyle textStyle, final long j2, long j3, Composer composer, final int i2) {
        int i3;
        long j4;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-321841045);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(pVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar3) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(textStyle) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changed(j2) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            j4 = j3;
            i3 |= true != composerStartRestartGroup.changed(j4) ? 65536 : 131072;
        } else {
            j4 = j3;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-321841045, i3, -1, "androidx.compose.material3.LegacyOneRowSnackbar (Snackbar.kt:385)");
            }
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, HorizontalSpacing, 0.0f, pVar3 == null ? HorizontalSpacingButtonSide : 0.0f, 0.0f, 10, null);
            SnackbarKt$LegacyOneRowSnackbar$2$1 snackbarKt$LegacyOneRowSnackbar$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            int i5 = i3;
            if (snackbarKt$LegacyOneRowSnackbar$2$1RememberedValue == Composer.Companion.getEmpty()) {
                snackbarKt$LegacyOneRowSnackbar$2$1RememberedValue = new SnackbarKt$LegacyOneRowSnackbar$2$1("action", "dismissAction", "text");
                composerStartRestartGroup.updateRememberedValue(snackbarKt$LegacyOneRowSnackbar$2$1RememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) snackbarKt$LegacyOneRowSnackbar$2$1RememberedValue;
            int iM = SnackbarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
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
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            Modifier modifierM2757paddingVpY3zN4$default = PaddingKt.m2757paddingVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, "text"), 0.0f, LegacySnackbarVerticalPadding, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM2 = SnackbarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
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
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(composerStartRestartGroup, Integer.valueOf(i5 & 14));
            composerStartRestartGroup.endNode();
            if (pVar2 != null) {
                composerStartRestartGroup.startReplaceGroup(989211000);
                Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.Companion, "action");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int iM3 = SnackbarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
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
                Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM3), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(j2)), TextKt.getLocalTextStyle().provides(textStyle)}, pVar2, composerStartRestartGroup, (i5 & 112) | ProvidedValue.$stable);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(989526208);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (pVar3 != null) {
                composerStartRestartGroup.startReplaceGroup(989574568);
                Modifier modifierLayoutId2 = LayoutIdKt.layoutId(Modifier.Companion, "dismissAction");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int iM4 = SnackbarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId2);
                a<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM4), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(j4)), pVar3, composerStartRestartGroup, ((i5 >> 3) & 112) | ProvidedValue.$stable);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(989843648);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final long j5 = j4;
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.SnackbarKt$$ExternalSyntheticLambda6
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SnackbarKt.LegacyOneRowSnackbar_kKq0p4A$lambda$2(pVar, pVar2, pVar3, textStyle, j2, j5, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab LegacyOneRowSnackbar_kKq0p4A$lambda$2(p pVar, p pVar2, p pVar3, TextStyle textStyle, long j2, long j3, int i2, Composer composer, int i3) {
        m5627LegacyOneRowSnackbarkKq0p4A(pVar, pVar2, pVar3, textStyle, j2, j3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* renamed from: NewLineButtonSnackbar-kKq0p4A, reason: not valid java name */
    private static final void m5628NewLineButtonSnackbarkKq0p4A(final p<? super Composer, ? super Integer, ab> pVar, final p<? super Composer, ? super Integer, ab> pVar2, final p<? super Composer, ? super Integer, ab> pVar3, final TextStyle textStyle, long j2, long j3, Composer composer, final int i2) {
        int i3;
        long j4;
        long j5;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-264666338);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(pVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar3) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(textStyle) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            j4 = j2;
            i3 |= true != composerStartRestartGroup.changed(j4) ? 8192 : 16384;
        } else {
            j4 = j2;
        }
        if ((196608 & i2) == 0) {
            j5 = j3;
            i3 |= true != composerStartRestartGroup.changed(j5) ? 65536 : 131072;
        } else {
            j5 = j3;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-264666338, i3, -1, "androidx.compose.material3.NewLineButtonSnackbar (Snackbar.kt:292)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m2829widthInVpY3zN4$default(Modifier.Companion, 0.0f, ContainerMaxWidth, 1, null), 0.0f, 1, null);
            float f2 = HorizontalSpacing;
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(modifierFillMaxWidth$default, f2, 0.0f, 0.0f, 0.0f, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int iM = SnackbarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2759paddingqDBjuR0$default);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            int i5 = i3;
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
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierM2759paddingqDBjuR0$default2 = PaddingKt.m2759paddingqDBjuR0$default(PaddingKt.m2757paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, SnackbarVerticalPadding, 1, null), 0.0f, 0.0f, f2, 0.0f, 11, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM2 = SnackbarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
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
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(composerStartRestartGroup, Integer.valueOf(i5 & 14));
            composerStartRestartGroup.endNode();
            Modifier modifierM2759paddingqDBjuR0$default3 = PaddingKt.m2759paddingqDBjuR0$default(columnScopeInstance.align(Modifier.Companion, Alignment.Companion.getEnd()), 0.0f, 0.0f, pVar3 == null ? HorizontalSpacingButtonSide : 0.0f, ActionButtonBottomPadding, 3, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 48);
            int iM3 = SnackbarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2759paddingqDBjuR0$default3);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM3), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(j4)), TextKt.getLocalTextStyle().provides(textStyle)}, pVar2, composerStartRestartGroup, (i5 & 112) | ProvidedValue.$stable);
            if (pVar3 != null) {
                composerStartRestartGroup.startReplaceGroup(-580279268);
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(j5)), pVar3, composerStartRestartGroup, ((i5 >> 3) & 112) | ProvidedValue.$stable);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-580092834);
                composerStartRestartGroup.endReplaceGroup();
            }
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
            final long j6 = j4;
            final long j7 = j5;
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.SnackbarKt$$ExternalSyntheticLambda16
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SnackbarKt.NewLineButtonSnackbar_kKq0p4A$lambda$1(pVar, pVar2, pVar3, textStyle, j6, j7, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab NewLineButtonSnackbar_kKq0p4A$lambda$1(p pVar, p pVar2, p pVar3, TextStyle textStyle, long j2, long j3, int i2, Composer composer, int i3) {
        m5628NewLineButtonSnackbarkKq0p4A(pVar, pVar2, pVar3, textStyle, j2, j3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* renamed from: OneRowSnackbar-kKq0p4A, reason: not valid java name */
    private static final void m5629OneRowSnackbarkKq0p4A(final p<? super Composer, ? super Integer, ab> pVar, final p<? super Composer, ? super Integer, ab> pVar2, final p<? super Composer, ? super Integer, ab> pVar3, final TextStyle textStyle, final long j2, long j3, Composer composer, final int i2) {
        int i3;
        long j4;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-931325388);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(pVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar3) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(textStyle) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changed(j2) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            j4 = j3;
            i3 |= true != composerStartRestartGroup.changed(j4) ? 65536 : 131072;
        } else {
            j4 = j3;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-931325388, i3, -1, "androidx.compose.material3.OneRowSnackbar (Snackbar.kt:501)");
            }
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, HorizontalSpacing, 0.0f, pVar3 == null ? TextEndExtraSpacing : 0.0f, 0.0f, 10, null);
            SnackbarKt$OneRowSnackbar$2$1 snackbarKt$OneRowSnackbar$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            int i5 = i3;
            if (snackbarKt$OneRowSnackbar$2$1RememberedValue == Composer.Companion.getEmpty()) {
                snackbarKt$OneRowSnackbar$2$1RememberedValue = new SnackbarKt$OneRowSnackbar$2$1("action", "dismissAction", "text");
                composerStartRestartGroup.updateRememberedValue(snackbarKt$OneRowSnackbar$2$1RememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) snackbarKt$OneRowSnackbar$2$1RememberedValue;
            int iM = SnackbarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
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
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            Modifier modifierM2757paddingVpY3zN4$default = PaddingKt.m2757paddingVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, "text"), 0.0f, SnackbarVerticalPadding, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM2 = SnackbarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
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
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(composerStartRestartGroup, Integer.valueOf(i5 & 14));
            composerStartRestartGroup.endNode();
            if (pVar2 != null) {
                composerStartRestartGroup.startReplaceGroup(-1014168049);
                Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.Companion, "action");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int iM3 = SnackbarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
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
                Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM3), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(j2)), TextKt.getLocalTextStyle().provides(textStyle)}, pVar2, composerStartRestartGroup, (i5 & 112) | ProvidedValue.$stable);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1013852841);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (pVar3 != null) {
                composerStartRestartGroup.startReplaceGroup(-1013804481);
                Modifier modifierLayoutId2 = LayoutIdKt.layoutId(Modifier.Companion, "dismissAction");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int iM4 = SnackbarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId2);
                a<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM4), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(j4)), pVar3, composerStartRestartGroup, ((i5 >> 3) & 112) | ProvidedValue.$stable);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1013535401);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final long j5 = j4;
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.SnackbarKt$$ExternalSyntheticLambda9
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SnackbarKt.OneRowSnackbar_kKq0p4A$lambda$2(pVar, pVar2, pVar3, textStyle, j2, j5, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab OneRowSnackbar_kKq0p4A$lambda$2(p pVar, p pVar2, p pVar3, TextStyle textStyle, long j2, long j3, int i2, Composer composer, int i3) {
        m5629OneRowSnackbarkKq0p4A(pVar, pVar2, pVar3, textStyle, j2, j3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011c  */
    /* renamed from: Snackbar-eQBnUkQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5630SnackbareQBnUkQ(androidx.compose.ui.Modifier r29, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r30, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r31, boolean r32, androidx.compose.ui.graphics.Shape r33, long r34, long r36, long r38, long r40, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r42, androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarKt.m5630SnackbareQBnUkQ(androidx.compose.ui.Modifier, h.g.a.p, h.g.a.p, boolean, androidx.compose.ui.graphics.Shape, long, long, long, long, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011a  */
    /* renamed from: Snackbar-sDKtq54, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5631SnackbarsDKtq54(final androidx.compose.material3.SnackbarData r34, androidx.compose.ui.Modifier r35, boolean r36, androidx.compose.ui.graphics.Shape r37, long r38, long r40, long r42, long r44, long r46, androidx.compose.runtime.Composer r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarKt.m5631SnackbarsDKtq54(androidx.compose.material3.SnackbarData, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, long, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab Snackbar_eQBnUkQ$lambda$0(final boolean z, final p pVar, final p pVar2, final p pVar3, final long j2, final long j3, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1343524879, i2, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:119)");
            }
            TextStyle value = TypographyKt.getValue(SnackbarTokens.INSTANCE.getSupportingTextFont(), composer, 6);
            final TextStyle value2 = TypographyKt.getValue(SnackbarTokens.INSTANCE.getActionLabelTextFont(), composer, 6);
            CompositionLocalKt.CompositionLocalProvider(TextKt.getLocalTextStyle().provides(value), ComposableLambdaKt.rememberComposableLambda(969655473, true, new p() { // from class: androidx.compose.material3.SnackbarKt$$ExternalSyntheticLambda5
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SnackbarKt.Snackbar_eQBnUkQ$lambda$0$0(z, pVar, pVar2, pVar3, value2, j2, j3, (Composer) obj, ((Integer) obj2).intValue());
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
    public static final ab Snackbar_eQBnUkQ$lambda$0$0(boolean z, p pVar, p pVar2, p pVar3, TextStyle textStyle, long j2, long j3, Composer composer, int i2) {
        Composer composer2;
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(969655473, i2, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:122)");
            }
            if (!z || pVar == null) {
                composer.startReplaceGroup(-168956728);
                if (ComposeMaterial3Flags.isSnackbarStylingFixEnabled) {
                    composer.startReplaceGroup(-942652489);
                    m5629OneRowSnackbarkKq0p4A(pVar2, pVar, pVar3, textStyle, j2, j3, composer, 0);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-942207887);
                    m5627LegacyOneRowSnackbarkKq0p4A(pVar2, pVar, pVar3, textStyle, j2, j3, composer, 0);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-168989686);
                if (ComposeMaterial3Flags.isSnackbarStylingFixEnabled) {
                    composer.startReplaceGroup(-943674714);
                    m5628NewLineButtonSnackbarkKq0p4A(pVar2, pVar, pVar3, textStyle, j2, j3, composer, 0);
                    composer2 = composer;
                    composer2.endReplaceGroup();
                } else {
                    composer2 = composer;
                    composer2.startReplaceGroup(-943213248);
                    m5626LegacyNewLineButtonSnackbarkKq0p4A(pVar2, pVar, pVar3, textStyle, j2, j3, composer2, 0);
                    composer2.endReplaceGroup();
                }
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab Snackbar_eQBnUkQ$lambda$1(Modifier modifier, p pVar, p pVar2, boolean z, Shape shape, long j2, long j3, long j4, long j5, p pVar3, int i2, int i3, Composer composer, int i4) {
        m5630SnackbareQBnUkQ(modifier, pVar, pVar2, z, shape, j2, j3, j4, j5, pVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab Snackbar_sDKtq54$lambda$0(long j2, final SnackbarData snackbarData, final String str, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1378313599, i2, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:236)");
            }
            ButtonColors buttonColorsM4452textButtonColorsro_MJ88 = ButtonDefaults.INSTANCE.m4452textButtonColorsro_MJ88(0L, j2, 0L, 0L, composer, 24576, 13);
            boolean zChanged = composer.changed(snackbarData);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new a() { // from class: androidx.compose.material3.SnackbarKt$$ExternalSyntheticLambda3
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return SnackbarKt.Snackbar_sDKtq54$lambda$0$0$0(snackbarData);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ButtonKt.TextButton((a<ab>) objRememberedValue, (Modifier) null, false, (Shape) null, buttonColorsM4452textButtonColorsro_MJ88, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, (q<? super RowScope, ? super Composer, ? super Integer, ab>) ComposableLambdaKt.rememberComposableLambda(521110564, true, new q() { // from class: androidx.compose.material3.SnackbarKt$$ExternalSyntheticLambda4
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SnackbarKt.Snackbar_sDKtq54$lambda$0$1(str, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, 805306368, DisplayStrings.DS_REPORT_MENU_V2_POLICE_REPORT_LABEL);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Snackbar_sDKtq54$lambda$0$0$0(SnackbarData snackbarData) {
        snackbarData.performAction();
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Snackbar_sDKtq54$lambda$0$1(String str, RowScope rowScope, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(521110564, i2, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:239)");
            }
            TextKt.m5817TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab Snackbar_sDKtq54$lambda$1(final SnackbarData snackbarData, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1812633777, i2, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:248)");
            }
            final String strM6375getString2EP1pXo = Strings_androidKt.m6375getString2EP1pXo(com.waze.R.string.m3c_snackbar_dismiss, composer, 0);
            TooltipKt.TooltipBox(TooltipDefaults.INSTANCE.m6046rememberTooltipPositionProviderHu5FAss(TooltipAnchorPosition.Companion.m6033getAbovelOKsHw4(), 0.0f, composer, DisplayStrings.DS_DICTATION_BOTTOM_SHEET_SPEECH_TIMEOUT, 2), ComposableLambdaKt.rememberComposableLambda(1030267332, true, new q() { // from class: androidx.compose.material3.SnackbarKt$$ExternalSyntheticLambda1
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SnackbarKt.Snackbar_sDKtq54$lambda$1$0(strM6375getString2EP1pXo, (TooltipScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), TooltipKt.rememberTooltipState(false, false, null, composer, 0, 7), null, null, false, false, false, ComposableLambdaKt.rememberComposableLambda(1926608556, true, new p() { // from class: androidx.compose.material3.SnackbarKt$$ExternalSyntheticLambda2
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SnackbarKt.Snackbar_sDKtq54$lambda$1$1(snackbarData, strM6375getString2EP1pXo, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 100663344, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Snackbar_sDKtq54$lambda$1$0(final String str, TooltipScope tooltipScope, Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = i2 | (true != ((i2 & 8) == 0 ? composer.changed(tooltipScope) : composer.changedInstance(tooltipScope)) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1030267332, i3, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:255)");
            }
            TooltipKt.m6053PlainTooltipInternalkw8QeXY(tooltipScope, str, null, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1253910984, true, new p() { // from class: androidx.compose.material3.SnackbarKt$$ExternalSyntheticLambda8
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SnackbarKt.Snackbar_sDKtq54$lambda$1$0$0(str, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, i3 & 14, 6, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Snackbar_sDKtq54$lambda$1$0$0(String str, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1253910984, i2, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:255)");
            }
            TextKt.m5817TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Snackbar_sDKtq54$lambda$1$1(final SnackbarData snackbarData, final String str, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1926608556, i2, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:259)");
            }
            boolean zChanged = composer.changed(snackbarData);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new a() { // from class: androidx.compose.material3.SnackbarKt$$ExternalSyntheticLambda14
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return SnackbarKt.Snackbar_sDKtq54$lambda$1$1$0$0(snackbarData);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            IconButtonKt.IconButton((a<ab>) objRememberedValue, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, (Shape) null, (p<? super Composer, ? super Integer, ab>) ComposableLambdaKt.rememberComposableLambda(1306131274, true, new p() { // from class: androidx.compose.material3.SnackbarKt$$ExternalSyntheticLambda15
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SnackbarKt.Snackbar_sDKtq54$lambda$1$1$1(str, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 1572864, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Snackbar_sDKtq54$lambda$1$1$0$0(SnackbarData snackbarData) {
        snackbarData.dismiss();
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Snackbar_sDKtq54$lambda$1$1$1(String str, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1306131274, i2, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:262)");
            }
            IconKt.m5039Iconww6aTOc(Icons.Filled.INSTANCE.getClose$material3(), str, (Modifier) null, 0L, composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab Snackbar_sDKtq54$lambda$2(SnackbarData snackbarData, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1266389126, i2, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:280)");
            }
            TextKt.m5817TextNvy7gAk(snackbarData.getVisuals().getMessage(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab Snackbar_sDKtq54$lambda$3(SnackbarData snackbarData, Modifier modifier, boolean z, Shape shape, long j2, long j3, long j4, long j5, long j6, int i2, int i3, Composer composer, int i4) {
        m5631SnackbarsDKtq54(snackbarData, modifier, z, shape, j2, j3, j4, j5, j6, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }
}
