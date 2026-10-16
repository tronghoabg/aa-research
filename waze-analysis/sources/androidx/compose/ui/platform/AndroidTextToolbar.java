package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.actionmodecallback.FloatingTextActionModeCallback;
import androidx.compose.ui.platform.actionmodecallback.TextActionModeCallback;
import h.ab;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidTextToolbar implements TextToolbar {
    public static final int $stable = 8;
    private ActionMode actionMode;
    private final View view;
    private final TextActionModeCallback textActionModeCallback = new TextActionModeCallback(new AndroidTextToolbar$textActionModeCallback$1(this), null, null, null, null, null, null, 126, null);
    private TextToolbarStatus status = TextToolbarStatus.Hidden;

    public AndroidTextToolbar(View view) {
        this.view = view;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public TextToolbarStatus getStatus() {
        return this.status;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public void hide() {
        this.status = TextToolbarStatus.Hidden;
        ActionMode actionMode = this.actionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.actionMode = null;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public void showMenu(Rect rect, a<ab> aVar, a<ab> aVar2, a<ab> aVar3, a<ab> aVar4, a<ab> aVar5) {
        this.textActionModeCallback.setRect(rect);
        this.textActionModeCallback.setOnCopyRequested(aVar);
        this.textActionModeCallback.setOnCutRequested(aVar3);
        this.textActionModeCallback.setOnPasteRequested(aVar2);
        this.textActionModeCallback.setOnSelectAllRequested(aVar4);
        this.textActionModeCallback.setOnAutofillRequested(aVar5);
        ActionMode actionMode = this.actionMode;
        if (actionMode != null) {
            actionMode.invalidate();
            return;
        }
        this.status = TextToolbarStatus.Shown;
        this.actionMode = TextToolbarHelperMethods.INSTANCE.startActionMode(this.view, new FloatingTextActionModeCallback(this.textActionModeCallback), 1);
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public void showMenu(Rect rect, a<ab> aVar, a<ab> aVar2, a<ab> aVar3, a<ab> aVar4) {
        showMenu(rect, aVar, aVar2, aVar3, aVar4, null);
    }
}
