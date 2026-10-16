package androidx.compose.foundation.layout;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class UnionInsetsConsumingModifierNode extends InsetsConsumingModifierNode {
    private WindowInsets insets;

    public UnionInsetsConsumingModifierNode(WindowInsets windowInsets) {
        this.insets = windowInsets;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode
    public WindowInsets calculateInsets(WindowInsets windowInsets) {
        return WindowInsetsKt.union(windowInsets, this.insets);
    }

    public final void update(WindowInsets windowInsets) {
        if (x.n(windowInsets, this.insets)) {
            return;
        }
        this.insets = windowInsets;
        insetsInvalidated();
    }
}
