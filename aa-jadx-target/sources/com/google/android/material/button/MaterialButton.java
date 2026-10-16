package com.google.android.material.button;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class MaterialButton extends defpackage.iy implements android.widget.Checkable, wvt {
    private static final int[] b = {android.R.attr.state_checkable};
    private static final int[] c = {android.R.attr.state_checked};
    private int A;
    private int B;
    private int C;
    private int D;
    private final java.util.LinkedHashSet d;
    public final defpackage.wnh e;
    public android.graphics.PorterDuff.Mode f;
    public android.content.res.ColorStateList g;
    public int h;
    public float i;
    public boolean j;
    public int k;
    public boolean l;
    int m;
    private android.graphics.drawable.Drawable n;
    private android.graphics.PorterDuff.Mode o;
    private android.content.res.ColorStateList p;
    private android.graphics.drawable.Drawable q;
    private boolean r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private boolean x;
    private boolean y;
    private int z;

    /* JADX WARN: Multi-variable type inference failed */
    public MaterialButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        int i2;
        super(defpackage.wyk.b(context, attributeSet, i, 2132151435, new int[]{2130969908}), attributeSet, i);
        this.d = new java.util.LinkedHashSet();
        this.x = false;
        this.y = false;
        this.B = Integer.MIN_VALUE;
        this.i = -2.1474836E9f;
        this.C = Integer.MIN_VALUE;
        this.D = Integer.MIN_VALUE;
        this.m = Integer.MIN_VALUE;
        android.content.Context context2 = getContext();
        android.content.res.TypedArray typedArrayA = defpackage.wro.a(context2, attributeSet, defpackage.wnj.a, i, 2132151435, new int[0]);
        this.u = typedArrayA.getDimensionPixelSize(13, 0);
        this.f = defpackage.a.Q(typedArrayA.getInt(16, -1), android.graphics.PorterDuff.Mode.SRC_IN);
        this.g = defpackage.sqs.bi(getContext(), typedArrayA, 15);
        this.n = defpackage.sqs.bj(getContext(), typedArrayA, 11);
        this.z = typedArrayA.getInteger(12, 1);
        this.h = typedArrayA.getDimensionPixelSize(14, 0);
        this.o = defpackage.a.Q(typedArrayA.getInt(22, -1), android.graphics.PorterDuff.Mode.SRC_IN);
        this.p = typedArrayA.hasValue(21) ? defpackage.sqs.bi(getContext(), typedArrayA, 21) : this.g;
        this.A = typedArrayA.getInteger(20, 3);
        android.graphics.drawable.Drawable drawableBj = defpackage.sqs.bj(getContext(), typedArrayA, 19);
        this.q = drawableBj;
        this.r = drawableBj == null;
        wvh wvhVarG = defpackage.wvv.g(context2, typedArrayA, 23);
        wvhVarG = wvhVarG == null ? new defpackage.wvi(defpackage.wvi.l(context2, attributeSet, i, 2132151435)) : wvhVarG;
        boolean z = typedArrayA.getBoolean(17, false);
        defpackage.wnh wnhVar = new defpackage.wnh(this, wvhVarG);
        this.e = wnhVar;
        wnhVar.d = typedArrayA.getDimensionPixelOffset(2, 0);
        wnhVar.e = typedArrayA.getDimensionPixelOffset(3, 0);
        wnhVar.f = typedArrayA.getDimensionPixelOffset(4, 0);
        wnhVar.g = typedArrayA.getDimensionPixelOffset(5, 0);
        if (typedArrayA.hasValue(9)) {
            int dimensionPixelSize = typedArrayA.getDimensionPixelSize(9, -1);
            wnhVar.h = dimensionPixelSize;
            wnhVar.c(wnhVar.b.c(dimensionPixelSize));
        }
        wnhVar.i = typedArrayA.getDimensionPixelSize(26, 0);
        wnhVar.j = defpackage.a.Q(typedArrayA.getInt(8, -1), android.graphics.PorterDuff.Mode.SRC_IN);
        wnhVar.k = defpackage.sqs.bi(wnhVar.a.getContext(), typedArrayA, 7);
        wnhVar.l = defpackage.sqs.bi(wnhVar.a.getContext(), typedArrayA, 25);
        wnhVar.m = defpackage.sqs.bi(wnhVar.a.getContext(), typedArrayA, 18);
        wnhVar.p = typedArrayA.getBoolean(6, false);
        wnhVar.s = typedArrayA.getDimensionPixelSize(10, 0);
        wnhVar.q = typedArrayA.getBoolean(27, true);
        int paddingStart = wnhVar.a.getPaddingStart();
        int paddingTop = wnhVar.a.getPaddingTop();
        int paddingEnd = wnhVar.a.getPaddingEnd();
        int paddingBottom = wnhVar.a.getPaddingBottom();
        if (typedArrayA.hasValue(0)) {
            wnhVar.b();
            i2 = 1;
        } else {
            com.google.android.material.button.MaterialButton materialButton = wnhVar.a;
            i2 = 1;
            defpackage.wvd wvdVar = new defpackage.wvd(wnhVar.b);
            emw emwVar = wnhVar.c;
            if (emwVar != null) {
                wvdVar.M(emwVar);
            }
            defpackage.xei xeiVar = wnhVar.t;
            if (xeiVar != null) {
                wvdVar.A = xeiVar;
            }
            android.content.Context context3 = wnhVar.a.getContext();
            wvdVar.K(context3);
            wvdVar.setTintList(wnhVar.k);
            android.graphics.PorterDuff.Mode mode = wnhVar.j;
            if (mode != null) {
                wvdVar.setTintMode(mode);
            }
            wvdVar.T(wnhVar.i, wnhVar.l);
            defpackage.wvd wvdVar2 = new defpackage.wvd(wnhVar.b);
            emw emwVar2 = wnhVar.c;
            if (emwVar2 != null) {
                wvdVar2.M(emwVar2);
            }
            wvdVar2.setTint(0);
            wvdVar2.S(wnhVar.i, 0);
            wnhVar.n = new defpackage.wvd(wnhVar.b);
            emw emwVar3 = wnhVar.c;
            if (emwVar3 != null) {
                ((defpackage.wvd) wnhVar.n).M(emwVar3);
            }
            wnhVar.n.setTint(-1);
            wnhVar.r = new android.graphics.drawable.RippleDrawable(defpackage.wud.b(wnhVar.m), new android.graphics.drawable.InsetDrawable((android.graphics.drawable.Drawable) new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{wvdVar2, wvdVar}), wnhVar.d, wnhVar.f, wnhVar.e, wnhVar.g), wnhVar.n);
            com.google.android.material.focus.FocusRingDrawable.c(context3, wnhVar.r, null);
            super.setBackgroundDrawable(wnhVar.r);
            defpackage.wvd wvdVarA = wnhVar.a(false);
            if (wvdVarA != null) {
                wvdVarA.N(wnhVar.s);
                wvdVarA.setState(wnhVar.a.getDrawableState());
            }
            com.google.android.material.focus.FocusRingDrawable focusRingDrawableB = com.google.android.material.focus.FocusRingDrawable.b(wnhVar.a.getBackground());
            if (focusRingDrawableB != null) {
                focusRingDrawableB.d(wvdVarA);
            }
        }
        wnhVar.a.setPaddingRelative(paddingStart + wnhVar.d, paddingTop + wnhVar.f, paddingEnd + wnhVar.e, paddingBottom + wnhVar.g);
        int i3 = i2;
        h(typedArrayA.getBoolean(i3, false));
        if (wvhVarG instanceof defpackage.wvv) {
            wnhVar.c = defpackage.wqn.d(getContext(), 2132148928);
            if (wnhVar.b instanceof defpackage.wvv) {
                wnhVar.d();
            }
        }
        if (this.j != z) {
            this.j = z;
            if (z) {
                wnhVar.e(new defpackage.xei(this, null));
            } else {
                wnhVar.e(null);
            }
            post(new defpackage.wdg(this, 14));
        }
        typedArrayA.recycle();
        setCompoundDrawablePadding(this.u);
        n(this.n != null ? i3 : 0);
        p(this.q != null ? i3 : 0);
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
        android.text.Layout.Alignment alignmentX = x();
        if (i == 1 || i == 3) {
            return true;
        }
        if (i == 2) {
            return alignmentX == android.text.Layout.Alignment.ALIGN_NORMAL;
        }
        return i == 4 && alignmentX == android.text.Layout.Alignment.ALIGN_OPPOSITE;
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
        android.graphics.drawable.Drawable drawable = this.n;
        if (drawable != null) {
            intrinsicWidth = this.h;
            if (intrinsicWidth == 0) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth = 0;
        }
        android.graphics.drawable.Drawable drawable2 = this.q;
        if (drawable2 != null) {
            intrinsicWidth2 = this.h;
            if (intrinsicWidth2 == 0) {
                intrinsicWidth2 = drawable2.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth2 = 0;
        }
        int iU = (((((i - u()) - getPaddingEnd()) - intrinsicWidth) - intrinsicWidth2) - this.u) - getPaddingStart();
        if (x() == android.text.Layout.Alignment.ALIGN_CENTER) {
            iU /= 2;
        }
        return F() != (i2 == 4) ? -iU : iU;
    }

    private final int t(int i, int i2) {
        int iMin;
        if (getLineCount() > 1) {
            iMin = getLayout().getHeight();
        } else {
            android.text.TextPaint paint = getPaint();
            java.lang.String string = getText().toString();
            if (getTransformationMethod() != null) {
                string = getTransformationMethod().getTransformation(string, this).toString();
            }
            android.graphics.Rect rect = new android.graphics.Rect();
            paint.getTextBounds(string, 0, string.length(), rect);
            iMin = java.lang.Math.min(rect.height(), getLayout().getHeight());
        }
        return java.lang.Math.max(0, (((((i - iMin) - getPaddingTop()) - i2) - this.u) - getPaddingBottom()) / 2);
    }

    private final int u() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = java.lang.Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) java.lang.Math.ceil(fMax);
    }

    private final android.graphics.drawable.Drawable v(int i) {
        if (i == 0) {
            android.graphics.drawable.Drawable drawable = this.q;
            if (drawable == null || !H()) {
                return null;
            }
            return drawable;
        }
        android.graphics.drawable.Drawable drawable2 = this.q;
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

    private final android.graphics.drawable.Drawable w(int i) {
        android.graphics.drawable.Drawable drawable = this.n;
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

    private final android.text.Layout.Alignment x() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            if (textAlignment == 6 || textAlignment == 3) {
                return android.text.Layout.Alignment.ALIGN_OPPOSITE;
            }
            return textAlignment != 4 ? android.text.Layout.Alignment.ALIGN_NORMAL : android.text.Layout.Alignment.ALIGN_CENTER;
        }
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? android.text.Layout.Alignment.ALIGN_OPPOSITE : android.text.Layout.Alignment.ALIGN_NORMAL;
        }
        return android.text.Layout.Alignment.ALIGN_CENTER;
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

    public void d(defpackage.wvi wviVar) {
        if (!r()) {
            throw new java.lang.IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.e.c(wviVar);
    }

    public final android.content.res.ColorStateList e() {
        ng ngVar;
        if (r()) {
            return this.e.k;
        }
        defpackage.ix ixVar = this.a;
        if (ixVar == null || (ngVar = ixVar.a) == null) {
            return null;
        }
        return ngVar.a;
    }

    public final defpackage.wvi eL() {
        if (r()) {
            return this.e.b.a();
        }
        throw new java.lang.IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    final java.lang.String f() {
        return (true != q() ? android.widget.Button.class : android.widget.CompoundButton.class).getName();
    }

    public final void g(boolean z) {
        if (r()) {
            this.e.p = z;
        }
    }

    @Override // android.view.View
    public final android.content.res.ColorStateList getBackgroundTintList() {
        return e();
    }

    @Override // android.view.View
    public final android.graphics.PorterDuff.Mode getBackgroundTintMode() {
        ng ngVar;
        if (r()) {
            return this.e.j;
        }
        defpackage.ix ixVar = this.a;
        if (ixVar == null || (ngVar = ixVar.a) == null) {
            return null;
        }
        return ngVar.b;
    }

    public final void h(boolean z) {
        if (!q() || this.x == z) {
            return;
        }
        this.x = z;
        refreshDrawableState();
        if (getParent() instanceof wni) {
            getParent();
            throw null;
        }
        if (this.y) {
            return;
        }
        this.y = true;
        java.util.Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((wnf) it.next()).a();
        }
        this.y = false;
    }

    public final void i(android.graphics.drawable.Drawable drawable) {
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
        i(i != 0 ? defpackage.ca.e(getContext(), i) : null);
    }

    public final void k(android.content.res.ColorStateList colorStateList) {
        if (this.g != colorStateList) {
            this.g = colorStateList;
            n(false);
        }
    }

    public final void l(android.content.res.ColorStateList colorStateList) {
        if (r()) {
            defpackage.wnh wnhVar = this.e;
            if (wnhVar.k != colorStateList) {
                wnhVar.k = colorStateList;
                if (wnhVar.a(false) != null) {
                    wnhVar.a(false).setTintList(wnhVar.k);
                    return;
                }
                return;
            }
            return;
        }
        defpackage.ix ixVar = this.a;
        if (ixVar != null) {
            if (ixVar.a == null) {
                ixVar.a = new ng();
            }
            ng ngVar = ixVar.a;
            ngVar.a = colorStateList;
            ngVar.d = true;
            ixVar.a();
        }
    }

    public final void m(android.graphics.PorterDuff.Mode mode) {
        if (r()) {
            defpackage.wnh wnhVar = this.e;
            if (wnhVar.j != mode) {
                wnhVar.j = mode;
                if (wnhVar.a(false) == null || wnhVar.j == null) {
                    return;
                }
                wnhVar.a(false).setTintMode(wnhVar.j);
                return;
            }
            return;
        }
        defpackage.ix ixVar = this.a;
        if (ixVar != null) {
            if (ixVar.a == null) {
                ixVar.a = new ng();
            }
            ng ngVar = ixVar.a;
            ngVar.b = mode;
            ngVar.c = true;
            ixVar.a();
        }
    }

    public final void n(boolean z) {
        android.graphics.drawable.Drawable drawable = this.n;
        if (drawable != null) {
            android.graphics.drawable.Drawable drawableMutate = drawable.mutate();
            this.n = drawableMutate;
            drawableMutate.setTintList(this.g);
            android.graphics.PorterDuff.Mode mode = this.f;
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
            android.graphics.drawable.Drawable drawable2 = this.n;
            int i = this.s;
            int i2 = this.t;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.n.setVisible(true, z);
        }
        android.graphics.drawable.Drawable drawable3 = this.n;
        if (drawable3 != null && this.q != null && A()) {
            throw new java.lang.IllegalArgumentException("iconGravity cannot have the same alignment as secondaryIconGravity");
        }
        if (drawable3 == null && this.q != null && A()) {
            return;
        }
        android.graphics.drawable.Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
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
            getLayoutParams().width = (int) (this.i + 0.0f);
        }
        setPaddingRelative(this.C + i, getPaddingTop(), this.D - i, getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (r()) {
            defpackage.wva.f(this, this.e.a(false));
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

    @Override // defpackage.iy, android.view.View
    public final void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(f());
        accessibilityEvent.setChecked(this.x);
    }

    @Override // defpackage.iy, android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
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
            if (getParent() instanceof wng) {
                getParent();
                throw null;
            }
        }
        boolean z2 = false;
        if (this.m == Integer.MIN_VALUE) {
            android.graphics.drawable.Drawable drawable = this.n;
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
        if ((getParent() instanceof wng) && getParent().getOrientation() == 0) {
            z2 = true;
        }
        this.l = z2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.google.android.material.button.MaterialButton.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.google.android.material.button.MaterialButton.SavedState savedState = (com.google.android.material.button.MaterialButton.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        h(savedState.a);
    }

    @Override // android.widget.TextView, android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
        com.google.android.material.button.MaterialButton.SavedState savedState = new com.google.android.material.button.MaterialButton.SavedState(super.onSaveInstanceState());
        savedState.a = this.x;
        return savedState;
    }

    @Override // android.widget.TextView
    protected final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        y(getMeasuredWidth(), getMeasuredHeight());
        z(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void p(boolean z) {
        android.graphics.drawable.Drawable drawable = this.q;
        if (drawable != null) {
            android.graphics.drawable.Drawable drawableMutate = drawable.mutate();
            this.q = drawableMutate;
            drawableMutate.setTintList(this.p);
            android.graphics.PorterDuff.Mode mode = this.o;
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
            android.graphics.drawable.Drawable drawable2 = this.q;
            int i = this.v;
            int i2 = this.w;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.q.setVisible(true, z);
        }
        android.graphics.drawable.Drawable drawable3 = this.q;
        if (drawable3 != null && this.n != null && A()) {
            throw new java.lang.IllegalArgumentException("secondaryIconGravity cannot have the same alignment as iconGravity");
        }
        if (drawable3 == null) {
            if (this.r) {
                return;
            }
            if (this.n != null && A()) {
                return;
            }
        }
        android.graphics.drawable.Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
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
        defpackage.wnh wnhVar = this.e;
        return wnhVar != null && wnhVar.p;
    }

    public final boolean r() {
        defpackage.wnh wnhVar = this.e;
        return (wnhVar == null || wnhVar.o) ? false : true;
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
        k(defpackage.duw.d(getContext(), 2131102535));
    }

    @Override // android.view.View
    public final void setBackground(android.graphics.drawable.Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (!r()) {
            super.setBackgroundColor(i);
            return;
        }
        defpackage.wnh wnhVar = this.e;
        if (wnhVar.a(false) != null) {
            wnhVar.a(false).setTint(i);
        }
    }

    @Override // defpackage.iy, android.view.View
    public final void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        if (!r()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            android.util.Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.e.b();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // defpackage.iy, android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? defpackage.ca.e(getContext(), i) : null);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        l(colorStateList);
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
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
    public void setText(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        this.i = -2.1474836E9f;
        super.setText(charSequence, bufferType);
    }

    @Override // android.view.View
    public final void setTextAlignment(int i) {
        super.setTextAlignment(i);
        y(getMeasuredWidth(), getMeasuredHeight());
        z(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // defpackage.iy, android.widget.TextView
    public final void setTextAppearance(android.content.Context context, int i) {
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

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.button.MaterialButton.SavedState> CREATOR = new wmw(2);
        boolean a;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.a = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
        }

        public SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MaterialButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130969871);
    }

    public MaterialButton(android.content.Context context) {
        this(context, null);
    }
}
