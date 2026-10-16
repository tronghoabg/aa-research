package t9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ka.C1;

/* loaded from: classes4.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public final s9.h f45951a;

    /* renamed from: b, reason: collision with root package name */
    public final m f45952b;

    /* renamed from: c, reason: collision with root package name */
    public final List f45953c;

    public h(s9.h hVar, m mVar) {
        this(hVar, mVar, new ArrayList());
    }

    public static h c(s9.k kVar, f fVar) {
        if (!kVar.c()) {
            return null;
        }
        if (fVar != null && fVar.f45948a.isEmpty()) {
            return null;
        }
        s9.h hVar = kVar.f45380a;
        if (fVar == null) {
            return kVar.e() ? new e(hVar, m.f45963c) : new o(hVar, kVar.f45384e, m.f45963c, new ArrayList());
        }
        s9.l lVar = kVar.f45384e;
        s9.l lVar2 = new s9.l();
        HashSet hashSet = new HashSet();
        Iterator it = fVar.f45948a.iterator();
        while (it.hasNext()) {
            s9.j jVar = (s9.j) it.next();
            if (!hashSet.contains(jVar)) {
                if (lVar.f(jVar) == null && jVar.f45369a.size() > 1) {
                    jVar = (s9.j) jVar.k();
                }
                lVar2.g(lVar.f(jVar), jVar);
                hashSet.add(jVar);
            }
        }
        return new l(hVar, lVar2, new f(hashSet), m.f45963c);
    }

    public abstract f a(s9.k kVar, f fVar, s8.q qVar);

    public abstract void b(s9.k kVar, j jVar);

    public abstract f d();

    public final boolean e(h hVar) {
        return this.f45951a.equals(hVar.f45951a) && this.f45952b.equals(hVar.f45952b);
    }

    public final int f() {
        return this.f45952b.hashCode() + (this.f45951a.f45375a.hashCode() * 31);
    }

    public final String g() {
        return "key=" + this.f45951a + ", precondition=" + this.f45952b;
    }

    public final HashMap h(s8.q qVar, s9.k kVar) {
        List<g> list = this.f45953c;
        HashMap map = new HashMap(list.size());
        for (g gVar : list) {
            p pVar = gVar.f45950b;
            s9.l lVar = kVar.f45384e;
            s9.j jVar = gVar.f45949a;
            map.put(jVar, pVar.b(lVar.f(jVar), qVar));
        }
        return map;
    }

    public final HashMap i(s9.k kVar, ArrayList arrayList) {
        List list = this.f45953c;
        HashMap map = new HashMap(list.size());
        A6.c.z(list.size() == arrayList.size(), "server transform count (%d) should match field transform count (%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(list.size()));
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            g gVar = (g) list.get(i5);
            p pVar = gVar.f45950b;
            s9.l lVar = kVar.f45384e;
            s9.j jVar = gVar.f45949a;
            map.put(jVar, pVar.c(lVar.f(jVar), (C1) arrayList.get(i5)));
        }
        return map;
    }

    public final void j(s9.k kVar) {
        A6.c.z(kVar.f45380a.equals(this.f45951a), "Can only apply a mutation to a document with the same key", new Object[0]);
    }

    public h(s9.h hVar, m mVar, List list) {
        this.f45951a = hVar;
        this.f45952b = mVar;
        this.f45953c = list;
    }
}
