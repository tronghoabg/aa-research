package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.a.i;
import android.support.v7.app.p;
import android.support.v7.widget.y;
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
import androidx.core.view.GravityCompat;
import com.google.android.material.internal.n;
import com.google.android.material.internal.t;
import com.google.android.material.k.ac;
import com.google.android.material.k.ae;
import com.google.android.material.k.k;
import com.google.android.material.k.o;
import com.google.android.material.k.r;
import com.google.firebase.messaging.l;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class MaterialButton extends y implements Checkable, ac {

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f6304b = {R.attr.state_checkable};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f6305c = {R.attr.state_checked};
    private boolean A;
    private int B;
    private boolean C;

    /* renamed from: a, reason: collision with root package name */
    int f6306a;

    /* renamed from: d, reason: collision with root package name */
    private final e f6307d;

    /* renamed from: e, reason: collision with root package name */
    private final LinkedHashSet f6308e;

    /* renamed from: f, reason: collision with root package name */
    private PorterDuff.Mode f6309f;

    /* renamed from: g, reason: collision with root package name */
    private ColorStateList f6310g;

    /* renamed from: h, reason: collision with root package name */
    private Drawable f6311h;

    /* renamed from: i, reason: collision with root package name */
    private PorterDuff.Mode f6312i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f6313j;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f6314k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f6315l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private int w;
    private float x;
    private int y;
    private int z;

    public MaterialButton(Context context, AttributeSet attributeSet, int i2) {
        super(com.google.android.material.theme.a.a.b(context, attributeSet, i2, com.waze.R.style.Widget_MaterialComponents_Button, new int[]{com.waze.R.attr.materialSizeOverlay}), attributeSet, i2);
        this.f6308e = new LinkedHashSet();
        this.s = false;
        this.t = false;
        this.w = Integer.MIN_VALUE;
        this.x = -2.1474836E9f;
        this.y = Integer.MIN_VALUE;
        this.z = Integer.MIN_VALUE;
        this.f6306a = Integer.MIN_VALUE;
        Context context2 = getContext();
        TypedArray typedArrayA = n.a(context2, attributeSet, g.f6329a, i2, com.waze.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.p = typedArrayA.getDimensionPixelSize(13, 0);
        this.f6309f = com.waze.c.c.e.h(typedArrayA.getInt(16, -1), PorterDuff.Mode.SRC_IN);
        this.f6310g = t.n(getContext(), typedArrayA, 15);
        this.f6311h = t.p(getContext(), typedArrayA, 11);
        this.u = typedArrayA.getInteger(12, 1);
        this.m = typedArrayA.getDimensionPixelSize(14, 0);
        this.f6312i = com.waze.c.c.e.h(typedArrayA.getInt(22, -1), PorterDuff.Mode.SRC_IN);
        this.f6313j = typedArrayA.hasValue(21) ? t.n(getContext(), typedArrayA, 21) : this.f6310g;
        this.v = typedArrayA.getInteger(20, 3);
        Drawable drawableP = t.p(getContext(), typedArrayA, 19);
        this.f6314k = drawableP;
        this.f6315l = drawableP == null;
        o oVarF = ae.f(context2, typedArrayA, 23);
        oVarF = oVarF == null ? r.m(context2, attributeSet, i2, com.waze.R.style.Widget_MaterialComponents_Button).i() : oVarF;
        boolean z = typedArrayA.getBoolean(17, false);
        e eVar = new e(this, oVarF);
        this.f6307d = eVar;
        eVar.d(typedArrayA);
        m(typedArrayA.getBoolean(1, false));
        if (oVarF instanceof ae) {
            eVar.f(com.google.android.material.k.f.e(getContext()));
        }
        if (this.A != z) {
            this.A = z;
            if (z) {
                eVar.m(new l(this));
            } else {
                eVar.m(null);
            }
            post(new p(this, 2));
        }
        typedArrayA.recycle();
        setCompoundDrawablePadding(this.p);
        n(this.f6311h != null);
        q(this.f6314k != null);
    }

    private final boolean A() {
        int i2 = this.v;
        return i2 == 16 || i2 == 32;
    }

    private final boolean B() {
        e eVar = this.f6307d;
        return (eVar == null || eVar.j()) ? false : true;
    }

    public static /* synthetic */ void b(MaterialButton materialButton) {
        k kVarC;
        int iF = 0;
        if (materialButton.A && materialButton.C && (kVarC = materialButton.f6307d.c()) != null) {
            iF = (int) (kVarC.f() * 0.11f);
        }
        materialButton.B = iF;
        materialButton.p();
        materialButton.invalidate();
    }

    public static /* synthetic */ void c(MaterialButton materialButton, float f2) {
        int i2 = (int) (f2 * 0.11f);
        if (materialButton.B != i2) {
            materialButton.B = i2;
            materialButton.p();
            materialButton.invalidate();
        }
    }

    private final int g(int i2, int i3) {
        int intrinsicWidth;
        int intrinsicWidth2;
        Drawable drawable = this.f6311h;
        if (drawable != null) {
            intrinsicWidth = this.m;
            if (intrinsicWidth == 0) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth = 0;
        }
        Drawable drawable2 = this.f6314k;
        if (drawable2 != null) {
            intrinsicWidth2 = this.m;
            if (intrinsicWidth2 == 0) {
                intrinsicWidth2 = drawable2.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth2 = 0;
        }
        int i4 = (((((i2 - i()) - getPaddingEnd()) - intrinsicWidth) - intrinsicWidth2) - this.p) - getPaddingStart();
        if (l() == Layout.Alignment.ALIGN_CENTER) {
            i4 /= 2;
        }
        return x() != (i3 == 4) ? -i4 : i4;
    }

    private final int h(int i2, int i3) {
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
        return Math.max(0, (((((i2 - iMin) - getPaddingTop()) - i3) - this.p) - getPaddingBottom()) / 2);
    }

    private final int i() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i2 = 0; i2 < lineCount; i2++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i2));
        }
        return (int) Math.ceil(fMax);
    }

    private final Drawable j(int i2) {
        if (i2 == 0) {
            Drawable drawable = this.f6314k;
            if (drawable == null || !z()) {
                return null;
            }
            return drawable;
        }
        Drawable drawable2 = this.f6314k;
        if (i2 != 1) {
            if (drawable2 == null || !y()) {
                return null;
            }
            return drawable2;
        }
        if (drawable2 == null || !A()) {
            return null;
        }
        return drawable2;
    }

    private final Drawable k(int i2) {
        Drawable drawable = this.f6311h;
        if (i2 != 0) {
            if (drawable == null || !u()) {
                return null;
            }
            return drawable;
        }
        if (drawable == null || !v()) {
            return null;
        }
        return drawable;
    }

    private final Layout.Alignment l() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            return (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
        }
        int gravity = getGravity() & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private final void m(boolean z) {
        if (!f() || this.s == z) {
            return;
        }
        this.s = z;
        refreshDrawableState();
        if (getParent() instanceof f) {
            throw null;
        }
        if (this.t) {
            return;
        }
        this.t = true;
        Iterator it = this.f6308e.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a();
        }
        this.t = false;
    }

    private final void n(boolean z) {
        Drawable drawable = this.f6311h;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f6311h = drawableMutate;
            drawableMutate.setTintList(this.f6310g);
            PorterDuff.Mode mode = this.f6309f;
            if (mode != null) {
                this.f6311h.setTintMode(mode);
            }
            int intrinsicWidth = this.m;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f6311h.getIntrinsicWidth();
            }
            int intrinsicHeight = this.m;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f6311h.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f6311h;
            int i2 = this.n;
            int i3 = this.o;
            drawable2.setBounds(i2, i3, intrinsicWidth + i2, intrinsicHeight + i3);
            this.f6311h.setVisible(true, z);
        }
        Drawable drawable3 = this.f6311h;
        if (drawable3 != null && this.f6314k != null && s()) {
            throw new IllegalArgumentException("iconGravity cannot have the same alignment as secondaryIconGravity");
        }
        if (drawable3 == null && this.f6314k != null && s()) {
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (v() && compoundDrawablesRelative[0] != this.f6311h) || (u() && compoundDrawablesRelative[2] != this.f6311h) || (w() && compoundDrawablesRelative[1] != this.f6311h);
        if (z || z2) {
            if (v()) {
                setCompoundDrawablesRelative(this.f6311h, j(1), j(2), null);
            } else if (u()) {
                setCompoundDrawablesRelative(j(0), j(1), this.f6311h, null);
            } else if (w()) {
                setCompoundDrawablesRelative(j(0), this.f6311h, j(2), null);
            }
        }
    }

    private final void o(int i2, int i3) {
        if (this.f6311h == null || getLayout() == null) {
            return;
        }
        if (v() || u()) {
            this.o = 0;
            if (t(this.u)) {
                this.n = 0;
                n(false);
                return;
            }
            int iG = g(i2, this.u);
            if (this.n != iG) {
                this.n = iG;
                n(false);
                return;
            }
            return;
        }
        if (w()) {
            this.n = 0;
            if (this.u == 16) {
                this.o = 0;
                n(false);
                return;
            }
            int intrinsicHeight = this.m;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f6311h.getIntrinsicHeight();
            }
            int iH = h(i3, intrinsicHeight);
            if (this.o != iH) {
                this.o = iH;
                n(false);
            }
        }
    }

    private final void p() {
        boolean zX = x();
        int i2 = this.B;
        if (zX) {
            i2 = -i2;
        }
        if (getLayoutParams() != null) {
            getLayoutParams().width = (int) (this.x + 0.0f);
        }
        setPaddingRelative(this.y + i2, getPaddingTop(), this.z - i2, getPaddingBottom());
    }

    private final void q(boolean z) {
        Drawable drawable = this.f6314k;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f6314k = drawableMutate;
            drawableMutate.setTintList(this.f6313j);
            PorterDuff.Mode mode = this.f6312i;
            if (mode != null) {
                this.f6314k.setTintMode(mode);
            }
            int intrinsicWidth = this.m;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f6314k.getIntrinsicWidth();
            }
            int intrinsicHeight = this.m;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f6314k.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f6314k;
            int i2 = this.q;
            int i3 = this.r;
            drawable2.setBounds(i2, i3, intrinsicWidth + i2, intrinsicHeight + i3);
            this.f6314k.setVisible(true, z);
        }
        Drawable drawable3 = this.f6314k;
        if (drawable3 != null && this.f6311h != null && s()) {
            throw new IllegalArgumentException("secondaryIconGravity cannot have the same alignment as iconGravity");
        }
        if (drawable3 == null) {
            if (this.f6315l) {
                return;
            }
            if (this.f6311h != null && s()) {
                return;
            }
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (z() && compoundDrawablesRelative[0] != this.f6314k) || (y() && compoundDrawablesRelative[2] != this.f6314k) || (A() && compoundDrawablesRelative[1] != this.f6314k);
        if (z || z2) {
            if (z()) {
                setCompoundDrawablesRelative(this.f6314k, k(1), k(2), null);
            } else if (y()) {
                setCompoundDrawablesRelative(k(0), k(1), this.f6314k, null);
            } else if (A()) {
                setCompoundDrawablesRelative(k(0), this.f6314k, k(2), null);
            }
        }
    }

    private final void r(int i2, int i3) {
        if (this.f6314k == null || getLayout() == null) {
            return;
        }
        if (z() || y()) {
            this.r = 0;
            if (t(this.v)) {
                this.q = 0;
                q(false);
                return;
            }
            int iG = g(i2, this.v);
            if (this.q != iG) {
                this.q = iG;
                q(false);
                return;
            }
            return;
        }
        if (A()) {
            this.q = 0;
            if (this.v == 16) {
                this.r = 0;
                q(false);
                return;
            }
            int intrinsicHeight = this.m;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f6314k.getIntrinsicHeight();
            }
            int iH = h(i3, intrinsicHeight);
            if (this.r != iH) {
                this.r = iH;
                q(false);
            }
        }
    }

    private final boolean s() {
        if (v() && z()) {
            return true;
        }
        if (u() && y()) {
            return true;
        }
        return w() && A();
    }

    private final boolean t(int i2) {
        Layout.Alignment alignmentL = l();
        if (i2 == 1 || i2 == 3) {
            return true;
        }
        return i2 == 2 ? alignmentL == Layout.Alignment.ALIGN_NORMAL : i2 == 4 && alignmentL == Layout.Alignment.ALIGN_OPPOSITE;
    }

    private final boolean u() {
        int i2 = this.u;
        return i2 == 3 || i2 == 4;
    }

    private final boolean v() {
        int i2 = this.u;
        return i2 == 1 || i2 == 2;
    }

    private final boolean w() {
        int i2 = this.u;
        return i2 == 16 || i2 == 32;
    }

    private final boolean x() {
        return getLayoutDirection() == 1;
    }

    private final boolean y() {
        int i2 = this.v;
        return i2 == 3 || i2 == 4;
    }

    private final boolean z() {
        int i2 = this.v;
        return i2 == 1 || i2 == 2;
    }

    final String a() {
        if (TextUtils.isEmpty(null)) {
            return (true != f() ? Button.class : CompoundButton.class).getName();
        }
        return null;
    }

    final void d(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // com.google.android.material.k.ac
    public final void e(r rVar) {
        if (!B()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f6307d.g(rVar);
    }

    public final boolean f() {
        e eVar = this.f6307d;
        return eVar != null && eVar.k();
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        return B() ? this.f6307d.a() : super.getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        return B() ? this.f6307d.b() : super.getSupportBackgroundTintMode();
    }

    @Override // android.support.v7.widget.y, androidx.core.view.TintableBackgroundView
    public final ColorStateList getSupportBackgroundTintList() {
        return B() ? this.f6307d.a() : super.getSupportBackgroundTintList();
    }

    @Override // android.support.v7.widget.y, androidx.core.view.TintableBackgroundView
    public final PorterDuff.Mode getSupportBackgroundTintMode() {
        return B() ? this.f6307d.b() : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.s;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (B()) {
            com.google.android.material.k.f.c(this, this.f6307d.c());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (f()) {
            mergeDrawableStates(iArrOnCreateDrawableState, f6304b);
        }
        if (this.s) {
            mergeDrawableStates(iArrOnCreateDrawableState, f6305c);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.support.v7.widget.y, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(a());
        accessibilityEvent.setChecked(this.s);
    }

    @Override // android.support.v7.widget.y, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(a());
        accessibilityNodeInfo.setCheckable(f());
        accessibilityNodeInfo.setChecked(this.s);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // android.support.v7.widget.y, android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        super.onLayout(z, i2, i3, i4, i5);
        o(getMeasuredWidth(), getMeasuredHeight());
        r(getMeasuredWidth(), getMeasuredHeight());
        int i7 = getResources().getConfiguration().orientation;
        if (this.w != i7) {
            this.w = i7;
            this.x = -2.1474836E9f;
        }
        if (this.x == -2.1474836E9f) {
            this.x = getMeasuredWidth();
            if (getParent() instanceof d) {
                throw null;
            }
        }
        boolean z2 = false;
        if (this.f6306a == Integer.MIN_VALUE) {
            Drawable drawable = this.f6311h;
            if (drawable == null) {
                i6 = 0;
            } else {
                int i8 = this.p;
                int intrinsicWidth = this.m;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = drawable.getIntrinsicWidth();
                }
                i6 = i8 + intrinsicWidth;
            }
            this.f6306a = (getMeasuredWidth() - i()) - i6;
        }
        if (this.y == Integer.MIN_VALUE) {
            this.y = getPaddingStart();
        }
        if (this.z == Integer.MIN_VALUE) {
            this.z = getPaddingEnd();
        }
        if ((getParent() instanceof d) && ((d) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.C = z2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        m(cVar.f6316a);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f6316a = this.s;
        return cVar;
    }

    @Override // android.support.v7.widget.y, android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        o(getMeasuredWidth(), getMeasuredHeight());
        r(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean z;
        if (isEnabled() && this.f6307d.l()) {
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

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f6311h != null) {
            if (this.f6311h.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i2) {
        if (!B()) {
            super.setBackgroundColor(i2);
            return;
        }
        e eVar = this.f6307d;
        if (eVar.c() != null) {
            eVar.c().setTint(i2);
        }
    }

    @Override // android.support.v7.widget.y, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (!B()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f6307d.e();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.support.v7.widget.y, android.view.View
    public final void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? i.d(getContext(), i2) : null);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        m(z);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablePadding(int i2) {
        if (getCompoundDrawablePadding() != i2) {
            this.x = -2.1474836E9f;
        }
        super.setCompoundDrawablePadding(i2);
    }

    @Override // android.view.View
    public final void setElevation(float f2) {
        super.setElevation(f2);
        if (B()) {
            this.f6307d.c().u(f2);
        }
    }

    @Override // android.support.v7.widget.y, androidx.core.view.TintableBackgroundView
    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (B()) {
            this.f6307d.h(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // android.support.v7.widget.y, androidx.core.view.TintableBackgroundView
    public final void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (B()) {
            this.f6307d.i(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.x = -2.1474836E9f;
        super.setText(charSequence, bufferType);
    }

    @Override // android.view.View
    public final void setTextAlignment(int i2) {
        super.setTextAlignment(i2);
        o(getMeasuredWidth(), getMeasuredHeight());
        r(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.support.v7.widget.y, android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        this.x = -2.1474836E9f;
        super.setTextAppearance(context, i2);
    }

    @Override // android.support.v7.widget.y, android.widget.TextView
    public final void setTextSize(int i2, float f2) {
        this.x = -2.1474836E9f;
        super.setTextSize(i2, f2);
    }

    @Override // android.widget.TextView
    public final void setWidth(int i2) {
        this.x = -2.1474836E9f;
        super.setWidth(i2);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        m(!this.s);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.waze.R.attr.materialButtonStyle);
    }

    public MaterialButton(Context context) {
        this(context, null);
    }
}
