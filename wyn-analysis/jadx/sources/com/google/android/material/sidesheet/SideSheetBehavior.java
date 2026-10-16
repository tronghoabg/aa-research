package com.google.android.material.sidesheet;

import Ba.c;
import E5.A;
import N7.b;
import N7.e;
import V0.a;
import V0.d;
import Va.M6;
import ad.L;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c8.C1583g;
import c8.C1587k;
import com.wynauto.wyn.R;
import d8.C2399a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k1.J;
import k1.S;
import l1.C3373c;
import t1.C4075d;

/* loaded from: classes4.dex */
public class SideSheetBehavior<V extends View> extends a {

    /* renamed from: a, reason: collision with root package name */
    public final L f26988a;

    /* renamed from: b, reason: collision with root package name */
    public final C1583g f26989b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f26990c;

    /* renamed from: d, reason: collision with root package name */
    public final C1587k f26991d;

    /* renamed from: e, reason: collision with root package name */
    public final e f26992e;

    /* renamed from: f, reason: collision with root package name */
    public final float f26993f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f26994g;

    /* renamed from: h, reason: collision with root package name */
    public int f26995h;

    /* renamed from: i, reason: collision with root package name */
    public C4075d f26996i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f26997j;
    public final float k;

    /* renamed from: l, reason: collision with root package name */
    public int f26998l;

    /* renamed from: m, reason: collision with root package name */
    public int f26999m;

    /* renamed from: n, reason: collision with root package name */
    public int f27000n;

    /* renamed from: o, reason: collision with root package name */
    public WeakReference f27001o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f27002p;

    /* renamed from: q, reason: collision with root package name */
    public final int f27003q;

    /* renamed from: r, reason: collision with root package name */
    public VelocityTracker f27004r;

    /* renamed from: s, reason: collision with root package name */
    public int f27005s;

    /* renamed from: t, reason: collision with root package name */
    public final LinkedHashSet f27006t;

    /* renamed from: u, reason: collision with root package name */
    public final b f27007u;

    public SideSheetBehavior() {
        this.f26992e = new e(this);
        this.f26994g = true;
        this.f26995h = 5;
        this.k = 0.1f;
        this.f27003q = -1;
        this.f27006t = new LinkedHashSet();
        this.f27007u = new b(this, 1);
    }

    @Override // V0.a
    public final void c(d dVar) {
        this.f27001o = null;
        this.f26996i = null;
    }

    @Override // V0.a
    public final void e() {
        this.f27001o = null;
        this.f26996i = null;
    }

