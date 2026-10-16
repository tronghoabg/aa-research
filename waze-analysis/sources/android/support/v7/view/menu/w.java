package android.support.v7.view.menu;

import android.view.MenuItem;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class w implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ y f857a;

    /* renamed from: b, reason: collision with root package name */
    private final MenuItem.OnActionExpandListener f858b;

    w(y yVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f857a = yVar;
        this.f858b = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f858b.onMenuItemActionCollapse(this.f857a.a(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f858b.onMenuItemActionExpand(this.f857a.a(menuItem));
    }
}
