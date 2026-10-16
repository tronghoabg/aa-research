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
final class TwoLine {
    public static final TwoLine INSTANCE = new TwoLine();
    private static final float MinHeight = 64.0f;
    private static final float MinHeightWithIcon = 72.0f;
    private static final float IconMinPaddedWidth = 40.0f;
    private static final float IconLeftPadding = 16.0f;
    private static final float IconVerticalPadding = 16.0f;
    private static final float ContentLeftPadding = 16.0f;
    private static final float ContentRightPadding = 16.0f;
    private static final float OverlineBaselineOffset = 24.0f;
    private static final float OverlineToPrimaryBaselineOffset = 20.0f;
    private static final float PrimaryBaselineOffsetNoIcon = 28.0f;
    private static final float PrimaryBaselineOffsetWithIcon = 32.0f;
    private static final float PrimaryToSecondaryBaselineOffsetNoIcon = 20.0f;
    private static final float PrimaryToSecondaryBaselineOffsetWithIcon = 20.0f;
    private static final float TrailingRightPadding = 16.0f;

    private TwoLine() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ListItem$lambda$0$1(p pVar, p pVar2, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(979717374, i2, -1, "androidx.compose.material.TwoLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:242)");
            }
            pVar.invoke(composer, 0);
            pVar2.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ListItem$lambda$0$2(p pVar, p pVar2, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1888627961, i2, -1, "androidx.compose.material.TwoLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:261)");
            }
            pVar.invoke(composer, 0);
            x.c(pVar2);
            pVar2.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ListItem$lambda$0$3(float f2, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1476831345, i2, -1, "androidx.compose.material.TwoLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:273)");
            }
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(SizeKt.m2810heightInVpY3zN4$default(Modifier.Companion, f2, 0.0f, 2, null), 0.0f, 0.0f, TrailingRightPadding, 0.0f, 11, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM2759paddingqDBjuR0$default);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, ab> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer.getInserting() || !x.n(composer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Integer numValueOf = Integer.valueOf(currentCompositeKeyHash);
                composer.updateRememberedValue(numValueOf);
                composer.apply(numValueOf, setCompositeKeyHash);
            }
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab ListItem$lambda$1(TwoLine twoLine, Modifier modifier, p pVar, p pVar2, p pVar3, p pVar4, p pVar5, int i2, int i3, Composer composer, int i4) {
        twoLine.ListItem(modifier, pVar, pVar2, pVar3, pVar4, pVar5, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    public final void ListItem(Modifier modifier, p<? super Composer, ? super Integer, ab> pVar, final p<? super Composer, ? super Integer, ab> pVar2, final p<? super Composer, ? super Integer, ab> pVar3, final p<? super Composer, ? super Integer, ab> pVar4, final p<? super Composer, ? super Integer, ab> pVar5, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        final Modifier modifier3;
        Modifier modifier4;
        p<? super Composer, ? super Integer, ab> pVar6;
        float f2;
        p<? super Composer, ? super Integer, ab> pVar7 = pVar;
        int i5 = i3 & 1;
        Composer composerStartRestartGroup = composer.startRestartGroup(598947838);
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
            i4 |= true != composerStartRestartGroup.changedInstance(pVar7) ? 16 : 32;
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
        if (composerStartRestartGroup.shouldExecute((599187 & i4) != 599186, i4 & 1)) {
            Modifier.Companion companion = i5 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(598947838, i4, -1, "androidx.compose.material.TwoLine.ListItem (ListItem.kt:214)");
            }
            final float f3 = pVar7 == null ? MinHeight : MinHeightWithIcon;
            Modifier modifierM2810heightInVpY3zN4$default = SizeKt.m2810heightInVpY3zN4$default(companion, f3, 0.0f, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2810heightInVpY3zN4$default);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Modifier modifier5 = companion;
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
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(RowScope.CC.weight$default(RowScopeInstance.INSTANCE, Modifier.Companion, 1.0f, false, 2, null), ContentLeftPadding, 0.0f, ContentRightPadding, 0.0f, 10, null);
            if (pVar7 != null) {
                composerStartRestartGroup.startReplaceGroup(1807018686);
                Modifier.Companion companion2 = Modifier.Companion;
                float f4 = IconLeftPadding;
                Modifier modifierM2826sizeInqDBjuR0$default = SizeKt.m2826sizeInqDBjuR0$default(companion2, f4 + IconMinPaddedWidth, f3, 0.0f, 0.0f, 12, null);
                float f5 = IconVerticalPadding;
                Modifier modifierM2759paddingqDBjuR0$default2 = PaddingKt.m2759paddingqDBjuR0$default(modifierM2826sizeInqDBjuR0$default, f4, f5, 0.0f, f5, 4, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2759paddingqDBjuR0$default2);
                a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                modifier4 = modifierM2759paddingqDBjuR0$default;
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
                pVar7.invoke(composerStartRestartGroup, Integer.valueOf((i4 >> 3) & 14));
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                modifier4 = modifierM2759paddingqDBjuR0$default;
                composerStartRestartGroup.startReplaceGroup(1807574144);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (pVar4 != null) {
                composerStartRestartGroup.startReplaceGroup(1807622349);
                pVar6 = null;
                ListItemKt.BaselinesOffsetColumn(i.i(Dp.m11162boximpl(OverlineBaselineOffset), Dp.m11162boximpl(OverlineToPrimaryBaselineOffset)), modifier4, ComposableLambdaKt.rememberComposableLambda(979717374, true, new p() { // from class: androidx.compose.material.TwoLine$$ExternalSyntheticLambda0
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return TwoLine.ListItem$lambda$0$1(pVar4, pVar2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, DisplayStrings.DS_DICTATION_BOTTOM_SHEET_SPEECH_TIMEOUT, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                Modifier modifier6 = modifier4;
                pVar6 = null;
                composerStartRestartGroup.startReplaceGroup(1807914338);
                Dp[] dpArr = new Dp[2];
                dpArr[0] = Dp.m11162boximpl(pVar7 != null ? PrimaryBaselineOffsetWithIcon : PrimaryBaselineOffsetNoIcon);
                dpArr[1] = Dp.m11162boximpl(pVar7 != null ? PrimaryToSecondaryBaselineOffsetWithIcon : PrimaryToSecondaryBaselineOffsetNoIcon);
                ListItemKt.BaselinesOffsetColumn(i.i(dpArr), modifier6, ComposableLambdaKt.rememberComposableLambda(-1888627961, true, new p() { // from class: androidx.compose.material.TwoLine$$ExternalSyntheticLambda1
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return TwoLine.ListItem$lambda$0$2(pVar2, pVar3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (pVar5 != null) {
                composerStartRestartGroup.startReplaceGroup(1808643799);
                if (pVar7 != null) {
                    f2 = PrimaryBaselineOffsetWithIcon;
                } else {
                    f2 = PrimaryBaselineOffsetNoIcon;
                    pVar7 = pVar6;
                }
                ListItemKt.m4113OffsetToBaselineOrCenterKz89ssw(f2, null, ComposableLambdaKt.rememberComposableLambda(-1476831345, true, new p() { // from class: androidx.compose.material.TwoLine$$ExternalSyntheticLambda2
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return TwoLine.ListItem$lambda$0$3(f3, pVar5, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 2);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1809267488);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        final p<? super Composer, ? super Integer, ab> pVar8 = pVar7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.TwoLine$$ExternalSyntheticLambda3
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TwoLine.ListItem$lambda$1(this.f$0, modifier3, pVar8, pVar2, pVar3, pVar4, pVar5, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
