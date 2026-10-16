package androidx.compose.animation.core;

import androidx.collection.MutableObjectList;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import h.k.j;
import h.k.n;
import java.util.Arrays;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.h.a;
import kotlinx.coroutines.h.h;
import kotlinx.coroutines.k;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SeekableTransitionState<S> extends TransitionState<S> {
    private final l<Long, ab> animateOneFrameLambda;
    private S composedTargetState;
    private k<? super S> compositionContinuation;
    private final a compositionContinuationMutex;
    private SeekingAnimationState currentAnimation;
    private final MutableState currentState$delegate;
    private float durationScale;
    private final l<Long, ab> firstFrameLambda;
    private final MutableFloatState fraction$delegate;
    private final MutableObjectList<SeekingAnimationState> initialValueAnimations;
    private long lastFrameTimeNanos;
    private final MutatorMutex mutatorMutex;
    private final h.g.a.a<ab> recalculateTotalDurationNanos;
    private SnapshotStateObserver snapshotStateObserver;
    private final MutableState targetState$delegate;
    private long totalDurationNanos;
    private Transition<S> transition;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final AnimationVector1D ZeroVelocity = new AnimationVector1D(0.0f);
    private static final AnimationVector1D Target1 = new AnimationVector1D(1.0f);

    /* compiled from: WazeSource */
    public final class SeekingAnimationState {
        public static final int $stable = 8;
        private VectorizedAnimationSpec<AnimationVector1D> animationSpec;
        private long animationSpecDuration;
        private long durationNanos;
        private AnimationVector1D initialVelocity;
        private boolean isComplete;
        private long progressNanos;
        private AnimationVector1D start = new AnimationVector1D(0.0f);
        private float value;

        public final VectorizedAnimationSpec<AnimationVector1D> getAnimationSpec() {
            return this.animationSpec;
        }

        public final long getAnimationSpecDuration() {
            return this.animationSpecDuration;
        }

        public final long getDurationNanos() {
            return this.durationNanos;
        }

        public final AnimationVector1D getInitialVelocity() {
            return this.initialVelocity;
        }

        public final long getProgressNanos() {
            return this.progressNanos;
        }

        public final AnimationVector1D getStart() {
            return this.start;
        }

        public final float getValue() {
            return this.value;
        }

        public final boolean isComplete() {
            return this.isComplete;
        }

        public final void setAnimationSpec(VectorizedAnimationSpec<AnimationVector1D> vectorizedAnimationSpec) {
            this.animationSpec = vectorizedAnimationSpec;
        }

        public final void setAnimationSpecDuration(long j2) {
            this.animationSpecDuration = j2;
        }

        public final void setComplete(boolean z) {
            this.isComplete = z;
        }

        public final void setDurationNanos(long j2) {
            this.durationNanos = j2;
        }

        public final void setInitialVelocity(AnimationVector1D animationVector1D) {
            this.initialVelocity = animationVector1D;
        }

        public final void setProgressNanos(long j2) {
            this.progressNanos = j2;
        }

        public final void setStart(AnimationVector1D animationVector1D) {
            this.start = animationVector1D;
        }

        public final void setValue(float f2) {
            this.value = f2;
        }

        public String toString() {
            return "progress nanos: " + this.progressNanos + ", animationSpec: " + this.animationSpec + ", isComplete: " + this.isComplete + ", value: " + this.value + ", start: " + this.start + ", initialVelocity: " + this.initialVelocity + ", durationNanos: " + this.durationNanos + ", animationSpecDuration: " + this.animationSpecDuration;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$animateTo$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements l<e<? super ab>, Object> {
        final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
        final /* synthetic */ S $targetState;
        final /* synthetic */ Transition<S> $transition;
        int label;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1, reason: invalid class name */
        final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
            final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
            final /* synthetic */ S $targetState;
            final /* synthetic */ Transition<S> $transition;
            Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ SeekableTransitionState<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SeekableTransitionState<S> seekableTransitionState, S s, Transition<S> transition, FiniteAnimationSpec<Float> finiteAnimationSpec, e<? super AnonymousClass1> eVar) {
                super(2, eVar);
                this.this$0 = seekableTransitionState;
                this.$targetState = s;
                this.$transition = transition;
                this.$animationSpec = finiteAnimationSpec;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new AnonymousClass1(this.this$0, this.$targetState, this.$transition, this.$animationSpec, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:71:0x0209, code lost:
            
                if (r18.this$0.waitForComposition(r18) == r1) goto L77;
             */
            /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
            @Override // h.c.b.a.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r19) {
                /*
                    Method dump skipped, instructions count: 532
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(SeekableTransitionState<S> seekableTransitionState, S s, Transition<S> transition, FiniteAnimationSpec<Float> finiteAnimationSpec, e<? super AnonymousClass2> eVar) {
            super(1, eVar);
            this.this$0 = seekableTransitionState;
            this.$targetState = s;
            this.$transition = transition;
            this.$animationSpec = finiteAnimationSpec;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return new AnonymousClass2(this.this$0, this.$targetState, this.$transition, this.$animationSpec, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(e<? super ab> eVar) {
            return ((AnonymousClass2) create(eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (aj.d(new AnonymousClass1(this.this$0, this.$targetState, this.$transition, this.$animationSpec, null), this) == aVar) {
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
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$runAnimations$1, reason: invalid class name */
    final class AnonymousClass1 extends h.c.b.a.c {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SeekableTransitionState<S> seekableTransitionState, e<? super AnonymousClass1> eVar) {
            super(eVar);
            this.this$0 = seekableTransitionState;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.runAnimations(this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3, reason: invalid class name */
    final class AnonymousClass3 extends g implements l<e<? super ab>, Object> {
        final /* synthetic */ float $fraction;
        final /* synthetic */ S $oldTargetState;
        final /* synthetic */ S $targetState;
        final /* synthetic */ Transition<S> $transition;
        int label;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1, reason: invalid class name */
        final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
            final /* synthetic */ float $fraction;
            final /* synthetic */ S $oldTargetState;
            final /* synthetic */ S $targetState;
            final /* synthetic */ Transition<S> $transition;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SeekableTransitionState<S> this$0;

            /* compiled from: WazeSource */
            /* renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1, reason: invalid class name and collision with other inner class name */
            final class C00191 extends g implements p<af, e<? super ab>, Object> {
                int label;
                final /* synthetic */ SeekableTransitionState<S> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00191(SeekableTransitionState<S> seekableTransitionState, e<? super C00191> eVar) {
                    super(2, eVar);
                    this.this$0 = seekableTransitionState;
                }

                @Override // h.c.b.a.a
                public final e<ab> create(Object obj, e<?> eVar) {
                    return new C00191(this.this$0, eVar);
                }

                @Override // h.g.a.p
                public final Object invoke(af afVar, e<? super ab> eVar) {
                    return ((C00191) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                }

                @Override // h.c.b.a.a
                public final Object invokeSuspend(Object obj) {
                    h.c.a.a aVar = h.c.a.a.f48038a;
                    int i2 = this.label;
                    if (i2 == 0) {
                        c.b(obj);
                        this.label = 1;
                        if (this.this$0.runAnimations(this) == aVar) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(S s, S s2, SeekableTransitionState<S> seekableTransitionState, Transition<S> transition, float f2, e<? super AnonymousClass1> eVar) {
                super(2, eVar);
                this.$targetState = s;
                this.$oldTargetState = s2;
                this.this$0 = seekableTransitionState;
                this.$transition = transition;
                this.$fraction = f2;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, eVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                h.c.a.a aVar = h.c.a.a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    c.b(obj);
                    af afVar = (af) this.L$0;
                    boolean zN = x.n(this.$targetState, this.$oldTargetState);
                    SeekableTransitionState<S> seekableTransitionState = this.this$0;
                    if (zN) {
                        ((SeekableTransitionState) seekableTransitionState).currentAnimation = null;
                        SeekableTransitionState<S> seekableTransitionState2 = this.this$0;
                        if (x.n(seekableTransitionState2.getCurrentState(), this.$targetState)) {
                            return ab.f48028a;
                        }
                    } else {
                        seekableTransitionState.moveAnimationToInitialState();
                    }
                    if (!x.n(this.$targetState, this.$oldTargetState)) {
                        this.$transition.updateTarget$animation_core(this.$targetState);
                        this.$transition.setPlayTimeNanos(0L);
                        this.this$0.setTargetState$animation_core(this.$targetState);
                        this.$transition.resetAnimationFraction$animation_core(this.$fraction);
                    }
                    this.this$0.setFraction(this.$fraction);
                    boolean zIsNotEmpty = ((SeekableTransitionState) this.this$0).initialValueAnimations.isNotEmpty();
                    SeekableTransitionState<S> seekableTransitionState3 = this.this$0;
                    if (zIsNotEmpty) {
                        aj.z(afVar, null, null, new C00191(seekableTransitionState3, null), 3);
                    } else {
                        ((SeekableTransitionState) seekableTransitionState3).lastFrameTimeNanos = Long.MIN_VALUE;
                    }
                    this.label = 1;
                    if (this.this$0.waitForCompositionAfterTargetStateChange(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c.b(obj);
                }
                this.this$0.seekToFraction();
                return ab.f48028a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(S s, S s2, SeekableTransitionState<S> seekableTransitionState, Transition<S> transition, float f2, e<? super AnonymousClass3> eVar) {
            super(1, eVar);
            this.$targetState = s;
            this.$oldTargetState = s2;
            this.this$0 = seekableTransitionState;
            this.$transition = transition;
            this.$fraction = f2;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return new AnonymousClass3(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(e<? super ab> eVar) {
            return ((AnonymousClass3) create(eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (aj.d(new AnonymousClass1(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, null), this) == aVar) {
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
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$snapTo$2, reason: invalid class name and case insensitive filesystem */
    final class C02092 extends g implements l<e<? super ab>, Object> {
        final /* synthetic */ S $targetState;
        final /* synthetic */ Transition<S> $transition;
        int label;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02092(SeekableTransitionState<S> seekableTransitionState, S s, Transition<S> transition, e<? super C02092> eVar) {
            super(1, eVar);
            this.this$0 = seekableTransitionState;
            this.$targetState = s;
            this.$transition = transition;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return new C02092(this.this$0, this.$targetState, this.$transition, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(e<? super ab> eVar) {
            return ((C02092) create(eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.this$0.endAllAnimations();
                ((SeekableTransitionState) this.this$0).lastFrameTimeNanos = Long.MIN_VALUE;
                this.this$0.setFraction(0.0f);
                S s = this.$targetState;
                float f2 = x.n(s, this.this$0.getCurrentState()) ? -4.0f : x.n(s, this.this$0.getTargetState()) ? -5.0f : -3.0f;
                this.$transition.updateTarget$animation_core(this.$targetState);
                this.$transition.setPlayTimeNanos(0L);
                this.this$0.setTargetState$animation_core(this.$targetState);
                this.this$0.setFraction(0.0f);
                this.this$0.setCurrentState$animation_core(this.$targetState);
                this.$transition.resetAnimationFraction$animation_core(f2);
                if (f2 == -3.0f) {
                    this.label = 1;
                    if (this.this$0.waitForCompositionAfterTargetStateChange(this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            this.$transition.onTransitionEnd$animation_core();
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1, reason: invalid class name and case insensitive filesystem */
    final class C02101 extends h.c.b.a.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02101(SeekableTransitionState<S> seekableTransitionState, e<? super C02101> eVar) {
            super(eVar);
            this.this$0 = seekableTransitionState;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.waitForComposition(this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1, reason: invalid class name and case insensitive filesystem */
    final class C02111 extends h.c.b.a.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02111(SeekableTransitionState<S> seekableTransitionState, e<? super C02111> eVar) {
            super(eVar);
            this.this$0 = seekableTransitionState;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.waitForCompositionAfterTargetStateChange(this);
        }
    }

    public SeekableTransitionState(S s) {
        super(null);
        this.targetState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s, null, 2, null);
        this.currentState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s, null, 2, null);
        this.composedTargetState = s;
        this.recalculateTotalDurationNanos = new h.g.a.a() { // from class: androidx.compose.animation.core.SeekableTransitionState$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return SeekableTransitionState.recalculateTotalDurationNanos$lambda$0(this.f$0);
            }
        };
        this.fraction$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.compositionContinuationMutex = new h(false);
        this.mutatorMutex = new MutatorMutex();
        this.lastFrameTimeNanos = Long.MIN_VALUE;
        this.initialValueAnimations = new MutableObjectList<>(0, 1, null);
        this.firstFrameLambda = new l() { // from class: androidx.compose.animation.core.SeekableTransitionState$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SeekableTransitionState.firstFrameLambda$lambda$0(this.f$0, ((Long) obj).longValue());
            }
        };
        this.animateOneFrameLambda = new l() { // from class: androidx.compose.animation.core.SeekableTransitionState$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SeekableTransitionState.animateOneFrameLambda$lambda$0(this.f$0, ((Long) obj).longValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateOneFrame(e<? super ab> eVar) {
        float durationScale = SuspendAnimationKt.getDurationScale(eVar.getContext());
        if (durationScale <= 0.0f) {
            endAllAnimations();
            return ab.f48028a;
        }
        this.durationScale = durationScale;
        Object objWithFrameNanos = MonotonicFrameClockKt.withFrameNanos(this.animateOneFrameLambda, eVar);
        return objWithFrameNanos == h.c.a.a.f48038a ? objWithFrameNanos : ab.f48028a;
    }

    static final ab animateOneFrameLambda$lambda$0(SeekableTransitionState seekableTransitionState, long j2) {
        long j3 = j2 - seekableTransitionState.lastFrameTimeNanos;
        seekableTransitionState.lastFrameTimeNanos = j2;
        long jC = h.h.a.c(j3 / seekableTransitionState.durationScale);
        if (seekableTransitionState.initialValueAnimations.isNotEmpty()) {
            MutableObjectList<SeekingAnimationState> mutableObjectList = seekableTransitionState.initialValueAnimations;
            Object[] objArr = mutableObjectList.content;
            int i2 = mutableObjectList._size;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                SeekingAnimationState seekingAnimationState = (SeekingAnimationState) objArr[i4];
                seekableTransitionState.recalculateAnimationValue(seekingAnimationState, jC);
                seekingAnimationState.setComplete(true);
            }
            Transition<S> transition = seekableTransitionState.transition;
            if (transition != null) {
                transition.updateInitialValues$animation_core();
            }
            MutableObjectList<SeekingAnimationState> mutableObjectList2 = seekableTransitionState.initialValueAnimations;
            int i5 = mutableObjectList2._size;
            Object[] objArr2 = mutableObjectList2.content;
            j jVarU = n.u(0, mutableObjectList2._size);
            int iA = jVarU.a();
            int iB = jVarU.b();
            if (iA <= iB) {
                while (true) {
                    objArr2[iA - i3] = objArr2[iA];
                    if (((SeekingAnimationState) objArr2[iA]).isComplete()) {
                        i3++;
                    }
                    if (iA == iB) {
                        break;
                    }
                    iA++;
                }
            }
            x.f(objArr2, "<this>");
            Arrays.fill(objArr2, i5 - i3, i5, (Object) null);
            mutableObjectList2._size -= i3;
        }
        SeekingAnimationState seekingAnimationState2 = seekableTransitionState.currentAnimation;
        if (seekingAnimationState2 != null) {
            seekingAnimationState2.setDurationNanos(seekableTransitionState.totalDurationNanos);
            seekableTransitionState.recalculateAnimationValue(seekingAnimationState2, jC);
            seekableTransitionState.setFraction(seekingAnimationState2.getValue());
            if (seekingAnimationState2.getValue() == 1.0f) {
                seekableTransitionState.currentAnimation = null;
            }
            seekableTransitionState.seekToFraction();
        }
        return ab.f48028a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(SeekableTransitionState seekableTransitionState, Object obj, FiniteAnimationSpec finiteAnimationSpec, e eVar, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = seekableTransitionState.getTargetState();
        }
        if ((i2 & 2) != 0) {
            finiteAnimationSpec = null;
        }
        return seekableTransitionState.animateTo(obj, finiteAnimationSpec, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object doOneFrame(e<? super ab> eVar) {
        if (this.lastFrameTimeNanos == Long.MIN_VALUE) {
            Object objWithFrameNanos = MonotonicFrameClockKt.withFrameNanos(this.firstFrameLambda, eVar);
            if (objWithFrameNanos == h.c.a.a.f48038a) {
                return objWithFrameNanos;
            }
        } else {
            Object objAnimateOneFrame = animateOneFrame(eVar);
            if (objAnimateOneFrame == h.c.a.a.f48038a) {
                return objAnimateOneFrame;
            }
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endAllAnimations() {
        Transition<S> transition = this.transition;
        if (transition != null) {
            transition.clearInitialAnimations$animation_core();
        }
        this.initialValueAnimations.clear();
        if (this.currentAnimation != null) {
            this.currentAnimation = null;
            setFraction(1.0f);
            seekToFraction();
        }
    }

    static final ab firstFrameLambda$lambda$0(SeekableTransitionState seekableTransitionState, long j2) {
        seekableTransitionState.lastFrameTimeNanos = j2;
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveAnimationToInitialState() {
        Transition<S> transition = this.transition;
        if (transition == null) {
            return;
        }
        SeekingAnimationState seekingAnimationState = this.currentAnimation;
        if (seekingAnimationState == null) {
            if (this.totalDurationNanos <= 0 || getFraction() == 1.0f || x.n(getCurrentState(), getTargetState())) {
                seekingAnimationState = null;
            } else {
                seekingAnimationState = new SeekingAnimationState();
                seekingAnimationState.setValue(getFraction());
                long j2 = this.totalDurationNanos;
                seekingAnimationState.setDurationNanos(j2);
                seekingAnimationState.setAnimationSpecDuration(h.h.a.c(j2 * (1.0d - getFraction())));
                seekingAnimationState.getStart().set$animation_core(0, getFraction());
            }
        }
        if (seekingAnimationState != null) {
            seekingAnimationState.setDurationNanos(this.totalDurationNanos);
            this.initialValueAnimations.add(seekingAnimationState);
            transition.setInitialAnimations$animation_core(seekingAnimationState);
        }
        this.currentAnimation = null;
    }

    private final void recalculateAnimationValue(SeekingAnimationState seekingAnimationState, long j2) {
        long progressNanos = seekingAnimationState.getProgressNanos() + j2;
        seekingAnimationState.setProgressNanos(progressNanos);
        long animationSpecDuration = seekingAnimationState.getAnimationSpecDuration();
        float f2 = 1.0f;
        if (progressNanos >= animationSpecDuration) {
            seekingAnimationState.setValue(1.0f);
            return;
        }
        VectorizedAnimationSpec<AnimationVector1D> animationSpec = seekingAnimationState.getAnimationSpec();
        if (animationSpec == null) {
            float f3 = progressNanos / animationSpecDuration;
            seekingAnimationState.setValue((seekingAnimationState.getStart().get$animation_core(0) * (1.0f - f3)) + f3);
            return;
        }
        AnimationVector1D start = seekingAnimationState.getStart();
        AnimationVector1D animationVector1D = Target1;
        AnimationVector1D initialVelocity = seekingAnimationState.getInitialVelocity();
        if (initialVelocity == null) {
            initialVelocity = ZeroVelocity;
        }
        float f4 = ((AnimationVector1D) animationSpec.getValueFromNanos(progressNanos, start, animationVector1D, initialVelocity)).get$animation_core(0);
        if (f4 < 0.0f) {
            f2 = 0.0f;
        } else if (f4 <= 1.0f) {
            f2 = f4;
        }
        seekingAnimationState.setValue(f2);
    }

    static final ab recalculateTotalDurationNanos$lambda$0(SeekableTransitionState seekableTransitionState) {
        Transition<S> transition = seekableTransitionState.transition;
        seekableTransitionState.totalDurationNanos = transition != null ? transition.getTotalDurationNanos() : 0L;
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runAnimations(h.c.e<? super h.ab> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.compose.animation.core.SeekableTransitionState.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.animation.core.SeekableTransitionState$runAnimations$1 r0 = (androidx.compose.animation.core.SeekableTransitionState.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.animation.core.SeekableTransitionState$runAnimations$1 r0 = new androidx.compose.animation.core.SeekableTransitionState$runAnimations$1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = -9223372036854775808
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            e.b.c.b(r10)
            goto L6c
        L35:
            e.b.c.b(r10)
            androidx.collection.MutableObjectList<androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState> r10 = r9.initialValueAnimations
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L47
            androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState r10 = r9.currentAnimation
            if (r10 != 0) goto L47
            h.ab r9 = h.ab.f48028a
            return r9
        L47:
            h.c.j r10 = r0.getContext()
            float r10 = androidx.compose.animation.core.SuspendAnimationKt.getDurationScale(r10)
            r2 = 0
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 != 0) goto L5c
            r9.endAllAnimations()
            r9.lastFrameTimeNanos = r5
            h.ab r9 = h.ab.f48028a
            return r9
        L5c:
            long r7 = r9.lastFrameTimeNanos
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 != 0) goto L6c
            h.g.a.l<java.lang.Long, h.ab> r10 = r9.firstFrameLambda
            r0.label = r4
            java.lang.Object r10 = androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r10, r0)
            if (r10 == r1) goto L86
        L6c:
            androidx.collection.MutableObjectList<androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState> r10 = r9.initialValueAnimations
            boolean r10 = r10.isNotEmpty()
            if (r10 != 0) goto L7e
            androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState r10 = r9.currentAnimation
            if (r10 == 0) goto L79
            goto L7e
        L79:
            r9.lastFrameTimeNanos = r5
            h.ab r9 = h.ab.f48028a
            return r9
        L7e:
            r0.label = r3
            java.lang.Object r10 = r9.animateOneFrame(r0)
            if (r10 != r1) goto L6c
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.runAnimations(h.c.e):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object seekTo$default(SeekableTransitionState seekableTransitionState, float f2, Object obj, e eVar, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            obj = seekableTransitionState.getTargetState();
        }
        return seekableTransitionState.seekTo(f2, obj, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void seekToFraction() {
        Transition<S> transition = this.transition;
        if (transition == null) {
            return;
        }
        transition.seekAnimations$animation_core(h.h.a.c(getFraction() * transition.getTotalDurationNanos()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFraction(float f2) {
        this.fraction$delegate.setFloatValue(f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object waitForComposition(h.c.e<? super h.ab> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.animation.core.SeekableTransitionState.C02101
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1 r0 = (androidx.compose.animation.core.SeekableTransitionState.C02101) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1 r0 = new androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r0 = r0.L$0
            e.b.c.b(r6)
            goto L7a
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r2 = r0.L$0
            e.b.c.b(r6)
            r6 = r2
            goto L4e
        L3b:
            e.b.c.b(r6)
            java.lang.Object r6 = r5.getTargetState()
            kotlinx.coroutines.h.a r2 = r5.compositionContinuationMutex
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r2 = kotlinx.coroutines.i.c.b(r2, r0)
            if (r2 == r1) goto L8f
        L4e:
            r0.L$0 = r6
            r0.label = r3
            h.c.e r0 = (h.c.e) r0
            kotlinx.coroutines.l r2 = new kotlinx.coroutines.l
            h.c.e r3 = h.c.a.h.d(r0)
            r2.<init>(r3, r4)
            r2.u()
            r3 = r2
            kotlinx.coroutines.k r3 = (kotlinx.coroutines.k) r3
            r5.setCompositionContinuation$animation_core(r3)
            kotlinx.coroutines.h.a r3 = r5.getCompositionContinuationMutex$animation_core()
            kotlinx.coroutines.i.c.d(r3)
            java.lang.Object r2 = r2.j()
            if (r2 != r1) goto L76
            h.d.b.c(r0)
        L76:
            if (r2 == r1) goto L8f
            r0 = r6
            r6 = r2
        L7a:
            boolean r6 = h.g.b.x.n(r6, r0)
            if (r6 == 0) goto L83
            h.ab r5 = h.ab.f48028a
            return r5
        L83:
            r0 = -9223372036854775808
            r5.lastFrameTimeNanos = r0
            java.util.concurrent.CancellationException r5 = new java.util.concurrent.CancellationException
            java.lang.String r6 = "targetState while waiting for composition"
            r5.<init>(r6)
            throw r5
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.waitForComposition(h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object waitForCompositionAfterTargetStateChange(h.c.e<? super h.ab> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.animation.core.SeekableTransitionState.C02111
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 r0 = (androidx.compose.animation.core.SeekableTransitionState.C02111) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 r0 = new androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r0 = r0.L$0
            e.b.c.b(r6)
            goto L88
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r2 = r0.L$0
            e.b.c.b(r6)
            r6 = r2
            goto L4e
        L3b:
            e.b.c.b(r6)
            java.lang.Object r6 = r5.getTargetState()
            kotlinx.coroutines.h.a r2 = r5.compositionContinuationMutex
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r2 = kotlinx.coroutines.i.c.b(r2, r0)
            if (r2 == r1) goto Lb1
        L4e:
            S r2 = r5.composedTargetState
            boolean r2 = h.g.b.x.n(r6, r2)
            if (r2 == 0) goto L5c
            kotlinx.coroutines.h.a r5 = r5.compositionContinuationMutex
            kotlinx.coroutines.i.c.d(r5)
            goto L8e
        L5c:
            r0.L$0 = r6
            r0.label = r3
            h.c.e r0 = (h.c.e) r0
            kotlinx.coroutines.l r2 = new kotlinx.coroutines.l
            h.c.e r3 = h.c.a.h.d(r0)
            r2.<init>(r3, r4)
            r2.u()
            r3 = r2
            kotlinx.coroutines.k r3 = (kotlinx.coroutines.k) r3
            r5.setCompositionContinuation$animation_core(r3)
            kotlinx.coroutines.h.a r3 = r5.getCompositionContinuationMutex$animation_core()
            kotlinx.coroutines.i.c.d(r3)
            java.lang.Object r2 = r2.j()
            if (r2 != r1) goto L84
            h.d.b.c(r0)
        L84:
            if (r2 == r1) goto Lb1
            r0 = r6
            r6 = r2
        L88:
            boolean r1 = h.g.b.x.n(r6, r0)
            if (r1 == 0) goto L91
        L8e:
            h.ab r5 = h.ab.f48028a
            return r5
        L91:
            r1 = -9223372036854775808
            r5.lastFrameTimeNanos = r1
            java.util.concurrent.CancellationException r5 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "snapTo() was canceled because state was changed to "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r6 = " instead of "
            r1.append(r6)
            r1.append(r0)
            java.lang.String r6 = r1.toString()
            r5.<init>(r6)
            throw r5
        Lb1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.waitForCompositionAfterTargetStateChange(h.c.e):java.lang.Object");
    }

    public final Object animateTo(S s, FiniteAnimationSpec<Float> finiteAnimationSpec, e<? super ab> eVar) {
        Object objMutate$default;
        Transition<S> transition = this.transition;
        return (transition != null && (objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new AnonymousClass2(this, s, transition, finiteAnimationSpec, null), eVar, 1, null)) == h.c.a.a.f48038a) ? objMutate$default : ab.f48028a;
    }

    public final S getComposedTargetState$animation_core() {
        return this.composedTargetState;
    }

    public final k<S> getCompositionContinuation$animation_core() {
        return this.compositionContinuation;
    }

    public final a getCompositionContinuationMutex$animation_core() {
        return this.compositionContinuationMutex;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public S getCurrentState() {
        return (S) this.currentState$delegate.getValue();
    }

    public final float getFraction() {
        return this.fraction$delegate.getFloatValue();
    }

    public final SnapshotStateObserver getSnapshotStateObserver$animation_core() {
        return this.snapshotStateObserver;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public S getTargetState() {
        return (S) this.targetState$delegate.getValue();
    }

    public final long getTotalDurationNanos$animation_core() {
        return this.totalDurationNanos;
    }

    public final void observeTotalDuration$animation_core() {
        SnapshotStateObserver snapshotStateObserver = this.snapshotStateObserver;
        if (snapshotStateObserver != null) {
            snapshotStateObserver.observeReads(this, TransitionKt.SeekableTransitionStateTotalDurationChanged, this.recalculateTotalDurationNanos);
        }
    }

    public final void onTotalDurationChanged$animation_core() {
        long j2 = this.totalDurationNanos;
        observeTotalDuration$animation_core();
        long j3 = this.totalDurationNanos;
        if (j2 != j3) {
            SeekingAnimationState seekingAnimationState = this.currentAnimation;
            if (seekingAnimationState == null) {
                if (j3 != 0) {
                    seekToFraction();
                }
            } else {
                if (seekingAnimationState.getProgressNanos() > j3) {
                    endAllAnimations();
                    return;
                }
                seekingAnimationState.setDurationNanos(j3);
                if (seekingAnimationState.getAnimationSpec() == null) {
                    seekingAnimationState.setAnimationSpecDuration(h.h.a.c((1.0d - seekingAnimationState.getStart().get$animation_core(0)) * this.totalDurationNanos));
                }
            }
        }
    }

    public final Object seekTo(float f2, S s, e<? super ab> eVar) {
        if (f2 < 0.0f || f2 > 1.0f) {
            PreconditionsKt.throwIllegalArgumentException("Expecting fraction between 0 and 1. Got " + f2);
        }
        Transition<S> transition = this.transition;
        if (transition != null) {
            Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new AnonymousClass3(s, getTargetState(), this, transition, f2, null), eVar, 1, null);
            if (objMutate$default == h.c.a.a.f48038a) {
                return objMutate$default;
            }
        }
        return ab.f48028a;
    }

    public final void setComposedTargetState$animation_core(S s) {
        this.composedTargetState = s;
    }

    public final void setCompositionContinuation$animation_core(k<? super S> kVar) {
        this.compositionContinuation = kVar;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void setCurrentState$animation_core(S s) {
        this.currentState$delegate.setValue(s);
    }

    public final void setSnapshotStateObserver$animation_core(SnapshotStateObserver snapshotStateObserver) {
        if (x.n(this.snapshotStateObserver, snapshotStateObserver)) {
            return;
        }
        SnapshotStateObserver snapshotStateObserver2 = this.snapshotStateObserver;
        if (snapshotStateObserver2 != null) {
            snapshotStateObserver2.clear(this);
        }
        SnapshotStateObserver snapshotStateObserver3 = this.snapshotStateObserver;
        if (snapshotStateObserver3 != null) {
            snapshotStateObserver3.stop();
        }
        this.snapshotStateObserver = snapshotStateObserver;
        if (snapshotStateObserver != null) {
            snapshotStateObserver.start();
        }
        observeTotalDuration$animation_core();
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void setTargetState$animation_core(S s) {
        this.targetState$delegate.setValue(s);
    }

    public final void setTotalDurationNanos$animation_core(long j2) {
        this.totalDurationNanos = j2;
    }

    public final Object snapTo(S s, e<? super ab> eVar) {
        Object objMutate$default;
        Transition<S> transition = this.transition;
        return (transition != null && !(x.n(getCurrentState(), s) && x.n(getTargetState(), s)) && (objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new C02092(this, s, transition, null), eVar, 1, null)) == h.c.a.a.f48038a) ? objMutate$default : ab.f48028a;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void transitionConfigured$animation_core(Transition<S> transition) {
        Transition<S> transition2 = this.transition;
        if (transition2 != null && !x.n(transition, transition2)) {
            PreconditionsKt.throwIllegalStateException("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.transition + ", new instance: " + transition);
        }
        this.transition = transition;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void transitionRemoved$animation_core() {
        this.transition = null;
        SnapshotStateObserver snapshotStateObserver = this.snapshotStateObserver;
        if (snapshotStateObserver != null) {
            snapshotStateObserver.clear(this);
        }
    }

    /* compiled from: WazeSource */
    final class Companion {
        private Companion() {
        }

        public final AnimationVector1D getTarget1() {
            return SeekableTransitionState.Target1;
        }

        public final AnimationVector1D getZeroVelocity() {
            return SeekableTransitionState.ZeroVelocity;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
