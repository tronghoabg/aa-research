package android.support.v7.app;

import android.view.Menu;
import android.view.MenuItem;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ac implements android.support.v7.view.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ an f501a;

    /* renamed from: b, reason: collision with root package name */
    private final android.support.v7.view.a f502b;

    public ac(an anVar, android.support.v7.view.a aVar) {
        this.f501a = anVar;
        this.f502b = aVar;
    }

    @Override // android.support.v7.view.a
    public final void a(android.support.v7.view.b bVar) {
        this.f502b.a(bVar);
        an anVar = this.f501a;
        if (anVar.f535i != null) {
            anVar.f531e.getDecorView().removeCallbacks(anVar.f536j);
        }
        if (anVar.f534h != null) {
            anVar.N();
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompatAnimate = ViewCompat.animate(anVar.f534h);
            viewPropertyAnimatorCompatAnimate.alpha(0.0f);
            anVar.f537k = viewPropertyAnimatorCompatAnimate;
            anVar.f537k.setListener(new ab(this));
        }
        anVar.f533g = null;
        ViewCompat.requestApplyInsets(anVar.f538l);
        anVar.P();
    }

    @Override // android.support.v7.view.a
    public final boolean b(android.support.v7.view.b bVar, MenuItem menuItem) {
        return this.f502b.b(bVar, menuItem);
    }

    @Override // android.support.v7.view.a
    public final boolean c(android.support.v7.view.b bVar, Menu menu) {
        return this.f502b.c(bVar, menu);
    }

    @Override // android.support.v7.view.a
    public final boolean d(android.support.v7.view.b bVar, Menu menu) {
        ViewCompat.requestApplyInsets(this.f501a.f538l);
        return this.f502b.d(bVar, menu);
    }
}
