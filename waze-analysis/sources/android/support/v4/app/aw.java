package android.support.v4.app;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import android.view.animation.Animation;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class aw {

    /* renamed from: a, reason: collision with root package name */
    public final Object f142a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f143b;

    aw(Animator animator) {
        this.f142a = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f143b = animatorSet;
        animatorSet.play(animator);
    }

    public final void a(ar arVar, Bundle bundle) {
        h.g.b.x.f(arVar, "f");
        ar arVarK = ((bv) this.f143b).k();
        if (arVarK != null) {
            bv parentFragmentManager = arVarK.getParentFragmentManager();
            h.g.b.x.e(parentFragmentManager, "getParentFragmentManager(...)");
            parentFragmentManager.bf().a(arVar, bundle);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f142a).iterator();
        h.g.b.x.e(it, "iterator(...)");
        while (it.hasNext()) {
            ((bd) it.next()).n();
        }
    }

    public final void b(ar arVar) {
        h.g.b.x.f(arVar, "f");
        bv bvVar = (bv) this.f143b;
        bvVar.p().i();
        ar arVarK = bvVar.k();
        if (arVarK != null) {
            bv parentFragmentManager = arVarK.getParentFragmentManager();
            h.g.b.x.e(parentFragmentManager, "getParentFragmentManager(...)");
            parentFragmentManager.bf().b(arVar);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f142a).iterator();
        h.g.b.x.e(it, "iterator(...)");
        while (it.hasNext()) {
            ((bd) it.next()).n();
        }
    }

    public final void c(ar arVar, Bundle bundle) {
        h.g.b.x.f(arVar, "f");
        ar arVarK = ((bv) this.f143b).k();
        if (arVarK != null) {
            bv parentFragmentManager = arVarK.getParentFragmentManager();
            h.g.b.x.e(parentFragmentManager, "getParentFragmentManager(...)");
            parentFragmentManager.bf().c(arVar, bundle);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f142a).iterator();
        h.g.b.x.e(it, "iterator(...)");
        while (it.hasNext()) {
            ((bd) it.next()).n();
        }
    }

    public final void d(ar arVar) {
        h.g.b.x.f(arVar, "f");
        ar arVarK = ((bv) this.f143b).k();
        if (arVarK != null) {
            bv parentFragmentManager = arVarK.getParentFragmentManager();
            h.g.b.x.e(parentFragmentManager, "getParentFragmentManager(...)");
            parentFragmentManager.bf().d(arVar);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f142a).iterator();
        h.g.b.x.e(it, "iterator(...)");
        while (it.hasNext()) {
            ((bd) it.next()).n();
        }
    }

    public final void e(ar arVar) {
        h.g.b.x.f(arVar, "f");
        ar arVarK = ((bv) this.f143b).k();
        if (arVarK != null) {
            bv parentFragmentManager = arVarK.getParentFragmentManager();
            h.g.b.x.e(parentFragmentManager, "getParentFragmentManager(...)");
            parentFragmentManager.bf().e(arVar);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f142a).iterator();
        h.g.b.x.e(it, "iterator(...)");
        while (it.hasNext()) {
            ((bd) it.next()).n();
        }
    }

    public final void f(ar arVar) {
        h.g.b.x.f(arVar, "f");
        ar arVarK = ((bv) this.f143b).k();
        if (arVarK != null) {
            bv parentFragmentManager = arVarK.getParentFragmentManager();
            h.g.b.x.e(parentFragmentManager, "getParentFragmentManager(...)");
            parentFragmentManager.bf().f(arVar);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f142a).iterator();
        h.g.b.x.e(it, "iterator(...)");
        while (it.hasNext()) {
            ((bd) it.next()).n().b(arVar);
        }
    }

    public final void g(ar arVar) {
        h.g.b.x.f(arVar, "f");
        bv bvVar = (bv) this.f143b;
        bvVar.p().i();
        ar arVarK = bvVar.k();
        if (arVarK != null) {
            bv parentFragmentManager = arVarK.getParentFragmentManager();
            h.g.b.x.e(parentFragmentManager, "getParentFragmentManager(...)");
            parentFragmentManager.bf().g(arVar);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f142a).iterator();
        h.g.b.x.e(it, "iterator(...)");
        while (it.hasNext()) {
            ((bd) it.next()).n();
        }
    }

    public final void h(ar arVar, Bundle bundle) {
        h.g.b.x.f(arVar, "f");
        ar arVarK = ((bv) this.f143b).k();
        if (arVarK != null) {
            bv parentFragmentManager = arVarK.getParentFragmentManager();
            h.g.b.x.e(parentFragmentManager, "getParentFragmentManager(...)");
            parentFragmentManager.bf().h(arVar, bundle);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f142a).iterator();
        h.g.b.x.e(it, "iterator(...)");
        while (it.hasNext()) {
            ((bd) it.next()).n();
        }
    }

    public final void i(ar arVar) {
        h.g.b.x.f(arVar, "f");
        ar arVarK = ((bv) this.f143b).k();
        if (arVarK != null) {
            bv parentFragmentManager = arVarK.getParentFragmentManager();
            h.g.b.x.e(parentFragmentManager, "getParentFragmentManager(...)");
            parentFragmentManager.bf().i(arVar);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f142a).iterator();
        h.g.b.x.e(it, "iterator(...)");
        while (it.hasNext()) {
            ((bd) it.next()).n().c(arVar);
        }
    }

    public final void j(ar arVar, Bundle bundle) {
        h.g.b.x.f(arVar, "f");
        h.g.b.x.f(bundle, "outState");
        ar arVarK = ((bv) this.f143b).k();
        if (arVarK != null) {
            bv parentFragmentManager = arVarK.getParentFragmentManager();
            h.g.b.x.e(parentFragmentManager, "getParentFragmentManager(...)");
            parentFragmentManager.bf().j(arVar, bundle);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f142a).iterator();
        h.g.b.x.e(it, "iterator(...)");
        while (it.hasNext()) {
            ((bd) it.next()).n();
        }
    }

    public final void k(ar arVar) {
        h.g.b.x.f(arVar, "f");
        ar arVarK = ((bv) this.f143b).k();
        if (arVarK != null) {
            bv parentFragmentManager = arVarK.getParentFragmentManager();
            h.g.b.x.e(parentFragmentManager, "getParentFragmentManager(...)");
            parentFragmentManager.bf().k(arVar);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f142a).iterator();
        h.g.b.x.e(it, "iterator(...)");
        while (it.hasNext()) {
            ((bd) it.next()).n();
        }
    }

    public final void l(ar arVar) {
        h.g.b.x.f(arVar, "f");
        ar arVarK = ((bv) this.f143b).k();
        if (arVarK != null) {
            bv parentFragmentManager = arVarK.getParentFragmentManager();
            h.g.b.x.e(parentFragmentManager, "getParentFragmentManager(...)");
            parentFragmentManager.bf().l(arVar);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f142a).iterator();
        h.g.b.x.e(it, "iterator(...)");
        while (it.hasNext()) {
            ((bd) it.next()).n();
        }
    }

    public final void m(ar arVar, View view, Bundle bundle) {
        h.g.b.x.f(arVar, "f");
        h.g.b.x.f(view, "v");
        ar arVarK = ((bv) this.f143b).k();
        if (arVarK != null) {
            bv parentFragmentManager = arVarK.getParentFragmentManager();
            h.g.b.x.e(parentFragmentManager, "getParentFragmentManager(...)");
            parentFragmentManager.bf().m(arVar, view, bundle);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f142a).iterator();
        h.g.b.x.e(it, "iterator(...)");
        while (it.hasNext()) {
            ((bd) it.next()).n();
        }
    }

    public final void n(ar arVar) {
        h.g.b.x.f(arVar, "f");
        ar arVarK = ((bv) this.f143b).k();
        if (arVarK != null) {
            bv parentFragmentManager = arVarK.getParentFragmentManager();
            h.g.b.x.e(parentFragmentManager, "getParentFragmentManager(...)");
            parentFragmentManager.bf().n(arVar);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f142a).iterator();
        h.g.b.x.e(it, "iterator(...)");
        while (it.hasNext()) {
            ((bd) it.next()).n();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        ((java.util.concurrent.CopyOnWriteArrayList) r3).remove(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(android.support.a.i r4) {
        /*
            r3 = this;
            java.lang.String r0 = "cb"
            h.g.b.x.f(r4, r0)
            java.lang.Object r3 = r3.f142a
            monitor-enter(r3)
            r0 = r3
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0     // Catch: java.lang.Throwable -> L2d
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L2d
            r1 = 0
        L10:
            if (r1 >= r0) goto L2b
            r2 = r3
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L2d
            android.support.v4.app.bd r2 = (android.support.v4.app.bd) r2     // Catch: java.lang.Throwable -> L2d
            android.support.a.i r2 = r2.n()     // Catch: java.lang.Throwable -> L2d
            if (r2 != r4) goto L28
            r4 = r3
            java.util.concurrent.CopyOnWriteArrayList r4 = (java.util.concurrent.CopyOnWriteArrayList) r4     // Catch: java.lang.Throwable -> L2d
            r4.remove(r1)     // Catch: java.lang.Throwable -> L2d
            goto L2b
        L28:
            int r1 = r1 + 1
            goto L10
        L2b:
            monitor-exit(r3)
            return
        L2d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.aw.o(android.support.a.i):void");
    }

    public final void p(android.support.a.i iVar) {
        h.g.b.x.f(iVar, "cb");
        ((CopyOnWriteArrayList) this.f142a).add(new bd(iVar));
    }

    public final int q(Context context, com.google.android.gms.common.api.h hVar) {
        int iM;
        com.google.android.gms.common.api.internal.av.m(context);
        com.google.android.gms.common.api.internal.av.m(hVar);
        hVar.t();
        int iA = hVar.a();
        int iS = s(iA);
        if (iS != -1) {
            return iS;
        }
        Object obj = this.f142a;
        synchronized (obj) {
            iM = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= ((SparseIntArray) obj).size()) {
                    iM = -1;
                    break;
                }
                int iKeyAt = ((SparseIntArray) obj).keyAt(i2);
                if (iKeyAt > iA && ((SparseIntArray) obj).get(iKeyAt) == 0) {
                    break;
                }
                i2++;
            }
            if (iM == -1) {
                iM = ((com.google.android.gms.common.i) this.f143b).m(context, iA);
            }
            ((SparseIntArray) obj).put(iA, iM);
        }
        return iM;
    }

    public final void r() {
        Object obj = this.f142a;
        synchronized (obj) {
            ((SparseIntArray) obj).clear();
        }
    }

    public final int s(int i2) {
        int i3;
        Object obj = this.f142a;
        synchronized (obj) {
            i3 = ((SparseIntArray) obj).get(i2, -1);
        }
        return i3;
    }

    aw(Animation animation) {
        this.f142a = animation;
        this.f143b = null;
    }

    public aw(bv bvVar) {
        h.g.b.x.f(bvVar, "fragmentManager");
        this.f143b = bvVar;
        this.f142a = new CopyOnWriteArrayList();
    }

    public aw(com.google.android.gms.common.i iVar) {
        this.f142a = new SparseIntArray();
        com.google.android.gms.common.api.internal.av.m(iVar);
        this.f143b = iVar;
    }
}
