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
import androidx.compose.ui.unit.LayoutDirection;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class IndeterminateLinearWavyProgressNode extends BaseLinearWavyProgressNode {
    private float amplitude;
    private final CacheDrawModifierNode cacheDrawNodeDelegate;
    private a<Float> firstLineHeadProgress;
    private a<Float> firstLineTailProgress;
    private final float[] progressFractionsArray;
    private a<Float> secondLineHeadProgress;
    private a<Float> secondLineTailProgress;

    private IndeterminateLinearWavyProgressNode(a<Float> aVar, a<Float> aVar2, a<Float> aVar3, a<Float> aVar4, float f2, long j2, long j3, Stroke stroke, Stroke stroke2, float f3, float f4, float f5) {
        super(j2, j3, stroke, stroke2, f3, f4, f5, null);
        this.firstLineHeadProgress = aVar;
        this.firstLineTailProgress = aVar2;
        this.secondLineHeadProgress = aVar3;
        this.secondLineTailProgress = aVar4;
        float f6 = f2 >= 0.0f ? f2 : 0.0f;
        this.amplitude = f6 > 1.0f ? 1.0f : f6;
        this.progressFractionsArray = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        CacheDrawModifierNode CacheDrawModifierNode = DrawModifierKt.CacheDrawModifierNode(new l() { // from class: androidx.compose.material3.internal.IndeterminateLinearWavyProgressNode$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return IndeterminateLinearWavyProgressNode.cacheDrawNodeDelegate$lambda$0(this.f$0, (CacheDrawScope) obj);
            }
        });
        delegate(CacheDrawModifierNode);
        this.cacheDrawNodeDelegate = CacheDrawModifierNode;
    }

    static final DrawResult cacheDrawNodeDelegate$lambda$0(final IndeterminateLinearWavyProgressNode indeterminateLinearWavyProgressNode, CacheDrawScope cacheDrawScope) {
        indeterminateLinearWavyProgressNode.updateAmplitudeAnimation(indeterminateLinearWavyProgressNode.amplitude);
        return cacheDrawScope.onDrawWithContent(new l() { // from class: androidx.compose.material3.internal.IndeterminateLinearWavyProgressNode$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return IndeterminateLinearWavyProgressNode.cacheDrawNodeDelegate$lambda$0$0(this.f$0, (ContentDrawScope) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab cacheDrawNodeDelegate$lambda$0$0(IndeterminateLinearWavyProgressNode indeterminateLinearWavyProgressNode, ContentDrawScope contentDrawScope) {
        Animatable<Float, AnimationVector1D> amplitudeAnimatable = indeterminateLinearWavyProgressNode.getAmplitudeAnimatable();
        float fFloatValue = amplitudeAnimatable != null ? amplitudeAnimatable.getValue().floatValue() : 0.0f;
        indeterminateLinearWavyProgressNode.getProgressDrawingCache().m6281updatePathsVygBpHg(contentDrawScope.mo8751getSizeNHjbRc(), contentDrawScope.mo2127toPx0680j_4(indeterminateLinearWavyProgressNode.m6228getWavelengthD9Ej5fM()), indeterminateLinearWavyProgressNode.getProgressFractions(), fFloatValue, fFloatValue > 0.0f ? indeterminateLinearWavyProgressNode.getWaveOffset().getFloatValue() : 0.0f, contentDrawScope.mo2127toPx0680j_4(indeterminateLinearWavyProgressNode.m6225getGapSizeD9Ej5fM()), indeterminateLinearWavyProgressNode.getStroke(), indeterminateLinearWavyProgressNode.getTrackStroke());
        LinearProgressDrawingCache progressDrawingCache = indeterminateLinearWavyProgressNode.getProgressDrawingCache();
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        float f2 = contentDrawScope.getLayoutDirection() != LayoutDirection.Ltr ? 180.0f : 0.0f;
        long jMo8750getCenterF1C5BW0 = contentDrawScope2.mo8750getCenterF1C5BW0();
        DrawContext drawContext = contentDrawScope2.getDrawContext();
        long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo8764rotateUv8p0NA(f2, jMo8750getCenterF1C5BW0);
            DrawScope.CC.m8832drawPathLG529CI$default(contentDrawScope2, progressDrawingCache.getTrackPathToDraw(), indeterminateLinearWavyProgressNode.m6226getTrackColor0d7_KjU(), 0.0f, indeterminateLinearWavyProgressNode.getTrackStroke(), null, 0, 52, null);
            Path[] progressPathsToDraw = progressDrawingCache.getProgressPathsToDraw();
            if (progressPathsToDraw != null) {
                for (Path path : progressPathsToDraw) {
                    DrawScope.CC.m8832drawPathLG529CI$default(contentDrawScope2, path, indeterminateLinearWavyProgressNode.m6224getColor0d7_KjU(), 0.0f, indeterminateLinearWavyProgressNode.getStroke(), null, 0, 52, null);
                }
            }
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
            return ab.f48028a;
        } catch (Throwable th) {
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
            throw th;
        }
    }

    public final float getAmplitude() {
        return this.amplitude;
    }

    public final a<Float> getFirstLineHeadProgress() {
        return this.firstLineHeadProgress;
    }

    public final a<Float> getFirstLineTailProgress() {
        return this.firstLineTailProgress;
    }

    @Override // androidx.compose.material3.internal.BaseLinearWavyProgressNode
    protected float[] getProgressFractions() {
        this.progressFractionsArray[0] = this.firstLineTailProgress.invoke().floatValue();
        this.progressFractionsArray[1] = this.firstLineHeadProgress.invoke().floatValue();
        this.progressFractionsArray[2] = this.secondLineTailProgress.invoke().floatValue();
        float fFloatValue = this.secondLineHeadProgress.invoke().floatValue();
        float[] fArr = this.progressFractionsArray;
        fArr[3] = fFloatValue;
        return fArr;
    }

    public final a<Float> getSecondLineHeadProgress() {
        return this.secondLineHeadProgress;
    }

    public final a<Float> getSecondLineTailProgress() {
        return this.secondLineTailProgress;
    }

    @Override // androidx.compose.material3.internal.BaseLinearWavyProgressNode
    protected void invalidateDraw() {
        DrawModifierNodeKt.invalidateDraw(this.cacheDrawNodeDelegate);
    }

    @Override // androidx.compose.material3.internal.BaseLinearWavyProgressNode
    protected void invalidateDrawCache() {
        this.cacheDrawNodeDelegate.invalidateDrawCache();
    }

    public final void setAmplitude(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (this.amplitude == f2) {
            return;
        }
        this.amplitude = f2;
        invalidateDrawCache();
    }

    public final void setFirstLineHeadProgress(a<Float> aVar) {
        this.firstLineHeadProgress = aVar;
    }

    public final void setFirstLineTailProgress(a<Float> aVar) {
        this.firstLineTailProgress = aVar;
    }

    public final void setSecondLineHeadProgress(a<Float> aVar) {
        this.secondLineHeadProgress = aVar;
    }

    public final void setSecondLineTailProgress(a<Float> aVar) {
        this.secondLineTailProgress = aVar;
    }

    public /* synthetic */ IndeterminateLinearWavyProgressNode(a aVar, a aVar2, a aVar3, a aVar4, float f2, long j2, long j3, Stroke stroke, Stroke stroke2, float f3, float f4, float f5, o oVar) {
        this(aVar, aVar2, aVar3, aVar4, f2, j2, j3, stroke, stroke2, f3, f4, f5);
    }
}
