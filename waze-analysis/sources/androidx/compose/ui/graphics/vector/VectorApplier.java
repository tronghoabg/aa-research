package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.AbstractApplier;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class VectorApplier extends AbstractApplier<VNode> {
    public static final int $stable = AbstractApplier.$stable;

    public VectorApplier(VNode vNode) {
        super(vNode);
    }

    private final GroupComponent asGroup(VNode vNode) {
        if (vNode instanceof GroupComponent) {
            return (GroupComponent) vNode;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group");
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int i2, VNode vNode) {
        asGroup(getCurrent()).insertAt(i2, vNode);
    }

    @Override // androidx.compose.runtime.Applier
    public /* bridge */ /* synthetic */ void insertTopDown(int i2, Object obj) {
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int i2, int i3, int i4) {
        asGroup(getCurrent()).move(i2, i3, i4);
    }

    @Override // androidx.compose.runtime.AbstractApplier
    protected void onClear() {
        GroupComponent groupComponentAsGroup = asGroup(getRoot());
        groupComponentAsGroup.remove(0, groupComponentAsGroup.getNumChildren());
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int i2, int i3) {
        asGroup(getCurrent()).remove(i2, i3);
    }

    public void insertTopDown(int i2, VNode vNode) {
    }
}
