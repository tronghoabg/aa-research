package k2;

import N1.C0773w;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: k2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3144a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f39016a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f39017b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final Z1.d f39018c;

    /* renamed from: d, reason: collision with root package name */
    public final Z1.d f39019d;

    /* renamed from: e, reason: collision with root package name */
    public Looper f39020e;

    /* renamed from: f, reason: collision with root package name */
    public N1.N f39021f;

    /* renamed from: g, reason: collision with root package name */
    public V1.k f39022g;

    public AbstractC3144a() {
        int i5 = 0;
        H h10 = null;
        this.f39018c = new Z1.d(new CopyOnWriteArrayList(), i5, h10);
        this.f39019d = new Z1.d(new CopyOnWriteArrayList(), i5, h10);
    }

    public final Z1.d a(H h10) {
        return new Z1.d(this.f39018c.f16928c, 0, h10);
    }

    public abstract F b(H h10, o2.e eVar, long j8);

    public final void c(I i5) {
        HashSet hashSet = this.f39017b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(i5);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        d();
    }

    public final void e(I i5) {
        this.f39020e.getClass();
        HashSet hashSet = this.f39017b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(i5);
        if (zIsEmpty) {
            f();
        }
    }

    public N1.N g() {
        return null;
    }

    public abstract C0773w h();

    public boolean i() {
        return true;
    }

    public abstract void j();

    public final void k(I i5, S1.A a5, V1.k kVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f39020e;
        Q1.k.c(looper == null || looper == looperMyLooper);
        this.f39022g = kVar;
        N1.N n10 = this.f39021f;
        this.f39016a.add(i5);
        if (this.f39020e == null) {
            this.f39020e = looperMyLooper;
            this.f39017b.add(i5);
            l(a5);
        } else if (n10 != null) {
            e(i5);
            i5.a(this, n10);
        }
    }

    public abstract void l(S1.A a5);

    public final void m(N1.N n10) {
        this.f39021f = n10;
        Iterator it = this.f39016a.iterator();
        while (it.hasNext()) {
            ((I) it.next()).a(this, n10);
        }
    }

    public abstract void n(F f10);

    public final void o(I i5) {
        ArrayList arrayList = this.f39016a;
        arrayList.remove(i5);
        if (!arrayList.isEmpty()) {
            c(i5);
            return;
        }
        this.f39020e = null;
        this.f39021f = null;
        this.f39022g = null;
        this.f39017b.clear();
        p();
    }

    public abstract void p();

    public final void q(Z1.e eVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f39019d.f16928c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            Z1.c cVar = (Z1.c) it.next();
            if (cVar.f16925a == eVar) {
                copyOnWriteArrayList.remove(cVar);
            }
        }
    }

    public final void r(M m10) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f39018c.f16928c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            L l10 = (L) it.next();
            if (l10.f38918b == m10) {
                copyOnWriteArrayList.remove(l10);
            }
        }
    }

    public void s(C0773w c0773w) {
    }

    public void d() {
    }

    public void f() {
    }
}
