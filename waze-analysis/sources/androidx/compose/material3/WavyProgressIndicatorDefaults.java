package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.material3.tokens.CircularProgressIndicatorTokens;
import androidx.compose.material3.tokens.LinearProgressIndicatorTokens;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.material3.tokens.ProgressIndicatorTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class WavyProgressIndicatorDefaults {
    public static final WavyProgressIndicatorDefaults INSTANCE = new WavyProgressIndicatorDefaults();
    private static final AnimationSpec<Float> ProgressAnimationSpec = AnimationSpecKt.tween$default(500, 0, MotionTokens.INSTANCE.getEasingLinearCubicBezier(), 2, null);
    private static final float LinearDeterminateWavelength = LinearProgressIndicatorTokens.INSTANCE.m6806getActiveWaveWavelengthD9Ej5fM();
    private static final float LinearIndeterminateWavelength = LinearProgressIndicatorTokens.INSTANCE.m6808getIndeterminateActiveWaveWavelengthD9Ej5fM();
    private static final float LinearContainerHeight = LinearProgressIndicatorTokens.INSTANCE.m6813getWaveHeightD9Ej5fM();
    private static final float LinearContainerWidth = 240.0f;
    private static final float LinearTrackStopIndicatorSize = LinearProgressIndicatorTokens.INSTANCE.m6809getStopSizeD9Ej5fM();
    private static final float CircularContainerSize = CircularProgressIndicatorTokens.INSTANCE.m6519getWaveSizeD9Ej5fM();
    private static final float CircularWavelength = CircularProgressIndicatorTokens.INSTANCE.m6515getActiveWaveWavelengthD9Ej5fM();
    private static final float LinearIndicatorTrackGapSize = LinearProgressIndicatorTokens.INSTANCE.m6811getTrackActiveSpaceD9Ej5fM();
    private static final float CircularIndicatorTrackGapSize = CircularProgressIndicatorTokens.INSTANCE.m6517getTrackActiveSpaceD9Ej5fM();
    private static final l<Float, Float> indicatorAmplitude = new l() { // from class: androidx.compose.material3.WavyProgressIndicatorDefaults$$ExternalSyntheticLambda0
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return Float.valueOf(WavyProgressIndicatorDefaults.indicatorAmplitude$lambda$0(((Float) obj).floatValue()));
        }
    };
    public static final int $stable = 8;

    private WavyProgressIndicatorDefaults() {
    }

    static final float indicatorAmplitude$lambda$0(float f2) {
        return (f2 <= 0.1f || f2 >= 0.95f) ? 0.0f : 1.0f;
    }

    /* renamed from: getCircularContainerSize-D9Ej5fM, reason: not valid java name */
    public final float m6108getCircularContainerSizeD9Ej5fM() {
        return CircularContainerSize;
    }

    public final Stroke getCircularIndicatorStroke(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-767650394, i2, -1, "androidx.compose.material3.WavyProgressIndicatorDefaults.<get-circularIndicatorStroke> (WavyProgressIndicator.kt:417)");
        }
        Stroke stroke = new Stroke(((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo2127toPx0680j_4(CircularProgressIndicatorTokens.INSTANCE.m6513getActiveThicknessD9Ej5fM()), 0.0f, StrokeCap.Companion.m8633getRoundKaPHkGw(), 0, null, 26, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stroke;
    }

    /* renamed from: getCircularIndicatorTrackGapSize-D9Ej5fM, reason: not valid java name */
    public final float m6109getCircularIndicatorTrackGapSizeD9Ej5fM() {
        return CircularIndicatorTrackGapSize;
    }

    public final Stroke getCircularTrackStroke(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(916794022, i2, -1, "androidx.compose.material3.WavyProgressIndicatorDefaults.<get-circularTrackStroke> (WavyProgressIndicator.kt:441)");
        }
        Stroke stroke = new Stroke(((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo2127toPx0680j_4(CircularProgressIndicatorTokens.INSTANCE.m6518getTrackThicknessD9Ej5fM()), 0.0f, StrokeCap.Companion.m8633getRoundKaPHkGw(), 0, null, 26, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stroke;
    }

    /* renamed from: getCircularWavelength-D9Ej5fM, reason: not valid java name */
    public final float m6110getCircularWavelengthD9Ej5fM() {
        return CircularWavelength;
    }

    public final l<Float, Float> getIndicatorAmplitude() {
        return indicatorAmplitude;
    }

    public final long getIndicatorColor(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-638038381, i2, -1, "androidx.compose.material3.WavyProgressIndicatorDefaults.<get-indicatorColor> (WavyProgressIndicator.kt:395)");
        }
        long value = ColorSchemeKt.getValue(ProgressIndicatorTokens.INSTANCE.getActiveIndicatorColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getLinearContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m6111getLinearContainerHeightD9Ej5fM() {
        return LinearContainerHeight;
    }

    /* renamed from: getLinearContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m6112getLinearContainerWidthD9Ej5fM() {
        return LinearContainerWidth;
    }

    /* renamed from: getLinearDeterminateWavelength-D9Ej5fM, reason: not valid java name */
    public final float m6113getLinearDeterminateWavelengthD9Ej5fM() {
        return LinearDeterminateWavelength;
    }

    /* renamed from: getLinearIndeterminateWavelength-D9Ej5fM, reason: not valid java name */
    public final float m6114getLinearIndeterminateWavelengthD9Ej5fM() {
        return LinearIndeterminateWavelength;
    }

    public final Stroke getLinearIndicatorStroke(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1183295526, i2, -1, "androidx.compose.material3.WavyProgressIndicatorDefaults.<get-linearIndicatorStroke> (WavyProgressIndicator.kt:405)");
        }
        Stroke stroke = new Stroke(((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo2127toPx0680j_4(LinearProgressIndicatorTokens.INSTANCE.m6804getActiveThicknessD9Ej5fM()), 0.0f, StrokeCap.Companion.m8633getRoundKaPHkGw(), 0, null, 26, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stroke;
    }

    /* renamed from: getLinearIndicatorTrackGapSize-D9Ej5fM, reason: not valid java name */
    public final float m6115getLinearIndicatorTrackGapSizeD9Ej5fM() {
        return LinearIndicatorTrackGapSize;
    }

    /* renamed from: getLinearTrackStopIndicatorSize-D9Ej5fM, reason: not valid java name */
    public final float m6116getLinearTrackStopIndicatorSizeD9Ej5fM() {
        return LinearTrackStopIndicatorSize;
    }

    public final Stroke getLinearTrackStroke(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(892954918, i2, -1, "androidx.compose.material3.WavyProgressIndicatorDefaults.<get-linearTrackStroke> (WavyProgressIndicator.kt:429)");
        }
        Stroke stroke = new Stroke(((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo2127toPx0680j_4(LinearProgressIndicatorTokens.INSTANCE.m6812getTrackThicknessD9Ej5fM()), 0.0f, StrokeCap.Companion.m8633getRoundKaPHkGw(), 0, null, 26, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stroke;
    }

    public final AnimationSpec<Float> getProgressAnimationSpec() {
        return ProgressAnimationSpec;
    }

    public final long getTrackColor(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2105992467, i2, -1, "androidx.compose.material3.WavyProgressIndicatorDefaults.<get-trackColor> (WavyProgressIndicator.kt:399)");
        }
        long value = ColorSchemeKt.getValue(ProgressIndicatorTokens.INSTANCE.getTrackColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }
}
