package android.support.v7.widget;

/* JADX INFO: loaded from: classes2.dex */
public class SwitchCompat extends android.widget.CompoundButton {
    private static final android.util.Property m = new defpackage.nd(java.lang.Float.class);
    private static final int[] n = {android.R.attr.state_checked};
    private float A;
    private float B;
    private android.view.VelocityTracker C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private final android.text.TextPaint L;
    private android.content.res.ColorStateList M;
    private android.text.Layout N;
    private android.text.Layout O;
    private android.text.method.TransformationMethod P;
    private final defpackage.jx Q;
    private final android.graphics.Rect R;
    private defpackage.bil S;
    public android.graphics.drawable.Drawable a;
    public android.content.res.ColorStateList b;
    public android.graphics.PorterDuff.Mode c;
    public boolean d;
    public android.graphics.drawable.Drawable e;
    public android.content.res.ColorStateList f;
    public android.graphics.PorterDuff.Mode g;
    public boolean h;
    public int i;
    public float j;
    public boolean k;
    android.animation.ObjectAnimator l;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private boolean s;
    private java.lang.CharSequence t;
    private java.lang.CharSequence u;
    private java.lang.CharSequence v;
    private java.lang.CharSequence w;
    private boolean x;
    private int y;
    private int z;

    public SwitchCompat(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        android.graphics.Typeface typeface;
        super(context, attributeSet, i);
        this.b = null;
        this.c = null;
        this.d = false;
        this.o = false;
        this.f = null;
        this.g = null;
        this.h = false;
        this.p = false;
        this.C = android.view.VelocityTracker.obtain();
        this.k = true;
        this.R = new android.graphics.Rect();
        defpackage.ne.d(this, getContext());
        android.text.TextPaint textPaint = new android.text.TextPaint(1);
        this.L = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = defpackage.ft.w;
        defpackage.lam lamVarC = defpackage.lam.C(context, attributeSet, iArr, i, 0);
        defpackage.ebt.m(this, context, iArr, attributeSet, (android.content.res.TypedArray) lamVarC.a, i, 0);
        android.graphics.drawable.Drawable drawableS = lamVarC.s(2);
        this.a = drawableS;
        if (drawableS != null) {
            drawableS.setCallback(this);
        }
        android.graphics.drawable.Drawable drawableS2 = lamVarC.s(11);
        this.e = drawableS2;
        if (drawableS2 != null) {
            drawableS2.setCallback(this);
        }
        g(lamVarC.u(0));
        f(lamVarC.u(1));
        this.x = lamVarC.x(3, true);
        this.q = lamVarC.m(8, 0);
        this.i = lamVarC.m(5, 0);
        this.r = lamVarC.m(6, 0);
        this.s = lamVarC.x(4, false);
        android.content.res.ColorStateList colorStateListR = lamVarC.r(9);
        if (colorStateListR != null) {
            this.b = colorStateListR;
            this.d = true;
        }
        int iN = lamVarC.n(10, -1);
        android.graphics.Rect rect = defpackage.kp.a;
        android.graphics.PorterDuff.Mode modeQ = defpackage.a.Q(iN, null);
        if (this.c != modeQ) {
            this.c = modeQ;
            this.o = true;
        }
        if (this.d || this.o) {
            a();
        }
        android.content.res.ColorStateList colorStateListR2 = lamVarC.r(12);
        if (colorStateListR2 != null) {
            this.f = colorStateListR2;
            this.h = true;
        }
        android.graphics.PorterDuff.Mode modeQ2 = defpackage.a.Q(lamVarC.n(13, -1), null);
        if (this.g != modeQ2) {
            this.g = modeQ2;
            this.p = true;
        }
        if (this.h || this.p) {
            b();
        }
        int iQ = lamVarC.q(7, 0);
        if (iQ != 0) {
            defpackage.lam lamVar = new defpackage.lam(context, context.obtainStyledAttributes(iQ, defpackage.ft.x));
            android.content.res.ColorStateList colorStateListR3 = lamVar.r(3);
            if (colorStateListR3 != null) {
                this.M = colorStateListR3;
            } else {
                this.M = getTextColors();
            }
            int iM = lamVar.m(0, 0);
            if (iM != 0) {
                float f = iM;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int iN2 = lamVar.n(1, -1);
            int iN3 = lamVar.n(2, -1);
            if (iN2 == 1) {
                typeface = android.graphics.Typeface.SANS_SERIF;
            } else if (iN2 != 2) {
                typeface = iN2 != 3 ? null : android.graphics.Typeface.MONOSPACE;
            } else {
                typeface = android.graphics.Typeface.SERIF;
            }
            float f2 = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
            if (iN3 > 0) {
                android.graphics.Typeface typefaceDefaultFromStyle = typeface == null ? android.graphics.Typeface.defaultFromStyle(iN3) : android.graphics.Typeface.create(typeface, iN3);
                e(typefaceDefaultFromStyle);
                int i2 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & iN3;
                textPaint.setFakeBoldText(1 == (i2 & 1));
                textPaint.setTextSkewX((2 & i2) != 0 ? -0.25f : f2);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
                e(typeface);
            }
            if (lamVar.x(14, false)) {
                this.P = new defpackage.gb(getContext());
            } else {
                this.P = null;
            }
            g(this.t);
            f(this.v);
            lamVar.w();
        }
        defpackage.jx jxVar = new defpackage.jx(this);
        this.Q = jxVar;
        jxVar.c(attributeSet, i);
        lamVarC.w();
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.z = viewConfiguration.getScaledTouchSlop();
        this.D = viewConfiguration.getScaledMinimumFlingVelocity();
        o().I(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private final int i() {
        boolean zL = defpackage.ca.l(this);
        float f = this.j;
        if (zL) {
            f = 1.0f - f;
        }
        return (int) ((f * j()) + 0.5f);
    }

    private final int j() {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable == null) {
            return 0;
        }
        android.graphics.Rect rect = this.R;
        drawable.getPadding(rect);
        android.graphics.drawable.Drawable drawable2 = this.a;
        android.graphics.Rect rectA = drawable2 != null ? defpackage.kp.a(drawable2) : defpackage.kp.a;
        return ((((this.E - this.G) - rect.left) - rect.right) - rectA.left) - rectA.right;
    }

    private final android.text.Layout k(java.lang.CharSequence charSequence) {
        return new android.text.StaticLayout(charSequence, this.L, charSequence != null ? (int) java.lang.Math.ceil(android.text.Layout.getDesiredWidth(charSequence, this.L)) : 0, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, true);
    }

    private final java.lang.CharSequence l(java.lang.CharSequence charSequence) {
        java.lang.Object obj = o().b;
        android.text.method.TransformationMethod transformationMethod = this.P;
        defpackage.emx emxVar = defpackage.emx.b;
        return transformationMethod != null ? transformationMethod.getTransformation(charSequence, this) : charSequence;
    }

    private final void m() {
        if (((defpackage.enf) ((defpackage.kwv) this.S.b).a).a.a) {
            defpackage.emx emxVar = defpackage.emx.b;
        }
    }

    private final boolean n() {
        return this.j > 0.5f;
    }

    private final defpackage.bil o() {
        defpackage.bil bilVar = this.S;
        if (bilVar != null) {
            return bilVar;
        }
        defpackage.bil bilVar2 = new defpackage.bil((android.widget.TextView) this);
        this.S = bilVar2;
        return bilVar2;
    }

    public final void a() {
        android.graphics.drawable.Drawable drawable = this.a;
        if (drawable != null) {
            if (this.d || this.o) {
                android.graphics.drawable.Drawable drawableMutate = drawable.mutate();
                this.a = drawableMutate;
                if (this.d) {
                    drawableMutate.setTintList(this.b);
                }
                if (this.o) {
                    this.a.setTintMode(this.c);
                }
                if (this.a.isStateful()) {
                    this.a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            if (this.h || this.p) {
                android.graphics.drawable.Drawable drawableMutate = drawable.mutate();
                this.e = drawableMutate;
                if (this.h) {
                    drawableMutate.setTintList(this.f);
                }
                if (this.p) {
                    this.e.setTintMode(this.g);
                }
                if (this.e.isStateful()) {
                    this.e.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            java.lang.CharSequence string = this.v;
            if (string == null) {
                string = getResources().getString(com.google.android.projection.gearhead.R.string.abc_capital_off);
            }
            defpackage.ebt.r(this, string);
        }
    }

    public final void d() {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            java.lang.CharSequence string = this.t;
            if (string == null) {
                string = getResources().getString(com.google.android.projection.gearhead.R.string.abc_capital_on);
            }
            defpackage.ebt.r(this, string);
        }
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        int i;
        int i2;
        int i3 = this.H;
        int i4 = this.I;
        int i5 = this.J;
        int i6 = this.K;
        int i7 = i() + i3;
        android.graphics.drawable.Drawable drawable = this.a;
        android.graphics.Rect rectA = drawable != null ? defpackage.kp.a(drawable) : defpackage.kp.a;
        android.graphics.Rect rect = this.R;
        android.graphics.drawable.Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i7 += rect.left;
            if (rectA != null) {
                if (rectA.left > rect.left) {
                    i3 += rectA.left - rect.left;
                }
                i = rectA.top > rect.top ? (rectA.top - rect.top) + i4 : i4;
                if (rectA.right > rect.right) {
                    i5 -= rectA.right - rect.right;
                }
                if (rectA.bottom > rect.bottom) {
                    i2 = i6 - (rectA.bottom - rect.bottom);
                }
                this.e.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.e.setBounds(i3, i, i5, i2);
        }
        android.graphics.drawable.Drawable drawable3 = this.a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i8 = i7 - rect.left;
            int i9 = i7 + this.G + rect.right;
            this.a.setBounds(i8, i4, i9, i6);
            android.graphics.drawable.Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i8, i4, i9, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        android.graphics.drawable.Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        android.graphics.drawable.Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        android.graphics.drawable.Drawable drawable = this.a;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = drawable.setState(drawableState);
        }
        android.graphics.drawable.Drawable drawable2 = this.e;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(android.graphics.Typeface typeface) {
        android.text.TextPaint textPaint = this.L;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public final void f(java.lang.CharSequence charSequence) {
        this.v = charSequence;
        this.w = l(charSequence);
        this.O = null;
        if (this.x) {
            m();
        }
    }

    public final void g(java.lang.CharSequence charSequence) {
        this.t = charSequence;
        this.u = l(charSequence);
        this.N = null;
        if (this.x) {
            m();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingLeft() {
        if (!defpackage.ca.l(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.E;
        return !android.text.TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.r : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingRight() {
        if (defpackage.ca.l(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.E;
        return !android.text.TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.r : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public final android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
        android.view.ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        defpackage.dtf.d(customSelectionActionModeCallback);
        return customSelectionActionModeCallback;
    }

    public final void h(float f) {
        this.j = f;
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        android.graphics.drawable.Drawable drawable = this.a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        android.graphics.drawable.Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        android.animation.ObjectAnimator objectAnimator = this.l;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.l.end();
        this.l = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, n);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(android.graphics.Canvas canvas) {
        int width;
        super.onDraw(canvas);
        android.graphics.drawable.Drawable drawable = this.e;
        android.graphics.Rect rect = this.R;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.I;
        int i2 = this.K;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        android.graphics.drawable.Drawable drawable2 = this.a;
        if (drawable != null) {
            if (!this.s || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                android.graphics.Rect rectA = defpackage.kp.a(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectA.left;
                rect.right -= rectA.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, android.graphics.Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        android.text.Layout layout = n() ? this.N : this.O;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            android.content.res.ColorStateList colorStateList = this.M;
            if (colorStateList != null) {
                this.L.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.L.drawableState = drawableState;
            if (drawable2 != null) {
                android.graphics.Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (android.os.Build.VERSION.SDK_INT < 30) {
            java.lang.CharSequence charSequence = isChecked() ? this.t : this.v;
            if (android.text.TextUtils.isEmpty(charSequence)) {
                return;
            }
            java.lang.CharSequence text = accessibilityNodeInfo.getText();
            if (android.text.TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int width;
        int paddingLeft;
        int i5;
        int paddingTop;
        int height;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.a != null) {
            android.graphics.Rect rect = this.R;
            android.graphics.drawable.Drawable drawable = this.e;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            android.graphics.Rect rectA = defpackage.kp.a(this.a);
            iMax = java.lang.Math.max(0, rectA.left - rect.left);
            iMax2 = java.lang.Math.max(0, rectA.right - rect.right);
        } else {
            iMax = 0;
        }
        if (defpackage.ca.l(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.E + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.E) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                paddingTop = getPaddingTop();
                i5 = this.F;
            } else {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.F;
            }
            this.H = paddingLeft;
            this.I = paddingTop;
            this.K = height;
            this.J = width;
        }
        int paddingTop2 = (getPaddingTop() + getHeight()) - getPaddingBottom();
        i5 = this.F;
        paddingTop = (paddingTop2 / 2) - (i5 / 2);
        height = i5 + paddingTop;
        this.H = paddingLeft;
        this.I = paddingTop;
        this.K = height;
        this.J = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int i3;
        if (this.x) {
            if (this.N == null) {
                this.N = k(this.u);
            }
            if (this.O == null) {
                this.O = k(this.w);
            }
        }
        android.graphics.Rect rect = this.R;
        android.graphics.drawable.Drawable drawable = this.a;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.x) {
            int iMax = java.lang.Math.max(this.N.getWidth(), this.O.getWidth());
            int i4 = this.q;
            i3 = iMax + i4 + i4;
        } else {
            i3 = 0;
        }
        this.G = java.lang.Math.max(i3, intrinsicWidth);
        android.graphics.drawable.Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.e.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        android.graphics.drawable.Drawable drawable3 = this.a;
        if (drawable3 != null) {
            android.graphics.Rect rectA = defpackage.kp.a(drawable3);
            iMax2 = java.lang.Math.max(iMax2, rectA.left);
            iMax3 = java.lang.Math.max(iMax3, rectA.right);
        }
        boolean z = this.k;
        int iMax4 = this.i;
        if (z) {
            int i5 = this.G;
            iMax4 = java.lang.Math.max(iMax4, i5 + i5 + iMax2 + iMax3);
        }
        int iMax5 = java.lang.Math.max(intrinsicHeight2, intrinsicHeight);
        this.E = iMax4;
        this.F = iMax5;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        java.lang.CharSequence charSequence = isChecked() ? this.t : this.v;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00da  */
    /* JADX WARN: Code duplicated, block: B:64:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f4  */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z;
        boolean zIsChecked;
        boolean zN;
        float xVelocity;
        float f;
        this.C.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            float f2 = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
            if (actionMasked == 1) {
                if (this.y == 2) {
                    this.y = 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        this.C.computeCurrentVelocity(1000);
                        xVelocity = this.C.getXVelocity();
                        if (java.lang.Math.abs(xVelocity) <= this.D) {
                            zN = defpackage.ca.l(this) ? xVelocity > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED : xVelocity < com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
                        } else {
                            zN = n();
                        }
                    } else {
                        zN = zIsChecked;
                    }
                    if (zN != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(zN);
                    android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.y = 0;
                this.C.clear();
            } else if (actionMasked == 2) {
                int i = this.y;
                if (i == 1) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (java.lang.Math.abs(x - this.A) > this.z || java.lang.Math.abs(y - this.B) > this.z) {
                        this.y = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.A = x;
                        this.B = y;
                        return true;
                    }
                } else if (i == 2) {
                    float x2 = motionEvent.getX();
                    int iJ = j();
                    float f3 = x2 - this.A;
                    if (iJ != 0) {
                        f = f3 / iJ;
                    } else {
                        f = f3 > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED ? 1.0f : -1.0f;
                    }
                    if (defpackage.ca.l(this)) {
                        f = -f;
                    }
                    float f4 = this.j;
                    float f5 = f + f4;
                    if (f5 >= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                        f2 = f5 > 1.0f ? 1.0f : f5;
                    }
                    if (f2 != f4) {
                        this.A = x2;
                        h(f2);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.y == 2) {
                    this.y = 0;
                    if (motionEvent.getAction() == 1) {
                        z = false;
                    } else {
                        z = false;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        this.C.computeCurrentVelocity(1000);
                        xVelocity = this.C.getXVelocity();
                        if (java.lang.Math.abs(xVelocity) <= this.D) {
                            zN = n();
                        } else if (defpackage.ca.l(this)) {
                        }
                    } else {
                        zN = zIsChecked;
                    }
                    if (zN != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(zN);
                    android.view.MotionEvent motionEventObtain2 = android.view.MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    super.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.y = 0;
                this.C.clear();
            }
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled() && this.a != null) {
                int i2 = i();
                android.graphics.drawable.Drawable drawable = this.a;
                android.graphics.Rect rect = this.R;
                drawable.getPadding(rect);
                int i3 = this.I;
                int i4 = this.z;
                int i5 = i3 - i4;
                int i6 = (this.H + i2) - i4;
                int i7 = this.G + i6 + rect.left + rect.right;
                int i8 = this.z;
                int i9 = i7 + i8;
                int i10 = this.K + i8;
                if (x3 > i6 && x3 < i9 && y2 > i5 && y2 < i10) {
                    this.y = 1;
                    this.A = x3;
                    this.B = y2;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        o();
        defpackage.emx emxVar = defpackage.emx.b;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            d();
        } else {
            c();
        }
        float f = true != zIsChecked ? com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED : 1.0f;
        if (getWindowToken() == null || !isLaidOut()) {
            android.animation.ObjectAnimator objectAnimator = this.l;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            h(f);
            return;
        }
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<android.support.v7.widget.SwitchCompat, java.lang.Float>) m, f);
        this.l = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.l.setAutoCancel(true);
        this.l.start();
    }

    @Override // android.widget.TextView
    public final void setFilters(android.text.InputFilter[] inputFilterArr) {
        o();
        defpackage.emx emxVar = defpackage.emx.b;
        super.setFilters(inputFilterArr);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a || drawable == this.e;
    }

    public SwitchCompat(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.projection.gearhead.R.attr.switchStyle);
    }

    public SwitchCompat(android.content.Context context) {
        this(context, null);
    }
}
