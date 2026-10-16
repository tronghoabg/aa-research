package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import h.ab;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ExposedDropdownMenuAnchorNode extends Modifier.Node {
    private a<ab> updateStateOnAttach;

    public ExposedDropdownMenuAnchorNode(a<ab> aVar) {
        this.updateStateOnAttach = aVar;
    }

    public final a<ab> getUpdateStateOnAttach() {
        return this.updateStateOnAttach;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.updateStateOnAttach.invoke();
    }

    public final void setUpdateStateOnAttach(a<ab> aVar) {
        this.updateStateOnAttach = aVar;
    }
}