    @Override // V0.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C4075d c4075d;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && S.e(view) == null) || !this.f26994g) {
            this.f26997j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f27004r) != null) {
            velocityTracker.recycle();
            this.f27004r = null;
        }
        if (this.f27004r == null) {
            this.f27004r = VelocityTracker.obtain();
        }
        this.f27004r.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f27005s = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f26997j) {
            this.f26997j = false;
            return false;
        }
        return (this.f26997j || (c4075d = this.f26996i) == null || !c4075d.p(motionEvent)) ? false : true;
    }

    @Override // V0.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i5) {
        int i10;
        int i11;
        View viewFindViewById;
        C1583g c1583g = this.f26989b;
        L l10 = this.f26988a;
        WeakHashMap weakHashMap = S.f38779a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int left = 0;
        if (this.f27001o == null) {
            this.f27001o = new WeakReference(view);
            if (c1583g != null) {
                view.setBackground(c1583g);
                float fE = this.f26993f;
                if (fE == -1.0f) {
                    fE = J.e(view);
                }
                c1583g.i(fE);
            } else {
                ColorStateList colorStateList = this.f26990c;
                if (colorStateList != null) {
                    J.i(view, colorStateList);
                }
            }
            int i12 = this.f26995h == 5 ? 4 : 0;
            if (view.getVisibility() != i12) {
                view.setVisibility(i12);
            }
            u();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (S.e(view) == null) {
                S.n(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        if (this.f26996i == null) {
            this.f26996i = new C4075d(coordinatorLayout.getContext(), coordinatorLayout, this.f27007u);
        }
        l10.getClass();
        int left2 = view.getLeft() - ((SideSheetBehavior) l10.f17515b).f27000n;
        coordinatorLayout.q(i5, view);
        this.f26999m = coordinatorLayout.getWidth();
        this.f26998l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            l10.getClass();
            i10 = marginLayoutParams.rightMargin;
        } else {
            i10 = 0;
        }
        this.f27000n = i10;
        int i13 = this.f26995h;
        if (i13 == 1 || i13 == 2) {
            l10.getClass();
            left = left2 - (view.getLeft() - ((SideSheetBehavior) l10.f17515b).f27000n);
        } else if (i13 != 3) {
            if (i13 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f26995h);
            }
            left = ((SideSheetBehavior) l10.f17515b).f26999m;
        }
        view.offsetLeftAndRight(left);
        if (this.f27002p == null && (i11 = this.f27003q) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i11)) != null) {
            this.f27002p = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f27006t.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // V0.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i5, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i5, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // V0.a
    public final void m(View view, Parcelable parcelable) {
        int i5 = ((C2399a) parcelable).f34182c;
        if (i5 == 1 || i5 == 2) {
            i5 = 5;
        }
        this.f26995h = i5;
    }

    @Override // V0.a
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new C2399a(this);
    }

    @Override // V0.a
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f26995h == 1 && actionMasked == 0) {
            return true;
        }
        if (s()) {
            this.f26996i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f27004r) != null) {
            velocityTracker.recycle();
            this.f27004r = null;
        }
        if (this.f27004r == null) {
            this.f27004r = VelocityTracker.obtain();
        }
        this.f27004r.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.f26997j && s()) {
            float fAbs = Math.abs(this.f27005s - motionEvent.getX());
            C4075d c4075d = this.f26996i;
            if (fAbs > c4075d.f45605b) {
                c4075d.b(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.f26997j;
    }

    public final void r(int i5) {
        View view;
        if (this.f26995h == i5) {
            return;
        }
        this.f26995h = i5;
        WeakReference weakReference = this.f27001o;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i10 = this.f26995h == 5 ? 4 : 0;
        if (view.getVisibility() != i10) {
            view.setVisibility(i10);
        }
        Iterator it = this.f27006t.iterator();
        if (it.hasNext()) {
            throw M6.j(it);
        }
        u();
    }

    public final boolean s() {
        if (this.f26996i != null) {
            return this.f26994g || this.f26995h == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r0.o(r1, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        r(2);
        r2.f26992e.f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            ad.L r0 = r2.f26988a
            java.lang.Object r0 = r0.f17515b
            com.google.android.material.sidesheet.SideSheetBehavior r0 = (com.google.android.material.sidesheet.SideSheetBehavior) r0
            r1 = 3
            if (r4 == r1) goto L21
            r1 = 5
            if (r4 != r1) goto L15
            ad.L r1 = r0.f26988a
            java.lang.Object r1 = r1.f17515b
            com.google.android.material.sidesheet.SideSheetBehavior r1 = (com.google.android.material.sidesheet.SideSheetBehavior) r1
            int r1 = r1.f26999m
            goto L27
        L15:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Invalid state to get outer edge offset: "
            java.lang.String r4 = ka.AbstractC3256n.g(r4, r5)
            r3.<init>(r4)
            throw r3
        L21:
            ad.L r1 = r0.f26988a
            int r1 = r1.o()
        L27:
            t1.d r0 = r0.f26996i
            if (r0 == 0) goto L5f
            if (r5 == 0) goto L38
            int r3 = r3.getTop()
            boolean r3 = r0.o(r1, r3)
            if (r3 == 0) goto L5f
            goto L55
        L38:
            int r5 = r3.getTop()
            r0.f45620r = r3
            r3 = -1
            r0.f45606c = r3
            r3 = 0
            boolean r3 = r0.h(r1, r5, r3, r3)
            if (r3 != 0) goto L53
            int r5 = r0.f45604a
            if (r5 != 0) goto L53
            android.view.View r5 = r0.f45620r
            if (r5 == 0) goto L53
            r5 = 0
            r0.f45620r = r5
        L53:
            if (r3 == 0) goto L5f
        L55:
            r3 = 2
            r2.r(r3)
            N7.e r3 = r2.f26992e
            r3.f(r4)
            return
        L5f:
            r2.r(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.t(android.view.View, int, boolean):void");
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f27001o;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        S.j(262144, view);
        S.h(0, view);
        S.j(1048576, view);
        S.h(0, view);
        int i5 = 5;
        if (this.f26995h != 5) {
            S.k(view, C3373c.f39854l, new A(this, i5, 3));
        }
        int i10 = 3;
        if (this.f26995h != 3) {
            S.k(view, C3373c.f39853j, new A(this, i10, 3));
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        int i5 = 3;
        this.f26992e = new e(this);
        this.f26994g = true;
        this.f26995h = 5;
        this.k = 0.1f;
        this.f27003q = -1;
        this.f27006t = new LinkedHashSet();
        this.f27007u = new b(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I7.a.f5419v);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f26990c = c.w(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f26991d = C1587k.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f27003q = resourceId;
            WeakReference weakReference = this.f27002p;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f27002p = null;
            WeakReference weakReference2 = this.f27001o;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = S.f38779a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        C1587k c1587k = this.f26991d;
        if (c1587k != null) {
            C1583g c1583g = new C1583g(c1587k);
            this.f26989b = c1583g;
            c1583g.h(context);
            ColorStateList colorStateList = this.f26990c;
            if (colorStateList != null) {
                this.f26989b.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f26989b.setTint(typedValue.data);
            }
        }
        this.f26993f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f26994g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        if (this.f26988a == null) {
            this.f26988a = new L(this, i5);
        }
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
