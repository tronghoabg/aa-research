package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.ab;
import h.c.e;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TextContextMenuGestureElement extends ModifierNodeElement<TextContextMenuGestureNode> {
    private final p<Offset, e<? super ab>, Object> onPreShowContextMenu;

    /* JADX WARN: Multi-variable type inference failed */
    public TextContextMenuGestureElement(p<? super Offset, ? super e<? super ab>, ? extends Object> pVar) {
        this.onPreShowContextMenu = pVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public TextContextMenuGestureNode create() {
        return new TextContextMenuGestureNode(this.onPreShowContextMenu);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TextContextMenuGestureElement) && this.onPreShowContextMenu == ((TextContextMenuGestureElement) obj).onPreShowContextMenu;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        p<Offset, e<? super ab>, Object> pVar = this.onPreShowContextMenu;
        if (pVar != null) {
            return pVar.hashCode();
        }
        return 0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("TextContextMenuGestures");
        inspectorInfo.getProperties().set("onPreShowContextMenu", this.onPreShowContextMenu);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(TextContextMenuGestureNode textContextMenuGestureNode) {
        textContextMenuGestureNode.update(this.onPreShowContextMenu);
    }
}
