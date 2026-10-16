package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ib extends defpackage.hh implements android.view.SubMenu {
    public final defpackage.hh k;
    public final defpackage.hj l;

    public ib(android.content.Context context, defpackage.hh hhVar, defpackage.hj hjVar) {
        super(context);
        this.k = hhVar;
        this.l = hjVar;
    }

    @Override // defpackage.hh
    public final defpackage.hh a() {
        return this.k.a();
    }

    @Override // defpackage.hh
    public final java.lang.String d() {
        int i = this.l.a;
        if (i == 0) {
            return null;
        }
        return defpackage.a.bo(i, "android:menu:actionviewstates:");
    }

    @Override // android.view.SubMenu
    public final android.view.MenuItem getItem() {
        return this.l;
    }

    @Override // defpackage.hh
    public final void p(defpackage.hf hfVar) {
        this.k.p(hfVar);
    }

    @Override // defpackage.hh, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.k.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderIcon(int i) {
        super.q(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderTitle(int i) {
        super.q(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderView(android.view.View view) {
        super.q(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setIcon(int i) {
        this.l.setIcon(i);
        return this;
    }

    @Override // defpackage.hh, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.k.setQwertyMode(z);
    }

    @Override // defpackage.hh
    public final boolean t(defpackage.hj hjVar) {
        return this.k.t(hjVar);
    }

    @Override // defpackage.hh
    public final boolean u(defpackage.hh hhVar, android.view.MenuItem menuItem) {
        return super.u(hhVar, menuItem) || this.k.u(hhVar, menuItem);
    }

    @Override // defpackage.hh
    public final boolean v(defpackage.hj hjVar) {
        return this.k.v(hjVar);
    }

    @Override // defpackage.hh
    public final boolean w() {
        return this.k.w();
    }

    @Override // defpackage.hh
    public final boolean x() {
        return this.k.x();
    }

    @Override // defpackage.hh
    public final boolean y() {
        return this.k.y();
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setIcon(android.graphics.drawable.Drawable drawable) {
        this.l.setIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable drawable) {
        super.q(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderTitle(java.lang.CharSequence charSequence) {
        super.q(0, charSequence, 0, null, null);
        return this;
    }
}
