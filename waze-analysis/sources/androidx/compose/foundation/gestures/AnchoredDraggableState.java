package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.AnchoredDragScope;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.a.r;
import h.g.b.o;
import h.g.b.x;
import h.k;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AnchoredDraggableState<T> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final AnchoredDraggableState$anchoredDragScope$1 anchoredDragScope;
    private final MutableState anchors$delegate;
    private l<? super T, Boolean> confirmValueChange;
    private final MutableState currentValue$delegate;
    public DecayAnimationSpec<Float> decayAnimationSpec;
    private final MutatorMutex dragMutex;
    private final MutableState dragTarget$delegate;
    private final MutableFloatState lastVelocity$delegate;
    private final MutableFloatState offset$delegate;
    public l<? super Float, Float> positionalThreshold;
    private final State progress$delegate;
    private final MutableState settledValue$delegate;
    public AnimationSpec<Float> snapAnimationSpec;
    private final State targetValue$delegate;
    public a<Float> velocityThreshold;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements l<e<? super ab>, Object> {
        final /* synthetic */ q<AnchoredDragScope, DraggableAnchors<T>, e<? super ab>, Object> $block;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2, reason: invalid class name and collision with other inner class name */
        final class C00312 extends g implements p<DraggableAnchors<T>, e<? super ab>, Object> {
            final /* synthetic */ q<AnchoredDragScope, DraggableAnchors<T>, e<? super ab>, Object> $block;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00312(q<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super e<? super ab>, ? extends Object> qVar, AnchoredDraggableState<T> anchoredDraggableState, e<? super C00312> eVar) {
                super(2, eVar);
                this.$block = qVar;
                this.this$0 = anchoredDraggableState;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                C00312 c00312 = new C00312(this.$block, this.this$0, eVar);
                c00312.L$0 = obj;
                return c00312;
            }

            @Override // h.g.a.p
            public final Object invoke(DraggableAnchors<T> draggableAnchors, e<? super ab> eVar) {
                return ((C00312) create(draggableAnchors, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                h.c.a.a aVar = h.c.a.a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    c.b(obj);
                    DraggableAnchors<T> draggableAnchors = (DraggableAnchors) this.L$0;
                    q<AnchoredDragScope, DraggableAnchors<T>, e<? super ab>, Object> qVar = this.$block;
                    AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1 = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                    this.label = 1;
                    if (qVar.invoke(anchoredDraggableState$anchoredDragScope$1, draggableAnchors, this) == aVar) {
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
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(AnchoredDraggableState<T> anchoredDraggableState, q<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super e<? super ab>, ? extends Object> qVar, e<? super AnonymousClass2> eVar) {
            super(1, eVar);
            this.this$0 = anchoredDraggableState;
            this.$block = qVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return new AnonymousClass2(this.this$0, this.$block, eVar);
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
                final AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                this.label = 1;
                if (AnchoredDraggableKt.restartable(new a() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$$ExternalSyntheticLambda0
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return anchoredDraggableState.getAnchors();
                    }
                }, new C00312(this.$block, anchoredDraggableState, null), this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            AnchoredDraggableState<T> anchoredDraggableState2 = this.this$0;
            T tClosestAnchor = anchoredDraggableState2.getAnchors().closestAnchor(anchoredDraggableState2.getOffset());
            if (tClosestAnchor != null) {
                if (Math.abs(this.this$0.getOffset() - this.this$0.getAnchors().positionOf(tClosestAnchor)) < 0.5f && this.this$0.getConfirmValueChange$foundation().invoke(tClosestAnchor).booleanValue()) {
                    this.this$0.setSettledValue(tClosestAnchor);
                    this.this$0.setCurrentValue(tClosestAnchor);
                }
            }
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3, reason: invalid class name */
    final class AnonymousClass3 extends h.c.b.a.c {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(AnchoredDraggableState<T> anchoredDraggableState, e<? super AnonymousClass3> eVar) {
            super(eVar);
            this.this$0 = anchoredDraggableState;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.anchoredDrag(null, null, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4, reason: invalid class name */
    final class AnonymousClass4 extends g implements l<e<? super ab>, Object> {
        final /* synthetic */ r<AnchoredDragScope, DraggableAnchors<T>, T, e<? super ab>, Object> $block;
        final /* synthetic */ T $targetValue;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2, reason: invalid class name */
        final class AnonymousClass2 extends g implements p<k<? extends DraggableAnchors<T>, ? extends T>, e<? super ab>, Object> {
            final /* synthetic */ r<AnchoredDragScope, DraggableAnchors<T>, T, e<? super ab>, Object> $block;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(r<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super T, ? super e<? super ab>, ? extends Object> rVar, AnchoredDraggableState<T> anchoredDraggableState, e<? super AnonymousClass2> eVar) {
                super(2, eVar);
                this.$block = rVar;
                this.this$0 = anchoredDraggableState;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, eVar);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // h.g.a.p
            public final Object invoke(k<? extends DraggableAnchors<T>, ? extends T> kVar, e<? super ab> eVar) {
                return ((AnonymousClass2) create(kVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                h.c.a.a aVar = h.c.a.a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    c.b(obj);
                    k kVar = (k) this.L$0;
                    DraggableAnchors draggableAnchors = (DraggableAnchors) kVar.a();
                    Object objB = kVar.b();
                    r<AnchoredDragScope, DraggableAnchors<T>, T, e<? super ab>, Object> rVar = this.$block;
                    AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1 = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                    this.label = 1;
                    if (rVar.invoke(anchoredDraggableState$anchoredDragScope$1, draggableAnchors, objB, this) == aVar) {
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
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(AnchoredDraggableState<T> anchoredDraggableState, T t, r<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super T, ? super e<? super ab>, ? extends Object> rVar, e<? super AnonymousClass4> eVar) {
            super(1, eVar);
            this.this$0 = anchoredDraggableState;
            this.$targetValue = t;
            this.$block = rVar;
        }

        static final k invokeSuspend$lambda$0(AnchoredDraggableState anchoredDraggableState) {
            return new k(anchoredDraggableState.getAnchors(), anchoredDraggableState.getTargetValue());
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return new AnonymousClass4(this.this$0, this.$targetValue, this.$block, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(e<? super ab> eVar) {
            return ((AnonymousClass4) create(eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.this$0.setDragTarget(this.$targetValue);
                final AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                this.label = 1;
                if (AnchoredDraggableKt.restartable(new a() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$$ExternalSyntheticLambda0
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return AnchoredDraggableState.AnonymousClass4.invokeSuspend$lambda$0(anchoredDraggableState);
                    }
                }, new AnonymousClass2(this.$block, anchoredDraggableState, null), this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            AnchoredDraggableState<T> anchoredDraggableState2 = this.this$0;
            if (anchoredDraggableState2.getConfirmValueChange$foundation().invoke(this.$targetValue).booleanValue()) {
                AnchoredDraggableState<T> anchoredDraggableState3 = this.this$0;
                float fPositionOf = anchoredDraggableState3.getAnchors().positionOf(this.$targetValue);
                AnchoredDraggableState<T> anchoredDraggableState4 = this.this$0;
                ((AnchoredDraggableState) anchoredDraggableState4).anchoredDragScope.dragTo(fPositionOf, anchoredDraggableState4.getLastVelocity());
                this.this$0.setSettledValue(this.$targetValue);
                this.this$0.setCurrentValue(this.$targetValue);
            }
            return ab.f48028a;
        }
    }

    public AnchoredDraggableState(T t) {
        this.confirmValueChange = new l() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return true;
            }
        };
        this.dragMutex = new MutatorMutex();
        this.currentValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.settledValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.targetValue$delegate = SnapshotStateKt.derivedStateOf(new a() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return AnchoredDraggableState.targetValue_delegate$lambda$0(this.f$0);
            }
        });
        this.offset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(Float.NaN);
        this.progress$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new a() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return Float.valueOf(AnchoredDraggableState.progress_delegate$lambda$0(this.f$0));
            }
        });
        this.lastVelocity$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.dragTarget$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.anchors$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AnchoredDraggableKt.emptyDraggableAnchors(), null, 2, null);
        this.anchoredDragScope = new AnchoredDraggableState$anchoredDragScope$1(this);
    }

    static final boolean _init_$lambda$0(Object obj) {
        return true;
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, MutatePriority mutatePriority, q qVar, e eVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(mutatePriority, qVar, eVar);
    }

    private final T calculateTargetValue(float f2) {
        if (ComposeFoundationFlags.isAnchoredDraggableTargetValueCalculationFixEnabled) {
            return calculateTargetValueWithFix(f2);
        }
        if (Float.isNaN(f2)) {
            return getCurrentValue();
        }
        T tClosestAnchor = getAnchors().closestAnchor(f2);
        return tClosestAnchor != null ? tClosestAnchor : getCurrentValue();
    }

    private final T calculateTargetValueWithFix(float f2) {
        if (Float.isNaN(f2)) {
            return getCurrentValue();
        }
        float fPositionOf = getAnchors().positionOf(getCurrentValue());
        if (Float.isNaN(fPositionOf) || f2 == fPositionOf) {
            return getCurrentValue();
        }
        T tClosestAnchor = getAnchors().closestAnchor(f2);
        return tClosestAnchor != null ? tClosestAnchor : getCurrentValue();
    }

    static final boolean confirmValueChange$lambda$0(Object obj) {
        return true;
    }

    private final T getDragTarget() {
        return this.dragTarget$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static final float progress_delegate$lambda$0(AnchoredDraggableState anchoredDraggableState) {
        float fPositionOf = anchoredDraggableState.getAnchors().positionOf(anchoredDraggableState.getSettledValue());
        float fPositionOf2 = anchoredDraggableState.getAnchors().positionOf(anchoredDraggableState.getTargetValue()) - fPositionOf;
        float fAbs = Math.abs(fPositionOf2);
        if (Float.isNaN(fAbs) || fAbs <= 1.0E-6f) {
            return 1.0f;
        }
        float fRequireOffset = (anchoredDraggableState.requireOffset() - fPositionOf) / fPositionOf2;
        if (fRequireOffset < 1.0E-6f) {
            return 0.0f;
        }
        if (fRequireOffset > 0.999999f) {
            return 1.0f;
        }
        return fRequireOffset;
    }

    private final void setAnchors(DraggableAnchors<T> draggableAnchors) {
        this.anchors$delegate.setValue(draggableAnchors);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentValue(T t) {
        this.currentValue$delegate.setValue(t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDragTarget(T t) {
        this.dragTarget$delegate.setValue(t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLastVelocity(float f2) {
        this.lastVelocity$delegate.setFloatValue(f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOffset(float f2) {
        this.offset$delegate.setFloatValue(f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSettledValue(T t) {
        this.settledValue$delegate.setValue(t);
    }

    static final Object targetValue_delegate$lambda$0(AnchoredDraggableState anchoredDraggableState) {
        Object dragTarget = anchoredDraggableState.getDragTarget();
        return dragTarget == null ? anchoredDraggableState.calculateTargetValue(anchoredDraggableState.getOffset()) : dragTarget;
    }

    private final boolean trySnapTo(T t) {
        MutatorMutex mutatorMutex = this.dragMutex;
        boolean zTryLock = mutatorMutex.tryLock();
        if (!zTryLock) {
            return zTryLock;
        }
        try {
            AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1 = this.anchoredDragScope;
            float fPositionOf = getAnchors().positionOf(t);
            if (!Float.isNaN(fPositionOf)) {
                AnchoredDragScope.CC.dragTo$default(anchoredDraggableState$anchoredDragScope$1, fPositionOf, 0.0f, 2, null);
                setDragTarget(null);
            }
            setCurrentValue(t);
            setSettledValue(t);
            return zTryLock;
        } finally {
            mutatorMutex.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateAnchors$default(AnchoredDraggableState anchoredDraggableState, DraggableAnchors draggableAnchors, Object obj, int i2, Object obj2) {
        if ((i2 & 2) != 0 && (Float.isNaN(anchoredDraggableState.getOffset()) || (obj = draggableAnchors.closestAnchor(anchoredDraggableState.getOffset())) == null)) {
            obj = anchoredDraggableState.getTargetValue();
        }
        anchoredDraggableState.updateAnchors(draggableAnchors, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object anchoredDrag(T r6, androidx.compose.foundation.MutatePriority r7, h.g.a.r<? super androidx.compose.foundation.gestures.AnchoredDragScope, ? super androidx.compose.foundation.gestures.DraggableAnchors<T>, ? super T, ? super h.c.e<? super h.ab>, ? extends java.lang.Object> r8, h.c.e<? super h.ab> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.AnchoredDraggableState.AnonymousClass3
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableState.AnonymousClass3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r9)     // Catch: java.lang.Throwable -> L28
            goto L51
        L28:
            r6 = move-exception
            goto L55
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            e.b.c.b(r9)
            androidx.compose.foundation.gestures.DraggableAnchors r9 = r5.getAnchors()
            boolean r9 = r9.hasPositionFor(r6)
            if (r9 == 0) goto L59
            androidx.compose.foundation.MutatorMutex r9 = r5.dragMutex     // Catch: java.lang.Throwable -> L28
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4 r2 = new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4     // Catch: java.lang.Throwable -> L28
            r2.<init>(r5, r6, r8, r4)     // Catch: java.lang.Throwable -> L28
            h.g.a.l r2 = (h.g.a.l) r2     // Catch: java.lang.Throwable -> L28
            r0.label = r3     // Catch: java.lang.Throwable -> L28
            java.lang.Object r6 = r9.mutate(r7, r2, r0)     // Catch: java.lang.Throwable -> L28
            if (r6 != r1) goto L51
            return r1
        L51:
            r5.setDragTarget(r4)
            goto L6d
        L55:
            r5.setDragTarget(r4)
            throw r6
        L59:
            h.g.a.l<? super T, java.lang.Boolean> r7 = r5.confirmValueChange
            java.lang.Object r7 = r7.invoke(r6)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L6d
            r5.setSettledValue(r6)
            r5.setCurrentValue(r6)
        L6d:
            h.ab r5 = h.ab.f48028a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableState.anchoredDrag(java.lang.Object, androidx.compose.foundation.MutatePriority, h.g.a.r, h.c.e):java.lang.Object");
    }

    public final float dispatchRawDelta(float f2) {
        float fNewOffsetForDelta$foundation = newOffsetForDelta$foundation(f2);
        float fRequireOffset = fNewOffsetForDelta$foundation - requireOffset();
        AnchoredDragScope.CC.dragTo$default(this.anchoredDragScope, fNewOffsetForDelta$foundation, 0.0f, 2, null);
        return fRequireOffset;
    }

    public final DraggableAnchors<T> getAnchors() {
        return (DraggableAnchors) this.anchors$delegate.getValue();
    }

    public final l<T, Boolean> getConfirmValueChange$foundation() {
        return this.confirmValueChange;
    }

    public final T getCurrentValue() {
        return this.currentValue$delegate.getValue();
    }

    public final DecayAnimationSpec<Float> getDecayAnimationSpec() {
        DecayAnimationSpec<Float> decayAnimationSpec = this.decayAnimationSpec;
        if (decayAnimationSpec != null) {
            return decayAnimationSpec;
        }
        x.j("decayAnimationSpec");
        return null;
    }

    public final float getLastVelocity() {
        return this.lastVelocity$delegate.getFloatValue();
    }

    public final float getOffset() {
        return this.offset$delegate.getFloatValue();
    }

    public final l<Float, Float> getPositionalThreshold$foundation() {
        l lVar = this.positionalThreshold;
        if (lVar != null) {
            return lVar;
        }
        x.j("positionalThreshold");
        return null;
    }

    public final float getProgress() {
        return ((Number) this.progress$delegate.getValue()).floatValue();
    }

    public final T getSettledValue() {
        return this.settledValue$delegate.getValue();
    }

    public final AnimationSpec<Float> getSnapAnimationSpec() {
        AnimationSpec<Float> animationSpec = this.snapAnimationSpec;
        if (animationSpec != null) {
            return animationSpec;
        }
        x.j("snapAnimationSpec");
        return null;
    }

    public final T getTargetValue() {
        return (T) this.targetValue$delegate.getValue();
    }

    public final boolean getUsePreModifierChangeBehavior$foundation() {
        return (this.positionalThreshold == null || this.velocityThreshold == null || this.snapAnimationSpec == null || this.decayAnimationSpec == null) ? false : true;
    }

    public final a<Float> getVelocityThreshold$foundation() {
        a<Float> aVar = this.velocityThreshold;
        if (aVar != null) {
            return aVar;
        }
        x.j("velocityThreshold");
        return null;
    }

    public final boolean isAnimationRunning() {
        return getDragTarget() != null;
    }

    public final float newOffsetForDelta$foundation(float f2) {
        return n.g((Float.isNaN(getOffset()) ? 0.0f : getOffset()) + f2, getAnchors().minPosition(), getAnchors().maxPosition());
    }

    public final float progress(T t, T t2) {
        float fPositionOf = getAnchors().positionOf(t);
        float fPositionOf2 = getAnchors().positionOf(t2);
        float fG = (n.g(getOffset(), Math.min(fPositionOf, fPositionOf2), Math.max(fPositionOf, fPositionOf2)) - fPositionOf) / (fPositionOf2 - fPositionOf);
        if (Float.isNaN(fG)) {
            return 1.0f;
        }
        if (fG < 1.0E-6f) {
            return 0.0f;
        }
        if (fG > 0.999999f) {
            return 1.0f;
        }
        return Math.abs(fG);
    }

    public final float requireOffset() {
        if (Float.isNaN(getOffset())) {
            InlineClassHelperKt.throwIllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return getOffset();
    }

    public final void setConfirmValueChange$foundation(l<? super T, Boolean> lVar) {
        this.confirmValueChange = lVar;
    }

    public final void setDecayAnimationSpec$foundation(DecayAnimationSpec<Float> decayAnimationSpec) {
        this.decayAnimationSpec = decayAnimationSpec;
    }

    public final void setPositionalThreshold$foundation(l<? super Float, Float> lVar) {
        this.positionalThreshold = lVar;
    }

    public final void setSnapAnimationSpec$foundation(AnimationSpec<Float> animationSpec) {
        this.snapAnimationSpec = animationSpec;
    }

    public final void setVelocityThreshold$foundation(a<Float> aVar) {
        this.velocityThreshold = aVar;
    }

    public final Object settle(float f2, e<? super Float> eVar) {
        if (!getUsePreModifierChangeBehavior$foundation()) {
            InlineClassHelperKt.throwIllegalArgumentException("AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information.");
        }
        T currentValue = getCurrentValue();
        Object objComputeTarget = AnchoredDraggableKt.computeTarget(getAnchors(), requireOffset(), f2, getPositionalThreshold$foundation(), getVelocityThreshold$foundation());
        return this.confirmValueChange.invoke(objComputeTarget).booleanValue() ? AnchoredDraggableKt.animateToWithDecay$default(this, objComputeTarget, f2, null, null, eVar, 12, null) : AnchoredDraggableKt.animateToWithDecay$default(this, currentValue, f2, null, null, eVar, 12, null);
    }

    public final void updateAnchors(DraggableAnchors<T> draggableAnchors, T t) {
        if (x.n(getAnchors(), draggableAnchors)) {
            return;
        }
        setAnchors(draggableAnchors);
        if (trySnapTo(t)) {
            return;
        }
        setDragTarget(t);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public static /* synthetic */ Saver Saver$default(Companion companion, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, l lVar, a aVar, l lVar2, int i2, Object obj) {
            if ((i2 & 16) != 0) {
                lVar2 = new l() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$$ExternalSyntheticLambda5
                    @Override // h.g.a.l
                    public final Object invoke(Object obj2) {
                        return true;
                    }
                };
            }
            return companion.Saver(animationSpec, decayAnimationSpec, lVar, aVar, lVar2);
        }

        static final AnchoredDraggableState Saver$lambda$1(Object obj) {
            return new AnchoredDraggableState(obj);
        }

        static final boolean Saver$lambda$2(Object obj) {
            return true;
        }

        static final AnchoredDraggableState Saver$lambda$4(l lVar, Object obj) {
            return new AnchoredDraggableState(obj, (l<? super Object, Boolean>) lVar);
        }

        static final boolean Saver$lambda$5(Object obj) {
            return true;
        }

        public final <T> Saver<AnchoredDraggableState<T>, T> Saver(final AnimationSpec<Float> animationSpec, final DecayAnimationSpec<Float> decayAnimationSpec, final l<? super Float, Float> lVar, final a<Float> aVar, final l<? super T, Boolean> lVar2) {
            return SaverKt.Saver(new p() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnchoredDraggableState) obj2).getCurrentValue();
                }
            }, new l() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return AnchoredDraggableKt.AnchoredDraggableState(obj, lVar, aVar, animationSpec, decayAnimationSpec, lVar2);
                }
            });
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Saver Saver$default(Companion companion, l lVar, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                lVar = new l() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$$ExternalSyntheticLambda2
                    @Override // h.g.a.l
                    public final Object invoke(Object obj2) {
                        return true;
                    }
                };
            }
            return companion.Saver(lVar);
        }

        public final <T> Saver<AnchoredDraggableState<T>, T> Saver() {
            return SaverKt.Saver(new p() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$$ExternalSyntheticLambda6
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnchoredDraggableState) obj2).getCurrentValue();
                }
            }, new l() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$$ExternalSyntheticLambda7
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return AnchoredDraggableState.Companion.Saver$lambda$1(obj);
                }
            });
        }

        public final <T> Saver<AnchoredDraggableState<T>, T> Saver(final l<? super T, Boolean> lVar) {
            return SaverKt.Saver(new p() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$$ExternalSyntheticLambda3
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnchoredDraggableState) obj2).getCurrentValue();
                }
            }, new l() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$$ExternalSyntheticLambda4
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return AnchoredDraggableState.Companion.Saver$lambda$4(lVar, obj);
                }
            });
        }
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, Object obj, MutatePriority mutatePriority, r rVar, e eVar, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(obj, mutatePriority, rVar, eVar);
    }

    public static /* synthetic */ void getDecayAnimationSpec$annotations() {
    }

    public static /* synthetic */ void getProgress$annotations() {
    }

    public static /* synthetic */ void getSnapAnimationSpec$annotations() {
    }

    public static /* synthetic */ void getUsePreModifierChangeBehavior$foundation$annotations() {
    }

    public final Object settle(AnimationSpec<Float> animationSpec, e<? super ab> eVar) {
        T currentValue = getCurrentValue();
        T tClosestAnchor = getAnchors().closestAnchor(requireOffset());
        if (tClosestAnchor != null && this.confirmValueChange.invoke(tClosestAnchor).booleanValue()) {
            Object objAnimateTo = AnchoredDraggableKt.animateTo(this, tClosestAnchor, animationSpec, eVar);
            if (objAnimateTo == h.c.a.a.f48038a) {
                return objAnimateTo;
            }
        } else {
            Object objAnimateTo2 = AnchoredDraggableKt.animateTo(this, currentValue, animationSpec, eVar);
            if (objAnimateTo2 == h.c.a.a.f48038a) {
                return objAnimateTo2;
            }
        }
        return ab.f48028a;
    }

    public AnchoredDraggableState(T t, DraggableAnchors<T> draggableAnchors) {
        this(t);
        setAnchors(draggableAnchors);
        trySnapTo(t);
    }

    public AnchoredDraggableState(T t, DraggableAnchors<T> draggableAnchors, l<? super T, Boolean> lVar) {
        this(t, lVar);
        setAnchors(draggableAnchors);
        trySnapTo(t);
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, DraggableAnchors draggableAnchors, l lVar, int i2, o oVar) {
        this(obj, draggableAnchors, (i2 & 4) != 0 ? new l() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj2) {
                return true;
            }
        } : lVar);
    }

    public AnchoredDraggableState(T t, l<? super T, Boolean> lVar) {
        this(t);
        this.confirmValueChange = lVar;
    }

    public final Object anchoredDrag(MutatePriority mutatePriority, q<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super e<? super ab>, ? extends Object> qVar, e<? super ab> eVar) {
        Object objMutate = this.dragMutex.mutate(mutatePriority, new AnonymousClass2(this, qVar, null), eVar);
        return objMutate == h.c.a.a.f48038a ? objMutate : ab.f48028a;
    }
}
