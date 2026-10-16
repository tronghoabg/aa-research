package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.dp;
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
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ak extends z implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener, ad {

    /* renamed from: a, reason: collision with root package name */
    final dp f764a;

    /* renamed from: c, reason: collision with root package name */
    View f766c;

    /* renamed from: d, reason: collision with root package name */
    ViewTreeObserver f767d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f768e;

    /* renamed from: f, reason: collision with root package name */
    private final q f769f;

    /* renamed from: g, reason: collision with root package name */
    private final n f770g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f771h;

    /* renamed from: i, reason: collision with root package name */
    private final int f772i;

    /* renamed from: j, reason: collision with root package name */
    private final int f773j;

    /* renamed from: l, reason: collision with root package name */
    private PopupWindow.OnDismissListener f775l;
    private View m;
    private ac n;
    private boolean o;
    private boolean p;
    private int q;
    private boolean s;

    /* renamed from: b, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f765b = new ai(this);

    /* renamed from: k, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f774k = new aj(this);
    private int r = 0;

    public ak(Context context, q qVar, View view, int i2, boolean z) {
        this.f768e = context;
        this.f769f = qVar;
        this.f771h = z;
        this.f770g = new n(qVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.f773j = i2;
        Resources resources = context.getResources();
        this.f772i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.m = view;
        this.f764a = new dp(context, i2);
        qVar.k(this, context);
    }

    @Override // android.support.v7.view.menu.ah
    public final ListView bh() {
        return this.f764a.bh();
    }

    @Override // android.support.v7.view.menu.ad
    public final void d(q qVar, boolean z) {
        if (qVar != this.f769f) {
            return;
        }
        k();
        ac acVar = this.n;
        if (acVar != null) {
            acVar.a(qVar, z);
        }
    }

    @Override // android.support.v7.view.menu.ad
    public final void e(ac acVar) {
        this.n = acVar;
    }

    @Override // android.support.v7.view.menu.ad
    public final boolean f() {
        return false;
    }

    @Override // android.support.v7.view.menu.ad
    public final boolean g(al alVar) {
        if (alVar.hasVisibleItems()) {
            ab abVar = new ab(this.f768e, alVar, this.f766c, this.f771h, this.f773j);
            abVar.g(this.n);
            abVar.e(z.y(alVar));
            abVar.f(this.f775l);
            this.f775l = null;
            this.f769f.m(false);
            dp dpVar = this.f764a;
            int iBi = dpVar.bi();
            int iBj = dpVar.bj();
            if ((Gravity.getAbsoluteGravity(this.r, this.m.getLayoutDirection()) & 7) == 5) {
                iBi += this.m.getWidth();
            }
            if (abVar.j(iBi, iBj)) {
                ac acVar = this.n;
                if (acVar == null) {
                    return true;
                }
                acVar.b(alVar);
                return true;
            }
        }
        return false;
    }

    @Override // android.support.v7.view.menu.ad
    public final void j() {
        this.p = false;
        n nVar = this.f770g;
        if (nVar != null) {
            nVar.notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.view.menu.ah
    public final void k() {
        if (u()) {
            this.f764a.k();
        }
    }

    @Override // android.support.v7.view.menu.z
    public final void l(View view) {
        this.m = view;
    }

    @Override // android.support.v7.view.menu.z
    public final void m(boolean z) {
        this.f770g.d(z);
    }

    @Override // android.support.v7.view.menu.z
    public final void n(int i2) {
        this.r = i2;
    }

    @Override // android.support.v7.view.menu.z
    public final void o(int i2) {
        this.f764a.g(i2);
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.o = true;
        this.f769f.close();
        ViewTreeObserver viewTreeObserver = this.f767d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f767d = this.f766c.getViewTreeObserver();
            }
            this.f767d.removeGlobalOnLayoutListener(this.f765b);
            this.f767d = null;
        }
        this.f766c.removeOnAttachStateChangeListener(this.f774k);
        PopupWindow.OnDismissListener onDismissListener = this.f775l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        k();
        return true;
    }

    @Override // android.support.v7.view.menu.z
    public final void p(PopupWindow.OnDismissListener onDismissListener) {
        this.f775l = onDismissListener;
    }

    @Override // android.support.v7.view.menu.z
    public final void q(boolean z) {
        this.s = z;
    }

    @Override // android.support.v7.view.menu.z
    public final void r(int i2) {
        this.f764a.j(i2);
    }

    @Override // android.support.v7.view.menu.ah
    public final void s() {
        View view;
        if (u()) {
            return;
        }
        if (this.o || (view = this.m) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f766c = view;
        dp dpVar = this.f764a;
        dpVar.C(this);
        dpVar.D(this);
        dpVar.J();
        View view2 = this.f766c;
        ViewTreeObserver viewTreeObserver = this.f767d;
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        this.f767d = viewTreeObserver2;
        if (viewTreeObserver == null) {
            viewTreeObserver2.addOnGlobalLayoutListener(this.f765b);
        }
        view2.addOnAttachStateChangeListener(this.f774k);
        dpVar.y(view2);
        dpVar.A(this.r);
        if (!this.p) {
            this.q = z(this.f770g, this.f768e, this.f772i);
            this.p = true;
        }
        dpVar.z(this.q);
        dpVar.I();
        dpVar.B(v());
        dpVar.s();
        ListView listViewBh = dpVar.bh();
        listViewBh.setOnKeyListener(this);
        if (this.s) {
            q qVar = this.f769f;
            if (qVar.f826a != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f768e).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) listViewBh, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(qVar.f826a);
                }
                frameLayout.setEnabled(false);
                listViewBh.addHeaderView(frameLayout, null, false);
            }
        }
        dpVar.e(this.f770g);
        dpVar.s();
    }

    @Override // android.support.v7.view.menu.ah
    public final boolean u() {
        return !this.o && this.f764a.u();
    }

    @Override // android.support.v7.view.menu.z
    public final void b(q qVar) {
    }
}
