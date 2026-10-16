package L8;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import l9.C3445a;
import l9.InterfaceC3447c;
import l9.InterfaceC3448d;

/* loaded from: classes4.dex */
public final class i implements c {

    /* renamed from: h, reason: collision with root package name */
    public static final g f7004h = new g(0);

    /* renamed from: e, reason: collision with root package name */
    public final n f7009e;

    /* renamed from: g, reason: collision with root package name */
    public final f f7011g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7005a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f7006b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f7007c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f7008d = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f7010f = new AtomicReference();

    public i(Executor executor, ArrayList arrayList, ArrayList arrayList2, f fVar) {
        int i5 = 0;
        n nVar = new n(executor);
        this.f7009e = nVar;
        this.f7011g = fVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(b.c(nVar, n.class, InterfaceC3448d.class, InterfaceC3447c.class));
        arrayList3.add(b.c(this, i.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((O9.b) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f7011g.b(componentRegistrar));
                        it3.remove();
                    }
                } catch (o e7) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e7);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((b) it4.next()).f6991b.toArray();
                int length = array.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        Object obj = array[i10];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f7008d.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.f7008d.add(obj.toString());
                        }
                        i10++;
                    }
                }
            }
            if (this.f7005a.isEmpty()) {
                Fe.e.A(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f7005a.keySet());
                arrayList6.addAll(arrayList3);
                Fe.e.A(arrayList6);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                b bVar2 = (b) it5.next();
                this.f7005a.put(bVar2, new p(new h(i5, this, bVar2)));
            }
            arrayList5.addAll(k(arrayList3));
            arrayList5.addAll(l());
            j();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = (Boolean) this.f7010f.get();
        if (bool != null) {
            h(this.f7005a, bool.booleanValue());
        }
    }

    @Override // L8.c
    public final Object a(Class cls) {
        return b(t.a(cls));
    }

    @Override // L8.c
    public final Object b(t tVar) {
        O9.b bVarF = f(tVar);
        if (bVarF == null) {
            return null;
        }
        return bVarF.get();
    }

    @Override // L8.c
    public final O9.b c(Class cls) {
        return f(t.a(cls));
    }

    @Override // L8.c
    public final r d(t tVar) {
        O9.b bVarF = f(tVar);
        return bVarF == null ? new r(r.f7028c, r.f7029d) : bVarF instanceof r ? (r) bVarF : new r(null, bVarF);
    }

    @Override // L8.c
    public final Set e(t tVar) {
        O9.b bVar;
        synchronized (this) {
            bVar = (q) this.f7007c.get(tVar);
            if (bVar == null) {
                bVar = f7004h;
            }
        }
        return (Set) bVar.get();
    }

    @Override // L8.c
    public final synchronized O9.b f(t tVar) {
        Fe.g.u(tVar, "Null interface requested.");
        return (O9.b) this.f7006b.get(tVar);
    }

    @Override // L8.c
    public final r g(Class cls) {
        return d(t.a(cls));
    }

    public final void h(HashMap map, boolean z2) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            b bVar = (b) entry.getKey();
            O9.b bVar2 = (O9.b) entry.getValue();
            int i5 = bVar.f6993d;
            if (i5 == 1 || (i5 == 2 && z2)) {
                bVar2.get();
            }
        }
        n nVar = this.f7009e;
        synchronized (nVar) {
            arrayDeque = nVar.f7021b;
            if (arrayDeque != null) {
                nVar.f7021b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                nVar.a((C3445a) it.next());
            }
        }
    }

    public final void i(boolean z2) {
        HashMap map;
        AtomicReference atomicReference = this.f7010f;
        Boolean boolValueOf = Boolean.valueOf(z2);
        while (!atomicReference.compareAndSet(null, boolValueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            map = new HashMap(this.f7005a);
        }
        h(map, z2);
    }

    public final void j() {
        for (b bVar : this.f7005a.keySet()) {
            for (l lVar : bVar.f6992c) {
                boolean z2 = lVar.f7018b == 2;
                t tVar = lVar.f7017a;
                if (z2) {
                    HashMap map = this.f7007c;
                    if (!map.containsKey(tVar)) {
                        Set set = Collections.EMPTY_SET;
                        q qVar = new q();
                        qVar.f7027b = null;
                        qVar.f7026a = Collections.newSetFromMap(new ConcurrentHashMap());
                        qVar.f7026a.addAll(set);
                        map.put(tVar, qVar);
                    }
                }
                HashMap map2 = this.f7006b;
                if (map2.containsKey(tVar)) {
                    continue;
                } else {
                    int i5 = lVar.f7018b;
                    if (i5 == 1) {
                        throw new m("Unsatisfied dependency for component " + bVar + ": " + tVar, 3);
                    }
                    if (i5 != 2) {
                        map2.put(tVar, new r(r.f7028c, r.f7029d));
                    }
                }
            }
        }
    }

    public final ArrayList k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f6994e == 0) {
                O9.b bVar2 = (O9.b) this.f7005a.get(bVar);
                for (t tVar : bVar.f6991b) {
                    HashMap map = this.f7006b;
                    if (map.containsKey(tVar)) {
                        arrayList2.add(new C8.d(17, (r) ((O9.b) map.get(tVar)), bVar2));
                    } else {
                        map.put(tVar, bVar2);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList l() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f7005a.entrySet()) {
            b bVar = (b) entry.getKey();
            if (bVar.f6994e != 0) {
                O9.b bVar2 = (O9.b) entry.getValue();
                for (t tVar : bVar.f6991b) {
                    if (!map.containsKey(tVar)) {
                        map.put(tVar, new HashSet());
                    }
                    ((Set) map.get(tVar)).add(bVar2);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            HashMap map2 = this.f7007c;
            if (map2.containsKey(key)) {
                q qVar = (q) map2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new C8.d(18, qVar, (O9.b) it.next()));
                }
            } else {
                t tVar2 = (t) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                q qVar2 = new q();
                qVar2.f7027b = null;
                qVar2.f7026a = Collections.newSetFromMap(new ConcurrentHashMap());
                qVar2.f7026a.addAll(set);
                map2.put(tVar2, qVar2);
            }
        }
        return arrayList;
    }
}
