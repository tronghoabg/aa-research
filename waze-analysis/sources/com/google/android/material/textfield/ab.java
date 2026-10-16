package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.bn;
import android.support.v7.widget.gc;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.waze.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ab extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    final TextInputLayout f6813a;

    /* renamed from: b, reason: collision with root package name */
    private final FrameLayout f6814b;

    /* renamed from: c, reason: collision with root package name */
    private final CheckableImageButton f6815c;

    /* renamed from: d, reason: collision with root package name */
    private ColorStateList f6816d;

    /* renamed from: e, reason: collision with root package name */
    private PorterDuff.Mode f6817e;

    /* renamed from: f, reason: collision with root package name */
    private final CheckableImageButton f6818f;

    /* renamed from: g, reason: collision with root package name */
    private final aa f6819g;

    /* renamed from: h, reason: collision with root package name */
    private int f6820h;

    /* renamed from: i, reason: collision with root package name */
    private final LinkedHashSet f6821i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f6822j;

    /* renamed from: k, reason: collision with root package name */
    private PorterDuff.Mode f6823k;

    /* renamed from: l, reason: collision with root package name */
    private int f6824l;
    private CharSequence m;
    private final TextView n;
    private boolean o;
    private EditText p;
    private final AccessibilityManager q;
    private AccessibilityManager.TouchExplorationStateChangeListener r;
    private final TextWatcher s;
    private final at t;

    ab(TextInputLayout textInputLayout, gc gcVar) {
        super(textInputLayout.getContext());
        this.f6820h = 0;
        this.f6821i = new LinkedHashSet();
        this.s = new x(this);
        y yVar = new y(this);
        this.t = yVar;
        this.q = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f6813a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, GravityCompat.END));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f6814b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonH = H(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f6815c = checkableImageButtonH;
        CheckableImageButton checkableImageButtonH2 = H(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f6818f = checkableImageButtonH2;
        this.f6819g = new aa(this, gcVar);
        bn bnVar = new bn(getContext());
        this.n = bnVar;
        int[] iArr = al.f6863a;
        if (gcVar.s(38)) {
            this.f6816d = com.google.android.material.internal.t.o(getContext(), gcVar, 38);
        }
        if (gcVar.s(39)) {
            this.f6817e = com.waze.c.c.e.h(gcVar.c(39, -1), null);
        }
        if (gcVar.s(37)) {
            y(gcVar.j(37));
        }
        checkableImageButtonH.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        checkableImageButtonH.setImportantForAccessibility(2);
        checkableImageButtonH.setClickable(false);
        checkableImageButtonH.c(false);
        checkableImageButtonH.a(false);
        checkableImageButtonH.setFocusable(false);
        if (!gcVar.s(54)) {
            if (gcVar.s(32)) {
                this.f6822j = com.google.android.material.internal.t.o(getContext(), gcVar, 32);
            }
            if (gcVar.s(33)) {
                this.f6823k = com.waze.c.c.e.h(gcVar.c(33, -1), null);
            }
        }
        if (gcVar.s(30)) {
            w(gcVar.c(30, 0));
            if (gcVar.s(27)) {
                v(gcVar.o(27));
            }
            u(gcVar.r(26, true));
        } else if (gcVar.s(54)) {
            if (gcVar.s(55)) {
                this.f6822j = com.google.android.material.internal.t.o(getContext(), gcVar, 55);
            }
            if (gcVar.s(56)) {
                this.f6823k = com.waze.c.c.e.h(gcVar.c(56, -1), null);
            }
            w(gcVar.r(54, false) ? 1 : 0);
            v(gcVar.o(52));
        }
        int iB = gcVar.b(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (iB < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (iB != this.f6824l) {
            this.f6824l = iB;
            ad.d(checkableImageButtonH2, iB);
            ad.d(checkableImageButtonH, iB);
        }
        if (gcVar.s(31)) {
            ImageView.ScaleType scaleTypeA = ad.a(gcVar.c(31, -1));
            checkableImageButtonH2.setScaleType(scaleTypeA);
            checkableImageButtonH.setScaleType(scaleTypeA);
        }
        bnVar.setVisibility(8);
        bnVar.setId(R.id.textinput_suffix_text);
        bnVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        bnVar.setAccessibilityLiveRegion(1);
        TextViewCompat.setTextAppearance(bnVar, gcVar.f(73, 0));
        if (gcVar.s(74)) {
            bnVar.setTextColor(gcVar.g(74));
        }
        CharSequence charSequenceO = gcVar.o(72);
        this.m = true != TextUtils.isEmpty(charSequenceO) ? charSequenceO : null;
        bnVar.setText(charSequenceO);
        N();
        frameLayout.addView(checkableImageButtonH2);
        addView(bnVar);
        addView(frameLayout);
        addView(checkableImageButtonH);
        checkableImageButtonH.b(new com.google.android.material.internal.b() { // from class: com.google.android.material.textfield.v
            @Override // com.google.android.material.internal.b
            public final void a() {
                ab.E(this.f6916a);
            }
        });
        checkableImageButtonH2.b(new com.google.android.material.internal.b() { // from class: com.google.android.material.textfield.w
            @Override // com.google.android.material.internal.b
            public final void a() {
                ab abVar = this.f6917a;
                ad.g(abVar.f6818f, abVar.j());
            }
        });
        textInputLayout.t(yVar);
        addOnAttachStateChangeListener(new z(this));
    }

    public static /* synthetic */ void E(ab abVar) {
        CheckableImageButton checkableImageButton = abVar.f6815c;
        ad.g(checkableImageButton, checkableImageButton.getContentDescription());
    }

    private final CheckableImageButton H(ViewGroup viewGroup, LayoutInflater layoutInflater, int i2) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i2);
        if (com.google.android.material.internal.t.q(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I() {
        AccessibilityManager accessibilityManager;
        if (this.r == null || (accessibilityManager = this.q) == null || !isAttachedToWindow()) {
            return;
        }
        accessibilityManager.addTouchExplorationStateChangeListener(this.r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J() {
        AccessibilityManager accessibilityManager;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.r;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = this.q) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(ac acVar) {
        EditText editText = this.p;
        if (editText == null) {
            return;
        }
        if (acVar.d() != null) {
            editText.setOnFocusChangeListener(acVar.d());
        }
        if (acVar.e() != null) {
            this.f6818f.setOnFocusChangeListener(acVar.e());
        }
    }

    private final void L() {
        int i2 = 0;
        this.f6814b.setVisibility((this.f6818f.getVisibility() != 0 || D()) ? 8 : 0);
        boolean z = (this.m == null || this.o) ? 8 : false;
        if (!C() && !D() && z) {
            i2 = 8;
        }
        setVisibility(i2);
    }

    private final void M() {
        CheckableImageButton checkableImageButton = this.f6815c;
        int i2 = 8;
        if (checkableImageButton.getDrawable() != null) {
            TextInputLayout textInputLayout = this.f6813a;
            if (textInputLayout.P() && textInputLayout.T()) {
                i2 = 0;
            }
        }
        checkableImageButton.setVisibility(i2);
        L();
        z();
        if (A()) {
            return;
        }
        this.f6813a.U();
    }

    private final void N() {
        TextView textView = this.n;
        int visibility = textView.getVisibility();
        int i2 = 8;
        if (this.m != null && !this.o) {
            i2 = 0;
        }
        if (visibility != i2) {
            i().i(i2 == 0);
        }
        L();
        textView.setVisibility(i2);
        this.f6813a.U();
    }

    final boolean A() {
        return this.f6820h != 0;
    }

    final boolean B() {
        return A() && this.f6818f.isChecked();
    }

    final boolean C() {
        return this.f6814b.getVisibility() == 0 && this.f6818f.getVisibility() == 0;
    }

    final boolean D() {
        return this.f6815c.getVisibility() == 0;
    }

    final void G() {
        ad.f(this.f6818f);
    }

    final int a() {
        return this.f6820h;
    }

    final int b() {
        int marginStart;
        if (C() || D()) {
            CheckableImageButton checkableImageButton = this.f6818f;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return getPaddingEnd() + this.n.getPaddingEnd() + marginStart;
    }

    final Drawable c() {
        return this.f6818f.getDrawable();
    }

    final TextView f() {
        return this.n;
    }

    final CheckableImageButton g() {
        if (D()) {
            return this.f6815c;
        }
        if (A() && C()) {
            return this.f6818f;
        }
        return null;
    }

    final CheckableImageButton h() {
        return this.f6818f;
    }

    final ac i() {
        return this.f6819g.b(this.f6820h);
    }

    final CharSequence j() {
        return this.f6818f.getContentDescription();
    }

    final CharSequence k() {
        return this.m;
    }

    final void p() {
        CheckableImageButton checkableImageButton = this.f6818f;
        checkableImageButton.performClick();
        checkableImageButton.jumpDrawablesToCurrentState();
    }

    final void q(boolean z) {
        this.o = z;
        N();
    }

    final void r() {
        M();
        TextInputLayout textInputLayout = this.f6813a;
        ad.c(textInputLayout, this.f6815c, this.f6816d);
        s();
        if (i().u()) {
            if (!textInputLayout.T() || c() == null) {
                ad.b(textInputLayout, this.f6818f, this.f6822j, this.f6823k);
                return;
            }
            Drawable drawableMutate = c().mutate();
            drawableMutate.setTint(textInputLayout.d());
            this.f6818f.setImageDrawable(drawableMutate);
        }
    }

    final void s() {
        ad.c(this.f6813a, this.f6818f, this.f6822j);
    }

    final void t(boolean z) {
        CheckableImageButton checkableImageButton;
        boolean zIsActivated;
        CheckableImageButton checkableImageButton2;
        boolean zIsChecked;
        ac acVarI = i();
        boolean z2 = false;
        boolean z3 = true;
        if (acVarI.s() && (zIsChecked = (checkableImageButton2 = this.f6818f).isChecked()) != acVarI.t()) {
            checkableImageButton2.setChecked(!zIsChecked);
            z2 = true;
        }
        if (!acVarI.q() || (zIsActivated = (checkableImageButton = this.f6818f).isActivated()) == acVarI.r()) {
            z3 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z3) {
            s();
        }
    }

    final void u(boolean z) {
        this.f6818f.a(z);
    }

    final void v(CharSequence charSequence) {
        if (j() != charSequence) {
            CheckableImageButton checkableImageButton = this.f6818f;
            checkableImageButton.setContentDescription(charSequence);
            ad.g(checkableImageButton, charSequence);
        }
    }

    final void w(int i2) {
        if (this.f6820h == i2) {
            return;
        }
        ac acVarI = i();
        J();
        this.r = null;
        acVarI.k();
        this.f6820h = i2;
        Iterator it = this.f6821i.iterator();
        while (it.hasNext()) {
            ((au) it.next()).a();
        }
        x(i2 != 0);
        ac acVarI2 = i();
        int iB = this.f6819g.f6811c;
        if (iB == 0) {
            iB = acVarI2.b();
        }
        Drawable drawableD = iB != 0 ? android.support.a.i.d(getContext(), iB) : null;
        CheckableImageButton checkableImageButton = this.f6818f;
        checkableImageButton.setImageDrawable(drawableD);
        if (drawableD != null) {
            ad.b(this.f6813a, checkableImageButton, this.f6822j, this.f6823k);
            s();
        }
        u(acVarI2.s());
        TextInputLayout textInputLayout = this.f6813a;
        if (!acVarI2.p(textInputLayout.a())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.a() + " is not supported by the end icon mode " + i2);
        }
        acVarI2.j();
        this.r = acVarI2.H();
        I();
        ad.e(checkableImageButton, acVarI2.c());
        int iA = acVarI2.a();
        v(iA != 0 ? getResources().getText(iA) : null);
        EditText editText = this.p;
        if (editText != null) {
            acVarI2.h(editText);
            K(acVarI2);
        }
        ad.b(textInputLayout, checkableImageButton, this.f6822j, this.f6823k);
        t(true);
    }

    final void x(boolean z) {
        EditText editText;
        if (C() != z) {
            if (!z && this.f6818f.hasFocus() && (editText = this.p) != null) {
                editText.requestFocus();
            }
            this.f6818f.setVisibility(true != z ? 8 : 0);
            L();
            z();
            this.f6813a.U();
        }
    }

    final void y(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f6815c;
        checkableImageButton.setImageDrawable(drawable);
        M();
        ad.b(this.f6813a, checkableImageButton, this.f6816d, this.f6817e);
    }

    final void z() {
        TextInputLayout textInputLayout = this.f6813a;
        if (textInputLayout.f6797a == null) {
            return;
        }
        int paddingEnd = 0;
        if (!C() && !D()) {
            paddingEnd = textInputLayout.f6797a.getPaddingEnd();
        }
        this.n.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.f6797a.getPaddingTop(), paddingEnd, textInputLayout.f6797a.getPaddingBottom());
    }
}
