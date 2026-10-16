package defpackage;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* loaded from: classes2.dex */
public final class mof implements ActionMode.Callback {
    private final /* synthetic */ int a;

    public mof(int i) {
        this.a = i;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (this.a != 0) {
            actionMode.getClass();
            menuItem.getClass();
        }
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        if (this.a != 0) {
            actionMode.getClass();
            menu.getClass();
        }
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        if (this.a != 0) {
            actionMode.getClass();
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        if (this.a != 0) {
            actionMode.getClass();
            menu.getClass();
        }
        return false;
    }
}
