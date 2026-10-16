package com.google.android.material.internal;

import android.R;
import android.content.Context;
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
import defpackage.dzp;
import defpackage.ebm;
import defpackage.hi;
import defpackage.ht;
import defpackage.lc;
import defpackage.wqd;
import defpackage.wqh;

/* loaded from: classes3.dex */
public class NavigationMenuItemView extends wqd implements ht {
    private static final int[] e = {R.attr.state_checked};
    public boolean c;
    boolean d;
    private int i;
    private final CheckedTextView j;
    private FrameLayout k;
    private hi l;
    private final dzp m;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = true;
        wqh wqhVar = new wqh(this);
        this.m = wqhVar;
        r(0);
        LayoutInflater.from(context).inflate(com.google.android.projection.gearhead.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        this.i = context.getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.design_navigation_icon_size);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.google.android.projection.gearhead.R.id.design_menu_item_text);
        this.j = checkedTextView;
        ebm.o(checkedTextView, wqhVar);
    }

    @Override // defpackage.ht
    public final hi a() {
        return this.l;
    }

    @Override // defpackage.ht
    public final boolean e() {
        return false;
    }

    @Override // defpackage.ht
    public final void f(hi hiVar) {
        StateListDrawable stateListDrawable;
        this.l = hiVar;
        int i = hiVar.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(true != hiVar.isVisible() ? 8 : 0);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.google.android.projection.gearhead.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(e, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        boolean zIsCheckable = hiVar.isCheckable();
        refreshDrawableState();
        if (this.c != zIsCheckable) {
            this.c = zIsCheckable;
            this.m.e(this.j, 2048);
        }
        boolean zIsChecked = hiVar.isChecked();
        refreshDrawableState();
        CheckedTextView checkedTextView = this.j;
        checkedTextView.setChecked(zIsChecked);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (zIsChecked && this.d) ? 1 : 0);
        setEnabled(hiVar.isEnabled());
        checkedTextView.setText(hiVar.d);
        Drawable icon = hiVar.getIcon();
        if (icon != null) {
            int i2 = this.i;
            icon.setBounds(0, 0, i2, i2);
        }
        checkedTextView.setCompoundDrawablesRelative(icon, null, null, null);
        View actionView = hiVar.getActionView();
        if (actionView != null) {
            if (this.k == null) {
                this.k = (FrameLayout) ((ViewStub) findViewById(com.google.android.projection.gearhead.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (actionView.getParent() != null) {
                ((ViewGroup) actionView.getParent()).removeView(actionView);
            }
            this.k.removeAllViews();
            this.k.addView(actionView);
        }
        setContentDescription(hiVar.l);
        setTooltipText(hiVar.m);
        hi hiVar2 = this.l;
        if (hiVar2.d == null && hiVar2.getIcon() == null && this.l.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.k;
            if (frameLayout != null) {
                lc lcVar = (lc) frameLayout.getLayoutParams();
                lcVar.width = -1;
                this.k.setLayoutParams(lcVar);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.k;
        if (frameLayout2 != null) {
            lc lcVar2 = (lc) frameLayout2.getLayoutParams();
            lcVar2.width = -2;
            this.k.setLayoutParams(lcVar2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        hi hiVar = this.l;
        if (hiVar != null && hiVar.isCheckable() && hiVar.isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, e);
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
