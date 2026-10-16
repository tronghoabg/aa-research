package com.google.android.apps.auto.sdk.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LruCache;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import defpackage.ca;
import defpackage.lt;
import defpackage.lv;
import defpackage.oez;
import defpackage.onh;
import defpackage.osq;
import defpackage.owu;
import defpackage.owy;
import defpackage.oxe;
import defpackage.oxf;
import defpackage.oxg;
import defpackage.oxh;
import defpackage.oxi;
import defpackage.oxl;
import defpackage.rsb;

/* loaded from: classes2.dex */
public class PagedListView extends FrameLayout {
    private final MaxWidthLayout a;
    private int b;
    private int c;
    private int d;
    private boolean e;
    private float f;
    public final CarLayoutManager g;
    public final Handler h;
    public boolean i;
    public final boolean j;
    public boolean k;
    public final boolean l;
    public final PagedScrollBarView m;
    public boolean n;
    public CarRecyclerView o;
    public AutoTunedRecyclerView p;
    protected lt q;
    public int r;
    public oxh s;
    public final Runnable t;
    public osq u;
    private float v;
    private boolean w;
    private boolean x;
    private final Runnable y;
    private final ca z;

    public PagedListView(Context context, AttributeSet attributeSet, int i, int i2, int i3) throws Resources.NotFoundException {
        super(context, attributeSet, i, i2);
        this.h = new Handler();
        this.b = -1;
        this.r = -1;
        this.s = new oxh(getContext(), true);
        this.c = 6;
        int i4 = 0;
        this.d = 0;
        this.z = new oxg(this);
        this.t = new oez(this, 14, null);
        this.y = new oez(this, 15, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, oxl.d, i, i2);
        try {
            boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
            boolean z2 = typedArrayObtainStyledAttributes.getBoolean(5, false);
            this.i = typedArrayObtainStyledAttributes.getBoolean(8, true);
            this.j = typedArrayObtainStyledAttributes.getBoolean(7, false);
            boolean z3 = typedArrayObtainStyledAttributes.getBoolean(6, false);
            boolean z4 = typedArrayObtainStyledAttributes.getBoolean(10, true);
            boolean z5 = typedArrayObtainStyledAttributes.getBoolean(11, false);
            boolean z6 = typedArrayObtainStyledAttributes.getBoolean(3, false);
            this.l = z6;
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1);
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, -1);
            int integer = typedArrayObtainStyledAttributes.getInteger(1, oxe.MULTIMOVE_MODAL.ordinal());
            LayoutInflater.from(context).inflate(i3 == 0 ? z6 ? R.layout.gearhead_sdk_paged_tuned_recycler_view : R.layout.gearhead_sdk_paged_recycler_view : i3, (ViewGroup) this, true);
            this.a = (MaxWidthLayout) findViewById(R.id.max_width_layout);
            oxe oxeVar = oxe.NONE;
            oxe oxeVarB = oxe.b(integer, oxeVar);
            if (oxeVarB != oxeVar) {
                rsb.c(this, new rsb(oxe.a(oxeVarB)));
            }
            if (z6) {
                this.p = (AutoTunedRecyclerView) findViewById(R.id.tuned_recycler_view);
            } else {
                CarRecyclerView carRecyclerView = (CarRecyclerView) findViewById(R.id.recycler_view);
                this.o = carRecyclerView;
                carRecyclerView.ad = z;
            }
            this.r = this.c - 1;
            CarLayoutManager carLayoutManager = new CarLayoutManager(context);
            this.g = carLayoutManager;
            carLayoutManager.c = z2;
            if (z2) {
                if (carLayoutManager.g == null) {
                    carLayoutManager.g = new LruCache(30);
                }
                carLayoutManager.R();
            } else {
                int iAv = carLayoutManager.av();
                for (int i5 = 0; i5 < iAv; i5++) {
                    carLayoutManager.S(carLayoutManager.aD(i5), BitmapDescriptorFactory.HUE_RED);
                }
                carLayoutManager.g = null;
            }
            CarLayoutManager carLayoutManager2 = this.g;
            carLayoutManager2.i = z4;
            carLayoutManager2.j = z5;
            if (this.l) {
                carLayoutManager2.m = true;
                this.p.ab(carLayoutManager2);
                this.p.aw(this.s);
                AutoTunedRecyclerView autoTunedRecyclerView = this.p;
                autoTunedRecyclerView.aa = this.z;
                autoTunedRecyclerView.au().h();
                this.p.aa(new owy(this.g));
            } else {
                this.o.ab(carLayoutManager2);
                this.o.aw(this.s);
                CarRecyclerView carRecyclerView2 = this.o;
                carRecyclerView2.aa = this.z;
                carRecyclerView2.au().h();
                this.o.aa(new owy(this.g));
            }
            setClickable(true);
            setFocusable(false);
            PagedScrollBarView pagedScrollBarView = (PagedScrollBarView) findViewById(R.id.paged_scroll_view);
            this.m = pagedScrollBarView;
            pagedScrollBarView.j = new oxf(this, i4);
            if (dimensionPixelSize >= 0) {
                ViewGroup.LayoutParams layoutParams = pagedScrollBarView.getLayoutParams();
                layoutParams.width = dimensionPixelSize;
                pagedScrollBarView.setLayoutParams(layoutParams);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.a.getLayoutParams();
                marginLayoutParams.setMarginStart(dimensionPixelSize);
                this.a.setLayoutParams(marginLayoutParams);
            }
            if (z3) {
                pagedScrollBarView.k = true;
                PagedScrollBarView.m(pagedScrollBarView.a);
                PagedScrollBarView.m(pagedScrollBarView.b);
                int dimensionPixelSize3 = pagedScrollBarView.getResources().getDimensionPixelSize(R.dimen.gearhead_sdk_paged_list_view_scrollbar_thumb_visible_buttons_margin);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) pagedScrollBarView.h.getLayoutParams();
                marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, dimensionPixelSize3, marginLayoutParams2.rightMargin, dimensionPixelSize3);
                pagedScrollBarView.h.setLayoutParams(marginLayoutParams2);
            }
            pagedScrollBarView.setVisibility(true != this.i ? 8 : 0);
            if (this.l) {
                if (!this.i) {
                    int paddingLeft = true != this.i ? 0 : this.p.getPaddingLeft();
                    AutoTunedRecyclerView autoTunedRecyclerView2 = this.p;
                    autoTunedRecyclerView2.setPadding(paddingLeft, autoTunedRecyclerView2.getPaddingTop(), getResources().getDimensionPixelSize(R.dimen.tuned_left_right_margin), this.p.getPaddingBottom());
                }
            } else if (this.j || !this.i) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.a.getLayoutParams();
                if (this.j) {
                    layoutParams2.rightMargin = getResources().getDimensionPixelSize(R.dimen.gearhead_sdk_card_margin);
                }
                if (!this.i) {
                    layoutParams2.setMarginStart(0);
                }
                this.a.setLayoutParams(layoutParams2);
            }
            if (dimensionPixelSize2 >= 0) {
                this.a.f = dimensionPixelSize2;
            }
            n(0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final boolean f() {
        return this.n || getResources().getBoolean(R.bool.has_wheel) || getResources().getConfiguration().navigation == 2;
    }

    public void c(lt ltVar) {
        if (!(ltVar instanceof oxi)) {
            throw new IllegalArgumentException("ERROR: adapter [" + ltVar.getClass().getCanonicalName() + "] MUST implement ItemCap");
        }
        this.q = ltVar;
        if (this.l) {
            this.p.Z(ltVar);
        } else {
            this.o.Z(ltVar);
        }
        ft();
    }

    public void d(boolean z) {
        if (this.i) {
            CarLayoutManager carLayoutManager = this.g;
            if ((carLayoutManager.Y() && carLayoutManager.X()) || carLayoutManager.ax() == 0) {
                this.m.setVisibility(4);
            } else {
                this.m.setVisibility(0);
            }
            PagedScrollBarView pagedScrollBarView = this.m;
            pagedScrollBarView.g(e());
            pagedScrollBarView.d(fu());
            if (this.l) {
                pagedScrollBarView.e(this.p.computeVerticalScrollRange(), this.p.computeVerticalScrollOffset(), this.p.computeVerticalScrollExtent(), z);
            } else {
                pagedScrollBarView.e(this.o.computeVerticalScrollRange(), this.o.computeVerticalScrollOffset(), this.o.computeVerticalScrollExtent(), z);
            }
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || !hasFocus()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        PagedScrollBarView pagedScrollBarView = this.m;
        if (pagedScrollBarView.k()) {
            int keyCode = keyEvent.getKeyCode();
            if (pagedScrollBarView.l && pagedScrollBarView.k() && keyCode == 283 && requestFocus(66)) {
                return true;
            }
        } else if (keyEvent.getKeyCode() == 282 && pagedScrollBarView.l) {
            return pagedScrollBarView.l();
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    protected boolean e() {
        return !this.g.Y();
    }

    public void ft() {
        lt ltVar = this.q;
        if (ltVar == null) {
            return;
        }
        int iA = ltVar.a();
        o();
        ((oxi) this.q).b(g());
        int iA2 = this.q.a();
        if (iA2 != iA) {
            lt ltVar2 = this.q;
            if (iA2 < iA) {
                ltVar2.l(iA2, iA - iA2);
            } else {
                ltVar2.k(iA, iA2 - iA);
            }
        }
    }

    protected boolean fu() {
        return !this.g.X();
    }

    protected final int g() {
        int i;
        View viewAD = this.g.aD(0);
        if (viewAD == null || viewAD.getHeight() == 0 || (i = this.r) < 0) {
            return -1;
        }
        return this.b * i;
    }

    public final int h() {
        return this.g.m();
    }

    public final owu i() {
        return this.l ? this.p : this.o;
    }

    public final void j() {
        if (this.l) {
            this.i = false;
            this.m.setVisibility(8);
            MaxWidthLayout maxWidthLayout = this.a;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) maxWidthLayout.getLayoutParams();
            layoutParams.setMarginStart(0);
            maxWidthLayout.setLayoutParams(layoutParams);
        }
    }

    public final void k() {
        if (this.l) {
            this.p.av(this.s);
        } else {
            this.o.av(this.s);
        }
    }

    public final void l(int i) {
        this.g.ad(i);
        this.m.a();
        this.h.post(this.y);
    }

    public final void m(View view) {
        PagedScrollBarView pagedScrollBarView = this.m;
        pagedScrollBarView.l = true;
        ViewGroup viewGroup = pagedScrollBarView.g;
        viewGroup.removeAllViews();
        view.setDuplicateParentStateEnabled(true);
        viewGroup.addView(view);
        viewGroup.setOnClickListener(new onh(view, 2));
        if (!pagedScrollBarView.i) {
            pagedScrollBarView.h(true);
        } else {
            viewGroup.setVisibility(0);
            viewGroup.setAlpha(1.0f);
        }
    }

    public final void n(int i) {
        this.m.c(i);
        this.s.c();
    }

    protected final void o() {
        View viewAD = this.g.aD(0);
        if (viewAD == null || viewAD.getHeight() == 0) {
            this.b = 1;
        } else {
            this.b = Math.max(1, (getHeight() - getPaddingTop()) / viewAD.getHeight());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.removeCallbacks(this.y);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x012e A[RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.sdk.ui.PagedListView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.g.T(1);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!hasFocus()) {
            return false;
        }
        PagedScrollBarView pagedScrollBarView = this.m;
        return pagedScrollBarView.k() ? pagedScrollBarView.l && pagedScrollBarView.k() && i == 22 && requestFocus(66) : i == 21 && pagedScrollBarView.l && pagedScrollBarView.l();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        CarLayoutManager carLayoutManager = this.g;
        View viewAE = carLayoutManager.aE();
        View viewAD = carLayoutManager.aD(0);
        super.onLayout(z, i, i2, i3, i4);
        lt ltVar = this.q;
        if (ltVar != null) {
            int iA = ltVar.a();
            if (Log.isLoggable("PagedListView", 3)) {
                Log.d("PagedListView", String.format("onLayout hasFocus: %s, mLastItemCount: %s, itemCount: %s, focusedChild: %s, firstBorn: %s, isInTouchMode: %s, mNeedsFocus: %s", Boolean.valueOf(hasFocus()), Integer.valueOf(this.d), Integer.valueOf(iA), viewAE, viewAD, Boolean.valueOf(isInTouchMode()), Boolean.valueOf(this.e)));
            }
            ft();
            if (this.e && iA > 0) {
                if (viewAE == null) {
                    if (Log.isLoggable("PagedListView", 3)) {
                        Log.d("PagedListView", "Explicit Focus: onLayout not empty: requestFocus()");
                    }
                    requestFocus();
                }
                this.e = false;
            }
            if (iA > this.d && viewAE == viewAD && viewAE != null && f()) {
                if (Log.isLoggable("PagedListView", 3)) {
                    Log.d("PagedListView", "Explicit Focus: onLayout + rotary + new items + firstBorn == focusedChild: requestFocus()");
                }
                requestFocus();
            }
            this.d = iA;
        }
        d(false);
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View viewM;
        if (this.k && (viewM = this.g.M()) != null) {
            return viewM.requestFocus(i, rect);
        }
        View viewL = this.g.L();
        return viewL != null ? viewL.requestFocus(i, rect) : super.onRequestFocusInDescendants(i, rect);
    }

    public final void p(lv lvVar) {
        if (this.l) {
            this.p.aw(lvVar);
        } else {
            this.o.aw(lvVar);
        }
    }

    public final void q(osq osqVar) {
        this.u = osqVar;
        this.g.o = osqVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        this.g.T(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (f()) {
            this.e = true;
        }
        return super.requestFocus(i, rect);
    }

    public PagedListView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PagedListView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, 0);
    }

    public PagedListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }
}
