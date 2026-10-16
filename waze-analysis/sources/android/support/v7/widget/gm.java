package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class gm {

    /* renamed from: a, reason: collision with root package name */
    final Toolbar f1564a;

    /* renamed from: b, reason: collision with root package name */
    CharSequence f1565b;

    /* renamed from: c, reason: collision with root package name */
    Window.Callback f1566c;

    /* renamed from: d, reason: collision with root package name */
    boolean f1567d;

    /* renamed from: e, reason: collision with root package name */
    private int f1568e;

    /* renamed from: f, reason: collision with root package name */
    private View f1569f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f1570g;

    /* renamed from: h, reason: collision with root package name */
    private Drawable f1571h;

    /* renamed from: i, reason: collision with root package name */
    private Drawable f1572i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f1573j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f1574k;

    /* renamed from: l, reason: collision with root package name */
    private CharSequence f1575l;
    private p m;
    private int n;
    private final Drawable o;

    public gm(Toolbar toolbar) {
        this.n = 0;
        this.f1564a = toolbar;
        this.f1565b = toolbar.i();
        this.f1574k = toolbar.h();
        this.f1573j = this.f1565b != null;
        this.f1572i = toolbar.e();
        gc gcVarN = gc.n(toolbar.getContext(), null, android.support.v7.a.a.f479a, R.attr.actionBarStyle, 0);
        Drawable drawableJ = gcVarN.j(15);
        this.o = drawableJ;
        CharSequence charSequenceO = gcVarN.o(27);
        if (!TextUtils.isEmpty(charSequenceO)) {
            this.f1573j = true;
            k(charSequenceO);
        }
        CharSequence charSequenceO2 = gcVarN.o(25);
        if (!TextUtils.isEmpty(charSequenceO2)) {
            this.f1574k = charSequenceO2;
            if ((this.f1568e & 8) != 0) {
                toolbar.u(charSequenceO2);
            }
        }
        Drawable drawableJ2 = gcVarN.j(20);
        if (drawableJ2 != null) {
            this.f1571h = drawableJ2;
            n();
        }
        Drawable drawableJ3 = gcVarN.j(17);
        if (drawableJ3 != null) {
            this.f1570g = drawableJ3;
            n();
        }
        if (this.f1572i == null && drawableJ != null) {
            this.f1572i = drawableJ;
            m();
        }
        e(gcVarN.c(10, 0));
        int iF = gcVarN.f(9, 0);
        if (iF != 0) {
            View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(iF, (ViewGroup) toolbar, false);
            View view = this.f1569f;
            if (view != null && (this.f1568e & 16) != 0) {
                toolbar.removeView(view);
            }
            this.f1569f = viewInflate;
            if (viewInflate != null && (this.f1568e & 16) != 0) {
                toolbar.addView(viewInflate);
            }
            e(this.f1568e | 16);
        }
        int iE = gcVarN.e(13, 0);
        if (iE > 0) {
            ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
            layoutParams.height = iE;
            toolbar.setLayoutParams(layoutParams);
        }
        int iA = gcVarN.a(7, -1);
        int iA2 = gcVarN.a(3, -1);
        if (iA >= 0 || iA2 >= 0) {
            toolbar.n(Math.max(iA, 0), Math.max(iA2, 0));
        }
        int iF2 = gcVarN.f(28, 0);
        if (iF2 != 0) {
            toolbar.x(toolbar.getContext(), iF2);
        }
        int iF3 = gcVarN.f(26, 0);
        if (iF3 != 0) {
            toolbar.v(toolbar.getContext(), iF3);
        }
        int iF4 = gcVarN.f(22, 0);
        if (iF4 != 0) {
            toolbar.t(iF4);
        }
        gcVarN.q();
        if (this.n != R.string.abc_action_bar_up_description) {
            this.n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.g())) {
                int i2 = this.n;
                this.f1575l = i2 != 0 ? b().getString(i2) : null;
                l();
            }
        }
        this.f1575l = toolbar.g();
        toolbar.s(new gk(this));
    }

    private final void k(CharSequence charSequence) {
        this.f1565b = charSequence;
        if ((this.f1568e & 8) != 0) {
            Toolbar toolbar = this.f1564a;
            toolbar.w(charSequence);
            if (this.f1573j) {
                ViewCompat.setAccessibilityPaneTitle(toolbar.getRootView(), charSequence);
            }
        }
    }

    private final void l() {
        if ((this.f1568e & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f1575l);
            Toolbar toolbar = this.f1564a;
            if (!zIsEmpty) {
                toolbar.q(this.f1575l);
            } else {
                int i2 = this.n;
                toolbar.q(i2 != 0 ? toolbar.getContext().getText(i2) : null);
            }
        }
    }

    private final void m() {
        int i2 = this.f1568e & 4;
        Toolbar toolbar = this.f1564a;
        if (i2 == 0) {
            toolbar.r(null);
            return;
        }
        Drawable drawable = this.f1572i;
        if (drawable == null) {
            drawable = this.o;
        }
        toolbar.r(drawable);
    }

    private final void n() {
        Drawable drawable;
        int i2 = this.f1568e;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.f1571h) == null) {
            drawable = this.f1570g;
        }
        this.f1564a.o(drawable);
    }

    public final int a() {
        return this.f1568e;
    }

    public final Context b() {
        return this.f1564a.getContext();
    }

    public final ViewPropertyAnimatorCompat c(int i2, long j2) {
        float f2 = i2 == 0 ? 1.0f : 0.0f;
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatAnimate = ViewCompat.animate(this.f1564a);
        viewPropertyAnimatorCompatAnimate.alpha(f2);
        viewPropertyAnimatorCompatAnimate.setDuration(j2);
        viewPropertyAnimatorCompatAnimate.setListener(new gl(this, i2));
        return viewPropertyAnimatorCompatAnimate;
    }

    public final void d() {
        this.f1564a.k();
    }

    public final void e(int i2) {
        View view;
        int i3 = this.f1568e ^ i2;
        this.f1568e = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    l();
                }
                m();
            }
            if ((i3 & 3) != 0) {
                n();
            }
            if ((i3 & 8) != 0) {
                int i4 = i2 & 8;
                Toolbar toolbar = this.f1564a;
                if (i4 != 0) {
                    toolbar.w(this.f1565b);
                    toolbar.u(this.f1574k);
                } else {
                    toolbar.w(null);
                    toolbar.u(null);
                }
            }
            if ((i3 & 16) == 0 || (view = this.f1569f) == null) {
                return;
            }
            int i5 = i2 & 16;
            Toolbar toolbar2 = this.f1564a;
            if (i5 != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void f(Menu menu, android.support.v7.view.menu.ac acVar) {
        p pVar = this.m;
        if (pVar == null) {
            p pVar2 = new p(this.f1564a.getContext());
            this.m = pVar2;
            pVar = pVar2;
        }
        pVar.e(acVar);
        this.f1564a.p((android.support.v7.view.menu.q) menu, this.m);
    }

    public final void g(int i2) {
        this.f1564a.setVisibility(i2);
    }

    public final void h(CharSequence charSequence) {
        if (this.f1573j) {
            return;
        }
        k(charSequence);
    }

    public final boolean i() {
        return this.f1564a.z();
    }

    public final void j() {
        this.f1564a.requestLayout();
    }
}
