package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bgr extends android.view.ActionMode.Callback2 implements android.view.ActionMode.Callback {
    private final defpackage.bgh a;

    public bgr(defpackage.bgh bghVar) {
        this.a = bghVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(android.view.ActionMode actionMode, android.view.MenuItem menuItem) {
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
        this.a.a(menu);
        return menu.size() > 0;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(android.view.ActionMode actionMode) {
        this.a.a.a();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(android.view.ActionMode actionMode, android.view.View view, android.graphics.Rect rect) {
        defpackage.cjj cjjVar = (defpackage.cjj) this.a.b.invoke();
        rect.set(java.lang.Math.round(cjjVar.b), java.lang.Math.round(cjjVar.c), java.lang.Math.round(cjjVar.d), java.lang.Math.round(cjjVar.e));
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
        return this.a.a(menu);
    }
}
