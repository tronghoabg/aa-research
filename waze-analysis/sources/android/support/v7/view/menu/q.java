package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ActionProvider;
import androidx.core.view.ViewConfigurationCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class q implements SupportMenu {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f825d = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    CharSequence f826a;

    /* renamed from: b, reason: collision with root package name */
    Drawable f827b;

    /* renamed from: c, reason: collision with root package name */
    View f828c;

    /* renamed from: e, reason: collision with root package name */
    private final Context f829e;

    /* renamed from: f, reason: collision with root package name */
    private final Resources f830f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f831g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f832h;

    /* renamed from: i, reason: collision with root package name */
    private o f833i;

    /* renamed from: j, reason: collision with root package name */
    private final ArrayList f834j;

    /* renamed from: k, reason: collision with root package name */
    private final ArrayList f835k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f836l;
    private final ArrayList m;
    private final ArrayList n;
    private boolean o;
    private t w;
    private boolean y;
    private int p = 0;
    private boolean q = false;
    private boolean r = false;
    private boolean s = false;
    private boolean t = false;
    private final ArrayList u = new ArrayList();
    private final CopyOnWriteArrayList v = new CopyOnWriteArrayList();
    private boolean x = false;

    public q(Context context) {
        boolean z = false;
        this.f829e = context;
        Resources resources = context.getResources();
        this.f830f = resources;
        this.f834j = new ArrayList();
        this.f835k = new ArrayList();
        this.f836l = true;
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = true;
        if (resources.getConfiguration().keyboard != 1 && ViewConfigurationCompat.shouldShowMenuShortcutsWhenKeyboardPresent(ViewConfiguration.get(context), context)) {
            z = true;
        }
        this.f832h = z;
    }

    private final void P(int i2, boolean z) {
        if (i2 >= 0) {
            ArrayList arrayList = this.f834j;
            if (i2 >= arrayList.size()) {
                return;
            }
            arrayList.remove(i2);
            if (z) {
                p(true);
            }
        }
    }

    private final void Q(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        if (view != null) {
            this.f828c = view;
            this.f826a = null;
            this.f827b = null;
        } else {
            if (i2 > 0) {
                this.f826a = this.f830f.getText(i2);
            } else if (charSequence != null) {
                this.f826a = charSequence;
            }
            if (i3 > 0) {
                this.f827b = ContextCompat.getDrawable(this.f829e, i3);
            } else if (drawable != null) {
                this.f827b = drawable;
            }
            this.f828c = null;
        }
        p(false);
    }

    public boolean A(t tVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.v;
        boolean zI = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        x();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            ad adVar = (ad) weakReference.get();
            if (adVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zI = adVar.i(tVar);
                if (zI) {
                    break;
                }
            }
        }
        w();
        if (zI) {
            this.w = tVar;
        }
        return zI;
    }

    public final boolean B() {
        return !this.q;
    }

    public boolean C() {
        return this.x;
    }

    boolean D() {
        return this.f831g;
    }

    public boolean E() {
        return this.f832h;
    }

    public final boolean F(MenuItem menuItem, int i2) {
        return G(menuItem, null, i2);
    }

    public final boolean G(MenuItem menuItem, ad adVar, int i2) {
        boolean zG;
        t tVar = (t) menuItem;
        if (tVar != null && tVar.isEnabled()) {
            boolean zK = tVar.k();
            ActionProvider supportActionProvider = tVar.getSupportActionProvider();
            boolean z = supportActionProvider != null && supportActionProvider.hasSubMenu();
            if (tVar.j()) {
                boolean zExpandActionView = tVar.expandActionView() | zK;
                if (!zExpandActionView) {
                    return zExpandActionView;
                }
                m(true);
                return true;
            }
            if (!tVar.hasSubMenu() && !z) {
                if ((i2 & 1) != 0) {
                    return zK;
                }
                m(true);
                return zK;
            }
            if ((i2 & 4) == 0) {
                m(false);
            }
            if (!tVar.hasSubMenu()) {
                tVar.i(new al(this.f829e, this, tVar));
            }
            al alVar = (al) tVar.getSubMenu();
            if (z) {
                supportActionProvider.onPrepareSubMenu(alVar);
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.v;
            if (copyOnWriteArrayList.isEmpty()) {
                zG = false;
            } else {
                zG = adVar != null ? adVar.g(alVar) : false;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    ad adVar2 = (ad) weakReference.get();
                    if (adVar2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zG) {
                        zG = adVar2.g(alVar);
                    }
                }
            }
            boolean z2 = zK | zG;
            if (z2) {
                return z2;
            }
            m(true);
        }
        return false;
    }

    final void H() {
        this.o = true;
        p(true);
    }

    final void I() {
        this.f836l = true;
        p(true);
    }

    public final void J() {
        this.p = 1;
    }

    protected final void K(int i2) {
        Q(0, null, i2, null, null);
    }

    protected final void L(Drawable drawable) {
        Q(0, null, 0, drawable, null);
    }

    protected final void M(int i2) {
        Q(i2, null, 0, null, null);
    }

    protected final void N(CharSequence charSequence) {
        Q(0, charSequence, 0, null, null);
    }

    protected final void O(View view) {
        Q(0, null, 0, null, view);
    }

    public final Context a() {
        return this.f829e;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2) {
        return e(0, 0, 0, this.f830f.getString(i2));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f829e.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem menuItemE = e(i2, i3, i4, resolveInfo.loadLabel(packageManager));
            menuItemE.setIcon(resolveInfo.loadIcon(packageManager));
            menuItemE.setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = menuItemE;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        t tVar = (t) e(i2, i3, i4, charSequence);
        al alVar = new al(this.f829e, this, tVar);
        tVar.i(alVar);
        return alVar;
    }

    final t c(int i2, KeyEvent keyEvent) {
        ArrayList arrayList = this.u;
        arrayList.clear();
        n(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (t) arrayList.get(0);
        }
        boolean zD = D();
        for (int i3 = 0; i3 < size; i3++) {
            t tVar = (t) arrayList.get(i3);
            char alphabeticShortcut = zD ? tVar.getAlphabeticShortcut() : tVar.getNumericShortcut();
            if ((alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) || (zD && alphabeticShortcut == '\b' && i2 == 67))) {
                return tVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final void clear() {
        t tVar = this.w;
        if (tVar != null) {
            y(tVar);
        }
        this.f834j.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f827b = null;
        this.f826a = null;
        this.f828c = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m(true);
    }

    public final t d() {
        return this.w;
    }

    protected final MenuItem e(int i2, int i3, int i4, CharSequence charSequence) {
        int i5;
        int i6 = i4 >> 16;
        if (i6 < 0 || i6 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i7 = (f825d[i6] << 16) | ((char) i4);
        t tVar = new t(this, i2, i3, i4, i7, charSequence, this.p);
        ArrayList arrayList = this.f834j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                i5 = 0;
                break;
            }
            if (((t) arrayList.get(size)).b() <= i7) {
                i5 = size + 1;
                break;
            }
        }
        arrayList.add(i5, tVar);
        p(true);
        return tVar;
    }

    protected String f() {
        return "android:menu:actionviewstates";
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i2) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            t tVar = (t) this.f834j.get(i3);
            if (tVar.getItemId() == i2) {
                return tVar;
            }
            if (tVar.hasSubMenu() && (menuItemFindItem = tVar.getSubMenu().findItem(i2)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final ArrayList g() {
        o();
        return this.m;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i2) {
        return (MenuItem) this.f834j.get(i2);
    }

    public final ArrayList h() {
        o();
        return this.n;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.y) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((t) this.f834j.get(i2)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList i() {
        boolean z = this.f836l;
        ArrayList arrayList = this.f835k;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f834j;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            t tVar = (t) arrayList2.get(i2);
            if (tVar.isVisible()) {
                arrayList.add(tVar);
            }
        }
        this.f836l = false;
        this.o = true;
        return arrayList;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return c(i2, keyEvent) != null;
    }

    public final void j(ad adVar) {
        k(adVar, this.f829e);
    }

    public final void k(ad adVar, Context context) {
        this.v.add(new WeakReference(adVar));
        adVar.c(context, this);
        this.o = true;
    }

    public final void l() {
        o oVar = this.f833i;
        if (oVar != null) {
            oVar.O(this);
        }
    }

    public final void m(boolean z) {
        if (this.t) {
            return;
        }
        this.t = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.v;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            ad adVar = (ad) weakReference.get();
            if (adVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                adVar.d(this, z);
            }
        }
        this.t = false;
    }

    final void n(List list, int i2, KeyEvent keyEvent) {
        boolean zD = D();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData)) {
            if (i2 != 67) {
                return;
            } else {
                i2 = 67;
            }
        }
        ArrayList arrayList = this.f834j;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            t tVar = (t) arrayList.get(i3);
            if (tVar.hasSubMenu()) {
                ((q) tVar.getSubMenu()).n(list, i2, keyEvent);
            }
            char alphabeticShortcut = zD ? tVar.getAlphabeticShortcut() : tVar.getNumericShortcut();
            if ((modifiers & SupportMenu.SUPPORTED_MODIFIERS_MASK) == ((zD ? tVar.getAlphabeticModifiers() : tVar.getNumericModifiers()) & SupportMenu.SUPPORTED_MODIFIERS_MASK) && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (zD && alphabeticShortcut == '\b' && i2 == 67)) && tVar.isEnabled())) {
                list.add(tVar);
            }
        }
    }

    public final void o() {
        ArrayList arrayListI = i();
        if (this.o) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.v;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean zF = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                ad adVar = (ad) weakReference.get();
                if (adVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zF |= adVar.f();
                }
            }
            ArrayList arrayList = this.m;
            if (zF) {
                arrayList.clear();
                ArrayList arrayList2 = this.n;
                arrayList2.clear();
                int size = arrayListI.size();
                for (int i2 = 0; i2 < size; i2++) {
                    t tVar = (t) arrayListI.get(i2);
                    if (tVar.l()) {
                        arrayList.add(tVar);
                    } else {
                        arrayList2.add(tVar);
                    }
                }
            } else {
                arrayList.clear();
                ArrayList arrayList3 = this.n;
                arrayList3.clear();
                arrayList3.addAll(i());
            }
            this.o = false;
        }
    }

    public final void p(boolean z) {
        if (this.q) {
            this.r = true;
            if (z) {
                this.s = true;
                return;
            }
            return;
        }
        if (z) {
            this.f836l = true;
            this.o = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.v;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        x();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            ad adVar = (ad) weakReference.get();
            if (adVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                adVar.j();
            }
        }
        w();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i2, int i3) {
        return F(findItem(i2), i3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        t tVarC = c(i2, keyEvent);
        boolean zF = tVarC != null ? F(tVarC, i3) : false;
        if ((i3 & 2) != 0) {
            m(true);
        }
        return zF;
    }

    public final void q(ad adVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.v;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            ad adVar2 = (ad) weakReference.get();
            if (adVar2 == null || adVar2 == adVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    public final void r(Bundle bundle) {
        MenuItem menuItemFindItem;
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(f());
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((al) item.getSubMenu()).r(bundle);
            }
        }
        int i3 = bundle.getInt("android:menu:expandedactionview");
        if (i3 <= 0 || (menuItemFindItem = findItem(i3)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void removeGroup(int i2) {
        int size = size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((t) this.f834j.get(i3)).getGroupId() == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            ArrayList arrayList = this.f834j;
            int size2 = arrayList.size() - i3;
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                if (i4 >= size2 || ((t) arrayList.get(i3)).getGroupId() != i2) {
                    break;
                }
                P(i3, false);
                i4 = i5;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i2) {
        int size = size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((t) this.f834j.get(i3)).getItemId() == i2) {
                break;
            } else {
                i3++;
            }
        }
        P(i3, true);
    }

    public final void s(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((al) item.getSubMenu()).s(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(f(), sparseArray);
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i2, boolean z, boolean z2) {
        ArrayList arrayList = this.f834j;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            t tVar = (t) arrayList.get(i3);
            if (tVar.getGroupId() == i2) {
                tVar.g(z2);
                tVar.setCheckable(z);
            }
        }
    }

    @Override // androidx.core.internal.view.SupportMenu, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.x = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i2, boolean z) {
        ArrayList arrayList = this.f834j;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            t tVar = (t) arrayList.get(i3);
            if (tVar.getGroupId() == i2) {
                tVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i2, boolean z) {
        ArrayList arrayList = this.f834j;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            t tVar = (t) arrayList.get(i3);
            if (tVar.getGroupId() == i2 && tVar.o(z)) {
                z2 = true;
            }
        }
        if (z2) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f831g = z;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f834j.size();
    }

    public void t(o oVar) {
        this.f833i = oVar;
    }

    final void u(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        ArrayList arrayList = this.f834j;
        int size = arrayList.size();
        x();
        for (int i2 = 0; i2 < size; i2++) {
            t tVar = (t) arrayList.get(i2);
            if (tVar.getGroupId() == groupId && tVar.m() && tVar.isCheckable()) {
                tVar.f(tVar == menuItem);
            }
        }
        w();
    }

    public final void v(boolean z) {
        this.y = z;
    }

    public final void w() {
        this.q = false;
        if (this.r) {
            this.r = false;
            p(this.s);
        }
    }

    public final void x() {
        if (this.q) {
            return;
        }
        this.q = true;
        this.r = false;
        this.s = false;
    }

    public boolean y(t tVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.v;
        boolean zH = false;
        if (!copyOnWriteArrayList.isEmpty() && this.w == tVar) {
            x();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                ad adVar = (ad) weakReference.get();
                if (adVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zH = adVar.h(tVar);
                    if (zH) {
                        break;
                    }
                }
            }
            w();
            if (zH) {
                this.w = null;
            }
        }
        return zH;
    }

    boolean z(q qVar, MenuItem menuItem) {
        o oVar = this.f833i;
        return oVar != null && oVar.U(qVar, menuItem);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, int i5) {
        return e(i2, i3, i4, this.f830f.getString(i5));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return e(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return e(0, 0, 0, charSequence);
    }

    public q b() {
        return this;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.f830f.getString(i5));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f830f.getString(i2));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }
}
