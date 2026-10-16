package org.a.d.e;

import e.a.dw;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class c extends b {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f56389a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(org.a.d.c.a aVar) {
        super(aVar);
        x.f(aVar, "beanDefinition");
        this.f56389a = new HashMap();
    }

    static final ab f(c cVar, com.waze.shared_infra.n.c cVar2) throws org.a.d.d.d, IOException {
        Object objC;
        String strC = cVar2.p().c();
        HashMap map = cVar.f56389a;
        if (map.get(strC) == null) {
            HashMap map2 = map;
            String strC2 = cVar2.p().c();
            x.f(cVar2, "context");
            if (map.get(cVar2.p().c()) == null) {
                objC = super.c(cVar2);
            } else {
                Object obj = map.get(cVar2.p().c());
                if (obj == null) {
                    throw new IllegalStateException("Scoped instance not found for " + cVar2.p().c() + " in " + cVar.b());
                }
                objC = obj;
            }
            map2.put(strC2, objC);
        }
        return ab.f48028a;
    }

    @Override // org.a.d.e.b
    public final Object a(com.waze.shared_infra.n.c cVar) {
        x.f(cVar, "context");
        if (!x.n(cVar.p().g(), b().f())) {
            throw new IllegalStateException("Wrong Scope: trying to open instance for " + cVar.p().c() + " in " + b());
        }
        dw.g(this, new d(this, cVar, 1));
        Object obj = this.f56389a.get(cVar.p().c());
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Scoped instance not found for " + cVar.p().c() + " in " + b());
    }

    public final void d(org.a.d.k.b bVar) {
        l lVarA = b().d().a();
        if (lVarA != null) {
            lVarA.invoke(this.f56389a.get(bVar.c()));
        }
        this.f56389a.remove(bVar.c());
    }

    public final void e(String str, Object obj) {
        x.f(str, "scopeID");
        x.f(obj, "instance");
        this.f56389a.put(str, obj);
    }
}
