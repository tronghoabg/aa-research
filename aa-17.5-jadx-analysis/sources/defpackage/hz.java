package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class hz extends ho implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener, hs {
    final ln a;
    View c;
    ViewTreeObserver d;
    private final Context e;
    private final hg f;
    private final hd h;
    private final boolean i;
    private final int j;
    private final int k;
    private PopupWindow.OnDismissListener m;
    private View n;
    private hr o;
    private boolean p;
    private boolean q;
    private int r;
    private boolean t;
    final ViewTreeObserver.OnGlobalLayoutListener b = new hx(this, 0);
    private final View.OnAttachStateChangeListener l = new hy(this, 0);
    private int s = 0;

    public hz(Context context, hg hgVar, View view, int i, boolean z) {
        this.e = context;
        this.f = hgVar;
        this.i = z;
        this.h = new hd(hgVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.k = i;
        Resources resources = context.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.n = view;
        this.a = new ln(context, i);
        hgVar.h(this, context);
    }

    @Override // defpackage.hs
    public final void c(hg hgVar, boolean z) {
        if (hgVar != this.f) {
            return;
        }
        k();
        hr hrVar = this.o;
        if (hrVar != null) {
            hrVar.a(hgVar, z);
        }
    }

    @Override // defpackage.hs
    public final void d(hr hrVar) {
        this.o = hrVar;
    }

    @Override // defpackage.hw
    public final ListView dZ() {
        return this.a.e;
    }

    @Override // defpackage.hs
    public final boolean e() {
        return false;
    }

    @Override // defpackage.hs
    public final boolean f(ia iaVar) {
        if (iaVar.hasVisibleItems()) {
            hq hqVar = new hq(this.e, iaVar, this.c, this.i, this.k);
            hqVar.e(this.o);
            hqVar.d(ho.w(iaVar));
            hqVar.c = this.m;
            this.m = null;
            this.f.i(false);
            ln lnVar = this.a;
            int width = lnVar.g;
            int iB = lnVar.b();
            if ((Gravity.getAbsoluteGravity(this.s, this.n.getLayoutDirection()) & 7) == 5) {
                width += this.n.getWidth();
            }
            if (!hqVar.g()) {
                if (hqVar.a != null) {
                    hqVar.f(width, iB, true, true);
                }
            }
            hr hrVar = this.o;
            if (hrVar != null) {
                hrVar.b(iaVar);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.hs
    public final void i() {
        this.q = false;
        hd hdVar = this.h;
        if (hdVar != null) {
            hdVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.hw
    public final void k() {
        if (u()) {
            this.a.k();
        }
    }

    @Override // defpackage.ho
    public final void l(View view) {
        this.n = view;
    }

    @Override // defpackage.ho
    public final void m(boolean z) {
        this.h.b = z;
    }

    @Override // defpackage.ho
    public final void n(int i) {
        this.s = i;
    }

    @Override // defpackage.ho
    public final void o(int i) {
        this.a.g = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.p = true;
        this.f.i(true);
        ViewTreeObserver viewTreeObserver = this.d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.d = this.c.getViewTreeObserver();
            }
            this.d.removeGlobalOnLayoutListener(this.b);
            this.d = null;
        }
        this.c.removeOnAttachStateChangeListener(this.l);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        k();
        return true;
    }

    @Override // defpackage.ho
    public final void p(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    @Override // defpackage.ho
    public final void q(boolean z) {
        this.t = z;
    }

    @Override // defpackage.ho
    public final void r(int i) {
        this.a.j(i);
    }

    @Override // defpackage.hw
    public final void s() {
        View view;
        if (u()) {
            return;
        }
        if (this.p || (view = this.n) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.c = view;
        ln lnVar = this.a;
        lnVar.v(this);
        lnVar.l = this;
        lnVar.y();
        View view2 = this.c;
        ViewTreeObserver viewTreeObserver = this.d;
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        this.d = viewTreeObserver2;
        if (viewTreeObserver == null) {
            viewTreeObserver2.addOnGlobalLayoutListener(this.b);
        }
        view2.addOnAttachStateChangeListener(this.l);
        lnVar.k = view2;
        lnVar.j = this.s;
        if (!this.q) {
            this.r = x(this.h, this.e, this.j);
            this.q = true;
        }
        lnVar.r(this.r);
        lnVar.x();
        lnVar.t(this.g);
        lnVar.s();
        ks ksVar = lnVar.e;
        ksVar.setOnKeyListener(this);
        if (this.t) {
            hg hgVar = this.f;
            if (hgVar.e != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.e).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) ksVar, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(hgVar.e);
                }
                frameLayout.setEnabled(false);
                ksVar.addHeaderView(frameLayout, null, false);
            }
        }
        lnVar.e(this.h);
        lnVar.s();
    }

    @Override // defpackage.hw
    public final boolean u() {
        return !this.p && this.a.u();
    }

    @Override // defpackage.ho
    public final void j(hg hgVar) {
    }
}
