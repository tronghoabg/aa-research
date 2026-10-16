package android.support.v7.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.car.app.model.Alert;
import com.google.android.projection.gearhead.R;
import defpackage.C0002if;
import defpackage.ag;
import defpackage.dve;
import defpackage.eag;
import defpackage.eah;
import defpackage.eai;
import defpackage.ebe;
import defpackage.ebm;
import defpackage.ecf;
import defpackage.ecg;
import defpackage.ech;
import defpackage.eci;
import defpackage.ecj;
import defpackage.eck;
import defpackage.ecl;
import defpackage.ecm;
import defpackage.ecy;
import defpackage.fr;
import defpackage.gt;
import defpackage.hg;
import defpackage.hr;
import defpackage.ig;
import defpackage.ih;
import defpackage.ii;
import defpackage.io;
import defpackage.kf;
import defpackage.ng;
import defpackage.nk;

/* loaded from: classes2.dex */
public class ActionBarOverlayLayout extends ViewGroup implements kf, eag, eah {
    static final int[] a = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    private static final ecy k;
    private static final Rect l;
    private ecy A;
    private ecy B;
    private OverScroller C;
    private final Runnable D;
    private final Runnable E;
    private final eai F;
    private final ii G;
    private nk H;
    public int b;
    public ActionBarContainer c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public ig h;
    public ViewPropertyAnimator i;
    public final AnimatorListenerAdapter j;
    private int m;
    private ContentFrameLayout n;
    private Drawable o;
    private boolean p;
    private int q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private final Rect v;
    private boolean w;
    private boolean x;
    private ecy y;
    private ecy z;

    static {
        ecm eclVar = Build.VERSION.SDK_INT >= 36 ? new ecl() : Build.VERSION.SDK_INT >= 35 ? new eck() : Build.VERSION.SDK_INT >= 34 ? new ecj() : Build.VERSION.SDK_INT >= 31 ? new eci() : Build.VERSION.SDK_INT >= 30 ? new ech() : Build.VERSION.SDK_INT >= 29 ? new ecg() : new ecf();
        eclVar.c(new dve(0, 1, 0, 1));
        k = eclVar.a();
        l = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.w = true;
        this.x = false;
        ecy ecyVar = ecy.a;
        this.y = ecyVar;
        this.z = ecyVar;
        this.A = ecyVar;
        this.B = ecyVar;
        this.j = new C0002if(this);
        this.D = new ag(this, 16, null);
        this.E = new ag(this, 17, null);
        v(context);
        this.F = new eai();
        ii iiVar = new ii(context);
        this.G = iiVar;
        addView(iiVar);
    }

    private final void v(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(a);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.o = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.C = new OverScroller(context);
    }

    private static final boolean w(View view, int i, int i2, int i3, int i4) {
        boolean z;
        ih ihVar = (ih) view.getLayoutParams();
        if (ihVar.leftMargin != i) {
            ihVar.leftMargin = i;
            z = true;
        } else {
            z = false;
        }
        if (ihVar.topMargin != i2) {
            ihVar.topMargin = i2;
            z = true;
        }
        if (ihVar.rightMargin != i3) {
            ihVar.rightMargin = i3;
            z = true;
        }
        if (ihVar.bottomMargin == i4) {
            return z;
        }
        ihVar.bottomMargin = i4;
        return true;
    }

    @Override // defpackage.kf
    public final void a() {
        i();
        this.H.c();
    }

    public final void b() {
        removeCallbacks(this.D);
        removeCallbacks(this.E);
        ViewPropertyAnimator viewPropertyAnimator = this.i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // defpackage.kf
    public final void c(int i) {
        i();
        if (i == 2) {
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            this.d = true;
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ih;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.o != null) {
            int bottom = this.c.getVisibility() == 0 ? (int) (this.c.getBottom() + this.c.getTranslationY() + 0.5f) : 0;
            this.o.setBounds(0, bottom, getWidth(), this.o.getIntrinsicHeight() + bottom);
            this.o.draw(canvas);
        }
    }

    @Override // defpackage.eag
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.eah
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        e(view, i, i2, i3, i4, i5);
    }

