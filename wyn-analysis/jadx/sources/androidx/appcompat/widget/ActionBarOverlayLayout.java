package androidx.appcompat.widget;

import D9.n;
import D9.o;
import Fe.g;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import b1.C1494c;
import com.google.android.gms.common.api.f;
import com.wynauto.wyn.R;
import java.util.WeakHashMap;
import k1.H;
import k1.InterfaceC3129p;
import k1.InterfaceC3130q;
import k1.J;
import k1.S;
import k1.h0;
import k1.i0;
import k1.j0;
import k1.k0;
import k1.l0;
import k1.s0;
import k1.v0;
import p.k;
import p.w;
import q.C3806d;
import q.C3816i;
import q.InterfaceC3804c;
import q.InterfaceC3817i0;
import q.InterfaceC3819j0;
import q.RunnableC3802b;
import q.j1;
import q.o1;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC3817i0, InterfaceC3129p, InterfaceC3130q {

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f17813B = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: A, reason: collision with root package name */
    public final n f17814A;

    /* renamed from: a, reason: collision with root package name */
    public int f17815a;

    /* renamed from: b, reason: collision with root package name */
    public int f17816b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f17817c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f17818d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC3819j0 f17819e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f17820f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17821g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17822h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f17823i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f17824j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public int f17825l;

    /* renamed from: m, reason: collision with root package name */
    public int f17826m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f17827n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f17828o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f17829p;

    /* renamed from: q, reason: collision with root package name */
    public v0 f17830q;

    /* renamed from: r, reason: collision with root package name */
    public v0 f17831r;

    /* renamed from: s, reason: collision with root package name */
    public v0 f17832s;

    /* renamed from: t, reason: collision with root package name */
    public v0 f17833t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC3804c f17834u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f17835v;

    /* renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f17836w;

    /* renamed from: x, reason: collision with root package name */
    public final o f17837x;

    /* renamed from: y, reason: collision with root package name */
    public final RunnableC3802b f17838y;

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC3802b f17839z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17816b = 0;
        this.f17827n = new Rect();
        this.f17828o = new Rect();
        this.f17829p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        v0 v0Var = v0.f38876b;
        this.f17830q = v0Var;
        this.f17831r = v0Var;
        this.f17832s = v0Var;
        this.f17833t = v0Var;
        this.f17837x = new o(this, 4);
        this.f17838y = new RunnableC3802b(this, 0);
        this.f17839z = new RunnableC3802b(this, 1);
        i(context);
        this.f17814A = new n(9);
    }

    public static boolean g(View view, Rect rect, boolean z2) {
        boolean z10;
        C3806d c3806d = (C3806d) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) c3806d).leftMargin;
        int i10 = rect.left;
        if (i5 != i10) {
            ((ViewGroup.MarginLayoutParams) c3806d).leftMargin = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = ((ViewGroup.MarginLayoutParams) c3806d).topMargin;
        int i12 = rect.top;
        if (i11 != i12) {
            ((ViewGroup.MarginLayoutParams) c3806d).topMargin = i12;
            z10 = true;
        }
        int i13 = ((ViewGroup.MarginLayoutParams) c3806d).rightMargin;
        int i14 = rect.right;
        if (i13 != i14) {
            ((ViewGroup.MarginLayoutParams) c3806d).rightMargin = i14;
            z10 = true;
        }
        if (z2) {
            int i15 = ((ViewGroup.MarginLayoutParams) c3806d).bottomMargin;
            int i16 = rect.bottom;
            if (i15 != i16) {
                ((ViewGroup.MarginLayoutParams) c3806d).bottomMargin = i16;
                return true;
            }
        }
        return z10;
    }

    @Override // k1.InterfaceC3129p
    public final void a(int i5, View view) {
        if (i5 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // k1.InterfaceC3129p
    public final void b(View view, View view2, int i5, int i10) {
        if (i10 == 0) {
            onNestedScrollAccepted(view, view2, i5);
        }
    }

    @Override // k1.InterfaceC3129p
    public final void c(View view, int i5, int i10, int[] iArr, int i11) {
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C3806d;
    }

    @Override // k1.InterfaceC3130q
    public final void d(View view, int i5, int i10, int i11, int i12, int i13, int[] iArr) {
        e(view, i5, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f17820f == null || this.f17821g) {
            return;
        }
        if (this.f17818d.getVisibility() == 0) {
            translationY = (int) (this.f17818d.getTranslationY() + this.f17818d.getBottom() + 0.5f);
        } else {
            translationY = 0;
        }
        this.f17820f.setBounds(0, translationY, getWidth(), this.f17820f.getIntrinsicHeight() + translationY);
        this.f17820f.draw(canvas);
    }

    @Override // k1.InterfaceC3129p
    public final void e(View view, int i5, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            onNestedScroll(view, i5, i10, i11, i12);
        }
    }

    @Override // k1.InterfaceC3129p
    public final boolean f(View view, View view2, int i5, int i10) {
        return i10 == 0 && onStartNestedScroll(view, view2, i5);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C3806d(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C3806d(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f17818d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        n nVar = this.f17814A;
        return nVar.f2593c | nVar.f2592b;
    }

    public CharSequence getTitle() {
        k();
        return ((o1) this.f17819e).f43850a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f17838y);
        removeCallbacks(this.f17839z);
        ViewPropertyAnimator viewPropertyAnimator = this.f17836w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f17813B);
        this.f17815a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f17820f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f17821g = context.getApplicationInfo().targetSdkVersion < 19;
        this.f17835v = new OverScroller(context);
    }

    public final void j(int i5) {
        k();
        if (i5 == 2) {
            ((o1) this.f17819e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i5 == 5) {
            ((o1) this.f17819e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i5 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC3819j0 wrapper;
        if (this.f17817c == null) {
            this.f17817c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f17818d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC3819j0) {
                wrapper = (InterfaceC3819j0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f17819e = wrapper;
        }
    }

    public final void l(k kVar, w wVar) {
        k();
        o1 o1Var = (o1) this.f17819e;
        C3816i c3816i = o1Var.f43861m;
        Toolbar toolbar = o1Var.f43850a;
        if (c3816i == null) {
            o1Var.f43861m = new C3816i(toolbar.getContext());
        }
        C3816i c3816i2 = o1Var.f43861m;
        c3816i2.f43794e = wVar;
        if (kVar == null && toolbar.f17977a == null) {
            return;
        }
        toolbar.f();
        k kVar2 = toolbar.f17977a.f17840p;
        if (kVar2 == kVar) {
            return;
        }
        if (kVar2 != null) {
            kVar2.r(toolbar.f17971K);
            kVar2.r(toolbar.L);
        }
        if (toolbar.L == null) {
            toolbar.L = new j1(toolbar);
        }
        c3816i2.f43805q = true;
        if (kVar != null) {
            kVar.b(c3816i2, toolbar.f17986j);
            kVar.b(toolbar.L, toolbar.f17986j);
        } else {
            c3816i2.b(toolbar.f17986j, null);
            toolbar.L.b(toolbar.f17986j, null);
            c3816i2.d();
            toolbar.L.d();
        }
        toolbar.f17977a.setPopupTheme(toolbar.k);
        toolbar.f17977a.setPresenter(c3816i2);
        toolbar.f17971K = c3816i2;
        toolbar.u();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        v0 v0VarG = v0.g(this, windowInsets);
        boolean zG = g(this.f17818d, new Rect(v0VarG.b(), v0VarG.d(), v0VarG.c(), v0VarG.a()), false);
        WeakHashMap weakHashMap = S.f38779a;
        Rect rect = this.f17827n;
        J.b(this, v0VarG, rect);
        int i5 = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom;
        s0 s0Var = v0VarG.f38877a;
        v0 v0VarM = s0Var.m(i5, i10, i11, i12);
        this.f17830q = v0VarM;
        boolean z2 = true;
        if (!this.f17831r.equals(v0VarM)) {
            this.f17831r = this.f17830q;
            zG = true;
        }
        Rect rect2 = this.f17828o;
        if (rect2.equals(rect)) {
            z2 = zG;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return s0Var.a().f38877a.c().f38877a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = S.f38779a;
        H.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                C3806d c3806d = (C3806d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i14 = ((ViewGroup.MarginLayoutParams) c3806d).leftMargin + paddingLeft;
                int i15 = ((ViewGroup.MarginLayoutParams) c3806d).topMargin + paddingTop;
                childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        int measuredHeight;
        k();
        measureChildWithMargins(this.f17818d, i5, 0, i10, 0);
        C3806d c3806d = (C3806d) this.f17818d.getLayoutParams();
        int iMax = Math.max(0, this.f17818d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c3806d).leftMargin + ((ViewGroup.MarginLayoutParams) c3806d).rightMargin);
        int iMax2 = Math.max(0, this.f17818d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c3806d).topMargin + ((ViewGroup.MarginLayoutParams) c3806d).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f17818d.getMeasuredState());
        WeakHashMap weakHashMap = S.f38779a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            measuredHeight = this.f17815a;
            if (this.f17823i && this.f17818d.getTabContainer() != null) {
                measuredHeight += this.f17815a;
            }
        } else {
            measuredHeight = this.f17818d.getVisibility() != 8 ? this.f17818d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f17827n;
        Rect rect2 = this.f17829p;
        rect2.set(rect);
        v0 v0Var = this.f17830q;
        this.f17832s = v0Var;
        if (this.f17822h || z2) {
            C1494c c1494cB = C1494c.b(v0Var.b(), this.f17832s.d() + measuredHeight, this.f17832s.c(), this.f17832s.a());
            v0 v0Var2 = this.f17832s;
            int i11 = Build.VERSION.SDK_INT;
            l0 k0Var = i11 >= 34 ? new k0(v0Var2) : i11 >= 30 ? new j0(v0Var2) : i11 >= 29 ? new i0(v0Var2) : new h0(v0Var2);
            k0Var.g(c1494cB);
            this.f17832s = k0Var.b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.f17832s = v0Var.f38877a.m(0, measuredHeight, 0, 0);
        }
        g(this.f17817c, rect2, true);
        if (!this.f17833t.equals(this.f17832s)) {
            v0 v0Var3 = this.f17832s;
            this.f17833t = v0Var3;
            S.b(this.f17817c, v0Var3);
        }
        measureChildWithMargins(this.f17817c, i5, 0, i10, 0);
        C3806d c3806d2 = (C3806d) this.f17817c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f17817c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c3806d2).leftMargin + ((ViewGroup.MarginLayoutParams) c3806d2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f17817c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c3806d2).topMargin + ((ViewGroup.MarginLayoutParams) c3806d2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f17817c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i5, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i10, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z2) {
        if (!this.f17824j || !z2) {
            return false;
        }
        this.f17835v.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, f.API_PRIORITY_OTHER);
        if (this.f17835v.getFinalY() > this.f17818d.getHeight()) {
            h();
            this.f17839z.run();
        } else {
            h();
            this.f17838y.run();
        }
        this.k = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i5, int i10, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i5, int i10, int i11, int i12) {
        int i13 = this.f17825l + i10;
        this.f17825l = i13;
        setActionBarHideOffset(i13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i5) {
        j.H h10;
        mc.b bVar;
        this.f17814A.f2592b = i5;
        this.f17825l = getActionBarHideOffset();
        h();
        InterfaceC3804c interfaceC3804c = this.f17834u;
        if (interfaceC3804c == null || (bVar = (h10 = (j.H) interfaceC3804c).f38407x) == null) {
            return;
        }
        bVar.a();
        h10.f38407x = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i5) {
        if ((i5 & 2) == 0 || this.f17818d.getVisibility() != 0) {
            return false;
        }
        return this.f17824j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f17824j || this.k) {
            return;
        }
        if (this.f17825l <= this.f17818d.getHeight()) {
            h();
            postDelayed(this.f17838y, 600L);
        } else {
            h();
            postDelayed(this.f17839z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i5) {
        super.onWindowSystemUiVisibilityChanged(i5);
        k();
        int i10 = this.f17826m ^ i5;
        this.f17826m = i5;
        boolean z2 = (i5 & 4) == 0;
        boolean z10 = (i5 & 256) != 0;
        InterfaceC3804c interfaceC3804c = this.f17834u;
        if (interfaceC3804c != null) {
            j.H h10 = (j.H) interfaceC3804c;
            h10.f38403t = !z10;
            if (z2 || !z10) {
                if (h10.f38404u) {
                    h10.f38404u = false;
                    h10.i0(true);
                }
            } else if (!h10.f38404u) {
                h10.f38404u = true;
                h10.i0(true);
            }
        }
        if ((i10 & 256) == 0 || this.f17834u == null) {
            return;
        }
        WeakHashMap weakHashMap = S.f38779a;
        H.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i5) {
        super.onWindowVisibilityChanged(i5);
        this.f17816b = i5;
        InterfaceC3804c interfaceC3804c = this.f17834u;
        if (interfaceC3804c != null) {
            ((j.H) interfaceC3804c).f38402s = i5;
        }
    }

    public void setActionBarHideOffset(int i5) {
        h();
        this.f17818d.setTranslationY(-Math.max(0, Math.min(i5, this.f17818d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC3804c interfaceC3804c) {
        this.f17834u = interfaceC3804c;
        if (getWindowToken() != null) {
            ((j.H) this.f17834u).f38402s = this.f17816b;
            int i5 = this.f17826m;
            if (i5 != 0) {
                onWindowSystemUiVisibilityChanged(i5);
                WeakHashMap weakHashMap = S.f38779a;
                H.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f17823i = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f17824j) {
            this.f17824j = z2;
            if (z2) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i5) {
        k();
        o1 o1Var = (o1) this.f17819e;
        o1Var.f43853d = i5 != 0 ? g.B(o1Var.f43850a.getContext(), i5) : null;
        o1Var.c();
    }

    public void setLogo(int i5) {
        k();
        o1 o1Var = (o1) this.f17819e;
        o1Var.f43854e = i5 != 0 ? g.B(o1Var.f43850a.getContext(), i5) : null;
        o1Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f17822h = z2;
        this.f17821g = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i5) {
    }

    @Override // q.InterfaceC3817i0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((o1) this.f17819e).k = callback;
    }

    @Override // q.InterfaceC3817i0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        o1 o1Var = (o1) this.f17819e;
        if (o1Var.f43856g) {
            return;
        }
        o1Var.f43857h = charSequence;
        if ((o1Var.f43851b & 8) != 0) {
            Toolbar toolbar = o1Var.f43850a;
            toolbar.setTitle(charSequence);
            if (o1Var.f43856g) {
                S.n(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C3806d(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        o1 o1Var = (o1) this.f17819e;
        o1Var.f43853d = drawable;
        o1Var.c();
    }
}
