package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.DrawModifierNode;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DisplayingDisappearingItemsNode extends Modifier.Node implements DrawModifierNode {
    private LazyLayoutItemAnimator<?> animator;

    public DisplayingDisappearingItemsNode(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
        this.animator = lazyLayoutItemAnimator;
    }

    private final LazyLayoutItemAnimator<?> component1() {
        return this.animator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DisplayingDisappearingItemsNode copy$default(DisplayingDisappearingItemsNode displayingDisappearingItemsNode, LazyLayoutItemAnimator lazyLayoutItemAnimator, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lazyLayoutItemAnimator = displayingDisappearingItemsNode.animator;
        }
        return displayingDisappearingItemsNode.copy(lazyLayoutItemAnimator);
    }

    public final DisplayingDisappearingItemsNode copy(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
        return new DisplayingDisappearingItemsNode(lazyLayoutItemAnimator);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        this.animator.onDrawDisappearingItems(contentDrawScope);
        contentDrawScope.drawContent();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DisplayingDisappearingItemsNode) && x.n(this.animator, ((DisplayingDisappearingItemsNode) obj).animator);
    }

    public int hashCode() {
        return this.animator.hashCode();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.animator.setDisplayingNode(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.animator.reset();
    }

    public final void setAnimator(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
        if (x.n(this.animator, lazyLayoutItemAnimator) || !getNode().isAttached()) {
            return;
        }
        this.animator.reset();
        lazyLayoutItemAnimator.setDisplayingNode(this);
        this.animator = lazyLayoutItemAnimator;
    }

    public String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.animator + ')';
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
    }
}