    @Override // defpackage.eag
    public final void g(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ih();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ih(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.F.a();
    }

    @Override // defpackage.eag
    public final void h(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    final void i() {
        if (this.n == null) {
            this.n = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.c = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View viewFindViewById = findViewById(R.id.action_bar);
            if (!(viewFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(String.valueOf(viewFindViewById.getClass().getSimpleName())));
            }
            this.H = ((Toolbar) viewFindViewById).A();
        }
    }

    public final void j(int i) {
        b();
        this.c.setTranslationY(-Math.max(0, Math.min(i, this.c.getHeight())));
    }

    public final void k(boolean z) {
        if (z != this.p) {
            this.p = z;
            if (z) {
                return;
            }
            b();
            j(0);
        }
    }

    @Override // defpackage.kf
    public final void l(Menu menu, hr hrVar) {
        i();
        nk nkVar = this.H;
        if (nkVar.f == null) {
            nkVar.f = new io(nkVar.a.getContext());
        }
        io ioVar = nkVar.f;
        ioVar.e = hrVar;
        Toolbar toolbar = nkVar.a;
        if (menu == null && toolbar.a == null) {
            return;
        }
        toolbar.l();
        hg hgVar = toolbar.a.a;
        if (hgVar != menu) {
            if (hgVar != null) {
                hgVar.m(toolbar.w);
                hgVar.m(toolbar.x);
            }
            if (toolbar.x == null) {
                toolbar.x = new ng(toolbar);
            }
            ioVar.o();
            if (menu != null) {
                hg hgVar2 = (hg) menu;
                hgVar2.h(ioVar, toolbar.i);
                hgVar2.h(toolbar.x, toolbar.i);
            } else {
                ioVar.b(toolbar.i, null);
                toolbar.x.b(toolbar.i, null);
                ioVar.i();
                toolbar.x.i();
            }
            toolbar.a.j(toolbar.j);
            toolbar.a.k(ioVar);
            toolbar.w = ioVar;
            toolbar.w();
        }
    }

    @Override // defpackage.kf
    public final void m() {
        i();
        this.H.f();
    }

    @Override // defpackage.kf
    public final void n(Window.Callback callback) {
        i();
        this.H.d = callback;
    }

    @Override // defpackage.kf
    public final void o(CharSequence charSequence) {
        i();
        this.H.i(charSequence);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        boolean zW;
        i();
        int windowSystemUiVisibility = getWindowSystemUiVisibility();
        int i = windowSystemUiVisibility & 256;
        int i2 = windowSystemUiVisibility & 1536;
        ecy ecyVar = k;
        int[] iArr = ebm.a;
        ii iiVar = this.G;
        Rect rect = this.v;
        ebe.c(iiVar, ecyVar, rect);
        boolean zEquals = rect.equals(l);
        this.w = !zEquals;
        boolean z = true;
        boolean z2 = i != 0;
        boolean z3 = zEquals || (z2 && i2 != 0);
        this.x = z3;
        ig igVar = this.h;
        if (igVar != null) {
            ((fr) igVar).j = (z2 || z3) ? false : true;
        }
        ecy ecyVarQ = ecy.q(windowInsets, this);
        dve dveVarI = ecyVarQ.i();
        Rect rect2 = this.u;
        int i3 = dveVarI.b;
        int i4 = dveVarI.c;
        int i5 = dveVarI.d;
        rect2.set(i3, i4, i5, dveVarI.e);
        if (this.x) {
            dve dveVarF = ecyVarQ.f(2);
            int i6 = dveVarF.b;
            int i7 = dveVarF.d;
            this.c.setPadding(i3 - i6, i4, i5 - i7, 0);
            zW = w(this.c, i6, 0, i7, 0);
        } else {
            this.c.setPadding(0, 0, 0, 0);
            zW = w(this.c, i3, i4, i5, 0);
        }
        Rect rect3 = this.r;
        ebe.c(this, ecyVarQ, rect3);
        ecy ecyVarO = ecyVarQ.o(rect3.left, rect3.top, rect3.right, rect3.bottom);
        this.y = ecyVarO;
        if (this.z.equals(ecyVarO)) {
            z = zW;
        } else {
            this.z = this.y;
        }
        Rect rect4 = this.s;
        if (rect4.equals(rect3)) {
            if (z) {
            }
            return ecyVarQ.l().n().m().e();
        }
        rect4.set(rect3);
        requestLayout();
        return ecyVarQ.l().n().m().e();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        int[] iArr = ebm.a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                ih ihVar = (ih) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ihVar.leftMargin + paddingLeft;
                int i7 = ihVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int measuredHeight;
        i();
        measureChildWithMargins(this.c, i, 0, i2, 0);
        ih ihVar = (ih) this.c.getLayoutParams();
        int iMax = Math.max(0, this.c.getMeasuredWidth() + ihVar.leftMargin + ihVar.rightMargin);
        int iMax2 = Math.max(0, this.c.getMeasuredHeight() + ihVar.topMargin + ihVar.bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.c.getMeasuredState());
        int[] iArr = ebm.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.m;
            if (this.x) {
                measuredHeight += this.u.top;
            }
        } else {
            measuredHeight = this.c.getVisibility() != 8 ? this.c.getMeasuredHeight() : 0;
        }
        Rect rect = this.t;
        rect.set(this.r);
        ecy ecyVar = this.y;
        this.A = ecyVar;
        if (this.d || z || !this.w) {
            dve dveVarE = this.x ? dve.e(ecyVar.b(), Math.max(this.A.d(), measuredHeight), this.A.c(), Math.max(this.A.a(), 0)) : dve.e(ecyVar.b(), this.A.d() + measuredHeight, this.A.c(), this.A.a());
            ecy ecyVar2 = this.A;
            ecm eclVar = Build.VERSION.SDK_INT >= 36 ? new ecl(ecyVar2) : Build.VERSION.SDK_INT >= 35 ? new eck(ecyVar2) : Build.VERSION.SDK_INT >= 34 ? new ecj(ecyVar2) : Build.VERSION.SDK_INT >= 31 ? new eci(ecyVar2) : Build.VERSION.SDK_INT >= 30 ? new ech(ecyVar2) : Build.VERSION.SDK_INT >= 29 ? new ecg(ecyVar2) : new ecf(ecyVar2);
            eclVar.c(dveVarE);
            this.A = eclVar.a();
        } else {
            if (this.x) {
                rect.top = Math.max(rect.top, measuredHeight);
                rect.bottom = Math.max(rect.bottom, 0);
            } else {
                rect.top += measuredHeight;
                rect.bottom = rect.bottom;
            }
            this.A = this.A.o(0, measuredHeight, 0, 0);
        }
        w(this.n, rect.left, rect.top, rect.right, rect.bottom);
        if (!this.B.equals(this.A)) {
            ecy ecyVar3 = this.A;
            this.B = ecyVar3;
            ebm.d(this.n, ecyVar3);
        }
        measureChildWithMargins(this.n, i, 0, i2, 0);
        ih ihVar2 = (ih) this.n.getLayoutParams();
        int iMax3 = Math.max(iMax, this.n.getMeasuredWidth() + ihVar2.leftMargin + ihVar2.rightMargin);
        int iMax4 = Math.max(iMax2, this.n.getMeasuredHeight() + ihVar2.topMargin + ihVar2.bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.n.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.p || !z) {
            return false;
        }
        this.C.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY);
        if (this.C.getFinalY() > this.c.getHeight()) {
            b();
            this.E.run();
        } else {
            b();
            this.D.run();
        }
        this.f = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.q + i2;
        this.q = i5;
        j(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        fr frVar;
        gt gtVar;
        this.F.b(i, 0);
        ActionBarContainer actionBarContainer = this.c;
        this.q = actionBarContainer != null ? -((int) actionBarContainer.getTranslationY()) : 0;
        b();
        ig igVar = this.h;
        if (igVar == null || (gtVar = (frVar = (fr) igVar).l) == null) {
            return;
        }
        gtVar.a();
        frVar.l = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.c.getVisibility() != 0) {
            return false;
        }
        return this.p;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.p || this.f) {
            return;
        }
        if (this.q <= this.c.getHeight()) {
            b();
            postDelayed(this.D, 600L);
        } else {
            b();
            postDelayed(this.E, 600L);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        i();
        int i2 = this.g ^ i;
        this.g = i;
        ig igVar = this.h;
        if (igVar != null) {
            boolean z = (i & 256) != 0;
            int i3 = i & 4;
            fr frVar = (fr) igVar;
            frVar.j = (z || this.x) ? false : true;
            if (i3 == 0 || !z) {
                if (frVar.k) {
                    frVar.k = false;
                    frVar.x(true);
                }
            } else if (!frVar.k) {
                frVar.k = true;
                frVar.x(true);
            }
        }
        if ((i2 & 256) == 0 || this.h == null) {
            return;
        }
        int[] iArr = ebm.a;
        requestApplyInsets();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        ig igVar = this.h;
        if (igVar != null) {
            ((fr) igVar).i = i;
        }
    }

    @Override // defpackage.kf
    public final boolean p() {
        ActionMenuView actionMenuView;
        i();
        Toolbar toolbar = this.H.a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.b;
    }

    @Override // defpackage.kf
    public final boolean q() {
        i();
        return this.H.k();
    }

    @Override // defpackage.kf
    public final boolean r() {
        io ioVar;
        i();
        ActionMenuView actionMenuView = this.H.a.a;
        if (actionMenuView == null || (ioVar = actionMenuView.c) == null) {
            return false;
        }
        return ioVar.l != null || ioVar.l();
    }

    @Override // defpackage.kf
    public final boolean s() {
        i();
        return this.H.l();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // defpackage.eag
    public final boolean t(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // defpackage.kf
    public final boolean u() {
        i();
        return this.H.m();
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ih(layoutParams);
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // defpackage.eag
    public final void d(View view, int i, int i2, int[] iArr, int i3) {
    }
}
