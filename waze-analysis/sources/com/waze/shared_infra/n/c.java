package com.waze.shared_infra.n;

import com.waze.places.o;
import com.waze.shared_infra.i.h;
import com.waze.shared_infra.s.e;
import com.waze.shared_infra.s.f;
import e.a.dw;
import h.ab;
import h.g.b.w;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.a.t;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Object f37913a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f37914b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f37915c;

    public c(af afVar, Object obj) {
        x.f(afVar, "scope");
        e eVar = new e(obj);
        this.f37913a = eVar;
        this.f37914b = w.c(-2, null, null, 6);
        this.f37915c = eVar;
        aj.z(afVar, null, null, new a(this, null), 3);
    }

    public static final /* synthetic */ e a(c cVar) {
        return (e) cVar.f37913a;
    }

    public static final /* synthetic */ Object c(c cVar, h.c.e eVar) {
        Object objCollect = ai.v((kotlinx.coroutines.a.af) cVar.f37914b).collect(new b(cVar), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public static /* synthetic */ void r(c cVar, boolean z, String str, org.a.d.e.b bVar) throws org.a.d.d.b {
        x.f(str, "mapping");
        x.f(bVar, "factory");
        ?? r2 = cVar.f37913a;
        if (r2.containsKey(str)) {
            if (!z) {
                x.f(bVar, "factory");
                x.f(str, "mapping");
                throw new org.a.d.d.b("Already existing definition for " + bVar.b() + " at " + str);
            }
            ((org.a.d.a) cVar.f37915c).n().f("(+) override index '" + str + "' -> '" + bVar.b() + "'");
        }
        ((org.a.d.a) cVar.f37915c).n().c("(+) index '" + str + "' -> '" + bVar.b() + "'");
        r2.put(str, bVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.waze.shared_infra.s.f, java.lang.Object] */
    public final f b() {
        return this.f37915c;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlinx.coroutines.a.o] */
    public final void d(d dVar) {
        x.f(dVar, "updater");
        Throwable thD = t.d(this.f37914b.i(dVar));
        if (thD != null) {
            h.l("ChannelStateContainer", "failed to update state", thD);
        }
    }

    public final /* synthetic */ ch e() {
        return (ch) this.f37914b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.waze.shared_infra.i.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void f() {
        this.f37913a.a("user called cancel()");
        Iterator it = this.f37915c.iterator();
        while (it.hasNext()) {
            ((h.g.a.a) it.next()).invoke();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    public final void g(com.waze.map.b.d dVar) {
        x.f(dVar, "newState");
        this.f37914b.e(dVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    public final void h(h.g.a.a aVar) {
        x.f(aVar, "onCancel");
        if (this.f37914b.d() == com.waze.map.b.d.f28179e) {
            aVar.invoke();
        } else {
            ((Collection) this.f37915c).add(aVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final int i() {
        return this.f37913a.size();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final Map j() {
        return this.f37913a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final org.a.d.e.b k(h.l.c cVar, org.a.d.i.a aVar, org.a.d.i.a aVar2) {
        x.f(cVar, "clazz");
        x.f(aVar2, "scopeQualifier");
        return (org.a.d.e.b) this.f37913a.get(org.a.b.c.a.b(cVar, aVar, aVar2));
    }

    public final void l() {
        HashMap map = (HashMap) this.f37914b;
        Collection collectionValues = map.values();
        x.e(collectionValues, "<get-values>(...)");
        if (!collectionValues.isEmpty()) {
            org.a.d.a aVar = (org.a.d.a) this.f37915c;
            c cVar = new c(aVar.n(), aVar.a().c(), null);
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                ((org.a.d.e.e) it.next()).a(cVar);
            }
        }
        map.clear();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final void m(org.a.d.k.b bVar) {
        x.f(bVar, "scope");
        Collection collectionValues = this.f37913a.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (obj instanceof org.a.d.e.c) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((org.a.d.e.c) it.next()).d(bVar);
        }
    }

    public final void n(Set set, boolean z) {
        x.f(set, "modules");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            org.a.d.g.a aVar = (org.a.d.g.a) it.next();
            for (Map.Entry entry : aVar.a().entrySet()) {
                r(this, z, (String) entry.getKey(), (org.a.d.e.b) entry.getValue());
            }
            for (org.a.d.e.e eVar : aVar.b()) {
                ((Map) this.f37914b).put(Integer.valueOf(eVar.hashCode()), eVar);
            }
        }
    }

    public final org.a.d.h.a o() {
        return (org.a.d.h.a) this.f37913a;
    }

    public final org.a.d.k.b p() {
        return (org.a.d.k.b) this.f37915c;
    }

    public final o q() {
        return (o) this.f37914b;
    }

    public c(com.waze.shared_infra.i.e eVar) {
        x.f(eVar, "logger");
        this.f37913a = eVar;
        this.f37914b = ck.b(com.waze.map.b.d.f28176b);
        this.f37915c = new ArrayList();
    }

    public c(org.a.d.a aVar) {
        x.f(aVar, "_koin");
        this.f37915c = aVar;
        this.f37913a = dw.f();
        this.f37914b = new HashMap();
    }

    public c(o oVar, org.a.d.k.b bVar, org.a.d.h.a aVar) {
        x.f(oVar, "logger");
        x.f(bVar, "scope");
        this.f37914b = oVar;
        this.f37915c = bVar;
        this.f37913a = aVar;
    }
}
