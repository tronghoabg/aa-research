package p;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class q implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f43100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f43101b;

    public q(r rVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f43101b = rVar;
        this.f43100a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f43100a.onMenuItemClick(this.f43101b.h(menuItem));
    }
}
