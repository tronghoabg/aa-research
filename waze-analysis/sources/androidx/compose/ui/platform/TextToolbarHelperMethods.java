package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class TextToolbarHelperMethods {
    public static final int $stable = 0;
    public static final TextToolbarHelperMethods INSTANCE = new TextToolbarHelperMethods();

    private TextToolbarHelperMethods() {
    }

    public final void invalidateContentRect(ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }

    public final ActionMode startActionMode(View view, ActionMode.Callback callback, int i2) {
        return view.startActionMode(callback, i2);
    }
}
