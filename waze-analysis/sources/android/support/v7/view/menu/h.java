package android.support.v7.view.menu;

import android.view.MenuItem;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j f791a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MenuItem f792b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ q f793c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ i f794d;

    h(i iVar, j jVar, MenuItem menuItem, q qVar) {
        this.f794d = iVar;
        this.f791a = jVar;
        this.f792b = menuItem;
        this.f793c = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar = this.f791a;
        if (jVar != null) {
            k kVar = this.f794d.f795a;
            kVar.f804f = true;
            jVar.f797b.m(false);
            kVar.f804f = false;
        }
        MenuItem menuItem = this.f792b;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.f793c.F(menuItem, 4);
        }
    }
}
