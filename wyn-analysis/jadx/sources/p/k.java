package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k1.T;

/* loaded from: classes.dex */
public class k implements Menu {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f43038y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f43039a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f43040b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f43041c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f43042d;

    /* renamed from: e, reason: collision with root package name */
    public i f43043e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f43044f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f43045g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f43046h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f43047i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f43048j;
    public boolean k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f43050m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f43051n;

    /* renamed from: o, reason: collision with root package name */
    public View f43052o;

    /* renamed from: v, reason: collision with root package name */
    public m f43059v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f43061x;

    /* renamed from: l, reason: collision with root package name */
    public int f43049l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f43053p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f43054q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f43055r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f43056s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f43057t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f43058u = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f43060w = false;

    public k(Context context) {
        boolean zQ;
        boolean z2 = false;
        this.f43039a = context;
        Resources resources = context.getResources();
        this.f43040b = resources;
        this.f43044f = new ArrayList();
        this.f43045g = new ArrayList();
        this.f43046h = true;
        this.f43047i = new ArrayList();
        this.f43048j = new ArrayList();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = T.f38785a;
            if (Build.VERSION.SDK_INT >= 28) {
                zQ = Y0.c.q(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zQ = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zQ) {
                z2 = true;
            }
        }
        this.f43042d = z2;
    }

