package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.projection.gearhead.R;
import defpackage.a;
import defpackage.dvd;
import defpackage.lah;
import defpackage.woy;
import defpackage.wqr;
import defpackage.wqy;
import defpackage.wxp;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public class MaterialSwitch extends SwitchCompat {
    private static final int[] p = {R.attr.state_with_icon};
    public ColorStateList m;
    public ColorStateList n;
    public ColorStateList o;
    private Drawable q;
    private Drawable r;
    private int s;
    private Drawable t;
    private Drawable u;
    private ColorStateList v;
    private PorterDuff.Mode w;
    private PorterDuff.Mode x;
    private int[] y;
    private int[] z;

    public MaterialSwitch(Context context, AttributeSet attributeSet, int i) {
        super(wxp.a(context, attributeSet, i, R.style.Widget_Material3_CompoundButton_MaterialSwitch), attributeSet, i);
        this.s = -1;
        Context context2 = getContext();
        this.q = this.a;
        this.m = this.b;
        this.b = null;
        this.d = true;
        super.a();
        this.t = this.e;
        this.n = this.f;
        this.f = null;
        this.h = true;
        super.b();
        lah lahVarE = wqr.e(context2, attributeSet, wqy.a, i, R.style.Widget_Material3_CompoundButton_MaterialSwitch, new int[0]);
        this.r = lahVarE.s(0);
        this.s = lahVarE.m(1, -1);
        this.v = lahVarE.r(2);
        this.w = a.R(lahVarE.n(3, -1), PorterDuff.Mode.SRC_IN);
        this.u = lahVarE.s(4);
        this.o = lahVarE.r(5);
        this.x = a.R(lahVarE.n(6, -1), PorterDuff.Mode.SRC_IN);
        lahVarE.w();
        this.k = false;
        invalidate();
        i();
        j();
    }

    private static void k(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f) {
        if (drawable != null) {
            int colorForState = colorStateList.getColorForState(iArr, 0);
            int colorForState2 = colorStateList.getColorForState(iArr2, 0);
            float f2 = 1.0f - f;
            int i = dvd.a;
            float fAlpha = Color.alpha(colorForState2) * f;
            float fRed = Color.red(colorForState2) * f;
            float fGreen = Color.green(colorForState2) * f;
            drawable.setTint(Color.argb((int) ((Color.alpha(colorForState) * f2) + fAlpha), (int) ((Color.red(colorForState) * f2) + fRed), (int) ((Color.green(colorForState) * f2) + fGreen), (int) ((Color.blue(colorForState) * f2) + (Color.blue(colorForState2) * f))));
        }
    }

    private final void l() {
        ColorStateList colorStateList = this.m;
        if (colorStateList == null && this.v == null && this.n == null && this.o == null) {
            return;
        }
        float f = this.j;
        if (colorStateList != null) {
            k(this.q, colorStateList, this.y, this.z, f);
        }
        ColorStateList colorStateList2 = this.v;
        if (colorStateList2 != null) {
            k(this.r, colorStateList2, this.y, this.z, f);
        }
        ColorStateList colorStateList3 = this.n;
        if (colorStateList3 != null) {
            k(this.t, colorStateList3, this.y, this.z, f);
        }
        ColorStateList colorStateList4 = this.o;
        if (colorStateList4 != null) {
            k(this.u, colorStateList4, this.y, this.z, f);
        }
    }

    public final void i() {
        this.q = woy.i(this.q, this.m, this.c);
        this.r = woy.i(this.r, this.v, this.w);
        l();
        Drawable drawable = this.q;
        Drawable drawable2 = this.r;
        int i = this.s;
        Drawable drawableD = woy.d(drawable, drawable2, i, i);
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            drawable3.setCallback(null);
        }
        this.a = drawableD;
        if (drawableD != null) {
            drawableD.setCallback(this);
        }
        requestLayout();
        refreshDrawableState();
    }

    @Override // android.view.View
    public final void invalidate() {
        l();
        super.invalidate();
    }

    public final void j() {
        Drawable drawable;
        this.t = woy.i(this.t, this.n, this.g);
        this.u = woy.i(this.u, this.o, this.x);
        l();
        Drawable layerDrawable = this.t;
        if (layerDrawable != null && (drawable = this.u) != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{layerDrawable, drawable});
        } else if (layerDrawable == null) {
            layerDrawable = this.u;
        }
        if (layerDrawable != null) {
            this.i = layerDrawable.getIntrinsicWidth();
            requestLayout();
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.e = layerDrawable;
        if (layerDrawable != null) {
            layerDrawable.setCallback(this);
        }
        requestLayout();
    }

    @Override // android.support.v7.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.r != null) {
            mergeDrawableStates(iArrOnCreateDrawableState, p);
        }
        int[] iArr = new int[iArrOnCreateDrawableState.length];
        int i2 = 0;
        for (int i3 : iArrOnCreateDrawableState) {
            if (i3 != 16842912) {
                iArr[i2] = i3;
                i2++;
            }
        }
        this.y = iArr;
        this.z = woy.h(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.support.v7.widget.SwitchCompat, android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        FocusRingDrawable focusRingDrawableB;
        super.onLayout(z, i, i2, i3, i4);
        if (this.t == null || (focusRingDrawableB = FocusRingDrawable.b(getBackground())) == null) {
            return;
        }
        focusRingDrawableB.mutate();
        focusRingDrawableB.c.w = this.t.getBounds();
    }

    public MaterialSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSwitchStyle);
    }

    public MaterialSwitch(Context context) {
        this(context, null);
    }
}
