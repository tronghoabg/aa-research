package androidx.compose.ui.node;

import androidx.compose.runtime.AbstractApplier;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class UiApplier extends AbstractApplier<LayoutNode> {
    public static final int $stable = AbstractApplier.$stable;

    public UiApplier(LayoutNode layoutNode) {
        super(layoutNode);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int i2, LayoutNode layoutNode) {
        getCurrent().insertAt$ui(i2, layoutNode);
    }

    @Override // androidx.compose.runtime.Applier
    public /* bridge */ /* synthetic */ void insertTopDown(int i2, Object obj) {
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int i2, int i3, int i4) {
        getCurrent().move$ui(i2, i3, i4);
    }

    @Override // androidx.compose.runtime.AbstractApplier
    protected void onClear() {
        getRoot().removeAll$ui();
    }

    @Override // androidx.compose.runtime.AbstractApplier, androidx.compose.runtime.Applier
    public void onEndChanges() {
        Owner owner$ui = getRoot().getOwner$ui();
        if (owner$ui != null) {
            owner$ui.onEndApplyChanges();
        }
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int i2, int i3) {
        getCurrent().removeAt$ui(i2, i3);
    }

    @Override // androidx.compose.runtime.AbstractApplier, androidx.compose.runtime.Applier
    public void reuse() {
        getCurrent().onReuse();
    }

    public void insertTopDown(int i2, LayoutNode layoutNode) {
    }
}
