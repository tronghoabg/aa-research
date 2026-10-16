package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T;
import com.wynauto.wyn.R;
import java.util.WeakHashMap;
import k1.S;
import q.C3838t0;
import q.L0;

/* renamed from: p.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC3748C extends s implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f42961b;

    /* renamed from: c, reason: collision with root package name */
    public final k f42962c;

    /* renamed from: d, reason: collision with root package name */
    public final h f42963d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f42964e;

    /* renamed from: f, reason: collision with root package name */
    public final int f42965f;

    /* renamed from: g, reason: collision with root package name */
    public final int f42966g;

    /* renamed from: h, reason: collision with root package name */
    public final L0 f42967h;
    public t k;

    /* renamed from: l, reason: collision with root package name */
    public View f42970l;

    /* renamed from: m, reason: collision with root package name */
    public View f42971m;

    /* renamed from: n, reason: collision with root package name */
    public w f42972n;

    /* renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f42973o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f42974p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f42975q;

    /* renamed from: r, reason: collision with root package name */
    public int f42976r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f42978t;

    /* renamed from: i, reason: collision with root package name */
    public final E9.d f42968i = new E9.d(this, 4);

    /* renamed from: j, reason: collision with root package name */
    public final T f42969j = new T(this, 3);

    /* renamed from: s, reason: collision with root package name */
    public int f42977s = 0;

    public ViewOnKeyListenerC3748C(int i5, Context context, View view, k kVar, boolean z2) {
        this.f42961b = context;
        this.f42962c = kVar;
        this.f42964e = z2;
        this.f42963d = new h(kVar, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f42966g = i5;
        Resources resources = context.getResources();
        this.f42965f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f42970l = view;
        this.f42967h = new L0(context, null, i5);
        kVar.b(this, context);
    }

    @Override // p.InterfaceC3747B
    public final boolean a() {
        return !this.f42974p && this.f42967h.f43651z.isShowing();
    }

    @Override // p.x
    public final void c(w wVar) {
        this.f42972n = wVar;
    }

    @Override // p.x
    public final void d() {
        this.f42975q = false;
        h hVar = this.f42963d;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // p.InterfaceC3747B
    public final void dismiss() {
        if (a()) {
            this.f42967h.dismiss();
        }
    }

    @Override // p.x
    public final boolean g() {
        return false;
    }

    @Override // p.x
    public final boolean h(SubMenuC3749D subMenuC3749D) {
        if (subMenuC3749D.hasVisibleItems()) {
            View view = this.f42971m;
            v vVar = new v(this.f42966g, this.f42961b, view, subMenuC3749D, this.f42964e);
            w wVar = this.f42972n;
            vVar.f43113h = wVar;
            s sVar = vVar.f43114i;
            if (sVar != null) {
                sVar.c(wVar);
            }
            boolean zT = s.t(subMenuC3749D);
            vVar.f43112g = zT;
            s sVar2 = vVar.f43114i;
            if (sVar2 != null) {
                sVar2.m(zT);
            }
            vVar.f43115j = this.k;
            this.k = null;
            this.f42962c.c(false);
            L0 l02 = this.f42967h;
            int width = l02.f43632f;
            int iJ = l02.j();
            int i5 = this.f42977s;
            View view2 = this.f42970l;
            WeakHashMap weakHashMap = S.f38779a;
            if ((Gravity.getAbsoluteGravity(i5, view2.getLayoutDirection()) & 7) == 5) {
                width += this.f42970l.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.f43110e != null) {
                    vVar.d(width, iJ, true, true);
                }
            }
            w wVar2 = this.f42972n;
            if (wVar2 != null) {
                wVar2.F(subMenuC3749D);
            }
            return true;
        }
        return false;
    }

    @Override // p.s
    public final void k(View view) {
        this.f42970l = view;
    }

    @Override // p.x
    public final void l(k kVar, boolean z2) {
        if (kVar != this.f42962c) {
            return;
        }
        dismiss();
        w wVar = this.f42972n;
        if (wVar != null) {
            wVar.l(kVar, z2);
        }
    }

    @Override // p.s
    public final void m(boolean z2) {
        this.f42963d.f43034c = z2;
    }

    @Override // p.InterfaceC3747B
    public final C3838t0 n() {
        return this.f42967h.f43629c;
    }

    @Override // p.s
    public final void o(int i5) {
        this.f42977s = i5;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f42974p = true;
        this.f42962c.c(true);
        ViewTreeObserver viewTreeObserver = this.f42973o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f42973o = this.f42971m.getViewTreeObserver();
            }
            this.f42973o.removeGlobalOnLayoutListener(this.f42968i);
            this.f42973o = null;
        }
        this.f42971m.removeOnAttachStateChangeListener(this.f42969j);
        t tVar = this.k;
        if (tVar != null) {
            tVar.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i5, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i5 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p.s
    public final void p(int i5) {
        this.f42967h.f43632f = i5;
    }

    @Override // p.s
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.k = (t) onDismissListener;
    }

    @Override // p.s
    public final void r(boolean z2) {
        this.f42978t = z2;
    }

    @Override // p.s
    public final void s(int i5) {
        this.f42967h.g(i5);
    }

    @Override // p.InterfaceC3747B
    public final void show() {
        View view;
        if (a()) {
            return;
        }
        if (this.f42974p || (view = this.f42970l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f42971m = view;
        L0 l02 = this.f42967h;
        l02.f43651z.setOnDismissListener(this);
        l02.f43641p = this;
        l02.f43650y = true;
        l02.f43651z.setFocusable(true);
        View view2 = this.f42971m;
        boolean z2 = this.f42973o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f42973o = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f42968i);
        }
        view2.addOnAttachStateChangeListener(this.f42969j);
        l02.f43640o = view2;
        l02.f43637l = this.f42977s;
        boolean z10 = this.f42975q;
        Context context = this.f42961b;
        h hVar = this.f42963d;
        if (!z10) {
            this.f42976r = s.j(hVar, context, this.f42965f);
            this.f42975q = true;
        }
        l02.p(this.f42976r);
        l02.f43651z.setInputMethodMode(2);
        Rect rect = this.f43104a;
        l02.f43649x = rect != null ? new Rect(rect) : null;
        l02.show();
        C3838t0 c3838t0 = l02.f43629c;
        c3838t0.setOnKeyListener(this);
        if (this.f42978t) {
            k kVar = this.f42962c;
            if (kVar.f43050m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c3838t0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(kVar.f43050m);
                }
                frameLayout.setEnabled(false);
                c3838t0.addHeaderView(frameLayout, null, false);
            }
        }
        l02.k(hVar);
        l02.show();
    }

    @Override // p.s
    public final void i(k kVar) {
    }
}
