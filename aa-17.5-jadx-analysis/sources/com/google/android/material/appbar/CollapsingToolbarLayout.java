package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.google.android.projection.gearhead.R;
import defpackage.ebe;
import defpackage.ebm;
import defpackage.ecy;
import defpackage.wkn;
import defpackage.wkx;
import defpackage.wlb;
import defpackage.wld;
import defpackage.woy;
import defpackage.woz;
import defpackage.wpx;
import defpackage.wpy;
import defpackage.wqr;
import defpackage.wub;
import defpackage.wvk;
import defpackage.wvo;
import defpackage.wxp;
import defpackage.ykd;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    private final TimeInterpolator A;
    private int B;
    private int C;
    private int D;
    private int E;
    private boolean F;
    private int G;
    private int H;
    private boolean I;
    private int J;
    private ykd K;
    final wpx a;
    final wpx b;
    final woz c;
    Drawable d;
    int e;
    public ecy f;
    private boolean g;
    private int h;
    private ViewGroup i;
    private View j;
    private View k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private final Rect q;
    private boolean r;
    private boolean s;
    private final int t;
    private Drawable u;
    private int v;
    private boolean w;
    private ValueAnimator x;
    private long y;
    private final TimeInterpolator z;

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(wxp.a(context, attributeSet, i, R.style.Widget_Design_CollapsingToolbar), attributeSet, i);
        this.g = true;
        this.q = new Rect();
        this.B = -1;
        this.E = 0;
        this.G = 0;
        this.H = 0;
        this.J = 0;
        Context context2 = getContext();
        this.C = getResources().getConfiguration().orientation;
        wpx wpxVar = new wpx(this);
        this.a = wpxVar;
        TimeInterpolator timeInterpolator = wkn.e;
        wpxVar.D(timeInterpolator);
        wpxVar.J();
        woz wozVar = new woz(context2);
        this.c = wozVar;
        TypedArray typedArrayA = wqr.a(context2, attributeSet, wlb.c, i, R.style.Widget_Design_CollapsingToolbar, new int[0]);
        int i2 = typedArrayA.getInt(9, 8388691);
        int i3 = typedArrayA.getInt(2, 8388627);
        this.t = typedArrayA.getInt(3, 1);
        wpxVar.x(i2);
        wpxVar.s(i3);
        int dimensionPixelSize = typedArrayA.getDimensionPixelSize(10, 0);
        this.o = dimensionPixelSize;
        this.n = dimensionPixelSize;
        this.m = dimensionPixelSize;
        this.l = dimensionPixelSize;
        if (typedArrayA.hasValue(13)) {
            this.l = typedArrayA.getDimensionPixelSize(13, 0);
        }
        if (typedArrayA.hasValue(12)) {
            this.n = typedArrayA.getDimensionPixelSize(12, 0);
        }
        if (typedArrayA.hasValue(14)) {
            this.m = typedArrayA.getDimensionPixelSize(14, 0);
        }
        if (typedArrayA.hasValue(11)) {
            this.o = typedArrayA.getDimensionPixelSize(11, 0);
        }
        if (typedArrayA.hasValue(15)) {
            this.p = typedArrayA.getDimensionPixelSize(15, 0);
        }
        this.r = typedArrayA.getBoolean(28, true);
        g(typedArrayA.getText(26));
        wpxVar.v(R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        wpxVar.q(R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (typedArrayA.hasValue(16)) {
            wpxVar.v(typedArrayA.getResourceId(16, 0));
        }
        if (typedArrayA.hasValue(4)) {
            wpxVar.q(typedArrayA.getResourceId(4, 0));
        }
        if (typedArrayA.hasValue(31)) {
            int i4 = typedArrayA.getInt(31, -1);
            wpxVar.j = i4 != 0 ? i4 != 1 ? i4 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START;
            wpxVar.l(false);
        }
        if (typedArrayA.hasValue(17)) {
            wpxVar.w(wub.h(context2, typedArrayA, 17));
        }
        if (typedArrayA.hasValue(5)) {
            wpxVar.r(wub.h(context2, typedArrayA, 5));
        }
        this.B = typedArrayA.getDimensionPixelSize(22, -1);
        if (typedArrayA.hasValue(29)) {
            wpxVar.u(typedArrayA.getInt(29, 1));
        } else if (typedArrayA.hasValue(20)) {
            wpxVar.u(typedArrayA.getInt(20, 1));
        }
        if (typedArrayA.hasValue(30)) {
            wpxVar.B(AnimationUtils.loadInterpolator(context2, typedArrayA.getResourceId(30, 0)));
        }
        wpx wpxVar2 = new wpx(this);
        this.b = wpxVar2;
        wpxVar2.D(timeInterpolator);
        wpxVar2.J();
        if (typedArrayA.hasValue(24)) {
            f(typedArrayA.getText(24));
        }
        wpxVar2.x(i2);
        wpxVar2.s(i3);
        wpxVar2.v(R.style.TextAppearance_AppCompat_Headline);
        wpxVar2.q(R.style.TextAppearance_AppCompat_Widget_ActionBar_Subtitle);
        if (typedArrayA.hasValue(7)) {
            wpxVar2.v(typedArrayA.getResourceId(7, 0));
        }
        if (typedArrayA.hasValue(0)) {
            wpxVar2.q(typedArrayA.getResourceId(0, 0));
        }
        if (typedArrayA.hasValue(8)) {
            wpxVar2.w(wub.h(context2, typedArrayA, 8));
        }
        if (typedArrayA.hasValue(1)) {
            wpxVar2.r(wub.h(context2, typedArrayA, 1));
        }
        if (typedArrayA.hasValue(25)) {
            wpxVar2.u(typedArrayA.getInt(25, 1));
        }
        if (typedArrayA.hasValue(30)) {
            wpxVar2.B(AnimationUtils.loadInterpolator(context2, typedArrayA.getResourceId(30, 0)));
        }
        this.y = typedArrayA.getInt(21, 600);
        this.z = woy.C(context2, R.attr.motionEasingStandardInterpolator, wkn.c);
        this.A = woy.C(context2, R.attr.motionEasingStandardInterpolator, wkn.d);
        d(typedArrayA.getDrawable(6));
        Drawable drawable = typedArrayA.getDrawable(23);
        Drawable drawable2 = this.d;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.d = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.d.setState(getDrawableState());
                }
                this.d.setLayoutDirection(getLayoutDirection());
                this.d.setVisible(getVisibility() == 0, false);
                this.d.setCallback(this);
                this.d.setAlpha(this.v);
            }
            postInvalidateOnAnimation();
        }
        this.D = typedArrayA.getInt(27, 0);
        boolean zQ = q();
        wpxVar.b = zQ;
        wpxVar2.b = zQ;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            j((AppBarLayout) parent);
        }
        if (zQ && this.u == null) {
            ColorStateList colorStateListQ = woy.q(getContext(), R.attr.colorSurfaceContainer);
            d(new ColorDrawable(colorStateListQ != null ? colorStateListQ.getDefaultColor() : wozVar.a(wozVar.b, getResources().getDimension(R.dimen.design_appbar_elevation))));
        }
        this.h = typedArrayA.getResourceId(32, -1);
        this.F = typedArrayA.getBoolean(19, false);
        this.I = typedArrayA.getBoolean(18, false);
        typedArrayA.recycle();
        setWillNotDraw(false);
        wvo wvoVar = new wvo(this, 1);
        int[] iArr = ebm.a;
        ebe.e(this, wvoVar);
    }

    static wld c(View view) {
        wld wldVar = (wld) view.getTag(R.id.view_offset_helper);
        if (wldVar != null) {
            return wldVar;
        }
        wld wldVar2 = new wld(view);
        view.setTag(R.id.view_offset_helper, wldVar2);
        return wldVar2;
    }

    private static int i(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private final void j(AppBarLayout appBarLayout) {
        if (q()) {
            appBarLayout.f = false;
        }
    }

    private final void k() {
        View view;
        if (this.g) {
            ViewGroup viewGroup = null;
            this.i = null;
            this.j = null;
            int i = this.h;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.i = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    View view2 = viewGroup2;
                    while (parent != this && parent != null) {
                        if (parent instanceof View) {
                            view2 = (View) parent;
                        }
                        parent = parent.getParent();
                        view2 = view2;
                    }
                    this.j = view2;
                }
            }
            if (this.i == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.i = viewGroup;
            }
            if (!this.r && (view = this.k) != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(this.k);
                }
            }
            if (this.r && this.i != null) {
                View view3 = this.k;
                if (view3 == null) {
                    view3 = new View(getContext());
                    this.k = view3;
                }
                if (view3.getParent() == null) {
                    this.i.addView(this.k, -1, -1);
                }
            }
            this.g = false;
        }
    }

    private final void l() {
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (appBarLayout.b == 0) {
                appBarLayout.b = 2;
            }
        }
    }

    private final void m(Drawable drawable, int i, int i2) {
        n(drawable, this.i, i, i2);
    }

    private final void n(Drawable drawable, View view, int i, int i2) {
        if (q() && view != null && this.r) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    private final void o(int i, int i2, int i3, int i4, boolean z) {
        View view;
        boolean z2;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        if (!this.r || (view = this.k) == null) {
            return;
        }
        int titleMarginStart = 0;
        boolean z3 = view.isAttachedToWindow() && this.k.getVisibility() == 0;
        this.s = z3;
        if (z3) {
            z2 = z;
        } else if (!z) {
            return;
        } else {
            z2 = true;
        }
        int layoutDirection = getLayoutDirection();
        boolean z4 = layoutDirection == 1;
        View view2 = this.j;
        if (view2 == null) {
            view2 = this.i;
        }
        int iA = a(view2);
        View view3 = this.k;
        Rect rect = this.q;
        wpy.a(this, view3, rect);
        ViewGroup viewGroup = this.i;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            titleMarginStart = toolbar.n;
            titleMarginEnd = toolbar.o;
            titleMarginTop = toolbar.p;
            titleMarginBottom = toolbar.q;
        } else if (viewGroup instanceof android.widget.Toolbar) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            titleMarginStart = toolbar2.getTitleMarginStart();
            titleMarginEnd = toolbar2.getTitleMarginEnd();
            titleMarginTop = toolbar2.getTitleMarginTop();
            titleMarginBottom = toolbar2.getTitleMarginBottom();
        } else {
            titleMarginBottom = 0;
            titleMarginEnd = 0;
            titleMarginTop = 0;
        }
        int i5 = rect.left;
        int i6 = layoutDirection == 1 ? titleMarginEnd : titleMarginStart;
        int i7 = i5 + i6;
        int i8 = rect.right;
        if (layoutDirection != 1) {
            titleMarginStart = titleMarginEnd;
        }
        int i9 = i8 - titleMarginStart;
        int i10 = rect.top + iA;
        int i11 = rect.bottom + iA;
        wpx wpxVar = this.b;
        int i12 = i11 - titleMarginBottom;
        float fA = i12 - wpxVar.a();
        wpx wpxVar2 = this.a;
        int i13 = i10 + titleMarginTop;
        int iA2 = (int) (i13 + wpxVar2.a());
        int i14 = (int) fA;
        if (TextUtils.isEmpty(wpxVar.k)) {
            wpxVar2.o(i7, i13, i9, i12);
        } else {
            wpxVar2.o(i7, i13, i9, i14);
            wpxVar.o(i7, iA2, i9, i12);
        }
        if (this.t == 0) {
            wpy.a(this, this, rect);
            int i15 = rect.left + i6;
            int i16 = rect.right - titleMarginStart;
            if (TextUtils.isEmpty(wpxVar.k)) {
                wpxVar2.p(i15, i13, i16, i12);
            } else {
                wpxVar2.p(i15, i13, i16, i14);
                wpxVar.p(i15, iA2, i16, i12);
            }
        }
        int i17 = z4 ? this.n : this.l;
        int i18 = rect.top + this.m;
        int i19 = (i3 - i) - (z4 ? this.l : this.n);
        int i20 = (i4 - i2) - this.o;
        if (TextUtils.isEmpty(wpxVar.k)) {
            wpxVar2.t(i17, i18, i19, i20, true);
            wpxVar2.l(z2);
        } else {
            wpxVar2.t(i17, i18, i19, (int) ((i20 - (wpxVar.d() + this.H)) - this.p), false);
            wpxVar.t(i17, (int) (i18 + wpxVar2.d() + this.G + this.p), i19, i20, false);
            wpxVar2.l(z2);
            wpxVar.l(z2);
        }
    }

    private final void p() {
        ViewGroup viewGroup = this.i;
        if (viewGroup == null || !this.r) {
            return;
        }
        CharSequence subtitle = null;
        CharSequence title = viewGroup instanceof Toolbar ? ((Toolbar) viewGroup).s : viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null;
        if (TextUtils.isEmpty(this.a.k) && !TextUtils.isEmpty(title)) {
            g(title);
        }
        ViewGroup viewGroup2 = this.i;
        if (viewGroup2 instanceof Toolbar) {
            subtitle = ((Toolbar) viewGroup2).t;
        } else if (viewGroup2 instanceof android.widget.Toolbar) {
            subtitle = ((android.widget.Toolbar) viewGroup2).getSubtitle();
        }
        if (!TextUtils.isEmpty(this.b.k) || TextUtils.isEmpty(subtitle)) {
            return;
        }
        f(subtitle);
    }

    private final boolean q() {
        return this.D == 1;
    }

    final int a(View view) {
        return ((getHeight() - c(view).a) - view.getHeight()) - ((wkx) view.getLayoutParams()).bottomMargin;
    }

    public final int b() {
        int i = this.B;
        if (i >= 0) {
            return i + this.E + this.G + this.H + this.J;
        }
        ecy ecyVar = this.f;
        int iD = ecyVar != null ? ecyVar.d() : 0;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min(minimumHeight + minimumHeight + iD, getHeight()) : getHeight() / 3;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof wkx;
    }

    public final void d(Drawable drawable) {
        Drawable drawable2 = this.u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.u = drawableMutate;
            if (drawableMutate != null) {
                m(drawableMutate, getWidth(), getHeight());
                this.u.setCallback(this);
                this.u.setAlpha(this.v);
            }
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r7) {
        /*
            r6 = this;
            super.draw(r7)
            r6.k()
            android.view.ViewGroup r0 = r6.i
            if (r0 != 0) goto L20
            android.graphics.drawable.Drawable r0 = r6.u
            if (r0 == 0) goto L20
            int r1 = r6.v
            if (r1 <= 0) goto L20
            android.graphics.drawable.Drawable r0 = r0.mutate()
            int r1 = r6.v
            r0.setAlpha(r1)
            android.graphics.drawable.Drawable r0 = r6.u
            r0.draw(r7)
        L20:
            boolean r0 = r6.r
            if (r0 == 0) goto L69
            boolean r0 = r6.s
            if (r0 == 0) goto L69
            android.view.ViewGroup r0 = r6.i
            if (r0 == 0) goto L5f
            android.graphics.drawable.Drawable r0 = r6.u
            if (r0 == 0) goto L5f
            int r0 = r6.v
            if (r0 <= 0) goto L5f
            boolean r0 = r6.q()
            if (r0 == 0) goto L5f
            wpx r0 = r6.a
            float r1 = r0.a
            float r2 = r0.c
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L5f
            int r1 = r7.save()
            android.graphics.drawable.Drawable r2 = r6.u
            android.graphics.Rect r2 = r2.getBounds()
            android.graphics.Region$Op r3 = android.graphics.Region.Op.DIFFERENCE
            r7.clipRect(r2, r3)
            r0.h(r7)
            wpx r0 = r6.b
            r0.h(r7)
            r7.restoreToCount(r1)
            goto L69
        L5f:
            wpx r0 = r6.a
            r0.h(r7)
            wpx r0 = r6.b
            r0.h(r7)
        L69:
            android.graphics.drawable.Drawable r0 = r6.d
            if (r0 == 0) goto L9d
            int r0 = r6.v
            if (r0 <= 0) goto L9d
            ecy r0 = r6.f
            r1 = 0
            if (r0 == 0) goto L7b
            int r0 = r0.d()
            goto L7c
        L7b:
            r0 = r1
        L7c:
            if (r0 <= 0) goto L9d
            android.graphics.drawable.Drawable r2 = r6.d
            int r3 = r6.e
            int r3 = -r3
            int r4 = r6.getWidth()
            int r5 = r6.e
            int r0 = r0 - r5
            r2.setBounds(r1, r3, r4, r0)
            android.graphics.drawable.Drawable r0 = r6.d
            android.graphics.drawable.Drawable r0 = r0.mutate()
            int r1 = r6.v
            r0.setAlpha(r1)
            android.graphics.drawable.Drawable r6 = r6.d
            r6.draw(r7)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.draw(android.graphics.Canvas):void");
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2;
        Drawable drawable = this.u;
        if (drawable == null || this.v <= 0 || ((view2 = this.j) == null || view2 == this ? view != this.i : view != view2)) {
            z = false;
        } else {
            n(drawable, view, getWidth(), getHeight());
            this.u.mutate().setAlpha(this.v);
            this.u.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.d;
        boolean zH = false;
        if (drawable != null && drawable.isStateful()) {
            zH = drawable.setState(drawableState);
        }
        Drawable drawable2 = this.u;
        if (drawable2 != null && drawable2.isStateful()) {
            zH |= drawable2.setState(drawableState);
        }
        wpx wpxVar = this.a;
        if (wpxVar != null) {
            zH |= wpxVar.H(drawableState);
        }
        if (zH) {
            invalidate();
        }
    }

    public final void e(int i) {
        ViewGroup viewGroup;
        if (i != this.v) {
            if (this.u != null && (viewGroup = this.i) != null) {
                viewGroup.postInvalidateOnAnimation();
            }
            this.v = i;
            postInvalidateOnAnimation();
        }
    }

    public final void f(CharSequence charSequence) {
        this.b.C(charSequence);
    }

    public final void g(CharSequence charSequence) {
        wpx wpxVar = this.a;
        wpxVar.C(charSequence);
        setContentDescription(this.r ? wpxVar.k : null);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new wkx();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new wkx(getContext(), attributeSet);
    }

    final void h() {
        if (this.u == null && this.d == null) {
            return;
        }
        int height = getHeight() + this.e;
        int iB = b();
        boolean z = height < iB;
        boolean z2 = isLaidOut() && !isInEditMode();
        if (this.w != z) {
            int i = height < iB ? 255 : 0;
            if (z2) {
                k();
                ValueAnimator valueAnimator = this.x;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.x = valueAnimator2;
                    valueAnimator2.setInterpolator(i > this.v ? this.z : this.A);
                    this.x.addUpdateListener(new wvk(this, 1));
                } else if (valueAnimator.isRunning()) {
                    this.x.cancel();
                }
                this.x.setDuration(this.y);
                this.x.setIntValues(this.v, i);
                this.x.start();
            } else {
                e(i);
            }
            this.w = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            j(appBarLayout);
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            ykd ykdVar = this.K;
            if (ykdVar == null) {
                ykdVar = new ykd(this, null);
                this.K = ykdVar;
            }
            if (appBarLayout.d == null) {
                appBarLayout.d = new ArrayList();
            }
            if (ykdVar != null && !appBarLayout.d.contains(ykdVar)) {
                appBarLayout.d.add(ykdVar);
            }
            requestApplyInsets();
        }
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        wpx wpxVar = this.a;
        wpxVar.k(configuration);
        if (this.C != configuration.orientation && this.I && wpxVar.a == 1.0f) {
            l();
        }
        this.C = configuration.orientation;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        List list;
        ViewParent parent = getParent();
        ykd ykdVar = this.K;
        if (ykdVar != null && (parent instanceof AppBarLayout) && (list = ((AppBarLayout) parent).d) != null) {
            list.remove(ykdVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ecy ecyVar = this.f;
        if (ecyVar != null) {
            int iD = ecyVar.d();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < iD) {
                    int[] iArr = ebm.a;
                    childAt.offsetTopAndBottom(iD);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            c(getChildAt(i6)).b();
        }
        o(i, i2, i3, i4, false);
        p();
        h();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            c(getChildAt(i7)).a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r11, int r12) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.u;
        if (drawable != null) {
            m(drawable, i, i2);
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        Drawable drawable = this.d;
        boolean z = i == 0;
        if (drawable != null && drawable.isVisible() != z) {
            this.d.setVisible(z, false);
        }
        Drawable drawable2 = this.u;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.u.setVisible(z, false);
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.u || drawable == this.d;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final /* synthetic */ FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new wkx();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new wkx(layoutParams);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.collapsingToolbarLayoutStyle);
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }
}
