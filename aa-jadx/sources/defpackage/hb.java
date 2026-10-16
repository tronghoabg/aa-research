package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hb extends defpackage.hp implements android.view.View.OnKeyListener, android.widget.PopupWindow.OnDismissListener, defpackage.ht {
    public final android.os.Handler a;
    android.view.View d;
    android.view.ViewTreeObserver e;
    public boolean f;
    private final android.content.Context h;
    private final int i;
    private final int j;
    private final boolean k;
    private android.view.View q;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean x;
    private defpackage.hs y;
    private android.widget.PopupWindow.OnDismissListener z;
    private final java.util.List l = new java.util.ArrayList();
    public final java.util.List b = new java.util.ArrayList();
    final android.view.ViewTreeObserver.OnGlobalLayoutListener c = new defpackage.hy(this, 1);
    private final android.view.View.OnAttachStateChangeListener m = new defpackage.hz(this, 1);
    private final defpackage.lm n = new defpackage.ha(this);
    private int o = 0;
    private int p = 0;
    private boolean w = false;
    private int r = y();

    public hb(android.content.Context context, android.view.View view, int i, boolean z) {
        this.h = context;
        this.q = view;
        this.j = i;
        this.k = z;
        android.content.res.Resources resources = context.getResources();
        this.i = java.lang.Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.abc_config_prefDialogWidth));
        this.a = new android.os.Handler();
    }

    private final int y() {
        return this.q.getLayoutDirection() == 1 ? 0 : 1;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:64:0x014a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x014d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0152 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0154  */
    /* JADX WARN: Code duplicated, block: B:69:0x0159 A[PHI: r4
  0x0159: PHI (r4v15 int) = (r4v5 int), (r4v17 int) binds: [B:67:0x0152, B:66:0x014d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0164  */
    /* JADX WARN: Code duplicated, block: B:73:0x0168  */
    /* JADX WARN: Code duplicated, block: B:76:0x0170  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final void z(defpackage.hh hhVar) {
        defpackage.aahg aahgVar;
        android.view.View childAt;
        int i;
        java.lang.reflect.Method method;
        android.view.MenuItem item;
        defpackage.he heVar;
        int headersCount;
        int firstVisiblePosition;
        android.content.Context context = this.h;
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(context);
        defpackage.he heVar2 = new defpackage.he(hhVar, layoutInflaterFrom, this.k, com.google.android.projection.gearhead.R.layout.abc_cascading_menu_item_layout);
        if (!u() && this.w) {
            heVar2.b = true;
        } else if (u()) {
            heVar2.b = defpackage.hp.w(hhVar);
        }
        int iX = x(heVar2, context, this.i);
        defpackage.lo loVar = new defpackage.lo(context, this.j);
        loVar.b = this.n;
        loVar.l = this;
        loVar.v(this);
        loVar.k = this.q;
        loVar.j = this.p;
        loVar.y();
        loVar.x();
        loVar.e(heVar2);
        loVar.r(iX);
        loVar.j = this.p;
        java.util.List list = this.b;
        if (list.size() > 0) {
            aahgVar = (defpackage.aahg) list.get(list.size() - 1);
            defpackage.hh hhVar2 = (defpackage.hh) aahgVar.b;
            int size = hhVar2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    item = null;
                    break;
                }
                item = hhVar2.getItem(i2);
                if (item.hasSubMenu() && hhVar == item.getSubMenu()) {
                    break;
                } else {
                    i2++;
                }
            }
            if (item != null) {
                android.widget.ListView listViewA = aahgVar.a();
                android.widget.ListAdapter adapter = listViewA.getAdapter();
                if (adapter instanceof android.widget.HeaderViewListAdapter) {
                    android.widget.HeaderViewListAdapter headerViewListAdapter = (android.widget.HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    heVar = (defpackage.he) headerViewListAdapter.getWrappedAdapter();
                } else {
                    heVar = (defpackage.he) adapter;
                    headersCount = 0;
                }
                int count = heVar.getCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= count) {
                        i3 = -1;
                        break;
                    } else if (item == heVar.getItem(i3)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                childAt = (i3 != -1 && (firstVisiblePosition = (i3 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) ? listViewA.getChildAt(firstVisiblePosition) : null;
            }
            if (childAt != null) {
                if (android.os.Build.VERSION.SDK_INT <= 28) {
                    method = defpackage.lo.a;
                    if (method != null) {
                        try {
                            method.invoke(loVar.p, java.lang.Boolean.FALSE);
                        } catch (java.lang.Exception unused) {
                            android.util.Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    loVar.p.setTouchModal(false);
                }
                loVar.p.setEnterTransition(null);
                java.util.List list2 = this.b;
                android.widget.ListView listViewA2 = ((defpackage.aahg) list2.get(list2.size() - 1)).a();
                int[] iArr = new int[2];
                listViewA2.getLocationOnScreen(iArr);
                android.graphics.Rect rect = new android.graphics.Rect();
                this.d.getWindowVisibleDisplayFrame(rect);
                i = (this.r == 1 ? iArr[0] - iX >= 0 : (iArr[0] + listViewA2.getWidth()) + iX > rect.right) ? 0 : 1;
                this.r = i;
                loVar.k = childAt;
                if ((this.p & 5) == 5) {
                    if (i == 0) {
                        iX = childAt.getWidth();
                        iX = -iX;
                    }
                } else if (i != 0) {
                    iX = childAt.getWidth();
                } else {
                    iX = -iX;
                }
                loVar.g = iX;
                loVar.i = true;
                loVar.h = true;
                loVar.j(0);
            } else {
                if (this.s) {
                    loVar.g = this.u;
                }
                if (this.t) {
                    loVar.j(this.v);
                }
                loVar.t(this.g);
            }
            this.b.add(new defpackage.aahg(loVar, hhVar, this.r));
            loVar.s();
            defpackage.kt ktVar = loVar.e;
            ktVar.setOnKeyListener(this);
            if (aahgVar == null || !this.x || hhVar.e == null) {
                return;
            }
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) layoutInflaterFrom.inflate(com.google.android.projection.gearhead.R.layout.abc_popup_menu_header_item_layout, (android.view.ViewGroup) ktVar, false);
            android.widget.TextView textView = (android.widget.TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(hhVar.e);
            ktVar.addHeaderView(frameLayout, null, false);
            loVar.s();
            return;
        }
        aahgVar = null;
        if (childAt != null) {
            if (android.os.Build.VERSION.SDK_INT <= 28) {
                method = defpackage.lo.a;
                if (method != null) {
                    method.invoke(loVar.p, java.lang.Boolean.FALSE);
                }
            } else {
                loVar.p.setTouchModal(false);
            }
            loVar.p.setEnterTransition(null);
            java.util.List list3 = this.b;
            android.widget.ListView listViewA3 = ((defpackage.aahg) list3.get(list3.size() - 1)).a();
            int[] iArr2 = new int[2];
            listViewA3.getLocationOnScreen(iArr2);
            android.graphics.Rect rect2 = new android.graphics.Rect();
            this.d.getWindowVisibleDisplayFrame(rect2);
            if (this.r == 1) {
            }
            this.r = i;
            loVar.k = childAt;
            if ((this.p & 5) == 5) {
                if (i == 0) {
                    iX = childAt.getWidth();
                    iX = -iX;
                }
            } else if (i != 0) {
                iX = childAt.getWidth();
            } else {
                iX = -iX;
            }
            loVar.g = iX;
            loVar.i = true;
            loVar.h = true;
            loVar.j(0);
        } else {
            if (this.s) {
                loVar.g = this.u;
            }
            if (this.t) {
                loVar.j(this.v);
            }
            loVar.t(this.g);
        }
        this.b.add(new defpackage.aahg(loVar, hhVar, this.r));
        loVar.s();
        defpackage.kt ktVar2 = loVar.e;
        ktVar2.setOnKeyListener(this);
        if (aahgVar == null) {
        }
    }

    @Override // defpackage.ht
    public final void c(defpackage.hh hhVar, boolean z) {
        java.util.List list = this.b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (hhVar == ((defpackage.aahg) list.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < list.size()) {
            ((defpackage.hh) ((defpackage.aahg) list.get(i2)).b).i(false);
        }
        defpackage.aahg aahgVar = (defpackage.aahg) list.remove(i);
        ((defpackage.hh) aahgVar.b).m(this);
        if (this.f) {
            java.lang.Object obj = aahgVar.c;
            ((defpackage.lo) obj).p.setExitTransition(null);
            ((defpackage.ll) obj).p.setAnimationStyle(0);
        }
        ((defpackage.ll) aahgVar.c).k();
        int size2 = list.size();
        if (size2 > 0) {
            this.r = ((defpackage.aahg) list.get(size2 - 1)).a;
        } else {
            this.r = y();
        }
        if (size2 != 0) {
            if (z) {
                ((defpackage.hh) ((defpackage.aahg) list.get(0)).b).i(false);
                return;
            }
            return;
        }
        k();
        defpackage.hs hsVar = this.y;
        if (hsVar != null) {
            hsVar.a(hhVar, true);
        }
        android.view.ViewTreeObserver viewTreeObserver = this.e;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.e.removeGlobalOnLayoutListener(this.c);
            }
            this.e = null;
        }
        this.d.removeOnAttachStateChangeListener(this.m);
        this.z.onDismiss();
    }

    @Override // defpackage.ht
    public final void d(defpackage.hs hsVar) {
        this.y = hsVar;
    }

    @Override // defpackage.hx
    public final android.widget.ListView dh() {
        java.util.List list = this.b;
        if (list.isEmpty()) {
            return null;
        }
        return ((defpackage.aahg) list.get(list.size() - 1)).a();
    }

    @Override // defpackage.ht
    public final boolean e() {
        return false;
    }

    @Override // defpackage.ht
    public final boolean f(defpackage.ib ibVar) {
        for (defpackage.aahg aahgVar : this.b) {
            if (ibVar == aahgVar.b) {
                aahgVar.a().requestFocus();
                return true;
            }
        }
        if (!ibVar.hasVisibleItems()) {
            return false;
        }
        j(ibVar);
        defpackage.hs hsVar = this.y;
        if (hsVar != null) {
            hsVar.b(ibVar);
        }
        return true;
    }

    @Override // defpackage.ht
    public final void i() {
        java.util.Iterator it = this.b.iterator();
        while (it.hasNext()) {
            v(((defpackage.aahg) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // defpackage.hp
    public final void j(defpackage.hh hhVar) {
        hhVar.h(this, this.h);
        if (u()) {
            z(hhVar);
        } else {
            this.l.add(hhVar);
        }
    }

    @Override // defpackage.hx
    public final void k() {
        java.util.List list = this.b;
        int size = list.size();
        if (size <= 0) {
            return;
        }
        defpackage.aahg[] aahgVarArr = (defpackage.aahg[]) list.toArray(new defpackage.aahg[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            defpackage.ll llVar = (defpackage.ll) aahgVarArr[size].c;
            if (llVar.u()) {
                llVar.k();
            }
        }
    }

    @Override // defpackage.hp
    public final void l(android.view.View view) {
        if (this.q != view) {
            this.q = view;
            this.p = android.view.Gravity.getAbsoluteGravity(this.o, view.getLayoutDirection());
        }
    }

    @Override // defpackage.hp
    public final void m(boolean z) {
        this.w = z;
    }

    @Override // defpackage.hp
    public final void n(int i) {
        if (this.o != i) {
            this.o = i;
            this.p = android.view.Gravity.getAbsoluteGravity(i, this.q.getLayoutDirection());
        }
    }

    @Override // defpackage.hp
    public final void o(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        defpackage.aahg aahgVar;
        java.util.List list = this.b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aahgVar = null;
                break;
            }
            aahgVar = (defpackage.aahg) list.get(i);
            if (!((defpackage.ll) aahgVar.c).u()) {
                break;
            } else {
                i++;
            }
        }
        if (aahgVar != null) {
            ((defpackage.hh) aahgVar.b).i(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View view, int i, android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        k();
        return true;
    }

    @Override // defpackage.hp
    public final void p(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    @Override // defpackage.hp
    public final void q(boolean z) {
        this.x = z;
    }

    @Override // defpackage.hp
    public final void r(int i) {
        this.t = true;
        this.v = i;
    }

    @Override // defpackage.hx
    public final void s() {
        if (u()) {
            return;
        }
        java.util.List list = this.l;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            z((defpackage.hh) it.next());
        }
        list.clear();
        android.view.View view = this.q;
        this.d = view;
        if (view != null) {
            android.view.ViewTreeObserver viewTreeObserver = this.e;
            android.view.ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            this.e = viewTreeObserver2;
            if (viewTreeObserver == null) {
                viewTreeObserver2.addOnGlobalLayoutListener(this.c);
            }
            this.d.addOnAttachStateChangeListener(this.m);
        }
    }

    @Override // defpackage.hp
    protected final boolean t() {
        return false;
    }

    @Override // defpackage.hx
    public final boolean u() {
        java.util.List list = this.b;
        return list.size() > 0 && ((defpackage.ll) ((defpackage.aahg) list.get(0)).c).u();
    }
}
