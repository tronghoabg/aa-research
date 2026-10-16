package androidx.compose.foundation.layout;

import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ConsumedInsetsModifierNode extends InsetsConsumingModifierNode {
    private l<? super WindowInsets, ab> block;

    public ConsumedInsetsModifierNode(l<? super WindowInsets, ab> lVar) {
        this.block = lVar;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode
    public WindowInsets calculateInsets(WindowInsets windowInsets) {
        this.block.invoke(windowInsets);
        return windowInsets;
    }

    public final void update(l<? super WindowInsets, ab> lVar) {
        if (lVar != this.block) {
            this.block = lVar;
            insetsInvalidated();
        }
    }
}
