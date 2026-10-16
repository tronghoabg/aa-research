package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.spatial.RelativeLayoutBounds;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LayoutBoundsNode extends Modifier.Node {
    public static final int $stable = 8;
    private DelegatableNode.RegistrationHandle handle;
    private LayoutBoundsHolder holder;
    private RelativeLayoutBounds lastBounds;
    private final l<RelativeLayoutBounds, ab> rectChanged = new LayoutBoundsNode$rectChanged$1(this);

    public LayoutBoundsNode(LayoutBoundsHolder layoutBoundsHolder) {
        this.holder = layoutBoundsHolder;
    }

    public final void forceUpdate() {
        this.holder.setBounds$ui(this.lastBounds);
    }

    public final DelegatableNode.RegistrationHandle getHandle() {
        return this.handle;
    }

    public final LayoutBoundsHolder getHolder() {
        return this.holder;
    }

    public final RelativeLayoutBounds getLastBounds() {
        return this.lastBounds;
    }

    public final l<RelativeLayoutBounds, ab> getRectChanged() {
        return this.rectChanged;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        DelegatableNode.RegistrationHandle registrationHandle = this.handle;
        if (registrationHandle != null) {
            registrationHandle.unregister();
        }
        this.handle = OnLayoutRectChangedModifierKt.registerOnLayoutRectChanged(this, 0L, 0L, this.rectChanged);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        DelegatableNode.RegistrationHandle registrationHandle = this.handle;
        if (registrationHandle != null) {
            registrationHandle.unregister();
        }
        this.holder.setBounds$ui(null);
    }

    public final void setHandle(DelegatableNode.RegistrationHandle registrationHandle) {
        this.handle = registrationHandle;
    }

    public final void setHolder(LayoutBoundsHolder layoutBoundsHolder) {
        this.holder = layoutBoundsHolder;
    }

    public final void setLastBounds(RelativeLayoutBounds relativeLayoutBounds) {
        this.lastBounds = relativeLayoutBounds;
    }
}
