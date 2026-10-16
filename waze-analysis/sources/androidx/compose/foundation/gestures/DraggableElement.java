package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.ab;
import h.c.e;
import h.g.a.l;
import h.g.a.q;
import h.g.b.o;
import h.g.b.x;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DraggableElement extends ModifierNodeElement<DraggableNode> {
    public static final int $stable = 0;
    private final boolean enabled;
    private final MutableInteractionSource interactionSource;
    private final q<af, Offset, e<? super ab>, Object> onDragStarted;
    private final q<af, Float, e<? super ab>, Object> onDragStopped;
    private final Orientation orientation;
    private final boolean reverseDirection;
    private final boolean startDragImmediately;
    private final DraggableState state;
    public static final Companion Companion = new Companion(null);
    private static final l<PointerType, Boolean> CanDrag = new l() { // from class: androidx.compose.foundation.gestures.DraggableElement$$ExternalSyntheticLambda1
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return true;
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public DraggableElement(DraggableState draggableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, q<? super af, ? super Offset, ? super e<? super ab>, ? extends Object> qVar, q<? super af, ? super Float, ? super e<? super ab>, ? extends Object> qVar2, boolean z3) {
        this.state = draggableState;
        this.orientation = orientation;
        this.enabled = z;
        this.interactionSource = mutableInteractionSource;
        this.startDragImmediately = z2;
        this.onDragStarted = qVar;
        this.onDragStopped = qVar2;
        this.reverseDirection = z3;
    }

    static final boolean CanDrag$lambda$0(PointerType pointerType) {
        return true;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public DraggableNode create() {
        return new DraggableNode(this.state, CanDrag, this.orientation, this.enabled, this.interactionSource, this.startDragImmediately, this.onDragStarted, this.onDragStopped, this.reverseDirection);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return x.n(this.state, draggableElement.state) && this.orientation == draggableElement.orientation && this.enabled == draggableElement.enabled && x.n(this.interactionSource, draggableElement.interactionSource) && this.startDragImmediately == draggableElement.startDragImmediately && x.n(this.onDragStarted, draggableElement.onDragStarted) && x.n(this.onDragStopped, draggableElement.onDragStopped) && this.reverseDirection == draggableElement.reverseDirection;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = (this.state.hashCode() * 31) + this.orientation.hashCode();
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        return (((((((((((iHashCode * 31) + DraggableElement$$ExternalSyntheticBackport0.m(this.enabled)) * 31) + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31) + DraggableElement$$ExternalSyntheticBackport0.m(this.startDragImmediately)) * 31) + this.onDragStarted.hashCode()) * 31) + this.onDragStopped.hashCode()) * 31) + DraggableElement$$ExternalSyntheticBackport0.m(this.reverseDirection);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("draggable");
        inspectorInfo.getProperties().set("orientation", this.orientation);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.enabled));
        inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(this.reverseDirection));
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("startDragImmediately", Boolean.valueOf(this.startDragImmediately));
        inspectorInfo.getProperties().set("onDragStarted", this.onDragStarted);
        inspectorInfo.getProperties().set("onDragStopped", this.onDragStopped);
        inspectorInfo.getProperties().set("state", this.state);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(DraggableNode draggableNode) {
        draggableNode.update(this.state, CanDrag, this.orientation, this.enabled, this.interactionSource, this.startDragImmediately, this.onDragStarted, this.onDragStopped, this.reverseDirection);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final l<PointerType, Boolean> getCanDrag() {
            return DraggableElement.CanDrag;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
