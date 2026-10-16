package androidx.appcompat.widget;

import A1.h;
import Fe.g;
import Y0.e;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.IBinder;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.unity3d.services.UnityAdsConstants;
import i.AbstractC2820a;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;
import k1.F;
import k1.S;
import md.J;
import n.C3561a;
import q.AbstractC3827n0;
import q.C3835s;
import q.V;
import q.c1;
import q.d1;
import q.e1;
import q.v1;
import r7.AbstractC3935e;
import y1.C4526g;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: R, reason: collision with root package name */
    public static final c1 f17918R = new c1(0, "thumbPos", Float.class);

    /* renamed from: S, reason: collision with root package name */
    public static final int[] f17919S = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public int f17920A;

    /* renamed from: B, reason: collision with root package name */
    public int f17921B;

    /* renamed from: C, reason: collision with root package name */
    public int f17922C;

    /* renamed from: D, reason: collision with root package name */
    public int f17923D;

    /* renamed from: E, reason: collision with root package name */
    public int f17924E;

    /* renamed from: F, reason: collision with root package name */
    public int f17925F;

    /* renamed from: G, reason: collision with root package name */
    public int f17926G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f17927H;

    /* renamed from: I, reason: collision with root package name */
    public final TextPaint f17928I;

    /* renamed from: J, reason: collision with root package name */
    public final ColorStateList f17929J;

    /* renamed from: K, reason: collision with root package name */
    public StaticLayout f17930K;
    public StaticLayout L;

    /* renamed from: M, reason: collision with root package name */
    public final C3561a f17931M;

    /* renamed from: N, reason: collision with root package name */
    public ObjectAnimator f17932N;

    /* renamed from: O, reason: collision with root package name */
    public C3835s f17933O;

    /* renamed from: P, reason: collision with root package name */
    public h f17934P;

    /* renamed from: Q, reason: collision with root package name */
    public final Rect f17935Q;

    /* renamed from: a, reason: collision with root package name */
    public Drawable f17936a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f17937b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f17938c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17939d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17940e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f17941f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f17942g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f17943h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f17944i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f17945j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f17946l;

    /* renamed from: m, reason: collision with root package name */
    public int f17947m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f17948n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f17949o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f17950p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f17951q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f17952r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f17953s;

    /* renamed from: t, reason: collision with root package name */
    public int f17954t;

    /* renamed from: u, reason: collision with root package name */
    public final int f17955u;

    /* renamed from: v, reason: collision with root package name */
    public float f17956v;

    /* renamed from: w, reason: collision with root package name */
    public float f17957w;

    /* renamed from: x, reason: collision with root package name */
    public final VelocityTracker f17958x;

    /* renamed from: y, reason: collision with root package name */
    public final int f17959y;

    /* renamed from: z, reason: collision with root package name */
    public float f17960z;

    public SwitchCompat(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int resourceId;
        super(context, attributeSet, com.wynauto.wyn.R.attr.switchStyle);
        this.f17937b = null;
        this.f17938c = null;
        this.f17939d = false;
        this.f17940e = false;
        this.f17942g = null;
        this.f17943h = null;
        this.f17944i = false;
        this.f17945j = false;
        this.f17958x = VelocityTracker.obtain();
        this.f17927H = true;
        this.f17935Q = new Rect();
        e1.a(getContext(), this);
        TextPaint textPaint = new TextPaint(1);
        this.f17928I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = AbstractC2820a.f36459w;
        J jS = J.s(context, attributeSet, iArr, com.wynauto.wyn.R.attr.switchStyle, 0);
        S.l(this, context, iArr, attributeSet, (TypedArray) jS.f40581b, com.wynauto.wyn.R.attr.switchStyle);
        Drawable drawableN = jS.n(2);
        this.f17936a = drawableN;
        if (drawableN != null) {
            drawableN.setCallback(this);
        }
        Drawable drawableN2 = jS.n(11);
        this.f17941f = drawableN2;
        if (drawableN2 != null) {
            drawableN2.setCallback(this);
        }
        TypedArray typedArray = (TypedArray) jS.f40581b;
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.f17953s = typedArray.getBoolean(3, true);
        this.k = typedArray.getDimensionPixelSize(8, 0);
        this.f17946l = typedArray.getDimensionPixelSize(5, 0);
        this.f17947m = typedArray.getDimensionPixelSize(6, 0);
        this.f17948n = typedArray.getBoolean(4, false);
        ColorStateList colorStateListM = jS.m(9);
        if (colorStateListM != null) {
            this.f17937b = colorStateListM;
            this.f17939d = true;
        }
        PorterDuff.Mode modeC = AbstractC3827n0.c(typedArray.getInt(10, -1), null);
        if (this.f17938c != modeC) {
            this.f17938c = modeC;
            this.f17940e = true;
        }
        if (this.f17939d || this.f17940e) {
            a();
        }
        ColorStateList colorStateListM2 = jS.m(12);
        if (colorStateListM2 != null) {
            this.f17942g = colorStateListM2;
            this.f17944i = true;
        }
        PorterDuff.Mode modeC2 = AbstractC3827n0.c(typedArray.getInt(13, -1), null);
        if (this.f17943h != modeC2) {
            this.f17943h = modeC2;
            this.f17945j = true;
        }
        if (this.f17944i || this.f17945j) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, AbstractC2820a.f36460x);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = e.getColorStateList(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f17929J = colorStateList;
            } else {
                this.f17929J = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f10 = dimensionPixelSize;
                if (f10 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f10);
                    requestLayout();
                }
            }
            int i5 = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i10 = typedArrayObtainStyledAttributes.getInt(2, -1);
            Typeface typeface = i5 != 1 ? i5 != 2 ? i5 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            float f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (i10 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i10) : Typeface.create(typeface, i10);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i11 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i10;
                textPaint.setFakeBoldText((i11 & 1) != 0);
                textPaint.setTextSkewX((2 & i11) != 0 ? -0.25f : f11);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                C3561a c3561a = new C3561a();
                c3561a.f40740a = context2.getResources().getConfiguration().locale;
                this.f17931M = c3561a;
            } else {
                this.f17931M = null;
            }
            setTextOnInternal(this.f17949o);
            setTextOffInternal(this.f17951q);
            typedArrayObtainStyledAttributes.recycle();
        }
        new V(this).f(attributeSet, com.wynauto.wyn.R.attr.switchStyle);
        jS.v();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f17955u = viewConfiguration.getScaledTouchSlop();
        this.f17959y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, com.wynauto.wyn.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private C3835s getEmojiTextViewHelper() {
        if (this.f17933O == null) {
            this.f17933O = new C3835s(this);
        }
        return this.f17933O;
    }

    private boolean getTargetCheckedState() {
        return this.f17960z > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((v1.a(this) ? 1.0f - this.f17960z : this.f17960z) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f17941f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f17935Q;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f17936a;
        Rect rectB = drawable2 != null ? AbstractC3827n0.b(drawable2) : AbstractC3827n0.f43841c;
        return ((((this.f17920A - this.f17922C) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f17951q = charSequence;
        C3835s emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodO = ((A6.c) emojiTextViewHelper.f43894b.f10967a).O(this.f17931M);
        if (transformationMethodO != null) {
            charSequence = transformationMethodO.getTransformation(charSequence, this);
        }
        this.f17952r = charSequence;
        this.L = null;
        if (this.f17953s) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f17949o = charSequence;
        C3835s emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodO = ((A6.c) emojiTextViewHelper.f43894b.f10967a).O(this.f17931M);
        if (transformationMethodO != null) {
            charSequence = transformationMethodO.getTransformation(charSequence, this);
        }
        this.f17950p = charSequence;
        this.f17930K = null;
        if (this.f17953s) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f17936a;
        if (drawable != null) {
            if (this.f17939d || this.f17940e) {
                Drawable drawableMutate = drawable.mutate();
                this.f17936a = drawableMutate;
                if (this.f17939d) {
                    drawableMutate.setTintList(this.f17937b);
                }
                if (this.f17940e) {
                    this.f17936a.setTintMode(this.f17938c);
                }
                if (this.f17936a.isStateful()) {
                    this.f17936a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f17941f;
        if (drawable != null) {
            if (this.f17944i || this.f17945j) {
                Drawable drawableMutate = drawable.mutate();
                this.f17941f = drawableMutate;
                if (this.f17944i) {
                    drawableMutate.setTintList(this.f17942g);
                }
                if (this.f17945j) {
                    this.f17941f.setTintMode(this.f17943h);
                }
                if (this.f17941f.isStateful()) {
                    this.f17941f.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.f17949o);
        setTextOffInternal(this.f17951q);
        requestLayout();
    }

    public final void d() {
        if (this.f17934P == null && ((A6.c) this.f17933O.f43894b.f10967a).E() && C4526g.f47922j != null) {
            C4526g c4526gA = C4526g.a();
            int iB = c4526gA.b();
            if (iB == 3 || iB == 0) {
                h hVar = new h(this);
                this.f17934P = hVar;
                c4526gA.f(hVar);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i5;
        int i10;
        int i11 = this.f17923D;
        int i12 = this.f17924E;
        int i13 = this.f17925F;
        int i14 = this.f17926G;
        int thumbOffset = getThumbOffset() + i11;
        Drawable drawable = this.f17936a;
        Rect rectB = drawable != null ? AbstractC3827n0.b(drawable) : AbstractC3827n0.f43841c;
        Drawable drawable2 = this.f17941f;
        Rect rect = this.f17935Q;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i15 = rect.left;
            thumbOffset += i15;
            if (rectB != null) {
                int i16 = rectB.left;
                if (i16 > i15) {
                    i11 += i16 - i15;
                }
                int i17 = rectB.top;
                int i18 = rect.top;
                i5 = i17 > i18 ? (i17 - i18) + i12 : i12;
                int i19 = rectB.right;
                int i20 = rect.right;
                if (i19 > i20) {
                    i13 -= i19 - i20;
                }
                int i21 = rectB.bottom;
                int i22 = rect.bottom;
                if (i21 > i22) {
                    i10 = i14 - (i21 - i22);
                }
                this.f17941f.setBounds(i11, i5, i13, i10);
            } else {
                i5 = i12;
            }
            i10 = i14;
            this.f17941f.setBounds(i11, i5, i13, i10);
        }
        Drawable drawable3 = this.f17936a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i23 = thumbOffset - rect.left;
            int i24 = thumbOffset + this.f17922C + rect.right;
            this.f17936a.setBounds(i23, i12, i24, i14);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i23, i12, i24, i14);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f17936a;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
        Drawable drawable2 = this.f17941f;
        if (drawable2 != null) {
            drawable2.setHotspot(f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f17936a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f17941f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!v1.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f17920A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f17947m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (v1.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f17920A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f17947m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC3935e.T(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f17953s;
    }

    public boolean getSplitTrack() {
        return this.f17948n;
    }

    public int getSwitchMinWidth() {
        return this.f17946l;
    }

    public int getSwitchPadding() {
        return this.f17947m;
    }

    public CharSequence getTextOff() {
        return this.f17951q;
    }

    public CharSequence getTextOn() {
        return this.f17949o;
    }

    public Drawable getThumbDrawable() {
        return this.f17936a;
    }

    public final float getThumbPosition() {
        return this.f17960z;
    }

    public int getThumbTextPadding() {
        return this.k;
    }

    public ColorStateList getThumbTintList() {
        return this.f17937b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f17938c;
    }

    public Drawable getTrackDrawable() {
        return this.f17941f;
    }

    public ColorStateList getTrackTintList() {
        return this.f17942g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f17943h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f17936a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f17941f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f17932N;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f17932N.end();
        this.f17932N = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i5) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i5 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f17919S);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f17941f;
        Rect rect = this.f17935Q;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i5 = this.f17924E;
        int i10 = this.f17926G;
        int i11 = i5 + rect.top;
        int i12 = i10 - rect.bottom;
        Drawable drawable2 = this.f17936a;
        if (drawable != null) {
            if (!this.f17948n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = AbstractC3827n0.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
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
        StaticLayout staticLayout = getTargetCheckedState() ? this.f17930K : this.L;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f17929J;
            TextPaint textPaint = this.f17928I;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i11 + i12) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
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
            CharSequence charSequence = isChecked() ? this.f17949o : this.f17951q;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(text);
            sb2.append(' ');
            sb2.append(charSequence);
            accessibilityNodeInfo.setText(sb2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i5, int i10, int i11, int i12) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z2, i5, i10, i11, i12);
        int iMax2 = 0;
        if (this.f17936a != null) {
            Drawable drawable = this.f17941f;
            Rect rect = this.f17935Q;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = AbstractC3827n0.b(this.f17936a);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        if (v1.a(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f17920A + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f17920A) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i13 = this.f17921B;
            int i14 = height2 - (i13 / 2);
            height = i13 + i14;
            paddingTop = i14;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.f17921B + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.f17921B;
        }
        this.f17923D = paddingLeft;
        this.f17924E = paddingTop;
        this.f17926G = height;
        this.f17925F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i5, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int intrinsicWidth;
        int intrinsicHeight;
        int intrinsicHeight2 = 0;
        if (this.f17953s) {
            StaticLayout staticLayout = this.f17930K;
            TextPaint textPaint = this.f17928I;
            if (staticLayout == null) {
                CharSequence charSequence = this.f17950p;
                this.f17930K = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true);
            }
            if (this.L == null) {
                CharSequence charSequence2 = this.f17952r;
                this.L = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true);
            }
        }
        Drawable drawable = this.f17936a;
        Rect rect = this.f17935Q;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f17936a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f17936a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.f17922C = Math.max(this.f17953s ? (this.k * 2) + Math.max(this.f17930K.getWidth(), this.L.getWidth()) : 0, intrinsicWidth);
        Drawable drawable2 = this.f17941f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f17941f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f17936a;
        if (drawable3 != null) {
            Rect rectB = AbstractC3827n0.b(drawable3);
            iMax = Math.max(iMax, rectB.left);
            iMax2 = Math.max(iMax2, rectB.right);
        }
        int iMax3 = this.f17927H ? Math.max(this.f17946l, (this.f17922C * 2) + iMax + iMax2) : this.f17946l;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f17920A = iMax3;
        this.f17921B = iMax4;
        super.onMeasure(i5, i10);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f17949o : this.f17951q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) throws Resources.NotFoundException {
        super.setChecked(z2);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.f17949o;
                if (string == null) {
                    string = getResources().getString(com.wynauto.wyn.R.string.abc_capital_on);
                }
                Object obj = string;
                WeakHashMap weakHashMap = S.f38779a;
                new F(com.wynauto.wyn.R.id.tag_state_description, CharSequence.class, 64, 30, 2).g(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.f17951q;
            if (string2 == null) {
                string2 = getResources().getString(com.wynauto.wyn.R.string.abc_capital_off);
            }
            Object obj2 = string2;
            WeakHashMap weakHashMap2 = S.f38779a;
            new F(com.wynauto.wyn.R.id.tag_state_description, CharSequence.class, 64, 30, 2).g(this, obj2);
        }
        IBinder windowToken = getWindowToken();
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (windowToken != null) {
            WeakHashMap weakHashMap3 = S.f38779a;
            if (isLaidOut()) {
                if (zIsChecked) {
                    f10 = 1.0f;
                }
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f17918R, f10);
                this.f17932N = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(250L);
                d1.a(this.f17932N, true);
                this.f17932N.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f17932N;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (zIsChecked) {
            f10 = 1.0f;
        }
        setThumbPosition(f10);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC3935e.U(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().d(z2);
        setTextOnInternal(this.f17949o);
        setTextOffInternal(this.f17951q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z2) {
        this.f17927H = z2;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z2) {
        if (this.f17953s != z2) {
            this.f17953s = z2;
            requestLayout();
            if (z2) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z2) {
        this.f17948n = z2;
        invalidate();
    }

    public void setSwitchMinWidth(int i5) {
        this.f17946l = i5;
        requestLayout();
    }

    public void setSwitchPadding(int i5) {
        this.f17947m = i5;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f17928I;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f17951q;
        if (string == null) {
            string = getResources().getString(com.wynauto.wyn.R.string.abc_capital_off);
        }
        WeakHashMap weakHashMap = S.f38779a;
        new F(com.wynauto.wyn.R.id.tag_state_description, CharSequence.class, 64, 30, 2).g(this, string);
    }

    public void setTextOn(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f17949o;
        if (string == null) {
            string = getResources().getString(com.wynauto.wyn.R.string.abc_capital_on);
        }
        WeakHashMap weakHashMap = S.f38779a;
        new F(com.wynauto.wyn.R.id.tag_state_description, CharSequence.class, 64, 30, 2).g(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f17936a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f17936a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f10) {
        this.f17960z = f10;
        invalidate();
    }

    public void setThumbResource(int i5) {
        setThumbDrawable(g.B(getContext(), i5));
    }

    public void setThumbTextPadding(int i5) {
        this.k = i5;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f17937b = colorStateList;
        this.f17939d = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f17938c = mode;
        this.f17940e = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f17941f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f17941f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i5) {
        setTrackDrawable(g.B(getContext(), i5));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f17942g = colorStateList;
        this.f17944i = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f17943h = mode;
        this.f17945j = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() throws Resources.NotFoundException {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f17936a || drawable == this.f17941f;
    }
}
