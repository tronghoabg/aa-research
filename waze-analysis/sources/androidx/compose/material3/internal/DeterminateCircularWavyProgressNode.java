package androidx.compose.material3.internal;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.unit.Dp;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import h.k.n;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class DeterminateCircularWavyProgressNode extends BaseCircularWavyProgressNode {
    private l<? super Float, Float> amplitude;
    private Animatable<Float, AnimationVector1D> amplitudeAnimatable;
    private br amplitudeAnimationJob;
    private final MutableFloatState amplitudeState;
    private final CacheDrawModifierNode cacheDrawNode;
    private a<Float> progress;

    private DeterminateCircularWavyProgressNode(a<Float> aVar, l<? super Float, Float> lVar, long j2, long j3, Stroke stroke, Stroke stroke2, float f2, float f3, float f4) {
        super(j2, j3, stroke, stroke2, f2, f3, f4, null);
        this.progress = aVar;
        this.amplitude = lVar;
        this.amplitudeState = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        CacheDrawModifierNode CacheDrawModifierNode = DrawModifierKt.CacheDrawModifierNode(new l() { // from class: androidx.compose.material3.internal.DeterminateCircularWavyProgressNode$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return DeterminateCircularWavyProgressNode.cacheDrawNode$lambda$0(this.f$0, (CacheDrawScope) obj);
            }
        });
        delegate(CacheDrawModifierNode);
        this.cacheDrawNode = CacheDrawModifierNode;
    }

    static final DrawResult cacheDrawNode$lambda$0(final DeterminateCircularWavyProgressNode determinateCircularWavyProgressNode, CacheDrawScope cacheDrawScope) {
        br offsetAnimationJob;
        br brVar;
        float fFloatValue = determinateCircularWavyProgressNode.progress.invoke().floatValue();
        if (fFloatValue < 0.0f) {
            fFloatValue = 0.0f;
        }
        final float fMo2127toPx0680j_4 = cacheDrawScope.mo2127toPx0680j_4(determinateCircularWavyProgressNode.m6208getGapSizeD9Ej5fM());
        final float fMo2127toPx0680j_42 = cacheDrawScope.mo2127toPx0680j_4(determinateCircularWavyProgressNode.m6211getWavelengthD9Ej5fM());
        int iM11163compareTo0680j_4 = Dp.m11163compareTo0680j_4(determinateCircularWavyProgressNode.m6210getWaveSpeedD9Ej5fM(), 0.0f);
        if (fFloatValue > 1.0f) {
            fFloatValue = 1.0f;
        }
        float fFloatValue2 = determinateCircularWavyProgressNode.amplitude.invoke(Float.valueOf(fFloatValue)).floatValue();
        if (fFloatValue2 < 0.0f) {
            fFloatValue2 = 0.0f;
        }
        Animatable<Float, AnimationVector1D> animatable = determinateCircularWavyProgressNode.amplitudeAnimatable;
        float f2 = fFloatValue2 > 1.0f ? 1.0f : fFloatValue2;
        if (animatable == null) {
            determinateCircularWavyProgressNode.amplitudeAnimatable = AnimatableKt.Animatable$default(f2, 0.0f, 2, null);
            determinateCircularWavyProgressNode.amplitudeState.setFloatValue(f2);
        }
        if (determinateCircularWavyProgressNode.isAttached()) {
            Animatable<Float, AnimationVector1D> animatable2 = determinateCircularWavyProgressNode.amplitudeAnimatable;
            x.c(animatable2);
            if (animatable2.getTargetValue().floatValue() != f2 && ((brVar = determinateCircularWavyProgressNode.amplitudeAnimationJob) == null || brVar.ca())) {
                determinateCircularWavyProgressNode.amplitudeAnimationJob = aj.z(determinateCircularWavyProgressNode.getCoroutineScope(), null, null, new DeterminateCircularWavyProgressNode$cacheDrawNode$1$2(determinateCircularWavyProgressNode, f2, null), 3);
            }
        }
        determinateCircularWavyProgressNode.getCircularShapes().m6244updateCqks5Fs(cacheDrawScope.m7760getSizeNHjbRc(), fMo2127toPx0680j_42, determinateCircularWavyProgressNode.getStroke().getWidth(), determinateCircularWavyProgressNode.amplitudeAnimationJob != null);
        if (determinateCircularWavyProgressNode.getVertexCountForCurrentAnimation() != determinateCircularWavyProgressNode.getCircularShapes().getCurrentVertexCount().getIntValue()) {
            determinateCircularWavyProgressNode.setVertexCountForCurrentAnimation(n.h(determinateCircularWavyProgressNode.getCircularShapes().getCurrentVertexCount().getIntValue(), 5));
        }
        if (f2 > 0.0f && (determinateCircularWavyProgressNode.getOffsetAnimationJob() == null || ((offsetAnimationJob = determinateCircularWavyProgressNode.getOffsetAnimationJob()) != null && offsetAnimationJob.ca()))) {
            determinateCircularWavyProgressNode.startOffsetAnimation();
        }
        final boolean z = iM11163compareTo0680j_4 > 0;
        final float f3 = fFloatValue;
        return cacheDrawScope.onDrawWithContent(new l() { // from class: androidx.compose.material3.internal.DeterminateCircularWavyProgressNode$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return DeterminateCircularWavyProgressNode.cacheDrawNode$lambda$0$1(this.f$0, z, f3, fMo2127toPx0680j_42, fMo2127toPx0680j_4, (ContentDrawScope) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab cacheDrawNode$lambda$0$1(DeterminateCircularWavyProgressNode determinateCircularWavyProgressNode, boolean z, float f2, float f3, float f4, ContentDrawScope contentDrawScope) {
        float floatValue = determinateCircularWavyProgressNode.amplitudeState.getFloatValue();
        CircularProgressDrawingCache progressDrawingCache = determinateCircularWavyProgressNode.getProgressDrawingCache();
        long j2 = contentDrawScope.mo8751getSizeNHjbRc();
        DeterminateCircularWavyProgressNode$cacheDrawNode$1$3$1 determinateCircularWavyProgressNode$cacheDrawNode$1$3$1 = new DeterminateCircularWavyProgressNode$cacheDrawNode$1$3$1(determinateCircularWavyProgressNode);
        DeterminateCircularWavyProgressNode$cacheDrawNode$1$3$2 determinateCircularWavyProgressNode$cacheDrawNode$1$3$2 = new DeterminateCircularWavyProgressNode$cacheDrawNode$1$3$2(determinateCircularWavyProgressNode);
        float floatValue2 = 0.0f;
        if (floatValue > 0.0f && z) {
            floatValue2 = determinateCircularWavyProgressNode.getWaveOffsetState().getFloatValue();
        }
        progressDrawingCache.m6243updatePathsbLEYqPY(j2, determinateCircularWavyProgressNode$cacheDrawNode$1$3$1, determinateCircularWavyProgressNode$cacheDrawNode$1$3$2, z, 0.0f, f2, floatValue, floatValue2, f3, f4, determinateCircularWavyProgressNode.getStroke(), determinateCircularWavyProgressNode.getTrackStroke());
        CircularWavyProgressModifiersKt.m6248drawCircularIndicatorRIQooxk(contentDrawScope, determinateCircularWavyProgressNode.m6207getColor0d7_KjU(), determinateCircularWavyProgressNode.m6209getTrackColor0d7_KjU(), determinateCircularWavyProgressNode.getStroke(), determinateCircularWavyProgressNode.getTrackStroke(), determinateCircularWavyProgressNode.getProgressDrawingCache());
        return ab.f48028a;
    }

    public final l<Float, Float> getAmplitude() {
        return this.amplitude;
    }

    public final CacheDrawModifierNode getCacheDrawNode() {
        return this.cacheDrawNode;
    }

    public final a<Float> getProgress() {
        return this.progress;
    }

    @Override // androidx.compose.material3.internal.BaseCircularWavyProgressNode
    protected void invalidateDraw() {
        DrawModifierNodeKt.invalidateDraw(this.cacheDrawNode);
    }

    @Override // androidx.compose.material3.internal.BaseCircularWavyProgressNode
    protected void invalidateDrawCache() {
        this.cacheDrawNode.invalidateDrawCache();
    }

    @Override // androidx.compose.material3.internal.BaseCircularWavyProgressNode
    protected boolean isDrawingWave() {
        return this.amplitudeState.getFloatValue() > 0.0f;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.amplitudeAnimatable = null;
        setVertexCountForCurrentAnimation(-1);
    }

    public final void setAmplitude(l<? super Float, Float> lVar) {
        this.amplitude = lVar;
    }

    public final void setProgress(a<Float> aVar) {
        this.progress = aVar;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
    }

    public /* synthetic */ DeterminateCircularWavyProgressNode(a aVar, l lVar, long j2, long j3, Stroke stroke, Stroke stroke2, float f2, float f3, float f4, o oVar) {
        this(aVar, lVar, j2, j3, stroke, stroke2, f2, f3, f4);
    }
}
