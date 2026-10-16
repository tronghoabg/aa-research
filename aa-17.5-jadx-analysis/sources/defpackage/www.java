package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class www extends wxb {
    public AutoCompleteTextView a;
    public boolean b;
    public boolean c;
    public ValueAnimator d;
    private final int i;
    private final int j;
    private final TimeInterpolator k;
    private final View.OnClickListener l;
    private final View.OnFocusChangeListener m;
    private final AccessibilityManager.TouchExplorationStateChangeListener n;
    private boolean o;
    private long p;
    private AccessibilityManager q;
    private ValueAnimator r;

    public www(wxa wxaVar) {
        super(wxaVar);
        this.l = new wwt(this, 0);
        this.m = new krj(this, 12);
        this.n = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: wwu
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                www wwwVar = this.a;
                AutoCompleteTextView autoCompleteTextView = wwwVar.a;
                if (autoCompleteTextView == null || wox.d(autoCompleteTextView)) {
                    return;
                }
                wwwVar.h.setImportantForAccessibility(true == z ? 2 : 1);
            }
        };
        this.p = Long.MAX_VALUE;
        this.j = woy.u(wxaVar.getContext(), R.attr.motionDurationShort3, 67);
        this.i = woy.u(wxaVar.getContext(), R.attr.motionDurationShort3, 50);
        this.k = woy.C(wxaVar.getContext(), R.attr.motionEasingLinearInterpolator, wkn.a);
    }

    private final ValueAnimator z(int i, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.k);
        valueAnimatorOfFloat.setDuration(i);
        valueAnimatorOfFloat.addUpdateListener(new wwk(this, 2));
        return valueAnimatorOfFloat;
    }

    @Override // defpackage.wxb
    public final AccessibilityManager.TouchExplorationStateChangeListener A() {
        return this.n;
    }

    @Override // defpackage.wxb
    public final int a() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.wxb
    public final int b() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // defpackage.wxb
    public final View.OnClickListener c() {
        return this.l;
    }

    @Override // defpackage.wxb
    public final View.OnFocusChangeListener d() {
        return this.m;
    }

    @Override // defpackage.wxb
    public final void g(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.a = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new jzt(this, 11, null));
        this.a.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: wws
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                www wwwVar = this.a;
                wwwVar.n();
                wwwVar.k(false);
            }
        });
        this.a.setThreshold(0);
        TextInputLayout textInputLayout = this.e;
        textInputLayout.b.n(null);
        if (!wox.d(editText) && this.q.isTouchExplorationEnabled()) {
            this.h.setImportantForAccessibility(2);
        }
        textInputLayout.j(true);
    }

    @Override // defpackage.wxb
    public final void i() {
        this.d = z(this.j, BitmapDescriptorFactory.HUE_RED, 1.0f);
        ValueAnimator valueAnimatorZ = z(this.i, 1.0f, BitmapDescriptorFactory.HUE_RED);
        this.r = valueAnimatorZ;
        valueAnimatorZ.addListener(new wwv(this));
        this.q = (AccessibilityManager) this.g.getSystemService("accessibility");
    }

    @Override // defpackage.wxb
    public final void j() {
        AutoCompleteTextView autoCompleteTextView = this.a;
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

    @Override // defpackage.wxb
    public final void l() {
        if (this.q.isTouchExplorationEnabled() && wox.d(this.a) && !this.h.hasFocus()) {
            this.a.dismissDropDown();
        }
        this.a.post(new wxj(this, 1));
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
        AutoCompleteTextView autoCompleteTextView = this.a;
        if (!z) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            this.a.showDropDown();
        }
    }

    public final void n() {
        this.c = true;
        this.p = SystemClock.uptimeMillis();
    }

    @Override // defpackage.wxb
    public final boolean o(int i) {
        return i != 0;
    }

    public final boolean p() {
        long jUptimeMillis = SystemClock.uptimeMillis() - this.p;
        return jUptimeMillis < 0 || jUptimeMillis > 300;
    }

    @Override // defpackage.wxb
    public final boolean q() {
        return true;
    }

    @Override // defpackage.wxb
    public final boolean r() {
        return this.b;
    }

    @Override // defpackage.wxb
    public final boolean s() {
        return true;
    }

    @Override // defpackage.wxb
    public final boolean t() {
        return this.o;
    }

    @Override // defpackage.wxb
    public final boolean u() {
        return true;
    }

    @Override // defpackage.wxb
    public final void v(edg edgVar) {
        if (!wox.d(this.a)) {
            edgVar.r(Spinner.class.getName());
        }
        if (edgVar.a.isShowingHintText()) {
            edgVar.C(null);
        }
    }

    @Override // defpackage.wxb
    public final void w(AccessibilityEvent accessibilityEvent) {
        if (!this.q.isEnabled() || wox.d(this.a)) {
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
