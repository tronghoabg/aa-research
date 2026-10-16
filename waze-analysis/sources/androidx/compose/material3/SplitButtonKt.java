package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.material3.internal.AnimatedShapeKt;
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
import androidx.compose.ui.unit.Dp;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SplitButtonKt {
    private static final String LeadingButtonLayoutId = "LeadingButton";
    private static final String TrailingButtonLayoutId = "TrailingButton";

    /* renamed from: SplitButtonLayout--jt2gSs, reason: not valid java name */
    public static final void m5653SplitButtonLayoutjt2gSs(final p<? super Composer, ? super Integer, ab> pVar, final p<? super Composer, ? super Integer, ab> pVar2, Modifier modifier, float f2, Composer composer, final int i2, final int i3) {
        int i4;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-595548358);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changedInstance(pVar) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar2) ? 16 : 32;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changed(modifier) ? 128 : 256;
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 |= DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS;
        } else if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changed(f2) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i4 & 1)) {
            if (i6 != 0) {
                modifier = Modifier.Companion;
            }
            if (i7 != 0) {
                f2 = SplitButtonDefaults.INSTANCE.m5645getSpacingD9Ej5fM();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-595548358, i4, -1, "androidx.compose.material3.SplitButtonLayout (SplitButton.kt:123)");
            }
            Modifier modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier);
            int i8 = i4 & 7168;
            SplitButtonKt$SplitButtonLayout$2$1 splitButtonKt$SplitButtonLayout$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (i8 == 2048 || splitButtonKt$SplitButtonLayout$2$1RememberedValue == Composer.Companion.getEmpty()) {
                splitButtonKt$SplitButtonLayout$2$1RememberedValue = new SplitButtonKt$SplitButtonLayout$2$1(f2);
                composerStartRestartGroup.updateRememberedValue(splitButtonKt$SplitButtonLayout$2$1RememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) splitButtonKt$SplitButtonLayout$2$1RememberedValue;
            int iM = SplitButtonKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierMinimumInteractiveComponentSize);
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
            CompositionLocalKt.CompositionLocalProvider(InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize().provides(Dp.m11162boximpl(0.0f)), ComposableLambdaKt.rememberComposableLambda(176801777, true, new p() { // from class: androidx.compose.material3.SplitButtonKt$$ExternalSyntheticLambda1
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SplitButtonKt.SplitButtonLayout__jt2gSs$lambda$0$0(pVar, pVar2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final float f3 = f2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.SplitButtonKt$$ExternalSyntheticLambda2
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SplitButtonKt.SplitButtonLayout__jt2gSs$lambda$2(pVar, pVar2, modifier2, f3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab SplitButtonLayout__jt2gSs$lambda$0$0(p pVar, p pVar2, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(176801777, i2, -1, "androidx.compose.material3.SplitButtonLayout.<anonymous>.<anonymous> (SplitButton.kt:129)");
            }
            Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.Companion, LeadingButtonLayoutId);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int iM = SplitButtonKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierLayoutId);
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
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(composer, 0);
            composer.endNode();
            Modifier modifierLayoutId2 = LayoutIdKt.layoutId(Modifier.Companion, TrailingButtonLayoutId);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int iM2 = SplitButtonKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierLayoutId2);
            a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            pVar2.invoke(composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab SplitButtonLayout__jt2gSs$lambda$2(p pVar, p pVar2, Modifier modifier, float f2, int i2, int i3, Composer composer, int i4) {
        m5653SplitButtonLayoutjt2gSs(pVar, pVar2, modifier, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    private static final boolean getHasCornerBasedShapes(SplitButtonShapes splitButtonShapes) {
        if (splitButtonShapes.getPressedShape() != null && !(splitButtonShapes.getPressedShape() instanceof CornerBasedShape)) {
            return false;
        }
        if (splitButtonShapes.getCheckedShape() == null || (splitButtonShapes.getCheckedShape() instanceof CornerBasedShape)) {
            return splitButtonShapes.getShape() instanceof CornerBasedShape;
        }
        return false;
    }

    private static final boolean getHasRoundedCornerShapes(SplitButtonShapes splitButtonShapes) {
        if (splitButtonShapes.getPressedShape() != null && !(splitButtonShapes.getPressedShape() instanceof RoundedCornerShape)) {
            return false;
        }
        if (splitButtonShapes.getCheckedShape() == null || (splitButtonShapes.getCheckedShape() instanceof RoundedCornerShape)) {
            return splitButtonShapes.getShape() instanceof RoundedCornerShape;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shape shapeByInteraction(SplitButtonShapes splitButtonShapes, boolean z, boolean z2, FiniteAnimationSpec<Float> finiteAnimationSpec, Composer composer, int i2) {
        Shape shape;
        composer.startReplaceGroup(-20919530);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-20919530, i2, -1, "androidx.compose.material3.shapeByInteraction (SplitButton.kt:1293)");
        }
        if (z) {
            shape = splitButtonShapes.getPressedShape();
            if (shape == null) {
                shape = splitButtonShapes.getShape();
            }
        } else if (!z2 || (shape = splitButtonShapes.getCheckedShape()) == null) {
            shape = splitButtonShapes.getShape();
        }
        if (getHasRoundedCornerShapes(splitButtonShapes)) {
            composer.startReplaceGroup(-443070700);
            x.d(shape, "null cannot be cast to non-null type androidx.compose.foundation.shape.RoundedCornerShape");
            shape = AnimatedShapeKt.rememberAnimatedShape((RoundedCornerShape) shape, finiteAnimationSpec, composer, (i2 >> 6) & 112);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else if (getHasCornerBasedShapes(splitButtonShapes)) {
            composer.startReplaceGroup(-442944778);
            x.d(shape, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            shape = AnimatedShapeKt.rememberAnimatedShape((CornerBasedShape) shape, finiteAnimationSpec, composer, (i2 >> 6) & 112);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.startReplaceGroup(-442862132);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        composer.endReplaceGroup();
        return shape;
    }
}
