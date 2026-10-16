package com.google.android.material.internal;

import O7.e;
import W7.d;
import a1.l;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ff.AbstractC2641B;
import java.util.WeakHashMap;
import k1.S;
import p.m;
import p.y;
import q.C3846x0;

/* loaded from: classes4.dex */
public class NavigationMenuItemView extends d implements y {

    /* renamed from: F, reason: collision with root package name */
    public static final int[] f26976F = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public m f26977A;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f26978B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f26979C;

    /* renamed from: D, reason: collision with root package name */
    public Drawable f26980D;

    /* renamed from: E, reason: collision with root package name */
    public final e f26981E;

    /* renamed from: v, reason: collision with root package name */
    public int f26982v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f26983w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f26984x;

    /* renamed from: y, reason: collision with root package name */
    public final CheckedTextView f26985y;

    /* renamed from: z, reason: collision with root package name */
    public FrameLayout f26986z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e eVar = new e(this, 2);
        this.f26981E = eVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.wynauto.wyn.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.wynauto.wyn.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.wynauto.wyn.R.id.design_menu_item_text);
        this.f26985y = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        S.m(checkedTextView, eVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f26986z == null) {
                this.f26986z = (FrameLayout) ((ViewStub) findViewById(com.wynauto.wyn.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f26986z.removeAllViews();
            this.f26986z.addView(view);
        }
    }

    @Override // p.y
    public final void c(m mVar) throws Resources.NotFoundException {
        StateListDrawable stateListDrawable;
        this.f26977A = mVar;
        int i5 = mVar.f43068a;
        if (i5 > 0) {
            setId(i5);
        }
        setVisibility(mVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.wynauto.wyn.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f26976F, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = S.f38779a;
            setBackground(stateListDrawable);
        }
        setCheckable(mVar.isCheckable());
        setChecked(mVar.isChecked());
        setEnabled(mVar.isEnabled());
        setTitle(mVar.f43072e);
        setIcon(mVar.getIcon());
        setActionView(mVar.getActionView());
        setContentDescription(mVar.f43083q);
        AbstractC2641B.J(this, mVar.f43084r);
        m mVar2 = this.f26977A;
        CharSequence charSequence = mVar2.f43072e;
        CheckedTextView checkedTextView = this.f26985y;
        if (charSequence == null && mVar2.getIcon() == null && this.f26977A.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f26986z;
            if (frameLayout != null) {
                C3846x0 c3846x0 = (C3846x0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c3846x0).width = -1;
                this.f26986z.setLayoutParams(c3846x0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f26986z;
        if (frameLayout2 != null) {
            C3846x0 c3846x02 = (C3846x0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c3846x02).width = -2;
            this.f26986z.setLayoutParams(c3846x02);
        }
    }

    @Override // p.y
    public m getItemData() {
        return this.f26977A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i5) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i5 + 1);
        m mVar = this.f26977A;
        if (mVar != null && mVar.isCheckable() && this.f26977A.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f26976F);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f26984x != z2) {
            this.f26984x = z2;
            this.f26981E.h(this.f26985y, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f26985y;
        checkedTextView.setChecked(z2);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), z2 ? 1 : 0);
    }

    public void setHorizontalPadding(int i5) {
        setPadding(i5, getPaddingTop(), i5, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) throws Resources.NotFoundException {
        if (drawable != null) {
            if (this.f26979C) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f26978B);
            }
            int i5 = this.f26982v;
            drawable.setBounds(0, 0, i5, i5);
        } else if (this.f26983w) {
            if (this.f26980D == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = l.f17132a;
                Drawable drawable2 = resources.getDrawable(com.wynauto.wyn.R.drawable.navigation_empty_icon, theme);
                this.f26980D = drawable2;
                if (drawable2 != null) {
                    int i10 = this.f26982v;
                    drawable2.setBounds(0, 0, i10, i10);
                }
            }
            drawable = this.f26980D;
        }
        this.f26985y.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i5) {
        this.f26985y.setCompoundDrawablePadding(i5);
    }

    public void setIconSize(int i5) {
        this.f26982v = i5;
    }

    public void setIconTintList(ColorStateList colorStateList) throws Resources.NotFoundException {
        this.f26978B = colorStateList;
        this.f26979C = colorStateList != null;
        m mVar = this.f26977A;
        if (mVar != null) {
            setIcon(mVar.getIcon());
        }
    }

    public void setMaxLines(int i5) {
        this.f26985y.setMaxLines(i5);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f26983w = z2;
    }

    public void setTextAppearance(int i5) {
        this.f26985y.setTextAppearance(i5);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f26985y.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f26985y.setText(charSequence);
    }
}
