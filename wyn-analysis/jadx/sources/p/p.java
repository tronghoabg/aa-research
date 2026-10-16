package p;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class p implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f43098a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f43099b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f43099b = rVar;
        this.f43098a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f43098a.onMenuItemActionCollapse(this.f43099b.h(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f43098a.onMenuItemActionExpand(this.f43099b.h(menuItem));
    }
}
