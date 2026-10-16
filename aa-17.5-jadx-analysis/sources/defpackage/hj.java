package defpackage;

import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes2.dex */
final class hj extends dsr implements ActionProvider.VisibilityListener {
    public static final /* synthetic */ int b = 0;
    public final ActionProvider a;
    private ajmd c;

    public hj(ActionProvider actionProvider) {
        this.a = actionProvider;
    }

    @Override // defpackage.dsr
    public final View a(MenuItem menuItem) {
        return this.a.onCreateActionView(menuItem);
    }

    @Override // defpackage.dsr
    public final void b(SubMenu subMenu) {
        this.a.onPrepareSubMenu(subMenu);
    }

    @Override // defpackage.dsr
    public final boolean c() {
        return this.a.hasSubMenu();
    }

    @Override // defpackage.dsr
    public final boolean d() {
        return this.a.isVisible();
    }

    @Override // defpackage.dsr
    public final boolean e() {
        return this.a.onPerformDefaultAction();
    }

    @Override // defpackage.dsr
    public final boolean f() {
        return this.a.overridesItemVisibility();
    }

    @Override // defpackage.dsr
    public final void g(ajmd ajmdVar) {
        this.c = ajmdVar;
        this.a.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        ajmd ajmdVar = this.c;
        if (ajmdVar != null) {
            ((hi) ajmdVar.a).j.B();
        }
    }
}
