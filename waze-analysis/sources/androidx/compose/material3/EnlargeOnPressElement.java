package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class EnlargeOnPressElement extends ModifierNodeElement<EnlargeOnPressNode> {
    public static final int $stable = 0;
    private final AnimationSpec<Float> animationSpec;
    private final InteractionSource interactionSource;

    public EnlargeOnPressElement(InteractionSource interactionSource, AnimationSpec<Float> animationSpec) {
        this.interactionSource = interactionSource;
        this.animationSpec = animationSpec;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public EnlargeOnPressNode create() {
        return new EnlargeOnPressNode(this.interactionSource, this.animationSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        EnlargeOnPressNode enlargeOnPressNode = obj instanceof EnlargeOnPressNode ? (EnlargeOnPressNode) obj : null;
        return enlargeOnPressNode != null && x.n(this.interactionSource, enlargeOnPressNode.getInteractionSource()) && x.n(this.animationSpec, enlargeOnPressNode.getAnimationSpec());
    }

    public final AnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public final InteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.interactionSource.hashCode() * 31) + this.animationSpec.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("EnlargeOnPressElement");
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("animationSpec", this.animationSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(EnlargeOnPressNode enlargeOnPressNode) {
        if (!x.n(enlargeOnPressNode.getInteractionSource(), this.interactionSource)) {
            enlargeOnPressNode.setInteractionSource(this.interactionSource);
            enlargeOnPressNode.launchCollectionJob$material3();
        }
        enlargeOnPressNode.setAnimationSpec(this.animationSpec);
    }
}
