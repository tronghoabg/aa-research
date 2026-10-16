package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.material.focus.FocusRingDrawable;
import defpackage.a;
import defpackage.ca;
import defpackage.dup;
import defpackage.emq;
import defpackage.iw;
import defpackage.ix;
import defpackage.nd;
import defpackage.wil;
import defpackage.wly;
import defpackage.wmi;
import defpackage.wmj;
import defpackage.wmk;
import defpackage.wml;
import defpackage.wmm;
import defpackage.woy;
import defpackage.wqr;
import defpackage.wtg;
import defpackage.wtw;
import defpackage.wub;
import defpackage.wue;
import defpackage.wui;
import defpackage.wuk;
import defpackage.wuv;
import defpackage.wux;
import defpackage.wxp;
import defpackage.ykd;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public class MaterialButton extends ix implements Checkable, wuv {
    private static final int[] b = {R.attr.state_checkable};
    private static final int[] c = {R.attr.state_checked};
    private int A;
    private int B;
    private int C;
    private int D;
    private final LinkedHashSet d;
    public final wmk e;
    public PorterDuff.Mode f;
    public ColorStateList g;
    public int h;
    public float i;
    public boolean j;
    public int k;
    public boolean l;
    int m;
    private Drawable n;
    private PorterDuff.Mode o;
    private ColorStateList p;
    private Drawable q;
    private boolean r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private boolean x;
    private boolean y;
    private int z;

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        int i2;
        super(wxp.b(context, attributeSet, i, com.google.android.projection.gearhead.R.style.Widget_MaterialComponents_Button, new int[]{com.google.android.projection.gearhead.R.attr.materialSizeOverlay}), attributeSet, i);
        this.d = new LinkedHashSet();
        this.x = false;
        this.y = false;
        this.B = Integer.MIN_VALUE;
        this.i = -2.1474836E9f;
        this.C = Integer.MIN_VALUE;
        this.D = Integer.MIN_VALUE;
        this.m = Integer.MIN_VALUE;
        Context context2 = getContext();
        int[] iArr = wmm.a;
        wqr.b(context2, attributeSet, i, com.google.android.projection.gearhead.R.style.Widget_MaterialComponents_Button);
        wqr.c(context2, attributeSet, iArr, i, com.google.android.projection.gearhead.R.style.Widget_MaterialComponents_Button, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, com.google.android.projection.gearhead.R.style.Widget_MaterialComponents_Button);
        this.u = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, 0);
        this.f = a.R(typedArrayObtainStyledAttributes.getInt(16, -1), PorterDuff.Mode.SRC_IN);
        this.g = wub.h(getContext(), typedArrayObtainStyledAttributes, 15);
        this.n = wub.i(getContext(), typedArrayObtainStyledAttributes, 11);
        this.z = typedArrayObtainStyledAttributes.getInteger(12, 1);
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, 0);
        this.o = a.R(typedArrayObtainStyledAttributes.getInt(22, -1), PorterDuff.Mode.SRC_IN);
        this.p = typedArrayObtainStyledAttributes.hasValue(21) ? wub.h(getContext(), typedArrayObtainStyledAttributes, 21) : this.g;
        this.A = typedArrayObtainStyledAttributes.getInteger(20, 3);
        Drawable drawableI = wub.i(getContext(), typedArrayObtainStyledAttributes, 19);
        this.q = drawableI;
        this.r = drawableI == null;
        wui wuiVarG = wux.g(context2, typedArrayObtainStyledAttributes, 23);
        wuiVarG = wuiVarG == null ? new wuk(wuk.i(context2, attributeSet, i, com.google.android.projection.gearhead.R.style.Widget_MaterialComponents_Button, new wtw(BitmapDescriptorFactory.HUE_RED))) : wuiVarG;
        boolean z = typedArrayObtainStyledAttributes.getBoolean(17, false);
        wmk wmkVar = new wmk(this, wuiVarG);
        this.e = wmkVar;
        wmkVar.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0);
        wmkVar.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
        wmkVar.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, 0);
        wmkVar.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
        if (typedArrayObtainStyledAttributes.hasValue(9)) {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1);
            wmkVar.h = dimensionPixelSize;
            wmkVar.c(wmkVar.b.c(dimensionPixelSize));
        }
        wmkVar.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(26, 0);
        wmkVar.j = a.R(typedArrayObtainStyledAttributes.getInt(8, -1), PorterDuff.Mode.SRC_IN);
        wmkVar.k = wub.h(wmkVar.a.getContext(), typedArrayObtainStyledAttributes, 7);
        wmkVar.l = wub.h(wmkVar.a.getContext(), typedArrayObtainStyledAttributes, 25);
        wmkVar.m = wub.h(wmkVar.a.getContext(), typedArrayObtainStyledAttributes, 18);
        wmkVar.p = typedArrayObtainStyledAttributes.getBoolean(6, false);
        wmkVar.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        wmkVar.q = typedArrayObtainStyledAttributes.getBoolean(27, true);
        int paddingStart = wmkVar.a.getPaddingStart();
        int paddingTop = wmkVar.a.getPaddingTop();
        int paddingEnd = wmkVar.a.getPaddingEnd();
        int paddingBottom = wmkVar.a.getPaddingBottom();
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            wmkVar.b();
            i2 = 1;
        } else {
            MaterialButton materialButton = wmkVar.a;
            i2 = 1;
            wue wueVar = new wue(wmkVar.b);
            emq emqVar = wmkVar.c;
            if (emqVar != null) {
                wueVar.M(emqVar);
            }
            ykd ykdVar = wmkVar.t;
            if (ykdVar != null) {
                wueVar.A = ykdVar;
            }
            Context context3 = wmkVar.a.getContext();
            wueVar.K(context3);
            wueVar.setTintList(wmkVar.k);
            PorterDuff.Mode mode = wmkVar.j;
            if (mode != null) {
                wueVar.setTintMode(mode);
            }
            wueVar.T(wmkVar.i, wmkVar.l);
            wue wueVar2 = new wue(wmkVar.b);
            emq emqVar2 = wmkVar.c;
            if (emqVar2 != null) {
                wueVar2.M(emqVar2);
            }
            wueVar2.setTint(0);
            wueVar2.S(wmkVar.i, 0);
            wmkVar.n = new wue(wmkVar.b);
            emq emqVar3 = wmkVar.c;
            if (emqVar3 != null) {
                ((wue) wmkVar.n).M(emqVar3);
            }
            wmkVar.n.setTint(-1);
            ColorStateList colorStateList = wmkVar.m;
            int[] iArr2 = wtg.a;
            wmkVar.r = new RippleDrawable(colorStateList == null ? ColorStateList.valueOf(0) : colorStateList, new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{wueVar2, wueVar}), wmkVar.d, wmkVar.f, wmkVar.e, wmkVar.g), wmkVar.n);
            FocusRingDrawable.c(context3, wmkVar.r, null);
            super.setBackgroundDrawable(wmkVar.r);
            wue wueVarA = wmkVar.a(false);
            if (wueVarA != null) {
                wueVarA.N(wmkVar.s);
                wueVarA.setState(wmkVar.a.getDrawableState());
            }
            FocusRingDrawable focusRingDrawableB = FocusRingDrawable.b(wmkVar.a.getBackground());
            if (focusRingDrawableB != null) {
                focusRingDrawableB.d(wueVarA);
            }
        }
        wmkVar.a.setPaddingRelative(paddingStart + wmkVar.d, paddingTop + wmkVar.f, paddingEnd + wmkVar.e, paddingBottom + wmkVar.g);
        int i3 = i2;
        h(typedArrayObtainStyledAttributes.getBoolean(i3, false));
        if (wuiVarG instanceof wux) {
            wmkVar.c = woy.D(getContext(), com.google.android.projection.gearhead.R.style.Motion_Material3_Spring_Standard_Fast_Spatial);
            if (wmkVar.b instanceof wux) {
                wmkVar.d();
            }
        }
        if (this.j != z) {
            this.j = z;
            if (z) {
                wmkVar.e(new ykd(this));
            } else {
                wmkVar.e(null);
            }
            post(new wil(this, 5));
        }
        typedArrayObtainStyledAttributes.recycle();
        setCompoundDrawablePadding(this.u);
        n(this.n != null ? i3 : false);
        p(this.q != null ? i3 : false);
    }

    private final boolean A() {
        if (D() && H()) {
            return true;
        }
        if (C() && G()) {
            return true;
        }
        return E() && I();
    }

    private final boolean B(int i) {
        Layout.Alignment alignmentX = x();
        if (i == 1 || i == 3) {
            return true;
        }
        return i == 2 ? alignmentX == Layout.Alignment.ALIGN_NORMAL : i == 4 && alignmentX == Layout.Alignment.ALIGN_OPPOSITE;
    }

    private final boolean C() {
        int i = this.z;
        return i == 3 || i == 4;
    }

    private final boolean D() {
        int i = this.z;
        return i == 1 || i == 2;
    }

    private final boolean E() {
        int i = this.z;
        return i == 16 || i == 32;
    }

    private final boolean F() {
        return getLayoutDirection() == 1;
    }

    private final boolean G() {
        int i = this.A;
        return i == 3 || i == 4;
    }

    private final boolean H() {
        int i = this.A;
        return i == 1 || i == 2;
    }

    private final boolean I() {
        int i = this.A;
        return i == 16 || i == 32;
    }

    private final int c(int i, int i2) {
        int intrinsicWidth;
        int intrinsicWidth2;
        Drawable drawable = this.n;
        if (drawable != null) {
            intrinsicWidth = this.h;
            if (intrinsicWidth == 0) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth = 0;
        }
        Drawable drawable2 = this.q;
        if (drawable2 != null) {
            intrinsicWidth2 = this.h;
            if (intrinsicWidth2 == 0) {
                intrinsicWidth2 = drawable2.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth2 = 0;
        }
        int iU = (((((i - u()) - getPaddingEnd()) - intrinsicWidth) - intrinsicWidth2) - this.u) - getPaddingStart();
        if (x() == Layout.Alignment.ALIGN_CENTER) {
            iU /= 2;
        }
        return F() != (i2 == 4) ? -iU : iU;
    }

    private final int t(int i, int i2) {
        int iMin;
        if (getLineCount() > 1) {
            iMin = getLayout().getHeight();
        } else {
            TextPaint paint = getPaint();
            String string = getText().toString();
            if (getTransformationMethod() != null) {
                string = getTransformationMethod().getTransformation(string, this).toString();
            }
            Rect rect = new Rect();
            paint.getTextBounds(string, 0, string.length(), rect);
            iMin = Math.min(rect.height(), getLayout().getHeight());
        }
        return Math.max(0, (((((i - iMin) - getPaddingTop()) - i2) - this.u) - getPaddingBottom()) / 2);
    }

    private final int u() {
        int lineCount = getLineCount();
        float fMax = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    private final Drawable v(int i) {
        if (i == 0) {
            Drawable drawable = this.q;
            if (drawable == null || !H()) {
                return null;
            }
            return drawable;
        }
        Drawable drawable2 = this.q;
        if (i != 1) {
            if (drawable2 == null || !G()) {
                return null;
            }
            return drawable2;
        }
        if (drawable2 == null || !I()) {
            return null;
        }
        return drawable2;
    }

    private final Drawable w(int i) {
        Drawable drawable = this.n;
        if (i != 0) {
            if (drawable == null || !C()) {
                return null;
            }
            return drawable;
        }
        if (drawable == null || !D()) {
            return null;
        }
        return drawable;
    }

    private final Layout.Alignment x() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            return (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
        }
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private final void y(int i, int i2) {
        if (this.n == null || getLayout() == null) {
            return;
        }
        if (D() || C()) {
            this.t = 0;
            if (B(this.z)) {
                this.s = 0;
                n(false);
                return;
            }
            int iC = c(i, this.z);
            if (this.s != iC) {
                this.s = iC;
                n(false);
                return;
            }
            return;
        }
        if (E()) {
            this.s = 0;
            if (this.z == 16) {
                this.t = 0;
                n(false);
                return;
            }
            int intrinsicHeight = this.h;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.n.getIntrinsicHeight();
            }
            int iT = t(i2, intrinsicHeight);
            if (this.t != iT) {
                this.t = iT;
                n(false);
            }
        }
    }

    private final void z(int i, int i2) {
        if (this.q == null || getLayout() == null) {
            return;
        }
        if (H() || G()) {
            this.w = 0;
            if (B(this.A)) {
                this.v = 0;
                p(false);
                return;
            }
            int iC = c(i, this.A);
            if (this.v != iC) {
                this.v = iC;
                p(false);
                return;
            }
            return;
        }
        if (I()) {
            this.v = 0;
            if (this.A == 16) {
                this.w = 0;
                p(false);
                return;
            }
            int intrinsicHeight = this.h;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.q.getIntrinsicHeight();
            }
            int iT = t(i2, intrinsicHeight);
            if (this.w != iT) {
                this.w = iT;
                p(false);
            }
        }
    }

    public void d(wuk wukVar) {
        if (!r()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.e.c(wukVar);
    }

    public final ColorStateList e() {
        nd ndVar;
        if (r()) {
            return this.e.k;
        }
        iw iwVar = this.a;
        if (iwVar == null || (ndVar = iwVar.a) == null) {
            return null;
        }
        return ndVar.a;
    }

    final String f() {
        if (TextUtils.isEmpty(null)) {
            return (true != q() ? Button.class : CompoundButton.class).getName();
        }
        return null;
    }

    @Override // defpackage.wuv
    public final wuk fD() {
        if (r()) {
            return this.e.b.a();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public final void g(boolean z) {
        if (r()) {
            this.e.p = z;
        }
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        return e();
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        nd ndVar;
        if (r()) {
            return this.e.j;
        }
        iw iwVar = this.a;
        if (iwVar == null || (ndVar = iwVar.a) == null) {
            return null;
        }
        return ndVar.b;
    }

    public final void h(boolean z) {
        if (!q() || this.x == z) {
            return;
        }
        this.x = z;
        refreshDrawableState();
        if (getParent() instanceof wml) {
            throw null;
        }
        if (this.y) {
            return;
        }
        this.y = true;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((wmi) it.next()).a();
        }
        this.y = false;
    }

    public final void i(Drawable drawable) {
        if (this.n != drawable) {
            this.i = -2.1474836E9f;
            this.n = drawable;
            n(true);
            y(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.x;
    }

    public final void j(int i) {
        i(i != 0 ? ca.e(getContext(), i) : null);
    }

    public final void k(ColorStateList colorStateList) {
        if (this.g != colorStateList) {
            this.g = colorStateList;
            n(false);
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (r()) {
            wmk wmkVar = this.e;
            if (wmkVar.k != colorStateList) {
                wmkVar.k = colorStateList;
                if (wmkVar.a(false) != null) {
                    wmkVar.a(false).setTintList(wmkVar.k);
                    return;
                }
                return;
            }
            return;
        }
        iw iwVar = this.a;
        if (iwVar != null) {
            if (iwVar.a == null) {
                iwVar.a = new nd();
            }
            nd ndVar = iwVar.a;
            ndVar.a = colorStateList;
            ndVar.d = true;
            iwVar.a();
        }
    }

    public final void m(PorterDuff.Mode mode) {
        if (r()) {
            wmk wmkVar = this.e;
            if (wmkVar.j != mode) {
                wmkVar.j = mode;
                if (wmkVar.a(false) == null || wmkVar.j == null) {
                    return;
                }
                wmkVar.a(false).setTintMode(wmkVar.j);
                return;
            }
            return;
        }
        iw iwVar = this.a;
        if (iwVar != null) {
            if (iwVar.a == null) {
                iwVar.a = new nd();
            }
            nd ndVar = iwVar.a;
            ndVar.b = mode;
            ndVar.c = true;
            iwVar.a();
        }
    }

    public final void n(boolean z) {
        Drawable drawable = this.n;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.n = drawableMutate;
            drawableMutate.setTintList(this.g);
            PorterDuff.Mode mode = this.f;
            if (mode != null) {
                this.n.setTintMode(mode);
            }
            int intrinsicWidth = this.h;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.n.getIntrinsicWidth();
            }
            int intrinsicHeight = this.h;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.n.getIntrinsicHeight();
            }
            Drawable drawable2 = this.n;
            int i = this.s;
            int i2 = this.t;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.n.setVisible(true, z);
        }
        Drawable drawable3 = this.n;
        if (drawable3 != null && this.q != null && A()) {
            throw new IllegalArgumentException("iconGravity cannot have the same alignment as secondaryIconGravity");
        }
        if (drawable3 == null && this.q != null && A()) {
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (D() && compoundDrawablesRelative[0] != this.n) || (C() && compoundDrawablesRelative[2] != this.n) || (E() && compoundDrawablesRelative[1] != this.n);
        if (z || z2) {
            if (D()) {
                setCompoundDrawablesRelative(this.n, v(1), v(2), null);
            } else if (C()) {
                setCompoundDrawablesRelative(v(0), v(1), this.n, null);
            } else if (E()) {
                setCompoundDrawablesRelative(v(0), this.n, v(2), null);
            }
        }
    }

    public final void o() {
        boolean zF = F();
        int i = this.k;
        if (zF) {
            i = -i;
        }
        if (getLayoutParams() != null) {
            getLayoutParams().width = (int) (this.i + BitmapDescriptorFactory.HUE_RED);
        }
        setPaddingRelative(this.C + i, getPaddingTop(), this.D - i, getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (r()) {
            wub.e(this, this.e.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (q()) {
            mergeDrawableStates(iArrOnCreateDrawableState, b);
        }
        if (this.x) {
            mergeDrawableStates(iArrOnCreateDrawableState, c);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // defpackage.ix, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(f());
        accessibilityEvent.setChecked(this.x);
    }

    @Override // defpackage.ix, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(f());
        accessibilityNodeInfo.setCheckable(q());
        accessibilityNodeInfo.setChecked(this.x);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        y(getMeasuredWidth(), getMeasuredHeight());
        z(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.B != i6) {
            this.B = i6;
            this.i = -2.1474836E9f;
        }
        if (this.i == -2.1474836E9f) {
            this.i = getMeasuredWidth();
            if (getParent() instanceof wmj) {
                throw null;
            }
        }
        boolean z2 = false;
        if (this.m == Integer.MIN_VALUE) {
            Drawable drawable = this.n;
            if (drawable == null) {
                i5 = 0;
            } else {
                int i7 = this.u;
                int intrinsicWidth = this.h;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = drawable.getIntrinsicWidth();
                }
                i5 = i7 + intrinsicWidth;
            }
            this.m = (getMeasuredWidth() - u()) - i5;
        }
        if (this.C == Integer.MIN_VALUE) {
            this.C = getPaddingStart();
        }
        if (this.D == Integer.MIN_VALUE) {
            this.D = getPaddingEnd();
        }
        if ((getParent() instanceof wmj) && ((wmj) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.l = z2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        h(savedState.a);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.x;
        return savedState;
    }

    @Override // android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        y(getMeasuredWidth(), getMeasuredHeight());
        z(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void p(boolean z) {
        Drawable drawable = this.q;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.q = drawableMutate;
            drawableMutate.setTintList(this.p);
            PorterDuff.Mode mode = this.o;
            if (mode != null) {
                this.q.setTintMode(mode);
            }
            int intrinsicWidth = this.h;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.q.getIntrinsicWidth();
            }
            int intrinsicHeight = this.h;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.q.getIntrinsicHeight();
            }
            Drawable drawable2 = this.q;
            int i = this.v;
            int i2 = this.w;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.q.setVisible(true, z);
        }
        Drawable drawable3 = this.q;
        if (drawable3 != null && this.n != null && A()) {
            throw new IllegalArgumentException("secondaryIconGravity cannot have the same alignment as iconGravity");
        }
        if (drawable3 == null) {
            if (this.r) {
                return;
            }
            if (this.n != null && A()) {
                return;
            }
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (H() && compoundDrawablesRelative[0] != this.q) || (G() && compoundDrawablesRelative[2] != this.q) || (I() && compoundDrawablesRelative[1] != this.q);
        if (z || z2) {
            if (H()) {
                setCompoundDrawablesRelative(this.q, w(1), w(2), null);
            } else if (G()) {
                setCompoundDrawablesRelative(w(0), w(1), this.q, null);
            } else if (I()) {
                setCompoundDrawablesRelative(w(0), this.q, w(2), null);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean z;
        if (isEnabled() && this.e.q) {
            toggle();
            z = true;
        } else {
            z = false;
        }
        boolean zPerformClick = super.performClick();
        if (z && !zPerformClick) {
            playSoundEffect(0);
        }
        return zPerformClick;
    }

    public final boolean q() {
        wmk wmkVar = this.e;
        return wmkVar != null && wmkVar.p;
    }

    public final boolean r() {
        wmk wmkVar = this.e;
        return (wmkVar == null || wmkVar.o) ? false : true;
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.n != null) {
            if (this.n.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public final void s() {
        k(dup.d(getContext(), com.google.android.projection.gearhead.R.color.m3_text_button_foreground_color_selector));
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (!r()) {
            super.setBackgroundColor(i);
            return;
        }
        wmk wmkVar = this.e;
        if (wmkVar.a(false) != null) {
            wmkVar.a(false).setTint(i);
        }
    }

    @Override // defpackage.ix, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (!r()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.e.b();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // defpackage.ix, android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? ca.e(getContext(), i) : null);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        l(colorStateList);
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        m(mode);
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        h(z);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablePadding(int i) {
        if (getCompoundDrawablePadding() != i) {
            this.i = -2.1474836E9f;
        }
        super.setCompoundDrawablePadding(i);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        if (r()) {
            this.e.a(false).N(f);
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.i = -2.1474836E9f;
        super.setText(charSequence, bufferType);
    }

    @Override // android.view.View
    public final void setTextAlignment(int i) {
        super.setTextAlignment(i);
        y(getMeasuredWidth(), getMeasuredHeight());
        z(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // defpackage.ix, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        this.i = -2.1474836E9f;
        super.setTextAppearance(context, i);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        this.i = -2.1474836E9f;
        super.setTextSize(i, f);
    }

    @Override // android.widget.TextView
    public final void setWidth(int i) {
        this.i = -2.1474836E9f;
        super.setWidth(i);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        h(!this.x);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new wly(2);
        boolean a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.a = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.projection.gearhead.R.attr.materialButtonStyle);
    }

    public MaterialButton(Context context) {
        this(context, null);
    }
}
