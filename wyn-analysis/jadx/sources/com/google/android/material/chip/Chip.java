package com.google.android.material.chip;

import Ba.c;
import E4.F;
import Fe.g;
import R7.b;
import R7.d;
import R7.e;
import R7.f;
import W7.i;
import W7.k;
import a8.AbstractC1340a;
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
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import c1.InterfaceC1545a;
import c8.C1587k;
import c8.u;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.unity3d.services.UnityAdsConstants;
import h8.a;
import i1.C2840b;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;
import k1.J;
import k1.S;

/* loaded from: classes4.dex */
public class Chip extends AppCompatCheckBox implements e, u, Checkable {

    /* renamed from: w, reason: collision with root package name */
    public static final Rect f26869w = new Rect();

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f26870x = {R.attr.state_selected};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f26871y = {R.attr.state_checkable};

    /* renamed from: e, reason: collision with root package name */
    public f f26872e;

    /* renamed from: f, reason: collision with root package name */
    public InsetDrawable f26873f;

    /* renamed from: g, reason: collision with root package name */
    public RippleDrawable f26874g;

    /* renamed from: h, reason: collision with root package name */
    public View.OnClickListener f26875h;

    /* renamed from: i, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f26876i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f26877j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f26878l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f26879m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f26880n;

    /* renamed from: o, reason: collision with root package name */
    public int f26881o;

    /* renamed from: p, reason: collision with root package name */
    public int f26882p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f26883q;

    /* renamed from: r, reason: collision with root package name */
    public final d f26884r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f26885s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f26886t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f26887u;

