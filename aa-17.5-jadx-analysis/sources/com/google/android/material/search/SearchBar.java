package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.projection.gearhead.R;
import defpackage.ca;
import defpackage.mh;
import defpackage.ms;
import defpackage.wkv;
import defpackage.wle;
import defpackage.wox;
import defpackage.woy;
import defpackage.wqr;
import defpackage.wqs;
import defpackage.wth;
import defpackage.wub;
import defpackage.wue;
import defpackage.wuk;
import defpackage.wxp;
import defpackage.ykd;

/* loaded from: classes3.dex */
public class SearchBar extends Toolbar {
    public final TextView D;
    public final TextView E;
    public final int F;
    public final ColorStateList G;
    public View H;
    public int I;
    public wue J;
    public int K;
    public int L;
    public final wox M;
    private final FrameLayout N;
    private boolean O;
    private final boolean P;
    private final boolean Q;
    private final Drawable R;
    private final boolean S;
    private final boolean T;
    private Integer U;
    private Drawable V;
    private boolean W;
    private boolean aa;
    private int ab;
    private final boolean ac;
    private final int ad;
    private ActionMenuView ae;
    private ImageButton af;
    private final ykd ag;

    public SearchBar(Context context, AttributeSet attributeSet, int i) {
        boolean z;
        super(wxp.a(context, attributeSet, i, R.style.Widget_Material3_SearchBar), attributeSet, i);
        this.I = -1;
        this.ag = new ykd(this, null);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "title") != null) {
                throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "subtitle") != null) {
                throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
            }
        }
        this.ad = getResources().getDimensionPixelSize(R.dimen.m3_searchbar_parent_width_breakpoint);
        Drawable drawableE = ca.e(context2, R.drawable.ic_search_black_24);
        this.R = drawableE;
        this.M = new wox(null, null);
        TypedArray typedArrayA = wqr.a(context2, attributeSet, wth.a, i, R.style.Widget_Material3_SearchBar, new int[0]);
        wuk wukVar = new wuk(wuk.l(context2, attributeSet, i, R.style.Widget_Material3_SearchBar));
        int color = typedArrayA.getColor(5, 0);
        this.F = color;
        this.G = wub.h(context2, typedArrayA, 13);
        float dimension = typedArrayA.getDimension(8, BitmapDescriptorFactory.HUE_RED);
        this.Q = typedArrayA.getBoolean(6, true);
        this.W = typedArrayA.getBoolean(7, true);
        boolean z2 = typedArrayA.getBoolean(11, false);
        this.T = typedArrayA.getBoolean(10, false);
        this.S = typedArrayA.getBoolean(19, true);
        if (typedArrayA.hasValue(14)) {
            this.U = Integer.valueOf(typedArrayA.getColor(14, -1));
        }
        int resourceId = typedArrayA.getResourceId(0, -1);
        CharSequence string = typedArrayA.getString(2);
        CharSequence string2 = typedArrayA.getString(3);
        float dimension2 = typedArrayA.getDimension(17, -1.0f);
        int color2 = typedArrayA.getColor(16, 0);
        this.aa = typedArrayA.getBoolean(18, false);
        this.O = typedArrayA.getBoolean(12, false);
        this.ab = typedArrayA.getDimensionPixelSize(1, -1);
        this.ac = typedArrayA.getBoolean(4, false);
        this.K = typedArrayA.getResourceId(15, -1);
        this.L = typedArrayA.getResourceId(9, -1);
        typedArrayA.recycle();
        if (z2) {
            z = true;
        } else {
            p(e() != null ? e() : drawableE);
            z = true;
            K(true);
        }
        setClickable(z);
        setFocusable(z);
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_bar, this);
        this.P = z;
        TextView textView = (TextView) findViewById(R.id.open_search_bar_text_view);
        this.D = textView;
        TextView textView2 = (TextView) findViewById(R.id.open_search_bar_placeholder_text_view);
        this.E = textView2;
        this.N = (FrameLayout) findViewById(R.id.open_search_bar_text_view_container);
        setElevation(dimension);
        if (resourceId != -1) {
            textView.setTextAppearance(resourceId);
            textView2.setTextAppearance(resourceId);
        }
        I(string);
        G(string2);
        boolean z3 = this.aa;
        if (textView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
            if (z3) {
                layoutParams.gravity = 1;
                textView.setGravity(1);
            } else {
                layoutParams.gravity = 0;
                textView.setGravity(0);
            }
            textView.setLayoutParams(layoutParams);
            textView2.setLayoutParams(layoutParams);
        }
        wue wueVar = new wue(wukVar);
        this.J = wueVar;
        wueVar.K(getContext());
        this.J.N(dimension);
        if (dimension2 >= BitmapDescriptorFactory.HUE_RED) {
            this.J.S(dimension2, color2);
        }
        int iM = woy.m(this, R.attr.colorControlHighlight);
        this.J.O(ColorStateList.valueOf(color));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM);
        wue wueVar2 = this.J;
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateListValueOf, wueVar2, wueVar2);
        FocusRingDrawable.c(getContext(), rippleDrawable, this.J);
        setBackground(rippleDrawable);
    }

    private final void J() {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        boolean z = getLayoutDirection() == 1;
        ImageButton imageButtonB = wqs.b(this);
        int width = (imageButtonB == null || !imageButtonB.isClickable()) ? 0 : z ? getWidth() - imageButtonB.getLeft() : imageButtonB.getRight();
        ActionMenuView actionMenuViewA = wqs.a(this);
        int right = actionMenuViewA != null ? z ? actionMenuViewA.getRight() : getWidth() - actionMenuViewA.getLeft() : 0;
        int i = true != z ? width : right;
        if (true != z) {
            width = right;
        }
        setHandwritingBoundsOffsets(-i, BitmapDescriptorFactory.HUE_RED, -width, BitmapDescriptorFactory.HUE_RED);
    }

    private final void K(boolean z) {
        ImageButton imageButtonB = wqs.b(this);
        if (imageButtonB == null) {
            return;
        }
        boolean z2 = !z;
        imageButtonB.setClickable(z2);
        imageButtonB.setFocusable(z2);
        Drawable background = imageButtonB.getBackground();
        if (background != null) {
            this.V = background;
        }
        imageButtonB.setBackgroundDrawable(z ? null : this.V);
        J();
    }

    private static final int L(int i, int i2) {
        return i == 0 ? i2 : i;
    }

    public final float C() {
        return this.J.x();
    }

    public final AppBarLayout D() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof AppBarLayout) {
                return (AppBarLayout) parent;
            }
        }
        return null;
    }

    public final CharSequence E() {
        return this.D.getHint();
    }

    public final CharSequence F() {
        return this.D.getText();
    }

    public final void G(CharSequence charSequence) {
        this.D.setHint(charSequence);
    }

    final void H(String str) {
        this.E.setText(str);
    }

    public final void I(CharSequence charSequence) {
        this.D.setText(charSequence);
        this.E.setText(charSequence);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.P && this.H == null && !(view instanceof ActionMenuView)) {
            this.H = view;
            view.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.support.v7.widget.Toolbar
    public final void m(int i) {
        super.m(i);
        this.I = i;
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() throws Resources.NotFoundException {
        AppBarLayout appBarLayoutD;
        super.onAttachedToWindow();
        wub.e(this, this.J);
        if (this.Q && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.m3_searchbar_margin_vertical);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = L(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = L(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = L(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = L(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
        if (getLayoutParams() instanceof wkv) {
            wkv wkvVar = (wkv) getLayoutParams();
            if (this.W) {
                if (wkvVar.a == 0) {
                    wkvVar.a = 53;
                }
            } else if (wkvVar.a == 53) {
                wkvVar.a = 0;
            }
        }
        if (!this.O || (appBarLayoutD = D()) == null || this.G == null) {
            return;
        }
        appBarLayoutD.h.add(this.ag);
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AppBarLayout appBarLayoutD = D();
        if (appBarLayoutD != null) {
            appBarLayoutD.h.remove(this.ag);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence charSequenceF = F();
        boolean zIsEmpty = TextUtils.isEmpty(charSequenceF);
        accessibilityNodeInfo.setHintText(E());
        accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        if (zIsEmpty) {
            charSequenceF = E();
        }
        accessibilityNodeInfo.setText(charSequenceF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.widget.ImageButton] */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.widget.ImageButton] */
    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.H;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
            int i5 = measuredWidth + measuredWidth2;
            int measuredHeight = view.getMeasuredHeight();
            int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
            int i6 = measuredHeight + measuredHeight2;
            if (getLayoutDirection() == 1) {
                view.layout(getMeasuredWidth() - i5, measuredHeight2, getMeasuredWidth() - measuredWidth2, i6);
            } else {
                view.layout(measuredWidth2, measuredHeight2, i5, i6);
            }
        }
        J();
        TextView textView = this.D;
        if (textView == null || !this.aa) {
            return;
        }
        int measuredWidth3 = getMeasuredWidth() / 2;
        FrameLayout frameLayout = this.N;
        int measuredWidth4 = measuredWidth3 - (frameLayout.getMeasuredWidth() / 2);
        int measuredWidth5 = frameLayout.getMeasuredWidth() + measuredWidth4;
        int measuredHeight3 = (getMeasuredHeight() / 2) - (frameLayout.getMeasuredHeight() / 2);
        int measuredHeight4 = frameLayout.getMeasuredHeight() + measuredHeight3;
        int layoutDirection = getLayoutDirection();
        ActionMenuView actionMenuViewA = this.ae;
        if (actionMenuViewA == null) {
            actionMenuViewA = wqs.a(this);
            this.ae = actionMenuViewA;
        }
        ?? r4 = this.af;
        ActionMenuView actionMenuView = r4;
        if (r4 == 0) {
            ?? B = wqs.b(this);
            this.af = B;
            actionMenuView = B;
        }
        int measuredWidth6 = (frameLayout.getMeasuredWidth() / 2) - (textView.getMeasuredWidth() / 2);
        int measuredWidth7 = textView.getMeasuredWidth() + measuredWidth6;
        int i7 = measuredWidth6 + measuredWidth4;
        int i8 = measuredWidth7 + measuredWidth4;
        ActionMenuView actionMenuView2 = layoutDirection == 1 ? actionMenuViewA : actionMenuView;
        if (layoutDirection == 1) {
            actionMenuViewA = actionMenuView;
        }
        int iMax = actionMenuView2 != null ? Math.max(actionMenuView2.getRight() - i7, 0) : 0;
        int i9 = i7 + iMax;
        int i10 = i8 + iMax;
        int iMax2 = actionMenuViewA != null ? Math.max(i10 - actionMenuViewA.getLeft(), 0) : 0;
        int i11 = i9 - iMax2;
        int i12 = i10 - iMax2;
        int paddingLeft = getPaddingLeft() - i11;
        ms msVar = this.r;
        int iMax3 = Math.max(paddingLeft, (msVar != null ? msVar.a : 0) - i11);
        int measuredWidth8 = i12 - (getMeasuredWidth() - getPaddingRight());
        int measuredWidth9 = getMeasuredWidth();
        ms msVar2 = this.r;
        int iMax4 = ((iMax - iMax2) + Math.max(iMax3, 0)) - Math.max(Math.max(measuredWidth8, i12 - (measuredWidth9 - (msVar2 != null ? msVar2.b : 0))), 0);
        frameLayout.layout(measuredWidth4 + iMax4, measuredHeight3, measuredWidth5 + iMax4, measuredHeight4);
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int i4 = this.ab;
        if (i4 >= 0 && size > i4) {
            i = View.MeasureSpec.makeMeasureSpec(i4, mode);
        } else if (this.ac && size > (i3 = this.ad)) {
            i = View.MeasureSpec.makeMeasureSpec(Math.max(i3, Math.round(size * 0.5f)), mode);
        }
        super.onMeasure(i, i2);
        View view = this.H;
        if (view != null) {
            view.measure(i, i2);
        }
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        I(savedState.a);
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    protected final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        CharSequence charSequenceF = F();
        savedState.a = charSequenceF == null ? null : charSequenceF.toString();
        return savedState;
    }

    @Override // android.support.v7.widget.Toolbar
    public final void p(Drawable drawable) {
        int iM;
        if (this.S && drawable != null) {
            Integer num = this.U;
            if (num != null) {
                iM = num.intValue();
            } else {
                iM = woy.m(this, drawable == this.R ? R.attr.colorOnSurfaceVariant : R.attr.colorOnSurface);
            }
            drawable = drawable.mutate();
            drawable.setTint(iM);
        }
        super.p(drawable);
    }

    @Override // android.support.v7.widget.Toolbar
    public final void q(View.OnClickListener onClickListener) {
        if (this.T) {
            return;
        }
        super.q(onClickListener);
        K(false);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        wue wueVar = this.J;
        if (wueVar != null) {
            wueVar.N(f);
        }
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
        private boolean e;

        public ScrollingViewBehavior() {
            this.e = false;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.wla
        public final boolean P() {
            return true;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.wlc, defpackage.dsg
        public final /* bridge */ /* synthetic */ boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
            super.g(coordinatorLayout, view, i);
            return true;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.dsg
        public final void n(CoordinatorLayout coordinatorLayout, View view, View view2) throws Resources.NotFoundException {
            super.n(coordinatorLayout, view, view2);
            if (this.e || !(view2 instanceof AppBarLayout)) {
                return;
            }
            this.e = true;
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            appBarLayout.setTouchscreenBlocksFocus(false);
            appBarLayout.setBackgroundColor(0);
            wle.a(appBarLayout, BitmapDescriptorFactory.HUE_RED);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.e = false;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new mh(8);
        String a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @Override // android.support.v7.widget.Toolbar
    public final void u(CharSequence charSequence) {
    }

    @Override // android.support.v7.widget.Toolbar
    public final void v(CharSequence charSequence) {
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchBarStyle);
    }

    public SearchBar(Context context) {
        this(context, null);
    }
}
