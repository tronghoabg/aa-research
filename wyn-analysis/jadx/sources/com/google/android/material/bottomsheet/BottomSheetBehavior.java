package com.google.android.material.bottomsheet;

import A.C0230x;
import Ba.c;
import E4.F;
import G5.C0522c;
import M3.i;
import N7.b;
import N7.e;
import N7.f;
import V0.a;
import V0.d;
import W7.l;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c8.C1582f;
import c8.C1583g;
import c8.C1587k;
import com.unity3d.services.UnityAdsConstants;
import com.wynauto.wyn.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import k1.C3114a;
import k1.C3115b;
import k1.H;
import k1.J;
import k1.S;
import ka.AbstractC3256n;
import l1.C3373c;
import t1.C4075d;

/* loaded from: classes4.dex */
public class BottomSheetBehavior<V extends View> extends a {

    /* renamed from: A, reason: collision with root package name */
    public final e f26789A;

    /* renamed from: B, reason: collision with root package name */
    public final ValueAnimator f26790B;

    /* renamed from: C, reason: collision with root package name */
    public final int f26791C;

    /* renamed from: D, reason: collision with root package name */
    public int f26792D;

    /* renamed from: E, reason: collision with root package name */
    public int f26793E;

    /* renamed from: F, reason: collision with root package name */
    public final float f26794F;

    /* renamed from: G, reason: collision with root package name */
    public int f26795G;

    /* renamed from: H, reason: collision with root package name */
    public final float f26796H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f26797I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f26798J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f26799K;
    public int L;

    /* renamed from: M, reason: collision with root package name */
    public C4075d f26800M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f26801N;

    /* renamed from: O, reason: collision with root package name */
    public int f26802O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f26803P;

    /* renamed from: Q, reason: collision with root package name */
    public final float f26804Q;

    /* renamed from: R, reason: collision with root package name */
    public int f26805R;

    /* renamed from: S, reason: collision with root package name */
    public int f26806S;

    /* renamed from: T, reason: collision with root package name */
    public int f26807T;

    /* renamed from: U, reason: collision with root package name */
    public WeakReference f26808U;

    /* renamed from: V, reason: collision with root package name */
    public WeakReference f26809V;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f26810W;

    /* renamed from: X, reason: collision with root package name */
    public VelocityTracker f26811X;

    /* renamed from: Y, reason: collision with root package name */
    public int f26812Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f26813Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f26814a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f26815a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f26816b;

    /* renamed from: b0, reason: collision with root package name */
    public HashMap f26817b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f26818c;

    /* renamed from: c0, reason: collision with root package name */
    public final SparseIntArray f26819c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f26820d;

    /* renamed from: d0, reason: collision with root package name */
    public final b f26821d0;

    /* renamed from: e, reason: collision with root package name */
    public int f26822e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f26823f;

    /* renamed from: g, reason: collision with root package name */
    public int f26824g;

    /* renamed from: h, reason: collision with root package name */
    public final int f26825h;

    /* renamed from: i, reason: collision with root package name */
    public final C1583g f26826i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f26827j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final int f26828l;

    /* renamed from: m, reason: collision with root package name */
    public int f26829m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f26830n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f26831o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f26832p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f26833q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f26834r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f26835s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f26836t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f26837u;

    /* renamed from: v, reason: collision with root package name */
    public int f26838v;

    /* renamed from: w, reason: collision with root package name */
    public int f26839w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f26840x;

    /* renamed from: y, reason: collision with root package name */
    public final C1587k f26841y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f26842z;

    public BottomSheetBehavior() {
        this.f26814a = 0;
        this.f26816b = true;
        this.k = -1;
        this.f26828l = -1;
        this.f26789A = new e(this);
        this.f26794F = 0.5f;
        this.f26796H = -1.0f;
        this.f26799K = true;
        this.L = 4;
        this.f26804Q = 0.1f;
        this.f26810W = new ArrayList();
        this.f26819c0 = new SparseIntArray();
        this.f26821d0 = new b(this, 0);
    }