    /* renamed from: v, reason: collision with root package name */
    public final b f26888v;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(a.a(context, attributeSet, com.wynauto.wyn.R.attr.chipStyle, com.wynauto.wyn.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.wynauto.wyn.R.attr.chipStyle);
        this.f26886t = new Rect();
        this.f26887u = new RectF();
        this.f26888v = new b(this, 0);
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
        f fVar = new f(context2, attributeSet);
        int[] iArr = I7.a.f5400b;
        TypedArray typedArrayF = k.f(fVar.f10411e0, attributeSet, iArr, com.wynauto.wyn.R.attr.chipStyle, com.wynauto.wyn.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        fVar.f10386E0 = typedArrayF.hasValue(37);
        Context context3 = fVar.f10411e0;
        ColorStateList colorStateListW = c.w(context3, typedArrayF, 24);
        if (fVar.f10429x != colorStateListW) {
            fVar.f10429x = colorStateListW;
            fVar.onStateChange(fVar.getState());
        }
        ColorStateList colorStateListW2 = c.w(context3, typedArrayF, 11);
        if (fVar.f10431y != colorStateListW2) {
            fVar.f10431y = colorStateListW2;
            fVar.onStateChange(fVar.getState());
        }
        float dimension = typedArrayF.getDimension(19, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (fVar.f10433z != dimension) {
            fVar.f10433z = dimension;
            fVar.invalidateSelf();
            fVar.u();
        }
        if (typedArrayF.hasValue(12)) {
            fVar.A(typedArrayF.getDimension(12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        }
        fVar.F(c.w(context3, typedArrayF, 22));
        fVar.G(typedArrayF.getDimension(23, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        fVar.P(c.w(context3, typedArrayF, 36));
        String text = typedArrayF.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(fVar.f10385E, text)) {
            fVar.f10385E = text;
            fVar.f10417k0.f15273d = true;
            fVar.invalidateSelf();
            fVar.u();
        }
        Z7.d dVar = (!typedArrayF.hasValue(0) || (resourceId3 = typedArrayF.getResourceId(0, 0)) == 0) ? null : new Z7.d(context3, resourceId3);
        dVar.k = typedArrayF.getDimension(1, dVar.k);
        fVar.Q(dVar);
        int i5 = typedArrayF.getInt(3, 0);
        if (i5 == 1) {
            fVar.B0 = TextUtils.TruncateAt.START;
        } else if (i5 == 2) {
            fVar.B0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i5 == 3) {
            fVar.B0 = TextUtils.TruncateAt.END;
        }
        fVar.E(typedArrayF.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            fVar.E(typedArrayF.getBoolean(15, false));
        }
        fVar.B(c.z(context3, typedArrayF, 14));
        if (typedArrayF.hasValue(17)) {
            fVar.D(c.w(context3, typedArrayF, 17));
        }
        fVar.C(typedArrayF.getDimension(16, -1.0f));
        fVar.M(typedArrayF.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            fVar.M(typedArrayF.getBoolean(26, false));
        }
        fVar.H(c.z(context3, typedArrayF, 25));
        fVar.L(c.w(context3, typedArrayF, 30));
        fVar.J(typedArrayF.getDimension(28, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        fVar.w(typedArrayF.getBoolean(6, false));
        fVar.z(typedArrayF.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            fVar.z(typedArrayF.getBoolean(8, false));
        }
        fVar.x(c.z(context3, typedArrayF, 7));
        if (typedArrayF.hasValue(9)) {
            fVar.y(c.w(context3, typedArrayF, 9));
        }
        fVar.f10401U = (!typedArrayF.hasValue(39) || (resourceId2 = typedArrayF.getResourceId(39, 0)) == 0) ? null : J7.b.a(context3, resourceId2);
        fVar.f10402V = (!typedArrayF.hasValue(33) || (resourceId = typedArrayF.getResourceId(33, 0)) == 0) ? null : J7.b.a(context3, resourceId);
        float dimension2 = typedArrayF.getDimension(21, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (fVar.f10403W != dimension2) {
            fVar.f10403W = dimension2;
            fVar.invalidateSelf();
            fVar.u();
        }
        fVar.O(typedArrayF.getDimension(35, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        fVar.N(typedArrayF.getDimension(34, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        float dimension3 = typedArrayF.getDimension(41, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (fVar.f10406Z != dimension3) {
            fVar.f10406Z = dimension3;
            fVar.invalidateSelf();
            fVar.u();
        }
        float dimension4 = typedArrayF.getDimension(40, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (fVar.f10407a0 != dimension4) {
            fVar.f10407a0 = dimension4;
            fVar.invalidateSelf();
            fVar.u();
        }
        fVar.K(typedArrayF.getDimension(29, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        fVar.I(typedArrayF.getDimension(27, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        float dimension5 = typedArrayF.getDimension(13, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (fVar.f10410d0 != dimension5) {
            fVar.f10410d0 = dimension5;
            fVar.invalidateSelf();
            fVar.u();
        }
        fVar.f10384D0 = typedArrayF.getDimensionPixelSize(4, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
        typedArrayF.recycle();
        k.a(context2, attributeSet, com.wynauto.wyn.R.attr.chipStyle, com.wynauto.wyn.R.style.Widget_MaterialComponents_Chip_Action);
        k.b(context2, attributeSet, iArr, com.wynauto.wyn.R.attr.chipStyle, com.wynauto.wyn.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.wynauto.wyn.R.attr.chipStyle, com.wynauto.wyn.R.style.Widget_MaterialComponents_Chip_Action);
        this.f26880n = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.f26882p = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(fVar);
        fVar.i(J.e(this));
        k.a(context2, attributeSet, com.wynauto.wyn.R.attr.chipStyle, com.wynauto.wyn.R.style.Widget_MaterialComponents_Chip_Action);
        k.b(context2, attributeSet, iArr, com.wynauto.wyn.R.attr.chipStyle, com.wynauto.wyn.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.wynauto.wyn.R.attr.chipStyle, com.wynauto.wyn.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.f26884r = new d(this, this);
        d();
        if (!zHasValue) {
            setOutlineProvider(new R7.c(this));
        }
        setChecked(this.f26877j);
        setText(fVar.f10385E);
        setEllipsize(fVar.B0);
        g();
        if (!this.f26872e.f10382C0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.f26880n) {
            setMinHeight(this.f26882p);
        }
        this.f26881o = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: R7.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f10371a.f26876i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z2);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f26887u;
        rectF.setEmpty();
        if (c() && this.f26875h != null) {
            f fVar = this.f26872e;
            Rect bounds = fVar.getBounds();
            rectF.setEmpty();
            if (fVar.T()) {
                float f10 = fVar.f10410d0 + fVar.f10409c0 + fVar.f10395O + fVar.f10408b0 + fVar.f10407a0;
                if (fVar.getLayoutDirection() == 0) {
                    float f11 = bounds.right;
                    rectF.right = f11;
                    rectF.left = f11 - f10;
                } else {
                    float f12 = bounds.left;
                    rectF.left = f12;
                    rectF.right = f12 + f10;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i5 = (int) closeIconTouchBounds.left;
        int i10 = (int) closeIconTouchBounds.top;
        int i11 = (int) closeIconTouchBounds.right;
        int i12 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f26886t;
        rect.set(i5, i10, i11, i12);
        return rect;
    }

    private Z7.d getTextAppearance() {
        f fVar = this.f26872e;
        if (fVar != null) {
            return fVar.f10417k0.f15275f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.f26878l != z2) {
            this.f26878l = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.k != z2) {
            this.k = z2;
            refreshDrawableState();
        }
    }

    public final void b(int i5) {
        this.f26882p = i5;
        if (!this.f26880n) {
            InsetDrawable insetDrawable = this.f26873f;
            if (insetDrawable == null) {
                int[] iArr = AbstractC1340a.f17397a;
                e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f26873f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = AbstractC1340a.f17397a;
                    e();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i5 - ((int) this.f26872e.f10433z));
        int iMax2 = Math.max(0, i5 - this.f26872e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f26873f;
            if (insetDrawable2 == null) {
                int[] iArr3 = AbstractC1340a.f17397a;
                e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f26873f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = AbstractC1340a.f17397a;
                    e();
                    return;
                }
                return;
            }
        }
        int i10 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i11 = iMax > 0 ? iMax / 2 : 0;
        if (this.f26873f != null) {
            Rect rect = new Rect();
            this.f26873f.getPadding(rect);
            if (rect.top == i11 && rect.bottom == i11 && rect.left == i10 && rect.right == i10) {
                int[] iArr5 = AbstractC1340a.f17397a;
                e();
                return;
            }
        }
        if (getMinHeight() != i5) {
            setMinHeight(i5);
        }
        if (getMinWidth() != i5) {
            setMinWidth(i5);
        }
        this.f26873f = new InsetDrawable((Drawable) this.f26872e, i10, i11, i10, i11);
        int[] iArr6 = AbstractC1340a.f17397a;
        e();
    }

    public final boolean c() {
        f fVar = this.f26872e;
        if (fVar == null) {
            return false;
        }
        Object obj = fVar.L;
        if (obj == null) {
            obj = null;
        } else if (obj instanceof InterfaceC1545a) {
            obj = null;
        }
        return obj != null;
    }

    public final void d() {
        f fVar;
        if (!c() || (fVar = this.f26872e) == null || !fVar.f10392K || this.f26875h == null) {
            S.m(this, null);
            this.f26885s = false;
        } else {
            S.m(this, this.f26884r);
            this.f26885s = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.f26885s
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchHoverEvent(r10)
            return r10
        L9:
            R7.d r0 = r9.f26884r
            android.view.accessibility.AccessibilityManager r1 = r0.f45594h
            boolean r2 = r1.isEnabled()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L6c
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L1c
            goto L6c
        L1c:
            int r1 = r10.getAction()
            r2 = 256(0x100, float:3.59E-43)
            r5 = 7
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r5) goto L3d
            r5 = 9
            if (r1 == r5) goto L3d
            r5 = 10
            if (r1 == r5) goto L30
            goto L6c
        L30:
            int r1 = r0.f45598m
            if (r1 == r6) goto L6c
            if (r1 != r6) goto L37
            goto L72
        L37:
            r0.f45598m = r6
            r0.q(r1, r2)
            return r3
        L3d:
            float r1 = r10.getX()
            float r5 = r10.getY()
            com.google.android.material.chip.Chip r7 = r0.f10375q
            boolean r8 = r7.c()
            if (r8 == 0) goto L59
            android.graphics.RectF r7 = r7.getCloseIconTouchBounds()
            boolean r1 = r7.contains(r1, r5)
            if (r1 == 0) goto L59
            r1 = r3
            goto L5a
        L59:
            r1 = r4
        L5a:
            int r5 = r0.f45598m
            if (r5 != r1) goto L5f
            goto L69
        L5f:
            r0.f45598m = r1
            r7 = 128(0x80, float:1.8E-43)
            r0.q(r1, r7)
            r0.q(r5, r2)
        L69:
            if (r1 == r6) goto L6c
            goto L72
        L6c:
            boolean r10 = super.dispatchHoverEvent(r10)
            if (r10 == 0) goto L73
        L72:
            return r3
        L73:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.f26885s
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        L9:
            R7.d r0 = r9.f26884r
            r0.getClass()
            int r1 = r10.getAction()
            r2 = 0
            r3 = 1
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r3) goto L9d
            int r1 = r10.getKeyCode()
            r5 = 61
            r6 = 0
            if (r1 == r5) goto L87
            r5 = 66
            if (r1 == r5) goto L58
            switch(r1) {
                case 19: goto L2a;
                case 20: goto L2a;
                case 21: goto L2a;
                case 22: goto L2a;
                case 23: goto L58;
                default: goto L28;
            }
        L28:
            goto L9d
        L2a:
            boolean r7 = r10.hasNoModifiers()
            if (r7 == 0) goto L9d
            r7 = 19
            if (r1 == r7) goto L42
            r7 = 21
            if (r1 == r7) goto L3f
            r7 = 22
            if (r1 == r7) goto L44
            r5 = 130(0x82, float:1.82E-43)
            goto L44
        L3f:
            r5 = 17
            goto L44
        L42:
            r5 = 33
        L44:
            int r1 = r10.getRepeatCount()
            int r1 = r1 + r3
            r7 = r2
        L4a:
            if (r2 >= r1) goto L56
            boolean r8 = r0.m(r5, r6)
            if (r8 == 0) goto L56
            int r2 = r2 + 1
            r7 = r3
            goto L4a
        L56:
            r2 = r7
            goto L9d
        L58:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L9d
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto L9d
            int r1 = r0.f45597l
            if (r1 == r4) goto L85
            com.google.android.material.chip.Chip r5 = r0.f10375q
            if (r1 != 0) goto L70
            r5.performClick()
            goto L85
        L70:
            if (r1 != r3) goto L85
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r1 = r5.f26875h
            if (r1 == 0) goto L7c
            r1.onClick(r5)
        L7c:
            boolean r1 = r5.f26885s
            if (r1 == 0) goto L85
            R7.d r1 = r5.f26884r
            r1.q(r3, r3)
        L85:
            r2 = r3
            goto L9d
        L87:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L93
            r1 = 2
            boolean r2 = r0.m(r1, r6)
            goto L9d
        L93:
            boolean r1 = r10.hasModifiers(r3)
            if (r1 == 0) goto L9d
            boolean r2 = r0.m(r3, r6)
        L9d:
            if (r2 == 0) goto La4
            int r0 = r0.f45597l
            if (r0 == r4) goto La4
            return r3
        La4:
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i5;
        super.drawableStateChanged();
        f fVar = this.f26872e;
        boolean zV = false;
        if (fVar != null && f.t(fVar.L)) {
            f fVar2 = this.f26872e;
            ?? IsEnabled = isEnabled();
            int i10 = IsEnabled;
            if (this.f26879m) {
                i10 = IsEnabled + 1;
            }
            int i11 = i10;
            if (this.f26878l) {
                i11 = i10 + 1;
            }
            int i12 = i11;
            if (this.k) {
                i12 = i11 + 1;
            }
            int i13 = i12;
            if (isChecked()) {
                i13 = i12 + 1;
            }
            int[] iArr = new int[i13];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i5 = 1;
            } else {
                i5 = 0;
            }
            if (this.f26879m) {
                iArr[i5] = 16842908;
                i5++;
            }
            if (this.f26878l) {
                iArr[i5] = 16843623;
                i5++;
            }
            if (this.k) {
                iArr[i5] = 16842919;
                i5++;
            }
            if (isChecked()) {
                iArr[i5] = 16842913;
            }
            if (!Arrays.equals(fVar2.f10432y0, iArr)) {
                fVar2.f10432y0 = iArr;
                if (fVar2.T()) {
                    zV = fVar2.v(fVar2.getState(), iArr);
                }
            }
        }
        if (zV) {
            invalidate();
        }
    }

    public final void e() {
        this.f26874g = new RippleDrawable(AbstractC1340a.a(this.f26872e.f10383D), getBackgroundDrawable(), null);
        this.f26872e.getClass();
        RippleDrawable rippleDrawable = this.f26874g;
        WeakHashMap weakHashMap = S.f38779a;
        setBackground(rippleDrawable);
        f();
    }

    public final void f() {
        f fVar;
        if (TextUtils.isEmpty(getText()) || (fVar = this.f26872e) == null) {
            return;
        }
        int iQ = (int) (fVar.q() + fVar.f10410d0 + fVar.f10407a0);
        f fVar2 = this.f26872e;
        int iP = (int) (fVar2.p() + fVar2.f10403W + fVar2.f10406Z);
        if (this.f26873f != null) {
            Rect rect = new Rect();
            this.f26873f.getPadding(rect);
            iP += rect.left;
            iQ += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = S.f38779a;
        setPaddingRelative(iP, paddingTop, iQ, paddingBottom);
    }

    public final void g() {
        TextPaint paint = getPaint();
        f fVar = this.f26872e;
        if (fVar != null) {
            paint.drawableState = fVar.getState();
        }
        Z7.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f26888v);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f26883q)) {
            return this.f26883q;
        }
        f fVar = this.f26872e;
        if (!(fVar != null && fVar.f10397Q)) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f26873f;
        return insetDrawable == null ? this.f26872e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        f fVar = this.f26872e;
        if (fVar != null) {
            return fVar.f10399S;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        f fVar = this.f26872e;
        if (fVar != null) {
            return fVar.f10400T;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        f fVar = this.f26872e;
        if (fVar != null) {
            return fVar.f10431y;
        }
        return null;
    }

    public float getChipCornerRadius() {
        f fVar = this.f26872e;
        return fVar != null ? Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fVar.r()) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public Drawable getChipDrawable() {
        return this.f26872e;
    }

    public float getChipEndPadding() {
        f fVar = this.f26872e;
        return fVar != null ? fVar.f10410d0 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        f fVar = this.f26872e;
        if (fVar == null || (drawable = fVar.f10388G) == 0) {
            return null;
        }
        if (!(drawable instanceof InterfaceC1545a)) {
            return drawable;
        }
        return null;
    }

    public float getChipIconSize() {
        f fVar = this.f26872e;
        return fVar != null ? fVar.f10390I : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public ColorStateList getChipIconTint() {
        f fVar = this.f26872e;
        if (fVar != null) {
            return fVar.f10389H;
        }
        return null;
    }

    public float getChipMinHeight() {
        f fVar = this.f26872e;
        return fVar != null ? fVar.f10433z : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float getChipStartPadding() {
        f fVar = this.f26872e;
        return fVar != null ? fVar.f10403W : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public ColorStateList getChipStrokeColor() {
        f fVar = this.f26872e;
        if (fVar != null) {
            return fVar.f10380B;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        f fVar = this.f26872e;
        return fVar != null ? fVar.f10381C : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        f fVar = this.f26872e;
        if (fVar == null || (drawable = fVar.L) == 0) {
            return null;
        }
        if (!(drawable instanceof InterfaceC1545a)) {
            return drawable;
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        f fVar = this.f26872e;
        if (fVar != null) {
            return fVar.f10396P;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        f fVar = this.f26872e;
        return fVar != null ? fVar.f10409c0 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float getCloseIconSize() {
        f fVar = this.f26872e;
        return fVar != null ? fVar.f10395O : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float getCloseIconStartPadding() {
        f fVar = this.f26872e;
        return fVar != null ? fVar.f10408b0 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public ColorStateList getCloseIconTint() {
        f fVar = this.f26872e;
        if (fVar != null) {
            return fVar.f10394N;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        f fVar = this.f26872e;
        if (fVar != null) {
            return fVar.B0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f26885s) {
            d dVar = this.f26884r;
            if (dVar.f45597l == 1 || dVar.k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public J7.b getHideMotionSpec() {
        f fVar = this.f26872e;
        if (fVar != null) {
            return fVar.f10402V;
        }
        return null;
    }

    public float getIconEndPadding() {
        f fVar = this.f26872e;
        return fVar != null ? fVar.f10405Y : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float getIconStartPadding() {
        f fVar = this.f26872e;
        return fVar != null ? fVar.f10404X : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public ColorStateList getRippleColor() {
        f fVar = this.f26872e;
        if (fVar != null) {
            return fVar.f10383D;
        }
        return null;
    }

    public C1587k getShapeAppearanceModel() {
        return this.f26872e.f19729a.f19713a;
    }

    public J7.b getShowMotionSpec() {
        f fVar = this.f26872e;
        if (fVar != null) {
            return fVar.f10401U;
        }
        return null;
    }

    public float getTextEndPadding() {
        f fVar = this.f26872e;
        return fVar != null ? fVar.f10407a0 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float getTextStartPadding() {
        f fVar = this.f26872e;
        return fVar != null ? fVar.f10406Z : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g.K(this, this.f26872e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i5) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i5 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f26870x);
        }
        f fVar = this.f26872e;
        if (fVar != null && fVar.f10397Q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f26871y);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z2, int i5, Rect rect) {
        super.onFocusChanged(z2, i5, rect);
        if (this.f26885s) {
            d dVar = this.f26884r;
            int i10 = dVar.f45597l;
            if (i10 != Integer.MIN_VALUE) {
                dVar.j(i10);
            }
            if (z2) {
                dVar.m(i5, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        f fVar = this.f26872e;
        accessibilityNodeInfo.setCheckable(fVar != null && fVar.f10397Q);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i5) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), BackupConstant.SCENE_BACKUP_RENDER_FAIL);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i5) {
        super.onRtlPropertiesChanged(i5);
        if (this.f26881o != i5) {
            this.f26881o = i5;
            f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L4a
            if (r0 == r3) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.k
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r2)
        L2a:
            r0 = r3
            goto L51
        L2c:
            boolean r0 = r5.k
            if (r0 == 0) goto L45
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.f26875h
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.f26885s
            if (r0 == 0) goto L43
            R7.d r0 = r5.f26884r
            r0.q(r3, r3)
        L43:
            r0 = r3
            goto L46
        L45:
            r0 = r2
        L46:
            r5.setCloseIconPressed(r2)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r3)
            goto L2a
        L50:
            r0 = r2
        L51:
            if (r0 != 0) goto L5b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            return r2
        L5b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f26883q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f26874g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i5) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f26874g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i5) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z2) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.w(z2);
        }
    }

    public void setCheckableResource(int i5) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.w(fVar.f10411e0.getResources().getBoolean(i5));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        f fVar = this.f26872e;
        if (fVar == null) {
            this.f26877j = z2;
        } else if (fVar.f10397Q) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.x(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i5) {
        setCheckedIconVisible(i5);
    }

    public void setCheckedIconResource(int i5) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.x(g.B(fVar.f10411e0, i5));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.y(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i5) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.y(Y0.e.getColorStateList(fVar.f10411e0, i5));
        }
    }

    public void setCheckedIconVisible(int i5) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.z(fVar.f10411e0.getResources().getBoolean(i5));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        f fVar = this.f26872e;
        if (fVar == null || fVar.f10431y == colorStateList) {
            return;
        }
        fVar.f10431y = colorStateList;
        fVar.onStateChange(fVar.getState());
    }

    public void setChipBackgroundColorResource(int i5) {
        ColorStateList colorStateList;
        f fVar = this.f26872e;
        if (fVar == null || fVar.f10431y == (colorStateList = Y0.e.getColorStateList(fVar.f10411e0, i5))) {
            return;
        }
        fVar.f10431y = colorStateList;
        fVar.onStateChange(fVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.A(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i5) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.A(fVar.f10411e0.getResources().getDimension(i5));
        }
    }

    public void setChipDrawable(f fVar) {
        f fVar2 = this.f26872e;
        if (fVar2 != fVar) {
            if (fVar2 != null) {
                fVar2.f10379A0 = new WeakReference(null);
            }
            this.f26872e = fVar;
            fVar.f10382C0 = false;
            fVar.f10379A0 = new WeakReference(this);
            b(this.f26882p);
        }
    }

    public void setChipEndPadding(float f10) {
        f fVar = this.f26872e;
        if (fVar == null || fVar.f10410d0 == f10) {
            return;
        }
        fVar.f10410d0 = f10;
        fVar.invalidateSelf();
        fVar.u();
    }

    public void setChipEndPaddingResource(int i5) throws Resources.NotFoundException {
        f fVar = this.f26872e;
        if (fVar != null) {
            float dimension = fVar.f10411e0.getResources().getDimension(i5);
            if (fVar.f10410d0 != dimension) {
                fVar.f10410d0 = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.B(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i5) {
        setChipIconVisible(i5);
    }

    public void setChipIconResource(int i5) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.B(g.B(fVar.f10411e0, i5));
        }
    }

    public void setChipIconSize(float f10) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.C(f10);
        }
    }

    public void setChipIconSizeResource(int i5) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.C(fVar.f10411e0.getResources().getDimension(i5));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.D(colorStateList);
        }
    }

    public void setChipIconTintResource(int i5) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.D(Y0.e.getColorStateList(fVar.f10411e0, i5));
        }
    }

    public void setChipIconVisible(int i5) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.E(fVar.f10411e0.getResources().getBoolean(i5));
        }
    }

    public void setChipMinHeight(float f10) {
        f fVar = this.f26872e;
        if (fVar == null || fVar.f10433z == f10) {
            return;
        }
        fVar.f10433z = f10;
        fVar.invalidateSelf();
        fVar.u();
    }

    public void setChipMinHeightResource(int i5) throws Resources.NotFoundException {
        f fVar = this.f26872e;
        if (fVar != null) {
            float dimension = fVar.f10411e0.getResources().getDimension(i5);
            if (fVar.f10433z != dimension) {
                fVar.f10433z = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setChipStartPadding(float f10) {
        f fVar = this.f26872e;
        if (fVar == null || fVar.f10403W == f10) {
            return;
        }
        fVar.f10403W = f10;
        fVar.invalidateSelf();
        fVar.u();
    }

    public void setChipStartPaddingResource(int i5) throws Resources.NotFoundException {
        f fVar = this.f26872e;
        if (fVar != null) {
            float dimension = fVar.f10411e0.getResources().getDimension(i5);
            if (fVar.f10403W != dimension) {
                fVar.f10403W = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.F(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i5) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.F(Y0.e.getColorStateList(fVar.f10411e0, i5));
        }
    }

    public void setChipStrokeWidth(float f10) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.G(f10);
        }
    }

    public void setChipStrokeWidthResource(int i5) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.G(fVar.f10411e0.getResources().getDimension(i5));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i5) {
        setText(getResources().getString(i5));
    }

    public void setCloseIcon(Drawable drawable) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.H(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        f fVar = this.f26872e;
        if (fVar == null || fVar.f10396P == charSequence) {
            return;
        }
        C2840b c2840bC = C2840b.c();
        c2840bC.getClass();
        F f10 = i1.f.f36716a;
        fVar.f10396P = c2840bC.d(charSequence);
        fVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i5) {
        setCloseIconVisible(i5);
    }

    public void setCloseIconEndPadding(float f10) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.I(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i5) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.I(fVar.f10411e0.getResources().getDimension(i5));
        }
    }

    public void setCloseIconResource(int i5) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.H(g.B(fVar.f10411e0, i5));
        }
        d();
    }

    public void setCloseIconSize(float f10) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.J(f10);
        }
    }

    public void setCloseIconSizeResource(int i5) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.J(fVar.f10411e0.getResources().getDimension(i5));
        }
    }

    public void setCloseIconStartPadding(float f10) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.K(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i5) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.K(fVar.f10411e0.getResources().getDimension(i5));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.L(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i5) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.L(Y0.e.getColorStateList(fVar.f10411e0, i5));
        }
    }

    public void setCloseIconVisible(int i5) {
        setCloseIconVisible(getResources().getBoolean(i5));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i5, int i10, int i11, int i12) {
        if (i5 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i11 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i5, i10, i11, i12);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i5, int i10, int i11, int i12) {
        if (i5 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i11 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i5, i10, i11, i12);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.i(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f26872e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.B0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.f26880n = z2;
        b(this.f26882p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i5) {
        if (i5 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i5);
        }
    }

    public void setHideMotionSpec(J7.b bVar) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.f10402V = bVar;
        }
    }

    public void setHideMotionSpecResource(int i5) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.f10402V = J7.b.a(fVar.f10411e0, i5);
        }
    }

    public void setIconEndPadding(float f10) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.N(f10);
        }
    }

    public void setIconEndPaddingResource(int i5) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.N(fVar.f10411e0.getResources().getDimension(i5));
        }
    }

    public void setIconStartPadding(float f10) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.O(f10);
        }
    }

    public void setIconStartPaddingResource(int i5) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.O(fVar.f10411e0.getResources().getDimension(i5));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i5) {
        if (this.f26872e == null) {
            return;
        }
        super.setLayoutDirection(i5);
    }

    @Override // android.widget.TextView
    public void setLines(int i5) {
        if (i5 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i5);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i5) {
        if (i5 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i5);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i5) {
        super.setMaxWidth(i5);
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.f10384D0 = i5;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i5) {
        if (i5 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i5);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f26876i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f26875h = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.P(colorStateList);
        }
        this.f26872e.getClass();
        e();
    }

