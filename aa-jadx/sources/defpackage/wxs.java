package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wxs extends defpackage.wxx {
    public android.widget.AutoCompleteTextView a;
    public boolean b;
    public boolean c;
    public android.animation.ValueAnimator d;
    private final int i;
    private final int j;
    private final android.animation.TimeInterpolator k;
    private final android.view.View.OnClickListener l;
    private final android.view.View.OnFocusChangeListener m;
    private final android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener n;
    private boolean o;
    private long p;
    private android.view.accessibility.AccessibilityManager q;
    private android.animation.ValueAnimator r;

    public wxs(defpackage.wxw wxwVar) {
        super(wxwVar);
        this.l = new defpackage.wug(this, 5);
        this.m = new defpackage.krq(this, 12);
        this.n = new android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener() { // from class: wxq
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                defpackage.wxs wxsVar = this.a;
                android.widget.AutoCompleteTextView autoCompleteTextView = wxsVar.a;
                if (autoCompleteTextView == null || defpackage.wpv.t(autoCompleteTextView)) {
                    return;
                }
                wxsVar.h.setImportantForAccessibility(true == z ? 2 : 1);
            }
        };
        this.p = Long.MAX_VALUE;
        this.j = defpackage.sqs.bm(wxwVar.getContext(), com.google.android.projection.gearhead.R.attr.motionDurationShort3, 67);
        this.i = defpackage.sqs.bm(wxwVar.getContext(), com.google.android.projection.gearhead.R.attr.motionDurationShort3, 50);
        this.k = defpackage.wqn.c(wxwVar.getContext(), com.google.android.projection.gearhead.R.attr.motionEasingLinearInterpolator, defpackage.wlm.a);
    }

    private final android.animation.ValueAnimator z(int i, float... fArr) {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.k);
        valueAnimatorOfFloat.setDuration(i);
        valueAnimatorOfFloat.addUpdateListener(new defpackage.wxh(this, 2));
        return valueAnimatorOfFloat;
    }

    @Override // defpackage.wxx
    public final android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener A() {
        return this.n;
    }

    @Override // defpackage.wxx
    public final int a() {
        return com.google.android.projection.gearhead.R.string.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.wxx
    public final int b() {
        return com.google.android.projection.gearhead.R.drawable.mtrl_dropdown_arrow;
    }

    @Override // defpackage.wxx
    public final android.view.View.OnClickListener c() {
        return this.l;
    }

    @Override // defpackage.wxx
    public final android.view.View.OnFocusChangeListener d() {
        return this.m;
    }

    @Override // defpackage.wxx
    public final void g(android.widget.EditText editText) {
        if (!(editText instanceof android.widget.AutoCompleteTextView)) {
            throw new java.lang.RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        android.widget.AutoCompleteTextView autoCompleteTextView = (android.widget.AutoCompleteTextView) editText;
        this.a = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new defpackage.jzx(this, 11, null));
        this.a.setOnDismissListener(new android.widget.AutoCompleteTextView.OnDismissListener() { // from class: wxp
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                defpackage.wxs wxsVar = this.a;
                wxsVar.n();
                wxsVar.k(false);
            }
        });
        this.a.setThreshold(0);
        com.google.android.material.textfield.TextInputLayout textInputLayout = this.e;
        textInputLayout.b.n(null);
        if (!defpackage.wpv.t(editText) && this.q.isTouchExplorationEnabled()) {
            this.h.setImportantForAccessibility(2);
        }
        textInputLayout.j(true);
    }

    @Override // defpackage.wxx
    public final void i() {
        this.d = z(this.j, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f);
        android.animation.ValueAnimator valueAnimatorZ = z(this.i, 1.0f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        this.r = valueAnimatorZ;
        valueAnimatorZ.addListener(new defpackage.wxr(this));
        this.q = (android.view.accessibility.AccessibilityManager) this.g.getSystemService("accessibility");
    }

    @Override // defpackage.wxx
    public final void j() {
        android.widget.AutoCompleteTextView autoCompleteTextView = this.a;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.a.setOnDismissListener(null);
        }
    }

    public final void k(boolean z) {
        if (this.o != z) {
            this.o = z;
            this.d.cancel();
            this.r.start();
        }
    }

    @Override // defpackage.wxx
    public final void l() {
        if (this.q.isTouchExplorationEnabled() && defpackage.wpv.t(this.a) && !this.h.hasFocus()) {
            this.a.dismissDropDown();
        }
        this.a.post(new defpackage.wuj(this, 9));
    }

    public final void m() {
        if (this.a == null) {
            return;
        }
        if (p()) {
            this.c = false;
        }
        if (this.c) {
            this.c = false;
            return;
        }
        k(!this.o);
        boolean z = this.o;
        android.widget.AutoCompleteTextView autoCompleteTextView = this.a;
        if (!z) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            this.a.showDropDown();
        }
    }

    public final void n() {
        this.c = true;
        this.p = android.os.SystemClock.uptimeMillis();
    }

    @Override // defpackage.wxx
    public final boolean o(int i) {
        return i != 0;
    }

    public final boolean p() {
        long jUptimeMillis = android.os.SystemClock.uptimeMillis() - this.p;
        return jUptimeMillis < 0 || jUptimeMillis > 300;
    }

    @Override // defpackage.wxx
    public final boolean q() {
        return true;
    }

    @Override // defpackage.wxx
    public final boolean r() {
        return this.b;
    }

    @Override // defpackage.wxx
    public final boolean s() {
        return true;
    }

    @Override // defpackage.wxx
    public final boolean t() {
        return this.o;
    }

    @Override // defpackage.wxx
    public final boolean u() {
        return true;
    }

    @Override // defpackage.wxx
    public final void v(defpackage.edn ednVar) {
        if (!defpackage.wpv.t(this.a)) {
            ednVar.r(android.widget.Spinner.class.getName());
        }
        if (ednVar.a.isShowingHintText()) {
            ednVar.C(null);
        }
    }

    @Override // defpackage.wxx
    public final void w(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (!this.q.isEnabled() || defpackage.wpv.t(this.a)) {
            return;
        }
        boolean z = false;
        if ((accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.o && !this.a.isPopupShowing()) {
            z = true;
        }
        if (accessibilityEvent.getEventType() == 1 || z) {
            m();
            n();
        }
    }
}
