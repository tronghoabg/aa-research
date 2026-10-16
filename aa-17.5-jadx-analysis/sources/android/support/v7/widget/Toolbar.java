package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.customview.view.AbsSavedState;
import com.google.android.projection.gearhead.R;
import defpackage.ead;
import defpackage.ebm;
import defpackage.ed;
import defpackage.fs;
import defpackage.gr;
import defpackage.he;
import defpackage.hg;
import defpackage.hi;
import defpackage.hr;
import defpackage.io;
import defpackage.is;
import defpackage.izj;
import defpackage.je;
import defpackage.jf;
import defpackage.ka;
import defpackage.lah;
import defpackage.lh;
import defpackage.mh;
import defpackage.ms;
import defpackage.ne;
import defpackage.nf;
import defpackage.nfh;
import defpackage.ng;
import defpackage.nh;
import defpackage.nk;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements ead {
    public boolean A;
    public final nfh B;
    public izj C;
    private ImageButton D;
    private int E;
    private int F;
    private int G;
    private int H;
    private ColorStateList I;
    private ColorStateList J;
    private boolean K;
    private boolean L;
    private final ArrayList M;
    private final int[] N;
    private nk O;
    private OnBackInvokedCallback P;
    private OnBackInvokedDispatcher Q;
    private final Runnable R;
    private final izj S;
    public ActionMenuView a;
    public TextView b;
    public TextView c;
    public ImageView d;
    public Drawable e;
    public CharSequence f;
    public ImageButton g;
    public View h;
    public Context i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public ms r;
    public CharSequence s;
    public CharSequence t;
    public final ArrayList u;
    public ArrayList v;
    public io w;
    public ng x;
    public hr y;
    public he z;

    public Toolbar(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        this.H = 8388627;
        this.M = new ArrayList();
        this.u = new ArrayList();
        this.N = new int[2];
        this.B = new nfh(new ne(this, 1, null));
        this.v = new ArrayList();
        this.S = new izj(this);
        this.R = new ne(this, 0);
        Context context2 = getContext();
        int[] iArr = fs.y;
        lah lahVar = new lah(context2, context2.obtainStyledAttributes(attributeSet, iArr, i, 0));
        ebm.n(this, context, iArr, attributeSet, (TypedArray) lahVar.a, i, 0);
        this.k = lahVar.q(28, 0);
        this.l = lahVar.q(19, 0);
        this.H = lahVar.o(0, this.H);
        this.m = lahVar.o(2, 48);
        int iL = lahVar.l(22, 0);
        iL = lahVar.y(27) ? lahVar.l(27, iL) : iL;
        this.q = iL;
        this.p = iL;
        this.o = iL;
        this.n = iL;
        int iL2 = lahVar.l(25, -1);
        if (iL2 >= 0) {
            this.n = iL2;
        }
        int iL3 = lahVar.l(24, -1);
        if (iL3 >= 0) {
            this.o = iL3;
        }
        int iL4 = lahVar.l(26, -1);
        if (iL4 >= 0) {
            this.p = iL4;
        }
        int iL5 = lahVar.l(23, -1);
        if (iL5 >= 0) {
            this.q = iL5;
        }
        this.E = lahVar.m(13, -1);
        int iL6 = lahVar.l(9, Integer.MIN_VALUE);
        int iL7 = lahVar.l(5, Integer.MIN_VALUE);
        int iM = lahVar.m(7, 0);
        int iM2 = lahVar.m(8, 0);
        k();
        ms msVar = this.r;
        msVar.h = false;
        if (iM != Integer.MIN_VALUE) {
            msVar.e = iM;
            msVar.a = iM;
        }
        if (iM2 != Integer.MIN_VALUE) {
            msVar.f = iM2;
            msVar.b = iM2;
        }
        if (iL6 != Integer.MIN_VALUE || iL7 != Integer.MIN_VALUE) {
            msVar.a(iL6, iL7);
        }
        this.F = lahVar.l(10, Integer.MIN_VALUE);
        this.G = lahVar.l(6, Integer.MIN_VALUE);
        this.e = lahVar.s(4);
        this.f = lahVar.u(3);
        CharSequence charSequenceU = lahVar.u(21);
        if (!TextUtils.isEmpty(charSequenceU)) {
            v(charSequenceU);
        }
        CharSequence charSequenceU2 = lahVar.u(18);
        if (!TextUtils.isEmpty(charSequenceU2)) {
            u(charSequenceU2);
        }
        this.i = getContext();
        r(lahVar.q(17, 0));
        Drawable drawableS = lahVar.s(16);
        if (drawableS != null) {
            p(drawableS);
        }
        CharSequence charSequenceU3 = lahVar.u(15);
        if (!TextUtils.isEmpty(charSequenceU3)) {
            o(charSequenceU3);
        }
        Drawable drawableS2 = lahVar.s(11);
        if (drawableS2 != null) {
            n(drawableS2);
        }
        CharSequence charSequenceU4 = lahVar.u(12);
        if (!TextUtils.isEmpty(charSequenceU4)) {
            if (!TextUtils.isEmpty(charSequenceU4)) {
                J();
            }
            ImageView imageView = this.d;
            if (imageView != null) {
                imageView.setContentDescription(charSequenceU4);
            }
        }
        if (lahVar.y(29)) {
            ColorStateList colorStateListR = lahVar.r(29);
            this.I = colorStateListR;
            TextView textView = this.b;
            if (textView != null) {
                textView.setTextColor(colorStateListR);
            }
        }
        if (lahVar.y(20)) {
            ColorStateList colorStateListR2 = lahVar.r(20);
            this.J = colorStateListR2;
            TextView textView2 = this.c;
            if (textView2 != null) {
                textView2.setTextColor(colorStateListR2);
            }
        }
        if (lahVar.y(14)) {
            m(lahVar.q(14, 0));
        }
        lahVar.w();
    }

    protected static final nh B(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof nh ? new nh((nh) layoutParams) : layoutParams instanceof ed ? new nh((ed) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new nh((ViewGroup.MarginLayoutParams) layoutParams) : new nh(layoutParams);
    }

    private final int C(int i) {
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, layoutDirection) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : layoutDirection == 1 ? 5 : 3;
    }

    private final int D(View view, int i) {
        nh nhVar = (nh) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = nhVar.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.H & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - nhVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (iMax < nhVar.topMargin) {
            iMax = nhVar.topMargin;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            if (i4 < nhVar.bottomMargin) {
                iMax = Math.max(0, iMax - (nhVar.bottomMargin - i4));
            }
        }
        return paddingTop + iMax;
    }

    private final int E(View view, int i, int[] iArr, int i2) {
        nh nhVar = (nh) view.getLayoutParams();
        int i3 = nhVar.leftMargin - iArr[0];
        int iMax = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int iD = D(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iD, iMax + measuredWidth, view.getMeasuredHeight() + iD);
        return iMax + measuredWidth + nhVar.rightMargin;
    }

    private final int F(View view, int i, int[] iArr, int i2) {
        nh nhVar = (nh) view.getLayoutParams();
        int i3 = nhVar.rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iD = D(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iD, iMax, view.getMeasuredHeight() + iD);
        return iMax - (measuredWidth + nhVar.leftMargin);
    }

    private final int G(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + iMax + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private final void H(List list, int i) {
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        list.clear();
        if (layoutDirection != 1) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                nh nhVar = (nh) childAt.getLayoutParams();
                if (nhVar.b == 0 && M(childAt) && C(nhVar.a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            View childAt2 = getChildAt(childCount);
            nh nhVar2 = (nh) childAt2.getLayoutParams();
            if (nhVar2.b == 0 && M(childAt2) && C(nhVar2.a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    private final void I(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        nh nhVar = layoutParams == null ? new nh() : !checkLayoutParams(layoutParams) ? B(layoutParams) : (nh) layoutParams;
        nhVar.b = 1;
        if (!z || this.h == null) {
            addView(view, nhVar);
        } else {
            view.setLayoutParams(nhVar);
            this.u.add(view);
        }
    }

    private final void J() {
        if (this.d == null) {
            this.d = new jf(getContext());
        }
    }

    private final void K() {
        if (this.D == null) {
            this.D = new je(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            nh nhVar = new nh();
            nhVar.a = (this.m & 112) | 8388611;
            this.D.setLayoutParams(nhVar);
        }
    }

    private final boolean L(View view) {
        return view.getParent() == this || this.u.contains(view);
    }

    private final boolean M(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private final void N(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final nk A() {
        nk nkVar = this.O;
        if (nkVar != null) {
            return nkVar;
        }
        nk nkVar2 = new nk(this, true);
        this.O = nkVar2;
        return nkVar2;
    }

    public final int b() {
        ms msVar = this.r;
        if (msVar != null) {
            return msVar.g ? msVar.b : msVar.a;
        }
        return 0;
    }

    public final int c() {
        hg hgVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (hgVar = actionMenuView.a) == null || !hgVar.hasVisibleItems()) ? gH() : Math.max(gH(), Math.max(this.G, 0));
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof nh);
    }

    public final int d() {
        return e() != null ? Math.max(b(), Math.max(this.F, 0)) : b();
    }

    public final Drawable e() {
        ImageButton imageButton = this.D;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public final Menu f() {
        l();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.a == null) {
            Menu menuG = actionMenuView.g();
            if (this.x == null) {
                this.x = new ng(this);
            }
            this.a.c.o();
            ((hg) menuG).h(this.x, this.i);
            w();
        }
        return this.a.g();
    }

    public final MenuInflater g() {
        return new gr(getContext());
    }

    public final int gH() {
        ms msVar = this.r;
        if (msVar != null) {
            return msVar.g ? msVar.a : msVar.b;
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new nh();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new nh(getContext(), attributeSet);
    }

    public final CharSequence h() {
        ImageButton imageButton = this.D;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        Menu menuF = f();
        for (int i = 0; i < menuF.size(); i++) {
            arrayList.add(menuF.getItem(i));
        }
        return arrayList;
    }

    public final void j() {
        ng ngVar = this.x;
        hi hiVar = ngVar == null ? null : ngVar.b;
        if (hiVar != null) {
            hiVar.collapseActionView();
        }
    }

    public final void k() {
        if (this.r == null) {
            this.r = new ms();
        }
    }

    public final void l() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.a = actionMenuView;
            actionMenuView.j(this.j);
            ActionMenuView actionMenuView2 = this.a;
            actionMenuView2.e = this.S;
            actionMenuView2.i(this.y, new is(this, 2));
            nh nhVar = new nh();
            nhVar.a = (this.m & 112) | 8388613;
            this.a.setLayoutParams(nhVar);
            I(this.a, false);
        }
    }

    public void m(int i) {
        g().inflate(i, f());
    }

    public final void n(Drawable drawable) {
        if (drawable != null) {
            J();
            if (!L(this.d)) {
                I(this.d, true);
            }
        } else {
            ImageView imageView = this.d;
            if (imageView != null && L(imageView)) {
                removeView(this.d);
                this.u.remove(this.d);
            }
        }
        ImageView imageView2 = this.d;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public final void o(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            K();
        }
        ImageButton imageButton = this.D;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            this.D.setTooltipText(charSequence);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        w();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.R);
        w();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onHoverEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            r1 = 0
            r2 = 9
            if (r0 != r2) goto Lc
            r5.L = r1
            r0 = r2
        Lc:
            boolean r3 = r5.L
            r4 = 1
            if (r3 != 0) goto L1c
            boolean r6 = super.onHoverEvent(r6)
            if (r0 != r2) goto L1c
            if (r6 != 0) goto L1d
            r5.L = r4
            goto L1d
        L1c:
            r2 = r0
        L1d:
            r6 = 10
            if (r2 == r6) goto L24
            r6 = 3
            if (r2 != r6) goto L26
        L24:
            r5.L = r1
        L26:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.onHoverEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b4 A[LOOP:0: B:118:0x02b2->B:119:0x02b4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02cc A[LOOP:1: B:121:0x02ca->B:122:0x02cc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ed A[LOOP:2: B:124:0x02eb->B:125:0x02ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x033b A[LOOP:3: B:133:0x0339->B:134:0x033b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c3  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int marginStart;
        int iMax;
        int iCombineMeasuredStates;
        int marginStart2;
        int[] iArr;
        int i3;
        int iCombineMeasuredStates2;
        int i4;
        int layoutDirection = getLayoutDirection();
        int iMax2 = 0;
        if (M(this.D)) {
            N(this.D, i, 0, i2, this.E);
            int measuredWidth = this.D.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.D.getLayoutParams();
            marginStart = measuredWidth + marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
            int measuredHeight = this.D.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.D.getLayoutParams();
            iMax = Math.max(0, measuredHeight + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin);
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.D.getMeasuredState());
        } else {
            marginStart = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (M(this.g)) {
            N(this.g, i, 0, i2, this.E);
            int measuredWidth2 = this.g.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.g.getLayoutParams();
            marginStart = measuredWidth2 + marginLayoutParams3.getMarginStart() + marginLayoutParams3.getMarginEnd();
            int measuredHeight2 = this.g.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.g.getLayoutParams();
            iMax = Math.max(iMax, measuredHeight2 + marginLayoutParams4.topMargin + marginLayoutParams4.bottomMargin);
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.g.getMeasuredState());
        }
        int[] iArr2 = this.N;
        char c = layoutDirection == 1 ? (char) 1 : (char) 0;
        int iD = d();
        int iMax3 = Math.max(iD, marginStart);
        iArr2[c] = Math.max(0, iD - marginStart);
        if (M(this.a)) {
            N(this.a, i, iMax3, i2, this.E);
            int measuredWidth3 = this.a.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) this.a.getLayoutParams();
            marginStart2 = measuredWidth3 + marginLayoutParams5.getMarginStart() + marginLayoutParams5.getMarginEnd();
            int measuredHeight3 = this.a.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) this.a.getLayoutParams();
            iMax = Math.max(iMax, measuredHeight3 + marginLayoutParams6.topMargin + marginLayoutParams6.bottomMargin);
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.a.getMeasuredState());
        } else {
            marginStart2 = 0;
        }
        int iC = c();
        int iMax4 = iMax3 + Math.max(iC, marginStart2);
        iArr2[c ^ 1] = Math.max(0, iC - marginStart2);
        if (M(this.h)) {
            iArr = iArr2;
            iMax4 += G(this.h, i, iMax4, i2, 0, iArr);
            int measuredHeight4 = this.h.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) this.h.getLayoutParams();
            iMax = Math.max(iMax, measuredHeight4 + marginLayoutParams7.topMargin + marginLayoutParams7.bottomMargin);
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.h.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (M(this.d)) {
            iMax4 += G(this.d, i, iMax4, i2, 0, iArr);
            int measuredHeight5 = this.d.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams8 = (ViewGroup.MarginLayoutParams) this.d.getLayoutParams();
            iMax = Math.max(iMax, measuredHeight5 + marginLayoutParams8.topMargin + marginLayoutParams8.bottomMargin);
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.d.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (((nh) childAt.getLayoutParams()).b == 0 && M(childAt)) {
                iMax4 += G(childAt, i, iMax4, i2, 0, iArr);
                int measuredHeight6 = childAt.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams9 = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int iMax5 = Math.max(iMax, measuredHeight6 + marginLayoutParams9.topMargin + marginLayoutParams9.bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i6 = iMax4;
        int i7 = this.p + this.q;
        int i8 = this.n + this.o;
        if (M(this.b)) {
            G(this.b, i, i6 + i8, i2, i7, iArr);
            i3 = i7;
            int measuredWidth4 = this.b.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams10 = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
            iMax2 = measuredWidth4 + marginLayoutParams10.getMarginStart() + marginLayoutParams10.getMarginEnd();
            int measuredHeight7 = this.b.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams11 = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
            int i9 = measuredHeight7 + marginLayoutParams11.topMargin + marginLayoutParams11.bottomMargin;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.b.getMeasuredState());
            i4 = i9;
        } else {
            i3 = i7;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            i4 = 0;
        }
        if (M(this.c)) {
            iMax2 = Math.max(iMax2, G(this.c, i, i6 + i8, i2, i4 + i3, iArr));
            int measuredHeight8 = this.c.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams12 = (ViewGroup.MarginLayoutParams) this.c.getLayoutParams();
            i4 += measuredHeight8 + marginLayoutParams12.topMargin + marginLayoutParams12.bottomMargin;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.c.getMeasuredState());
        }
        if (M(this.b) || M(this.c)) {
            i4 += i3;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i6 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(Math.max(iMax, i4) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        ActionMenuView actionMenuView = this.a;
        hg hgVar = actionMenuView != null ? actionMenuView.a : null;
        int i = savedState.a;
        if (i != 0 && this.x != null && hgVar != null && (menuItemFindItem = hgVar.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.b) {
            Runnable runnable = this.R;
            removeCallbacks(runnable);
            post(runnable);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        k();
        ms msVar = this.r;
        boolean z = msVar.g;
        boolean z2 = i == 1;
        if (z2 == z) {
            return;
        }
        msVar.g = z2;
        if (!msVar.h) {
            msVar.a = msVar.e;
            msVar.b = msVar.f;
            return;
        }
        if (z2) {
            int i2 = msVar.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = msVar.e;
            }
            msVar.a = i2;
            int i3 = msVar.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = msVar.f;
            }
            msVar.b = i3;
            return;
        }
        int i4 = msVar.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = msVar.e;
        }
        msVar.a = i4;
        int i5 = msVar.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = msVar.f;
        }
        msVar.b = i5;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        hi hiVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        ng ngVar = this.x;
        if (ngVar != null && (hiVar = ngVar.b) != null) {
            savedState.a = hiVar.a;
        }
        savedState.b = y();
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.K = false;
            actionMasked = 0;
        }
        if (!this.K) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!zOnTouchEvent) {
                    this.K = true;
                }
                actionMasked = 0;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.K = false;
        }
        return true;
    }

    public void p(Drawable drawable) {
        if (drawable != null) {
            K();
            if (!L(this.D)) {
                I(this.D, true);
            }
        } else {
            ImageButton imageButton = this.D;
            if (imageButton != null && L(imageButton)) {
                removeView(this.D);
                this.u.remove(this.D);
            }
        }
        ImageButton imageButton2 = this.D;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void q(View.OnClickListener onClickListener) {
        K();
        this.D.setOnClickListener(onClickListener);
    }

    public final void r(int i) {
        if (this.j != i) {
            this.j = i;
            if (i == 0) {
                this.i = getContext();
            } else {
                this.i = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    @Override // defpackage.ead
    public final void s(izj izjVar) {
        this.B.C(izjVar);
    }

    @Override // defpackage.ead
    public final void t(izj izjVar) {
        this.B.D(izjVar);
    }

    public void u(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.c;
        if (!zIsEmpty) {
            if (textView == null) {
                Context context = getContext();
                ka kaVar = new ka(context);
                this.c = kaVar;
                kaVar.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.l;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.J;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!L(this.c)) {
                I(this.c, true);
            }
        } else if (textView != null && L(textView)) {
            removeView(this.c);
            this.u.remove(this.c);
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.t = charSequence;
    }

    public void v(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.b;
        if (!zIsEmpty) {
            if (textView == null) {
                Context context = getContext();
                ka kaVar = new ka(context);
                this.b = kaVar;
                kaVar.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.k;
                if (i != 0) {
                    this.b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.I;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!L(this.b)) {
                I(this.b, true);
            }
        } else if (textView != null && L(textView)) {
            removeView(this.b);
            this.u.remove(this.b);
        }
        TextView textView2 = this.b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.s = charSequence;
    }

    public final void w() {
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = findOnBackInvokedDispatcher();
            byte[] bArr = null;
            if (!x() || onBackInvokedDispatcherFindOnBackInvokedDispatcher == null || !isAttachedToWindow() || !this.A) {
                OnBackInvokedDispatcher onBackInvokedDispatcher = this.Q;
                if (onBackInvokedDispatcher != null) {
                    onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.P);
                    this.Q = null;
                    return;
                }
                return;
            }
            if (this.Q == null) {
                if (this.P == null) {
                    this.P = new nf(new lh(this, 4, bArr), 0);
                }
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, this.P);
                this.Q = onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            }
        }
    }

    public final boolean x() {
        ng ngVar = this.x;
        return (ngVar == null || ngVar.b == null) ? false : true;
    }

    public final boolean y() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.m();
    }

    public final boolean z() {
        io ioVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (ioVar = actionMenuView.c) == null || !ioVar.m()) ? false : true;
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return B(layoutParams);
    }

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new mh(2);
        int a;
        boolean b;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readInt();
            this.b = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context) {
        this(context, null);
    }
}
