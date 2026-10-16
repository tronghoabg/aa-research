package android.support.v7.widget;

import android.view.MenuItem;
import android.view.ViewGroup;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ge implements android.support.v7.view.menu.o {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewGroup f1548a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f1549b;

    ge(ViewGroup viewGroup, int i2) {
        this.f1549b = i2;
        this.f1548a = viewGroup;
    }

    @Override // android.support.v7.view.menu.o
    public final void O(android.support.v7.view.menu.q qVar) {
        int i2 = this.f1549b;
        ViewGroup viewGroup = this.f1548a;
        if (i2 != 0) {
            android.support.v7.view.menu.o oVar = ((ActionMenuView) viewGroup).f891a;
            if (oVar != null) {
                oVar.O(qVar);
                return;
            }
            return;
        }
        Toolbar toolbar = (Toolbar) viewGroup;
        if (toolbar.f971a.p()) {
            return;
        }
        toolbar.f975e.onPrepareMenu(qVar);
    }

    @Override // android.support.v7.view.menu.o
    public final boolean U(android.support.v7.view.menu.q qVar, MenuItem menuItem) {
        t tVar;
        return (this.f1549b == 0 || (tVar = ((ActionMenuView) this.f1548a).f892b) == null || !((gd) tVar).f1547a.f975e.onMenuItemSelected(menuItem)) ? false : true;
    }
}
