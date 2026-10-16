package org.a.d.j;

import androidx.autofill.HintConstants;
import e.a.dw;
import h.g.b.x;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.a.d.d.h;
import org.a.d.i.b;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f56410a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final b f56411b;

    /* renamed from: c, reason: collision with root package name */
    private final org.a.d.a f56412c;

    /* renamed from: d, reason: collision with root package name */
    private final HashSet f56413d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f56414e;

    /* renamed from: f, reason: collision with root package name */
    private final org.a.d.k.b f56415f;

    static {
        x.f("_root_", HintConstants.AUTOFILL_HINT_NAME);
        f56411b = new b("_root_");
    }

    public a(org.a.d.a aVar) {
        x.f(aVar, "_koin");
        this.f56412c = aVar;
        HashSet hashSet = new HashSet();
        this.f56413d = hashSet;
        Map mapF = dw.f();
        this.f56414e = mapF;
        org.a.d.k.b bVar = new org.a.d.k.b(f56411b, "_root_", true, aVar);
        this.f56415f = bVar;
        hashSet.add(bVar.g());
        mapF.put(bVar.c(), bVar);
    }

    public final org.a.d.k.b b(String str, org.a.d.i.a aVar, Object obj) throws h {
        x.f(str, "scopeId");
        x.f(aVar, "qualifier");
        org.a.d.a aVar2 = this.f56412c;
        aVar2.n().c("|- (+) Scope - id:'" + str + "' q:" + aVar);
        HashSet hashSet = this.f56413d;
        if (!hashSet.contains(aVar)) {
            aVar2.n().f("| Scope '" + aVar + "' not defined. Creating it ...");
            hashSet.add(aVar);
        }
        Map map = this.f56414e;
        if (map.containsKey(str)) {
            throw new h("Scope with id '" + str + "' is already created");
        }
        org.a.d.k.b bVar = new org.a.d.k.b(aVar, str, false, aVar2);
        if (obj != null) {
            aVar2.n().c("|- Scope source set id:'" + str + "' -> " + obj);
            bVar.j(obj);
        }
        bVar.i(this.f56415f);
        map.put(str, bVar);
        return bVar;
    }

    public final org.a.d.k.b c() {
        return this.f56415f;
    }

    public final org.a.d.k.b d(String str) {
        x.f(str, "scopeId");
        return (org.a.d.k.b) this.f56414e.get(str);
    }

    public final void e(org.a.d.k.b bVar) {
        x.f(bVar, "scope");
        this.f56412c.o().m(bVar);
        this.f56414e.remove(bVar.c());
    }

    public final void f(Set set) {
        x.f(set, "modules");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.f56413d.addAll(((org.a.d.g.a) it.next()).c());
        }
    }
}
