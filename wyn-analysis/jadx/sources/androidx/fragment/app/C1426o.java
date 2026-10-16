package androidx.fragment.app;

import Va.M6;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.wynauto.wyn.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import x.C4412e;

/* renamed from: androidx.fragment.app.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1426o {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f18512a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18513b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f18514c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18515d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18516e;

    public C1426o(ViewGroup container) {
        AbstractC3340k.e(container, "container");
        this.f18512a = container;
        this.f18513b = new ArrayList();
        this.f18514c = new ArrayList();
    }

    public static void f(C4412e c4412e, View view) {
        WeakHashMap weakHashMap = k1.S.f38779a;
        String strF = k1.J.f(view);
        if (strF != null) {
            c4412e.put(strF, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = viewGroup.getChildAt(i5);
                if (childAt.getVisibility() == 0) {
                    f(c4412e, childAt);
                }
            }
        }
    }

    public static final C1426o j(ViewGroup container, e0 fragmentManager) {
        AbstractC3340k.e(container, "container");
        AbstractC3340k.e(fragmentManager, "fragmentManager");
        AbstractC3340k.d(fragmentManager.H(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = container.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C1426o) {
            return (C1426o) tag;
        }
        C1426o c1426o = new C1426o(container);
        container.setTag(R.id.special_effects_controller_view_tag, c1426o);
        return c1426o;
    }

    public final void a(A0 operation) {
        AbstractC3340k.e(operation, "operation");
        if (operation.f18286i) {
            int i5 = operation.f18278a;
            View viewRequireView = operation.f18280c.requireView();
            AbstractC3340k.d(viewRequireView, "operation.fragment.requireView()");
            M6.g(i5, viewRequireView, this.f18512a);
            operation.f18286i = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0466 A[LOOP:19: B:157:0x0460->B:159:0x0466, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0122  */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.util.ArrayList r27, boolean r28) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1426o.b(java.util.ArrayList, boolean):void");
    }

    public final void c(ArrayList operations) {
        AbstractC3340k.e(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = operations.iterator();
        while (it.hasNext()) {
            ff.t.e0(((A0) it.next()).k, arrayList);
        }
        List listS0 = ff.o.S0(ff.o.X0(arrayList));
        int size = listS0.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((z0) listS0.get(i5)).c(this.f18512a);
        }
        int size2 = operations.size();
        for (int i10 = 0; i10 < size2; i10++) {
            a((A0) operations.get(i10));
        }
        List listS02 = ff.o.S0(operations);
        int size3 = listS02.size();
        for (int i11 = 0; i11 < size3; i11++) {
            A0 a02 = (A0) listS02.get(i11);
            if (a02.k.isEmpty()) {
                a02.b();
            }
        }
    }

    public final void d(int i5, int i10, l0 l0Var) {
        synchronized (this.f18513b) {
            try {
                F f10 = l0Var.f18480c;
                AbstractC3340k.d(f10, "fragmentStateManager.fragment");
                A0 a0G = g(f10);
                if (a0G == null) {
                    F f11 = l0Var.f18480c;
                    a0G = f11.mTransitioning ? h(f11) : null;
                }
                if (a0G != null) {
                    a0G.d(i5, i10);
                    return;
                }
                A0 a02 = new A0(i5, i10, l0Var);
                this.f18513b.add(a02);
                a02.f18281d.add(new y0(this, a02, 0));
                a02.f18281d.add(new y0(this, a02, 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1426o.e():void");
    }

    public final A0 g(F f10) {
        Object next;
        Iterator it = this.f18513b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            A0 a02 = (A0) next;
            if (AbstractC3340k.a(a02.f18280c, f10) && !a02.f18282e) {
                break;
            }
        }
        return (A0) next;
    }

    public final A0 h(F f10) {
        Object next;
        Iterator it = this.f18514c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            A0 a02 = (A0) next;
            if (AbstractC3340k.a(a02.f18280c, f10) && !a02.f18282e) {
                break;
            }
        }
        return (A0) next;
    }

    public final void i() {
        String str;
        String str2;
        if (e0.J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.f18512a.isAttachedToWindow();
        synchronized (this.f18513b) {
            try {
                m();
                l(this.f18513b);
                Iterator it = ff.o.U0(this.f18514c).iterator();
                while (it.hasNext()) {
                    A0 a02 = (A0) it.next();
                    if (e0.J(2)) {
                        if (zIsAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f18512a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + a02);
                    }
                    a02.a(this.f18512a);
                }
                Iterator it2 = ff.o.U0(this.f18513b).iterator();
                while (it2.hasNext()) {
                    A0 a03 = (A0) it2.next();
                    if (e0.J(2)) {
                        if (zIsAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f18512a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + a03);
                    }
                    a03.a(this.f18512a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        Object objPrevious;
        synchronized (this.f18513b) {
            try {
                m();
                ArrayList arrayList = this.f18513b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    A0 a02 = (A0) objPrevious;
                    View view = a02.f18280c.mView;
                    AbstractC3340k.d(view, "operation.fragment.mView");
                    char c10 = 4;
                    if (view.getAlpha() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || view.getVisibility() != 0) {
                        int visibility = view.getVisibility();
                        if (visibility == 0) {
                            c10 = 2;
                        } else if (visibility != 4) {
                            if (visibility != 8) {
                                throw new IllegalArgumentException("Unknown visibility " + visibility);
                            }
                            c10 = 3;
                        }
                    }
                    if (a02.f18278a == 2 && c10 != 2) {
                        break;
                    }
                }
                A0 a03 = (A0) objPrevious;
                F f10 = a03 != null ? a03.f18280c : null;
                this.f18516e = f10 != null ? f10.isPostponed() : false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            A0 a02 = (A0) arrayList.get(i5);
            if (!a02.f18285h) {
                a02.f18285h = true;
                int i10 = a02.f18279b;
                l0 l0Var = a02.f18288l;
                if (i10 == 2) {
                    F f10 = l0Var.f18480c;
                    AbstractC3340k.d(f10, "fragmentStateManager.fragment");
                    View viewFindFocus = f10.mView.findFocus();
                    if (viewFindFocus != null) {
                        f10.setFocusedView(viewFindFocus);
                        if (e0.J(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + f10);
                        }
                    }
                    View viewRequireView = a02.f18280c.requireView();
                    AbstractC3340k.d(viewRequireView, "this.fragment.requireView()");
                    if (viewRequireView.getParent() == null) {
                        l0Var.b();
                        viewRequireView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    if (viewRequireView.getAlpha() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && viewRequireView.getVisibility() == 0) {
                        viewRequireView.setVisibility(4);
                    }
                    viewRequireView.setAlpha(f10.getPostOnViewCreatedAlpha());
                } else if (i10 == 3) {
                    F f11 = l0Var.f18480c;
                    AbstractC3340k.d(f11, "fragmentStateManager.fragment");
                    View viewRequireView2 = f11.requireView();
                    AbstractC3340k.d(viewRequireView2, "fragment.requireView()");
                    if (e0.J(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewRequireView2.findFocus() + " on view " + viewRequireView2 + " for Fragment " + f11);
                    }
                    viewRequireView2.clearFocus();
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ff.t.e0(((A0) it.next()).k, arrayList2);
        }
        List listS0 = ff.o.S0(ff.o.X0(arrayList2));
        int size2 = listS0.size();
        for (int i11 = 0; i11 < size2; i11++) {
            z0 z0Var = (z0) listS0.get(i11);
            z0Var.getClass();
            ViewGroup container = this.f18512a;
            AbstractC3340k.e(container, "container");
            if (!z0Var.f18571a) {
                z0Var.e(container);
            }
            z0Var.f18571a = true;
        }
    }

    public final void m() {
        Iterator it = this.f18513b.iterator();
        while (it.hasNext()) {
            A0 a02 = (A0) it.next();
            int i5 = 2;
            if (a02.f18279b == 2) {
                View viewRequireView = a02.f18280c.requireView();
                AbstractC3340k.d(viewRequireView, "fragment.requireView()");
                int visibility = viewRequireView.getVisibility();
                if (visibility != 0) {
                    i5 = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            throw new IllegalArgumentException(AbstractC3256n.g(visibility, "Unknown visibility "));
                        }
                        i5 = 3;
                    }
                }
                a02.d(i5, 1);
            }
        }
    }
}
