package com.google.android.material.textfield;

import A6.h;
import A7.AbstractC0279p0;
import Ba.c;
import E4.F;
import U8.v0;
import W7.b;
import W7.k;
import Y0.e;
import Z7.d;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b1.AbstractC1492a;
import c8.C1577a;
import c8.C1581e;
import c8.C1582f;
import c8.C1583g;
import c8.C1585i;
import c8.C1586j;
import c8.C1587k;
import c8.InterfaceC1579c;
import com.applovin.impl.Z0;
import com.google.android.material.internal.CheckableImageButton;
import com.moloco.sdk.internal.publisher.H;
import com.unity3d.services.UnityAdsConstants;
import f8.A;
import f8.f;
import f8.g;
import f8.j;
import f8.l;
import f8.m;
import f8.p;
import f8.q;
import f8.t;
import f8.v;
import f8.w;
import f8.x;
import f8.y;
import f8.z;
import h8.a;
import i1.C2840b;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k1.L;
import k1.S;
import md.J;
import q.AbstractC3827n0;
import q.C3830p;
import q.Y;
import t3.AbstractC4100t;
import t3.C4088h;
import y3.C4552j;

/* loaded from: classes4.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: y0, reason: collision with root package name */
    public static final int[][] f27014y0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    public boolean f27015A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f27016B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f27017C;

    /* renamed from: D, reason: collision with root package name */
    public C1583g f27018D;

    /* renamed from: E, reason: collision with root package name */
    public C1583g f27019E;

    /* renamed from: F, reason: collision with root package name */
    public StateListDrawable f27020F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f27021G;

    /* renamed from: H, reason: collision with root package name */
    public C1583g f27022H;

    /* renamed from: I, reason: collision with root package name */
    public C1583g f27023I;

    /* renamed from: J, reason: collision with root package name */
    public C1587k f27024J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f27025K;
    public final int L;

    /* renamed from: M, reason: collision with root package name */
    public int f27026M;

    /* renamed from: N, reason: collision with root package name */
    public int f27027N;

    /* renamed from: O, reason: collision with root package name */
    public int f27028O;

    /* renamed from: P, reason: collision with root package name */
    public int f27029P;

    /* renamed from: Q, reason: collision with root package name */
    public int f27030Q;

    /* renamed from: R, reason: collision with root package name */
    public int f27031R;

    /* renamed from: S, reason: collision with root package name */
    public int f27032S;

    /* renamed from: T, reason: collision with root package name */
    public final Rect f27033T;

    /* renamed from: U, reason: collision with root package name */
    public final Rect f27034U;

    /* renamed from: V, reason: collision with root package name */
    public final RectF f27035V;

    /* renamed from: W, reason: collision with root package name */
    public Typeface f27036W;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f27037a;

    /* renamed from: a0, reason: collision with root package name */
    public ColorDrawable f27038a0;

    /* renamed from: b, reason: collision with root package name */
    public final v f27039b;

    /* renamed from: b0, reason: collision with root package name */
    public int f27040b0;

    /* renamed from: c, reason: collision with root package name */
    public final m f27041c;

    /* renamed from: c0, reason: collision with root package name */
    public final LinkedHashSet f27042c0;

    /* renamed from: d, reason: collision with root package name */
    public EditText f27043d;

    /* renamed from: d0, reason: collision with root package name */
    public ColorDrawable f27044d0;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f27045e;

    /* renamed from: e0, reason: collision with root package name */
    public int f27046e0;

    /* renamed from: f, reason: collision with root package name */
    public int f27047f;

    /* renamed from: f0, reason: collision with root package name */
    public Drawable f27048f0;

    /* renamed from: g, reason: collision with root package name */
    public int f27049g;

    /* renamed from: g0, reason: collision with root package name */
    public ColorStateList f27050g0;

    /* renamed from: h, reason: collision with root package name */
    public int f27051h;

    /* renamed from: h0, reason: collision with root package name */
    public ColorStateList f27052h0;

    /* renamed from: i, reason: collision with root package name */
    public int f27053i;

    /* renamed from: i0, reason: collision with root package name */
    public int f27054i0;

    /* renamed from: j, reason: collision with root package name */
    public final q f27055j;

    /* renamed from: j0, reason: collision with root package name */
    public int f27056j0;
    public boolean k;

    /* renamed from: k0, reason: collision with root package name */
    public int f27057k0;

    /* renamed from: l, reason: collision with root package name */
    public int f27058l;

    /* renamed from: l0, reason: collision with root package name */
    public ColorStateList f27059l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f27060m;

    /* renamed from: m0, reason: collision with root package name */
    public int f27061m0;

    /* renamed from: n, reason: collision with root package name */
    public z f27062n;

    /* renamed from: n0, reason: collision with root package name */
    public int f27063n0;

    /* renamed from: o, reason: collision with root package name */
    public Y f27064o;

    /* renamed from: o0, reason: collision with root package name */
    public int f27065o0;

    /* renamed from: p, reason: collision with root package name */
    public int f27066p;

    /* renamed from: p0, reason: collision with root package name */
    public int f27067p0;

    /* renamed from: q, reason: collision with root package name */
    public int f27068q;

    /* renamed from: q0, reason: collision with root package name */
    public int f27069q0;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f27070r;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f27071r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f27072s;

    /* renamed from: s0, reason: collision with root package name */
    public final b f27073s0;

    /* renamed from: t, reason: collision with root package name */
    public Y f27074t;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f27075t0;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f27076u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f27077u0;

    /* renamed from: v, reason: collision with root package name */
    public int f27078v;
    public ValueAnimator v0;

    /* renamed from: w, reason: collision with root package name */
    public C4088h f27079w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f27080w0;

    /* renamed from: x, reason: collision with root package name */
    public C4088h f27081x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f27082x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f27083y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f27084z;

    public TextInputLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(a.a(context, attributeSet, com.wynauto.wyn.R.attr.textInputStyle, com.wynauto.wyn.R.style.Widget_Design_TextInputLayout), attributeSet, com.wynauto.wyn.R.attr.textInputStyle);
        this.f27047f = -1;
        this.f27049g = -1;
        this.f27051h = -1;
        this.f27053i = -1;
        this.f27055j = new q(this);
        this.f27062n = new Z0(20);
        this.f27033T = new Rect();
        this.f27034U = new Rect();
        this.f27035V = new RectF();
        this.f27042c0 = new LinkedHashSet();
        b bVar = new b(this);
        this.f27073s0 = bVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f27037a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = J7.a.f5719a;
        bVar.f15211Q = linearInterpolator;
        bVar.h(false);
        bVar.f15210P = linearInterpolator;
        bVar.h(false);
        if (bVar.f15233g != 8388659) {
            bVar.f15233g = 8388659;
            bVar.h(false);
        }
        int[] iArr = I7.a.f5423z;
        k.a(context2, attributeSet, com.wynauto.wyn.R.attr.textInputStyle, com.wynauto.wyn.R.style.Widget_Design_TextInputLayout);
        k.b(context2, attributeSet, iArr, com.wynauto.wyn.R.attr.textInputStyle, com.wynauto.wyn.R.style.Widget_Design_TextInputLayout, 22, 20, 38, 43, 47);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.wynauto.wyn.R.attr.textInputStyle, com.wynauto.wyn.R.style.Widget_Design_TextInputLayout);
        J j8 = new J(context2, typedArrayObtainStyledAttributes);
        v vVar = new v(this, j8);
        this.f27039b = vVar;
        this.f27015A = typedArrayObtainStyledAttributes.getBoolean(46, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.f27077u0 = typedArrayObtainStyledAttributes.getBoolean(45, true);
        this.f27075t0 = typedArrayObtainStyledAttributes.getBoolean(40, true);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(6, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(5, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.f27024J = C1587k.b(context2, attributeSet, com.wynauto.wyn.R.attr.textInputStyle, com.wynauto.wyn.R.style.Widget_Design_TextInputLayout).a();
        this.L = context2.getResources().getDimensionPixelOffset(com.wynauto.wyn.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f27027N = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f27029P = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.wynauto.wyn.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f27030Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.wynauto.wyn.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f27028O = this.f27029P;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        C1586j c1586jE = this.f27024J.e();
        if (dimension >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            c1586jE.f19755e = new C1577a(dimension);
        }
        if (dimension2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            c1586jE.f19756f = new C1577a(dimension2);
        }
        if (dimension3 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            c1586jE.f19757g = new C1577a(dimension3);
        }
        if (dimension4 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            c1586jE.f19758h = new C1577a(dimension4);
        }
        this.f27024J = c1586jE.a();
        ColorStateList colorStateListX = c.x(context2, j8, 7);
        if (colorStateListX != null) {
            int defaultColor = colorStateListX.getDefaultColor();
            this.f27061m0 = defaultColor;
            this.f27032S = defaultColor;
            if (colorStateListX.isStateful()) {
                this.f27063n0 = colorStateListX.getColorForState(new int[]{-16842910}, -1);
                this.f27065o0 = colorStateListX.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f27067p0 = colorStateListX.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f27065o0 = this.f27061m0;
                ColorStateList colorStateList = e.getColorStateList(context2, com.wynauto.wyn.R.color.mtrl_filled_background_color);
                this.f27063n0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.f27067p0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f27032S = 0;
            this.f27061m0 = 0;
            this.f27063n0 = 0;
            this.f27065o0 = 0;
            this.f27067p0 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListM = j8.m(1);
            this.f27052h0 = colorStateListM;
            this.f27050g0 = colorStateListM;
        }
        ColorStateList colorStateListX2 = c.x(context2, j8, 14);
        this.f27057k0 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.f27054i0 = e.getColor(context2, com.wynauto.wyn.R.color.mtrl_textinput_default_box_stroke_color);
        this.f27069q0 = e.getColor(context2, com.wynauto.wyn.R.color.mtrl_textinput_disabled_color);
        this.f27056j0 = e.getColor(context2, com.wynauto.wyn.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListX2 != null) {
            setBoxStrokeColorStateList(colorStateListX2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(c.x(context2, j8, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(47, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(47, 0));
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(38, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(33);
        int i5 = typedArrayObtainStyledAttributes.getInt(32, 1);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(34, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(43, 0);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(42, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(41);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(55, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(54);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.f27068q = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.f27066p = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i5);
        setCounterOverflowTextAppearance(this.f27066p);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f27068q);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(39)) {
            setErrorTextColor(j8.m(39));
        }
        if (typedArrayObtainStyledAttributes.hasValue(44)) {
            setHelperTextColor(j8.m(44));
        }
        if (typedArrayObtainStyledAttributes.hasValue(48)) {
            setHintTextColor(j8.m(48));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(j8.m(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(j8.m(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(56)) {
            setPlaceholderTextColor(j8.m(56));
        }
        m mVar = new m(this, j8);
        this.f27041c = mVar;
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        j8.v();
        setImportantForAccessibility(2);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && i10 >= 26) {
            L.b(this, 1);
        }
        frameLayout.addView(vVar);
        frameLayout.addView(mVar);
        addView(frameLayout);
        setEnabled(z12);
        setHelperTextEnabled(z10);
        setErrorEnabled(z2);
        setCounterEnabled(z11);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f27043d;
        if (!(editText instanceof AutoCompleteTextView) || H.a0(editText)) {
            return this.f27018D;
        }
        int I3 = v0.I(com.wynauto.wyn.R.attr.colorControlHighlight, this.f27043d);
        int i5 = this.f27026M;
        int[][] iArr = f27014y0;
        if (i5 != 2) {
            if (i5 != 1) {
                return null;
            }
            C1583g c1583g = this.f27018D;
            int i10 = this.f27032S;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{v0.S(0.1f, I3, i10), i10}), c1583g, c1583g);
        }
        Context context = getContext();
        C1583g c1583g2 = this.f27018D;
        TypedValue typedValueL = h.L(context, com.wynauto.wyn.R.attr.colorSurface, "TextInputLayout");
        int i11 = typedValueL.resourceId;
        int color = i11 != 0 ? e.getColor(context, i11) : typedValueL.data;
        C1583g c1583g3 = new C1583g(c1583g2.f19729a.f19713a);
        int iS = v0.S(0.1f, I3, color);
        c1583g3.j(new ColorStateList(iArr, new int[]{iS, 0}));
        c1583g3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iS, color});
        C1583g c1583g4 = new C1583g(c1583g2.f19729a.f19713a);
        c1583g4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c1583g3, c1583g4), c1583g2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f27020F == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f27020F = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f27020F.addState(new int[0], f(false));
        }
        return this.f27020F;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f27019E == null) {
            this.f27019E = f(true);
        }
        return this.f27019E;
    }

    public static void k(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = viewGroup.getChildAt(i5);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z2);
            }
        }
    }

    private void setEditText(EditText editText) throws Resources.NotFoundException {
        if (this.f27043d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f27043d = editText;
        int i5 = this.f27047f;
        if (i5 != -1) {
            setMinEms(i5);
        } else {
            setMinWidth(this.f27051h);
        }
        int i10 = this.f27049g;
        if (i10 != -1) {
            setMaxEms(i10);
        } else {
            setMaxWidth(this.f27053i);
        }
        this.f27021G = false;
        i();
        setTextInputAccessibilityDelegate(new y(this));
        Typeface typeface = this.f27043d.getTypeface();
        b bVar = this.f27073s0;
        bVar.m(typeface);
        float textSize = this.f27043d.getTextSize();
        if (bVar.f15234h != textSize) {
            bVar.f15234h = textSize;
            bVar.h(false);
        }
        float letterSpacing = this.f27043d.getLetterSpacing();
        if (bVar.f15217W != letterSpacing) {
            bVar.f15217W = letterSpacing;
            bVar.h(false);
        }
        int gravity = this.f27043d.getGravity();
        int i11 = (gravity & (-113)) | 48;
        if (bVar.f15233g != i11) {
            bVar.f15233g = i11;
            bVar.h(false);
        }
        if (bVar.f15231f != gravity) {
            bVar.f15231f = gravity;
            bVar.h(false);
        }
        this.f27043d.addTextChangedListener(new w(this, 0));
        if (this.f27050g0 == null) {
            this.f27050g0 = this.f27043d.getHintTextColors();
        }
        if (this.f27015A) {
            if (TextUtils.isEmpty(this.f27016B)) {
                CharSequence hint = this.f27043d.getHint();
                this.f27045e = hint;
                setHint(hint);
                this.f27043d.setHint((CharSequence) null);
            }
            this.f27017C = true;
        }
        if (this.f27064o != null) {
            n(this.f27043d.getText());
        }
        q();
        this.f27055j.b();
        this.f27039b.bringToFront();
        m mVar = this.f27041c;
        mVar.bringToFront();
        Iterator it = this.f27042c0.iterator();
        while (it.hasNext()) {
            ((l) it.next()).a(this);
        }
        mVar.l();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        t(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f27016B)) {
            return;
        }
        this.f27016B = charSequence;
        b bVar = this.f27073s0;
        if (charSequence == null || !TextUtils.equals(bVar.f15196A, charSequence)) {
            bVar.f15196A = charSequence;
            bVar.f15197B = null;
            Bitmap bitmap = bVar.f15200E;
            if (bitmap != null) {
                bitmap.recycle();
                bVar.f15200E = null;
            }
            bVar.h(false);
        }
        if (this.f27071r0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f27072s == z2) {
            return;
        }
        if (z2) {
            Y y10 = this.f27074t;
            if (y10 != null) {
                this.f27037a.addView(y10);
                this.f27074t.setVisibility(0);
            }
        } else {
            Y y11 = this.f27074t;
            if (y11 != null) {
                y11.setVisibility(8);
            }
            this.f27074t = null;
        }
        this.f27072s = z2;
    }

    public final void a(float f10) {
        int i5 = 1;
        b bVar = this.f27073s0;
        if (bVar.f15223b == f10) {
            return;
        }
        if (this.v0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.v0 = valueAnimator;
            valueAnimator.setInterpolator(c.K(getContext(), com.wynauto.wyn.R.attr.motionEasingEmphasizedInterpolator, J7.a.f5720b));
            this.v0.setDuration(c.J(getContext(), com.wynauto.wyn.R.attr.motionDurationMedium4, 167));
            this.v0.addUpdateListener(new N7.a(this, i5));
        }
        this.v0.setFloatValues(bVar.f15223b, f10);
        this.v0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) throws Resources.NotFoundException {
        if (!(view instanceof EditText)) {
            super.addView(view, i5, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f27037a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        s();
        setEditText((EditText) view);
    }

    public final void b() {
        int i5;
        int i10;
        C1583g c1583g = this.f27018D;
        if (c1583g == null) {
            return;
        }
        C1587k c1587k = c1583g.f19729a.f19713a;
        C1587k c1587k2 = this.f27024J;
        if (c1587k != c1587k2) {
            c1583g.setShapeAppearanceModel(c1587k2);
        }
        if (this.f27026M == 2 && (i5 = this.f27028O) > -1 && (i10 = this.f27031R) != 0) {
            C1583g c1583g2 = this.f27018D;
            c1583g2.f19729a.f19722j = i5;
            c1583g2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i10);
            C1582f c1582f = c1583g2.f19729a;
            if (c1582f.f19716d != colorStateListValueOf) {
                c1582f.f19716d = colorStateListValueOf;
                c1583g2.onStateChange(c1583g2.getState());
            }
        }
        int iB = this.f27032S;
        if (this.f27026M == 1) {
            iB = AbstractC1492a.b(this.f27032S, v0.J(getContext(), com.wynauto.wyn.R.attr.colorSurface, 0));
        }
        this.f27032S = iB;
        this.f27018D.j(ColorStateList.valueOf(iB));
        C1583g c1583g3 = this.f27022H;
        if (c1583g3 != null && this.f27023I != null) {
            if (this.f27028O > -1 && this.f27031R != 0) {
                c1583g3.j(this.f27043d.isFocused() ? ColorStateList.valueOf(this.f27054i0) : ColorStateList.valueOf(this.f27031R));
                this.f27023I.j(ColorStateList.valueOf(this.f27031R));
            }
            invalidate();
        }
        r();
    }

    public final int c() {
        float fD;
        if (!this.f27015A) {
            return 0;
        }
        int i5 = this.f27026M;
        b bVar = this.f27073s0;
        if (i5 == 0) {
            fD = bVar.d();
        } else {
            if (i5 != 2) {
                return 0;
            }
            fD = bVar.d() / 2.0f;
        }
        return (int) fD;
    }

    public final C4088h d() {
        C4088h c4088h = new C4088h();
        c4088h.f45700c = c.J(getContext(), com.wynauto.wyn.R.attr.motionDurationShort2, 87);
        c4088h.f45701d = c.K(getContext(), com.wynauto.wyn.R.attr.motionEasingLinearInterpolator, J7.a.f5719a);
        return c4088h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i5) {
        EditText editText = this.f27043d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i5);
            return;
        }
        if (this.f27045e != null) {
            boolean z2 = this.f27017C;
            this.f27017C = false;
            CharSequence hint = editText.getHint();
            this.f27043d.setHint(this.f27045e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i5);
                return;
            } finally {
                this.f27043d.setHint(hint);
                this.f27017C = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i5);
        onProvideAutofillVirtualStructure(viewStructure, i5);
        FrameLayout frameLayout = this.f27037a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i10 = 0; i10 < frameLayout.getChildCount(); i10++) {
            View childAt = frameLayout.getChildAt(i10);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i10);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i5);
            if (childAt == this.f27043d) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f27082x0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f27082x0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C1583g c1583g;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z2 = this.f27015A;
        b bVar = this.f27073s0;
        if (z2) {
            bVar.getClass();
            int iSave = canvas2.save();
            if (bVar.f15197B != null) {
                RectF rectF = bVar.f15229e;
                if (rectF.width() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && rectF.height() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    TextPaint textPaint = bVar.f15208N;
                    textPaint.setTextSize(bVar.f15202G);
                    float f10 = bVar.f15241p;
                    float f11 = bVar.f15242q;
                    float f12 = bVar.f15201F;
                    if (f12 != 1.0f) {
                        canvas2.scale(f12, f12, f10, f11);
                    }
                    if (bVar.f15228d0 <= 1 || bVar.f15198C) {
                        canvas2.translate(f10, f11);
                        bVar.f15219Y.draw(canvas2);
                    } else {
                        float lineStart = bVar.f15241p - bVar.f15219Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas2.translate(lineStart, f11);
                        float f13 = alpha;
                        textPaint.setAlpha((int) (bVar.f15224b0 * f13));
                        int i5 = Build.VERSION.SDK_INT;
                        if (i5 >= 31) {
                            float f14 = bVar.f15203H;
                            float f15 = bVar.f15204I;
                            float f16 = bVar.f15205J;
                            int i10 = bVar.f15206K;
                            textPaint.setShadowLayer(f14, f15, f16, AbstractC1492a.d(i10, (textPaint.getAlpha() * Color.alpha(i10)) / 255));
                        }
                        bVar.f15219Y.draw(canvas2);
                        textPaint.setAlpha((int) (bVar.f15222a0 * f13));
                        if (i5 >= 31) {
                            float f17 = bVar.f15203H;
                            float f18 = bVar.f15204I;
                            float f19 = bVar.f15205J;
                            int i11 = bVar.f15206K;
                            textPaint.setShadowLayer(f17, f18, f19, AbstractC1492a.d(i11, (Color.alpha(i11) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = bVar.f15219Y.getLineBaseline(0);
                        CharSequence charSequence = bVar.f15226c0;
                        float f20 = lineBaseline;
                        canvas2.drawText(charSequence, 0, charSequence.length(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f20, textPaint);
                        if (i5 >= 31) {
                            textPaint.setShadowLayer(bVar.f15203H, bVar.f15204I, bVar.f15205J, bVar.f15206K);
                        }
                        String strTrim = bVar.f15226c0.toString().trim();
                        if (strTrim.endsWith("…")) {
                            strTrim = strTrim.substring(0, strTrim.length() - 1);
                        }
                        String str = strTrim;
                        textPaint.setAlpha(alpha);
                        canvas2 = canvas;
                        canvas2.drawText(str, 0, Math.min(bVar.f15219Y.getLineEnd(0), str.length()), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f20, (Paint) textPaint);
                    }
                    canvas2.restoreToCount(iSave);
                }
            }
        }
        if (this.f27023I == null || (c1583g = this.f27022H) == null) {
            return;
        }
        c1583g.draw(canvas2);
        if (this.f27043d.isFocused()) {
            Rect bounds = this.f27023I.getBounds();
            Rect bounds2 = this.f27022H.getBounds();
            float f21 = bVar.f15223b;
            int iCenterX = bounds2.centerX();
            bounds.left = J7.a.c(f21, iCenterX, bounds2.left);
            bounds.right = J7.a.c(f21, iCenterX, bounds2.right);
            this.f27023I.draw(canvas2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawableStateChanged() throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            boolean r0 = r4.f27080w0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.f27080w0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            W7.b r3 = r4.f27073s0
            if (r3 == 0) goto L2f
            r3.L = r1
            android.content.res.ColorStateList r1 = r3.k
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f15236j
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.h(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.f27043d
            if (r3 == 0) goto L47
            java.util.WeakHashMap r3 = k1.S.f38779a
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L43
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            r4.t(r0, r2)
        L47:
            r4.q()
            r4.w()
            if (r1 == 0) goto L52
            r4.invalidate()
        L52:
            r4.f27080w0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final boolean e() {
        return this.f27015A && !TextUtils.isEmpty(this.f27016B) && (this.f27018D instanceof g);
    }

    public final C1583g f(boolean z2) throws Resources.NotFoundException {
        int i5 = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.wynauto.wyn.R.dimen.mtrl_shape_corner_size_small_component);
        float f10 = z2 ? dimensionPixelOffset : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        EditText editText = this.f27043d;
        float popupElevation = editText instanceof t ? ((t) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.wynauto.wyn.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.wynauto.wyn.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C1585i c1585i = new C1585i();
        C1585i c1585i2 = new C1585i();
        C1585i c1585i3 = new C1585i();
        C1585i c1585i4 = new C1585i();
        C1581e c1581e = new C1581e(i5);
        C1581e c1581e2 = new C1581e(i5);
        C1581e c1581e3 = new C1581e(i5);
        C1581e c1581e4 = new C1581e(i5);
        C1577a c1577a = new C1577a(f10);
        C1577a c1577a2 = new C1577a(f10);
        C1577a c1577a3 = new C1577a(dimensionPixelOffset);
        C1577a c1577a4 = new C1577a(dimensionPixelOffset);
        C1587k c1587k = new C1587k();
        c1587k.f19762a = c1585i;
        c1587k.f19763b = c1585i2;
        c1587k.f19764c = c1585i3;
        c1587k.f19765d = c1585i4;
        c1587k.f19766e = c1577a;
        c1587k.f19767f = c1577a2;
        c1587k.f19768g = c1577a4;
        c1587k.f19769h = c1577a3;
        c1587k.f19770i = c1581e;
        c1587k.f19771j = c1581e2;
        c1587k.k = c1581e3;
        c1587k.f19772l = c1581e4;
        Context context = getContext();
        Paint paint = C1583g.f19728w;
        TypedValue typedValueL = h.L(context, com.wynauto.wyn.R.attr.colorSurface, C1583g.class.getSimpleName());
        int i10 = typedValueL.resourceId;
        int color = i10 != 0 ? e.getColor(context, i10) : typedValueL.data;
        C1583g c1583g = new C1583g();
        c1583g.h(context);
        c1583g.j(ColorStateList.valueOf(color));
        c1583g.i(popupElevation);
        c1583g.setShapeAppearanceModel(c1587k);
        C1582f c1582f = c1583g.f19729a;
        if (c1582f.f19719g == null) {
            c1582f.f19719g = new Rect();
        }
        c1583g.f19729a.f19719g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        c1583g.invalidateSelf();
        return c1583g;
    }

    public final int g(int i5, boolean z2) {
        int compoundPaddingLeft = this.f27043d.getCompoundPaddingLeft() + i5;
        if (getPrefixText() == null || z2) {
            return compoundPaddingLeft;
        }
        return getPrefixTextView().getPaddingLeft() + (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f27043d;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public C1583g getBoxBackground() {
        int i5 = this.f27026M;
        if (i5 == 1 || i5 == 2) {
            return this.f27018D;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f27032S;
    }

    public int getBoxBackgroundMode() {
        return this.f27026M;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f27027N;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zE = k.e(this);
        RectF rectF = this.f27035V;
        return zE ? this.f27024J.f19769h.a(rectF) : this.f27024J.f19768g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zE = k.e(this);
        RectF rectF = this.f27035V;
        return zE ? this.f27024J.f19768g.a(rectF) : this.f27024J.f19769h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zE = k.e(this);
        RectF rectF = this.f27035V;
        return zE ? this.f27024J.f19766e.a(rectF) : this.f27024J.f19767f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zE = k.e(this);
        RectF rectF = this.f27035V;
        return zE ? this.f27024J.f19767f.a(rectF) : this.f27024J.f19766e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f27057k0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f27059l0;
    }

    public int getBoxStrokeWidth() {
        return this.f27029P;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f27030Q;
    }

    public int getCounterMaxLength() {
        return this.f27058l;
    }

    public CharSequence getCounterOverflowDescription() {
        Y y10;
        if (this.k && this.f27060m && (y10 = this.f27064o) != null) {
            return y10.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f27084z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f27083y;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f27050g0;
    }

    public EditText getEditText() {
        return this.f27043d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f27041c.f35161g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f27041c.f35161g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f27041c.f35166m;
    }

    public int getEndIconMode() {
        return this.f27041c.f35163i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f27041c.f35167n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f27041c.f35161g;
    }

    public CharSequence getError() {
        q qVar = this.f27055j;
        if (qVar.f35203q) {
            return qVar.f35202p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f27055j.f35206t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f27055j.f35205s;
    }

    public int getErrorCurrentTextColors() {
        Y y10 = this.f27055j.f35204r;
        if (y10 != null) {
            return y10.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f27041c.f35157c.getDrawable();
    }

    public CharSequence getHelperText() {
        q qVar = this.f27055j;
        if (qVar.f35210x) {
            return qVar.f35209w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        Y y10 = this.f27055j.f35211y;
        if (y10 != null) {
            return y10.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f27015A) {
            return this.f27016B;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f27073s0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.f27073s0;
        return bVar.e(bVar.k);
    }

    public ColorStateList getHintTextColor() {
        return this.f27052h0;
    }

    public z getLengthCounter() {
        return this.f27062n;
    }

    public int getMaxEms() {
        return this.f27049g;
    }

    public int getMaxWidth() {
        return this.f27053i;
    }

    public int getMinEms() {
        return this.f27047f;
    }

    public int getMinWidth() {
        return this.f27051h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f27041c.f35161g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f27041c.f35161g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f27072s) {
            return this.f27070r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f27078v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f27076u;
    }

    public CharSequence getPrefixText() {
        return this.f27039b.f35229c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f27039b.f35228b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f27039b.f35228b;
    }

    public C1587k getShapeAppearanceModel() {
        return this.f27024J;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f27039b.f35230d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f27039b.f35230d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f27039b.f35233g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f27039b.f35234h;
    }

    public CharSequence getSuffixText() {
        return this.f27041c.f35169p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f27041c.f35170q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f27041c.f35170q;
    }

    public Typeface getTypeface() {
        return this.f27036W;
    }

    public final int h(int i5, boolean z2) {
        int compoundPaddingRight = i5 - this.f27043d.getCompoundPaddingRight();
        return (getPrefixText() == null || !z2) ? compoundPaddingRight : (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight()) + compoundPaddingRight;
    }

    public final void i() throws Resources.NotFoundException {
        int i5 = this.f27026M;
        if (i5 == 0) {
            this.f27018D = null;
            this.f27022H = null;
            this.f27023I = null;
        } else if (i5 == 1) {
            this.f27018D = new C1583g(this.f27024J);
            this.f27022H = new C1583g();
            this.f27023I = new C1583g();
        } else {
            if (i5 != 2) {
                throw new IllegalArgumentException(AbstractC0279p0.j(this.f27026M, " is illegal; only @BoxBackgroundMode constants are supported.", new StringBuilder()));
            }
            if (!this.f27015A || (this.f27018D instanceof g)) {
                this.f27018D = new C1583g(this.f27024J);
            } else {
                C1587k c1587k = this.f27024J;
                int i10 = g.f35135y;
                if (c1587k == null) {
                    c1587k = new C1587k();
                }
                f fVar = new f(c1587k, new RectF());
                g gVar = new g(fVar);
                gVar.f35136x = fVar;
                this.f27018D = gVar;
            }
            this.f27022H = null;
            this.f27023I = null;
        }
        r();
        w();
        if (this.f27026M == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f27027N = getResources().getDimensionPixelSize(com.wynauto.wyn.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (c.F(getContext())) {
                this.f27027N = getResources().getDimensionPixelSize(com.wynauto.wyn.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f27043d != null && this.f27026M == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f27043d;
                WeakHashMap weakHashMap = S.f38779a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.wynauto.wyn.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f27043d.getPaddingEnd(), getResources().getDimensionPixelSize(com.wynauto.wyn.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (c.F(getContext())) {
                EditText editText2 = this.f27043d;
                WeakHashMap weakHashMap2 = S.f38779a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.wynauto.wyn.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f27043d.getPaddingEnd(), getResources().getDimensionPixelSize(com.wynauto.wyn.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f27026M != 0) {
            s();
        }
        EditText editText3 = this.f27043d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i11 = this.f27026M;
                if (i11 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i11 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.j():void");
    }

    public final void l(Y y10, int i5) {
        try {
            y10.setTextAppearance(i5);
            if (y10.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        y10.setTextAppearance(2132017644);
        y10.setTextColor(e.getColor(getContext(), com.wynauto.wyn.R.color.design_error));
    }

    public final boolean m() {
        q qVar = this.f27055j;
        return (qVar.f35201o != 1 || qVar.f35204r == null || TextUtils.isEmpty(qVar.f35202p)) ? false : true;
    }

    public final void n(Editable editable) throws Resources.NotFoundException {
        ((Z0) this.f27062n).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z2 = this.f27060m;
        int i5 = this.f27058l;
        String string = null;
        if (i5 == -1) {
            this.f27064o.setText(String.valueOf(length));
            this.f27064o.setContentDescription(null);
            this.f27060m = false;
        } else {
            this.f27060m = length > i5;
            Context context = getContext();
            this.f27064o.setContentDescription(context.getString(this.f27060m ? com.wynauto.wyn.R.string.character_counter_overflowed_content_description : com.wynauto.wyn.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f27058l)));
            if (z2 != this.f27060m) {
                o();
            }
            C2840b c2840bC = C2840b.c();
            Y y10 = this.f27064o;
            String string2 = getContext().getString(com.wynauto.wyn.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f27058l));
            if (string2 == null) {
                c2840bC.getClass();
            } else {
                c2840bC.getClass();
                F f10 = i1.f.f36716a;
                string = c2840bC.d(string2).toString();
            }
            y10.setText(string);
        }
        if (this.f27043d == null || z2 == this.f27060m) {
            return;
        }
        t(false, false);
        w();
        q();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Y y10 = this.f27064o;
        if (y10 != null) {
            l(y10, this.f27060m ? this.f27066p : this.f27068q);
            if (!this.f27060m && (colorStateList2 = this.f27083y) != null) {
                this.f27064o.setTextColor(colorStateList2);
            }
            if (!this.f27060m || (colorStateList = this.f27084z) == null) {
                return;
            }
            this.f27064o.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f27073s0.g(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        super.onLayout(z2, i5, i10, i11, i12);
        EditText editText = this.f27043d;
        if (editText != null) {
            ThreadLocal threadLocal = W7.c.f15252a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f27033T;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = W7.c.f15252a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            W7.c.a(this, editText, matrix);
            ThreadLocal threadLocal3 = W7.c.f15253b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            C1583g c1583g = this.f27022H;
            if (c1583g != null) {
                int i13 = rect.bottom;
                c1583g.setBounds(rect.left, i13 - this.f27029P, rect.right, i13);
            }
            C1583g c1583g2 = this.f27023I;
            if (c1583g2 != null) {
                int i14 = rect.bottom;
                c1583g2.setBounds(rect.left, i14 - this.f27030Q, rect.right, i14);
            }
            if (this.f27015A) {
                float textSize = this.f27043d.getTextSize();
                b bVar = this.f27073s0;
                if (bVar.f15234h != textSize) {
                    bVar.f15234h = textSize;
                    bVar.h(false);
                }
                int gravity = this.f27043d.getGravity();
                int i15 = (gravity & (-113)) | 48;
                if (bVar.f15233g != i15) {
                    bVar.f15233g = i15;
                    bVar.h(false);
                }
                if (bVar.f15231f != gravity) {
                    bVar.f15231f = gravity;
                    bVar.h(false);
                }
                if (this.f27043d == null) {
                    throw new IllegalStateException();
                }
                boolean zE = k.e(this);
                int i16 = rect.bottom;
                Rect rect2 = this.f27034U;
                rect2.bottom = i16;
                int i17 = this.f27026M;
                if (i17 == 1) {
                    rect2.left = g(rect.left, zE);
                    rect2.top = rect.top + this.f27027N;
                    rect2.right = h(rect.right, zE);
                } else if (i17 != 2) {
                    rect2.left = g(rect.left, zE);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, zE);
                } else {
                    rect2.left = this.f27043d.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.f27043d.getPaddingRight();
                }
                int i18 = rect2.left;
                int i19 = rect2.top;
                int i20 = rect2.right;
                int i21 = rect2.bottom;
                Rect rect3 = bVar.f15227d;
                if (rect3.left != i18 || rect3.top != i19 || rect3.right != i20 || rect3.bottom != i21) {
                    rect3.set(i18, i19, i20, i21);
                    bVar.f15207M = true;
                }
                if (this.f27043d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = bVar.f15209O;
                textPaint.setTextSize(bVar.f15234h);
                textPaint.setTypeface(bVar.f15246u);
                textPaint.setLetterSpacing(bVar.f15217W);
                float f10 = -textPaint.ascent();
                rect2.left = this.f27043d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f27026M != 1 || this.f27043d.getMinLines() > 1) ? rect.top + this.f27043d.getCompoundPaddingTop() : (int) (rect.centerY() - (f10 / 2.0f));
                rect2.right = rect.right - this.f27043d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f27026M != 1 || this.f27043d.getMinLines() > 1) ? rect.bottom - this.f27043d.getCompoundPaddingBottom() : (int) (rect2.top + f10);
                rect2.bottom = compoundPaddingBottom;
                int i22 = rect2.left;
                int i23 = rect2.top;
                int i24 = rect2.right;
                Rect rect4 = bVar.f15225c;
                if (rect4.left != i22 || rect4.top != i23 || rect4.right != i24 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i22, i23, i24, compoundPaddingBottom);
                    bVar.f15207M = true;
                }
                bVar.h(false);
                if (!e() || this.f27071r0) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i5, int i10) {
        EditText editText;
        int iMax;
        super.onMeasure(i5, i10);
        EditText editText2 = this.f27043d;
        m mVar = this.f27041c;
        boolean z2 = false;
        if (editText2 != null && this.f27043d.getMeasuredHeight() < (iMax = Math.max(mVar.getMeasuredHeight(), this.f27039b.getMeasuredHeight()))) {
            this.f27043d.setMinimumHeight(iMax);
            z2 = true;
        }
        boolean zP = p();
        if (z2 || zP) {
            this.f27043d.post(new x(this, 1));
        }
        if (this.f27074t != null && (editText = this.f27043d) != null) {
            this.f27074t.setGravity(editText.getGravity());
            this.f27074t.setPadding(this.f27043d.getCompoundPaddingLeft(), this.f27043d.getCompoundPaddingTop(), this.f27043d.getCompoundPaddingRight(), this.f27043d.getCompoundPaddingBottom());
        }
        mVar.l();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof A)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        A a5 = (A) parcelable;
        super.onRestoreInstanceState(a5.f44826a);
        setError(a5.f35117c);
        if (a5.f35118d) {
            post(new x(this, 0));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i5) {
        super.onRtlPropertiesChanged(i5);
        boolean z2 = i5 == 1;
        if (z2 != this.f27025K) {
            InterfaceC1579c interfaceC1579c = this.f27024J.f19766e;
            RectF rectF = this.f27035V;
            float fA = interfaceC1579c.a(rectF);
            float fA2 = this.f27024J.f19767f.a(rectF);
            float fA3 = this.f27024J.f19769h.a(rectF);
            float fA4 = this.f27024J.f19768g.a(rectF);
            C1587k c1587k = this.f27024J;
            Fe.e eVar = c1587k.f19762a;
            Fe.e eVar2 = c1587k.f19763b;
            Fe.e eVar3 = c1587k.f19765d;
            Fe.e eVar4 = c1587k.f19764c;
            C1581e c1581e = new C1581e(0);
            C1581e c1581e2 = new C1581e(0);
            C1581e c1581e3 = new C1581e(0);
            C1581e c1581e4 = new C1581e(0);
            C1586j.b(eVar2);
            C1586j.b(eVar);
            C1586j.b(eVar4);
            C1586j.b(eVar3);
            C1577a c1577a = new C1577a(fA2);
            C1577a c1577a2 = new C1577a(fA);
            C1577a c1577a3 = new C1577a(fA4);
            C1577a c1577a4 = new C1577a(fA3);
            C1587k c1587k2 = new C1587k();
            c1587k2.f19762a = eVar2;
            c1587k2.f19763b = eVar;
            c1587k2.f19764c = eVar3;
            c1587k2.f19765d = eVar4;
            c1587k2.f19766e = c1577a;
            c1587k2.f19767f = c1577a2;
            c1587k2.f19768g = c1577a4;
            c1587k2.f19769h = c1577a3;
            c1587k2.f19770i = c1581e;
            c1587k2.f19771j = c1581e2;
            c1587k2.k = c1581e3;
            c1587k2.f19772l = c1581e4;
            this.f27025K = z2;
            setShapeAppearanceModel(c1587k2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        A a5 = new A(super.onSaveInstanceState());
        if (m()) {
            a5.f35117c = getError();
        }
        m mVar = this.f27041c;
        a5.f35118d = mVar.f35163i != 0 && mVar.f35161g.f26973d;
        return a5;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p() {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.p():boolean");
    }

    public final void q() {
        Drawable background;
        Y y10;
        EditText editText = this.f27043d;
        if (editText == null || this.f27026M != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC3827n0.f43839a;
        Drawable drawableMutate = background.mutate();
        if (m()) {
            drawableMutate.setColorFilter(C3830p.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f27060m && (y10 = this.f27064o) != null) {
            drawableMutate.setColorFilter(C3830p.c(y10.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f27043d.refreshDrawableState();
        }
    }

    public final void r() {
        EditText editText = this.f27043d;
        if (editText == null || this.f27018D == null) {
            return;
        }
        if ((this.f27021G || editText.getBackground() == null) && this.f27026M != 0) {
            EditText editText2 = this.f27043d;
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            WeakHashMap weakHashMap = S.f38779a;
            editText2.setBackground(editTextBoxBackground);
            this.f27021G = true;
        }
    }

    public final void s() {
        if (this.f27026M != 1) {
            FrameLayout frameLayout = this.f27037a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iC = c();
            if (iC != layoutParams.topMargin) {
                layoutParams.topMargin = iC;
                frameLayout.requestLayout();
            }
        }
    }

    public void setBoxBackgroundColor(int i5) {
        if (this.f27032S != i5) {
            this.f27032S = i5;
            this.f27061m0 = i5;
            this.f27065o0 = i5;
            this.f27067p0 = i5;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i5) {
        setBoxBackgroundColor(e.getColor(getContext(), i5));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f27061m0 = defaultColor;
        this.f27032S = defaultColor;
        this.f27063n0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f27065o0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f27067p0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i5) throws Resources.NotFoundException {
        if (i5 == this.f27026M) {
            return;
        }
        this.f27026M = i5;
        if (this.f27043d != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i5) {
        this.f27027N = i5;
    }

    public void setBoxCornerFamily(int i5) {
        C1586j c1586jE = this.f27024J.e();
        InterfaceC1579c interfaceC1579c = this.f27024J.f19766e;
        Fe.e eVarY = Fe.g.y(i5);
        c1586jE.f19751a = eVarY;
        C1586j.b(eVarY);
        c1586jE.f19755e = interfaceC1579c;
        InterfaceC1579c interfaceC1579c2 = this.f27024J.f19767f;
        Fe.e eVarY2 = Fe.g.y(i5);
        c1586jE.f19752b = eVarY2;
        C1586j.b(eVarY2);
        c1586jE.f19756f = interfaceC1579c2;
        InterfaceC1579c interfaceC1579c3 = this.f27024J.f19769h;
        Fe.e eVarY3 = Fe.g.y(i5);
        c1586jE.f19754d = eVarY3;
        C1586j.b(eVarY3);
        c1586jE.f19758h = interfaceC1579c3;
        InterfaceC1579c interfaceC1579c4 = this.f27024J.f19768g;
        Fe.e eVarY4 = Fe.g.y(i5);
        c1586jE.f19753c = eVarY4;
        C1586j.b(eVarY4);
        c1586jE.f19757g = interfaceC1579c4;
        this.f27024J = c1586jE.a();
        b();
    }

    public void setBoxStrokeColor(int i5) throws Resources.NotFoundException {
        if (this.f27057k0 != i5) {
            this.f27057k0 = i5;
            w();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (colorStateList.isStateful()) {
            this.f27054i0 = colorStateList.getDefaultColor();
            this.f27069q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f27056j0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f27057k0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f27057k0 != colorStateList.getDefaultColor()) {
            this.f27057k0 = colorStateList.getDefaultColor();
        }
        w();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.f27059l0 != colorStateList) {
            this.f27059l0 = colorStateList;
            w();
        }
    }

    public void setBoxStrokeWidth(int i5) throws Resources.NotFoundException {
        this.f27029P = i5;
        w();
    }

    public void setBoxStrokeWidthFocused(int i5) throws Resources.NotFoundException {
        this.f27030Q = i5;
        w();
    }

    public void setBoxStrokeWidthFocusedResource(int i5) throws Resources.NotFoundException {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i5));
    }

    public void setBoxStrokeWidthResource(int i5) throws Resources.NotFoundException {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i5));
    }

    public void setCounterEnabled(boolean z2) throws Resources.NotFoundException {
        if (this.k != z2) {
            q qVar = this.f27055j;
            if (z2) {
                Y y10 = new Y(getContext(), null);
                this.f27064o = y10;
                y10.setId(com.wynauto.wyn.R.id.textinput_counter);
                Typeface typeface = this.f27036W;
                if (typeface != null) {
                    this.f27064o.setTypeface(typeface);
                }
                this.f27064o.setMaxLines(1);
                qVar.a(this.f27064o, 2);
                ((ViewGroup.MarginLayoutParams) this.f27064o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.wynauto.wyn.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f27064o != null) {
                    EditText editText = this.f27043d;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                qVar.g(this.f27064o, 2);
                this.f27064o = null;
            }
            this.k = z2;
        }
    }

    public void setCounterMaxLength(int i5) throws Resources.NotFoundException {
        if (this.f27058l != i5) {
            if (i5 > 0) {
                this.f27058l = i5;
            } else {
                this.f27058l = -1;
            }
            if (!this.k || this.f27064o == null) {
                return;
            }
            EditText editText = this.f27043d;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i5) {
        if (this.f27066p != i5) {
            this.f27066p = i5;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f27084z != colorStateList) {
            this.f27084z = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i5) {
        if (this.f27068q != i5) {
            this.f27068q = i5;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f27083y != colorStateList) {
            this.f27083y = colorStateList;
            o();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f27050g0 = colorStateList;
        this.f27052h0 = colorStateList;
        if (this.f27043d != null) {
            t(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        k(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.f27041c.f35161g.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f27041c.f35161g.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i5) {
        m mVar = this.f27041c;
        CharSequence text = i5 != 0 ? mVar.getResources().getText(i5) : null;
        CheckableImageButton checkableImageButton = mVar.f35161g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i5) {
        m mVar = this.f27041c;
        Drawable drawableB = i5 != 0 ? Fe.g.B(mVar.getContext(), i5) : null;
        CheckableImageButton checkableImageButton = mVar.f35161g;
        checkableImageButton.setImageDrawable(drawableB);
        if (drawableB != null) {
            ColorStateList colorStateList = mVar.k;
            PorterDuff.Mode mode = mVar.f35165l;
            TextInputLayout textInputLayout = mVar.f35155a;
            gc.b.e(textInputLayout, checkableImageButton, colorStateList, mode);
            gc.b.D(textInputLayout, checkableImageButton, mVar.k);
        }
    }

    public void setEndIconMinSize(int i5) {
        m mVar = this.f27041c;
        if (i5 < 0) {
            mVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i5 != mVar.f35166m) {
            mVar.f35166m = i5;
            CheckableImageButton checkableImageButton = mVar.f35161g;
            checkableImageButton.setMinimumWidth(i5);
            checkableImageButton.setMinimumHeight(i5);
            CheckableImageButton checkableImageButton2 = mVar.f35157c;
            checkableImageButton2.setMinimumWidth(i5);
            checkableImageButton2.setMinimumHeight(i5);
        }
    }

    public void setEndIconMode(int i5) {
        this.f27041c.f(i5);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        m mVar = this.f27041c;
        View.OnLongClickListener onLongClickListener = mVar.f35168o;
        CheckableImageButton checkableImageButton = mVar.f35161g;
        checkableImageButton.setOnClickListener(onClickListener);
        gc.b.H(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        m mVar = this.f27041c;
        mVar.f35168o = onLongClickListener;
        CheckableImageButton checkableImageButton = mVar.f35161g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        gc.b.H(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        m mVar = this.f27041c;
        mVar.f35167n = scaleType;
        mVar.f35161g.setScaleType(scaleType);
        mVar.f35157c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        m mVar = this.f27041c;
        if (mVar.k != colorStateList) {
            mVar.k = colorStateList;
            gc.b.e(mVar.f35155a, mVar.f35161g, colorStateList, mVar.f35165l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        m mVar = this.f27041c;
        if (mVar.f35165l != mode) {
            mVar.f35165l = mode;
            gc.b.e(mVar.f35155a, mVar.f35161g, mVar.k, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.f27041c.g(z2);
    }

    public void setError(CharSequence charSequence) throws Resources.NotFoundException {
        q qVar = this.f27055j;
        if (!qVar.f35203q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            qVar.f();
            return;
        }
        qVar.c();
        qVar.f35202p = charSequence;
        qVar.f35204r.setText(charSequence);
        int i5 = qVar.f35200n;
        if (i5 != 1) {
            qVar.f35201o = 1;
        }
        qVar.i(i5, qVar.f35201o, qVar.h(qVar.f35204r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i5) {
        q qVar = this.f27055j;
        qVar.f35206t = i5;
        Y y10 = qVar.f35204r;
        if (y10 != null) {
            WeakHashMap weakHashMap = S.f38779a;
            y10.setAccessibilityLiveRegion(i5);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        q qVar = this.f27055j;
        qVar.f35205s = charSequence;
        Y y10 = qVar.f35204r;
        if (y10 != null) {
            y10.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) throws Resources.NotFoundException {
        q qVar = this.f27055j;
        if (qVar.f35203q == z2) {
            return;
        }
        qVar.c();
        TextInputLayout textInputLayout = qVar.f35195h;
        if (z2) {
            Y y10 = new Y(qVar.f35194g, null);
            qVar.f35204r = y10;
            y10.setId(com.wynauto.wyn.R.id.textinput_error);
            qVar.f35204r.setTextAlignment(5);
            Typeface typeface = qVar.f35187B;
            if (typeface != null) {
                qVar.f35204r.setTypeface(typeface);
            }
            int i5 = qVar.f35207u;
            qVar.f35207u = i5;
            Y y11 = qVar.f35204r;
            if (y11 != null) {
                textInputLayout.l(y11, i5);
            }
            ColorStateList colorStateList = qVar.f35208v;
            qVar.f35208v = colorStateList;
            Y y12 = qVar.f35204r;
            if (y12 != null && colorStateList != null) {
                y12.setTextColor(colorStateList);
            }
            CharSequence charSequence = qVar.f35205s;
            qVar.f35205s = charSequence;
            Y y13 = qVar.f35204r;
            if (y13 != null) {
                y13.setContentDescription(charSequence);
            }
            int i10 = qVar.f35206t;
            qVar.f35206t = i10;
            Y y14 = qVar.f35204r;
            if (y14 != null) {
                WeakHashMap weakHashMap = S.f38779a;
                y14.setAccessibilityLiveRegion(i10);
            }
            qVar.f35204r.setVisibility(4);
            qVar.a(qVar.f35204r, 0);
        } else {
            qVar.f();
            qVar.g(qVar.f35204r, 0);
            qVar.f35204r = null;
            textInputLayout.q();
            textInputLayout.w();
        }
        qVar.f35203q = z2;
    }

    public void setErrorIconDrawable(int i5) {
        m mVar = this.f27041c;
        mVar.h(i5 != 0 ? Fe.g.B(mVar.getContext(), i5) : null);
        gc.b.D(mVar.f35155a, mVar.f35157c, mVar.f35158d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        m mVar = this.f27041c;
        CheckableImageButton checkableImageButton = mVar.f35157c;
        View.OnLongClickListener onLongClickListener = mVar.f35160f;
        checkableImageButton.setOnClickListener(onClickListener);
        gc.b.H(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        m mVar = this.f27041c;
        mVar.f35160f = onLongClickListener;
        CheckableImageButton checkableImageButton = mVar.f35157c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        gc.b.H(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        m mVar = this.f27041c;
        if (mVar.f35158d != colorStateList) {
            mVar.f35158d = colorStateList;
            gc.b.e(mVar.f35155a, mVar.f35157c, colorStateList, mVar.f35159e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        m mVar = this.f27041c;
        if (mVar.f35159e != mode) {
            mVar.f35159e = mode;
            gc.b.e(mVar.f35155a, mVar.f35157c, mVar.f35158d, mode);
        }
    }

    public void setErrorTextAppearance(int i5) {
        q qVar = this.f27055j;
        qVar.f35207u = i5;
        Y y10 = qVar.f35204r;
        if (y10 != null) {
            qVar.f35195h.l(y10, i5);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        q qVar = this.f27055j;
        qVar.f35208v = colorStateList;
        Y y10 = qVar.f35204r;
        if (y10 == null || colorStateList == null) {
            return;
        }
        y10.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.f27075t0 != z2) {
            this.f27075t0 = z2;
            t(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) throws Resources.NotFoundException {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        q qVar = this.f27055j;
        if (zIsEmpty) {
            if (qVar.f35210x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!qVar.f35210x) {
            setHelperTextEnabled(true);
        }
        qVar.c();
        qVar.f35209w = charSequence;
        qVar.f35211y.setText(charSequence);
        int i5 = qVar.f35200n;
        if (i5 != 2) {
            qVar.f35201o = 2;
        }
        qVar.i(i5, qVar.f35201o, qVar.h(qVar.f35211y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        q qVar = this.f27055j;
        qVar.f35186A = colorStateList;
        Y y10 = qVar.f35211y;
        if (y10 == null || colorStateList == null) {
            return;
        }
        y10.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) throws Resources.NotFoundException {
        q qVar = this.f27055j;
        if (qVar.f35210x == z2) {
            return;
        }
        qVar.c();
        if (z2) {
            Y y10 = new Y(qVar.f35194g, null);
            qVar.f35211y = y10;
            y10.setId(com.wynauto.wyn.R.id.textinput_helper_text);
            qVar.f35211y.setTextAlignment(5);
            Typeface typeface = qVar.f35187B;
            if (typeface != null) {
                qVar.f35211y.setTypeface(typeface);
            }
            qVar.f35211y.setVisibility(4);
            qVar.f35211y.setAccessibilityLiveRegion(1);
            int i5 = qVar.f35212z;
            qVar.f35212z = i5;
            Y y11 = qVar.f35211y;
            if (y11 != null) {
                y11.setTextAppearance(i5);
            }
            ColorStateList colorStateList = qVar.f35186A;
            qVar.f35186A = colorStateList;
            Y y12 = qVar.f35211y;
            if (y12 != null && colorStateList != null) {
                y12.setTextColor(colorStateList);
            }
            qVar.a(qVar.f35211y, 1);
            qVar.f35211y.setAccessibilityDelegate(new p(qVar));
        } else {
            qVar.c();
            int i10 = qVar.f35200n;
            if (i10 == 2) {
                qVar.f35201o = 0;
            }
            qVar.i(i10, qVar.f35201o, qVar.h(qVar.f35211y, ""));
            qVar.g(qVar.f35211y, 1);
            qVar.f35211y = null;
            TextInputLayout textInputLayout = qVar.f35195h;
            textInputLayout.q();
            textInputLayout.w();
        }
        qVar.f35210x = z2;
    }

    public void setHelperTextTextAppearance(int i5) {
        q qVar = this.f27055j;
        qVar.f35212z = i5;
        Y y10 = qVar.f35211y;
        if (y10 != null) {
            y10.setTextAppearance(i5);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f27015A) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.f27077u0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.f27015A) {
            this.f27015A = z2;
            if (z2) {
                CharSequence hint = this.f27043d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f27016B)) {
                        setHint(hint);
                    }
                    this.f27043d.setHint((CharSequence) null);
                }
                this.f27017C = true;
            } else {
                this.f27017C = false;
                if (!TextUtils.isEmpty(this.f27016B) && TextUtils.isEmpty(this.f27043d.getHint())) {
                    this.f27043d.setHint(this.f27016B);
                }
                setHintInternal(null);
            }
            if (this.f27043d != null) {
                s();
            }
        }
    }

    public void setHintTextAppearance(int i5) {
        b bVar = this.f27073s0;
        TextInputLayout textInputLayout = bVar.f15221a;
        d dVar = new d(textInputLayout.getContext(), i5);
        ColorStateList colorStateList = dVar.f17028j;
        if (colorStateList != null) {
            bVar.k = colorStateList;
        }
        float f10 = dVar.k;
        if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            bVar.f15235i = f10;
        }
        ColorStateList colorStateList2 = dVar.f17019a;
        if (colorStateList2 != null) {
            bVar.f15215U = colorStateList2;
        }
        bVar.f15213S = dVar.f17023e;
        bVar.f15214T = dVar.f17024f;
        bVar.f15212R = dVar.f17025g;
        bVar.f15216V = dVar.f17027i;
        Z7.a aVar = bVar.f15250y;
        if (aVar != null) {
            aVar.f17012d = true;
        }
        C4552j c4552j = new C4552j(bVar, 24);
        dVar.a();
        bVar.f15250y = new Z7.a(c4552j, dVar.f17031n);
        dVar.c(textInputLayout.getContext(), bVar.f15250y);
        bVar.h(false);
        this.f27052h0 = bVar.k;
        if (this.f27043d != null) {
            t(false, false);
            s();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f27052h0 != colorStateList) {
            if (this.f27050g0 == null) {
                b bVar = this.f27073s0;
                if (bVar.k != colorStateList) {
                    bVar.k = colorStateList;
                    bVar.h(false);
                }
            }
            this.f27052h0 = colorStateList;
            if (this.f27043d != null) {
                t(false, false);
            }
        }
    }

    public void setLengthCounter(z zVar) {
        this.f27062n = zVar;
    }

    public void setMaxEms(int i5) {
        this.f27049g = i5;
        EditText editText = this.f27043d;
        if (editText == null || i5 == -1) {
            return;
        }
        editText.setMaxEms(i5);
    }

    public void setMaxWidth(int i5) {
        this.f27053i = i5;
        EditText editText = this.f27043d;
        if (editText == null || i5 == -1) {
            return;
        }
        editText.setMaxWidth(i5);
    }

    public void setMaxWidthResource(int i5) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i5));
    }

    public void setMinEms(int i5) {
        this.f27047f = i5;
        EditText editText = this.f27043d;
        if (editText == null || i5 == -1) {
            return;
        }
        editText.setMinEms(i5);
    }

    public void setMinWidth(int i5) {
        this.f27051h = i5;
        EditText editText = this.f27043d;
        if (editText == null || i5 == -1) {
            return;
        }
        editText.setMinWidth(i5);
    }

    public void setMinWidthResource(int i5) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i5));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i5) {
        m mVar = this.f27041c;
        mVar.f35161g.setContentDescription(i5 != 0 ? mVar.getResources().getText(i5) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i5) {
        m mVar = this.f27041c;
        mVar.f35161g.setImageDrawable(i5 != 0 ? Fe.g.B(mVar.getContext(), i5) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        m mVar = this.f27041c;
        if (z2 && mVar.f35163i != 1) {
            mVar.f(1);
        } else if (z2) {
            mVar.getClass();
        } else {
            mVar.f(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        m mVar = this.f27041c;
        mVar.k = colorStateList;
        gc.b.e(mVar.f35155a, mVar.f35161g, colorStateList, mVar.f35165l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        m mVar = this.f27041c;
        mVar.f35165l = mode;
        gc.b.e(mVar.f35155a, mVar.f35161g, mVar.k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f27074t == null) {
            Y y10 = new Y(getContext(), null);
            this.f27074t = y10;
            y10.setId(com.wynauto.wyn.R.id.textinput_placeholder);
            this.f27074t.setImportantForAccessibility(2);
            C4088h c4088hD = d();
            this.f27079w = c4088hD;
            c4088hD.f45699b = 67L;
            this.f27081x = d();
            setPlaceholderTextAppearance(this.f27078v);
            setPlaceholderTextColor(this.f27076u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f27072s) {
                setPlaceholderTextEnabled(true);
            }
            this.f27070r = charSequence;
        }
        EditText editText = this.f27043d;
        u(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i5) {
        this.f27078v = i5;
        Y y10 = this.f27074t;
        if (y10 != null) {
            y10.setTextAppearance(i5);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f27076u != colorStateList) {
            this.f27076u = colorStateList;
            Y y10 = this.f27074t;
            if (y10 == null || colorStateList == null) {
                return;
            }
            y10.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        v vVar = this.f27039b;
        vVar.getClass();
        vVar.f35229c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        vVar.f35228b.setText(charSequence);
        vVar.d();
    }

    public void setPrefixTextAppearance(int i5) {
        this.f27039b.f35228b.setTextAppearance(i5);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f27039b.f35228b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(C1587k c1587k) {
        C1583g c1583g = this.f27018D;
        if (c1583g == null || c1583g.f19729a.f19713a == c1587k) {
            return;
        }
        this.f27024J = c1587k;
        b();
    }

    public void setStartIconCheckable(boolean z2) {
        this.f27039b.f35230d.setCheckable(z2);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f27039b.f35230d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i5) {
        setStartIconDrawable(i5 != 0 ? Fe.g.B(getContext(), i5) : null);
    }

    public void setStartIconMinSize(int i5) {
        v vVar = this.f27039b;
        if (i5 < 0) {
            vVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i5 != vVar.f35233g) {
            vVar.f35233g = i5;
            CheckableImageButton checkableImageButton = vVar.f35230d;
            checkableImageButton.setMinimumWidth(i5);
            checkableImageButton.setMinimumHeight(i5);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        v vVar = this.f27039b;
        View.OnLongClickListener onLongClickListener = vVar.f35235i;
        CheckableImageButton checkableImageButton = vVar.f35230d;
        checkableImageButton.setOnClickListener(onClickListener);
        gc.b.H(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        v vVar = this.f27039b;
        vVar.f35235i = onLongClickListener;
        CheckableImageButton checkableImageButton = vVar.f35230d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        gc.b.H(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        v vVar = this.f27039b;
        vVar.f35234h = scaleType;
        vVar.f35230d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        v vVar = this.f27039b;
        if (vVar.f35231e != colorStateList) {
            vVar.f35231e = colorStateList;
            gc.b.e(vVar.f35227a, vVar.f35230d, colorStateList, vVar.f35232f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        v vVar = this.f27039b;
        if (vVar.f35232f != mode) {
            vVar.f35232f = mode;
            gc.b.e(vVar.f35227a, vVar.f35230d, vVar.f35231e, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.f27039b.b(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        m mVar = this.f27041c;
        mVar.getClass();
        mVar.f35169p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        mVar.f35170q.setText(charSequence);
        mVar.m();
    }

    public void setSuffixTextAppearance(int i5) {
        this.f27041c.f35170q.setTextAppearance(i5);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f27041c.f35170q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(y yVar) {
        EditText editText = this.f27043d;
        if (editText != null) {
            S.m(editText, yVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f27036W) {
            this.f27036W = typeface;
            this.f27073s0.m(typeface);
            q qVar = this.f27055j;
            if (typeface != qVar.f35187B) {
                qVar.f35187B = typeface;
                Y y10 = qVar.f35204r;
                if (y10 != null) {
                    y10.setTypeface(typeface);
                }
                Y y11 = qVar.f35211y;
                if (y11 != null) {
                    y11.setTypeface(typeface);
                }
            }
            Y y12 = this.f27064o;
            if (y12 != null) {
                y12.setTypeface(typeface);
            }
        }
    }

    public final void t(boolean z2, boolean z10) {
        ColorStateList colorStateList;
        Y y10;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f27043d;
        boolean z11 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f27043d;
        boolean z12 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f27050g0;
        b bVar = this.f27073s0;
        if (colorStateList2 != null) {
            bVar.i(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f27050g0;
            bVar.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f27069q0) : this.f27069q0));
        } else if (m()) {
            Y y11 = this.f27055j.f35204r;
            bVar.i(y11 != null ? y11.getTextColors() : null);
        } else if (this.f27060m && (y10 = this.f27064o) != null) {
            bVar.i(y10.getTextColors());
        } else if (z12 && (colorStateList = this.f27052h0) != null && bVar.k != colorStateList) {
            bVar.k = colorStateList;
            bVar.h(false);
        }
        m mVar = this.f27041c;
        v vVar = this.f27039b;
        if (z11 || !this.f27075t0 || (isEnabled() && z12)) {
            if (z10 || this.f27071r0) {
                ValueAnimator valueAnimator = this.v0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.v0.cancel();
                }
                if (z2 && this.f27077u0) {
                    a(1.0f);
                } else {
                    bVar.k(1.0f);
                }
                this.f27071r0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.f27043d;
                u(editText3 != null ? editText3.getText() : null);
                vVar.f35236j = false;
                vVar.d();
                mVar.f35171r = false;
                mVar.m();
                return;
            }
            return;
        }
        if (z10 || !this.f27071r0) {
            ValueAnimator valueAnimator2 = this.v0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.v0.cancel();
            }
            if (z2 && this.f27077u0) {
                a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else {
                bVar.k(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            if (e() && !((g) this.f27018D).f35136x.f35134q.isEmpty() && e()) {
                ((g) this.f27018D).n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            this.f27071r0 = true;
            Y y12 = this.f27074t;
            if (y12 != null && this.f27072s) {
                y12.setText((CharSequence) null);
                AbstractC4100t.a(this.f27037a, this.f27081x);
                this.f27074t.setVisibility(4);
            }
            vVar.f35236j = true;
            vVar.d();
            mVar.f35171r = true;
            mVar.m();
        }
    }

    public final void u(Editable editable) {
        ((Z0) this.f27062n).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f27037a;
        if (length != 0 || this.f27071r0) {
            Y y10 = this.f27074t;
            if (y10 == null || !this.f27072s) {
                return;
            }
            y10.setText((CharSequence) null);
            AbstractC4100t.a(frameLayout, this.f27081x);
            this.f27074t.setVisibility(4);
            return;
        }
        if (this.f27074t == null || !this.f27072s || TextUtils.isEmpty(this.f27070r)) {
            return;
        }
        this.f27074t.setText(this.f27070r);
        AbstractC4100t.a(frameLayout, this.f27079w);
        this.f27074t.setVisibility(0);
        this.f27074t.bringToFront();
        announceForAccessibility(this.f27070r);
    }

    public final void v(boolean z2, boolean z10) {
        int defaultColor = this.f27059l0.getDefaultColor();
        int colorForState = this.f27059l0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f27059l0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.f27031R = colorForState2;
        } else if (z10) {
            this.f27031R = colorForState;
        } else {
            this.f27031R = defaultColor;
        }
    }

    public final void w() throws Resources.NotFoundException {
        Y y10;
        EditText editText;
        EditText editText2;
        if (this.f27018D == null || this.f27026M == 0) {
            return;
        }
        boolean z2 = false;
        boolean z10 = isFocused() || ((editText2 = this.f27043d) != null && editText2.hasFocus());
        boolean z11 = isHovered() || ((editText = this.f27043d) != null && editText.isHovered());
        if (m() || (this.f27064o != null && this.f27060m)) {
            z2 = true;
        }
        if (!isEnabled()) {
            this.f27031R = this.f27069q0;
        } else if (m()) {
            if (this.f27059l0 != null) {
                v(z10, z11);
            } else {
                this.f27031R = getErrorCurrentTextColors();
            }
        } else if (!this.f27060m || (y10 = this.f27064o) == null) {
            if (z10) {
                this.f27031R = this.f27057k0;
            } else if (z11) {
                this.f27031R = this.f27056j0;
            } else {
                this.f27031R = this.f27054i0;
            }
        } else if (this.f27059l0 != null) {
            v(z10, z11);
        } else {
            this.f27031R = y10.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Context context = getContext();
            TypedValue typedValueJ = h.J(context, com.wynauto.wyn.R.attr.colorControlActivated);
            ColorStateList colorStateListValueOf = null;
            if (typedValueJ != null) {
                int i5 = typedValueJ.resourceId;
                if (i5 != 0) {
                    colorStateListValueOf = e.getColorStateList(context, i5);
                } else {
                    int i10 = typedValueJ.data;
                    if (i10 != 0) {
                        colorStateListValueOf = ColorStateList.valueOf(i10);
                    }
                }
            }
            EditText editText3 = this.f27043d;
            if (editText3 != null && editText3.getTextCursorDrawable() != null && colorStateListValueOf != null) {
                Drawable textCursorDrawable = this.f27043d.getTextCursorDrawable();
                if (z2) {
                    ColorStateList colorStateListValueOf2 = this.f27059l0;
                    if (colorStateListValueOf2 == null) {
                        colorStateListValueOf2 = ColorStateList.valueOf(this.f27031R);
                    }
                    colorStateListValueOf = colorStateListValueOf2;
                }
                textCursorDrawable.setTintList(colorStateListValueOf);
            }
        }
        m mVar = this.f27041c;
        mVar.k();
        CheckableImageButton checkableImageButton = mVar.f35157c;
        ColorStateList colorStateList = mVar.f35158d;
        TextInputLayout textInputLayout = mVar.f35155a;
        gc.b.D(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = mVar.k;
        CheckableImageButton checkableImageButton2 = mVar.f35161g;
        gc.b.D(textInputLayout, checkableImageButton2, colorStateList2);
        if (mVar.b() instanceof j) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                gc.b.e(textInputLayout, checkableImageButton2, mVar.k, mVar.f35165l);
            } else {
                Drawable drawableMutate = checkableImageButton2.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(drawableMutate);
            }
        }
        v vVar = this.f27039b;
        gc.b.D(vVar.f35227a, vVar.f35230d, vVar.f35231e);
        if (this.f27026M == 2) {
            int i11 = this.f27028O;
            if (z10 && isEnabled()) {
                this.f27028O = this.f27030Q;
            } else {
                this.f27028O = this.f27029P;
            }
            if (this.f27028O != i11 && e() && !this.f27071r0) {
                if (e()) {
                    ((g) this.f27018D).n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                j();
            }
        }
        if (this.f27026M == 1) {
            if (!isEnabled()) {
                this.f27032S = this.f27063n0;
            } else if (z11 && !z10) {
                this.f27032S = this.f27067p0;
            } else if (z10) {
                this.f27032S = this.f27065o0;
            } else {
                this.f27032S = this.f27061m0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f27039b.a(drawable);
    }

    public void setHint(int i5) {
        setHint(i5 != 0 ? getResources().getText(i5) : null);
    }

    public void setStartIconContentDescription(int i5) {
        setStartIconContentDescription(i5 != 0 ? getResources().getText(i5) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f27041c.f35161g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f27041c.f35161g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f27041c.h(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f27041c.f35161g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        m mVar = this.f27041c;
        CheckableImageButton checkableImageButton = mVar.f35161g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = mVar.k;
            PorterDuff.Mode mode = mVar.f35165l;
            TextInputLayout textInputLayout = mVar.f35155a;
            gc.b.e(textInputLayout, checkableImageButton, colorStateList, mode);
            gc.b.D(textInputLayout, checkableImageButton, mVar.k);
        }
    }
}
