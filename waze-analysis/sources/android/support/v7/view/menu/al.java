package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class al extends q implements SubMenu {

    /* renamed from: d, reason: collision with root package name */
    private final q f776d;

    /* renamed from: e, reason: collision with root package name */
    private final t f777e;

    public al(Context context, q qVar, t tVar) {
        super(context);
        this.f776d = qVar;
        this.f777e = tVar;
    }

    @Override // android.support.v7.view.menu.q
    public final boolean A(t tVar) {
        return this.f776d.A(tVar);
    }

    @Override // android.support.v7.view.menu.q
    public final boolean C() {
        return this.f776d.C();
    }

    @Override // android.support.v7.view.menu.q
    public final boolean D() {
        return this.f776d.D();
    }

    @Override // android.support.v7.view.menu.q
    public final boolean E() {
        return this.f776d.E();
    }

    public final Menu P() {
        return this.f776d;
    }

    @Override // android.support.v7.view.menu.q
    public final q b() {
        return this.f776d.b();
    }

    @Override // android.support.v7.view.menu.q
    public final String f() {
        int itemId = this.f777e.getItemId();
        if (itemId == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + itemId;
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f777e;
    }

    @Override // android.support.v7.view.menu.q, androidx.core.internal.view.SupportMenu, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.f776d.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i2) {
        super.K(i2);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i2) {
        super.M(i2);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        super.O(view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i2) {
        this.f777e.setIcon(i2);
        return this;
    }

    @Override // android.support.v7.view.menu.q, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f776d.setQwertyMode(z);
    }

    @Override // android.support.v7.view.menu.q
    public final void t(o oVar) {
        this.f776d.t(oVar);
    }

    @Override // android.support.v7.view.menu.q
    public final boolean y(t tVar) {
        return this.f776d.y(tVar);
    }

    @Override // android.support.v7.view.menu.q
    final boolean z(q qVar, MenuItem menuItem) {
        return super.z(qVar, menuItem) || this.f776d.z(qVar, menuItem);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        super.L(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        super.N(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f777e.setIcon(drawable);
        return this;
    }
}
