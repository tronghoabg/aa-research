package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class VeilModifierElement extends ModifierNodeElement<VeilModifierNode> {
    private final EnterTransition enter;
    private final ExitTransition exit;
    private final SharedMutableTransformState mutableTransformState;
    private final Transition<EnterExitState> transition;
    private final Transition<EnterExitState>.DeferredAnimation<Color, AnimationVector4D> veilAnimation;

    public VeilModifierElement(Transition<EnterExitState> transition, Transition<EnterExitState>.DeferredAnimation<Color, AnimationVector4D> deferredAnimation, EnterTransition enterTransition, ExitTransition exitTransition, SharedMutableTransformState sharedMutableTransformState) {
        this.transition = transition;
        this.veilAnimation = deferredAnimation;
        this.enter = enterTransition;
        this.exit = exitTransition;
        this.mutableTransformState = sharedMutableTransformState;
    }

    public static /* synthetic */ VeilModifierElement copy$default(VeilModifierElement veilModifierElement, Transition transition, Transition.DeferredAnimation deferredAnimation, EnterTransition enterTransition, ExitTransition exitTransition, SharedMutableTransformState sharedMutableTransformState, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            transition = veilModifierElement.transition;
        }
        if ((i2 & 2) != 0) {
            deferredAnimation = veilModifierElement.veilAnimation;
        }
        if ((i2 & 4) != 0) {
            enterTransition = veilModifierElement.enter;
        }
        if ((i2 & 8) != 0) {
            exitTransition = veilModifierElement.exit;
        }
        if ((i2 & 16) != 0) {
            sharedMutableTransformState = veilModifierElement.mutableTransformState;
        }
        SharedMutableTransformState sharedMutableTransformState2 = sharedMutableTransformState;
        EnterTransition enterTransition2 = enterTransition;
        return veilModifierElement.copy(transition, deferredAnimation, enterTransition2, exitTransition, sharedMutableTransformState2);
    }

    public final Transition<EnterExitState> component1() {
        return this.transition;
    }

    public final Transition<EnterExitState>.DeferredAnimation<Color, AnimationVector4D> component2() {
        return this.veilAnimation;
    }

    public final EnterTransition component3() {
        return this.enter;
    }

    public final ExitTransition component4() {
        return this.exit;
    }

    public final SharedMutableTransformState component5() {
        return this.mutableTransformState;
    }

    public final VeilModifierElement copy(Transition<EnterExitState> transition, Transition<EnterExitState>.DeferredAnimation<Color, AnimationVector4D> deferredAnimation, EnterTransition enterTransition, ExitTransition exitTransition, SharedMutableTransformState sharedMutableTransformState) {
        return new VeilModifierElement(transition, deferredAnimation, enterTransition, exitTransition, sharedMutableTransformState);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public VeilModifierNode create() {
        return new VeilModifierNode(this.transition, this.veilAnimation, this.enter, this.exit, this.mutableTransformState);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VeilModifierElement)) {
            return false;
        }
        VeilModifierElement veilModifierElement = (VeilModifierElement) obj;
        return x.n(this.transition, veilModifierElement.transition) && x.n(this.veilAnimation, veilModifierElement.veilAnimation) && x.n(this.enter, veilModifierElement.enter) && x.n(this.exit, veilModifierElement.exit) && x.n(this.mutableTransformState, veilModifierElement.mutableTransformState);
    }

    public final EnterTransition getEnter() {
        return this.enter;
    }

    public final ExitTransition getExit() {
        return this.exit;
    }

    public final SharedMutableTransformState getMutableTransformState() {
        return this.mutableTransformState;
    }

    public final Transition<EnterExitState> getTransition() {
        return this.transition;
    }

    public final Transition<EnterExitState>.DeferredAnimation<Color, AnimationVector4D> getVeilAnimation() {
        return this.veilAnimation;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((this.transition.hashCode() * 31) + this.veilAnimation.hashCode()) * 31) + this.enter.hashCode()) * 31) + this.exit.hashCode()) * 31) + this.mutableTransformState.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("veil");
        inspectorInfo.getProperties().set("transition", this.transition);
        inspectorInfo.getProperties().set("veilAnimation", this.veilAnimation);
        inspectorInfo.getProperties().set("enter", this.enter);
        inspectorInfo.getProperties().set("exit", this.exit);
        inspectorInfo.getProperties().set("mutableTransformState", this.mutableTransformState);
    }

    public String toString() {
        return "VeilModifierElement(transition=" + this.transition + ", veilAnimation=" + this.veilAnimation + ", enter=" + this.enter + ", exit=" + this.exit + ", mutableTransformState=" + this.mutableTransformState + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(VeilModifierNode veilModifierNode) {
        veilModifierNode.setTransition(this.transition);
        veilModifierNode.setVeilAnimation(this.veilAnimation);
        veilModifierNode.setEnter(this.enter);
        veilModifierNode.setExit(this.exit);
        veilModifierNode.setMutableTransformState(this.mutableTransformState);
    }
}
