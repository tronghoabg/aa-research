package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.LayoutIdParentData;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class ConstraintLayoutParentData implements LayoutIdParentData {
    private final l<ConstrainScope, ab> constrain;
    private final Object layoutId;
    private final ConstrainedLayoutReference ref;

    /* JADX WARN: Multi-variable type inference failed */
    public ConstraintLayoutParentData(ConstrainedLayoutReference constrainedLayoutReference, l<? super ConstrainScope, ab> lVar) {
        this.ref = constrainedLayoutReference;
        this.constrain = lVar;
        this.layoutId = constrainedLayoutReference.getId$constraintlayout_compose();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ConstraintLayoutParentData)) {
            return false;
        }
        ConstraintLayoutParentData constraintLayoutParentData = (ConstraintLayoutParentData) obj;
        return x.n(this.ref.getId$constraintlayout_compose(), constraintLayoutParentData.ref.getId$constraintlayout_compose()) && this.constrain == constraintLayoutParentData.constrain;
    }

    public final l<ConstrainScope, ab> getConstrain() {
        return this.constrain;
    }

    @Override // androidx.compose.ui.layout.LayoutIdParentData
    public Object getLayoutId() {
        return this.layoutId;
    }

    public final ConstrainedLayoutReference getRef() {
        return this.ref;
    }

    public int hashCode() {
        return (this.ref.getId$constraintlayout_compose().hashCode() * 31) + this.constrain.hashCode();
    }
}
