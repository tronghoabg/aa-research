package androidx.compose.material3.internal;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.material3.WavyProgressIndicatorKt;
import androidx.compose.material3.internal.BaseLinearWavyProgressNode;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.ui.graphics.Color;
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
abstract class BaseLinearWavyProgressNode extends DelegatingNode {
    private Animatable<Float, AnimationVector1D> amplitudeAnimatable;
    private br amplitudeAnimationJob;
    private long color;
    private float gapSize;
    private br offsetAnimationJob;
    private final LinearProgressDrawingCache progressDrawingCache;
    private Stroke stroke;
    private long trackColor;
    private Stroke trackStroke;
    private final MutableFloatState waveOffset;
    private float waveSpeed;
    private float wavelength;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.internal.BaseLinearWavyProgressNode$updateAmplitudeAnimation$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ Animatable<Float, AnimationVector1D> $currentAmplitudeAnimatable;
        final /* synthetic */ float $targetAmplitudePx;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Animatable<Float, AnimationVector1D> animatable, float f2, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$currentAmplitudeAnimatable = animatable;
            this.$targetAmplitudePx = f2;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass1(this.$currentAmplitudeAnimatable, this.$targetAmplitudePx, eVar);
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
                Animatable<Float, AnimationVector1D> animatable = this.$currentAmplitudeAnimatable;
                Float f2 = new Float(this.$targetAmplitudePx);
                AnimationSpec<Float> increasingAmplitudeAnimationSpec = this.$currentAmplitudeAnimatable.getValue().floatValue() < this.$targetAmplitudePx ? WavyProgressIndicatorKt.getIncreasingAmplitudeAnimationSpec() : WavyProgressIndicatorKt.getDecreasingAmplitudeAnimationSpec();
                this.label = 1;
                if (Animatable.animateTo$default(animatable, f2, increasingAmplitudeAnimationSpec, null, null, this, 12, null) == aVar) {
                    return aVar;
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

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.internal.BaseLinearWavyProgressNode$updateOffsetAnimation$1, reason: invalid class name and case insensitive filesystem */
    final class C03531 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ int $durationMillis;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03531(int i2, e<? super C03531> eVar) {
            super(2, eVar);
            this.$durationMillis = i2;
        }

        static final ab invokeSuspend$lambda$0(BaseLinearWavyProgressNode baseLinearWavyProgressNode, Animatable animatable) {
            baseLinearWavyProgressNode.getWaveOffset().setFloatValue(((Number) animatable.getValue()).floatValue() % 1.0f);
            return ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return BaseLinearWavyProgressNode.this.new C03531(this.$durationMillis, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C03531) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                float floatValue = BaseLinearWavyProgressNode.this.getWaveOffset().getFloatValue();
                Animatable animatableAnimatable$default = AnimatableKt.Animatable$default(floatValue, 0.0f, 2, null);
                float f2 = 1.0f + floatValue;
                animatableAnimatable$default.updateBounds(new Float(floatValue), new Float(f2));
                Float f3 = new Float(f2);
                InfiniteRepeatableSpec infiniteRepeatableSpecM1878infiniteRepeatable9IiC70o$default = AnimationSpecKt.m1878infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(this.$durationMillis, 0, EasingKt.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null);
                final BaseLinearWavyProgressNode baseLinearWavyProgressNode = BaseLinearWavyProgressNode.this;
                this.label = 1;
                if (Animatable.animateTo$default(animatableAnimatable$default, f3, infiniteRepeatableSpecM1878infiniteRepeatable9IiC70o$default, null, new l() { // from class: androidx.compose.material3.internal.BaseLinearWavyProgressNode$updateOffsetAnimation$1$$ExternalSyntheticLambda0
                    @Override // h.g.a.l
                    public final Object invoke(Object obj2) {
                        return BaseLinearWavyProgressNode.C03531.invokeSuspend$lambda$0(baseLinearWavyProgressNode, (Animatable) obj2);
                    }
                }, this, 4, null) == aVar) {
                    return aVar;
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

    private BaseLinearWavyProgressNode(long j2, long j3, Stroke stroke, Stroke stroke2, float f2, float f3, float f4) {
        this.color = j2;
        this.trackColor = j3;
        this.stroke = stroke;
        this.trackStroke = stroke2;
        this.gapSize = f2;
        this.wavelength = f3;
        this.waveSpeed = f4;
        this.waveOffset = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.progressDrawingCache = new LinearProgressDrawingCache();
    }

    protected final Animatable<Float, AnimationVector1D> getAmplitudeAnimatable() {
        return this.amplitudeAnimatable;
    }

    protected final br getAmplitudeAnimationJob() {
        return this.amplitudeAnimationJob;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m6224getColor0d7_KjU() {
        return this.color;
    }

    /* renamed from: getGapSize-D9Ej5fM, reason: not valid java name */
    public final float m6225getGapSizeD9Ej5fM() {
        return this.gapSize;
    }

    protected final LinearProgressDrawingCache getProgressDrawingCache() {
        return this.progressDrawingCache;
    }

    protected abstract float[] getProgressFractions();

    public final Stroke getStroke() {
        return this.stroke;
    }

    /* renamed from: getTrackColor-0d7_KjU, reason: not valid java name */
    public final long m6226getTrackColor0d7_KjU() {
        return this.trackColor;
    }

    public final Stroke getTrackStroke() {
        return this.trackStroke;
    }

    protected final MutableFloatState getWaveOffset() {
        return this.waveOffset;
    }

    /* renamed from: getWaveSpeed-D9Ej5fM, reason: not valid java name */
    public final float m6227getWaveSpeedD9Ej5fM() {
        return this.waveSpeed;
    }

    /* renamed from: getWavelength-D9Ej5fM, reason: not valid java name */
    public final float m6228getWavelengthD9Ej5fM() {
        return this.wavelength;
    }

    protected abstract void invalidateDraw();

    protected abstract void invalidateDrawCache();

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateOffsetAnimation();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.amplitudeAnimatable = null;
    }

    protected final void setAmplitudeAnimatable(Animatable<Float, AnimationVector1D> animatable) {
        this.amplitudeAnimatable = animatable;
    }

    protected final void setAmplitudeAnimationJob(br brVar) {
        this.amplitudeAnimationJob = brVar;
    }

    /* renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m6229setColor8_81llA(long j2) {
        if (Color.m8229equalsimpl0(this.color, j2)) {
            return;
        }
        this.color = j2;
        invalidateDraw();
    }

    /* renamed from: setGapSize-0680j_4, reason: not valid java name */
    public final void m6230setGapSize0680j_4(float f2) {
        if (Dp.m11169equalsimpl0(this.gapSize, f2)) {
            return;
        }
        this.gapSize = f2;
        invalidateDrawCache();
    }

    public final void setStroke(Stroke stroke) {
        if (x.n(this.stroke, stroke)) {
            return;
        }
        this.stroke = stroke;
        invalidateDrawCache();
    }

    /* renamed from: setTrackColor-8_81llA, reason: not valid java name */
    public final void m6231setTrackColor8_81llA(long j2) {
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

    /* renamed from: setWaveSpeed-0680j_4, reason: not valid java name */
    public final void m6232setWaveSpeed0680j_4(float f2) {
        if (Dp.m11169equalsimpl0(this.waveSpeed, f2)) {
            return;
        }
        this.waveSpeed = f2;
        updateOffsetAnimation();
        invalidateDrawCache();
    }

    /* renamed from: setWavelength-0680j_4, reason: not valid java name */
    public final void m6233setWavelength0680j_4(float f2) {
        if (Dp.m11169equalsimpl0(this.wavelength, f2)) {
            return;
        }
        this.wavelength = f2;
        updateOffsetAnimation();
        invalidateDrawCache();
    }

    protected final void updateAmplitudeAnimation(float f2) {
        Animatable<Float, AnimationVector1D> animatableAnimatable$default = this.amplitudeAnimatable;
        if (animatableAnimatable$default == null) {
            animatableAnimatable$default = AnimatableKt.Animatable$default(f2, 0.0f, 2, null);
            this.amplitudeAnimatable = animatableAnimatable$default;
        }
        if (!isAttached() || animatableAnimatable$default.getTargetValue().floatValue() == f2) {
            return;
        }
        br brVar = this.amplitudeAnimationJob;
        if (brVar == null || brVar.ca()) {
            this.amplitudeAnimationJob = aj.z(getCoroutineScope(), null, null, new AnonymousClass1(animatableAnimatable$default, f2, null), 3);
        }
    }

    protected final void updateOffsetAnimation() {
        br brVar = this.offsetAnimationJob;
        if (brVar != null) {
            brVar.s(null);
        }
        this.offsetAnimationJob = null;
        if (isAttached()) {
            if (Dp.m11163compareTo0680j_4(this.waveSpeed, 0.0f) <= 0 || Dp.m11163compareTo0680j_4(this.wavelength, 0.0f) <= 0) {
                this.waveOffset.setFloatValue(0.0f);
            } else {
                this.offsetAnimationJob = aj.z(getCoroutineScope(), null, null, new C03531(n.h(Math.round((this.wavelength / this.waveSpeed) * 1000.0f), 50), null), 3);
            }
        }
    }

    public /* synthetic */ BaseLinearWavyProgressNode(long j2, long j3, Stroke stroke, Stroke stroke2, float f2, float f3, float f4, o oVar) {
        this(j2, j3, stroke, stroke2, f2, f3, f4);
    }
}
