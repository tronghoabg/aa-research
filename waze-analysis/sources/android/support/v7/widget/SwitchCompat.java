package android.support.v7.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.emoji2.text.EmojiCompat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: c, reason: collision with root package name */
    private static final Property f959c = new fx(Float.class);

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f960d = {R.attr.state_checked};
    private float A;
    private VelocityTracker B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private boolean K;
    private final TextPaint L;
    private ColorStateList M;
    private Layout N;
    private Layout O;
    private TransformationMethod P;
    private final bj Q;
    private aj R;
    private fy S;
    private final Rect T;

    /* renamed from: a, reason: collision with root package name */
    float f961a;

    /* renamed from: b, reason: collision with root package name */
    ObjectAnimator f962b;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f963e;

    /* renamed from: f, reason: collision with root package name */
    private ColorStateList f964f;

    /* renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f965g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f966h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f967i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f968j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f969k;

    /* renamed from: l, reason: collision with root package name */
    private PorterDuff.Mode f970l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private CharSequence s;
    private CharSequence t;
    private CharSequence u;
    private CharSequence v;
    private boolean w;
    private int x;
    private int y;
    private float z;

    public SwitchCompat(Context context, AttributeSet attributeSet, int i2) throws Resources.NotFoundException {
        Drawable drawable;
        Drawable drawable2;
        super(context, attributeSet, i2);
        this.f964f = null;
        this.f965g = null;
        this.f966h = false;
        this.f967i = false;
        this.f969k = null;
        this.f970l = null;
        this.m = false;
        this.n = false;
        this.B = VelocityTracker.obtain();
        this.K = true;
        this.T = new Rect();
        fz.d(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.L = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = android.support.v7.a.a.v;
        gc gcVarN = gc.n(context, attributeSet, iArr, i2, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, gcVarN.h(), i2, 0);
        Drawable drawableJ = gcVarN.j(2);
        this.f963e = drawableJ;
        if (drawableJ != null) {
            drawableJ.setCallback(this);
        }
        Drawable drawableJ2 = gcVarN.j(11);
        this.f968j = drawableJ2;
        if (drawableJ2 != null) {
            drawableJ2.setCallback(this);
        }
        p(gcVarN.o(0));
        o(gcVarN.o(1));
        this.w = gcVarN.r(3, true);
        this.o = gcVarN.b(8, 0);
        this.p = gcVarN.b(5, 0);
        this.q = gcVarN.b(6, 0);
        this.r = gcVarN.r(4, false);
        ColorStateList colorStateListG = gcVarN.g(9);
        if (colorStateListG != null) {
            this.f964f = colorStateListG;
            this.f966h = true;
        }
        int iC = gcVarN.c(10, -1);
        Rect rect = cg.f1231a;
        PorterDuff.Mode modeH = com.waze.c.c.e.h(iC, null);
        if (this.f965g != modeH) {
            this.f965g = modeH;
            this.f967i = true;
        }
        boolean z = this.f966h;
        if ((z || this.f967i) && (drawable = this.f963e) != null && (z || this.f967i)) {
            Drawable drawableMutate = drawable.mutate();
            this.f963e = drawableMutate;
            if (this.f966h) {
                DrawableCompat.setTintList(drawableMutate, this.f964f);
            }
            if (this.f967i) {
                DrawableCompat.setTintMode(this.f963e, this.f965g);
            }
            if (this.f963e.isStateful()) {
                this.f963e.setState(getDrawableState());
            }
        }
        ColorStateList colorStateListG2 = gcVarN.g(12);
        if (colorStateListG2 != null) {
            this.f969k = colorStateListG2;
            this.m = true;
        }
        PorterDuff.Mode modeH2 = com.waze.c.c.e.h(gcVarN.c(13, -1), null);
        if (this.f970l != modeH2) {
            this.f970l = modeH2;
            this.n = true;
        }
        boolean z2 = this.m;
        if ((z2 || this.n) && (drawable2 = this.f968j) != null && (z2 || this.n)) {
            Drawable drawableMutate2 = drawable2.mutate();
            this.f968j = drawableMutate2;
            if (this.m) {
                DrawableCompat.setTintList(drawableMutate2, this.f969k);
            }
            if (this.n) {
                DrawableCompat.setTintMode(this.f968j, this.f970l);
            }
            if (this.f968j.isStateful()) {
                this.f968j.setState(getDrawableState());
            }
        }
        int iF = gcVarN.f(7, 0);
        if (iF != 0) {
            gc gcVarL = gc.l(context, iF, android.support.v7.a.a.w);
            ColorStateList colorStateListG3 = gcVarL.g(3);
            if (colorStateListG3 != null) {
                this.M = colorStateListG3;
            } else {
                this.M = getTextColors();
            }
            int iB = gcVarL.b(0, 0);
            if (iB != 0) {
                float f2 = iB;
                if (f2 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f2);
                    requestLayout();
                }
            }
            int iC2 = gcVarL.c(1, -1);
            int iC3 = gcVarL.c(2, -1);
            Typeface typeface = iC2 != 1 ? iC2 != 2 ? iC2 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (iC3 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(iC3) : Typeface.create(typeface, iC3);
                d(typefaceDefaultFromStyle);
                int i3 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & iC3;
                textPaint.setFakeBoldText(1 == (i3 & 1));
                textPaint.setTextSkewX((2 & i3) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                d(typeface);
            }
            if (gcVarL.r(14, false)) {
                this.P = new android.support.v7.d.a(getContext());
            } else {
                this.P = null;
            }
            p(this.s);
            o(this.u);
            gcVarL.q();
        }
        bj bjVar = new bj(this);
        this.Q = bjVar;
        bjVar.e(attributeSet, i2);
        gcVarN.q();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.y = viewConfiguration.getScaledTouchSlop();
        this.C = viewConfiguration.getScaledMinimumFlingVelocity();
        j().b(attributeSet, i2);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private final int h() {
        boolean zC = android.support.v4.app.dc.c(this);
        float f2 = this.f961a;
        if (zC) {
            f2 = 1.0f - f2;
        }
        return (int) ((f2 * i()) + 0.5f);
    }

    private final int i() {
        Drawable drawable = this.f968j;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.T;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f963e;
        Rect rectA = drawable2 != null ? cg.a(drawable2) : cg.f1231a;
        return ((((this.D - this.F) - rect.left) - rect.right) - rectA.left) - rectA.right;
    }

    private final aj j() {
        aj ajVar = this.R;
        if (ajVar != null) {
            return ajVar;
        }
        aj ajVar2 = new aj(this);
        this.R = ajVar2;
        return ajVar2;
    }

    private final Layout k(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.L, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, this.L)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private final CharSequence l(CharSequence charSequence) {
        TransformationMethod transformationMethodA = j().a(this.P);
        return transformationMethodA != null ? transformationMethodA.getTransformation(charSequence, this) : charSequence;
    }

    private final void m() throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.u;
            if (string == null) {
                string = getResources().getString(com.waze.R.string.abc_capital_off);
            }
            ViewCompat.setStateDescription(this, string);
        }
    }

    private final void n() throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.s;
            if (string == null) {
                string = getResources().getString(com.waze.R.string.abc_capital_on);
            }
            ViewCompat.setStateDescription(this, string);
        }
    }

    private final void o(CharSequence charSequence) {
        this.u = charSequence;
        this.v = l(charSequence);
        this.O = null;
        if (this.w) {
            q();
        }
    }

    private final void p(CharSequence charSequence) {
        this.s = charSequence;
        this.t = l(charSequence);
        this.N = null;
        if (this.w) {
            q();
        }
    }

    private final void q() {
        if (this.S == null && this.R.e() && EmojiCompat.isConfigured()) {
            EmojiCompat emojiCompat = EmojiCompat.get();
            int loadState = emojiCompat.getLoadState();
            if (loadState == 3 || loadState == 0) {
                fy fyVar = new fy(this);
                this.S = fyVar;
                emojiCompat.registerInitCallback(fyVar);
            }
        }
    }

    private final boolean r() {
        return this.f961a > 0.5f;
    }

    public final Drawable a() {
        return this.f963e;
    }

    public final Drawable b() {
        return this.f968j;
    }

    final void c() {
        p(this.s);
        o(this.u);
        requestLayout();
    }

    public final void d(Typeface typeface) {
        TextPaint textPaint = this.L;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i2;
        int i3;
        int i4 = this.G;
        int i5 = this.H;
        int i6 = this.I;
        int i7 = this.J;
        int iH = h() + i4;
        Drawable drawable = this.f963e;
        Rect rectA = drawable != null ? cg.a(drawable) : cg.f1231a;
        Rect rect = this.T;
        Drawable drawable2 = this.f968j;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            iH += rect.left;
            if (rectA != null) {
                if (rectA.left > rect.left) {
                    i4 += rectA.left - rect.left;
                }
                i2 = rectA.top > rect.top ? (rectA.top - rect.top) + i5 : i5;
                if (rectA.right > rect.right) {
                    i6 -= rectA.right - rect.right;
                }
                if (rectA.bottom > rect.bottom) {
                    i3 = i7 - (rectA.bottom - rect.bottom);
                }
                this.f968j.setBounds(i4, i2, i6, i3);
            } else {
                i2 = i5;
            }
            i3 = i7;
            this.f968j.setBounds(i4, i2, i6, i3);
        }
        Drawable drawable3 = this.f963e;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i8 = iH - rect.left;
            int i9 = iH + this.F + rect.right;
            this.f963e.setBounds(i8, i5, i9, i7);
            Drawable background = getBackground();
            if (background != null) {
                DrawableCompat.setHotspotBounds(background, i8, i5, i9, i7);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f963e;
        if (drawable != null) {
            DrawableCompat.setHotspot(drawable, f2, f3);
        }
        Drawable drawable2 = this.f968j;
        if (drawable2 != null) {
            DrawableCompat.setHotspot(drawable2, f2, f3);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f963e;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f968j;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(CharSequence charSequence) throws Resources.NotFoundException {
        o(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        m();
    }

    public final void f(CharSequence charSequence) throws Resources.NotFoundException {
        p(charSequence);
        requestLayout();
        if (isChecked()) {
            n();
        }
    }

    final void g(float f2) {
        this.f961a = f2;
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingLeft() {
        if (!android.support.v4.app.dc.c(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.D;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.q : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingRight() {
        if (android.support.v4.app.dc.c(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.D;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.q : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f963e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f968j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f962b;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f962b.end();
        this.f962b = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, f960d);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f968j;
        Rect rect = this.T;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.H;
        int i3 = this.J;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f963e;
        if (drawable != null) {
            if (!this.r || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectA = cg.a(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectA.left;
                rect.right -= rectA.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = r() ? this.N : this.O;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.M;
            if (colorStateList != null) {
                this.L.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.L.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i4 + i5) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.s : this.u;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int iMax;
        int width;
        int paddingLeft;
        int i6;
        int paddingTop;
        int height;
        super.onLayout(z, i2, i3, i4, i5);
        int iMax2 = 0;
        if (this.f963e != null) {
            Rect rect = this.T;
            Drawable drawable = this.f968j;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectA = cg.a(this.f963e);
            iMax = Math.max(0, rectA.left - rect.left);
            iMax2 = Math.max(0, rectA.right - rect.right);
        } else {
            iMax = 0;
        }
        if (android.support.v4.app.dc.c(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.D + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.D) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop2 = (getPaddingTop() + getHeight()) - getPaddingBottom();
            i6 = this.E;
            paddingTop = (paddingTop2 / 2) - (i6 / 2);
        } else {
            if (gravity == 80) {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.E;
                this.G = paddingLeft;
                this.H = paddingTop;
                this.J = height;
                this.I = width;
            }
            paddingTop = getPaddingTop();
            i6 = this.E;
        }
        height = i6 + paddingTop;
        this.G = paddingLeft;
        this.H = paddingTop;
        this.J = height;
        this.I = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int intrinsicWidth;
        int intrinsicHeight;
        int i4;
        if (this.w) {
            if (this.N == null) {
                this.N = k(this.t);
            }
            if (this.O == null) {
                this.O = k(this.v);
            }
        }
        Rect rect = this.T;
        Drawable drawable = this.f963e;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f963e.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f963e.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.w) {
            int iMax = Math.max(this.N.getWidth(), this.O.getWidth());
            int i5 = this.o;
            i4 = iMax + i5 + i5;
        } else {
            i4 = 0;
        }
        this.F = Math.max(i4, intrinsicWidth);
        Drawable drawable2 = this.f968j;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f968j.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.f963e;
        if (drawable3 != null) {
            Rect rectA = cg.a(drawable3);
            iMax2 = Math.max(iMax2, rectA.left);
            iMax3 = Math.max(iMax3, rectA.right);
        }
        boolean z = this.K;
        int iMax4 = this.p;
        if (z) {
            int i6 = this.F;
            iMax4 = Math.max(iMax4, i6 + i6 + iMax2 + iMax3);
        }
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.D = iMax4;
        this.E = iMax5;
        super.onMeasure(i2, i3);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.s : this.u;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        j().c(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) throws Resources.NotFoundException {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            n();
        } else {
            m();
        }
        float f2 = true != zIsChecked ? 0.0f : 1.0f;
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.f962b;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            g(f2);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) f959c, f2);
        this.f962b = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f962b.setAutoCancel(true);
        this.f962b.start();
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(j().f(inputFilterArr));
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() throws Resources.NotFoundException {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f963e || drawable == this.f968j;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.waze.R.attr.switchStyle);
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }
}
