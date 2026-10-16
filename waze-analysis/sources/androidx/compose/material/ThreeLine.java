package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.waze.strings.DisplayStrings;
import h.a.i;
import h.ab;
import h.g.a.a;
import h.g.a.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ThreeLine {
    public static final ThreeLine INSTANCE = new ThreeLine();
    private static final float MinHeight = 88.0f;
    private static final float IconMinPaddedWidth = 40.0f;
    private static final float IconLeftPadding = 16.0f;
    private static final float IconThreeLineVerticalPadding = 16.0f;
    private static final float ContentLeftPadding = 16.0f;
    private static final float ContentRightPadding = 16.0f;
    private static final float ThreeLineBaselineFirstOffset = 28.0f;
    private static final float ThreeLineBaselineSecondOffset = 20.0f;
    private static final float ThreeLineBaselineThirdOffset = 20.0f;
    private static final float ThreeLineTrailingTopPadding = 16.0f;
    private static final float TrailingRightPadding = 16.0f;

    private ThreeLine() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ListItem$lambda$0$1(p pVar, p pVar2, p pVar3, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-595668326, i2, -1, "androidx.compose.material.ThreeLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:338)");
            }
            if (pVar != null) {
                composer.startReplaceGroup(-1206609496);
                pVar.invoke(composer, 0);
            } else {
                composer.startReplaceGroup(1249824744);
            }
            composer.endReplaceGroup();
            pVar2.invoke(composer, 0);
            pVar3.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab ListItem$lambda$1(ThreeLine threeLine, Modifier modifier, p pVar, p pVar2, p pVar3, p pVar4, p pVar5, int i2, int i3, Composer composer, int i4) {
        threeLine.ListItem(modifier, pVar, pVar2, pVar3, pVar4, pVar5, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    public final void ListItem(Modifier modifier, final p<? super Composer, ? super Integer, ab> pVar, final p<? super Composer, ? super Integer, ab> pVar2, final p<? super Composer, ? super Integer, ab> pVar3, final p<? super Composer, ? super Integer, ab> pVar4, final p<? super Composer, ? super Integer, ab> pVar5, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        final Modifier modifier3;
        int i5 = i3 & 1;
        Composer composerStartRestartGroup = composer.startRestartGroup(1651890924);
        if (i5 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (true != composerStartRestartGroup.changed(modifier2) ? 2 : 4) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar2) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar3) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar4) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar5) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changed(this) ? 524288 : 1048576;
        }
        int i6 = i4;
        if (composerStartRestartGroup.shouldExecute((599187 & i6) != 599186, i6 & 1)) {
            Modifier.Companion companion = i5 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1651890924, i6, -1, "androidx.compose.material.ThreeLine.ListItem (ListItem.kt:314)");
            }
            Modifier modifierM2810heightInVpY3zN4$default = SizeKt.m2810heightInVpY3zN4$default(companion, MinHeight, 0.0f, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2810heightInVpY3zN4$default);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, ab> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerStartRestartGroup.getInserting() || !x.n(composerStartRestartGroup.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Integer numValueOf = Integer.valueOf(currentCompositeKeyHash);
                composerStartRestartGroup.updateRememberedValue(numValueOf);
                composerStartRestartGroup.apply(numValueOf, setCompositeKeyHash);
            }
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (pVar != null) {
                composerStartRestartGroup.startReplaceGroup(2022185866);
                float f2 = IconLeftPadding;
                float f3 = f2 + IconMinPaddedWidth;
                Modifier modifierM2826sizeInqDBjuR0$default = SizeKt.m2826sizeInqDBjuR0$default(Modifier.Companion, f3, f3, 0.0f, 0.0f, 12, null);
                float f4 = IconThreeLineVerticalPadding;
                Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(modifierM2826sizeInqDBjuR0$default, f2, f4, 0.0f, f4, 4, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenterStart(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2759paddingqDBjuR0$default);
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
                pVar.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 3) & 14));
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(2022716338);
                composerStartRestartGroup.endReplaceGroup();
            }
            float f5 = ThreeLineBaselineFirstOffset;
            ListItemKt.BaselinesOffsetColumn(i.i(Dp.m11162boximpl(f5), Dp.m11162boximpl(ThreeLineBaselineSecondOffset), Dp.m11162boximpl(ThreeLineBaselineThirdOffset)), PaddingKt.m2759paddingqDBjuR0$default(RowScope.CC.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null), ContentLeftPadding, 0.0f, ContentRightPadding, 0.0f, 10, null), ComposableLambdaKt.rememberComposableLambda(-595668326, true, new p() { // from class: androidx.compose.material.ThreeLine$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ThreeLine.ListItem$lambda$0$1(pVar4, pVar2, pVar3, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, DisplayStrings.DS_DICTATION_BOTTOM_SHEET_SPEECH_TIMEOUT, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            if (pVar5 != null) {
                composerStartRestartGroup.startReplaceGroup(2023227156);
                float f6 = ThreeLineTrailingTopPadding;
                ListItemKt.m4113OffsetToBaselineOrCenterKz89ssw(f5 - f6, PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, f6, TrailingRightPadding, 0.0f, 9, null), pVar5, composerStartRestartGroup, ((i6 >> 9) & DisplayStrings.DS_TAP_TO_VERIFY) | 54, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(2023502002);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = companion;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.ThreeLine$$ExternalSyntheticLambda1
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ThreeLine.ListItem$lambda$1(this.f$0, modifier3, pVar, pVar2, pVar3, pVar4, pVar5, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
