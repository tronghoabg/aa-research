package androidx.compose.animation;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SharedBoundsNodeElement extends ModifierNodeElement<SharedBoundsNode> {
    public static final int $stable = 0;
    private final SharedElementEntry sharedElementState;

    public SharedBoundsNodeElement(SharedElementEntry sharedElementEntry) {
        this.sharedElementState = sharedElementEntry;
    }

    public static /* synthetic */ SharedBoundsNodeElement copy$default(SharedBoundsNodeElement sharedBoundsNodeElement, SharedElementEntry sharedElementEntry, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            sharedElementEntry = sharedBoundsNodeElement.sharedElementState;
        }
        return sharedBoundsNodeElement.copy(sharedElementEntry);
    }

    public final SharedElementEntry component1() {
        return this.sharedElementState;
    }

    public final SharedBoundsNodeElement copy(SharedElementEntry sharedElementEntry) {
        return new SharedBoundsNodeElement(sharedElementEntry);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SharedBoundsNode create() {
        return new SharedBoundsNode(this.sharedElementState);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SharedBoundsNodeElement) && x.n(this.sharedElementState, ((SharedBoundsNodeElement) obj).sharedElementState);
    }

    public final SharedElementEntry getSharedElementState() {
        return this.sharedElementState;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.sharedElementState.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("sharedBounds");
        inspectorInfo.getProperties().set("sharedElementState", this.sharedElementState);
    }

    public String toString() {
        return "SharedBoundsNodeElement(sharedElementState=" + this.sharedElementState + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SharedBoundsNode sharedBoundsNode) {
        sharedBoundsNode.setSharedElementEntry$animation(this.sharedElementState);
    }
}
