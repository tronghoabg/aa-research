package android.support.v4.app;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.BackEventCompat;
import androidx.collection.ArrayMap;
import androidx.core.os.CancellationSignal;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class v extends cv {

    /* renamed from: a, reason: collision with root package name */
    private final List f373a;

    /* renamed from: b, reason: collision with root package name */
    private final cz f374b;

    /* renamed from: c, reason: collision with root package name */
    private final cz f375c;

    /* renamed from: d, reason: collision with root package name */
    private final cq f376d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f377e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList f378f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList f379g;

    /* renamed from: h, reason: collision with root package name */
    private final ArrayMap f380h;

    /* renamed from: i, reason: collision with root package name */
    private final ArrayList f381i;

    /* renamed from: j, reason: collision with root package name */
    private final ArrayList f382j;

    /* renamed from: k, reason: collision with root package name */
    private final ArrayMap f383k;

    /* renamed from: l, reason: collision with root package name */
    private final ArrayMap f384l;
    private final boolean m;
    private final CancellationSignal n;
    private Object o;
    private boolean p;

    public v(List list, cz czVar, cz czVar2, cq cqVar, Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayMap arrayMap, ArrayList arrayList3, ArrayList arrayList4, ArrayMap arrayMap2, ArrayMap arrayMap3, boolean z) {
        h.g.b.x.f(list, "transitionInfos");
        h.g.b.x.f(cqVar, "transitionImpl");
        h.g.b.x.f(arrayList, "sharedElementFirstOutViews");
        h.g.b.x.f(arrayList2, "sharedElementLastInViews");
        h.g.b.x.f(arrayMap, "sharedElementNameMapping");
        h.g.b.x.f(arrayList3, "enteringNames");
        h.g.b.x.f(arrayList4, "exitingNames");
        h.g.b.x.f(arrayMap2, "firstOutViews");
        h.g.b.x.f(arrayMap3, "lastInViews");
        this.f373a = list;
        this.f374b = czVar;
        this.f375c = czVar2;
        this.f376d = cqVar;
        this.f377e = obj;
        this.f378f = arrayList;
        this.f379g = arrayList2;
        this.f380h = arrayMap;
        this.f381i = arrayList3;
        this.f382j = arrayList4;
        this.f383k = arrayMap2;
        this.f384l = arrayMap3;
        this.m = z;
        this.n = new CancellationSignal();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ h.ab a(final android.support.v4.app.v r5, java.lang.Object r6, final android.view.ViewGroup r7) {
        /*
            java.util.List r0 = r5.f373a
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r2 = r1 instanceof java.util.Collection
            java.lang.String r3 = "FragmentManager"
            r4 = 2
            if (r2 == 0) goto L16
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L16
            goto L5d
        L16:
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5d
            java.lang.Object r2 = r1.next()
            android.support.v4.app.w r2 = (android.support.v4.app.w) r2
            android.support.v4.app.cz r2 = r2.b()
            boolean r2 = r2.p()
            if (r2 != 0) goto L1a
            boolean r7 = android.support.v4.app.bv.aM(r4)
            if (r7 == 0) goto L3b
            java.lang.String r7 = "Completing animating immediately"
            android.util.Log.v(r3, r7)
        L3b:
            androidx.core.os.CancellationSignal r7 = new androidx.core.os.CancellationSignal
            r7.<init>()
            android.support.v4.app.cq r1 = r5.f376d
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            android.support.v4.app.w r0 = (android.support.v4.app.w) r0
            android.support.v4.app.cz r0 = r0.b()
            android.support.v4.app.ar r0 = r0.c()
            android.support.v4.app.m r2 = new android.support.v4.app.m
            r2.<init>()
            r1.setListenerForTransitionEnd(r0, r6, r7, r2)
            r7.cancel()
            goto L77
        L5d:
            boolean r6 = android.support.v4.app.bv.aM(r4)
            if (r6 == 0) goto L68
            java.lang.String r6 = "Animating to start"
            android.util.Log.v(r3, r6)
        L68:
            android.support.v4.app.cq r6 = r5.f376d
            java.lang.Object r0 = r5.o
            h.g.b.x.c(r0)
            android.support.v4.app.u r1 = new android.support.v4.app.u
            r1.<init>()
            r6.animateToStart(r0, r1)
        L77:
            h.ab r5 = h.ab.f48028a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.v.a(android.support.v4.app.v, java.lang.Object, android.view.ViewGroup):h.ab");
    }

    static final h.ab g(v vVar, ViewGroup viewGroup, Object obj) {
        vVar.f376d.beginDelayedTransition(viewGroup, obj);
        return h.ab.f48028a;
    }

    static final h.ab h(final v vVar, final ViewGroup viewGroup, final Object obj, h.g.b.aq aqVar) {
        if (bv.aM(2)) {
            Log.v("FragmentManager", "Attempting to create TransitionSeekController");
        }
        Object objControlDelayedTransition = vVar.f376d.controlDelayedTransition(viewGroup, obj);
        vVar.o = objControlDelayedTransition;
        if (objControlDelayedTransition == null) {
            if (bv.aM(2)) {
                Log.v("FragmentManager", "TransitionSeekController was not created.");
            }
            vVar.p = true;
            return h.ab.f48028a;
        }
        aqVar.f48105a = new h.g.a.a() { // from class: android.support.v4.app.o
            @Override // h.g.a.a
            public final Object invoke() {
                return v.a(this.f355a, obj, viewGroup);
            }
        };
        if (bv.aM(2)) {
            Log.v("FragmentManager", "Started executing operations from " + vVar.f374b + " to " + vVar.f375c);
        }
        return h.ab.f48028a;
    }

    public static /* synthetic */ void i(v vVar) {
        if (bv.aM(2)) {
            Log.v("FragmentManager", "Transition for all operations has completed");
        }
        Iterator it = vVar.f373a.iterator();
        while (it.hasNext()) {
            ((w) it.next()).b().j(vVar);
        }
    }

    public static /* synthetic */ void j(v vVar, ViewGroup viewGroup) {
        Iterator it = vVar.f373a.iterator();
        while (it.hasNext()) {
            cz czVarB = ((w) it.next()).b();
            View view = czVarB.c().getView();
            if (view != null) {
                czVarB.e().a(view, viewGroup);
            }
        }
    }

    static final void k(cz czVar, cz czVar2, v vVar) {
        ci.b(czVar.c(), czVar2.c(), vVar.m, vVar.f384l, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0245  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final h.k o(android.view.ViewGroup r31, android.support.v4.app.cz r32, android.support.v4.app.cz r33) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.v.o(android.view.ViewGroup, android.support.v4.app.cz, android.support.v4.app.cz):h.k");
    }

    private final void p(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (ViewGroupCompat.isTransitionGroup(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                h.g.b.x.c(childAt);
                p(arrayList, childAt);
            }
        }
    }

    private final void q(ArrayList arrayList, ViewGroup viewGroup, h.g.a.a aVar) {
        ArrayList arrayList2 = arrayList;
        ci.c(arrayList2, 4);
        cq cqVar = this.f376d;
        ArrayList<View> arrayList3 = this.f379g;
        ArrayList<String> arrayListPrepareSetNameOverridesReordered = cqVar.prepareSetNameOverridesReordered(arrayList3);
        if (bv.aM(2)) {
            Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
            Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
            Iterator it = this.f378f.iterator();
            h.g.b.x.e(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                h.g.b.x.e(next, "next(...)");
                View view = (View) next;
                Log.v("FragmentManager", "View: " + view + " Name: " + ViewCompat.getTransitionName(view));
            }
            Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
            Iterator<View> it2 = arrayList3.iterator();
            h.g.b.x.e(it2, "iterator(...)");
            while (it2.hasNext()) {
                View next2 = it2.next();
                h.g.b.x.e(next2, "next(...)");
                View view2 = next2;
                Log.v("FragmentManager", "View: " + view2 + " Name: " + ViewCompat.getTransitionName(view2));
            }
        }
        aVar.invoke();
        ArrayList<View> arrayList4 = this.f378f;
        cqVar.setNameOverridesReordered(viewGroup, arrayList4, arrayList3, arrayListPrepareSetNameOverridesReordered, this.f380h);
        ci.c(arrayList2, 0);
        cqVar.swapSharedElementTargets(this.f377e, arrayList4, arrayList3);
    }

    @Override // android.support.v4.app.cv
    public final void b(ViewGroup viewGroup) {
        h.g.b.x.f(viewGroup, TtmlNode.RUBY_CONTAINER);
        this.n.cancel();
    }

    @Override // android.support.v4.app.cv
    public final void c(final ViewGroup viewGroup) {
        h.g.b.x.f(viewGroup, TtmlNode.RUBY_CONTAINER);
        if (!viewGroup.isLaidOut() || this.p) {
            for (w wVar : this.f373a) {
                cz czVarB = wVar.b();
                if (bv.aM(2)) {
                    if (this.p) {
                        Objects.toString(czVarB);
                        Log.v("FragmentManager", "SpecialEffectsController: TransitionSeekController was not created. Completing operation ".concat(String.valueOf(czVarB)));
                    } else {
                        Log.v("FragmentManager", k.f(czVarB, viewGroup, "SpecialEffectsController: Container ", " has not been laid out. Completing operation "));
                    }
                }
                wVar.b().j(this);
            }
            this.p = false;
            return;
        }
        Object obj = this.o;
        if (obj != null) {
            this.f376d.animateToEnd(obj);
            if (bv.aM(2)) {
                Log.v("FragmentManager", "Ending execution of operations from " + this.f374b + " to " + this.f375c);
                return;
            }
            return;
        }
        cz czVar = this.f375c;
        cz czVar2 = this.f374b;
        h.k kVarO = o(viewGroup, czVar, czVar2);
        ArrayList arrayList = (ArrayList) kVarO.a();
        final Object objB = kVarO.b();
        List list = this.f373a;
        ArrayList<cz> arrayList2 = new ArrayList(h.a.i.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((w) it.next()).b());
        }
        for (final cz czVar3 : arrayList2) {
            this.f376d.setListenerForTransitionEnd(czVar3.c(), objB, this.n, new Runnable() { // from class: android.support.v4.app.p
                @Override // java.lang.Runnable
                public final void run() {
                    k.d(czVar3, this);
                }
            });
        }
        q(arrayList, viewGroup, new h.g.a.a() { // from class: android.support.v4.app.q
            @Override // h.g.a.a
            public final Object invoke() {
                return v.g(this.f360a, viewGroup, objB);
            }
        });
        if (bv.aM(2)) {
            Log.v("FragmentManager", k.f(czVar, czVar2, "Completed executing operations from ", " to "));
        }
    }

    @Override // android.support.v4.app.cv
    public final void d(BackEventCompat backEventCompat, ViewGroup viewGroup) {
        h.g.b.x.f(backEventCompat, "backEvent");
        h.g.b.x.f(viewGroup, TtmlNode.RUBY_CONTAINER);
        Object obj = this.o;
        if (obj != null) {
            this.f376d.setCurrentPlayTime(obj, backEventCompat.getProgress());
        }
    }

    @Override // android.support.v4.app.cv
    public final void e(final ViewGroup viewGroup) {
        Object obj;
        h.g.b.x.f(viewGroup, TtmlNode.RUBY_CONTAINER);
        if (!viewGroup.isLaidOut()) {
            Iterator it = this.f373a.iterator();
            while (it.hasNext()) {
                cz czVarB = ((w) it.next()).b();
                if (bv.aM(2)) {
                    Log.v("FragmentManager", k.f(czVarB, viewGroup, "SpecialEffectsController: Container ", " has not been laid out. Skipping onStart for operation "));
                }
            }
            return;
        }
        if (l() && (obj = this.f377e) != null && !f()) {
            Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + this.f374b + " and " + this.f375c + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
        }
        if (f() && l()) {
            final h.g.b.aq aqVar = new h.g.b.aq();
            h.k kVarO = o(viewGroup, this.f375c, this.f374b);
            ArrayList arrayList = (ArrayList) kVarO.a();
            final Object objB = kVarO.b();
            List list = this.f373a;
            ArrayList<cz> arrayList2 = new ArrayList(h.a.i.q(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((w) it2.next()).b());
            }
            for (final cz czVar : arrayList2) {
                this.f376d.setListenerForTransitionEnd(czVar.c(), objB, this.n, new r(aqVar, 0), new Runnable() { // from class: android.support.v4.app.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.d(czVar, this);
                    }
                });
            }
            q(arrayList, viewGroup, new h.g.a.a() { // from class: android.support.v4.app.t
                @Override // h.g.a.a
                public final Object invoke() {
                    return v.h(this.f367a, viewGroup, objB, aqVar);
                }
            });
        }
    }

    @Override // android.support.v4.app.cv
    public final boolean f() {
        cq cqVar = this.f376d;
        if (!cqVar.isSeekingSupported()) {
            return false;
        }
        List<w> list = this.f373a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (w wVar : list) {
                if (Build.VERSION.SDK_INT < 34 || wVar.i() == null || !cqVar.isSeekingSupported(wVar.i())) {
                    return false;
                }
            }
        }
        Object obj = this.f377e;
        return obj == null || cqVar.isSeekingSupported(obj);
    }

    public final boolean l() {
        List list = this.f373a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((w) it.next()).b().c().mTransitioning) {
                return false;
            }
        }
        return true;
    }
}
