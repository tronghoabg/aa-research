package androidx.compose.ui.focus;

import androidx.compose.ui.node.DelegatableNode;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface FocusTargetModifierNode extends DelegatableNode {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.focus.FocusTargetModifierNode$-CC, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        /* renamed from: requestFocus-3ESFkO8$default, reason: not valid java name */
        public static /* synthetic */ boolean m7890requestFocus3ESFkO8$default(FocusTargetModifierNode focusTargetModifierNode, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestFocus-3ESFkO8");
            }
            if ((i3 & 1) != 0) {
                i2 = FocusDirection.Companion.m7860getEnterdhqQ8s();
            }
            return focusTargetModifierNode.mo7888requestFocus3ESFkO8(i2);
        }
    }

    FocusState getFocusState();

    /* renamed from: getFocusability-LCbbffg, reason: not valid java name */
    int mo7887getFocusabilityLCbbffg();

    /* synthetic */ boolean requestFocus();

    /* renamed from: requestFocus-3ESFkO8, reason: not valid java name */
    boolean mo7888requestFocus3ESFkO8(int i2);

    /* renamed from: setFocusability-josRg5g, reason: not valid java name */
    void mo7889setFocusabilityjosRg5g(int i2);
}
