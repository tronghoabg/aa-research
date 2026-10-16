package defpackage;

import android.view.MenuItem;

/* loaded from: classes2.dex */
final class hl implements MenuItem.OnActionExpandListener {
    final /* synthetic */ hn a;
    private final MenuItem.OnActionExpandListener b;

    public hl(hn hnVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.a = hnVar;
        this.b = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.b.onMenuItemActionCollapse(this.a.a(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.b.onMenuItemActionExpand(this.a.a(menuItem));
    }
}
