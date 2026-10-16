package kotlinx.b.e;

import h.a.r;
import h.g.a.l;
import h.g.b.x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    private final Map f51242a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f51243b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f51244c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map f51245d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map f51246e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private boolean f51247f;

    @Override // kotlinx.b.e.g
    public final void a(h.l.c cVar, l lVar) {
        x.f(cVar, "kClass");
        x.f(lVar, "provider");
        k(cVar, new b(lVar), false);
    }

    @Override // kotlinx.b.e.g
    public final void b(h.l.c cVar, kotlinx.b.b bVar) {
        x.f(cVar, "kClass");
        x.f(bVar, "serializer");
        k(cVar, new a(bVar), false);
    }

    @Override // kotlinx.b.e.g
    public final void c(h.l.c cVar, h.l.c cVar2, kotlinx.b.b bVar) {
        x.f(cVar, "baseClass");
        x.f(cVar2, "actualClass");
        x.f(bVar, "actualSerializer");
        j(cVar, cVar2, bVar, false);
    }

    @Override // kotlinx.b.e.g
    public final void d(h.l.c cVar, l lVar) {
        x.f(cVar, "baseClass");
        x.f(lVar, "defaultDeserializerProvider");
        h(cVar, lVar, false);
    }

    @Override // kotlinx.b.e.g
    public final void e(h.l.c cVar, l lVar) {
        x.f(cVar, "baseClass");
        x.f(lVar, "defaultSerializerProvider");
        i(cVar, lVar, false);
    }

    public final e f() {
        return new e(this.f51242a, this.f51243b, this.f51244c, this.f51245d, this.f51246e, this.f51247f);
    }

    public final void g(e eVar) {
        x.f(eVar, "module");
        eVar.d(this);
    }

    public final void h(h.l.c cVar, l lVar, boolean z) {
        x.f(cVar, "baseClass");
        x.f(lVar, "defaultDeserializerProvider");
        Map map = this.f51246e;
        l lVar2 = (l) map.get(cVar);
        if (lVar2 == null || x.n(lVar2, lVar) || z) {
            map.put(cVar, lVar);
            return;
        }
        throw new IllegalArgumentException("Default deserializers provider for " + cVar + " is already registered: " + lVar2);
    }

    public final void i(h.l.c cVar, l lVar, boolean z) {
        x.f(cVar, "baseClass");
        x.f(lVar, "defaultSerializerProvider");
        Map map = this.f51244c;
        l lVar2 = (l) map.get(cVar);
        if (lVar2 == null || x.n(lVar2, lVar) || z) {
            map.put(cVar, lVar);
            return;
        }
        throw new IllegalArgumentException("Default serializers provider for " + cVar + " is already registered: " + lVar2);
    }

    public final void j(h.l.c cVar, h.l.c cVar2, kotlinx.b.b bVar, boolean z) {
        Object next;
        h.l.c cVar3;
        x.f(cVar, "baseClass");
        x.f(cVar2, "concreteClass");
        x.f(bVar, "concreteSerializer");
        String strD = bVar.getDescriptor().d();
        Map map = this.f51243b;
        Object map2 = map.get(cVar);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(cVar, map2);
        }
        Map map3 = this.f51245d;
        Map map4 = (Map) map2;
        Object map5 = map3.get(cVar);
        if (map5 == null) {
            map5 = new HashMap();
            map3.put(cVar, map5);
        }
        Map map6 = (Map) map5;
        kotlinx.b.b bVar2 = (kotlinx.b.b) map4.get(cVar2);
        if (bVar2 != null && !x.n(bVar2, bVar)) {
            if (!z) {
                x.f(cVar, "baseClass");
                x.f(cVar2, "concreteClass");
                throw new d("Serializer for " + cVar2 + " already registered in the scope of " + cVar);
            }
        }
        kotlinx.b.b bVar3 = (kotlinx.b.b) map6.get(strD);
        if (bVar3 != null && !x.n(bVar3, bVar)) {
            Iterator it = r.w(map4).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((Map.Entry) next).getValue() == bVar3) {
                        break;
                    }
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry == null || (cVar3 = (h.l.c) entry.getKey()) == null) {
                throw new IllegalStateException("Name " + strD + " is registered in the module but no Kotlin class is associated with it.");
            }
            if (!z) {
                throw new IllegalArgumentException("Multiple polymorphic serializers in a scope of '" + cVar + "' have the same serial name '" + strD + "': " + bVar + " for '" + cVar2 + "' and " + bVar3 + " for '" + cVar3 + '\'');
            }
        }
        map4.put(cVar2, bVar);
        map6.put(strD, bVar);
    }

    public final void k(h.l.c cVar, c cVar2, boolean z) {
        c cVar3;
        x.f(cVar, "forClass");
        x.f(cVar2, "provider");
        if (!z && (cVar3 = (c) this.f51242a.get(cVar)) != null && !x.n(cVar3, cVar2)) {
            throw new d("Contextual serializer or serializer provider for " + cVar + " already registered in this module");
        }
        this.f51242a.put(cVar, cVar2);
        if (h.o.c.p(cVar)) {
            this.f51247f = true;
        }
    }
}
