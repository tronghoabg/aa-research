package androidx.constraintlayout.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.media3.common.C;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.w;
import h.g.b.x;
import java.util.List;
import kotlinx.coroutines.a.o;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ConstraintLayoutKt {
    private static final boolean DEBUG = false;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void ConstraintLayout(ConstraintSet constraintSet, Modifier modifier, int i2, boolean z, AnimationSpec<Float> animationSpec, a<ab> aVar, p<? super Composer, ? super Integer, ab> pVar, Composer composer, int i3, int i4) {
        Animatable animatable;
        Modifier modifier2 = (i4 & 2) != 0 ? Modifier.Companion : modifier;
        int i5 = (i4 & 4) != 0 ? 257 : i2;
        boolean z2 = ((i4 & 8) == 0) & z;
        TweenSpec tweenSpecTween$default = (i4 & 16) != 0 ? AnimationSpecKt.tween$default(0, 0, null, 7, null) : animationSpec;
        a<ab> aVar2 = (i4 & 32) != 0 ? null : aVar;
        if (true != z2) {
            tweenSpecTween$default = null;
        }
        int i6 = i3 >> 3;
        int i7 = (i3 & 1022) | (i6 & 57344) | (i6 & 458752);
        int i8 = (i7 & 14) ^ 6;
        if (tweenSpecTween$default != null) {
            composer.startReplaceGroup(-1632876364);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(constraintSet, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(constraintSet, null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            Animatable animatable2 = (Animatable) objRememberedValue3;
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = w.c(-1, null, null, 6);
                composer.updateRememberedValue(objRememberedValue4);
            }
            o oVar = (o) objRememberedValue4;
            Object objRememberedValue5 = composer.rememberedValue();
            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = SnapshotIntStateKt.mutableIntStateOf(1);
                composer.updateRememberedValue(objRememberedValue5);
            }
            MutableIntState mutableIntState = (MutableIntState) objRememberedValue5;
            boolean zChangedInstance = ((i8 > 4 && composer.changed(constraintSet)) || (i7 & 6) == 4) | composer.changedInstance(oVar);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = (a) new ConstraintLayoutKt$ConstraintLayout$3$1(oVar, constraintSet);
                composer.updateRememberedValue(objRememberedValue6);
            }
            EffectsKt.SideEffect((a) objRememberedValue6, composer, 0);
            boolean zChangedInstance2 = composer.changedInstance(oVar) | composer.changedInstance(animatable2) | composer.changedInstance(tweenSpecTween$default) | ((((i7 & 57344) ^ 24576) > 16384 && composer.changed(aVar2)) || (i7 & 24576) == 16384);
            Object objRememberedValue7 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue7 == Composer.Companion.getEmpty()) {
                animatable = animatable2;
                objRememberedValue7 = (p) new ConstraintLayoutKt$ConstraintLayout$4$1(oVar, mutableIntState, animatable, tweenSpecTween$default, aVar2, mutableState, mutableState2, null);
                composer.updateRememberedValue(objRememberedValue7);
            } else {
                animatable = animatable2;
            }
            EffectsKt.LaunchedEffect(oVar, (p<? super af, ? super e<? super ab>, ? extends Object>) objRememberedValue7, composer, 0);
            ConstraintSet constraintSetM11495ConstraintLayout$lambda15 = m11495ConstraintLayout$lambda15(mutableState);
            ConstraintSet constraintSetM11497ConstraintLayout$lambda18 = m11497ConstraintLayout$lambda18(mutableState2);
            float fFloatValue = ((Number) animatable.getValue()).floatValue();
            int i9 = i7 << 6;
            int iM11523getNonebfy_xzQ = DebugFlags.Companion.m11523getNonebfy_xzQ();
            InvalidationStrategy defaultInvalidationStrategy = InvalidationStrategy.Companion.getDefaultInvalidationStrategy();
            Object objRememberedValue8 = composer.rememberedValue();
            if (objRememberedValue8 == Composer.Companion.getEmpty()) {
                objRememberedValue8 = SnapshotStateKt.mutableStateOf(ab.f48028a, SnapshotStateKt.neverEqualPolicy());
                composer.updateRememberedValue(objRememberedValue8);
            }
            MutableState mutableState3 = (MutableState) objRememberedValue8;
            Object objRememberedValue9 = composer.rememberedValue();
            Object obj = objRememberedValue9;
            if (objRememberedValue9 == Composer.Companion.getEmpty()) {
                Ref ref = new Ref();
                ref.setValue(CompositionSource.Unknown);
                composer.updateRememberedValue(ref);
                obj = ref;
            }
            Ref ref2 = (Ref) obj;
            MotionLayoutKt.MotionLayoutCore(constraintSetM11495ConstraintLayout$lambda15, constraintSetM11497ConstraintLayout$lambda18, null, fFloatValue, null, 257, DebugFlags.m11516getShowBoundsimpl(iM11523getNonebfy_xzQ), DebugFlags.m11518getShowPathsimpl(iM11523getNonebfy_xzQ), DebugFlags.m11517getShowKeyPositionsimpl(iM11523getNonebfy_xzQ), modifier2, mutableState3, ref2, defaultInvalidationStrategy, ComposableLambdaKt.rememberComposableLambda(511777000, true, new ConstraintLayoutKt$ConstraintLayout$$inlined$MotionLayoutT3LJ6Qw$1(mutableState3, defaultInvalidationStrategy, ref2, pVar), composer, 54), composer, 24576 | (((i9 & 7168) << 18) & C.ENCODING_PCM_DOUBLE), (Ref.$stable << 3) | DisplayStrings.DS_AAOS_SOUND_OFF);
            composer.endReplaceGroup();
            return;
        }
        composer.startReplaceGroup(-1631413660);
        Object objRememberedValue10 = composer.rememberedValue();
        if (objRememberedValue10 == Composer.Companion.getEmpty()) {
            objRememberedValue10 = SnapshotLongStateKt.mutableLongStateOf(0L);
            composer.updateRememberedValue(objRememberedValue10);
        }
        MutableLongState mutableLongState = (MutableLongState) objRememberedValue10;
        Object objRememberedValue11 = composer.rememberedValue();
        if (objRememberedValue11 == Composer.Companion.getEmpty()) {
            objRememberedValue11 = SnapshotStateKt.mutableStateOf(ab.f48028a, SnapshotStateKt.neverEqualPolicy());
            composer.updateRememberedValue(objRememberedValue11);
        }
        MutableState mutableState4 = (MutableState) objRememberedValue11;
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object objRememberedValue12 = composer.rememberedValue();
        if (objRememberedValue12 == Composer.Companion.getEmpty()) {
            objRememberedValue12 = new Measurer2(density);
            composer.updateRememberedValue(objRememberedValue12);
        }
        Measurer2 measurer2 = (Measurer2) objRememberedValue12;
        boolean zChangedInstance3 = ((((i7 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) > 256 && composer.changed(i5)) || (i7 & 384) == 256) | ((i8 > 4 && composer.changed(constraintSet)) || (i7 & 6) == 4) | composer.changedInstance(measurer2);
        Object objRememberedValue13 = composer.rememberedValue();
        if (zChangedInstance3 || objRememberedValue13 == Composer.Companion.getEmpty()) {
            objRememberedValue13 = (MeasurePolicy) new ConstraintLayoutKt$ConstraintLayout$measurePolicy$2$1(mutableState4, measurer2, constraintSet, i5);
            composer.updateRememberedValue(objRememberedValue13);
        }
        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue13;
        if (constraintSet instanceof EditableJSONLayout) {
            ((EditableJSONLayout) constraintSet).setUpdateFlag(mutableLongState);
        }
        measurer2.addLayoutInformationReceiver(constraintSet instanceof LayoutInformationReceiver ? (LayoutInformationReceiver) constraintSet : null);
        if (Float.isNaN(measurer2.getForcedScaleFactor())) {
            composer.startReplaceGroup(-1629517142);
            boolean zChangedInstance4 = composer.changedInstance(measurer2);
            Object objRememberedValue14 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue14 == Composer.Companion.getEmpty()) {
                objRememberedValue14 = (l) new ConstraintLayoutKt$ConstraintLayout$7$1(measurer2);
                composer.updateRememberedValue(objRememberedValue14);
            }
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics(modifier2, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (l) objRememberedValue14), ComposableLambdaKt.rememberComposableLambda(-147025937, true, new AnonymousClass8(mutableState4, pVar), composer, 54), measurePolicy, composer, 48, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1629995255);
            Modifier modifierScale = ScaleKt.scale(modifier2, measurer2.getForcedScaleFactor());
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
            boolean zChangedInstance5 = composer.changedInstance(measurer2);
            Object objRememberedValue15 = composer.rememberedValue();
            if (zChangedInstance5 || objRememberedValue15 == Composer.Companion.getEmpty()) {
                objRememberedValue15 = (l) new ConstraintLayoutKt$ConstraintLayout$6$1$1(measurer2);
                composer.updateRememberedValue(objRememberedValue15);
            }
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics(modifierScale, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (l) objRememberedValue15), ComposableLambdaKt.rememberComposableLambda(-1368997460, true, new ConstraintLayoutKt$ConstraintLayout$6$2(pVar), composer, 54), measurePolicy, composer, 48, 0);
            composer.endNode();
            composer.endReplaceGroup();
        }
        composer.endReplaceGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ConstraintLayout$lambda-15, reason: not valid java name */
    public static final ConstraintSet m11495ConstraintLayout$lambda15(MutableState<ConstraintSet> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ConstraintLayout$lambda-18, reason: not valid java name */
    public static final ConstraintSet m11497ConstraintLayout$lambda18(MutableState<ConstraintSet> mutableState) {
        return mutableState.getValue();
    }

    public static final ConstraintSet ConstraintSet(String str, String str2, Composer composer, int i2, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1420317079, i2, -1, "androidx.constraintlayout.compose.ConstraintSet (ConstraintLayout.kt:1347)");
        }
        boolean z = (((i2 & 14) ^ 6) > 4 && composer.changed(str)) || (i2 & 6) == 4;
        if ((i3 & 2) != 0) {
            str2 = null;
        }
        String str3 = str2;
        boolean z2 = z | ((((i2 & 112) ^ 48) > 32 && composer.changed(str3)) || (i2 & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
            JSONConstraintSet jSONConstraintSet = new JSONConstraintSet(str, str3, null, 4, null);
            composer.updateRememberedValue(jSONConstraintSet);
            objRememberedValue = jSONConstraintSet;
        }
        JSONConstraintSet jSONConstraintSet2 = (JSONConstraintSet) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jSONConstraintSet2;
    }

    /* renamed from: atLeast-3ABfNKs, reason: not valid java name */
    public static final Dimension.MaxCoercible m11503atLeast3ABfNKs(Dimension.Coercible coercible, float f2) {
        x.d(coercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) coercible;
        dimensionDescription.getMin$constraintlayout_compose().m11526update0680j_4(f2);
        return dimensionDescription;
    }

    /* renamed from: atLeastWrapContent-3ABfNKs, reason: not valid java name */
    public static final Dimension m11505atLeastWrapContent3ABfNKs(Dimension.MinCoercible minCoercible, float f2) {
        x.d(minCoercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) minCoercible;
        dimensionDescription.getMin$constraintlayout_compose().m11526update0680j_4(f2);
        return dimensionDescription;
    }

    /* renamed from: atMost-3ABfNKs, reason: not valid java name */
    public static final Dimension.MinCoercible m11506atMost3ABfNKs(Dimension.Coercible coercible, float f2) {
        x.d(coercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) coercible;
        dimensionDescription.getMax$constraintlayout_compose().m11526update0680j_4(f2);
        return dimensionDescription;
    }

    public static final void buildMapping(State state, List<? extends Measurable> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Measurable measurable = list.get(i2);
            Object layoutId = LayoutIdKt.getLayoutId(measurable);
            if (layoutId == null && (layoutId = ConstraintLayoutTagKt.getConstraintLayoutId(measurable)) == null) {
                layoutId = createId();
            }
            state.map(layoutId.toString(), measurable);
            Object constraintLayoutTag = ConstraintLayoutTagKt.getConstraintLayoutTag(measurable);
            if (constraintLayoutTag != null && (layoutId instanceof String)) {
                state.setTag((String) layoutId, (String) constraintLayoutTag);
            }
        }
    }

    public static final Object createId() {
        return new Object() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt.createId.1
        };
    }

    public static final Dimension.MaxCoercible getAtLeastWrapContent(Dimension.Coercible coercible) {
        x.d(coercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) coercible;
        dimensionDescription.getMin$constraintlayout_compose().update("wrap");
        return dimensionDescription;
    }

    public static final Dimension.MinCoercible getAtMostWrapContent(Dimension.Coercible coercible) {
        x.d(coercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) coercible;
        dimensionDescription.getMax$constraintlayout_compose().update("wrap");
        return dimensionDescription;
    }

    /* renamed from: placeWithFrameTransform-Ktjjmr4, reason: not valid java name */
    public static final void m11508placeWithFrameTransformKtjjmr4(Placeable.PlacementScope placementScope, Placeable placeable, final WidgetFrame widgetFrame, long j2) {
        if (widgetFrame.visibility == 8) {
            return;
        }
        if (widgetFrame.isDefaultTransform()) {
            Placeable.PlacementScope.m9813place70tqf50$default(placementScope, placeable, IntOffsetKt.IntOffset(widgetFrame.left - IntOffset.m11296getXimpl(j2), widgetFrame.top - IntOffset.m11297getYimpl(j2)), 0.0f, 2, null);
        } else {
            placementScope.placeWithLayer(placeable, widgetFrame.left - IntOffset.m11296getXimpl(j2), widgetFrame.top - IntOffset.m11297getYimpl(j2), Float.isNaN(widgetFrame.translationZ) ? 0.0f : widgetFrame.translationZ, new l() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return ConstraintLayoutKt.placeWithFrameTransform_Ktjjmr4$lambda$0(widgetFrame, (GraphicsLayerScope) obj);
                }
            });
        }
    }

    /* renamed from: placeWithFrameTransform-Ktjjmr4$default, reason: not valid java name */
    public static /* synthetic */ void m11509placeWithFrameTransformKtjjmr4$default(Placeable.PlacementScope placementScope, Placeable placeable, WidgetFrame widgetFrame, long j2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j2 = IntOffset.Companion.m11307getZeronOccac();
        }
        m11508placeWithFrameTransformKtjjmr4(placementScope, placeable, widgetFrame, j2);
    }

    static final ab placeWithFrameTransform_Ktjjmr4$lambda$0(WidgetFrame widgetFrame, GraphicsLayerScope graphicsLayerScope) {
        if (!Float.isNaN(widgetFrame.pivotX) || !Float.isNaN(widgetFrame.pivotY)) {
            graphicsLayerScope.mo8413setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(Float.isNaN(widgetFrame.pivotX) ? 0.5f : widgetFrame.pivotX, Float.isNaN(widgetFrame.pivotY) ? 0.5f : widgetFrame.pivotY));
        }
        if (!Float.isNaN(widgetFrame.rotationX)) {
            graphicsLayerScope.setRotationX(widgetFrame.rotationX);
        }
        if (!Float.isNaN(widgetFrame.rotationY)) {
            graphicsLayerScope.setRotationY(widgetFrame.rotationY);
        }
        if (!Float.isNaN(widgetFrame.rotationZ)) {
            graphicsLayerScope.setRotationZ(widgetFrame.rotationZ);
        }
        if (!Float.isNaN(widgetFrame.translationX)) {
            graphicsLayerScope.setTranslationX(widgetFrame.translationX);
        }
        if (!Float.isNaN(widgetFrame.translationY)) {
            graphicsLayerScope.setTranslationY(widgetFrame.translationY);
        }
        if (!Float.isNaN(widgetFrame.translationZ)) {
            graphicsLayerScope.setShadowElevation(widgetFrame.translationZ);
        }
        if (!Float.isNaN(widgetFrame.scaleX) || !Float.isNaN(widgetFrame.scaleY)) {
            graphicsLayerScope.setScaleX(Float.isNaN(widgetFrame.scaleX) ? 1.0f : widgetFrame.scaleX);
            graphicsLayerScope.setScaleY(Float.isNaN(widgetFrame.scaleY) ? 1.0f : widgetFrame.scaleY);
        }
        if (!Float.isNaN(widgetFrame.alpha)) {
            graphicsLayerScope.setAlpha(widgetFrame.alpha);
        }
        return ab.f48028a;
    }

    public static final String toDebugString(ConstraintWidget constraintWidget) {
        return constraintWidget.getDebugName() + " width " + constraintWidget.getWidth() + " minWidth " + constraintWidget.getMinWidth() + " maxWidth " + constraintWidget.getMaxWidth() + " height " + constraintWidget.getHeight() + " minHeight " + constraintWidget.getMinHeight() + " maxHeight " + constraintWidget.getMaxHeight() + " HDB " + constraintWidget.getHorizontalDimensionBehaviour() + " VDB " + constraintWidget.getVerticalDimensionBehaviour() + " MCW " + constraintWidget.mMatchConstraintDefaultWidth + " MCH " + constraintWidget.mMatchConstraintDefaultHeight + " percentW " + constraintWidget.mMatchConstraintPercentWidth + " percentH " + constraintWidget.mMatchConstraintPercentHeight;
    }

    /* renamed from: atLeast-3ABfNKs, reason: not valid java name */
    public static final Dimension m11504atLeast3ABfNKs(Dimension.MinCoercible minCoercible, float f2) {
        x.d(minCoercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) minCoercible;
        dimensionDescription.getMin$constraintlayout_compose().m11526update0680j_4(f2);
        return dimensionDescription;
    }

    /* renamed from: atMost-3ABfNKs, reason: not valid java name */
    public static final Dimension m11507atMost3ABfNKs(Dimension.MaxCoercible maxCoercible, float f2) {
        x.d(maxCoercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) maxCoercible;
        dimensionDescription.getMax$constraintlayout_compose().m11526update0680j_4(f2);
        return dimensionDescription;
    }

    public static final Dimension getAtLeastWrapContent(Dimension.MinCoercible minCoercible) {
        x.d(minCoercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) minCoercible;
        dimensionDescription.getMin$constraintlayout_compose().update("wrap");
        return dimensionDescription;
    }

    public static final Dimension getAtMostWrapContent(Dimension.MaxCoercible maxCoercible) {
        x.d(maxCoercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) maxCoercible;
        dimensionDescription.getMax$constraintlayout_compose().update("wrap");
        return dimensionDescription;
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$8, reason: invalid class name */
    public final class AnonymousClass8 implements p<Composer, Integer, ab> {
        final /* synthetic */ p<Composer, Integer, ab> $content;
        final /* synthetic */ MutableState<ab> $contentTracker;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(MutableState<ab> mutableState, p<? super Composer, ? super Integer, ab> pVar) {
            this.$contentTracker = mutableState;
            this.$content = pVar;
        }

        public final void invoke(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-147025937, i2, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:853)");
            }
            this.$contentTracker.setValue(ab.f48028a);
            this.$content.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$2, reason: invalid class name */
    public final class AnonymousClass2 implements p<Composer, Integer, ab> {
        final /* synthetic */ q<ConstraintLayoutScope, Composer, Integer, ab> $content;
        final /* synthetic */ MutableState<ab> $contentTracker;
        final /* synthetic */ a<ab> $onHelpersChanged;
        final /* synthetic */ ConstraintLayoutScope $scope;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(MutableState<ab> mutableState, ConstraintLayoutScope constraintLayoutScope, q<? super ConstraintLayoutScope, ? super Composer, ? super Integer, ab> qVar, a<ab> aVar) {
            this.$contentTracker = mutableState;
            this.$scope = constraintLayoutScope;
            this.$content = qVar;
            this.$onHelpersChanged = aVar;
        }

        public final void invoke(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1759682870, i2, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
            }
            this.$contentTracker.setValue(ab.f48028a);
            ConstraintLayoutScope constraintLayoutScope = this.$scope;
            int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
            constraintLayoutScope.reset();
            this.$content.invoke(this.$scope, composer, 0);
            if (this.$scope.getHelpersHashCode() != helpersHashCode) {
                composer.startReplaceGroup(1658858795);
                EffectsKt.SideEffect(this.$onHelpersChanged, composer, 6);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1659148056);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return ab.f48028a;
        }
    }

    public static final ConstraintSet ConstraintSet(ConstraintSet constraintSet, l<? super ConstraintSetScope, ab> lVar) {
        return new DslConstraintSet(lVar, constraintSet);
    }

    public static final ConstraintSet ConstraintSet(String str) {
        return new JSONConstraintSet(str, null, null, 6, null);
    }

    public static final ConstraintSet ConstraintSet(ConstraintSet constraintSet, String str) {
        return new JSONConstraintSet(str, null, constraintSet, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ConstraintSet ConstraintSet(l<? super ConstraintSetScope, ab> lVar) {
        return new DslConstraintSet(lVar, null, 2, 0 == true ? 1 : 0);
    }

    public static final void ConstraintLayout(Modifier modifier, int i2, boolean z, AnimationSpec<Float> animationSpec, a<ab> aVar, q<? super ConstraintLayoutScope, ? super Composer, ? super Integer, ab> qVar, Composer composer, int i3, int i4) {
        Measurer2 measurer2;
        MutableState mutableState;
        Object obj;
        Modifier modifier2 = (i4 & 1) != 0 ? Modifier.Companion : modifier;
        int i5 = (i4 & 2) != 0 ? 257 : i2;
        boolean z2 = ((i4 & 4) == 0) & z;
        TweenSpec tweenSpecTween$default = (i4 & 8) != 0 ? AnimationSpecKt.tween$default(0, 0, null, 7, null) : animationSpec;
        a<ab> aVar2 = (i4 & 16) != 0 ? null : aVar;
        if (true != z2) {
            tweenSpecTween$default = null;
        }
        int i6 = i3 >> 3;
        composer.startReplaceGroup(-1066585843);
        int i7 = (i6 & 57344) | (i3 & 126) | (i6 & 7168);
        if (tweenSpecTween$default != null) {
            composer.startReplaceGroup(-490371868);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState3 = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composer.rememberedValue();
            Object obj2 = objRememberedValue3;
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                ConstraintLayoutScope constraintLayoutScope = new ConstraintLayoutScope();
                constraintLayoutScope.setAnimateChanges(true);
                composer.updateRememberedValue(constraintLayoutScope);
                obj2 = constraintLayoutScope;
            }
            ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) obj2;
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt.mutableStateOf(ab.f48028a, SnapshotStateKt.neverEqualPolicy());
                composer.updateRememberedValue(objRememberedValue4);
            }
            MutableState mutableState4 = (MutableState) objRememberedValue4;
            Object objRememberedValue5 = composer.rememberedValue();
            Object obj3 = objRememberedValue5;
            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                Ref ref = new Ref();
                ref.setValue(CompositionSource.Unknown);
                composer.updateRememberedValue(ref);
                obj3 = ref;
            }
            Ref ref2 = (Ref) obj3;
            Object objRememberedValue6 = composer.rememberedValue();
            if (objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = w.c(-1, null, null, 6);
                composer.updateRememberedValue(objRememberedValue6);
            }
            o oVar = (o) objRememberedValue6;
            LateMotionLayoutKt.LateMotionLayout(mutableState2, mutableState3, tweenSpecTween$default, oVar, mutableState4, ref2, i5, aVar2, modifier2, ComposableLambdaKt.rememberComposableLambda(-314716594, true, new ConstraintLayoutKt$ConstraintLayout$contentDelegate$1(mutableState4, ref2, constraintLayoutScope2, qVar, oVar, mutableState2, mutableState3), composer, 54), composer, (Ref.$stable << 15) | 805330998 | ((i7 << 15) & 3670016) | (29360128 & (i7 << 12)) | ((i7 << 24) & 234881024));
            composer.endReplaceGroup();
            composer.endReplaceGroup();
            return;
        }
        composer.startReplaceGroup(-487956875);
        composer.endReplaceGroup();
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object objRememberedValue7 = composer.rememberedValue();
        if (objRememberedValue7 == Composer.Companion.getEmpty()) {
            objRememberedValue7 = new Measurer2(density);
            composer.updateRememberedValue(objRememberedValue7);
        }
        Measurer2 measurer22 = (Measurer2) objRememberedValue7;
        Object objRememberedValue8 = composer.rememberedValue();
        if (objRememberedValue8 == Composer.Companion.getEmpty()) {
            objRememberedValue8 = new ConstraintLayoutScope();
            composer.updateRememberedValue(objRememberedValue8);
        }
        ConstraintLayoutScope constraintLayoutScope3 = (ConstraintLayoutScope) objRememberedValue8;
        Object objRememberedValue9 = composer.rememberedValue();
        if (objRememberedValue9 == Composer.Companion.getEmpty()) {
            objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            composer.updateRememberedValue(objRememberedValue9);
        }
        MutableState mutableState5 = (MutableState) objRememberedValue9;
        Object objRememberedValue10 = composer.rememberedValue();
        if (objRememberedValue10 == Composer.Companion.getEmpty()) {
            objRememberedValue10 = new ConstraintSetForInlineDsl(constraintLayoutScope3);
            composer.updateRememberedValue(objRememberedValue10);
        }
        ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue10;
        Object objRememberedValue11 = composer.rememberedValue();
        if (objRememberedValue11 == Composer.Companion.getEmpty()) {
            objRememberedValue11 = SnapshotStateKt.mutableStateOf(ab.f48028a, SnapshotStateKt.neverEqualPolicy());
            composer.updateRememberedValue(objRememberedValue11);
        }
        MutableState mutableState6 = (MutableState) objRememberedValue11;
        boolean zChangedInstance = ((((i7 & 112) ^ 48) > 32 && composer.changed(i5)) || (i7 & 48) == 32) | composer.changedInstance(measurer22);
        Object objRememberedValue12 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue12 == Composer.Companion.getEmpty()) {
            measurer2 = measurer22;
            mutableState = mutableState6;
            obj = (MeasurePolicy) new ConstraintLayoutKt$ConstraintLayout$measurePolicy$1$1(mutableState, measurer2, constraintSetForInlineDsl, i5, mutableState5);
            composer.updateRememberedValue(obj);
        } else {
            obj = objRememberedValue12;
            measurer2 = measurer22;
            mutableState = mutableState6;
        }
        MeasurePolicy measurePolicy = (MeasurePolicy) obj;
        Object objRememberedValue13 = composer.rememberedValue();
        if (objRememberedValue13 == Composer.Companion.getEmpty()) {
            objRememberedValue13 = (a) new ConstraintLayoutKt$ConstraintLayout$onHelpersChanged$1$1(mutableState5, constraintSetForInlineDsl);
            composer.updateRememberedValue(objRememberedValue13);
        }
        a aVar3 = (a) objRememberedValue13;
        boolean zChangedInstance2 = composer.changedInstance(measurer2);
        Object objRememberedValue14 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue14 == Composer.Companion.getEmpty()) {
            objRememberedValue14 = (l) new ConstraintLayoutKt$ConstraintLayout$1$1(measurer2);
            composer.updateRememberedValue(objRememberedValue14);
        }
        LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics(modifier2, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (l) objRememberedValue14), ComposableLambdaKt.rememberComposableLambda(-1759682870, true, new AnonymousClass2(mutableState, constraintLayoutScope3, qVar, aVar3), composer, 54), measurePolicy, composer, 48, 0);
        composer.endReplaceGroup();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void ConstraintLayout(ConstraintSet constraintSet, Modifier modifier, int i2, AnimationSpec<Float> animationSpec, a<ab> aVar, p<? super Composer, ? super Integer, ab> pVar, Composer composer, int i3, int i4) {
        Animatable animatable;
        Modifier modifier2 = (i4 & 2) != 0 ? Modifier.Companion : modifier;
        int i5 = i3 & 14;
        int i6 = (i4 & 4) != 0 ? 257 : i2;
        AnimationSpec<Float> animationSpec2 = (i4 & 8) != 0 ? null : animationSpec;
        a<ab> aVar2 = (i4 & 16) != 0 ? null : aVar;
        int i7 = i5 ^ 6;
        if (animationSpec2 != null) {
            composer.startReplaceGroup(-1632876364);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(constraintSet, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(constraintSet, null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            Animatable animatable2 = (Animatable) objRememberedValue3;
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = w.c(-1, null, null, 6);
                composer.updateRememberedValue(objRememberedValue4);
            }
            o oVar = (o) objRememberedValue4;
            Object objRememberedValue5 = composer.rememberedValue();
            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = SnapshotIntStateKt.mutableIntStateOf(1);
                composer.updateRememberedValue(objRememberedValue5);
            }
            MutableIntState mutableIntState = (MutableIntState) objRememberedValue5;
            boolean zChangedInstance = ((i7 > 4 && composer.changed(constraintSet)) || (i3 & 6) == 4) | composer.changedInstance(oVar);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = (a) new ConstraintLayoutKt$ConstraintLayout$3$1(oVar, constraintSet);
                composer.updateRememberedValue(objRememberedValue6);
            }
            EffectsKt.SideEffect((a) objRememberedValue6, composer, 0);
            boolean zChangedInstance2 = composer.changedInstance(oVar) | composer.changedInstance(animatable2) | composer.changedInstance(animationSpec2) | ((((57344 & i3) ^ 24576) > 16384 && composer.changed(aVar2)) || (i3 & 24576) == 16384);
            Object objRememberedValue7 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue7 == Composer.Companion.getEmpty()) {
                animatable = animatable2;
                objRememberedValue7 = (p) new ConstraintLayoutKt$ConstraintLayout$4$1(oVar, mutableIntState, animatable, animationSpec2, aVar2, mutableState, mutableState2, null);
                composer.updateRememberedValue(objRememberedValue7);
            } else {
                animatable = animatable2;
            }
            EffectsKt.LaunchedEffect(oVar, (p<? super af, ? super e<? super ab>, ? extends Object>) objRememberedValue7, composer, 0);
            ConstraintSet constraintSetM11495ConstraintLayout$lambda15 = m11495ConstraintLayout$lambda15(mutableState);
            ConstraintSet constraintSetM11497ConstraintLayout$lambda18 = m11497ConstraintLayout$lambda18(mutableState2);
            float fFloatValue = ((Number) animatable.getValue()).floatValue();
            int i8 = i3 << 6;
            int iM11523getNonebfy_xzQ = DebugFlags.Companion.m11523getNonebfy_xzQ();
            InvalidationStrategy defaultInvalidationStrategy = InvalidationStrategy.Companion.getDefaultInvalidationStrategy();
            Object objRememberedValue8 = composer.rememberedValue();
            if (objRememberedValue8 == Composer.Companion.getEmpty()) {
                objRememberedValue8 = SnapshotStateKt.mutableStateOf(ab.f48028a, SnapshotStateKt.neverEqualPolicy());
                composer.updateRememberedValue(objRememberedValue8);
            }
            MutableState mutableState3 = (MutableState) objRememberedValue8;
            Object objRememberedValue9 = composer.rememberedValue();
            Object obj = objRememberedValue9;
            if (objRememberedValue9 == Composer.Companion.getEmpty()) {
                Ref ref = new Ref();
                ref.setValue(CompositionSource.Unknown);
                composer.updateRememberedValue(ref);
                obj = ref;
            }
            Ref ref2 = (Ref) obj;
            MotionLayoutKt.MotionLayoutCore(constraintSetM11495ConstraintLayout$lambda15, constraintSetM11497ConstraintLayout$lambda18, null, fFloatValue, null, 257, DebugFlags.m11516getShowBoundsimpl(iM11523getNonebfy_xzQ), DebugFlags.m11518getShowPathsimpl(iM11523getNonebfy_xzQ), DebugFlags.m11517getShowKeyPositionsimpl(iM11523getNonebfy_xzQ), modifier2, mutableState3, ref2, defaultInvalidationStrategy, ComposableLambdaKt.rememberComposableLambda(511777000, true, new ConstraintLayoutKt$ConstraintLayout$$inlined$MotionLayoutT3LJ6Qw$1(mutableState3, defaultInvalidationStrategy, ref2, pVar), composer, 54), composer, 24576 | (((i8 & 7168) << 18) & C.ENCODING_PCM_DOUBLE), (Ref.$stable << 3) | DisplayStrings.DS_AAOS_SOUND_OFF);
            composer.endReplaceGroup();
            return;
        }
        composer.startReplaceGroup(-1631413660);
        Object objRememberedValue10 = composer.rememberedValue();
        if (objRememberedValue10 == Composer.Companion.getEmpty()) {
            objRememberedValue10 = SnapshotLongStateKt.mutableLongStateOf(0L);
            composer.updateRememberedValue(objRememberedValue10);
        }
        MutableLongState mutableLongState = (MutableLongState) objRememberedValue10;
        Object objRememberedValue11 = composer.rememberedValue();
        if (objRememberedValue11 == Composer.Companion.getEmpty()) {
            objRememberedValue11 = SnapshotStateKt.mutableStateOf(ab.f48028a, SnapshotStateKt.neverEqualPolicy());
            composer.updateRememberedValue(objRememberedValue11);
        }
        MutableState mutableState4 = (MutableState) objRememberedValue11;
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object objRememberedValue12 = composer.rememberedValue();
        if (objRememberedValue12 == Composer.Companion.getEmpty()) {
            objRememberedValue12 = new Measurer2(density);
            composer.updateRememberedValue(objRememberedValue12);
        }
        Measurer2 measurer2 = (Measurer2) objRememberedValue12;
        boolean zChangedInstance3 = ((((i3 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) > 256 && composer.changed(i6)) || (i3 & 384) == 256) | ((i7 > 4 && composer.changed(constraintSet)) || (i3 & 6) == 4) | composer.changedInstance(measurer2);
        Object objRememberedValue13 = composer.rememberedValue();
        if (zChangedInstance3 || objRememberedValue13 == Composer.Companion.getEmpty()) {
            objRememberedValue13 = (MeasurePolicy) new ConstraintLayoutKt$ConstraintLayout$measurePolicy$2$1(mutableState4, measurer2, constraintSet, i6);
            composer.updateRememberedValue(objRememberedValue13);
        }
        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue13;
        if (constraintSet instanceof EditableJSONLayout) {
            ((EditableJSONLayout) constraintSet).setUpdateFlag(mutableLongState);
        }
        measurer2.addLayoutInformationReceiver(constraintSet instanceof LayoutInformationReceiver ? (LayoutInformationReceiver) constraintSet : null);
        if (!Float.isNaN(measurer2.getForcedScaleFactor())) {
            composer.startReplaceGroup(-1629995255);
            Modifier modifierScale = ScaleKt.scale(modifier2, measurer2.getForcedScaleFactor());
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
            boolean zChangedInstance4 = composer.changedInstance(measurer2);
            Object objRememberedValue14 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue14 == Composer.Companion.getEmpty()) {
                objRememberedValue14 = (l) new ConstraintLayoutKt$ConstraintLayout$6$1$1(measurer2);
                composer.updateRememberedValue(objRememberedValue14);
            }
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics(modifierScale, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (l) objRememberedValue14), ComposableLambdaKt.rememberComposableLambda(-1368997460, true, new ConstraintLayoutKt$ConstraintLayout$6$2(pVar), composer, 54), measurePolicy, composer, 48, 0);
            composer.endNode();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1629517142);
            boolean zChangedInstance5 = composer.changedInstance(measurer2);
            Object objRememberedValue15 = composer.rememberedValue();
            if (zChangedInstance5 || objRememberedValue15 == Composer.Companion.getEmpty()) {
                objRememberedValue15 = (l) new ConstraintLayoutKt$ConstraintLayout$7$1(measurer2);
                composer.updateRememberedValue(objRememberedValue15);
            }
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics(modifier2, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (l) objRememberedValue15), ComposableLambdaKt.rememberComposableLambda(-147025937, true, new AnonymousClass8(mutableState4, pVar), composer, 54), measurePolicy, composer, 48, 0);
            composer.endReplaceGroup();
        }
        composer.endReplaceGroup();
    }

    public static final void ConstraintLayout(Modifier modifier, int i2, AnimationSpec<Float> animationSpec, a<ab> aVar, q<? super ConstraintLayoutScope, ? super Composer, ? super Integer, ab> qVar, Composer composer, int i3, int i4) {
        composer.startReplaceGroup(-1066585843);
        Modifier modifier2 = (i4 & 1) != 0 ? Modifier.Companion : modifier;
        int i5 = (i4 & 2) != 0 ? 257 : i2;
        AnimationSpec<Float> animationSpec2 = (i4 & 4) != 0 ? null : animationSpec;
        a<ab> aVar2 = (i4 & 8) != 0 ? null : aVar;
        if (animationSpec2 != null) {
            composer.startReplaceGroup(-490371868);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composer.rememberedValue();
            Object obj = objRememberedValue3;
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                ConstraintLayoutScope constraintLayoutScope = new ConstraintLayoutScope();
                constraintLayoutScope.setAnimateChanges(true);
                composer.updateRememberedValue(constraintLayoutScope);
                obj = constraintLayoutScope;
            }
            ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) obj;
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt.mutableStateOf(ab.f48028a, SnapshotStateKt.neverEqualPolicy());
                composer.updateRememberedValue(objRememberedValue4);
            }
            MutableState mutableState3 = (MutableState) objRememberedValue4;
            Object objRememberedValue5 = composer.rememberedValue();
            Object obj2 = objRememberedValue5;
            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                Ref ref = new Ref();
                ref.setValue(CompositionSource.Unknown);
                composer.updateRememberedValue(ref);
                obj2 = ref;
            }
            Ref ref2 = (Ref) obj2;
            Object objRememberedValue6 = composer.rememberedValue();
            if (objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = w.c(-1, null, null, 6);
                composer.updateRememberedValue(objRememberedValue6);
            }
            o oVar = (o) objRememberedValue6;
            LateMotionLayoutKt.LateMotionLayout(mutableState, mutableState2, animationSpec2, oVar, mutableState3, ref2, i5, aVar2, modifier2, ComposableLambdaKt.rememberComposableLambda(-314716594, true, new ConstraintLayoutKt$ConstraintLayout$contentDelegate$1(mutableState3, ref2, constraintLayoutScope2, qVar, oVar, mutableState, mutableState2), composer, 54), composer, (i3 & DisplayStrings.DS_TAP_TO_VERIFY) | 805330998 | (Ref.$stable << 15) | (3670016 & (i3 << 15)) | (29360128 & (i3 << 12)) | ((i3 << 24) & 234881024));
            composer.endReplaceGroup();
            composer.endReplaceGroup();
            return;
        }
        composer.startReplaceGroup(-487956875);
        composer.endReplaceGroup();
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object objRememberedValue7 = composer.rememberedValue();
        if (objRememberedValue7 == Composer.Companion.getEmpty()) {
            objRememberedValue7 = new Measurer2(density);
            composer.updateRememberedValue(objRememberedValue7);
        }
        Measurer2 measurer2 = (Measurer2) objRememberedValue7;
        Object objRememberedValue8 = composer.rememberedValue();
        if (objRememberedValue8 == Composer.Companion.getEmpty()) {
            objRememberedValue8 = new ConstraintLayoutScope();
            composer.updateRememberedValue(objRememberedValue8);
        }
        ConstraintLayoutScope constraintLayoutScope3 = (ConstraintLayoutScope) objRememberedValue8;
        Object objRememberedValue9 = composer.rememberedValue();
        if (objRememberedValue9 == Composer.Companion.getEmpty()) {
            objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            composer.updateRememberedValue(objRememberedValue9);
        }
        MutableState mutableState4 = (MutableState) objRememberedValue9;
        Object objRememberedValue10 = composer.rememberedValue();
        if (objRememberedValue10 == Composer.Companion.getEmpty()) {
            objRememberedValue10 = new ConstraintSetForInlineDsl(constraintLayoutScope3);
            composer.updateRememberedValue(objRememberedValue10);
        }
        ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue10;
        Object objRememberedValue11 = composer.rememberedValue();
        if (objRememberedValue11 == Composer.Companion.getEmpty()) {
            objRememberedValue11 = SnapshotStateKt.mutableStateOf(ab.f48028a, SnapshotStateKt.neverEqualPolicy());
            composer.updateRememberedValue(objRememberedValue11);
        }
        MutableState mutableState5 = (MutableState) objRememberedValue11;
        boolean zChangedInstance = ((((i3 & 112) ^ 48) > 32 && composer.changed(i5)) || (i3 & 48) == 32) | composer.changedInstance(measurer2);
        Object objRememberedValue12 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue12 == Composer.Companion.getEmpty()) {
            objRememberedValue12 = (MeasurePolicy) new ConstraintLayoutKt$ConstraintLayout$measurePolicy$1$1(mutableState5, measurer2, constraintSetForInlineDsl, i5, mutableState4);
            composer.updateRememberedValue(objRememberedValue12);
        }
        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue12;
        Object objRememberedValue13 = composer.rememberedValue();
        if (objRememberedValue13 == Composer.Companion.getEmpty()) {
            objRememberedValue13 = (a) new ConstraintLayoutKt$ConstraintLayout$onHelpersChanged$1$1(mutableState4, constraintSetForInlineDsl);
            composer.updateRememberedValue(objRememberedValue13);
        }
        a aVar3 = (a) objRememberedValue13;
        boolean zChangedInstance2 = composer.changedInstance(measurer2);
        Object objRememberedValue14 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue14 == Composer.Companion.getEmpty()) {
            objRememberedValue14 = (l) new ConstraintLayoutKt$ConstraintLayout$1$1(measurer2);
            composer.updateRememberedValue(objRememberedValue14);
        }
        LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics(modifier2, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (l) objRememberedValue14), ComposableLambdaKt.rememberComposableLambda(-1759682870, true, new AnonymousClass2(mutableState5, constraintLayoutScope3, qVar, aVar3), composer, 54), measurePolicy, composer, 48, 0);
        composer.endReplaceGroup();
    }
}
