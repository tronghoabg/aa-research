package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes2.dex */
public final class ia extends hg implements SubMenu {
    public final hg k;
    public final hi l;

    public ia(Context context, hg hgVar, hi hiVar) {
        super(context);
        this.k = hgVar;
        this.l = hiVar;
    }

    @Override // defpackage.hg
    public final hg a() {
        return this.k.a();
    }

    @Override // defpackage.hg
    public final String d() {
        int i = this.l.a;
        if (i == 0) {
            return null;
        }
        return a.bp(i, "android:menu:actionviewstates:");
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.l;
    }

    @Override // defpackage.hg
    public final void p(he heVar) {
        this.k.p(heVar);
    }

    @Override // defpackage.hg, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.k.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        super.q(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        super.q(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        super.q(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.l.setIcon(i);
        return this;
    }

    @Override // defpackage.hg, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.k.setQwertyMode(z);
    }

    @Override // defpackage.hg
    public final boolean t(hi hiVar) {
        return this.k.t(hiVar);
    }

    @Override // defpackage.hg
    public final boolean u(hg hgVar, MenuItem menuItem) {
        return super.u(hgVar, menuItem) || this.k.u(hgVar, menuItem);
    }

    @Override // defpackage.hg
    public final boolean v(hi hiVar) {
        return this.k.v(hiVar);
    }

    @Override // defpackage.hg
    public final boolean w() {
        return this.k.w();
    }

    @Override // defpackage.hg
    public final boolean x() {
        return this.k.x();
    }

    @Override // defpackage.hg
    public final boolean y() {
        return this.k.y();
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.l.setIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        super.q(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        super.q(0, charSequence, 0, null, null);
        return this;
    }
}