    public void setRippleColorResource(int i5) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.P(Y0.e.getColorStateList(fVar.f10411e0, i5));
            this.f26872e.getClass();
            e();
        }
    }

    @Override // c8.u
    public void setShapeAppearanceModel(C1587k c1587k) {
        this.f26872e.setShapeAppearanceModel(c1587k);
    }

    public void setShowMotionSpec(J7.b bVar) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.f10401U = bVar;
        }
    }

    public void setShowMotionSpecResource(int i5) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.f10401U = J7.b.a(fVar.f10411e0, i5);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z2) {
        if (!z2) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z2);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        f fVar = this.f26872e;
        if (fVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(fVar.f10382C0 ? null : charSequence, bufferType);
        f fVar2 = this.f26872e;
        if (fVar2 == null || TextUtils.equals(fVar2.f10385E, charSequence)) {
            return;
        }
        fVar2.f10385E = charSequence;
        fVar2.f10417k0.f15273d = true;
        fVar2.invalidateSelf();
        fVar2.u();
    }

    public void setTextAppearance(Z7.d dVar) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.Q(dVar);
        }
        g();
    }

    public void setTextAppearanceResource(int i5) {
        setTextAppearance(getContext(), i5);
    }

    public void setTextEndPadding(float f10) {
        f fVar = this.f26872e;
        if (fVar == null || fVar.f10407a0 == f10) {
            return;
        }
        fVar.f10407a0 = f10;
        fVar.invalidateSelf();
        fVar.u();
    }

    public void setTextEndPaddingResource(int i5) throws Resources.NotFoundException {
        f fVar = this.f26872e;
        if (fVar != null) {
            float dimension = fVar.f10411e0.getResources().getDimension(i5);
            if (fVar.f10407a0 != dimension) {
                fVar.f10407a0 = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i5, float f10) {
        super.setTextSize(i5, f10);
        f fVar = this.f26872e;
        if (fVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i5, f10, getResources().getDisplayMetrics());
            i iVar = fVar.f10417k0;
            Z7.d dVar = iVar.f15275f;
            if (dVar != null) {
                dVar.k = fApplyDimension;
                iVar.f15270a.setTextSize(fApplyDimension);
                fVar.u();
                fVar.invalidateSelf();
            }
        }
        g();
    }

    public void setTextStartPadding(float f10) {
        f fVar = this.f26872e;
        if (fVar == null || fVar.f10406Z == f10) {
            return;
        }
        fVar.f10406Z = f10;
        fVar.invalidateSelf();
        fVar.u();
    }

    public void setTextStartPaddingResource(int i5) throws Resources.NotFoundException {
        f fVar = this.f26872e;
        if (fVar != null) {
            float dimension = fVar.f10411e0.getResources().getDimension(i5);
            if (fVar.f10406Z != dimension) {
                fVar.f10406Z = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setCloseIconVisible(boolean z2) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.M(z2);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z2) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.z(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.E(z2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
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
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i5) {
        super.setTextAppearance(context, i5);
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.Q(new Z7.d(fVar.f10411e0, i5));
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i5) {
        super.setTextAppearance(i5);
        f fVar = this.f26872e;
        if (fVar != null) {
            fVar.Q(new Z7.d(fVar.f10411e0, i5));
        }
        g();
    }

    public void setInternalOnCheckedChangeListener(W7.e eVar) {
    }
}
