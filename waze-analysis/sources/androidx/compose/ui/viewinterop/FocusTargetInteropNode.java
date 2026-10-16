package androidx.compose.ui.viewinterop;

import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import h.ab;
import h.g.a.a;
import h.g.b.aq;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class FocusTargetInteropNode extends DelegatingNode implements ObserverModifierNode, CompositionLocalConsumerModifierNode {
    private final FocusTargetNode focusTargetNode;
    private PinnableContainer.PinnedHandle pinnedHandle;

    public FocusTargetInteropNode() {
        FocusTargetNode focusTargetNode = new FocusTargetNode(0, true, new FocusTargetInteropNode$focusTargetNode$1(this), null, 9, null);
        delegate(focusTargetNode);
        this.focusTargetNode = focusTargetNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusStateChange(FocusState focusState, FocusState focusState2) {
        boolean zIsFocused;
        if (isAttached() && (zIsFocused = focusState2.isFocused()) != focusState.isFocused()) {
            PinnableContainer.PinnedHandle pinnedHandlePin = null;
            if (zIsFocused) {
                PinnableContainer pinnableContainerRetrievePinnableContainer = retrievePinnableContainer();
                if (pinnableContainerRetrievePinnableContainer != null) {
                    pinnedHandlePin = pinnableContainerRetrievePinnableContainer.pin();
                }
            } else {
                PinnableContainer.PinnedHandle pinnedHandle = this.pinnedHandle;
                if (pinnedHandle != null) {
                    pinnedHandle.release();
                }
            }
            this.pinnedHandle = pinnedHandlePin;
        }
    }

    private final PinnableContainer retrievePinnableContainer() {
        aq aqVar = new aq();
        ObserverModifierNodeKt.observeReads(this, new AnonymousClass1(aqVar, this));
        return (PinnableContainer) aqVar.f48105a;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        FocusTargetNode focusTargetNode = this.focusTargetNode;
        PinnableContainer pinnableContainerRetrievePinnableContainer = retrievePinnableContainer();
        if (focusTargetNode.getFocusState().isFocused()) {
            PinnableContainer.PinnedHandle pinnedHandle = this.pinnedHandle;
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            this.pinnedHandle = pinnableContainerRetrievePinnableContainer != null ? pinnableContainerRetrievePinnableContainer.pin() : null;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.viewinterop.FocusTargetInteropNode$retrievePinnableContainer$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements a<ab> {
        final /* synthetic */ aq<PinnableContainer> $container;
        final /* synthetic */ FocusTargetInteropNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(aq<PinnableContainer> aqVar, FocusTargetInteropNode focusTargetInteropNode) {
            super(0);
            this.$container = aqVar;
            this.this$0 = focusTargetInteropNode;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$container.f48105a = CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, PinnableContainerKt.getLocalPinnableContainer());
        }

        @Override // h.g.a.a
        public /* bridge */ /* synthetic */ ab invoke() {
            invoke2();
            return ab.f48028a;
        }
    }
}
