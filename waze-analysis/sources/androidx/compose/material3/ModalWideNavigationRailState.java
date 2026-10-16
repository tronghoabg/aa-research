package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import h.ab;
import h.c.a.a;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ModalWideNavigationRailState implements WideNavigationRailState {
    public static final int $stable = 8;
    private final /* synthetic */ WideNavigationRailState $$delegate_0;
    private final AnchoredDraggableState<WideNavigationRailValue> anchoredDraggableState;
    private final AnimationSpec<Float> animationSpec;

    public ModalWideNavigationRailState(WideNavigationRailState wideNavigationRailState, AnimationSpec<Float> animationSpec) {
        this.$$delegate_0 = wideNavigationRailState;
        this.animationSpec = animationSpec;
        this.anchoredDraggableState = new AnchoredDraggableState<>(wideNavigationRailState.getTargetValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateTo(WideNavigationRailValue wideNavigationRailValue, AnimationSpec<Float> animationSpec, e<? super ab> eVar) {
        Object objAnimateTo = AnchoredDraggableKt.animateTo(this.anchoredDraggableState, wideNavigationRailValue, animationSpec, eVar);
        return objAnimateTo == a.f48038a ? objAnimateTo : ab.f48028a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object animateTo$default(ModalWideNavigationRailState modalWideNavigationRailState, WideNavigationRailValue wideNavigationRailValue, AnimationSpec animationSpec, e eVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            animationSpec = modalWideNavigationRailState.animationSpec;
        }
        return modalWideNavigationRailState.animateTo(wideNavigationRailValue, animationSpec, eVar);
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public Object collapse(e<? super ab> eVar) {
        Object objAnimateTo$default = animateTo$default(this, WideNavigationRailValue.Collapsed, null, eVar, 2, null);
        return objAnimateTo$default == a.f48038a ? objAnimateTo$default : ab.f48028a;
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public Object expand(e<? super ab> eVar) {
        Object objAnimateTo$default = animateTo$default(this, WideNavigationRailValue.Expanded, null, eVar, 2, null);
        return objAnimateTo$default == a.f48038a ? objAnimateTo$default : ab.f48028a;
    }

    public final AnchoredDraggableState<WideNavigationRailValue> getAnchoredDraggableState$material3() {
        return this.anchoredDraggableState;
    }

    public final AnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public final float getCurrentOffset() {
        return this.anchoredDraggableState.getOffset();
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public WideNavigationRailValue getCurrentValue() {
        return this.anchoredDraggableState.getSettledValue();
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public WideNavigationRailValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public boolean isAnimating() {
        return this.anchoredDraggableState.isAnimationRunning();
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public Object snapTo(WideNavigationRailValue wideNavigationRailValue, e<? super ab> eVar) {
        Object objSnapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, wideNavigationRailValue, eVar);
        return objSnapTo == a.f48038a ? objSnapTo : ab.f48028a;
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public Object toggle(e<? super ab> eVar) {
        Object objAnimateTo$default = animateTo$default(this, WideNavigationRailStateKt.not(getTargetValue()), null, eVar, 2, null);
        return objAnimateTo$default == a.f48038a ? objAnimateTo$default : ab.f48028a;
    }
}
