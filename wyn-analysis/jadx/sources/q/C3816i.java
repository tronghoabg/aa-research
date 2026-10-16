package q;

import ac.C1346a;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.wynauto.wyn.R;
import java.util.ArrayList;
import p.SubMenuC3749D;

/* renamed from: q.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3816i implements p.x {

    /* renamed from: a, reason: collision with root package name */
    public final Context f43790a;

    /* renamed from: b, reason: collision with root package name */
    public Context f43791b;

    /* renamed from: c, reason: collision with root package name */
    public p.k f43792c;

    /* renamed from: d, reason: collision with root package name */
    public final LayoutInflater f43793d;

    /* renamed from: e, reason: collision with root package name */
    public p.w f43794e;

    /* renamed from: h, reason: collision with root package name */
    public p.z f43797h;

    /* renamed from: i, reason: collision with root package name */
    public C3814h f43798i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f43799j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f43800l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f43801m;

    /* renamed from: n, reason: collision with root package name */
    public int f43802n;

    /* renamed from: o, reason: collision with root package name */
    public int f43803o;

    /* renamed from: p, reason: collision with root package name */
    public int f43804p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f43805q;

    /* renamed from: s, reason: collision with root package name */
    public C3808e f43807s;

    /* renamed from: t, reason: collision with root package name */
    public C3808e f43808t;

    /* renamed from: u, reason: collision with root package name */
    public RunnableC3812g f43809u;

    /* renamed from: v, reason: collision with root package name */
    public C3810f f43810v;

    /* renamed from: f, reason: collision with root package name */
    public final int f43795f = R.layout.abc_action_menu_layout;

    /* renamed from: g, reason: collision with root package name */
    public final int f43796g = R.layout.abc_action_menu_item_layout;

    /* renamed from: r, reason: collision with root package name */
    public final SparseBooleanArray f43806r = new SparseBooleanArray();

    /* renamed from: w, reason: collision with root package name */
    public final C1346a f43811w = new C1346a(this, 17);

    public C3816i(Context context) {
        this.f43790a = context;
        this.f43793d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [p.y] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(p.m mVar, View view, ViewGroup viewGroup) {
        View actionView = mVar.getActionView();
        if (actionView == null || mVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof p.y ? (p.y) view : (p.y) this.f43793d.inflate(this.f43796g, viewGroup, false);
            actionMenuItemView.c(mVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f43797h);
            if (this.f43810v == null) {
                this.f43810v = new C3810f(this);
            }
            actionMenuItemView2.setPopupCallback(this.f43810v);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(mVar.f43067C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C3820k)) {
            actionView.setLayoutParams(ActionMenuView.m(layoutParams));
        }
        return actionView;
    }

    @Override // p.x
    public final void b(Context context, p.k kVar) {
        this.f43791b = context;
        LayoutInflater.from(context);
        this.f43792c = kVar;
        Resources resources = context.getResources();
        if (!this.f43801m) {
            this.f43800l = true;
        }
        int i5 = 2;
        this.f43802n = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600 || ((i10 > 960 && i11 > 720) || (i10 > 720 && i11 > 960))) {
            i5 = 5;
        } else if (i10 >= 500 || ((i10 > 640 && i11 > 480) || (i10 > 480 && i11 > 640))) {
            i5 = 4;
        } else if (i10 >= 360) {
            i5 = 3;
        }
        this.f43804p = i5;
        int measuredWidth = this.f43802n;
        if (this.f43800l) {
            if (this.f43798i == null) {
                C3814h c3814h = new C3814h(this, this.f43790a);
                this.f43798i = c3814h;
                if (this.k) {
                    c3814h.setImageDrawable(this.f43799j);
                    this.f43799j = null;
                    this.k = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f43798i.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f43798i.getMeasuredWidth();
        } else {
            this.f43798i = null;
        }
        this.f43803o = measuredWidth;
        float f10 = resources.getDisplayMetrics().density;
    }

    @Override // p.x
    public final void c(p.w wVar) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.x
    public final void d() {
        int i5;
        ViewGroup viewGroup = (ViewGroup) this.f43797h;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            p.k kVar = this.f43792c;
            if (kVar != null) {
                kVar.i();
                ArrayList arrayListL = this.f43792c.l();
                int size = arrayListL.size();
                i5 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    p.m mVar = (p.m) arrayListL.get(i10);
                    if ((mVar.f43090x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i5);
                        p.m itemData = childAt instanceof p.y ? ((p.y) childAt).getItemData() : null;
                        View viewA = a(mVar, childAt, viewGroup);
                        if (mVar != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.f43797h).addView(viewA, i5);
                        }
                        i5++;
                    }
                }
            } else {
                i5 = 0;
            }
            while (i5 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i5) == this.f43798i) {
                    i5++;
                } else {
                    viewGroup.removeViewAt(i5);
                }
            }
        }
        ((View) this.f43797h).requestLayout();
        p.k kVar2 = this.f43792c;
        if (kVar2 != null) {
            kVar2.i();
            ArrayList arrayList2 = kVar2.f43047i;
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                p.n nVar = ((p.m) arrayList2.get(i11)).f43065A;
            }
        }
        p.k kVar3 = this.f43792c;
        if (kVar3 != null) {
            kVar3.i();
            arrayList = kVar3.f43048j;
        }
        if (this.f43800l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((p.m) arrayList.get(0)).f43067C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f43798i == null) {
                this.f43798i = new C3814h(this, this.f43790a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f43798i.getParent();
            if (viewGroup3 != this.f43797h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f43798i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f43797h;
                C3814h c3814h = this.f43798i;
                actionMenuView.getClass();
                C3820k c3820kL = ActionMenuView.l();
                c3820kL.f43815a = true;
                actionMenuView.addView(c3814h, c3820kL);
            }
        } else {
            C3814h c3814h2 = this.f43798i;
            if (c3814h2 != null) {
                Object parent = c3814h2.getParent();
                Object obj = this.f43797h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f43798i);
                }
            }
        }
        ((ActionMenuView) this.f43797h).setOverflowReserved(this.f43800l);
    }

    @Override // p.x
    public final boolean e(p.m mVar) {
        return false;
    }

    @Override // p.x
    public final boolean f(p.m mVar) {
        return false;
    }

    @Override // p.x
    public final boolean g() {
        int size;
        ArrayList arrayListL;
        int i5;
        boolean z2;
        C3816i c3816i = this;
        p.k kVar = c3816i.f43792c;
        if (kVar != null) {
            arrayListL = kVar.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i10 = c3816i.f43804p;
        int i11 = c3816i.f43803o;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c3816i.f43797h;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i5 = 2;
            z2 = true;
            if (i12 >= size) {
                break;
            }
            p.m mVar = (p.m) arrayListL.get(i12);
            int i15 = mVar.f43091y;
            if ((i15 & 2) == 2) {
                i13++;
            } else if ((i15 & 1) == 1) {
                i14++;
            } else {
                z10 = true;
            }
            if (c3816i.f43805q && mVar.f43067C) {
                i10 = 0;
            }
            i12++;
        }
        if (c3816i.f43800l && (z10 || i14 + i13 > i10)) {
            i10--;
        }
        int i16 = i10 - i13;
        SparseBooleanArray sparseBooleanArray = c3816i.f43806r;
        sparseBooleanArray.clear();
        int i17 = 0;
        int i18 = 0;
        while (i17 < size) {
            p.m mVar2 = (p.m) arrayListL.get(i17);
            int i19 = mVar2.f43091y;
            boolean z11 = (i19 & 2) == i5 ? z2 : false;
            int i20 = mVar2.f43069b;
            if (z11) {
                View viewA = c3816i.a(mVar2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i11 -= measuredWidth;
                if (i18 == 0) {
                    i18 = measuredWidth;
                }
                if (i20 != 0) {
                    sparseBooleanArray.put(i20, z2);
                }
                mVar2.f(z2);
            } else if ((i19 & 1) == z2) {
                boolean z12 = sparseBooleanArray.get(i20);
                boolean z13 = ((i16 > 0 || z12) && i11 > 0) ? z2 : false;
                if (z13) {
                    View viewA2 = c3816i.a(mVar2, null, viewGroup);
                    viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    i11 -= measuredWidth2;
                    if (i18 == 0) {
                        i18 = measuredWidth2;
                    }
                    z13 &= i11 + i18 > 0;
                }
                if (z13 && i20 != 0) {
                    sparseBooleanArray.put(i20, true);
                } else if (z12) {
                    sparseBooleanArray.put(i20, false);
                    for (int i21 = 0; i21 < i17; i21++) {
                        p.m mVar3 = (p.m) arrayListL.get(i21);
                        if (mVar3.f43069b == i20) {
                            if ((mVar3.f43090x & 32) == 32) {
                                i16++;
                            }
                            mVar3.f(false);
                        }
                    }
                }
                if (z13) {
                    i16--;
                }
                mVar2.f(z13);
            } else {
                mVar2.f(false);
                i17++;
                i5 = 2;
                c3816i = this;
                z2 = true;
            }
            i17++;
            i5 = 2;
            c3816i = this;
            z2 = true;
        }
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.x
    public final boolean h(SubMenuC3749D subMenuC3749D) {
        boolean z2;
        if (subMenuC3749D.hasVisibleItems()) {
            SubMenuC3749D subMenuC3749D2 = subMenuC3749D;
            while (true) {
                p.k kVar = subMenuC3749D2.f42980z;
                if (kVar == this.f43792c) {
                    break;
                }
                subMenuC3749D2 = (SubMenuC3749D) kVar;
            }
            ViewGroup viewGroup = (ViewGroup) this.f43797h;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i5 = 0;
                while (true) {
                    if (i5 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i5);
                    if ((childAt instanceof p.y) && ((p.y) childAt).getItemData() == subMenuC3749D2.f42979A) {
                        view = childAt;
                        break;
                    }
                    i5++;
                }
            }
            if (view != null) {
                subMenuC3749D.f42979A.getClass();
                int size = subMenuC3749D.f43044f.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        z2 = false;
                        break;
                    }
                    MenuItem item = subMenuC3749D.getItem(i10);
                    if (item.isVisible() && item.getIcon() != null) {
                        z2 = true;
                        break;
                    }
                    i10++;
                }
                C3808e c3808e = new C3808e(this, this.f43791b, subMenuC3749D, view);
                this.f43808t = c3808e;
                c3808e.f43112g = z2;
                p.s sVar = c3808e.f43114i;
                if (sVar != null) {
                    sVar.m(z2);
                }
                C3808e c3808e2 = this.f43808t;
                if (!c3808e2.b()) {
                    if (c3808e2.f43110e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c3808e2.d(0, 0, false, false);
                }
                p.w wVar = this.f43794e;
                if (wVar != null) {
                    wVar.F(subMenuC3749D);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        Object obj;
        RunnableC3812g runnableC3812g = this.f43809u;
        if (runnableC3812g != null && (obj = this.f43797h) != null) {
            ((View) obj).removeCallbacks(runnableC3812g);
            this.f43809u = null;
            return true;
        }
        C3808e c3808e = this.f43807s;
        if (c3808e == null) {
            return false;
        }
        if (c3808e.b()) {
            c3808e.f43114i.dismiss();
        }
        return true;
    }

    public final boolean j() {
        C3808e c3808e = this.f43807s;
        return c3808e != null && c3808e.b();
    }

    public final boolean k() {
        p.k kVar;
        if (!this.f43800l || j() || (kVar = this.f43792c) == null || this.f43797h == null || this.f43809u != null) {
            return false;
        }
        kVar.i();
        if (kVar.f43048j.isEmpty()) {
            return false;
        }
        RunnableC3812g runnableC3812g = new RunnableC3812g(this, new C3808e(this, this.f43791b, this.f43792c, this.f43798i));
        this.f43809u = runnableC3812g;
        ((View) this.f43797h).post(runnableC3812g);
        return true;
    }

    @Override // p.x
    public final void l(p.k kVar, boolean z2) {
        i();
        C3808e c3808e = this.f43808t;
        if (c3808e != null && c3808e.b()) {
            c3808e.f43114i.dismiss();
        }
        p.w wVar = this.f43794e;
        if (wVar != null) {
            wVar.l(kVar, z2);
        }
    }
}
