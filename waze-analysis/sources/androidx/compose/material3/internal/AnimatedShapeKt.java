package androidx.compose.material3.internal;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ShapeWithHorizontalCenterOptically;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.a;
import h.g.a.p;
import h.g.b.w;
import h.k.e;
import h.k.n;
import kotlinx.coroutines.a.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AnimatedShapeKt {
    public static final Shape rememberAnimatedShape(final CornerBasedShape cornerBasedShape, FiniteAnimationSpec<Float> finiteAnimationSpec, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(282475599, i2, -1, "androidx.compose.material3.internal.rememberAnimatedShape (AnimatedShape.kt:238)");
        }
        boolean zChanged = composer.changed(finiteAnimationSpec);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new AnimatedCornerBasedShapeState(cornerBasedShape, finiteAnimationSpec);
            composer.updateRememberedValue(objRememberedValue);
        }
        AnimatedCornerBasedShapeState animatedCornerBasedShapeState = (AnimatedCornerBasedShapeState) objRememberedValue;
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = w.c(-1, null, null, 6);
            composer.updateRememberedValue(objRememberedValue2);
        }
        final o oVar = (o) objRememberedValue2;
        boolean zChangedInstance = composer.changedInstance(oVar);
        boolean z = true;
        if ((((i2 & 14) ^ 6) <= 4 || !composer.changed(cornerBasedShape)) && (i2 & 6) != 4) {
            z = false;
        }
        boolean z2 = zChangedInstance | z;
        Object objRememberedValue3 = composer.rememberedValue();
        if (z2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = new a() { // from class: androidx.compose.material3.internal.AnimatedShapeKt$$ExternalSyntheticLambda1
                @Override // h.g.a.a
                public final Object invoke() {
                    return AnimatedShapeKt.rememberAnimatedShape$lambda$8$0(oVar, cornerBasedShape);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        EffectsKt.SideEffect((a) objRememberedValue3, composer, 0);
        boolean zChangedInstance2 = composer.changedInstance(oVar) | composer.changed(animatedCornerBasedShapeState);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue4 == Composer.Companion.getEmpty()) {
            objRememberedValue4 = (p) new AnimatedShapeKt$rememberAnimatedShape$6$1(oVar, animatedCornerBasedShapeState, null);
            composer.updateRememberedValue(objRememberedValue4);
        }
        EffectsKt.LaunchedEffect(animatedCornerBasedShapeState, oVar, (p) objRememberedValue4, composer, 0);
        Shape shapeRememberAnimatedShape = rememberAnimatedShape(animatedCornerBasedShapeState, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shapeRememberAnimatedShape;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab rememberAnimatedShape$lambda$3$0(o oVar, RoundedCornerShape roundedCornerShape) {
        oVar.i(roundedCornerShape);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab rememberAnimatedShape$lambda$8$0(o oVar, CornerBasedShape cornerBasedShape) {
        oVar.i(cornerBasedShape);
        return ab.f48028a;
    }

    public static final Shape rememberAnimatedShape(final RoundedCornerShape roundedCornerShape, FiniteAnimationSpec<Float> finiteAnimationSpec, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-288714613, i2, -1, "androidx.compose.material3.internal.rememberAnimatedShape (AnimatedShape.kt:133)");
        }
        boolean zChanged = composer.changed(finiteAnimationSpec);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new AnimatedShapeState(roundedCornerShape, finiteAnimationSpec);
            composer.updateRememberedValue(objRememberedValue);
        }
        AnimatedShapeState animatedShapeState = (AnimatedShapeState) objRememberedValue;
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = w.c(-1, null, null, 6);
            composer.updateRememberedValue(objRememberedValue2);
        }
        final o oVar = (o) objRememberedValue2;
        boolean zChangedInstance = composer.changedInstance(oVar);
        boolean z = true;
        if ((((i2 & 14) ^ 6) <= 4 || !composer.changed(roundedCornerShape)) && (i2 & 6) != 4) {
            z = false;
        }
        boolean z2 = zChangedInstance | z;
        Object objRememberedValue3 = composer.rememberedValue();
        if (z2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = new a() { // from class: androidx.compose.material3.internal.AnimatedShapeKt$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return AnimatedShapeKt.rememberAnimatedShape$lambda$3$0(oVar, roundedCornerShape);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        EffectsKt.SideEffect((a) objRememberedValue3, composer, 0);
        boolean zChangedInstance2 = composer.changedInstance(oVar) | composer.changed(animatedShapeState);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue4 == Composer.Companion.getEmpty()) {
            objRememberedValue4 = (p) new AnimatedShapeKt$rememberAnimatedShape$3$1(oVar, animatedShapeState, null);
            composer.updateRememberedValue(objRememberedValue4);
        }
        EffectsKt.LaunchedEffect(animatedShapeState, oVar, (p) objRememberedValue4, composer, 0);
        Shape shapeRememberAnimatedShape = rememberAnimatedShape(animatedShapeState, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shapeRememberAnimatedShape;
    }

    private static final Shape rememberAnimatedShape(final AnimatedCornerBasedShapeState animatedCornerBasedShapeState, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1796061591, i2, -1, "androidx.compose.material3.internal.rememberAnimatedShape (AnimatedShape.kt:196)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        animatedCornerBasedShapeState.setDensity(density);
        boolean zChanged = composer.changed(density);
        boolean z = true;
        if ((((i2 & 14) ^ 6) <= 4 || !composer.changed(animatedCornerBasedShapeState)) && (i2 & 6) != 4) {
            z = false;
        }
        boolean z2 = zChanged | z;
        Object objRememberedValue = composer.rememberedValue();
        if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new ShapeWithHorizontalCenterOptically() { // from class: androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$4$1
                private final MutableState clampedRange$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(n.b(0.0f, 1.0f), null, 2, null);

                @Override // androidx.compose.ui.graphics.Shape
                /* renamed from: createOutline-Pq9zytI */
                public Outline mo2037createOutlinePq9zytI(long j2, LayoutDirection layoutDirection, Density density2) {
                    animatedCornerBasedShapeState.m6188setSizeuvyYCjk(j2);
                    setClampedRange(n.b(0.0f, Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2)) / 2.0f));
                    return RoundedCornerShapeKt.RoundedCornerShape(((Number) n.q(Float.valueOf(AnimatedCornerBasedShapeState.m6184topStartTmRCtEA$default(animatedCornerBasedShapeState, 0L, null, 3, null)), getClampedRange())).floatValue(), ((Number) n.q(Float.valueOf(AnimatedCornerBasedShapeState.m6183topEndTmRCtEA$default(animatedCornerBasedShapeState, 0L, null, 3, null)), getClampedRange())).floatValue(), ((Number) n.q(Float.valueOf(AnimatedCornerBasedShapeState.m6181bottomEndTmRCtEA$default(animatedCornerBasedShapeState, 0L, null, 3, null)), getClampedRange())).floatValue(), ((Number) n.q(Float.valueOf(AnimatedCornerBasedShapeState.m6182bottomStartTmRCtEA$default(animatedCornerBasedShapeState, 0L, null, 3, null)), getClampedRange())).floatValue()).mo2037createOutlinePq9zytI(j2, layoutDirection, density2);
                }

                public final e<Float> getClampedRange() {
                    return (e) this.clampedRange$delegate.getValue();
                }

                @Override // androidx.compose.material3.ShapeWithHorizontalCenterOptically
                public float offset() {
                    float fFloatValue = ((Number) n.q(Float.valueOf(AnimatedCornerBasedShapeState.m6184topStartTmRCtEA$default(animatedCornerBasedShapeState, 0L, null, 3, null)), getClampedRange())).floatValue();
                    float fFloatValue2 = ((Number) n.q(Float.valueOf(AnimatedCornerBasedShapeState.m6183topEndTmRCtEA$default(animatedCornerBasedShapeState, 0L, null, 3, null)), getClampedRange())).floatValue();
                    return (((fFloatValue + ((Number) n.q(Float.valueOf(AnimatedCornerBasedShapeState.m6182bottomStartTmRCtEA$default(animatedCornerBasedShapeState, 0L, null, 3, null)), getClampedRange())).floatValue()) / 2.0f) - ((fFloatValue2 + ((Number) n.q(Float.valueOf(AnimatedCornerBasedShapeState.m6181bottomEndTmRCtEA$default(animatedCornerBasedShapeState, 0L, null, 3, null)), getClampedRange())).floatValue()) / 2.0f)) * 0.11f;
                }

                public final void setClampedRange(e<Float> eVar) {
                    this.clampedRange$delegate.setValue(eVar);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        AnimatedShapeKt$rememberAnimatedShape$4$1 animatedShapeKt$rememberAnimatedShape$4$1 = (AnimatedShapeKt$rememberAnimatedShape$4$1) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animatedShapeKt$rememberAnimatedShape$4$1;
    }

    private static final Shape rememberAnimatedShape(final AnimatedShapeState animatedShapeState, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1383367813, i2, -1, "androidx.compose.material3.internal.rememberAnimatedShape (AnimatedShape.kt:90)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        animatedShapeState.setDensity(density);
        boolean zChanged = composer.changed(density);
        boolean z = true;
        if ((((i2 & 14) ^ 6) <= 4 || !composer.changed(animatedShapeState)) && (i2 & 6) != 4) {
            z = false;
        }
        boolean z2 = zChanged | z;
        Object objRememberedValue = composer.rememberedValue();
        if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new ShapeWithHorizontalCenterOptically() { // from class: androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$1$1
                private final MutableState clampedRange$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(n.b(0.0f, 1.0f), null, 2, null);

                @Override // androidx.compose.ui.graphics.Shape
                /* renamed from: createOutline-Pq9zytI */
                public Outline mo2037createOutlinePq9zytI(long j2, LayoutDirection layoutDirection, Density density2) {
                    animatedShapeState.m6199setSizeuvyYCjk(j2);
                    setClampedRange(n.b(0.0f, Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2)) / 2.0f));
                    AnimatedShapeState animatedShapeState2 = animatedShapeState;
                    return animatedShapeState2.getShape().copy(CornerSizeKt.CornerSize(((Number) n.q(Float.valueOf(AnimatedShapeState.m6195topStartTmRCtEA$default(animatedShapeState2, 0L, null, 3, null)), getClampedRange())).floatValue()), CornerSizeKt.CornerSize(((Number) n.q(Float.valueOf(AnimatedShapeState.m6194topEndTmRCtEA$default(animatedShapeState, 0L, null, 3, null)), getClampedRange())).floatValue()), CornerSizeKt.CornerSize(((Number) n.q(Float.valueOf(AnimatedShapeState.m6192bottomEndTmRCtEA$default(animatedShapeState, 0L, null, 3, null)), getClampedRange())).floatValue()), CornerSizeKt.CornerSize(((Number) n.q(Float.valueOf(AnimatedShapeState.m6193bottomStartTmRCtEA$default(animatedShapeState, 0L, null, 3, null)), getClampedRange())).floatValue())).mo2037createOutlinePq9zytI(j2, layoutDirection, density2);
                }

                public final e<Float> getClampedRange() {
                    return (e) this.clampedRange$delegate.getValue();
                }

                @Override // androidx.compose.material3.ShapeWithHorizontalCenterOptically
                public float offset() {
                    float fFloatValue = ((Number) n.q(Float.valueOf(AnimatedShapeState.m6195topStartTmRCtEA$default(animatedShapeState, 0L, null, 3, null)), getClampedRange())).floatValue();
                    float fFloatValue2 = ((Number) n.q(Float.valueOf(AnimatedShapeState.m6194topEndTmRCtEA$default(animatedShapeState, 0L, null, 3, null)), getClampedRange())).floatValue();
                    return (((fFloatValue + ((Number) n.q(Float.valueOf(AnimatedShapeState.m6193bottomStartTmRCtEA$default(animatedShapeState, 0L, null, 3, null)), getClampedRange())).floatValue()) / 2.0f) - ((fFloatValue2 + ((Number) n.q(Float.valueOf(AnimatedShapeState.m6192bottomEndTmRCtEA$default(animatedShapeState, 0L, null, 3, null)), getClampedRange())).floatValue()) / 2.0f)) * 0.11f;
                }

                public final void setClampedRange(e<Float> eVar) {
                    this.clampedRange$delegate.setValue(eVar);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        AnimatedShapeKt$rememberAnimatedShape$1$1 animatedShapeKt$rememberAnimatedShape$1$1 = (AnimatedShapeKt$rememberAnimatedShape$1$1) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animatedShapeKt$rememberAnimatedShape$1$1;
    }
}
