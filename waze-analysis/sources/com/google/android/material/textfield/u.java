package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class u extends ac {

    /* renamed from: e, reason: collision with root package name */
    private final int f6908e;

    /* renamed from: f, reason: collision with root package name */
    private final int f6909f;

    /* renamed from: g, reason: collision with root package name */
    private final TimeInterpolator f6910g;

    /* renamed from: h, reason: collision with root package name */
    private AutoCompleteTextView f6911h;

    /* renamed from: i, reason: collision with root package name */
    private final View.OnClickListener f6912i;

    /* renamed from: j, reason: collision with root package name */
    private final View.OnFocusChangeListener f6913j;

    /* renamed from: k, reason: collision with root package name */
    private final AccessibilityManager.TouchExplorationStateChangeListener f6914k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f6915l;
    private boolean m;
    private boolean n;
    private long o;
    private AccessibilityManager p;
    private ValueAnimator q;
    private ValueAnimator r;

    u(ab abVar) {
        super(abVar);
        this.f6912i = new View.OnClickListener() { // from class: com.google.android.material.textfield.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6903a.E();
            }
        };
        this.f6913j = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.q
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                u.w(this.f6904a, z);
            }
        };
        this.f6914k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: com.google.android.material.textfield.r
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                u.n(this.f6905a, z);
            }
        };
        this.o = Long.MAX_VALUE;
        this.f6909f = com.google.android.material.internal.t.e(abVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f6908e = com.google.android.material.internal.t.e(abVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f6910g = com.google.android.material.k.f.d(abVar.getContext(), R.attr.motionEasingLinearInterpolator, com.google.android.material.a.a.f6173a);
    }

    private final ValueAnimator C(int i2, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f6910g);
        valueAnimatorOfFloat.setDuration(i2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.m
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f6900a.f6828d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return valueAnimatorOfFloat;
    }

    private final void D(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        if (this.f6911h == null) {
            return;
        }
        if (G()) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        D(!this.n);
        boolean z = this.n;
        AutoCompleteTextView autoCompleteTextView = this.f6911h;
        if (!z) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            this.f6911h.showDropDown();
        }
    }

    private final void F() {
        this.m = true;
        this.o = SystemClock.uptimeMillis();
    }

    private final boolean G() {
        long jUptimeMillis = SystemClock.uptimeMillis() - this.o;
        return jUptimeMillis < 0 || jUptimeMillis > 300;
    }

    public static /* synthetic */ void l(u uVar) {
        boolean zIsPopupShowing = uVar.f6911h.isPopupShowing();
        uVar.D(zIsPopupShowing);
        uVar.m = zIsPopupShowing;
    }

    public static /* synthetic */ void n(u uVar, boolean z) {
        AutoCompleteTextView autoCompleteTextView = uVar.f6911h;
        if (autoCompleteTextView == null || ad.h(autoCompleteTextView)) {
            return;
        }
        uVar.f6828d.setImportantForAccessibility(true == z ? 2 : 1);
    }

    public static /* synthetic */ void o(u uVar) {
        uVar.F();
        uVar.D(false);
    }

    public static /* synthetic */ void w(u uVar, boolean z) {
        uVar.f6915l = z;
        uVar.A();
        if (z) {
            return;
        }
        uVar.D(false);
        uVar.m = false;
    }

    public static /* synthetic */ void x(u uVar, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (uVar.G()) {
                uVar.m = false;
            }
            uVar.E();
            uVar.F();
        }
    }

    @Override // com.google.android.material.textfield.ac
    public final AccessibilityManager.TouchExplorationStateChangeListener H() {
        return this.f6914k;
    }

    @Override // com.google.android.material.textfield.ac
    final int a() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // com.google.android.material.textfield.ac
    final int b() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // com.google.android.material.textfield.ac
    final View.OnClickListener c() {
        return this.f6912i;
    }

    @Override // com.google.android.material.textfield.ac
    final View.OnFocusChangeListener d() {
        return this.f6913j;
    }

    @Override // com.google.android.material.textfield.ac
    public final void h(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f6911h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.n
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                u.x(this.f6901a, motionEvent);
                return false;
            }
        });
        this.f6911h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.o
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                u.o(this.f6902a);
            }
        });
        this.f6911h.setThreshold(0);
        TextInputLayout textInputLayout = this.f6825a;
        textInputLayout.V();
        if (!ad.h(editText) && this.p.isTouchExplorationEnabled()) {
            this.f6828d.setImportantForAccessibility(2);
        }
        textInputLayout.v(true);
    }

    @Override // com.google.android.material.textfield.ac
    final void j() {
        this.r = C(this.f6909f, 0.0f, 1.0f);
        ValueAnimator valueAnimatorC = C(this.f6908e, 1.0f, 0.0f);
        this.q = valueAnimatorC;
        valueAnimatorC.addListener(new t(this));
        this.p = (AccessibilityManager) this.f6827c.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.ac
    final void k() {
        AutoCompleteTextView autoCompleteTextView = this.f6911h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f6911h.setOnDismissListener(null);
        }
    }

    @Override // com.google.android.material.textfield.ac
    public final void m() {
        if (this.p.isTouchExplorationEnabled() && ad.h(this.f6911h) && !this.f6828d.hasFocus()) {
            this.f6911h.dismissDropDown();
        }
        this.f6911h.post(new Runnable() { // from class: com.google.android.material.textfield.s
            @Override // java.lang.Runnable
            public final void run() {
                u.l(this.f6906a);
            }
        });
    }

    @Override // com.google.android.material.textfield.ac
    final boolean p(int i2) {
        return i2 != 0;
    }

    @Override // com.google.android.material.textfield.ac
    final boolean q() {
        return true;
    }

    @Override // com.google.android.material.textfield.ac
    final boolean r() {
        return this.f6915l;
    }

    @Override // com.google.android.material.textfield.ac
    final boolean s() {
        return true;
    }

    @Override // com.google.android.material.textfield.ac
    final boolean t() {
        return this.n;
    }

    @Override // com.google.android.material.textfield.ac
    final boolean u() {
        return true;
    }

    @Override // com.google.android.material.textfield.ac
    public final void y(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (!ad.h(this.f6911h)) {
            accessibilityNodeInfoCompat.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfoCompat.isShowingHintText()) {
            accessibilityNodeInfoCompat.setHintText(null);
        }
    }

    @Override // com.google.android.material.textfield.ac
    public final void z(AccessibilityEvent accessibilityEvent) {
        if (!this.p.isEnabled() || ad.h(this.f6911h)) {
            return;
        }
        boolean z = false;
        if ((accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.f6911h.isPopupShowing()) {
            z = true;
        }
        if (accessibilityEvent.getEventType() == 1 || z) {
            E();
            F();
        }
    }
}
