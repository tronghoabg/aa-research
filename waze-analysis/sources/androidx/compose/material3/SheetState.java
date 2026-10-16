package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.unit.Density;
import h.ab;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SheetState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private AnimationSpec<Float> anchoredDraggableMotionSpec;
    private AnchoredDraggableState<SheetValue> anchoredDraggableState;
    private final l<SheetValue, Boolean> confirmValueChange;
    private FiniteAnimationSpec<Float> hideMotionSpec;
    private final a<Float> positionalThreshold;
    private FiniteAnimationSpec<Float> showMotionSpec;
    private final boolean skipHiddenState;
    private final boolean skipPartiallyExpanded;
    private final State targetValue$delegate;
    private final a<Float> velocityThreshold;

    /* JADX WARN: Multi-variable type inference failed */
    public SheetState(boolean z, a<Float> aVar, a<Float> aVar2, SheetValue sheetValue, l<? super SheetValue, Boolean> lVar, boolean z2) {
        this.skipPartiallyExpanded = z;
        this.positionalThreshold = aVar;
        this.velocityThreshold = aVar2;
        this.confirmValueChange = lVar;
        this.skipHiddenState = z2;
        if (z && sheetValue == SheetValue.PartiallyExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        if (z2 && sheetValue == SheetValue.Hidden) {
            throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.");
        }
        this.targetValue$delegate = SnapshotStateKt.derivedStateOf(new a() { // from class: androidx.compose.material3.SheetState$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return SheetState.targetValue_delegate$lambda$0(this.f$0);
            }
        });
        this.anchoredDraggableMotionSpec = SheetDefaultsKt.getBottomSheetAnimationSpec();
        this.anchoredDraggableState = new AnchoredDraggableState<>(sheetValue, lVar);
        this.showMotionSpec = AnimationSpecKt.snap$default(0, 1, null);
        this.hideMotionSpec = AnimationSpecKt.snap$default(0, 1, null);
    }

    static final boolean _init_$lambda$0(SheetValue sheetValue) {
        return true;
    }

    static final boolean _init_$lambda$3(SheetValue sheetValue) {
        return true;
    }

    private final SheetValue calculateTargetValueWithFix(float f2) {
        if (Float.isNaN(f2)) {
            return getCurrentValue();
        }
        float fPositionOf = this.anchoredDraggableState.getAnchors().positionOf(getCurrentValue());
        if (Float.isNaN(fPositionOf) || f2 == fPositionOf) {
            return getCurrentValue();
        }
        SheetValue sheetValueClosestAnchor = this.anchoredDraggableState.getAnchors().closestAnchor(f2);
        return sheetValueClosestAnchor != null ? sheetValueClosestAnchor : getCurrentValue();
    }

    static final SheetValue targetValue_delegate$lambda$0(SheetState sheetState) {
        return sheetState.isAnimationRunning() ? sheetState.anchoredDraggableState.getTargetValue() : sheetState.calculateTargetValueWithFix(sheetState.getOffset$material3());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object anchoredDrag$material3(androidx.compose.foundation.gestures.FlingBehavior r12, float r13, h.c.e<? super java.lang.Float> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof androidx.compose.material3.SheetState$anchoredDrag$1
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.material3.SheetState$anchoredDrag$1 r0 = (androidx.compose.material3.SheetState$anchoredDrag$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.SheetState$anchoredDrag$1 r0 = new androidx.compose.material3.SheetState$anchoredDrag$1
            r0.<init>(r11, r14)
        L18:
            r4 = r0
            java.lang.Object r14 = r4.result
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            java.lang.Object r11 = r4.L$0
            h.g.b.an r11 = (h.g.b.an) r11
            e.b.c.b(r14)
            goto L58
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            e.b.c.b(r14)
            h.g.b.an r6 = new h.g.b.an
            r6.<init>()
            androidx.compose.foundation.gestures.AnchoredDraggableState<androidx.compose.material3.SheetValue> r1 = r11.anchoredDraggableState
            androidx.compose.material3.SheetState$anchoredDrag$2 r5 = new androidx.compose.material3.SheetState$anchoredDrag$2
            r10 = 0
            r8 = r11
            r7 = r12
            r9 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            r11 = r6
            r3 = r5
            h.g.a.q r3 = (h.g.a.q) r3
            r4.L$0 = r11
            r4.label = r2
            r5 = 1
            r6 = 0
            r2 = 0
            java.lang.Object r12 = androidx.compose.foundation.gestures.AnchoredDraggableState.anchoredDrag$default(r1, r2, r3, r4, r5, r6)
            if (r12 == r0) goto L60
        L58:
            float r11 = r11.f48102a
            java.lang.Float r12 = new java.lang.Float
            r12.<init>(r11)
            return r12
        L60:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SheetState.anchoredDrag$material3(androidx.compose.foundation.gestures.FlingBehavior, float, h.c.e):java.lang.Object");
    }

    public final Object animateTo$material3(SheetValue sheetValue, FiniteAnimationSpec<Float> finiteAnimationSpec, e<? super ab> eVar) {
        Object objAnimateTo = AnchoredDraggableKt.animateTo(this.anchoredDraggableState, sheetValue, finiteAnimationSpec, eVar);
        return objAnimateTo == h.c.a.a.f48038a ? objAnimateTo : ab.f48028a;
    }

    public final Object expand(e<? super ab> eVar) {
        Object objAnimateTo$material3;
        return (this.confirmValueChange.invoke(SheetValue.Expanded).booleanValue() && (objAnimateTo$material3 = animateTo$material3(SheetValue.Expanded, this.showMotionSpec, eVar)) == h.c.a.a.f48038a) ? objAnimateTo$material3 : ab.f48028a;
    }

    public final AnimationSpec<Float> getAnchoredDraggableMotionSpec$material3() {
        return this.anchoredDraggableMotionSpec;
    }

    public final AnchoredDraggableState<SheetValue> getAnchoredDraggableState$material3() {
        return this.anchoredDraggableState;
    }

    public final l<SheetValue, Boolean> getConfirmValueChange$material3() {
        return this.confirmValueChange;
    }

    public final SheetValue getCurrentValue() {
        return this.anchoredDraggableState.getSettledValue();
    }

    public final boolean getHasExpandedState() {
        return this.anchoredDraggableState.getAnchors().hasPositionFor(SheetValue.Expanded);
    }

    public final boolean getHasPartiallyExpandedState() {
        return this.anchoredDraggableState.getAnchors().hasPositionFor(SheetValue.PartiallyExpanded);
    }

    public final FiniteAnimationSpec<Float> getHideMotionSpec$material3() {
        return this.hideMotionSpec;
    }

    public final float getOffset$material3() {
        return this.anchoredDraggableState.getOffset();
    }

    public final a<Float> getPositionalThreshold$material3() {
        return this.positionalThreshold;
    }

    public final FiniteAnimationSpec<Float> getShowMotionSpec$material3() {
        return this.showMotionSpec;
    }

    public final boolean getSkipHiddenState$material3() {
        return this.skipHiddenState;
    }

    public final boolean getSkipPartiallyExpanded$material3() {
        return this.skipPartiallyExpanded;
    }

    public final SheetValue getTargetValue() {
        return (SheetValue) this.targetValue$delegate.getValue();
    }

    public final a<Float> getVelocityThreshold$material3() {
        return this.velocityThreshold;
    }

    public final Object hide(e<? super ab> eVar) {
        Object objAnimateTo$material3;
        if (this.skipHiddenState) {
            throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
        }
        return (this.confirmValueChange.invoke(SheetValue.Hidden).booleanValue() && (objAnimateTo$material3 = animateTo$material3(SheetValue.Hidden, this.hideMotionSpec, eVar)) == h.c.a.a.f48038a) ? objAnimateTo$material3 : ab.f48028a;
    }

    public final boolean isAnimationRunning() {
        return this.anchoredDraggableState.isAnimationRunning();
    }

    public final boolean isVisible() {
        return this.anchoredDraggableState.getCurrentValue() != SheetValue.Hidden;
    }

    public final float newOffsetForDelta$material3(float f2) {
        return n.g((Float.isNaN(getOffset$material3()) ? 0.0f : getOffset$material3()) + f2, this.anchoredDraggableState.getAnchors().minPosition(), this.anchoredDraggableState.getAnchors().maxPosition());
    }

    public final Object partialExpand(e<? super ab> eVar) {
        Object objAnimateTo$material3;
        if (this.skipPartiallyExpanded) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        return (this.confirmValueChange.invoke(SheetValue.PartiallyExpanded).booleanValue() && (objAnimateTo$material3 = animateTo$material3(SheetValue.PartiallyExpanded, this.hideMotionSpec, eVar)) == h.c.a.a.f48038a) ? objAnimateTo$material3 : ab.f48028a;
    }

    public final float requireOffset() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final void setAnchoredDraggableMotionSpec$material3(AnimationSpec<Float> animationSpec) {
        this.anchoredDraggableMotionSpec = animationSpec;
    }

    public final void setAnchoredDraggableState$material3(AnchoredDraggableState<SheetValue> anchoredDraggableState) {
        this.anchoredDraggableState = anchoredDraggableState;
    }

    public final void setHideMotionSpec$material3(FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.hideMotionSpec = finiteAnimationSpec;
    }

    public final void setShowMotionSpec$material3(FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.showMotionSpec = finiteAnimationSpec;
    }

    public final Object show(e<? super ab> eVar) {
        Object objAnimateTo$material3;
        SheetValue sheetValue = getHasPartiallyExpandedState() ? SheetValue.PartiallyExpanded : SheetValue.Expanded;
        return (this.confirmValueChange.invoke(sheetValue).booleanValue() && (objAnimateTo$material3 = animateTo$material3(sheetValue, this.showMotionSpec, eVar)) == h.c.a.a.f48038a) ? objAnimateTo$material3 : ab.f48028a;
    }

    public final Object snapTo$material3(SheetValue sheetValue, e<? super ab> eVar) {
        Object objSnapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, sheetValue, eVar);
        return objSnapTo == h.c.a.a.f48038a ? objSnapTo : ab.f48028a;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        static final SheetState Saver$lambda$1(boolean z, a aVar, a aVar2, l lVar, boolean z2, SheetValue sheetValue) {
            if (z && sheetValue == SheetValue.PartiallyExpanded) {
                sheetValue = SheetValue.Expanded;
            }
            return new SheetState(z, aVar, aVar2, sheetValue, lVar, z2);
        }

        public final Saver<SheetState, SheetValue> Saver(final boolean z, final a<Float> aVar, final a<Float> aVar2, final l<? super SheetValue, Boolean> lVar, final boolean z2) {
            return SaverKt.Saver(new p() { // from class: androidx.compose.material3.SheetState$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ((SheetState) obj2).getCurrentValue();
                }
            }, new l() { // from class: androidx.compose.material3.SheetState$Companion$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return SheetState.Companion.Saver$lambda$1(z, aVar, aVar2, lVar, z2, (SheetValue) obj);
                }
            });
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final /* synthetic */ Saver Saver(boolean z, l lVar, final Density density, boolean z2) {
            return Saver(z, new a() { // from class: androidx.compose.material3.SheetState$Companion$$ExternalSyntheticLambda2
                @Override // h.g.a.a
                public final Object invoke() {
                    return Float.valueOf(density.mo2127toPx0680j_4(BottomSheetDefaults.INSTANCE.m4391getPositionalThresholdD9Ej5fM$material3()));
                }
            }, new a() { // from class: androidx.compose.material3.SheetState$Companion$$ExternalSyntheticLambda3
                @Override // h.g.a.a
                public final Object invoke() {
                    return Float.valueOf(density.mo2127toPx0680j_4(BottomSheetDefaults.INSTANCE.m4394getVelocityThresholdD9Ej5fM$material3()));
                }
            }, lVar, z2);
        }
    }

    public static /* synthetic */ void getAnchoredDraggableState$material3$annotations() {
    }

    public /* synthetic */ SheetState(boolean z, Density density, SheetValue sheetValue, l lVar, boolean z2, int i2, o oVar) {
        this(z, density, (i2 & 4) != 0 ? SheetValue.Hidden : sheetValue, (i2 & 8) != 0 ? new l() { // from class: androidx.compose.material3.SheetState$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return true;
            }
        } : lVar, ((i2 & 16) == 0) & z2);
    }

    public /* synthetic */ SheetState(boolean z, final Density density, SheetValue sheetValue, l lVar, boolean z2) {
        this(z, new a() { // from class: androidx.compose.material3.SheetState$$ExternalSyntheticLambda3
            @Override // h.g.a.a
            public final Object invoke() {
                return Float.valueOf(density.mo2127toPx0680j_4(BottomSheetDefaults.INSTANCE.m4391getPositionalThresholdD9Ej5fM$material3()));
            }
        }, new a() { // from class: androidx.compose.material3.SheetState$$ExternalSyntheticLambda4
            @Override // h.g.a.a
            public final Object invoke() {
                return Float.valueOf(density.mo2127toPx0680j_4(BottomSheetDefaults.INSTANCE.m4394getVelocityThresholdD9Ej5fM$material3()));
            }
        }, sheetValue, lVar, z2);
    }

    public /* synthetic */ SheetState(boolean z, a aVar, a aVar2, SheetValue sheetValue, l lVar, boolean z2, int i2, o oVar) {
        this(z, aVar, aVar2, (i2 & 8) != 0 ? SheetValue.Hidden : sheetValue, (i2 & 16) != 0 ? new l() { // from class: androidx.compose.material3.SheetState$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return true;
            }
        } : lVar, ((i2 & 32) == 0) & z2);
    }
}
