package android.support.v7.view.menu;

import android.view.MenuItem;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class x implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ y f859a;

    /* renamed from: b, reason: collision with root package name */
    private final MenuItem.OnMenuItemClickListener f860b;

    x(y yVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f859a = yVar;
        this.f860b = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f860b.onMenuItemClick(this.f859a.a(menuItem));
    }
}
