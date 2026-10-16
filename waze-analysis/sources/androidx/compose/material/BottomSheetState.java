package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.material.BottomSheetState;
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
/* loaded from: classes.dex */
public final class BottomSheetState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final AnchoredDraggableState<BottomSheetValue> anchoredDraggableState;

    public BottomSheetState(BottomSheetValue bottomSheetValue, final Density density, AnimationSpec<Float> animationSpec, l<? super BottomSheetValue, Boolean> lVar) {
        this.anchoredDraggableState = new AnchoredDraggableState<>(bottomSheetValue, new l() { // from class: androidx.compose.material.BottomSheetState$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                Density density2 = density;
                ((Float) obj).floatValue();
                return Float.valueOf(density2.mo2127toPx0680j_4(BottomSheetScaffoldKt.BottomSheetScaffoldPositionalThreshold));
            }
        }, new a() { // from class: androidx.compose.material.BottomSheetState$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return Float.valueOf(density.mo2127toPx0680j_4(BottomSheetScaffoldKt.BottomSheetScaffoldVelocityThreshold));
            }
        }, animationSpec, lVar);
    }

    static final boolean _init_$lambda$0(BottomSheetValue bottomSheetValue) {
        return true;
    }

    public static /* synthetic */ Object animateTo$material$default(BottomSheetState bottomSheetState, BottomSheetValue bottomSheetValue, float f2, e eVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f2 = bottomSheetState.anchoredDraggableState.getLastVelocity();
        }
        return bottomSheetState.animateTo$material(bottomSheetValue, f2, eVar);
    }

    public final Object animateTo$material(BottomSheetValue bottomSheetValue, float f2, e<? super ab> eVar) {
        Object objAnimateTo = AnchoredDraggableKt.animateTo(this.anchoredDraggableState, bottomSheetValue, f2, eVar);
        return objAnimateTo == h.c.a.a.f48038a ? objAnimateTo : ab.f48028a;
    }

    public final Object collapse(e<? super ab> eVar) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, BottomSheetValue.Collapsed, 0.0f, eVar, 2, null);
        return objAnimateTo$default == h.c.a.a.f48038a ? objAnimateTo$default : ab.f48028a;
    }

    public final Object expand(e<? super ab> eVar) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, this.anchoredDraggableState.getAnchors().hasAnchorFor(BottomSheetValue.Expanded) ? BottomSheetValue.Expanded : BottomSheetValue.Collapsed, 0.0f, eVar, 2, null);
        return objAnimateTo$default == h.c.a.a.f48038a ? objAnimateTo$default : ab.f48028a;
    }

    public final AnchoredDraggableState<BottomSheetValue> getAnchoredDraggableState$material() {
        return this.anchoredDraggableState;
    }

    public final BottomSheetValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    public final float getProgress() {
        return this.anchoredDraggableState.getProgress();
    }

    public final BottomSheetValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final boolean isCollapsed() {
        return this.anchoredDraggableState.getCurrentValue() == BottomSheetValue.Collapsed;
    }

    public final boolean isExpanded() {
        return this.anchoredDraggableState.getCurrentValue() == BottomSheetValue.Expanded;
    }

    public final float progress(BottomSheetValue bottomSheetValue, BottomSheetValue bottomSheetValue2) {
        float fPositionOf = this.anchoredDraggableState.getAnchors().positionOf(bottomSheetValue);
        float fPositionOf2 = this.anchoredDraggableState.getAnchors().positionOf(bottomSheetValue2);
        float fG = (n.g(this.anchoredDraggableState.getOffset(), Math.min(fPositionOf, fPositionOf2), Math.max(fPositionOf, fPositionOf2)) - fPositionOf) / (fPositionOf2 - fPositionOf);
        if (Float.isNaN(fG)) {
            return 1.0f;
        }
        return Math.abs(fG);
    }

    public final float requireOffset() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final Object snapTo$material(BottomSheetValue bottomSheetValue, e<? super ab> eVar) {
        Object objSnapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, bottomSheetValue, eVar);
        return objSnapTo == h.c.a.a.f48038a ? objSnapTo : ab.f48028a;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        static final BottomSheetState Saver$lambda$1(Density density, AnimationSpec animationSpec, l lVar, BottomSheetValue bottomSheetValue) {
            return new BottomSheetState(bottomSheetValue, density, animationSpec, lVar);
        }

        public final Saver<BottomSheetState, ?> Saver(final AnimationSpec<Float> animationSpec, final l<? super BottomSheetValue, Boolean> lVar, final Density density) {
            return SaverKt.Saver(new p() { // from class: androidx.compose.material.BottomSheetState$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ((BottomSheetState) obj2).getAnchoredDraggableState$material().getCurrentValue();
                }
            }, new l() { // from class: androidx.compose.material.BottomSheetState$Companion$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return BottomSheetState.Companion.Saver$lambda$1(density, animationSpec, lVar, (BottomSheetValue) obj);
                }
            });
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public static /* synthetic */ void getProgress$annotations() {
    }

    public /* synthetic */ BottomSheetState(BottomSheetValue bottomSheetValue, Density density, AnimationSpec animationSpec, l lVar, int i2, o oVar) {
        this(bottomSheetValue, density, (i2 & 4) != 0 ? BottomSheetScaffoldDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i2 & 8) != 0 ? new l() { // from class: androidx.compose.material.BottomSheetState$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return true;
            }
        } : lVar);
    }
}
