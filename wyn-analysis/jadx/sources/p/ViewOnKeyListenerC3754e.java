package p;

import ac.C1346a;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T;
import com.wynauto.wyn.R;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k1.S;
import ka.AbstractC3256n;
import q.C3838t0;
import q.H0;
import q.L0;

/* renamed from: p.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC3754e extends s implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f43000b;

    /* renamed from: c, reason: collision with root package name */
    public final int f43001c;

    /* renamed from: d, reason: collision with root package name */
    public final int f43002d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f43003e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f43004f;

    /* renamed from: n, reason: collision with root package name */
    public View f43011n;

    /* renamed from: o, reason: collision with root package name */
    public View f43012o;

    /* renamed from: p, reason: collision with root package name */
    public int f43013p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f43014q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f43015r;

    /* renamed from: s, reason: collision with root package name */
    public int f43016s;

    /* renamed from: t, reason: collision with root package name */
    public int f43017t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f43019v;

    /* renamed from: w, reason: collision with root package name */
    public w f43020w;

    /* renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f43021x;

    /* renamed from: y, reason: collision with root package name */
    public t f43022y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f43023z;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f43005g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f43006h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final E9.d f43007i = new E9.d(this, 3);

    /* renamed from: j, reason: collision with root package name */
    public final T f43008j = new T(this, 2);
    public final C1346a k = new C1346a(this, 14);

    /* renamed from: l, reason: collision with root package name */
    public int f43009l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f43010m = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f43018u = false;

    public ViewOnKeyListenerC3754e(Context context, View view, int i5, boolean z2) {
        this.f43000b = context;
        this.f43011n = view;
        this.f43002d = i5;
        this.f43003e = z2;
        WeakHashMap weakHashMap = S.f38779a;
        this.f43013p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f43001c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f43004f = new Handler();
    }

    @Override // p.InterfaceC3747B
    public final boolean a() {
        ArrayList arrayList = this.f43006h;
        return arrayList.size() > 0 && ((C3753d) arrayList.get(0)).f42997a.f43651z.isShowing();
    }

    @Override // p.x
    public final void c(w wVar) {
        this.f43020w = wVar;
    }

    @Override // p.x
    public final void d() {
        Iterator it = this.f43006h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C3753d) it.next()).f42997a.f43629c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((h) adapter).notifyDataSetChanged();
        }
    }

    @Override // p.InterfaceC3747B
    public final void dismiss() {
        ArrayList arrayList = this.f43006h;
        int size = arrayList.size();
        if (size > 0) {
            C3753d[] c3753dArr = (C3753d[]) arrayList.toArray(new C3753d[size]);
            for (int i5 = size - 1; i5 >= 0; i5--) {
                C3753d c3753d = c3753dArr[i5];
                if (c3753d.f42997a.f43651z.isShowing()) {
                    c3753d.f42997a.dismiss();
                }
            }
        }
    }

    @Override // p.x
    public final boolean g() {
        return false;
    }

    @Override // p.x
    public final boolean h(SubMenuC3749D subMenuC3749D) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Iterator it = this.f43006h.iterator();
        while (it.hasNext()) {
            C3753d c3753d = (C3753d) it.next();
            if (subMenuC3749D == c3753d.f42998b) {
                c3753d.f42997a.f43629c.requestFocus();
                return true;
            }
        }
        if (!subMenuC3749D.hasVisibleItems()) {
            return false;
        }
        i(subMenuC3749D);
        w wVar = this.f43020w;
        if (wVar != null) {
            wVar.F(subMenuC3749D);
        }
        return true;
    }

    @Override // p.s
    public final void i(k kVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        kVar.b(this, this.f43000b);
        if (a()) {
            u(kVar);
        } else {
            this.f43005g.add(kVar);
        }
    }

    @Override // p.s
    public final void k(View view) {
        if (this.f43011n != view) {
            this.f43011n = view;
            int i5 = this.f43009l;
            WeakHashMap weakHashMap = S.f38779a;
            this.f43010m = Gravity.getAbsoluteGravity(i5, view.getLayoutDirection());
        }
    }

    @Override // p.x
    public final void l(k kVar, boolean z2) {
        ArrayList arrayList = this.f43006h;
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i5 = -1;
                break;
            } else if (kVar == ((C3753d) arrayList.get(i5)).f42998b) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 < 0) {
            return;
        }
        int i10 = i5 + 1;
        if (i10 < arrayList.size()) {
            ((C3753d) arrayList.get(i10)).f42998b.c(false);
        }
        C3753d c3753d = (C3753d) arrayList.remove(i5);
        c3753d.f42998b.r(this);
        boolean z10 = this.f43023z;
        L0 l02 = c3753d.f42997a;
        if (z10) {
            H0.b(l02.f43651z, null);
            l02.f43651z.setAnimationStyle(0);
        }
        l02.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f43013p = ((C3753d) arrayList.get(size2 - 1)).f42999c;
        } else {
            View view = this.f43011n;
            WeakHashMap weakHashMap = S.f38779a;
            this.f43013p = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((C3753d) arrayList.get(0)).f42998b.c(false);
                return;
            }
            return;
        }
        dismiss();
        w wVar = this.f43020w;
        if (wVar != null) {
            wVar.l(kVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f43021x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f43021x.removeGlobalOnLayoutListener(this.f43007i);
            }
            this.f43021x = null;
        }
        this.f43012o.removeOnAttachStateChangeListener(this.f43008j);
        this.f43022y.onDismiss();
    }

    @Override // p.s
    public final void m(boolean z2) {
        this.f43018u = z2;
    }

    @Override // p.InterfaceC3747B
    public final C3838t0 n() {
        ArrayList arrayList = this.f43006h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C3753d) AbstractC3256n.e(arrayList, 1)).f42997a.f43629c;
    }

    @Override // p.s
    public final void o(int i5) {
        if (this.f43009l != i5) {
            this.f43009l = i5;
            View view = this.f43011n;
            WeakHashMap weakHashMap = S.f38779a;
            this.f43010m = Gravity.getAbsoluteGravity(i5, view.getLayoutDirection());
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C3753d c3753d;
        ArrayList arrayList = this.f43006h;
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                c3753d = null;
                break;
            }
            c3753d = (C3753d) arrayList.get(i5);
            if (!c3753d.f42997a.f43651z.isShowing()) {
                break;
            } else {
                i5++;
            }
        }
        if (c3753d != null) {
            c3753d.f42998b.c(false);
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
        this.f43014q = true;
        this.f43016s = i5;
    }

    @Override // p.s
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.f43022y = (t) onDismissListener;
    }

    @Override // p.s
    public final void r(boolean z2) {
        this.f43019v = z2;
    }

    @Override // p.s
    public final void s(int i5) {
        this.f43015r = true;
        this.f43017t = i5;
    }

    @Override // p.InterfaceC3747B
    public final void show() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f43005g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u((k) it.next());
        }
        arrayList.clear();
        View view = this.f43011n;
        this.f43012o = view;
        if (view != null) {
            boolean z2 = this.f43021x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f43021x = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f43007i);
            }
            this.f43012o.addOnAttachStateChangeListener(this.f43008j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b3  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.LayoutInflater] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(p.k r20) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ViewOnKeyListenerC3754e.u(p.k):void");
    }
}
