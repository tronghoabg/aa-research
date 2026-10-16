package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hn implements android.view.MenuItem.OnMenuItemClickListener {
    final /* synthetic */ defpackage.ho a;
    private final android.view.MenuItem.OnMenuItemClickListener b;

    public hn(defpackage.ho hoVar, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.a = hoVar;
        this.b = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
        return this.b.onMenuItemClick(this.a.a(menuItem));
    }
}
