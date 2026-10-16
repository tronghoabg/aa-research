package androidx.compose.material3.internal;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.material3.internal.BaseCircularWavyProgressNode;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.unit.Dp;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import h.k.n;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
abstract class BaseCircularWavyProgressNode extends DelegatingNode {
    private final CircularShapes circularShapes;
    private long color;
    private float gapSize;
    private Animatable<Float, AnimationVector1D> offsetAnimatable;
    private br offsetAnimationJob;
    private final CircularProgressDrawingCache progressDrawingCache;
    private Stroke stroke;
    private long trackColor;
    private Stroke trackStroke;
    private int vertexCountForCurrentAnimation;
    private final MutableFloatState waveOffsetState;
    private float waveSpeed;
    private float wavelength;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.internal.BaseCircularWavyProgressNode$startOffsetAnimation$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ int $durationMillis;
        final /* synthetic */ float $startOffset;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(float f2, int i2, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$startOffset = f2;
            this.$durationMillis = i2;
        }

        static final ab invokeSuspend$lambda$0(BaseCircularWavyProgressNode baseCircularWavyProgressNode, Animatable animatable) {
            baseCircularWavyProgressNode.getWaveOffsetState().setFloatValue(((Number) animatable.getValue()).floatValue() % 1.0f);
            return ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return BaseCircularWavyProgressNode.this.new AnonymousClass1(this.$startOffset, this.$durationMillis, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                Animatable<Float, AnimationVector1D> offsetAnimatable = BaseCircularWavyProgressNode.this.getOffsetAnimatable();
                if (offsetAnimatable != null) {
                    offsetAnimatable.updateBounds(new Float(this.$startOffset), new Float(this.$startOffset + 1.0f));
                    Float f2 = new Float(this.$startOffset + 1.0f);
                    InfiniteRepeatableSpec infiniteRepeatableSpecM1878infiniteRepeatable9IiC70o$default = AnimationSpecKt.m1878infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(this.$durationMillis, 0, EasingKt.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null);
                    final BaseCircularWavyProgressNode baseCircularWavyProgressNode = BaseCircularWavyProgressNode.this;
                    this.label = 1;
                    if (Animatable.animateTo$default(offsetAnimatable, f2, infiniteRepeatableSpecM1878infiniteRepeatable9IiC70o$default, null, new l() { // from class: androidx.compose.material3.internal.BaseCircularWavyProgressNode$startOffsetAnimation$1$$ExternalSyntheticLambda0
                        @Override // h.g.a.l
                        public final Object invoke(Object obj2) {
                            return BaseCircularWavyProgressNode.AnonymousClass1.invokeSuspend$lambda$0(baseCircularWavyProgressNode, (Animatable) obj2);
                        }
                    }, this, 4, null) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    private BaseCircularWavyProgressNode(long j2, long j3, Stroke stroke, Stroke stroke2, float f2, float f3, float f4) {
        this.color = j2;
        this.trackColor = j3;
        this.stroke = stroke;
        this.trackStroke = stroke2;
        this.gapSize = f2;
        this.wavelength = f3;
        this.waveSpeed = f4;
        this.circularShapes = new CircularShapes();
        this.progressDrawingCache = new CircularProgressDrawingCache();
        this.waveOffsetState = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.vertexCountForCurrentAnimation = -1;
    }

    protected final CircularShapes getCircularShapes() {
        return this.circularShapes;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m6207getColor0d7_KjU() {
        return this.color;
    }

    /* renamed from: getGapSize-D9Ej5fM, reason: not valid java name */
    public final float m6208getGapSizeD9Ej5fM() {
        return this.gapSize;
    }

    protected final Animatable<Float, AnimationVector1D> getOffsetAnimatable() {
        return this.offsetAnimatable;
    }

    protected final br getOffsetAnimationJob() {
        return this.offsetAnimationJob;
    }

    protected final CircularProgressDrawingCache getProgressDrawingCache() {
        return this.progressDrawingCache;
    }

    public final Stroke getStroke() {
        return this.stroke;
    }

    /* renamed from: getTrackColor-0d7_KjU, reason: not valid java name */
    public final long m6209getTrackColor0d7_KjU() {
        return this.trackColor;
    }

    public final Stroke getTrackStroke() {
        return this.trackStroke;
    }

    protected final int getVertexCountForCurrentAnimation() {
        return this.vertexCountForCurrentAnimation;
    }

    protected final MutableFloatState getWaveOffsetState() {
        return this.waveOffsetState;
    }

    /* renamed from: getWaveSpeed-D9Ej5fM, reason: not valid java name */
    public final float m6210getWaveSpeedD9Ej5fM() {
        return this.waveSpeed;
    }

    /* renamed from: getWavelength-D9Ej5fM, reason: not valid java name */
    public final float m6211getWavelengthD9Ej5fM() {
        return this.wavelength;
    }

    protected abstract void invalidateDraw();

    protected abstract void invalidateDrawCache();

    protected abstract boolean isDrawingWave();

    /* renamed from: progressPathProvider-wzdHmys, reason: not valid java name */
    protected final Path m6212progressPathProviderwzdHmys(float f2, float f3, float f4, long j2, boolean z, Path path) {
        CircularShapes.getProgressPath$default(this.circularShapes, f2, path, z, 0.0f, 0.0f, 24, null);
        return path;
    }

    /* renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m6213setColor8_81llA(long j2) {
        if (Color.m8229equalsimpl0(this.color, j2)) {
            return;
        }
        this.color = j2;
        invalidateDraw();
    }

    /* renamed from: setGapSize-0680j_4, reason: not valid java name */
    public final void m6214setGapSize0680j_4(float f2) {
        if (Dp.m11169equalsimpl0(this.gapSize, f2)) {
            return;
        }
        this.gapSize = f2;
        invalidateDrawCache();
    }

    protected final void setOffsetAnimatable(Animatable<Float, AnimationVector1D> animatable) {
        this.offsetAnimatable = animatable;
    }

    protected final void setOffsetAnimationJob(br brVar) {
        this.offsetAnimationJob = brVar;
    }

    public final void setStroke(Stroke stroke) {
        if (x.n(this.stroke, stroke)) {
            return;
        }
        this.stroke = stroke;
        invalidateDrawCache();
    }

    /* renamed from: setTrackColor-8_81llA, reason: not valid java name */
    public final void m6215setTrackColor8_81llA(long j2) {
        if (Color.m8229equalsimpl0(this.trackColor, j2)) {
            return;
        }
        this.trackColor = j2;
        invalidateDraw();
    }

    public final void setTrackStroke(Stroke stroke) {
        if (x.n(this.trackStroke, stroke)) {
            return;
        }
        this.trackStroke = stroke;
        invalidateDrawCache();
    }

    protected final void setVertexCountForCurrentAnimation(int i2) {
        this.vertexCountForCurrentAnimation = i2;
    }

    /* renamed from: setWaveSpeed-0680j_4, reason: not valid java name */
    public final void m6216setWaveSpeed0680j_4(float f2) {
        if (Dp.m11169equalsimpl0(this.waveSpeed, f2)) {
            return;
        }
        this.waveSpeed = f2;
        startOffsetAnimation();
    }

    /* renamed from: setWavelength-0680j_4, reason: not valid java name */
    public final void m6217setWavelength0680j_4(float f2) {
        if (Dp.m11169equalsimpl0(this.wavelength, f2)) {
            return;
        }
        this.wavelength = f2;
        startOffsetAnimation();
    }

    protected final void startOffsetAnimation() {
        int i2;
        stopOffsetAnimation();
        if (isAttached() && aj.j(getCoroutineScope()) && isDrawingWave()) {
            if (Dp.m11163compareTo0680j_4(this.waveSpeed, 0.0f) <= 0 || Dp.m11163compareTo0680j_4(this.wavelength, 0.0f) <= 0 || (i2 = this.vertexCountForCurrentAnimation) <= 0) {
                this.waveOffsetState.setFloatValue(0.0f);
                return;
            }
            int iH = n.h(Math.round((this.wavelength / this.waveSpeed) * 1000.0f * i2), 50);
            float floatValue = this.waveOffsetState.getFloatValue();
            this.offsetAnimatable = AnimatableKt.Animatable$default(floatValue, 0.0f, 2, null);
            this.offsetAnimationJob = aj.z(getCoroutineScope(), null, null, new AnonymousClass1(floatValue, iH, null), 3);
        }
    }

    protected final void stopOffsetAnimation() {
        br brVar = this.offsetAnimationJob;
        if (brVar != null) {
            brVar.s(null);
        }
        this.offsetAnimationJob = null;
        this.offsetAnimatable = null;
    }

    /* renamed from: trackPathProvider-yzxVdVo, reason: not valid java name */
    protected final Path m6218trackPathProvideryzxVdVo(float f2, float f3, float f4, long j2, Path path) {
        this.circularShapes.getTrackPath(path);
        return path;
    }

    public /* synthetic */ BaseCircularWavyProgressNode(long j2, long j3, Stroke stroke, Stroke stroke2, float f2, float f3, float f4, o oVar) {
        this(j2, j3, stroke, stroke2, f2, f3, f4);
    }
}
