package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.AnchoredDragScope;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.unit.Density;
import e.b.c;
import h.a.ac;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.a.r;
import h.g.b.an;
import h.g.b.aq;
import h.g.b.x;
import h.k.n;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AnchoredDraggableKt {
    private static final String ConfigurationMovedToModifier = "This constructor of AnchoredDraggableState has been deprecated. Please pass thresholds and animation specs to AnchoredDraggableDefaults.flingBehavior(..) instead, which can be passed to Modifier.anchoredDraggable.";
    private static final String ConfirmValueChangeDeprecated = "confirmValueChange is deprecated without replacement. Rather than relying on a callback to veto state changes, the anchor set should not include disallowed anchors. See androidx.compose.foundation.samples.AnchoredDraggableDynamicAnchorsSample for an example of using dynamic anchors over confirmValueChange.";
    private static final boolean DEBUG = false;
    private static final String SettleWithVelocityDeprecated = "settle does not accept a velocity anymore. Please use FlingBehavior#performFling instead. See AnchoredDraggableSample.kt for example usages.";
    private static final String StartDragImmediatelyDeprecated = "startDragImmediately has been removed without replacement. Modifier.anchoredDraggable sets startDragImmediately to true by default when animations are running.";

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1651a = 0;
    private static final l<PointerType, Boolean> AlwaysDrag = new l() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$$ExternalSyntheticLambda3
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            int i2 = AnchoredDraggableKt.f1651a;
            return true;
        }
    };
    private static final l<Integer, Float> GetOrNan = new l() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$$ExternalSyntheticLambda4
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            ((Integer) obj).intValue();
            int i2 = AnchoredDraggableKt.f1651a;
            return Float.valueOf(Float.NaN);
        }
    };
    private static final float AnchoredDraggableMinFlingVelocity = 125.0f;
    private static final DecayAnimationSpec<Float> NoOpDecayAnimationSpec = DecayAnimationSpecKt.generateDecayAnimationSpec(new FloatDecayAnimationSpec() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$NoOpDecayAnimationSpec$1
        private final float absVelocityThreshold;

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float getAbsVelocityThreshold() {
            return this.absVelocityThreshold;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public long getDurationNanos(float f2, float f3) {
            return 0L;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float getTargetValue(float f2, float f3) {
            return 0.0f;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float getValueFromNanos(long j2, float f2, float f3) {
            return 0.0f;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float getVelocityFromNanos(long j2, float f2, float f3) {
            return 0.0f;
        }
    });

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4, reason: invalid class name */
    final class AnonymousClass4 extends g implements r {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ AnchoredDraggableState $this_animateTo;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(AnchoredDraggableState anchoredDraggableState, AnimationSpec<Float> animationSpec, e<? super AnonymousClass4> eVar) {
            super(4, eVar);
            this.$this_animateTo = anchoredDraggableState;
            this.$animationSpec = animationSpec;
        }

        @Override // h.g.a.r
        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors draggableAnchors, Object obj, e<? super ab> eVar) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$this_animateTo, this.$animationSpec, eVar);
            anonymousClass4.L$0 = anchoredDragScope;
            anonymousClass4.L$1 = draggableAnchors;
            anonymousClass4.L$2 = obj;
            return anonymousClass4.invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
                DraggableAnchors draggableAnchors = (DraggableAnchors) this.L$1;
                Object obj2 = this.L$2;
                AnchoredDraggableState anchoredDraggableState = this.$this_animateTo;
                AnimationSpec<Float> animationSpec = this.$animationSpec;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (AnchoredDraggableKt.animateTo(anchoredDraggableState, anchoredDraggableState.getLastVelocity(), anchoredDragScope, draggableAnchors, obj2, animationSpec, this) == aVar) {
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
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1, reason: invalid class name and case insensitive filesystem */
    final class C02261<T> extends h.c.b.a.c {
        float F$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C02261(e<? super C02261> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AnchoredDraggableKt.animateToWithDecay(null, null, 0.0f, null, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements r {
        final /* synthetic */ DecayAnimationSpec<Float> $decayAnimationSpec;
        final /* synthetic */ an $remainingVelocity;
        final /* synthetic */ AnimationSpec<Float> $snapAnimationSpec;
        final /* synthetic */ AnchoredDraggableState $this_animateToWithDecay;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AnchoredDraggableState anchoredDraggableState, float f2, AnimationSpec<Float> animationSpec, an anVar, DecayAnimationSpec<Float> decayAnimationSpec, e<? super AnonymousClass2> eVar) {
            super(4, eVar);
            this.$this_animateToWithDecay = anchoredDraggableState;
            this.$velocity = f2;
            this.$snapAnimationSpec = animationSpec;
            this.$remainingVelocity = anVar;
            this.$decayAnimationSpec = decayAnimationSpec;
        }

        static final ab invokeSuspend$lambda$2(float f2, an anVar, AnchoredDragScope anchoredDragScope, an anVar2, AnimationScope animationScope) {
            if ((((Number) animationScope.getValue()).floatValue() >= f2 || anVar.f48102a <= f2) && (((Number) animationScope.getValue()).floatValue() <= f2 || anVar.f48102a >= f2)) {
                anchoredDragScope.dragTo(((Number) animationScope.getValue()).floatValue(), ((Number) animationScope.getVelocity()).floatValue());
                anVar2.f48102a = ((Number) animationScope.getVelocity()).floatValue();
                anVar.f48102a = ((Number) animationScope.getValue()).floatValue();
            } else {
                float fCoerceToTarget = AnchoredDraggableKt.coerceToTarget(((Number) animationScope.getValue()).floatValue(), f2);
                anchoredDragScope.dragTo(fCoerceToTarget, ((Number) animationScope.getVelocity()).floatValue());
                anVar2.f48102a = Float.isNaN(((Number) animationScope.getVelocity()).floatValue()) ? 0.0f : ((Number) animationScope.getVelocity()).floatValue();
                anVar.f48102a = fCoerceToTarget;
                animationScope.cancelAnimation();
            }
            return ab.f48028a;
        }

        @Override // h.g.a.r
        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors draggableAnchors, Object obj, e<? super ab> eVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_animateToWithDecay, this.$velocity, this.$snapAnimationSpec, this.$remainingVelocity, this.$decayAnimationSpec, eVar);
            anonymousClass2.L$0 = anchoredDragScope;
            anonymousClass2.L$1 = draggableAnchors;
            anonymousClass2.L$2 = obj;
            return anonymousClass2.invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00ba, code lost:
        
            if (androidx.compose.animation.core.SuspendAnimationKt.animateDecay$default(r24, r3, false, new androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2$$ExternalSyntheticLambda0(r2, r7, r9, r5), r31, 2, null) == r1) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00d2, code lost:
        
            if (androidx.compose.foundation.gestures.AnchoredDraggableKt.animateTo(r31.$this_animateToWithDecay, r8, r9, r10, r11, r31.$snapAnimationSpec, r31) != r1) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00eb, code lost:
        
            if (androidx.compose.foundation.gestures.AnchoredDraggableKt.animateTo(r31.$this_animateToWithDecay, r12, r9, r10, r11, r31.$snapAnimationSpec, r31) == r1) goto L41;
         */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r32) {
            /*
                Method dump skipped, instructions count: 245
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1, reason: invalid class name and case insensitive filesystem */
    final class C02271<I> extends h.c.b.a.c {
        int label;
        /* synthetic */ Object result;

        C02271(e<? super C02271> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AnchoredDraggableKt.restartable(null, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2, reason: invalid class name and case insensitive filesystem */
    final class C02282 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ p $block;
        final /* synthetic */ h.g.a.a $inputs;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1, reason: invalid class name */
        final class AnonymousClass1<T> implements kotlinx.coroutines.b.l {
            final /* synthetic */ af $$this$coroutineScope;
            final /* synthetic */ p $block;
            final /* synthetic */ aq<br> $previousDrag;

            /* compiled from: WazeSource */
            /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2, reason: invalid class name and collision with other inner class name */
            final class C00292 extends g implements p<af, e<? super ab>, Object> {
                final /* synthetic */ af $$this$coroutineScope;
                final /* synthetic */ p $block;
                final /* synthetic */ Object $latestInputs;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00292(p pVar, Object obj, af afVar, e<? super C00292> eVar) {
                    super(2, eVar);
                    this.$block = pVar;
                    this.$latestInputs = obj;
                    this.$$this$coroutineScope = afVar;
                }

                @Override // h.c.b.a.a
                public final e<ab> create(Object obj, e<?> eVar) {
                    return new C00292(this.$block, this.$latestInputs, this.$$this$coroutineScope, eVar);
                }

                @Override // h.g.a.p
                public final Object invoke(af afVar, e<? super ab> eVar) {
                    return ((C00292) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                }

                @Override // h.c.b.a.a
                public final Object invokeSuspend(Object obj) {
                    a aVar = a.f48038a;
                    int i2 = this.label;
                    if (i2 == 0) {
                        c.b(obj);
                        p pVar = this.$block;
                        Object obj2 = this.$latestInputs;
                        this.label = 1;
                        if (pVar.invoke(obj2, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c.b(obj);
                    }
                    aj.h(this.$$this$coroutineScope, new AnchoredDragFinishedSignal());
                    return ab.f48028a;
                }
            }

            AnonymousClass1(aq<br> aqVar, af afVar, p pVar) {
                this.$previousDrag = aqVar;
                this.$$this$coroutineScope = afVar;
                this.$block = pVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.b.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, h.c.e<? super h.ab> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r7
                    androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1
                    r0.<init>(r5, r7)
                L18:
                    java.lang.Object r7 = r0.result
                    h.c.a.a r1 = h.c.a.a.f48038a
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L35
                    if (r2 != r3) goto L2d
                    java.lang.Object r6 = r0.L$1
                    kotlinx.coroutines.br r6 = (kotlinx.coroutines.br) r6
                    java.lang.Object r6 = r0.L$0
                    e.b.c.b(r7)
                    goto L57
                L2d:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L35:
                    e.b.c.b(r7)
                    h.g.b.aq<kotlinx.coroutines.br> r7 = r5.$previousDrag
                    java.lang.Object r7 = r7.f48105a
                    kotlinx.coroutines.br r7 = (kotlinx.coroutines.br) r7
                    if (r7 == 0) goto L57
                    androidx.compose.foundation.gestures.AnchoredDragFinishedSignal r2 = new androidx.compose.foundation.gestures.AnchoredDragFinishedSignal
                    r2.<init>()
                    java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
                    r7.s(r2)
                    r0.L$0 = r6
                    r0.L$1 = r7
                    r0.label = r3
                    java.lang.Object r7 = r7.m(r0)
                    if (r7 != r1) goto L57
                    return r1
                L57:
                    h.g.b.aq<kotlinx.coroutines.br> r7 = r5.$previousDrag
                    kotlinx.coroutines.af r0 = r5.$$this$coroutineScope
                    h.g.a.p r5 = r5.$block
                    kotlinx.coroutines.ag r1 = kotlinx.coroutines.ag.f51345d
                    androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2 r2 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2
                    r4 = 0
                    r2.<init>(r5, r6, r0, r4)
                    h.g.a.p r2 = (h.g.a.p) r2
                    kotlinx.coroutines.br r5 = kotlinx.coroutines.aj.z(r0, r4, r1, r2, r3)
                    r7.f48105a = r5
                    h.ab r5 = h.ab.f48028a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.C02282.AnonymousClass1.emit(java.lang.Object, h.c.e):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02282(h.g.a.a aVar, p pVar, e<? super C02282> eVar) {
            super(2, eVar);
            this.$inputs = aVar;
            this.$block = pVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C02282 c02282 = new C02282(this.$inputs, this.$block, eVar);
            c02282.L$0 = obj;
            return c02282;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C02282) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                af afVar = (af) this.L$0;
                aq aqVar = new aq();
                h.g.a.a aVar2 = this.$inputs;
                p pVar = this.$block;
                this.label = 1;
                if (SnapshotStateKt.snapshotFlow(aVar2).collect(new AnonymousClass1(aqVar, afVar, pVar), this) == aVar) {
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
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2, reason: invalid class name and case insensitive filesystem */
    final class C02292 extends g implements r {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        C02292(e<? super C02292> eVar) {
            super(4, eVar);
        }

        @Override // h.g.a.r
        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors draggableAnchors, Object obj, e<? super ab> eVar) {
            C02292 c02292 = new C02292(eVar);
            c02292.L$0 = anchoredDragScope;
            c02292.L$1 = draggableAnchors;
            c02292.L$2 = obj;
            return c02292.invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
            float fPositionOf = ((DraggableAnchors) this.L$1).positionOf(this.L$2);
            if (!Float.isNaN(fPositionOf)) {
                AnchoredDragScope.CC.dragTo$default(anchoredDragScope, fPositionOf, 0.0f, 2, null);
            }
            return ab.f48028a;
        }
    }

    static final boolean AlwaysDrag$lambda$0(PointerType pointerType) {
        return true;
    }

    private static final <T> SnapLayoutInfoProvider AnchoredDraggableLayoutInfoProvider(final AnchoredDraggableState<T> anchoredDraggableState, final l<? super Float, Float> lVar, final h.g.a.a<Float> aVar) {
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt.AnchoredDraggableLayoutInfoProvider.1
            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(float f2, float f3) {
                return 0.0f;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapOffset(float f2) {
                l<Float, Float> lVar2 = lVar;
                h.g.a.a<Float> aVar2 = aVar;
                AnchoredDraggableState anchoredDraggableState2 = anchoredDraggableState;
                float fRequireOffset = anchoredDraggableState2.requireOffset();
                Object objComputeTarget = AnchoredDraggableKt.computeTarget(anchoredDraggableState2.getAnchors(), fRequireOffset, f2, lVar2, aVar2);
                if (!((Boolean) anchoredDraggableState.getConfirmValueChange$foundation().invoke(objComputeTarget)).booleanValue()) {
                    objComputeTarget = anchoredDraggableState.getSettledValue();
                }
                return anchoredDraggableState.getAnchors().positionOf(objComputeTarget) - fRequireOffset;
            }
        };
    }

    public static final <T> AnchoredDraggableState<T> AnchoredDraggableState(T t, DraggableAnchors<T> draggableAnchors, l<? super Float, Float> lVar, h.g.a.a<Float> aVar, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, l<? super T, Boolean> lVar2) {
        AnchoredDraggableState<T> anchoredDraggableState = new AnchoredDraggableState<>(t, draggableAnchors, lVar2);
        anchoredDraggableState.setPositionalThreshold$foundation(lVar);
        anchoredDraggableState.setVelocityThreshold$foundation(aVar);
        anchoredDraggableState.setSnapAnimationSpec$foundation(animationSpec);
        anchoredDraggableState.setDecayAnimationSpec$foundation(decayAnimationSpec);
        return anchoredDraggableState;
    }

    public static /* synthetic */ AnchoredDraggableState AnchoredDraggableState$default(Object obj, DraggableAnchors draggableAnchors, l lVar, h.g.a.a aVar, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, l lVar2, int i2, Object obj2) {
        if ((i2 & 64) != 0) {
            lVar2 = new l() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj3) {
                    int i3 = AnchoredDraggableKt.f1651a;
                    return true;
                }
            };
        }
        return AnchoredDraggableState(obj, draggableAnchors, lVar, aVar, animationSpec, decayAnimationSpec, lVar2);
    }

    static final boolean AnchoredDraggableState$lambda$0(Object obj) {
        return true;
    }

    static final boolean AnchoredDraggableState$lambda$2(Object obj) {
        return true;
    }

    public static final <T> DraggableAnchors<T> DraggableAnchors(l<? super DraggableAnchorsConfig<T>, ab> lVar) {
        DraggableAnchorsConfig draggableAnchorsConfig = new DraggableAnchorsConfig();
        lVar.invoke(draggableAnchorsConfig);
        return new DefaultDraggableAnchors(draggableAnchorsConfig.buildKeys$foundation(), draggableAnchorsConfig.buildPositions$foundation());
    }

    static final float GetOrNan$lambda$0(int i2) {
        return Float.NaN;
    }

    public static final <T> Modifier anchoredDraggable(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, boolean z, Orientation orientation, boolean z2, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior) {
        return modifier.then(new AnchoredDraggableElement(anchoredDraggableState, orientation, z2, Boolean.valueOf(z), mutableInteractionSource, null, overscrollEffect, flingBehavior, 32, null));
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, boolean z, Orientation orientation, boolean z2, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, boolean z3, FlingBehavior flingBehavior, int i2, Object obj) {
        FlingBehavior flingBehavior2;
        Modifier modifier2;
        AnchoredDraggableState anchoredDraggableState2;
        boolean z4;
        Orientation orientation2;
        boolean zIsAnimationRunning = (i2 & 64) != 0 ? anchoredDraggableState.isAnimationRunning() : z3;
        int i3 = i2 & 32;
        int i4 = i2 & 16;
        boolean z5 = !((i2 & 8) == 0);
        OverscrollEffect overscrollEffect2 = i3 != 0 ? null : overscrollEffect;
        MutableInteractionSource mutableInteractionSource2 = i4 != 0 ? null : mutableInteractionSource;
        boolean z6 = z5 | z2;
        if ((i2 & 128) != 0) {
            flingBehavior2 = null;
            modifier2 = modifier;
            anchoredDraggableState2 = anchoredDraggableState;
            orientation2 = orientation;
            z4 = z;
        } else {
            flingBehavior2 = flingBehavior;
            modifier2 = modifier;
            anchoredDraggableState2 = anchoredDraggableState;
            z4 = z;
            orientation2 = orientation;
        }
        return anchoredDraggable(modifier2, anchoredDraggableState2, z4, orientation2, z6, mutableInteractionSource2, overscrollEffect2, zIsAnimationRunning, flingBehavior2);
    }

    public static final <T> TargetedFlingBehavior anchoredDraggableFlingBehavior(AnchoredDraggableState<T> anchoredDraggableState, final Density density, l<? super Float, Float> lVar, AnimationSpec<Float> animationSpec) {
        return SnapFlingBehaviorKt.snapFlingBehavior(AnchoredDraggableLayoutInfoProvider(anchoredDraggableState, lVar, new h.g.a.a() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$$ExternalSyntheticLambda5
            @Override // h.g.a.a
            public final Object invoke() {
                return Float.valueOf(density.mo2127toPx0680j_4(125.0f));
            }
        }), NoOpDecayAnimationSpec, animationSpec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object animateTo(AnchoredDraggableState<T> anchoredDraggableState, float f2, final AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t, AnimationSpec<Float> animationSpec, e<? super ab> eVar) {
        Object objAnimate;
        float fPositionOf = draggableAnchors.positionOf(t);
        final an anVar = new an();
        anVar.f48102a = Float.isNaN(anchoredDraggableState.getOffset()) ? 0.0f : anchoredDraggableState.getOffset();
        if (!Float.isNaN(fPositionOf)) {
            float f3 = anVar.f48102a;
            if (f3 != fPositionOf && (objAnimate = SuspendAnimationKt.animate(f3, fPositionOf, f2, animationSpec, new p() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$$ExternalSyntheticLambda1
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return AnchoredDraggableKt.animateTo$lambda$0$1(anchoredDragScope, anVar, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                }
            }, eVar)) == a.f48038a) {
                return objAnimate;
            }
        }
        return ab.f48028a;
    }

    public static /* synthetic */ Object animateTo$default(AnchoredDraggableState anchoredDraggableState, Object obj, AnimationSpec animationSpec, e eVar, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            animationSpec = anchoredDraggableState.getUsePreModifierChangeBehavior$foundation() ? anchoredDraggableState.getSnapAnimationSpec() : AnchoredDraggableDefaults.INSTANCE.getSnapAnimationSpec();
        }
        return animateTo(anchoredDraggableState, obj, animationSpec, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab animateTo$lambda$0$1(AnchoredDragScope anchoredDragScope, an anVar, float f2, float f3) {
        anchoredDragScope.dragTo(f2, f3);
        anVar.f48102a = f2;
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object animateToWithDecay(androidx.compose.foundation.gestures.AnchoredDraggableState<T> r10, T r11, float r12, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r13, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> r14, h.c.e<? super java.lang.Float> r15) {
        /*
            boolean r1 = r15 instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt.C02261
            if (r1 == 0) goto L13
            r1 = r15
            androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1 r1 = (androidx.compose.foundation.gestures.AnchoredDraggableKt.C02261) r1
            int r3 = r1.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L13
            int r3 = r3 - r4
            r1.label = r3
            goto L18
        L13:
            androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1 r1 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1
            r1.<init>(r15)
        L18:
            r7 = r1
            java.lang.Object r0 = r7.result
            h.c.a.a r9 = h.c.a.a.f48038a
            int r1 = r7.label
            r8 = 1
            if (r1 == 0) goto L36
            if (r1 != r8) goto L2e
            float r1 = r7.F$0
            java.lang.Object r2 = r7.L$0
            h.g.b.an r2 = (h.g.b.an) r2
            e.b.c.b(r0)
            goto L63
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L36:
            e.b.c.b(r0)
            h.g.b.an r4 = new h.g.b.an
            r4.<init>()
            r4.f48102a = r12
            androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2
            r6 = 0
            r1 = r10
            r2 = r12
            r3 = r13
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r2 = r0
            r0 = r4
            r5 = r2
            h.g.a.r r5 = (h.g.a.r) r5
            r7.L$0 = r0
            r7.F$0 = r12
            r7.label = r8
            r6 = r7
            r7 = 2
            r8 = 0
            r4 = 0
            r2 = r10
            r3 = r11
            java.lang.Object r2 = androidx.compose.foundation.gestures.AnchoredDraggableState.anchoredDrag$default(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == r9) goto L6c
            r1 = r12
            r2 = r0
        L63:
            float r0 = r2.f48102a
            float r1 = r1 - r0
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r1)
            return r0
        L6c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.animateToWithDecay(androidx.compose.foundation.gestures.AnchoredDraggableState, java.lang.Object, float, androidx.compose.animation.core.AnimationSpec, androidx.compose.animation.core.DecayAnimationSpec, h.c.e):java.lang.Object");
    }

    public static /* synthetic */ Object animateToWithDecay$default(AnchoredDraggableState anchoredDraggableState, Object obj, float f2, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, e eVar, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            animationSpec = anchoredDraggableState.getUsePreModifierChangeBehavior$foundation() ? anchoredDraggableState.getSnapAnimationSpec() : AnchoredDraggableDefaults.INSTANCE.getSnapAnimationSpec();
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 8) != 0) {
            decayAnimationSpec = anchoredDraggableState.getUsePreModifierChangeBehavior$foundation() ? anchoredDraggableState.getDecayAnimationSpec() : AnchoredDraggableDefaults.INSTANCE.getDecayAnimationSpec();
        }
        return animateToWithDecay(anchoredDraggableState, obj, f2, animationSpec2, decayAnimationSpec, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float coerceToTarget(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        return f3 > 0.0f ? n.f(f2, f3) : n.e(f2, f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T computeTarget(DraggableAnchors<T> draggableAnchors, float f2, float f3, l<? super Float, Float> lVar, h.g.a.a<Float> aVar) {
        if (Float.isNaN(f2)) {
            throw new IllegalArgumentException("The offset provided to computeTarget must not be NaN.");
        }
        boolean z = Math.abs(f3) > 0.0f;
        boolean z2 = z && f3 > 0.0f;
        if (!z) {
            T tClosestAnchor = draggableAnchors.closestAnchor(f2);
            if (tClosestAnchor != null) {
                return tClosestAnchor;
            }
            x.g();
            return null;
        }
        if (Math.abs(f3) >= Math.abs(aVar.invoke().floatValue())) {
            T tClosestAnchor2 = draggableAnchors.closestAnchor(f2, z2);
            if (tClosestAnchor2 != null) {
                return tClosestAnchor2;
            }
            x.g();
            return null;
        }
        T tClosestAnchor3 = draggableAnchors.closestAnchor(f2, false);
        if (tClosestAnchor3 == null) {
            x.g();
        }
        float fPositionOf = draggableAnchors.positionOf(tClosestAnchor3);
        T tClosestAnchor4 = draggableAnchors.closestAnchor(f2, true);
        if (tClosestAnchor4 == null) {
            x.g();
        }
        float fPositionOf2 = draggableAnchors.positionOf(tClosestAnchor4);
        float fAbs = Math.abs(lVar.invoke(Float.valueOf(Math.abs(fPositionOf - fPositionOf2))).floatValue());
        if (true != z2) {
            fPositionOf = fPositionOf2;
        }
        return (Math.abs(fPositionOf - f2) < fAbs ? z2 : !z2) ? tClosestAnchor3 : tClosestAnchor4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> DefaultDraggableAnchors<T> emptyDraggableAnchors() {
        return new DefaultDraggableAnchors<>(ac.f47967a, new float[0]);
    }

    public static final <T> void forEach(DraggableAnchors<T> draggableAnchors, p<? super T, ? super Float, ab> pVar) {
        int size = draggableAnchors.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            T tAnchorAt = draggableAnchors.anchorAt(i2);
            if (tAnchorAt == null) {
                throw new IllegalArgumentException("There was no key at index " + i2 + ". Please report a bug.");
            }
            pVar.invoke(tAnchorAt, Float.valueOf(draggableAnchors.positionAt(i2)));
        }
    }

    public static final float getAnchoredDraggableMinFlingVelocity() {
        return AnchoredDraggableMinFlingVelocity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <I> java.lang.Object restartable(h.g.a.a<? extends I> r4, h.g.a.p<? super I, ? super h.c.e<? super h.ab>, ? extends java.lang.Object> r5, h.c.e<? super h.ab> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt.C02271
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableKt.C02271) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r6)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            goto L43
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r6)
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2 r6 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            h.g.a.p r6 = (h.g.a.p) r6     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            r0.label = r3     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            java.lang.Object r4 = kotlinx.coroutines.aj.d(r6, r0)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            if (r4 != r1) goto L43
            return r1
        L43:
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.restartable(h.g.a.a, h.g.a.p, h.c.e):java.lang.Object");
    }

    public static final <T> Object snapTo(AnchoredDraggableState<T> anchoredDraggableState, T t, e<? super ab> eVar) {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t, null, new C02292(null), eVar, 2, null);
        return objAnchoredDrag$default == a.f48038a ? objAnchoredDrag$default : ab.f48028a;
    }

    public static final <T> AnchoredDraggableState<T> AnchoredDraggableState(T t, l<? super Float, Float> lVar, h.g.a.a<Float> aVar, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, l<? super T, Boolean> lVar2) {
        AnchoredDraggableState<T> anchoredDraggableState = new AnchoredDraggableState<>(t, lVar2);
        anchoredDraggableState.setPositionalThreshold$foundation(lVar);
        anchoredDraggableState.setVelocityThreshold$foundation(aVar);
        anchoredDraggableState.setSnapAnimationSpec$foundation(animationSpec);
        anchoredDraggableState.setDecayAnimationSpec$foundation(decayAnimationSpec);
        return anchoredDraggableState;
    }

    public static /* synthetic */ AnchoredDraggableState AnchoredDraggableState$default(Object obj, l lVar, h.g.a.a aVar, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, l lVar2, int i2, Object obj2) {
        if ((i2 & 32) != 0) {
            lVar2 = new l() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$$ExternalSyntheticLambda2
                @Override // h.g.a.l
                public final Object invoke(Object obj3) {
                    int i3 = AnchoredDraggableKt.f1651a;
                    return true;
                }
            };
        }
        return AnchoredDraggableState(obj, lVar, aVar, animationSpec, decayAnimationSpec, lVar2);
    }

    private static final void debugLog(h.g.a.a<String> aVar) {
    }

    public static final <T> Modifier anchoredDraggable(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, boolean z2, FlingBehavior flingBehavior) {
        return modifier.then(new AnchoredDraggableElement(anchoredDraggableState, orientation, z, null, mutableInteractionSource, Boolean.valueOf(z2), overscrollEffect, flingBehavior));
    }

    public static final <T> Modifier anchoredDraggable(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior) {
        return modifier.then(new AnchoredDraggableElement(anchoredDraggableState, orientation, z, null, mutableInteractionSource, null, overscrollEffect, flingBehavior, 32, null));
    }

    public static final <T> Modifier anchoredDraggable(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, boolean z, Orientation orientation, boolean z2, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, boolean z3, FlingBehavior flingBehavior) {
        return modifier.then(new AnchoredDraggableElement(anchoredDraggableState, orientation, z2, Boolean.valueOf(z), mutableInteractionSource, Boolean.valueOf(z3), overscrollEffect, flingBehavior));
    }

    public static final <T> Object animateTo(AnchoredDraggableState<T> anchoredDraggableState, T t, AnimationSpec<Float> animationSpec, e<? super ab> eVar) {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t, null, new AnonymousClass4(anchoredDraggableState, animationSpec, null), eVar, 2, null);
        return objAnchoredDrag$default == a.f48038a ? objAnchoredDrag$default : ab.f48028a;
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, boolean z2, FlingBehavior flingBehavior, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            z2 = anchoredDraggableState.isAnimationRunning();
        }
        int i3 = i2 & 16;
        int i4 = i2 & 8;
        return anchoredDraggable(modifier, anchoredDraggableState, orientation, (!((i2 & 4) == 0)) | z, i4 != 0 ? null : mutableInteractionSource, i3 != 0 ? null : overscrollEffect, z2, (i2 & 64) != 0 ? null : flingBehavior);
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, boolean z, Orientation orientation, boolean z2, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, int i2, Object obj) {
        boolean z3 = z2 | (!((i2 & 8) == 0));
        if ((i2 & 16) != 0) {
            mutableInteractionSource = null;
        }
        if ((i2 & 32) != 0) {
            overscrollEffect = null;
        }
        if ((i2 & 64) != 0) {
            flingBehavior = null;
        }
        return anchoredDraggable(modifier, anchoredDraggableState, z, orientation, z3, mutableInteractionSource, overscrollEffect, flingBehavior);
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, int i2, Object obj) {
        boolean z2 = z | (!((i2 & 4) == 0));
        if ((i2 & 8) != 0) {
            mutableInteractionSource = null;
        }
        if ((i2 & 16) != 0) {
            overscrollEffect = null;
        }
        if ((i2 & 32) != 0) {
            flingBehavior = null;
        }
        return anchoredDraggable(modifier, anchoredDraggableState, orientation, z2, mutableInteractionSource, overscrollEffect, flingBehavior);
    }
}
