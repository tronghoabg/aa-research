package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.core.internal.view.SupportMenu;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class ag extends e implements Menu {

    /* renamed from: b, reason: collision with root package name */
    private final SupportMenu f761b;

    public ag(Context context, SupportMenu supportMenu) {
        super(context);
        if (supportMenu == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f761b = supportMenu;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2) {
        return a(this.f761b.add(i2));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f761b.addIntentOptions(i2, i3, i4, componentName, intentArr, intent, i5, menuItemArr2);
        if (menuItemArr2 != null) {
            for (int i6 = 0; i6 < menuItemArr2.length; i6++) {
                menuItemArr[i6] = a(menuItemArr2[i6]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2) {
        return b(this.f761b.addSubMenu(i2));
    }

    @Override // android.view.Menu
    public final void clear() {
        c();
        this.f761b.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f761b.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i2) {
        return a(this.f761b.findItem(i2));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i2) {
        return a(this.f761b.getItem(i2));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f761b.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return this.f761b.isShortcutKey(i2, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i2, int i3) {
        return this.f761b.performIdentifierAction(i2, i3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        return this.f761b.performShortcut(i2, keyEvent, i3);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i2) {
        d(i2);
        this.f761b.removeGroup(i2);
    }

    @Override // android.view.Menu
    public final void removeItem(int i2) {
        e(i2);
        this.f761b.removeItem(i2);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i2, boolean z, boolean z2) {
        this.f761b.setGroupCheckable(i2, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i2, boolean z) {
        this.f761b.setGroupEnabled(i2, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i2, boolean z) {
        this.f761b.setGroupVisible(i2, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f761b.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f761b.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, int i5) {
        return a(this.f761b.add(i2, i3, i4, i5));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return b(this.f761b.addSubMenu(i2, i3, i4, i5));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(this.f761b.add(i2, i3, i4, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(this.f761b.add(charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        return b(this.f761b.addSubMenu(i2, i3, i4, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return b(this.f761b.addSubMenu(charSequence));
    }
}
