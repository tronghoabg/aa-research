package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.TraversableNode;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AddTextContextMenuDataComponentsNode extends Modifier.Node implements TraversableNode {
    public static final int $stable = 8;
    private l<? super TextContextMenuBuilderScope, ab> builder;

    public AddTextContextMenuDataComponentsNode(l<? super TextContextMenuBuilderScope, ab> lVar) {
        this.builder = lVar;
    }

    public final l<TextContextMenuBuilderScope, ab> getBuilder() {
        return this.builder;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return TextContextMenuDataTraverseKey.INSTANCE;
    }

    public final void setBuilder(l<? super TextContextMenuBuilderScope, ab> lVar) {
        this.builder = lVar;
    }
}
