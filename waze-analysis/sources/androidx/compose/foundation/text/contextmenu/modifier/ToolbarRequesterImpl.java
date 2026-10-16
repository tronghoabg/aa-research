package androidx.compose.foundation.text.contextmenu.modifier;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ToolbarRequesterImpl extends ToolbarRequester {
    public static final int $stable = 8;

    @Override // androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester
    public void hide() {
        TextContextMenuToolbarHandlerNode toolbarHandlerNode$foundation = getToolbarHandlerNode$foundation();
        if (toolbarHandlerNode$foundation != null) {
            toolbarHandlerNode$foundation.hide();
        }
    }

    @Override // androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester
    public void show() {
        TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNodeRequireInitialized$foundation = requireInitialized$foundation();
        if (textContextMenuToolbarHandlerNodeRequireInitialized$foundation != null) {
            textContextMenuToolbarHandlerNodeRequireInitialized$foundation.show();
        }
    }
}
