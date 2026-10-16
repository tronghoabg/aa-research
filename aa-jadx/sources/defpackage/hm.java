package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hm implements android.view.MenuItem.OnActionExpandListener {
    final /* synthetic */ defpackage.ho a;
    private final android.view.MenuItem.OnActionExpandListener b;

    public hm(defpackage.ho hoVar, android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        this.a = hoVar;
        this.b = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(android.view.MenuItem menuItem) {
        return this.b.onMenuItemActionCollapse(this.a.a(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(android.view.MenuItem menuItem) {
        return this.b.onMenuItemActionExpand(this.a.a(menuItem));
    }
}
