package androidx.compose.foundation.text.contextmenu.internal;

import android.view.ActionMode;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TextToolbarHelper {
    public static final TextToolbarHelper INSTANCE = new TextToolbarHelper();

    private TextToolbarHelper() {
    }

    public final void invalidateContentRect(ActionMode actionMode) {
        TextToolbarHelperApi23.INSTANCE.invalidateContentRect(actionMode);
    }

    public final ActionMode startActionMode(View view, TextActionModeCallback textActionModeCallback) {
        return TextToolbarHelperApi23.INSTANCE.startActionMode(view, new FloatingTextActionModeCallback(textActionModeCallback), 1);
    }
}
