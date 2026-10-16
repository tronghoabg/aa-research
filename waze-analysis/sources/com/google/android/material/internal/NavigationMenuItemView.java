package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.view.menu.ae;
import android.support.v7.widget.da;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class NavigationMenuItemView extends h implements ae {

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f6570e = {R.attr.state_checked};

    /* renamed from: c, reason: collision with root package name */
    boolean f6571c;

    /* renamed from: d, reason: collision with root package name */
    boolean f6572d;

    /* renamed from: f, reason: collision with root package name */
    private int f6573f;

    /* renamed from: g, reason: collision with root package name */
    private final CheckedTextView f6574g;

    /* renamed from: h, reason: collision with root package name */
    private FrameLayout f6575h;

    /* renamed from: i, reason: collision with root package name */
    private android.support.v7.view.menu.t f6576i;

    /* renamed from: j, reason: collision with root package name */
    private final AccessibilityDelegateCompat f6577j;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f6572d = true;
        i iVar = new i(this);
        this.f6577j = iVar;
        A(0);
        LayoutInflater.from(context).inflate(com.waze.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        this.f6573f = context.getResources().getDimensionPixelSize(com.waze.R.dimen.design_navigation_icon_size);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.waze.R.id.design_menu_item_text);
        this.f6574g = checkedTextView;
        ViewCompat.setAccessibilityDelegate(checkedTextView, iVar);
    }

    @Override // android.support.v7.view.menu.ae
    public final android.support.v7.view.menu.t a() {
        return this.f6576i;
    }

    @Override // android.support.v7.view.menu.ae
    public final boolean g() {
        return false;
    }

    @Override // android.support.v7.view.menu.ae
    public final void h(android.support.v7.view.menu.t tVar) {
        StateListDrawable stateListDrawable;
        this.f6576i = tVar;
        if (tVar.getItemId() > 0) {
            setId(tVar.getItemId());
        }
        setVisibility(true != tVar.isVisible() ? 8 : 0);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.waze.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f6570e, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        boolean zIsCheckable = tVar.isCheckable();
        refreshDrawableState();
        if (this.f6571c != zIsCheckable) {
            this.f6571c = zIsCheckable;
            this.f6577j.sendAccessibilityEvent(this.f6574g, 2048);
        }
        boolean zIsChecked = tVar.isChecked();
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f6574g;
        checkedTextView.setChecked(zIsChecked);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (zIsChecked && this.f6572d) ? 1 : 0);
        setEnabled(tVar.isEnabled());
        checkedTextView.setText(tVar.getTitle());
        Drawable icon = tVar.getIcon();
        if (icon != null) {
            int i2 = this.f6573f;
            icon.setBounds(0, 0, i2, i2);
        }
        checkedTextView.setCompoundDrawablesRelative(icon, null, null, null);
        View actionView = tVar.getActionView();
        if (actionView != null) {
            if (this.f6575h == null) {
                this.f6575h = (FrameLayout) ((ViewStub) findViewById(com.waze.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (actionView.getParent() != null) {
                ((ViewGroup) actionView.getParent()).removeView(actionView);
            }
            this.f6575h.removeAllViews();
            this.f6575h.addView(actionView);
        }
        setContentDescription(tVar.getContentDescription());
        setTooltipText(tVar.getTooltipText());
        if (this.f6576i.getTitle() == null && this.f6576i.getIcon() == null && this.f6576i.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f6575h;
            if (frameLayout != null) {
                da daVar = (da) frameLayout.getLayoutParams();
                daVar.width = -1;
                this.f6575h.setLayoutParams(daVar);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f6575h;
        if (frameLayout2 != null) {
            da daVar2 = (da) frameLayout2.getLayoutParams();
            daVar2.width = -2;
            this.f6575h.setLayoutParams(daVar2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        android.support.v7.view.menu.t tVar = this.f6576i;
        if (tVar != null && tVar.isCheckable() && tVar.isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, f6570e);
        }
        return iArrOnCreateDrawableState;
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }
}
