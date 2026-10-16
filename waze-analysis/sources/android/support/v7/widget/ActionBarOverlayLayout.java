package android.support.v7.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.core.graphics.Insets;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.waze.R;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class ActionBarOverlayLayout extends ViewGroup implements NestedScrollingParent, NestedScrollingParent2, NestedScrollingParent3, bw {

    /* renamed from: a, reason: collision with root package name */
    static final int[] f879a = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: f, reason: collision with root package name */
    private static final WindowInsetsCompat f880f;

    /* renamed from: g, reason: collision with root package name */
    private static final Rect f881g;
    private f A;
    private OverScroller B;
    private final Runnable C;
    private final Runnable D;
    private final NestedScrollingParentHelper E;
    private final h F;
    private gm G;

    /* renamed from: b, reason: collision with root package name */
    ActionBarContainer f882b;

    /* renamed from: c, reason: collision with root package name */
    boolean f883c;

    /* renamed from: d, reason: collision with root package name */
    ViewPropertyAnimator f884d;

    /* renamed from: e, reason: collision with root package name */
    final AnimatorListenerAdapter f885e;

    /* renamed from: h, reason: collision with root package name */
    private int f886h;

    /* renamed from: i, reason: collision with root package name */
    private int f887i;

    /* renamed from: j, reason: collision with root package name */
    private ContentFrameLayout f888j;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f889k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f890l;
    private boolean m;
    private int n;
    private int o;
    private final Rect p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private boolean u;
    private boolean v;
    private WindowInsetsCompat w;
    private WindowInsetsCompat x;
    private WindowInsetsCompat y;
    private WindowInsetsCompat z;

    static {
        WindowInsetsCompat.Builder builder = new WindowInsetsCompat.Builder();
        builder.setSystemWindowInsets(Insets.of(0, 1, 0, 1));
        f880f = builder.build();
        f881g = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f887i = 0;
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = true;
        this.v = false;
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.CONSUMED;
        this.w = windowInsetsCompat;
        this.x = windowInsetsCompat;
        this.y = windowInsetsCompat;
        this.z = windowInsetsCompat;
        this.f885e = new d(this);
        this.C = new e(this, 1);
        this.D = new e(this, 0);
        r(context);
        this.E = new NestedScrollingParentHelper(this);
        h hVar = new h(context);
        this.F = hVar;
        addView(hVar);
    }

    private final void r(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f879a);
        this.f886h = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f889k = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.B = new OverScroller(context);
    }

    private static final boolean s(View view, int i2, int i3, int i4, int i5) {
        boolean z;
        g gVar = (g) view.getLayoutParams();
        if (gVar.leftMargin != i2) {
            gVar.leftMargin = i2;
            z = true;
        } else {
            z = false;
        }
        if (gVar.topMargin != i3) {
            gVar.topMargin = i3;
            z = true;
        }
        if (gVar.rightMargin != i4) {
            gVar.rightMargin = i4;
            z = true;
        }
        if (gVar.bottomMargin == i5) {
            return z;
        }
        gVar.bottomMargin = i5;
        return true;
    }

    @Override // android.support.v7.widget.bw
    public final void a() {
        d();
        ActionMenuView actionMenuView = this.G.f1564a.f971a;
        if (actionMenuView != null) {
            actionMenuView.i();
        }
    }

    final void b() {
        removeCallbacks(this.C);
        removeCallbacks(this.D);
        ViewPropertyAnimator viewPropertyAnimator = this.f884d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.support.v7.widget.bw
    public final void c(int i2) {
        d();
        if (i2 == 2) {
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i2 == 5) {
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i2 != 109) {
                return;
            }
            this.f890l = true;
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g;
    }

    final void d() {
        if (this.f888j == null) {
            this.f888j = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f882b = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View viewFindViewById = findViewById(R.id.action_bar);
            if (!(viewFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(String.valueOf(viewFindViewById.getClass().getSimpleName())));
            }
            this.G = ((Toolbar) viewFindViewById).C();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f889k != null) {
            int bottom = this.f882b.getVisibility() == 0 ? (int) (this.f882b.getBottom() + this.f882b.getTranslationY() + 0.5f) : 0;
            this.f889k.setBounds(0, bottom, getWidth(), this.f889k.getIntrinsicHeight() + bottom);
            this.f889k.draw(canvas);
        }
    }

    public final void e(int i2) {
        b();
        this.f882b.setTranslationY(-Math.max(0, Math.min(i2, this.f882b.getHeight())));
    }

    public final void f(f fVar) {
        this.A = fVar;
        if (getWindowToken() != null) {
            this.A.o(this.f887i);
            int i2 = this.o;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                ViewCompat.requestApplyInsets(this);
            }
        }
    }

    public final void g(boolean z) {
        if (z != this.m) {
            this.m = z;
            if (z) {
                return;
            }
            b();
            e(0);
        }
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public final int getNestedScrollAxes() {
        return this.E.getNestedScrollAxes();
    }

    @Override // android.support.v7.widget.bw
    public final void h(Menu menu, android.support.v7.view.menu.ac acVar) {
        d();
        this.G.f(menu, acVar);
    }

    @Override // android.support.v7.widget.bw
    public final void i() {
        d();
        this.G.f1567d = true;
    }

    @Override // android.support.v7.widget.bw
    public final void j(Window.Callback callback) {
        d();
        this.G.f1566c = callback;
    }

    @Override // android.support.v7.widget.bw
    public final void k(CharSequence charSequence) {
        d();
        this.G.h(charSequence);
    }

    @Override // android.support.v7.widget.bw
    public final boolean l() {
        ActionMenuView actionMenuView;
        d();
        Toolbar toolbar = this.G.f1564a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f971a) != null && actionMenuView.q();
    }

    @Override // android.support.v7.widget.bw
    public final boolean m() {
        d();
        ActionMenuView actionMenuView = this.G.f1564a.f971a;
        return actionMenuView != null && actionMenuView.n();
    }

    public final boolean n() {
        return this.f890l;
    }

    @Override // android.support.v7.widget.bw
    public final boolean o() {
        d();
        ActionMenuView actionMenuView = this.G.f1564a.f971a;
        return actionMenuView != null && actionMenuView.o();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        boolean zS;
        d();
        int windowSystemUiVisibility = getWindowSystemUiVisibility();
        int i2 = windowSystemUiVisibility & 256;
        int i3 = windowSystemUiVisibility & DisplayStrings.DS_MAP_POPUP_START_POINT_TITLE;
        h hVar = this.F;
        WindowInsetsCompat windowInsetsCompat = f880f;
        Rect rect = this.t;
        ViewCompat.computeSystemWindowInsets(hVar, windowInsetsCompat, rect);
        boolean zEquals = rect.equals(f881g);
        this.u = !zEquals;
        boolean z = true;
        boolean z2 = i2 != 0;
        boolean z3 = zEquals || (z2 && i3 != 0);
        this.v = z3;
        f fVar = this.A;
        if (fVar != null) {
            fVar.l((z2 || z3) ? false : true);
        }
        WindowInsetsCompat windowInsetsCompat2 = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, this);
        Insets systemWindowInsets = windowInsetsCompat2.getSystemWindowInsets();
        this.s.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
        if (this.v) {
            Insets insets = windowInsetsCompat2.getInsets(2);
            this.f882b.setPadding(systemWindowInsets.left - insets.left, systemWindowInsets.top, systemWindowInsets.right - insets.right, 0);
            zS = s(this.f882b, insets.left, 0, insets.right, 0);
        } else {
            this.f882b.setPadding(0, 0, 0, 0);
            zS = s(this.f882b, systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, 0);
        }
        Rect rect2 = this.p;
        ViewCompat.computeSystemWindowInsets(this, windowInsetsCompat2, rect2);
        WindowInsetsCompat windowInsetsCompatInset = windowInsetsCompat2.inset(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.w = windowInsetsCompatInset;
        if (this.x.equals(windowInsetsCompatInset)) {
            z = zS;
        } else {
            this.x = this.w;
        }
        Rect rect3 = this.q;
        if (rect3.equals(rect2)) {
            if (z) {
            }
            return windowInsetsCompat2.consumeDisplayCutout().consumeSystemWindowInsets().consumeStableInsets().toWindowInsets();
        }
        rect3.set(rect2);
        requestLayout();
        return windowInsetsCompat2.consumeDisplayCutout().consumeSystemWindowInsets().consumeStableInsets().toWindowInsets();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r(getContext());
        ViewCompat.requestApplyInsets(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = gVar.leftMargin + paddingLeft;
                int i8 = gVar.topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i2, int i3) {
        int measuredHeight;
        d();
        measureChildWithMargins(this.f882b, i2, 0, i3, 0);
        g gVar = (g) this.f882b.getLayoutParams();
        int iMax = Math.max(0, this.f882b.getMeasuredWidth() + gVar.leftMargin + gVar.rightMargin);
        int iMax2 = Math.max(0, this.f882b.getMeasuredHeight() + gVar.topMargin + gVar.bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f882b.getMeasuredState());
        boolean z = (ViewCompat.getWindowSystemUiVisibility(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f886h;
            if (this.v) {
                measuredHeight += this.s.top;
            }
        } else {
            measuredHeight = this.f882b.getVisibility() != 8 ? this.f882b.getMeasuredHeight() : 0;
        }
        Rect rect = this.r;
        rect.set(this.p);
        WindowInsetsCompat windowInsetsCompat = this.w;
        this.y = windowInsetsCompat;
        if (this.f890l || z || !this.u) {
            Insets insetsOf = this.v ? Insets.of(windowInsetsCompat.getSystemWindowInsetLeft(), Math.max(this.y.getSystemWindowInsetTop(), measuredHeight), this.y.getSystemWindowInsetRight(), Math.max(this.y.getSystemWindowInsetBottom(), 0)) : Insets.of(windowInsetsCompat.getSystemWindowInsetLeft(), this.y.getSystemWindowInsetTop() + measuredHeight, this.y.getSystemWindowInsetRight(), this.y.getSystemWindowInsetBottom());
            WindowInsetsCompat.Builder builder = new WindowInsetsCompat.Builder(this.y);
            builder.setSystemWindowInsets(insetsOf);
            this.y = builder.build();
        } else {
            if (this.v) {
                rect.top = Math.max(rect.top, measuredHeight);
                rect.bottom = Math.max(rect.bottom, 0);
            } else {
                rect.top += measuredHeight;
                rect.bottom = rect.bottom;
            }
            this.y = this.y.inset(0, measuredHeight, 0, 0);
        }
        s(this.f888j, rect.left, rect.top, rect.right, rect.bottom);
        if (!this.z.equals(this.y)) {
            WindowInsetsCompat windowInsetsCompat2 = this.y;
            this.z = windowInsetsCompat2;
            ViewCompat.dispatchApplyWindowInsets(this.f888j, windowInsetsCompat2);
        }
        measureChildWithMargins(this.f888j, i2, 0, i3, 0);
        g gVar2 = (g) this.f888j.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f888j.getMeasuredWidth() + gVar2.leftMargin + gVar2.rightMargin);
        int iMax4 = Math.max(iMax2, this.f888j.getMeasuredHeight() + gVar2.topMargin + gVar2.bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f888j.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (!this.m || !z) {
            return false;
        }
        this.B.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.B.getFinalY() > this.f882b.getHeight()) {
            b();
            this.D.run();
        } else {
            b();
            this.C.run();
        }
        this.f883c = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.n + i3;
        this.n = i6;
        e(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        this.E.onNestedScrollAccepted(view, view2, i2);
        ActionBarContainer actionBarContainer = this.f882b;
        this.n = actionBarContainer != null ? -((int) actionBarContainer.getTranslationY()) : 0;
        b();
        f fVar = this.A;
        if (fVar != null) {
            fVar.n();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f882b.getVisibility() != 0) {
            return false;
        }
        return this.m;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onStopNestedScroll(View view) {
        if (!this.m || this.f883c) {
            return;
        }
        if (this.n <= this.f882b.getHeight()) {
            b();
            postDelayed(this.C, 600L);
        } else {
            b();
            postDelayed(this.D, 600L);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i2) {
        super.onWindowSystemUiVisibilityChanged(i2);
        d();
        int i3 = this.o ^ i2;
        this.o = i2;
        f fVar = this.A;
        if (fVar != null) {
            boolean z = (i2 & 256) != 0;
            int i4 = i2 & 4;
            fVar.l((z || this.v) ? false : true);
            if (i4 == 0 || !z) {
                this.A.p();
            } else {
                this.A.m();
            }
        }
        if ((i3 & 256) == 0 || this.A == null) {
            return;
        }
        ViewCompat.requestApplyInsets(this);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f887i = i2;
        f fVar = this.A;
        if (fVar != null) {
            fVar.o(i2);
        }
    }

    @Override // android.support.v7.widget.bw
    public final boolean p() {
        d();
        return this.G.f1564a.A();
    }

    @Override // android.support.v7.widget.bw
    public final boolean q() {
        d();
        return this.G.f1564a.B();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr, int i4) {
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new g(layoutParams);
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        onNestedScroll(view, i2, i3, i4, i5, i6);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final boolean onStartNestedScroll(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScrollAccepted(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onStopNestedScroll(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }
}
