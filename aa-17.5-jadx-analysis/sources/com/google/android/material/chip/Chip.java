package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.material.focus.FocusRingDrawable;
import defpackage.ebm;
import defpackage.eyj;
import defpackage.iy;
import defpackage.wmt;
import defpackage.wmu;
import defpackage.wmv;
import defpackage.wmw;
import defpackage.wmx;
import defpackage.wmy;
import defpackage.wmz;
import defpackage.woy;
import defpackage.wqr;
import defpackage.wte;
import defpackage.wtf;
import defpackage.wtg;
import defpackage.wub;
import defpackage.wuk;
import defpackage.wuv;
import defpackage.wxp;

/* loaded from: classes3.dex */
public class Chip extends iy implements Checkable, wmw, wuv {
    private static final int g = 2132151447;
    public wmx c;
    public CompoundButton.OnCheckedChangeListener d;
    public boolean e;
    public final Rect f;
    private InsetDrawable j;
    private RippleDrawable k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private final RectF r;
    private final wtf s;
    public static final Rect b = new Rect();
    private static final int[] h = {R.attr.state_selected};
    private static final int[] i = {R.attr.state_checkable};

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i2) throws Resources.NotFoundException {
        int i3 = g;
        super(wxp.a(context, attributeSet, i2, i3), attributeSet, i2);
        this.f = new Rect();
        this.r = new RectF();
        this.s = new wmt(this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        wmx wmxVarG = wmx.g(context2, attributeSet, i2, i3);
        int[] iArr = wmz.a;
        TypedArray typedArrayA = wqr.a(context2, attributeSet, iArr, i2, i3, new int[0]);
        this.o = typedArrayA.getBoolean(33, false);
        Resources.Theme theme = context2.getTheme();
        TypedValue typedValueX = woy.x(theme, com.google.android.projection.gearhead.R.attr.minTouchTargetSize);
        int i4 = 5;
        float dimension = Float.NaN;
        if (typedValueX != null && typedValueX.type == 5) {
            dimension = typedValueX.getDimension(theme.getResources().getDisplayMetrics());
        }
        this.q = (int) Math.ceil(typedArrayA.getDimension(21, Float.isNaN(dimension) ? (int) context2.getResources().getDimension(com.google.android.projection.gearhead.R.dimen.mtrl_min_touch_target_size) : (int) dimension));
        typedArrayA.recycle();
        wmx wmxVar = this.c;
        byte[] bArr = null;
        if (wmxVar != wmxVarG) {
            if (wmxVar != null) {
                wmxVar.n(null);
            }
            this.c = wmxVarG;
            wmxVarG.n = false;
            wmxVarG.n(this);
            h(this.q);
        }
        wmxVarG.N(getElevation());
        TypedArray typedArrayA2 = wqr.a(context2, attributeSet, iArr, i2, i3, new int[0]);
        boolean zHasValue = typedArrayA2.hasValue(39);
        typedArrayA2.recycle();
        new wmv(this, this);
        f();
        ebm.o(this, null);
        if (!zHasValue) {
            setOutlineProvider(new wmu(this));
        }
        setChecked(this.l);
        setText(wmxVarG.d);
        setEllipsize(wmxVarG.m);
        n();
        if (!this.c.n) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m();
        if (this.o) {
            setMinHeight(this.q);
        }
        this.p = getLayoutDirection();
        super.setOnCheckedChangeListener(new eyj(this, i4, bArr));
    }

    private final void i() {
        if (this.j != null) {
            this.j = null;
            setMinWidth(0);
            wmx wmxVar = this.c;
            setMinHeight((int) (wmxVar != null ? wmxVar.b : BitmapDescriptorFactory.HUE_RED));
            l();
        }
    }

    private final void j(boolean z) {
        if (this.n != z) {
            this.n = z;
            refreshDrawableState();
        }
    }

    private final void k(boolean z) {
        if (this.m != z) {
            this.m = z;
            refreshDrawableState();
        }
    }

    private final void l() {
        RippleDrawable rippleDrawable = new RippleDrawable(wtg.b(this.c.c), c(), null);
        FocusRingDrawable.c(getContext(), rippleDrawable, this.c);
        this.k = rippleDrawable;
        setBackground(rippleDrawable);
        m();
    }

    private final void m() {
        wmx wmxVar;
        if (TextUtils.isEmpty(getText()) || (wmxVar = this.c) == null) {
            return;
        }
        float fC = wmxVar.k + wmxVar.j + wmxVar.c();
        int iB = (int) (wmxVar.h + wmxVar.i + wmxVar.b());
        int i2 = (int) fC;
        if (this.j != null) {
            Rect rect = new Rect();
            this.j.getPadding(rect);
            iB += rect.left;
            i2 += rect.right;
        }
        setPaddingRelative(iB, getPaddingTop(), i2, getPaddingBottom());
    }

    private final void n() {
        TextPaint paint = getPaint();
        wmx wmxVar = this.c;
        if (wmxVar != null) {
            paint.drawableState = wmxVar.getState();
        }
        wmx wmxVar2 = this.c;
        wte wteVarH = wmxVar2 != null ? wmxVar2.h() : null;
        if (wteVarH != null) {
            wteVarH.c(getContext(), paint, this.s);
        }
    }

    public final RectF b() {
        RectF rectF = this.r;
        rectF.setEmpty();
        f();
        return rectF;
    }

    public final Drawable c() {
        InsetDrawable insetDrawable = this.j;
        return insetDrawable == null ? this.c : insetDrawable;
    }

    @Override // defpackage.wuv
    public final void d(wuk wukVar) {
        this.c.d(wukVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    @Override // defpackage.iy, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        wmx wmxVar = this.c;
        if (wmxVar == null || !wmx.r(wmxVar.f)) {
            return;
        }
        wmx wmxVar2 = this.c;
        ?? IsEnabled = isEnabled();
        int i2 = IsEnabled;
        if (this.e) {
            i2 = IsEnabled + 1;
        }
        int i3 = i2;
        if (this.n) {
            i3 = i2 + 1;
        }
        int i4 = i3;
        if (this.m) {
            i4 = i3 + 1;
        }
        int i5 = i4;
        if (isChecked()) {
            i5 = i4 + 1;
        }
        int[] iArr = new int[i5];
        int i6 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i6 = 1;
        }
        if (this.e) {
            iArr[i6] = 16842908;
            i6++;
        }
        if (this.n) {
            iArr[i6] = 16843623;
            i6++;
        }
        if (this.m) {
            iArr[i6] = 16842919;
            i6++;
        }
        if (isChecked()) {
            iArr[i6] = 16842913;
        }
        if (wmxVar2.s(iArr)) {
            invalidate();
        }
    }

    @Override // defpackage.wmw
    public final void e() {
        h(this.q);
        requestLayout();
        invalidateOutline();
    }

    public final boolean f() {
        wmx wmxVar = this.c;
        return (wmxVar == null || wmxVar.f() == null) ? false : true;
    }

    @Override // defpackage.wuv
    public final wuk fD() {
        throw null;
    }

    public final boolean g() {
        wmx wmxVar = this.c;
        return wmxVar != null && wmxVar.g;
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(null)) {
            return null;
        }
        if (!g()) {
            return !isClickable() ? "android.view.View" : "android.widget.Button";
        }
        ViewParent parent = getParent();
        if (!(parent instanceof wmy)) {
            return "android.widget.Button";
        }
        throw null;
    }

    @Override // android.widget.TextView
    public final TextUtils.TruncateAt getEllipsize() {
        wmx wmxVar = this.c;
        if (wmxVar != null) {
            return wmxVar.m;
        }
        return null;
    }

    @Override // android.widget.TextView
    public final String getFontVariationSettings() {
        wmx wmxVar = this.c;
        if (wmxVar == null) {
            return super.getFontVariationSettings();
        }
        wte wteVarH = wmxVar.h();
        if (wteVarH != null) {
            return wteVarH.c;
        }
        return null;
    }

    public final void h(int i2) {
        this.q = i2;
        if (!this.o) {
            if (this.j != null) {
                i();
                return;
            } else {
                l();
                return;
            }
        }
        int iMax = Math.max(0, i2 - this.c.getIntrinsicHeight());
        int iMax2 = Math.max(0, i2 - this.c.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.j != null) {
                i();
                return;
            } else {
                l();
                return;
            }
        }
        int i3 = iMax2 > 0 ? iMax2 >> 1 : 0;
        int i4 = iMax > 0 ? iMax >> 1 : 0;
        if (this.j != null) {
            Rect rect = new Rect();
            this.j.getPadding(rect);
            if (rect.top == i4 && rect.bottom == i4 && rect.left == i3 && rect.right == i3) {
                l();
                return;
            }
        }
        if (getMinHeight() != i2) {
            setMinHeight(i2);
        }
        if (getMinWidth() != i2) {
            setMinWidth(i2);
        }
        this.j = new InsetDrawable((Drawable) this.c, i3, i4, i3, i4);
        l();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wub.e(this, this.c);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, h);
        }
        if (g()) {
            mergeDrawableStates(iArrOnCreateDrawableState, i);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            j(b().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            j(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(g());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof wmy) {
            throw null;
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        return (b().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i2);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        if (this.p != i2) {
            this.p = i2;
            m();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048 A[RETURN] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.b()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3b
            if (r0 == r2) goto L2d
            r4 = 2
            if (r0 == r4) goto L23
            r1 = 3
            if (r0 == r1) goto L21
            goto L41
        L21:
            r0 = r3
            goto L35
        L23:
            boolean r0 = r5.m
            if (r0 == 0) goto L41
            if (r1 != 0) goto L47
            r5.k(r3)
            return r2
        L2d:
            boolean r0 = r5.m
            if (r0 == 0) goto L21
            r5.playSoundEffect(r3)
            r0 = r2
        L35:
            r5.k(r3)
            if (r0 != 0) goto L47
            goto L41
        L3b:
            if (r1 == 0) goto L41
            r5.k(r2)
            goto L47
        L41:
            boolean r5 = super.onTouchEvent(r6)
            if (r5 == 0) goto L48
        L47:
            return r2
        L48:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        if (drawable == c() || drawable == this.k) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i2) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // defpackage.iy, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (drawable == c() || drawable == this.k) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // defpackage.iy, android.view.View
    public final void setBackgroundResource(int i2) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        wmx wmxVar = this.c;
        if (wmxVar == null) {
            this.l = z;
        } else if (wmxVar.g) {
            super.setChecked(z);
        }
    }

    @Override // defpackage.iy, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(null, drawable2, null, drawable4);
    }

    @Override // defpackage.iy, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(null, drawable2, null, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(0, i3, 0, i5);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(0, i3, 0, i5);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        wmx wmxVar = this.c;
        if (wmxVar != null) {
            wmxVar.N(f);
        }
    }

    @Override // android.widget.TextView
    public final void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.c == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        wmx wmxVar = this.c;
        if (wmxVar != null) {
            wmxVar.m = truncateAt;
        }
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        super.setFontVariationSettings(str);
        wmx wmxVar = this.c;
        if (wmxVar == null) {
            return false;
        }
        wte wteVarH = wmxVar.h();
        if (wteVarH != null) {
            wteVarH.c = str;
        }
        n();
        return true;
    }

    @Override // android.widget.TextView
    public final void setGravity(int i2) {
        if (i2 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(8388627);
        }
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i2) {
        if (this.c == null) {
            return;
        }
        super.setLayoutDirection(i2);
    }

    @Override // android.widget.TextView
    public final void setLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i2);
    }

    @Override // android.widget.TextView
    public final void setMaxLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i2);
    }

    @Override // android.widget.TextView
    public final void setMaxWidth(int i2) {
        super.setMaxWidth(i2);
        wmx wmxVar = this.c;
        if (wmxVar != null) {
            wmxVar.o = i2;
        }
    }

    @Override // android.widget.TextView
    public final void setMinLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i2);
    }

    @Override // android.widget.CompoundButton
    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.d = onCheckedChangeListener;
    }

    @Override // android.widget.TextView
    public final void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(true);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        wmx wmxVar = this.c;
        if (wmxVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(true != wmxVar.n ? charSequence : null, bufferType);
        wmx wmxVar2 = this.c;
        if (wmxVar2 != null) {
            wmxVar2.o(charSequence);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        wmx wmxVar = this.c;
        if (wmxVar != null) {
            wmxVar.q(i2);
        }
        n();
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f) {
        super.setTextSize(i2, f);
        wmx wmxVar = this.c;
        if (wmxVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i2, f, getResources().getDisplayMetrics());
            wte wteVarH = wmxVar.h();
            if (wteVarH != null) {
                wteVarH.l = fApplyDimension;
                wmxVar.l.a.setTextSize(fApplyDimension);
                wmxVar.j();
            }
        }
        n();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        wmx wmxVar = this.c;
        if (wmxVar != null) {
            wmxVar.q(i2);
        }
        n();
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, drawable2, (Drawable) null, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable2, (Drawable) null, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.projection.gearhead.R.attr.chipStyle);
    }

    public Chip(Context context) {
        this(context, null);
    }
}
