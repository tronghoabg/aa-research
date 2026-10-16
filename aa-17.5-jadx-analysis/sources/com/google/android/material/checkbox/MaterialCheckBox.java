package com.google.android.material.checkbox;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import defpackage.a;
import defpackage.a$$ExternalSyntheticApiModelOutline0;
import defpackage.ca;
import defpackage.fhh;
import defpackage.fhi;
import defpackage.fhl;
import defpackage.iy;
import defpackage.ja;
import defpackage.lah;
import defpackage.srg;
import defpackage.wmq;
import defpackage.wmr;
import defpackage.wms;
import defpackage.woy;
import defpackage.wqr;
import defpackage.wub;
import defpackage.wxp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class MaterialCheckBox extends iy {
    private static final int e = 2132151457;
    private static final int[] f = {R.attr.state_indeterminate};
    private static final int[] g = {R.attr.state_error};
    private static final int[][] h = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private static final int i = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public ColorStateList b;
    final ColorStateList c;
    public int[] d;
    private final LinkedHashSet j;
    private ColorStateList k;
    private boolean l;
    private final boolean m;
    private final boolean n;
    private final CharSequence o;
    private Drawable p;
    private Drawable q;
    private boolean r;
    private final PorterDuff.Mode s;
    private int t;
    private boolean u;
    private CharSequence v;
    private CompoundButton.OnCheckedChangeListener w;
    private final fhl x;
    private final fhh y;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new srg(5);
        int a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }

        public final String toString() {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            int i = this.a;
            return a.bC(i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked", hexString, "MaterialCheckBox.SavedState{", " CheckedState=", "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.a));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateListM;
        int i2 = e;
        super(wxp.a(context, attributeSet, R.attr.checkboxStyle, i2), attributeSet, R.attr.checkboxStyle);
        new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.x = fhl.a(getContext(), R.drawable.mtrl_checkbox_button_checked_unchecked);
        this.y = new wmq(this);
        Context context2 = getContext();
        ColorStateList colorStateList = this.b;
        this.b = colorStateList == null ? super.getButtonTintList() != null ? super.getButtonTintList() : null : colorStateList;
        ja jaVar = this.a;
        if (jaVar != null) {
            jaVar.b = true;
            jaVar.a();
        }
        lah lahVarE = wqr.e(context2, attributeSet, wms.a, R.attr.checkboxStyle, i2, new int[0]);
        this.q = lahVarE.s(2);
        if (this.p != null && woy.z(context2, R.attr.isMaterial3Theme, false)) {
            int iQ = lahVarE.q(0, 0);
            int iQ2 = lahVarE.q(1, 0);
            if (iQ == i && iQ2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.p = ca.e(context2, R.drawable.mtrl_checkbox_button);
                this.r = true;
                if (this.q == null) {
                    this.q = ca.e(context2, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.c = wub.m(context2, lahVarE, 3);
        this.s = a.R(lahVarE.n(4, -1), PorterDuff.Mode.SRC_IN);
        this.l = lahVarE.x(11, false);
        this.m = lahVarE.x(6, true);
        this.n = lahVarE.x(9, false);
        this.o = lahVarE.u(8);
        if (lahVarE.y(7)) {
            a(lahVarE.n(7, 0));
        }
        if (lahVarE.y(10) && (colorStateListM = wub.m(context2, lahVarE, 10)) != null) {
            Drawable background = getBackground();
            background = background instanceof DrawableWrapper ? ((DrawableWrapper) background).getDrawable() : background;
            if (background instanceof RippleDrawable) {
                ((RippleDrawable) background).setColor(colorStateListM);
            }
        }
        lahVarE.w();
        b();
    }

    private final void b() {
        ColorStateList colorStateList;
        Animator.AnimatorListener animatorListener;
        this.p = woy.i(this.p, this.b, getButtonTintMode());
        Drawable drawable = this.q;
        ColorStateList colorStateList2 = this.c;
        this.q = woy.i(drawable, colorStateList2, this.s);
        if (this.r) {
            fhl fhlVar = this.x;
            if (fhlVar != null) {
                fhh fhhVar = this.y;
                if (fhhVar != null) {
                    Drawable drawable2 = fhlVar.e;
                    if (drawable2 != null) {
                        ((AnimatedVectorDrawable) drawable2).unregisterAnimationCallback(fhhVar.a());
                    }
                    ArrayList arrayList = fhlVar.c;
                    if (arrayList != null) {
                        arrayList.remove(fhhVar);
                        if (fhlVar.c.size() == 0 && (animatorListener = fhlVar.b) != null) {
                            fhlVar.a.c.removeListener(animatorListener);
                            fhlVar.b = null;
                        }
                    }
                }
                if (fhhVar != null) {
                    Drawable drawable3 = fhlVar.e;
                    if (drawable3 != null) {
                        ((AnimatedVectorDrawable) drawable3).registerAnimationCallback(fhhVar.a());
                    } else {
                        if (fhlVar.c == null) {
                            fhlVar.c = new ArrayList();
                        }
                        if (!fhlVar.c.contains(fhhVar)) {
                            fhlVar.c.add(fhhVar);
                            if (fhlVar.b == null) {
                                fhlVar.b = new fhi(fhlVar);
                            }
                            fhlVar.a.c.addListener(fhlVar.b);
                        }
                    }
                }
            }
            Drawable drawable4 = this.p;
            if ((drawable4 instanceof AnimatedStateListDrawable) && fhlVar != null) {
                ((AnimatedStateListDrawable) drawable4).addTransition(R.id.checked, R.id.unchecked, fhlVar, false);
                ((AnimatedStateListDrawable) this.p).addTransition(R.id.indeterminate, R.id.unchecked, fhlVar, false);
            }
        }
        Drawable drawable5 = this.p;
        if (drawable5 != null && (colorStateList = this.b) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.q;
        if (drawable6 != null && colorStateList2 != null) {
            drawable6.setTintList(colorStateList2);
        }
        super.setButtonDrawable(woy.d(this.p, this.q, -1, -1));
        refreshDrawableState();
    }

    private final void c() {
        if (Build.VERSION.SDK_INT < 30 || this.v != null) {
            return;
        }
        int i2 = this.t;
        super.setStateDescription(i2 == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i2 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate));
    }

    public final void a(int i2) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.t != i2) {
            this.t = i2;
            super.setChecked(i2 == 1);
            refreshDrawableState();
            c();
            if (this.u) {
                return;
            }
            this.u = true;
            LinkedHashSet linkedHashSet = this.j;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((wmr) it.next()).a();
                }
            }
            if (this.t != 2 && (onCheckedChangeListener = this.w) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManagerM8m = a$$ExternalSyntheticApiModelOutline0.m8m(getContext().getSystemService(a$$ExternalSyntheticApiModelOutline0.m20m$1()));
            if (autofillManagerM8m != null) {
                autofillManagerM8m.notifyValueChanged(this);
            }
            this.u = false;
        }
    }

    @Override // android.widget.CompoundButton
    public final Drawable getButtonDrawable() {
        return this.p;
    }

    @Override // android.widget.CompoundButton
    public final ColorStateList getButtonTintList() {
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
            ColorStateList colorStateList = this.k;
            if (colorStateList == null) {
                int[][] iArr = h;
                int length = iArr.length;
                int iM = woy.m(this, R.attr.colorControlActivated);
                int iM2 = woy.m(this, R.attr.colorError);
                int iM3 = woy.m(this, R.attr.colorSurface);
                int iM4 = woy.m(this, R.attr.colorOnSurface);
                ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{woy.o(iM3, iM2, 1.0f), woy.o(iM3, iM, 1.0f), woy.o(iM3, iM4, 0.54f), woy.o(iM3, iM4, 0.38f), woy.o(iM3, iM4, 0.38f)});
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
        this.d = woy.h(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        Drawable drawable;
        if (!this.m || !TextUtils.isEmpty(getText()) || (drawable = this.p) == null) {
            super.onDraw(canvas);
            return;
        }
        int i2 = true == woy.J(this) ? -1 : 1;
        int width = getWidth() - drawable.getIntrinsicWidth();
        int iSave = canvas.save();
        int i3 = (width / 2) * i2;
        canvas.translate(i3, BitmapDescriptorFactory.HUE_RED);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + i3, bounds.top, bounds.right + i3, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.n) {
            accessibilityNodeInfo.setText(String.valueOf(accessibilityNodeInfo.getText()) + ", " + String.valueOf(this.o));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        a(savedState.a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.t;
        return savedState;
    }

    @Override // defpackage.iy, android.widget.CompoundButton
    public final void setButtonDrawable(int i2) {
        setButtonDrawable(ca.e(getContext(), i2));
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintList(ColorStateList colorStateList) {
        if (this.b == colorStateList) {
            return;
        }
        this.b = colorStateList;
        b();
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintMode(PorterDuff.Mode mode) {
        ja jaVar = this.a;
        if (jaVar != null) {
            jaVar.a = mode;
            jaVar.c = true;
            jaVar.a();
        }
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        a(z ? 1 : 0);
    }

    @Override // android.widget.CompoundButton
    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.w = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public final void setStateDescription(CharSequence charSequence) {
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

    @Override // defpackage.iy, android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        this.p = drawable;
        this.r = false;
        b();
    }
}
