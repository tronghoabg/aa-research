package androidx.compose.animation;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SharedTransitionScopeRootModifierElement extends ModifierNodeElement<SharedTransitionScopeRootModifierNode> {
    private final SharedTransitionScopeImpl sharedTransitionScope;

    public SharedTransitionScopeRootModifierElement(SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        this.sharedTransitionScope = sharedTransitionScopeImpl;
    }

    public static /* synthetic */ SharedTransitionScopeRootModifierElement copy$default(SharedTransitionScopeRootModifierElement sharedTransitionScopeRootModifierElement, SharedTransitionScopeImpl sharedTransitionScopeImpl, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            sharedTransitionScopeImpl = sharedTransitionScopeRootModifierElement.sharedTransitionScope;
        }
        return sharedTransitionScopeRootModifierElement.copy(sharedTransitionScopeImpl);
    }

    public final SharedTransitionScopeImpl component1() {
        return this.sharedTransitionScope;
    }

    public final SharedTransitionScopeRootModifierElement copy(SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        return new SharedTransitionScopeRootModifierElement(sharedTransitionScopeImpl);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SharedTransitionScopeRootModifierNode create() {
        return new SharedTransitionScopeRootModifierNode(this.sharedTransitionScope);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SharedTransitionScopeRootModifierElement) && x.n(this.sharedTransitionScope, ((SharedTransitionScopeRootModifierElement) obj).sharedTransitionScope);
    }

    public final SharedTransitionScopeImpl getSharedTransitionScope() {
        return this.sharedTransitionScope;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.sharedTransitionScope.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("SharedTransitionScopeRootModifier");
        inspectorInfo.getProperties().set("sharedTransitionScope", this.sharedTransitionScope);
    }

    public String toString() {
        return "SharedTransitionScopeRootModifierElement(sharedTransitionScope=" + this.sharedTransitionScope + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SharedTransitionScopeRootModifierNode sharedTransitionScopeRootModifierNode) {
        sharedTransitionScopeRootModifierNode.setSharedScope(this.sharedTransitionScope);
    }
}
