package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.material.SwipeableState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import e.b.c;
import h.a.r;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.an;
import h.g.b.o;
import h.g.b.x;
import h.k.n;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.b.aj;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class SwipeableState<T> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final MutableFloatState absoluteOffset;
    private final MutableState anchors$delegate;
    private final AnimationSpec<Float> animationSpec;
    private final MutableState<Float> animationTarget;
    private final l<T, Boolean> confirmStateChange;
    private final MutableState currentValue$delegate;
    private final DraggableState draggableState;
    private final MutableState isAnimationRunning$delegate;
    private final k<Map<Float, T>> latestNonEmptyAnchorsFlow;
    private float maxBound;
    private float minBound;
    private final MutableFloatState offsetState;
    private final MutableFloatState overflowState;
    private final MutableState resistance$delegate;
    private final MutableState thresholds$delegate;
    private final MutableFloatState velocityThreshold$delegate;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material.SwipeableState$animateInternalToOffset$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<DragScope, e<? super ab>, Object> {
        final /* synthetic */ AnimationSpec<Float> $spec;
        final /* synthetic */ float $target;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SwipeableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(SwipeableState<T> swipeableState, float f2, AnimationSpec<Float> animationSpec, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.this$0 = swipeableState;
            this.$target = f2;
            this.$spec = animationSpec;
        }

        static final ab invokeSuspend$lambda$0(DragScope dragScope, an anVar, Animatable animatable) {
            dragScope.dragBy(((Number) animatable.getValue()).floatValue() - anVar.f48102a);
            anVar.f48102a = ((Number) animatable.getValue()).floatValue();
            return ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$target, this.$spec, eVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // h.g.a.p
        public final Object invoke(DragScope dragScope, e<? super ab> eVar) {
            return ((AnonymousClass2) create(dragScope, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            Object objAnimateTo$default;
            a aVar = a.f48038a;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    c.b(obj);
                    final DragScope dragScope = (DragScope) this.L$0;
                    final an anVar = new an();
                    anVar.f48102a = ((SwipeableState) this.this$0).absoluteOffset.getFloatValue();
                    ((SwipeableState) this.this$0).animationTarget.setValue(new Float(this.$target));
                    this.this$0.setAnimationRunning(true);
                    this.label = 1;
                    objAnimateTo$default = Animatable.animateTo$default(AnimatableKt.Animatable$default(anVar.f48102a, 0.0f, 2, null), new Float(this.$target), this.$spec, null, new l() { // from class: androidx.compose.material.SwipeableState$animateInternalToOffset$2$$ExternalSyntheticLambda0
                        @Override // h.g.a.l
                        public final Object invoke(Object obj2) {
                            return SwipeableState.AnonymousClass2.invokeSuspend$lambda$0(dragScope, anVar, (Animatable) obj2);
                        }
                    }, this, 4, null);
                    if (objAnimateTo$default == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c.b(obj);
                    objAnimateTo$default = obj;
                }
                ((SwipeableState) this.this$0).animationTarget.setValue(null);
                this.this$0.setAnimationRunning(false);
                return ab.f48028a;
            } catch (Throwable th) {
                ((SwipeableState) this.this$0).animationTarget.setValue(null);
                this.this$0.setAnimationRunning(false);
                throw th;
            }
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material.SwipeableState$snapInternalToOffset$2, reason: invalid class name and case insensitive filesystem */
    final class C03342 extends g implements p<DragScope, e<? super ab>, Object> {
        final /* synthetic */ float $target;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SwipeableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03342(float f2, SwipeableState<T> swipeableState, e<? super C03342> eVar) {
            super(2, eVar);
            this.$target = f2;
            this.this$0 = swipeableState;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C03342 c03342 = new C03342(this.$target, this.this$0, eVar);
            c03342.L$0 = obj;
            return c03342;
        }

        @Override // h.g.a.p
        public final Object invoke(DragScope dragScope, e<? super ab> eVar) {
            return ((C03342) create(dragScope, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            ((DragScope) this.L$0).dragBy(this.$target - ((SwipeableState) this.this$0).absoluteOffset.getFloatValue());
            return ab.f48028a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableState(T t, AnimationSpec<Float> animationSpec, l<? super T, Boolean> lVar) {
        this.animationSpec = animationSpec;
        this.confirmStateChange = lVar;
        this.currentValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.isAnimationRunning$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.offsetState = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.overflowState = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.absoluteOffset = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.animationTarget = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.anchors$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r.j(), null, 2, null);
        final k kVarSnapshotFlow = SnapshotStateKt.snapshotFlow(new h.g.a.a() { // from class: androidx.compose.material.SwipeableState$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.getAnchors$material();
            }
        });
        this.latestNonEmptyAnchorsFlow = new aj(new k<Map<Float, ? extends T>>() { // from class: androidx.compose.material.SwipeableState$special$$inlined$filter$1

            /* compiled from: WazeSource */
            /* renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements kotlinx.coroutines.b.l {
                final /* synthetic */ kotlinx.coroutines.b.l $this_unsafeFlow;

                /* renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1, reason: invalid class name */
                public final class AnonymousClass1 extends h.c.b.a.c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(e eVar) {
                        super(eVar);
                    }

                    @Override // h.c.b.a.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.b.l lVar) {
                    this.$this_unsafeFlow = lVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.b.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, h.c.e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1 r0 = (androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1 r0 = new androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        h.c.a.a r1 = h.c.a.a.f48038a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        e.b.c.b(r6)
                        goto L49
                    L27:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L2f:
                        e.b.c.b(r6)
                        kotlinx.coroutines.b.l r4 = r4.$this_unsafeFlow
                        r6 = r0
                        h.c.e r6 = (h.c.e) r6
                        r6 = r5
                        java.util.Map r6 = (java.util.Map) r6
                        boolean r6 = r6.isEmpty()
                        if (r6 != 0) goto L49
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r5, r0)
                        if (r4 != r1) goto L49
                        return r1
                    L49:
                        h.ab r4 = h.ab.f48028a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, h.c.e):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.b.k
            public Object collect(kotlinx.coroutines.b.l lVar2, e eVar) {
                Object objCollect = kVarSnapshotFlow.collect(new AnonymousClass2(lVar2), eVar);
                return objCollect == a.f48038a ? objCollect : ab.f48028a;
            }
        }, 2);
        this.minBound = Float.NEGATIVE_INFINITY;
        this.maxBound = Float.POSITIVE_INFINITY;
        this.thresholds$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new p() { // from class: androidx.compose.material.SwipeableState$$ExternalSyntheticLambda1
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                ((Float) obj).floatValue();
                ((Float) obj2).floatValue();
                return Float.valueOf(0.0f);
            }
        }, null, 2, null);
        this.velocityThreshold$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.resistance$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.draggableState = DraggableKt.DraggableState(new l() { // from class: androidx.compose.material.SwipeableState$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SwipeableState.draggableState$lambda$0(this.f$0, ((Float) obj).floatValue());
            }
        });
    }

    static final boolean _init_$lambda$0(Object obj) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateInternalToOffset(float f2, AnimationSpec<Float> animationSpec, e<? super ab> eVar) {
        Object objDrag$default = DraggableState.CC.drag$default(this.draggableState, null, new AnonymousClass2(this, f2, animationSpec, null), eVar, 1, null);
        return objDrag$default == a.f48038a ? objDrag$default : ab.f48028a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(SwipeableState swipeableState, Object obj, AnimationSpec animationSpec, e eVar, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
        }
        if ((i2 & 2) != 0) {
            animationSpec = swipeableState.animationSpec;
        }
        return swipeableState.animateTo(obj, animationSpec, eVar);
    }

    static final ab draggableState$lambda$0(SwipeableState swipeableState, float f2) {
        float floatValue = swipeableState.absoluteOffset.getFloatValue() + f2;
        float fG = n.g(floatValue, swipeableState.minBound, swipeableState.maxBound);
        float f3 = floatValue - fG;
        ResistanceConfig resistance$material = swipeableState.getResistance$material();
        swipeableState.offsetState.setFloatValue(fG + (resistance$material != null ? resistance$material.computeResistance(f3) : 0.0f));
        swipeableState.overflowState.setFloatValue(f3);
        swipeableState.absoluteOffset.setFloatValue(floatValue);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAnimationRunning(boolean z) {
        this.isAnimationRunning$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentValue(T t) {
        this.currentValue$delegate.setValue(t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object snapInternalToOffset(float f2, e<? super ab> eVar) {
        Object objDrag$default = DraggableState.CC.drag$default(this.draggableState, null, new C03342(f2, this, null), eVar, 1, null);
        return objDrag$default == a.f48038a ? objDrag$default : ab.f48028a;
    }

    static final float thresholds_delegate$lambda$0(float f2, float f3) {
        return 0.0f;
    }

    public final Object animateTo(T t, AnimationSpec<Float> animationSpec, e<? super ab> eVar) {
        Object objCollect = this.latestNonEmptyAnchorsFlow.collect(new C03322(t, this, animationSpec), eVar);
        return objCollect == a.f48038a ? objCollect : ab.f48028a;
    }

    public final void ensureInit$material(Map<Float, ? extends T> map) {
        if (getAnchors$material().isEmpty()) {
            Float offset = SwipeableKt.getOffset(map, getCurrentValue());
            if (offset == null) {
                throw new IllegalArgumentException("The initial value must have an associated anchor.");
            }
            this.offsetState.setFloatValue(offset.floatValue());
            this.absoluteOffset.setFloatValue(offset.floatValue());
        }
    }

    public final Map<Float, T> getAnchors$material() {
        return (Map) this.anchors$delegate.getValue();
    }

    public final AnimationSpec<Float> getAnimationSpec$material() {
        return this.animationSpec;
    }

    public final l<T, Boolean> getConfirmStateChange$material() {
        return this.confirmStateChange;
    }

    public final T getCurrentValue() {
        return this.currentValue$delegate.getValue();
    }

    public final float getDirection() {
        Float offset = SwipeableKt.getOffset(getAnchors$material(), getCurrentValue());
        if (offset == null) {
            return 0.0f;
        }
        return Math.signum(getOffset().getValue().floatValue() - offset.floatValue());
    }

    public final DraggableState getDraggableState$material() {
        return this.draggableState;
    }

    public final float getMaxBound$material() {
        return this.maxBound;
    }

    public final float getMinBound$material() {
        return this.minBound;
    }

    public final State<Float> getOffset() {
        return this.offsetState;
    }

    public final State<Float> getOverflow() {
        return this.overflowState;
    }

    public final SwipeProgress<T> getProgress() {
        Object currentValue;
        float fFloatValue;
        Object objH;
        List listFindBounds = SwipeableKt.findBounds(getOffset().getValue().floatValue(), getAnchors$material().keySet());
        int size = listFindBounds.size();
        if (size == 0) {
            T currentValue2 = getCurrentValue();
            currentValue = getCurrentValue();
            fFloatValue = 1.0f;
            objH = currentValue2;
        } else if (size != 1) {
            h.k kVar = getDirection() > 0.0f ? new h.k(listFindBounds.get(0), listFindBounds.get(1)) : new h.k(listFindBounds.get(1), listFindBounds.get(0));
            float fFloatValue2 = ((Number) kVar.a()).floatValue();
            float fFloatValue3 = ((Number) kVar.b()).floatValue();
            objH = r.h(getAnchors$material(), Float.valueOf(fFloatValue2));
            currentValue = r.h(getAnchors$material(), Float.valueOf(fFloatValue3));
            fFloatValue = (getOffset().getValue().floatValue() - fFloatValue2) / (fFloatValue3 - fFloatValue2);
        } else {
            Object objH2 = r.h(getAnchors$material(), listFindBounds.get(0));
            currentValue = r.h(getAnchors$material(), listFindBounds.get(0));
            fFloatValue = 1.0f;
            objH = objH2;
        }
        return new SwipeProgress<>(objH, currentValue, fFloatValue);
    }

    public final ResistanceConfig getResistance$material() {
        return (ResistanceConfig) this.resistance$delegate.getValue();
    }

    public final T getTargetValue() {
        float fComputeTarget;
        Float value = this.animationTarget.getValue();
        if (value != null) {
            fComputeTarget = value.floatValue();
        } else {
            float fFloatValue = getOffset().getValue().floatValue();
            Float offset = SwipeableKt.getOffset(getAnchors$material(), getCurrentValue());
            fComputeTarget = SwipeableKt.computeTarget(fFloatValue, offset != null ? offset.floatValue() : getOffset().getValue().floatValue(), getAnchors$material().keySet(), getThresholds$material(), 0.0f, Float.POSITIVE_INFINITY);
        }
        T t = getAnchors$material().get(Float.valueOf(fComputeTarget));
        return t == null ? getCurrentValue() : t;
    }

    public final p<Float, Float, Float> getThresholds$material() {
        return (p) this.thresholds$delegate.getValue();
    }

    public final float getVelocityThreshold$material() {
        return this.velocityThreshold$delegate.getFloatValue();
    }

    public final boolean isAnimationRunning() {
        return ((Boolean) this.isAnimationRunning$delegate.getValue()).booleanValue();
    }

    public final float performDrag(float f2) {
        float fG = n.g(this.absoluteOffset.getFloatValue() + f2, this.minBound, this.maxBound) - this.absoluteOffset.getFloatValue();
        if (Math.abs(fG) > 0.0f) {
            this.draggableState.dispatchRawDelta(fG);
        }
        return fG;
    }

    public final Object performFling(final float f2, e<? super ab> eVar) {
        Object objCollect = this.latestNonEmptyAnchorsFlow.collect(new kotlinx.coroutines.b.l(this) { // from class: androidx.compose.material.SwipeableState.performFling.2
            final /* synthetic */ SwipeableState<T> this$0;

            {
                this.this$0 = this;
            }

            public final Object emit(Map<Float, ? extends T> map, e<? super ab> eVar2) {
                Float offset = SwipeableKt.getOffset(map, this.this$0.getCurrentValue());
                if (offset == null) {
                    x.g();
                }
                SwipeableState<T> swipeableState = this.this$0;
                float fFloatValue = offset.floatValue();
                float fFloatValue2 = swipeableState.getOffset().getValue().floatValue();
                Set<Float> setKeySet = map.keySet();
                SwipeableState<T> swipeableState2 = this.this$0;
                T t = map.get(new Float(SwipeableKt.computeTarget(fFloatValue2, fFloatValue, setKeySet, swipeableState2.getThresholds$material(), f2, swipeableState2.getVelocityThreshold$material())));
                if (t == null || !this.this$0.getConfirmStateChange$material().invoke(t).booleanValue()) {
                    SwipeableState<T> swipeableState3 = this.this$0;
                    Object objAnimateInternalToOffset = swipeableState3.animateInternalToOffset(fFloatValue, swipeableState3.getAnimationSpec$material(), eVar2);
                    if (objAnimateInternalToOffset == a.f48038a) {
                        return objAnimateInternalToOffset;
                    }
                } else {
                    Object objAnimateTo$default = SwipeableState.animateTo$default(this.this$0, t, null, eVar2, 2, null);
                    if (objAnimateTo$default == a.f48038a) {
                        return objAnimateTo$default;
                    }
                }
                return ab.f48028a;
            }

            @Override // kotlinx.coroutines.b.l
            public /* bridge */ /* synthetic */ Object emit(Object obj, e eVar2) {
                return emit((Map) obj, (e<? super ab>) eVar2);
            }
        }, eVar);
        return objCollect == a.f48038a ? objCollect : ab.f48028a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
    
        if (snapInternalToOffset(r10, r0) == r1) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c6, code lost:
    
        if (animateInternalToOffset(r10, r12, r0) == r1) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x020a, code lost:
    
        if (r12 != r1) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x020c, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f6 A[PHI: r10
  0x01f6: PHI (r10v12 java.lang.Float) = (r10v23 java.lang.Float), (r10v61 java.lang.Float) binds: [B:101:0x0238, B:91:0x01f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r10v57, types: [java.lang.Float] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processNewAnchors$material(java.util.Map<java.lang.Float, ? extends T> r10, java.util.Map<java.lang.Float, ? extends T> r11, h.c.e<? super h.ab> r12) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState.processNewAnchors$material(java.util.Map, java.util.Map, h.c.e):java.lang.Object");
    }

    public final void setAnchors$material(Map<Float, ? extends T> map) {
        this.anchors$delegate.setValue(map);
    }

    public final void setMaxBound$material(float f2) {
        this.maxBound = f2;
    }

    public final void setMinBound$material(float f2) {
        this.minBound = f2;
    }

    public final void setResistance$material(ResistanceConfig resistanceConfig) {
        this.resistance$delegate.setValue(resistanceConfig);
    }

    public final void setThresholds$material(p<? super Float, ? super Float, Float> pVar) {
        this.thresholds$delegate.setValue(pVar);
    }

    public final void setVelocityThreshold$material(float f2) {
        this.velocityThreshold$delegate.setFloatValue(f2);
    }

    public final Object snapTo(T t, e<? super ab> eVar) {
        Object objCollect = this.latestNonEmptyAnchorsFlow.collect(new C03352(t, this), eVar);
        return objCollect == a.f48038a ? objCollect : ab.f48028a;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        static final SwipeableState Saver$lambda$1(AnimationSpec animationSpec, l lVar, Object obj) {
            return new SwipeableState(obj, animationSpec, lVar);
        }

        public final <T> Saver<SwipeableState<T>, T> Saver(final AnimationSpec<Float> animationSpec, final l<? super T, Boolean> lVar) {
            return SaverKt.Saver(new p() { // from class: androidx.compose.material.SwipeableState$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ((SwipeableState) obj2).getCurrentValue();
                }
            }, new l() { // from class: androidx.compose.material.SwipeableState$Companion$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return SwipeableState.Companion.Saver$lambda$1(animationSpec, lVar, obj);
                }
            });
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public static /* synthetic */ void getDirection$annotations() {
    }

    public static /* synthetic */ void getProgress$annotations() {
    }

    public static /* synthetic */ void getTargetValue$annotations() {
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material.SwipeableState$snapTo$2, reason: invalid class name and case insensitive filesystem */
    final class C03352<T> implements kotlinx.coroutines.b.l {
        final /* synthetic */ T $targetValue;
        final /* synthetic */ SwipeableState<T> this$0;

        C03352(T t, SwipeableState<T> swipeableState) {
            this.$targetValue = t;
            this.this$0 = swipeableState;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.util.Map<java.lang.Float, ? extends T> r5, h.c.e<? super h.ab> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof androidx.compose.material.SwipeableState$snapTo$2$emit$1
                if (r0 == 0) goto L13
                r0 = r6
                androidx.compose.material.SwipeableState$snapTo$2$emit$1 r0 = (androidx.compose.material.SwipeableState$snapTo$2$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.material.SwipeableState$snapTo$2$emit$1 r0 = new androidx.compose.material.SwipeableState$snapTo$2$emit$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                h.c.a.a r1 = h.c.a.a.f48038a
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                e.b.c.b(r6)
                goto L49
            L27:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L2f:
                e.b.c.b(r6)
                T r6 = r4.$targetValue
                java.lang.Float r5 = androidx.compose.material.SwipeableKt.access$getOffset(r5, r6)
                if (r5 == 0) goto L53
                androidx.compose.material.SwipeableState<T> r6 = r4.this$0
                float r5 = r5.floatValue()
                r0.label = r3
                java.lang.Object r5 = androidx.compose.material.SwipeableState.access$snapInternalToOffset(r6, r5, r0)
                if (r5 != r1) goto L49
                return r1
            L49:
                androidx.compose.material.SwipeableState<T> r5 = r4.this$0
                T r4 = r4.$targetValue
                androidx.compose.material.SwipeableState.access$setCurrentValue(r5, r4)
                h.ab r4 = h.ab.f48028a
                return r4
            L53:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "The target value must have an associated anchor."
                r4.<init>(r5)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState.C03352.emit(java.util.Map, h.c.e):java.lang.Object");
        }

        @Override // kotlinx.coroutines.b.l
        public /* bridge */ /* synthetic */ Object emit(Object obj, e eVar) {
            return emit((Map) obj, (e<? super ab>) eVar);
        }
    }

    public /* synthetic */ SwipeableState(Object obj, SpringSpec<Float> springSpec, l lVar, int i2, o oVar) {
        this(obj, (i2 & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : springSpec, (i2 & 4) != 0 ? new l() { // from class: androidx.compose.material.SwipeableState$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj2) {
                return true;
            }
        } : lVar);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material.SwipeableState$animateTo$2, reason: invalid class name and case insensitive filesystem */
    final class C03322<T> implements kotlinx.coroutines.b.l {
        final /* synthetic */ AnimationSpec<Float> $anim;
        final /* synthetic */ T $targetValue;
        final /* synthetic */ SwipeableState<T> this$0;

        C03322(T t, SwipeableState<T> swipeableState, AnimationSpec<Float> animationSpec) {
            this.$targetValue = t;
            this.this$0 = swipeableState;
            this.$anim = animationSpec;
        }

        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.util.Map<java.lang.Float, ? extends T> r7, h.c.e<? super h.ab> r8) {
            /*
                Method dump skipped, instructions count: 280
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState.C03322.emit(java.util.Map, h.c.e):java.lang.Object");
        }

        @Override // kotlinx.coroutines.b.l
        public /* bridge */ /* synthetic */ Object emit(Object obj, e eVar) {
            return emit((Map) obj, (e<? super ab>) eVar);
        }
    }
}
