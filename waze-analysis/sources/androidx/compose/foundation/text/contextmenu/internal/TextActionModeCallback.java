package androidx.compose.foundation.text.contextmenu.internal;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.ui.geometry.Rect;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface TextActionModeCallback {
    boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem);

    boolean onCreateActionMode(ActionMode actionMode, Menu menu);

    void onDestroyActionMode(ActionMode actionMode);

    Rect onGetContentRect(ActionMode actionMode, View view);

    boolean onPrepareActionMode(ActionMode actionMode, Menu menu);
}
