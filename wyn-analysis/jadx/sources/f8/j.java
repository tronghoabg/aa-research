package f8;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import com.moloco.sdk.internal.publisher.H;
import com.unity3d.services.UnityAdsConstants;
import com.wynauto.wyn.R;
import java.util.WeakHashMap;
import k1.S;
import l1.C3375e;

/* loaded from: classes4.dex */
public final class j extends n {

    /* renamed from: e, reason: collision with root package name */
    public final int f35140e;

    /* renamed from: f, reason: collision with root package name */
    public final int f35141f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f35142g;

    /* renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f35143h;

    /* renamed from: i, reason: collision with root package name */
    public final Lb.h f35144i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC2617a f35145j;
    public final com.unity3d.services.core.webview.b k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f35146l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f35147m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f35148n;

    /* renamed from: o, reason: collision with root package name */
    public long f35149o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f35150p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f35151q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f35152r;

    public j(m mVar) {
        super(mVar);
        this.f35144i = new Lb.h(this, 6);
        this.f35145j = new ViewOnFocusChangeListenerC2617a(this, 1);
        this.k = new com.unity3d.services.core.webview.b(this, 6);
        this.f35149o = Long.MAX_VALUE;
        this.f35141f = Ba.c.J(mVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f35140e = Ba.c.J(mVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f35142g = Ba.c.K(mVar.getContext(), R.attr.motionEasingLinearInterpolator, J7.a.f5719a);
    }

    @Override // f8.n
    public final void a() {
        if (this.f35150p.isTouchExplorationEnabled() && H.a0(this.f35143h) && !this.f35179d.hasFocus()) {
            this.f35143h.dismissDropDown();
        }
        this.f35143h.post(new com.applovin.adview.a(this, 25));
    }

    @Override // f8.n
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // f8.n
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // f8.n
    public final View.OnFocusChangeListener e() {
        return this.f35145j;
    }

    @Override // f8.n
    public final View.OnClickListener f() {
        return this.f35144i;
    }

    @Override // f8.n
    public final com.unity3d.services.core.webview.b h() {
        return this.k;
    }

    @Override // f8.n
    public final boolean i(int i5) {
        return i5 != 0;
    }

    @Override // f8.n
    public final boolean j() {
        return this.f35146l;
    }

    @Override // f8.n
    public final boolean l() {
        return this.f35148n;
    }

    @Override // f8.n
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f35143h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new Lb.g(this, 3));
        this.f35143h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: f8.i
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                j jVar = this.f35139a;
                jVar.f35147m = true;
                jVar.f35149o = System.currentTimeMillis();
                jVar.t(false);
            }
        });
        this.f35143h.setThreshold(0);
        TextInputLayout textInputLayout = this.f35176a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!H.a0(editText) && this.f35150p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = S.f38779a;
            this.f35179d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // f8.n
    public final void n(C3375e c3375e) {
        if (!H.a0(this.f35143h)) {
            c3375e.j(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26 ? c3375e.f39862a.isShowingHintText() : c3375e.e(4)) {
            c3375e.l(null);
        }
    }

    @Override // f8.n
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f35150p.isEnabled() || H.a0(this.f35143h)) {
            return;
        }
        boolean z2 = accessibilityEvent.getEventType() == 32768 && this.f35148n && !this.f35143h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z2) {
            u();
            this.f35147m = true;
            this.f35149o = System.currentTimeMillis();
        }
    }

    @Override // f8.n
    public final void r() {
        int i5 = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        TimeInterpolator timeInterpolator = this.f35142g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f35141f);
        valueAnimatorOfFloat.addUpdateListener(new h(this, i5));
        this.f35152r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f35140e);
        valueAnimatorOfFloat2.addUpdateListener(new h(this, i5));
        this.f35151q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new D9.o(this, 3));
        this.f35150p = (AccessibilityManager) this.f35178c.getSystemService("accessibility");
    }

    @Override // f8.n
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f35143h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f35143h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z2) {
        if (this.f35148n != z2) {
            this.f35148n = z2;
            this.f35152r.cancel();
            this.f35151q.start();
        }
    }

    public final void u() {
        if (this.f35143h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f35149o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f35147m = false;
        }
        if (this.f35147m) {
            this.f35147m = false;
            return;
        }
        t(!this.f35148n);
        if (!this.f35148n) {
            this.f35143h.dismissDropDown();
        } else {
            this.f35143h.requestFocus();
            this.f35143h.showDropDown();
        }
    }
}
