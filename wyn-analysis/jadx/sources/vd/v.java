package vd;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import l8.AbstractC3409K;
import l8.C3407I;
import md.AbstractC3556y;
import md.C3533a;
import md.C3534b;
import md.C3552u;
import md.EnumC3545m;
import md.K;
import md.L;
import md.M;
import md.O;
import md.k0;
import od.C3706m1;
import od.C3743z0;
import u0.w0;

/* loaded from: classes5.dex */
public final class v extends O {

    /* renamed from: m, reason: collision with root package name */
    public static final Logger f47227m = Logger.getLogger(v.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC3556y f47229g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f47230h;

    /* renamed from: j, reason: collision with root package name */
    public EnumC3545m f47232j;
    public final AtomicInteger k;

    /* renamed from: l, reason: collision with root package name */
    public M f47233l;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f47228f = new LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final C3706m1 f47231i = new C3706m1();

    public v(AbstractC3556y abstractC3556y) {
        this.f47229g = abstractC3556y;
        f47227m.log(Level.FINE, "Created");
        this.k = new AtomicInteger(new Random().nextInt());
        this.f47233l = new t();
    }

    @Override // md.O
    public final k0 a(L l10) {
        try {
            this.f47230h = true;
            w0 w0VarG = g(l10);
            k0 k0Var = (k0) w0VarG.f46405a;
            if (!k0Var.f()) {
                return k0Var;
            }
            j();
            Iterator it = ((ArrayList) w0VarG.f46406b).iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                iVar.f47180b.f();
                iVar.f47182d = EnumC3545m.f40696e;
                f47227m.log(Level.FINE, "Child balancer {0} deleted", iVar.f47179a);
            }
            return k0Var;
        } finally {
            this.f47230h = false;
        }
    }

    @Override // md.O
    public final void c(k0 k0Var) {
        if (this.f47232j != EnumC3545m.f40693b) {
            this.f47229g.l(EnumC3545m.f40694c, new C3743z0(K.a(k0Var)));
        }
    }

    @Override // md.O
    public final void f() {
        Level level = Level.FINE;
        Logger logger = f47227m;
        logger.log(level, "Shutdown");
        LinkedHashMap linkedHashMap = this.f47228f;
        for (i iVar : linkedHashMap.values()) {
            iVar.f47180b.f();
            iVar.f47182d = EnumC3545m.f40696e;
            logger.log(Level.FINE, "Child balancer {0} deleted", iVar.f47179a);
        }
        linkedHashMap.clear();
    }

    public final w0 g(L l10) {
        LinkedHashMap linkedHashMap;
        j jVar;
        C3552u c3552u;
        Level level = Level.FINE;
        Logger logger = f47227m;
        logger.log(level, "Received resolution result: {0}", l10);
        HashMap map = new HashMap();
        List list = l10.f40588a;
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedHashMap = this.f47228f;
            if (!zHasNext) {
                break;
            }
            j jVar2 = new j((C3552u) it.next());
            i iVar = (i) linkedHashMap.get(jVar2);
            if (iVar != null) {
                map.put(jVar2, iVar);
            } else {
                map.put(jVar2, new i(this, jVar2, this.f47231i, new C3743z0(K.f40583e)));
            }
        }
        Serializable serializable = null;
        if (map.isEmpty()) {
            k0 k0VarH = k0.f40682n.h("NameResolver returned no usable address. " + l10);
            c(k0VarH);
            return new w0(serializable, (Object) k0VarH);
        }
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            C3706m1 c3706m1 = ((i) entry.getValue()).f47181c;
            ((i) entry.getValue()).getClass();
            if (linkedHashMap.containsKey(key)) {
                i iVar2 = (i) linkedHashMap.get(key);
                if (iVar2.f47184f) {
                    iVar2.f47184f = false;
                }
            } else {
                linkedHashMap.put(key, (i) entry.getValue());
            }
            i iVar3 = (i) linkedHashMap.get(key);
            if (key instanceof C3552u) {
                jVar = new j((C3552u) key);
            } else {
                Fe.e.p("key is wrong type", key instanceof j);
                jVar = (j) key;
            }
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    c3552u = null;
                    break;
                }
                c3552u = (C3552u) it2.next();
                if (jVar.equals(new j(c3552u))) {
                    break;
                }
            }
            Fe.e.t(c3552u, key + " no longer present in load balancer children");
            C3534b c3534b = C3534b.f40612b;
            List listSingletonList = Collections.singletonList(c3552u);
            C3534b c3534b2 = C3534b.f40612b;
            C3533a c3533a = O.f40594e;
            Boolean bool = Boolean.TRUE;
            IdentityHashMap identityHashMap = new IdentityHashMap(1);
            identityHashMap.put(c3533a, bool);
            for (Map.Entry entry2 : c3534b2.f40613a.entrySet()) {
                if (!identityHashMap.containsKey(entry2.getKey())) {
                    identityHashMap.put((C3533a) entry2.getKey(), entry2.getValue());
                }
            }
            L l11 = new L(listSingletonList, new C3534b(identityHashMap), null);
            ((i) linkedHashMap.get(key)).getClass();
            if (!iVar3.f47184f) {
                iVar3.f47180b.d(l11);
            }
        }
        ArrayList arrayList = new ArrayList();
        C3407I c3407iListIterator = AbstractC3409K.j(linkedHashMap.keySet()).listIterator(0);
        while (c3407iListIterator.hasNext()) {
            Object next = c3407iListIterator.next();
            if (!map.containsKey(next)) {
                i iVar4 = (i) linkedHashMap.get(next);
                if (!iVar4.f47184f) {
                    LinkedHashMap linkedHashMap2 = iVar4.f47185g.f47228f;
                    j jVar3 = iVar4.f47179a;
                    linkedHashMap2.remove(jVar3);
                    iVar4.f47184f = true;
                    logger.log(Level.FINE, "Child balancer {0} deactivated", jVar3);
                }
                arrayList.add(iVar4);
            }
        }
        return new w0((Serializable) arrayList, (Object) k0.f40674e);
    }

    public final u h(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((i) it.next()).f47183e);
        }
        return new u(arrayList, this.k);
    }

    public final void i(EnumC3545m enumC3545m, M m10) {
        if (enumC3545m == this.f47232j && m10.equals(this.f47233l)) {
            return;
        }
        this.f47229g.l(enumC3545m, m10);
        this.f47232j = enumC3545m;
        this.f47233l = m10;
    }

    public final void j() {
        EnumC3545m enumC3545m;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = this.f47228f;
        Iterator it = linkedHashMap.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            enumC3545m = EnumC3545m.f40693b;
            if (!zHasNext) {
                break;
            }
            i iVar = (i) it.next();
            if (!iVar.f47184f && iVar.f47182d == enumC3545m) {
                arrayList.add(iVar);
            }
        }
        if (!arrayList.isEmpty()) {
            i(enumC3545m, h(arrayList));
            return;
        }
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            EnumC3545m enumC3545m2 = ((i) it2.next()).f47182d;
            EnumC3545m enumC3545m3 = EnumC3545m.f40692a;
            if (enumC3545m2 == enumC3545m3 || enumC3545m2 == EnumC3545m.f40695d) {
                i(enumC3545m3, new t());
                return;
            }
        }
        i(EnumC3545m.f40694c, h(linkedHashMap.values()));
    }
}
