package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.TraversableNode;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class FilterTextContextMenuDataComponentsNode extends Modifier.Node implements TraversableNode {
    private l<? super TextContextMenuComponent, Boolean> filter;

    public FilterTextContextMenuDataComponentsNode(l<? super TextContextMenuComponent, Boolean> lVar) {
        this.filter = lVar;
    }

    public final l<TextContextMenuComponent, Boolean> getFilter() {
        return this.filter;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return TextContextMenuDataTraverseKey.INSTANCE;
    }

    public final void setFilter(l<? super TextContextMenuComponent, Boolean> lVar) {
        this.filter = lVar;
    }
}
