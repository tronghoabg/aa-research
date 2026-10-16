package androidx.compose.material3.internal;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AnimatedShapeState {
    public static final int $stable = 0;
    private Animatable<Float, AnimationVector1D> bottomEnd;
    private Animatable<Float, AnimationVector1D> bottomStart;
    private final RoundedCornerShape shape;
    private final FiniteAnimationSpec<Float> spec;
    private Animatable<Float, AnimationVector1D> topEnd;
    private Animatable<Float, AnimationVector1D> topStart;
    private long size = Size.Companion.m8058getZeroNHjbRc();
    private Density density = DensityKt.Density(0.0f, 0.0f);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<? super br>, Object> {
        final /* synthetic */ CornerBasedShape $shape;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2$1, reason: invalid class name */
        final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
            final /* synthetic */ CornerBasedShape $shape;
            int label;
            final /* synthetic */ AnimatedShapeState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AnimatedShapeState animatedShapeState, CornerBasedShape cornerBasedShape, e<? super AnonymousClass1> eVar) {
                super(2, eVar);
                this.this$0 = animatedShapeState;
                this.$shape = cornerBasedShape;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new AnonymousClass1(this.this$0, this.$shape, eVar);
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
                    Animatable animatable = this.this$0.topStart;
                    if (animatable != null) {
                        CornerBasedShape cornerBasedShape = this.$shape;
                        AnimatedShapeState animatedShapeState = this.this$0;
                        this.label = 1;
                        obj = Animatable.animateTo$default(animatable, new Float(cornerBasedShape.getTopStart().mo3077toPxTmRCtEA(animatedShapeState.m6198getSizeNHjbRc(), animatedShapeState.getDensity())), this.this$0.getSpec(), null, null, this, 12, null);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    return ab.f48028a;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
                return ab.f48028a;
            }
        }

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2$2, reason: invalid class name and collision with other inner class name */
        final class C00782 extends g implements p<af, e<? super ab>, Object> {
            final /* synthetic */ CornerBasedShape $shape;
            int label;
            final /* synthetic */ AnimatedShapeState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00782(AnimatedShapeState animatedShapeState, CornerBasedShape cornerBasedShape, e<? super C00782> eVar) {
                super(2, eVar);
                this.this$0 = animatedShapeState;
                this.$shape = cornerBasedShape;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new C00782(this.this$0, this.$shape, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((C00782) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    c.b(obj);
                    Animatable animatable = this.this$0.topEnd;
                    if (animatable != null) {
                        CornerBasedShape cornerBasedShape = this.$shape;
                        AnimatedShapeState animatedShapeState = this.this$0;
                        this.label = 1;
                        obj = Animatable.animateTo$default(animatable, new Float(cornerBasedShape.getTopEnd().mo3077toPxTmRCtEA(animatedShapeState.m6198getSizeNHjbRc(), animatedShapeState.getDensity())), this.this$0.getSpec(), null, null, this, 12, null);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    return ab.f48028a;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
                return ab.f48028a;
            }
        }

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2$3, reason: invalid class name */
        final class AnonymousClass3 extends g implements p<af, e<? super ab>, Object> {
            final /* synthetic */ CornerBasedShape $shape;
            int label;
            final /* synthetic */ AnimatedShapeState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(AnimatedShapeState animatedShapeState, CornerBasedShape cornerBasedShape, e<? super AnonymousClass3> eVar) {
                super(2, eVar);
                this.this$0 = animatedShapeState;
                this.$shape = cornerBasedShape;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new AnonymousClass3(this.this$0, this.$shape, eVar);
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
                    Animatable animatable = this.this$0.bottomStart;
                    if (animatable != null) {
                        CornerBasedShape cornerBasedShape = this.$shape;
                        AnimatedShapeState animatedShapeState = this.this$0;
                        this.label = 1;
                        obj = Animatable.animateTo$default(animatable, new Float(cornerBasedShape.getBottomStart().mo3077toPxTmRCtEA(animatedShapeState.m6198getSizeNHjbRc(), animatedShapeState.getDensity())), this.this$0.getSpec(), null, null, this, 12, null);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    return ab.f48028a;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
                return ab.f48028a;
            }
        }

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.material3.internal.AnimatedShapeState$animateToShape$2$4, reason: invalid class name */
        final class AnonymousClass4 extends g implements p<af, e<? super ab>, Object> {
            final /* synthetic */ CornerBasedShape $shape;
            int label;
            final /* synthetic */ AnimatedShapeState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(AnimatedShapeState animatedShapeState, CornerBasedShape cornerBasedShape, e<? super AnonymousClass4> eVar) {
                super(2, eVar);
                this.this$0 = animatedShapeState;
                this.$shape = cornerBasedShape;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new AnonymousClass4(this.this$0, this.$shape, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((AnonymousClass4) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    c.b(obj);
                    Animatable animatable = this.this$0.bottomEnd;
                    if (animatable != null) {
                        CornerBasedShape cornerBasedShape = this.$shape;
                        AnimatedShapeState animatedShapeState = this.this$0;
                        this.label = 1;
                        obj = Animatable.animateTo$default(animatable, new Float(cornerBasedShape.getBottomEnd().mo3077toPxTmRCtEA(animatedShapeState.m6198getSizeNHjbRc(), animatedShapeState.getDensity())), this.this$0.getSpec(), null, null, this, 12, null);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    return ab.f48028a;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
                return ab.f48028a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(CornerBasedShape cornerBasedShape, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$shape = cornerBasedShape;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = AnimatedShapeState.this.new AnonymousClass2(this.$shape, eVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super br> eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            af afVar = (af) this.L$0;
            aj.z(afVar, null, null, new AnonymousClass1(AnimatedShapeState.this, this.$shape, null), 3);
            aj.z(afVar, null, null, new C00782(AnimatedShapeState.this, this.$shape, null), 3);
            aj.z(afVar, null, null, new AnonymousClass3(AnimatedShapeState.this, this.$shape, null), 3);
            return aj.z(afVar, null, null, new AnonymousClass4(AnimatedShapeState.this, this.$shape, null), 3);
        }
    }

    public AnimatedShapeState(RoundedCornerShape roundedCornerShape, FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.shape = roundedCornerShape;
        this.spec = finiteAnimationSpec;
    }

    /* renamed from: bottomEnd-TmRCtEA$default, reason: not valid java name */
    public static /* synthetic */ float m6192bottomEndTmRCtEA$default(AnimatedShapeState animatedShapeState, long j2, Density density, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = animatedShapeState.size;
        }
        if ((i2 & 2) != 0) {
            density = animatedShapeState.density;
        }
        return animatedShapeState.m6196bottomEndTmRCtEA(j2, density);
    }

    /* renamed from: bottomStart-TmRCtEA$default, reason: not valid java name */
    public static /* synthetic */ float m6193bottomStartTmRCtEA$default(AnimatedShapeState animatedShapeState, long j2, Density density, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = animatedShapeState.size;
        }
        if ((i2 & 2) != 0) {
            density = animatedShapeState.density;
        }
        return animatedShapeState.m6197bottomStartTmRCtEA(j2, density);
    }

    /* renamed from: topEnd-TmRCtEA$default, reason: not valid java name */
    public static /* synthetic */ float m6194topEndTmRCtEA$default(AnimatedShapeState animatedShapeState, long j2, Density density, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = animatedShapeState.size;
        }
        if ((i2 & 2) != 0) {
            density = animatedShapeState.density;
        }
        return animatedShapeState.m6200topEndTmRCtEA(j2, density);
    }

    /* renamed from: topStart-TmRCtEA$default, reason: not valid java name */
    public static /* synthetic */ float m6195topStartTmRCtEA$default(AnimatedShapeState animatedShapeState, long j2, Density density, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = animatedShapeState.size;
        }
        if ((i2 & 2) != 0) {
            density = animatedShapeState.density;
        }
        return animatedShapeState.m6201topStartTmRCtEA(j2, density);
    }

    public final Object animateToShape(CornerBasedShape cornerBasedShape, e<? super br> eVar) {
        return aj.d(new AnonymousClass2(cornerBasedShape, null), eVar);
    }

    /* renamed from: bottomEnd-TmRCtEA, reason: not valid java name */
    public final float m6196bottomEndTmRCtEA(long j2, Density density) {
        Animatable<Float, AnimationVector1D> animatableAnimatable$default = this.bottomEnd;
        if (animatableAnimatable$default == null) {
            animatableAnimatable$default = AnimatableKt.Animatable$default(this.shape.getBottomEnd().mo3077toPxTmRCtEA(j2, density), 0.0f, 2, null);
            this.bottomEnd = animatableAnimatable$default;
        }
        return animatableAnimatable$default.getValue().floatValue();
    }

    /* renamed from: bottomStart-TmRCtEA, reason: not valid java name */
    public final float m6197bottomStartTmRCtEA(long j2, Density density) {
        Animatable<Float, AnimationVector1D> animatableAnimatable$default = this.bottomStart;
        if (animatableAnimatable$default == null) {
            animatableAnimatable$default = AnimatableKt.Animatable$default(this.shape.getBottomStart().mo3077toPxTmRCtEA(j2, density), 0.0f, 2, null);
            this.bottomStart = animatableAnimatable$default;
        }
        return animatableAnimatable$default.getValue().floatValue();
    }

    public final Density getDensity() {
        return this.density;
    }

    public final RoundedCornerShape getShape() {
        return this.shape;
    }

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m6198getSizeNHjbRc() {
        return this.size;
    }

    public final FiniteAnimationSpec<Float> getSpec() {
        return this.spec;
    }

    public final void setDensity(Density density) {
        this.density = density;
    }

    /* renamed from: setSize-uvyYCjk, reason: not valid java name */
    public final void m6199setSizeuvyYCjk(long j2) {
        this.size = j2;
    }

    /* renamed from: topEnd-TmRCtEA, reason: not valid java name */
    public final float m6200topEndTmRCtEA(long j2, Density density) {
        Animatable<Float, AnimationVector1D> animatableAnimatable$default = this.topEnd;
        if (animatableAnimatable$default == null) {
            animatableAnimatable$default = AnimatableKt.Animatable$default(this.shape.getTopEnd().mo3077toPxTmRCtEA(j2, density), 0.0f, 2, null);
            this.topEnd = animatableAnimatable$default;
        }
        return animatableAnimatable$default.getValue().floatValue();
    }

    /* renamed from: topStart-TmRCtEA, reason: not valid java name */
    public final float m6201topStartTmRCtEA(long j2, Density density) {
        Animatable<Float, AnimationVector1D> animatableAnimatable$default = this.topStart;
        if (animatableAnimatable$default == null) {
            animatableAnimatable$default = AnimatableKt.Animatable$default(this.shape.getTopStart().mo3077toPxTmRCtEA(j2, density), 0.0f, 2, null);
            this.topStart = animatableAnimatable$default;
        }
        return animatableAnimatable$default.getValue().floatValue();
    }
}
