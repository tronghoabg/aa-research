package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.support.v7.widget.dn;
import android.support.v7.widget.dp;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.core.view.GravityCompat;
import com.waze.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class k extends z implements View.OnKeyListener, PopupWindow.OnDismissListener, ad {

    /* renamed from: a, reason: collision with root package name */
    final Handler f799a;

    /* renamed from: d, reason: collision with root package name */
    View f802d;

    /* renamed from: e, reason: collision with root package name */
    ViewTreeObserver f803e;

    /* renamed from: f, reason: collision with root package name */
    boolean f804f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f805g;

    /* renamed from: h, reason: collision with root package name */
    private final int f806h;

    /* renamed from: i, reason: collision with root package name */
    private final int f807i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f808j;
    private View p;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private boolean w;
    private ac x;
    private PopupWindow.OnDismissListener y;

    /* renamed from: k, reason: collision with root package name */
    private final List f809k = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    final List f800b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f801c = new f(this);

    /* renamed from: l, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f810l = new g(this);
    private final dn m = new i(this);
    private int n = 0;
    private int o = 0;
    private boolean v = false;
    private int q = A();

    public k(Context context, View view, int i2, boolean z) {
        this.f805g = context;
        this.p = view;
        this.f807i = i2;
        this.f808j = z;
        Resources resources = context.getResources();
        this.f806h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f799a = new Handler();
    }

    private final int A() {
        return this.p.getLayoutDirection() == 1 ? 0 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void B(android.support.v7.view.menu.q r18) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.k.B(android.support.v7.view.menu.q):void");
    }

    @Override // android.support.v7.view.menu.z
    public final void b(q qVar) {
        qVar.k(this, this.f805g);
        if (u()) {
            B(qVar);
        } else {
            this.f809k.add(qVar);
        }
    }

    @Override // android.support.v7.view.menu.ah
    public final ListView bh() {
        List list = this.f800b;
        if (list.isEmpty()) {
            return null;
        }
        return ((j) list.get(list.size() - 1)).a();
    }

    @Override // android.support.v7.view.menu.ad
    public final void d(q qVar, boolean z) {
        List list = this.f800b;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (qVar == ((j) list.get(i2)).f797b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            return;
        }
        int i3 = i2 + 1;
        if (i3 < list.size()) {
            ((j) list.get(i3)).f797b.m(false);
        }
        j jVar = (j) list.remove(i2);
        jVar.f797b.q(this);
        if (this.f804f) {
            dp dpVar = jVar.f796a;
            dpVar.i();
            dpVar.H();
        }
        jVar.f796a.k();
        int size2 = list.size();
        if (size2 > 0) {
            this.q = ((j) list.get(size2 - 1)).f798c;
        } else {
            this.q = A();
        }
        if (size2 != 0) {
            if (z) {
                ((j) list.get(0)).f797b.m(false);
                return;
            }
            return;
        }
        k();
        ac acVar = this.x;
        if (acVar != null) {
            acVar.a(qVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f803e;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f803e.removeGlobalOnLayoutListener(this.f801c);
            }
            this.f803e = null;
        }
        this.f802d.removeOnAttachStateChangeListener(this.f810l);
        this.y.onDismiss();
    }

    @Override // android.support.v7.view.menu.ad
    public final void e(ac acVar) {
        this.x = acVar;
    }

    @Override // android.support.v7.view.menu.ad
    public final boolean f() {
        return false;
    }

    @Override // android.support.v7.view.menu.ad
    public final boolean g(al alVar) {
        for (j jVar : this.f800b) {
            if (alVar == jVar.f797b) {
                jVar.a().requestFocus();
                return true;
            }
        }
        if (!alVar.hasVisibleItems()) {
            return false;
        }
        b(alVar);
        ac acVar = this.x;
        if (acVar != null) {
            acVar.b(alVar);
        }
        return true;
    }

    @Override // android.support.v7.view.menu.ad
    public final void j() {
        Iterator it = this.f800b.iterator();
        while (it.hasNext()) {
            w(((j) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.view.menu.ah
    public final void k() {
        List list = this.f800b;
        int size = list.size();
        if (size <= 0) {
            return;
        }
        j[] jVarArr = (j[]) list.toArray(new j[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            dp dpVar = jVarArr[size].f796a;
            if (dpVar.u()) {
                dpVar.k();
            }
        }
    }

    @Override // android.support.v7.view.menu.z
    public final void l(View view) {
        if (this.p != view) {
            this.p = view;
            this.o = GravityCompat.getAbsoluteGravity(this.n, view.getLayoutDirection());
        }
    }

    @Override // android.support.v7.view.menu.z
    public final void m(boolean z) {
        this.v = z;
    }

    @Override // android.support.v7.view.menu.z
    public final void n(int i2) {
        if (this.n != i2) {
            this.n = i2;
            this.o = GravityCompat.getAbsoluteGravity(i2, this.p.getLayoutDirection());
        }
    }

    @Override // android.support.v7.view.menu.z
    public final void o(int i2) {
        this.r = true;
        this.t = i2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        j jVar;
        List list = this.f800b;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                jVar = null;
                break;
            }
            jVar = (j) list.get(i2);
            if (!jVar.f796a.u()) {
                break;
            } else {
                i2++;
            }
        }
        if (jVar != null) {
            jVar.f797b.m(false);
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
        this.y = onDismissListener;
    }

    @Override // android.support.v7.view.menu.z
    public final void q(boolean z) {
        this.w = z;
    }

    @Override // android.support.v7.view.menu.z
    public final void r(int i2) {
        this.s = true;
        this.u = i2;
    }

    @Override // android.support.v7.view.menu.ah
    public final void s() {
        if (u()) {
            return;
        }
        List list = this.f809k;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            B((q) it.next());
        }
        list.clear();
        View view = this.p;
        this.f802d = view;
        if (view != null) {
            ViewTreeObserver viewTreeObserver = this.f803e;
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            this.f803e = viewTreeObserver2;
            if (viewTreeObserver == null) {
                viewTreeObserver2.addOnGlobalLayoutListener(this.f801c);
            }
            this.f802d.addOnAttachStateChangeListener(this.f810l);
        }
    }

    @Override // android.support.v7.view.menu.z
    protected final boolean t() {
        return false;
    }

    @Override // android.support.v7.view.menu.ah
    public final boolean u() {
        List list = this.f800b;
        return list.size() > 0 && ((j) list.get(0)).f796a.u();
    }
}
