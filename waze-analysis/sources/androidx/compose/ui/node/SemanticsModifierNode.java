package androidx.compose.ui.node;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface SemanticsModifierNode extends DelegatableNode {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.node.SemanticsModifierNode$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$getShouldClearDescendantSemantics(SemanticsModifierNode semanticsModifierNode) {
            return false;
        }

        public static boolean $default$getShouldMergeDescendantSemantics(SemanticsModifierNode semanticsModifierNode) {
            return false;
        }

        public static boolean $default$isImportantForBounds(SemanticsModifierNode semanticsModifierNode) {
            return true;
        }
    }

    void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver);

    boolean getShouldClearDescendantSemantics();

    boolean getShouldMergeDescendantSemantics();

    boolean isImportantForBounds();
}