    public final m a(int i5, int i10, int i11, CharSequence charSequence) {
        int i12;
        int i13 = ((-65536) & i11) >> 16;
        if (i13 < 0 || i13 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i14 = (f43038y[i13] << 16) | (65535 & i11);
        m mVar = new m(this, i5, i10, i11, i14, charSequence, this.f43049l);
        ArrayList arrayList = this.f43044f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i12 = 0;
                break;
            }
            if (((m) arrayList.get(size)).f43071d <= i14) {
                i12 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i12, mVar);
        p(true);
        return mVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i5, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        int i13;
        PackageManager packageManager = this.f43039a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i12 & 1) == 0) {
            removeGroup(i5);
        }
        for (int i14 = 0; i14 < size; i14++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i14);
            int i15 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i15 < 0 ? intent : intentArr[i15]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            m mVarA = a(i5, i10, i11, resolveInfo.loadLabel(packageManager));
            mVarA.setIcon(resolveInfo.loadIcon(packageManager));
            mVarA.f43074g = intent2;
            if (menuItemArr != null && (i13 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i13] = mVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(x xVar, Context context) {
        this.f43058u.add(new WeakReference(xVar));
        xVar.b(context, this);
        this.k = true;
    }

    public final void c(boolean z2) {
        if (this.f43056s) {
            return;
        }
        this.f43056s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f43058u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.l(this, z2);
            }
        }
        this.f43056s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        m mVar = this.f43059v;
        if (mVar != null) {
            d(mVar);
        }
        this.f43044f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f43051n = null;
        this.f43050m = null;
        this.f43052o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(m mVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f43058u;
        boolean zF = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f43059v == mVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                x xVar = (x) weakReference.get();
                if (xVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zF = xVar.f(mVar);
                    if (zF) {
                        break;
                    }
                }
            }
            v();
            if (zF) {
                this.f43059v = null;
            }
        }
        return zF;
    }

    public boolean e(k kVar, MenuItem menuItem) {
        i iVar = this.f43043e;
        return iVar != null && iVar.f(kVar, menuItem);
    }

    public boolean f(m mVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f43058u;
        boolean zE = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zE = xVar.e(mVar);
                if (zE) {
                    break;
                }
            }
        }
        v();
        if (zE) {
            this.f43059v = mVar;
        }
        return zE;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i5) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f43044f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = (m) arrayList.get(i10);
            if (mVar.f43068a == i5) {
                return mVar;
            }
            if (mVar.hasSubMenu() && (menuItemFindItem = mVar.f43081o.findItem(i5)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final m g(int i5, KeyEvent keyEvent) {
        ArrayList arrayList = this.f43057t;
        arrayList.clear();
        h(arrayList, i5, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (m) arrayList.get(0);
        }
        boolean zN = n();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = (m) arrayList.get(i10);
            char c10 = zN ? mVar.f43077j : mVar.f43075h;
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (zN && c10 == '\b' && i5 == 67))) {
                return mVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i5) {
        return (MenuItem) this.f43044f.get(i5);
    }

    public final void h(ArrayList arrayList, int i5, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i5 == 67) {
            ArrayList arrayList2 = this.f43044f;
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                m mVar = (m) arrayList2.get(i10);
                if (mVar.hasSubMenu()) {
                    mVar.f43081o.h(arrayList, i5, keyEvent);
                }
                char c10 = zN ? mVar.f43077j : mVar.f43075h;
                if ((modifiers & 69647) == ((zN ? mVar.k : mVar.f43076i) & 69647) && c10 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c10 == cArr[0] || c10 == cArr[2] || (zN && c10 == '\b' && i5 == 67)) && mVar.isEnabled()) {
                        arrayList.add(mVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f43061x) {
            return true;
        }
        ArrayList arrayList = this.f43044f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (((m) arrayList.get(i5)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f43058u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean zG = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                x xVar = (x) weakReference.get();
                if (xVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zG |= xVar.g();
                }
            }
            ArrayList arrayList = this.f43047i;
            ArrayList arrayList2 = this.f43048j;
            if (zG) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i5 = 0; i5 < size; i5++) {
                    m mVar = (m) arrayListL.get(i5);
                    if ((mVar.f43090x & 32) == 32) {
                        arrayList.add(mVar);
                    } else {
                        arrayList2.add(mVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i5, KeyEvent keyEvent) {
        return g(i5, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z2 = this.f43046h;
        ArrayList arrayList = this.f43045g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f43044f;
        int size = arrayList2.size();
        for (int i5 = 0; i5 < size; i5++) {
            m mVar = (m) arrayList2.get(i5);
            if (mVar.isVisible()) {
                arrayList.add(mVar);
            }
        }
        this.f43046h = false;
        this.k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f43060w;
    }

    public boolean n() {
        return this.f43041c;
    }

    public boolean o() {
        return this.f43042d;
    }

    public final void p(boolean z2) {
        if (this.f43053p) {
            this.f43054q = true;
            if (z2) {
                this.f43055r = true;
                return;
            }
            return;
        }
        if (z2) {
            this.f43046h = true;
            this.k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f43058u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.d();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i5, int i10) {
        return q(findItem(i5), null, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i5, KeyEvent keyEvent, int i10) {
        m mVarG = g(i5, keyEvent);
        boolean zQ = mVarG != null ? q(mVarG, null, i10) : false;
        if ((i10 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(android.view.MenuItem r7, p.x r8, int r9) {
        /*
            r6 = this;
            p.m r7 = (p.m) r7
            r0 = 0
            if (r7 == 0) goto Ld4
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld4
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f43082p
            r2 = 1
            if (r1 == 0) goto L1a
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L1a
        L18:
            r1 = r2
            goto L43
        L1a:
            p.k r1 = r7.f43080n
            boolean r3 = r1.e(r1, r7)
            if (r3 == 0) goto L23
            goto L18
        L23:
            android.content.Intent r3 = r7.f43074g
            if (r3 == 0) goto L35
            android.content.Context r1 = r1.f43039a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L18
        L2d:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L35:
            p.n r1 = r7.f43065A
            if (r1 == 0) goto L42
            android.view.ActionProvider r1 = r1.f43094b
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L42
            goto L18
        L42:
            r1 = r0
        L43:
            p.n r3 = r7.f43065A
            if (r3 == 0) goto L51
            android.view.ActionProvider r4 = r3.f43094b
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L51
            r4 = r2
            goto L52
        L51:
            r4 = r0
        L52:
            boolean r5 = r7.e()
            if (r5 == 0) goto L64
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld3
            r6.c(r2)
            goto Ld3
        L64:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L75
            if (r4 == 0) goto L6d
            goto L75
        L6d:
            r7 = r9 & 1
            if (r7 != 0) goto Ld3
            r6.c(r2)
            goto Ld3
        L75:
            r9 = r9 & 4
            if (r9 != 0) goto L7c
            r6.c(r0)
        L7c:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L90
            p.D r9 = new p.D
            android.content.Context r5 = r6.f43039a
            r9.<init>(r5, r6, r7)
            r7.f43081o = r9
            java.lang.CharSequence r5 = r7.f43072e
            r9.setHeaderTitle(r5)
        L90:
            p.D r7 = r7.f43081o
            if (r4 == 0) goto L9b
            p.r r9 = r3.f43095c
            android.view.ActionProvider r9 = r3.f43094b
            r9.onPrepareSubMenu(r7)
        L9b:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f43058u
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto La4
            goto Lcd
        La4:
            if (r8 == 0) goto Laa
            boolean r0 = r8.h(r7)
        Laa:
            java.util.Iterator r8 = r9.iterator()
        Lae:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Lcd
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            p.x r4 = (p.x) r4
            if (r4 != 0) goto Lc6
            r9.remove(r3)
            goto Lae
        Lc6:
            if (r0 != 0) goto Lae
            boolean r0 = r4.h(r7)
            goto Lae
        Lcd:
            r1 = r1 | r0
            if (r1 != 0) goto Ld3
            r6.c(r2)
        Ld3:
            return r1
        Ld4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.k.q(android.view.MenuItem, p.x, int):boolean");
    }

    public final void r(x xVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f43058u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar2 = (x) weakReference.get();
            if (xVar2 == null || xVar2 == xVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i5) {
        ArrayList arrayList = this.f43044f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (((m) arrayList.get(i11)).f43069b == i5) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            int size2 = arrayList.size() - i11;
            while (true) {
                int i12 = i10 + 1;
                if (i10 >= size2 || ((m) arrayList.get(i11)).f43069b != i5) {
                    break;
                }
                if (i11 >= 0) {
                    ArrayList arrayList2 = this.f43044f;
                    if (i11 < arrayList2.size()) {
                        arrayList2.remove(i11);
                    }
                }
                i10 = i12;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i5) {
        ArrayList arrayList = this.f43044f;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (((m) arrayList.get(i10)).f43068a == i5) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 >= 0) {
            ArrayList arrayList2 = this.f43044f;
            if (i10 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i10);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f43044f.size();
        for (int i5 = 0; i5 < size; i5++) {
            MenuItem item = getItem(i5);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC3749D) item.getSubMenu()).s(bundle);
            }
        }
        int i10 = bundle.getInt("android:menu:expandedactionview");
        if (i10 <= 0 || (menuItemFindItem = findItem(i10)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i5, boolean z2, boolean z10) {
        ArrayList arrayList = this.f43044f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = (m) arrayList.get(i10);
            if (mVar.f43069b == i5) {
                mVar.f43090x = (mVar.f43090x & (-5)) | (z10 ? 4 : 0);
                mVar.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f43060w = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i5, boolean z2) {
        ArrayList arrayList = this.f43044f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = (m) arrayList.get(i10);
            if (mVar.f43069b == i5) {
                mVar.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i5, boolean z2) {
        ArrayList arrayList = this.f43044f;
        int size = arrayList.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = (m) arrayList.get(i10);
            if (mVar.f43069b == i5) {
                int i11 = mVar.f43090x;
                int i12 = (i11 & (-9)) | (z2 ? 0 : 8);
                mVar.f43090x = i12;
                if (i11 != i12) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f43041c = z2;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f43044f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f43044f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i5 = 0; i5 < size; i5++) {
            MenuItem item = getItem(i5);
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
                ((SubMenuC3749D) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i5, CharSequence charSequence, int i10, Drawable drawable, View view) {
        if (view != null) {
            this.f43052o = view;
            this.f43050m = null;
            this.f43051n = null;
        } else {
            if (i5 > 0) {
                this.f43050m = this.f43040b.getText(i5);
            } else if (charSequence != null) {
                this.f43050m = charSequence;
            }
            if (i10 > 0) {
                this.f43051n = Y0.e.getDrawable(this.f43039a, i10);
            } else if (drawable != null) {
                this.f43051n = drawable;
            }
            this.f43052o = null;
        }
        p(false);
    }

    public final void v() {
        this.f43053p = false;
        if (this.f43054q) {
            this.f43054q = false;
            p(this.f43055r);
        }
    }

    public final void w() {
        if (this.f43053p) {
            return;
        }
        this.f43053p = true;
        this.f43054q = false;
        this.f43055r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i5) {
        return a(0, 0, 0, this.f43040b.getString(i5));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i5) {
        return addSubMenu(0, 0, 0, this.f43040b.getString(i5));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i5, int i10, int i11, CharSequence charSequence) {
        return a(i5, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i5, int i10, int i11, CharSequence charSequence) {
        m mVarA = a(i5, i10, i11, charSequence);
        SubMenuC3749D subMenuC3749D = new SubMenuC3749D(this.f43039a, this, mVarA);
        mVarA.f43081o = subMenuC3749D;
        subMenuC3749D.setHeaderTitle(mVarA.f43072e);
        return subMenuC3749D;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i5, int i10, int i11, int i12) {
        return a(i5, i10, i11, this.f43040b.getString(i12));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i5, int i10, int i11, int i12) {
        return addSubMenu(i5, i10, i11, this.f43040b.getString(i12));
    }

    public k k() {
        return this;
    }
}