    public static View u(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = S.f38779a;
        if (J.h(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View viewU = u(viewGroup.getChildAt(i5));
            if (viewU != null) {
                return viewU;
            }
        }
        return null;
    }

    public static int v(int i5, int i10, int i11, int i12) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, i10, i12);
        if (i11 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i11), 1073741824);
        }
        if (size != 0) {
            i11 = Math.min(size, i11);
        }
        return View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
    }

    public final void A(int i5) {
        if (this.L == i5) {
            return;
        }
        this.L = i5;
        if (i5 != 4 && i5 != 3 && i5 != 6) {
            boolean z2 = this.f26797I;
        }
        WeakReference weakReference = this.f26808U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i5 == 3) {
            F(true);
        } else if (i5 == 6 || i5 == 5 || i5 == 4) {
            F(false);
        }
        E(i5, true);
        ArrayList arrayList = this.f26810W;
        if (arrayList.size() <= 0) {
            D();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final boolean B(View view, float f10) {
        if (this.f26798J) {
            return true;
        }
        if (view.getTop() < this.f26795G) {
            return false;
        }
        return Math.abs(((f10 * this.f26804Q) + ((float) view.getTop())) - ((float) this.f26795G)) / ((float) s()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        A(2);
        E(r4, true);
        r2.f26789A.f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.o(r3.getLeft(), r0) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.x(r4)
            t1.d r1 = r2.f26800M
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.o(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.f45620r = r3
            r3 = -1
            r1.f45606c = r3
            r3 = 0
            boolean r3 = r1.h(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.f45604a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.f45620r
            if (r5 == 0) goto L30
            r5 = 0
            r1.f45620r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.A(r3)
            r3 = 1
            r2.E(r4, r3)
            N7.e r3 = r2.f26789A
            r3.f(r4)
            return
        L40:
            r2.A(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(android.view.View, int, boolean):void");
    }

    public final void D() throws Resources.NotFoundException {
        View view;
        int iA;
        WeakReference weakReference = this.f26808U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        S.j(524288, view);
        S.h(0, view);
        S.j(262144, view);
        S.h(0, view);
        S.j(1048576, view);
        S.h(0, view);
        SparseIntArray sparseIntArray = this.f26819c0;
        int i5 = sparseIntArray.get(0, -1);
        if (i5 != -1) {
            S.j(i5, view);
            S.h(0, view);
            sparseIntArray.delete(0);
        }
        if (!this.f26816b && this.L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            C0230x c0230x = new C0230x(this, 6, 6);
            ArrayList arrayListF = S.f(view);
            int i10 = 0;
            while (true) {
                if (i10 >= arrayListF.size()) {
                    int i11 = -1;
                    for (int i12 = 0; i12 < 32 && i11 == -1; i12++) {
                        int i13 = S.f38782d[i12];
                        boolean z2 = true;
                        for (int i14 = 0; i14 < arrayListF.size(); i14++) {
                            z2 &= ((C3373c) arrayListF.get(i14)).a() != i13;
                        }
                        if (z2) {
                            i11 = i13;
                        }
                    }
                    iA = i11;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C3373c) arrayListF.get(i10)).f39857a).getLabel())) {
                        iA = ((C3373c) arrayListF.get(i10)).a();
                        break;
                    }
                    i10++;
                }
            }
            if (iA != -1) {
                C3373c c3373c = new C3373c(null, iA, string, c0230x, null);
                View.AccessibilityDelegate accessibilityDelegateD = S.d(view);
                C3115b c3115b = accessibilityDelegateD == null ? null : accessibilityDelegateD instanceof C3114a ? ((C3114a) accessibilityDelegateD).f38796a : new C3115b(accessibilityDelegateD);
                if (c3115b == null) {
                    c3115b = new C3115b();
                }
                S.m(view, c3115b);
                S.j(c3373c.a(), view);
                S.f(view).add(c3373c);
                S.h(0, view);
            }
            sparseIntArray.put(0, iA);
        }
        if (this.f26797I && this.L != 5) {
            S.k(view, C3373c.f39854l, new C0230x(this, 5, 6));
        }
        int i15 = this.L;
        if (i15 == 3) {
            S.k(view, C3373c.k, new C0230x(this, this.f26816b ? 4 : 6, 6));
            return;
        }
        if (i15 == 4) {
            S.k(view, C3373c.f39853j, new C0230x(this, this.f26816b ? 3 : 6, 6));
        } else {
            if (i15 != 6) {
                return;
            }
            S.k(view, C3373c.k, new C0230x(this, 4, 6));
            S.k(view, C3373c.f39853j, new C0230x(this, 3, 6));
        }
    }

    public final void E(int i5, boolean z2) {
        C1583g c1583g = this.f26826i;
        ValueAnimator valueAnimator = this.f26790B;
        if (i5 == 2) {
            return;
        }
        boolean z10 = this.L == 3 && (this.f26840x || w() == 0);
        if (this.f26842z == z10 || c1583g == null) {
            return;
        }
        this.f26842z = z10;
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z2 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            }
            if (!z10) {
                f10 = 1.0f;
            }
            valueAnimator.setFloatValues(1.0f - f10, f10);
            valueAnimator.start();
            return;
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        if (!this.f26842z) {
            f10 = 1.0f;
        }
        C1582f c1582f = c1583g.f19729a;
        if (c1582f.f19721i != f10) {
            c1582f.f19721i = f10;
            c1583g.f19733e = true;
            c1583g.invalidateSelf();
        }
    }

    public final void F(boolean z2) {
        WeakReference weakReference = this.f26808U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z2) {
                if (this.f26817b0 != null) {
                    return;
                } else {
                    this.f26817b0 = new HashMap(childCount);
                }
            }
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = coordinatorLayout.getChildAt(i5);
                if (childAt != this.f26808U.get() && z2) {
                    this.f26817b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z2) {
                return;
            }
            this.f26817b0 = null;
        }
    }

    public final void G() {
        View view;
        if (this.f26808U != null) {
            r();
            if (this.L != 4 || (view = (View) this.f26808U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // V0.a
    public final void c(d dVar) {
        this.f26808U = null;
        this.f26800M = null;
    }

    @Override // V0.a
    public final void e() {
        this.f26808U = null;
        this.f26800M = null;
    }

    @Override // V0.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C4075d c4075d;
        if (!view.isShown() || !this.f26799K) {
            this.f26801N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f26812Y = -1;
            VelocityTracker velocityTracker = this.f26811X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f26811X = null;
            }
        }
        if (this.f26811X == null) {
            this.f26811X = VelocityTracker.obtain();
        }
        this.f26811X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x5 = (int) motionEvent.getX();
            this.f26813Z = (int) motionEvent.getY();
            if (this.L != 2) {
                WeakReference weakReference = this.f26809V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x5, this.f26813Z)) {
                    this.f26812Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f26815a0 = true;
                }
            }
            this.f26801N = this.f26812Y == -1 && !coordinatorLayout.o(view, x5, this.f26813Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f26815a0 = false;
            this.f26812Y = -1;
            if (this.f26801N) {
                this.f26801N = false;
                return false;
            }
        }
        if (this.f26801N || (c4075d = this.f26800M) == null || !c4075d.p(motionEvent)) {
            WeakReference weakReference2 = this.f26809V;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.f26801N || this.L == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f26800M == null || Math.abs(this.f26813Z - motionEvent.getY()) <= this.f26800M.f45605b) {
                return false;
            }
        }
        return true;
    }

    @Override // V0.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i5) throws Resources.NotFoundException {
        C1583g c1583g = this.f26826i;
        boolean z2 = false;
        WeakHashMap weakHashMap = S.f38779a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f26808U == null) {
            this.f26824g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z10 = (Build.VERSION.SDK_INT < 29 || this.f26830n || this.f26823f) ? false : true;
            if (this.f26831o || this.f26832p || this.f26833q || this.f26835s || this.f26836t || this.f26837u || z10) {
                F f10 = new F(this, z10);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                C0522c c0522c = new C0522c();
                c0522c.f4405a = paddingStart;
                c0522c.f4406b = paddingEnd;
                c0522c.f4407c = paddingBottom;
                J.l(view, new S3.e(f10, z2, c0522c, 23));
                if (view.isAttachedToWindow()) {
                    H.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new l());
                }
            }
            S.o(view, new f(view));
            this.f26808U = new WeakReference(view);
            if (c1583g != null) {
                view.setBackground(c1583g);
                float fE = this.f26796H;
                if (fE == -1.0f) {
                    fE = J.e(view);
                }
                c1583g.i(fE);
            } else {
                ColorStateList colorStateList = this.f26827j;
                if (colorStateList != null) {
                    J.i(view, colorStateList);
                }
            }
            D();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f26800M == null) {
            this.f26800M = new C4075d(coordinatorLayout.getContext(), coordinatorLayout, this.f26821d0);
        }
        int top = view.getTop();
        coordinatorLayout.q(i5, view);
        this.f26806S = coordinatorLayout.getWidth();
        this.f26807T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f26805R = height;
        int i10 = this.f26807T;
        int i11 = i10 - height;
        int i12 = this.f26839w;
        if (i11 < i12) {
            if (this.f26834r) {
                this.f26805R = i10;
            } else {
                this.f26805R = i10 - i12;
            }
        }
        this.f26792D = Math.max(0, i10 - this.f26805R);
        this.f26793E = (int) ((1.0f - this.f26794F) * this.f26807T);
        r();
        int i13 = this.L;
        if (i13 == 3) {
            view.offsetTopAndBottom(w());
        } else if (i13 == 6) {
            view.offsetTopAndBottom(this.f26793E);
        } else if (this.f26797I && i13 == 5) {
            view.offsetTopAndBottom(this.f26807T);
        } else if (i13 == 4) {
            view.offsetTopAndBottom(this.f26795G);
        } else if (i13 == 1 || i13 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        E(this.L, false);
        this.f26809V = new WeakReference(u(view));
        ArrayList arrayList = this.f26810W;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // V0.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i5, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(v(i5, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, this.k, marginLayoutParams.width), v(i11, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f26828l, marginLayoutParams.height));
        return true;
    }

    @Override // V0.a
    public final boolean i(View view) {
        WeakReference weakReference = this.f26809V;
        return (weakReference == null || view != weakReference.get() || this.L == 3) ? false : true;
    }

    @Override // V0.a
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i5, int i10, int[] iArr, int i11) {
        boolean z2 = this.f26799K;
        if (i11 == 1) {
            return;
        }
        WeakReference weakReference = this.f26809V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i12 = top - i10;
        if (i10 > 0) {
            if (i12 < w()) {
                int iW = top - w();
                iArr[1] = iW;
                WeakHashMap weakHashMap = S.f38779a;
                view.offsetTopAndBottom(-iW);
                A(3);
            } else {
                if (!z2) {
                    return;
                }
                iArr[1] = i10;
                WeakHashMap weakHashMap2 = S.f38779a;
                view.offsetTopAndBottom(-i10);
                A(1);
            }
        } else if (i10 < 0 && !view2.canScrollVertically(-1)) {
            int i13 = this.f26795G;
            if (i12 > i13 && !this.f26797I) {
                int i14 = top - i13;
                iArr[1] = i14;
                WeakHashMap weakHashMap3 = S.f38779a;
                view.offsetTopAndBottom(-i14);
                A(4);
            } else {
                if (!z2) {
                    return;
                }
                iArr[1] = i10;
                WeakHashMap weakHashMap4 = S.f38779a;
                view.offsetTopAndBottom(-i10);
                A(1);
            }
        }
        t(view.getTop());
        this.f26802O = i10;
        this.f26803P = true;
    }

    @Override // V0.a
    public final void m(View view, Parcelable parcelable) {
        N7.d dVar = (N7.d) parcelable;
        int i5 = this.f26814a;
        if (i5 != 0) {
            if (i5 == -1 || (i5 & 1) == 1) {
                this.f26822e = dVar.f8583d;
            }
            if (i5 == -1 || (i5 & 2) == 2) {
                this.f26816b = dVar.f8584e;
            }
            if (i5 == -1 || (i5 & 4) == 4) {
                this.f26797I = dVar.f8585f;
            }
            if (i5 == -1 || (i5 & 8) == 8) {
                this.f26798J = dVar.f8586g;
            }
        }
        int i10 = dVar.f8582c;
        if (i10 == 1 || i10 == 2) {
            this.L = 4;
        } else {
            this.L = i10;
        }
    }

    @Override // V0.a
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new N7.d(this);
    }

    @Override // V0.a
    public final boolean o(View view, int i5, int i10) {
        this.f26802O = 0;
        this.f26803P = false;
        return (i5 & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    @Override // V0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(android.view.View r4, android.view.View r5, int r6) {
        /*
            r3 = this;
            int r6 = r4.getTop()
            int r0 = r3.w()
            r1 = 3
            if (r6 != r0) goto Lf
            r3.A(r1)
            return
        Lf:
            java.lang.ref.WeakReference r6 = r3.f26809V
            if (r6 == 0) goto Lb5
            java.lang.Object r6 = r6.get()
            if (r5 != r6) goto Lb5
            boolean r5 = r3.f26803P
            if (r5 != 0) goto L1f
            goto Lb5
        L1f:
            int r5 = r3.f26802O
            r6 = 6
            if (r5 <= 0) goto L34
            boolean r5 = r3.f26816b
            if (r5 == 0) goto L2a
            goto Laf
        L2a:
            int r5 = r4.getTop()
            int r0 = r3.f26793E
            if (r5 <= r0) goto Laf
            goto Lae
        L34:
            boolean r5 = r3.f26797I
            if (r5 == 0) goto L55
            android.view.VelocityTracker r5 = r3.f26811X
            if (r5 != 0) goto L3e
            r5 = 0
            goto L4d
        L3e:
            r0 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f26818c
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r3.f26811X
            int r0 = r3.f26812Y
            float r5 = r5.getYVelocity(r0)
        L4d:
            boolean r5 = r3.B(r4, r5)
            if (r5 == 0) goto L55
            r1 = 5
            goto Laf
        L55:
            int r5 = r3.f26802O
            r0 = 4
            if (r5 != 0) goto L93
            int r5 = r4.getTop()
            boolean r2 = r3.f26816b
            if (r2 == 0) goto L74
            int r6 = r3.f26792D
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r2 = r3.f26795G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L97
            goto Laf
        L74:
            int r2 = r3.f26793E
            if (r5 >= r2) goto L83
            int r0 = r3.f26795G
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r5 >= r0) goto Lae
            goto Laf
        L83:
            int r1 = r5 - r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f26795G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
            goto Lae
        L93:
            boolean r5 = r3.f26816b
            if (r5 == 0) goto L99
        L97:
            r1 = r0
            goto Laf
        L99:
            int r5 = r4.getTop()
            int r1 = r3.f26793E
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f26795G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
        Lae:
            r1 = r6
        Laf:
            r5 = 0
            r3.C(r4, r1, r5)
            r3.f26803P = r5
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.p(android.view.View, android.view.View, int):void");
    }

    @Override // V0.a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i5 = this.L;
        if (i5 == 1 && actionMasked == 0) {
            return true;
        }
        C4075d c4075d = this.f26800M;
        if (c4075d != null && (this.f26799K || i5 == 1)) {
            c4075d.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f26812Y = -1;
            VelocityTracker velocityTracker = this.f26811X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f26811X = null;
            }
        }
        if (this.f26811X == null) {
            this.f26811X = VelocityTracker.obtain();
        }
        this.f26811X.addMovement(motionEvent);
        if (this.f26800M != null && ((this.f26799K || this.L == 1) && actionMasked == 2 && !this.f26801N)) {
            float fAbs = Math.abs(this.f26813Z - motionEvent.getY());
            C4075d c4075d2 = this.f26800M;
            if (fAbs > c4075d2.f45605b) {
                c4075d2.b(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.f26801N;
    }

    public final void r() {
        int iS = s();
        if (this.f26816b) {
            this.f26795G = Math.max(this.f26807T - iS, this.f26792D);
        } else {
            this.f26795G = this.f26807T - iS;
        }
    }

    public final int s() {
        int i5;
        return this.f26823f ? Math.min(Math.max(this.f26824g, this.f26807T - ((this.f26806S * 9) / 16)), this.f26805R) + this.f26838v : (this.f26830n || this.f26831o || (i5 = this.f26829m) <= 0) ? this.f26822e + this.f26838v : Math.max(this.f26822e, i5 + this.f26825h);
    }

    public final void t(int i5) {
        if (((View) this.f26808U.get()) != null) {
            ArrayList arrayList = this.f26810W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i10 = this.f26795G;
            if (i5 <= i10 && i10 != w()) {
                w();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final int w() {
        if (this.f26816b) {
            return this.f26792D;
        }
        return Math.max(this.f26791C, this.f26834r ? 0 : this.f26839w);
    }

    public final int x(int i5) {
        if (i5 == 3) {
            return w();
        }
        if (i5 == 4) {
            return this.f26795G;
        }
        if (i5 == 5) {
            return this.f26807T;
        }
        if (i5 == 6) {
            return this.f26793E;
        }
        throw new IllegalArgumentException(AbstractC3256n.g(i5, "Invalid state to get top offset: "));
    }

    public final void y(int i5) {
        if (i5 == -1) {
            if (this.f26823f) {
                return;
            } else {
                this.f26823f = true;
            }
        } else {
            if (!this.f26823f && this.f26822e == i5) {
                return;
            }
            this.f26823f = false;
            this.f26822e = Math.max(0, i5);
        }
        G();
    }

    public final void z(int i5) {
        if (i5 == 1 || i5 == 2) {
            throw new IllegalArgumentException(wg.b.c(new StringBuilder("STATE_"), i5 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f26797I && i5 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i5);
            return;
        }
        int i10 = (i5 == 6 && this.f26816b && x(i5) <= this.f26792D) ? 3 : i5;
        WeakReference weakReference = this.f26808U;
        if (weakReference == null || weakReference.get() == null) {
            A(i5);
            return;
        }
        View view = (View) this.f26808U.get();
        i iVar = new i(this, view, i10);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = S.f38779a;
            if (view.isAttachedToWindow()) {
                view.post(iVar);
                return;
            }
        }
        iVar.run();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i5;
        this.f26814a = 0;
        this.f26816b = true;
        this.k = -1;
        this.f26828l = -1;
        this.f26789A = new e(this);
        this.f26794F = 0.5f;
        this.f26796H = -1.0f;
        this.f26799K = true;
        this.L = 4;
        this.f26804Q = 0.1f;
        this.f26810W = new ArrayList();
        this.f26819c0 = new SparseIntArray();
        this.f26821d0 = new b(this, 0);
        this.f26825h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I7.a.f5399a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f26827j = c.w(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.f26841y = C1587k.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        C1587k c1587k = this.f26841y;
        if (c1587k != null) {
            C1583g c1583g = new C1583g(c1587k);
            this.f26826i = c1583g;
            c1583g.h(context);
            ColorStateList colorStateList = this.f26827j;
            if (colorStateList != null) {
                this.f26826i.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f26826i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        this.f26790B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f26790B.addUpdateListener(new N7.a(this, 0));
        this.f26796H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f26828l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null && (i5 = typedValuePeekValue.data) == -1) {
            y(i5);
        } else {
            y(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(8, false);
        if (this.f26797I != z2) {
            this.f26797I = z2;
            if (!z2 && this.L == 5) {
                z(4);
            }
            D();
        }
        this.f26830n = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f26816b != z10) {
            this.f26816b = z10;
            if (this.f26808U != null) {
                r();
            }
            A((this.f26816b && this.L == 6) ? 3 : this.L);
            E(this.L, true);
            D();
        }
        this.f26798J = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.f26799K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f26814a = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f10 = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f10 < 1.0f) {
            this.f26794F = f10;
            if (this.f26808U != null) {
                this.f26793E = (int) ((1.0f - f10) * this.f26807T);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i10 = typedValuePeekValue2.data;
                if (i10 >= 0) {
                    this.f26791C = i10;
                    E(this.L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f26791C = dimensionPixelOffset;
                    E(this.L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f26820d = typedArrayObtainStyledAttributes.getInt(11, 500);
            this.f26831o = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.f26832p = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f26833q = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f26834r = typedArrayObtainStyledAttributes.getBoolean(20, true);
            this.f26835s = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.f26836t = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.f26837u = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.f26840x = typedArrayObtainStyledAttributes.getBoolean(23, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f26818c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // V0.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i5, int i10, int i11, int[] iArr) {
    }
}
