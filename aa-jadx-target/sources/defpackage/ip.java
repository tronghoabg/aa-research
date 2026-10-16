package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ip extends defpackage.gy {
    defpackage.im g;
    public int h;
    public in i;
    public ik j;
    final defpackage.io k;
    public rhl l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private boolean q;
    private final android.util.SparseBooleanArray r;
    private defpackage.izq s;

    public ip(android.content.Context context) {
        super(context);
        this.r = new android.util.SparseBooleanArray();
        this.k = new defpackage.io(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gy
    public final android.view.View a(defpackage.hj hjVar, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View actionView = hjVar.getActionView();
        if (actionView == null || hjVar.m()) {
            defpackage.hu huVar = view instanceof defpackage.hu ? (defpackage.hu) view : (defpackage.hu) this.d.inflate(2131623938, viewGroup, false);
            huVar.f(hjVar);
            android.support.v7.view.menu.ActionMenuItemView actionMenuItemView = (android.support.v7.view.menu.ActionMenuItemView) huVar;
            actionMenuItemView.b = (android.support.v7.widget.ActionMenuView) this.f;
            defpackage.izq izqVar = this.s;
            if (izqVar == null) {
                izqVar = new defpackage.izq(this);
                this.s = izqVar;
            }
            actionMenuItemView.c = izqVar;
            actionView = (android.view.View) huVar;
        }
        actionView.setVisibility(true == hjVar.o ? 8 : 0);
        android.view.ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof defpackage.is)) {
            actionView.setLayoutParams(android.support.v7.widget.ActionMenuView.o(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.gy, defpackage.ht
    public final void b(android.content.Context context, defpackage.hh hhVar) {
        this.b = context;
        android.view.LayoutInflater.from(this.b);
        this.c = hhVar;
        android.content.res.Resources resources = context.getResources();
        if (!this.n) {
            this.m = true;
        }
        this.o = context.getResources().getDisplayMetrics().widthPixels / 2;
        this.h = defpackage.ca.y(context);
        int measuredWidth = this.o;
        if (this.m) {
            if (this.g == null) {
                defpackage.im imVar = new defpackage.im(this, this.a);
                this.g = imVar;
                imVar.measure(0, 0);
            }
            measuredWidth -= this.g.getMeasuredWidth();
        } else {
            this.g = null;
        }
        this.p = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // defpackage.gy, defpackage.ht
    public final void c(defpackage.hh hhVar, boolean z) {
        n();
        defpackage.hs hsVar = this.e;
        if (hsVar != null) {
            hsVar.a(hhVar, z);
        }
    }

    @Override // defpackage.gy, defpackage.ht
    public final boolean e() {
        java.util.ArrayList arrayListF;
        int size;
        boolean z;
        boolean z2;
        defpackage.hh hhVar = this.c;
        android.view.View view = null;
        if (hhVar != null) {
            arrayListF = hhVar.f();
            size = arrayListF.size();
        } else {
            arrayListF = null;
            size = 0;
        }
        int i = this.h;
        int i2 = this.p;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f;
        int i3 = 0;
        boolean z3 = false;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            z = true;
            if (i3 >= size) {
                break;
            }
            defpackage.hj hjVar = (defpackage.hj) arrayListF.get(i3);
            if (hjVar.r()) {
                i4++;
            } else if (hjVar.q()) {
                i5++;
            } else {
                z3 = true;
            }
            if (this.q && hjVar.o) {
                i = 0;
            }
            i3++;
        }
        if (this.m && (z3 || i5 + i4 > i)) {
            i--;
        }
        int i6 = i - i4;
        android.util.SparseBooleanArray sparseBooleanArray = this.r;
        sparseBooleanArray.clear();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            defpackage.hj hjVar2 = (defpackage.hj) arrayListF.get(i7);
            if (hjVar2.r()) {
                android.view.View viewA = a(hjVar2, view, viewGroup);
                viewA.measure(0, 0);
                int measuredWidth = viewA.getMeasuredWidth();
                i2 -= measuredWidth;
                if (i8 == 0) {
                    i8 = measuredWidth;
                }
                int i9 = hjVar2.b;
                if (i9 != 0) {
                    sparseBooleanArray.put(i9, z);
                }
                hjVar2.k(z);
                z2 = z;
            } else if (hjVar2.q()) {
                int i10 = hjVar2.b;
                boolean z4 = sparseBooleanArray.get(i10);
                boolean z5 = ((i6 > 0 || z4) && i2 > 0) ? z : false;
                if (z5) {
                    android.view.View viewA2 = a(hjVar2, view, viewGroup);
                    viewA2.measure(0, 0);
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    i2 -= measuredWidth2;
                    if (i8 == 0) {
                        i8 = measuredWidth2;
                    }
                    z5 = i2 + i8 > 0 ? z : false;
                }
                if (z5 && i10 != 0) {
                    sparseBooleanArray.put(i10, z);
                } else if (z4) {
                    sparseBooleanArray.put(i10, false);
                    int i11 = 0;
                    while (i11 < i7) {
                        defpackage.hj hjVar3 = (defpackage.hj) arrayListF.get(i11);
                        boolean z6 = z;
                        if (hjVar3.b == i10) {
                            if (hjVar3.o()) {
                                i6++;
                            }
                            hjVar3.k(false);
                        }
                        i11++;
                        z = z6;
                    }
                }
                z2 = z;
                if (z5) {
                    i6--;
                }
                hjVar2.k(z5);
            } else {
                z2 = z;
                hjVar2.k(false);
            }
            i7++;
            z = z2;
            view = null;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gy, defpackage.ht
    public final boolean f(ib ibVar) {
        boolean z = false;
        if (!ibVar.hasVisibleItems()) {
            return false;
        }
        ib ibVar2 = ibVar;
        while (true) {
            defpackage.hh hhVar = ibVar2.k;
            if (hhVar == this.c) {
                break;
            }
            ibVar2 = (ib) hhVar;
        }
        defpackage.hj hjVar = ibVar2.l;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f;
        android.view.View view = null;
        view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof defpackage.hu) && ((defpackage.hu) childAt).a() == hjVar) {
                    view = childAt;
                    break;
                }
            }
        }
        if (view == null) {
            return false;
        }
        defpackage.hj hjVar2 = ibVar.l;
        int size = ibVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            android.view.MenuItem item = ibVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
        }
        ik ikVar = new ik(this, this.b, ibVar, view);
        this.j = ikVar;
        ikVar.d(z);
        if (!this.j.h()) {
            throw new java.lang.IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        defpackage.hs hsVar = this.e;
        if (hsVar != null) {
            if (ibVar == null) {
                ibVar = this.c;
            }
            hsVar.b(ibVar);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f9  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gy, defpackage.ht
    public final void i() {
        defpackage.im imVar;
        java.lang.Object parent;
        java.lang.Object obj;
        int i;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f;
        boolean z = false;
        if (viewGroup != null) {
            defpackage.hh hhVar = this.c;
            if (hhVar != null) {
                hhVar.k();
                java.util.ArrayList arrayListF = this.c.f();
                int size = arrayListF.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    defpackage.hj hjVar = (defpackage.hj) arrayListF.get(i2);
                    if (hjVar.o()) {
                        android.view.View childAt = viewGroup.getChildAt(i);
                        defpackage.hj hjVarA = childAt instanceof defpackage.hu ? ((defpackage.hu) childAt).a() : null;
                        android.view.View viewA = a(hjVar, childAt, viewGroup);
                        if (hjVar != hjVarA) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((android.view.ViewGroup) this.f).addView(viewA, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.g) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((android.view.View) this.f).requestLayout();
        defpackage.hh hhVar2 = this.c;
        if (hhVar2 != null) {
            hhVar2.k();
            java.util.ArrayList arrayList = hhVar2.d;
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                dsy dsyVar = ((defpackage.hj) arrayList.get(i3)).p;
            }
        }
        defpackage.hh hhVar3 = this.c;
        java.util.ArrayList arrayListE = hhVar3 != null ? hhVar3.e() : null;
        if (!this.m || arrayListE == null) {
            imVar = this.g;
            if (imVar != null) {
                parent = imVar.getParent();
                obj = this.f;
                if (parent == obj) {
                    ((android.view.ViewGroup) obj).removeView(this.g);
                }
            }
        } else {
            int size3 = arrayListE.size();
            if (size3 == 1) {
                z = !((defpackage.hj) arrayListE.get(0)).o;
            } else if (size3 > 0) {
                z = true;
            }
            if (z) {
                defpackage.im imVar2 = this.g;
                if (imVar2 == null) {
                    defpackage.im imVar3 = new defpackage.im(this, this.a);
                    this.g = imVar3;
                    imVar2 = imVar3;
                }
                android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) imVar2.getParent();
                if (viewGroup3 != this.f) {
                    if (viewGroup3 != null) {
                        viewGroup3.removeView(this.g);
                    }
                    android.support.v7.widget.ActionMenuView actionMenuView = (android.support.v7.widget.ActionMenuView) this.f;
                    defpackage.im imVar4 = this.g;
                    defpackage.is isVarN = android.support.v7.widget.ActionMenuView.n();
                    isVarN.a = true;
                    actionMenuView.addView(imVar4, isVarN);
                }
            } else {
                imVar = this.g;
                if (imVar != null) {
                    parent = imVar.getParent();
                    obj = this.f;
                    if (parent == obj) {
                        ((android.view.ViewGroup) obj).removeView(this.g);
                    }
                }
            }
        }
        ((android.support.v7.widget.ActionMenuView) this.f).b = this.m;
    }

    public final void j(android.support.v7.widget.ActionMenuView actionMenuView) {
        this.f = actionMenuView;
        actionMenuView.a = this.c;
    }

    public final boolean k() {
        java.lang.Object obj;
        java.lang.Runnable runnable = this.l;
        if (runnable != null && (obj = this.f) != null) {
            ((android.view.View) obj).removeCallbacks(runnable);
            this.l = null;
            return true;
        }
        in inVar = this.i;
        if (inVar == null) {
            return false;
        }
        inVar.b();
        return true;
    }

    public final boolean l() {
        in inVar = this.i;
        return inVar != null && inVar.g();
    }

    public final boolean m() {
        defpackage.hh hhVar;
        if (!this.m || l() || (hhVar = this.c) == null || this.f == null || this.l != null || hhVar.e().isEmpty()) {
            return false;
        }
        this.l = new rhl(this, new in(this, this.b, this.c, this.g), 1);
        ((android.view.View) this.f).post(this.l);
        return true;
    }

    public final void n() {
        k();
        q();
    }

    public final void o() {
        this.q = true;
    }

    public final void p() {
        this.m = true;
        this.n = true;
    }

    public final void q() {
        ik ikVar = this.j;
        if (ikVar != null) {
            ikVar.b();
        }
    }
}
