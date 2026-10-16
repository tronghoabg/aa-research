package androidx.compose.material3.internal;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class DeterminateLinearWavyProgressNode extends BaseLinearWavyProgressNode {
    private l<? super Float, Float> amplitude;
    private final CacheDrawModifierNode cacheDrawNodeDelegate;
    private a<Float> progress;
    private final float[] progressFractionsArray;
    private float stopSize;

    private DeterminateLinearWavyProgressNode(a<Float> aVar, l<? super Float, Float> lVar, float f2, long j2, long j3, Stroke stroke, Stroke stroke2, float f3, float f4, float f5) {
        super(j2, j3, stroke, stroke2, f3, f4, f5, null);
        this.progress = aVar;
        this.amplitude = lVar;
        this.stopSize = f2;
        this.progressFractionsArray = new float[]{0.0f, 0.0f};
        CacheDrawModifierNode CacheDrawModifierNode = DrawModifierKt.CacheDrawModifierNode(new l() { // from class: androidx.compose.material3.internal.DeterminateLinearWavyProgressNode$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return DeterminateLinearWavyProgressNode.cacheDrawNodeDelegate$lambda$0(this.f$0, (CacheDrawScope) obj);
            }
        });
        delegate(CacheDrawModifierNode);
        this.cacheDrawNodeDelegate = CacheDrawModifierNode;
    }

    static final DrawResult cacheDrawNodeDelegate$lambda$0(final DeterminateLinearWavyProgressNode determinateLinearWavyProgressNode, CacheDrawScope cacheDrawScope) {
        float fFloatValue = determinateLinearWavyProgressNode.progress.invoke().floatValue();
        if (fFloatValue < 0.0f) {
            fFloatValue = 0.0f;
        }
        if (fFloatValue > 1.0f) {
            fFloatValue = 1.0f;
        }
        float fFloatValue2 = determinateLinearWavyProgressNode.amplitude.invoke(Float.valueOf(fFloatValue)).floatValue();
        float f2 = fFloatValue2 >= 0.0f ? fFloatValue2 : 0.0f;
        determinateLinearWavyProgressNode.updateAmplitudeAnimation(f2 <= 1.0f ? f2 : 1.0f);
        return cacheDrawScope.onDrawWithContent(new l() { // from class: androidx.compose.material3.internal.DeterminateLinearWavyProgressNode$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return DeterminateLinearWavyProgressNode.cacheDrawNodeDelegate$lambda$0$0(this.f$0, (ContentDrawScope) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab cacheDrawNodeDelegate$lambda$0$0(DeterminateLinearWavyProgressNode determinateLinearWavyProgressNode, ContentDrawScope contentDrawScope) {
        Animatable<Float, AnimationVector1D> amplitudeAnimatable = determinateLinearWavyProgressNode.getAmplitudeAnimatable();
        float fFloatValue = amplitudeAnimatable != null ? amplitudeAnimatable.getValue().floatValue() : 0.0f;
        determinateLinearWavyProgressNode.getProgressDrawingCache().m6281updatePathsVygBpHg(contentDrawScope.mo8751getSizeNHjbRc(), contentDrawScope.mo2127toPx0680j_4(determinateLinearWavyProgressNode.m6228getWavelengthD9Ej5fM()), determinateLinearWavyProgressNode.getProgressFractions(), fFloatValue, fFloatValue > 0.0f ? determinateLinearWavyProgressNode.getWaveOffset().getFloatValue() : 0.0f, contentDrawScope.mo2127toPx0680j_4(determinateLinearWavyProgressNode.m6225getGapSizeD9Ej5fM()), determinateLinearWavyProgressNode.getStroke(), determinateLinearWavyProgressNode.getTrackStroke());
        LinearProgressDrawingCache progressDrawingCache = determinateLinearWavyProgressNode.getProgressDrawingCache();
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        float f2 = contentDrawScope.getLayoutDirection() != LayoutDirection.Ltr ? 180.0f : 0.0f;
        long jMo8750getCenterF1C5BW0 = contentDrawScope2.mo8750getCenterF1C5BW0();
        DrawContext drawContext = contentDrawScope2.getDrawContext();
        long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo8764rotateUv8p0NA(f2, jMo8750getCenterF1C5BW0);
            DrawScope.CC.m8832drawPathLG529CI$default(contentDrawScope2, progressDrawingCache.getTrackPathToDraw(), determinateLinearWavyProgressNode.m6226getTrackColor0d7_KjU(), 0.0f, determinateLinearWavyProgressNode.getTrackStroke(), null, 0, 52, null);
            Path[] progressPathsToDraw = progressDrawingCache.getProgressPathsToDraw();
            if (progressPathsToDraw != null) {
                int length = progressPathsToDraw.length;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i2;
                    DrawScope.CC.m8832drawPathLG529CI$default(contentDrawScope2, progressPathsToDraw[i3], determinateLinearWavyProgressNode.m6224getColor0d7_KjU(), 0.0f, determinateLinearWavyProgressNode.getStroke(), null, 0, 52, null);
                    i2 = i3 + 1;
                }
            }
            LinearWavyProgressModifiersKt.m6283drawStopIndicatorVnkRyUA(contentDrawScope2, determinateLinearWavyProgressNode.getProgressFractions()[1], contentDrawScope2.mo8751getSizeNHjbRc(), determinateLinearWavyProgressNode.stopSize, progressDrawingCache.getCurrentStrokeCapWidth(), determinateLinearWavyProgressNode.getTrackStroke(), determinateLinearWavyProgressNode.m6224getColor0d7_KjU());
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
            return ab.f48028a;
        } catch (Throwable th) {
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
            throw th;
        }
    }

    public final l<Float, Float> getAmplitude() {
        return this.amplitude;
    }

    public final CacheDrawModifierNode getCacheDrawNodeDelegate() {
        return this.cacheDrawNodeDelegate;
    }

    public final a<Float> getProgress() {
        return this.progress;
    }

    @Override // androidx.compose.material3.internal.BaseLinearWavyProgressNode
    protected float[] getProgressFractions() {
        this.progressFractionsArray[0] = 0.0f;
        float fFloatValue = this.progress.invoke().floatValue();
        float f2 = fFloatValue >= 0.0f ? fFloatValue : 0.0f;
        float[] fArr = this.progressFractionsArray;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        fArr[1] = f2;
        return fArr;
    }

    /* renamed from: getStopSize-D9Ej5fM, reason: not valid java name */
    public final float m6252getStopSizeD9Ej5fM() {
        return this.stopSize;
    }

    @Override // androidx.compose.material3.internal.BaseLinearWavyProgressNode
    protected void invalidateDraw() {
        DrawModifierNodeKt.invalidateDraw(this.cacheDrawNodeDelegate);
    }

    @Override // androidx.compose.material3.internal.BaseLinearWavyProgressNode
    protected void invalidateDrawCache() {
        this.cacheDrawNodeDelegate.invalidateDrawCache();
    }

    public final void setAmplitude(l<? super Float, Float> lVar) {
        this.amplitude = lVar;
    }

    public final void setProgress(a<Float> aVar) {
        this.progress = aVar;
    }

    /* renamed from: setStopSize-0680j_4, reason: not valid java name */
    public final void m6253setStopSize0680j_4(float f2) {
        if (Dp.m11169equalsimpl0(this.stopSize, f2)) {
            return;
        }
        this.stopSize = f2;
        DrawModifierNodeKt.invalidateDraw(this.cacheDrawNodeDelegate);
    }

    public /* synthetic */ DeterminateLinearWavyProgressNode(a aVar, l lVar, float f2, long j2, long j3, Stroke stroke, Stroke stroke2, float f3, float f4, float f5, o oVar) {
        this(aVar, lVar, f2, j2, j3, stroke, stroke2, f3, f4, f5);
    }
}
