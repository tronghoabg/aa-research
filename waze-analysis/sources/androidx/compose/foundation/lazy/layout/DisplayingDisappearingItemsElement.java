package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DisplayingDisappearingItemsElement extends ModifierNodeElement<DisplayingDisappearingItemsNode> {
    private final LazyLayoutItemAnimator<?> animator;

    public DisplayingDisappearingItemsElement(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
        this.animator = lazyLayoutItemAnimator;
    }

    private final LazyLayoutItemAnimator<?> component1() {
        return this.animator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DisplayingDisappearingItemsElement copy$default(DisplayingDisappearingItemsElement displayingDisappearingItemsElement, LazyLayoutItemAnimator lazyLayoutItemAnimator, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lazyLayoutItemAnimator = displayingDisappearingItemsElement.animator;
        }
        return displayingDisappearingItemsElement.copy(lazyLayoutItemAnimator);
    }

    public final DisplayingDisappearingItemsElement copy(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
        return new DisplayingDisappearingItemsElement(lazyLayoutItemAnimator);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public DisplayingDisappearingItemsNode create() {
        return new DisplayingDisappearingItemsNode(this.animator);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DisplayingDisappearingItemsElement) && x.n(this.animator, ((DisplayingDisappearingItemsElement) obj).animator);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.animator.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("DisplayingDisappearingItemsElement");
    }

    public String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.animator + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(DisplayingDisappearingItemsNode displayingDisappearingItemsNode) {
        displayingDisappearingItemsNode.setAnimator(this.animator);
    }
}
