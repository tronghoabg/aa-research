package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class hh implements defpackage.dwa {
    private static final int[] k = {1, 4, 5, 3, 2, 0};
    public final android.content.Context a;
    public defpackage.hf b;
    public final java.util.ArrayList c;
    public final java.util.ArrayList d;
    java.lang.CharSequence e;
    android.graphics.drawable.Drawable f;
    android.view.View g;
    public defpackage.hj i;
    public boolean j;
    private final android.content.res.Resources l;
    private boolean m;
    private final boolean n;
    private final java.util.ArrayList o;
    private boolean p;
    private final java.util.ArrayList q;
    private boolean r;
    private int s = 0;
    public boolean h = false;
    private boolean t = false;
    private boolean u = false;
    private boolean v = false;
    private final java.util.ArrayList w = new java.util.ArrayList();
    private final java.util.concurrent.CopyOnWriteArrayList x = new java.util.concurrent.CopyOnWriteArrayList();
    private boolean y = false;

    public hh(android.content.Context context) {
        boolean z = false;
        this.a = context;
        android.content.res.Resources resources = context.getResources();
        this.l = resources;
        this.c = new java.util.ArrayList();
        this.o = new java.util.ArrayList();
        this.p = true;
        this.d = new java.util.ArrayList();
        this.q = new java.util.ArrayList();
        this.r = true;
        if (resources.getConfiguration().keyboard != 1 && hh$.ExternalSyntheticApiModelOutline0.m(android.view.ViewConfiguration.get(context))) {
            z = true;
        }
        this.n = z;
    }

    private final void D(int i, boolean z) {
        if (i >= 0) {
            java.util.ArrayList arrayList = this.c;
            if (i >= arrayList.size()) {
                return;
            }
            arrayList.remove(i);
            if (z) {
                l(true);
            }
        }
    }

    final void A() {
        this.r = true;
        l(true);
    }

    final void B() {
        this.p = true;
        l(true);
    }

    public final void C() {
        this.s = 1;
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(int i) {
        return c(0, 0, 0, this.l.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, android.content.ComponentName componentName, android.content.Intent[] intentArr, android.content.Intent intent, int i4, android.view.MenuItem[] menuItemArr) {
        android.content.pm.PackageManager packageManager = this.a.getPackageManager();
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            android.content.pm.ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i5);
            android.content.Intent intent2 = new android.content.Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new android.content.ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            android.view.MenuItem menuItemC = c(i, i2, i3, resolveInfo.loadLabel(packageManager));
            menuItemC.setIcon(resolveInfo.loadIcon(packageManager));
            ((defpackage.hj) menuItemC).e = intent2;
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = menuItemC;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        defpackage.hj hjVar = (defpackage.hj) c(i, i2, i3, charSequence);
        ib ibVar = new ib(this.a, this, hjVar);
        hjVar.l(ibVar);
        return ibVar;
    }

    final defpackage.hj b(int i, android.view.KeyEvent keyEvent) {
        java.util.ArrayList arrayList = this.w;
        arrayList.clear();
        j(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        android.view.KeyCharacterMap.KeyData keyData = new android.view.KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (defpackage.hj) arrayList.get(0);
        }
        boolean zX = x();
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.hj hjVar = (defpackage.hj) arrayList.get(i2);
            char c = zX ? hjVar.h : hjVar.f;
            if ((c == keyData.meta[0] && (metaState & 2) == 0) || ((c == keyData.meta[2] && (metaState & 2) != 0) || (zX && c == '\b' && i == 67))) {
                return hjVar;
            }
        }
        return null;
    }

    protected final android.view.MenuItem c(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        int i4;
        int i5 = i3 >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new java.lang.IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (k[i5] << 16) | ((char) i3);
        defpackage.hj hjVar = new defpackage.hj(this, i, i2, i3, i6, charSequence, this.s);
        java.util.ArrayList arrayList = this.c;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                i4 = 0;
            }
            arrayList.add(i4, hjVar);
            l(true);
            return hjVar;
        } while (((defpackage.hj) arrayList.get(size)).c > i6);
        i4 = size + 1;
        arrayList.add(i4, hjVar);
        l(true);
        return hjVar;
    }

    @Override // android.view.Menu
    public final void clear() {
        defpackage.hj hjVar = this.i;
        if (hjVar != null) {
            t(hjVar);
        }
        this.c.clear();
        l(true);
    }

    public final void clearHeader() {
        this.f = null;
        this.e = null;
        this.g = null;
        l(false);
    }

    @Override // android.view.Menu
    public final void close() {
        i(true);
    }

    protected java.lang.String d() {
        return "android:menu:actionviewstates";
    }

    public final java.util.ArrayList e() {
        k();
        return this.q;
    }

    public final java.util.ArrayList f() {
        boolean z = this.p;
        java.util.ArrayList arrayList = this.o;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        java.util.ArrayList arrayList2 = this.c;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            defpackage.hj hjVar = (defpackage.hj) arrayList2.get(i);
            if (hjVar.isVisible()) {
                arrayList.add(hjVar);
            }
        }
        this.p = false;
        this.r = true;
        return arrayList;
    }

    @Override // android.view.Menu
    public final android.view.MenuItem findItem(int i) {
        android.view.MenuItem menuItemFindItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.hj hjVar = (defpackage.hj) this.c.get(i2);
            if (hjVar.a == i) {
                return hjVar;
            }
            if (hjVar.hasSubMenu() && (menuItemFindItem = hjVar.k.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final void g(defpackage.ht htVar) {
        h(htVar, this.a);
    }

    @Override // android.view.Menu
    public final android.view.MenuItem getItem(int i) {
        return (android.view.MenuItem) this.c.get(i);
    }

    public final void h(defpackage.ht htVar, android.content.Context context) {
        this.x.add(new java.lang.ref.WeakReference(htVar));
        htVar.b(context, this);
        this.r = true;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.j) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((defpackage.hj) this.c.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(boolean z) {
        if (this.v) {
            return;
        }
        this.v = true;
        java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference> copyOnWriteArrayList = this.x;
        for (java.lang.ref.WeakReference weakReference : copyOnWriteArrayList) {
            defpackage.ht htVar = (defpackage.ht) weakReference.get();
            if (htVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                htVar.c(this, z);
            }
        }
        this.v = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, android.view.KeyEvent keyEvent) {
        return b(i, keyEvent) != null;
    }

    final void j(java.util.List list, int i, android.view.KeyEvent keyEvent) {
        boolean zX = x();
        int modifiers = keyEvent.getModifiers();
        android.view.KeyCharacterMap.KeyData keyData = new android.view.KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData)) {
            if (i != 67) {
                return;
            } else {
                i = 67;
            }
        }
        java.util.ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.hj hjVar = (defpackage.hj) arrayList.get(i2);
            if (hjVar.hasSubMenu()) {
                hjVar.k.j(list, i, keyEvent);
            }
            char c = zX ? hjVar.h : hjVar.f;
            if ((modifiers & 69647) == ((zX ? hjVar.i : hjVar.g) & 69647) && c != 0 && ((c == keyData.meta[0] || c == keyData.meta[2] || (zX && c == '\b' && i == 67)) && hjVar.isEnabled())) {
                list.add(hjVar);
            }
        }
    }

    public final void k() {
        java.util.ArrayList arrayListF = f();
        if (this.r) {
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference> copyOnWriteArrayList = this.x;
            boolean zE = false;
            for (java.lang.ref.WeakReference weakReference : copyOnWriteArrayList) {
                defpackage.ht htVar = (defpackage.ht) weakReference.get();
                if (htVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zE |= htVar.e();
                }
            }
            java.util.ArrayList arrayList = this.d;
            if (zE) {
                arrayList.clear();
                java.util.ArrayList arrayList2 = this.q;
                arrayList2.clear();
                int size = arrayListF.size();
                for (int i = 0; i < size; i++) {
                    defpackage.hj hjVar = (defpackage.hj) arrayListF.get(i);
                    if (hjVar.o()) {
                        arrayList.add(hjVar);
                    } else {
                        arrayList2.add(hjVar);
                    }
                }
            } else {
                arrayList.clear();
                java.util.ArrayList arrayList3 = this.q;
                arrayList3.clear();
                arrayList3.addAll(f());
            }
            this.r = false;
        }
    }

    public final void l(boolean z) {
        if (this.h) {
            this.t = true;
            if (z) {
                this.u = true;
                return;
            }
            return;
        }
        if (z) {
            this.p = true;
            this.r = true;
        }
        java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference> copyOnWriteArrayList = this.x;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        s();
        for (java.lang.ref.WeakReference weakReference : copyOnWriteArrayList) {
            defpackage.ht htVar = (defpackage.ht) weakReference.get();
            if (htVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                htVar.i();
            }
        }
        r();
    }

    public final void m(defpackage.ht htVar) {
        java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference> copyOnWriteArrayList = this.x;
        for (java.lang.ref.WeakReference weakReference : copyOnWriteArrayList) {
            defpackage.ht htVar2 = (defpackage.ht) weakReference.get();
            if (htVar2 == null || htVar2 == htVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    public final void n(android.os.Bundle bundle) {
        android.view.MenuItem menuItemFindItem;
        android.util.SparseArray<android.os.Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(d());
        int size = size();
        for (int i = 0; i < size; i++) {
            android.view.MenuItem item = getItem(i);
            android.view.View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                item.getSubMenu().n(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public final void o(android.os.Bundle bundle) {
        int size = size();
        android.util.SparseArray<? extends android.os.Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            android.view.MenuItem item = getItem(i);
            android.view.View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new android.util.SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                item.getSubMenu().o(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(d(), sparseArray);
        }
    }

    public void p(defpackage.hf hfVar) {
        this.b = hfVar;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return z(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, android.view.KeyEvent keyEvent, int i2) {
        defpackage.hj hjVarB = b(i, keyEvent);
        boolean z = hjVarB != null ? z(hjVarB, null, i2) : false;
        if ((i2 & 2) != 0) {
            i(true);
        }
        return z;
    }

    public final void q(int i, java.lang.CharSequence charSequence, int i2, android.graphics.drawable.Drawable drawable, android.view.View view) {
        if (view != null) {
            this.g = view;
            this.e = null;
            this.f = null;
        } else {
            if (i > 0) {
                this.e = this.l.getText(i);
            } else if (charSequence != null) {
                this.e = charSequence;
            }
            if (i2 > 0) {
                this.f = this.a.getDrawable(i2);
            } else if (drawable != null) {
                this.f = drawable;
            }
            this.g = null;
        }
        l(false);
    }

    public final void r() {
        this.h = false;
        if (this.t) {
            this.t = false;
            l(this.u);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((defpackage.hj) this.c.get(i2)).b == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            java.util.ArrayList arrayList = this.c;
            int size2 = arrayList.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || ((defpackage.hj) arrayList.get(i2)).b != i) {
                    break;
                }
                D(i2, false);
                i3 = i4;
            }
            l(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (i2 < size) {
            if (((defpackage.hj) this.c.get(i2)).a == i) {
                D(i2, true);
            }
            i2++;
        }
        i2 = -1;
        D(i2, true);
    }

    public final void s() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.t = false;
        this.u = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        java.util.ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.hj hjVar = (defpackage.hj) arrayList.get(i2);
            if (hjVar.b == i) {
                hjVar.j(z2);
                hjVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.y = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        java.util.ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.hj hjVar = (defpackage.hj) arrayList.get(i2);
            if (hjVar.b == i) {
                hjVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        java.util.ArrayList arrayList = this.c;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.hj hjVar = (defpackage.hj) arrayList.get(i2);
            if (hjVar.b == i && hjVar.s(z)) {
                z2 = true;
            }
        }
        if (z2) {
            l(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.m = z;
        l(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.c.size();
    }

    public boolean t(defpackage.hj hjVar) {
        java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference> copyOnWriteArrayList = this.x;
        boolean zG = false;
        if (!copyOnWriteArrayList.isEmpty() && this.i == hjVar) {
            s();
            for (java.lang.ref.WeakReference weakReference : copyOnWriteArrayList) {
                defpackage.ht htVar = (defpackage.ht) weakReference.get();
                if (htVar != null) {
                    zG = htVar.g(hjVar);
                    if (zG) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            r();
            if (zG) {
                this.i = null;
            }
        }
        return zG;
    }

    public boolean u(defpackage.hh hhVar, android.view.MenuItem menuItem) {
        defpackage.hf hfVar = this.b;
        return hfVar != null && hfVar.M(hhVar, menuItem);
    }

    public boolean v(defpackage.hj hjVar) {
        java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference> copyOnWriteArrayList = this.x;
        boolean zH = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        for (java.lang.ref.WeakReference weakReference : copyOnWriteArrayList) {
            defpackage.ht htVar = (defpackage.ht) weakReference.get();
            if (htVar != null) {
                zH = htVar.h(hjVar);
                if (zH) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        r();
        if (zH) {
            this.i = hjVar;
        }
        return zH;
    }

    public boolean w() {
        return this.y;
    }

    public boolean x() {
        return this.m;
    }

    public boolean y() {
        return this.n;
    }

    public final boolean z(android.view.MenuItem menuItem, defpackage.ht htVar, int i) {
        boolean zF;
        defpackage.hj hjVar = (defpackage.hj) menuItem;
        if (hjVar != null && hjVar.isEnabled()) {
            boolean zN = hjVar.n();
            dsy dsyVar = hjVar.p;
            boolean z = dsyVar != null && dsyVar.c();
            if (hjVar.m()) {
                boolean zExpandActionView = hjVar.expandActionView() | zN;
                if (!zExpandActionView) {
                    return zExpandActionView;
                }
                i(true);
                return true;
            }
            if (!hjVar.hasSubMenu() && !z) {
                if ((i & 1) != 0) {
                    return zN;
                }
                i(true);
                return zN;
            }
            if ((i & 4) == 0) {
                i(false);
            }
            if (!hjVar.hasSubMenu()) {
                hjVar.l(new ib(this.a, this, hjVar));
            }
            ib ibVar = hjVar.k;
            if (z) {
                dsyVar.b(ibVar);
            }
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference> copyOnWriteArrayList = this.x;
            if (copyOnWriteArrayList.isEmpty()) {
                zF = false;
            } else {
                zF = htVar != null ? htVar.f(ibVar) : false;
                for (java.lang.ref.WeakReference weakReference : copyOnWriteArrayList) {
                    defpackage.ht htVar2 = (defpackage.ht) weakReference.get();
                    if (htVar2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zF) {
                        zF = htVar2.f(ibVar);
                    }
                }
            }
            boolean z2 = zN | zF;
            if (z2) {
                return z2;
            }
            i(true);
        }
        return false;
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(int i, int i2, int i3, int i4) {
        return c(i, i2, i3, this.l.getString(i4));
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        return c(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(java.lang.CharSequence charSequence) {
        return c(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.l.getString(i4));
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.l.getString(i));
    }

    public defpackage.hh a() {
        return this;
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(java.lang.CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }
}
