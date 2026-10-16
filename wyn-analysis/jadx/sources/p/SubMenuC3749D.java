package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import ka.AbstractC3256n;

/* renamed from: p.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC3749D extends k implements SubMenu {

    /* renamed from: A, reason: collision with root package name */
    public final m f42979A;

    /* renamed from: z, reason: collision with root package name */
    public final k f42980z;

    public SubMenuC3749D(Context context, k kVar, m mVar) {
        super(context);
        this.f42980z = kVar;
        this.f42979A = mVar;
    }

    @Override // p.k
    public final boolean d(m mVar) {
        return this.f42980z.d(mVar);
    }

    @Override // p.k
    public final boolean e(k kVar, MenuItem menuItem) {
        return super.e(kVar, menuItem) || this.f42980z.e(kVar, menuItem);
    }

    @Override // p.k
    public final boolean f(m mVar) {
        return this.f42980z.f(mVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f42979A;
    }

    @Override // p.k
    public final String j() {
        m mVar = this.f42979A;
        int i5 = mVar != null ? mVar.f43068a : 0;
        if (i5 == 0) {
            return null;
        }
        return AbstractC3256n.g(i5, "android:menu:actionviewstates:");
    }

    @Override // p.k
    public final k k() {
        return this.f42980z.k();
    }

    @Override // p.k
    public final boolean m() {
        return this.f42980z.m();
    }

    @Override // p.k
    public final boolean n() {
        return this.f42980z.n();
    }

    @Override // p.k
    public final boolean o() {
        return this.f42980z.o();
    }

    @Override // p.k, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f42980z.setGroupDividerEnabled(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f42979A.setIcon(drawable);
        return this;
    }

    @Override // p.k, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f42980z.setQwertyMode(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i5) {
        u(0, null, i5, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i5) {
        u(i5, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i5) {
        this.f42979A.setIcon(i5);
        return this;
    }
}
