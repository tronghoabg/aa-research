package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.internal.view.SupportSubMenu;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class am extends ag implements SubMenu {

    /* renamed from: b, reason: collision with root package name */
    private final SupportSubMenu f778b;

    am(Context context, SupportSubMenu supportSubMenu) {
        super(context, supportSubMenu);
        this.f778b = supportSubMenu;
    }

    @Override // android.view.SubMenu
    public final void clearHeader() {
        this.f778b.clearHeader();
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return a(this.f778b.getItem());
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i2) {
        this.f778b.setHeaderIcon(i2);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i2) {
        this.f778b.setHeaderTitle(i2);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        this.f778b.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i2) {
        this.f778b.setIcon(i2);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.f778b.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f778b.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f778b.setIcon(drawable);
        return this;
    }
}
