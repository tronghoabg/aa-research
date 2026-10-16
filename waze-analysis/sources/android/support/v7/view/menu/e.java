package android.support.v7.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.internal.view.SupportSubMenu;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    final Context f786a;

    /* renamed from: b, reason: collision with root package name */
    private SimpleArrayMap f787b;

    /* renamed from: c, reason: collision with root package name */
    private SimpleArrayMap f788c;

    e(Context context) {
        this.f786a = context;
    }

    final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof SupportMenuItem)) {
            return menuItem;
        }
        SupportMenuItem supportMenuItem = (SupportMenuItem) menuItem;
        SimpleArrayMap simpleArrayMap = this.f787b;
        if (simpleArrayMap == null) {
            simpleArrayMap = new SimpleArrayMap();
            this.f787b = simpleArrayMap;
        }
        MenuItem menuItem2 = (MenuItem) simpleArrayMap.get(supportMenuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        y yVar = new y(this.f786a, supportMenuItem);
        this.f787b.put(supportMenuItem, yVar);
        return yVar;
    }

    final SubMenu b(SubMenu subMenu) {
        if (!(subMenu instanceof SupportSubMenu)) {
            return subMenu;
        }
        SupportSubMenu supportSubMenu = (SupportSubMenu) subMenu;
        SimpleArrayMap simpleArrayMap = this.f788c;
        if (simpleArrayMap == null) {
            simpleArrayMap = new SimpleArrayMap();
            this.f788c = simpleArrayMap;
        }
        SubMenu subMenu2 = (SubMenu) simpleArrayMap.get(supportSubMenu);
        if (subMenu2 != null) {
            return subMenu2;
        }
        am amVar = new am(this.f786a, supportSubMenu);
        this.f788c.put(supportSubMenu, amVar);
        return amVar;
    }

    final void c() {
        SimpleArrayMap simpleArrayMap = this.f787b;
        if (simpleArrayMap != null) {
            simpleArrayMap.clear();
        }
        SimpleArrayMap simpleArrayMap2 = this.f788c;
        if (simpleArrayMap2 != null) {
            simpleArrayMap2.clear();
        }
    }

    final void d(int i2) {
        if (this.f787b != null) {
            int i3 = 0;
            while (i3 < this.f787b.size()) {
                if (((SupportMenuItem) this.f787b.keyAt(i3)).getGroupId() == i2) {
                    this.f787b.removeAt(i3);
                    i3--;
                }
                i3++;
            }
        }
    }

    final void e(int i2) {
        if (this.f787b != null) {
            for (int i3 = 0; i3 < this.f787b.size(); i3++) {
                if (((SupportMenuItem) this.f787b.keyAt(i3)).getItemId() == i2) {
                    this.f787b.removeAt(i3);
                    return;
                }
            }
        }
    }
}
