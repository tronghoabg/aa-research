package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class MinimumInteractiveBalancedPaddingElement extends ModifierNodeElement<MinimumInteractiveBalancedPaddingNode> {
    private final AnimationSpec<Float> animationSpec;
    private final boolean hasVisibleLeadingContent;
    private final boolean hasVisibleTrailingContent;

    public MinimumInteractiveBalancedPaddingElement(boolean z, boolean z2, AnimationSpec<Float> animationSpec) {
        this.hasVisibleLeadingContent = z;
        this.hasVisibleTrailingContent = z2;
        this.animationSpec = animationSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MinimumInteractiveBalancedPaddingElement copy$default(MinimumInteractiveBalancedPaddingElement minimumInteractiveBalancedPaddingElement, boolean z, boolean z2, AnimationSpec animationSpec, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = minimumInteractiveBalancedPaddingElement.hasVisibleLeadingContent;
        }
        if ((i2 & 2) != 0) {
            z2 = minimumInteractiveBalancedPaddingElement.hasVisibleTrailingContent;
        }
        if ((i2 & 4) != 0) {
            animationSpec = minimumInteractiveBalancedPaddingElement.animationSpec;
        }
        return minimumInteractiveBalancedPaddingElement.copy(z, z2, animationSpec);
    }

    public final boolean component1() {
        return this.hasVisibleLeadingContent;
    }

    public final boolean component2() {
        return this.hasVisibleTrailingContent;
    }

    public final AnimationSpec<Float> component3() {
        return this.animationSpec;
    }

    public final MinimumInteractiveBalancedPaddingElement copy(boolean z, boolean z2, AnimationSpec<Float> animationSpec) {
        return new MinimumInteractiveBalancedPaddingElement(z, z2, animationSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public MinimumInteractiveBalancedPaddingNode create() {
        return new MinimumInteractiveBalancedPaddingNode(this.hasVisibleLeadingContent, this.hasVisibleTrailingContent, this.animationSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinimumInteractiveBalancedPaddingElement)) {
            return false;
        }
        MinimumInteractiveBalancedPaddingElement minimumInteractiveBalancedPaddingElement = (MinimumInteractiveBalancedPaddingElement) obj;
        return this.hasVisibleLeadingContent == minimumInteractiveBalancedPaddingElement.hasVisibleLeadingContent && this.hasVisibleTrailingContent == minimumInteractiveBalancedPaddingElement.hasVisibleTrailingContent && x.n(this.animationSpec, minimumInteractiveBalancedPaddingElement.animationSpec);
    }

    public final AnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public final boolean getHasVisibleLeadingContent() {
        return this.hasVisibleLeadingContent;
    }

    public final boolean getHasVisibleTrailingContent() {
        return this.hasVisibleTrailingContent;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((MinimumInteractiveBalancedPaddingElement$$ExternalSyntheticBackport0.m(this.hasVisibleLeadingContent) * 31) + MinimumInteractiveBalancedPaddingElement$$ExternalSyntheticBackport0.m(this.hasVisibleTrailingContent)) * 31) + this.animationSpec.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("minimumInteractiveBalancedPadding");
        inspectorInfo.getProperties().set("hasVisibleLeadingContent", Boolean.valueOf(this.hasVisibleLeadingContent));
        inspectorInfo.getProperties().set("hasVisibleTrailingContent", Boolean.valueOf(this.hasVisibleTrailingContent));
        inspectorInfo.getProperties().set("animationSpec", this.animationSpec);
    }

    public String toString() {
        return "MinimumInteractiveBalancedPaddingElement(hasVisibleLeadingContent=" + this.hasVisibleLeadingContent + ", hasVisibleTrailingContent=" + this.hasVisibleTrailingContent + ", animationSpec=" + this.animationSpec + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(MinimumInteractiveBalancedPaddingNode minimumInteractiveBalancedPaddingNode) {
        minimumInteractiveBalancedPaddingNode.setHasVisibleLeadingContent(this.hasVisibleLeadingContent);
        minimumInteractiveBalancedPaddingNode.setHasVisibleTrailingContent(this.hasVisibleTrailingContent);
        minimumInteractiveBalancedPaddingNode.setAnimationSpec(this.animationSpec);
        minimumInteractiveBalancedPaddingNode.updateAnimation();
    }
}
