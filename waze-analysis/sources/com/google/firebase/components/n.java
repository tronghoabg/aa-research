package com.google.firebase.components;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class n implements d, com.google.firebase.c.a {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.g.c f8956a = new aa(1);

    /* renamed from: e, reason: collision with root package name */
    private final List f8960e;

    /* renamed from: g, reason: collision with root package name */
    private final u f8962g;

    /* renamed from: i, reason: collision with root package name */
    private final h f8964i;

    /* renamed from: b, reason: collision with root package name */
    private final Map f8957b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f8958c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map f8959d = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private Set f8961f = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference f8963h = new AtomicReference();

    /* synthetic */ n(Executor executor, Iterable iterable, Collection collection, h hVar) {
        u uVar = new u(executor);
        this.f8962g = uVar;
        this.f8964i = hVar;
        ArrayList<c> arrayList = new ArrayList();
        arrayList.add(c.g(uVar, u.class, com.google.firebase.e.c.class, com.google.firebase.e.b.class));
        arrayList.add(c.g(this, com.google.firebase.c.a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next());
        }
        this.f8960e = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((com.google.firebase.g.c) it3.next()).a();
                    if (componentRegistrar != null) {
                        arrayList.addAll(this.f8964i.a(componentRegistrar));
                        it3.remove();
                    }
                } catch (v e2) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e2);
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Object[] array = ((c) it4.next()).l().toArray();
                int length = array.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        Object obj = array[i2];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f8961f.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.f8961f.add(obj.toString());
                        }
                        i2++;
                    }
                }
            }
            if (this.f8957b.isEmpty()) {
                q.a(arrayList);
            } else {
                ArrayList arrayList4 = new ArrayList(this.f8957b.keySet());
                arrayList4.addAll(arrayList);
                q.a(arrayList4);
            }
            for (final c cVar2 : arrayList) {
                this.f8957b.put(cVar2, new w(new com.google.firebase.g.c() { // from class: com.google.firebase.components.i
                    @Override // com.google.firebase.g.c
                    public final Object a() {
                        c cVar3 = cVar2;
                        return cVar3.i().a(new ag(cVar3, this.f8944a));
                    }
                }));
            }
            ArrayList arrayList5 = new ArrayList();
            for (c cVar3 : arrayList) {
                if (cVar3.p()) {
                    final com.google.firebase.g.c cVar4 = (com.google.firebase.g.c) this.f8957b.get(cVar3);
                    for (ae aeVar : cVar3.l()) {
                        boolean zContainsKey = this.f8958c.containsKey(aeVar);
                        Map map = this.f8958c;
                        if (zContainsKey) {
                            final ac acVar = (ac) ((com.google.firebase.g.c) map.get(aeVar));
                            arrayList5.add(new Runnable() { // from class: com.google.firebase.components.j
                                @Override // java.lang.Runnable
                                public final void run() {
                                    acVar.d(cVar4);
                                }
                            });
                        } else {
                            map.put(aeVar, cVar4);
                        }
                    }
                }
            }
            arrayList3.addAll(arrayList5);
            ArrayList arrayList6 = new ArrayList();
            HashMap map2 = new HashMap();
            for (Map.Entry entry : this.f8957b.entrySet()) {
                c cVar5 = (c) entry.getKey();
                if (!cVar5.p()) {
                    com.google.firebase.g.c cVar6 = (com.google.firebase.g.c) entry.getValue();
                    for (ae aeVar2 : cVar5.l()) {
                        if (!map2.containsKey(aeVar2)) {
                            map2.put(aeVar2, new HashSet());
                        }
                        ((Set) map2.get(aeVar2)).add(cVar6);
                    }
                }
            }
            for (Map.Entry entry2 : map2.entrySet()) {
                boolean zContainsKey2 = this.f8959d.containsKey(entry2.getKey());
                Map map3 = this.f8959d;
                if (zContainsKey2) {
                    final x xVar = (x) map3.get(entry2.getKey());
                    for (final com.google.firebase.g.c cVar7 : (Set) entry2.getValue()) {
                        arrayList6.add(new Runnable() { // from class: com.google.firebase.components.k
                            @Override // java.lang.Runnable
                            public final void run() {
                                xVar.c(cVar7);
                            }
                        });
                    }
                } else {
                    map3.put((ae) entry2.getKey(), x.b((Collection) entry2.getValue()));
                }
            }
            arrayList3.addAll(arrayList6);
            for (c cVar8 : this.f8957b.keySet()) {
                for (r rVar : cVar8.k()) {
                    if (rVar.n() && !this.f8959d.containsKey(rVar.j())) {
                        this.f8959d.put(rVar.j(), x.b(Collections.EMPTY_SET));
                    } else if (this.f8958c.containsKey(rVar.j())) {
                        continue;
                    } else {
                        if (rVar.m()) {
                            throw new y(String.format("Unsatisfied dependency for component %s: %s", cVar8, rVar.j()));
                        }
                        if (!rVar.n()) {
                            this.f8958c.put(rVar.j(), ac.b());
                        }
                    }
                }
            }
        }
        int size = arrayList3.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((Runnable) arrayList3.get(i3)).run();
        }
        Boolean bool = (Boolean) this.f8963h.get();
        if (bool != null) {
            j(this.f8957b, bool.booleanValue());
        }
    }

    public static m h(Executor executor) {
        return new m(executor);
    }

    private final void j(Map map, boolean z) {
        for (Map.Entry entry : map.entrySet()) {
            c cVar = (c) entry.getKey();
            com.google.firebase.g.c cVar2 = (com.google.firebase.g.c) entry.getValue();
            if (cVar.n() || (cVar.o() && z)) {
                cVar2.a();
            }
        }
        this.f8962g.a();
    }

    @Override // com.google.firebase.components.d
    public final /* synthetic */ com.google.firebase.g.b a(Class cls) {
        throw null;
    }

    @Override // com.google.firebase.components.d
    public final synchronized com.google.firebase.g.c b(ae aeVar) {
        com.google.firebase.concurrent.v.e(aeVar, "Null interface requested.");
        return (com.google.firebase.g.c) this.f8958c.get(aeVar);
    }

    @Override // com.google.firebase.components.d
    public final /* synthetic */ com.google.firebase.g.c c(Class cls) {
        return q.b(this, cls);
    }

    @Override // com.google.firebase.components.d
    public final synchronized com.google.firebase.g.c d(ae aeVar) {
        x xVar = (x) this.f8959d.get(aeVar);
        if (xVar != null) {
            return xVar;
        }
        return f8956a;
    }

    @Override // com.google.firebase.components.d
    public final /* synthetic */ Object e(ae aeVar) {
        return q.c(this, aeVar);
    }

    @Override // com.google.firebase.components.d
    public final /* synthetic */ Object f(Class cls) {
        return q.d(this, cls);
    }

    @Override // com.google.firebase.components.d
    public final /* synthetic */ Set g(ae aeVar) {
        throw null;
    }

    public final void i(boolean z) {
        HashMap map;
        if (a.a.g(this.f8963h, Boolean.valueOf(z))) {
            synchronized (this) {
                map = new HashMap(this.f8957b);
            }
            j(map, z);
        }
    }
}
