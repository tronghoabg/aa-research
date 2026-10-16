package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.material.BottomDrawerState;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Density;
import h.ab;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BottomDrawerState {
    private final AnchoredDraggableState<BottomDrawerValue> anchoredDraggableState;
    private Density density;
    private final NestedScrollConnection nestedScrollConnection;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public BottomDrawerState(BottomDrawerValue bottomDrawerValue, final Density density, l<? super BottomDrawerValue, Boolean> lVar, AnimationSpec<Float> animationSpec) {
        AnchoredDraggableState<BottomDrawerValue> anchoredDraggableState = new AnchoredDraggableState<>(bottomDrawerValue, new l() { // from class: androidx.compose.material.BottomDrawerState$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                Density density2 = density;
                ((Float) obj).floatValue();
                return Float.valueOf(density2.mo2127toPx0680j_4(DrawerKt.DrawerPositionalThreshold));
            }
        }, new a() { // from class: androidx.compose.material.BottomDrawerState$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return Float.valueOf(density.mo2127toPx0680j_4(DrawerKt.DrawerVelocityThreshold));
            }
        }, animationSpec, lVar);
        this.anchoredDraggableState = anchoredDraggableState;
        this.nestedScrollConnection = DrawerKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(anchoredDraggableState);
    }

    static final boolean _init_$lambda$0(BottomDrawerValue bottomDrawerValue) {
        return true;
    }

    public static /* synthetic */ Object animateTo$material$default(BottomDrawerState bottomDrawerState, BottomDrawerValue bottomDrawerValue, float f2, e eVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f2 = bottomDrawerState.anchoredDraggableState.getLastVelocity();
        }
        return bottomDrawerState.animateTo$material(bottomDrawerValue, f2, eVar);
    }

    private final boolean isOpenEnabled() {
        return this.anchoredDraggableState.getAnchors().hasAnchorFor(BottomDrawerValue.Open);
    }

    public final Object animateTo$material(BottomDrawerValue bottomDrawerValue, float f2, e<? super ab> eVar) {
        Object objAnimateTo = AnchoredDraggableKt.animateTo(this.anchoredDraggableState, bottomDrawerValue, f2, eVar);
        return objAnimateTo == h.c.a.a.f48038a ? objAnimateTo : ab.f48028a;
    }

    public final Object close(e<? super ab> eVar) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, BottomDrawerValue.Closed, 0.0f, eVar, 2, null);
        return objAnimateTo$default == h.c.a.a.f48038a ? objAnimateTo$default : ab.f48028a;
    }

    public final boolean confirmStateChange$material(BottomDrawerValue bottomDrawerValue) {
        return this.anchoredDraggableState.getConfirmValueChange$material().invoke(bottomDrawerValue).booleanValue();
    }

    public final Object expand(e<? super ab> eVar) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, BottomDrawerValue.Expanded, 0.0f, eVar, 2, null);
        return objAnimateTo$default == h.c.a.a.f48038a ? objAnimateTo$default : ab.f48028a;
    }

    public final AnchoredDraggableState<BottomDrawerValue> getAnchoredDraggableState$material() {
        return this.anchoredDraggableState;
    }

    public final BottomDrawerValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    public final Density getDensity$material() {
        return this.density;
    }

    public final NestedScrollConnection getNestedScrollConnection$material() {
        return this.nestedScrollConnection;
    }

    public final float getOffset() {
        return this.anchoredDraggableState.getOffset();
    }

    public final float getProgress() {
        return this.anchoredDraggableState.getProgress();
    }

    public final BottomDrawerValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final boolean isClosed() {
        return this.anchoredDraggableState.getCurrentValue() == BottomDrawerValue.Closed;
    }

    public final boolean isExpanded() {
        return this.anchoredDraggableState.getCurrentValue() == BottomDrawerValue.Expanded;
    }

    public final boolean isOpen() {
        return this.anchoredDraggableState.getCurrentValue() != BottomDrawerValue.Closed;
    }

    public final Object open(e<? super ab> eVar) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, isOpenEnabled() ? BottomDrawerValue.Open : BottomDrawerValue.Expanded, 0.0f, eVar, 2, null);
        return objAnimateTo$default == h.c.a.a.f48038a ? objAnimateTo$default : ab.f48028a;
    }

    public final float progress(BottomDrawerValue bottomDrawerValue, BottomDrawerValue bottomDrawerValue2) {
        float fPositionOf = this.anchoredDraggableState.getAnchors().positionOf(bottomDrawerValue);
        float fPositionOf2 = this.anchoredDraggableState.getAnchors().positionOf(bottomDrawerValue2);
        float fG = (n.g(this.anchoredDraggableState.getOffset(), Math.min(fPositionOf, fPositionOf2), Math.max(fPositionOf, fPositionOf2)) - fPositionOf) / (fPositionOf2 - fPositionOf);
        if (Float.isNaN(fG)) {
            return 1.0f;
        }
        return Math.abs(fG);
    }

    public final float requireOffset$material() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final void setDensity$material(Density density) {
        this.density = density;
    }

    public final Object snapTo$material(BottomDrawerValue bottomDrawerValue, e<? super ab> eVar) {
        Object objSnapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, bottomDrawerValue, eVar);
        return objSnapTo == h.c.a.a.f48038a ? objSnapTo : ab.f48028a;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        static final BottomDrawerState Saver$lambda$1(Density density, l lVar, AnimationSpec animationSpec, BottomDrawerValue bottomDrawerValue) {
            return new BottomDrawerState(bottomDrawerValue, density, lVar, animationSpec);
        }

        public final Saver<BottomDrawerState, BottomDrawerValue> Saver(final Density density, final l<? super BottomDrawerValue, Boolean> lVar, final AnimationSpec<Float> animationSpec) {
            return SaverKt.Saver(new p() { // from class: androidx.compose.material.BottomDrawerState$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ((BottomDrawerState) obj2).getAnchoredDraggableState$material().getCurrentValue();
                }
            }, new l() { // from class: androidx.compose.material.BottomDrawerState$Companion$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return BottomDrawerState.Companion.Saver$lambda$1(density, lVar, animationSpec, (BottomDrawerValue) obj);
                }
            });
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public static /* synthetic */ void getProgress$annotations() {
    }

    public /* synthetic */ BottomDrawerState(BottomDrawerValue bottomDrawerValue, Density density, l lVar, TweenSpec<Float> tweenSpec, int i2, o oVar) {
        this(bottomDrawerValue, density, (i2 & 4) != 0 ? new l() { // from class: androidx.compose.material.BottomDrawerState$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return true;
            }
        } : lVar, (i2 & 8) != 0 ? DrawerDefaults.INSTANCE.getAnimationSpec() : tweenSpec);
    }
}
