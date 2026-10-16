package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3340k;
import t3.AbstractC4096p;
import x.C4412e;

/* renamed from: androidx.fragment.app.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1424m extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f18483c;

    /* renamed from: d, reason: collision with root package name */
    public final A0 f18484d;

    /* renamed from: e, reason: collision with root package name */
    public final A0 f18485e;

    /* renamed from: f, reason: collision with root package name */
    public final v0 f18486f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f18487g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f18488h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f18489i;

    /* renamed from: j, reason: collision with root package name */
    public final C4412e f18490j;
    public final ArrayList k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f18491l;

    /* renamed from: m, reason: collision with root package name */
    public final C4412e f18492m;

    /* renamed from: n, reason: collision with root package name */
    public final C4412e f18493n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f18494o;

    /* renamed from: p, reason: collision with root package name */
    public final R4.a f18495p = new R4.a();

    public C1424m(ArrayList arrayList, A0 a02, A0 a03, v0 v0Var, Object obj, ArrayList arrayList2, ArrayList arrayList3, C4412e c4412e, ArrayList arrayList4, ArrayList arrayList5, C4412e c4412e2, C4412e c4412e3, boolean z2) {
        this.f18483c = arrayList;
        this.f18484d = a02;
        this.f18485e = a03;
        this.f18486f = v0Var;
        this.f18487g = obj;
        this.f18488h = arrayList2;
        this.f18489i = arrayList3;
        this.f18490j = c4412e;
        this.k = arrayList4;
        this.f18491l = arrayList5;
        this.f18492m = c4412e2;
        this.f18493n = c4412e3;
        this.f18494o = z2;
    }

    public static void f(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i5 = k1.U.f38786a;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                f(childAt, arrayList);
            }
        }
    }

    @Override // androidx.fragment.app.z0
    public final boolean a() {
        this.f18486f.i();
        return false;
    }

    @Override // androidx.fragment.app.z0
    public final void b(ViewGroup container) {
        AbstractC3340k.e(container, "container");
        R4.a aVar = this.f18495p;
        synchronized (aVar) {
            try {
                if (aVar.f10231a) {
                    return;
                }
                aVar.f10231a = true;
                aVar.f10232b = true;
                a2.v vVar = (a2.v) aVar.f10233c;
                if (vVar != null) {
                    try {
                        ((AbstractC4096p) vVar.f17322b).cancel();
                    } catch (Throwable th) {
                        synchronized (aVar) {
                            aVar.f10232b = false;
                            aVar.notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (aVar) {
                    aVar.f10232b = false;
                    aVar.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0289 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022d  */
    /* JADX WARN: Type inference failed for: r14v4, types: [x.v] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    @Override // androidx.fragment.app.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.view.ViewGroup r35) {
        /*
            Method dump skipped, instructions count: 1147
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1424m.c(android.view.ViewGroup):void");
    }

    @Override // androidx.fragment.app.z0
    public final void d(androidx.activity.b backEvent, ViewGroup container) {
        AbstractC3340k.e(backEvent, "backEvent");
        AbstractC3340k.e(container, "container");
    }

    @Override // androidx.fragment.app.z0
    public final void e(ViewGroup container) {
        boolean z2;
        Object obj;
        AbstractC3340k.e(container, "container");
        boolean zIsLaidOut = container.isLaidOut();
        ArrayList arrayList = this.f18483c;
        if (!zIsLaidOut) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                A0 a02 = ((C1425n) it.next()).f18473a;
                if (e0.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Skipping onStart for operation " + a02);
                }
            }
            return;
        }
        ArrayList arrayList2 = this.f18483c;
        if (arrayList2.isEmpty()) {
            z2 = true;
        } else {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (!((C1425n) it2.next()).f18473a.f18280c.mTransitioning) {
                    z2 = false;
                    break;
                }
            }
            z2 = true;
        }
        if (z2 && (obj = this.f18487g) != null) {
            a();
            Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + this.f18484d + " and " + this.f18485e + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
        }
        a();
    }
}
