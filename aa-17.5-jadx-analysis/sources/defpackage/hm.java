package defpackage;

import android.view.MenuItem;

/* loaded from: classes2.dex */
final class hm implements MenuItem.OnMenuItemClickListener {
    final /* synthetic */ hn a;
    private final MenuItem.OnMenuItemClickListener b;

    public hm(hn hnVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.a = hnVar;
        this.b = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.b.onMenuItemClick(this.a.a(menuItem));
    }
}
