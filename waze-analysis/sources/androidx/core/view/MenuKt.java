package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.a.a;
import h.g.b.x;
import h.m.h;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MenuKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.core.view.MenuKt$iterator$1, reason: invalid class name */
    public final class AnonymousClass1 implements Iterator<MenuItem>, a {
        final /* synthetic */ Menu $this_iterator;
        private int index;

        AnonymousClass1(Menu menu) {
            this.$this_iterator = menu;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.$this_iterator.size();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public MenuItem next() {
            int i2 = this.index;
            this.index = i2 + 1;
            MenuItem item = this.$this_iterator.getItem(i2);
            if (item != null) {
                return item;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public void remove() {
            int i2 = this.index - 1;
            this.index = i2;
            Menu menu = this.$this_iterator;
            MenuItem item = menu.getItem(i2);
            if (item == null) {
                throw new IndexOutOfBoundsException();
            }
            menu.removeItem(item.getItemId());
        }
    }

    public static final boolean contains(Menu menu, MenuItem menuItem) {
        x.f(menu, "<this>");
        x.f(menuItem, "item");
        int size = menu.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (x.n(menu.getItem(i2), menuItem)) {
                return true;
            }
        }
        return false;
    }

    public static final void forEach(Menu menu, l<? super MenuItem, ab> lVar) {
        x.f(menu, "<this>");
        x.f(lVar, "action");
        int size = menu.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = menu.getItem(i2);
            x.e(item, "getItem(...)");
            lVar.invoke(item);
        }
    }

    public static final void forEachIndexed(Menu menu, p<? super Integer, ? super MenuItem, ab> pVar) {
        x.f(menu, "<this>");
        x.f(pVar, "action");
        int size = menu.size();
        for (int i2 = 0; i2 < size; i2++) {
            Integer numValueOf = Integer.valueOf(i2);
            MenuItem item = menu.getItem(i2);
            x.e(item, "getItem(...)");
            pVar.invoke(numValueOf, item);
        }
    }

    public static final MenuItem get(Menu menu, int i2) {
        x.f(menu, "<this>");
        MenuItem item = menu.getItem(i2);
        x.e(item, "getItem(...)");
        return item;
    }

    public static final h<MenuItem> getChildren(final Menu menu) {
        x.f(menu, "<this>");
        return new h<MenuItem>() { // from class: androidx.core.view.MenuKt$children$1
            @Override // h.m.h
            public Iterator<MenuItem> iterator() {
                return MenuKt.iterator(menu);
            }
        };
    }

    public static final int getSize(Menu menu) {
        x.f(menu, "<this>");
        return menu.size();
    }

    public static final boolean isEmpty(Menu menu) {
        x.f(menu, "<this>");
        return menu.size() == 0;
    }

    public static final boolean isNotEmpty(Menu menu) {
        x.f(menu, "<this>");
        return menu.size() != 0;
    }

    public static final Iterator<MenuItem> iterator(Menu menu) {
        x.f(menu, "<this>");
        return new AnonymousClass1(menu);
    }

    public static final void minusAssign(Menu menu, MenuItem menuItem) {
        x.f(menu, "<this>");
        x.f(menuItem, "item");
        menu.removeItem(menuItem.getItemId());
    }

    public static final void removeItemAt(Menu menu, int i2) {
        x.f(menu, "<this>");
        MenuItem item = menu.getItem(i2);
        if (item == null) {
            throw new IndexOutOfBoundsException();
        }
        menu.removeItem(item.getItemId());
    }
}
