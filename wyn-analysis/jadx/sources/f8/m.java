package f8;

import Va.M6;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T;
import com.wynauto.wyn.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k1.S;
import ka.AbstractC3256n;
import l1.AccessibilityManagerTouchExplorationStateChangeListenerC3372b;
import md.J;
import q.Y;

/* loaded from: classes4.dex */
public final class m extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f35155a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f35156b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f35157c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f35158d;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f35159e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f35160f;

    /* renamed from: g, reason: collision with root package name */
    public final CheckableImageButton f35161g;

    /* renamed from: h, reason: collision with root package name */
    public final M2.d f35162h;

    /* renamed from: i, reason: collision with root package name */
    public int f35163i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f35164j;
    public ColorStateList k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f35165l;

    /* renamed from: m, reason: collision with root package name */
    public int f35166m;

    /* renamed from: n, reason: collision with root package name */
    public ImageView.ScaleType f35167n;

    /* renamed from: o, reason: collision with root package name */
    public View.OnLongClickListener f35168o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f35169p;

    /* renamed from: q, reason: collision with root package name */
    public final Y f35170q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f35171r;

    /* renamed from: s, reason: collision with root package name */
    public EditText f35172s;

    /* renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f35173t;

    /* renamed from: u, reason: collision with root package name */
    public com.unity3d.services.core.webview.b f35174u;

    /* renamed from: v, reason: collision with root package name */
    public final k f35175v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(TextInputLayout textInputLayout, J j8) {
        CharSequence text;
        super(textInputLayout.getContext());
        int i5 = 1;
        this.f35163i = 0;
        this.f35164j = new LinkedHashSet();
        this.f35175v = new k(this);
        l lVar = new l(this);
        this.f35173t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f35155a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f35156b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f35157c = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f35161g = checkableImageButtonA2;
        this.f35162h = new M2.d(this, j8);
        Y y10 = new Y(getContext(), null);
        this.f35170q = y10;
        TypedArray typedArray = (TypedArray) j8.f40581b;
        if (typedArray.hasValue(36)) {
            this.f35158d = Ba.c.x(getContext(), j8, 36);
        }
        if (typedArray.hasValue(37)) {
            this.f35159e = W7.k.g(typedArray.getInt(37, -1), null);
        }
        if (typedArray.hasValue(35)) {
            h(j8.n(35));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = S.f38779a;
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray.hasValue(51)) {
            if (typedArray.hasValue(30)) {
                this.k = Ba.c.x(getContext(), j8, 30);
            }
            if (typedArray.hasValue(31)) {
                this.f35165l = W7.k.g(typedArray.getInt(31, -1), null);
            }
        }
        if (typedArray.hasValue(28)) {
            f(typedArray.getInt(28, 0));
            if (typedArray.hasValue(25) && checkableImageButtonA2.getContentDescription() != (text = typedArray.getText(25))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray.getBoolean(24, true));
        } else if (typedArray.hasValue(51)) {
            if (typedArray.hasValue(52)) {
                this.k = Ba.c.x(getContext(), j8, 52);
            }
            if (typedArray.hasValue(53)) {
                this.f35165l = W7.k.g(typedArray.getInt(53, -1), null);
            }
            f(typedArray.getBoolean(51, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(49);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(27, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f35166m) {
            this.f35166m = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(29)) {
            ImageView.ScaleType scaleTypeM = gc.b.m(typedArray.getInt(29, -1));
            this.f35167n = scaleTypeM;
            checkableImageButtonA2.setScaleType(scaleTypeM);
            checkableImageButtonA.setScaleType(scaleTypeM);
        }
        y10.setVisibility(8);
        y10.setId(R.id.textinput_suffix_text);
        y10.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        y10.setAccessibilityLiveRegion(1);
        y10.setTextAppearance(typedArray.getResourceId(70, 0));
        if (typedArray.hasValue(71)) {
            y10.setTextColor(j8.m(71));
        }
        CharSequence text3 = typedArray.getText(69);
        this.f35169p = TextUtils.isEmpty(text3) ? null : text3;
        y10.setText(text3);
        m();
        frameLayout.addView(checkableImageButtonA2);
        addView(y10);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.f27042c0.add(lVar);
        if (textInputLayout.f27043d != null) {
            lVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new T(this, i5));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i5) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i5);
        if (Ba.c.F(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final n b() {
        n eVar;
        int i5 = this.f35163i;
        M2.d dVar = this.f35162h;
        SparseArray sparseArray = (SparseArray) dVar.f7303d;
        n nVar = (n) sparseArray.get(i5);
        if (nVar != null) {
            return nVar;
        }
        m mVar = (m) dVar.f7304e;
        if (i5 == -1) {
            eVar = new e(mVar, 0);
        } else if (i5 == 0) {
            eVar = new e(mVar, 1);
        } else if (i5 == 1) {
            eVar = new u(mVar, dVar.f7302c);
        } else if (i5 == 2) {
            eVar = new d(mVar);
        } else {
            if (i5 != 3) {
                throw new IllegalArgumentException(AbstractC3256n.g(i5, "Invalid end icon mode: "));
            }
            eVar = new j(mVar);
        }
        sparseArray.append(i5, eVar);
        return eVar;
    }

    public final boolean c() {
        return this.f35156b.getVisibility() == 0 && this.f35161g.getVisibility() == 0;
    }

    public final boolean d() {
        return this.f35157c.getVisibility() == 0;
    }

    public final void e(boolean z2) {
        boolean z10;
        boolean zIsActivated;
        boolean z11;
        n nVarB = b();
        boolean zK = nVarB.k();
        CheckableImageButton checkableImageButton = this.f35161g;
        boolean z12 = true;
        if (!zK || (z11 = checkableImageButton.f26973d) == nVarB.l()) {
            z10 = false;
        } else {
            checkableImageButton.setChecked(!z11);
            z10 = true;
        }
        if (!(nVarB instanceof j) || (zIsActivated = checkableImageButton.isActivated()) == nVarB.j()) {
            z12 = z10;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z2 || z12) {
            gc.b.D(this.f35155a, checkableImageButton, this.k);
        }
    }

    public final void f(int i5) {
        if (this.f35163i == i5) {
            return;
        }
        n nVarB = b();
        com.unity3d.services.core.webview.b bVar = this.f35174u;
        AccessibilityManager accessibilityManager = this.f35173t;
        if (bVar != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC3372b(bVar));
        }
        this.f35174u = null;
        nVarB.s();
        this.f35163i = i5;
        Iterator it = this.f35164j.iterator();
        if (it.hasNext()) {
            throw M6.j(it);
        }
        g(i5 != 0);
        n nVarB2 = b();
        int iD = this.f35162h.f7301b;
        if (iD == 0) {
            iD = nVarB2.d();
        }
        Drawable drawableB = iD != 0 ? Fe.g.B(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.f35161g;
        checkableImageButton.setImageDrawable(drawableB);
        TextInputLayout textInputLayout = this.f35155a;
        if (drawableB != null) {
            gc.b.e(textInputLayout, checkableImageButton, this.k, this.f35165l);
            gc.b.D(textInputLayout, checkableImageButton, this.k);
        }
        int iC = nVarB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(nVarB2.k());
        if (!nVarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i5);
        }
        nVarB2.r();
        com.unity3d.services.core.webview.b bVarH = nVarB2.h();
        this.f35174u = bVarH;
        if (bVarH != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = S.f38779a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC3372b(this.f35174u));
            }
        }
        View.OnClickListener onClickListenerF = nVarB2.f();
        View.OnLongClickListener onLongClickListener = this.f35168o;
        checkableImageButton.setOnClickListener(onClickListenerF);
        gc.b.H(checkableImageButton, onLongClickListener);
        EditText editText = this.f35172s;
        if (editText != null) {
            nVarB2.m(editText);
            i(nVarB2);
        }
        gc.b.e(textInputLayout, checkableImageButton, this.k, this.f35165l);
        e(true);
    }

    public final void g(boolean z2) {
        if (c() != z2) {
            this.f35161g.setVisibility(z2 ? 0 : 8);
            j();
            l();
            this.f35155a.p();
        }
    }

    public final void h(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f35157c;
        checkableImageButton.setImageDrawable(drawable);
        k();
        gc.b.e(this.f35155a, checkableImageButton, this.f35158d, this.f35159e);
    }

    public final void i(n nVar) {
        if (this.f35172s == null) {
            return;
        }
        if (nVar.e() != null) {
            this.f35172s.setOnFocusChangeListener(nVar.e());
        }
        if (nVar.g() != null) {
            this.f35161g.setOnFocusChangeListener(nVar.g());
        }
    }

    public final void j() {
        this.f35156b.setVisibility((this.f35161g.getVisibility() != 0 || d()) ? 8 : 0);
        setVisibility((c() || d() || !((this.f35169p == null || this.f35171r) ? 8 : false)) ? 0 : 8);
    }

    public final void k() {
        CheckableImageButton checkableImageButton = this.f35157c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f35155a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f27055j.f35203q && textInputLayout.m()) ? 0 : 8);
        j();
        l();
        if (this.f35163i != 0) {
            return;
        }
        textInputLayout.p();
    }

    public final void l() {
        int paddingEnd;
        TextInputLayout textInputLayout = this.f35155a;
        if (textInputLayout.f27043d == null) {
            return;
        }
        if (c() || d()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout.f27043d;
            WeakHashMap weakHashMap = S.f38779a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f27043d.getPaddingTop();
        int paddingBottom = textInputLayout.f27043d.getPaddingBottom();
        WeakHashMap weakHashMap2 = S.f38779a;
        this.f35170q.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    public final void m() {
        Y y10 = this.f35170q;
        int visibility = y10.getVisibility();
        int i5 = (this.f35169p == null || this.f35171r) ? 8 : 0;
        if (visibility != i5) {
            b().p(i5 == 0);
        }
        j();
        y10.setVisibility(i5);
        this.f35155a.p();
    }
}
