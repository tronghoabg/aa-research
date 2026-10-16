package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class io extends gx {
    il g;
    public int h;
    public im i;
    public ij j;
    final in k;
    public rgq l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private boolean q;
    private final SparseBooleanArray r;
    private izj s;

    public io(Context context) {
        super(context);
        this.r = new SparseBooleanArray();
        this.k = new in(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [ht] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // defpackage.gx
    public final View a(hi hiVar, View view, ViewGroup viewGroup) {
        View actionView = hiVar.getActionView();
        if (actionView == null || hiVar.m()) {
            ActionMenuItemView actionMenuItemView = view instanceof ht ? (ht) view : (ht) this.d.inflate(R.layout.abc_action_menu_item_layout, viewGroup, false);
            actionMenuItemView.f(hiVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.b = (ActionMenuView) this.f;
            izj izjVar = this.s;
            if (izjVar == null) {
                izjVar = new izj(this);
                this.s = izjVar;
            }
            actionMenuItemView2.c = izjVar;
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(true == hiVar.o ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof ir)) {
            actionView.setLayoutParams(ActionMenuView.o(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.gx, defpackage.hs
    public final void b(Context context, hg hgVar) {
        this.b = context;
        LayoutInflater.from(this.b);
        this.c = hgVar;
        Resources resources = context.getResources();
        if (!this.n) {
            this.m = true;
        }
        this.o = context.getResources().getDisplayMetrics().widthPixels / 2;
        this.h = ca.y(context);
        int measuredWidth = this.o;
        if (this.m) {
            if (this.g == null) {
                this.g = new il(this, this.a);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.g.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.g.getMeasuredWidth();
        } else {
            this.g = null;
        }
        this.p = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // defpackage.gx, defpackage.hs
    public final void c(hg hgVar, boolean z) {
        n();
        hr hrVar = this.e;
        if (hrVar != null) {
            hrVar.a(hgVar, z);
        }
    }

    @Override // defpackage.gx, defpackage.hs
    public final boolean e() {
        ArrayList arrayListF;
        int size;
        boolean z;
        boolean z2;
        boolean z3;
        hg hgVar = this.c;
        View view = null;
        boolean z4 = false;
        if (hgVar != null) {
            arrayListF = hgVar.f();
            size = arrayListF.size();
        } else {
            arrayListF = null;
            size = 0;
        }
        int i = this.h;
        int i2 = this.p;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f;
        int i3 = 0;
        boolean z5 = false;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            z = true;
            if (i3 >= size) {
                break;
            }
            hi hiVar = (hi) arrayListF.get(i3);
            if (hiVar.r()) {
                i4++;
            } else if (hiVar.q()) {
                i5++;
            } else {
                z5 = true;
            }
            if (this.q && hiVar.o) {
                i = 0;
            }
            i3++;
        }
        if (this.m && (z5 || i5 + i4 > i)) {
            i--;
        }
        int i6 = i - i4;
        SparseBooleanArray sparseBooleanArray = this.r;
        sparseBooleanArray.clear();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            hi hiVar2 = (hi) arrayListF.get(i7);
            if (hiVar2.r()) {
                View viewA = a(hiVar2, view, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i2 -= measuredWidth;
                if (i8 == 0) {
                    i8 = measuredWidth;
                }
                int i9 = hiVar2.b;
                if (i9 != 0) {
                    sparseBooleanArray.put(i9, z);
                }
                hiVar2.k(z);
                z2 = z4;
                z3 = z;
            } else if (hiVar2.q()) {
                int i10 = hiVar2.b;
                boolean z6 = sparseBooleanArray.get(i10);
                boolean z7 = ((i6 > 0 || z6) && i2 > 0) ? z : z4;
                if (z7) {
                    View viewA2 = a(hiVar2, view, viewGroup);
                    viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    i2 -= measuredWidth2;
                    if (i8 == 0) {
                        i8 = measuredWidth2;
                    }
                    z7 = i2 + i8 > 0 ? z : false;
                }
                boolean z8 = z7;
                if (z8 && i10 != 0) {
                    sparseBooleanArray.put(i10, z);
                } else if (z6) {
                    sparseBooleanArray.put(i10, false);
                    int i11 = 0;
                    while (i11 < i7) {
                        hi hiVar3 = (hi) arrayListF.get(i11);
                        boolean z9 = z;
                        if (hiVar3.b == i10) {
                            if (hiVar3.o()) {
                                i6++;
                            }
                            hiVar3.k(false);
                        }
                        i11++;
                        z = z9;
                    }
                }
                z3 = z;
                if (z8) {
                    i6--;
                }
                hiVar2.k(z8);
                z2 = false;
            } else {
                z2 = z4;
                z3 = z;
                hiVar2.k(z2);
            }
            i7++;
            z4 = z2;
            z = z3;
            view = null;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r9v3, types: [hg] */
    @Override // defpackage.gx, defpackage.hs
    public final boolean f(ia iaVar) {
        boolean z = false;
        if (!iaVar.hasVisibleItems()) {
            return false;
        }
        ia iaVar2 = iaVar;
        while (true) {
            hg hgVar = iaVar2.k;
            if (hgVar == this.c) {
                break;
            }
            iaVar2 = (ia) hgVar;
        }
        hi hiVar = iaVar2.l;
        ViewGroup viewGroup = (ViewGroup) this.f;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                ?? childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof ht) && ((ht) childAt).a() == hiVar) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        hi hiVar2 = iaVar.l;
        int size = iaVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item = iaVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        ij ijVar = new ij(this, this.b, iaVar, view);
        this.j = ijVar;
        ijVar.d(z);
        if (!this.j.h()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        hr hrVar = this.e;
        ia iaVar3 = iaVar;
        if (hrVar != null) {
            if (iaVar == null) {
                iaVar3 = this.c;
            }
            hrVar.b(iaVar3);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ed  */
    @Override // defpackage.gx, defpackage.hs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.io.i():void");
    }

    public final void j(ActionMenuView actionMenuView) {
        this.f = actionMenuView;
        actionMenuView.a = this.c;
    }

    public final boolean k() {
        Object obj;
        rgq rgqVar = this.l;
        if (rgqVar != null && (obj = this.f) != null) {
            ((View) obj).removeCallbacks(rgqVar);
            this.l = null;
            return true;
        }
        im imVar = this.i;
        if (imVar == null) {
            return false;
        }
        imVar.b();
        return true;
    }

    public final boolean l() {
        im imVar = this.i;
        return imVar != null && imVar.g();
    }

    public final boolean m() {
        hg hgVar;
        if (!this.m || l() || (hgVar = this.c) == null || this.f == null || this.l != null || hgVar.e().isEmpty()) {
            return false;
        }
        this.l = new rgq(this, new im(this, this.b, this.c, this.g), 1);
        ((View) this.f).post(this.l);
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
        ij ijVar = this.j;
        if (ijVar != null) {
            ijVar.b();
        }
    }
}
