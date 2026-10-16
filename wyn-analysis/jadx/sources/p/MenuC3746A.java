package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import d1.InterfaceMenuItemC2385a;
import x.C4429v;

/* renamed from: p.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC3746A extends J4.d implements Menu {

    /* renamed from: d, reason: collision with root package name */
    public final k f42960d;

    public MenuC3746A(Context context, k kVar) {
        super(context);
        if (kVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f42960d = kVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return h(this.f42960d.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i5, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f42960d.addIntentOptions(i5, i10, i11, componentName, intentArr, intent, i12, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i13 = 0; i13 < length; i13++) {
                menuItemArr[i13] = h(menuItemArr2[i13]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f42960d.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        C4429v c4429v = (C4429v) this.f5599c;
        if (c4429v != null) {
            c4429v.clear();
        }
        this.f42960d.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f42960d.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i5) {
        return h(this.f42960d.findItem(i5));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i5) {
        return h(this.f42960d.getItem(i5));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f42960d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i5, KeyEvent keyEvent) {
        return this.f42960d.isShortcutKey(i5, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i5, int i10) {
        return this.f42960d.performIdentifierAction(i5, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i5, KeyEvent keyEvent, int i10) {
        return this.f42960d.performShortcut(i5, keyEvent, i10);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i5) {
        if (((C4429v) this.f5599c) != null) {
            int i10 = 0;
            while (true) {
                C4429v c4429v = (C4429v) this.f5599c;
                if (i10 >= c4429v.f47563c) {
                    break;
                }
                if (((InterfaceMenuItemC2385a) c4429v.g(i10)).getGroupId() == i5) {
                    ((C4429v) this.f5599c).i(i10);
                    i10--;
                }
                i10++;
            }
        }
        this.f42960d.removeGroup(i5);
    }

    @Override // android.view.Menu
    public final void removeItem(int i5) {
        if (((C4429v) this.f5599c) != null) {
            int i10 = 0;
            while (true) {
                C4429v c4429v = (C4429v) this.f5599c;
                if (i10 >= c4429v.f47563c) {
                    break;
                }
                if (((InterfaceMenuItemC2385a) c4429v.g(i10)).getItemId() == i5) {
                    ((C4429v) this.f5599c).i(i10);
                    break;
                }
                i10++;
            }
        }
        this.f42960d.removeItem(i5);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i5, boolean z2, boolean z10) {
        this.f42960d.setGroupCheckable(i5, z2, z10);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i5, boolean z2) {
        this.f42960d.setGroupEnabled(i5, z2);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i5, boolean z2) {
        this.f42960d.setGroupVisible(i5, z2);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f42960d.setQwertyMode(z2);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f42960d.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i5) {
        return this.f42960d.addSubMenu(i5);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i5) {
        return h(this.f42960d.add(i5));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i5, int i10, int i11, CharSequence charSequence) {
        return this.f42960d.addSubMenu(i5, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i5, int i10, int i11, CharSequence charSequence) {
        return h(this.f42960d.a(i5, i10, i11, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i5, int i10, int i11, int i12) {
        return this.f42960d.addSubMenu(i5, i10, i11, i12);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i5, int i10, int i11, int i12) {
        return h(this.f42960d.add(i5, i10, i11, i12));
    }
}
