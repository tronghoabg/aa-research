package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.google.android.projection.gearhead.R;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class ha extends ho implements View.OnKeyListener, PopupWindow.OnDismissListener, hs {
    public final Handler a;
    View d;
    ViewTreeObserver e;
    public boolean f;
    private final Context h;
    private final int i;
    private final int j;
    private final boolean k;
    private View q;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean x;
    private hr y;
    private PopupWindow.OnDismissListener z;
    private final List l = new ArrayList();
    public final List b = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener c = new hx(this, 1);
    private final View.OnAttachStateChangeListener m = new hy(this, 1);
    private final ll n = new gz(this);
    private int o = 0;
    private int p = 0;
    private boolean w = false;
    private int r = y();

    public ha(Context context, View view, int i, boolean z) {
        this.h = context;
        this.q = view;
        this.j = i;
        this.k = z;
        Resources resources = context.getResources();
        this.i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.a = new Handler();
    }

    private final int y() {
        return this.q.getLayoutDirection() == 1 ? 0 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void z(defpackage.hg r17) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ha.z(hg):void");
    }

    @Override // defpackage.hs
    public final void c(hg hgVar, boolean z) {
        List list = this.b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (hgVar == ((aagd) list.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < list.size()) {
            ((hg) ((aagd) list.get(i2)).b).i(false);
        }
        aagd aagdVar = (aagd) list.remove(i);
        ((hg) aagdVar.b).m(this);
        if (this.f) {
            Object obj = aagdVar.c;
            ((ln) obj).p.setExitTransition(null);
            ((lk) obj).p.setAnimationStyle(0);
        }
        ((lk) aagdVar.c).k();
        int size2 = list.size();
        if (size2 > 0) {
            this.r = ((aagd) list.get(size2 - 1)).a;
        } else {
            this.r = y();
        }
        if (size2 != 0) {
            if (z) {
                ((hg) ((aagd) list.get(0)).b).i(false);
                return;
            }
            return;
        }
        k();
        hr hrVar = this.y;
        if (hrVar != null) {
            hrVar.a(hgVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.e;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.e.removeGlobalOnLayoutListener(this.c);
            }
            this.e = null;
        }
        this.d.removeOnAttachStateChangeListener(this.m);
        this.z.onDismiss();
    }

    @Override // defpackage.hs
    public final void d(hr hrVar) {
        this.y = hrVar;
    }

    @Override // defpackage.hw
    public final ListView dZ() {
        List list = this.b;
        if (list.isEmpty()) {
            return null;
        }
        return ((aagd) list.get(list.size() - 1)).a();
    }

    @Override // defpackage.hs
    public final boolean e() {
        return false;
    }

    @Override // defpackage.hs
    public final boolean f(ia iaVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        for (aagd aagdVar : this.b) {
            if (iaVar == aagdVar.b) {
                aagdVar.a().requestFocus();
                return true;
            }
        }
        if (!iaVar.hasVisibleItems()) {
            return false;
        }
        j(iaVar);
        hr hrVar = this.y;
        if (hrVar != null) {
            hrVar.b(iaVar);
        }
        return true;
    }

    @Override // defpackage.hs
    public final void i() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            v(((aagd) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // defpackage.ho
    public final void j(hg hgVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        hgVar.h(this, this.h);
        if (u()) {
            z(hgVar);
        } else {
            this.l.add(hgVar);
        }
    }

    @Override // defpackage.hw
    public final void k() {
        List list = this.b;
        int size = list.size();
        if (size <= 0) {
            return;
        }
        aagd[] aagdVarArr = (aagd[]) list.toArray(new aagd[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            lk lkVar = (lk) aagdVarArr[size].c;
            if (lkVar.u()) {
                lkVar.k();
            }
        }
    }

    @Override // defpackage.ho
    public final void l(View view) {
        if (this.q != view) {
            this.q = view;
            this.p = Gravity.getAbsoluteGravity(this.o, view.getLayoutDirection());
        }
    }

    @Override // defpackage.ho
    public final void m(boolean z) {
        this.w = z;
    }

    @Override // defpackage.ho
    public final void n(int i) {
        if (this.o != i) {
            this.o = i;
            this.p = Gravity.getAbsoluteGravity(i, this.q.getLayoutDirection());
        }
    }

    @Override // defpackage.ho
    public final void o(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        aagd aagdVar;
        List list = this.b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aagdVar = null;
                break;
            }
            aagdVar = (aagd) list.get(i);
            if (!((lk) aagdVar.c).u()) {
                break;
            } else {
                i++;
            }
        }
        if (aagdVar != null) {
            ((hg) aagdVar.b).i(false);
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
        this.z = onDismissListener;
    }

    @Override // defpackage.ho
    public final void q(boolean z) {
        this.x = z;
    }

    @Override // defpackage.ho
    public final void r(int i) {
        this.t = true;
        this.v = i;
    }

    @Override // defpackage.hw
    public final void s() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (u()) {
            return;
        }
        List list = this.l;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z((hg) it.next());
        }
        list.clear();
        View view = this.q;
        this.d = view;
        if (view != null) {
            ViewTreeObserver viewTreeObserver = this.e;
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            this.e = viewTreeObserver2;
            if (viewTreeObserver == null) {
                viewTreeObserver2.addOnGlobalLayoutListener(this.c);
            }
            this.d.addOnAttachStateChangeListener(this.m);
        }
    }

    @Override // defpackage.ho
    protected final boolean t() {
        return false;
    }

    @Override // defpackage.hw
    public final boolean u() {
        List list = this.b;
        return list.size() > 0 && ((lk) ((aagd) list.get(0)).c).u();
    }
}
