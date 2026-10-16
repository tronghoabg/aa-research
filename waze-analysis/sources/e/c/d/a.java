package e.c.d;

import e.a.e.f;
import e.a.f.a.e;
import e.c.b.b;
import e.c.k;
import h.a.a.i;
import h.a.a.o;
import h.a.ae;
import h.a.c;
import h.a.r;
import h.g.b.x;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import l.a.atn;
import l.a.aug;
import l.a.auh;
import l.a.ava;
import l.a.awy;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    static volatile b f47904a;

    /* renamed from: b, reason: collision with root package name */
    static volatile b f47905b;

    /* renamed from: c, reason: collision with root package name */
    static volatile b f47906c;

    /* renamed from: d, reason: collision with root package name */
    static volatile b f47907d;

    /* renamed from: e, reason: collision with root package name */
    static volatile b f47908e;

    /* renamed from: f, reason: collision with root package name */
    static volatile b f47909f;

    /* renamed from: g, reason: collision with root package name */
    static volatile b f47910g;

    /* renamed from: h, reason: collision with root package name */
    static volatile b f47911h;

    /* renamed from: i, reason: collision with root package name */
    static volatile b f47912i;

    /* renamed from: j, reason: collision with root package name */
    static volatile b f47913j;

    public static final /* synthetic */ e A(atn atnVar) {
        x.f(atnVar, "builder");
        return new e(atnVar);
    }

    static k a(Callable callable) {
        try {
            k kVar = (k) callable.call();
            f.c(kVar, "Scheduler Callable result can't be null");
            return kVar;
        } catch (Throwable th) {
            int i2 = e.c.c.c.b.f47901a;
            if (th instanceof Error) {
                throw ((Error) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw new RuntimeException(th);
        }
    }

    public static void b(Callable callable) {
        a(callable);
    }

    public static void c(Callable callable) {
        a(callable);
    }

    public static void d(Callable callable) {
        a(callable);
    }

    public static void e() {
    }

    public static void f() {
    }

    public static void g() {
    }

    public static void h() {
    }

    public static void i() {
    }

    public static void j() {
    }

    public static void k(Callable callable) {
        a(callable);
    }

    public static final Set l(Set set) {
        x.f(set, "builder");
        return ((o) set).a();
    }

    public static final Set m() {
        return new o(new i());
    }

    public static final Set n(int i2) {
        return new o(new i(i2));
    }

    public static final Set o(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        x.e(setSingleton, "singleton(...)");
        return setSingleton;
    }

    public static Set p() {
        return ae.f47969a;
    }

    public static Set q(Object... objArr) {
        x.f(objArr, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(r.a(1));
        c.aJ(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static Set r(Object... objArr) {
        x.f(objArr, "elements");
        return c.ad(objArr);
    }

    public static Set s(Object... objArr) {
        x.f(objArr, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c.aB(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static Set t(Set set, Iterable iterable) {
        x.f(set, "<this>");
        x.f(iterable, "elements");
        Collection<?> collectionY = h.a.i.y(iterable);
        if (collectionY.isEmpty()) {
            return h.a.i.au(set);
        }
        if (!(collectionY instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionY);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) collectionY).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static Set u(Set set, Object obj) {
        x.f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(r.a(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && x.n(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set v(Set set, Iterable iterable) {
        int size;
        x.f(set, "<this>");
        x.f(iterable, "elements");
        x.f(iterable, "<this>");
        Integer numValueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        if (numValueOf != null) {
            size = set.size() + numValueOf.intValue();
        } else {
            int size2 = set.size();
            size = size2 + size2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(r.a(size));
        linkedHashSet.addAll(set);
        h.a.i.aD(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static Set w(Set set, Object obj) {
        x.f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(r.a(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static final void x(auh auhVar, aug augVar) {
        x.f(auhVar, "value");
        augVar.a(auhVar);
    }

    public static final /* synthetic */ e y(awy awyVar) {
        x.f(awyVar, "builder");
        return new e(awyVar);
    }

    public static final /* synthetic */ e z(ava avaVar) {
        x.f(avaVar, "builder");
        return new e(avaVar);
    }
}
