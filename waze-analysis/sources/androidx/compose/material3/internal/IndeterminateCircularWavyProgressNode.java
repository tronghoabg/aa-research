package androidx.compose.material3.internal;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.internal.IndeterminateCircularWavyProgressNode;
import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.unit.Dp;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.k.n;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class IndeterminateCircularWavyProgressNode extends BaseCircularWavyProgressNode {
    private Animatable<Float, AnimationVector1D> additionalRotationAnimatable;
    private float amplitude;
    private final CacheDrawModifierNode cacheDrawNode;
    private Animatable<Float, AnimationVector1D> globalRotationAnimatable;
    private br indeterminateAnimationsJob;
    private Animatable<Float, AnimationVector1D> progressSweepAnimatable;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.internal.IndeterminateCircularWavyProgressNode$startIndeterminateAnimations$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.material3.internal.IndeterminateCircularWavyProgressNode$startIndeterminateAnimations$1$1, reason: invalid class name and collision with other inner class name */
        final class C00851 extends g implements p<af, e<? super ab>, Object> {
            int label;
            final /* synthetic */ IndeterminateCircularWavyProgressNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00851(IndeterminateCircularWavyProgressNode indeterminateCircularWavyProgressNode, e<? super C00851> eVar) {
                super(2, eVar);
                this.this$0 = indeterminateCircularWavyProgressNode;
            }

            static final ab invokeSuspend$lambda$0(IndeterminateCircularWavyProgressNode indeterminateCircularWavyProgressNode, Animatable animatable) {
                DrawModifierNodeKt.invalidateDraw(indeterminateCircularWavyProgressNode.cacheDrawNode);
                return ab.f48028a;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new C00851(this.this$0, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((C00851) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    c.b(obj);
                    Animatable animatable = this.this$0.globalRotationAnimatable;
                    if (animatable != null) {
                        Float f2 = new Float(((Number) animatable.getValue()).floatValue() + 1080.0f);
                        InfiniteRepeatableSpec<Float> circularIndeterminateGlobalRotationAnimationSpec = ProgressIndicatorKt.getCircularIndeterminateGlobalRotationAnimationSpec();
                        final IndeterminateCircularWavyProgressNode indeterminateCircularWavyProgressNode = this.this$0;
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable, f2, circularIndeterminateGlobalRotationAnimationSpec, null, new l() { // from class: androidx.compose.material3.internal.IndeterminateCircularWavyProgressNode$startIndeterminateAnimations$1$1$$ExternalSyntheticLambda0
                            @Override // h.g.a.l
                            public final Object invoke(Object obj2) {
                                return IndeterminateCircularWavyProgressNode.AnonymousClass1.C00851.invokeSuspend$lambda$0(indeterminateCircularWavyProgressNode, (Animatable) obj2);
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

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.material3.internal.IndeterminateCircularWavyProgressNode$startIndeterminateAnimations$1$2, reason: invalid class name */
        final class AnonymousClass2 extends g implements p<af, e<? super ab>, Object> {
            int label;
            final /* synthetic */ IndeterminateCircularWavyProgressNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(IndeterminateCircularWavyProgressNode indeterminateCircularWavyProgressNode, e<? super AnonymousClass2> eVar) {
                super(2, eVar);
                this.this$0 = indeterminateCircularWavyProgressNode;
            }

            static final ab invokeSuspend$lambda$0(IndeterminateCircularWavyProgressNode indeterminateCircularWavyProgressNode, Animatable animatable) {
                DrawModifierNodeKt.invalidateDraw(indeterminateCircularWavyProgressNode.cacheDrawNode);
                return ab.f48028a;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new AnonymousClass2(this.this$0, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    c.b(obj);
                    Animatable animatable = this.this$0.additionalRotationAnimatable;
                    if (animatable != null) {
                        Float f2 = new Float(((Number) animatable.getValue()).floatValue() + 360.0f);
                        InfiniteRepeatableSpec<Float> circularIndeterminateRotationAnimationSpec = ProgressIndicatorKt.getCircularIndeterminateRotationAnimationSpec();
                        final IndeterminateCircularWavyProgressNode indeterminateCircularWavyProgressNode = this.this$0;
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable, f2, circularIndeterminateRotationAnimationSpec, null, new l() { // from class: androidx.compose.material3.internal.IndeterminateCircularWavyProgressNode$startIndeterminateAnimations$1$2$$ExternalSyntheticLambda0
                            @Override // h.g.a.l
                            public final Object invoke(Object obj2) {
                                return IndeterminateCircularWavyProgressNode.AnonymousClass1.AnonymousClass2.invokeSuspend$lambda$0(indeterminateCircularWavyProgressNode, (Animatable) obj2);
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

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.material3.internal.IndeterminateCircularWavyProgressNode$startIndeterminateAnimations$1$3, reason: invalid class name */
        final class AnonymousClass3 extends g implements p<af, e<? super ab>, Object> {
            int label;
            final /* synthetic */ IndeterminateCircularWavyProgressNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(IndeterminateCircularWavyProgressNode indeterminateCircularWavyProgressNode, e<? super AnonymousClass3> eVar) {
                super(2, eVar);
                this.this$0 = indeterminateCircularWavyProgressNode;
            }

            static final ab invokeSuspend$lambda$0(IndeterminateCircularWavyProgressNode indeterminateCircularWavyProgressNode, Animatable animatable) {
                DrawModifierNodeKt.invalidateDraw(indeterminateCircularWavyProgressNode.cacheDrawNode);
                return ab.f48028a;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new AnonymousClass3(this.this$0, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((AnonymousClass3) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    c.b(obj);
                    Animatable animatable = this.this$0.progressSweepAnimatable;
                    if (animatable != null) {
                        Float f2 = new Float(((Number) animatable.getValue()).floatValue() < 0.485f ? 0.87f : 0.1f);
                        InfiniteRepeatableSpec<Float> circularIndeterminateProgressAnimationSpec = ProgressIndicatorKt.getCircularIndeterminateProgressAnimationSpec();
                        final IndeterminateCircularWavyProgressNode indeterminateCircularWavyProgressNode = this.this$0;
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable, f2, circularIndeterminateProgressAnimationSpec, null, new l() { // from class: androidx.compose.material3.internal.IndeterminateCircularWavyProgressNode$startIndeterminateAnimations$1$3$$ExternalSyntheticLambda0
                            @Override // h.g.a.l
                            public final Object invoke(Object obj2) {
                                return IndeterminateCircularWavyProgressNode.AnonymousClass1.AnonymousClass3.invokeSuspend$lambda$0(indeterminateCircularWavyProgressNode, (Animatable) obj2);
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

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass1 anonymousClass1 = IndeterminateCircularWavyProgressNode.this.new AnonymousClass1(eVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            af afVar = (af) this.L$0;
            aj.z(afVar, null, null, new C00851(IndeterminateCircularWavyProgressNode.this, null), 3);
            aj.z(afVar, null, null, new AnonymousClass2(IndeterminateCircularWavyProgressNode.this, null), 3);
            aj.z(afVar, null, null, new AnonymousClass3(IndeterminateCircularWavyProgressNode.this, null), 3);
            return ab.f48028a;
        }
    }

    private IndeterminateCircularWavyProgressNode(long j2, long j3, Stroke stroke, Stroke stroke2, float f2, float f3, float f4, float f5) {
        super(j2, j3, stroke, stroke2, f2, f4, f5, null);
        this.amplitude = n.g(f3, 0.0f, 1.0f);
        CacheDrawModifierNode CacheDrawModifierNode = DrawModifierKt.CacheDrawModifierNode(new l() { // from class: androidx.compose.material3.internal.IndeterminateCircularWavyProgressNode$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return IndeterminateCircularWavyProgressNode.cacheDrawNode$lambda$0(this.f$0, (CacheDrawScope) obj);
            }
        });
        delegate(CacheDrawModifierNode);
        this.cacheDrawNode = CacheDrawModifierNode;
    }

    static final DrawResult cacheDrawNode$lambda$0(final IndeterminateCircularWavyProgressNode indeterminateCircularWavyProgressNode, CacheDrawScope cacheDrawScope) {
        boolean z;
        float f2;
        br offsetAnimationJob;
        final float fMo2127toPx0680j_4 = cacheDrawScope.mo2127toPx0680j_4(indeterminateCircularWavyProgressNode.m6211getWavelengthD9Ej5fM());
        final float fMo2127toPx0680j_42 = cacheDrawScope.mo2127toPx0680j_4(indeterminateCircularWavyProgressNode.m6208getGapSizeD9Ej5fM());
        final boolean z2 = Dp.m11163compareTo0680j_4(indeterminateCircularWavyProgressNode.m6210getWaveSpeedD9Ej5fM(), 0.0f) > 0 && indeterminateCircularWavyProgressNode.amplitude > 0.0f;
        CircularShapes circularShapes = indeterminateCircularWavyProgressNode.getCircularShapes();
        long jM7760getSizeNHjbRc = cacheDrawScope.m7760getSizeNHjbRc();
        float width = indeterminateCircularWavyProgressNode.getStroke().getWidth();
        float f3 = indeterminateCircularWavyProgressNode.amplitude;
        if (f3 <= 0.0f || f3 >= 1.0f) {
            z = false;
            f2 = width;
        } else {
            f2 = width;
            z = true;
        }
        circularShapes.m6244updateCqks5Fs(jM7760getSizeNHjbRc, fMo2127toPx0680j_4, f2, z);
        if (indeterminateCircularWavyProgressNode.getVertexCountForCurrentAnimation() != indeterminateCircularWavyProgressNode.getCircularShapes().getCurrentVertexCount().getIntValue()) {
            indeterminateCircularWavyProgressNode.setVertexCountForCurrentAnimation(n.h(indeterminateCircularWavyProgressNode.getCircularShapes().getCurrentVertexCount().getIntValue(), 5));
        }
        if (indeterminateCircularWavyProgressNode.amplitude > 0.0f && (indeterminateCircularWavyProgressNode.getOffsetAnimationJob() == null || ((offsetAnimationJob = indeterminateCircularWavyProgressNode.getOffsetAnimationJob()) != null && offsetAnimationJob.ca()))) {
            indeterminateCircularWavyProgressNode.startOffsetAnimation();
        }
        return cacheDrawScope.onDrawWithContent(new l() { // from class: androidx.compose.material3.internal.IndeterminateCircularWavyProgressNode$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return IndeterminateCircularWavyProgressNode.cacheDrawNode$lambda$0$0(this.f$0, z2, fMo2127toPx0680j_4, fMo2127toPx0680j_42, (ContentDrawScope) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab cacheDrawNode$lambda$0$0(IndeterminateCircularWavyProgressNode indeterminateCircularWavyProgressNode, boolean z, float f2, float f3, ContentDrawScope contentDrawScope) {
        Animatable<Float, AnimationVector1D> animatable = indeterminateCircularWavyProgressNode.globalRotationAnimatable;
        float fFloatValue = animatable != null ? animatable.getValue().floatValue() : 0.0f;
        Animatable<Float, AnimationVector1D> animatable2 = indeterminateCircularWavyProgressNode.additionalRotationAnimatable;
        float fFloatValue2 = animatable2 != null ? animatable2.getValue().floatValue() : 0.0f;
        Animatable<Float, AnimationVector1D> animatable3 = indeterminateCircularWavyProgressNode.progressSweepAnimatable;
        indeterminateCircularWavyProgressNode.getProgressDrawingCache().m6243updatePathsbLEYqPY(contentDrawScope.mo8751getSizeNHjbRc(), new IndeterminateCircularWavyProgressNode$cacheDrawNode$1$1$1(indeterminateCircularWavyProgressNode), new IndeterminateCircularWavyProgressNode$cacheDrawNode$1$1$2(indeterminateCircularWavyProgressNode), z, 0.0f, animatable3 != null ? animatable3.getValue().floatValue() : 0.1f, indeterminateCircularWavyProgressNode.amplitude, z ? indeterminateCircularWavyProgressNode.getWaveOffsetState().getFloatValue() : 0.0f, f2, f3, indeterminateCircularWavyProgressNode.getStroke(), indeterminateCircularWavyProgressNode.getTrackStroke());
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        DrawContext drawContext = contentDrawScope2.getDrawContext();
        long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform.CC.m8897rotateUv8p0NA$default(drawContext.getTransform(), fFloatValue + fFloatValue2 + 90.0f, 0L, 2, null);
            CircularWavyProgressModifiersKt.m6248drawCircularIndicatorRIQooxk(contentDrawScope2, indeterminateCircularWavyProgressNode.m6207getColor0d7_KjU(), indeterminateCircularWavyProgressNode.m6209getTrackColor0d7_KjU(), indeterminateCircularWavyProgressNode.getStroke(), indeterminateCircularWavyProgressNode.getTrackStroke(), indeterminateCircularWavyProgressNode.getProgressDrawingCache());
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
            return ab.f48028a;
        } catch (Throwable th) {
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
            throw th;
        }
    }

    private final void startIndeterminateAnimations() {
        br brVar = this.indeterminateAnimationsJob;
        if (brVar != null) {
            brVar.s(null);
        }
        if (isAttached() && aj.j(getCoroutineScope())) {
            Animatable<Float, AnimationVector1D> animatableAnimatable$default = this.globalRotationAnimatable;
            if (animatableAnimatable$default == null) {
                animatableAnimatable$default = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
            }
            this.globalRotationAnimatable = animatableAnimatable$default;
            Animatable<Float, AnimationVector1D> animatableAnimatable$default2 = this.additionalRotationAnimatable;
            if (animatableAnimatable$default2 == null) {
                animatableAnimatable$default2 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
            }
            this.additionalRotationAnimatable = animatableAnimatable$default2;
            Animatable<Float, AnimationVector1D> animatableAnimatable$default3 = this.progressSweepAnimatable;
            if (animatableAnimatable$default3 == null) {
                animatableAnimatable$default3 = AnimatableKt.Animatable$default(0.1f, 0.0f, 2, null);
            }
            this.progressSweepAnimatable = animatableAnimatable$default3;
            this.indeterminateAnimationsJob = aj.z(getCoroutineScope(), null, null, new AnonymousClass1(null), 3);
        }
    }

    public final float getAmplitude() {
        return this.amplitude;
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
        return this.amplitude > 0.0f;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        startIndeterminateAnimations();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.globalRotationAnimatable = null;
        this.additionalRotationAnimatable = null;
        this.progressSweepAnimatable = null;
        setVertexCountForCurrentAnimation(-1);
    }

    public final void setAmplitude(float f2) {
        float fG = n.g(f2, 0.0f, 1.0f);
        float f3 = this.amplitude;
        if (f3 == fG) {
            return;
        }
        this.amplitude = fG;
        if (fG > 0.0f && f3 == 0.0f) {
            startOffsetAnimation();
        } else if (fG == 0.0f) {
            stopOffsetAnimation();
        }
        this.cacheDrawNode.invalidateDrawCache();
    }

    public /* synthetic */ IndeterminateCircularWavyProgressNode(long j2, long j3, Stroke stroke, Stroke stroke2, float f2, float f3, float f4, float f5, o oVar) {
        this(j2, j3, stroke, stroke2, f2, f3, f4, f5);
    }
}
