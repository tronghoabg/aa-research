package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.view.menu.ActionMenuItemView;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ActionProvider;
import com.waze.R;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class p extends android.support.v7.view.menu.d implements ActionProvider.SubUiVisibilityListener {

    /* renamed from: f, reason: collision with root package name */
    m f1603f;

    /* renamed from: g, reason: collision with root package name */
    n f1604g;

    /* renamed from: h, reason: collision with root package name */
    i f1605h;

    /* renamed from: i, reason: collision with root package name */
    k f1606i;

    /* renamed from: j, reason: collision with root package name */
    final o f1607j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f1608k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f1609l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private final SparseBooleanArray q;
    private j r;

    public p(Context context) {
        super(context);
        this.q = new SparseBooleanArray();
        this.f1607j = new o(this);
    }

    public final void A() {
        i iVar = this.f1605h;
        if (iVar != null) {
            iVar.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.support.v7.view.menu.ae] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // android.support.v7.view.menu.d
    public final View b(android.support.v7.view.menu.t tVar, View view, ViewGroup viewGroup) {
        View actionView = tVar.getActionView();
        if (actionView == null || tVar.j()) {
            ActionMenuItemView actionMenuItemView = view instanceof android.support.v7.view.menu.ae ? (android.support.v7.view.menu.ae) view : (android.support.v7.view.menu.ae) this.f783d.inflate(R.layout.abc_action_menu_item_layout, viewGroup, false);
            actionMenuItemView.h(tVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.b((ActionMenuView) this.f784e);
            j jVar = this.r;
            if (jVar == null) {
                jVar = new j(this);
                this.r = jVar;
            }
            actionMenuItemView2.c(jVar);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(true == tVar.isActionViewExpanded() ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof s)) {
            actionView.setLayoutParams(ActionMenuView.u(layoutParams));
        }
        return actionView;
    }

    @Override // android.support.v7.view.menu.d, android.support.v7.view.menu.ad
    public final void c(Context context, android.support.v7.view.menu.q qVar) {
        this.f781b = context;
        LayoutInflater.from(this.f781b);
        this.f782c = qVar;
        Resources resources = context.getResources();
        if (!this.f1609l) {
            this.f1608k = true;
        }
        this.m = context.getResources().getDisplayMetrics().widthPixels / 2;
        this.o = android.support.v4.app.dc.a(context);
        int measuredWidth = this.m;
        if (this.f1608k) {
            if (this.f1603f == null) {
                this.f1603f = new m(this, this.f780a);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1603f.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f1603f.getMeasuredWidth();
        } else {
            this.f1603f = null;
        }
        this.n = measuredWidth;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // android.support.v7.view.menu.d, android.support.v7.view.menu.ad
    public final void d(android.support.v7.view.menu.q qVar, boolean z) {
        w();
        super.d(qVar, z);
    }

    @Override // android.support.v7.view.menu.d, android.support.v7.view.menu.ad
    public final boolean f() {
        ArrayList arrayListI;
        int size;
        boolean z;
        boolean z2;
        boolean z3;
        android.support.v7.view.menu.q qVar = this.f782c;
        View view = null;
        boolean z4 = false;
        if (qVar != null) {
            arrayListI = qVar.i();
            size = arrayListI.size();
        } else {
            arrayListI = null;
            size = 0;
        }
        int i2 = this.o;
        int i3 = this.n;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f784e;
        int i4 = 0;
        boolean z5 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            z = true;
            if (i4 >= size) {
                break;
            }
            android.support.v7.view.menu.t tVar = (android.support.v7.view.menu.t) arrayListI.get(i4);
            if (tVar.requiresActionButton()) {
                i5++;
            } else if (tVar.n()) {
                i6++;
            } else {
                z5 = true;
            }
            if (this.p && tVar.isActionViewExpanded()) {
                i2 = 0;
            }
            i4++;
        }
        if (this.f1608k && (z5 || i6 + i5 > i2)) {
            i2--;
        }
        int i7 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = this.q;
        sparseBooleanArray.clear();
        int i8 = 0;
        int i9 = 0;
        while (i8 < size) {
            android.support.v7.view.menu.t tVar2 = (android.support.v7.view.menu.t) arrayListI.get(i8);
            if (tVar2.requiresActionButton()) {
                View viewB = b(tVar2, view, viewGroup);
                viewB.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewB.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i9 == 0) {
                    i9 = measuredWidth;
                }
                int groupId = tVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, z);
                }
                tVar2.h(z);
                z2 = z4;
                z3 = z;
            } else if (tVar2.n()) {
                int groupId2 = tVar2.getGroupId();
                boolean z6 = sparseBooleanArray.get(groupId2);
                boolean z7 = ((i7 > 0 || z6) && i3 > 0) ? z : z4;
                if (z7) {
                    View viewB2 = b(tVar2, view, viewGroup);
                    viewB2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewB2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i9 == 0) {
                        i9 = measuredWidth2;
                    }
                    z7 = i3 + i9 > 0 ? z : false;
                }
                boolean z8 = z7;
                if (z8 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, z);
                } else if (z6) {
                    sparseBooleanArray.put(groupId2, false);
                    int i10 = 0;
                    while (i10 < i8) {
                        android.support.v7.view.menu.t tVar3 = (android.support.v7.view.menu.t) arrayListI.get(i10);
                        boolean z9 = z;
                        if (tVar3.getGroupId() == groupId2) {
                            if (tVar3.l()) {
                                i7++;
                            }
                            tVar3.h(false);
                        }
                        i10++;
                        z = z9;
                    }
                }
                z3 = z;
                if (z8) {
                    i7--;
                }
                tVar2.h(z8);
                z2 = false;
            } else {
                z2 = z4;
                z3 = z;
                tVar2.h(z2);
            }
            i8++;
            z4 = z2;
            z = z3;
            view = null;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v7.view.menu.d, android.support.v7.view.menu.ad
    public final boolean g(android.support.v7.view.menu.al alVar) {
        boolean z = false;
        if (alVar.hasVisibleItems()) {
            android.support.v7.view.menu.al alVar2 = alVar;
            while (alVar2.P() != this.f782c) {
                alVar2 = (android.support.v7.view.menu.al) alVar2.P();
            }
            MenuItem item = alVar2.getItem();
            ViewGroup viewGroup = (ViewGroup) this.f784e;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i2);
                    if ((childAt instanceof android.support.v7.view.menu.ae) && ((android.support.v7.view.menu.ae) childAt).a() == item) {
                        view = childAt;
                        break;
                    }
                    i2++;
                }
            }
            if (view != null) {
                alVar.getItem();
                int size = alVar.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    MenuItem item2 = alVar.getItem(i3);
                    if (item2.isVisible() && item2.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i3++;
                }
                i iVar = new i(this, this.f781b, alVar, view);
                this.f1605h = iVar;
                iVar.e(z);
                if (!this.f1605h.i()) {
                    throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                }
                super.g(alVar);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f5  */
    @Override // android.support.v7.view.menu.d, android.support.v7.view.menu.ad
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.p.j():void");
    }

    @Override // androidx.core.view.ActionProvider.SubUiVisibilityListener
    public final void onSubUiVisibilityChanged(boolean z) {
        if (z) {
            super.g(null);
            return;
        }
        android.support.v7.view.menu.q qVar = this.f782c;
        if (qVar != null) {
            qVar.m(false);
        }
    }

    public final android.support.v7.view.menu.af r(ViewGroup viewGroup) {
        android.support.v7.view.menu.af afVar = this.f784e;
        if (this.f784e == null) {
            this.f784e = (android.support.v7.view.menu.af) this.f783d.inflate(R.layout.abc_action_menu_layout, viewGroup, false);
            this.f784e.a(this.f782c);
            j();
        }
        android.support.v7.view.menu.af afVar2 = this.f784e;
        if (afVar != afVar2) {
            ((ActionMenuView) afVar2).l(this);
        }
        return afVar2;
    }

    public final void s(ActionMenuView actionMenuView) {
        this.f784e = actionMenuView;
        actionMenuView.a(this.f782c);
    }

    public final boolean t() {
        Object obj;
        k kVar = this.f1606i;
        if (kVar != null && (obj = this.f784e) != null) {
            ((View) obj).removeCallbacks(kVar);
            this.f1606i = null;
            return true;
        }
        n nVar = this.f1604g;
        if (nVar == null) {
            return false;
        }
        nVar.b();
        return true;
    }

    public final boolean u() {
        n nVar = this.f1604g;
        return nVar != null && nVar.h();
    }

    public final boolean v() {
        android.support.v7.view.menu.q qVar;
        if (!this.f1608k || u() || (qVar = this.f782c) == null || this.f784e == null || this.f1606i != null || qVar.h().isEmpty()) {
            return false;
        }
        this.f1606i = new k(this, new n(this, this.f781b, this.f782c, this.f1603f));
        ((View) this.f784e).post(this.f1606i);
        return true;
    }

    public final void w() {
        t();
        A();
    }

    public final void x() {
        this.o = android.support.v4.app.dc.a(this.f781b);
        android.support.v7.view.menu.q qVar = this.f782c;
        if (qVar != null) {
            qVar.p(true);
        }
    }

    public final void y() {
        this.p = true;
    }

    public final void z() {
        this.f1608k = true;
        this.f1609l = true;
    }
}
