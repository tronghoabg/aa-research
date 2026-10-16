package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wxw extends android.widget.LinearLayout {
    public final com.google.android.material.textfield.TextInputLayout a;
    public final com.google.android.material.internal.CheckableImageButton b;
    public android.content.res.ColorStateList c;
    public final com.google.android.material.internal.CheckableImageButton d;
    public int e;
    public android.content.res.ColorStateList f;
    public android.graphics.PorterDuff.Mode g;
    public java.lang.CharSequence h;
    public final android.widget.TextView i;
    public android.widget.EditText j;
    public final android.text.TextWatcher k;
    private final android.widget.FrameLayout l;
    private android.graphics.PorterDuff.Mode m;
    private final defpackage.wxv n;
    private final java.util.LinkedHashSet o;
    private int p;
    private boolean q;
    private final android.view.accessibility.AccessibilityManager r;
    private android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener s;
    private final defpackage.xei t;

    public wxw(com.google.android.material.textfield.TextInputLayout textInputLayout, defpackage.lam lamVar) {
        super(textInputLayout.getContext());
        int i = 0;
        this.e = 0;
        this.o = new java.util.LinkedHashSet();
        this.k = new defpackage.wxu(this);
        defpackage.xei xeiVar = new defpackage.xei(this);
        this.t = xeiVar;
        this.r = (android.view.accessibility.AccessibilityManager) getContext().getSystemService("accessibility");
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -1, 8388613));
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        this.l = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -1));
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(getContext());
        com.google.android.material.internal.CheckableImageButton checkableImageButtonU = u(this, layoutInflaterFrom, com.google.android.projection.gearhead.R.id.text_input_error_icon);
        this.b = checkableImageButtonU;
        com.google.android.material.internal.CheckableImageButton checkableImageButtonU2 = u(frameLayout, layoutInflaterFrom, com.google.android.projection.gearhead.R.id.text_input_end_icon);
        this.d = checkableImageButtonU2;
        this.n = new defpackage.wxv(this, lamVar);
        defpackage.kb kbVar = new defpackage.kb(getContext());
        this.i = kbVar;
        int[] iArr = defpackage.wyd.a;
        if (lamVar.y(38)) {
            this.c = defpackage.sqs.bt(getContext(), lamVar, 38);
        }
        if (lamVar.y(39)) {
            this.m = defpackage.a.Q(lamVar.n(39, -1), null);
        }
        if (lamVar.y(37)) {
            n(lamVar.s(37));
        }
        checkableImageButtonU.setContentDescription(getResources().getText(com.google.android.projection.gearhead.R.string.error_icon_content_description));
        checkableImageButtonU.setImportantForAccessibility(2);
        checkableImageButtonU.setClickable(false);
        checkableImageButtonU.c = false;
        checkableImageButtonU.a(false);
        checkableImageButtonU.setFocusable(false);
        if (!lamVar.y(54)) {
            if (lamVar.y(32)) {
                this.f = defpackage.sqs.bt(getContext(), lamVar, 32);
            }
            if (lamVar.y(33)) {
                this.g = defpackage.a.Q(lamVar.n(33, -1), null);
            }
        }
        int i2 = 1;
        if (lamVar.y(30)) {
            l(lamVar.n(30, 0));
            if (lamVar.y(27)) {
                k(lamVar.u(27));
            }
            j(lamVar.x(26, true));
        } else if (lamVar.y(54)) {
            if (lamVar.y(55)) {
                this.f = defpackage.sqs.bt(getContext(), lamVar, 55);
            }
            if (lamVar.y(56)) {
                this.g = defpackage.a.Q(lamVar.n(56, -1), null);
            }
            l(lamVar.x(54, false) ? 1 : 0);
            k(lamVar.u(52));
        }
        int iM = lamVar.m(29, getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.mtrl_min_touch_target_size));
        if (iM < 0) {
            throw new java.lang.IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (iM != this.p) {
            this.p = iM;
            defpackage.wpv.p(checkableImageButtonU2, iM);
            defpackage.wpv.p(checkableImageButtonU, iM);
        }
        if (lamVar.y(31)) {
            android.widget.ImageView.ScaleType scaleTypeM = defpackage.wpv.m(lamVar.n(31, -1));
            checkableImageButtonU2.setScaleType(scaleTypeM);
            checkableImageButtonU.setScaleType(scaleTypeM);
        }
        kbVar.setVisibility(8);
        kbVar.setId(com.google.android.projection.gearhead.R.id.textinput_suffix_text);
        kbVar.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2, 80.0f));
        kbVar.setAccessibilityLiveRegion(1);
        kbVar.setTextAppearance(lamVar.q(73, 0));
        if (lamVar.y(74)) {
            kbVar.setTextColor(lamVar.r(74));
        }
        java.lang.CharSequence charSequenceU = lamVar.u(72);
        this.h = true != android.text.TextUtils.isEmpty(charSequenceU) ? charSequenceU : null;
        kbVar.setText(charSequenceU);
        w();
        frameLayout.addView(checkableImageButtonU2);
        addView(kbVar);
        addView(frameLayout);
        addView(checkableImageButtonU);
        checkableImageButtonU.d = new defpackage.wxt(this, i2);
        checkableImageButtonU2.d = new defpackage.wxt(this, i);
        textInputLayout.n.add(xeiVar);
        if (textInputLayout.c != null) {
            xeiVar.d(textInputLayout);
        }
        addOnAttachStateChangeListener(new defpackage.hz(this, 6));
    }

    private final com.google.android.material.internal.CheckableImageButton u(android.view.ViewGroup viewGroup, android.view.LayoutInflater layoutInflater, int i) {
        com.google.android.material.internal.CheckableImageButton checkableImageButton = (com.google.android.material.internal.CheckableImageButton) layoutInflater.inflate(com.google.android.projection.gearhead.R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (defpackage.sqs.bk(getContext())) {
            ((android.view.ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    private final void v() {
        int i = 0;
        this.l.setVisibility((this.d.getVisibility() != 0 || t()) ? 8 : 0);
        char c = (this.h == null || this.q) ? '\b' : (char) 0;
        if (!s() && !t() && c != 0) {
            i = 8;
        }
        setVisibility(i);
    }

    private final void w() {
        android.widget.TextView textView = this.i;
        int visibility = textView.getVisibility();
        int i = 8;
        if (this.h != null && !this.q) {
            i = 0;
        }
        if (visibility != i) {
            c().h(i == 0);
        }
        v();
        textView.setVisibility(i);
        this.a.D();
    }

    public final int a() {
        int marginStart;
        if (s() || t()) {
            com.google.android.material.internal.CheckableImageButton checkableImageButton = this.d;
            marginStart = ((android.view.ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return getPaddingEnd() + this.i.getPaddingEnd() + marginStart;
    }

    public final android.graphics.drawable.Drawable b() {
        return this.d.getDrawable();
    }

    public final defpackage.wxx c() {
        int i = this.e;
        defpackage.wxv wxvVar = this.n;
        android.util.SparseArray sparseArray = wxvVar.a;
        defpackage.wxx wxlVar = (defpackage.wxx) sparseArray.get(i);
        if (wxlVar == null) {
            if (i == -1) {
                wxlVar = new defpackage.wxl(wxvVar.b);
            } else if (i == 0) {
                wxlVar = new defpackage.wxx(wxvVar.b);
            } else if (i == 1) {
                wxlVar = new defpackage.wyc(wxvVar.b, wxvVar.d);
            } else if (i == 2) {
                wxlVar = new defpackage.wxk(wxvVar.b);
            } else {
                if (i != 3) {
                    throw new java.lang.IllegalArgumentException(defpackage.a.bo(i, "Invalid end icon mode: "));
                }
                wxlVar = new defpackage.wxs(wxvVar.b);
            }
            sparseArray.append(i, wxlVar);
        }
        return wxlVar;
    }

    final java.lang.CharSequence d() {
        return this.d.getContentDescription();
    }

    public final void e() {
        android.view.accessibility.AccessibilityManager accessibilityManager;
        if (this.s == null || (accessibilityManager = this.r) == null || !isAttachedToWindow()) {
            return;
        }
        accessibilityManager.addTouchExplorationStateChangeListener(this.s);
    }

    public final void f(boolean z) {
        this.q = z;
        w();
    }

    public final void g() {
        defpackage.wpv.o(this.a, this.d, this.f);
    }

    final void h(boolean z) {
        com.google.android.material.internal.CheckableImageButton checkableImageButton;
        boolean zIsActivated;
        com.google.android.material.internal.CheckableImageButton checkableImageButton2;
        boolean z2;
        defpackage.wxx wxxVarC = c();
        boolean z3 = false;
        boolean z4 = true;
        if (wxxVarC.s() && (z2 = (checkableImageButton2 = this.d).a) != wxxVarC.t()) {
            checkableImageButton2.setChecked(!z2);
            z3 = true;
        }
        if (!wxxVarC.q() || (zIsActivated = (checkableImageButton = this.d).isActivated()) == wxxVarC.r()) {
            z4 = z3;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            g();
        }
    }

    public final void i() {
        android.view.accessibility.AccessibilityManager accessibilityManager;
        android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.s;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = this.r) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
    }

    final void j(boolean z) {
        this.d.a(z);
    }

    final void k(java.lang.CharSequence charSequence) {
        if (d() != charSequence) {
            com.google.android.material.internal.CheckableImageButton checkableImageButton = this.d;
            checkableImageButton.setContentDescription(charSequence);
            defpackage.wpv.s(checkableImageButton, charSequence);
        }
    }

    final void l(int i) {
        if (this.e == i) {
            return;
        }
        defpackage.wxx wxxVarC = c();
        i();
        this.s = null;
        wxxVarC.j();
        this.e = i;
        java.util.Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((defpackage.wyi) it.next()).a();
        }
        m(i != 0);
        defpackage.wxx wxxVarC2 = c();
        int iB = this.n.c;
        if (iB == 0) {
            iB = wxxVarC2.b();
        }
        android.graphics.drawable.Drawable drawableE = iB != 0 ? defpackage.ca.e(getContext(), iB) : null;
        com.google.android.material.internal.CheckableImageButton checkableImageButton = this.d;
        checkableImageButton.setImageDrawable(drawableE);
        if (drawableE != null) {
            defpackage.wpv.n(this.a, checkableImageButton, this.f, this.g);
            g();
        }
        j(wxxVarC2.s());
        com.google.android.material.textfield.TextInputLayout textInputLayout = this.a;
        int i2 = textInputLayout.m;
        if (!wxxVarC2.o(i2)) {
            throw new java.lang.IllegalStateException(defpackage.a.bn(i, i2, "The current box background mode ", " is not supported by the end icon mode "));
        }
        wxxVarC2.i();
        this.s = wxxVarC2.A();
        e();
        defpackage.wpv.q(checkableImageButton, wxxVarC2.c());
        int iA = wxxVarC2.a();
        k(iA != 0 ? getResources().getText(iA) : null);
        android.widget.EditText editText = this.j;
        if (editText != null) {
            wxxVarC2.g(editText);
            o(wxxVarC2);
        }
        defpackage.wpv.n(textInputLayout, checkableImageButton, this.f, this.g);
        h(true);
    }

    public final void m(boolean z) {
        android.widget.EditText editText;
        if (s() != z) {
            if (!z && this.d.hasFocus() && (editText = this.j) != null) {
                editText.requestFocus();
            }
            this.d.setVisibility(true != z ? 8 : 0);
            v();
            q();
            this.a.D();
        }
    }

    final void n(android.graphics.drawable.Drawable drawable) {
        com.google.android.material.internal.CheckableImageButton checkableImageButton = this.b;
        checkableImageButton.setImageDrawable(drawable);
        p();
        defpackage.wpv.n(this.a, checkableImageButton, this.c, this.m);
    }

    public final void o(defpackage.wxx wxxVar) {
        android.widget.EditText editText = this.j;
        if (editText == null) {
            return;
        }
        if (wxxVar.d() != null) {
            editText.setOnFocusChangeListener(wxxVar.d());
        }
        if (wxxVar.e() != null) {
            this.d.setOnFocusChangeListener(wxxVar.e());
        }
    }

    public final void p() {
        com.google.android.material.internal.CheckableImageButton checkableImageButton = this.b;
        int i = 8;
        if (checkableImageButton.getDrawable() != null) {
            com.google.android.material.textfield.TextInputLayout textInputLayout = this.a;
            if (textInputLayout.d.g && textInputLayout.C()) {
                i = 0;
            }
        }
        checkableImageButton.setVisibility(i);
        v();
        q();
        if (r()) {
            return;
        }
        this.a.D();
    }

    public final void q() {
        com.google.android.material.textfield.TextInputLayout textInputLayout = this.a;
        if (textInputLayout.c == null) {
            return;
        }
        int paddingEnd = 0;
        if (!s() && !t()) {
            paddingEnd = textInputLayout.c.getPaddingEnd();
        }
        this.i.setPaddingRelative(getContext().getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.c.getPaddingTop(), paddingEnd, textInputLayout.c.getPaddingBottom());
    }

    public final boolean r() {
        return this.e != 0;
    }

    public final boolean s() {
        return this.l.getVisibility() == 0 && this.d.getVisibility() == 0;
    }

    public final boolean t() {
        return this.b.getVisibility() == 0;
    }
}
