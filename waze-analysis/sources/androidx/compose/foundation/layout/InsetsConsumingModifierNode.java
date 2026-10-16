package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class InsetsConsumingModifierNode extends Modifier.Node implements TraversableNode {
    public static final int $stable = 8;
    private WindowInsets ancestorConsumedInsets = WindowInsetsKt.WindowInsets();
    private WindowInsets consumedInsets = WindowInsetsKt.WindowInsets();

    private final void invalidateChildConsumedInsets() {
        TraversableNodeKt.traverseDescendants(this, getTraverseKey(), new l() { // from class: androidx.compose.foundation.layout.InsetsConsumingModifierNode$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return InsetsConsumingModifierNode.invalidateChildConsumedInsets$lambda$0(this.f$0, (TraversableNode) obj);
            }
        });
    }

    static final TraversableNode.Companion.TraverseDescendantsAction invalidateChildConsumedInsets$lambda$0(InsetsConsumingModifierNode insetsConsumingModifierNode, TraversableNode traversableNode) {
        x.d(traversableNode, "null cannot be cast to non-null type androidx.compose.foundation.layout.InsetsConsumingModifierNode");
        ((InsetsConsumingModifierNode) traversableNode).setAncestorConsumedInsets(insetsConsumingModifierNode.consumedInsets);
        return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
    }

    static final boolean onAttach$lambda$0(InsetsConsumingModifierNode insetsConsumingModifierNode, TraversableNode traversableNode) {
        x.d(traversableNode, "null cannot be cast to non-null type androidx.compose.foundation.layout.InsetsConsumingModifierNode");
        insetsConsumingModifierNode.ancestorConsumedInsets = ((InsetsConsumingModifierNode) traversableNode).consumedInsets;
        return false;
    }

    private final void setAncestorConsumedInsets(WindowInsets windowInsets) {
        if (x.n(this.ancestorConsumedInsets, windowInsets)) {
            return;
        }
        this.ancestorConsumedInsets = windowInsets;
        insetsInvalidated();
    }

    public abstract WindowInsets calculateInsets(WindowInsets windowInsets);

    public final WindowInsets getAncestorConsumedInsets() {
        return this.ancestorConsumedInsets;
    }

    public final WindowInsets getConsumedInsets() {
        return this.consumedInsets;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return WindowInsetsPaddingKt.InsetsConsumingModifierNodeKey;
    }

    public void insetsInvalidated() {
        this.consumedInsets = calculateInsets(this.ancestorConsumedInsets);
        invalidateChildConsumedInsets();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        TraversableNodeKt.traverseAncestors(this, getTraverseKey(), new l() { // from class: androidx.compose.foundation.layout.InsetsConsumingModifierNode$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                InsetsConsumingModifierNode.onAttach$lambda$0(this.f$0, (TraversableNode) obj);
                return false;
            }
        });
        insetsInvalidated();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.consumedInsets = this.ancestorConsumedInsets;
        invalidateChildConsumedInsets();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        this.ancestorConsumedInsets = WindowInsetsKt.WindowInsets();
    }
}
