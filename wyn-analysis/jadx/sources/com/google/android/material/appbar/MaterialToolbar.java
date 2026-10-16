package com.google.android.material.appbar;

import A7.R0;
import Fe.g;
import W7.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import c8.C1583g;
import com.wynauto.wyn.R;
import h8.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import k1.J;
import k1.S;

/* loaded from: classes4.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: W, reason: collision with root package name */
    public static final ImageView.ScaleType[] f26768W = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: R, reason: collision with root package name */
    public Integer f26769R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f26770S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f26771T;

    /* renamed from: U, reason: collision with root package name */
    public ImageView.ScaleType f26772U;

    /* renamed from: V, reason: collision with root package name */
    public Boolean f26773V;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayF = k.f(context2, attributeSet, I7.a.f5415r, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayF.hasValue(2)) {
            setNavigationIconTint(typedArrayF.getColor(2, -1));
        }
        this.f26770S = typedArrayF.getBoolean(4, false);
        this.f26771T = typedArrayF.getBoolean(3, false);
        int i5 = typedArrayF.getInt(1, -1);
        if (i5 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f26768W;
            if (i5 < scaleTypeArr.length) {
                this.f26772U = scaleTypeArr[i5];
            }
        }
        if (typedArrayF.hasValue(0)) {
            this.f26773V = Boolean.valueOf(typedArrayF.getBoolean(0, false));
        }
        typedArrayF.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C1583g c1583g = new C1583g();
            c1583g.j(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            c1583g.h(context2);
            WeakHashMap weakHashMap = S.f38779a;
            c1583g.i(J.e(this));
            setBackground(c1583g);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f26772U;
    }

    public Integer getNavigationIconTint() {
        return this.f26769R;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int i5) {
        Menu menu = getMenu();
        boolean z2 = menu instanceof p.k;
        if (z2) {
            ((p.k) menu).w();
        }
        super.m(i5);
        if (z2) {
            ((p.k) menu).v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C1583g) {
            g.K(this, (C1583g) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z2, i5, i10, i11, i12);
        int i13 = 0;
        ImageView imageView2 = null;
        if (this.f26770S || this.f26771T) {
            ArrayList arrayListD = k.d(this, getTitle());
            boolean zIsEmpty = arrayListD.isEmpty();
            R0 r02 = k.f15278c;
            TextView textView = zIsEmpty ? null : (TextView) Collections.min(arrayListD, r02);
            ArrayList arrayListD2 = k.d(this, getSubtitle());
            TextView textView2 = arrayListD2.isEmpty() ? null : (TextView) Collections.max(arrayListD2, r02);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i14 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i14 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i14 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f26770S && textView != null) {
                    v(textView, pair);
                }
                if (this.f26771T && textView2 != null) {
                    v(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i13 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i13);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i13++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f26773V;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f26772U;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        Drawable background = getBackground();
        if (background instanceof C1583g) {
            ((C1583g) background).i(f10);
        }
    }

    public void setLogoAdjustViewBounds(boolean z2) {
        Boolean bool = this.f26773V;
        if (bool == null || bool.booleanValue() != z2) {
            this.f26773V = Boolean.valueOf(z2);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f26772U != scaleType) {
            this.f26772U = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f26769R != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f26769R.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i5) {
        this.f26769R = Integer.valueOf(i5);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z2) {
        if (this.f26771T != z2) {
            this.f26771T = z2;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z2) {
        if (this.f26770S != z2) {
            this.f26770S = z2;
            requestLayout();
        }
    }

    public final void v(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i5 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i10 = measuredWidth2 + i5;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i5, 0), Math.max(i10 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i5 += iMax;
            i10 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i10 - i5, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i5, textView.getTop(), i10, textView.getBottom());
    }
}
