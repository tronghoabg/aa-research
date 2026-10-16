package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.material.AnchoredDragScope;
import androidx.compose.material.AnchoredDraggableState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import h.ab;
import h.c.b.a.c;
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
    private final AnchoredDragScope anchoredDragScope;
    private final MutableState anchors$delegate;
    private final AnimationSpec<Float> animationSpec;
    private final State closestValue$delegate;
    private final l<T, Boolean> confirmValueChange;
    private final MutableState currentValue$delegate;
    private final InternalMutatorMutex dragMutex;
    private final MutableState dragTarget$delegate;
    private final DraggableState draggableState;
    private final MutableFloatState lastVelocity$delegate;
    private final MutableFloatState offset$delegate;
    private final l<Float, Float> positionalThreshold;
    private final State progress$delegate;
    private final State targetValue$delegate;
    private final a<Float> velocityThreshold;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material.AnchoredDraggableState$anchoredDrag$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AnchoredDraggableState<T> anchoredDraggableState, e<? super AnonymousClass1> eVar) {
            super(eVar);
            this.this$0 = anchoredDraggableState;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.anchoredDrag(null, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material.AnchoredDraggableState$anchoredDrag$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements l<e<? super ab>, Object> {
        final /* synthetic */ q<AnchoredDragScope, DraggableAnchors<T>, e<? super ab>, Object> $block;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.material.AnchoredDraggableState$anchoredDrag$2$2, reason: invalid class name and collision with other inner class name */
        final class C00582 extends g implements p<DraggableAnchors<T>, e<? super ab>, Object> {
            final /* synthetic */ q<AnchoredDragScope, DraggableAnchors<T>, e<? super ab>, Object> $block;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00582(q<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super e<? super ab>, ? extends Object> qVar, AnchoredDraggableState<T> anchoredDraggableState, e<? super C00582> eVar) {
                super(2, eVar);
                this.$block = qVar;
                this.this$0 = anchoredDraggableState;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                C00582 c00582 = new C00582(this.$block, this.this$0, eVar);
                c00582.L$0 = obj;
                return c00582;
            }

            @Override // h.g.a.p
            public final Object invoke(DraggableAnchors<T> draggableAnchors, e<? super ab> eVar) {
                return ((C00582) create(draggableAnchors, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                h.c.a.a aVar = h.c.a.a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    e.b.c.b(obj);
                    DraggableAnchors<T> draggableAnchors = (DraggableAnchors) this.L$0;
                    q<AnchoredDragScope, DraggableAnchors<T>, e<? super ab>, Object> qVar = this.$block;
                    AnchoredDragScope anchoredDragScope = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                    this.label = 1;
                    if (qVar.invoke(anchoredDragScope, draggableAnchors, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.b.c.b(obj);
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
                e.b.c.b(obj);
                final AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                this.label = 1;
                if (AnchoredDraggableKt.restartable(new a() { // from class: androidx.compose.material.AnchoredDraggableState$anchoredDrag$2$$ExternalSyntheticLambda0
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return anchoredDraggableState.getAnchors();
                    }
                }, new C00582(this.$block, anchoredDraggableState, null), this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
            }
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material.AnchoredDraggableState$anchoredDrag$3, reason: invalid class name */
    final class AnonymousClass3 extends c {
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
    /* renamed from: androidx.compose.material.AnchoredDraggableState$anchoredDrag$4, reason: invalid class name */
    final class AnonymousClass4 extends g implements l<e<? super ab>, Object> {
        final /* synthetic */ r<AnchoredDragScope, DraggableAnchors<T>, T, e<? super ab>, Object> $block;
        final /* synthetic */ T $targetValue;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.material.AnchoredDraggableState$anchoredDrag$4$2, reason: invalid class name */
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
                    e.b.c.b(obj);
                    k kVar = (k) this.L$0;
                    DraggableAnchors draggableAnchors = (DraggableAnchors) kVar.a();
                    Object objB = kVar.b();
                    r<AnchoredDragScope, DraggableAnchors<T>, T, e<? super ab>, Object> rVar = this.$block;
                    AnchoredDragScope anchoredDragScope = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                    this.label = 1;
                    if (rVar.invoke(anchoredDragScope, draggableAnchors, objB, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.b.c.b(obj);
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
                e.b.c.b(obj);
                this.this$0.setDragTarget(this.$targetValue);
                final AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                this.label = 1;
                if (AnchoredDraggableKt.restartable(new a() { // from class: androidx.compose.material.AnchoredDraggableState$anchoredDrag$4$$ExternalSyntheticLambda0
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
                e.b.c.b(obj);
            }
            return ab.f48028a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableState(T t, l<? super Float, Float> lVar, a<Float> aVar, AnimationSpec<Float> animationSpec, l<? super T, Boolean> lVar2) {
        this.positionalThreshold = lVar;
        this.velocityThreshold = aVar;
        this.animationSpec = animationSpec;
        this.confirmValueChange = lVar2;
        this.dragMutex = new InternalMutatorMutex();
        this.draggableState = new AnchoredDraggableState$draggableState$1(this);
        this.currentValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.targetValue$delegate = SnapshotStateKt.derivedStateOf(new a() { // from class: androidx.compose.material.AnchoredDraggableState$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return AnchoredDraggableState.targetValue_delegate$lambda$0(this.f$0);
            }
        });
        this.closestValue$delegate = SnapshotStateKt.derivedStateOf(new a() { // from class: androidx.compose.material.AnchoredDraggableState$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return AnchoredDraggableState.closestValue_delegate$lambda$0(this.f$0);
            }
        });
        this.offset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(Float.NaN);
        this.progress$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new a() { // from class: androidx.compose.material.AnchoredDraggableState$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return Float.valueOf(AnchoredDraggableState.progress_delegate$lambda$0(this.f$0));
            }
        });
        this.lastVelocity$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.dragTarget$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.anchors$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AnchoredDraggableKt.emptyDraggableAnchors(), null, 2, null);
        this.anchoredDragScope = new AnchoredDragScope(this) { // from class: androidx.compose.material.AnchoredDraggableState$anchoredDragScope$1
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.compose.material.AnchoredDragScope
            public void dragTo(float f2, float f3) {
                this.this$0.setOffset(f2);
                this.this$0.setLastVelocity(f3);
            }
        };
    }

    static final boolean _init_$lambda$0(Object obj) {
        return true;
    }

    static final boolean _init_$lambda$1(Object obj) {
        return true;
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, MutatePriority mutatePriority, q qVar, e eVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(mutatePriority, qVar, eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static final Object closestValue_delegate$lambda$0(AnchoredDraggableState anchoredDraggableState) {
        Object dragTarget = anchoredDraggableState.getDragTarget();
        if (dragTarget != null) {
            return dragTarget;
        }
        float offset = anchoredDraggableState.getOffset();
        return !Float.isNaN(offset) ? anchoredDraggableState.computeTargetWithoutThresholds(offset, anchoredDraggableState.getCurrentValue()) : anchoredDraggableState.getCurrentValue();
    }

    private final T computeTarget(float f2, T t, float f3) {
        DraggableAnchors<T> anchors = getAnchors();
        float fPositionOf = anchors.positionOf(t);
        float fFloatValue = this.velocityThreshold.invoke().floatValue();
        if (fPositionOf != f2 && !Float.isNaN(fPositionOf)) {
            if (fPositionOf < f2) {
                if (f3 >= fFloatValue) {
                    T tClosestAnchor = anchors.closestAnchor(f2, true);
                    x.c(tClosestAnchor);
                    return tClosestAnchor;
                }
                T tClosestAnchor2 = anchors.closestAnchor(f2, true);
                x.c(tClosestAnchor2);
                if (f2 >= Math.abs(fPositionOf + Math.abs(this.positionalThreshold.invoke(Float.valueOf(Math.abs(anchors.positionOf(tClosestAnchor2) - fPositionOf))).floatValue()))) {
                    return tClosestAnchor2;
                }
            } else {
                if (f3 <= (-fFloatValue)) {
                    T tClosestAnchor3 = anchors.closestAnchor(f2, false);
                    x.c(tClosestAnchor3);
                    return tClosestAnchor3;
                }
                T tClosestAnchor4 = anchors.closestAnchor(f2, false);
                x.c(tClosestAnchor4);
                float fAbs = Math.abs(fPositionOf - Math.abs(this.positionalThreshold.invoke(Float.valueOf(Math.abs(fPositionOf - anchors.positionOf(tClosestAnchor4)))).floatValue()));
                if (f2 >= 0.0f ? f2 <= fAbs : Math.abs(f2) >= fAbs) {
                    return tClosestAnchor4;
                }
            }
        }
        return t;
    }

    private final T computeTargetWithoutThresholds(float f2, T t) {
        DraggableAnchors<T> anchors = getAnchors();
        float fPositionOf = anchors.positionOf(t);
        if (fPositionOf != f2 && !Float.isNaN(fPositionOf)) {
            if (fPositionOf < f2) {
                T tClosestAnchor = anchors.closestAnchor(f2, true);
                if (tClosestAnchor != null) {
                    return tClosestAnchor;
                }
            } else {
                T tClosestAnchor2 = anchors.closestAnchor(f2, false);
                if (tClosestAnchor2 != null) {
                    return tClosestAnchor2;
                }
            }
        }
        return t;
    }

    private final T getDragTarget() {
        return this.dragTarget$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static final float progress_delegate$lambda$0(AnchoredDraggableState anchoredDraggableState) {
        float fPositionOf = anchoredDraggableState.getAnchors().positionOf(anchoredDraggableState.getCurrentValue());
        float fPositionOf2 = anchoredDraggableState.getAnchors().positionOf(anchoredDraggableState.getClosestValue$material()) - fPositionOf;
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

    private final void setCurrentValue(T t) {
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

    /* JADX WARN: Multi-variable type inference failed */
    static final Object targetValue_delegate$lambda$0(AnchoredDraggableState anchoredDraggableState) {
        Object dragTarget = anchoredDraggableState.getDragTarget();
        if (dragTarget != null) {
            return dragTarget;
        }
        float offset = anchoredDraggableState.getOffset();
        return !Float.isNaN(offset) ? anchoredDraggableState.computeTarget(offset, anchoredDraggableState.getCurrentValue(), 0.0f) : anchoredDraggableState.getCurrentValue();
    }

    private final boolean trySnapTo(final T t) {
        return this.dragMutex.tryMutate(new a() { // from class: androidx.compose.material.AnchoredDraggableState$$ExternalSyntheticLambda5
            @Override // h.g.a.a
            public final Object invoke() {
                return AnchoredDraggableState.trySnapTo$lambda$0(this.f$0, t);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    static final ab trySnapTo$lambda$0(AnchoredDraggableState anchoredDraggableState, Object obj) {
        AnchoredDragScope anchoredDragScope = anchoredDraggableState.anchoredDragScope;
        float fPositionOf = anchoredDraggableState.getAnchors().positionOf(obj);
        if (!Float.isNaN(fPositionOf)) {
            AnchoredDragScope.CC.dragTo$default(anchoredDragScope, fPositionOf, 0.0f, 2, null);
            anchoredDraggableState.setDragTarget(null);
        }
        anchoredDraggableState.setCurrentValue(obj);
        return ab.f48028a;
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
    public final java.lang.Object anchoredDrag(T r7, androidx.compose.foundation.MutatePriority r8, h.g.a.r<? super androidx.compose.material.AnchoredDragScope, ? super androidx.compose.material.DraggableAnchors<T>, ? super T, ? super h.c.e<? super h.ab>, ? extends java.lang.Object> r9, h.c.e<? super h.ab> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof androidx.compose.material.AnchoredDraggableState.AnonymousClass3
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.material.AnchoredDraggableState$anchoredDrag$3 r0 = (androidx.compose.material.AnchoredDraggableState.AnonymousClass3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.AnchoredDraggableState$anchoredDrag$3 r0 = new androidx.compose.material.AnchoredDraggableState$anchoredDrag$3
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            e.b.c.b(r10)     // Catch: java.lang.Throwable -> L2a
            goto L53
        L2a:
            r7 = move-exception
            goto L8b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            e.b.c.b(r10)
            androidx.compose.material.DraggableAnchors r10 = r6.getAnchors()
            boolean r10 = r10.hasAnchorFor(r7)
            if (r10 == 0) goto Lc4
            androidx.compose.material.InternalMutatorMutex r10 = r6.dragMutex     // Catch: java.lang.Throwable -> L2a
            androidx.compose.material.AnchoredDraggableState$anchoredDrag$4 r2 = new androidx.compose.material.AnchoredDraggableState$anchoredDrag$4     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r6, r7, r9, r5)     // Catch: java.lang.Throwable -> L2a
            h.g.a.l r2 = (h.g.a.l) r2     // Catch: java.lang.Throwable -> L2a
            r0.label = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r7 = r10.mutate(r8, r2, r0)     // Catch: java.lang.Throwable -> L2a
            if (r7 != r1) goto L53
            return r1
        L53:
            r6.setDragTarget(r5)
            androidx.compose.material.DraggableAnchors r7 = r6.getAnchors()
            float r8 = r6.getOffset()
            java.lang.Object r7 = r7.closestAnchor(r8)
            if (r7 == 0) goto Lc7
            float r8 = r6.getOffset()
            androidx.compose.material.DraggableAnchors r9 = r6.getAnchors()
            float r9 = r9.positionOf(r7)
            float r8 = r8 - r9
            float r8 = java.lang.Math.abs(r8)
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 > 0) goto Lc7
            h.g.a.l<T, java.lang.Boolean> r8 = r6.confirmValueChange
            java.lang.Object r8 = r8.invoke(r7)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lc7
            r6.setCurrentValue(r7)
            goto Lc7
        L8b:
            r6.setDragTarget(r5)
            androidx.compose.material.DraggableAnchors r8 = r6.getAnchors()
            float r9 = r6.getOffset()
            java.lang.Object r8 = r8.closestAnchor(r9)
            if (r8 == 0) goto Lc3
            float r9 = r6.getOffset()
            androidx.compose.material.DraggableAnchors r10 = r6.getAnchors()
            float r10 = r10.positionOf(r8)
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto Lc3
            h.g.a.l<T, java.lang.Boolean> r9 = r6.confirmValueChange
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto Lc0
            goto Lc3
        Lc0:
            r6.setCurrentValue(r8)
        Lc3:
            throw r7
        Lc4:
            r6.setCurrentValue(r7)
        Lc7:
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AnchoredDraggableState.anchoredDrag(java.lang.Object, androidx.compose.foundation.MutatePriority, h.g.a.r, h.c.e):java.lang.Object");
    }

    public final float dispatchRawDelta(float f2) {
        float fNewOffsetForDelta$material = newOffsetForDelta$material(f2);
        float offset = Float.isNaN(getOffset()) ? 0.0f : getOffset();
        setOffset(fNewOffsetForDelta$material);
        return fNewOffsetForDelta$material - offset;
    }

    public final DraggableAnchors<T> getAnchors() {
        return (DraggableAnchors) this.anchors$delegate.getValue();
    }

    public final AnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public final T getClosestValue$material() {
        return (T) this.closestValue$delegate.getValue();
    }

    public final l<T, Boolean> getConfirmValueChange$material() {
        return this.confirmValueChange;
    }

    public final T getCurrentValue() {
        return this.currentValue$delegate.getValue();
    }

    public final DraggableState getDraggableState$material() {
        return this.draggableState;
    }

    public final float getLastVelocity() {
        return this.lastVelocity$delegate.getFloatValue();
    }

    public final float getOffset() {
        return this.offset$delegate.getFloatValue();
    }

    public final l<Float, Float> getPositionalThreshold$material() {
        return this.positionalThreshold;
    }

    public final float getProgress() {
        return ((Number) this.progress$delegate.getValue()).floatValue();
    }

    public final T getTargetValue() {
        return (T) this.targetValue$delegate.getValue();
    }

    public final a<Float> getVelocityThreshold$material() {
        return this.velocityThreshold;
    }

    public final boolean isAnimationRunning() {
        return getDragTarget() != null;
    }

    public final float newOffsetForDelta$material(float f2) {
        return n.g((Float.isNaN(getOffset()) ? 0.0f : getOffset()) + f2, getAnchors().minAnchor(), getAnchors().maxAnchor());
    }

    public final float requireOffset() {
        if (Float.isNaN(getOffset())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return getOffset();
    }

    public final Object settle(float f2, e<? super ab> eVar) {
        T currentValue = getCurrentValue();
        T tComputeTarget = computeTarget(requireOffset(), currentValue, f2);
        if (this.confirmValueChange.invoke(tComputeTarget).booleanValue()) {
            Object objAnimateTo = AnchoredDraggableKt.animateTo(this, tComputeTarget, f2, eVar);
            if (objAnimateTo == h.c.a.a.f48038a) {
                return objAnimateTo;
            }
        } else {
            Object objAnimateTo2 = AnchoredDraggableKt.animateTo(this, currentValue, f2, eVar);
            if (objAnimateTo2 == h.c.a.a.f48038a) {
                return objAnimateTo2;
            }
        }
        return ab.f48028a;
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

        static final AnchoredDraggableState Saver$lambda$1(l lVar, a aVar, AnimationSpec animationSpec, l lVar2, Object obj) {
            return new AnchoredDraggableState(obj, lVar, aVar, animationSpec, lVar2);
        }

        public final <T> Saver<AnchoredDraggableState<T>, T> Saver(final AnimationSpec<Float> animationSpec, final l<? super T, Boolean> lVar, final l<? super Float, Float> lVar2, final a<Float> aVar) {
            return SaverKt.Saver(new p() { // from class: androidx.compose.material.AnchoredDraggableState$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnchoredDraggableState) obj2).getCurrentValue();
                }
            }, new l() { // from class: androidx.compose.material.AnchoredDraggableState$Companion$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return AnchoredDraggableState.Companion.Saver$lambda$1(lVar2, aVar, animationSpec, lVar, obj);
                }
            });
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, Object obj, MutatePriority mutatePriority, r rVar, e eVar, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(obj, mutatePriority, rVar, eVar);
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, DraggableAnchors draggableAnchors, l lVar, a aVar, AnimationSpec animationSpec, l lVar2, int i2, o oVar) {
        this(obj, draggableAnchors, lVar, aVar, animationSpec, (i2 & 32) != 0 ? new l() { // from class: androidx.compose.material.AnchoredDraggableState$$ExternalSyntheticLambda4
            @Override // h.g.a.l
            public final Object invoke(Object obj2) {
                return true;
            }
        } : lVar2);
    }

    public AnchoredDraggableState(T t, DraggableAnchors<T> draggableAnchors, l<? super Float, Float> lVar, a<Float> aVar, AnimationSpec<Float> animationSpec, l<? super T, Boolean> lVar2) {
        this(t, lVar, aVar, animationSpec, lVar2);
        setAnchors(draggableAnchors);
        trySnapTo(t);
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, l lVar, a aVar, AnimationSpec animationSpec, l lVar2, int i2, o oVar) {
        this(obj, lVar, aVar, animationSpec, (i2 & 16) != 0 ? new l() { // from class: androidx.compose.material.AnchoredDraggableState$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj2) {
                return true;
            }
        } : lVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object anchoredDrag(androidx.compose.foundation.MutatePriority r7, h.g.a.q<? super androidx.compose.material.AnchoredDragScope, ? super androidx.compose.material.DraggableAnchors<T>, ? super h.c.e<? super h.ab>, ? extends java.lang.Object> r8, h.c.e<? super h.ab> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.material.AnchoredDraggableState.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.material.AnchoredDraggableState$anchoredDrag$1 r0 = (androidx.compose.material.AnchoredDraggableState.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.AnchoredDraggableState$anchoredDrag$1 r0 = new androidx.compose.material.AnchoredDraggableState$anchoredDrag$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            e.b.c.b(r9)     // Catch: java.lang.Throwable -> L29
            goto L49
        L29:
            r7 = move-exception
            goto L80
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            e.b.c.b(r9)
            androidx.compose.material.InternalMutatorMutex r9 = r6.dragMutex     // Catch: java.lang.Throwable -> L29
            androidx.compose.material.AnchoredDraggableState$anchoredDrag$2 r2 = new androidx.compose.material.AnchoredDraggableState$anchoredDrag$2     // Catch: java.lang.Throwable -> L29
            r5 = 0
            r2.<init>(r6, r8, r5)     // Catch: java.lang.Throwable -> L29
            h.g.a.l r2 = (h.g.a.l) r2     // Catch: java.lang.Throwable -> L29
            r0.label = r4     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = r9.mutate(r7, r2, r0)     // Catch: java.lang.Throwable -> L29
            if (r7 != r1) goto L49
            return r1
        L49:
            androidx.compose.material.DraggableAnchors r7 = r6.getAnchors()
            float r8 = r6.getOffset()
            java.lang.Object r7 = r7.closestAnchor(r8)
            if (r7 == 0) goto L7d
            float r8 = r6.getOffset()
            androidx.compose.material.DraggableAnchors r9 = r6.getAnchors()
            float r9 = r9.positionOf(r7)
            float r8 = r8 - r9
            float r8 = java.lang.Math.abs(r8)
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 > 0) goto L7d
            h.g.a.l<T, java.lang.Boolean> r8 = r6.confirmValueChange
            java.lang.Object r8 = r8.invoke(r7)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7d
            r6.setCurrentValue(r7)
        L7d:
            h.ab r6 = h.ab.f48028a
            return r6
        L80:
            androidx.compose.material.DraggableAnchors r8 = r6.getAnchors()
            float r9 = r6.getOffset()
            java.lang.Object r8 = r8.closestAnchor(r9)
            if (r8 == 0) goto Lb5
            float r9 = r6.getOffset()
            androidx.compose.material.DraggableAnchors r0 = r6.getAnchors()
            float r0 = r0.positionOf(r8)
            float r9 = r9 - r0
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto Lb5
            h.g.a.l<T, java.lang.Boolean> r9 = r6.confirmValueChange
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto Lb2
            goto Lb5
        Lb2:
            r6.setCurrentValue(r8)
        Lb5:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AnchoredDraggableState.anchoredDrag(androidx.compose.foundation.MutatePriority, h.g.a.q, h.c.e):java.lang.Object");
    }
}
