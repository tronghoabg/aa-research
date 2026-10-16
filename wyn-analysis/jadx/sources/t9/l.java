package t9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class l extends h {

    /* renamed from: d, reason: collision with root package name */
    public final s9.l f45961d;

    /* renamed from: e, reason: collision with root package name */
    public final f f45962e;

    public l(s9.h hVar, s9.l lVar, f fVar, m mVar) {
        this(hVar, lVar, fVar, mVar, new ArrayList());
    }

    @Override // t9.h
    public final f a(s9.k kVar, f fVar, s8.q qVar) {
        j(kVar);
        if (!this.f45952b.b(kVar)) {
            return fVar;
        }
        HashMap mapH = h(qVar, kVar);
        HashMap mapK = k();
        s9.l lVar = kVar.f45384e;
        lVar.h(mapK);
        lVar.h(mapH);
        kVar.a(kVar.f45382c, kVar.f45384e);
        kVar.f45385f = 1;
        kVar.f45382c = s9.o.f45389b;
        if (fVar == null) {
            return null;
        }
        HashSet hashSet = new HashSet(fVar.f45948a);
        hashSet.addAll(this.f45962e.f45948a);
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f45953c.iterator();
        while (it.hasNext()) {
            arrayList.add(((g) it.next()).f45949a);
        }
        hashSet.addAll(arrayList);
        return new f(hashSet);
    }

    @Override // t9.h
    public final void b(s9.k kVar, j jVar) {
        j(kVar);
        if (!this.f45952b.b(kVar)) {
            kVar.f45382c = jVar.f45958a;
            kVar.f45381b = 4;
            kVar.f45384e = new s9.l();
            kVar.f45385f = 2;
            return;
        }
        HashMap mapI = i(kVar, jVar.f45959b);
        s9.l lVar = kVar.f45384e;
        lVar.h(k());
        lVar.h(mapI);
        kVar.a(jVar.f45958a, kVar.f45384e);
        kVar.f45385f = 2;
    }

    @Override // t9.h
    public final f d() {
        return this.f45962e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (e(lVar) && this.f45961d.equals(lVar.f45961d) && this.f45953c.equals(lVar.f45953c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f45961d.hashCode() + (f() * 31);
    }

    public final HashMap k() {
        HashMap map = new HashMap();
        Iterator it = this.f45962e.f45948a.iterator();
        while (it.hasNext()) {
            s9.j jVar = (s9.j) it.next();
            if (!jVar.h()) {
                map.put(jVar, this.f45961d.f(jVar));
            }
        }
        return map;
    }

    public final String toString() {
        return "PatchMutation{" + g() + ", mask=" + this.f45962e + ", value=" + this.f45961d + "}";
    }

    public l(s9.h hVar, s9.l lVar, f fVar, m mVar, List list) {
        super(hVar, mVar, list);
        this.f45961d = lVar;
        this.f45962e = fVar;
    }
}
