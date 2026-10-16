package com.google.android.material.checkbox;

/* JADX INFO: loaded from: classes3.dex */
public final class MaterialCheckBox extends defpackage.iz {
    private static final int e = 2132151460;
    private static final int[] f = {com.google.android.projection.gearhead.R.attr.state_indeterminate};
    private static final int[] g = {com.google.android.projection.gearhead.R.attr.state_error};
    private static final int[][] h = {new int[]{android.R.attr.state_enabled, com.google.android.projection.gearhead.R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private static final int i = android.content.res.Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public android.content.res.ColorStateList b;
    final android.content.res.ColorStateList c;
    public int[] d;
    private final java.util.LinkedHashSet j;
    private android.content.res.ColorStateList k;
    private boolean l;
    private final boolean m;
    private final boolean n;
    private final java.lang.CharSequence o;
    private android.graphics.drawable.Drawable p;
    private android.graphics.drawable.Drawable q;
    private boolean r;
    private final android.graphics.PorterDuff.Mode s;
    private int t;
    private boolean u;
    private java.lang.CharSequence v;
    private android.widget.CompoundButton.OnCheckedChangeListener w;
    private final defpackage.fhr x;
    private final defpackage.fhn y;

    public static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.checkbox.MaterialCheckBox.SavedState> CREATOR = new defpackage.sse(6);
        int a;

        public SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.a = ((java.lang.Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }

        public final java.lang.String toString() {
            java.lang.String str;
            java.lang.String hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
            int i = this.a;
            if (i != 1) {
                str = i != 2 ? "unchecked" : "indeterminate";
            } else {
                str = "checked";
            }
            return defpackage.a.bB(str, hexString, "MaterialCheckBox.SavedState{", " CheckedState=", "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(java.lang.Integer.valueOf(this.a));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.ColorStateList colorStateListBt;
        int i2 = e;
        super(defpackage.wyk.a(context, attributeSet, com.google.android.projection.gearhead.R.attr.checkboxStyle, i2), attributeSet, com.google.android.projection.gearhead.R.attr.checkboxStyle);
        new java.util.LinkedHashSet();
        this.j = new java.util.LinkedHashSet();
        this.x = defpackage.fhr.a(getContext(), com.google.android.projection.gearhead.R.drawable.mtrl_checkbox_button_checked_unchecked);
        this.y = new defpackage.wnn(this);
        android.content.Context context2 = getContext();
        android.content.res.ColorStateList buttonTintList = this.b;
        if (buttonTintList == null) {
            buttonTintList = super.getButtonTintList() != null ? super.getButtonTintList() : null;
        }
        this.b = buttonTintList;
        defpackage.jb jbVar = this.a;
        if (jbVar != null) {
            jbVar.b = true;
            jbVar.a();
        }
        defpackage.lam lamVarC = defpackage.wro.c(context2, attributeSet, defpackage.wnp.a, com.google.android.projection.gearhead.R.attr.checkboxStyle, i2, new int[0]);
        this.q = lamVarC.s(2);
        if (this.p != null && defpackage.sqs.bq(context2, com.google.android.projection.gearhead.R.attr.isMaterial3Theme, false)) {
            int iQ = lamVarC.q(0, 0);
            int iQ2 = lamVarC.q(1, 0);
            if (iQ == i && iQ2 == 0) {
                super.setButtonDrawable((android.graphics.drawable.Drawable) null);
                this.p = defpackage.ca.e(context2, com.google.android.projection.gearhead.R.drawable.mtrl_checkbox_button);
                this.r = true;
                if (this.q == null) {
                    this.q = defpackage.ca.e(context2, com.google.android.projection.gearhead.R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.c = defpackage.sqs.bt(context2, lamVarC, 3);
        this.s = defpackage.a.Q(lamVarC.n(4, -1), android.graphics.PorterDuff.Mode.SRC_IN);
        this.l = lamVarC.x(11, false);
        this.m = lamVarC.x(6, true);
        this.n = lamVarC.x(9, false);
        this.o = lamVarC.u(8);
        if (lamVarC.y(7)) {
            a(lamVarC.n(7, 0));
        }
        if (lamVarC.y(10) && (colorStateListBt = defpackage.sqs.bt(context2, lamVarC, 10)) != null) {
            android.graphics.drawable.Drawable background = getBackground();
            background = background instanceof android.graphics.drawable.DrawableWrapper ? ((android.graphics.drawable.DrawableWrapper) background).getDrawable() : background;
            if (background instanceof android.graphics.drawable.RippleDrawable) {
                ((android.graphics.drawable.RippleDrawable) background).setColor(colorStateListBt);
            }
        }
        lamVarC.w();
        b();
    }

    private final void b() {
        android.content.res.ColorStateList colorStateList;
        android.animation.Animator.AnimatorListener animatorListener;
        this.p = defpackage.wpv.h(this.p, this.b, getButtonTintMode());
        android.graphics.drawable.Drawable drawable = this.q;
        android.content.res.ColorStateList colorStateList2 = this.c;
        this.q = defpackage.wpv.h(drawable, colorStateList2, this.s);
        if (this.r) {
            defpackage.fhr fhrVar = this.x;
            if (fhrVar != null) {
                defpackage.fhn fhnVar = this.y;
                if (fhnVar != null) {
                    android.graphics.drawable.Drawable drawable2 = fhrVar.e;
                    if (drawable2 != null) {
                        ((android.graphics.drawable.AnimatedVectorDrawable) drawable2).unregisterAnimationCallback(fhnVar.a());
                    }
                    java.util.ArrayList arrayList = fhrVar.c;
                    if (arrayList != null) {
                        arrayList.remove(fhnVar);
                        if (fhrVar.c.size() == 0 && (animatorListener = fhrVar.b) != null) {
                            fhrVar.a.c.removeListener(animatorListener);
                            fhrVar.b = null;
                        }
                    }
                }
                if (fhnVar != null) {
                    android.graphics.drawable.Drawable drawable3 = fhrVar.e;
                    if (drawable3 != null) {
                        ((android.graphics.drawable.AnimatedVectorDrawable) drawable3).registerAnimationCallback(fhnVar.a());
                    } else {
                        if (fhrVar.c == null) {
                            fhrVar.c = new java.util.ArrayList();
                        }
                        if (!fhrVar.c.contains(fhnVar)) {
                            fhrVar.c.add(fhnVar);
                            if (fhrVar.b == null) {
                                fhrVar.b = new defpackage.fho(fhrVar);
                            }
                            fhrVar.a.c.addListener(fhrVar.b);
                        }
                    }
                }
            }
            android.graphics.drawable.Drawable drawable4 = this.p;
            if ((drawable4 instanceof android.graphics.drawable.AnimatedStateListDrawable) && fhrVar != null) {
                ((android.graphics.drawable.AnimatedStateListDrawable) drawable4).addTransition(com.google.android.projection.gearhead.R.id.checked, com.google.android.projection.gearhead.R.id.unchecked, fhrVar, false);
                ((android.graphics.drawable.AnimatedStateListDrawable) this.p).addTransition(com.google.android.projection.gearhead.R.id.indeterminate, com.google.android.projection.gearhead.R.id.unchecked, fhrVar, false);
            }
        }
        android.graphics.drawable.Drawable drawable5 = this.p;
        if (drawable5 != null && (colorStateList = this.b) != null) {
            drawable5.setTintList(colorStateList);
        }
        android.graphics.drawable.Drawable drawable6 = this.q;
        if (drawable6 != null && colorStateList2 != null) {
            drawable6.setTintList(colorStateList2);
        }
        super.setButtonDrawable(defpackage.wpv.d(this.p, this.q, -1, -1));
        refreshDrawableState();
    }

    private final void c() {
        java.lang.String string;
        if (android.os.Build.VERSION.SDK_INT < 30 || this.v != null) {
            return;
        }
        int i2 = this.t;
        if (i2 == 1) {
            string = getResources().getString(com.google.android.projection.gearhead.R.string.mtrl_checkbox_state_description_checked);
        } else {
            string = i2 == 0 ? getResources().getString(com.google.android.projection.gearhead.R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(com.google.android.projection.gearhead.R.string.mtrl_checkbox_state_description_indeterminate);
        }
        super.setStateDescription(string);
    }

    public final void a(int i2) {
        android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.t != i2) {
            this.t = i2;
            super.setChecked(i2 == 1);
            refreshDrawableState();
            c();
            if (this.u) {
                return;
            }
            this.u = true;
            java.util.LinkedHashSet linkedHashSet = this.j;
            if (linkedHashSet != null) {
                java.util.Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((defpackage.wno) it.next()).a();
                }
            }
            if (this.t != 2 && (onCheckedChangeListener = this.w) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            android.view.autofill.AutofillManager autofillManagerM16m = defpackage.a$$ExternalSyntheticApiModelOutline1.m16m(getContext().getSystemService(defpackage.a$$ExternalSyntheticApiModelOutline1.m27m$1()));
            if (autofillManagerM16m != null) {
                autofillManagerM16m.notifyValueChanged(this);
            }
            this.u = false;
        }
    }

    @Override // android.widget.CompoundButton
    public final android.graphics.drawable.Drawable getButtonDrawable() {
        return this.p;
    }

    @Override // android.widget.CompoundButton
    public final android.content.res.ColorStateList getButtonTintList() {
        return this.b;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.t == 1;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.l && this.b == null && this.c == null) {
            this.l = true;
            android.content.res.ColorStateList colorStateList = this.k;
            if (colorStateList == null) {
                int[][] iArr = h;
                int length = iArr.length;
                int iBv = defpackage.sqs.bv(this, com.google.android.projection.gearhead.R.attr.colorControlActivated);
                int iBv2 = defpackage.sqs.bv(this, com.google.android.projection.gearhead.R.attr.colorError);
                int iBv3 = defpackage.sqs.bv(this, com.google.android.projection.gearhead.R.attr.colorSurface);
                int iBv4 = defpackage.sqs.bv(this, com.google.android.projection.gearhead.R.attr.colorOnSurface);
                android.content.res.ColorStateList colorStateList2 = new android.content.res.ColorStateList(iArr, new int[]{defpackage.sqs.bx(iBv3, iBv2, 1.0f), defpackage.sqs.bx(iBv3, iBv, 1.0f), defpackage.sqs.bx(iBv3, iBv4, 0.54f), defpackage.sqs.bx(iBv3, iBv4, 0.38f), defpackage.sqs.bx(iBv3, iBv4, 0.38f)});
                this.k = colorStateList2;
                colorStateList = colorStateList2;
            }
            setButtonTintList(colorStateList);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (this.t == 2) {
            mergeDrawableStates(iArrOnCreateDrawableState, f);
        }
        if (this.n) {
            mergeDrawableStates(iArrOnCreateDrawableState, g);
        }
        this.d = defpackage.wpv.g(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawable;
        if (!this.m || !android.text.TextUtils.isEmpty(getText()) || (drawable = this.p) == null) {
            super.onDraw(canvas);
            return;
        }
        int i2 = true == defpackage.wqn.j(this) ? -1 : 1;
        int width = getWidth() - drawable.getIntrinsicWidth();
        int iSave = canvas.save();
        int i3 = (width / 2) * i2;
        canvas.translate(i3, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            android.graphics.Rect bounds = drawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + i3, bounds.top, bounds.right + i3, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.n) {
            accessibilityNodeInfo.setText(java.lang.String.valueOf(accessibilityNodeInfo.getText()) + ", " + java.lang.String.valueOf(this.o));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.google.android.material.checkbox.MaterialCheckBox.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.google.android.material.checkbox.MaterialCheckBox.SavedState savedState = (com.google.android.material.checkbox.MaterialCheckBox.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        a(savedState.a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
        com.google.android.material.checkbox.MaterialCheckBox.SavedState savedState = new com.google.android.material.checkbox.MaterialCheckBox.SavedState(super.onSaveInstanceState());
        savedState.a = this.t;
        return savedState;
    }

    @Override // defpackage.iz, android.widget.CompoundButton
    public final void setButtonDrawable(int i2) {
        setButtonDrawable(defpackage.ca.e(getContext(), i2));
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintList(android.content.res.ColorStateList colorStateList) {
        if (this.b == colorStateList) {
            return;
        }
        this.b = colorStateList;
        b();
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintMode(android.graphics.PorterDuff.Mode mode) {
        defpackage.jb jbVar = this.a;
        if (jbVar != null) {
            jbVar.a = mode;
            jbVar.c = true;
            jbVar.a();
        }
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        a(z ? 1 : 0);
    }

    @Override // android.widget.CompoundButton
    public final void setOnCheckedChangeListener(android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.w = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public final void setStateDescription(java.lang.CharSequence charSequence) {
        this.v = charSequence;
        if (charSequence == null) {
            c();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        a(!isChecked() ? 1 : 0);
    }

    @Override // defpackage.iz, android.widget.CompoundButton
    public final void setButtonDrawable(android.graphics.drawable.Drawable drawable) {
        this.p = drawable;
        this.r = false;
        b();
    }
}
