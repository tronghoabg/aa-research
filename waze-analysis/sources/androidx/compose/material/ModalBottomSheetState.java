package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.material.ModalBottomSheetState;
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
public final class ModalBottomSheetState {
    private final AnchoredDraggableState<ModalBottomSheetValue> anchoredDraggableState;
    private final AnimationSpec<Float> animationSpec;
    private final boolean isSkipHalfExpanded;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ModalBottomSheetValue.values().length];
            try {
                iArr[ModalBottomSheetValue.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ModalBottomSheetState(ModalBottomSheetValue modalBottomSheetValue, final Density density, l<? super ModalBottomSheetValue, Boolean> lVar, AnimationSpec<Float> animationSpec, boolean z) {
        this.animationSpec = animationSpec;
        this.isSkipHalfExpanded = z;
        this.anchoredDraggableState = new AnchoredDraggableState<>(modalBottomSheetValue, new l() { // from class: androidx.compose.material.ModalBottomSheetState$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                Density density2 = density;
                ((Float) obj).floatValue();
                return Float.valueOf(density2.mo2127toPx0680j_4(ModalBottomSheetKt.ModalBottomSheetPositionalThreshold));
            }
        }, new a() { // from class: androidx.compose.material.ModalBottomSheetState$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return Float.valueOf(density.mo2127toPx0680j_4(ModalBottomSheetKt.ModalBottomSheetVelocityThreshold));
            }
        }, animationSpec, lVar);
        if (z && modalBottomSheetValue == ModalBottomSheetValue.HalfExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.");
        }
    }

    static final boolean _init_$lambda$0(ModalBottomSheetValue modalBottomSheetValue) {
        return true;
    }

    public static /* synthetic */ Object animateTo$material$default(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, float f2, e eVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f2 = modalBottomSheetState.anchoredDraggableState.getLastVelocity();
        }
        return modalBottomSheetState.animateTo$material(modalBottomSheetValue, f2, eVar);
    }

    public final Object animateTo$material(ModalBottomSheetValue modalBottomSheetValue, float f2, e<? super ab> eVar) {
        Object objAnimateTo = AnchoredDraggableKt.animateTo(this.anchoredDraggableState, modalBottomSheetValue, f2, eVar);
        return objAnimateTo == h.c.a.a.f48038a ? objAnimateTo : ab.f48028a;
    }

    public final Object expand$material(e<? super ab> eVar) {
        Object objAnimateTo$material$default;
        return (this.anchoredDraggableState.getAnchors().hasAnchorFor(ModalBottomSheetValue.Expanded) && (objAnimateTo$material$default = animateTo$material$default(this, ModalBottomSheetValue.Expanded, 0.0f, eVar, 2, null)) == h.c.a.a.f48038a) ? objAnimateTo$material$default : ab.f48028a;
    }

    public final AnchoredDraggableState<ModalBottomSheetValue> getAnchoredDraggableState$material() {
        return this.anchoredDraggableState;
    }

    public final AnimationSpec<Float> getAnimationSpec$material() {
        return this.animationSpec;
    }

    public final ModalBottomSheetValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    public final boolean getHasHalfExpandedState$material() {
        return this.anchoredDraggableState.getAnchors().hasAnchorFor(ModalBottomSheetValue.HalfExpanded);
    }

    public final float getProgress() {
        return this.anchoredDraggableState.getProgress();
    }

    public final ModalBottomSheetValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final Object halfExpand$material(e<? super ab> eVar) {
        Object objAnimateTo$material$default;
        return (getHasHalfExpandedState$material() && (objAnimateTo$material$default = animateTo$material$default(this, ModalBottomSheetValue.HalfExpanded, 0.0f, eVar, 2, null)) == h.c.a.a.f48038a) ? objAnimateTo$material$default : ab.f48028a;
    }

    public final Object hide(e<? super ab> eVar) {
        Object objAnimateTo$material$default = animateTo$material$default(this, ModalBottomSheetValue.Hidden, 0.0f, eVar, 2, null);
        return objAnimateTo$material$default == h.c.a.a.f48038a ? objAnimateTo$material$default : ab.f48028a;
    }

    public final boolean isSkipHalfExpanded$material() {
        return this.isSkipHalfExpanded;
    }

    public final boolean isVisible() {
        return this.anchoredDraggableState.getCurrentValue() != ModalBottomSheetValue.Hidden;
    }

    public final float progress(ModalBottomSheetValue modalBottomSheetValue, ModalBottomSheetValue modalBottomSheetValue2) {
        float fPositionOf = this.anchoredDraggableState.getAnchors().positionOf(modalBottomSheetValue);
        float fPositionOf2 = this.anchoredDraggableState.getAnchors().positionOf(modalBottomSheetValue2);
        float fG = (n.g(this.anchoredDraggableState.getOffset(), Math.min(fPositionOf, fPositionOf2), Math.max(fPositionOf, fPositionOf2)) - fPositionOf) / (fPositionOf2 - fPositionOf);
        if (Float.isNaN(fG)) {
            return 1.0f;
        }
        return Math.abs(fG);
    }

    public final float requireOffset$material() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final Object show(e<? super ab> eVar) {
        Object objAnimateTo$material$default = animateTo$material$default(this, getCurrentValue().ordinal() != 0 ? this.anchoredDraggableState.getAnchors().hasAnchorFor(ModalBottomSheetValue.Expanded) ? ModalBottomSheetValue.Expanded : ModalBottomSheetValue.Hidden : getHasHalfExpandedState$material() ? ModalBottomSheetValue.HalfExpanded : ModalBottomSheetValue.Expanded, 0.0f, eVar, 2, null);
        return objAnimateTo$material$default == h.c.a.a.f48038a ? objAnimateTo$material$default : ab.f48028a;
    }

    public final Object snapTo$material(ModalBottomSheetValue modalBottomSheetValue, e<? super ab> eVar) {
        Object objSnapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, modalBottomSheetValue, eVar);
        return objSnapTo == h.c.a.a.f48038a ? objSnapTo : ab.f48028a;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        static final ModalBottomSheetState Saver$lambda$1(Density density, l lVar, AnimationSpec animationSpec, boolean z, ModalBottomSheetValue modalBottomSheetValue) {
            return new ModalBottomSheetState(modalBottomSheetValue, density, lVar, animationSpec, z);
        }

        public final Saver<ModalBottomSheetState, ?> Saver(final AnimationSpec<Float> animationSpec, final l<? super ModalBottomSheetValue, Boolean> lVar, final boolean z, final Density density) {
            return SaverKt.Saver(new p() { // from class: androidx.compose.material.ModalBottomSheetState$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ((ModalBottomSheetState) obj2).getCurrentValue();
                }
            }, new l() { // from class: androidx.compose.material.ModalBottomSheetState$Companion$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return ModalBottomSheetState.Companion.Saver$lambda$1(density, lVar, animationSpec, z, (ModalBottomSheetValue) obj);
                }
            });
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public static /* synthetic */ void getProgress$annotations() {
    }

    public /* synthetic */ ModalBottomSheetState(ModalBottomSheetValue modalBottomSheetValue, Density density, l lVar, AnimationSpec animationSpec, boolean z, int i2, o oVar) {
        this(modalBottomSheetValue, density, (i2 & 4) != 0 ? new l() { // from class: androidx.compose.material.ModalBottomSheetState$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return true;
            }
        } : lVar, (i2 & 8) != 0 ? ModalBottomSheetDefaults.INSTANCE.getAnimationSpec() : animationSpec, ((i2 & 16) == 0) & z);
    }
}
