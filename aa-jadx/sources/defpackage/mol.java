package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mol implements android.view.ActionMode.Callback {
    private final /* synthetic */ int a;

    public mol(int i) {
        this.a = i;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(android.view.ActionMode actionMode, android.view.MenuItem menuItem) {
        if (this.a != 0) {
            actionMode.getClass();
            menuItem.getClass();
        }
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
        if (this.a != 0) {
            actionMode.getClass();
            menu.getClass();
        }
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(android.view.ActionMode actionMode) {
        if (this.a != 0) {
            actionMode.getClass();
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
        if (this.a != 0) {
            actionMode.getClass();
            menu.getClass();
        }
        return false;
    }
}
