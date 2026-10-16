package android.support.v4.app;

import android.util.Log;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class cz {

    /* renamed from: a, reason: collision with root package name */
    private cy f308a;

    /* renamed from: b, reason: collision with root package name */
    private cx f309b;

    /* renamed from: c, reason: collision with root package name */
    private final ar f310c;

    /* renamed from: d, reason: collision with root package name */
    private final List f311d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f312e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f313f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f314g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f315h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f316i;

    /* renamed from: j, reason: collision with root package name */
    private final List f317j;

    /* renamed from: k, reason: collision with root package name */
    private final List f318k;

    public cz(cy cyVar, cx cxVar, ar arVar) {
        h.g.b.x.f(cyVar, "finalState");
        h.g.b.x.f(cxVar, "lifecycleImpact");
        h.g.b.x.f(arVar, "fragment");
        this.f308a = cyVar;
        this.f309b = cxVar;
        this.f310c = arVar;
        this.f311d = new ArrayList();
        this.f316i = true;
        ArrayList arrayList = new ArrayList();
        this.f317j = arrayList;
        this.f318k = arrayList;
    }

    public void a() {
        this.f315h = false;
        if (this.f313f) {
            return;
        }
        if (bv.aM(2)) {
            Log.v("FragmentManager", k.e(this, "SpecialEffectsController: ", " has called complete."));
        }
        this.f313f = true;
        Iterator it = this.f311d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public void b() {
        this.f315h = true;
    }

    public final ar c() {
        return this.f310c;
    }

    public final cx d() {
        return this.f309b;
    }

    public final cy e() {
        return this.f308a;
    }

    public final List f() {
        return this.f318k;
    }

    public final void g(Runnable runnable) {
        h.g.b.x.f(runnable, "listener");
        this.f311d.add(runnable);
    }

    public final void h(cv cvVar) {
        h.g.b.x.f(cvVar, "effect");
        this.f317j.add(cvVar);
    }

    public final void i(ViewGroup viewGroup) {
        h.g.b.x.f(viewGroup, TtmlNode.RUBY_CONTAINER);
        this.f315h = false;
        if (this.f312e) {
            return;
        }
        this.f312e = true;
        if (this.f317j.isEmpty()) {
            a();
            return;
        }
        Iterator it = h.a.i.ao(this.f318k).iterator();
        while (it.hasNext()) {
            ((cv) it.next()).m(viewGroup);
        }
    }

    public final void j(cv cvVar) {
        h.g.b.x.f(cvVar, "effect");
        List list = this.f317j;
        if (list.remove(cvVar) && list.isEmpty()) {
            a();
        }
    }

    public final void k(cy cyVar, cx cxVar) {
        h.g.b.x.f(cyVar, "finalState");
        h.g.b.x.f(cxVar, "lifecycleImpact");
        cx cxVar2 = cx.f299a;
        int iOrdinal = cxVar.ordinal();
        if (iOrdinal == 0) {
            if (this.f308a != cy.f303a) {
                if (bv.aM(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f310c + " mFinalState = " + this.f308a + " -> " + cyVar + ".");
                }
                this.f308a = cyVar;
                return;
            }
            return;
        }
        if (iOrdinal == 1) {
            if (this.f308a == cy.f303a) {
                if (bv.aM(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f310c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f309b + " to ADDING.");
                }
                this.f308a = cy.f304b;
                this.f309b = cx.f300b;
                this.f316i = true;
                return;
            }
            return;
        }
        if (iOrdinal != 2) {
            throw new h.i();
        }
        if (bv.aM(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f310c + " mFinalState = " + this.f308a + " -> REMOVED. mLifecycleImpact  = " + this.f309b + " to REMOVING.");
        }
        this.f308a = cy.f303a;
        this.f309b = cx.f301c;
        this.f316i = true;
    }

    public final void l(boolean z) {
        this.f314g = z;
    }

    public final boolean m() {
        return this.f316i;
    }

    public final boolean n() {
        return this.f312e;
    }

    public final boolean o() {
        return this.f313f;
    }

    public final boolean p() {
        return this.f314g;
    }

    public final boolean q() {
        return this.f315h;
    }

    public final void r() {
        this.f316i = false;
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.f308a + " lifecycleImpact = " + this.f309b + " fragment = " + this.f310c + "}";
    }
}
